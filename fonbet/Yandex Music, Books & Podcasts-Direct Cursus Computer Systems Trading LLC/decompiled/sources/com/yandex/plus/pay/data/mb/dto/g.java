package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.ClosingOfferRequestDto", gVar, 4);
        j5mVar.k("offers", false);
        j5mVar.k("target", false);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("language", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{i.e[0].getValue(), tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i.e;
        List list2 = null;
        if (c.m()) {
            List list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            list = list3;
            str = g;
            str3 = c.g(mhpVar, 3);
            str2 = g2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str5 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = c.g(mhpVar, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new i(i, str, str2, str3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i iVar = (i) obj;
        l6bVar.getClass();
        iVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) i.e[0].getValue(), iVar.a);
        c.p(mhpVar, 1, iVar.b);
        c.p(mhpVar, 2, iVar.c);
        c.p(mhpVar, 3, iVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
