package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$Item$Link$$serializer;
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
public final /* synthetic */ class i0 implements p3d {
    public static final i0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.LegalInfoItemLinkImpl", i0Var, 1);
        j5mVar.k("actualItem", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayLegalInfo$Item$Link$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayLegalInfo.Item.Link link;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayLegalInfo.Item.Link link2 = null;
        if (c.m()) {
            link = (PlusPayLegalInfo.Item.Link) c.z(mhpVar, 0, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, null);
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
                    link2 = (PlusPayLegalInfo.Item.Link) c.z(mhpVar, 0, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, link2);
                    i2 = 1;
                }
            }
            link = link2;
            i = i2;
        }
        c.b(mhpVar);
        return new l0(i, link);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l0 l0Var = (l0) obj;
        l6bVar.getClass();
        l0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, l0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
