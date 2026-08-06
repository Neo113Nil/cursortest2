package io.appmetrica.analytics.impl;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class Ro implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5017b;

    public /* synthetic */ Ro(int i2, Object obj) {
        this.f5016a = i2;
        this.f5017b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5016a) {
            case 0:
                return U.e((U) this.f5017b);
            default:
                return ((C0885y0) this.f5017b).p();
        }
    }
}
