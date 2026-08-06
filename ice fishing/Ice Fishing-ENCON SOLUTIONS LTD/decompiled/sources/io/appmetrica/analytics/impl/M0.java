package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f4724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f4725b;

    public M0(C0756t1 c0756t1, Intent intent) {
        this.f4725b = c0756t1;
        this.f4724a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0892y7 c0892y7 = this.f4725b.d().f6278b;
        Intent intent = this.f4724a;
        c0892y7.getClass();
        if (intent != null) {
            c0892y7.a(intent.getDataString(), false);
        }
    }
}
