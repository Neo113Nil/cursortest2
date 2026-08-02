package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class rbi {
    public static final act a = weo.S(300, 0, nya.a, 2);

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0123, code lost:
    
        if ((r17 != null && r17.c()) == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final mxo mxoVar, final yci yciVar, final bci bciVar, final Function0 function0, final long j, final long j2, dup dupVar, final float f, final boolean z, final boolean z2, final wn5 wn5Var, hq5 hq5Var, final int i) {
        int i2;
        yci yciVar2;
        Function0 function02;
        long j3;
        float f2;
        dup c;
        int i3;
        boolean z3;
        final dup dupVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1093569036);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(mxoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var.f(yciVar2) ? 32 : 16;
        } else {
            yciVar2 = yciVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= oq5Var.h(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= oq5Var.e(j3) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.e(j2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            f2 = f;
            i2 |= oq5Var.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            f2 = f;
        }
        if ((i & 100663296) == 0) {
            i2 |= oq5Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var.g(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            dupVar2 = dupVar;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                float f3 = 16;
                c = ugo.c(f3, f3);
                i3 = i2 & (-3670017);
            } else {
                oq5Var.S();
                i3 = i2 & (-3670017);
                c = dupVar;
            }
            oq5Var.q();
            if (z) {
                z3 = true;
                if (!z2) {
                }
                int i4 = i3 >> 3;
                dupVar2 = c;
                b(yciVar2, bciVar, function02, j3, j2, dupVar2, f2, z3, wn5Var, oq5Var, (i4 & 3670016) | (i4 & 896) | (i4 & 14) | 64 | (i4 & 112) | (i4 & 7168) | (57344 & i4) | 100663296, 0);
            }
            z3 = false;
            int i42 = i3 >> 3;
            dupVar2 = c;
            b(yciVar2, bciVar, function02, j3, j2, dupVar2, f2, z3, wn5Var, oq5Var, (i42 & 3670016) | (i42 & 896) | (i42 & 14) | 64 | (i42 & 112) | (i42 & 7168) | (57344 & i42) | 100663296, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: vai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    rbi.a(mxo.this, yciVar, bciVar, function0, j, j2, dupVar2, f, z, z2, wn5Var, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d4  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(yci yciVar, final bci bciVar, Function0 function0, final long j, long j2, dup dupVar, float f, boolean z, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        long j3;
        dup dupVar2;
        final float f2;
        int i4;
        boolean z2;
        int i5;
        vci vciVar;
        dup dupVar3;
        float f3;
        Function0 function02;
        boolean z3;
        long j4;
        dup dupVar4;
        yci yciVar2;
        int i6;
        boolean z4;
        Object K;
        Object obj;
        vci vciVar2;
        Object K2;
        boolean h;
        Object K3;
        Object K4;
        Object K5;
        vm0 vm0Var;
        boolean h2;
        Object K6;
        Function0 function03;
        dup dupVar5;
        vci vciVar3;
        int i7;
        int i8;
        vm0 vm0Var2;
        boolean z5;
        Object K7;
        int i9;
        ?? r1;
        boolean z6;
        final boolean z7;
        final Function0 function04;
        final long j5;
        final yci yciVar3;
        boolean z8;
        Object K8;
        boolean z9;
        Object K9;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1264432942);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= oq5Var.e(j) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                j3 = j2;
                i3 |= ((i2 & 16) == 0 && oq5Var.e(j3)) ? 16384 : RemoteCameraConfig.Notification.ID;
            } else {
                j3 = j2;
            }
            if ((i & 196608) != 0) {
                dupVar2 = dupVar;
                i3 |= ((i2 & 32) == 0 && oq5Var.f(dupVar2)) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            } else {
                dupVar2 = dupVar;
            }
            if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
                f2 = f;
                i3 |= ((i2 & 64) == 0 && oq5Var.c(f2)) ? 1048576 : 524288;
            } else {
                f2 = f;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    i3 |= oq5Var.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
            }
            if ((i & 100663296) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 67108864 : 33554432;
            }
            if ((i3 & 38347923) == 38347922 || !oq5Var.z()) {
                oq5Var.U();
                i5 = i & 1;
                vciVar = vci.a;
                if (i5 != 0 || oq5Var.y()) {
                    yci yciVar4 = i10 == 0 ? vciVar : yciVar;
                    Function0 function05 = i11 == 0 ? null : function0;
                    if ((i2 & 16) != 0) {
                        j3 = kai.a(oq5Var);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) == 0) {
                        float f4 = 16;
                        dupVar3 = ugo.c(f4, f4);
                        i3 &= -458753;
                    } else {
                        dupVar3 = dupVar;
                    }
                    if ((i2 & 64) != 0) {
                        f2 = kai.a;
                        i3 &= -3670017;
                    }
                    if (i4 == 0) {
                        Function0 function06 = function05;
                        f3 = f2;
                        function02 = function06;
                        j4 = j3;
                        z3 = true;
                    } else {
                        Function0 function07 = function05;
                        f3 = f2;
                        function02 = function07;
                        z3 = z2;
                        j4 = j3;
                    }
                    dupVar4 = dupVar3;
                    yciVar2 = yciVar4;
                    i6 = i3;
                } else {
                    oq5Var.S();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    yciVar2 = yciVar;
                    i6 = i3;
                    z3 = z2;
                    f3 = f2;
                    j4 = j3;
                    function02 = function0;
                    dupVar4 = dupVar;
                }
                oq5Var.q();
                int i12 = (i6 & 112) ^ 48;
                z4 = (i12 <= 32 && oq5Var.h(bciVar)) || (i6 & 48) == 32;
                K = oq5Var.K();
                obj = gq5.a;
                if (!z4 || K == obj) {
                    K = new hv0(bciVar, null, 19);
                    oq5Var.k0(K);
                }
                bzf.c((Function1) K, oq5Var, 0);
                if (function02 == null) {
                    oq5Var.Z(-1857918639);
                    Object K10 = oq5Var.K();
                    if (K10 == obj) {
                        K10 = szf.g0(Boolean.FALSE);
                        oq5Var.k0(K10);
                    }
                    aqi aqiVar = (aqi) K10;
                    Unit unit = Unit.a;
                    if (i12 <= 32 || !oq5Var.h(bciVar)) {
                        vciVar2 = vciVar;
                        if ((i6 & 48) != 32) {
                            z8 = false;
                            K8 = oq5Var.K();
                            if (!z8 || K8 == obj) {
                                K8 = new rlg(bciVar, aqiVar, (Continuation) null, 6);
                                oq5Var.k0(K8);
                            }
                            gld.w(oq5Var, unit, (Function2) K8);
                            z9 = (i6 & 896) != 256;
                            K9 = oq5Var.K();
                            if (!z9 || K9 == obj) {
                                K9 = new dae(function02, aqiVar);
                                oq5Var.k0(K9);
                            }
                            gld.k(unit, (Function1) K9, oq5Var);
                            oq5Var.p(false);
                        }
                    } else {
                        vciVar2 = vciVar;
                    }
                    z8 = true;
                    K8 = oq5Var.K();
                    if (!z8) {
                    }
                    K8 = new rlg(bciVar, aqiVar, (Continuation) null, 6);
                    oq5Var.k0(K8);
                    gld.w(oq5Var, unit, (Function2) K8);
                    if ((i6 & 896) != 256) {
                    }
                    K9 = oq5Var.K();
                    if (!z9) {
                    }
                    K9 = new dae(function02, aqiVar);
                    oq5Var.k0(K9);
                    gld.k(unit, (Function1) K9, oq5Var);
                    oq5Var.p(false);
                } else {
                    vciVar2 = vciVar;
                    oq5Var.Z(-1861801296);
                    oq5Var.p(false);
                }
                K2 = oq5Var.K();
                if (K2 == obj) {
                    K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K2).a;
                boolean e = bciVar.e();
                h = oq5Var.h(mm6Var) | ((i12 <= 32 && oq5Var.h(bciVar)) || (i6 & 48) == 32);
                K3 = oq5Var.K();
                if (!h || K3 == obj) {
                    K3 = new y6g(8, mm6Var, bciVar);
                    oq5Var.k0(K3);
                }
                pd.c(0, 0, oq5Var, (Function0) K3, e);
                K4 = oq5Var.K();
                if (K4 == obj) {
                    K4 = new yoc();
                    oq5Var.k0(K4);
                }
                yoc yocVar = (yoc) K4;
                K5 = oq5Var.K();
                if (K5 == obj) {
                    K5 = wdp.J(0.0f, 0.0f, 30);
                    oq5Var.k0(K5);
                }
                vm0Var = (vm0) K5;
                Unit unit2 = Unit.a;
                h2 = ((i12 <= 32 && oq5Var.h(bciVar)) || (i6 & 48) == 32) | oq5Var.h(mm6Var);
                K6 = oq5Var.K();
                if (!h2 || K6 == obj) {
                    function03 = function02;
                    dupVar5 = dupVar4;
                    vciVar3 = vciVar2;
                    i7 = 16384;
                    i8 = i6;
                    vm0Var2 = vm0Var;
                    rlg rlgVar = new rlg(bciVar, mm6Var, vm0Var2, null, 7);
                    oq5Var.k0(rlgVar);
                    K6 = rlgVar;
                } else {
                    vm0Var2 = vm0Var;
                    function03 = function02;
                    dupVar5 = dupVar4;
                    vciVar3 = vciVar2;
                    i7 = 16384;
                    i8 = i6;
                }
                gld.w(oq5Var, unit2, (Function2) K6);
                yci d = d.d(vciVar3, 1.0f);
                z5 = (((i8 & 57344) ^ 24576) <= i7 && oq5Var.e(j4)) || (i8 & 24576) == i7;
                K7 = oq5Var.K();
                if (!z5 || K7 == obj) {
                    K7 = new mm0(j4, vm0Var2, 4);
                    oq5Var.k0(K7);
                }
                yci p1 = gut.p1(wyf.t(d, (Function0) K7));
                kfh d2 = ug3.d(b2c.b, false);
                i9 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, p1);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                WeakHashMap weakHashMap = rqv.w;
                long j6 = j4;
                int i13 = i8 >> 3;
                yci yciVar5 = yciVar2;
                dupVar2 = dupVar5;
                boolean z10 = z3;
                float f5 = f3;
                Function0 function08 = function03;
                androidx.compose.material.a.a(ild.C(-1095773922, new j26(wn5Var, 5), oq5Var), androidx.compose.ui.focus.a.a(gut.z(sqv.a(yciVar2, new n5g(z7l.h(oq5Var).e, q7g.e))), yocVar), bciVar, z10, dupVar2, f5, j, 0L, d85.m, c3x.c, oq5Var, (57344 & i13) | ((i8 << 3) & 896) | 905970182 | ((i8 >> 12) & 7168) | (458752 & i13) | ((i8 << 9) & 3670016), 128);
                oq5Var.p(true);
                if (bciVar.e()) {
                    r1 = 0;
                    oq5Var.Z(-1855740088);
                    oq5Var.p(false);
                    z6 = false;
                } else {
                    oq5Var.Z(355779373);
                    z6 = c3x.L(oq5Var);
                    r1 = 0;
                    oq5Var.p(false);
                }
                if (z6) {
                    oq5Var.Z(-1861801296);
                } else {
                    oq5Var.Z(-1855698140);
                    toc tocVar = (toc) oq5Var.j(es5.i);
                    boolean h3 = oq5Var.h(tocVar);
                    Object K11 = oq5Var.K();
                    if (h3 || K11 == obj) {
                        K11 = new fbi(yocVar, tocVar, null);
                        oq5Var.k0(K11);
                    }
                    bzf.c((Function1) K11, oq5Var, r1);
                }
                oq5Var.p(r1);
                z7 = z10;
                f2 = f5;
                function04 = function08;
                j5 = j6;
                yciVar3 = yciVar5;
            } else {
                oq5Var.S();
                yciVar3 = yciVar;
                function04 = function0;
                z7 = z2;
                j5 = j3;
            }
            final dup dupVar6 = dupVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: wai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        rbi.b(yci.this, bciVar, function04, j, j5, dupVar6, f2, z7, wn5Var, (hq5) obj2, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) != 0) {
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        oq5Var.U();
        i5 = i & 1;
        vciVar = vci.a;
        if (i5 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i4 == 0) {
        }
        dupVar4 = dupVar3;
        yciVar2 = yciVar4;
        i6 = i3;
        oq5Var.q();
        int i122 = (i6 & 112) ^ 48;
        if (i122 <= 32) {
        }
        K = oq5Var.K();
        obj = gq5.a;
        if (!z4) {
        }
        K = new hv0(bciVar, null, 19);
        oq5Var.k0(K);
        bzf.c((Function1) K, oq5Var, 0);
        if (function02 == null) {
        }
        K2 = oq5Var.K();
        if (K2 == obj) {
        }
        mm6 mm6Var2 = ((fs5) K2).a;
        boolean e2 = bciVar.e();
        h = oq5Var.h(mm6Var2) | ((i122 <= 32 && oq5Var.h(bciVar)) || (i6 & 48) == 32);
        K3 = oq5Var.K();
        if (!h) {
        }
        K3 = new y6g(8, mm6Var2, bciVar);
        oq5Var.k0(K3);
        pd.c(0, 0, oq5Var, (Function0) K3, e2);
        K4 = oq5Var.K();
        if (K4 == obj) {
        }
        yoc yocVar2 = (yoc) K4;
        K5 = oq5Var.K();
        if (K5 == obj) {
        }
        vm0Var = (vm0) K5;
        Unit unit22 = Unit.a;
        h2 = ((i122 <= 32 && oq5Var.h(bciVar)) || (i6 & 48) == 32) | oq5Var.h(mm6Var2);
        K6 = oq5Var.K();
        if (h2) {
        }
        function03 = function02;
        dupVar5 = dupVar4;
        vciVar3 = vciVar2;
        i7 = 16384;
        i8 = i6;
        vm0Var2 = vm0Var;
        rlg rlgVar2 = new rlg(bciVar, mm6Var2, vm0Var2, null, 7);
        oq5Var.k0(rlgVar2);
        K6 = rlgVar2;
        gld.w(oq5Var, unit22, (Function2) K6);
        yci d3 = d.d(vciVar3, 1.0f);
        if (((i8 & 57344) ^ 24576) <= i7) {
        }
        K7 = oq5Var.K();
        if (!z5) {
        }
        K7 = new mm0(j4, vm0Var2, 4);
        oq5Var.k0(K7);
        yci p12 = gut.p1(wyf.t(d3, (Function0) K7));
        kfh d22 = ug3.d(b2c.b, false);
        i9 = oq5Var.P;
        a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, p12);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i9, oq5Var, i9, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        WeakHashMap weakHashMap2 = rqv.w;
        long j62 = j4;
        int i132 = i8 >> 3;
        yci yciVar52 = yciVar2;
        dupVar2 = dupVar5;
        boolean z102 = z3;
        float f52 = f3;
        Function0 function082 = function03;
        androidx.compose.material.a.a(ild.C(-1095773922, new j26(wn5Var, 5), oq5Var), androidx.compose.ui.focus.a.a(gut.z(sqv.a(yciVar2, new n5g(z7l.h(oq5Var).e, q7g.e))), yocVar2), bciVar, z102, dupVar2, f52, j, 0L, d85.m, c3x.c, oq5Var, (57344 & i132) | ((i8 << 3) & 896) | 905970182 | ((i8 >> 12) & 7168) | (458752 & i132) | ((i8 << 9) & 3670016), 128);
        oq5Var.p(true);
        if (bciVar.e()) {
        }
        if (z6) {
        }
        oq5Var.p(r1);
        z7 = z102;
        f2 = f52;
        function04 = function082;
        j5 = j62;
        yciVar3 = yciVar52;
        final dup dupVar62 = dupVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final bci c(int i, int i2, hq5 hq5Var, boolean z) {
        cci cciVar = cci.b;
        if ((i2 & 1) != 0) {
            cciVar = cci.a;
        }
        cci cciVar2 = cciVar;
        if ((i2 & 2) != 0) {
            z = false;
        }
        return androidx.compose.material.a.c(cciVar2, a, z, hq5Var, (i & 14) | ((i << 6) & 7168), 4);
    }
}
