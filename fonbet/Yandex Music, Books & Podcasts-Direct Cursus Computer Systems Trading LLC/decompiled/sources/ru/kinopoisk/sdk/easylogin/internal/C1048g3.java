package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aqi;
import defpackage.aur;
import defpackage.b2c;
import defpackage.bqi;
import defpackage.ghh;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.iz2;
import defpackage.k5r;
import defpackage.kjn;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rvf;
import defpackage.szf;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.u8b;
import defpackage.ua5;
import defpackage.ug3;
import defpackage.uif;
import defpackage.vci;
import defpackage.we7;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xp5;
import defpackage.yci;
import defpackage.yoc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1048g3 extends uif implements pyc {
    public final /* synthetic */ bqi a;
    public final /* synthetic */ Function1<String, Unit> b;

    @we7(c = "ru.kinopoisk.tvauth.internal.presentation.entercode.EnterCodeViewKt$EnterCodeView$1$3$1", f = "EnterCodeView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.g3$a */
    public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public final /* synthetic */ yoc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yoc yocVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.a = yocVar;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.a, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.a, (Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            yoc yocVar = this.a;
            yocVar.getClass();
            yocVar.a(new u8b(1, 4));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048g3(bqi bqiVar, Function1 function1) {
        super(3);
        this.a = bqiVar;
        this.b = function1;
    }

    public final void a(ua5 ua5Var, hq5 hq5Var, int i) {
        boolean z;
        ua5Var.getClass();
        if ((i & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return;
            }
        }
        aqi Q = szf.Q(this.a, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(-840213812);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new yoc();
            oq5Var2.k0(K);
        }
        yoc yocVar = (yoc) K;
        oq5Var2.p(false);
        xcs.b(rvf.M(R.string.input_screen_subtitle, oq5Var2), null, C1210rc.a(oq5Var2, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var2, 0).getA(), oq5Var2, 0, 0, 65018);
        oq5 oq5Var3 = oq5Var2;
        vci vciVar = vci.a;
        u1g.l(oq5Var3, androidx.compose.foundation.layout.d.e(vciVar, 52));
        yci a2 = androidx.compose.ui.focus.a.a(vciVar, yocVar);
        Function1<String, Unit> function1 = this.b;
        oq5Var3.a0(733328855);
        wg3 e = ug3.e(b2c.b, false, oq5Var3, 0);
        oq5Var3.a0(-1323940314);
        int i2 = oq5Var3.P;
        androidx.compose.runtime.internal.a l = oq5Var3.l();
        wp5 wp5Var = xp5.T;
        wp5Var.getClass();
        grb grbVar = wp5.b;
        wn5 A = ghh.A(a2);
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        Function2 a3 = Lb.a(wp5Var, oq5Var3, e, oq5Var3, l);
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
            Mb.a(i2, oq5Var3, i2, a3);
        }
        ouj.z(oq5Var3, 0, A, oq5Var3, 2058660585);
        C1160o3.a(((C1020e3) Q.getValue()).getA(), ((C1020e3) Q.getValue()).getD(), function1, oq5Var3, 0);
        k5r.s(oq5Var3, false, true, false, false);
        u1g.l(oq5Var3, androidx.compose.foundation.layout.d.e(vciVar, u7g.E(R.dimen.space_small_3, oq5Var3)));
        yci e2 = androidx.compose.foundation.layout.d.e(vciVar, 64 + 18);
        iz2 iz2Var = b2c.c;
        oq5Var3.a0(733328855);
        wg3 e3 = ug3.e(iz2Var, false, oq5Var3, 6);
        oq5Var3.a0(-1323940314);
        int i3 = oq5Var3.P;
        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
        wn5 A2 = ghh.A(e2);
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        Function2 a4 = Lb.a(wp5Var, oq5Var3, e3, oq5Var3, l2);
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
            Mb.a(i3, oq5Var3, i3, a4);
        }
        ouj.z(oq5Var3, 0, A2, oq5Var3, 2058660585);
        int ordinal = ((C1020e3) Q.getValue()).getB().ordinal();
        if (ordinal == 0) {
            z = true;
            oq5Var3.a0(1264906610);
            oq5Var3.p(false);
        } else if (ordinal == 1) {
            z = true;
            oq5Var3.a0(1264210970);
            xcs.b(rvf.M(R.string.input_screen_checking_hint_text, oq5Var3), null, C1210rc.a(oq5Var3, 0).h(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var3, 0).getI(), oq5Var3, 0, 0, 65018);
            oq5Var3 = oq5Var3;
            oq5Var3.p(false);
        } else if (ordinal != 2) {
            oq5Var3.a0(1264918452);
            oq5Var3.p(false);
            z = true;
        } else {
            oq5Var3.a0(1264562262);
            z = true;
            xcs.b(rvf.M(R.string.input_screen_error_hint_text, oq5Var3), null, C1210rc.a(oq5Var3, 0).b(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var3, 0).getI(), oq5Var3, 0, 0, 65018);
            oq5Var3 = oq5Var3;
            oq5Var3.p(false);
        }
        k5r.s(oq5Var3, false, z, false, false);
        Unit unit = Unit.a;
        oq5Var3.a0(-840162608);
        Object K2 = oq5Var3.K();
        if (K2 == kjnVar) {
            K2 = new a(yocVar, null);
            oq5Var3.k0(K2);
        }
        oq5Var3.p(false);
        gld.w(oq5Var3, unit, (Function2) K2);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((ua5) obj, (hq5) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
