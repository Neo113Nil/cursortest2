package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.q5f;
import defpackage.s5f;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p3d {
    public static final e a;

    @NotNull
    private static final mhp descriptor;

    static {
        e eVar = new e();
        a = eVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.action.serializer.PlusCloseActionSerializer.CloseDto", eVar, 4);
        j5mVar.k("status", false);
        j5mVar.k("fallbackReason", true);
        j5mVar.k("data", false);
        j5mVar.k("query", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(s5f.a), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        q5f q5fVar;
        com.yandex.plus.bdui.query.b bVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g.e;
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String str4 = (String) c.n(mhpVar, 1, tkr.a, null);
            q5f q5fVar2 = (q5f) c.n(mhpVar, 2, s5f.a, null);
            bVar = (com.yandex.plus.bdui.query.b) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            q5fVar = q5fVar2;
            i = 15;
            str2 = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            q5f q5fVar3 = null;
            com.yandex.plus.bdui.query.b bVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = (String) c.n(mhpVar, 1, tkr.a, str5);
                    i2 |= 2;
                } else if (w == 2) {
                    q5fVar3 = (q5f) c.n(mhpVar, 2, s5f.a, q5fVar3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    bVar2 = (com.yandex.plus.bdui.query.b) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), bVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str5;
            q5fVar = q5fVar3;
            bVar = bVar2;
        }
        c.b(mhpVar);
        return new g(i, str, str2, q5fVar, bVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g gVar = (g) obj;
        l6bVar.getClass();
        gVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g.e;
        String str = gVar.a;
        String str2 = gVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        c.q(mhpVar, 2, s5f.a, gVar.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), gVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
