package com.bugsnag.android;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class AnrDetailsCollector {
    public final HandlerThread handlerThread;

    public AnrDetailsCollector() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.handlerThread = handlerThread;
        handlerThread.start();
    }
}
