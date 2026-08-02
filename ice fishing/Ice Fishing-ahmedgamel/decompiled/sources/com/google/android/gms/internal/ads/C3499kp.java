package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3499kp implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32415a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f32416b;

    /* renamed from: c, reason: collision with root package name */
    public final C3818qk f32417c;

    /* renamed from: d, reason: collision with root package name */
    public final C3010bi f32418d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f32419e;

    public C3499kp(C3266gN c3266gN, C3010bi c3010bi, C3818qk c3818qk, C3266gN c3266gN2) {
        this.f32416b = c3266gN;
        this.f32418d = c3010bi;
        this.f32417c = c3818qk;
        this.f32419e = c3266gN2;
    }

    public Or a() {
        return new Or((C3718os) this.f32416b.f(), this.f32417c.a(), this.f32418d.a(), (C3061cg) this.f32419e.f(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        P3.a b9;
        switch (this.f32415a) {
            case 0:
                final C3464k7 c3464k7 = (C3464k7) this.f32416b.f();
                final Context a9 = this.f32418d.a();
                C3075cu a10 = this.f32417c.a();
                long longValue = ((Long) this.f32419e.f()).longValue();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.w3)).intValue();
                if (intValue == -1 || Integer.toString(intValue).equals(t8.g.s(t8.g.u(a10.f30393d)))) {
                    C4906k.f40186C.f40198k.getClass();
                    if (System.currentTimeMillis() - longValue < ((Integer) r7.f40509c.a(AbstractC3592ma.f33199y3)).intValue()) {
                        final int i = 1;
                        b9 = c3383ig.b(new Callable() { // from class: com.google.android.gms.internal.ads.jp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i) {
                                    case 0:
                                        return c3464k7.f32160b.f(a9);
                                    default:
                                        return c3464k7.f32160b.d(a9);
                                }
                            }
                        });
                        AbstractC3364iD.j(b9);
                        return b9;
                    }
                }
                final int i4 = 0;
                b9 = c3383ig.b(new Callable() { // from class: com.google.android.gms.internal.ads.jp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i4) {
                            case 0:
                                return c3464k7.f32160b.f(a9);
                            default:
                                return c3464k7.f32160b.d(a9);
                        }
                    }
                });
                AbstractC3364iD.j(b9);
                return b9;
            default:
                return a();
        }
    }

    public C3499kp(C3266gN c3266gN, C3818qk c3818qk, C3010bi c3010bi, C3266gN c3266gN2) {
        this.f32416b = c3266gN;
        this.f32417c = c3818qk;
        this.f32418d = c3010bi;
        this.f32419e = c3266gN2;
    }
}
