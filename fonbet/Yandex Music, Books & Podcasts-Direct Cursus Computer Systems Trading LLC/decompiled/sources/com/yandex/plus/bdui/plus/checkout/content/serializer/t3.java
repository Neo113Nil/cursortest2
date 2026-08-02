package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements p3d {
    public static final t3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t3 t3Var = new t3();
        a = t3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayErrorContentSerializer.DataDto", t3Var, 8);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("errorCode", false);
        j5mVar.k("errorCodeContentDescription", false);
        j5mVar.k("expandable", false);
        j5mVar.k("primaryButton", false);
        j5mVar.k("secondaryButton", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(z3.a), tkrVar, ff7.C(tkrVar), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        b4 b4Var;
        String str6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 2;
        String str7 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            String g4 = c.g(mhpVar, 3);
            b4 b4Var2 = (b4) c.n(mhpVar, 4, z3.a, null);
            String g5 = c.g(mhpVar, 5);
            String str8 = (String) c.n(mhpVar, 6, tkr.a, null);
            str2 = g;
            cVar = (c) c.n(mhpVar, 7, a.a, null);
            str = str8;
            str6 = g5;
            str5 = g4;
            b4Var = b4Var2;
            str4 = g3;
            str3 = g2;
            i = 255;
        } else {
            boolean z = true;
            int i3 = 0;
            c cVar2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            b4 b4Var3 = null;
            String str13 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        i3 |= 1;
                        str7 = c.g(mhpVar, 0);
                        continue;
                    case 1:
                        i3 |= 2;
                        str10 = c.g(mhpVar, 1);
                        continue;
                    case 2:
                        str11 = c.g(mhpVar, i2);
                        i3 |= 4;
                        continue;
                    case 3:
                        str12 = c.g(mhpVar, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        b4Var3 = (b4) c.n(mhpVar, 4, z3.a, b4Var3);
                        i3 |= 16;
                        break;
                    case 5:
                        str13 = c.g(mhpVar, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        str9 = (String) c.n(mhpVar, 6, tkr.a, str9);
                        i3 |= 64;
                        break;
                    case 7:
                        cVar2 = (c) c.n(mhpVar, 7, a.a, cVar2);
                        i3 |= 128;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 2;
            }
            i = i3;
            cVar = cVar2;
            str = str9;
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            b4Var = b4Var3;
            str6 = str13;
        }
        c.b(mhpVar);
        return new v3(i, str2, str3, str4, str5, b4Var, str6, str, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v3 v3Var = (v3) obj;
        l6bVar.getClass();
        v3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, v3Var.a);
        c.p(mhpVar, 1, v3Var.b);
        c.p(mhpVar, 2, v3Var.c);
        c.p(mhpVar, 3, v3Var.d);
        c.q(mhpVar, 4, z3.a, v3Var.e);
        c.p(mhpVar, 5, v3Var.f);
        c.q(mhpVar, 6, tkr.a, v3Var.g);
        c.q(mhpVar, 7, a.a, v3Var.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
