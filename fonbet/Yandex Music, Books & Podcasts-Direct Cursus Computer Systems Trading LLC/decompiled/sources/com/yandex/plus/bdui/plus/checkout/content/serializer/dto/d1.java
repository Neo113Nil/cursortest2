package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.connectsdk.service.airplay.PListParser;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements p3d {
    public static final d1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d1 d1Var = new d1();
        a = d1Var;
        j5m j5mVar = new j5m("TEXT", d1Var, 3);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("altText", false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, f1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        h1 h1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            h1Var = (h1) c.z(mhpVar, 2, f1.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            h1 h1Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    h1Var2 = (h1) c.z(mhpVar, 2, f1.a, h1Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            h1Var = h1Var2;
        }
        c.b(mhpVar);
        return new i1(i, str, str2, h1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i1 i1Var = (i1) obj;
        l6bVar.getClass();
        i1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, i1Var.a);
        c.p(mhpVar, 1, i1Var.b);
        c.k(mhpVar, 2, f1.a, i1Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
