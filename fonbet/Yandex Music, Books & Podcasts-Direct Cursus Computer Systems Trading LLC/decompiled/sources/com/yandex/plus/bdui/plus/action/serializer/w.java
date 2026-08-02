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
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class w implements p3d {
    public static final w a;

    @NotNull
    private static final mhp descriptor;

    static {
        w wVar = new w();
        a = wVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.action.serializer.PlusSendAnalyticsActionSerializer.EventDto", wVar, 4);
        j5mVar.k("idempotencyKey", false);
        j5mVar.k("type", false);
        j5mVar.k("name", false);
        j5mVar.k("params", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = y.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, tkrVar, ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = y.e;
        String str4 = null;
        if (c.m()) {
            String str5 = (String) c.n(mhpVar, 0, tkr.a, null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            list = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = str5;
            str3 = g2;
            i = 15;
            str2 = g;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            list = list2;
        }
        c.b(mhpVar);
        return new y(i, str, str2, str3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y yVar = (y) obj;
        l6bVar.getClass();
        yVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = y.e;
        c.q(mhpVar, 0, tkr.a, yVar.a);
        c.p(mhpVar, 1, yVar.b);
        c.p(mhpVar, 2, yVar.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), yVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
