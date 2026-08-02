package com.anythink.network.admob;

import I2.c;
import I2.d;
import J2.a;
import J2.b;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.network.admob.AdmobATConst;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.android.gms.internal.ads.C3920sf;
import com.google.android.gms.internal.ads.C4028uf;
import com.google.android.gms.internal.ads.C4190xf;
import com.google.android.gms.internal.ads.InterfaceC3221ff;
import com.google.android.gms.internal.ads.InterfaceC3435jf;
import com.google.android.gms.internal.ads.Ux;
import java.util.HashMap;
import java.util.Map;
import m2.C4741a;
import m2.f;
import m2.g;
import m2.i;
import m2.m;
import m2.n;
import m2.p;
import m2.q;
import m2.s;
import s2.E0;
import s2.InterfaceC4963w0;
import s2.U0;

/* loaded from: classes.dex */
public class AdmobATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: g, reason: collision with root package name */
    private static final String f23638g = "AdmobATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f23639a;

    /* renamed from: c, reason: collision with root package name */
    a f23641c;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f23644f;
    private String i;

    /* renamed from: k, reason: collision with root package name */
    private d f23647k;

    /* renamed from: l, reason: collision with root package name */
    private m f23648l;

    /* renamed from: m, reason: collision with root package name */
    private q f23649m;

    /* renamed from: n, reason: collision with root package name */
    private b f23650n;

    /* renamed from: b, reason: collision with root package name */
    g f23640b = null;

    /* renamed from: h, reason: collision with root package name */
    private String f23645h = "";

    /* renamed from: j, reason: collision with root package name */
    private int f23646j = 1;

    /* renamed from: d, reason: collision with root package name */
    boolean f23642d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f23643e = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23651o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23652p = false;

    /* renamed from: com.anythink.network.admob.AdmobATRewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23657a;

        public AnonymousClass2(Context context) {
            this.f23657a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f23647k = new d() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1
                    @Override // m2.x
                    public final void onAdFailedToLoad(n nVar) {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23639a = null;
                        if (((ATBaseAdInternalAdapter) admobATRewardedVideoAdapter).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
                        }
                    }

                    @Override // m2.x
                    public final void onAdLoaded(c cVar) {
                        AdmobATRewardedVideoAdapter.this.f23639a = cVar;
                        AdmobATRewardedVideoAdapter.this.f23644f.put("response_info", cVar.a());
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23643e = true;
                        if (admobATRewardedVideoAdapter.f23651o) {
                            c cVar2 = AdmobATRewardedVideoAdapter.this.f23639a;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1.1
                                @Override // m2.p
                                public final void onPaidEvent(i iVar) {
                                    if (AdmobATRewardedVideoAdapter.this.f23652p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f23644f, iVar);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C3920sf c3920sf = (C3920sf) cVar2;
                            c3920sf.getClass();
                            try {
                                InterfaceC3435jf interfaceC3435jf = c3920sf.f34748a;
                                if (interfaceC3435jf != null) {
                                    interfaceC3435jf.z1(new U0(pVar));
                                }
                            } catch (RemoteException e9) {
                                x2.i.i("#007 Could not call remote method.", e9);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f23657a;
                String str = AdmobATRewardedVideoAdapter.this.f23645h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                c.b(context, str, admobATRewardedVideoAdapter.f23640b, admobATRewardedVideoAdapter.f23647k);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATRewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23661a;

        public AnonymousClass3(Context context) {
            this.f23661a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f23650n = new b() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1
                    @Override // m2.x
                    public final void onAdFailedToLoad(n nVar) {
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
                        }
                    }

                    @Override // m2.x
                    public final void onAdLoaded(a aVar) {
                        AdmobATRewardedVideoAdapter.this.f23641c = aVar;
                        C4190xf c4190xf = (C4190xf) aVar;
                        c4190xf.getClass();
                        InterfaceC4963w0 interfaceC4963w0 = null;
                        try {
                            InterfaceC3435jf interfaceC3435jf = c4190xf.f35811a;
                            if (interfaceC3435jf != null) {
                                interfaceC4963w0 = interfaceC3435jf.l();
                            }
                        } catch (RemoteException e9) {
                            x2.i.i("#007 Could not call remote method.", e9);
                        }
                        AdmobATRewardedVideoAdapter.this.f23644f.put("response_info", new s(interfaceC4963w0));
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23643e = true;
                        if (admobATRewardedVideoAdapter.f23651o) {
                            a aVar2 = AdmobATRewardedVideoAdapter.this.f23641c;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1.1
                                @Override // m2.p
                                public final void onPaidEvent(i iVar) {
                                    if (AdmobATRewardedVideoAdapter.this.f23652p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f23644f, iVar);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C4190xf c4190xf2 = (C4190xf) aVar2;
                            c4190xf2.getClass();
                            try {
                                InterfaceC3435jf interfaceC3435jf2 = c4190xf2.f35811a;
                                if (interfaceC3435jf2 != null) {
                                    interfaceC3435jf2.z1(new U0(pVar));
                                }
                            } catch (RemoteException e10) {
                                x2.i.i("#007 Could not call remote method.", e10);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f23661a;
                String str = AdmobATRewardedVideoAdapter.this.f23645h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                a.a(context, str, admobATRewardedVideoAdapter.f23640b, admobATRewardedVideoAdapter.f23650n);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean g(AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter) {
        admobATRewardedVideoAdapter.f23652p = true;
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f23639a;
            if (cVar != null) {
                ((C3920sf) cVar).f34750c.f35622n = null;
                this.f23639a = null;
            }
            this.f23647k = null;
            this.f23648l = null;
            this.f23649m = null;
            this.f23650n = null;
            this.f23640b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (map.containsKey("unit_type")) {
            this.f23646j = Integer.parseInt(map.get("unit_type").toString());
        }
        m2.b bVar = m2.b.REWARDED;
        if (this.f23646j == 2) {
            bVar = m2.b.REWARDED_INTERSTITIAL;
        }
        AdMobATInitManager.getInstance().a(context, map, map2, bVar, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, AdmobATInterstitialAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23644f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23645h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        int i;
        return this.f23643e && (((i = this.f23646j) == 1 && this.f23639a != null) || (i == 2 && this.f23641c != null));
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23645h = ATInitMediation.getStringFromMap(map, "unit_id");
        this.i = ATInitMediation.getStringFromMap(map, "payload");
        this.f23651o = ATInitMediation.getIntFromMap(map, j.w.f13415q, 2) == 1;
        if (TextUtils.isEmpty(this.f23645h)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("unit_type")) {
            this.f23646j = Integer.parseInt(map.get("unit_type").toString());
        }
        final Context applicationContext = context.getApplicationContext();
        AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.1
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                AdmobATRewardedVideoAdapter.this.startLoadAd(applicationContext, map, map2);
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23638g, "Admob: show(), activity = null");
                return;
            }
            this.f23643e = false;
            this.f23648l = new m() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4
                @Override // m2.m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // m2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // m2.m
                public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4741a.f39357a), c4741a.f39358b);
                    }
                }

                @Override // m2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATRewardedVideoAdapter.this.f23641c != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f23641c);
                        }
                        if (AdmobATRewardedVideoAdapter.this.f23639a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f23639a);
                        }
                    } catch (Throwable unused) {
                    }
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    admobATRewardedVideoAdapter.f23642d = false;
                    if (admobATRewardedVideoAdapter.f23651o) {
                        AdmobATRewardedVideoAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATRewardedVideoAdapter.this.f23652p) {
                                    return;
                                }
                                AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                    ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                }
                            }
                        }, 500L);
                    } else if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.f23649m = new q() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.5
                @Override // m2.q
                public final void onUserEarnedReward(I2.b bVar) {
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    if (!admobATRewardedVideoAdapter.f23642d) {
                        admobATRewardedVideoAdapter.f23642d = true;
                        if (((CustomRewardVideoAdapter) admobATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    try {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter2 = AdmobATRewardedVideoAdapter.this;
                        if (admobATRewardedVideoAdapter2.f23644f == null) {
                            admobATRewardedVideoAdapter2.f23644f = new HashMap();
                        }
                        if (bVar != null) {
                            HashMap hashMap = new HashMap();
                            InterfaceC3221ff interfaceC3221ff = (InterfaceC3221ff) ((Ux) bVar).f28847u;
                            int i = 0;
                            if (interfaceC3221ff != null) {
                                try {
                                    i = interfaceC3221ff.e();
                                } catch (RemoteException e9) {
                                    x2.i.g("Could not forward getAmount to RewardItem", e9);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str = null;
                            if (interfaceC3221ff != null) {
                                try {
                                    str = interfaceC3221ff.d();
                                } catch (RemoteException e10) {
                                    x2.i.g("Could not forward getType to RewardItem", e10);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str);
                            AdmobATRewardedVideoAdapter.this.f23644f.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            if (this.f23646j == 2) {
                ((C4190xf) this.f23641c).f35813c.f35622n = this.f23648l;
                String str = this.mUserId;
                String str2 = this.mUserData;
                C4190xf c4190xf = (C4190xf) this.f23641c;
                c4190xf.getClass();
                try {
                    InterfaceC3435jf interfaceC3435jf = c4190xf.f35811a;
                    if (interfaceC3435jf != null) {
                        interfaceC3435jf.e3(new C4028uf(str, str2));
                    }
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                }
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f23638g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
                }
                this.f23641c.b(activity, this.f23649m);
                return;
            }
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23645h);
            }
            String str3 = this.mUserId;
            String str4 = this.mUserData;
            C3920sf c3920sf = (C3920sf) this.f23639a;
            c3920sf.getClass();
            try {
                InterfaceC3435jf interfaceC3435jf2 = c3920sf.f34748a;
                if (interfaceC3435jf2 != null) {
                    interfaceC3435jf2.e3(new C4028uf(str3, str4));
                }
            } catch (RemoteException e10) {
                x2.i.i("#007 Could not call remote method.", e10);
            }
            if (ATSDK.isNetworkLogDebug()) {
                Log.i(f23638g, "ServerSideVerificationOptions: userId:" + str3 + "||userCustomData:" + str4);
            }
            c cVar = this.f23639a;
            ((C3920sf) cVar).f34750c.f35622n = this.f23648l;
            cVar.d(activity, this.f23649m);
        }
    }

    public void startLoadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23644f = new HashMap();
        if (this.f23646j != 2) {
            f a9 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.REWARDED, !TextUtils.isEmpty(this.i));
            if (!TextUtils.isEmpty(this.i)) {
                ((E0) a9.f67u).f40321m = this.i;
            }
            a9.getClass();
            this.f23640b = new g(a9);
            startLoadRewardedVideoAd(context);
            return;
        }
        f a10 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.REWARDED_INTERSTITIAL, !TextUtils.isEmpty(this.i));
        if (!TextUtils.isEmpty(this.i)) {
            ((E0) a10.f67u).f40321m = this.i;
        }
        a10.getClass();
        this.f23640b = new g(a10);
        startLoadInterstitlalRewardAd(context);
    }

    public void startLoadInterstitlalRewardAd(Context context) {
        postOnMainThread(new AnonymousClass3(context));
    }

    public void startLoadRewardedVideoAd(Context context) {
        postOnMainThread(new AnonymousClass2(context));
    }

    private void b(Activity activity) {
        if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
            this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23645h);
        }
        String str = this.mUserId;
        String str2 = this.mUserData;
        C3920sf c3920sf = (C3920sf) this.f23639a;
        c3920sf.getClass();
        try {
            InterfaceC3435jf interfaceC3435jf = c3920sf.f34748a;
            if (interfaceC3435jf != null) {
                interfaceC3435jf.e3(new C4028uf(str, str2));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f23638g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        c cVar = this.f23639a;
        ((C3920sf) cVar).f34750c.f35622n = this.f23648l;
        cVar.d(activity, this.f23649m);
    }

    private void a(Activity activity) {
        ((C4190xf) this.f23641c).f35813c.f35622n = this.f23648l;
        String str = this.mUserId;
        String str2 = this.mUserData;
        C4190xf c4190xf = (C4190xf) this.f23641c;
        c4190xf.getClass();
        try {
            InterfaceC3435jf interfaceC3435jf = c4190xf.f35811a;
            if (interfaceC3435jf != null) {
                interfaceC3435jf.e3(new C4028uf(str, str2));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f23638g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        this.f23641c.b(activity, this.f23649m);
    }
}
