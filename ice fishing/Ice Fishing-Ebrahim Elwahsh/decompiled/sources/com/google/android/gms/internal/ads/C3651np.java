package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3651np implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33027a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f33028b;

    /* renamed from: c, reason: collision with root package name */
    public final C3700ok f33029c;

    /* renamed from: d, reason: collision with root package name */
    public final C2860Xh f33030d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f33031e;

    public C3651np(C4009uN c4009uN, C2860Xh c2860Xh, C3700ok c3700ok, C4009uN c4009uN2) {
        this.f33028b = c4009uN;
        this.f33030d = c2860Xh;
        this.f33029c = c3700ok;
        this.f33031e = c4009uN2;
    }

    public Qr a() {
        return new Qr((C3869rs) this.f33028b.d(), this.f33029c.a(), this.f33030d.a(), (C2892Zf) this.f33031e.d(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        J3.a b9;
        switch (this.f33027a) {
            case 0:
                final C3348i7 c3348i7 = (C3348i7) this.f33028b.d();
                final Context a9 = this.f33030d.a();
                C3226fu a10 = this.f33029c.a();
                long longValue = ((Long) this.f33031e.d()).longValue();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                int intValue = ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31819w3)).intValue();
                if (intValue == -1 || Integer.toString(intValue).equals(K3.b.I(K3.b.J(a10.f30901d)))) {
                    p2.j.f39798C.f39810k.getClass();
                    if (System.currentTimeMillis() - longValue < ((Integer) r7.f40119c.a(AbstractC3368ia.f31838y3)).intValue()) {
                        final int i = 1;
                        b9 = c3157eg.b(new Callable() { // from class: com.google.android.gms.internal.ads.lp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i) {
                                    case 0:
                                        return c3348i7.f31319b.f(a9);
                                    default:
                                        return c3348i7.f31319b.d(a9);
                                }
                            }
                        });
                        AbstractC3137eE.h(b9);
                        return b9;
                    }
                }
                final int i4 = 0;
                b9 = c3157eg.b(new Callable() { // from class: com.google.android.gms.internal.ads.lp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i4) {
                            case 0:
                                return c3348i7.f31319b.f(a9);
                            default:
                                return c3348i7.f31319b.d(a9);
                        }
                    }
                });
                AbstractC3137eE.h(b9);
                return b9;
            default:
                return a();
        }
    }

    public C3651np(C4009uN c4009uN, C3700ok c3700ok, C2860Xh c2860Xh, C4009uN c4009uN2) {
        this.f33028b = c4009uN;
        this.f33029c = c3700ok;
        this.f33030d = c2860Xh;
        this.f33031e = c4009uN2;
    }
}
