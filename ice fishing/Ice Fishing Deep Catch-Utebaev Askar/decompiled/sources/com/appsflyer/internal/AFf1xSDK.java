package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
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
