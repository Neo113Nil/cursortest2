package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Uy implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vy f28849b;

    public /* synthetic */ Uy(Vy vy, int i) {
        this.f28848a = i;
        this.f28849b = vy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28848a) {
            case 0:
                Vy vy = this.f28849b;
                vy.getClass();
                Uy uy = new Uy(vy, 1);
                C3952tA a9 = vy.f29085g.a(101);
                try {
                    a9.a();
                    Object call = uy.call();
                    a9.c();
                    return (String) call;
                } catch (Throwable th) {
                    try {
                        a9.b(th);
                        throw th;
                    } catch (Throwable th2) {
                        a9.c();
                        throw th2;
                    }
                }
            case 1:
                Vy vy2 = this.f28849b;
                H6 h62 = (H6) vy2.f29083e.j();
                String str = vy2.f29082d;
                Xy xy = vy2.f29080b;
                try {
                    return Base64.encodeToString(((S6) xy.d(str, h62.b()).j()).b(), 11);
                } catch (IllegalArgumentException unused) {
                    xy.getClass();
                    C4002u6 C0 = H6.C0();
                    C0.n(4096);
                    return Base64.encodeToString(xy.b(((H6) C0.j()).b(), str, true), 11);
                }
            default:
                Vy vy3 = this.f28849b;
                Xy xy2 = vy3.f29080b;
                xy2.getClass();
                C4002u6 C02 = H6.C0();
                C02.n(16384);
                return Base64.encodeToString(xy2.b(((H6) C02.j()).b(), vy3.f29082d, true), 11);
        }
    }
}
