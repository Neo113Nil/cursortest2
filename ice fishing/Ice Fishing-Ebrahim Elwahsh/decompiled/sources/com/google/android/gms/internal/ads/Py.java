package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Py implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Qy f27085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27086b;

    public /* synthetic */ Py(Qy qy, int i) {
        this.f27085a = qy;
        this.f27086b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f27086b - 1;
        Qy qy = this.f27085a;
        if (i == 1) {
            return (Ny) qy.f27286a.d();
        }
        if (i == 2) {
            return (Ny) qy.f27287b.d();
        }
        if (i == 3) {
            return (Ny) qy.f27288c.d();
        }
        qy.getClass();
        throw new IllegalArgumentException();
    }
}
