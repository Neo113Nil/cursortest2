package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3243gA implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3297hA f30960b;

    public /* synthetic */ CallableC3243gA(C3297hA c3297hA, int i) {
        this.f30959a = i;
        this.f30960b = c3297hA;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f30959a) {
            case 0:
                Jz jz = this.f30960b.f31206a;
                My b9 = jz.b(1);
                if (b9 == null) {
                    jz.f25861e.b(15315);
                    return null;
                }
                String A8 = b9.A().A();
                File c4 = AbstractC2720Pd.c(A8, "pcam.jar", jz.c());
                c4.getClass();
                if (!c4.exists()) {
                    c4 = AbstractC2720Pd.c(A8, "pcam", jz.c());
                    c4.getClass();
                }
                File c9 = AbstractC2720Pd.c(A8, "pcopt", jz.c());
                c9.getClass();
                File c10 = AbstractC2720Pd.c(A8, "pcbc", jz.c());
                c10.getClass();
                return new Vw(b9.A(), c4, c10, c9);
            default:
                My b10 = this.f30960b.f31206a.b(1);
                return b10 == null ? My.G() : b10;
        }
    }
}
