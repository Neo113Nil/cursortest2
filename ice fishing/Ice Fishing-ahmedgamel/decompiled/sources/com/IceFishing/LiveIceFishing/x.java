package com.IceFishing.LiveIceFishing;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class x extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6435n;

    public x(MainActivity mainActivity) {
        this.f6435n = mainActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f6435n.runOnUiThread(new G0.c(21, this));
    }
}
