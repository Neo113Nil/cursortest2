package com.yandex.plus.pay.data.mb.dto;

import com.connectsdk.service.airplay.PListParser;
import defpackage.arf;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class e3 implements p3d {
    public static final e3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e3 e3Var = new e3();
        a = e3Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.RichTextDto.Item", e3Var, 4);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("type", false);
        j5mVar.k("data", false);
        j5mVar.k("link", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i3.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        h3 h3Var;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i3.e;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            h3 h3Var2 = (h3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g2 = c.g(mhpVar, 2);
            h3Var = h3Var2;
            str = g;
            str3 = (String) c.n(mhpVar, 3, tkr.a, null);
            str2 = g2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            h3 h3Var3 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    h3Var3 = (h3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), h3Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    str5 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 3, tkr.a, str6);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            h3Var = h3Var3;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new i3(i, str, h3Var, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i3 i3Var = (i3) obj;
        l6bVar.getClass();
        i3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i3.e;
        String str = i3Var.a;
        String str2 = i3Var.d;
        c.p(mhpVar, 0, str);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), i3Var.b);
        c.p(mhpVar, 2, i3Var.c);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
