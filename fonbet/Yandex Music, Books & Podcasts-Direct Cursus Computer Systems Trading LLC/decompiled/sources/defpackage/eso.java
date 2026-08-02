package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class eso {
    public static final agr a = new agr(xuj.y0);
    public static final float b = 16;

    public static final void a(yci yciVar, hso hsoVar, wn5 wn5Var, Function2 function2, pyc pycVar, Function2 function22, int i, boolean z, dup dupVar, float f, long j, long j2, long j3, long j4, long j5, wn5 wn5Var2, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        hso hsoVar2;
        Function2 function23;
        pyc pycVar2;
        Function2 function24;
        int i3;
        boolean z2;
        dup dupVar2;
        float f2;
        long j6;
        long j7;
        long j8;
        long f3;
        long b2;
        int i4;
        hso hsoVar3;
        dup dupVar3;
        Function2 function25;
        pyc pycVar3;
        float f4;
        int i5;
        boolean z3;
        int i6;
        Function2 function26;
        long b3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1037492569);
        int i7 = i2 | (oq5Var2.f(yciVar) ? 4 : 2) | 920349712;
        int i8 = (oq5Var2.e(j4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | 12592306 | (oq5Var2.e(j5) ? 1048576 : 524288);
        if (oq5Var2.P(i7 & 1, ((306783379 & i7) == 306783378 && (4793491 & i8) == 4793490) ? false : true)) {
            oq5Var2.U();
            if ((i2 & 1) == 0 || oq5Var2.y()) {
                eqa eqaVar = eqa.a;
                dqa a2 = cqa.a(oq5Var2);
                Object K = oq5Var2.K();
                Object obj = gq5.a;
                if (K == obj) {
                    K = new i1r();
                    oq5Var2.k0(K);
                }
                i1r i1rVar = (i1r) K;
                Object K2 = oq5Var2.K();
                if (K2 == obj) {
                    K2 = new hso(a2, i1rVar);
                    oq5Var2.k0(K2);
                }
                hso hsoVar4 = (hso) K2;
                wn5 wn5Var3 = so5.a;
                wn5 wn5Var4 = so5.b;
                wn5 wn5Var5 = so5.c;
                tgo tgoVar = ((ivp) oq5Var2.j(kvp.a)).c;
                float f5 = bqa.a;
                f3 = ((ma5) oq5Var2.j(pa5.a)).f();
                b2 = pa5.b(f3, oq5Var2);
                i4 = i7 & (-113);
                hsoVar3 = hsoVar4;
                dupVar3 = tgoVar;
                function25 = wn5Var3;
                pycVar3 = wn5Var4;
                f4 = f5;
                i5 = 2;
                z3 = true;
                i6 = i8 & (-65423);
                function26 = wn5Var5;
                b3 = d85.b(((ma5) oq5Var2.j(pa5.a)).c(), 0.32f, 0.0f, 0.0f, 0.0f, 14);
            } else {
                oq5Var2.S();
                int i9 = i8 & (-65423);
                function25 = function2;
                pycVar3 = pycVar;
                function26 = function22;
                i5 = i;
                z3 = z;
                dupVar3 = dupVar;
                f4 = f;
                f3 = j;
                b2 = j2;
                b3 = j3;
                i6 = i9;
                i4 = i7 & (-113);
                hsoVar3 = hsoVar;
            }
            oq5Var2.q();
            int i10 = (i4 << 3) & 2147483632;
            int i11 = i6 << 3;
            oq5Var = oq5Var2;
            long j9 = f3;
            long j10 = b2;
            b(p6g.l(0), yciVar, hsoVar3, wn5Var, function25, pycVar3, function26, i5, z3, dupVar3, f4, j9, j10, b3, j4, j5, wn5Var2, oq5Var, i10, (i11 & 29360128) | 390 | (3670016 & i11) | 100663296);
            j8 = b3;
            j7 = j10;
            j6 = j9;
            dupVar2 = dupVar3;
            f2 = f4;
            i3 = i5;
            z2 = z3;
            pycVar2 = pycVar3;
            function24 = function26;
            function23 = function25;
            hsoVar2 = hsoVar3;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            hsoVar2 = hsoVar;
            function23 = function2;
            pycVar2 = pycVar;
            function24 = function22;
            i3 = i;
            z2 = z;
            dupVar2 = dupVar;
            f2 = f;
            j6 = j;
            j7 = j2;
            j8 = j3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zro(yciVar, hsoVar2, wn5Var, function23, pycVar2, function24, i3, z2, dupVar2, f2, j6, j7, j8, j4, j5, wn5Var2, i2);
        }
    }

    public static final void b(ufc ufcVar, yci yciVar, hso hsoVar, wn5 wn5Var, Function2 function2, pyc pycVar, Function2 function22, int i, boolean z, dup dupVar, float f, long j, long j2, long j3, long j4, long j5, wn5 wn5Var2, hq5 hq5Var, int i2, int i3) {
        int i4;
        wn5 wn5Var3;
        int i5;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1288630565);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(ufcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(hsoVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wn5Var3 = wn5Var;
            i4 |= oq5Var2.h(wn5Var3) ? 2048 : 1024;
        } else {
            wn5Var3 = wn5Var;
        }
        int i6 = i2 & 24576;
        int i7 = RemoteCameraConfig.Notification.ID;
        if (i6 == 0) {
            i4 |= oq5Var2.h(function2) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i8 == 0) {
            i4 |= oq5Var2.h(pycVar) ? 131072 : 65536;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i4 |= oq5Var2.h(function22) ? 1048576 : 524288;
        }
        int i10 = i2 & 12582912;
        int i11 = RemoteCameraConfig.Camera.BITRATE;
        if (i10 == 0) {
            i4 |= oq5Var2.d(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= oq5Var2.g(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= oq5Var2.h(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i12 = i4;
        if ((i3 & 6) == 0) {
            i5 = (oq5Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.f(dupVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var2.c(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if (oq5Var2.e(j2)) {
                i7 = 16384;
            }
            i5 |= i7;
        }
        if ((i3 & 196608) == 0) {
            if (oq5Var2.e(j3)) {
                i9 = 131072;
            }
            i5 |= i9;
        }
        if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var2.e(j4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            if (oq5Var2.e(j5)) {
                i11 = 8388608;
            }
            i5 |= i11;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= oq5Var2.h(wn5Var2) ? 67108864 : 33554432;
        }
        if (oq5Var2.P(i12 & 1, ((i12 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            boolean z2 = (i12 & 14) == 4;
            Object K = oq5Var2.K();
            if (z2 || K == gq5.a) {
                K = new gqi(ufcVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            wn5 C = ild.C(-219833176, new aso((gqi) K, ufcVar, j4, j5, i, wn5Var3, wn5Var2, function22, function2, pycVar, hsoVar), oq5Var);
            oq5Var.Z(652256007);
            yciVar2 = yciVar;
            C.invoke(yciVar2, oq5Var, Integer.valueOf(((i12 >> 3) & 14) | 48));
            oq5Var.p(false);
        } else {
            oq5Var = oq5Var2;
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yro(ufcVar, yciVar2, hsoVar, wn5Var, function2, pycVar, function22, i, z, dupVar, f, j, j2, j3, j4, j5, wn5Var2, i2, i3);
        }
    }

    public static final void c(int i, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, Function2 function2, opv opvVar, Function2 function22, hq5 hq5Var, int i2) {
        int i3;
        wn5 wn5Var4;
        Function2 function23;
        opv opvVar2;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-468424875);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(false) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wn5Var4 = wn5Var2;
            i3 |= oq5Var.h(wn5Var4) ? 2048 : 1024;
        } else {
            wn5Var4 = wn5Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            function23 = function2;
            i3 |= oq5Var.h(function23) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function23 = function2;
        }
        if ((1572864 & i2) == 0) {
            opvVar2 = opvVar;
            i3 |= oq5Var.f(opvVar2) ? 1048576 : 524288;
        } else {
            opvVar2 = opvVar;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= oq5Var.h(function22) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var.P(i3 & 1, (i3 & 4793491) != 4793490)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new dso();
                oq5Var.k0(K);
            }
            dso dsoVar = (dso) K;
            boolean z = ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608);
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                i4 = 1;
                rl0 rl0Var = new rl0(wn5Var, wn5Var3, function23, i, opvVar2, dsoVar, function22, wn5Var4);
                oq5Var.k0(rl0Var);
                K2 = rl0Var;
            } else {
                i4 = 1;
            }
            u2x.p(null, (Function2) K2, oq5Var, 0, i4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cso(i, wn5Var, wn5Var2, wn5Var3, function2, opvVar, function22, i2);
        }
    }
}
