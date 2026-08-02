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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements p3d {
    public static final q8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q8 q8Var = new q8();
        a = q8Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetTrackPayloadRequest.Result", q8Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{s8.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s8.b;
        int i = 1;
        Map map2 = null;
        if (c.m()) {
            map = (Map) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), map2);
                    i2 = 1;
                }
            }
            map = map2;
            i = i2;
        }
        c.b(mhpVar);
        return new s8(i, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s8 s8Var = (s8) obj;
        l6bVar.getClass();
        s8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) s8.b[0].getValue(), s8Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
