package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.network.IActivityPackageSender;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary implements Runnable {
    public final /* synthetic */ ActivityPackage CatchingFishDaggerWebsocket;
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber CatchingFishReduxKtor;
    public final /* synthetic */ ActivityPackageSender CatchingFishViewModelScope;
    public final /* synthetic */ Map CatchingFishWorkManager;

    public CatchingFishPagingLibrary(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.CatchingFishViewModelScope = activityPackageSender;
        this.CatchingFishReduxKtor = responseDataCallbackSubscriber;
        this.CatchingFishDaggerWebsocket = activityPackage;
        this.CatchingFishWorkManager = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.CatchingFishReduxKtor.onResponseDataCallback(this.CatchingFishViewModelScope.sendActivityPackageSync(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager));
    }
}
