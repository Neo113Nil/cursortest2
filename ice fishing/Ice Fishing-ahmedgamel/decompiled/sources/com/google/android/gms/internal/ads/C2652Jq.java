package com.google.android.gms.internal.ads;

import android.content.Context;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2652Jq implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26518a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f26519b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f26520c;

    /* renamed from: d, reason: collision with root package name */
    public final C3010bi f26521d;

    public C2652Jq(C3266gN c3266gN, C3010bi c3010bi, C3374iN c3374iN) {
        this.f26519b = c3266gN;
        this.f26521d = c3010bi;
        this.f26520c = c3374iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f26518a) {
            case 0:
                Context context = (Context) this.f26519b.f();
                C5189a b9 = this.f26521d.b();
                C3816qi c3816qi = (C3816qi) this.f26520c.f31812a;
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2499Aq(context, b9, c3816qi, c3383ig);
            default:
                return new C2499Aq((Context) this.f26519b.f(), (C3224fi) this.f26520c.f31812a, this.f26521d.b());
        }
    }

    public C2652Jq(C3266gN c3266gN, C3374iN c3374iN, C3010bi c3010bi) {
        this.f26519b = c3266gN;
        this.f26520c = c3374iN;
        this.f26521d = c3010bi;
    }
}
