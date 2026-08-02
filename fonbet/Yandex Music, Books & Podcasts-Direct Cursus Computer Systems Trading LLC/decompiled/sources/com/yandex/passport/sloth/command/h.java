package com.yandex.passport.sloth.command;

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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.JsCommandParser.JsRequest", hVar, 4);
        j5mVar.k("version", false);
        j5mVar.k(Constants.KEY_MESSAGE, false);
        j5mVar.k("requestId", false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(com.yandex.passport.common.serializer.a.b);
        tkr tkrVar = tkr.a;
        return new t9f[]{cqe.a, tkrVar, tkrVar, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            i = c.k(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            str3 = (String) c.n(mhpVar, 3, com.yandex.passport.common.serializer.a.b, null);
            str2 = g2;
            str = g;
            i2 = 15;
        } else {
            boolean z = true;
            i = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(mhpVar, 0);
                    i3 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i3 |= 2;
                } else if (w == 2) {
                    str5 = c.g(mhpVar, 2);
                    i3 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 3, com.yandex.passport.common.serializer.a.b, str6);
                    i3 |= 8;
                }
            }
            i2 = i3;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        int i4 = i;
        c.b(mhpVar);
        return new j(str, i2, i4, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j jVar = (j) obj;
        l6bVar.getClass();
        jVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.A(0, jVar.a, mhpVar);
        c.p(mhpVar, 1, jVar.b);
        c.p(mhpVar, 2, jVar.c);
        c.q(mhpVar, 3, com.yandex.passport.common.serializer.a.b, jVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
