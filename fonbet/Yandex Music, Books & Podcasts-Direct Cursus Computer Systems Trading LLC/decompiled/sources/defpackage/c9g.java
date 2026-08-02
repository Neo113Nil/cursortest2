package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.DeadSystemException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationInfo;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.retrofit.NewBackendFormatError;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public abstract class c9g implements esq {
    public static int A(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static final boolean B(int i, lma lmaVar, dpc dpcVar, ynn ynnVar) {
        if (M(i, lmaVar, dpcVar, ynnVar)) {
            return true;
        }
        d51 d51Var = ((uoc) bcx.G(dpcVar).getFocusOwner()).h;
        d51Var.getClass();
        Boolean bool = (Boolean) ff7.M(dpcVar, i, new pe9(d51Var, ((uoc) bcx.G(dpcVar).getFocusOwner()).l, dpcVar, ynnVar, i, lmaVar, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean C(lyf lyfVar) {
        lyfVar.getClass();
        int ordinal = lyfVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return false;
        }
        if (ordinal == 4) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final int D(n7q n7qVar) {
        n7qVar.getClass();
        return ((gxj) wdg.A(n7qVar, hs4.j)).a;
    }

    public static final List E(StationId stationId) {
        stationId.getClass();
        List d = StationId.d(stationId, null);
        d.getClass();
        return d;
    }

    public static File F(Context context, String str) {
        context.getClass();
        File file = new File(context.getFilesDir(), "temporary");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        if (str == null) {
            str = System.currentTimeMillis() + ".jpg";
        }
        return new File(file, str);
    }

    public static final boolean G(ynn ynnVar, ynn ynnVar2, ynn ynnVar3, int i) {
        if (!H(i, ynnVar, ynnVar3)) {
            return false;
        }
        if (H(i, ynnVar2, ynnVar3) && !s(ynnVar3, ynnVar, ynnVar2, i)) {
            return !s(ynnVar3, ynnVar2, ynnVar, i) && I(i, ynnVar3, ynnVar) < I(i, ynnVar3, ynnVar2);
        }
        return true;
    }

    public static final boolean H(int i, ynn ynnVar, ynn ynnVar2) {
        float f = ynnVar.b;
        float f2 = ynnVar.d;
        float f3 = ynnVar.a;
        float f4 = ynnVar.c;
        if (i == 3) {
            float f5 = ynnVar2.c;
            float f6 = ynnVar2.a;
            return (f5 > f4 || f6 >= f4) && f6 > f3;
        }
        if (i == 4) {
            float f7 = ynnVar2.a;
            float f8 = ynnVar2.c;
            return (f7 < f3 || f8 <= f3) && f8 < f4;
        }
        if (i == 5) {
            float f9 = ynnVar2.d;
            float f10 = ynnVar2.b;
            return (f9 > f2 || f10 >= f2) && f10 > f;
        }
        if (i != 6) {
            xq0.q("This function should only be used for 2-D focus search");
            return false;
        }
        float f11 = ynnVar2.b;
        float f12 = ynnVar2.d;
        return (f11 < f || f12 <= f) && f12 < f2;
    }

    public static final long I(int i, ynn ynnVar, ynn ynnVar2) {
        float f;
        float f2;
        float f3 = ynnVar2.b;
        float f4 = ynnVar2.d;
        float f5 = ynnVar2.a;
        float f6 = ynnVar2.c;
        if (i == 3) {
            f = ynnVar.a - f6;
        } else if (i == 4) {
            f = f5 - ynnVar.c;
        } else if (i == 5) {
            f = ynnVar.b - f4;
        } else {
            if (i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - ynnVar.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = ynnVar.b;
            float f8 = 2;
            f2 = (((ynnVar.d - f7) / f8) + f7) - (((f4 - f3) / f8) + f3);
        } else {
            if (i != 5 && i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f9 = ynnVar.a;
            float f10 = 2;
            f2 = (((ynnVar.c - f9) / f10) + f9) - (((f6 - f5) / f10) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean J(Throwable th) {
        boolean z = th instanceof DeadSystemException;
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        Throwable cause = th.getCause();
        Boolean valueOf2 = cause != null ? Boolean.valueOf(J(cause)) : null;
        if (valueOf2 != null) {
            return valueOf2.booleanValue();
        }
        return false;
    }

    public static final boolean K(jc7 jc7Var, int i, int i2) {
        jc7Var.getClass();
        if (i > i2 && jc7Var.l) {
            return false;
        }
        Set set = jc7Var.m;
        return jc7Var.k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static final boolean L(jil jilVar) {
        boolean z;
        jilVar.getClass();
        if (!jilVar.equals(gil.a)) {
            if (!(jilVar instanceof iil)) {
                b6e.s();
                return false;
            }
            iil iilVar = (iil) jilVar;
            c94 c94Var = iilVar.c.c;
            if (c94Var instanceof w84) {
                z = true;
            } else {
                if (!(c94Var instanceof x84)) {
                    if (c94Var instanceof a94) {
                        z = ((a94) c94Var).a;
                    } else if (!c94Var.equals(b94.a)) {
                        b6e.s();
                        return false;
                    }
                }
                z = false;
            }
            if (!z) {
                return szf.d0((wxk) iilVar.a.b.a);
            }
        }
        return false;
    }

    public static final boolean M(int i, lma lmaVar, dpc dpcVar, ynn ynnVar) {
        dpc x;
        eqi eqiVar = new eqi(new dpc[16]);
        if (!dpcVar.a.n) {
            sme.b("visitChildren called on an unattached node");
        }
        eqi eqiVar2 = new eqi(new xci[16]);
        xci xciVar = dpcVar.a;
        xci xciVar2 = xciVar.f;
        if (xciVar2 == null) {
            bcx.o(eqiVar2, xciVar);
        } else {
            eqiVar2.d(xciVar2);
        }
        while (true) {
            int i2 = eqiVar2.c;
            if (i2 == 0) {
                break;
            }
            xci xciVar3 = (xci) eqiVar2.m(i2 - 1);
            if ((xciVar3.d & 1024) == 0) {
                bcx.o(eqiVar2, xciVar3);
            } else {
                while (true) {
                    if (xciVar3 == null) {
                        break;
                    }
                    if ((xciVar3.c & 1024) != 0) {
                        eqi eqiVar3 = null;
                        while (xciVar3 != null) {
                            if (xciVar3 instanceof dpc) {
                                dpc dpcVar2 = (dpc) xciVar3;
                                if (dpcVar2.n) {
                                    eqiVar.d(dpcVar2);
                                }
                            } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                                int i3 = 0;
                                for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                    if ((xciVar4.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            xciVar3 = xciVar4;
                                        } else {
                                            if (eqiVar3 == null) {
                                                eqiVar3 = new eqi(new xci[16]);
                                            }
                                            if (xciVar3 != null) {
                                                eqiVar3.d(xciVar3);
                                                xciVar3 = null;
                                            }
                                            eqiVar3.d(xciVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            xciVar3 = bcx.p(eqiVar3);
                        }
                    } else {
                        xciVar3 = xciVar3.f;
                    }
                }
            }
        }
        while (eqiVar.c != 0 && (x = x(eqiVar, ynnVar, i)) != null) {
            if (x.T0().a) {
                return ((Boolean) lmaVar.invoke(x)).booleanValue();
            }
            if (B(i, lmaVar, x, ynnVar)) {
                return true;
            }
            eqiVar.l(x);
        }
        return false;
    }

    public static final int N(TextView textView, int i) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return i <= 0 ? textView.getLayout().getHeight() : i > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i) - textView.getLayout().getLineTop(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static css O(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1808112969:
                if (str.equals("Strong")) {
                    return css.i;
                }
                break;
            case 2052559:
                if (str.equals("Auto")) {
                    return css.g;
                }
                break;
            case 2602996:
                if (str.equals("Temp")) {
                    return css.f;
                }
                break;
            case 2691992:
                if (str.equals("Weak")) {
                    return css.j;
                }
                break;
            case 79996329:
                if (str.equals("Smart")) {
                    return css.h;
                }
                break;
        }
        su4.s(2, null, "Unexpected cache_type value: ".concat(str), null);
        return css.f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static gss P(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1246339689:
                if (str.equals("he-aac-mp4")) {
                    return gss.e;
                }
                break;
            case -1236551065:
                if (str.equals("aac-mp4")) {
                    return gss.f;
                }
                break;
            case -1222823053:
                if (str.equals("he-aac")) {
                    return gss.a;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    return gss.h;
                }
                break;
            case 96323:
                if (str.equals("aac")) {
                    return gss.b;
                }
                break;
            case 108272:
                if (str.equals("mp3")) {
                    return gss.c;
                }
                break;
            case 3145576:
                if (str.equals("flac")) {
                    return gss.d;
                }
                break;
            case 1609049868:
                if (str.equals("flac-mp4")) {
                    return gss.g;
                }
                break;
        }
        su4.s(2, null, "Unexpected codec value: ".concat(str), null);
        return gss.h;
    }

    public static bb6 Q(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 69818) {
            if (hashCode != 72655) {
                if (hashCode == 81928 && str.equals("Raw")) {
                    return bb6.a;
                }
            } else if (str.equals("Hls")) {
                return bb6.b;
            }
        } else if (str.equals("Enc")) {
            return bb6.c;
        }
        su4.s(2, null, "Unexpected container value: ".concat(str), null);
        return bb6.a;
    }

    public static String R(bb6 bb6Var) {
        int ordinal = bb6Var.ordinal();
        if (ordinal == 0) {
            return "Raw";
        }
        if (ordinal == 1) {
            return "Hls";
        }
        if (ordinal == 2) {
            return "Enc";
        }
        b6e.s();
        return null;
    }

    public static String S(o5n o5nVar) {
        o5nVar.getClass();
        int ordinal = o5nVar.ordinal();
        if (ordinal == 0) {
            return "auto";
        }
        if (ordinal == 1) {
            return "Low";
        }
        if (ordinal == 2) {
            return "Normal";
        }
        if (ordinal == 3) {
            return "High";
        }
        if (ordinal == 4) {
            return "Lossless";
        }
        b6e.s();
        return null;
    }

    public static String T(thr thrVar) {
        thrVar.getClass();
        int ordinal = thrVar.ordinal();
        if (ordinal == 0) {
            return "External";
        }
        if (ordinal == 1) {
            return "Sd";
        }
        b6e.s();
        return null;
    }

    public static String U(css cssVar) {
        cssVar.getClass();
        int ordinal = cssVar.ordinal();
        if (ordinal == 0) {
            return "Temp";
        }
        if (ordinal == 1) {
            return "Auto";
        }
        if (ordinal == 2) {
            return "Smart";
        }
        if (ordinal == 3) {
            return "Strong";
        }
        if (ordinal == 4) {
            return "Weak";
        }
        b6e.s();
        return null;
    }

    public static final MusicBackendResponse V(NewBackendFormatError newBackendFormatError) {
        return new MusicBackendResponse(null, new MusicBackendInvocationInfo(newBackendFormatError.getRequestId(), null), new MusicBackendInvocationError(newBackendFormatError.getName(), newBackendFormatError.getMessage(), newBackendFormatError.getDetails()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static o5n W(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1955878649:
                if (str.equals("Normal")) {
                    return o5n.c;
                }
                break;
            case -1854831780:
                if (str.equals("Lossless")) {
                    return o5n.e;
                }
                break;
            case 76596:
                if (str.equals("Low")) {
                    return o5n.b;
                }
                break;
            case 2249154:
                if (str.equals("High")) {
                    return o5n.d;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return o5n.a;
                }
                break;
        }
        su4.s(2, null, "Unexpected quality value: ".concat(str), null);
        return o5n.c;
    }

    public static thr X(String str) {
        str.getClass();
        if (str.equals("External")) {
            return thr.c;
        }
        if (str.equals("Sd")) {
            return thr.d;
        }
        su4.s(2, null, "Unexpected storage value: ".concat(str), null);
        return thr.c;
    }

    public static final ews Y(fgb fgbVar) {
        if ((fgbVar instanceof bgb) || (fgbVar instanceof cgb)) {
            return null;
        }
        if (fgbVar instanceof dgb) {
            return ((dgb) fgbVar).a;
        }
        if (fgbVar instanceof egb) {
            return ((egb) fgbVar).a;
        }
        b6e.s();
        return null;
    }

    public static final Boolean Z(int i, lma lmaVar, dpc dpcVar, ynn ynnVar) {
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dpc z = ff7.z(dpcVar);
                if (z == null) {
                    xq0.q("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = z.U0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean Z = Z(i, lmaVar, z, ynnVar);
                        if (!Intrinsics.d(Z, Boolean.FALSE)) {
                            return Z;
                        }
                        if (ynnVar == null) {
                            if (z.U0() != bpc.b) {
                                xq0.q("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            dpc x = ff7.x(z);
                            if (x == null) {
                                xq0.q("ActiveParent must have a focusedChild");
                                return null;
                            }
                            ynnVar = ff7.y(x);
                        }
                        return Boolean.valueOf(B(i, lmaVar, dpcVar, ynnVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return null;
                        }
                        xq0.q("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (ynnVar == null) {
                    ynnVar = ff7.y(z);
                }
                return Boolean.valueOf(B(i, lmaVar, dpcVar, ynnVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return dpcVar.T0().a ? (Boolean) lmaVar.invoke(dpcVar) : ynnVar == null ? Boolean.valueOf(y(dpcVar, i, lmaVar)) : Boolean.valueOf(M(i, lmaVar, dpcVar, ynnVar));
                }
                b6e.s();
                return null;
            }
        }
        return Boolean.valueOf(y(dpcVar, i, lmaVar));
    }

    public static Uri a0(Context context, File file) {
        context.getClass();
        file.getClass();
        Uri d = hac.d(context, context.getPackageName() + ".musicfileprovider", file);
        d.getClass();
        return d;
    }

    public static final void c(na0 na0Var, aqi aqiVar, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1877923803);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(na0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(aqiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            int i3 = i2 & 14;
            boolean f = ((i2 & 112) == 32) | (i3 == 4) | oq5Var.f(view);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new zxi(na0Var, new ykl(view, 0), aqiVar);
                oq5Var.k0(K);
            }
            yci b = a.b(androidx.compose.ui.input.nestedscroll.a.a(yciVar, (zxi) K, null), ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i);
            boolean z = i3 == 4;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new rkl(na0Var, 1);
                oq5Var.k0(K2);
            }
            yci s = wyf.s(b, (Function0) K2);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, s);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i2 >> 6) & 14, wn5Var, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 0, na0Var, aqiVar, wn5Var, yciVar);
        }
    }

    public static final void d(String str, vti vtiVar, hq5 hq5Var, int i) {
        fvf fvfVar;
        zti ztiVar;
        vti vtiVar2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1060649512);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(vtiVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            zti ztiVar2 = (zti) szf.Q(vtiVar.c, oq5Var).getValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, ztiVar2 instanceof xti, null, oq5Var, 4096, 5);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                fvfVar = a;
                ztiVar = ztiVar2;
                k5h k5hVar = new k5h(0, vtiVar, vti.class, "onBackClick", "onBackClick()V", 0, 28);
                vtiVar2 = vtiVar;
                oq5Var.k0(k5hVar);
                K = k5hVar;
            } else {
                ztiVar = ztiVar2;
                fvfVar = a;
                vtiVar2 = vtiVar;
            }
            xp3.d(str, fvfVar, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(592389518, new vtb(12, ztiVar, fvfVar, vtiVar2), oq5Var), oq5Var, i2 & 14, 48, 2020);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sti(str, vtiVar, i);
        }
    }

    public static final void e(vuf vufVar, ArrayList arrayList, int i, q0k q0kVar, m18 m18Var, Function0 function0) {
        vufVar.getClass();
        m18Var.getClass();
        vuf.Y(vufVar, null, new wn5(new g9j(q0kVar, i, arrayList, function0, 1), -1456633480, true), 3);
        l18 l18Var = l18.b;
        bdt I = hag.I(fdj.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        fdj fdjVar = (fdj) qdcVar.C(I);
        List q0 = CollectionsKt.q0(arrayList, 5);
        vufVar.Z(q0.size(), new afg(9, new m2j(22), q0), new zcf(q0, 10), new wn5(new t50(q0, m18Var, fdjVar, 13), -632812321, true));
    }

    public static final void f(int i, hq5 hq5Var, e9g e9gVar, yci yciVar, Function2 function2) {
        int i2;
        qo6 qo6Var = qo6.a;
        wn5 wn5Var = i4w.l;
        wn5 wn5Var2 = i4w.m;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(818609875);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(3) ? 32 : 16;
        }
        int i3 = 0;
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.d(e9gVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.h(function2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new bff(25);
                oq5Var.k0(K);
            }
            ngg.i((Function0) K, yciVar, ild.C(640559253, new z8g(e9gVar, i3), oq5Var), false, 0L, null, function2, 0.0f, null, ild.C(-117122258, new rea(29), oq5Var), oq5Var, ((i2 >> 15) & 112) | 805309830 | ((i2 >> 3) & 3670016), 432);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(e9gVar, yciVar, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(boolean z, qo6 qo6Var, boolean z2, e9g e9gVar, yci yciVar, boolean z3, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z4;
        int i4;
        Function2 function22;
        long j;
        Object K;
        qo6 qo6Var2;
        oq5 oq5Var;
        xmn r;
        e9gVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-662923787);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(qo6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.d(e9gVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z4 = z3;
            i3 |= oq5Var2.g(z4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                function22 = function2;
                i3 |= oq5Var2.h(function22) ? 1048576 : 524288;
                if ((599187 & i3) == 599186 || !oq5Var2.z()) {
                    if (i5 != 0) {
                        z4 = false;
                    }
                    Function2 function23 = i4 != 0 ? null : function22;
                    if (z4) {
                        oq5Var2.Z(-1414577280);
                        oq5Var2.p(false);
                        j = d85.m;
                    } else {
                        oq5Var2.Z(-1414576060);
                        j = ((dq0) oq5Var2.j(eq0.a)).c.a;
                        oq5Var2.p(false);
                    }
                    long j2 = j;
                    K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new bff(26);
                        oq5Var2.k0(K);
                    }
                    qo6Var2 = qo6Var;
                    oq5Var = oq5Var2;
                    ngg.i((Function0) K, yciVar, ild.C(1869039543, new oc1(z, e9gVar, qo6Var2), oq5Var2), false, j2, null, function23, 0.0f, null, ild.C(1327930960, new a9g(0, z, z2), oq5Var2), oq5Var, ((i3 >> 9) & 112) | 805309830 | (i3 & 3670016), NetworkRequestException.INVALID_RANGE);
                    function22 = function23;
                } else {
                    oq5Var2.S();
                    qo6Var2 = qo6Var;
                    oq5Var = oq5Var2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new b9g(z, qo6Var2, z2, e9gVar, yciVar, z4, function22, i, i2);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((599187 & i3) == 599186) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (z4) {
            }
            long j22 = j;
            K = oq5Var2.K();
            if (K == gq5.a) {
            }
            qo6Var2 = qo6Var;
            oq5Var = oq5Var2;
            ngg.i((Function0) K, yciVar, ild.C(1869039543, new oc1(z, e9gVar, qo6Var2), oq5Var2), false, j22, null, function23, 0.0f, null, ild.C(1327930960, new a9g(0, z, z2), oq5Var2), oq5Var, ((i3 >> 9) & 112) | 805309830 | (i3 & 3670016), NetworkRequestException.INVALID_RANGE);
            function22 = function23;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z4 = z3;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((599187 & i3) == 599186) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (z4) {
        }
        long j222 = j;
        K = oq5Var2.K();
        if (K == gq5.a) {
        }
        qo6Var2 = qo6Var;
        oq5Var = oq5Var2;
        ngg.i((Function0) K, yciVar, ild.C(1869039543, new oc1(z, e9gVar, qo6Var2), oq5Var2), false, j222, null, function23, 0.0f, null, ild.C(1327930960, new a9g(0, z, z2), oq5Var2), oq5Var, ((i3 >> 9) & 112) | 805309830 | (i3 & 3670016), NetworkRequestException.INVALID_RANGE);
        function22 = function23;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10.K(), java.lang.Integer.valueOf(r0)) == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(na0 na0Var, hvb hvbVar, iml imlVar, st4 st4Var, jub jubVar, h4b h4bVar, drh drhVar, Function0 function0, boolean z, sdr sdrVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        Object obj;
        int i2;
        Boolean bool;
        sdr sdrVar2;
        Boolean bool2;
        sdr sdrVar3;
        na0 na0Var2 = na0Var;
        ja0 ja0Var = na0Var2.e;
        hvbVar.getClass();
        imlVar.getClass();
        st4Var.getClass();
        jubVar.getClass();
        drhVar.getClass();
        function0.getClass();
        sdrVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1968061777);
        int i3 = i | (oq5Var2.f(na0Var2) ? 4 : 2) | (oq5Var2.f(hvbVar) ? 32 : 16) | (oq5Var2.h(imlVar) ? 256 : 128) | (oq5Var2.h(st4Var) ? 2048 : 1024) | (oq5Var2.h(jubVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(h4bVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(drhVar) ? 1048576 : 524288) | (oq5Var2.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.g(z) ? 67108864 : 33554432) | (oq5Var2.f(sdrVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var2.P(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object K = oq5Var2.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            aqi O = gld.O(imlVar.i, oq5Var2);
            aqi O2 = gld.O(imlVar.j, oq5Var2);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == obj2) {
                K2 = szf.U(new rkl(na0Var2, 0));
                oq5Var2.k0(K2);
            }
            sdr sdrVar4 = (sdr) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj2) {
                K3 = szf.U(new xtb(O, 17));
                oq5Var2.k0(K3);
            }
            sdr sdrVar5 = (sdr) K3;
            Boolean bool3 = (Boolean) sdrVar4.getValue();
            bool3.booleanValue();
            Boolean bool4 = (Boolean) sdrVar5.getValue();
            bool4.booleanValue();
            boolean f = oq5Var2.f(sdrVar4) | (i4 == 4) | ((i3 & 29360128) == 8388608);
            Object K4 = oq5Var2.K();
            if (f || K4 == obj2) {
                obj = obj2;
                i2 = i4;
                bool = bool4;
                sdrVar2 = sdrVar5;
                bool2 = bool3;
                Object fllVar = new fll(sdrVar4, na0Var2, function0, sdrVar2, null, 0);
                na0Var2 = na0Var2;
                oq5Var2.k0(fllVar);
                K4 = fllVar;
            } else {
                bool = bool4;
                obj = obj2;
                i2 = i4;
                sdrVar2 = sdrVar5;
                bool2 = bool3;
            }
            gld.x(bool2, na0Var2, bool, (Function2) K4, oq5Var2);
            quj.a(ja0Var, oq5Var2, 0);
            f8g.b(ja0Var, oq5Var2, 0);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function02);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                sdrVar3 = sdrVar2;
            } else {
                sdrVar3 = sdrVar2;
            }
            ouj.x(i5, oq5Var2, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, vciVar);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function02);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            float j = qt4.j(oq5Var2);
            boolean booleanValue = ((Boolean) sdrVar4.getValue()).booleanValue();
            Object K5 = oq5Var2.K();
            if (K5 == obj) {
                K5 = new sjl(15);
                oq5Var2.k0(K5);
            }
            yci b = nfp.b(vciVar, false, (Function1) K5);
            int i7 = 1;
            oq5Var = oq5Var2;
            j(na0Var, j, h4bVar, booleanValue, ild.C(937239226, new all(function0, mm6Var, na0Var, O2, st4Var, sdrVar3, O, 0), oq5Var2), ild.C(-716698279, new ukl(O, jubVar, mm6Var, na0Var, drhVar, i7), oq5Var2), ild.C(1924331512, new tkl(imlVar, O, jubVar, hvbVar, z, i7), oq5Var2), sdrVar, b, oq5Var, i2 | 1794048 | ((i3 >> 9) & 896) | ((i3 >> 6) & 29360128));
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bll(na0Var, hvbVar, imlVar, st4Var, jubVar, h4bVar, drhVar, function0, z, sdrVar, yciVar2, i, 0);
        }
    }

    public static final void i(final na0 na0Var, final aqi aqiVar, final h4b h4bVar, final boolean z, final boolean z2, final sdr sdrVar, final wn5 wn5Var, final wn5 wn5Var2, final float f, yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        aqi aqiVar2;
        h4b h4bVar2;
        boolean z3;
        boolean z4;
        sdr sdrVar2;
        wn5 wn5Var3;
        wn5 wn5Var4;
        float f2;
        final yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2082782341);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(na0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aqiVar2 = aqiVar;
            i2 |= oq5Var.f(aqiVar2) ? 32 : 16;
        } else {
            aqiVar2 = aqiVar;
        }
        if ((i & 384) == 0) {
            h4bVar2 = h4bVar;
            i2 |= oq5Var.f(h4bVar2) ? 256 : 128;
        } else {
            h4bVar2 = h4bVar;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= oq5Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= oq5Var.g(z4) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            sdrVar2 = sdrVar;
            i2 |= oq5Var.f(sdrVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((1572864 & i) == 0) {
            wn5Var3 = wn5Var;
            i2 |= oq5Var.h(wn5Var3) ? 1048576 : 524288;
        } else {
            wn5Var3 = wn5Var;
        }
        if ((12582912 & i) == 0) {
            wn5Var4 = wn5Var2;
            i2 |= oq5Var.h(wn5Var4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            wn5Var4 = wn5Var2;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i2 |= oq5Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        int i3 = i2 | 805306368;
        if (oq5Var.P(i3 & 1, (306783379 & i3) != 306783378)) {
            wn5 C = ild.C(-1732964622, new vkl(z4, na0Var.e, z3, f2, wn5Var3, wn5Var4), oq5Var);
            int i4 = i3 >> 3;
            vci vciVar = vci.a;
            o8g.c(na0Var, h4bVar2, aqiVar2, C, sdrVar2, vciVar, oq5Var, ((i3 >> 12) & 458752) | (i3 & 14) | 3072 | (i4 & 112) | ((i3 << 3) & 896) | (i4 & 57344));
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: wkl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c9g.i(na0.this, aqiVar, h4bVar, z, z2, sdrVar, wn5Var, wn5Var2, f, yciVar2, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final na0 na0Var, final float f, final h4b h4bVar, final boolean z, final wn5 wn5Var, final wn5 wn5Var2, final wn5 wn5Var3, final sdr sdrVar, final yci yciVar, hq5 hq5Var, final int i) {
        sdr sdrVar2;
        aqi aqiVar;
        boolean z2;
        boolean z3;
        sdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1259076090);
        int i2 = (oq5Var.f(na0Var) ? 4 : 2) | i | (oq5Var.c(f) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(h4bVar) ? 256 : 128;
        }
        int i3 = i2 | (oq5Var.g(z) ? 2048 : 1024);
        if ((12582912 & i) == 0) {
            i3 |= oq5Var.f(sdrVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i4 = i3 | (oq5Var.f(yciVar) ? 67108864 : 33554432);
        if (oq5Var.P(i4 & 1, (38347923 & i4) != 38347922)) {
            ja0 ja0Var = na0Var.e;
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new ufl(20);
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            if (((Boolean) sdrVar.getValue()).booleanValue()) {
                oq5Var.Z(-1185662614);
                Object K2 = oq5Var.K();
                if (K2 == obj) {
                    K2 = szf.g0(Boolean.FALSE);
                    oq5Var.k0(K2);
                }
                sdrVar2 = (aqi) K2;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1185603931);
                boolean f2 = oq5Var.f(ja0Var);
                Object K3 = oq5Var.K();
                if (f2 || K3 == obj) {
                    K3 = szf.U(new q90(ja0Var, 11));
                    oq5Var.k0(K3);
                }
                sdrVar2 = (sdr) K3;
                oq5Var.p(false);
            }
            yci b = d.b(yciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(1942955901);
                Object K4 = oq5Var.K();
                if (K4 == obj) {
                    K4 = new sjl(14);
                    oq5Var.k0(K4);
                }
                Function1 function1 = (Function1) K4;
                ja0Var.getClass();
                function1.getClass();
                gab gabVar = new gab(9, ja0Var, function1);
                aqiVar = aqiVar2;
                z2 = false;
                z3 = true;
                c(na0Var, aqiVar, wn5Var3, androidx.compose.ui.layout.a.b(vci.a, gabVar), oq5Var, (i4 & 14) | 384);
            } else {
                aqiVar = aqiVar2;
                z2 = false;
                z3 = true;
                oq5Var.Z(1926769654);
            }
            oq5Var.p(z2);
            i(na0Var, aqiVar, h4bVar, ((Boolean) sdrVar2.getValue()).booleanValue(), z, sdrVar, wn5Var2, wn5Var, f, null, oq5Var, (i4 & 910) | ((i4 << 3) & 57344) | (458752 & (i4 >> 6)) | 14155776 | ((i4 << 21) & 234881024));
            oq5Var.p(z3);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: skl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c9g.j(na0.this, f, h4bVar, z, wn5Var, wn5Var2, wn5Var3, sdrVar, yciVar, (hq5) obj2, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(aam aamVar, hq5 hq5Var, int i) {
        aamVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1179761196);
        int i2 = (oq5Var.f(aamVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new ril(19, aamVar);
                oq5Var.k0(K);
            }
            pd.c(0, 1, oq5Var, (Function0) K, false);
            boolean z2 = i3 == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new s8i(26, aamVar);
                oq5Var.k0(K2);
            }
            androidx.compose.ui.viewinterop.a.a(48, 4, oq5Var, d.c(vci.a, 1.0f), (Function1) K2, null);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(aamVar, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static final void l(xxk xxkVar, v7l v7lVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        v7l v7lVar2;
        Function1 function12;
        aqi aqiVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        poi poiVar;
        kb5 kb5Var3;
        kjn kjnVar;
        grb grbVar;
        ?? r5;
        kb5 kb5Var4;
        aqi aqiVar2;
        sdr o0;
        float floatValue;
        aqi aqiVar3;
        long e;
        xxkVar.getClass();
        v7lVar.getClass();
        float f = v7lVar.c;
        long j = v7lVar.d;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1178004419);
        int i2 = i | (oq5Var.f(xxkVar) ? 4 : 2) | (oq5Var.f(v7lVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                K = tlm.h(f, oq5Var);
            }
            poi poiVar2 = (poi) K;
            boolean z2 = i4 == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar2) {
                K2 = szf.g0(Boolean.TRUE);
                oq5Var.k0(K2);
            }
            aqi aqiVar4 = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar2) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K3);
            }
            aqi aqiVar5 = (aqi) K3;
            if (((Boolean) oq5Var.j((agr) npg.d.c)).booleanValue()) {
                oq5Var.Z(902446397);
                kb5Var3 = kb5Var5;
                kb5Var2 = kb5Var6;
                grbVar = grbVar2;
                kb5Var = kb5Var7;
                kjnVar = kjnVar2;
                r5 = 0;
                aqiVar = aqiVar5;
                kb5Var4 = kb5Var8;
                poiVar = poiVar2;
                aqiVar2 = aqiVar4;
                o0 = gut.T0(v7lVar.c, v7lVar.d, v7lVar.f, v7lVar.a, xxkVar, oq5Var, (i2 << 12) & 57344, 224);
                oq5Var.p(false);
            } else {
                aqiVar = aqiVar5;
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var6;
                poiVar = poiVar2;
                kb5Var3 = kb5Var5;
                kjnVar = kjnVar2;
                grbVar = grbVar2;
                r5 = 0;
                kb5Var4 = kb5Var8;
                aqiVar2 = aqiVar4;
                oq5Var.Z(902770161);
                o0 = szf.o0(Float.valueOf(f), oq5Var);
                oq5Var.p(false);
            }
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                aqiVar2.setValue(Boolean.FALSE);
                floatValue = ((t6k) poiVar).e();
            } else if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                floatValue = ((Number) o0.getValue()).floatValue();
            } else {
                t6k t6kVar = (t6k) poiVar;
                float e2 = t6kVar.e();
                float e3 = (500.0f / j) + t6kVar.e();
                float floatValue2 = ((Number) o0.getValue()).floatValue();
                if (e2 > floatValue2 || floatValue2 > e3) {
                    floatValue = t6kVar.e();
                } else {
                    aqiVar2.setValue(Boolean.TRUE);
                    floatValue = ((Number) o0.getValue()).floatValue();
                }
            }
            float f2 = floatValue;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "seek_bar");
            long j2 = d85.f;
            agr agrVar = eq0.a;
            lr7 s = gdg.s(j2, ((dq0) oq5Var.j(agrVar)).a.a, ((dq0) oq5Var.j(agrVar)).a.e, oq5Var, 6, 4046);
            float f3 = 5;
            rtq rtqVar = new rtq(2, f3, 10, 1, f3, 10);
            boolean f4 = oq5Var.f(poiVar);
            Object K4 = oq5Var.K();
            if (f4 || K4 == kjnVar) {
                aqiVar3 = aqiVar;
                K4 = new xum((int) r5, aqiVar3, poiVar);
                oq5Var.k0(K4);
            } else {
                aqiVar3 = aqiVar;
            }
            Function1 function13 = (Function1) K4;
            boolean f5 = oq5Var.f(poiVar) | ((i2 & 896) == 256 ? true : r5);
            Object K5 = oq5Var.K();
            if (f5 || K5 == kjnVar) {
                function12 = function1;
                K5 = new p3e(19, function12, poiVar, aqiVar3);
                oq5Var.k0(K5);
            } else {
                function12 = function1;
            }
            kuq.b(f2, function13, a2, rtqVar, null, false, null, 0, (Function1) K5, s, oq5Var, 384, 752);
            if (((Boolean) aqiVar3.getValue()).booleanValue() || !((Boolean) aqiVar2.getValue()).booleanValue()) {
                v7lVar2 = v7lVar;
                e = (long) (((t6k) poiVar).e() * j);
            } else {
                v7lVar2 = v7lVar;
                e = v7lVar2.e;
            }
            yci k = androidx.compose.foundation.layout.a.k(d.d(vciVar, 1.0f), 0.0f, -12, 1);
            nho a3 = lho.a(qx0.g, b2c.k, oq5Var, 6);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, k);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var3);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            String N = rvf.N(R.string.player_progress_description, new Object[]{saf.q0(e)}, oq5Var);
            String N2 = rvf.N(R.string.player_duration_description, new Object[]{saf.q0(j)}, oq5Var);
            xcs.b(lxe.K(e), b.c(androidx.compose.ui.platform.a.a(ksw.D(vciVar, N, null), "progress_time_text"), "progress", Long.valueOf(e)), ((dq0) oq5Var.j(agrVar)).a.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
            xcs.b(lxe.K(j), b.c(androidx.compose.ui.platform.a.a(ksw.D(vciVar, N2, null), "duration_time_text"), "duration", Long.valueOf(j)), ((dq0) oq5Var.j(agrVar)).a.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            v7lVar2 = v7lVar;
            function12 = function1;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 13, xxkVar, v7lVar2, function12, yciVar);
        }
    }

    public static final void m(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(831387561);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s7g.k(null, xv7.h, xv7.i, ild.C(-2018157064, new xtp(6, function0), oq5Var), vciVar, false, null, oq5Var, ((i2 << 9) & 57344) | 3510, 224);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(function0, i, 8);
        }
    }

    public static final void n(jd1 jd1Var, yci yciVar, Function0 function0, Function1 function1, hq5 hq5Var, int i) {
        yci yciVar2;
        jd1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(262675797);
        int i2 = i | (oq5Var.f(jd1Var) ? 4 : 2) | 48 | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ges gesVar = neg.t(oq5Var).g.a;
            ges gesVar2 = neg.t(oq5Var).g.b;
            neg.s(oq5Var);
            String M = rvf.M(R.string.menu_element_like, oq5Var);
            String M2 = rvf.M(u2x.r(jd1Var.c, oq5Var), oq5Var);
            vci vciVar = vci.a;
            yci D = ksw.D(vciVar, M, M2);
            boolean z = (i2 & 7168) == 2048;
            Object K = oq5Var.K();
            int i3 = 3;
            if (z || K == gq5.a) {
                K = new ai6(i3, function1);
                oq5Var.k0(K);
            }
            jf0.c(function0, jd1Var, gesVar, gesVar2, com.yandex.music.core.ui.compose.a.b(D, null, 0L, 0.0f, null, (Function2) K, 15), ild.C(-1592053813, new f5r(25, jd1Var), oq5Var), e9g.b, null, oq5Var, ((i2 >> 6) & 14) | 1769472 | ((i2 << 3) & 112), 128);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 13, jd1Var, yciVar2, function0, function1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d6 -> B:15:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00eb -> B:11:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(hur hurVar, Function2 function2, kq2 kq2Var) {
        juw juwVar;
        int i;
        xps xpsVar;
        xps xpsVar2;
        hur hurVar2;
        Function2 function22;
        ffm ffmVar;
        List list;
        Iterator it;
        boolean z;
        Object a;
        List list2;
        Iterator it2;
        if (kq2Var instanceof juw) {
            juwVar = (juw) kq2Var;
            int i2 = juwVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                juwVar.o = i2 - Integer.MIN_VALUE;
                Object obj = juwVar.n;
                nm6 nm6Var = nm6.a;
                i = juwVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    xpsVar = new xps(hurVar.c().f());
                    gfm gfmVar = gfm.b;
                    juwVar.j = hurVar;
                    juwVar.k = function2;
                    juwVar.l = xpsVar;
                    juwVar.m = null;
                    juwVar.o = 1;
                    a = hurVar.a(gfmVar, juwVar);
                    if (a != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    xps xpsVar3 = juwVar.l;
                    Function2 function23 = juwVar.k;
                    hur hurVar3 = juwVar.j;
                    qgg.h0(obj);
                    hurVar2 = hurVar3;
                    function22 = function23;
                    xpsVar2 = xpsVar3;
                    ffmVar = (ffm) obj;
                    list = ffmVar.a;
                    if (list instanceof Collection) {
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    xpsVar2.getClass();
                    if (xpsVar2.c) {
                    }
                    function22.invoke(ffmVar, Boolean.valueOf(z));
                    if (!z) {
                    }
                    xpsVar = xpsVar2;
                    function2 = function22;
                    list2 = ffmVar.a;
                    if (list2 instanceof Collection) {
                    }
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ffmVar = juwVar.m;
                xpsVar2 = juwVar.l;
                function22 = juwVar.k;
                hurVar2 = juwVar.j;
                qgg.h0(obj);
                List list3 = ((ffm) obj).a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (((lfm) it3.next()).b()) {
                            break;
                        }
                    }
                }
                xpsVar = xpsVar2;
                function2 = function22;
                list2 = ffmVar.a;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((lfm) it2.next()).d) {
                            hurVar = hurVar2;
                            gfm gfmVar2 = gfm.b;
                            juwVar.j = hurVar;
                            juwVar.k = function2;
                            juwVar.l = xpsVar;
                            juwVar.m = null;
                            juwVar.o = 1;
                            a = hurVar.a(gfmVar2, juwVar);
                            if (a != nm6Var) {
                                function22 = function2;
                                xpsVar2 = xpsVar;
                                obj = a;
                                hurVar2 = hurVar;
                                ffmVar = (ffm) obj;
                                list = ffmVar.a;
                                if ((list instanceof Collection) || !list.isEmpty()) {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lfm) it.next()).b()) {
                                            break;
                                        }
                                    }
                                }
                                xpsVar2.getClass();
                                if (xpsVar2.c) {
                                    z = true;
                                } else {
                                    if (ffmVar.a.size() > 1) {
                                        xpsVar2.c = true;
                                    } else {
                                        long h = enj.h(xpsVar2.b, q5g.A(ffmVar));
                                        xpsVar2.b = h;
                                        xpsVar2.c = enj.d(h) > xpsVar2.a;
                                    }
                                    z = xpsVar2.c;
                                }
                                function22.invoke(ffmVar, Boolean.valueOf(z));
                                if (!z) {
                                    gfm gfmVar3 = gfm.c;
                                    juwVar.j = hurVar2;
                                    juwVar.k = function22;
                                    juwVar.l = xpsVar2;
                                    juwVar.m = ffmVar;
                                    juwVar.o = 2;
                                    obj = hurVar2.a(gfmVar3, juwVar);
                                }
                                xpsVar = xpsVar2;
                                function2 = function22;
                                list2 = ffmVar.a;
                                if (list2 instanceof Collection) {
                                }
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                }
                            }
                            return nm6Var;
                        }
                    }
                }
                return Unit.a;
            }
        }
        juwVar = new juw(kq2Var);
        Object obj2 = juwVar.n;
        nm6 nm6Var2 = nm6.a;
        i = juwVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (r14.l(r6, r1) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(uol uolVar, long j, cg6 cg6Var) {
        map mapVar;
        Object obj;
        int i;
        long j2;
        long j3;
        long j4;
        if (cg6Var instanceof map) {
            mapVar = (map) cg6Var;
            int i2 = mapVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapVar.m = i2 - Integer.MIN_VALUE;
                obj = mapVar.l;
                nm6 nm6Var = nm6.a;
                i = mapVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    mapVar.j = uolVar;
                    mapVar.k = j;
                    mapVar.m = 1;
                    obj = uolVar.a(mapVar);
                    if (obj != nm6Var) {
                        j2 = j;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    j2 = mapVar.k;
                    uolVar = mapVar.j;
                    qgg.h0(obj);
                } else {
                    if (i == 2) {
                        j3 = mapVar.k;
                        uolVar = mapVar.j;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return Boolean.FALSE;
                        }
                        mapVar.j = uolVar;
                        mapVar.k = j3;
                        mapVar.m = 3;
                        obj = uolVar.f(mapVar);
                        if (obj != nm6Var) {
                            j4 = j3;
                            if (Math.abs(j4 - ((Number) obj).longValue()) >= 500) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            qgg.h0(obj);
                            return Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = mapVar.k;
                    uolVar = mapVar.j;
                    qgg.h0(obj);
                    if (Math.abs(j4 - ((Number) obj).longValue()) >= 500) {
                        return Boolean.TRUE;
                    }
                    mapVar.j = null;
                    mapVar.k = j4;
                    mapVar.m = 4;
                }
                if (((Number) obj).longValue() == 0) {
                    j3 = j2;
                    mapVar.j = uolVar;
                    mapVar.k = j3;
                    mapVar.m = 3;
                    obj = uolVar.f(mapVar);
                    if (obj != nm6Var) {
                    }
                    return nm6Var;
                }
                mapVar.j = uolVar;
                mapVar.k = j2;
                mapVar.m = 2;
                obj = x97.V(dm6.b(), new d7i((cr) uolVar.a.a, continuation, 20), mapVar);
                if (obj != nm6Var) {
                    j3 = j2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    mapVar.j = uolVar;
                    mapVar.k = j3;
                    mapVar.m = 3;
                    obj = uolVar.f(mapVar);
                    if (obj != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        mapVar = new map(cg6Var);
        obj = mapVar.l;
        nm6 nm6Var2 = nm6.a;
        i = mapVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Number) obj).longValue() == 0) {
        }
    }

    public static final boolean q(Window window, vyr vyrVar) {
        window.getClass();
        vyrVar.getClass();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = vyrVar.a;
        return (systemUiVisibility & i) == i;
    }

    public static final z7v r(CharSequence charSequence, cds cdsVar, int i) {
        charSequence.getClass();
        ArrayList arrayList = new ArrayList();
        ogi ogiVar = cdsVar.b;
        int min = Math.min(i, ogiVar.f);
        for (int i2 = 0; i2 < min; i2++) {
            try {
                int e = cdsVar.e(i2);
                if (e < 0) {
                    e = 0;
                }
                int d = ogiVar.d(i2, false);
                int length = charSequence.length();
                if (d > length) {
                    d = length;
                }
                String obj = StringsKt.t0(charSequence.subSequence(e, d).toString()).toString();
                if (!StringsKt.U(obj)) {
                    arrayList.add(obj);
                }
            } catch (StringIndexOutOfBoundsException e2) {
                Assertions.throwOrSkip("WaveWords", new FailedAssertionException("find broken line: " + ((Object) charSequence), e2));
            }
        }
        return new z7v(arrayList, i < ogiVar.f);
    }

    public static final boolean s(ynn ynnVar, ynn ynnVar2, ynn ynnVar3, int i) {
        float f;
        float f2;
        boolean t = t(i, ynnVar3, ynnVar);
        float f3 = ynnVar3.b;
        float f4 = ynnVar3.d;
        float f5 = ynnVar3.a;
        float f6 = ynnVar3.c;
        float f7 = ynnVar.d;
        float f8 = ynnVar.b;
        float f9 = ynnVar.c;
        float f10 = ynnVar.a;
        if (t || !t(i, ynnVar2, ynnVar)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return false;
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - ynnVar2.c;
        } else if (i == 4) {
            f = ynnVar2.a - f9;
        } else if (i == 5) {
            f = f8 - ynnVar2.d;
        } else {
            if (i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return false;
            }
            f = ynnVar2.b - f7;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return false;
            }
            f2 = f4 - f7;
        }
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return f < f2;
    }

    public static final boolean t(int i, ynn ynnVar, ynn ynnVar2) {
        if (i == 3 || i == 4) {
            return ynnVar.d > ynnVar2.b && ynnVar.b < ynnVar2.d;
        }
        if (i == 5 || i == 6) {
            return ynnVar.c > ynnVar2.a && ynnVar.a < ynnVar2.c;
        }
        xq0.q("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void u(Window window, vyr vyrVar, boolean z) {
        window.getClass();
        vyrVar.getClass();
        window.getDecorView().setSystemUiVisibility(z ? window.getDecorView().getSystemUiVisibility() | vyrVar.a : window.getDecorView().getSystemUiVisibility() & (~vyrVar.a));
    }

    public static final void v(dpc dpcVar, eqi eqiVar) {
        if (!dpcVar.a.n) {
            sme.b("visitChildren called on an unattached node");
        }
        eqi eqiVar2 = new eqi(new xci[16]);
        xci xciVar = dpcVar.a;
        xci xciVar2 = xciVar.f;
        if (xciVar2 == null) {
            bcx.o(eqiVar2, xciVar);
        } else {
            eqiVar2.d(xciVar2);
        }
        while (true) {
            int i = eqiVar2.c;
            if (i == 0) {
                return;
            }
            xci xciVar3 = (xci) eqiVar2.m(i - 1);
            if ((xciVar3.d & 1024) == 0) {
                bcx.o(eqiVar2, xciVar3);
            } else {
                while (true) {
                    if (xciVar3 == null) {
                        break;
                    }
                    if ((xciVar3.c & 1024) != 0) {
                        eqi eqiVar3 = null;
                        while (xciVar3 != null) {
                            if (xciVar3 instanceof dpc) {
                                dpc dpcVar2 = (dpc) xciVar3;
                                if (dpcVar2.n && !bcx.F(dpcVar2).v0) {
                                    if (dpcVar2.T0().a) {
                                        eqiVar.d(dpcVar2);
                                    } else {
                                        v(dpcVar2, eqiVar);
                                    }
                                }
                            } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                                int i2 = 0;
                                for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                    if ((xciVar4.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            xciVar3 = xciVar4;
                                        } else {
                                            if (eqiVar3 == null) {
                                                eqiVar3 = new eqi(new xci[16]);
                                            }
                                            if (xciVar3 != null) {
                                                eqiVar3.d(xciVar3);
                                                xciVar3 = null;
                                            }
                                            eqiVar3.d(xciVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            xciVar3 = bcx.p(eqiVar3);
                        }
                    } else {
                        xciVar3 = xciVar3.f;
                    }
                }
            }
        }
    }

    public static final dxb w(fgb fgbVar) {
        if ((fgbVar instanceof bgb) || (fgbVar instanceof cgb)) {
            return null;
        }
        if (fgbVar instanceof dgb) {
            return ((dgb) fgbVar).b;
        }
        if (fgbVar instanceof egb) {
            return ((egb) fgbVar).b;
        }
        b6e.s();
        return null;
    }

    public static final dpc x(eqi eqiVar, ynn ynnVar, int i) {
        ynn k;
        if (i == 3) {
            k = ynnVar.k((ynnVar.c - ynnVar.a) + 1, 0.0f);
        } else if (i == 4) {
            k = ynnVar.k(-((ynnVar.c - ynnVar.a) + 1), 0.0f);
        } else if (i == 5) {
            k = ynnVar.k(0.0f, (ynnVar.d - ynnVar.b) + 1);
        } else {
            if (i != 6) {
                xq0.q("This function should only be used for 2-D focus search");
                return null;
            }
            k = ynnVar.k(0.0f, -((ynnVar.d - ynnVar.b) + 1));
        }
        Object[] objArr = eqiVar.a;
        int i2 = eqiVar.c;
        dpc dpcVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            dpc dpcVar2 = (dpc) objArr[i3];
            if (ff7.G(dpcVar2)) {
                ynn y = ff7.y(dpcVar2);
                if (G(y, k, ynnVar, i)) {
                    dpcVar = dpcVar2;
                    k = y;
                }
            }
        }
        return dpcVar;
    }

    public static final boolean y(dpc dpcVar, int i, Function1 function1) {
        ynn ynnVar;
        eqi eqiVar = new eqi(new dpc[16]);
        v(dpcVar, eqiVar);
        int i2 = eqiVar.c;
        if (i2 <= 1) {
            dpc dpcVar2 = (dpc) (i2 == 0 ? null : eqiVar.a[0]);
            if (dpcVar2 != null) {
                return ((Boolean) function1.invoke(dpcVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                ynn y = ff7.y(dpcVar);
                float f = y.a;
                float f2 = y.b;
                ynnVar = new ynn(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    xq0.q("This function should only be used for 2-D focus search");
                    return false;
                }
                ynn y2 = ff7.y(dpcVar);
                float f3 = y2.c;
                float f4 = y2.d;
                ynnVar = new ynn(f3, f4, f3, f4);
            }
            dpc x = x(eqiVar, ynnVar, i);
            if (x != null) {
                return ((Boolean) function1.invoke(x)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:32:0x008e BREAK  A[LOOP:0: B:10:0x0014->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List z(p97 p97Var, int i, int i2) {
        Pair pair;
        boolean z;
        p97Var.getClass();
        if (i == i2) {
            return c5b.a;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = p97Var.a;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                        if (pair != null) {
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        if (pair != null) {
                            break;
                        }
                        Map map = (Map) pair.a;
                        Iterator it = ((Iterable) pair.b).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = p97Var.a;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    @Override // defpackage.esq
    public float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }
}
