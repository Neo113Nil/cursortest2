package com.yandex.passport.data.network;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class bc implements p3d {
    public static final bc a;

    @NotNull
    private static final mhp descriptor;

    static {
        bc bcVar = new bc();
        a = bcVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.UpdateAvatarRequest.Result", bcVar, 2);
        j5mVar.k("status", false);
        j5mVar.k("avatar_url", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, dc.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = dc.c;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            str2 = bVar != null ? bVar.a : null;
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), str4 != null ? new com.yandex.passport.common.url.b(str4) : null);
                    str4 = bVar2 != null ? bVar2.a : null;
                    i2 |= 2;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new dc(i, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        dc dcVar = (dc) obj;
        l6bVar.getClass();
        dcVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = dc.c;
        c.p(mhpVar, 0, dcVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), new com.yandex.passport.common.url.b(dcVar.b));
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
