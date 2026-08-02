package com.yandex.plus.bdui.plus.action.serializer;

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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.action.serializer.PlusNextDocumentActionSerializer.NextDocumentDto", oVar, 2);
        j5mVar.k("documentQuery", false);
        j5mVar.k("skipPreview", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{q.c[0].getValue(), ff7.C(oc3.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.query.e eVar;
        Boolean bool;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q.c;
        com.yandex.plus.bdui.query.e eVar2 = null;
        if (c.m()) {
            eVar = (com.yandex.plus.bdui.query.e) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            bool = (Boolean) c.n(mhpVar, 1, oc3.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    eVar2 = (com.yandex.plus.bdui.query.e) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), eVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    bool2 = (Boolean) c.n(mhpVar, 1, oc3.a, bool2);
                    i2 |= 2;
                }
            }
            i = i2;
            eVar = eVar2;
            bool = bool2;
        }
        c.b(mhpVar);
        return new q(i, eVar, bool);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) q.c[0].getValue(), qVar.a);
        c.q(mhpVar, 1, oc3.a, qVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
