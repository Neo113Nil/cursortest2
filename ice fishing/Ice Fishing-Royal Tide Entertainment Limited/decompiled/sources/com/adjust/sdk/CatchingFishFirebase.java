package com.adjust.sdk;

/* loaded from: classes.dex */
public final class CatchingFishFirebase {
    public final int CatchingFishCoroutine;
    public final long CatchingFishDaggerWebsocket;
    public final int CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public final String CatchingFishViewModelScope;
    public final String CatchingFishWorkManager;

    public CatchingFishFirebase(ActivityState activityState) {
        this.CatchingFishParcelableFAB = -1;
        this.CatchingFishSnackbar = -1;
        this.CatchingFishCoroutine = -1;
        this.CatchingFishReduxKtor = -1L;
        this.CatchingFishDaggerWebsocket = -1L;
        this.CatchingFishWorkManager = null;
        this.CatchingFishViewModelScope = null;
        if (activityState == null) {
            return;
        }
        this.CatchingFishParcelableFAB = activityState.eventCount;
        this.CatchingFishSnackbar = activityState.sessionCount;
        this.CatchingFishCoroutine = activityState.subsessionCount;
        this.CatchingFishReduxKtor = activityState.timeSpent;
        this.CatchingFishDaggerWebsocket = activityState.sessionLength;
        this.CatchingFishWorkManager = activityState.uuid;
        this.CatchingFishViewModelScope = activityState.pushToken;
    }
}
