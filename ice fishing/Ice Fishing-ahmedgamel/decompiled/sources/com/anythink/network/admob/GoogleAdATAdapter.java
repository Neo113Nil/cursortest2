package com.anythink.network.admob;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.admob.GoogleAdATNativeAd;
import java.util.Map;

/* loaded from: classes.dex */
public class GoogleAdATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private String f23691a;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23691a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        String stringFromMap2 = ATInitMediation.getStringFromMap(map, "media_ratio");
        if (TextUtils.isEmpty(stringFromMap)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        this.f23691a = stringFromMap;
        boolean z6 = false;
        if (map != null) {
            try {
                if (map.containsKey(CustomNativeAd.IS_AUTO_PLAY_KEY)) {
                    z6 = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
                }
            } catch (Exception unused) {
            }
        }
        GoogleAdATNativeAd.LoadCallbackListener loadCallbackListener = new GoogleAdATNativeAd.LoadCallbackListener() { // from class: com.anythink.network.admob.GoogleAdATAdapter.1
            @Override // com.anythink.network.admob.GoogleAdATNativeAd.LoadCallbackListener
            public final void onFail(String str, String str2) {
                if (((ATBaseAdInternalAdapter) GoogleAdATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) GoogleAdATAdapter.this).mLoadListener.onAdLoadError(str, str2);
                }
            }

            @Override // com.anythink.network.admob.GoogleAdATNativeAd.LoadCallbackListener
            public final void onSuccess(CustomNativeAd customNativeAd) {
                if (((ATBaseAdInternalAdapter) GoogleAdATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) GoogleAdATAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        GoogleAdATNativeAd googleAdATNativeAd = new GoogleAdATNativeAd(applicationContext, stringFromMap2, stringFromMap, loadCallbackListener, map2);
        googleAdATNativeAd.setIsAutoPlay(z6);
        googleAdATNativeAd.loadAd(applicationContext, map, map2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }
}
