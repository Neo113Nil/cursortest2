package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import android.net.Uri;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e4 implements p3d {
    public static final e4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e4 e4Var = new e4();
        a = e4Var;
        j5m j5mVar = new j5m("OPEN_LINK", e4Var, 6);
        j5mVar.k("trackId", true);
        j5mVar.k("url", false);
        j5mVar.k("urlType", false);
        j5mVar.k("openType", false);
        j5mVar.k("needAuth", false);
        j5mVar.k("presentationOptions", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = l4.g;
        return new t9f[]{ff7.C(tkr.a), arfVarArr[1].getValue(), arfVarArr[2].getValue(), arfVarArr[3].getValue(), oc3.a, ff7.C(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        Uri uri;
        k4 k4Var;
        i4 i4Var;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l4.g;
        int i2 = 5;
        boolean z2 = false;
        if (c.m()) {
            String str2 = (String) c.n(mhpVar, 0, tkr.a, null);
            Uri uri2 = (Uri) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            k4 k4Var2 = (k4) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i4 i4Var2 = (i4) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            boolean D = c.D(mhpVar, 4);
            i4Var = i4Var2;
            str = str2;
            qVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q) c.n(mhpVar, 5, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, null);
            z = D;
            i = 63;
            k4Var = k4Var2;
            uri = uri2;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            String str3 = null;
            Uri uri3 = null;
            k4 k4Var3 = null;
            i4 i4Var3 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar2 = null;
            int i3 = 0;
            while (z3) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z3 = z2;
                        i2 = 5;
                    case 0:
                        str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                        i3 |= 1;
                        z2 = false;
                        i2 = 5;
                    case 1:
                        uri3 = (Uri) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), uri3);
                        i3 |= 2;
                        z2 = false;
                    case 2:
                        k4Var3 = (k4) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), k4Var3);
                        i3 |= 4;
                        z2 = false;
                    case 3:
                        i4Var3 = (i4) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), i4Var3);
                        i3 |= 8;
                        z2 = false;
                    case 4:
                        z4 = c.D(mhpVar, 4);
                        i3 |= 16;
                        z2 = false;
                    case 5:
                        qVar2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q) c.n(mhpVar, i2, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, qVar2);
                        i3 |= 32;
                        z2 = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z4;
            i = i3;
            str = str3;
            uri = uri3;
            k4Var = k4Var3;
            i4Var = i4Var3;
            qVar = qVar2;
        }
        c.b(mhpVar);
        return new l4(i, str, uri, k4Var, i4Var, z, qVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l4 l4Var = (l4) obj;
        l6bVar.getClass();
        l4Var.getClass();
        String str = l4Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = l4.g;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        t9f t9fVar = (t9f) arfVarArr[1].getValue();
        Uri uri = l4Var.b;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar = l4Var.f;
        c.k(mhpVar, 1, t9fVar, uri);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), l4Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), l4Var.d);
        c.j(mhpVar, 4, l4Var.e);
        if (c.e(mhpVar) || qVar != null) {
            c.q(mhpVar, 5, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.c.a, qVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
