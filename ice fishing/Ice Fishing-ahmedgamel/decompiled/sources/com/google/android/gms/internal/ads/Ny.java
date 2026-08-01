package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ny implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Oy f26570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26571b;

    public /* synthetic */ Ny(Oy oy, int i) {
        this.f26570a = oy;
        this.f26571b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f26571b - 1;
        Oy oy = this.f26570a;
        if (i == 1) {
            return (Ly) oy.f26691a.f();
        }
        if (i == 2) {
            return (Ly) oy.f26692b.f();
        }
        if (i == 3) {
            return (Ly) oy.f26693c.f();
        }
        oy.getClass();
        throw new IllegalArgumentException();
    }
}
