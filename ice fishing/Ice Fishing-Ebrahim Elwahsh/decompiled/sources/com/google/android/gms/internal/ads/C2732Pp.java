package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2732Pp implements InterfaceC2608Ik, InterfaceC4131wk {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f27055v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static int f27056w;

    /* renamed from: n, reason: collision with root package name */
    public final t2.E f27057n;

    /* renamed from: u, reason: collision with root package name */
    public final C2783Sp f27058u;

    public C2732Pp(C2783Sp c2783Sp, t2.E e6) {
        this.f27058u = c2783Sp;
        this.f27057n = e6;
    }

    public final void a(boolean z8) {
        int i;
        int intValue;
        C3151ea c3151ea = AbstractC3368ia.f31657e7;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !this.f27057n.t()) {
            Object obj = f27055v;
            synchronized (obj) {
                i = f27056w;
                intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31666f7)).intValue();
            }
            if (i < intValue) {
                C2783Sp c2783Sp = this.f27058u;
                Ku c4 = c2783Sp.f27623x.c(new Bundle());
                c4.c(new MD(0, c4, new M.h(c2783Sp, z8)), AbstractC3212fg.f30745h);
                synchronized (obj) {
                    f27056w++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        a(false);
    }
}
