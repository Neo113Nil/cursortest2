package com.anythink.network.facebook;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.anythink.basead.b.b.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.b.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.q;
import com.anythink.core.common.w.i;
import com.facebook.biddingkit.auction.Auction;
import com.facebook.biddingkit.auction.AuctionListener;
import com.facebook.biddingkit.facebook.bidder.FacebookBidder;
import com.facebook.biddingkit.gen.Bid;
import com.facebook.biddingkit.gen.FacebookAdBidFormat;
import com.facebook.biddingkit.gen.IronSourceAdFormat;
import com.facebook.biddingkit.ironsource.IronSourceBidder;
import com.facebook.biddingkit.waterfall.Waterfall;
import com.facebook.biddingkit.waterfall.WaterfallEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookBidkitAuction {

    /* renamed from: a, reason: collision with root package name */
    Context f23899a;

    /* renamed from: b, reason: collision with root package name */
    int f23900b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f23901c;

    /* renamed from: d, reason: collision with root package name */
    List<bv> f23902d;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, WaterfallEntry> f23903e;

    /* renamed from: f, reason: collision with root package name */
    Auction f23904f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.core.common.h.a f23905g;

    /* renamed from: h, reason: collision with root package name */
    Auction.Builder f23906h;
    Map<String, bv> i;

    /* renamed from: j, reason: collision with root package name */
    String f23907j;

    /* renamed from: k, reason: collision with root package name */
    MediationBidManager.BidListener f23908k;

    /* renamed from: l, reason: collision with root package name */
    Handler f23909l;

    /* renamed from: n, reason: collision with root package name */
    private final String f23911n = getClass().getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    Runnable f23910m = new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    FacebookBidkitAuction.a(FacebookBidkitAuction.this);
                }
            });
        }
    };

    public class a implements WaterfallEntry, Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        private Bid f23921b;

        /* renamed from: c, reason: collision with root package name */
        private double f23922c;

        /* renamed from: d, reason: collision with root package name */
        private String f23923d;

        public a(Bid bid, double d9, String str) {
            this.f23921b = bid;
            this.f23922c = d9;
            this.f23923d = str;
        }

        public Bid getBid() {
            return this.f23921b;
        }

        public double getCPMCents() {
            return this.f23922c;
        }

        public String getEntryName() {
            return this.f23923d;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return aVar.getCPMCents() > getCPMCents() ? 1 : -1;
        }
    }

    public class b implements Waterfall {

        /* renamed from: a, reason: collision with root package name */
        SortedSet<WaterfallEntry> f23924a = new TreeSet();

        public b() {
        }

        public final Waterfall createWaterfallCopy() {
            b bVar = FacebookBidkitAuction.this.new b();
            Iterator<WaterfallEntry> it = this.f23924a.iterator();
            while (it.hasNext()) {
                bVar.insert(it.next());
            }
            return bVar;
        }

        public final Iterable<WaterfallEntry> entries() {
            return this.f23924a;
        }

        public final WaterfallEntry getFirst() {
            return this.f23924a.first();
        }

        public final void insert(WaterfallEntry waterfallEntry) {
            this.f23924a.add(waterfallEntry);
        }

        public final int size() {
            return this.f23924a.size();
        }

        public final void insert(Bid bid) {
            this.f23924a.add(FacebookBidkitAuction.this.new a(bid, bid.getPrice(), bid.getBidderName()));
        }
    }

    public FacebookBidkitAuction(com.anythink.core.common.h.a aVar) {
        this.f23899a = aVar.f14113b;
        this.f23900b = aVar.f14117f;
        this.f23901c = aVar.f14120j;
        i iVar = aVar.f14135y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        this.f23902d = a9;
        if (a9 == null) {
            this.f23902d = new ArrayList();
        }
        this.f23905g = aVar;
        this.f23906h = new Auction.Builder();
        this.i = new HashMap();
        this.f23909l = new Handler(Looper.getMainLooper());
    }

    public void startBidding(final String str, final MediationBidManager.BidListener bidListener) {
        this.f23907j = str;
        this.f23908k = bidListener;
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        for (bv bvVar : this.f23901c) {
            concurrentHashMap.put(bvVar.z(), bvVar);
            new com.anythink.core.b.i(this.f23905g).a(bvVar, new i.a() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.2
                private void a(bv bvVar2, Map<String, bv> map) {
                    FacebookBidkitAuction facebookBidkitAuction;
                    Handler handler;
                    map.remove(bvVar2.z());
                    if (map.size() != 0 || (handler = (facebookBidkitAuction = FacebookBidkitAuction.this).f23909l) == null) {
                        return;
                    }
                    handler.removeCallbacks(facebookBidkitAuction.f23910m);
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainFail(String str2, bv bvVar2) {
                    a(bvVar2, concurrentHashMap);
                    bvVar2.h(str2);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.a(str, bidListener);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainStart(bv bvVar2, ATBaseAdAdapter aTBaseAdAdapter) {
                    MediationBidManager.BidListener bidListener2 = bidListener;
                    if (bidListener2 != null) {
                        bidListener2.onBidStart(bvVar2, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void onBidTokenObtainSuccess(bv bvVar2, JSONObject jSONObject) {
                    a(bvVar2, concurrentHashMap);
                    FacebookBidkitAuction.a(FacebookBidkitAuction.this, bvVar2, jSONObject);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.a(str, bidListener);
                    }
                }
            });
        }
        long n9 = this.f23905g.f14124n.n();
        Handler handler = this.f23909l;
        if (handler != null) {
            Runnable runnable = this.f23910m;
            if (n9 <= 0) {
                n9 = 500;
            }
            handler.postDelayed(runnable, n9);
        }
    }

    private void a() {
        a(this.f23907j, this.f23908k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final MediationBidManager.BidListener bidListener) {
        if (this.i.size() == 0) {
            if (bidListener != null) {
                bidListener.onBidSuccess(new ArrayList(1));
                return;
            }
            return;
        }
        b bVar = new b();
        for (bv bvVar : this.f23902d) {
            bVar.insert(new a(null, 100.0d * bvVar.at(), bvVar.z()));
        }
        Auction build = this.f23906h.build();
        this.f23904f = build;
        build.startRemoteAuction(str, bVar, new AuctionListener() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.3
            public final void onAuctionCompleted(Waterfall waterfall) {
                FacebookBidkitAuction facebookBidkitAuction = FacebookBidkitAuction.this;
                facebookBidkitAuction.a(facebookBidkitAuction.i, waterfall, bidListener);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110 A[Catch: all -> 0x0129, TryCatch #1 {all -> 0x0129, blocks: (B:51:0x00cc, B:53:0x00d4, B:62:0x0112, B:66:0x010d, B:67:0x0110, B:68:0x00f7, B:71:0x00ff), top: B:50:0x00cc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(bv bvVar, JSONObject jSONObject) {
        boolean z6;
        char c9;
        char c10;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            z6 = t.b().y();
        } catch (Throwable unused) {
            z6 = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (bvVar.g() == 1) {
                String optString = jSONObject.optString("app_id");
                String optString2 = jSONObject.optString("unit_id");
                String optString3 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
                String valueOf = String.valueOf(this.f23900b);
                switch (valueOf.hashCode()) {
                    case j.f6602W /* 48 */:
                        if (valueOf.equals("0")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case j.f6603X /* 49 */:
                        if (valueOf.equals("1")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 50:
                        if (valueOf.equals("2")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 51:
                        if (valueOf.equals("3")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 0) {
                    String optString4 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT);
                    FacebookAdBidFormat facebookAdBidFormat2 = "50".equals(optString4) ? FacebookAdBidFormat.BANNER_HEIGHT_50 : null;
                    if ("90".equals(optString4)) {
                        facebookAdBidFormat2 = FacebookAdBidFormat.BANNER_HEIGHT_90;
                    }
                    facebookAdBidFormat = "250".equals(optString4) ? FacebookAdBidFormat.BANNER_HEIGHT_250 : facebookAdBidFormat2;
                    if (facebookAdBidFormat == null) {
                        facebookAdBidFormat = FacebookAdBidFormat.BANNER_HEIGHT_50;
                    }
                } else if (c10 != 1) {
                    if (c10 != 2) {
                        facebookAdBidFormat = c10 != 3 ? null : FacebookAdBidFormat.REWARDED_VIDEO;
                    } else {
                        facebookAdBidFormat = FacebookAdBidFormat.INTERSTITIAL;
                    }
                } else if ("1".equals(q.a(bvVar.l(), "unit_type"))) {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE_BANNER;
                } else {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE;
                }
                this.f23906h.addBidder(new FacebookBidder.Builder(optString, optString2, facebookAdBidFormat, optString3).setTestMode(z6).build());
                this.i.put(optString2, bvVar);
            }
        } catch (Throwable unused2) {
        }
        if (bvVar.g() == 11) {
            String optString5 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY);
            String optString6 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID);
            String optString7 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
            String valueOf2 = String.valueOf(this.f23900b);
            int hashCode = valueOf2.hashCode();
            if (hashCode != 49) {
                if (hashCode == 51 && valueOf2.equals("3")) {
                    c9 = 0;
                    if (c9 != 0) {
                        ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                    } else if (c9 == 1) {
                        ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                    }
                    this.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                    this.i.put(optString6, bvVar);
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                this.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                this.i.put(optString6, bvVar);
            }
            if (valueOf2.equals("1")) {
                c9 = 1;
                if (c9 != 0) {
                }
                this.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                this.i.put(optString6, bvVar);
            }
            c9 = 65535;
            if (c9 != 0) {
            }
            this.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
            this.i.put(optString6, bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Map<String, bv> map, Waterfall waterfall, MediationBidManager.BidListener bidListener) {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f23903e == null) {
                this.f23903e = new ConcurrentHashMap<>();
            }
            for (WaterfallEntry waterfallEntry : waterfall.entries()) {
                String entryName = waterfallEntry.getEntryName();
                Bid bid = waterfallEntry.getBid();
                if (bid != null) {
                    if ("FACEBOOK_BIDDER".equals(entryName)) {
                        bv bvVar = map.get(bid.getPlacementId());
                        bvVar.g(bid.getPayload());
                        bvVar.b(bid.getPrice() / 100.0d);
                        bvVar.e(bid.getPrice() / 100.0d);
                        arrayList.add(bvVar);
                        this.f23903e.put(bvVar.z(), waterfallEntry);
                    }
                    if ("IRONSOURCE_BIDDER".equals(entryName)) {
                        bv bvVar2 = map.get(bid.getPlacementId());
                        bvVar2.g(bid.getPayload());
                        bvVar2.b(bid.getPrice() / 100.0d);
                        bvVar2.e(bid.getPrice() / 100.0d);
                        arrayList.add(bvVar2);
                        this.f23903e.put(bvVar2.z(), waterfallEntry);
                    }
                } else {
                    this.f23903e.put(waterfallEntry.getEntryName(), waterfallEntry);
                }
            }
            if (bidListener != null) {
                bidListener.onBidSuccess(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(bv bvVar) {
        WaterfallEntry waterfallEntry;
        try {
            ConcurrentHashMap<String, WaterfallEntry> concurrentHashMap = this.f23903e;
            if (concurrentHashMap != null && (waterfallEntry = concurrentHashMap.get(bvVar.z())) != null && this.f23904f != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(this.f23911n, "notifyWinnerDisplay:" + waterfallEntry.getEntryName());
                }
                this.f23904f.notifyDisplayWinner(waterfallEntry);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void a(FacebookBidkitAuction facebookBidkitAuction) {
        facebookBidkitAuction.a(facebookBidkitAuction.f23907j, facebookBidkitAuction.f23908k);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110 A[Catch: all -> 0x0129, TryCatch #1 {all -> 0x0129, blocks: (B:51:0x00cc, B:53:0x00d4, B:62:0x0112, B:66:0x010d, B:67:0x0110, B:68:0x00f7, B:71:0x00ff), top: B:50:0x00cc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(FacebookBidkitAuction facebookBidkitAuction, bv bvVar, JSONObject jSONObject) {
        boolean z6;
        char c9;
        char c10;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            z6 = t.b().y();
        } catch (Throwable unused) {
            z6 = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (bvVar.g() == 1) {
                String optString = jSONObject.optString("app_id");
                String optString2 = jSONObject.optString("unit_id");
                String optString3 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
                String valueOf = String.valueOf(facebookBidkitAuction.f23900b);
                switch (valueOf.hashCode()) {
                    case j.f6602W /* 48 */:
                        if (valueOf.equals("0")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case j.f6603X /* 49 */:
                        if (valueOf.equals("1")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 50:
                        if (valueOf.equals("2")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 51:
                        if (valueOf.equals("3")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 0) {
                    String optString4 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT);
                    FacebookAdBidFormat facebookAdBidFormat2 = "50".equals(optString4) ? FacebookAdBidFormat.BANNER_HEIGHT_50 : null;
                    if ("90".equals(optString4)) {
                        facebookAdBidFormat2 = FacebookAdBidFormat.BANNER_HEIGHT_90;
                    }
                    facebookAdBidFormat = "250".equals(optString4) ? FacebookAdBidFormat.BANNER_HEIGHT_250 : facebookAdBidFormat2;
                    if (facebookAdBidFormat == null) {
                        facebookAdBidFormat = FacebookAdBidFormat.BANNER_HEIGHT_50;
                    }
                } else if (c10 != 1) {
                    if (c10 != 2) {
                        facebookAdBidFormat = c10 != 3 ? null : FacebookAdBidFormat.REWARDED_VIDEO;
                    } else {
                        facebookAdBidFormat = FacebookAdBidFormat.INTERSTITIAL;
                    }
                } else if ("1".equals(q.a(bvVar.l(), "unit_type"))) {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE_BANNER;
                } else {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE;
                }
                facebookBidkitAuction.f23906h.addBidder(new FacebookBidder.Builder(optString, optString2, facebookAdBidFormat, optString3).setTestMode(z6).build());
                facebookBidkitAuction.i.put(optString2, bvVar);
            }
        } catch (Throwable unused2) {
        }
        if (bvVar.g() == 11) {
            String optString5 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY);
            String optString6 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID);
            String optString7 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
            String valueOf2 = String.valueOf(facebookBidkitAuction.f23900b);
            int hashCode = valueOf2.hashCode();
            if (hashCode != 49) {
                if (hashCode == 51 && valueOf2.equals("3")) {
                    c9 = 0;
                    if (c9 != 0) {
                        ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                    } else if (c9 == 1) {
                        ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                    }
                    facebookBidkitAuction.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                    facebookBidkitAuction.i.put(optString6, bvVar);
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                facebookBidkitAuction.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                facebookBidkitAuction.i.put(optString6, bvVar);
            }
            if (valueOf2.equals("1")) {
                c9 = 1;
                if (c9 != 0) {
                }
                facebookBidkitAuction.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
                facebookBidkitAuction.i.put(optString6, bvVar);
            }
            c9 = 65535;
            if (c9 != 0) {
            }
            facebookBidkitAuction.f23906h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z6).build());
            facebookBidkitAuction.i.put(optString6, bvVar);
        }
    }
}
