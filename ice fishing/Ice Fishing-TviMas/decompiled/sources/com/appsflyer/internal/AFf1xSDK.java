package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class AFf1xSDK extends TimerTask {
    private final Thread getMediationNetwork;

    public AFf1xSDK(Thread thread) {
        this.getMediationNetwork = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getMediationNetwork.interrupt();
    }
}
