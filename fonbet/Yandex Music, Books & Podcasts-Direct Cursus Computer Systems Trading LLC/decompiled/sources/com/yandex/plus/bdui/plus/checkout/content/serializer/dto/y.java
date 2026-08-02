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
public final /* synthetic */ class y implements p3d {
    public static final y a;

    @NotNull
    private static final mhp descriptor;

    static {
        y yVar = new y();
        a = yVar;
        j5m j5mVar = new j5m("COLOR", yVar, 3);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("altText", false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, a0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        c0 c0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            c0Var = (c0) c.z(mhpVar, 2, a0.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            c0 c0Var2 = null;
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
                    c0Var2 = (c0) c.z(mhpVar, 2, a0.a, c0Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            c0Var = c0Var2;
        }
        c.b(mhpVar);
        return new d0(i, str, str2, c0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, d0Var.a);
        c.p(mhpVar, 1, d0Var.b);
        c.k(mhpVar, 2, a0.a, d0Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
