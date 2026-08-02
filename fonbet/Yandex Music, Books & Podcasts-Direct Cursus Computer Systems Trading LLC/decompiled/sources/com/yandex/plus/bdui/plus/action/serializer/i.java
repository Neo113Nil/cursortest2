package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p3d {
    public static final i a;

    @NotNull
    private static final mhp descriptor;

    static {
        i iVar = new i();
        a = iVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.action.serializer.PlusDelayActionSerializer.DelayDto", iVar, 2);
        j5mVar.k("delay", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{mvg.a, k.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        long j;
        int i;
        com.yandex.plus.bdui.action.a aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = k.c;
        com.yandex.plus.bdui.action.a aVar2 = null;
        if (c.m()) {
            j = c.q(mhpVar, 0);
            aVar = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            j = 0;
            boolean z = true;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j = c.q(mhpVar, 0);
                    i |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    aVar2 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar2);
                    i |= 2;
                }
            }
            aVar = aVar2;
        }
        c.b(mhpVar);
        return new k(i, j, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k kVar = (k) obj;
        l6bVar.getClass();
        kVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = k.c;
        c.g(mhpVar, 0, kVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), kVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
