package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0177a2 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C0321f2 b;

    public C0177a2(C0321f2 c0321f2, Intent intent) {
        this.b = c0321f2;
        this.a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.c(this.a);
    }
}
