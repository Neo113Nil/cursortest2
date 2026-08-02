package com.yandex.passport.data.network;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements p3d {
    public static final ta a;

    @NotNull
    private static final mhp descriptor;

    static {
        ta taVar = new ta();
        a = taVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.SmsCodeSendingRequest.Result", taVar, 4);
        j5mVar.k("status", false);
        j5mVar.k("deny_resend_until", true);
        j5mVar.k("calling_number_template", true);
        j5mVar.k("code_length", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, mvg.a, ff7.C(tkrVar), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        long j;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            long q = c.q(mhpVar, 1);
            String str3 = (String) c.n(mhpVar, 2, tkr.a, null);
            i = 15;
            str = g;
            i2 = c.k(mhpVar, 3);
            str2 = str3;
            j = q;
        } else {
            long j2 = 0;
            boolean z = true;
            int i3 = 0;
            String str4 = null;
            String str5 = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i |= 1;
                } else if (w == 1) {
                    j2 = c.q(mhpVar, 1);
                    i |= 2;
                } else if (w == 2) {
                    str5 = (String) c.n(mhpVar, 2, tkr.a, str5);
                    i |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 3);
                    i |= 8;
                }
            }
            i2 = i3;
            j = j2;
            str = str4;
            str2 = str5;
        }
        int i4 = i;
        c.b(mhpVar);
        return new va(i4, str, j, str2, i2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        va vaVar = (va) obj;
        l6bVar.getClass();
        vaVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = vaVar.a;
        int i = vaVar.d;
        String str2 = vaVar.c;
        long j = vaVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || j != 0) {
            c.g(mhpVar, 1, j);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        if (c.e(mhpVar) || i != -1) {
            c.A(3, i, mhpVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
