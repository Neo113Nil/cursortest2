package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final /* synthetic */ class s3 implements p3d {
    public static final s3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s3 s3Var = new s3();
        a = s3Var;
        j5m j5mVar = new j5m("OPEN_SMART", s3Var, 4);
        j5mVar.k("trackId", true);
        j5mVar.k("url", false);
        j5mVar.k("broadcastId", true);
        j5mVar.k("presentationOptions", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, ff7.C(tkrVar), ff7.C(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 0, tkrVar, null);
            String g = c.g(mhpVar, 1);
            str3 = (String) c.n(mhpVar, 2, tkrVar, null);
            qVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q) c.n(mhpVar, 3, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, null);
            i = 15;
            str2 = g;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar2 = null;
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
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    qVar2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q) c.n(mhpVar, 3, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, qVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            qVar = qVar2;
        }
        c.b(mhpVar);
        return new u3(i, str, str2, str3, qVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u3 u3Var = (u3) obj;
        l6bVar.getClass();
        u3Var.getClass();
        String str = u3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = u3Var.b;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar = u3Var.d;
        String str3 = u3Var.c;
        c.p(mhpVar, 1, str2);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 2, tkr.a, str3);
        }
        if (c.e(mhpVar) || qVar != null) {
            c.q(mhpVar, 3, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, qVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
