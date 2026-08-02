package com.yandex.plus.bdui.plus.content.serializer;

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
public final /* synthetic */ class r implements p3d {
    public static final r a;

    @NotNull
    private static final mhp descriptor;

    static {
        r rVar = new r();
        a = rVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusAuthorizeContentSerializer.ActionsDto", rVar, 3);
        j5mVar.k("auth", false);
        j5mVar.k("cancel", false);
        j5mVar.k("back", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t.d;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.action.a aVar2;
        com.yandex.plus.bdui.action.a aVar3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t.d;
        com.yandex.plus.bdui.action.a aVar4 = null;
        if (c.m()) {
            aVar = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            aVar2 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            aVar3 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.action.a aVar5 = null;
            com.yandex.plus.bdui.action.a aVar6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    aVar4 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), aVar4);
                    i2 |= 1;
                } else if (w == 1) {
                    aVar5 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar5);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    aVar6 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), aVar6);
                    i2 |= 4;
                }
            }
            i = i2;
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        }
        c.b(mhpVar);
        return new t(i, aVar, aVar2, aVar3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t tVar = (t) obj;
        l6bVar.getClass();
        tVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t.d;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), tVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), tVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), tVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
