package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C4920z0;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2682Mp implements InterfaceC2643Kk, InterfaceC4172xk {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f26340v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static int f26341w;

    /* renamed from: n, reason: collision with root package name */
    public final C5069B f26342n;

    /* renamed from: u, reason: collision with root package name */
    public final C2733Pp f26343u;

    public C2682Mp(C2733Pp c2733Pp, C5069B c5069b) {
        this.f26343u = c2733Pp;
        this.f26342n = c5069b;
    }

    public final void a(boolean z3) {
        int i;
        int intValue;
        C3301ha c3301ha = AbstractC3569ma.f32239e7;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && !this.f26342n.t()) {
            Object obj = f26340v;
            synchronized (obj) {
                i = f26341w;
                intValue = ((Integer) rVar.f40210c.a(AbstractC3569ma.f32248f7)).intValue();
            }
            if (i < intValue) {
                C2733Pp c2733Pp = this.f26343u;
                Iu c9 = c2733Pp.f26869x.c(new Bundle());
                c9.a(new LD(0, c9, new L3.h(c2733Pp, z3)), AbstractC3413jg.f31275h);
                synchronized (obj) {
                    f26341w++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        a(false);
    }
}
