package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class n7 implements p3d {
    public static final n7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n7 n7Var = new n7();
        a = n7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel", n7Var, 6);
        j5mVar.k("type", false);
        j5mVar.k("text", false);
        j5mVar.k("textSize", false);
        j5mVar.k("textWeight", false);
        j5mVar.k("textStyle", false);
        j5mVar.k("textColor", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = q7.g;
        tkr tkrVar = tkr.a;
        cqe cqeVar = cqe.a;
        return new t9f[]{tkrVar, tkrVar, cqeVar, cqeVar, arfVarArr[4].getValue(), tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        p7 p7Var;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q7.g;
        int i4 = 5;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            int k = c.k(mhpVar, 2);
            int k2 = c.k(mhpVar, 3);
            p7Var = (p7) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            str = g;
            str3 = c.g(mhpVar, 5);
            i = k2;
            i2 = k;
            i3 = 63;
            str2 = g2;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            String str4 = null;
            String str5 = null;
            p7 p7Var2 = null;
            String str6 = null;
            int i7 = 0;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str4 = c.g(mhpVar, 0);
                        i6 |= 1;
                        break;
                    case 1:
                        str5 = c.g(mhpVar, 1);
                        i6 |= 2;
                        break;
                    case 2:
                        i7 = c.k(mhpVar, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        i5 = c.k(mhpVar, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        p7Var2 = (p7) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), p7Var2);
                        i6 |= 16;
                        break;
                    case 5:
                        str6 = c.g(mhpVar, i4);
                        i6 |= 32;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i4 = 5;
            }
            i = i5;
            i2 = i7;
            i3 = i6;
            str = str4;
            str2 = str5;
            p7Var = p7Var2;
            str3 = str6;
        }
        c.b(mhpVar);
        return new q7(i3, str, str2, i2, i, p7Var, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q7 q7Var = (q7) obj;
        l6bVar.getClass();
        q7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = q7.g;
        c.p(mhpVar, 0, q7Var.a);
        c.p(mhpVar, 1, q7Var.b);
        c.A(2, q7Var.c, mhpVar);
        c.A(3, q7Var.d, mhpVar);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), q7Var.e);
        c.p(mhpVar, 5, q7Var.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
