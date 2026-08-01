package com.anythink.network.admob;

import G2.b;
import G2.c;
import G2.d;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.network.admob.GoogleAdATConst;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.android.gms.internal.ads.C3897sf;
import com.google.android.gms.internal.ads.C4005uf;
import com.google.android.gms.internal.ads.InterfaceC3198ff;
import com.google.android.gms.internal.ads.InterfaceC3412jf;
import com.google.android.gms.internal.ads.Ux;
import java.util.HashMap;
import java.util.Map;
import k2.C4631a;
import k2.m;
import k2.n;
import k2.q;
import l2.C4657a;
import l2.C4658b;
import v2.i;

/* loaded from: classes.dex */
public class GoogleAdATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f22951e = "GoogleAdATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f22952a;

    /* renamed from: g, reason: collision with root package name */
    private d f22957g;

    /* renamed from: h, reason: collision with root package name */
    private m f22958h;
    private q i;

    /* renamed from: b, reason: collision with root package name */
    C4658b f22953b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f22956f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f22954c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f22955d = false;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f22959j = new HashMap();

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f22952a;
            if (cVar != null) {
                ((C3897sf) cVar).f33984c.f34845n = null;
                this.f22952a = null;
            }
            this.f22957g = null;
            this.f22958h = null;
            this.i = null;
            this.f22953b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22959j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22956f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22952a != null && this.f22955d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22956f = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            startLoadAd(context.getApplicationContext(), map, map2);
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f22951e, "show(), activity = null");
                return;
            }
            this.f22955d = false;
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f22956f);
            }
            c cVar = this.f22952a;
            String str = this.mUserId;
            String str2 = this.mUserData;
            C3897sf c3897sf = (C3897sf) cVar;
            c3897sf.getClass();
            try {
                InterfaceC3412jf interfaceC3412jf = c3897sf.f33982a;
                if (interfaceC3412jf != null) {
                    interfaceC3412jf.i3(new C4005uf(str, str2));
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
            m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.2
                @Override // k2.m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // k2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f22952a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // k2.m
                public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4631a.f38568a), c4631a.f38569b);
                    }
                }

                @Override // k2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f22952a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z(), GoogleAdATRewardedVideoAdapter.this.f22952a);
                        }
                    } catch (Throwable unused) {
                    }
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    googleAdATRewardedVideoAdapter.f22954c = false;
                    if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.f22958h = mVar;
            ((C3897sf) this.f22952a).f33984c.f34845n = mVar;
            q qVar = new q() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.3
                @Override // k2.q
                public final void onUserEarnedReward(b bVar) {
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    if (!googleAdATRewardedVideoAdapter.f22954c) {
                        googleAdATRewardedVideoAdapter.f22954c = true;
                        if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    if (bVar != null) {
                        try {
                            if (GoogleAdATRewardedVideoAdapter.this.f22959j == null) {
                                GoogleAdATRewardedVideoAdapter.this.f22959j = new HashMap();
                            }
                            HashMap hashMap = new HashMap();
                            InterfaceC3198ff interfaceC3198ff = (InterfaceC3198ff) ((Ux) bVar).f28050u;
                            int i = 0;
                            if (interfaceC3198ff != null) {
                                try {
                                    i = interfaceC3198ff.e();
                                } catch (RemoteException e10) {
                                    i.g("Could not forward getAmount to RewardItem", e10);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str3 = null;
                            if (interfaceC3198ff != null) {
                                try {
                                    str3 = interfaceC3198ff.d();
                                } catch (RemoteException e11) {
                                    i.g("Could not forward getType to RewardItem", e11);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str3);
                            GoogleAdATRewardedVideoAdapter.this.f22959j.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            this.i = qVar;
            this.f22952a.d(activity, qVar);
        }
    }

    public void startLoadAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4657a a9 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.REWARDED);
        a9.getClass();
        this.f22953b = new C4658b(a9);
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    GoogleAdATRewardedVideoAdapter.this.f22957g = new d() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1.1
                        @Override // k2.x
                        public final void onAdFailedToLoad(n nVar) {
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f22952a = null;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
                            }
                        }

                        @Override // k2.x
                        public final void onAdLoaded(c cVar) {
                            GoogleAdATRewardedVideoAdapter.this.f22952a = cVar;
                            GoogleAdATRewardedVideoAdapter.this.f22959j.put("response_info", cVar.a());
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f22955d = true;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = GoogleAdATRewardedVideoAdapter.this.f22956f;
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    c.c(context2, str, googleAdATRewardedVideoAdapter.f22953b, googleAdATRewardedVideoAdapter.f22957g);
                } catch (Throwable th) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }
}
