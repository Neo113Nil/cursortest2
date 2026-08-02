package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3092dA implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3145eA f30490b;

    public /* synthetic */ CallableC3092dA(C3145eA c3145eA, int i) {
        this.f30489a = i;
        this.f30490b = c3145eA;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f30489a) {
            case 0:
                Hz hz = this.f30490b.f30684a;
                Ky b9 = hz.b(1);
                if (b9 == null) {
                    hz.f26163e.b(15315);
                    return null;
                }
                String A9 = b9.A().A();
                File c9 = MA.c(A9, "pcam.jar", hz.c());
                c9.getClass();
                if (!c9.exists()) {
                    c9 = MA.c(A9, "pcam", hz.c());
                    c9.getClass();
                }
                File c10 = MA.c(A9, "pcopt", hz.c());
                c10.getClass();
                File c11 = MA.c(A9, "pcbc", hz.c());
                c11.getClass();
                return new Uw(b9.A(), c9, c11, c10);
            default:
                Ky b10 = this.f30490b.f30684a.b(1);
                return b10 == null ? Ky.G() : b10;
        }
    }
}
