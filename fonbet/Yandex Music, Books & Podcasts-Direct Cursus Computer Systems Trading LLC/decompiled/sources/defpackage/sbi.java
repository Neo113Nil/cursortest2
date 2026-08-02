package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class sbi {
    public static final float a = 48;
    public static final float b = 24;
    public static final long c = v5g.g(0.5f, 0.0f);

    public static final void a(Function0 function0, yci yciVar, zcq zcqVar, float f, dup dupVar, long j, long j2, float f2, long j3, wn5 wn5Var, Function2 function2, tbi tbiVar, wn5 wn5Var2, hq5 hq5Var, int i) {
        int i2;
        dup a2;
        long b2;
        int i3;
        float f3;
        tbi tbiVar2;
        long j4;
        float f4;
        Object zgVar;
        int i4;
        fk0 fk0Var;
        kjn kjnVar;
        int i5;
        mm6 mm6Var;
        float f5;
        zcq zcqVar2;
        oq5 oq5Var;
        dup dupVar2;
        float f6;
        long j5;
        tbi tbiVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2132719801);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(zcqVar) ? 256 : 128;
        }
        int i6 = i2 | 3072;
        if ((i & 24576) == 0) {
            i6 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i6 |= oq5Var2.e(j) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = 12582912 | i6;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i6;
        }
        if ((805306368 & i) == 0) {
            i7 |= oq5Var2.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i8 = (oq5Var2.h(function2) ? (char) 4 : (char) 2) | 432;
        if ((306783379 & i7) == 306783378 && (i8 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            dupVar2 = dupVar;
            j4 = j2;
            f6 = f2;
            j5 = j3;
            tbiVar3 = tbiVar;
            zcqVar2 = zcqVar;
            oq5Var = oq5Var2;
            f5 = f;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                float f7 = ve3.a;
                float f8 = ve3.a;
                float f9 = ubq.a;
                a2 = jvp.a(2, oq5Var2);
                long a3 = j95.a(j, oq5Var2);
                b2 = d85.b(j95.b((i95) oq5Var2.j(j95.a), 30), 0.32f, 0.0f, 0.0f, 0.0f, 14);
                i3 = i7 & (-238608385);
                f3 = 0;
                tbiVar2 = jai.a;
                j4 = a3;
                f4 = f7;
            } else {
                oq5Var2.S();
                i3 = i7 & (-238608385);
                f4 = f;
                a2 = dupVar;
                j4 = j2;
                f3 = f2;
                b2 = j3;
                tbiVar2 = tbiVar;
            }
            oq5Var2.q();
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var2 = ((fs5) K).a;
            int i9 = (i3 & 896) ^ 384;
            int i10 = i3 & 14;
            boolean h = ((i9 > 256 && oq5Var2.f(zcqVar)) || (i3 & 384) == 256) | oq5Var2.h(mm6Var2) | (i10 == 4);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar2) {
                K2 = new t03(17, zcqVar, mm6Var2, function0);
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h2 = oq5Var2.h(mm6Var2) | ((i9 > 256 && oq5Var2.f(zcqVar)) || (i3 & 384) == 256) | (i10 == 4);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar2) {
                K3 = new lma(10, mm6Var2, zcqVar, function0);
                oq5Var2.k0(K3);
            }
            Function1 function1 = (Function1) K3;
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar2) {
                K4 = vq2.a(0.0f);
                oq5Var2.k0(K4);
            }
            fk0 fk0Var2 = (fk0) K4;
            boolean h3 = ((i9 > 256 && oq5Var2.f(zcqVar)) || (i3 & 384) == 256) | oq5Var2.h(mm6Var2) | oq5Var2.h(fk0Var2) | (i10 == 4);
            Object K5 = oq5Var2.K();
            if (h3 || K5 == kjnVar2) {
                i4 = i3;
                fk0Var = fk0Var2;
                kjnVar = kjnVar2;
                i5 = i9;
                mm6Var = mm6Var2;
                zgVar = new zg(zcqVar, mm6Var, fk0Var, function0, 14);
                oq5Var2.k0(zgVar);
            } else {
                kjnVar = kjnVar2;
                fk0Var = fk0Var2;
                i4 = i3;
                zgVar = K5;
                i5 = i9;
                mm6Var = mm6Var2;
            }
            fk0 fk0Var3 = fk0Var;
            int i11 = i4;
            int i12 = i5;
            kjn kjnVar3 = kjnVar;
            f5 = f4;
            dup dupVar3 = a2;
            zcqVar2 = zcqVar;
            oq5Var = oq5Var2;
            tbi tbiVar4 = tbiVar2;
            ixf.b((Function0) zgVar, tbiVar4, fk0Var3, ild.C(-314673510, new cbi(b2, function02, zcqVar, fk0Var3, mm6Var, function1, yciVar, f5, dupVar3, j, j4, f3, wn5Var, function2, wn5Var2), oq5Var), oq5Var, 3632);
            if (zcqVar2.b.g().a.containsKey(gdq.b)) {
                boolean z = (i12 > 256 && oq5Var.f(zcqVar2)) || (i11 & 384) == 256;
                Object K6 = oq5Var.K();
                if (z || K6 == kjnVar3) {
                    K6 = new bbi(zcqVar2, null, 2);
                    oq5Var.k0(K6);
                }
                gld.w(oq5Var, zcqVar2, (Function2) K6);
            }
            dupVar2 = dupVar3;
            f6 = f3;
            j5 = b2;
            tbiVar3 = tbiVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ebi(function0, yciVar, zcqVar2, f5, dupVar2, j, j4, f6, j5, wn5Var, function2, tbiVar3, wn5Var2, i);
        }
    }

    public static final void b(fk0 fk0Var, mm6 mm6Var, Function0 function0, Function1 function1, yci yciVar, zcq zcqVar, float f, dup dupVar, long j, long j2, float f2, wn5 wn5Var, Function2 function2, wn5 wn5Var2, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1676960531);
        int i2 = i | (oq5Var2.h(fk0Var) ? 32 : 16) | (oq5Var2.h(mm6Var) ? 256 : 128) | (oq5Var2.h(function0) ? 2048 : 1024);
        boolean h = oq5Var2.h(function1);
        int i3 = RemoteCameraConfig.Notification.ID;
        int i4 = i2 | (h ? 16384 : 8192) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(zcqVar) ? 1048576 : 524288) | (oq5Var2.c(f) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.f(dupVar) ? 67108864 : 33554432) | (oq5Var2.e(j) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = (oq5Var2.e(j2) ? 4 : 2) | (oq5Var2.c(f2) ? 32 : 16) | (oq5Var2.h(wn5Var) ? 256 : 128) | (oq5Var2.h(function2) ? 2048 : 1024);
        if (oq5Var2.h(wn5Var2)) {
            i3 = 16384;
        }
        int i6 = i5 | i3;
        if ((i4 & 306783379) == 306783378 && (i6 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            String y = wxf.y(R.string.m3c_bottom_sheet_pane_title, oq5Var2);
            yci d = d.d(d.t(b.a.a(yciVar, b2c.c), 0.0f, f, 1), 1.0f);
            int i7 = (i4 & 3670016) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB;
            boolean z = (i7 > 1048576 && oq5Var2.f(zcqVar)) || (i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576;
            Object K = oq5Var2.K();
            boolean z2 = z;
            Object obj = gq5.a;
            if (z2 || K == obj) {
                bxj bxjVar = bxj.a;
                act actVar = bcq.a;
                K = new acq(zcqVar, function1);
                oq5Var2.k0(K);
            }
            yci a2 = a.a(d, (wxi) K, null);
            ia0 ia0Var = zcqVar.b;
            ia0 ia0Var2 = zcqVar.b;
            bxj bxjVar2 = bxj.a;
            boolean z3 = (i7 > 1048576 && oq5Var2.f(zcqVar)) || (i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576;
            Object K2 = oq5Var2.K();
            if (z3 || K2 == obj) {
                K2 = new y5(20, zcqVar);
                oq5Var2.k0(K2);
            }
            yci c2 = androidx.compose.material3.internal.a.c(a2, ia0Var, (Function2) K2);
            ga0 ga0Var = (ga0) ia0Var2.f;
            boolean c3 = zcqVar.c();
            boolean z4 = ((x6k) ia0Var2.h).getValue() != null;
            boolean z5 = (i4 & 57344) == 16384;
            Object K3 = oq5Var2.K();
            if (z5 || K3 == obj) {
                K3 = new ibi(function1, null, 0);
                oq5Var2.k0(K3);
            }
            yci a3 = zoa.a(c2, ga0Var, bxjVar2, c3, null, z4, null, (pyc) K3, false, 168);
            boolean f3 = oq5Var2.f(y);
            Object K4 = oq5Var2.K();
            if (f3 || K4 == obj) {
                K4 = new r23(y, 7);
                oq5Var2.k0(K4);
            }
            yci b2 = nfp.b(a3, false, (Function1) K4);
            boolean z6 = ((i4 & 112) == 32 || oq5Var2.h(fk0Var)) | ((i7 > 1048576 && oq5Var2.f(zcqVar)) || (i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576);
            Object K5 = oq5Var2.K();
            if (z6 || K5 == obj) {
                K5 = new afg(2, zcqVar, fk0Var);
                oq5Var2.k0(K5);
            }
            int i8 = i4 >> 21;
            int i9 = i6 << 9;
            oq5Var = oq5Var2;
            qtr.a(androidx.compose.ui.graphics.a.a(b2, (Function1) K5), dupVar, j, j2, f2, ild.C(-692668920, new jbi(function2, fk0Var, wn5Var, zcqVar, function0, mm6Var, wn5Var2), oq5Var2), oq5Var, (i8 & 896) | (i8 & 112) | 12582912 | (i9 & 7168) | (i9 & 57344), 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kbi(fk0Var, mm6Var, function0, function1, yciVar, zcqVar, f, dupVar, j, j2, f2, wn5Var, function2, wn5Var2, i);
        }
    }

    public static final void c(long j, Function0 function0, boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        yci yciVar;
        int i3;
        yci f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(951870469);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (j != 16) {
            sdr b2 = pk0.b(z ? 1.0f : 0.0f, new act(0, (kya) null, 7), null, null, oq5Var, 48, 28);
            String y = wxf.y(R.string.close_sheet, oq5Var);
            oq5Var.Z(-1785653838);
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            if (z) {
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object K = oq5Var.K();
                if (z3 || K == kjnVar) {
                    K = new af(function0, null, 2);
                    oq5Var.k0(K);
                }
                f = vciVar.f(new SuspendPointerInputElement(function0, null, null, new dur((Function2) K), 6));
                boolean f2 = (i4 == 32) | oq5Var.f(y);
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    z2 = true;
                    K2 = new pbi(y, function0, 1);
                    oq5Var.k0(K2);
                } else {
                    z2 = true;
                }
                yciVar = nfp.b(f, z2, (Function1) K2);
            } else {
                z2 = true;
                yciVar = vciVar;
            }
            oq5Var.p(false);
            yci f3 = d.c(vciVar, 1.0f).f(yciVar);
            boolean f4 = oq5Var.f(b2) | ((i2 & 14) == 4 ? z2 : false);
            Object K3 = oq5Var.K();
            if (f4 || K3 == kjnVar) {
                i3 = 0;
                K3 = new nbi(j, b2, 0);
                oq5Var.k0(K3);
            } else {
                i3 = 0;
            }
            ksw.j(i3, oq5Var, f3, (Function1) K3);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new obi(j, function0, z, i, 0);
        }
    }

    public static final float d(zco zcoVar, float f) {
        float d = nmq.d(zcoVar.p);
        if (Float.isNaN(d) || d == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (fxf.I(0.0f, Math.min(zcoVar.q.getDensity() * a, d), f) / d);
    }

    public static final float e(zco zcoVar, float f) {
        float b2 = nmq.b(zcoVar.p);
        if (Float.isNaN(b2) || b2 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (fxf.I(0.0f, Math.min(zcoVar.q.getDensity() * b, b2), f) / b2);
    }

    public static final zcq f(int i, int i2, hq5 hq5Var) {
        boolean z = true;
        boolean z2 = (i2 & 1) == 0;
        k9i k9iVar = k9i.C;
        int i3 = (i & 14) | 384;
        act actVar = bcq.a;
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        Object[] objArr = {Boolean.valueOf(z2), k9iVar, Boolean.FALSE};
        epo epoVar = epo.Z;
        xbi xbiVar = new xbi(z2, jx7Var, k9iVar, 2);
        apo apoVar = bpo.a;
        apo apoVar2 = new apo(0, epoVar, xbiVar);
        if ((((i3 & 14) ^ 6) <= 4 || !oq5Var.g(z2)) && (i3 & 6) != 4) {
            z = false;
        }
        boolean f = oq5Var.f(jx7Var) | z | oq5Var.f(k9iVar) | oq5Var.g(false);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new qbi(z2, jx7Var, gdq.a, k9iVar);
            oq5Var.k0(K);
        }
        return (zcq) o2g.g0(objArr, apoVar2, (Function0) K, oq5Var, 0, 4);
    }
}
