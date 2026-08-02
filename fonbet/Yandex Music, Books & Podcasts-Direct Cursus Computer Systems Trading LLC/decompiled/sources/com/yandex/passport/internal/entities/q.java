package com.yandex.passport.internal.entities;

import com.yandex.passport.api.m1;
import defpackage.avf;
import defpackage.c4f;
import defpackage.csm;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ome;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.u75;
import defpackage.ux0;
import defpackage.v75;
import defpackage.w4f;
import defpackage.wq5;
import defpackage.x4f;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class q implements t9f {
    public static final q a = new q();
    public static final ux0 b = new ux0((mhp) avf.g("partition", csm.j), false);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        if (!(eg7Var instanceof s4f)) {
            xq0.x("Failed requirement.");
            return null;
        }
        w4f f = ((s4f) eg7Var).f();
        ome omeVar = x4f.a;
        f.getClass();
        c4f c4fVar = f instanceof c4f ? (c4f) f : null;
        if (c4fVar == null) {
            x4f.d(f, "JsonArray");
            throw null;
        }
        ArrayList arrayList = new ArrayList(v75.o(c4fVar, 10));
        Iterator it = c4fVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(x4f.g((w4f) it.next()).a());
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            m1.a(str);
            arrayList2.add(new m1(str));
        }
        return new p(arrayList2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p pVar = (p) obj;
        l6bVar.getClass();
        pVar.getClass();
        int J = CollectionsKt.J(pVar);
        ux0 ux0Var = b;
        wq5 t = l6bVar.t(ux0Var, J);
        int i = 0;
        for (Object obj2 : pVar.a) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            t.p(ux0Var, i, ((m1) obj2).a);
            i = i2;
        }
        t.b(ux0Var);
    }
}
