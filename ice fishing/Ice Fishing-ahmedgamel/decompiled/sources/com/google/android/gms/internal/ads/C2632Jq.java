package com.google.android.gms.internal.ads;

import android.content.Context;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2632Jq implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25766a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f25767b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f25768c;

    /* renamed from: d, reason: collision with root package name */
    public final C2987bi f25769d;

    public C2632Jq(C3243gN c3243gN, C2987bi c2987bi, C3351iN c3351iN) {
        this.f25767b = c3243gN;
        this.f25769d = c2987bi;
        this.f25768c = c3351iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f25766a) {
            case 0:
                Context context = (Context) this.f25767b.f();
                C5110a b9 = this.f25769d.b();
                C3793qi c3793qi = (C3793qi) this.f25768c.f31039a;
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2479Aq(context, b9, c3793qi, c3360ig);
            default:
                return new C2479Aq((Context) this.f25767b.f(), (C3201fi) this.f25768c.f31039a, this.f25769d.b());
        }
    }

    public C2632Jq(C3243gN c3243gN, C3351iN c3351iN, C2987bi c2987bi) {
        this.f25767b = c3243gN;
        this.f25768c = c3351iN;
        this.f25769d = c2987bi;
    }
}
