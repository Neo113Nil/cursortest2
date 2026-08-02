package defpackage;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class wjv {
    public static final float c;
    public static final float d;
    public static final w5d a = new w5d(new vru(2));
    public static final float b = 8;
    public static final float e = (float) 0.5d;

    static {
        float f = 4;
        c = f;
        d = f;
    }

    public static Unit a(RuntimeShader runtimeShader, float f, zco zcoVar) {
        zcoVar.getClass();
        runtimeShader.setFloatUniform("resolution", nmq.d(zcoVar.p), nmq.b(zcoVar.p));
        runtimeShader.setFloatUniform("blurStart", 0.05f);
        runtimeShader.setFloatUniform("maxSigma", f);
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "image");
        createRuntimeShaderEffect.getClass();
        zcoVar.h(new fi0(createRuntimeShaderEffect));
        return Unit.a;
    }

    public static final void b(String str, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(529197944);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2);
        if ((i2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            xcs.b(str, null, x5v.c, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, ((w3v) oq5Var2.j(x3v.a)).a.a, oq5Var, i2 & 14, 3120, 54778);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 19);
        }
    }

    public static final void c(kjv kjvVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(118442556);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (Build.VERSION.SDK_INT < 33 || !z) {
            oq5Var.Z(-1940670990);
            e(kjvVar, yciVar, oq5Var, ((i2 >> 3) & 112) | (i2 & 14));
            oq5Var.p(false);
        } else {
            oq5Var.Z(-1940726604);
            d(kjvVar, yciVar, oq5Var, ((i2 >> 3) & 112) | (i2 & 14));
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(kjvVar, z, yciVar, i);
        }
    }

    public static final void d(kjv kjvVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(63193527);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            float n0 = jx7Var.n0(60);
            float n02 = jx7Var.n0(1);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new RuntimeShader("\n    uniform shader image;\n    uniform float2 resolution;\n    uniform float blurStart;\n    uniform float maxSigma;\n\n    half4 sampleSafe(float2 coord) {\n        if (coord.x < 0.0 || coord.x >= resolution.x ||\n            coord.y < 0.0 || coord.y >= resolution.y) {\n            return half4(0.0);\n        }\n        return image.eval(coord);\n    }\n\n    half4 main(float2 coord) {\n        float t     = clamp((coord.y / resolution.y - blurStart) / (1.0 - blurStart), 0.0, 1.0);\n        float sigma = t * maxSigma;\n\n        if (sigma < 1.0) { return sampleSafe(coord); }\n\n        float s      = sigma * 0.5;\n        half4 result = half4(0.0);\n        float total  = 0.0;\n\n        for (int dy = -2; dy <= 2; dy++) {\n            float wy = exp(-float(dy * dy) * 0.125);\n            for (int dx = -2; dx <= 2; dx++) {\n                float w  = exp(-float(dx * dx) * 0.125) * wy;\n                result  += sampleSafe(coord + float2(float(dx), float(dy)) * s) * w;\n                total   += w;\n            }\n        }\n        return result / total;\n    }\n");
                oq5Var.k0(K);
            }
            RuntimeShader runtimeShader = (RuntimeShader) K;
            boolean h = oq5Var.h(runtimeShader) | oq5Var.c(n0);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new kz4(runtimeShader, n0, 5);
                oq5Var.k0(K2);
            }
            yci a2 = a.a(yciVar, (Function1) K2);
            boolean c2 = oq5Var.c(n02) | ((i2 & 14) == 4);
            Object K3 = oq5Var.K();
            if (c2 || K3 == kjnVar) {
                K3 = new sjv(n02, kjvVar);
                oq5Var.k0(K3);
            }
            ksw.j(0, oq5Var, a2, (Function1) K3);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tjv(kjvVar, yciVar, i, 1);
        }
    }

    public static final void e(kjv kjvVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(339586945);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float n0 = ((jx7) oq5Var.j(es5.h)).n0(1);
            boolean c2 = oq5Var.c(n0) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (c2 || K == gq5.a) {
                K = new sjv(kjvVar, n0);
                oq5Var.k0(K);
            }
            ksw.j((i2 >> 3) & 14, oq5Var, yciVar, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tjv(kjvVar, yciVar, i, 0);
        }
    }

    public static final void f(float f, float f2, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1541112472);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new x30(f, f2, 1);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            int i4 = (((((i2 >> 3) & 112) | ((i2 >> 9) & 14)) << 6) & 896) | 6;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i4 >> 6) & 14, wn5Var, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o9v(f, f2, yciVar, wn5Var, i);
        }
    }

    public static final void g(final String str, final boolean z, final boolean z2, final jzb jzbVar, final boolean z3, hq5 hq5Var, final int i) {
        long j;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-571199588);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.g(z2) ? 256 : 128) | (oq5Var2.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 2048 : 1024) | (oq5Var2.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            if (z2) {
                oq5Var2.Z(53704316);
                j = ((dq0) oq5Var2.j(eq0.a)).b.d;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(53752118);
                oq5Var2.p(false);
                j = x5v.a;
            }
            final long j2 = j;
            final ges b2 = ges.b(((w3v) oq5Var2.j(x3v.a)).a.b, 0L, 0L, null, null, 0L, 0, 0L, null, null, 0, Build.VERSION.SDK_INT >= 33 && z3 ? 2 : 1, 12582911);
            if (jzbVar != null || z) {
                oq5Var = oq5Var2;
                oq5Var.Z(53950580);
                bg3.a(null, null, false, ild.C(-1334451059, new pyc() { // from class: pjv
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
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        jzb jzbVar2 = jzb.this;
                        long j3 = j2;
                        xme E = ox6.E(jzbVar2, j3, hq5Var2, 2);
                        xme xmeVar = z ? new xme("linkIcon", v7g.z(16), v7g.z(16), new wn5(new bu0(j3, 11), -720523109, true)) : null;
                        xv7.i(new mn0(6, str, (ArrayList) null), null, j3, 0L, 0L, 3, 0L, 2, false, 4, 0, bow.l(E, xmeVar), null, b2, bow.k(cVar, new xme[]{E, xmeVar}), null, hq5Var2, 0, 134220848, 612090);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 7);
                oq5Var.p(false);
            } else {
                oq5Var2.Z(54667021);
                xcs.b(str, null, j2, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 4, 0, null, b2, oq5Var2, i2 & 14, 3120, 54778);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(str, z, z2, jzbVar, z3, i) { // from class: qjv
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ jzb d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    wjv.g(this.a, this.b, this.c, this.d, this.e, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(qo6 qo6Var, w4k w4kVar, hq5 hq5Var, int i) {
        int i2;
        w4k w4kVar2;
        Integer num;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(433786728);
        if ((i & 6) == 0) {
            i2 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(w4kVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            w4kVar2 = w4kVar;
        } else {
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(w4kVar, null, d.c(vciVar, 1.0f), b2c.f, hd6.a, 0.0f, null, oq5Var, ((i2 >> 3) & 14) | 28080, 96);
            w4kVar2 = w4kVar;
            switch (qo6Var.ordinal()) {
                case 0:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    num = null;
                    break;
                case 1:
                    num = 2131231281;
                    break;
                case 3:
                    num = 2131231280;
                    break;
                default:
                    b6e.s();
                    return;
            }
            if (num == null) {
                oq5Var.Z(2066354960);
            } else {
                oq5Var.Z(2066354961);
                irf.r(a0g.E(num.intValue(), 0, oq5Var), null, c3x.y(e, w5v.a, d.c(vciVar, 1.0f), irf.Q(qo6Var, oq5Var)), null, hd6.g, 0.0f, null, oq5Var, 24624, 104);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(qo6Var, w4kVar2, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x027d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3.K(), java.lang.Integer.valueOf(r7)) == false) goto L156;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final int i, final Integer num, final String str, final qo6 qo6Var, final String str2, final String str3, final jzb jzbVar, final long j, final float f, final boolean z, final boolean z2, final boolean z3, final Function0 function0, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final Function2 function2, final boolean z8, final Function0 function02, final yci yciVar, hq5 hq5Var, final int i2) {
        int i3;
        Function0 function03;
        oq5 oq5Var;
        str2.getClass();
        function0.getClass();
        function2.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-450776606);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.d(qo6Var.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        int i5 = RemoteCameraConfig.Notification.ID;
        if (i4 == 0) {
            i3 |= oq5Var2.f(str2) ? 16384 : 8192;
        }
        int i6 = i2 & 196608;
        int i7 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i6 == 0) {
            i3 |= oq5Var2.f(str3) ? 131072 : 65536;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 1048576 : 524288;
        }
        int i8 = 12582912 & i2;
        int i9 = RemoteCameraConfig.Camera.BITRATE;
        if (i8 == 0) {
            i3 |= oq5Var2.e(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= oq5Var2.c(f) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= oq5Var2.g(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i10 = i3;
        int i11 = (oq5Var2.g(z2) ? 4 : 2) | (oq5Var2.g(z3) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.g(z4) ? 2048 : 1024);
        if (oq5Var2.g(z5)) {
            i5 = 16384;
        }
        int i12 = i11 | i5;
        if (oq5Var2.g(z6)) {
            i7 = 131072;
        }
        int i13 = i12 | i7 | (oq5Var2.g(z7) ? 1048576 : 524288);
        if (oq5Var2.h(function2)) {
            i9 = 8388608;
        }
        int i14 = i13 | i9 | (oq5Var2.g(z8) ? 67108864 : 33554432) | (oq5Var2.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        char c2 = oq5Var2.f(yciVar) ? (char) 4 : (char) 2;
        if ((i10 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (c2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean z9 = (i10 & 14) == 4;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z9 || K == kjnVar) {
                K = new kjv(c3x.f(i), p85.a(pd.b0(c3x.f(i)), 0.0f, 0.8f, 11).b());
                oq5Var2.k0(K);
            }
            kjv kjvVar = (kjv) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = vq2.a(1.0f);
                oq5Var2.k0(K2);
            }
            final fk0 fk0Var = (fk0) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            final mm6 mm6Var = ((fs5) K3).a;
            Function0 function04 = (Function0) oq5Var2.j(ieo.a);
            boolean h = oq5Var2.h(fk0Var);
            Object K4 = oq5Var2.K();
            if (h || K4 == kjnVar) {
                K4 = new en4(fk0Var, 2);
                oq5Var2.k0(K4);
            }
            yci a2 = a.a(yciVar, (Function1) K4);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i15 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                function03 = function04;
            } else {
                function03 = function04;
            }
            ouj.x(i15, oq5Var2, i15, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            vci vciVar = vci.a;
            yci c3 = d.c(vciVar, 1.0f);
            iz2 iz2Var2 = b2c.f;
            b bVar = b.a;
            yci z10 = xv.z(bVar.a(c3, iz2Var2), 0.8f);
            kfh d3 = ug3.d(iz2Var, false);
            int i16 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, z10);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d3, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i16))) {
                ouj.x(i16, oq5Var2, i16, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            c(kjvVar, z4, ezf.N(d.j(bVar.a(vciVar, iz2Var2), fma.c(j), fma.b(j)), f), oq5Var2, (i14 >> 6) & 112);
            final boolean booleanValue = ((Boolean) oq5Var2.j(vpg.a)).booleanValue();
            yci u = xp3.u(ezf.N(d.j(bVar.a(vciVar, iz2Var2), fma.c(j), fma.b(j)), f), a);
            boolean z11 = !z;
            final Function0 function05 = function03;
            boolean g = oq5Var2.g(booleanValue) | ((i14 & 234881024) == 67108864) | oq5Var2.h(mm6Var) | oq5Var2.h(fk0Var) | ((i14 & 1879048192) == 536870912) | ((i14 & 896) == 256) | ((i14 & 112) == 32) | oq5Var2.f(function05);
            Object K5 = oq5Var2.K();
            if (g || K5 == kjnVar) {
                K5 = new Function0() { // from class: ujv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z12 = booleanValue;
                        mm6 mm6Var2 = mm6Var;
                        boolean z13 = z3;
                        Function0 function06 = function05;
                        Function0 function07 = function0;
                        fk0 fk0Var2 = fk0Var;
                        if (z12 && z8) {
                            x97.y(mm6Var2, null, null, new r32(fk0Var2, function02, function07, z13, function06, (Continuation) null), 3);
                        } else {
                            if (z13) {
                                function06.invoke();
                            }
                            x97.y(mm6Var2, null, null, new v41(4, fk0Var2, null), 3);
                            function07.invoke();
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K5);
            }
            ug3.a(androidx.compose.foundation.a.d(u, null, null, z11, null, null, (Function0) K5, 24), oq5Var2, 0);
            oq5Var2.p(true);
            oq5Var = oq5Var2;
            f(f, ff7.Q(fma.c(j) * 0.37f, oq5Var2) / 2, ezf.N(bVar.a(d.j(vciVar, fma.c(j), fma.b(j)), iz2Var2), f), ild.C(1029391979, new Function2() { // from class: njv
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v19 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    yci yciVar2;
                    boolean z12;
                    ?? r1;
                    jzk jzkVar = vnj.i;
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    float f2 = f;
                    boolean c4 = oq5Var4.c(f2);
                    Object K6 = oq5Var4.K();
                    Object obj3 = gq5.a;
                    if (c4 || K6 == obj3) {
                        K6 = new vp(6, f2);
                        oq5Var4.k0(K6);
                    }
                    vci vciVar2 = vci.a;
                    yci a3 = a.a(vciVar2, (Function1) K6);
                    ynn i17 = irv.i(oq5Var4);
                    Function2 function22 = function2;
                    boolean f3 = oq5Var4.f(function22);
                    Object K7 = oq5Var4.K();
                    if (f3 || K7 == obj3) {
                        K7 = new im0(function22, 12);
                        oq5Var4.k0(K7);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(a3, i17, 0L, 0.0f, null, (Function2) K7, 14);
                    ta5 a4 = sa5.a(qx0.c, b2c.o, oq5Var4, 48);
                    int i18 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                    yci H3 = vnj.H(oq5Var4, b2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar2);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a4, wp5.f);
                    g0g.U(oq5Var4, l3, wp5.e);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i18))) {
                        ouj.x(i18, oq5Var4, i18, kb5Var5);
                    }
                    g0g.U(oq5Var4, H3, wp5.d);
                    boolean booleanValue2 = ((Boolean) oq5Var4.j(koe.a)).booleanValue();
                    long j2 = j;
                    if (booleanValue2) {
                        oq5Var4.Z(-781969718);
                        ug3.a(androidx.compose.foundation.a.b(d.m(vciVar2, fma.c(j2) * 0.37f), d85.l, jzkVar), oq5Var4, 0);
                        oq5Var4.p(false);
                        r1 = 0;
                    } else {
                        oq5Var4.Z(-781694097);
                        boolean z13 = z7;
                        String str4 = str;
                        if (z13) {
                            oq5Var4.Z(-781679341);
                            qhi.b(str4, qmu.a, d.m(vciVar2, fma.c(j2) * 0.37f), false, oq5Var4, 48, 8);
                            oq5Var4.p(false);
                            z12 = false;
                        } else {
                            oq5Var4.Z(-781278263);
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = str4;
                            qo6 qo6Var2 = qo6Var;
                            yci u2 = xp3.u(vciVar2, irf.Q(qo6Var2, oq5Var4));
                            switch (qo6Var2.ordinal()) {
                                case 3:
                                    Integer num2 = num;
                                    if (num2 != null) {
                                        yciVar2 = androidx.compose.foundation.a.b(vciVar2, c3x.f(num2.intValue()), jzkVar);
                                        z12 = false;
                                        ltg.e(qo6Var2, str5, d.m(u2.f(yciVar2), fma.c(j2) * 0.37f), hd6.a, null, wdp.d, wdp.e, ild.C(-2081957607, new olu(6, qo6Var2), oq5Var4), oq5Var4, 14355456, 16);
                                        oq5Var4.p(false);
                                        break;
                                    }
                                case 0:
                                case 1:
                                case 2:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                    yciVar2 = vciVar2;
                                    z12 = false;
                                    ltg.e(qo6Var2, str5, d.m(u2.f(yciVar2), fma.c(j2) * 0.37f), hd6.a, null, wdp.d, wdp.e, ild.C(-2081957607, new olu(6, qo6Var2), oq5Var4), oq5Var4, 14355456, 16);
                                    oq5Var4.p(false);
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                        }
                        oq5Var4.p(z12);
                        r1 = z12;
                    }
                    String str6 = str3;
                    if (str6 == null) {
                        oq5Var4.Z(-780052802);
                        u1g.l(oq5Var4, d.m(vciVar2, wjv.b));
                        oq5Var4.p(r1);
                    } else {
                        oq5Var4.Z(-779964545);
                        u1g.l(oq5Var4, d.m(vciVar2, wjv.c));
                        wjv.b(str6, oq5Var4, r1);
                        u1g.l(oq5Var4, d.m(vciVar2, wjv.d));
                        oq5Var4.p(r1);
                    }
                    wjv.g(str2, z2, z6, jzbVar, z5, oq5Var4, 0);
                    oq5Var4.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i10 >> 24) & 14) | 3072);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: ojv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i2 | 1);
                    wjv.i(i, num, str, qo6Var, str2, str3, jzbVar, j, f, z, z2, z3, function0, z4, z5, z6, z7, function2, z8, function02, yciVar, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final kjv kjvVar, final long j, final float f, final boolean z, final yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        kjvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-743278117);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci c2 = d.c(yciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            c(kjvVar, z, ezf.N(d.j(b.a.a(vci.a, b2c.f), fma.c(j), fma.b(j)), f), oq5Var, ((i2 >> 6) & 112) | (i2 & 14));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: rjv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wjv.j(kjv.this, j, f, z, yciVar, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static o6g k(long j) {
        Pair pair;
        Pair[] pairArr = new Pair[17];
        for (int i = 0; i < 17; i++) {
            if (i < 16) {
                float f = i / 15;
                float c2 = yhn.c(f, 0.0f, 1.0f);
                int i2 = 1;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (i2 < 6) {
                    float f4 = i2 / 5.0f;
                    float f5 = 1.0f - f4;
                    float f6 = f4 * f4;
                    float f7 = f5 * f5 * 3.0f * f4;
                    float f8 = f5 * 3.0f * f6;
                    float f9 = f6 * f4;
                    float f10 = (0.55f * f8) + (f7 * 0.6f) + f9;
                    float f11 = (f8 * 0.6f) + (f7 * 0.4f) + f9;
                    if (c2 <= f10 || i2 == 5) {
                        float f12 = f10 - f2;
                        r5 = su4.e(f11, f3, f12 > 0.001f ? yhn.c((c2 - f2) / f12, 0.0f, 1.0f) : 0.0f, f3);
                        pair = new Pair(Float.valueOf(f * 0.5f), new d85(c3x.f(aa5.d(c3x.U(j), r5, c3x.U(d85.m)))));
                    } else {
                        i2++;
                        f3 = f11;
                        f2 = f10;
                    }
                }
                pair = new Pair(Float.valueOf(f * 0.5f), new d85(c3x.f(aa5.d(c3x.U(j), r5, c3x.U(d85.m)))));
            } else {
                pair = new Pair(Float.valueOf(1.0f), new d85(d85.m));
            }
            pairArr[i] = pair;
        }
        return y9w.U((Pair[]) Arrays.copyOf(pairArr, 17), 14);
    }
}
