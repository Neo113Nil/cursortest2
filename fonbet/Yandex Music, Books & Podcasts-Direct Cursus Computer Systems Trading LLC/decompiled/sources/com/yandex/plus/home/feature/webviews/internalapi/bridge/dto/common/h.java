package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.arf;
import defpackage.cqe;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.ModalHeight", hVar, 2);
        j5mVar.k("type", false);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l.c[0].getValue(), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        k kVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l.c;
        if (c.m()) {
            kVar = (k) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            i = c.k(mhpVar, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            k kVar2 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    kVar2 = (k) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), kVar2);
                    i3 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i = c.k(mhpVar, 1);
                    i3 |= 2;
                }
            }
            i2 = i3;
            kVar = kVar2;
        }
        c.b(mhpVar);
        return new l(i2, kVar, i);
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
        c.k(mhpVar, 0, (t9f) l.c[0].getValue(), lVar.a);
        c.A(1, lVar.b, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
