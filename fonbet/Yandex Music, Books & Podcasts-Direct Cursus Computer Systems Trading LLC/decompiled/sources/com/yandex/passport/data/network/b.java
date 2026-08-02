package com.yandex.passport.data.network;

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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p3d {
    public static final b a;

    @NotNull
    private static final mhp descriptor;

    static {
        b bVar = new b();
        a = bVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.AuthorizeByPasswordRequest.ErrorResponse", bVar, 4);
        j5mVar.k("errors", false);
        j5mVar.k("state", true);
        j5mVar.k("captcha_image_url", true);
        j5mVar.k(CommonUrlParts.REQUEST_ID, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{d.e[0].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
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
        arf[] arfVarArr = d.e;
        List list2 = null;
        if (c.m()) {
            List list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 2, tkrVar, null);
            list = list3;
            str3 = (String) c.n(mhpVar, 3, tkrVar, null);
            i = 15;
            str2 = str5;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = (String) c.n(mhpVar, 1, tkr.a, str6);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str8 = (String) c.n(mhpVar, 3, tkr.a, str8);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list2;
            str = str6;
            str2 = str7;
            str3 = str8;
        }
        c.b(mhpVar);
        return new d(i, str, str2, str3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d dVar = (d) obj;
        l6bVar.getClass();
        dVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) d.e[0].getValue();
        List list = dVar.a;
        String str = dVar.d;
        String str2 = dVar.c;
        String str3 = dVar.b;
        c.k(mhpVar, 0, t9fVar, list);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 1, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 3, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
