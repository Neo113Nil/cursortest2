package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2594Hm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25353a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f25354b;

    /* renamed from: c, reason: collision with root package name */
    public final C3313hm f25355c;

    public C2594Hm(C3313hm c3313hm, C3243gN c3243gN) {
        this.f25355c = c3313hm;
        this.f25354b = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f25353a) {
            case 0:
                C3959tn c3959tn = (C3959tn) this.f25355c.f30929b.f25043v;
                AbstractC3341iD.j(c3959tn);
                return new ViewOnClickListenerC2577Gm(c3959tn, (T2.a) this.f25354b.f());
            default:
                C2612In c2612In = (C2612In) this.f25354b.f();
                C3959tn c3959tn2 = (C3959tn) this.f25355c.f30929b.f25043v;
                AbstractC3341iD.j(c3959tn2);
                return new C2696Nm(c2612In, c3959tn2);
        }
    }

    public C2594Hm(C3243gN c3243gN, C3313hm c3313hm) {
        this.f25354b = c3243gN;
        this.f25355c = c3313hm;
    }
}
