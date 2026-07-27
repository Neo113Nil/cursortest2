package com.icefishing.icefishingliveapp;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class v extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MainActivity f37105n;

    public v(MainActivity mainActivity) {
        this.f37105n = mainActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f37105n.runOnUiThread(new F3.C(20, this));
    }
}
