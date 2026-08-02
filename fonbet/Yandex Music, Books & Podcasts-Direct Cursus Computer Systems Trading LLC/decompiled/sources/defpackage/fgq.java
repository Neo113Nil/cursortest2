package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public abstract class fgq {
    public static final wn5 a = new wn5(new h3(19), -1094804405, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final char[] f;
    public static final Object g;

    static {
        new wn5(new bo5(18), -2138871134, false);
        int i = 23;
        b = new wn5(new io5(i), -1574781217, false);
        int i2 = 24;
        new wn5(new io5(i2), 1006007934, false);
        c = new wn5(new po5(20), 562542287, false);
        d = new wn5(new rz3(i), 1681252715, false);
        e = new wn5(new rz3(i2), 1146196759, false);
        f = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        g = new Object();
    }

    public static final w4k A(kw kwVar, hq5 hq5Var) {
        int ordinal = kwVar.ordinal();
        if (ordinal == 0) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-1497487430);
            w4k E = a0g.E(R.drawable.ic_play_small_24, 0, oq5Var);
            oq5Var.p(false);
            return E;
        }
        if (ordinal == 1) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1497484517);
            w4k E2 = a0g.E(R.drawable.ic_pause_small_24, 0, oq5Var2);
            oq5Var2.p(false);
            return E2;
        }
        if (ordinal != 2) {
            throw vz1.i((oq5) hq5Var, -1497488978, false);
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(-1497481606);
        w4k E3 = a0g.E(R.drawable.ic_play_small_24, 0, oq5Var3);
        oq5Var3.p(false);
        return E3;
    }

    public static String B(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static void C(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final xje D(String str, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = new xje();
            oq5Var.k0(K);
        }
        xje xjeVar = (xje) K;
        xjeVar.a(0, oq5Var);
        return xjeVar;
    }

    public static final dgq E(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        if (simOperator != null) {
            int length = simOperator.length();
            String str = simOperator.length() >= 3 ? simOperator : null;
            String substring = str != null ? str.substring(0, 3) : null;
            if (simOperator.length() < 4) {
                simOperator = null;
            }
            String substring2 = simOperator != null ? simOperator.substring(3, length) : null;
            if (substring != null && substring2 != null && substring2.length() <= 3) {
                return new dgq(substring, substring2);
            }
        }
        return null;
    }

    public static lc3 F(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new lc3(str, str2, 1);
    }

    public static final mhb G(nx8 nx8Var) {
        switch (nx8Var.ordinal()) {
            case 0:
                return mhb.STRING;
            case 1:
                return mhb.INTEGER;
            case 2:
                return mhb.NUMBER;
            case 3:
                return mhb.BOOLEAN;
            case 4:
                return mhb.DATETIME;
            case 5:
                return mhb.COLOR;
            case 6:
                return mhb.URL;
            case 7:
                return mhb.DICT;
            case 8:
                return mhb.ARRAY;
            default:
                b6e.s();
                return null;
        }
    }

    public static final tjb H(Album$AlbumType album$AlbumType) {
        album$AlbumType.getClass();
        switch (enb.a[album$AlbumType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return tjb.Music;
            case 6:
                return tjb.Podcast;
            case 7:
                return tjb.Radio;
            case 8:
                return tjb.FairyTale;
            case 9:
                return tjb.Audiobook;
            default:
                b6e.s();
                return null;
        }
    }

    public static final ArrayList I(List list) {
        List<g09> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (g09 g09Var : list2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (h09 h09Var : g09Var.a) {
                arrayList2.add(h09Var.a);
                arrayList3.add(new azc(G(h09Var.b)));
            }
            arrayList.add(new skg(g09Var.c, arrayList3, G(g09Var.d), arrayList2, g09Var.b));
        }
        return arrayList;
    }

    public static final void J(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            vme.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        vme.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void a(bc5 bc5Var, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        bc5Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1626041559);
        int i2 = (oq5Var.f(bc5Var) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hdg.g(((i2 >> 3) & 14) | 432, ild.C(677359654, new ix(gld.O(bc5Var.c(), oq5Var), 2), oq5Var), oq5Var, yciVar, function0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jx(bc5Var, function0, yciVar, i, 1);
        }
    }

    public static final void b(bc5 bc5Var, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        bc5Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-724386488);
        int i4 = (oq5Var.f(bc5Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (oq5Var.f(yciVar) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            hdg.e(((i3 >> 3) & 14) | 48, ild.C(1903899926, new ix(gld.M(bc5Var.c(), oq5Var), 1), oq5Var), oq5Var, d.t(d.g(yciVar, 40, 0.0f, 2), 108, 0.0f, 2), function0);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(bc5Var, function0, yciVar2, i, i2, 0);
        }
    }

    public static final void c(bc5 bc5Var, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        bc5Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-697444276);
        int i2 = (oq5Var.f(bc5Var) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hdg.f(((i2 >> 3) & 14) | 432, ild.C(-1040083196, new ix(gld.O(bc5Var.c(), oq5Var), 0), oq5Var), oq5Var, yciVar, function0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jx(bc5Var, function0, yciVar, i, 0);
        }
    }

    public static final void d(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(130602310);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hdg.g((i2 & 14) | 432, irf.a, oq5Var, yciVar, function0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 0);
        }
    }

    public static final void e(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1095807550);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hdg.f((i2 & 14) | 432, irf.b, oq5Var, yciVar, function0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 1);
        }
    }

    public static final void f(vm vmVar, d81 d81Var, t71 t71Var, fvf fvfVar, yci yciVar, hq5 hq5Var, int i) {
        t71Var.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-24104974);
        int i2 = i | (oq5Var.f(vmVar) ? 4 : 2) | (oq5Var.f(d81Var) ? 32 : 16) | (oq5Var.f(t71Var) ? 256 : 128) | (oq5Var.f(fvfVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            tt0.g(d81Var, yciVar, null, "familiarWaveCrossfade", ild.C(1026329113, new xk(9, vmVar, fvfVar, t71Var), oq5Var), oq5Var, ((i2 >> 3) & 14) | 27696, 4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(vmVar, d81Var, t71Var, fvfVar, yciVar, i, 2);
        }
    }

    public static final void g(final tvd tvdVar, final c93 c93Var, final va3 va3Var, hq5 hq5Var, int i) {
        tvdVar.getClass();
        va3Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1196162055);
        int i2 = i | (oq5Var.f(tvdVar) ? 4 : 2) | (oq5Var.f(c93Var) ? 32 : 16) | (oq5Var.f(va3Var) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            iab iabVar = c93Var.a;
            gvd gvdVar = c93Var.b;
            String str = iabVar.h;
            final aqi J = hyf.J(str != null ? new jbu(str) : null, ((icj) va3Var.a.b).v(), oq5Var, 0);
            boolean f2 = oq5Var.f(gvdVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = new hab(gvdVar);
                oq5Var.k0(K);
            }
            final hab habVar = (hab) K;
            long j = ((dq0) oq5Var.j(eq0.a)).c.d;
            boolean h = oq5Var.h(habVar) | ((i2 & 112) == 32) | oq5Var.e(j);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new e93(habVar, c93Var, j);
                oq5Var.k0(K2);
            }
            final Function0 function0 = (Function0) K2;
            final long f3 = ((ma5) oq5Var.j(pa5.a)).f();
            u2x.o(function0, ild.C(-910858911, new Function2() { // from class: d93
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    va3 va3Var2;
                    c93 c93Var2 = c93Var;
                    o8w o8wVar = c93Var2.c;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                        long j2 = f3;
                        boolean e2 = oq5Var2.e(j2);
                        tvd tvdVar2 = tvdVar;
                        boolean f4 = e2 | oq5Var2.f(tvdVar2);
                        Object K3 = oq5Var2.K();
                        kjn kjnVar2 = gq5.a;
                        if (f4 || K3 == kjnVar2) {
                            K3 = new lv(j2, tvdVar2, 2);
                            oq5Var2.k0(K3);
                        }
                        vci vciVar = vci.a;
                        yci c2 = a.c(vciVar, (Function1) K3);
                        kfh d2 = ug3.d(b2c.b, false);
                        int i3 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, c2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d2, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                            ouj.x(i3, oq5Var2, i3, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        iab iabVar2 = c93Var2.a;
                        gvd gvdVar2 = c93Var2.b;
                        va3 va3Var3 = va3Var;
                        dib dibVar = (dib) va3Var3.a.n;
                        boolean h2 = oq5Var2.h(va3Var3);
                        Object K4 = oq5Var2.K();
                        if (h2 || K4 == kjnVar2) {
                            oi1 oi1Var = new oi1(0, va3Var3, va3.class, "onCoverClick", "onCoverClick()V", 0, 27);
                            oq5Var2.k0(oi1Var);
                            K4 = oi1Var;
                        }
                        h9f h9fVar = (h9f) K4;
                        boolean h3 = oq5Var2.h(va3Var3);
                        Object K5 = oq5Var2.K();
                        if (h3 || K5 == kjnVar2) {
                            va3Var2 = va3Var3;
                            K5 = new oi1(0, va3Var2, va3.class, "onOverflowClick", "onOverflowClick()V", 0, 28);
                            oq5Var2.k0(K5);
                        } else {
                            va3Var2 = va3Var3;
                        }
                        yci d3 = d.d(vciVar, 1.0f);
                        pbu pbuVar = (pbu) J.getValue();
                        qo6 qo6Var = qo6.a;
                        hab habVar2 = habVar;
                        Function0 function02 = function0;
                        va3 va3Var4 = va3Var2;
                        ksw.i(iabVar2, o8wVar, gvdVar2, habVar2, tvdVar2, dibVar, (Function0) h9fVar, (Function0) ((h9f) K5), pbuVar, d3, function02, oq5Var2, 805306368, 0);
                        iz2 iz2Var = b2c.i;
                        b bVar = b.a;
                        zsd.r(function02, tvdVar2, androidx.compose.foundation.layout.a.j(bVar.a(vciVar, iz2Var), 0, 160), oq5Var2, 0);
                        if (o8wVar.a) {
                            oq5Var2.Z(-1946936060);
                            boolean f5 = oq5Var2.f(tvdVar2);
                            Object K6 = oq5Var2.K();
                            if (f5 || K6 == kjnVar2) {
                                K6 = new nr(tvdVar2, 9);
                                oq5Var2.k0(K6);
                            }
                            wdp.K(va3Var4, (Function0) K6, androidx.compose.foundation.layout.a.q(bVar.a(vciVar, iz2Var), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var2, 0);
                            oq5Var2.p(false);
                        } else {
                            oq5Var2.Z(-1946576522);
                            boolean h4 = oq5Var2.h(va3Var4);
                            Object K7 = oq5Var2.K();
                            if (h4 || K7 == kjnVar2) {
                                oi1 oi1Var2 = new oi1(0, va3Var4, va3.class, "onBuyYandexBooksOptionClick", "onBuyYandexBooksOptionClick()V", 0, 29);
                                oq5Var2.k0(oi1Var2);
                                K7 = oi1Var2;
                            }
                            Function0 function03 = (Function0) ((h9f) K7);
                            boolean f6 = oq5Var2.f(tvdVar2);
                            Object K8 = oq5Var2.K();
                            if (f6 || K8 == kjnVar2) {
                                K8 = new nr(tvdVar2, 10);
                                oq5Var2.k0(K8);
                            }
                            asq.m(0, oq5Var2, androidx.compose.foundation.layout.a.q(bVar.a(vciVar, iz2Var), 0.0f, 0.0f, 0.0f, 20 + 4, 7), function03, (Function0) K8);
                            oq5Var2.p(false);
                        }
                        oq5Var2.p(true);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(tvdVar, c93Var, va3Var, i, 10);
        }
    }

    public static final void h(g5u g5uVar, g5u g5uVar2, fvf fvfVar, o0k o0kVar, k65 k65Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        fvfVar.getClass();
        o0kVar.getClass();
        k65Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1191774189);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(g5uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(g5uVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(k65Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = !(g5uVar instanceof f5u);
            boolean booleanValue = ((Boolean) gld.M(k65Var.g, oq5Var2).getValue()).booleanValue();
            boolean h = oq5Var2.h(k65Var);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                K = new e65(0, k65Var, k65.class, "onRefresh", "onRefresh()V", 0, 2);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, z, ild.C(1818731629, new bj(g5uVar, fvfVar, g5uVar2, o0kVar, k65Var, 10), oq5Var2), oq5Var, ((i3 >> 3) & 896) | 196608, 8);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 8, g5uVar, g5uVar2, fvfVar, o0kVar, k65Var);
        }
    }

    public static final void i(dt5 dt5Var, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2123580573);
        if ((((oq5Var.f(dt5Var) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            y9w y9wVar = y9w.b;
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, y9wVar);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            boolean z = dt5Var.a;
            yci d2 = d.d(vciVar, 1.0f);
            float f2 = ku5.a;
            ivf.k(0, 0, oq5Var, androidx.compose.foundation.layout.a.d(xp3.u(d2, o5g.F(oq5Var)), 0.66f), z);
            u1g.l(oq5Var, d.e(vciVar, ku5.a));
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            yci e2 = d.e(vciVar, w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(ku5.a(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 0, oq5Var, 0, 2));
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            ivf.l(dt5Var.a, d.r(vciVar, 148), nu0.j(), oq5Var, 48, 0);
            ivf.l(dt5Var.a, d.r(vciVar, 64), ku5.a(), oq5Var, 48, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(dt5Var, yciVar, i, 28);
        }
    }

    public static final void j(String str, String str2, yci yciVar, float f2, String str3, boolean z, d85 d85Var, hq5 hq5Var, int i) {
        kb5 kb5Var;
        htq htqVar;
        boolean z2;
        yci u;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1453846872);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 2048 : 1024) | (oq5Var.f(str3) ? 1048576 : 524288) | (oq5Var.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 100663296 | (oq5Var.f(d85Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if ((i2 & 306783379) == 306783378 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
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
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            oq5Var.Z(920021702);
            oq5Var.p(false);
            htq htqVar2 = new htq(z ? etq.b : etq.a);
            vci vciVar = vci.a;
            yci m = d.m(vciVar, f2);
            if (z) {
                oq5Var.Z(920581501);
                kb5Var = kb5Var5;
                htqVar = htqVar2;
                u = if4.b(1.0f, ((dq0) oq5Var.j(eq0.a)).c.a, true);
                z2 = false;
                oq5Var.p(false);
            } else {
                kb5Var = kb5Var5;
                htqVar = htqVar2;
                z2 = false;
                oq5Var.Z(920860222);
                oq5Var.p(false);
                u = xp3.u(vciVar, ugo.a(10));
            }
            boolean z4 = z2;
            kb5 kb5Var6 = kb5Var;
            ocg.e(str2, htqVar, m.f(u), null, oq5Var, (i2 >> 9) & 14, 8);
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var6);
            oq5Var.Z(841400745);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            oq5Var.p(z4);
            oq5Var.Z(841404459);
            long j2 = ((dq0) oq5Var.j(agrVar)).b.b;
            oq5Var.p(z4);
            ges j3 = nu0.j();
            if (d85Var != null) {
                j = d85Var.a;
            }
            xcs.b(str, vciVar, j, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, j3, oq5Var, i2 & 14, 3120, 55288);
            oq5Var = oq5Var;
            if (str3 != null) {
                oq5Var.Z(314292951);
                xcs.b(str3, null, d85Var != null ? d85Var.a : j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, (i2 >> 18) & 14, 3120, 55290);
                oq5Var = oq5Var;
                z3 = false;
            } else {
                z3 = z4;
                oq5Var.Z(310699648);
            }
            oq5Var.p(z3);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fn6(str, str2, yciVar, f2, str3, z, d85Var, i);
        }
    }

    public static final /* synthetic */ zr7 k(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, cr crVar, List list, Function1 function1) {
        context.getClass();
        okHttpClient.getClass();
        executor.getClass();
        scheduledExecutorService.getClass();
        list.getClass();
        function1.getClass();
        yr7 yr7Var = new yr7(context, okHttpClient, executor, scheduledExecutorService, crVar, list);
        function1.invoke(yr7Var);
        return yr7Var.a();
    }

    public static final void l(ArrayList arrayList, yda ydaVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        fvf fvfVar2;
        o0k o0kVar2;
        ydaVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1380821833);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(ydaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            fvfVar2 = fvfVar;
            i2 |= oq5Var.f(fvfVar2) ? 256 : 128;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i & 3072) == 0) {
            o0kVar2 = o0kVar;
            i2 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
        } else {
            o0kVar2 = o0kVar;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) gld.M(ydaVar.b.o, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(ydaVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new yg6(21, ydaVar);
                oq5Var.k0(K);
            }
            bfg.f(booleanValue, (Function0) K, null, null, false, ild.C(112691145, new av5(fvfVar2, arrayList, o0kVar2, ydaVar, 9), oq5Var), oq5Var, 196608, 28);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 0, arrayList, ydaVar, fvfVar, o0kVar);
        }
    }

    public static final void n(int i, hq5 hq5Var, yci yciVar, String str) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1514478753);
        int i2 = i | (oq5Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            kfh d2 = ug3.d(b2c.c, false);
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
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f2 = 16;
            xcs.b(str, androidx.compose.foundation.layout.a.q(vci.a, f2, 64, f2, 0.0f, 8), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i2 & 14, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a5(str, yciVar, i, 1);
        }
    }

    public static final long o(int i) {
        if (!(i > 0)) {
            vme.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void p(g5u g5uVar, k65 k65Var, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1953550239);
        int i2 = i | (oq5Var.f(g5uVar) ? 4 : 2) | (oq5Var.h(k65Var) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            float f2 = 32;
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, f2, 0.0f, f2, 5);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            boolean z2 = g5uVar instanceof f5u;
            int i4 = 6;
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            if (z2) {
                oq5Var.Z(-1341391838);
                ges c2 = nu0.c();
                float f3 = 16;
                yci p = androidx.compose.foundation.layout.a.p(d.r(vciVar, 120), f3, f3, f3, f3);
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new z35(i4);
                    oq5Var.k0(K);
                }
                ivf.l(true, nfp.b(p, false, (Function1) K), c2, oq5Var, 6, 0);
                yci o = androidx.compose.foundation.layout.a.o(vciVar, f3, 0.0f, 2);
                nho a3 = lho.a(qx0.a, b2c.k, oq5Var, 0);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                oq5Var.Z(-1685159214);
                for (int i6 = 0; i6 < 3; i6++) {
                    o5g.k(null, oq5Var, 0);
                    u1g.l(oq5Var, d.r(vciVar, f3));
                }
                f1d.u(oq5Var, false, true, false);
                z = true;
            } else {
                if (g5uVar instanceof d5u) {
                    oq5Var.Z(-1340596812);
                    float f4 = 16;
                    yci p2 = androidx.compose.foundation.layout.a.p(vciVar, f4, f4, f4, f4);
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new z35(7);
                        oq5Var.k0(K2);
                    }
                    xcs.b(rvf.M(R.string.collection_video_clips_recommendations_title, oq5Var), nfp.b(p2, false, (Function1) K2), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65016);
                    up6.i(w(((d5u) g5uVar).a, 0), androidx.compose.ui.platform.a.a(vciVar, "video_clip_block"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1901538475, new t31(6, k65Var), oq5Var), oq5Var, 48, 384, 4092);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else {
                    if (!(g5uVar instanceof e5u)) {
                        throw vz1.i(oq5Var, 510918039, false);
                    }
                    oq5Var.Z(-1339271097);
                    oq5Var.p(false);
                }
                z = true;
            }
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(g5uVar, k65Var, yciVar, i, 21);
        }
    }

    public static final void q(androidx.compose.foundation.lazy.a aVar, k65 k65Var, aau aauVar, int i, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1353200183);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(k65Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(aauVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(i) ? 2048 : 1024;
        }
        if (!oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.S();
        } else if (aauVar != null) {
            oq5Var.Z(-623409871);
            yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.lazy.a.a(aVar, vci.a), "video_clip_list_item");
            boolean z = true;
            z9u z9uVar = aauVar.b;
            boolean h = oq5Var.h(k65Var) | oq5Var.h(aauVar);
            if ((i3 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = h | z;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new h65(k65Var, aauVar, i, 1);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = oq5Var.h(k65Var) | oq5Var.h(aauVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ap1(20, k65Var, aauVar);
                oq5Var.k0(K2);
            }
            o5g.l(z9uVar, function0, (Function0) K2, a2, null, oq5Var, 0, 16);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-622896697);
            o5g.m(0, oq5Var);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(aVar, k65Var, aauVar, i, i2, 7);
        }
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final wje s(xje xjeVar, float f2, float f3, vje vjeVar, String str, hq5 hq5Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f3);
        int i3 = i << 3;
        return t(xjeVar, valueOf, valueOf2, azt.a, vjeVar, str, hq5Var, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
    }

    public static final wje t(xje xjeVar, Number number, Number number2, oct octVar, vje vjeVar, String str, hq5 hq5Var, int i, int i2) {
        xje xjeVar2;
        Number number3;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            xjeVar2 = xjeVar;
            wje wjeVar = new wje(xjeVar2, number, number2, octVar, vjeVar);
            number3 = number2;
            oq5Var.k0(wjeVar);
            K = wjeVar;
        } else {
            xjeVar2 = xjeVar;
            number3 = number2;
        }
        wje wjeVar2 = (wje) K;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && oq5Var.h(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && oq5Var.h(number3)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !oq5Var.h(vjeVar)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object K2 = oq5Var.K();
        if (z3 || K2 == kjnVar) {
            zg zgVar = new zg(number, wjeVar2, number3, vjeVar, 10);
            oq5Var.k0(zgVar);
            K2 = zgVar;
        }
        gld.D((Function0) K2, oq5Var);
        boolean h = oq5Var.h(xjeVar2);
        Object K3 = oq5Var.K();
        if (h || K3 == kjnVar) {
            K3 = new sea(15, xjeVar2, wjeVar2);
            oq5Var.k0(K3);
        }
        gld.k(wjeVar2, (Function1) K3, oq5Var);
        return wjeVar2;
    }

    public static final ArrayList u(Pair... pairArr) {
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        for (Pair pair : pairArr) {
            Object obj = pair.a;
            f2 += ((Number) pair.b).floatValue() / 100.0f;
            arrayList.add(new Pair(Float.valueOf(yhn.c(f2, 0.0f, 1.0f)), obj));
        }
        return arrayList;
    }

    public static final void v(nf6 nf6Var) {
        nf6Var.a.setValue(kf6.a);
    }

    public static final ArrayList w(List list, int i) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            x1u x1uVar = (x1u) obj;
            arrayList.add(new aau(x1uVar, s7g.p(i2 + i, x1uVar)));
            i2 = i3;
        }
        return arrayList;
    }

    public static bf4 x() {
        etq etqVar = etq.a;
        etq etqVar2 = etq.b;
        return new bf4("Ваш топ артистов", true, u75.d(new af4("Fred again..", "Subtitle", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar2), new af4("Fred again..", "Subtitle", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new af4("Fred again..", "Subtitle", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar2), new af4("Fred again..", null, "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new af4("Fred again..", null, "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar2)), etqVar, dtq.b);
    }

    public static rv8 y(v7k v7kVar, JSONObject jSONObject) {
        return ((wv8) rj3.b.N2.getValue()).a(v7kVar, jSONObject);
    }

    public static final Boolean z(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.optBoolean(str));
        }
        return null;
    }
}
