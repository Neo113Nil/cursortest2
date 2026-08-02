package com.google.android.gms.internal.ads;

import android.os.Bundle;
import s2.C4969z0;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2702Mp implements InterfaceC2663Kk, InterfaceC4195xk {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f27125v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static int f27126w;

    /* renamed from: n, reason: collision with root package name */
    public final C5140B f27127n;

    /* renamed from: u, reason: collision with root package name */
    public final C2753Pp f27128u;

    public C2702Mp(C2753Pp c2753Pp, C5140B c5140b) {
        this.f27128u = c2753Pp;
        this.f27127n = c5140b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        a(false);
    }

    public final void a(boolean z6) {
        int i;
        int intValue;
        C3324ha c3324ha = AbstractC3592ma.f33019e7;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && !this.f27127n.t()) {
            Object obj = f27125v;
            synchronized (obj) {
                i = f27126w;
                intValue = ((Integer) rVar.f40509c.a(AbstractC3592ma.f33028f7)).intValue();
            }
            if (i < intValue) {
                C2753Pp c2753Pp = this.f27128u;
                Iu c9 = c2753Pp.f27656x.c(new Bundle());
                c9.a(new LD(0, c9, new M.h(c2753Pp, z6)), AbstractC3436jg.f32062h);
                synchronized (obj) {
                    f27126w++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        a(true);
    }
}
