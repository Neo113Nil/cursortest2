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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements p3d {
    public static final q3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q3 q3Var = new q3();
        a = q3Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetChallengeRequest.Tag", q3Var, 1);
        j5mVar.k("url", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{s3.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s3.b;
        int i = 1;
        String str = null;
        if (c.m()) {
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            if (bVar != null) {
                str = bVar.a;
            }
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), str2 != null ? new com.yandex.passport.common.url.b(str2) : null);
                    str2 = bVar2 != null ? bVar2.a : null;
                    i2 = 1;
                }
            }
            str = str2;
            i = i2;
        }
        c.b(mhpVar);
        return new s3(i, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s3 s3Var = (s3) obj;
        l6bVar.getClass();
        s3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) s3.b[0].getValue(), new com.yandex.passport.common.url.b(s3Var.a));
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
