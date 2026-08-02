package defpackage;

import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class vxo {
    public static final float a = 56;
    public static final act b = weo.S(250, 0, nya.a, 2);

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final iz2 iz2Var, final yci yciVar, final long j, long j2, final float f, final pyc pycVar, final wn5 wn5Var, boolean z, boolean z2, final wn5 wn5Var2, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        iz2 iz2Var2;
        pyc pycVar2;
        wn5 wn5Var3;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        final boolean z5;
        int i8;
        long j3;
        final boolean z6;
        final long j4;
        final boolean z7;
        final boolean z8;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1694621538);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            iz2Var2 = iz2Var;
            i4 |= oq5Var.f(iz2Var2) ? 32 : 16;
        } else {
            iz2Var2 = iz2Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.e(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.c(f) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            pycVar2 = pycVar;
            i4 |= oq5Var.h(pycVar2) ? 1048576 : 524288;
        } else {
            pycVar2 = pycVar;
        }
        if ((12582912 & i2) == 0) {
            wn5Var3 = wn5Var;
            i4 |= oq5Var.h(wn5Var3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            wn5Var3 = wn5Var;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            z3 = z;
            i4 |= oq5Var.g(z3) ? 67108864 : 33554432;
            i5 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i5 == 0) {
                i4 |= 805306368;
                i6 = 1572864;
                z4 = z2;
            } else {
                i6 = 1572864;
                z4 = z2;
                if ((i2 & 805306368) == 0) {
                    i4 |= oq5Var.g(z4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
            }
            i7 = i4;
            if ((i7 & 306783379) == 306783378 || !oq5Var.z()) {
                oq5Var.U();
                if ((i2 & 1) != 0 || oq5Var.y()) {
                    long b2 = pa5.b(j, oq5Var);
                    int i10 = i7 & (-57345);
                    if (i9 != 0) {
                        z3 = true;
                    }
                    if (i5 == 0) {
                        i8 = i10;
                        z5 = true;
                    } else {
                        z5 = z4;
                        i8 = i10;
                    }
                    j3 = b2;
                    z6 = z3;
                } else {
                    oq5Var.S();
                    z5 = z4;
                    z6 = z3;
                    i8 = i7 & (-57345);
                    j3 = j2;
                }
                oq5Var.q();
                final iz2 iz2Var3 = iz2Var2;
                final pyc pycVar3 = pycVar2;
                final wn5 wn5Var4 = wn5Var3;
                long j5 = j3;
                q5g.k(yciVar, null, j, j5, null, 0.0f, ild.C(2146360230, new Function2() { // from class: sxo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        hq5 hq5Var2 = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.z()) {
                                oq5Var2.S();
                                return Unit.a;
                            }
                        }
                        two C = bfg.C(hq5Var2);
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        Object K = oq5Var3.K();
                        Object obj3 = gq5.a;
                        if (K == obj3) {
                            K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                        }
                        mm6 mm6Var = ((fs5) K).a;
                        boolean f2 = oq5Var3.f(C) | oq5Var3.f(mm6Var);
                        Object K2 = oq5Var3.K();
                        if (f2 || K2 == obj3) {
                            K2 = new rxo(C, mm6Var);
                            oq5Var3.k0(K2);
                        }
                        rxo rxoVar = (rxo) K2;
                        yci v = xp3.v(nfp.b(bfg.x(d.x(d.d(vci.a, 1.0f), iz2.this, 2), C, z6, 12), false, dpo.I));
                        float f3 = f;
                        boolean c = oq5Var3.c(f3);
                        wn5 wn5Var5 = wn5Var2;
                        boolean f4 = c | oq5Var3.f(wn5Var5);
                        wn5 wn5Var6 = wn5Var4;
                        boolean f5 = f4 | oq5Var3.f(wn5Var6);
                        pyc pycVar4 = pycVar3;
                        boolean f6 = f5 | oq5Var3.f(pycVar4) | oq5Var3.h(rxoVar);
                        int i11 = i;
                        boolean d = f6 | oq5Var3.d(i11);
                        boolean z9 = z5;
                        boolean g = d | oq5Var3.g(z9);
                        Object K3 = oq5Var3.K();
                        if (g || K3 == obj3) {
                            Object qi6Var = new qi6(f3, wn5Var5, wn5Var6, rxoVar, i11, z9, pycVar4);
                            oq5Var3.k0(qi6Var);
                            K3 = qi6Var;
                        }
                        u2x.p(v, (Function2) K3, oq5Var3, 0, 0);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, ((i8 >> 6) & 14) | i6 | ((i8 >> 3) & 896), 50);
                j4 = j5;
                z7 = z6;
                z8 = z5;
            } else {
                oq5Var.S();
                z7 = z3;
                z8 = z4;
                j4 = j2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: txo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int R = rvf.R(i2 | 1);
                        vxo.a(i, iz2Var, yciVar, j, j4, f, pycVar, wn5Var, z7, z8, wn5Var2, (hq5) obj, R, i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z;
        i5 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i5 == 0) {
        }
        i7 = i4;
        if ((i7 & 306783379) == 306783378) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        long b22 = pa5.b(j, oq5Var);
        int i102 = i7 & (-57345);
        if (i9 != 0) {
        }
        if (i5 == 0) {
        }
        j3 = b22;
        z6 = z3;
        oq5Var.q();
        final iz2 iz2Var32 = iz2Var2;
        final pyc pycVar32 = pycVar2;
        final wn5 wn5Var42 = wn5Var3;
        long j52 = j3;
        q5g.k(yciVar, null, j, j52, null, 0.0f, ild.C(2146360230, new Function2() { // from class: sxo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                two C = bfg.C(hq5Var2);
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                Object obj3 = gq5.a;
                if (K == obj3) {
                    K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                }
                mm6 mm6Var = ((fs5) K).a;
                boolean f2 = oq5Var3.f(C) | oq5Var3.f(mm6Var);
                Object K2 = oq5Var3.K();
                if (f2 || K2 == obj3) {
                    K2 = new rxo(C, mm6Var);
                    oq5Var3.k0(K2);
                }
                rxo rxoVar = (rxo) K2;
                yci v = xp3.v(nfp.b(bfg.x(d.x(d.d(vci.a, 1.0f), iz2.this, 2), C, z6, 12), false, dpo.I));
                float f3 = f;
                boolean c = oq5Var3.c(f3);
                wn5 wn5Var5 = wn5Var2;
                boolean f4 = c | oq5Var3.f(wn5Var5);
                wn5 wn5Var6 = wn5Var42;
                boolean f5 = f4 | oq5Var3.f(wn5Var6);
                pyc pycVar4 = pycVar32;
                boolean f6 = f5 | oq5Var3.f(pycVar4) | oq5Var3.h(rxoVar);
                int i11 = i;
                boolean d = f6 | oq5Var3.d(i11);
                boolean z9 = z5;
                boolean g = d | oq5Var3.g(z9);
                Object K3 = oq5Var3.K();
                if (g || K3 == obj3) {
                    Object qi6Var = new qi6(f3, wn5Var5, wn5Var6, rxoVar, i11, z9, pycVar4);
                    oq5Var3.k0(qi6Var);
                    K3 = qi6Var;
                }
                u2x.p(v, (Function2) K3, oq5Var3, 0, 0);
                return Unit.a;
            }
        }, oq5Var), oq5Var, ((i8 >> 6) & 14) | i6 | ((i8 >> 3) & 896), 50);
        j4 = j52;
        z7 = z6;
        z8 = z5;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
