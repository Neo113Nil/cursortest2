package com.yandex.passport.sloth.command.data;

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
public final /* synthetic */ class j implements p3d {
    public static final j a;

    @NotNull
    private static final mhp descriptor;

    static {
        j jVar = new j();
        a = jVar;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.FinishWithUrlData", jVar, 2);
        j5mVar.k("url", false);
        j5mVar.k("purpose", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l.c[0].getValue(), tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l.c;
        if (c.m()) {
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str2 = bVar != null ? bVar.a : null;
            str = c.g(mhpVar, 1);
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
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), str4 != null ? new com.yandex.passport.common.url.b(str4) : null);
                    str4 = bVar2 != null ? bVar2.a : null;
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str3 = c.g(mhpVar, 1);
                    i2 |= 2;
                }
            }
            str = str3;
            i = i2;
            str2 = str4;
        }
        c.b(mhpVar);
        return new l(i, str2, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l lVar = (l) obj;
        l6bVar.getClass();
        lVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) l.c[0].getValue(), new com.yandex.passport.common.url.b(lVar.a));
        c.p(mhpVar, 1, lVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
