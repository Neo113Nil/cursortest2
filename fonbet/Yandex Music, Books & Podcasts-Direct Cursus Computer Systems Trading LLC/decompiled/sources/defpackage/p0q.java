package defpackage;

import androidx.compose.animation.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p0q {
    static {
        new ges(0L, v7g.z(16), null, null, null, null, null, 0L, null, 0, 0L, null, null, 0, 16777213);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final ges gesVar, final long j, final long j2, final String str2, final String str3, yci yciVar, hq5 hq5Var, final int i, final int i2) {
        yci yciVar2;
        int i3;
        Object K;
        Object obj;
        final aqi aqiVar;
        int i4;
        yci yciVar3;
        final yci yciVar4;
        xmn r;
        dfi.s(str, str2, str3);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1800931106);
        int i5 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(gesVar) ? 256 : 128) | (oq5Var.e(j) ? 2048 : 1024) | (oq5Var.e(j2) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(str2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(str3) ? 1048576 : 524288);
        int i6 = i2 & 256;
        if (i6 != 0) {
            i5 |= 100663296;
        } else if ((i & 100663296) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 67108864 : 33554432;
            i3 = i5;
            if ((i3 & 38347923) == 38347922 || !oq5Var.z()) {
                vci vciVar = vci.a;
                if (i6 != 0) {
                    yciVar2 = vciVar;
                }
                Object[] objArr = new Object[0];
                K = oq5Var.K();
                obj = gq5.a;
                if (K == obj) {
                    K = new qkp(27);
                    oq5Var.k0(K);
                }
                yci yciVar5 = yciVar2;
                aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
                yci a = b.a(yciVar5, weo.Q(0.0f, 400.0f, null, 5), 2);
                kfh d = ug3.d(b2c.b, false);
                i4 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    yciVar3 = yciVar5;
                    oq5Var.Z(448192465);
                    wn5 C = ild.C(387140258, new pyc() { // from class: k0q
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            c cVar = (c) obj2;
                            hq5 hq5Var2 = (hq5) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    return Unit.a;
                                }
                            }
                            float d2 = cVar.d();
                            float c = cVar.c();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            aqi aqiVar2 = aqiVar;
                            boolean f = oq5Var3.f(aqiVar2);
                            Object K2 = oq5Var3.K();
                            if (f || K2 == gq5.a) {
                                K2 = new jc(aqiVar2, 25);
                                oq5Var3.k0(K2);
                            }
                            p0q.c(str, (Function0) K2, 3, d2, c, gesVar, j, str2, j2, str3, true, null, oq5Var3, 0);
                            return Unit.a;
                        }
                    }, oq5Var);
                    oq5Var = oq5Var;
                    bg3.a(null, null, false, C, oq5Var, 3072, 7);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(447844118);
                    yci c = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(vciVar, "expandable_text"), "expandable_text_with_expand_more", Boolean.FALSE);
                    boolean f = oq5Var.f(aqiVar);
                    Object K2 = oq5Var.K();
                    if (f || K2 == obj) {
                        K2 = new jc(aqiVar, 24);
                        oq5Var.k0(K2);
                    }
                    yciVar3 = yciVar5;
                    xcs.b(str, e((i3 >> 12) & 896, oq5Var, c, str3, (Function0) K2), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var, (i3 & 14) | ((i3 >> 3) & 896), (i3 << 12) & 3670016, 65528);
                    oq5Var.p(false);
                    oq5Var = oq5Var;
                }
                oq5Var.p(true);
                yciVar4 = yciVar3;
            } else {
                oq5Var.S();
                yciVar4 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: l0q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        p0q.a(str, gesVar, j, j2, str2, str3, yciVar4, (hq5) obj2, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i3 = i5;
        if ((i3 & 38347923) == 38347922) {
        }
        vci vciVar2 = vci.a;
        if (i6 != 0) {
        }
        Object[] objArr2 = new Object[0];
        K = oq5Var.K();
        obj = gq5.a;
        if (K == obj) {
        }
        yci yciVar52 = yciVar2;
        aqiVar = (aqi) o2g.g0(objArr2, null, (Function0) K, oq5Var, 0, 6);
        yci a2 = b.a(yciVar52, weo.Q(0.0f, 400.0f, null, 5), 2);
        kfh d2 = ug3.d(b2c.b, false);
        i4 = oq5Var.P;
        a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, a2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d2, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        if (((Boolean) aqiVar.getValue()).booleanValue()) {
        }
        oq5Var.p(true);
        yciVar4 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(final String str, final Function0 function0, final int i, final ges gesVar, final long j, final long j2, final String str2, final String str3, final yci yciVar, hq5 hq5Var, final int i2) {
        int i3;
        ges gesVar2;
        str.getClass();
        function0.getClass();
        str2.getClass();
        str3.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1706692832);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            gesVar2 = gesVar;
            i3 |= oq5Var.f(gesVar2) ? 2048 : 1024;
        } else {
            gesVar2 = gesVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.e(j2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.f(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.f(str3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i3 |= oq5Var.g(false) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((306783379 & i3) == 306783378 && oq5Var.z()) {
            oq5Var.S();
        } else {
            final ges gesVar3 = gesVar2;
            bg3.a(yciVar, null, false, ild.C(-1414801354, new pyc() { // from class: n0q
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    p0q.c(str, function0, i, cVar.d(), cVar.c(), gesVar3, j, str2, j2, str3, false, null, hq5Var2, 0);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i3 >> 27) & 14) | 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: o0q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p0q.b(str, function0, i, gesVar, j, j2, str2, str3, yciVar, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final Function0 function0, final int i, final float f, final float f2, final ges gesVar, final long j, final String str2, final long j2, final String str3, final boolean z, yci yciVar, hq5 hq5Var, final int i2) {
        boolean z2;
        boolean z3;
        vci vciVar;
        final yci yciVar2;
        str.getClass();
        function0.getClass();
        str2.getClass();
        str3.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1063227346);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.d(i) ? 256 : 128) | (oq5Var.c(f) ? 2048 : 1024) | (oq5Var.c(f2) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(gesVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.e(j) ? 1048576 : 524288) | (oq5Var.f(str2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.e(j2) ? 67108864 : 33554432) | (oq5Var.f(str3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (oq5Var.g(z) ? (char) 4 : (char) 2) | '0';
        if ((i3 & 306783379) == 306783378 && (i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar2 = vci.a;
            if (z) {
                oq5Var.Z(-777531911);
                if (kes.a(gesVar.a.b, kes.c)) {
                    xq0.q("MultiParagraph does not correctly calculate the line length if the fontSize is TextUnit.Unspecified");
                    return;
                }
                boolean z4 = ((i3 & 234881024) == 67108864) | ((i3 & 29360128) == 8388608);
                Object K = oq5Var.K();
                if (z4 || K == gq5.a) {
                    K = new l1m(str2, 4, j2);
                    oq5Var.k0(K);
                }
                mn0 mn0Var = new mn0(6, str, (ArrayList) null);
                kn0 kn0Var = new kn0();
                ((Function1) K).invoke(kn0Var);
                int i5 = i3 >> 3;
                rn0 A = leu.A(mn0Var, i, f, f2, new nim(kn0Var.h(), "…"), gesVar, true, false, 0, oq5Var, (i5 & 896) | (i5 & 112) | 100663296 | (i5 & 7168) | SQLiteDatabase.OPEN_NOMUTEX | (i3 & 458752), 6, 704);
                xcs.c(A.a, d(A.b, function0, str3, oq5Var, 6 | ((i3 << 3) & 896) | ((i3 >> 18) & 7168)), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, gesVar, oq5Var, (i3 >> 12) & 896, (i3 << 6) & 29360128, 131064);
                oq5Var = oq5Var;
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-776328026);
                int i6 = i3 >> 12;
                cds a = ids.a(o5g.O(0, 1, oq5Var), str, gesVar, 2, false, i, ia6.b(ff7.K(f, oq5Var), ff7.K(f2, oq5Var), 5), 968);
                int i7 = i3 << 3;
                int i8 = i3 >> 18;
                yci d = d(a.c(), function0, str3, oq5Var, 6 | (i7 & 896) | (i8 & 7168));
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i9 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, d);
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
                o2g.e(a, null, j, oq5Var, 8 | (i6 & 896));
                if (a.c()) {
                    oq5Var.Z(1764355990);
                    u1g.l(oq5Var, d.e(vciVar2, 2));
                    z2 = true;
                    vciVar = vciVar2;
                    z3 = false;
                    xcs.b(str2, null, j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar, oq5Var, ((i3 >> 21) & 14) | (i8 & 896), (3670016 & i7) | 3120, 55290);
                    oq5Var = oq5Var;
                } else {
                    z2 = true;
                    z3 = false;
                    vciVar = vciVar2;
                    oq5Var.Z(1758307766);
                }
                oq5Var.p(z3);
                oq5Var.p(z2);
                oq5Var.p(z3);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(str, function0, i, f, f2, gesVar, j, str2, j2, str3, z, yciVar2, i2) { // from class: m0q
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ ges f;
                public final /* synthetic */ long g;
                public final /* synthetic */ String h;
                public final /* synthetic */ long i;
                public final /* synthetic */ String j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ yci l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    p0q.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final yci d(boolean z, Function0 function0, String str, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(302263318);
        yci yciVar = vci.a;
        yci c = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar, "expandable_text"), "expandable_text_with_expand_more", Boolean.valueOf(z));
        if (z) {
            int i2 = i >> 3;
            yciVar = e((i2 & 896) | (i2 & 112) | 6, oq5Var, yciVar, str, function0);
        }
        yci f = c.f(yciVar);
        oq5Var.p(false);
        return f;
    }

    public static final yci e(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        yci C = wyf.C(yciVar, function0, 0.0f, 4, 10);
        boolean z = (((i & 896) ^ 384) > 256 && ((oq5) hq5Var).f(str)) || (i & 384) == 256;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            K = new srp(str, 3);
            oq5Var.k0(K);
        }
        return nfp.a(C, (Function1) K);
    }
}
