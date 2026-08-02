package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$$serializer;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class f0 implements p3d {
    public static final f0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.LegalInfoImpl", f0Var, 1);
        j5mVar.k("actualLegalInfo", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayLegalInfo$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayLegalInfo plusPayLegalInfo;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayLegalInfo plusPayLegalInfo2 = null;
        if (c.m()) {
            plusPayLegalInfo = (PlusPayLegalInfo) c.z(mhpVar, 0, PlusPayLegalInfo$$serializer.INSTANCE, null);
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
                    plusPayLegalInfo2 = (PlusPayLegalInfo) c.z(mhpVar, 0, PlusPayLegalInfo$$serializer.INSTANCE, plusPayLegalInfo2);
                    i2 = 1;
                }
            }
            plusPayLegalInfo = plusPayLegalInfo2;
            i = i2;
        }
        c.b(mhpVar);
        return new h0(i, plusPayLegalInfo);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h0 h0Var = (h0) obj;
        l6bVar.getClass();
        h0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayLegalInfo$$serializer.INSTANCE, h0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
