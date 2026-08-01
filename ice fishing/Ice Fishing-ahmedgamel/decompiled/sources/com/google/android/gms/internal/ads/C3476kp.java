package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3476kp implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31633a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f31634b;

    /* renamed from: c, reason: collision with root package name */
    public final C3795qk f31635c;

    /* renamed from: d, reason: collision with root package name */
    public final C2987bi f31636d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f31637e;

    public C3476kp(C3243gN c3243gN, C2987bi c2987bi, C3795qk c3795qk, C3243gN c3243gN2) {
        this.f31634b = c3243gN;
        this.f31636d = c2987bi;
        this.f31635c = c3795qk;
        this.f31637e = c3243gN2;
    }

    public Or a() {
        return new Or((C3695os) this.f31634b.f(), this.f31635c.a(), this.f31636d.a(), (C3038cg) this.f31637e.f(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        N3.a b9;
        switch (this.f31633a) {
            case 0:
                final C3441k7 c3441k7 = (C3441k7) this.f31634b.f();
                final Context a9 = this.f31636d.a();
                C3052cu a10 = this.f31635c.a();
                long longValue = ((Long) this.f31637e.f()).longValue();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                int intValue = ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32401w3)).intValue();
                if (intValue == -1 || Integer.toString(intValue).equals(com.bumptech.glide.d.m(com.bumptech.glide.d.n(a10.f29623d)))) {
                    C4835j.f39733C.f39745k.getClass();
                    if (System.currentTimeMillis() - longValue < ((Integer) r7.f40210c.a(AbstractC3569ma.f32420y3)).intValue()) {
                        final int i = 1;
                        b9 = c3360ig.b(new Callable() { // from class: com.google.android.gms.internal.ads.jp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i) {
                                    case 0:
                                        return c3441k7.f31381b.f(a9);
                                    default:
                                        return c3441k7.f31381b.d(a9);
                                }
                            }
                        });
                        AbstractC3341iD.j(b9);
                        return b9;
                    }
                }
                final int i6 = 0;
                b9 = c3360ig.b(new Callable() { // from class: com.google.android.gms.internal.ads.jp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i6) {
                            case 0:
                                return c3441k7.f31381b.f(a9);
                            default:
                                return c3441k7.f31381b.d(a9);
                        }
                    }
                });
                AbstractC3341iD.j(b9);
                return b9;
            default:
                return a();
        }
    }

    public C3476kp(C3243gN c3243gN, C3795qk c3795qk, C2987bi c2987bi, C3243gN c3243gN2) {
        this.f31634b = c3243gN;
        this.f31635c = c3795qk;
        this.f31636d = c2987bi;
        this.f31637e = c3243gN2;
    }
}
