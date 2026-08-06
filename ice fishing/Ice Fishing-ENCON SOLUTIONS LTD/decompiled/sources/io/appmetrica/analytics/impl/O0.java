package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f4842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f4843b;

    public O0(C0756t1 c0756t1, Intent intent) {
        this.f4843b = c0756t1;
        this.f4842a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0892y7 c0892y7 = this.f4843b.d().f6278b;
        Intent intent = this.f4842a;
        c0892y7.getClass();
        if (intent != null) {
            c0892y7.a(intent.getDataString(), false);
        }
    }
}
