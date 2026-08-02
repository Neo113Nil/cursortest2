package com.yandex.plus.home.datasource.openapi.models;

import defpackage.avf;
import defpackage.csm;
import defpackage.eg7;
import defpackage.gsm;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.x4f;
import defpackage.zhp;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final gsm b = avf.g("openapi.generator.BigDecimal", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar != null) {
            return new BigDecimal(x4f.g(s4fVar.f()).a());
        }
        throw new zhp("This class can be decoded/encoded only by Json!");
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        BigDecimal bigDecimal = (BigDecimal) obj;
        l6bVar.getClass();
        bigDecimal.getClass();
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        l6bVar.E(plainString);
    }
}
