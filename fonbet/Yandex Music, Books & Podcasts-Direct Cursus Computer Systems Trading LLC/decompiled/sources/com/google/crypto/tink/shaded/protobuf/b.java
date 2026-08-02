package com.google.crypto.tink.shaded.protobuf;

import defpackage.d8;
import defpackage.jn3;
import defpackage.mn3;
import defpackage.tse;
import defpackage.vto;

/* loaded from: classes3.dex */
public final class b {
    public final a a;

    public b(a aVar) {
        tse.a(aVar, "output");
        this.a = aVar;
        aVar.a = this;
    }

    public final void a(int i, mn3 mn3Var) {
        a aVar = this.a;
        aVar.r(i, 2);
        aVar.s(mn3Var.size());
        jn3 jn3Var = (jn3) mn3Var;
        aVar.l(jn3Var.d, jn3Var.s(), jn3Var.size());
    }

    public final void b(int i, Object obj, vto vtoVar) {
        a aVar = this.a;
        aVar.r(i, 3);
        vtoVar.e((d8) obj, aVar.a);
        aVar.r(i, 4);
    }

    public final void c(int i, Object obj, vto vtoVar) {
        d8 d8Var = (d8) obj;
        a aVar = this.a;
        aVar.r(i, 2);
        d8Var.getClass();
        c cVar = (c) d8Var;
        int i2 = cVar.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = vtoVar.f(d8Var);
            cVar.memoizedSerializedSize = i2;
        }
        aVar.s(i2);
        vtoVar.e(d8Var, aVar.a);
    }
}
