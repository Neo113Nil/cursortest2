package com.google.android.gms.internal.ads;

import android.content.Context;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2890Zj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28941a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f28942b;

    /* renamed from: c, reason: collision with root package name */
    public final C2987bi f28943c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f28944d;

    public C2890Zj(C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN) {
        this.f28942b = c2987bi;
        this.f28943c = c2987bi2;
        this.f28944d = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f28941a) {
            case 0:
                Context a9 = this.f28942b.a();
                Wu wu = (Wu) this.f28944d.f();
                C5110a b9 = this.f28943c.b();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2874Yj(a9, wu, b9, c3360ig);
            default:
                C3089dd m4 = new C2570Gf(7).m(this.f28942b.a(), this.f28943c.b(), (Wu) this.f28944d.f());
                AbstractC3341iD.j(m4);
                return m4;
        }
    }

    public C2890Zj(C2987bi c2987bi, C3243gN c3243gN, C2987bi c2987bi2) {
        this.f28942b = c2987bi;
        this.f28944d = c3243gN;
        this.f28943c = c2987bi2;
    }
}
