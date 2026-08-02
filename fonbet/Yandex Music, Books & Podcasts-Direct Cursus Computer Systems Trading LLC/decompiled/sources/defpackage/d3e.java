package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public abstract class d3e {
    public static final float a = 428;
    public static final float b = 32;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final o0k o0kVar, final yci yciVar, float f, final int i2, final int i3, float f2, boolean z, pyc pycVar, final wn5 wn5Var, hq5 hq5Var, final int i4, final int i5) {
        int i6;
        int i7;
        float f3;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        oq5 oq5Var;
        final wn5 wn5Var2;
        float f4;
        final pyc pycVar2;
        final float f5;
        final boolean z3;
        xmn r;
        int i12;
        final float f6;
        o3k o3kVar;
        float f7;
        pyc pycVar3;
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-148289135);
        if ((i4 & 6) == 0) {
            i6 = (oq5Var2.d(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= oq5Var2.f(o0kVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i13 = i5 & 8;
        if (i13 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= oq5Var2.c(f) ? 2048 : 1024;
            if ((i4 & 24576) == 0) {
                i6 |= oq5Var2.d(i2) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((196608 & i4) == 0) {
                i6 |= oq5Var2.d(i3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            i7 = i5 & 64;
            if (i7 == 0) {
                i6 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i4) == 0) {
                f3 = f2;
                i6 |= oq5Var2.c(f3) ? 1048576 : 524288;
                i8 = i5 & 128;
                if (i8 != 0) {
                    i6 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    z2 = z;
                    i6 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    int i14 = i6;
                    i9 = i5 & 256;
                    if (i9 == 0) {
                        i11 = i14 | 100663296;
                        i10 = i9;
                    } else if ((i4 & 100663296) == 0) {
                        i10 = i9;
                        i11 = i14 | (oq5Var2.h(pycVar) ? 67108864 : 33554432);
                    } else {
                        i10 = i9;
                        i11 = i14;
                    }
                    if ((i4 & 805306368) == 0) {
                        i11 |= oq5Var2.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378)) {
                        oq5Var = oq5Var2;
                        wn5Var2 = wn5Var;
                        oq5Var.S();
                        f4 = f;
                        pycVar2 = pycVar;
                        f5 = f3;
                        z3 = z2;
                    } else {
                        if (i13 != 0) {
                            f6 = 0;
                            i12 = i7;
                        } else {
                            i12 = i7;
                            f6 = f;
                        }
                        if (i12 != 0) {
                            f3 = b;
                        }
                        boolean z4 = i8 != 0 ? true : z2;
                        pyc pycVar4 = i10 != 0 ? null : pycVar;
                        double d = i / i2;
                        final int d2 = yhn.d((int) (z4 ? Math.floor(d) : Math.ceil(d)), 1, i3);
                        if (pycVar4 == null) {
                            oq5Var2.Z(1840397113);
                            oq5Var2.p(false);
                            o3kVar = null;
                        } else {
                            oq5Var2.Z(-771916344);
                            o3kVar = (o3k) pycVar4.invoke(Integer.valueOf(d2), oq5Var2, Integer.valueOf((i11 >> 21) & 112));
                            oq5Var2.p(false);
                        }
                        if (o3kVar == null) {
                            oq5Var2.Z(-771915452);
                            boolean d3 = oq5Var2.d(d2);
                            Object K = oq5Var2.K();
                            if (d3 || K == gq5.a) {
                                K = new uw1(d2, 1);
                                oq5Var2.k0(K);
                            }
                            o3kVar = r3k.b(0, (Function0) K, oq5Var2, 0, 3);
                        } else {
                            oq5Var2.Z(-771916909);
                        }
                        oq5Var2.p(false);
                        if (c3x.L(oq5Var2)) {
                            oq5Var2.Z(1840555741);
                            final float f8 = f3;
                            f4 = f6;
                            wn5 C = ild.C(1799150016, new pyc() { // from class: w2e
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    final c cVar = (c) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    cVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                    }
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    if (oq5Var3.P(intValue & 1, (intValue & 19) != 18)) {
                                        yci c = d.c(vci.a, 1.0f);
                                        int i15 = intValue;
                                        final int i16 = d2;
                                        boolean d4 = oq5Var3.d(i16);
                                        final int i17 = i;
                                        boolean d5 = d4 | oq5Var3.d(i17);
                                        boolean z5 = (i15 & 14) == 4;
                                        final float f9 = f6;
                                        boolean c2 = d5 | z5 | oq5Var3.c(f9);
                                        final float f10 = f8;
                                        boolean c3 = c2 | oq5Var3.c(f10);
                                        final int i18 = i2;
                                        boolean d6 = c3 | oq5Var3.d(i18);
                                        final wn5 wn5Var3 = wn5Var;
                                        boolean f11 = d6 | oq5Var3.f(wn5Var3);
                                        Object K2 = oq5Var3.K();
                                        if (f11 || K2 == gq5.a) {
                                            Function1 function1 = new Function1() { // from class: b3e
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj4) {
                                                    vuf vufVar = (vuf) obj4;
                                                    vufVar.getClass();
                                                    final int i19 = 0;
                                                    while (true) {
                                                        final int i20 = i16;
                                                        if (i19 >= i20) {
                                                            return Unit.a;
                                                        }
                                                        final int i21 = i17;
                                                        final c cVar2 = cVar;
                                                        final float f12 = f9;
                                                        final float f13 = f10;
                                                        final int i22 = i18;
                                                        final wn5 wn5Var4 = wn5Var3;
                                                        vuf.Y(vufVar, null, new wn5(new pyc() { // from class: c3e
                                                            @Override // defpackage.pyc
                                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                                hq5 hq5Var3 = (hq5) obj6;
                                                                int intValue2 = ((Integer) obj7).intValue();
                                                                ((a) obj5).getClass();
                                                                oq5 oq5Var4 = (oq5) hq5Var3;
                                                                if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                    int i23 = i21 - 1;
                                                                    float f14 = vt0.e;
                                                                    float f15 = f12;
                                                                    d3e.b(i19, i23, androidx.compose.foundation.layout.a.q(d.r(vci.a, o5g.s(cVar2.d(), 0, f15, f14, 1, i20, 0.0f, f13, oq5Var4, 64)), 0.0f, 0.0f, f15, 0.0f, 11), i22, wn5Var4, oq5Var4, 0, 0);
                                                                } else {
                                                                    oq5Var4.S();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, 1463167237, true), 3);
                                                        i19++;
                                                    }
                                                }
                                            };
                                            oq5Var3.k0(function1);
                                            K2 = function1;
                                        }
                                        weo.i(c, null, o0k.this, false, null, null, null, false, null, (Function1) K2, oq5Var3, 6, 506);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    return Unit.a;
                                }
                            }, oq5Var2);
                            f7 = f8;
                            oq5Var = oq5Var2;
                            wn5Var2 = wn5Var;
                            bg3.a(null, null, false, C, oq5Var, 3072, 7);
                            oq5Var.p(false);
                            pycVar3 = pycVar4;
                        } else {
                            float f9 = f6;
                            f7 = f3;
                            oq5Var = oq5Var2;
                            wn5Var2 = wn5Var;
                            oq5Var.Z(1841938682);
                            d2k kwfVar = o3kVar.n() == 1 ? b2c.t : new kwf(d2, f7, 0);
                            pycVar3 = pycVar4;
                            rvf.a(o3kVar, d.d(yciVar, 1.0f), o0kVar, kwfVar, 0, f9, null, avf.F(o3kVar, new l48(0), oq5Var, 0, 28), false, null, null, null, null, ild.C(-1976474164, new ryc() { // from class: x2e
                                @Override // defpackage.ryc
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int intValue = ((Integer) obj4).intValue();
                                    ((b3k) obj).getClass();
                                    d3e.b(((Integer) obj2).intValue(), i - 1, null, i2, wn5Var2, (hq5) obj3, (intValue >> 3) & 14, 4);
                                    return Unit.a;
                                }
                            }, oq5Var), oq5Var, ((i11 << 3) & 896) | (458752 & (i11 << 6)), 24576, 16208);
                            f4 = f9;
                            oq5Var.p(false);
                        }
                        f5 = f7;
                        z3 = z4;
                        pycVar2 = pycVar3;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        final float f10 = f4;
                        r.d = new Function2() { // from class: y2e
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                d3e.a(i, o0kVar, yciVar, f10, i2, i3, f5, z3, pycVar2, wn5Var2, (hq5) obj, rvf.R(i4 | 1), i5);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                int i142 = i6;
                i9 = i5 & 256;
                if (i9 == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            f3 = f2;
            i8 = i5 & 128;
            if (i8 != 0) {
            }
            z2 = z;
            int i1422 = i6;
            i9 = i5 & 256;
            if (i9 == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        if ((i4 & 24576) == 0) {
        }
        if ((196608 & i4) == 0) {
        }
        i7 = i5 & 64;
        if (i7 == 0) {
        }
        f3 = f2;
        i8 = i5 & 128;
        if (i8 != 0) {
        }
        z2 = z;
        int i14222 = i6;
        i9 = i5 & 256;
        if (i9 == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final int i2, yci yciVar, final int i3, final wn5 wn5Var, hq5 hq5Var, final int i4, final int i5) {
        int i6;
        yci yciVar2;
        wn5 wn5Var2;
        final yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1426128209);
        if ((i4 & 6) == 0) {
            i6 = (oq5Var.d(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= oq5Var.d(i2) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i4 & 3072) == 0) {
                i6 |= oq5Var.d(i3) ? 2048 : 1024;
            }
            if ((i4 & 24576) != 0) {
                wn5Var2 = wn5Var;
                i6 |= oq5Var.h(wn5Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
            } else {
                wn5Var2 = wn5Var;
            }
            if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                yciVar3 = i7 != 0 ? vci.a : yciVar2;
                final int i8 = i * i3;
                final int min = Math.min(i2, (i8 + i3) - 1);
                boolean d = ((i6 & 112) == 32) | ((i6 & 7168) == 2048) | oq5Var.d(min) | oq5Var.d(i8);
                Object K = oq5Var.K();
                if (d || K == gq5.a) {
                    K = new Function1() { // from class: z2e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            jfp jfpVar = (jfp) obj;
                            jfpVar.getClass();
                            wfp.w(jfpVar);
                            wfp.i(jfpVar, new ky4((min - i8) + 1, (int) Math.ceil(i2 / i3)));
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(yciVar3, false, (Function1) K);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i9 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                oq5Var.Z(-1673755459);
                ype it = new IntRange(i8, min, 1).iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    wn5Var2.invoke(Integer.valueOf(nextInt), Integer.valueOf(i), Integer.valueOf(nextInt - i8), oq5Var, Integer.valueOf(((i6 << 3) & 112) | ((i6 >> 3) & 7168)));
                    wn5Var2 = wn5Var;
                }
                oq5Var.p(false);
                oq5Var.p(true);
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: a3e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d3e.b(i, i2, yciVar3, i3, wn5Var, (hq5) obj, rvf.R(i4 | 1), i5);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
