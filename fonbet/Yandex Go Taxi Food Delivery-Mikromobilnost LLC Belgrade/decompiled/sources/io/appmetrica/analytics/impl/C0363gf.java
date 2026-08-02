package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0363gf extends SafeRunnable {
    public final /* synthetic */ Cif a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public C0363gf(Cif cif, String str, byte[] bArr) {
        this.a = cif;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Cif.a(this.a).setSessionExtra(this.b, this.c);
    }
}
