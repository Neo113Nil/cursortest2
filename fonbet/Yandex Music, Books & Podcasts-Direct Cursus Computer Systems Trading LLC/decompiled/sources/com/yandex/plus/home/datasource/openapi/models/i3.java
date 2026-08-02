package com.yandex.plus.home.datasource.openapi.models;

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
import java.net.URI;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class i3 implements p3d {
    public static final i3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i3 i3Var = new i3();
        a = i3Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkIconNotificationModel", i3Var, 3);
        j5mVar.k("position", false);
        j5mVar.k("type", false);
        j5mVar.k("url", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{k3.d[0].getValue(), tkr.a, b.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b5 b5Var;
        String str;
        URI uri;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = k3.d;
        b5 b5Var2 = null;
        if (c.m()) {
            b5Var = (b5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = c.g(mhpVar, 1);
            uri = (URI) c.z(mhpVar, 2, b.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            URI uri2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b5Var2 = (b5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), b5Var2);
                    i2 |= 1;
                } else if (w == 1) {
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    uri2 = (URI) c.z(mhpVar, 2, b.a, uri2);
                    i2 |= 4;
                }
            }
            i = i2;
            b5Var = b5Var2;
            str = str2;
            uri = uri2;
        }
        c.b(mhpVar);
        return new k3(i, b5Var, str, uri);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k3 k3Var = (k3) obj;
        l6bVar.getClass();
        k3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) k3.d[0].getValue(), k3Var.a);
        c.p(mhpVar, 1, k3Var.b);
        c.k(mhpVar, 2, b.a, k3Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
