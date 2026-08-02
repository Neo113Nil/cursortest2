package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bqi;
import defpackage.gq5;
import defpackage.h9f;
import defpackage.hq5;
import defpackage.kjn;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.gb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1056gb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ C0972ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056gb(C0972ab c0972ab) {
        super(2);
        this.a = c0972ab;
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
        bqi bqiVar = ((C1223sb) this.a.c.getValue()).i;
        C0972ab c0972ab = this.a;
        nbt nbtVar = c0972ab.e;
        if (nbtVar == null) {
            Intrinsics.j("brandResProvider");
            throw null;
        }
        K k = c0972ab.d;
        if (k == null) {
            Intrinsics.j("appConfig");
            throw null;
        }
        boolean isHelpAvailable = k.getEasyLoginConfig().isHelpAvailable();
        C1223sb c1223sb = (C1223sb) this.a.c.getValue();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(-321405761);
        boolean h = oq5Var2.h(c1223sb);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new C0986bb(c1223sb);
            oq5Var2.k0(K);
        }
        oq5Var2.p(false);
        Function0 function0 = (Function0) ((h9f) K);
        C1223sb c1223sb2 = (C1223sb) this.a.c.getValue();
        oq5Var2.a0(-321403682);
        boolean h2 = oq5Var2.h(c1223sb2);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            K2 = new C1000cb(c1223sb2);
            oq5Var2.k0(K2);
        }
        oq5Var2.p(false);
        Function0 function02 = (Function0) ((h9f) K2);
        C1223sb c1223sb3 = (C1223sb) this.a.c.getValue();
        oq5Var2.a0(-321401568);
        boolean h3 = oq5Var2.h(c1223sb3);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            K3 = new C1014db(c1223sb3);
            oq5Var2.k0(K3);
        }
        oq5Var2.p(false);
        Function1 function1 = (Function1) ((h9f) K3);
        C1223sb c1223sb4 = (C1223sb) this.a.c.getValue();
        oq5Var2.a0(-321399359);
        boolean h4 = oq5Var2.h(c1223sb4);
        Object K4 = oq5Var2.K();
        if (h4 || K4 == kjnVar) {
            K4 = new C1028eb(c1223sb4);
            oq5Var2.k0(K4);
        }
        oq5Var2.p(false);
        Function0 function03 = (Function0) ((h9f) K4);
        C1223sb c1223sb5 = (C1223sb) this.a.c.getValue();
        oq5Var2.a0(-321397119);
        boolean h5 = oq5Var2.h(c1223sb5);
        Object K5 = oq5Var2.K();
        if (h5 || K5 == kjnVar) {
            K5 = new C1042fb(c1223sb5);
            oq5Var2.k0(K5);
        }
        oq5Var2.p(false);
        Ta.a(bqiVar, nbtVar, isHelpAvailable, function0, function02, function1, function03, (Function0) ((h9f) K5), oq5Var2, 0);
        return Unit.a;
    }
}
