package com.anythink.rewardvideo.api;

import com.anythink.core.api.AdError;

/* loaded from: classes.dex */
public interface ATRewardVideoAutoLoadListener {
    void onRewardVideoAutoLoadFail(String str, AdError adError);

    void onRewardVideoAutoLoaded(String str);
}
