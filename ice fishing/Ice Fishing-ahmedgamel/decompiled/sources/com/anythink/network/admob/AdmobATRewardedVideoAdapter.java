package com.anythink.network.admob;

import G2.c;
import G2.d;
import H2.a;
import H2.b;
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
import com.google.android.gms.internal.ads.C3897sf;
import com.google.android.gms.internal.ads.C4005uf;
import com.google.android.gms.internal.ads.C4167xf;
import com.google.android.gms.internal.ads.InterfaceC3198ff;
import com.google.android.gms.internal.ads.InterfaceC3412jf;
import com.google.android.gms.internal.ads.Ux;
import java.util.HashMap;
import java.util.Map;
import k2.C4631a;
import k2.f;
import k2.g;
import k2.i;
import k2.m;
import k2.n;
import k2.p;
import k2.q;
import k2.s;
import q2.E0;
import q2.InterfaceC4914w0;
import q2.U0;

/* loaded from: classes.dex */
public class AdmobATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: g, reason: collision with root package name */
    private static final String f22851g = "AdmobATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f22852a;

    /* renamed from: c, reason: collision with root package name */
    a f22854c;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f22857f;
    private String i;

    /* renamed from: k, reason: collision with root package name */
    private d f22860k;

    /* renamed from: l, reason: collision with root package name */
    private m f22861l;

    /* renamed from: m, reason: collision with root package name */
    private q f22862m;

    /* renamed from: n, reason: collision with root package name */
    private b f22863n;

    /* renamed from: b, reason: collision with root package name */
    g f22853b = null;

    /* renamed from: h, reason: collision with root package name */
    private String f22858h = "";

    /* renamed from: j, reason: collision with root package name */
    private int f22859j = 1;

    /* renamed from: d, reason: collision with root package name */
    boolean f22855d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f22856e = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22864o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22865p = false;

    /* renamed from: com.anythink.network.admob.AdmobATRewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22870a;

        public AnonymousClass2(Context context) {
            this.f22870a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f22860k = new d() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1
                    @Override // k2.x
                    public final void onAdFailedToLoad(n nVar) {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f22852a = null;
                        if (((ATBaseAdInternalAdapter) admobATRewardedVideoAdapter).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
                        }
                    }

                    @Override // k2.x
                    public final void onAdLoaded(c cVar) {
                        AdmobATRewardedVideoAdapter.this.f22852a = cVar;
                        AdmobATRewardedVideoAdapter.this.f22857f.put("response_info", cVar.a());
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f22856e = true;
                        if (admobATRewardedVideoAdapter.f22864o) {
                            c cVar2 = AdmobATRewardedVideoAdapter.this.f22852a;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1.1
                                @Override // k2.p
                                public final void onPaidEvent(i iVar) {
                                    if (AdmobATRewardedVideoAdapter.this.f22865p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f22857f, iVar);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C3897sf c3897sf = (C3897sf) cVar2;
                            c3897sf.getClass();
                            try {
                                InterfaceC3412jf interfaceC3412jf = c3897sf.f33982a;
                                if (interfaceC3412jf != null) {
                                    interfaceC3412jf.K1(new U0(pVar));
                                }
                            } catch (RemoteException e9) {
                                v2.i.i("#007 Could not call remote method.", e9);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f22870a;
                String str = AdmobATRewardedVideoAdapter.this.f22858h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                c.b(context, str, admobATRewardedVideoAdapter.f22853b, admobATRewardedVideoAdapter.f22860k);
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
        final /* synthetic */ Context f22874a;

        public AnonymousClass3(Context context) {
            this.f22874a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f22863n = new b() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1
                    @Override // k2.x
                    public final void onAdFailedToLoad(n nVar) {
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
                        }
                    }

                    @Override // k2.x
                    public final void onAdLoaded(a aVar) {
                        AdmobATRewardedVideoAdapter.this.f22854c = aVar;
                        C4167xf c4167xf = (C4167xf) aVar;
                        c4167xf.getClass();
                        InterfaceC4914w0 interfaceC4914w0 = null;
                        try {
                            InterfaceC3412jf interfaceC3412jf = c4167xf.f35032a;
                            if (interfaceC3412jf != null) {
                                interfaceC4914w0 = interfaceC3412jf.l();
                            }
                        } catch (RemoteException e9) {
                            v2.i.i("#007 Could not call remote method.", e9);
                        }
                        AdmobATRewardedVideoAdapter.this.f22857f.put("response_info", new s(interfaceC4914w0));
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f22856e = true;
                        if (admobATRewardedVideoAdapter.f22864o) {
                            a aVar2 = AdmobATRewardedVideoAdapter.this.f22854c;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1.1
                                @Override // k2.p
                                public final void onPaidEvent(i iVar) {
                                    if (AdmobATRewardedVideoAdapter.this.f22865p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f22857f, iVar);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C4167xf c4167xf2 = (C4167xf) aVar2;
                            c4167xf2.getClass();
                            try {
                                InterfaceC3412jf interfaceC3412jf2 = c4167xf2.f35032a;
                                if (interfaceC3412jf2 != null) {
                                    interfaceC3412jf2.K1(new U0(pVar));
                                }
                            } catch (RemoteException e10) {
                                v2.i.i("#007 Could not call remote method.", e10);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f22874a;
                String str = AdmobATRewardedVideoAdapter.this.f22858h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                a.a(context, str, admobATRewardedVideoAdapter.f22853b, admobATRewardedVideoAdapter.f22863n);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean g(AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter) {
        admobATRewardedVideoAdapter.f22865p = true;
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f22852a;
            if (cVar != null) {
                ((C3897sf) cVar).f33984c.f34845n = null;
                this.f22852a = null;
            }
            this.f22860k = null;
            this.f22861l = null;
            this.f22862m = null;
            this.f22863n = null;
            this.f22853b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (map.containsKey("unit_type")) {
            this.f22859j = Integer.parseInt(map.get("unit_type").toString());
        }
        k2.b bVar = k2.b.REWARDED;
        if (this.f22859j == 2) {
            bVar = k2.b.REWARDED_INTERSTITIAL;
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
        return this.f22857f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22858h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        int i;
        return this.f22856e && (((i = this.f22859j) == 1 && this.f22852a != null) || (i == 2 && this.f22854c != null));
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22858h = ATInitMediation.getStringFromMap(map, "unit_id");
        this.i = ATInitMediation.getStringFromMap(map, "payload");
        this.f22864o = ATInitMediation.getIntFromMap(map, j.w.f12629q, 2) == 1;
        if (TextUtils.isEmpty(this.f22858h)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("unit_type")) {
            this.f22859j = Integer.parseInt(map.get("unit_type").toString());
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
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f22851g, "Admob: show(), activity = null");
                return;
            }
            this.f22856e = false;
            this.f22861l = new m() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4
                @Override // k2.m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // k2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // k2.m
                public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4631a.f38568a), c4631a.f38569b);
                    }
                }

                @Override // k2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATRewardedVideoAdapter.this.f22854c != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f22854c);
                        }
                        if (AdmobATRewardedVideoAdapter.this.f22852a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f22852a);
                        }
                    } catch (Throwable unused) {
                    }
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    admobATRewardedVideoAdapter.f22855d = false;
                    if (admobATRewardedVideoAdapter.f22864o) {
                        AdmobATRewardedVideoAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATRewardedVideoAdapter.this.f22865p) {
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
            this.f22862m = new q() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.5
                @Override // k2.q
                public final void onUserEarnedReward(G2.b bVar) {
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    if (!admobATRewardedVideoAdapter.f22855d) {
                        admobATRewardedVideoAdapter.f22855d = true;
                        if (((CustomRewardVideoAdapter) admobATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    try {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter2 = AdmobATRewardedVideoAdapter.this;
                        if (admobATRewardedVideoAdapter2.f22857f == null) {
                            admobATRewardedVideoAdapter2.f22857f = new HashMap();
                        }
                        if (bVar != null) {
                            HashMap hashMap = new HashMap();
                            InterfaceC3198ff interfaceC3198ff = (InterfaceC3198ff) ((Ux) bVar).f28050u;
                            int i = 0;
                            if (interfaceC3198ff != null) {
                                try {
                                    i = interfaceC3198ff.e();
                                } catch (RemoteException e9) {
                                    v2.i.g("Could not forward getAmount to RewardItem", e9);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str = null;
                            if (interfaceC3198ff != null) {
                                try {
                                    str = interfaceC3198ff.d();
                                } catch (RemoteException e10) {
                                    v2.i.g("Could not forward getType to RewardItem", e10);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str);
                            AdmobATRewardedVideoAdapter.this.f22857f.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            if (this.f22859j == 2) {
                ((C4167xf) this.f22854c).f35034c.f34845n = this.f22861l;
                String str = this.mUserId;
                String str2 = this.mUserData;
                C4167xf c4167xf = (C4167xf) this.f22854c;
                c4167xf.getClass();
                try {
                    InterfaceC3412jf interfaceC3412jf = c4167xf.f35032a;
                    if (interfaceC3412jf != null) {
                        interfaceC3412jf.i3(new C4005uf(str, str2));
                    }
                } catch (RemoteException e9) {
                    v2.i.i("#007 Could not call remote method.", e9);
                }
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f22851g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
                }
                this.f22854c.b(activity, this.f22862m);
                return;
            }
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f22858h);
            }
            String str3 = this.mUserId;
            String str4 = this.mUserData;
            C3897sf c3897sf = (C3897sf) this.f22852a;
            c3897sf.getClass();
            try {
                InterfaceC3412jf interfaceC3412jf2 = c3897sf.f33982a;
                if (interfaceC3412jf2 != null) {
                    interfaceC3412jf2.i3(new C4005uf(str3, str4));
                }
            } catch (RemoteException e10) {
                v2.i.i("#007 Could not call remote method.", e10);
            }
            if (ATSDK.isNetworkLogDebug()) {
                Log.i(f22851g, "ServerSideVerificationOptions: userId:" + str3 + "||userCustomData:" + str4);
            }
            c cVar = this.f22852a;
            ((C3897sf) cVar).f33984c.f34845n = this.f22861l;
            cVar.d(activity, this.f22862m);
        }
    }

    public void startLoadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f22857f = new HashMap();
        if (this.f22859j != 2) {
            f a9 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.REWARDED, !TextUtils.isEmpty(this.i));
            if (!TextUtils.isEmpty(this.i)) {
                ((E0) a9.f1720u).f40022m = this.i;
            }
            a9.getClass();
            this.f22853b = new g(a9);
            startLoadRewardedVideoAd(context);
            return;
        }
        f a10 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.REWARDED_INTERSTITIAL, !TextUtils.isEmpty(this.i));
        if (!TextUtils.isEmpty(this.i)) {
            ((E0) a10.f1720u).f40022m = this.i;
        }
        a10.getClass();
        this.f22853b = new g(a10);
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
            this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f22858h);
        }
        String str = this.mUserId;
        String str2 = this.mUserData;
        C3897sf c3897sf = (C3897sf) this.f22852a;
        c3897sf.getClass();
        try {
            InterfaceC3412jf interfaceC3412jf = c3897sf.f33982a;
            if (interfaceC3412jf != null) {
                interfaceC3412jf.i3(new C4005uf(str, str2));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f22851g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        c cVar = this.f22852a;
        ((C3897sf) cVar).f33984c.f34845n = this.f22861l;
        cVar.d(activity, this.f22862m);
    }

    private void a(Activity activity) {
        ((C4167xf) this.f22854c).f35034c.f34845n = this.f22861l;
        String str = this.mUserId;
        String str2 = this.mUserData;
        C4167xf c4167xf = (C4167xf) this.f22854c;
        c4167xf.getClass();
        try {
            InterfaceC3412jf interfaceC3412jf = c4167xf.f35032a;
            if (interfaceC3412jf != null) {
                interfaceC3412jf.i3(new C4005uf(str, str2));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f22851g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        this.f22854c.b(activity, this.f22862m);
    }
}
