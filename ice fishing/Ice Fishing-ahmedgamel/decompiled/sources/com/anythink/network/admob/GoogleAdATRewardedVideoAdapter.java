package com.anythink.network.admob;

import I2.b;
import I2.c;
import I2.d;
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
import com.google.android.gms.internal.ads.C3920sf;
import com.google.android.gms.internal.ads.C4028uf;
import com.google.android.gms.internal.ads.InterfaceC3221ff;
import com.google.android.gms.internal.ads.InterfaceC3435jf;
import com.google.android.gms.internal.ads.Ux;
import java.util.HashMap;
import java.util.Map;
import m2.C4741a;
import m2.m;
import m2.n;
import m2.q;
import n2.C4766a;
import n2.C4767b;
import x2.i;

/* loaded from: classes.dex */
public class GoogleAdATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f23738e = "GoogleAdATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f23739a;

    /* renamed from: g, reason: collision with root package name */
    private d f23744g;

    /* renamed from: h, reason: collision with root package name */
    private m f23745h;
    private q i;

    /* renamed from: b, reason: collision with root package name */
    C4767b f23740b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f23743f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f23741c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f23742d = false;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f23746j = new HashMap();

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f23739a;
            if (cVar != null) {
                ((C3920sf) cVar).f34750c.f35622n = null;
                this.f23739a = null;
            }
            this.f23744g = null;
            this.f23745h = null;
            this.i = null;
            this.f23740b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23746j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23743f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23739a != null && this.f23742d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23743f = stringFromMap;
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
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23738e, "show(), activity = null");
                return;
            }
            this.f23742d = false;
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23743f);
            }
            c cVar = this.f23739a;
            String str = this.mUserId;
            String str2 = this.mUserData;
            C3920sf c3920sf = (C3920sf) cVar;
            c3920sf.getClass();
            try {
                InterfaceC3435jf interfaceC3435jf = c3920sf.f34748a;
                if (interfaceC3435jf != null) {
                    interfaceC3435jf.e3(new C4028uf(str, str2));
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
            m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.2
                @Override // m2.m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // m2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f23739a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // m2.m
                public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4741a.f39357a), c4741a.f39358b);
                    }
                }

                @Override // m2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f23739a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z(), GoogleAdATRewardedVideoAdapter.this.f23739a);
                        }
                    } catch (Throwable unused) {
                    }
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    googleAdATRewardedVideoAdapter.f23741c = false;
                    if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.f23745h = mVar;
            ((C3920sf) this.f23739a).f34750c.f35622n = mVar;
            q qVar = new q() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.3
                @Override // m2.q
                public final void onUserEarnedReward(b bVar) {
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    if (!googleAdATRewardedVideoAdapter.f23741c) {
                        googleAdATRewardedVideoAdapter.f23741c = true;
                        if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    if (bVar != null) {
                        try {
                            if (GoogleAdATRewardedVideoAdapter.this.f23746j == null) {
                                GoogleAdATRewardedVideoAdapter.this.f23746j = new HashMap();
                            }
                            HashMap hashMap = new HashMap();
                            InterfaceC3221ff interfaceC3221ff = (InterfaceC3221ff) ((Ux) bVar).f28847u;
                            int i = 0;
                            if (interfaceC3221ff != null) {
                                try {
                                    i = interfaceC3221ff.e();
                                } catch (RemoteException e10) {
                                    i.g("Could not forward getAmount to RewardItem", e10);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str3 = null;
                            if (interfaceC3221ff != null) {
                                try {
                                    str3 = interfaceC3221ff.d();
                                } catch (RemoteException e11) {
                                    i.g("Could not forward getType to RewardItem", e11);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str3);
                            GoogleAdATRewardedVideoAdapter.this.f23746j.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
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
            this.f23739a.d(activity, qVar);
        }
    }

    public void startLoadAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4766a a9 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.REWARDED);
        a9.getClass();
        this.f23740b = new C4767b(a9);
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    GoogleAdATRewardedVideoAdapter.this.f23744g = new d() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1.1
                        @Override // m2.x
                        public final void onAdFailedToLoad(n nVar) {
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f23739a = null;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
                            }
                        }

                        @Override // m2.x
                        public final void onAdLoaded(c cVar) {
                            GoogleAdATRewardedVideoAdapter.this.f23739a = cVar;
                            GoogleAdATRewardedVideoAdapter.this.f23746j.put("response_info", cVar.a());
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f23742d = true;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = GoogleAdATRewardedVideoAdapter.this.f23743f;
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    c.c(context2, str, googleAdATRewardedVideoAdapter.f23740b, googleAdATRewardedVideoAdapter.f23744g);
                } catch (Throwable th) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }
}
