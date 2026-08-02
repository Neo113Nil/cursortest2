package com.yandex.plus.bdui.plus.action.serializer;

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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.action.serializer.PlusRemoteActionSerializer.RemoteDto", tVar, 2);
        j5mVar.k("actionQuery", false);
        j5mVar.k("fallback", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = v.c;
        return new t9f[]{arfVarArr[0].getValue(), ff7.C((t9f) arfVarArr[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.query.b bVar;
        com.yandex.plus.bdui.action.a aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v.c;
        com.yandex.plus.bdui.query.b bVar2 = null;
        if (c.m()) {
            bVar = (com.yandex.plus.bdui.query.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            aVar = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.action.a aVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bVar2 = (com.yandex.plus.bdui.query.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), bVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    aVar2 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            bVar = bVar2;
            aVar = aVar2;
        }
        c.b(mhpVar);
        return new v(i, bVar, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v vVar = (v) obj;
        l6bVar.getClass();
        vVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v.c;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), vVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), vVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
