package ru.kinopoisk.sdk.easylogin.internal;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.es5;
import defpackage.ghh;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.k5r;
import defpackage.nbt;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pyc;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.ua5;
import defpackage.uif;
import defpackage.vci;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xof;
import defpackage.xp5;
import defpackage.yci;
import defpackage.zbt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class L3 extends uif implements pyc {
    public final /* synthetic */ yci a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ H3 c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0<Unit> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(yci yciVar, nbt nbtVar, H3 h3, Function0<Unit> function0, boolean z, Function0<Unit> function02) {
        super(3);
        this.a = yciVar;
        this.b = nbtVar;
        this.c = h3;
        this.d = function0;
        this.e = z;
        this.f = function02;
    }

    public final void a(ua5 ua5Var, hq5 hq5Var, int i) {
        zbt zbtVar;
        ua5Var.getClass();
        if ((i & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean z = oq5Var2.j(es5.n) == xof.b;
        yci d = androidx.compose.foundation.layout.d.d(this.a, 1.0f);
        gz2 gz2Var = b2c.o;
        nbt nbtVar = this.b;
        H3 h3 = this.c;
        Function0<Unit> function0 = this.d;
        boolean z2 = this.e;
        Function0<Unit> function02 = this.f;
        oq5Var2.a0(-483455358);
        ta5 a = sa5.a(qx0.c, gz2Var, oq5Var2, 48);
        oq5Var2.a0(-1323940314);
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        wp5 wp5Var = xp5.T;
        wp5Var.getClass();
        grb grbVar = wp5.b;
        wn5 A = ghh.A(d);
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        Function2 a2 = Lb.a(wp5Var, oq5Var2, a, oq5Var2, l);
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
            Mb.a(i2, oq5Var2, i2, a2);
        }
        ouj.z(oq5Var2, 0, A, oq5Var2, 2058660585);
        vci vciVar = vci.a;
        yci f = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.d.e(vciVar, 240), 1.0f).f(new HorizontalAlignElement(gz2Var));
        if (h3 instanceof H3.b) {
            zbtVar = zbt.b;
        } else if (h3 instanceof H3.c) {
            zbtVar = zbt.a;
        } else {
            if (!(h3 instanceof H3.a)) {
                b6e.s();
                return;
            }
            zbtVar = zbt.c;
        }
        nbtVar.w(f, zbtVar, z, oq5Var2, 0);
        u1g.l(oq5Var2, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_2, oq5Var2)));
        xcs.b(rvf.M(nbtVar.k(), oq5Var2), null, C1210rc.a(oq5Var2, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var2, 0).getA(), oq5Var2, 0, 0, 65018);
        u1g.l(oq5Var2, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_3, oq5Var2)));
        yci r = androidx.compose.foundation.layout.d.r(vciVar, 220);
        InterfaceC1129m0.e eVar = InterfaceC1129m0.e.a;
        EnumC1087j0 enumC1087j0 = EnumC1087j0.ExtraLarge;
        C1155nc.a(function0, r, eVar, enumC1087j0, false, C1102k1.a(), oq5Var2, 200112, 16);
        u1g.l(oq5Var2, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_medium_1, oq5Var2)));
        oq5Var2.a0(782099108);
        if (z2) {
            C1155nc.a(function02, null, InterfaceC1129m0.f.a, enumC1087j0, false, C1102k1.b(), oq5Var2, 200064, 18);
        }
        k5r.s(oq5Var2, false, false, true, false);
        oq5Var2.p(false);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((ua5) obj, (hq5) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
