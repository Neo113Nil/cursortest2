package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Xy implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yy f28744b;

    public /* synthetic */ Xy(Yy yy, int i) {
        this.f28743a = i;
        this.f28744b = yy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28743a) {
            case 0:
                Yy yy = this.f28744b;
                yy.getClass();
                Xy xy = new Xy(yy, 1);
                C4104wA a9 = yy.f28931g.a(101);
                try {
                    a9.a();
                    Object call = xy.call();
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
                Yy yy2 = this.f28744b;
                D6 d62 = (D6) yy2.f28929e.j();
                String str = yy2.f28928d;
                Zy zy = yy2.f28926b;
                try {
                    return Base64.encodeToString(((P6) zy.d(str, d62.b()).j()).b(), 11);
                } catch (IllegalArgumentException unused) {
                    zy.getClass();
                    C3830r6 C0 = D6.C0();
                    C0.n(4096);
                    return Base64.encodeToString(zy.b(((D6) C0.j()).b(), str, true), 11);
                }
            default:
                Yy yy3 = this.f28744b;
                Zy zy2 = yy3.f28926b;
                zy2.getClass();
                C3830r6 C02 = D6.C0();
                C02.n(16384);
                return Base64.encodeToString(zy2.b(((D6) C02.j()).b(), yy3.f28928d, true), 11);
        }
    }
}
