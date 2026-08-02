package com.google.android.gms.internal.ads;

import android.content.Context;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2913Zj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29718a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f29719b;

    /* renamed from: c, reason: collision with root package name */
    public final C3010bi f29720c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f29721d;

    public C2913Zj(C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN) {
        this.f29719b = c3010bi;
        this.f29720c = c3010bi2;
        this.f29721d = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f29718a) {
            case 0:
                Context a9 = this.f29719b.a();
                Wu wu = (Wu) this.f29721d.f();
                C5189a b9 = this.f29720c.b();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2897Yj(a9, wu, b9, c3383ig);
            default:
                C3112dd l9 = new C2590Gf(7).l(this.f29719b.a(), this.f29720c.b(), (Wu) this.f29721d.f());
                AbstractC3364iD.j(l9);
                return l9;
        }
    }

    public C2913Zj(C3010bi c3010bi, C3266gN c3266gN, C3010bi c3010bi2) {
        this.f29719b = c3010bi;
        this.f29721d = c3266gN;
        this.f29720c = c3010bi2;
    }
}
