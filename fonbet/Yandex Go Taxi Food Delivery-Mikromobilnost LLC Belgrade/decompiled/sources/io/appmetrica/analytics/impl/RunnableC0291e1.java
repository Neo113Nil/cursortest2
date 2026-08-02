package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0291e1 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ J1 b;

    public RunnableC0291e1(J1 j1, Intent intent) {
        this.b = j1;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0818w8 c0818w8 = this.b.c().b;
        Intent intent = this.a;
        c0818w8.getClass();
        if (intent != null) {
            c0818w8.a(intent.getDataString(), false);
        }
    }
}
