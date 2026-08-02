package defpackage;

import android.content.res.Configuration;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class w8u {
    public static final float a = 210;
    public static final float b = 108;
    public static final float c = 112;
    public static final yk5 d = new yk5(new cma(10), new cma(16));
    public static final yk5 e = new yk5(new cma(8), new cma(0));
    public static final fq4 f = new fq4(0.2f, 1.0f);

    public static final void a(final boolean z, final boolean z2, boolean z3, final m6u m6uVar, final Function0 function0, final Function0 function02, final Function1 function1, final Function0 function03, final Function0 function04, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1764063872);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(m6uVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var.h(function04) ? 67108864 : 33554432;
        }
        if (oq5Var.P(i2 & 1, (38347923 & i2) != 38347922)) {
            act S = weo.S(100, 0, null, 6);
            etn.f(z3, null, c.e(S, 2), c.f(S, 2), null, ild.C(-1982415272, new pyc() { // from class: o8u
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Float f2;
                    boolean z4;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    ((am0) obj).getClass();
                    vci vciVar = vci.a;
                    yci a2 = a.a(androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), d85.b(d85.b, 0.4f, 0.0f, 0.0f, 0.0f, 14), vnj.i), "video_clip_overlay");
                    iz2 iz2Var = b2c.b;
                    kfh d2 = ug3.d(iz2Var, false);
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    int i3 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    yci H = vnj.H(hq5Var2, a2);
                    xp5.T.getClass();
                    Function0 function05 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(function05);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(hq5Var2, d2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(hq5Var2, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var2, i3, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(hq5Var2, H, kb5Var4);
                    Function0 function06 = Function0.this;
                    boolean f3 = oq5Var2.f(function06);
                    Object K = oq5Var2.K();
                    Object obj4 = gq5.a;
                    if (f3 || K == obj4) {
                        K = new gct(9, function06);
                        oq5Var2.k0(K);
                    }
                    float f4 = 10;
                    yci m = androidx.compose.foundation.layout.a.m(vciVar, f4);
                    b bVar = b.a;
                    yci a3 = bVar.a(m, iz2Var);
                    agr agrVar = eq0.a;
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    long b2 = d85.b(((dq0) oq5Var3.j(agrVar)).c.a, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                    tgo tgoVar = ugo.a;
                    float f5 = 48;
                    yci a4 = a.a(d.m(androidx.compose.foundation.a.b(a3, b2, tgoVar), f5), "video_clip_mute");
                    boolean z5 = z2;
                    aae.a((Function0) K, com.yandex.music.core.ui.compose.b.c(a4, "is_mute", Boolean.valueOf(z5)), false, ild.C(2046000890, new k4m(10, z5), hq5Var2), hq5Var2, 24576, 12);
                    boolean z6 = z;
                    boolean g = oq5Var2.g(z6);
                    Function0 function07 = function02;
                    boolean f6 = g | oq5Var2.f(function07);
                    Function0 function08 = function0;
                    boolean f7 = f6 | oq5Var2.f(function08);
                    Object K2 = oq5Var2.K();
                    if (f7 || K2 == obj4) {
                        K2 = new x2h(z6, function07, function08, 2);
                        oq5Var2.k0(K2);
                    }
                    aae.a((Function0) K2, ksw.D(com.yandex.music.core.ui.compose.b.c(a.a(xv.z(bVar.a(vciVar, b2c.f), 0.5f), "video_clip_play"), "is_playing", Boolean.valueOf(z6)), null, rvf.M(z6 ? R.string.pause : R.string.listen, hq5Var2)), false, ild.C(-1963839631, new k4m(11, z6), hq5Var2), hq5Var2, 24576, 12);
                    Configuration configuration = (Configuration) oq5Var2.j(AndroidCompositionLocals_androidKt.a);
                    configuration.getClass();
                    if (configuration.smallestScreenWidthDp >= 600) {
                        oq5Var2.Z(1550550212);
                        z4 = false;
                        oq5Var2.p(false);
                        f2 = null;
                    } else {
                        oq5Var2.Z(1579375097);
                        Function0 function09 = function03;
                        boolean f8 = oq5Var2.f(function09);
                        Object K3 = oq5Var2.K();
                        if (f8 || K3 == obj4) {
                            K3 = new gct(10, function09);
                            oq5Var2.k0(K3);
                        }
                        f2 = null;
                        aae.a((Function0) K3, ksw.D(a.a(d.m(androidx.compose.foundation.a.b(bVar.a(androidx.compose.foundation.layout.a.m(vciVar, f4), b2c.d), d85.b(((dq0) oq5Var3.j(agrVar)).c.a, 0.5f, 0.0f, 0.0f, 0.0f, 14), tgoVar), f5), "video_clip_full_screen"), rvf.M(R.string.expand_video_description, hq5Var2), null), false, zc4.f, hq5Var2, 24576, 12);
                        z4 = false;
                        oq5Var2.p(false);
                    }
                    yci a5 = a.a(bVar.a(androidx.compose.foundation.layout.a.m(vciVar, 12), b2c.i), "video_clip_progress");
                    kfh d3 = ug3.d(iz2Var, z4);
                    int i4 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    yci H2 = vnj.H(hq5Var2, a5);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(function05);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(hq5Var2, d3, kb5Var);
                    g0g.U(hq5Var2, l2, kb5Var2);
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var2, i4, kb5Var3);
                    }
                    g0g.U(hq5Var2, H2, kb5Var4);
                    float f9 = 0.0f;
                    if (m6uVar != null) {
                        float f10 = r1.b / r1.c;
                        Float valueOf = Float.valueOf(f10);
                        if (Float.isNaN(f10)) {
                            valueOf = f2;
                        }
                        if (valueOf != null) {
                            f9 = valueOf.floatValue();
                        }
                    }
                    q7g.s(f9, function1, function07, function08, null, null, hq5Var2, 0, 48);
                    oq5Var2.p(true);
                    oq5Var2.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i2 >> 6) & 14) | 200064, 18);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fsl(z, z2, z3, m6uVar, function0, function02, function1, function03, function04, i);
        }
    }

    public static final void b(z9u z9uVar, boolean z, boolean z2, m6u m6uVar, yci yciVar, hq5 hq5Var, int i) {
        z9u z9uVar2;
        yci yciVar2;
        boolean z3;
        boolean z4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-234521537);
        int i2 = (oq5Var.f(z9uVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(m6uVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            int L = ((jx7) oq5Var.j(es5.h)).L(20);
            act S = weo.S(200, 0, null, 6);
            yciVar2 = vci.a;
            yci c2 = d.c(yciVar2, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            int i5 = z ? -L : 0;
            b9r b9rVar = pk0.a;
            sdr c3 = pk0.c(Integer.valueOf(i5), azt.b, S, null, "IntAnimation", null, oq5Var, 384, 8);
            float f2 = 12;
            yci m = androidx.compose.foundation.layout.a.m(yciVar2, f2);
            iz2 iz2Var = b2c.j;
            b bVar = b.a;
            yci a2 = bVar.a(m, iz2Var);
            boolean f3 = oq5Var.f(c3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f3 || K == kjnVar) {
                K = new xp(c3, 19);
                oq5Var.k0(K);
            }
            yci i6 = androidx.compose.foundation.layout.a.i(a2, (Function1) K);
            agr agrVar = eq0.a;
            yci a3 = a.a(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(i6, ((dq0) oq5Var.j(agrVar)).c.d, o5g.E(oq5Var)), 8, 5), "progress_time");
            nho a4 = lho.a(qx0.e, b2c.l, oq5Var, 54);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            long j = m6uVar.b;
            long j2 = m6uVar.c;
            long j3 = 60;
            String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60000), Long.valueOf((j / 1000) % j3)}, 2));
            String N = rvf.N(R.string.player_progress_description, new Object[]{saf.q0(j)}, oq5Var);
            String N2 = rvf.N(R.string.player_duration_description, new Object[]{saf.q0(j2)}, oq5Var);
            xv7.j(format, com.yandex.music.core.ui.compose.b.c(a.a(ksw.D(yciVar2, N, null), "progress_text"), "progress", Long.valueOf(j)), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
            float f4 = 6;
            u1g.l(oq5Var, d.m(yciVar2, f4));
            ug3.a(androidx.compose.foundation.a.b(d.o(yciVar2, 1, 10), ((dq0) oq5Var.j(agrVar)).b.b, vnj.i), oq5Var, 0);
            u1g.l(oq5Var, d.m(yciVar2, f4));
            xv7.j(String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60000), Long.valueOf((j2 / 1000) % j3)}, 2)), com.yandex.music.core.ui.compose.b.c(a.a(ksw.D(yciVar2, N2, null), "duration_text"), "duration", Long.valueOf(j2)), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
            z9uVar2 = z9uVar;
            jzb jzbVar = z9uVar2.h;
            if (jzbVar != null) {
                oq5Var.Z(233159649);
                z4 = !ksw.F(oq5Var);
                z3 = false;
                oq5Var.p(false);
            } else {
                z3 = false;
                oq5Var.Z(-1361984236);
                oq5Var.p(false);
                z4 = false;
            }
            if (z4) {
                oq5Var.Z(-1361934879);
                act S2 = weo.S(100, z3 ? 1 : 0, null, 6);
                e9b e2 = c.e(S2, 2);
                vpb f5 = c.f(S2, 2);
                yci a5 = bVar.a(androidx.compose.foundation.layout.a.m(yciVar2, f2), b2c.h);
                boolean f6 = oq5Var.f(c3);
                Object K2 = oq5Var.K();
                if (f6 || K2 == kjnVar) {
                    K2 = new xp(c3, 20);
                    oq5Var.k0(K2);
                }
                etn.f(z2, androidx.compose.foundation.layout.a.i(a5, (Function1) K2), e2, f5, null, ild.C(2075269176, new e6u(jzbVar, 2), oq5Var), oq5Var, ((i3 >> 6) & 14) | 200064, 16);
                z3 = false;
            } else {
                oq5Var.Z(-1395350275);
            }
            oq5Var.p(z3);
            oq5Var.p(true);
        } else {
            z9uVar2 = z9uVar;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(z9uVar2, z, z2, m6uVar, yciVar2, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0360, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.K(), java.lang.Integer.valueOf(r3)) == false) goto L198;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(m4u m4uVar, final atb atbVar, final m6u m6uVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function1 function1, final Function0 function06, Function0 function07, final Function1 function12, final Function0 function08, final Function0 function09, hq5 hq5Var, final int i, final int i2) {
        int i3;
        final Function0 function010;
        boolean z5;
        boolean z6;
        agr agrVar;
        iz2 iz2Var;
        vci vciVar;
        boolean z7;
        kjn kjnVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        vci vciVar2;
        kb5 kb5Var4;
        grb grbVar;
        gz2 gz2Var;
        agr agrVar2;
        kjn kjnVar2;
        float f2;
        boolean z8;
        grb grbVar2;
        kb5 kb5Var5;
        z9u z9uVar;
        agr agrVar3;
        yci D;
        boolean z9;
        yci yciVar;
        final m4u m4uVar2 = m4uVar;
        iz2 iz2Var2 = b2c.f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1378394675);
        int i4 = (oq5Var.f(m4uVar2) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= oq5Var.f(atbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var.f(m6uVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var.g(z) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        int i6 = RemoteCameraConfig.Notification.ID;
        if (i5 == 0) {
            i4 |= oq5Var.g(z2) ? 16384 : 8192;
        }
        int i7 = i & 196608;
        int i8 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i7 == 0) {
            i4 |= oq5Var.g(z3) ? SQLiteDatabase.OPEN_SHAREDCACHE : 65536;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i4 |= oq5Var.g(z4) ? 1048576 : 524288;
        }
        int i9 = i & 12582912;
        int i10 = RemoteCameraConfig.Camera.BITRATE;
        if (i9 == 0) {
            i4 |= oq5Var.h(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= oq5Var.h(function02) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= oq5Var.h(function03) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.h(function04) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function05) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function06) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (oq5Var.h(function07)) {
                i6 = 16384;
            }
            i3 |= i6;
        }
        if ((i2 & 196608) == 0) {
            if (oq5Var.h(function12)) {
                i8 = SQLiteDatabase.OPEN_SHAREDCACHE;
            }
            i3 |= i8;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var.h(function08) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            if (oq5Var.h(function09)) {
                i10 = 8388608;
            }
            i3 |= i10;
        }
        int i11 = i3;
        int i12 = 1;
        if (oq5Var.P(i4 & 1, ((306783379 & i4) == 306783378 && (i11 & 4793491) == 4793490) ? false : true)) {
            z9u z9uVar2 = m4uVar2.a;
            String str = z9uVar2.c;
            final boolean z10 = function12 != null;
            final float f3 = str != null ? 318 : 278;
            final float f4 = 4;
            agr agrVar4 = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar4)).c.c;
            oq5Var.Z(-1787284849);
            vci vciVar3 = vci.a;
            z9u z9uVar3 = z9uVar2;
            yci d2 = d.d(vciVar3, 1.0f);
            int i13 = i11 & 3670016;
            boolean g = (i13 == 1048576) | oq5Var.g(z10) | oq5Var.c(f3);
            Object K = oq5Var.K();
            kjn kjnVar3 = gq5.a;
            if (g || K == kjnVar3) {
                K = new pyc() { // from class: p8u
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        mfh mfhVar = (mfh) obj;
                        ffh ffhVar = (ffh) obj2;
                        ga6 ga6Var = (ga6) obj3;
                        mfhVar.getClass();
                        ffhVar.getClass();
                        float floatValue = ((Number) Function0.this.invoke()).floatValue();
                        float g2 = w8u.g(z10, w8u.e, floatValue);
                        int L = mfhVar.L(g2) * 2;
                        float f5 = f4;
                        int L2 = mfhVar.L(f5) * 2;
                        ksk M = ffhVar.M(ia6.i(ga6Var.a, -L, -L2));
                        long j2 = ga6Var.a;
                        return mfh.m0(mfhVar, ia6.g(M.a + L, j2), ia6.f(mfhVar.L(f3) + L2, j2), new gdi(M, mfhVar, g2, f5, 2));
                    }
                };
                oq5Var.k0(K);
            }
            yci b2 = androidx.compose.ui.layout.a.b(d2, (pyc) K);
            boolean g2 = (i13 == 1048576) | oq5Var.g(z10);
            Object K2 = oq5Var.K();
            if (g2 || K2 == kjnVar3) {
                K2 = new r8u(0, function08, z10);
                oq5Var.k0(K2);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(b2, (Function1) K2);
            boolean e2 = oq5Var.e(j);
            Object K3 = oq5Var.K();
            if (e2 || K3 == kjnVar3) {
                K3 = new fn1(j, 16);
                oq5Var.k0(K3);
            }
            yci c2 = androidx.compose.ui.draw.a.c(a2, (Function1) K3);
            if (function12 != null) {
                oq5Var.Z(-1939428668);
                boolean z11 = (i11 & 458752) == 131072;
                Object K4 = oq5Var.K();
                if (z11 || K4 == kjnVar3) {
                    K4 = new k32(6, function12);
                    oq5Var.k0(K4);
                }
                c2 = androidx.compose.ui.layout.a.d(c2, (Function1) K4);
                z5 = false;
                oq5Var.p(false);
            } else {
                z5 = false;
                oq5Var.Z(-1939317564);
                oq5Var.p(false);
            }
            yci yciVar2 = c2;
            oq5Var.p(z5);
            Object K5 = oq5Var.K();
            if (K5 == kjnVar3) {
                K5 = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K5;
            boolean z12 = (i11 & 112) == 32;
            Object K6 = oq5Var.K();
            if (z12 || K6 == kjnVar3) {
                K6 = new gct(8, function05);
                oq5Var.k0(K6);
            }
            yci d3 = com.yandex.music.core.ui.compose.b.d(com.yandex.music.core.ui.compose.b.b(a.a(androidx.compose.foundation.a.d(yciVar2, uoiVar, null, false, null, null, (Function0) K6, 28), "clip"), m4uVar2.a.a), uah.e(new Pair("clip_is_playing", Boolean.valueOf(z)), new Pair("clip_is_focused", Boolean.valueOf(z10))));
            d3.getClass();
            function09.getClass();
            yci f5 = d3.f(new ubf("com.yandex.music.screen.videoclip.ui.screen.clipAccessibilityControls", Boolean.valueOf(z3), function09, new e4k(i12, function09, z3)));
            kx0 kx0Var = qx0.c;
            gz2 gz2Var2 = b2c.n;
            ta5 a3 = sa5.a(kx0Var, gz2Var2, oq5Var, 0);
            int i14 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f5);
            xp5.T.getClass();
            grb grbVar3 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar3);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var6 = wp5.f;
            g0g.U(oq5Var, a3, kb5Var6);
            kb5 kb5Var7 = wp5.e;
            g0g.U(oq5Var, l, kb5Var7);
            kb5 kb5Var8 = wp5.g;
            if (oq5Var.O) {
                z6 = z10;
            } else {
                z6 = z10;
            }
            ouj.x(i14, oq5Var, i14, kb5Var8);
            kb5 kb5Var9 = wp5.d;
            g0g.U(oq5Var, H, kb5Var9);
            if (str != null) {
                oq5Var.Z(235321965);
                vciVar = vciVar3;
                yci d4 = d.d(vciVar, 1.0f);
                Object K7 = oq5Var.K();
                if (K7 == kjnVar3) {
                    K7 = new ep5(27);
                    oq5Var.k0(K7);
                }
                yci b3 = androidx.compose.ui.layout.a.b(d4, (pyc) K7);
                iz2Var = iz2Var2;
                kjnVar = kjnVar3;
                kfh d5 = ug3.d(iz2Var, false);
                int i15 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, b3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar3);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d5, kb5Var6);
                g0g.U(oq5Var, l2, kb5Var7);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i15))) {
                    ouj.x(i15, oq5Var, i15, kb5Var8);
                }
                g0g.U(oq5Var, H2, kb5Var9);
                String upperCase = (str == null ? "" : str).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                agrVar = agrVar4;
                xv7.j(upperCase, a.a(vciVar, "clip_header_title"), ((dq0) oq5Var.j(agrVar)).b.d, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
                oq5Var.p(true);
                z7 = false;
            } else {
                agrVar = agrVar4;
                iz2Var = iz2Var2;
                vciVar = vciVar3;
                z7 = false;
                kjnVar = kjnVar3;
                oq5Var.Z(218454431);
            }
            oq5Var.p(z7);
            yci g0 = f8g.g0(d.e(d.d(vciVar, 1.0f), 210), 1.0f);
            kfh d6 = ug3.d(b2c.b, z7);
            int i16 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, g0);
            oq5Var.d0();
            agr agrVar5 = agrVar;
            if (oq5Var.O) {
                oq5Var.k(grbVar3);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d6, kb5Var6);
            g0g.U(oq5Var, l3, kb5Var7);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i16))) {
                ouj.x(i16, oq5Var, i16, kb5Var8);
            }
            g0g.U(oq5Var, H3, kb5Var9);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(590845298);
                yci b4 = androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), j, vnj.i);
                kfh d7 = ug3.d(iz2Var, false);
                int i17 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H4 = vnj.H(oq5Var, b4);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar3);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d7, kb5Var6);
                g0g.U(oq5Var, l4, kb5Var7);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i17))) {
                    ouj.x(i17, oq5Var, i17, kb5Var8);
                }
                g0g.U(oq5Var, H4, kb5Var9);
                w4k E = a0g.E(R.drawable.ic_clip_24, 0, oq5Var);
                int i18 = d85.o;
                gae.b(E, null, a.a(d.m(vciVar, 72), "video_icon"), d85.b(d85.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 3504, 0);
                oq5Var.p(true);
                oq5Var.p(false);
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var9;
                vciVar2 = vciVar;
                kb5Var4 = kb5Var8;
                grbVar = grbVar3;
                z8 = true;
                gz2Var = gz2Var2;
                agrVar2 = agrVar5;
                kjnVar2 = kjnVar;
                f2 = 1.0f;
                m4uVar2 = m4uVar;
            } else {
                oq5Var.Z(591554423);
                w1g.j(z9uVar3.d, null, a.a(d.d(vciVar, 1.0f), "clip_cover"), null, null, null, hd6.d, 0.0f, null, 0, ild.C(1483207181, new fdg(j, 1), oq5Var), oq5Var, 1573296, 952);
                act S = weo.S(500, 200, null, 4);
                z9uVar3 = z9uVar3;
                m4uVar2 = m4uVar;
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var9;
                vciVar2 = vciVar;
                kb5Var4 = kb5Var8;
                grbVar = grbVar3;
                gz2Var = gz2Var2;
                agrVar2 = agrVar5;
                kjnVar2 = kjnVar;
                f2 = 1.0f;
                etn.f(atbVar != null, null, c.e(S, 2), c.f(S, 2), null, ild.C(-2090054715, new pyc() { // from class: n8u
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        hq5 hq5Var2 = (hq5) obj2;
                        ((Integer) obj3).getClass();
                        ((am0) obj).getClass();
                        atb atbVar2 = atb.this;
                        if (atbVar2 != null) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            oq5Var2.Z(-679042053);
                            y7g.f(atbVar2.a, xp3.v(d.c(vci.a, 1.0f)), null, null, oq5Var2, 48, 12);
                            boolean z13 = z;
                            boolean z14 = z2;
                            boolean z15 = z3;
                            m6u m6uVar2 = m6uVar;
                            w8u.a(z13, z14, z15, m6uVar2, function0, function02, function1, function04, function03, oq5Var2, 0);
                            oq5 oq5Var3 = oq5Var2;
                            if (m6uVar2 != null) {
                                oq5Var3.Z(-678234534);
                                w8u.b(m4uVar2.a, z15, z4, m6uVar2, null, oq5Var3, 0);
                                oq5Var3 = oq5Var3;
                            } else {
                                oq5Var3.Z(-699550723);
                            }
                            oq5Var3.p(false);
                            oq5Var3.p(false);
                        } else {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            oq5Var4.Z(-699550723);
                            oq5Var4.p(false);
                        }
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 196608, 18);
                oq5Var = oq5Var;
                oq5Var.p(false);
                z8 = true;
            }
            oq5Var.p(z8);
            yci d8 = d.d(vciVar2, f2);
            Object K8 = oq5Var.K();
            kjn kjnVar4 = kjnVar2;
            if (K8 == kjnVar4) {
                K8 = new ep5(28);
                oq5Var.k0(K8);
            }
            int i19 = 16;
            yci g02 = f8g.g0(androidx.compose.foundation.layout.a.o(androidx.compose.ui.layout.a.b(d8, (pyc) K8), 16, 0.0f, 2), 0.0f);
            nho a4 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i20 = oq5Var.P;
            androidx.compose.runtime.internal.a l5 = oq5Var.l();
            yci H5 = vnj.H(oq5Var, g02);
            oq5Var.d0();
            if (oq5Var.O) {
                grbVar2 = grbVar;
                oq5Var.k(grbVar2);
            } else {
                grbVar2 = grbVar;
                oq5Var.n0();
            }
            kb5 kb5Var10 = kb5Var2;
            g0g.U(oq5Var, a4, kb5Var10);
            kb5 kb5Var11 = kb5Var;
            g0g.U(oq5Var, l5, kb5Var11);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i20))) {
                kb5Var5 = kb5Var4;
                ouj.x(i20, oq5Var, i20, kb5Var5);
            } else {
                kb5Var5 = kb5Var4;
            }
            kb5 kb5Var12 = kb5Var3;
            g0g.U(oq5Var, H5, kb5Var12);
            lx0 lx0Var = qx0.e;
            if (f2 <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, f2);
            ta5 a5 = sa5.a(lx0Var, gz2Var, oq5Var, 6);
            int i21 = oq5Var.P;
            androidx.compose.runtime.internal.a l6 = oq5Var.l();
            yci H6 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a5, kb5Var10);
            g0g.U(oq5Var, l6, kb5Var11);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i21))) {
                ouj.x(i21, oq5Var, i21, kb5Var5);
            }
            g0g.U(oq5Var, H6, kb5Var12);
            if (ksw.F(oq5Var)) {
                oq5Var.Z(1653794995);
                z9uVar = z9uVar3;
                jzb jzbVar = z9uVar.h;
                agrVar3 = agrVar2;
                bg3.a(null, null, false, ild.C(1681145038, new o4u(z9uVar, ox6.E(jzbVar, ((dq0) oq5Var.j(agrVar3)).b.a, oq5Var, 2), jzbVar != null, 1), oq5Var), oq5Var, 3072, 7);
                oq5Var.p(false);
            } else {
                z9uVar = z9uVar3;
                agrVar3 = agrVar2;
                oq5Var.Z(1654928045);
                xv7.j(z9uVar.e, a.a(vciVar2, "clip_title"), ((dq0) oq5Var.j(agrVar3)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                oq5Var.p(false);
            }
            u1g.l(oq5Var, d.m(vciVar2, 2));
            xv7.j(z9uVar.f, a.a(vciVar2, "clip_subtitle"), ((dq0) oq5Var.j(agrVar3)).b.b, 0L, 0L, 0, 0L, 0, false, 1, 0, null, nu0.j(), oq5Var, 48, 3072, 57336);
            oq5Var.p(true);
            yci m = d.m(vciVar2, 48);
            if (atbVar == null) {
                oq5Var.Z(-938314421);
                Object K9 = oq5Var.K();
                if (K9 == kjnVar4) {
                    K9 = new d4u(i19);
                    oq5Var.k0(K9);
                }
                D = nfp.a(vciVar2, (Function1) K9);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-938222134);
                D = ksw.D(vciVar2, rvf.M(R.string.menu_element_like, oq5Var), rvf.M(m4uVar2.c ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var));
                oq5Var.p(false);
            }
            boolean z13 = z6;
            aae.a(function06, m.f(D), z13, ild.C(-715284285, new f5r(i19, m4uVar2), oq5Var), oq5Var, ((i11 >> 9) & 14) | 24576, 8);
            yci m2 = d.m(androidx.compose.foundation.layout.a.q(vciVar2, 8, 0.0f, 0.0f, 0.0f, 14), 24);
            if (atbVar == null) {
                oq5Var.Z(-1969889282);
                Object K10 = oq5Var.K();
                if (K10 == kjnVar4) {
                    K10 = new d4u(17);
                    oq5Var.k0(K10);
                }
                yciVar = nfp.a(vciVar2, (Function1) K10);
                z9 = false;
                oq5Var.p(false);
            } else {
                z9 = false;
                oq5Var.Z(-1969888369);
                oq5Var.p(false);
                yciVar = vciVar2;
            }
            yci f6 = m2.f(yciVar);
            boolean z14 = (i11 & 57344) == 16384 ? true : z9;
            Object K11 = oq5Var.K();
            if (z14 || K11 == kjnVar4) {
                function010 = function07;
                K11 = new gct(11, function010);
                oq5Var.k0(K11);
            } else {
                function010 = function07;
            }
            aae.a((Function0) K11, f6, z13, zc4.e, oq5Var, 24576, 8);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            function010 = function07;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final m4u m4uVar3 = m4uVar2;
            r.d = new Function2() { // from class: q8u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    w8u.c(m4u.this, atbVar, m6uVar, z, z2, z3, z4, function0, function02, function03, function04, function05, function1, function06, function010, function12, function08, function09, (hq5) obj, R, R2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final List list, final y8u y8uVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        oq5 oq5Var;
        yci yciVar3;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(995669462);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var2.f(list) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (oq5Var2.f(y8uVar) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i5 | (oq5Var2.f(yciVar2) ? 256 : 128);
        }
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            final aqi Q = szf.Q(y8uVar.e(), oq5Var2);
            final aqi Q2 = szf.Q(y8uVar.c(), oq5Var2);
            final aqi Q3 = szf.Q(y8uVar.p(), oq5Var2);
            aqi Q4 = szf.Q(y8uVar.g(), oq5Var2);
            boolean f2 = oq5Var2.f((ExoPlayer) Q4.getValue());
            Object K2 = oq5Var2.K();
            if (f2 || K2 == obj) {
                ExoPlayer exoPlayer = (ExoPlayer) Q4.getValue();
                K2 = exoPlayer != null ? new atb(exoPlayer) : null;
                oq5Var2.k0(K2);
            }
            final atb atbVar = (atb) K2;
            final aqi Q5 = szf.Q(y8uVar.getProgress(), oq5Var2);
            final aqi Q6 = szf.Q(y8uVar.t(), oq5Var2);
            final aqi Q7 = szf.Q(y8uVar.o(), oq5Var2);
            fvf a2 = hvf.a(((Number) Q3.getValue()).intValue(), 0, oq5Var2, 0, 2);
            float f3 = a;
            float Q8 = ff7.Q(f3, oq5Var2);
            float f4 = c;
            final float Q9 = ff7.Q(f4, oq5Var2);
            final float f5 = Q8 * 0.2f;
            float f6 = ((Configuration) oq5Var2.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = new i2u(a2, y8uVar, ((Number) Q3.getValue()).intValue());
                oq5Var2.k0(K3);
            }
            final i2u i2uVar = (i2u) K3;
            Unit unit = Unit.a;
            boolean f7 = oq5Var2.f(Q3);
            Object K4 = oq5Var2.K();
            if (f7 || K4 == obj) {
                K4 = new npt(i2uVar, Q3, (Continuation) null, 4);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, unit, (Function2) K4);
            oq5Var = oq5Var2;
            weo.f(eur.a(d.c(yciVar4, 1.0f), unit, new u8u(f5, a2, i2uVar, mm6Var, i2uVar, Q3, Q8)), a2, androidx.compose.foundation.layout.a.c(0.0f, b, 0.0f, (f6 - f3) - f4, 5), null, null, null, false, null, new Function1() { // from class: m8u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    vuf vufVar = (vuf) obj2;
                    vufVar.getClass();
                    j1p j1pVar = new j1p(23);
                    List list2 = list;
                    vufVar.Z(list2.size(), new gcp(28, j1pVar, list2), new zcf(list2, 19), new wn5(new v8u(list2, y8uVar, atbVar, Q9, f5, Q3, i2uVar, Q5, Q, Q2, Q6, Q7, i2uVar, i2uVar, i2uVar), -1091073711, true));
                    return Unit.a;
                }
            }, oq5Var, 12582912, 376);
            yciVar3 = yciVar4;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d6u(list, y8uVar, yciVar3, i, i2, 1);
        }
    }

    public static final float e(i2u i2uVar) {
        return ((Number) i2uVar.f.getValue()).floatValue();
    }

    public static final int f(i2u i2uVar) {
        return ((Number) i2uVar.e.getValue()).intValue();
    }

    public static final float g(boolean z, hq4 hq4Var, float f2) {
        return su4.e(((cma) hq4Var.m()).a, ((cma) hq4Var.g()).a, f2, ((cma) (z ? hq4Var.m() : hq4Var.g())).a);
    }
}
