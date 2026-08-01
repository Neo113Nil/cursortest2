package com.icefishinggame.icefishinggamemultigames;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class w extends TimerTask {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MainActivity f36944n;

    public w(MainActivity mainActivity) {
        this.f36944n = mainActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f36944n.runOnUiThread(new G0.c(23, this));
    }
}
