package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.agr;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.c3x;
import defpackage.d85;
import defpackage.es5;
import defpackage.etn;
import defpackage.f3r;
import defpackage.fcf;
import defpackage.fk0;
import defpackage.gcf;
import defpackage.ges;
import defpackage.ghh;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.ild;
import defpackage.iz2;
import defpackage.k5r;
import defpackage.kjn;
import defpackage.ma5;
import defpackage.nv2;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pa5;
import defpackage.pyc;
import defpackage.qs5;
import defpackage.rvf;
import defpackage.sb6;
import defpackage.szf;
import defpackage.uas;
import defpackage.ug3;
import defpackage.ugo;
import defpackage.uif;
import defpackage.vci;
import defpackage.vje;
import defpackage.vnj;
import defpackage.vq2;
import defpackage.weo;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xof;
import defpackage.xp5;
import defpackage.xv;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1160o3 {

    @NotNull
    public static final vje a;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o3$a */
    public static final class a extends uif implements pyc {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(3);
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            hq5 hq5Var = (hq5) obj2;
            int intValue = ((Number) obj3).intValue();
            ((Function2) obj).getClass();
            if ((intValue & 17) == 16) {
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.z()) {
                    oq5Var.S();
                    return Unit.a;
                }
            }
            etn.l(es5.n.a(xof.a), ild.s(hq5Var, -1891072338, new C1146n3(this.a, this.b)), hq5Var, 56);
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o3$b */
    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Function1<String, Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, int i, Function1<? super String, Unit> function1, int i2) {
            super(2);
            this.a = str;
            this.b = i;
            this.c = function1;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C1160o3.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.o3$c */
    public static final class c extends uif implements Function1<fcf, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            fcf fcfVar = (fcf) obj;
            fcfVar.getClass();
            fcfVar.a = 1000;
            Float valueOf = Float.valueOf(1.0f);
            fcfVar.a(valueOf, 0);
            fcfVar.a(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            fcfVar.a(valueOf2, 500);
            fcfVar.a(valueOf2, 999);
            return Unit.a;
        }
    }

    static {
        c cVar = c.a;
        fcf fcfVar = new fcf();
        cVar.invoke(fcfVar);
        a = weo.C(new gcf(fcfVar), null, 0L, 6);
    }

    public static final void a(@NotNull String str, int i, @NotNull Function1<? super String, Unit> function1, hq5 hq5Var, int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        str.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1333646664);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function12 = function1;
        } else {
            uas uasVar = uas.a;
            long j = ((d85) C1210rc.a(oq5Var, 0).m.getValue()).a;
            long j2 = ((d85) C1210rc.a(oq5Var, 0).D.getValue()).a;
            long j3 = ((d85) C1210rc.a(oq5Var, 0).w.getValue()).a;
            qs5 qs5Var = sb6.a;
            long j4 = ((d85) oq5Var.j(qs5Var)).a;
            agr agrVar = pa5.a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j4);
            } else {
                c3x.N(j4);
            }
            d85.b(j, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            ((ma5) oq5Var.j(agrVar)).b();
            long d = ((ma5) oq5Var.j(agrVar)).d();
            long j5 = ((d85) oq5Var.j(qs5Var)).a;
            d85.b(d, (!((ma5) oq5Var.j(agrVar)).g() ? ((double) c3x.N(j5)) < 0.5d : ((double) c3x.N(j5)) > 0.5d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
            long b2 = d85.b(((ma5) oq5Var.j(agrVar)).c(), 0.42f, 0.0f, 0.0f, 0.0f, 14);
            long j6 = ((d85) oq5Var.j(qs5Var)).a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j6);
            } else {
                c3x.N(j6);
            }
            d85.b(b2, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            ((ma5) oq5Var.j(agrVar)).b();
            long b3 = d85.b(((ma5) oq5Var.j(agrVar)).c(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
            long j7 = ((d85) oq5Var.j(qs5Var)).a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j7);
            } else {
                c3x.N(j7);
            }
            d85.b(b3, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            long b4 = d85.b(((ma5) oq5Var.j(agrVar)).c(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
            long j8 = ((d85) oq5Var.j(qs5Var)).a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j8);
            } else {
                c3x.N(j8);
            }
            d85.b(b4, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            ((ma5) oq5Var.j(agrVar)).b();
            long d2 = ((ma5) oq5Var.j(agrVar)).d();
            long j9 = ((d85) oq5Var.j(qs5Var)).a;
            d85.b(d2, (!((ma5) oq5Var.j(agrVar)).g() ? ((double) c3x.N(j9)) < 0.5d : ((double) c3x.N(j9)) > 0.5d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
            long c2 = ((ma5) oq5Var.j(agrVar)).c();
            long j10 = ((d85) oq5Var.j(qs5Var)).a;
            long b5 = d85.b(c2, (!((ma5) oq5Var.j(agrVar)).g() ? ((double) c3x.N(j10)) < 0.5d : ((double) c3x.N(j10)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
            long j11 = ((d85) oq5Var.j(qs5Var)).a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j11);
            } else {
                c3x.N(j11);
            }
            d85.b(b5, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            ((ma5) oq5Var.j(agrVar)).b();
            long c3 = ((ma5) oq5Var.j(agrVar)).c();
            long j12 = ((d85) oq5Var.j(qs5Var)).a;
            long b6 = d85.b(c3, (!((ma5) oq5Var.j(agrVar)).g() ? ((double) c3x.N(j12)) < 0.5d : ((double) c3x.N(j12)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
            long j13 = ((d85) oq5Var.j(qs5Var)).a;
            if (((ma5) oq5Var.j(agrVar)).g()) {
                c3x.N(j13);
            } else {
                c3x.N(j13);
            }
            d85.b(b6, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            ges gesVar = C1210rc.b(oq5Var, 0).c;
            oq5Var.Z(-1446422485);
            aqi o0 = szf.o0(new d85(j2), oq5Var);
            oq5Var.p(false);
            function12 = function1;
            nv2.b(str, function12, null, false, gesVar, null, null, false, 0, 0, null, null, null, new f3r(((d85) o0.getValue()).a), ild.s(oq5Var, 138634094, new a(str, i)), oq5Var, (i3 & 14) | ((i3 >> 3) & 112), 196608, 16348);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b(str, i, function12, i2);
        }
    }

    public static final void a(char c2, vci vciVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        vci vciVar2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1430517146);
        if ((i & 6) == 0) {
            Object C = oq5Var.C();
            if ((C instanceof Character) && c2 == ((Character) C).charValue()) {
                i3 = 2;
            } else {
                oq5Var.l0(Character.valueOf(c2));
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            vciVar2 = vciVar;
        } else {
            vci vciVar3 = vci.a;
            yci b2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.o(vciVar3, 64, 72), ((d85) C1210rc.a(oq5Var, 0).w.getValue()).a, ugo.a(8));
            iz2 iz2Var = b2c.f;
            oq5Var.a0(733328855);
            wg3 e = ug3.e(iz2Var, false, oq5Var, 6);
            oq5Var.a0(-1323940314);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a2 = Lb.a(wp5Var, oq5Var, e, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                Mb.a(i5, oq5Var, i5, a2);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            xcs.b(String.valueOf(c2), null, ((d85) C1210rc.a(oq5Var, 0).m.getValue()).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).c, oq5Var, 0, 0, 65530);
            oq5Var = oq5Var;
            oq5Var.a0(-1980033296);
            if (z) {
                oq5Var.a0(-1980032106);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = vq2.a(1.0f);
                    oq5Var.k0(K);
                }
                fk0 fk0Var = (fk0) K;
                oq5Var.p(false);
                Unit unit = Unit.a;
                oq5Var.a0(-1980030064);
                boolean h = oq5Var.h(fk0Var);
                Object K2 = oq5Var.K();
                if (h || K2 == kjnVar) {
                    K2 = new C1118l3(fk0Var, null);
                    oq5Var.k0(K2);
                }
                oq5Var.p(false);
                gld.w(oq5Var, unit, (Function2) K2);
                vciVar2 = vciVar3;
                ug3.a(androidx.compose.foundation.a.b(xv.z(androidx.compose.foundation.layout.d.o(vciVar2, 2, 36), ((Number) fk0Var.e()).floatValue()), ((d85) C1210rc.a(oq5Var, 0).m.getValue()).a, vnj.i), oq5Var, 0);
            } else {
                vciVar2 = vciVar3;
            }
            k5r.s(oq5Var, false, false, true, false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1132m3(c2, vciVar2, z, i);
        }
    }
}
