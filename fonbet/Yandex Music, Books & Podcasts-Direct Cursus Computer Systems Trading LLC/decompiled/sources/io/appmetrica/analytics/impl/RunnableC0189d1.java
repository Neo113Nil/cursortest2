package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0189d1 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ J1 b;

    public RunnableC0189d1(J1 j1, Intent intent) {
        this.b = j1;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0599r8 c0599r8 = this.b.d().b;
        Intent intent = this.a;
        c0599r8.getClass();
        if (intent != null) {
            c0599r8.a(intent.getDataString(), false);
        }
    }
}
