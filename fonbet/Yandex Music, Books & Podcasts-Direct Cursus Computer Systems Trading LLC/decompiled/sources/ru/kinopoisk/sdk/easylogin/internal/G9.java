package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.b2c;
import defpackage.ghh;
import defpackage.grb;
import defpackage.hq5;
import defpackage.ild;
import defpackage.iz2;
import defpackage.k5r;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.rvf;
import defpackage.u7g;
import defpackage.ug3;
import defpackage.uif;
import defpackage.vci;
import defpackage.wg3;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;
import ru.kinopoisk.sdk.easylogin.internal.Kb;

/* loaded from: classes5.dex */
public final class G9 {

    public static final class a extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ nbt b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, nbt nbtVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            super(2);
            this.a = z;
            this.b = nbtVar;
            this.c = function0;
            this.d = function02;
            this.e = function03;
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
            Qb.a(null, false, false, 0L, 0L, 0L, 0L, 0.0f, 0.0f, null, null, new Kb.b(8, null), null, ild.s(hq5Var, -1050958539, new F9(this.a, this.b, this.c, this.d, this.e)), hq5Var, 384, 24576, 12283);
            return Unit.a;
        }
    }

    public static final class b extends uif implements Function2<hq5, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ nbt b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, nbt nbtVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.a = z;
            this.b = nbtVar;
            this.c = function0;
            this.d = function02;
            this.e = function03;
            this.f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            G9.a(this.a, this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
            return Unit.a;
        }
    }

    public static final void a(boolean z, nbt nbtVar, vci vciVar, Function0 function0, Function0 function02, Function0 function03, hq5 hq5Var, int i) {
        int i2;
        vci vciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1159618160);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            vciVar2 = vciVar;
        } else {
            float E = u7g.E(R.dimen.space_medium_2, oq5Var);
            vci vciVar3 = vci.a;
            yci d = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.q(vciVar3, E, 0.0f, E, E, 2), 1.0f);
            iz2 iz2Var = b2c.f;
            oq5Var.a0(733328855);
            wg3 e = ug3.e(iz2Var, false, oq5Var, 6);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            wp5 wp5Var = xp5.T;
            wp5Var.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            Function2 a2 = Lb.a(wp5Var, oq5Var, e, oq5Var, l);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                Mb.a(i4, oq5Var, i4, a2);
            }
            ouj.z(oq5Var, 0, A, oq5Var, 2058660585);
            if (z) {
                oq5Var.a0(901967518);
                A9.a(nbtVar, vciVar3, function0, function02, function03, oq5Var, (i3 >> 3) & 65534, 0);
                oq5Var.p(false);
            } else {
                oq5Var.a0(902284679);
                U9.a(nbtVar, vciVar3, function0, function02, function03, oq5Var, (i3 >> 3) & 65534, 0);
                oq5Var.p(false);
            }
            k5r.s(oq5Var, false, true, false, false);
            vciVar2 = vciVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new E9(z, nbtVar, vciVar2, function0, function02, function03, i);
        }
    }

    public static final void a(boolean z, @NotNull nbt nbtVar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        nbt nbtVar2;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        nbtVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1120249717);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
            nbtVar2 = nbtVar;
            function04 = function0;
            function05 = function02;
            function06 = function03;
        } else {
            z2 = z;
            nbtVar2 = nbtVar;
            function04 = function0;
            function05 = function02;
            function06 = function03;
            C1029ec.a(N4.Redesigned, ild.s(oq5Var, 1688283661, new a(z2, nbtVar2, function04, function05, function06)), oq5Var, 54);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            Function0<Unit> function07 = function06;
            Function0<Unit> function08 = function05;
            r.d = new b(z2, nbtVar2, function04, function08, function07, i);
        }
    }
}
