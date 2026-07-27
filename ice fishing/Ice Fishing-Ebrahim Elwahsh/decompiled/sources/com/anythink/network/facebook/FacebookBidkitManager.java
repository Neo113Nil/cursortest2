package com.anythink.network.facebook;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.h.a;
import com.anythink.core.common.h.bv;
import com.facebook.biddingkit.bridge.BiddingKit;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookBidkitManager extends MediationBidManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile FacebookBidkitManager f23297d;

    /* renamed from: a, reason: collision with root package name */
    boolean f23298a;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, FacebookBidkitAuction> f23299b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, FacebookBidkitAuction> f23300c = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.network.facebook.FacebookBidkitManager$2, reason: invalid class name */
    public class AnonymousClass2 implements MediationBidManager.BidListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediationBidManager.BidListener f23304a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FacebookBidkitAuction f23305b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f23306c;

        public AnonymousClass2(MediationBidManager.BidListener bidListener, FacebookBidkitAuction facebookBidkitAuction, a aVar) {
            this.f23304a = bidListener;
            this.f23305b = facebookBidkitAuction;
            this.f23306c = aVar;
        }

        @Override // com.anythink.core.api.MediationBidManager.BidListener
        public final void onBidFail(String str) {
        }

        @Override // com.anythink.core.api.MediationBidManager.BidListener
        public final void onBidStart(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
            MediationBidManager.BidListener bidListener = this.f23304a;
            if (bidListener != null) {
                bidListener.onBidStart(bvVar, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.api.MediationBidManager.BidListener
        public final void onBidSuccess(List<bv> list) {
            FacebookBidkitManager.this.f23300c.remove(this.f23305b);
            FacebookBidkitManager.this.f23299b.put(this.f23306c.f13487e, this.f23305b);
            MediationBidManager.BidListener bidListener = this.f23304a;
            if (bidListener != null) {
                bidListener.onBidSuccess(list);
            }
        }
    }

    private FacebookBidkitManager() {
    }

    private void a(a aVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!this.f23298a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", aVar.f13489g);
                    jSONObject.put("auction", jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(aVar.f13484b.getApplicationContext(), jSONObject.toString());
                this.f23298a = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(aVar);
            this.f23300c.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(this.mRequestUrl, new AnonymousClass2(bidListener, facebookBidkitAuction, aVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }

    public static FacebookBidkitManager getInstance() {
        if (f23297d == null) {
            synchronized (FacebookBidkitManager.class) {
                try {
                    if (f23297d == null) {
                        f23297d = new FacebookBidkitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23297d;
    }

    @Override // com.anythink.core.api.MediationBidManager
    public void notifyWinnerDisplay(String str, bv bvVar) {
        try {
            FacebookBidkitAuction facebookBidkitAuction = this.f23299b.get(str);
            if (facebookBidkitAuction != null) {
                facebookBidkitAuction.a(bvVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.MediationBidManager
    public void startBid(final a aVar, final MediationBidManager.BidListener bidListener) {
        new Thread(new Runnable() { // from class: com.anythink.network.facebook.FacebookBidkitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidkitManager.a(FacebookBidkitManager.this, aVar, bidListener);
            }
        }).start();
    }

    public static /* synthetic */ void a(FacebookBidkitManager facebookBidkitManager, a aVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!facebookBidkitManager.f23298a) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", aVar.f13489g);
                    jSONObject.put("auction", jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(aVar.f13484b.getApplicationContext(), jSONObject.toString());
                facebookBidkitManager.f23298a = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(aVar);
            facebookBidkitManager.f23300c.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(facebookBidkitManager.mRequestUrl, facebookBidkitManager.new AnonymousClass2(bidListener, facebookBidkitAuction, aVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }
}
