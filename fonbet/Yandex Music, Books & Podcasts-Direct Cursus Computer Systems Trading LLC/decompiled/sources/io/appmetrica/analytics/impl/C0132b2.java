package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0132b2 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C0247f2 b;

    public C0132b2(C0247f2 c0247f2, Intent intent) {
        this.b = c0247f2;
        this.a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.b(this.a);
    }
}
