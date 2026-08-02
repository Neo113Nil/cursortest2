package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b2c;
import defpackage.dh3;
import defpackage.ghh;
import defpackage.grb;
import defpackage.hq5;
import defpackage.k5r;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pyc;
import defpackage.ug3;
import defpackage.uif;
import defpackage.vci;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xp5;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.Za;

/* loaded from: classes5.dex */
public final class Qa extends uif implements pyc {
    public final /* synthetic */ Za a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function1<H3, Unit> c;
    public final /* synthetic */ nbt d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ Function0<Unit> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Qa(Za za, Function0<Unit> function0, Function1<? super H3, Unit> function1, nbt nbtVar, boolean z, Function0<Unit> function02, Function0<Unit> function03) {
        super(3);
        this.a = za;
        this.b = function0;
        this.c = function1;
        this.d = nbtVar;
        this.e = z;
        this.f = function02;
        this.g = function03;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dh3 dh3Var = (dh3) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        dh3Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(dh3Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        yci a = dh3Var.a(vci.a, b2c.f);
        Za za = this.a;
        Function0<Unit> function0 = this.b;
        Function1<H3, Unit> function1 = this.c;
        nbt nbtVar = this.d;
        boolean z = this.e;
        Function0<Unit> function02 = this.f;
        Function0<Unit> function03 = this.g;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(733328855);
        wg3 e = ug3.e(b2c.b, false, oq5Var2, 0);
        oq5Var2.a0(-1323940314);
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        wp5 wp5Var = xp5.T;
        wp5Var.getClass();
        grb grbVar = wp5.b;
        wn5 A = ghh.A(a);
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        Function2 a2 = Lb.a(wp5Var, oq5Var2, e, oq5Var2, l);
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            Mb.a(i, oq5Var2, i, a2);
        }
        ouj.z(oq5Var2, 0, A, oq5Var2, 2058660585);
        if (za instanceof Za.c) {
            oq5Var2.a0(-962159227);
            Pa.a(function0, oq5Var2, 0, 0);
            oq5Var2.p(false);
        } else if (za instanceof Za.d) {
            oq5Var2.a0(-962015449);
            Ma.a(oq5Var2, 0);
            oq5Var2.p(false);
        } else if (za instanceof Za.e) {
            oq5Var2.a0(-961873593);
            Wa.a(oq5Var2, 0);
            oq5Var2.p(false);
        } else if (za instanceof Za.a) {
            oq5Var2.a0(-961732729);
            C1209rb.a(((Za.a) za).a, function1, oq5Var2, 0);
            oq5Var2.p(false);
        } else if (za instanceof Za.b) {
            oq5Var2.a0(-961466377);
            Va.a(nbtVar, z, function02, function03, oq5Var2, 0);
            oq5Var2.p(false);
        } else {
            oq5Var2.a0(-961109288);
            oq5Var2.p(false);
        }
        k5r.s(oq5Var2, false, true, false, false);
        return Unit.a;
    }
}
