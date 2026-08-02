package com.yandex.plus.pay.data.mb.dto;

import defpackage.eg7;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class f2 implements p3d {
    public static final f2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f2 f2Var = new f2();
        a = f2Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.PaymentScreenDto.ScreenContent", f2Var, 4);
        j5mVar.k("screenType", false);
        j5mVar.k("targetUrl", false);
        j5mVar.k("initStartMessageTimeoutMillis", false);
        j5mVar.k("loadMessageTimeoutMillis", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        mvg mvgVar = mvg.a;
        return new t9f[]{tkrVar, tkrVar, mvgVar, mvgVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        long j;
        String str2;
        long j2;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            long q = c.q(mhpVar, 2);
            j = c.q(mhpVar, 3);
            str2 = g;
            j2 = q;
            i = 15;
        } else {
            str = null;
            long j3 = 0;
            String str3 = null;
            boolean z = true;
            int i2 = 0;
            long j4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str3 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    j4 = c.q(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    j3 = c.q(mhpVar, 3);
                    i2 |= 8;
                }
            }
            j = j3;
            str2 = str3;
            j2 = j4;
            i = i2;
        }
        String str4 = str;
        c.b(mhpVar);
        return new h2(i, j2, j, str4, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h2 h2Var = (h2) obj;
        l6bVar.getClass();
        h2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, h2Var.a);
        c.p(mhpVar, 1, h2Var.b);
        c.g(mhpVar, 2, h2Var.c);
        c.g(mhpVar, 3, h2Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
