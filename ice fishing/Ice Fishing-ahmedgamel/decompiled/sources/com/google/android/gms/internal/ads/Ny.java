package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ny implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Oy f27352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27353b;

    public /* synthetic */ Ny(Oy oy, int i) {
        this.f27352a = oy;
        this.f27353b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f27353b - 1;
        Oy oy = this.f27352a;
        if (i == 1) {
            return (Ly) oy.f27474a.f();
        }
        if (i == 2) {
            return (Ly) oy.f27475b.f();
        }
        if (i == 3) {
            return (Ly) oy.f27476c.f();
        }
        oy.getClass();
        throw new IllegalArgumentException();
    }
}
