package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.gq5;
import defpackage.h9f;
import defpackage.hq5;
import defpackage.kjn;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Z9 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ V9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9(V9 v9) {
        super(2);
        this.a = v9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        V9 v9 = this.a;
        C1166o9 c1166o9 = v9.e;
        if (c1166o9 == null) {
            Intrinsics.j("args");
            throw null;
        }
        boolean z = c1166o9.a;
        nbt nbtVar = v9.d;
        if (nbtVar == null) {
            Intrinsics.j("brandResProvider");
            throw null;
        }
        C1027ea c1027ea = (C1027ea) v9.c.getValue();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(599009235);
        boolean h = oq5Var2.h(c1027ea);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new W9(c1027ea);
            oq5Var2.k0(K);
        }
        oq5Var2.p(false);
        Function0 function0 = (Function0) ((h9f) K);
        C1027ea c1027ea2 = (C1027ea) this.a.c.getValue();
        oq5Var2.a0(599011380);
        boolean h2 = oq5Var2.h(c1027ea2);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            K2 = new X9(c1027ea2);
            oq5Var2.k0(K2);
        }
        oq5Var2.p(false);
        Function0 function02 = (Function0) ((h9f) K2);
        C1027ea c1027ea3 = (C1027ea) this.a.c.getValue();
        oq5Var2.a0(599013688);
        boolean h3 = oq5Var2.h(c1027ea3);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            K3 = new Y9(c1027ea3);
            oq5Var2.k0(K3);
        }
        oq5Var2.p(false);
        G9.a(z, nbtVar, function0, function02, (Function0) ((h9f) K3), oq5Var2, 0);
        return Unit.a;
    }
}
