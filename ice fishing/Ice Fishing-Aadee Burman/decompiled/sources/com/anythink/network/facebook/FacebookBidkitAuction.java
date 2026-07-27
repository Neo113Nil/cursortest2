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
    Context f23112a;

    /* renamed from: b, reason: collision with root package name */
    int f23113b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f23114c;

    /* renamed from: d, reason: collision with root package name */
    List<bv> f23115d;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, WaterfallEntry> f23116e;

    /* renamed from: f, reason: collision with root package name */
    Auction f23117f;

    /* renamed from: g, reason: collision with root package name */
    com.anythink.core.common.h.a f23118g;

    /* renamed from: h, reason: collision with root package name */
    Auction.Builder f23119h;
    Map<String, bv> i;

    /* renamed from: j, reason: collision with root package name */
    String f23120j;

    /* renamed from: k, reason: collision with root package name */
    MediationBidManager.BidListener f23121k;

    /* renamed from: l, reason: collision with root package name */
    Handler f23122l;

    /* renamed from: n, reason: collision with root package name */
    private final String f23124n = getClass().getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    Runnable f23123m = new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.1
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
        private Bid f23134b;

        /* renamed from: c, reason: collision with root package name */
        private double f23135c;

        /* renamed from: d, reason: collision with root package name */
        private String f23136d;

        public a(Bid bid, double d2, String str) {
            this.f23134b = bid;
            this.f23135c = d2;
            this.f23136d = str;
        }

        public Bid getBid() {
            return this.f23134b;
        }

        public double getCPMCents() {
            return this.f23135c;
        }

        public String getEntryName() {
            return this.f23136d;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return aVar.getCPMCents() > getCPMCents() ? 1 : -1;
        }
    }

    public class b implements Waterfall {

        /* renamed from: a, reason: collision with root package name */
        SortedSet<WaterfallEntry> f23137a = new TreeSet();

        public b() {
        }

        public final Waterfall createWaterfallCopy() {
            b bVar = FacebookBidkitAuction.this.new b();
            Iterator<WaterfallEntry> it = this.f23137a.iterator();
            while (it.hasNext()) {
                bVar.insert(it.next());
            }
            return bVar;
        }

        public final Iterable<WaterfallEntry> entries() {
            return this.f23137a;
        }

        public final WaterfallEntry getFirst() {
            return this.f23137a.first();
        }

        public final void insert(WaterfallEntry waterfallEntry) {
            this.f23137a.add(waterfallEntry);
        }

        public final int size() {
            return this.f23137a.size();
        }

        public final void insert(Bid bid) {
            this.f23137a.add(FacebookBidkitAuction.this.new a(bid, bid.getPrice(), bid.getBidderName()));
        }
    }

    public FacebookBidkitAuction(com.anythink.core.common.h.a aVar) {
        this.f23112a = aVar.f13327b;
        this.f23113b = aVar.f13331f;
        this.f23114c = aVar.f13334j;
        i iVar = aVar.f13349y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        this.f23115d = a9;
        if (a9 == null) {
            this.f23115d = new ArrayList();
        }
        this.f23118g = aVar;
        this.f23119h = new Auction.Builder();
        this.i = new HashMap();
        this.f23122l = new Handler(Looper.getMainLooper());
    }

    public void startBidding(final String str, final MediationBidManager.BidListener bidListener) {
        this.f23120j = str;
        this.f23121k = bidListener;
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        for (bv bvVar : this.f23114c) {
            concurrentHashMap.put(bvVar.z(), bvVar);
            new com.anythink.core.b.i(this.f23118g).a(bvVar, new i.a() { // from class: com.anythink.network.facebook.FacebookBidkitAuction.2
                private void a(bv bvVar2, Map<String, bv> map) {
                    FacebookBidkitAuction facebookBidkitAuction;
                    Handler handler;
                    map.remove(bvVar2.z());
                    if (map.size() != 0 || (handler = (facebookBidkitAuction = FacebookBidkitAuction.this).f23122l) == null) {
                        return;
                    }
                    handler.removeCallbacks(facebookBidkitAuction.f23123m);
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
        long n9 = this.f23118g.f13338n.n();
        Handler handler = this.f23122l;
        if (handler != null) {
            Runnable runnable = this.f23123m;
            if (n9 <= 0) {
                n9 = 500;
            }
            handler.postDelayed(runnable, n9);
        }
    }

    private void a() {
        a(this.f23120j, this.f23121k);
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
        for (bv bvVar : this.f23115d) {
            bVar.insert(new a(null, 100.0d * bvVar.at(), bvVar.z()));
        }
        Auction build = this.f23119h.build();
        this.f23117f = build;
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
        boolean z3;
        char c9;
        char c10;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            z3 = t.b().y();
        } catch (Throwable unused) {
            z3 = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (bvVar.g() == 1) {
                String optString = jSONObject.optString("app_id");
                String optString2 = jSONObject.optString("unit_id");
                String optString3 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
                String valueOf = String.valueOf(this.f23113b);
                switch (valueOf.hashCode()) {
                    case j.f5816W /* 48 */:
                        if (valueOf.equals("0")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case j.f5817X /* 49 */:
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
                this.f23119h.addBidder(new FacebookBidder.Builder(optString, optString2, facebookAdBidFormat, optString3).setTestMode(z3).build());
                this.i.put(optString2, bvVar);
            }
        } catch (Throwable unused2) {
        }
        if (bvVar.g() == 11) {
            String optString5 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY);
            String optString6 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID);
            String optString7 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
            String valueOf2 = String.valueOf(this.f23113b);
            int hashCode = valueOf2.hashCode();
            if (hashCode != 49) {
                if (hashCode == 51 && valueOf2.equals("3")) {
                    c9 = 0;
                    if (c9 != 0) {
                        ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                    } else if (c9 == 1) {
                        ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                    }
                    this.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                    this.i.put(optString6, bvVar);
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                this.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                this.i.put(optString6, bvVar);
            }
            if (valueOf2.equals("1")) {
                c9 = 1;
                if (c9 != 0) {
                }
                this.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                this.i.put(optString6, bvVar);
            }
            c9 = 65535;
            if (c9 != 0) {
            }
            this.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
            this.i.put(optString6, bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Map<String, bv> map, Waterfall waterfall, MediationBidManager.BidListener bidListener) {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f23116e == null) {
                this.f23116e = new ConcurrentHashMap<>();
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
                        this.f23116e.put(bvVar.z(), waterfallEntry);
                    }
                    if ("IRONSOURCE_BIDDER".equals(entryName)) {
                        bv bvVar2 = map.get(bid.getPlacementId());
                        bvVar2.g(bid.getPayload());
                        bvVar2.b(bid.getPrice() / 100.0d);
                        bvVar2.e(bid.getPrice() / 100.0d);
                        arrayList.add(bvVar2);
                        this.f23116e.put(bvVar2.z(), waterfallEntry);
                    }
                } else {
                    this.f23116e.put(waterfallEntry.getEntryName(), waterfallEntry);
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
            ConcurrentHashMap<String, WaterfallEntry> concurrentHashMap = this.f23116e;
            if (concurrentHashMap != null && (waterfallEntry = concurrentHashMap.get(bvVar.z())) != null && this.f23117f != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(this.f23124n, "notifyWinnerDisplay:" + waterfallEntry.getEntryName());
                }
                this.f23117f.notifyDisplayWinner(waterfallEntry);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void a(FacebookBidkitAuction facebookBidkitAuction) {
        facebookBidkitAuction.a(facebookBidkitAuction.f23120j, facebookBidkitAuction.f23121k);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110 A[Catch: all -> 0x0129, TryCatch #1 {all -> 0x0129, blocks: (B:51:0x00cc, B:53:0x00d4, B:62:0x0112, B:66:0x010d, B:67:0x0110, B:68:0x00f7, B:71:0x00ff), top: B:50:0x00cc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(FacebookBidkitAuction facebookBidkitAuction, bv bvVar, JSONObject jSONObject) {
        boolean z3;
        char c9;
        char c10;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            z3 = t.b().y();
        } catch (Throwable unused) {
            z3 = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (bvVar.g() == 1) {
                String optString = jSONObject.optString("app_id");
                String optString2 = jSONObject.optString("unit_id");
                String optString3 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
                String valueOf = String.valueOf(facebookBidkitAuction.f23113b);
                switch (valueOf.hashCode()) {
                    case j.f5816W /* 48 */:
                        if (valueOf.equals("0")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case j.f5817X /* 49 */:
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
                facebookBidkitAuction.f23119h.addBidder(new FacebookBidder.Builder(optString, optString2, facebookAdBidFormat, optString3).setTestMode(z3).build());
                facebookBidkitAuction.i.put(optString2, bvVar);
            }
        } catch (Throwable unused2) {
        }
        if (bvVar.g() == 11) {
            String optString5 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY);
            String optString6 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID);
            String optString7 = jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID);
            String valueOf2 = String.valueOf(facebookBidkitAuction.f23113b);
            int hashCode = valueOf2.hashCode();
            if (hashCode != 49) {
                if (hashCode == 51 && valueOf2.equals("3")) {
                    c9 = 0;
                    if (c9 != 0) {
                        ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                    } else if (c9 == 1) {
                        ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                    }
                    facebookBidkitAuction.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                    facebookBidkitAuction.i.put(optString6, bvVar);
                }
                c9 = 65535;
                if (c9 != 0) {
                }
                facebookBidkitAuction.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                facebookBidkitAuction.i.put(optString6, bvVar);
            }
            if (valueOf2.equals("1")) {
                c9 = 1;
                if (c9 != 0) {
                }
                facebookBidkitAuction.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
                facebookBidkitAuction.i.put(optString6, bvVar);
            }
            c9 = 65535;
            if (c9 != 0) {
            }
            facebookBidkitAuction.f23119h.addBidder(new IronSourceBidder.Builder(optString5, optString6, ironSourceAdFormat, optString7).setTestMode(z3).build());
            facebookBidkitAuction.i.put(optString6, bvVar);
        }
    }
}
