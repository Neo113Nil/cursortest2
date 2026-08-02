package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.b6e;
import defpackage.bl3;
import defpackage.d85;
import defpackage.hq5;
import defpackage.lk7;
import defpackage.o0k;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.tgo;
import defpackage.u7g;
import defpackage.ugo;
import defpackage.vnj;
import defpackage.xee;
import defpackage.xmn;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1129m0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0989c0 {
    public static final int a = R.dimen.button_corner_radius;

    public static final void a(@NotNull Function0 function0, @NotNull InterfaceC1129m0 interfaceC1129m0, @NotNull EnumC1087j0 enumC1087j0, @NotNull yci yciVar, o0k o0kVar, @NotNull sn5 sn5Var, hq5 hq5Var, int i) {
        int i2;
        EnumC1087j0 enumC1087j02;
        float f;
        yci yciVar2;
        long a2;
        long j;
        long b;
        oq5 oq5Var;
        int i3;
        function0.getClass();
        interfaceC1129m0.getClass();
        enumC1087j0.getClass();
        yciVar.getClass();
        sn5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-976772588);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(interfaceC1129m0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            enumC1087j02 = enumC1087j0;
            i2 |= oq5Var2.f(enumC1087j02) ? 256 : 128;
        } else {
            enumC1087j02 = enumC1087j0;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(sn5Var) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci q = vnj.q(yciVar, new Y(interfaceC1129m0));
            int ordinal = enumC1087j02.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 = 40;
                } else if (ordinal == 2) {
                    i3 = 44;
                } else if (ordinal == 3) {
                    i3 = 48;
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return;
                    }
                    i3 = 52;
                }
                f = i3;
            } else {
                f = 32;
            }
            yci h = androidx.compose.foundation.layout.d.h(q, f);
            float f2 = 0;
            boolean z = true;
            lk7 b2 = bl3.b(f2, f2, f2, f2, f2, oq5Var2, 28086, 0);
            tgo a3 = ugo.a(u7g.E(a, oq5Var2));
            int i4 = i2 >> 3;
            int i5 = i4 & 14;
            long a4 = a(interfaceC1129m0, oq5Var2, i5);
            long b3 = b(interfaceC1129m0, oq5Var2, i5);
            InterfaceC1129m0.g gVar = InterfaceC1129m0.g.a;
            if (interfaceC1129m0.equals(gVar) ? true : interfaceC1129m0.equals(InterfaceC1129m0.a.a)) {
                oq5Var2.a0(-1664353878);
                yciVar2 = h;
                a2 = ((d85) ((Vb) oq5Var2.j(Wb.a)).b.getValue()).a;
                oq5Var2.p(false);
            } else {
                yciVar2 = h;
                oq5Var2.a0(-1664352900);
                a2 = a(interfaceC1129m0, oq5Var2, i5);
                oq5Var2.p(false);
            }
            if (!interfaceC1129m0.equals(gVar)) {
                z = interfaceC1129m0.equals(InterfaceC1129m0.a.a);
            }
            if (z) {
                oq5Var2.a0(885652809);
                j = a2;
                b = ((d85) ((Vb) oq5Var2.j(Wb.a)).m.getValue()).a;
                oq5Var2.p(false);
            } else {
                j = a2;
                oq5Var2.a0(885653598);
                b = b(interfaceC1129m0, oq5Var2, i5);
                oq5Var2.p(false);
            }
            long j2 = j;
            oq5Var = oq5Var2;
            int i6 = i2 << 9;
            xee.d(function0, yciVar2, true, b2, a3, bl3.a(a4, b3, j2, d85.b(b, 0.2f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 0, 0), o0kVar, sn5Var, oq5Var, (i4 & 896) | (i2 & 14) | (234881024 & i6) | (i6 & 1879048192), 72);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new U(function0, interfaceC1129m0, enumC1087j02, yciVar, o0kVar, sn5Var, i);
        }
    }

    public static final long b(InterfaceC1129m0 interfaceC1129m0, hq5 hq5Var, int i) {
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.g.a)) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.a0(344251822);
            long j = ((d85) ((Vb) oq5Var.j(Wb.a)).Q.getValue()).a;
            oq5Var.p(false);
            return j;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.a.a)) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.a0(344253614);
            long j2 = ((d85) ((Vb) oq5Var2.j(Wb.a)).Q.getValue()).a;
            oq5Var2.p(false);
            return j2;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.h.a)) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.a0(344255437);
            long j3 = ((d85) ((Vb) oq5Var3.j(Wb.a)).m.getValue()).a;
            oq5Var3.p(false);
            return j3;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.i.a)) {
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.a0(344257422);
            long j4 = ((d85) ((Vb) oq5Var4.j(Wb.a)).Q.getValue()).a;
            oq5Var4.p(false);
            return j4;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.j.a)) {
            oq5 oq5Var5 = (oq5) hq5Var;
            oq5Var5.a0(344259309);
            long j5 = ((d85) ((Vb) oq5Var5.j(Wb.a)).m.getValue()).a;
            oq5Var5.p(false);
            return j5;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.f.a)) {
            oq5 oq5Var6 = (oq5) hq5Var;
            oq5Var6.a0(344261037);
            long j6 = ((d85) ((Vb) oq5Var6.j(Wb.a)).m.getValue()).a;
            oq5Var6.p(false);
            return j6;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.e.a)) {
            oq5 oq5Var7 = (oq5) hq5Var;
            oq5Var7.a0(344262869);
            long j7 = ((d85) ((Vb) oq5Var7.j(Wb.a)).n.getValue()).a;
            oq5Var7.p(false);
            return j7;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.c.a)) {
            oq5 oq5Var8 = (oq5) hq5Var;
            oq5Var8.a0(344264941);
            long j8 = ((d85) ((Vb) oq5Var8.j(Wb.a)).m.getValue()).a;
            oq5Var8.p(false);
            return j8;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.d.a)) {
            oq5 oq5Var9 = (oq5) hq5Var;
            oq5Var9.a0(344266765);
            long j9 = ((d85) ((Vb) oq5Var9.j(Wb.a)).m.getValue()).a;
            oq5Var9.p(false);
            return j9;
        }
        if (interfaceC1129m0 instanceof InterfaceC1129m0.b) {
            oq5 oq5Var10 = (oq5) hq5Var;
            oq5Var10.a0(344268210);
            oq5Var10.p(false);
            return ((InterfaceC1129m0.b) interfaceC1129m0).a;
        }
        oq5 oq5Var11 = (oq5) hq5Var;
        oq5Var11.a0(344150630);
        oq5Var11.p(false);
        b6e.s();
        return 0L;
    }

    public static final long a(InterfaceC1129m0 interfaceC1129m0, hq5 hq5Var, int i) {
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.g.a)) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.a0(-1978098652);
            oq5Var.p(false);
            return d85.m;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.a.a)) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.a0(-1978097148);
            oq5Var2.p(false);
            return d85.m;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.h.a)) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.a0(-1978095226);
            long j = ((d85) ((Vb) oq5Var3.j(Wb.a)).b.getValue()).a;
            oq5Var3.p(false);
            return j;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.i.a)) {
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.a0(-1978093053);
            long j2 = ((d85) ((Vb) oq5Var4.j(Wb.a)).Y.getValue()).a;
            oq5Var4.p(false);
            return j2;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.j.a)) {
            oq5 oq5Var5 = (oq5) hq5Var;
            oq5Var5.a0(-1978091096);
            long j3 = ((d85) ((Vb) oq5Var5.j(Wb.a)).c.getValue()).a;
            oq5Var5.p(false);
            return j3;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.f.a)) {
            oq5 oq5Var6 = (oq5) hq5Var;
            oq5Var6.a0(-1978089500);
            oq5Var6.p(false);
            return d85.m;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.e.a)) {
            oq5 oq5Var7 = (oq5) hq5Var;
            oq5Var7.a0(-1978087545);
            long j4 = ((d85) ((Vb) oq5Var7.j(Wb.a)).e.getValue()).a;
            oq5Var7.p(false);
            return j4;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.c.a)) {
            oq5 oq5Var8 = (oq5) hq5Var;
            oq5Var8.a0(-1978085497);
            long j5 = ((d85) ((Vb) oq5Var8.j(Wb.a)).d.getValue()).a;
            oq5Var8.p(false);
            return j5;
        }
        if (Intrinsics.d(interfaceC1129m0, InterfaceC1129m0.d.a)) {
            oq5 oq5Var9 = (oq5) hq5Var;
            oq5Var9.a0(-1978083449);
            long j6 = ((d85) ((Vb) oq5Var9.j(Wb.a)).f.getValue()).a;
            oq5Var9.p(false);
            return j6;
        }
        if (interfaceC1129m0 instanceof InterfaceC1129m0.b) {
            oq5 oq5Var10 = (oq5) hq5Var;
            oq5Var10.a0(-1978081784);
            oq5Var10.p(false);
            return ((InterfaceC1129m0.b) interfaceC1129m0).b;
        }
        oq5 oq5Var11 = (oq5) hq5Var;
        oq5Var11.a0(-1978177191);
        oq5Var11.p(false);
        b6e.s();
        return 0L;
    }
}
