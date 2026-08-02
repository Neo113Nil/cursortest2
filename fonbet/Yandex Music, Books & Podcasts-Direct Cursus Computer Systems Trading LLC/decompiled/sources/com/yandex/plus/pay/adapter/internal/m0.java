package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$Item$Text$$serializer;
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
public final /* synthetic */ class m0 implements p3d {
    public static final m0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.LegalInfoItemTextImpl", m0Var, 1);
        j5mVar.k("actualItem", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayLegalInfo$Item$Text$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayLegalInfo.Item.Text text;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayLegalInfo.Item.Text text2 = null;
        if (c.m()) {
            text = (PlusPayLegalInfo.Item.Text) c.z(mhpVar, 0, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE, null);
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
                    text2 = (PlusPayLegalInfo.Item.Text) c.z(mhpVar, 0, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE, text2);
                    i2 = 1;
                }
            }
            text = text2;
            i = i2;
        }
        c.b(mhpVar);
        return new p0(i, text);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p0 p0Var = (p0) obj;
        l6bVar.getClass();
        p0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE, p0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
