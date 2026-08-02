package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.b2c;
import defpackage.ges;
import defpackage.ghh;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.hxe;
import defpackage.k5r;
import defpackage.lho;
import defpackage.lx0;
import defpackage.nbt;
import defpackage.nho;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qme;
import defpackage.qx0;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.u7g;
import defpackage.vci;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xcs;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* loaded from: classes5.dex */
public final class A9 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull nbt nbtVar, vci vciVar, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function0 function03, hq5 hq5Var, int i, int i2) {
        int i3;
        vci vciVar2;
        Function0 function04;
        boolean a;
        int i4;
        ges j;
        int i5;
        xmn r;
        nbtVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1691269725);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(nbtVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            vciVar2 = vciVar;
            i3 |= oq5Var.f(vciVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                function04 = function0;
                i3 |= oq5Var.h(function04) ? 256 : 128;
            } else {
                function04 = function0;
            }
            if ((i & 3072) == 0) {
                i3 |= oq5Var.h(function02) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                vci vciVar3 = vci.a;
                if (i6 != 0) {
                    vciVar2 = vciVar3;
                }
                a = B8.a((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
                yci t = androidx.compose.foundation.layout.d.t(vciVar2, 0.0f, 380, 1);
                gz2 gz2Var = b2c.o;
                oq5Var.a0(-483455358);
                ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                oq5Var.a0(-1323940314);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                wp5 wp5Var = xp5.T;
                wp5Var.getClass();
                grb grbVar = wp5.b;
                wn5 A = ghh.A(t);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                Function2 a3 = Lb.a(wp5Var, oq5Var, a2, oq5Var, l);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    Mb.a(i4, oq5Var, i4, a3);
                }
                ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
                String M = rvf.M(R.string.continue_connection_screen_title, oq5Var);
                if (a) {
                    oq5Var.a0(-999310469);
                    j = C1210rc.b(oq5Var, 0).getJ();
                    oq5Var.p(false);
                } else {
                    oq5Var.a0(-999380870);
                    j = C1210rc.b(oq5Var, 0).getM();
                    oq5Var.p(false);
                }
                int i7 = i3;
                xcs.b(M, null, C1210rc.a(oq5Var, 0).f(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j, oq5Var, 0, 0, 65018);
                u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar3, u7g.E(R.dimen.space_small_3, oq5Var)));
                xcs.b(rvf.M(nbtVar.v(), oq5Var), null, C1210rc.a(oq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getA(), oq5Var, 0, 0, 65018);
                oq5Var = oq5Var;
                u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar3, u7g.E(R.dimen.space_medium_3, oq5Var)));
                yci r2 = androidx.compose.foundation.layout.a.r(vciVar3, hxe.a);
                lx0 lx0Var = qx0.e;
                oq5Var.a0(693286680);
                nho a4 = lho.a(lx0Var, b2c.k, oq5Var, 6);
                oq5Var.a0(-1323940314);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                wn5 A2 = ghh.A(r2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                Function2 a5 = Lb.a(wp5Var, oq5Var, a4, oq5Var, l2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    Mb.a(i5, oq5Var, i5, a5);
                }
                ouj.z(oq5Var, 0, A2, oq5Var, 2058660585);
                float f = 141;
                yci t2 = androidx.compose.foundation.layout.d.t(vciVar3, f, 0.0f, 2);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci f2 = t2.f(new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
                InterfaceC1129m0.e eVar = InterfaceC1129m0.e.a;
                EnumC1087j0 enumC1087j0 = EnumC1087j0.ExtraLarge;
                C1155nc.a(function04, f2, eVar, enumC1087j0, false, C1158o1.a(), oq5Var, ((i7 >> 6) & 14) | 200064, 16);
                u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar3, u7g.E(R.dimen.space_small_3, oq5Var)));
                yci t3 = androidx.compose.foundation.layout.d.t(vciVar3, f, 0.0f, 2);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                C1155nc.a(function02, t3.f(new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f)), InterfaceC1129m0.h.a, enumC1087j0, false, C1158o1.b(), oq5Var, ((i7 >> 9) & 14) | 200064, 16);
                k5r.s(oq5Var, false, true, false, false);
                u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar3, u7g.E(R.dimen.space_medium_1, oq5Var)));
                C1155nc.a(function03, null, InterfaceC1129m0.f.a, enumC1087j0, false, C1158o1.c(), oq5Var, ((i7 >> 12) & 14) | 200064, 18);
                k5r.s(oq5Var, false, true, false, false);
            } else {
                oq5Var.S();
            }
            vci vciVar4 = vciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new C1314z9(nbtVar, vciVar4, function0, function02, function03, i, i2);
                return;
            }
            return;
        }
        vciVar2 = vciVar;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        vci vciVar32 = vci.a;
        if (i6 != 0) {
        }
        a = B8.a((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
        yci t4 = androidx.compose.foundation.layout.d.t(vciVar2, 0.0f, 380, 1);
        gz2 gz2Var2 = b2c.o;
        oq5Var.a0(-483455358);
        ta5 a22 = sa5.a(qx0.c, gz2Var2, oq5Var, 48);
        oq5Var.a0(-1323940314);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        wp5 wp5Var2 = xp5.T;
        wp5Var2.getClass();
        grb grbVar2 = wp5.b;
        wn5 A3 = ghh.A(t4);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        Function2 a32 = Lb.a(wp5Var2, oq5Var, a22, oq5Var, l3);
        if (!oq5Var.O) {
        }
        Mb.a(i4, oq5Var, i4, a32);
        ouj.z(oq5Var, 0, A3, oq5Var, 2058660585);
        String M2 = rvf.M(R.string.continue_connection_screen_title, oq5Var);
        if (a) {
        }
        int i72 = i3;
        xcs.b(M2, null, C1210rc.a(oq5Var, 0).f(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j, oq5Var, 0, 0, 65018);
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar32, u7g.E(R.dimen.space_small_3, oq5Var)));
        xcs.b(rvf.M(nbtVar.v(), oq5Var), null, C1210rc.a(oq5Var, 0).d(), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, C1210rc.b(oq5Var, 0).getA(), oq5Var, 0, 0, 65018);
        oq5Var = oq5Var;
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar32, u7g.E(R.dimen.space_medium_3, oq5Var)));
        yci r22 = androidx.compose.foundation.layout.a.r(vciVar32, hxe.a);
        lx0 lx0Var2 = qx0.e;
        oq5Var.a0(693286680);
        nho a42 = lho.a(lx0Var2, b2c.k, oq5Var, 6);
        oq5Var.a0(-1323940314);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        wn5 A22 = ghh.A(r22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        Function2 a52 = Lb.a(wp5Var2, oq5Var, a42, oq5Var, l22);
        if (!oq5Var.O) {
        }
        Mb.a(i5, oq5Var, i5, a52);
        ouj.z(oq5Var, 0, A22, oq5Var, 2058660585);
        float f3 = 141;
        yci t22 = androidx.compose.foundation.layout.d.t(vciVar32, f3, 0.0f, 2);
        if (1.0f <= 0.0d) {
        }
        yci f22 = t22.f(new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
        InterfaceC1129m0.e eVar2 = InterfaceC1129m0.e.a;
        EnumC1087j0 enumC1087j02 = EnumC1087j0.ExtraLarge;
        C1155nc.a(function04, f22, eVar2, enumC1087j02, false, C1158o1.a(), oq5Var, ((i72 >> 6) & 14) | 200064, 16);
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.r(vciVar32, u7g.E(R.dimen.space_small_3, oq5Var)));
        yci t32 = androidx.compose.foundation.layout.d.t(vciVar32, f3, 0.0f, 2);
        if (1.0f <= 0.0d) {
        }
        C1155nc.a(function02, t32.f(new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f)), InterfaceC1129m0.h.a, enumC1087j02, false, C1158o1.b(), oq5Var, ((i72 >> 9) & 14) | 200064, 16);
        k5r.s(oq5Var, false, true, false, false);
        u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar32, u7g.E(R.dimen.space_medium_1, oq5Var)));
        C1155nc.a(function03, null, InterfaceC1129m0.f.a, enumC1087j02, false, C1158o1.c(), oq5Var, ((i72 >> 12) & 14) | 200064, 18);
        k5r.s(oq5Var, false, true, false, false);
        vci vciVar42 = vciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
