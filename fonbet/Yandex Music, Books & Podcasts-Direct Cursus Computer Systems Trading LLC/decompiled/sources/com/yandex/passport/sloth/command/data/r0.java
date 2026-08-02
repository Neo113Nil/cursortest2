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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements p3d {
    public static final r0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r0 r0Var = new r0();
        a = r0Var;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.SendMetricsData", r0Var, 2);
        j5mVar.k("identifier", false);
        j5mVar.k("parameters", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, t0.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t0.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            map = (Map) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), map2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            map = map2;
        }
        c.b(mhpVar);
        return new t0(str, i, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t0 t0Var = (t0) obj;
        l6bVar.getClass();
        t0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t0.c;
        c.p(mhpVar, 0, t0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
