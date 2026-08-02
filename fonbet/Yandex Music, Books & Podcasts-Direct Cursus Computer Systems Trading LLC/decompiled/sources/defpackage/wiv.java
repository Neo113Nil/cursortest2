package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class wiv {
    public static final kjv a = new kjv(c3x.h(4282006074L), c3x.h(4293585642L));
    public static final apo b;

    static {
        jiv jivVar = new jiv(0);
        t0v t0vVar = new t0v(28);
        apo apoVar = bpo.a;
        b = new apo(0, jivVar, t0vVar);
    }

    public static final void a(hkv hkvVar, final xjv xjvVar, final boolean z, final boolean z2, yci yciVar, final ihv ihvVar, hq5 hq5Var, int i) {
        int i2;
        hkvVar.getClass();
        xjvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(35225436);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(hkvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(xjvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            final msd msdVar = (msd) oq5Var.j(es5.l);
            Function0 v = rf0.v(oq5Var);
            agr agrVar = htu.a;
            final hhv f = f(ihvVar, ((gtu) oq5Var.j(agrVar)).i);
            float f2 = ((gtu) oq5Var.j(agrVar)).h;
            final ArrayList arrayList = hkvVar.a;
            final boolean z3 = hkvVar.b;
            oq5Var.Z(-508072139);
            Object j = oq5Var.j(our.a);
            if (!((Boolean) oq5Var.j(vpg.a)).booleanValue()) {
                j = null;
            }
            final tur turVar = (tur) j;
            oq5Var.p(false);
            int size = arrayList.size();
            float f3 = f.a;
            float f4 = f.b;
            float f5 = f.c;
            boolean z4 = !z3;
            boolean f6 = oq5Var.f(v);
            Object K = oq5Var.K();
            if (f6 || K == gq5.a) {
                K = new gct(17, v);
                oq5Var.k0(K);
            }
            b(size, ihvVar, f3, f4, f5, yciVar, z4, f2, 0.0f, (Function0) K, ild.C(-1214634713, new vyc() { // from class: liv
                @Override // defpackage.vyc
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
                    int i4;
                    spd spdVar;
                    String n;
                    boolean z5;
                    boolean z6;
                    xjv xjvVar2;
                    int intValue = ((Integer) obj).intValue();
                    yci yciVar2 = (yci) obj2;
                    fma fmaVar = (fma) obj3;
                    final boolean booleanValue = ((Boolean) obj4).booleanValue();
                    final int intValue2 = ((Integer) obj5).intValue();
                    hq5 hq5Var2 = (hq5) obj6;
                    int intValue3 = ((Integer) serializable).intValue();
                    yciVar2.getClass();
                    if ((intValue3 & 6) == 0) {
                        i4 = (((oq5) hq5Var2).d(intValue) ? 4 : 2) | intValue3;
                    } else {
                        i4 = intValue3;
                    }
                    if ((intValue3 & 48) == 0) {
                        i4 |= ((oq5) hq5Var2).f(yciVar2) ? 32 : 16;
                    }
                    if ((intValue3 & 384) == 0) {
                        i4 |= ((oq5) hq5Var2).e(fmaVar.a) ? 256 : 128;
                    }
                    if ((intValue3 & 3072) == 0) {
                        i4 |= ((oq5) hq5Var2).g(booleanValue) ? 2048 : 1024;
                    }
                    if ((intValue3 & 24576) == 0) {
                        i4 |= ((oq5) hq5Var2).d(intValue2) ? 16384 : RemoteCameraConfig.Notification.ID;
                    }
                    if ((74899 & i4) == 74898) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    mjv mjvVar = (mjv) arrayList.get(intValue);
                    ihv ihvVar2 = ihvVar;
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    boolean d = ((i4 & 14) == 4) | oq5Var3.d(ihvVar2.ordinal());
                    Object K2 = oq5Var3.K();
                    kjn kjnVar = gq5.a;
                    if (d || K2 == kjnVar) {
                        int ordinal = ihvVar2.ordinal();
                        if (ordinal == 0) {
                            spdVar = new spd(intValue, 0, intValue);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            spdVar = new spd(0, intValue, intValue);
                        }
                        K2 = spdVar;
                        oq5Var3.k0(K2);
                    }
                    spd spdVar2 = (spd) K2;
                    ljv ljvVar = mjvVar.a;
                    if (ljvVar.g == null) {
                        oq5Var3.Z(-82810854);
                        oq5Var3.p(false);
                        n = null;
                    } else {
                        n = vz1.n(oq5Var3, -82810853, R.string.explicit_element_content_description, oq5Var3, false);
                    }
                    n8g b2 = t75.b();
                    b2.add(ljvVar.l);
                    if (n != null) {
                        b2.add(n);
                    }
                    final String X = CollectionsKt.X(t75.a(b2), ", ", null, null, null, 62);
                    int i5 = ljvVar.e;
                    Integer num = ljvVar.f;
                    String str = ljvVar.a;
                    qo6 qo6Var = ljvVar.c;
                    String str2 = ljvVar.d;
                    String str3 = ljvVar.j;
                    boolean z7 = ljvVar.h;
                    float f7 = f.c;
                    boolean z8 = ljvVar.k;
                    jzb jzbVar = ljvVar.g;
                    boolean z9 = ljvVar.b;
                    bjv bjvVar = mjvVar.c;
                    if ((bjvVar instanceof xiv) || (bjvVar instanceof ajv)) {
                        z5 = true;
                    } else {
                        if (!(bjvVar instanceof yiv) && !(bjvVar instanceof ziv)) {
                            b6e.s();
                            return null;
                        }
                        z5 = false;
                    }
                    boolean z10 = ljvVar.i;
                    boolean z11 = z3;
                    if (z11) {
                        z6 = z10;
                        yciVar2 = a.c(yciVar2, new t0v(29));
                    } else {
                        z6 = z10;
                    }
                    boolean f8 = ((i4 & 7168) == 2048) | oq5Var3.f(X) | ((57344 & i4) == 16384);
                    Object K3 = oq5Var3.K();
                    if (f8 || K3 == kjnVar) {
                        K3 = new Function1() { // from class: niv
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                jfp jfpVar = (jfp) obj7;
                                jfpVar.getClass();
                                if (booleanValue) {
                                    wfp.k(jfpVar, X);
                                    wfp.q(jfpVar, 0);
                                    wfp.x(jfpVar, intValue2);
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var3.k0(K3);
                    }
                    yci a2 = nfp.a(yciVar2, (Function1) K3);
                    long j2 = fmaVar.a;
                    msd msdVar2 = msdVar;
                    boolean h = oq5Var3.h(msdVar2);
                    xjv xjvVar3 = xjvVar;
                    boolean h2 = h | oq5Var3.h(xjvVar3) | oq5Var3.h(mjvVar) | oq5Var3.h(spdVar2);
                    Object K4 = oq5Var3.K();
                    if (h2 || K4 == kjnVar) {
                        K4 = new h0l(msdVar2, xjvVar3, mjvVar, spdVar2, 5);
                        xjvVar2 = xjvVar3;
                        oq5Var3.k0(K4);
                    } else {
                        xjvVar2 = xjvVar3;
                    }
                    Function0 function0 = (Function0) K4;
                    boolean h3 = oq5Var3.h(xjvVar2) | oq5Var3.h(mjvVar) | oq5Var3.h(spdVar2);
                    Object K5 = oq5Var3.K();
                    if (h3 || K5 == kjnVar) {
                        K5 = new kws(14, xjvVar2, mjvVar, spdVar2);
                        oq5Var3.k0(K5);
                    }
                    Function2 function2 = (Function2) K5;
                    tur turVar2 = turVar;
                    boolean f9 = oq5Var3.f(turVar2);
                    Object K6 = oq5Var3.K();
                    if (f9 || K6 == kjnVar) {
                        K6 = new jvu(20, turVar2);
                        oq5Var3.k0(K6);
                    }
                    wjv.i(i5, num, str, qo6Var, str2, str3, jzbVar, j2, f7, z11, z9, z8, function0, z, z2, z7, z6, function2, z5, (Function0) K6, a2, oq5Var3, (i4 << 15) & 29360128);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i3 >> 12) & 112) | ((i3 << 3) & 458752), 256);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new aj6(hkvVar, xjvVar, z, z2, yciVar, ihvVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, ihv ihvVar, final float f, final float f2, final float f3, final yci yciVar, final boolean z, final float f4, float f5, Function0 function0, final wn5 wn5Var, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        final float f6;
        final Function0 function02;
        float f7;
        int i5;
        final Function0 function03;
        int i6;
        Object K;
        ihv ihvVar2;
        oq5 oq5Var;
        final float f8;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1662995999);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(ihvVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.c(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.c(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var2.c(f3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i4 |= oq5Var2.g(z) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            f6 = f4;
            i4 |= oq5Var2.c(f6) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            f6 = f4;
        }
        if ((100663296 & i2) == 0) {
            i4 |= 33554432;
        }
        int i7 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i7 != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i2) == 0) {
            function02 = function0;
            i4 |= oq5Var2.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            if ((306783379 & i4) == 306783378 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i2 & 1) != 0 || oq5Var2.y()) {
                    f7 = 0.21f * f;
                    i5 = i4 & (-234881025);
                    if (i7 != 0) {
                        function03 = null;
                        i6 = i5;
                        oq5Var2.q();
                        K = oq5Var2.K();
                        if (K == gq5.a) {
                            K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
                        }
                        final mm6 mm6Var = ((fs5) K).a;
                        final uf7 a2 = m8r.a(oq5Var2);
                        final jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                        ihvVar2 = ihvVar;
                        final float f9 = f7;
                        final boolean z2 = ihvVar2 == ihv.b;
                        oq5Var = oq5Var2;
                        bg3.a(yciVar, null, false, ild.C(1188544843, new pyc() { // from class: qiv
                            @Override // defpackage.pyc
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                float f10;
                                aqi aqiVar;
                                yci yciVar2;
                                Object ljlVar;
                                boolean z3;
                                kjn kjnVar;
                                fk0 fk0Var;
                                d24 d24Var;
                                c cVar = (c) obj;
                                hq5 hq5Var2 = (hq5) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                cVar.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                }
                                if ((intValue & 19) == 18) {
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    if (oq5Var3.z()) {
                                        oq5Var3.S();
                                        return Unit.a;
                                    }
                                }
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                boolean c = oq5Var4.c(cVar.d()) | oq5Var4.c(cVar.c());
                                float f11 = f;
                                boolean c2 = c | oq5Var4.c(f11);
                                float f12 = f2;
                                boolean c3 = c2 | oq5Var4.c(f12);
                                float f13 = f3;
                                boolean c4 = c3 | oq5Var4.c(f13);
                                float f14 = f6;
                                boolean c5 = c4 | oq5Var4.c(f14);
                                float f15 = f9;
                                boolean c6 = c5 | oq5Var4.c(f15);
                                boolean z4 = z2;
                                boolean g = c6 | oq5Var4.g(z4);
                                jx7 jx7Var2 = jx7Var;
                                boolean f16 = g | oq5Var4.f(jx7Var2);
                                Object K2 = oq5Var4.K();
                                kjn kjnVar2 = gq5.a;
                                if (f16 || K2 == kjnVar2) {
                                    float d = cVar.d();
                                    float c7 = cVar.c();
                                    double d2 = (f13 * 3.141592653589793d) / 180.0d;
                                    float cos = (float) Math.cos(d2);
                                    float sin = (float) Math.sin(d2);
                                    float f17 = cos * cos;
                                    float f18 = sin * sin;
                                    float n0 = jx7Var2.n0(f11);
                                    float n02 = jx7Var2.n0(f12);
                                    f10 = 1.0f;
                                    float c8 = yhn.c((z4 ? jx7Var2.n0(d) : jx7Var2.n0(c7)) / wiv.g(n0 / 2.0f, n02 / 2.0f, f17, f18, z4), 0.0f, f14);
                                    float f19 = n0 * c8;
                                    float f20 = n02 * c8;
                                    float n03 = jx7Var2.n0(f15) * c8;
                                    float abs = Math.abs(cos);
                                    float abs2 = Math.abs(sin);
                                    float max = Math.max((f20 * abs2) + (f19 * abs), f19);
                                    float max2 = Math.max((abs * f20) + (abs2 * f19), f20);
                                    float f21 = f19 / 2.0f;
                                    float f22 = f20 / 2.0f;
                                    float g2 = wiv.g(f21, f22, f17, f18, z4);
                                    float f23 = f19 - n03;
                                    float f24 = f23 < 1.0f ? 1.0f : f23;
                                    float n04 = z4 ? jx7Var2.n0(c7) : jx7Var2.n0(d);
                                    K2 = new d24(xv.m(jx7Var2.d0(f19), jx7Var2.d0(f20)), xv.m(jx7Var2.d0(max), jx7Var2.d0(max2)), max, max2, f24, n04, n04 / 2.0f, (((0.37f * f19) / 2.0f) + (g2 / 2.0f)) / 0.85f, ((int) ((n04 / f24) / 2.0f)) + 3, z4 ? max2 : max, (((int) r1) + 2) * f24, g2 > 0.0f ? (((((f22 * f22) - (f21 * f21)) * 2.0f) * sin) * cos) / g2 : 0.0f);
                                    oq5Var4.k0(K2);
                                } else {
                                    f10 = 1.0f;
                                }
                                d24 d24Var2 = (d24) K2;
                                int i8 = i;
                                int i9 = 50001 - (50000 % i8);
                                Object[] objArr = new Object[0];
                                apo apoVar = wiv.b;
                                boolean d3 = oq5Var4.d(i9) | oq5Var4.f(d24Var2);
                                Object K3 = oq5Var4.K();
                                if (d3 || K3 == kjnVar2) {
                                    K3 = new as7(i9, d24Var2, 5);
                                    oq5Var4.k0(K3);
                                }
                                fk0 fk0Var2 = (fk0) o2g.g0(objArr, apoVar, (Function0) K3, oq5Var4, 0, 4);
                                boolean d4 = oq5Var4.d(i8) | oq5Var4.f(d24Var2);
                                Object K4 = oq5Var4.K();
                                if (d4 || K4 == kjnVar2) {
                                    K4 = new viv(i8, wn5Var, d24Var2, fk0Var2);
                                    oq5Var4.k0(K4);
                                }
                                viv vivVar = (viv) K4;
                                boolean d5 = oq5Var4.d(i8);
                                Object K5 = oq5Var4.K();
                                if (d5 || K5 == kjnVar2) {
                                    K5 = szf.g0(0);
                                    oq5Var4.k0(K5);
                                }
                                aqi aqiVar2 = (aqi) K5;
                                Object K6 = oq5Var4.K();
                                if (K6 == kjnVar2) {
                                    K6 = szf.g0(null);
                                    oq5Var4.k0(K6);
                                }
                                aqi aqiVar3 = (aqi) K6;
                                Function0 function04 = function03;
                                if (function04 != null) {
                                    oq5Var4.Z(230954722);
                                    Object K7 = oq5Var4.K();
                                    if (K7 == kjnVar2) {
                                        K7 = szf.g0(Boolean.TRUE);
                                        oq5Var4.k0(K7);
                                    }
                                    aqi aqiVar4 = (aqi) K7;
                                    boolean f25 = oq5Var4.f(function04);
                                    Object K8 = oq5Var4.K();
                                    if (f25 || K8 == kjnVar2) {
                                        K8 = new h0t(aqiVar3, aqiVar4, function04, null, 24);
                                        aqiVar = aqiVar3;
                                        oq5Var4.k0(K8);
                                    } else {
                                        aqiVar = aqiVar3;
                                    }
                                    gld.w(oq5Var4, aqiVar, (Function2) K8);
                                } else {
                                    aqiVar = aqiVar3;
                                    oq5Var4.Z(213638711);
                                }
                                oq5Var4.p(false);
                                boolean f26 = oq5Var4.f(vivVar);
                                Object K9 = oq5Var4.K();
                                if (f26 || K9 == kjnVar2) {
                                    K9 = new jvu(19, vivVar);
                                    oq5Var4.k0(K9);
                                }
                                Function0 function05 = (Function0) K9;
                                yci c9 = d.c(vci.a, f10);
                                boolean g3 = oq5Var4.g(z4) | oq5Var4.f(aqiVar2) | oq5Var4.d(i8);
                                mm6 mm6Var2 = mm6Var;
                                boolean h = g3 | oq5Var4.h(mm6Var2) | oq5Var4.h(fk0Var2) | oq5Var4.f(d24Var2);
                                Object K10 = oq5Var4.K();
                                if (h || K10 == kjnVar2) {
                                    yciVar2 = c9;
                                    z3 = z4;
                                    kjnVar = kjnVar2;
                                    ljlVar = new ljl(z3, aqiVar2, i8, mm6Var2, fk0Var2, d24Var2);
                                    fk0Var = fk0Var2;
                                    d24Var = d24Var2;
                                    oq5Var4.k0(ljlVar);
                                } else {
                                    ljlVar = K10;
                                    yciVar2 = c9;
                                    d24Var = d24Var2;
                                    z3 = z4;
                                    kjnVar = kjnVar2;
                                    fk0Var = fk0Var2;
                                }
                                yci b2 = nfp.b(yciVar2, false, (Function1) ljlVar);
                                bxj bxjVar = z3 ? bxj.a : bxj.b;
                                boolean f27 = oq5Var4.f(aqiVar2) | oq5Var4.h(mm6Var2) | oq5Var4.h(fk0Var);
                                Object K11 = oq5Var4.K();
                                if (f27 || K11 == kjnVar) {
                                    K11 = new zzq(20, aqiVar2, mm6Var2, fk0Var);
                                    oq5Var4.k0(K11);
                                }
                                cpa b3 = zoa.b((Function1) K11, oq5Var4);
                                boolean h2 = oq5Var4.h(mm6Var2) | oq5Var4.h(fk0Var);
                                uf7 uf7Var = a2;
                                boolean h3 = h2 | oq5Var4.h(uf7Var);
                                Object K12 = oq5Var4.K();
                                if (h3 || K12 == kjnVar) {
                                    K12 = new uiv(mm6Var2, fk0Var, uf7Var, null);
                                    oq5Var4.k0(K12);
                                }
                                yci a3 = zoa.a(b2, b3, bxjVar, z, null, false, null, (pyc) K12, false, 184);
                                boolean h4 = oq5Var4.h(fk0Var) | oq5Var4.f(d24Var) | oq5Var4.f(jx7Var2) | oq5Var4.g(z3);
                                Object K13 = oq5Var4.K();
                                if (h4 || K13 == kjnVar) {
                                    qr qrVar = new qr(20, fk0Var, d24Var, aqiVar, jx7Var2, z3);
                                    oq5Var4.k0(qrVar);
                                    K13 = qrVar;
                                }
                                n7w.t(function05, a3, null, (Function2) K13, oq5Var4, 0, 4);
                                return Unit.a;
                            }
                        }, oq5Var2), oq5Var, ((i6 >> 15) & 14) | 3072, 6);
                        function02 = function03;
                        f8 = f9;
                    }
                } else {
                    oq5Var2.S();
                    i5 = i4 & (-234881025);
                    f7 = f5;
                }
                i6 = i5;
                function03 = function02;
                oq5Var2.q();
                K = oq5Var2.K();
                if (K == gq5.a) {
                }
                final mm6 mm6Var2 = ((fs5) K).a;
                final uf7 a22 = m8r.a(oq5Var2);
                final jx7 jx7Var2 = (jx7) oq5Var2.j(es5.h);
                ihvVar2 = ihvVar;
                final float f92 = f7;
                final boolean z22 = ihvVar2 == ihv.b;
                oq5Var = oq5Var2;
                bg3.a(yciVar, null, false, ild.C(1188544843, new pyc() { // from class: qiv
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f10;
                        aqi aqiVar;
                        yci yciVar2;
                        Object ljlVar;
                        boolean z3;
                        kjn kjnVar;
                        fk0 fk0Var;
                        d24 d24Var;
                        c cVar = (c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        boolean c = oq5Var4.c(cVar.d()) | oq5Var4.c(cVar.c());
                        float f11 = f;
                        boolean c2 = c | oq5Var4.c(f11);
                        float f12 = f2;
                        boolean c3 = c2 | oq5Var4.c(f12);
                        float f13 = f3;
                        boolean c4 = c3 | oq5Var4.c(f13);
                        float f14 = f6;
                        boolean c5 = c4 | oq5Var4.c(f14);
                        float f15 = f92;
                        boolean c6 = c5 | oq5Var4.c(f15);
                        boolean z4 = z22;
                        boolean g = c6 | oq5Var4.g(z4);
                        jx7 jx7Var22 = jx7Var2;
                        boolean f16 = g | oq5Var4.f(jx7Var22);
                        Object K2 = oq5Var4.K();
                        kjn kjnVar2 = gq5.a;
                        if (f16 || K2 == kjnVar2) {
                            float d = cVar.d();
                            float c7 = cVar.c();
                            double d2 = (f13 * 3.141592653589793d) / 180.0d;
                            float cos = (float) Math.cos(d2);
                            float sin = (float) Math.sin(d2);
                            float f17 = cos * cos;
                            float f18 = sin * sin;
                            float n0 = jx7Var22.n0(f11);
                            float n02 = jx7Var22.n0(f12);
                            f10 = 1.0f;
                            float c8 = yhn.c((z4 ? jx7Var22.n0(d) : jx7Var22.n0(c7)) / wiv.g(n0 / 2.0f, n02 / 2.0f, f17, f18, z4), 0.0f, f14);
                            float f19 = n0 * c8;
                            float f20 = n02 * c8;
                            float n03 = jx7Var22.n0(f15) * c8;
                            float abs = Math.abs(cos);
                            float abs2 = Math.abs(sin);
                            float max = Math.max((f20 * abs2) + (f19 * abs), f19);
                            float max2 = Math.max((abs * f20) + (abs2 * f19), f20);
                            float f21 = f19 / 2.0f;
                            float f22 = f20 / 2.0f;
                            float g2 = wiv.g(f21, f22, f17, f18, z4);
                            float f23 = f19 - n03;
                            float f24 = f23 < 1.0f ? 1.0f : f23;
                            float n04 = z4 ? jx7Var22.n0(c7) : jx7Var22.n0(d);
                            K2 = new d24(xv.m(jx7Var22.d0(f19), jx7Var22.d0(f20)), xv.m(jx7Var22.d0(max), jx7Var22.d0(max2)), max, max2, f24, n04, n04 / 2.0f, (((0.37f * f19) / 2.0f) + (g2 / 2.0f)) / 0.85f, ((int) ((n04 / f24) / 2.0f)) + 3, z4 ? max2 : max, (((int) r1) + 2) * f24, g2 > 0.0f ? (((((f22 * f22) - (f21 * f21)) * 2.0f) * sin) * cos) / g2 : 0.0f);
                            oq5Var4.k0(K2);
                        } else {
                            f10 = 1.0f;
                        }
                        d24 d24Var2 = (d24) K2;
                        int i8 = i;
                        int i9 = 50001 - (50000 % i8);
                        Object[] objArr = new Object[0];
                        apo apoVar = wiv.b;
                        boolean d3 = oq5Var4.d(i9) | oq5Var4.f(d24Var2);
                        Object K3 = oq5Var4.K();
                        if (d3 || K3 == kjnVar2) {
                            K3 = new as7(i9, d24Var2, 5);
                            oq5Var4.k0(K3);
                        }
                        fk0 fk0Var2 = (fk0) o2g.g0(objArr, apoVar, (Function0) K3, oq5Var4, 0, 4);
                        boolean d4 = oq5Var4.d(i8) | oq5Var4.f(d24Var2);
                        Object K4 = oq5Var4.K();
                        if (d4 || K4 == kjnVar2) {
                            K4 = new viv(i8, wn5Var, d24Var2, fk0Var2);
                            oq5Var4.k0(K4);
                        }
                        viv vivVar = (viv) K4;
                        boolean d5 = oq5Var4.d(i8);
                        Object K5 = oq5Var4.K();
                        if (d5 || K5 == kjnVar2) {
                            K5 = szf.g0(0);
                            oq5Var4.k0(K5);
                        }
                        aqi aqiVar2 = (aqi) K5;
                        Object K6 = oq5Var4.K();
                        if (K6 == kjnVar2) {
                            K6 = szf.g0(null);
                            oq5Var4.k0(K6);
                        }
                        aqi aqiVar3 = (aqi) K6;
                        Function0 function04 = function03;
                        if (function04 != null) {
                            oq5Var4.Z(230954722);
                            Object K7 = oq5Var4.K();
                            if (K7 == kjnVar2) {
                                K7 = szf.g0(Boolean.TRUE);
                                oq5Var4.k0(K7);
                            }
                            aqi aqiVar4 = (aqi) K7;
                            boolean f25 = oq5Var4.f(function04);
                            Object K8 = oq5Var4.K();
                            if (f25 || K8 == kjnVar2) {
                                K8 = new h0t(aqiVar3, aqiVar4, function04, null, 24);
                                aqiVar = aqiVar3;
                                oq5Var4.k0(K8);
                            } else {
                                aqiVar = aqiVar3;
                            }
                            gld.w(oq5Var4, aqiVar, (Function2) K8);
                        } else {
                            aqiVar = aqiVar3;
                            oq5Var4.Z(213638711);
                        }
                        oq5Var4.p(false);
                        boolean f26 = oq5Var4.f(vivVar);
                        Object K9 = oq5Var4.K();
                        if (f26 || K9 == kjnVar2) {
                            K9 = new jvu(19, vivVar);
                            oq5Var4.k0(K9);
                        }
                        Function0 function05 = (Function0) K9;
                        yci c9 = d.c(vci.a, f10);
                        boolean g3 = oq5Var4.g(z4) | oq5Var4.f(aqiVar2) | oq5Var4.d(i8);
                        mm6 mm6Var22 = mm6Var2;
                        boolean h = g3 | oq5Var4.h(mm6Var22) | oq5Var4.h(fk0Var2) | oq5Var4.f(d24Var2);
                        Object K10 = oq5Var4.K();
                        if (h || K10 == kjnVar2) {
                            yciVar2 = c9;
                            z3 = z4;
                            kjnVar = kjnVar2;
                            ljlVar = new ljl(z3, aqiVar2, i8, mm6Var22, fk0Var2, d24Var2);
                            fk0Var = fk0Var2;
                            d24Var = d24Var2;
                            oq5Var4.k0(ljlVar);
                        } else {
                            ljlVar = K10;
                            yciVar2 = c9;
                            d24Var = d24Var2;
                            z3 = z4;
                            kjnVar = kjnVar2;
                            fk0Var = fk0Var2;
                        }
                        yci b2 = nfp.b(yciVar2, false, (Function1) ljlVar);
                        bxj bxjVar = z3 ? bxj.a : bxj.b;
                        boolean f27 = oq5Var4.f(aqiVar2) | oq5Var4.h(mm6Var22) | oq5Var4.h(fk0Var);
                        Object K11 = oq5Var4.K();
                        if (f27 || K11 == kjnVar) {
                            K11 = new zzq(20, aqiVar2, mm6Var22, fk0Var);
                            oq5Var4.k0(K11);
                        }
                        cpa b3 = zoa.b((Function1) K11, oq5Var4);
                        boolean h2 = oq5Var4.h(mm6Var22) | oq5Var4.h(fk0Var);
                        uf7 uf7Var = a22;
                        boolean h3 = h2 | oq5Var4.h(uf7Var);
                        Object K12 = oq5Var4.K();
                        if (h3 || K12 == kjnVar) {
                            K12 = new uiv(mm6Var22, fk0Var, uf7Var, null);
                            oq5Var4.k0(K12);
                        }
                        yci a3 = zoa.a(b2, b3, bxjVar, z, null, false, null, (pyc) K12, false, 184);
                        boolean h4 = oq5Var4.h(fk0Var) | oq5Var4.f(d24Var) | oq5Var4.f(jx7Var22) | oq5Var4.g(z3);
                        Object K13 = oq5Var4.K();
                        if (h4 || K13 == kjnVar) {
                            qr qrVar = new qr(20, fk0Var, d24Var, aqiVar, jx7Var22, z3);
                            oq5Var4.k0(qrVar);
                            K13 = qrVar;
                        }
                        n7w.t(function05, a3, null, (Function2) K13, oq5Var4, 0, 4);
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var, ((i6 >> 15) & 14) | 3072, 6);
                function02 = function03;
                f8 = f92;
            } else {
                oq5Var2.S();
                ihvVar2 = ihvVar;
                f8 = f5;
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                final ihv ihvVar3 = ihvVar2;
                r.d = new Function2() { // from class: riv
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wiv.b(i, ihvVar3, f, f2, f3, yciVar, z, f4, f8, function02, wn5Var, (hq5) obj, rvf.R(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        function02 = function0;
        if ((306783379 & i4) == 306783378) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        f7 = 0.21f * f;
        i5 = i4 & (-234881025);
        if (i7 != 0) {
        }
        i6 = i5;
        function03 = function02;
        oq5Var2.q();
        K = oq5Var2.K();
        if (K == gq5.a) {
        }
        final mm6 mm6Var22 = ((fs5) K).a;
        final uf7 a222 = m8r.a(oq5Var2);
        final jx7 jx7Var22 = (jx7) oq5Var2.j(es5.h);
        ihvVar2 = ihvVar;
        final float f922 = f7;
        final boolean z222 = ihvVar2 == ihv.b;
        oq5Var = oq5Var2;
        bg3.a(yciVar, null, false, ild.C(1188544843, new pyc() { // from class: qiv
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                float f10;
                aqi aqiVar;
                yci yciVar2;
                Object ljlVar;
                boolean z3;
                kjn kjnVar;
                fk0 fk0Var;
                d24 d24Var;
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean c = oq5Var4.c(cVar.d()) | oq5Var4.c(cVar.c());
                float f11 = f;
                boolean c2 = c | oq5Var4.c(f11);
                float f12 = f2;
                boolean c3 = c2 | oq5Var4.c(f12);
                float f13 = f3;
                boolean c4 = c3 | oq5Var4.c(f13);
                float f14 = f6;
                boolean c5 = c4 | oq5Var4.c(f14);
                float f15 = f922;
                boolean c6 = c5 | oq5Var4.c(f15);
                boolean z4 = z222;
                boolean g = c6 | oq5Var4.g(z4);
                jx7 jx7Var222 = jx7Var22;
                boolean f16 = g | oq5Var4.f(jx7Var222);
                Object K2 = oq5Var4.K();
                kjn kjnVar2 = gq5.a;
                if (f16 || K2 == kjnVar2) {
                    float d = cVar.d();
                    float c7 = cVar.c();
                    double d2 = (f13 * 3.141592653589793d) / 180.0d;
                    float cos = (float) Math.cos(d2);
                    float sin = (float) Math.sin(d2);
                    float f17 = cos * cos;
                    float f18 = sin * sin;
                    float n0 = jx7Var222.n0(f11);
                    float n02 = jx7Var222.n0(f12);
                    f10 = 1.0f;
                    float c8 = yhn.c((z4 ? jx7Var222.n0(d) : jx7Var222.n0(c7)) / wiv.g(n0 / 2.0f, n02 / 2.0f, f17, f18, z4), 0.0f, f14);
                    float f19 = n0 * c8;
                    float f20 = n02 * c8;
                    float n03 = jx7Var222.n0(f15) * c8;
                    float abs = Math.abs(cos);
                    float abs2 = Math.abs(sin);
                    float max = Math.max((f20 * abs2) + (f19 * abs), f19);
                    float max2 = Math.max((abs * f20) + (abs2 * f19), f20);
                    float f21 = f19 / 2.0f;
                    float f22 = f20 / 2.0f;
                    float g2 = wiv.g(f21, f22, f17, f18, z4);
                    float f23 = f19 - n03;
                    float f24 = f23 < 1.0f ? 1.0f : f23;
                    float n04 = z4 ? jx7Var222.n0(c7) : jx7Var222.n0(d);
                    K2 = new d24(xv.m(jx7Var222.d0(f19), jx7Var222.d0(f20)), xv.m(jx7Var222.d0(max), jx7Var222.d0(max2)), max, max2, f24, n04, n04 / 2.0f, (((0.37f * f19) / 2.0f) + (g2 / 2.0f)) / 0.85f, ((int) ((n04 / f24) / 2.0f)) + 3, z4 ? max2 : max, (((int) r1) + 2) * f24, g2 > 0.0f ? (((((f22 * f22) - (f21 * f21)) * 2.0f) * sin) * cos) / g2 : 0.0f);
                    oq5Var4.k0(K2);
                } else {
                    f10 = 1.0f;
                }
                d24 d24Var2 = (d24) K2;
                int i8 = i;
                int i9 = 50001 - (50000 % i8);
                Object[] objArr = new Object[0];
                apo apoVar = wiv.b;
                boolean d3 = oq5Var4.d(i9) | oq5Var4.f(d24Var2);
                Object K3 = oq5Var4.K();
                if (d3 || K3 == kjnVar2) {
                    K3 = new as7(i9, d24Var2, 5);
                    oq5Var4.k0(K3);
                }
                fk0 fk0Var2 = (fk0) o2g.g0(objArr, apoVar, (Function0) K3, oq5Var4, 0, 4);
                boolean d4 = oq5Var4.d(i8) | oq5Var4.f(d24Var2);
                Object K4 = oq5Var4.K();
                if (d4 || K4 == kjnVar2) {
                    K4 = new viv(i8, wn5Var, d24Var2, fk0Var2);
                    oq5Var4.k0(K4);
                }
                viv vivVar = (viv) K4;
                boolean d5 = oq5Var4.d(i8);
                Object K5 = oq5Var4.K();
                if (d5 || K5 == kjnVar2) {
                    K5 = szf.g0(0);
                    oq5Var4.k0(K5);
                }
                aqi aqiVar2 = (aqi) K5;
                Object K6 = oq5Var4.K();
                if (K6 == kjnVar2) {
                    K6 = szf.g0(null);
                    oq5Var4.k0(K6);
                }
                aqi aqiVar3 = (aqi) K6;
                Function0 function04 = function03;
                if (function04 != null) {
                    oq5Var4.Z(230954722);
                    Object K7 = oq5Var4.K();
                    if (K7 == kjnVar2) {
                        K7 = szf.g0(Boolean.TRUE);
                        oq5Var4.k0(K7);
                    }
                    aqi aqiVar4 = (aqi) K7;
                    boolean f25 = oq5Var4.f(function04);
                    Object K8 = oq5Var4.K();
                    if (f25 || K8 == kjnVar2) {
                        K8 = new h0t(aqiVar3, aqiVar4, function04, null, 24);
                        aqiVar = aqiVar3;
                        oq5Var4.k0(K8);
                    } else {
                        aqiVar = aqiVar3;
                    }
                    gld.w(oq5Var4, aqiVar, (Function2) K8);
                } else {
                    aqiVar = aqiVar3;
                    oq5Var4.Z(213638711);
                }
                oq5Var4.p(false);
                boolean f26 = oq5Var4.f(vivVar);
                Object K9 = oq5Var4.K();
                if (f26 || K9 == kjnVar2) {
                    K9 = new jvu(19, vivVar);
                    oq5Var4.k0(K9);
                }
                Function0 function05 = (Function0) K9;
                yci c9 = d.c(vci.a, f10);
                boolean g3 = oq5Var4.g(z4) | oq5Var4.f(aqiVar2) | oq5Var4.d(i8);
                mm6 mm6Var222 = mm6Var22;
                boolean h = g3 | oq5Var4.h(mm6Var222) | oq5Var4.h(fk0Var2) | oq5Var4.f(d24Var2);
                Object K10 = oq5Var4.K();
                if (h || K10 == kjnVar2) {
                    yciVar2 = c9;
                    z3 = z4;
                    kjnVar = kjnVar2;
                    ljlVar = new ljl(z3, aqiVar2, i8, mm6Var222, fk0Var2, d24Var2);
                    fk0Var = fk0Var2;
                    d24Var = d24Var2;
                    oq5Var4.k0(ljlVar);
                } else {
                    ljlVar = K10;
                    yciVar2 = c9;
                    d24Var = d24Var2;
                    z3 = z4;
                    kjnVar = kjnVar2;
                    fk0Var = fk0Var2;
                }
                yci b2 = nfp.b(yciVar2, false, (Function1) ljlVar);
                bxj bxjVar = z3 ? bxj.a : bxj.b;
                boolean f27 = oq5Var4.f(aqiVar2) | oq5Var4.h(mm6Var222) | oq5Var4.h(fk0Var);
                Object K11 = oq5Var4.K();
                if (f27 || K11 == kjnVar) {
                    K11 = new zzq(20, aqiVar2, mm6Var222, fk0Var);
                    oq5Var4.k0(K11);
                }
                cpa b3 = zoa.b((Function1) K11, oq5Var4);
                boolean h2 = oq5Var4.h(mm6Var222) | oq5Var4.h(fk0Var);
                uf7 uf7Var = a222;
                boolean h3 = h2 | oq5Var4.h(uf7Var);
                Object K12 = oq5Var4.K();
                if (h3 || K12 == kjnVar) {
                    K12 = new uiv(mm6Var222, fk0Var, uf7Var, null);
                    oq5Var4.k0(K12);
                }
                yci a3 = zoa.a(b2, b3, bxjVar, z, null, false, null, (pyc) K12, false, 184);
                boolean h4 = oq5Var4.h(fk0Var) | oq5Var4.f(d24Var) | oq5Var4.f(jx7Var222) | oq5Var4.g(z3);
                Object K13 = oq5Var4.K();
                if (h4 || K13 == kjnVar) {
                    qr qrVar = new qr(20, fk0Var, d24Var, aqiVar, jx7Var222, z3);
                    oq5Var4.k0(qrVar);
                    K13 = qrVar;
                }
                n7w.t(function05, a3, null, (Function2) K13, oq5Var4, 0, 4);
                return Unit.a;
            }
        }, oq5Var2), oq5Var, ((i6 >> 15) & 14) | 3072, 6);
        function02 = function03;
        f8 = f922;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(final boolean z, yci yciVar, ihv ihvVar, boolean z2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1278003099);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            agr agrVar = htu.a;
            final hhv f = f(ihvVar, ((gtu) oq5Var.j(agrVar)).i);
            float f2 = ((gtu) oq5Var.j(agrVar)).h;
            wje s = fgq.s(fgq.D("infiniteTransition", oq5Var, 0), 0.6f, 1.0f, weo.C(weo.S(700, 0, nya.b, 2), jyn.b, 0L, 4), "alpha", oq5Var, 29112, 0);
            boolean f3 = oq5Var.f(s) | ((i3 & 7168) == 2048);
            Object K = oq5Var.K();
            if (f3 || K == gq5.a) {
                K = new nu6(z2, s, 1);
                oq5Var.k0(K);
            }
            b(10, ihvVar, f.a, f.b, f.c, androidx.compose.ui.graphics.a.a(yciVar, (Function1) K), false, f2, 0.0f, null, ild.C(1175021670, new vyc() { // from class: piv
                @Override // defpackage.vyc
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
                    int i4;
                    ((Integer) obj).getClass();
                    yci yciVar2 = (yci) obj2;
                    fma fmaVar = (fma) obj3;
                    ((Boolean) obj4).getClass();
                    ((Integer) obj5).getClass();
                    hq5 hq5Var2 = (hq5) obj6;
                    int intValue = ((Integer) serializable).intValue();
                    yciVar2.getClass();
                    if ((intValue & 48) == 0) {
                        i4 = (((oq5) hq5Var2).f(yciVar2) ? 32 : 16) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i4 |= ((oq5) hq5Var2).e(fmaVar.a) ? 256 : 128;
                    }
                    if ((65681 & i4) == 65680) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    wjv.j(wiv.a, fmaVar.a, hhv.this.c, z, yciVar2, hq5Var2, ((i4 >> 3) & 112) | 6 | ((i4 << 9) & 57344));
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i3 >> 3) & 112) | 1572870, 768);
            oq5Var = oq5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oiv(z, yciVar, ihvVar, z2, i);
        }
    }

    public static final void d(xjv xjvVar, sdr sdrVar, boolean z, boolean z2, yci yciVar, ihv ihvVar, hq5 hq5Var, int i) {
        int i2;
        sdr sdrVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1721945020);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(xjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sdrVar2 = sdrVar;
            i2 |= oq5Var.f(sdrVar2) ? 32 : 16;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & 74899) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object value = sdrVar2.getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new siv(0);
                oq5Var.k0(K);
            }
            ot0.l(value, (Function1) K, null, null, null, false, ild.C(-758209551, new kiv(z, ihvVar, xjvVar, z2), oq5Var), oq5Var, 1769520, 28);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new aj6(xjvVar, sdrVar2, z, z2, yciVar, ihvVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(xjv xjvVar, boolean z, boolean z2, ihv ihvVar, hq5 hq5Var, int i) {
        int i2;
        xjv xjvVar2;
        boolean z3;
        boolean z4;
        ihv ihvVar2;
        xmn r;
        xjvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(678622466);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(xjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z2) ? 256 : 128;
        }
        int i3 = i & 3072;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (!((Boolean) oq5Var.j(vpg.a)).booleanValue()) {
                oq5Var.Z(431790156);
                int i4 = i2 & 14;
                int i5 = i2 << 3;
                d(xjvVar, gld.O(xjvVar.h, oq5Var), z, z2, vciVar, ihvVar, oq5Var, i4 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
                xjvVar2 = xjvVar;
                z3 = z;
                z4 = z2;
                ihvVar2 = ihvVar;
                oq5Var = oq5Var;
                oq5Var.p(false);
                r = oq5Var.r();
                if (r == null) {
                    r.d = new oiv(xjvVar2, z3, z4, ihvVar2, i);
                    return;
                }
                return;
            }
            oq5Var.Z(431163212);
            our.a(xjvVar.h, gkv.a, mur.a, vciVar, ild.C(-1122947510, new kiv(xjvVar, z, z2, ihvVar), oq5Var), oq5Var, (i2 & 7168) | 24960, 0);
            oq5Var.p(false);
        }
        ihvVar2 = ihvVar;
        z4 = z2;
        z3 = z;
        xjvVar2 = xjvVar;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final hhv f(ihv ihvVar, float f) {
        int ordinal = ihvVar.ordinal();
        if (ordinal == 0) {
            return new hhv(174 * f, 311 * f, 40.0f);
        }
        if (ordinal == 1) {
            return new hhv(272 * f, 544 * f, -75.0f);
        }
        b6e.s();
        return null;
    }

    public static final float g(float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        if (z) {
            f5 = f * f * f3;
            f6 = f2 * f2 * f4;
        } else {
            f5 = f * f * f4;
            f6 = f2 * f2 * f3;
        }
        return ((float) Math.sqrt(f6 + f5)) * 2.0f;
    }
}
