package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class h1 implements p3d {
    public static final h1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h1 h1Var = new h1();
        a = h1Var;
        j5m j5mVar = new j5m("text", h1Var, 8);
        j5mVar.k("text", false);
        j5mVar.k("textDecoration", false);
        j5mVar.k("color", false);
        j5mVar.k("metaColor", false);
        j5mVar.k("metaStyle", false);
        j5mVar.k("fontSize", false);
        j5mVar.k("fontStyle", false);
        j5mVar.k("fontWeight", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j1.i;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C((t9f) arfVarArr[1].getValue()), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(cqe.a), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        List list;
        String str5;
        String str6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j1.i;
        int i2 = 7;
        char c2 = 4;
        String str7 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            List list2 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 3, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 4, tkrVar, null);
            Integer num2 = (Integer) c.n(mhpVar, 5, cqe.a, null);
            String str11 = (String) c.n(mhpVar, 6, tkrVar, null);
            list = list2;
            str4 = g;
            str = (String) c.n(mhpVar, 7, tkrVar, null);
            str2 = str11;
            num = num2;
            str6 = str9;
            str3 = str10;
            str5 = str8;
            i = 255;
        } else {
            boolean z = true;
            int i3 = 0;
            String str12 = null;
            String str13 = null;
            Integer num3 = null;
            String str14 = null;
            List list3 = null;
            String str15 = null;
            String str16 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = 4;
                    case 0:
                        str7 = c.g(mhpVar, 0);
                        i3 |= 1;
                        i2 = 7;
                        c2 = 4;
                    case 1:
                        list3 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                        i3 |= 2;
                        i2 = 7;
                        c2 = 4;
                    case 2:
                        str15 = (String) c.n(mhpVar, 2, tkr.a, str15);
                        i3 |= 4;
                        i2 = 7;
                        c2 = 4;
                    case 3:
                        str16 = (String) c.n(mhpVar, 3, tkr.a, str16);
                        i3 |= 8;
                        i2 = 7;
                        c2 = 4;
                    case 4:
                        str14 = (String) c.n(mhpVar, 4, tkr.a, str14);
                        i3 |= 16;
                        c2 = 4;
                        i2 = 7;
                    case 5:
                        num3 = (Integer) c.n(mhpVar, 5, cqe.a, num3);
                        i3 |= 32;
                        c2 = 4;
                    case 6:
                        str13 = (String) c.n(mhpVar, 6, tkr.a, str13);
                        i3 |= 64;
                        c2 = 4;
                    case 7:
                        str12 = (String) c.n(mhpVar, i2, tkr.a, str12);
                        i3 |= 128;
                        c2 = 4;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            str = str12;
            str2 = str13;
            num = num3;
            str3 = str14;
            str4 = str7;
            list = list3;
            str5 = str15;
            str6 = str16;
        }
        c.b(mhpVar);
        return new j1(i, str4, list, str5, str6, str3, num, str2, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j1 j1Var = (j1) obj;
        l6bVar.getClass();
        j1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j1.i;
        c.p(mhpVar, 0, j1Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j1Var.b);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 2, tkrVar, j1Var.c);
        c.q(mhpVar, 3, tkrVar, j1Var.d);
        c.q(mhpVar, 4, tkrVar, j1Var.e);
        c.q(mhpVar, 5, cqe.a, j1Var.f);
        c.q(mhpVar, 6, tkrVar, j1Var.g);
        c.q(mhpVar, 7, tkrVar, j1Var.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
