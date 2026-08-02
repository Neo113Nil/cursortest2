package defpackage;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.playlist.ChartResultDto;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.music.shared.dto.playlist.chart.ChartTrackDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class wct {
    public static final wn5 a = new wn5(new rz3(2), -223825021, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final char[] f;
    public static final Object g;
    public static boolean h;

    static {
        new wn5(new bo5(19), 1748873620, false);
        b = new wn5(new io5(25), 1455737226, false);
        c = new wn5(new io5(26), -507260095, false);
        d = new wn5(new ro5(20), -553304922, false);
        e = new wn5(new ep5(1), 730739796, false);
        f = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        g = new Object();
    }

    public static final khb A(String str, ArrayList arrayList) {
        if (arrayList.size() == 1) {
            return new khb("Method requires non empty argument list.", (Throwable) null);
        }
        return new khb("Method has no matching overload for given argument types: " + ghh.T(arrayList.subList(1, arrayList.size())) + '.', (Throwable) null);
    }

    public static xbl B(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1222878633);
        xbl xblVar = (xbl) oq5Var.j(lf7.a);
        oq5Var.p(false);
        return xblVar;
    }

    public static final String C(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }

    public static boolean D(int i, Object obj) {
        int i2;
        if (obj instanceof syc) {
            if (obj instanceof bzc) {
                i2 = ((bzc) obj).getArity();
            } else if (obj instanceof Function0) {
                i2 = 0;
            } else if (obj instanceof Function1) {
                i2 = 1;
            } else if (obj instanceof Function2) {
                i2 = 2;
            } else if (obj instanceof pyc) {
                i2 = 3;
            } else if (obj instanceof ryc) {
                i2 = 4;
            } else if (obj instanceof tyc) {
                i2 = 5;
            } else if (obj instanceof uyc) {
                i2 = 6;
            } else if (obj instanceof vyc) {
                i2 = 7;
            } else if (obj instanceof wyc) {
                i2 = 8;
            } else if (obj instanceof xyc) {
                i2 = 9;
            } else if (obj instanceof kyc) {
                i2 = 10;
            } else {
                boolean z = obj instanceof sn5;
                i2 = z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(n7q n7qVar, String str, i3q i3qVar, Function0 function0, int i) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        n7qVar.getClass();
        str.getClass();
        return ((Boolean) wdg.A(n7qVar, new nsh(str, i3qVar, function0))).booleanValue();
    }

    public static final int F(Context context) {
        long j;
        ActivityManager b2;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            b2 = l1b.b(context);
        } catch (Exception e2) {
            Assertions.throwOrSkip("SysUtils", new FailedAssertionException("Cannot get total physical size from ActivityManager.getMemoryInfo", e2));
        }
        if (b2 != null) {
            b2.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem / 1024;
            if (j <= 1024) {
                ssg.a(5, "SysUtils", "Invalid ActivityManager.getMemoryInfo total size in kB: " + j, null);
            }
            if (j > 0 && (Build.VERSION.SDK_INT < 26 ? j / 1024 <= 512 : j / 1024 <= 1024)) {
                return 256;
            }
            return RemoteCameraConfig.Mic.BUFFER_SIZE;
        }
        Assertions.throwOrSkip("SysUtils", new FailedAssertionException("Can't get ActivityManager"));
        j = 0;
        if (j > 0) {
            return 256;
        }
        return RemoteCameraConfig.Mic.BUFFER_SIZE;
    }

    public static String G(JSONArray jSONArray) {
        return men.u(jSONArray, 1).toString();
    }

    public static String H(JSONObject jSONObject) {
        return men.v(jSONObject, 1).toString();
    }

    public static void I(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(ouj.o(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.g(classCastException, wct.class.getName());
        throw classCastException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final qe4 J(ChartResultDto chartResultDto) {
        ?? r2;
        chartResultDto.getClass();
        if (chartResultDto.getChart() == null) {
            return null;
        }
        cvl I = uwf.I(chartResultDto.getChart());
        List<ChartTrackDto> chartTracks = chartResultDto.getChart().getChartTracks();
        if (chartTracks != null) {
            r2 = new ArrayList();
            for (ChartTrackDto chartTrackDto : chartTracks) {
                rf4 L = chartTrackDto != null ? L(chartTrackDto) : null;
                if (L != null) {
                    r2.add(L);
                }
            }
        } else {
            r2 = c5b.a;
        }
        return new qe4(I, r2);
    }

    public static final lf4 K(ChartPositionInfoDto chartPositionInfoDto) {
        Integer position = chartPositionInfoDto.getPosition();
        kf4 kf4Var = null;
        if (position == null) {
            return null;
        }
        int intValue = position.intValue();
        Integer position2 = chartPositionInfoDto.getPosition();
        if (position2 != null && position2.intValue() == 1) {
            kf4Var = kf4.a;
        } else {
            String progress = chartPositionInfoDto.getProgress();
            if (progress != null) {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = progress.toUpperCase(locale);
                upperCase.getClass();
                kf4Var = kf4.valueOf(upperCase);
            }
        }
        return new lf4(intValue, kf4Var, chartPositionInfoDto.getShift());
    }

    public static final rf4 L(ChartTrackDto chartTrackDto) {
        mqs a2;
        lf4 K;
        Long id = chartTrackDto.getId();
        TrackDto track = chartTrackDto.getTrack();
        if (track != null && (a2 = wts.a(track)) != null) {
            qc7 timestamp = chartTrackDto.getTimestamp();
            Date date = timestamp != null ? timestamp.b : null;
            ChartPositionInfoDto chart = chartTrackDto.getChart();
            if (chart != null && (K = K(chart)) != null) {
                return new rf4(id, a2, date, K, chartTrackDto.getRecent());
            }
        }
        return null;
    }

    public static final String M(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final void N() {
        throw new UnsupportedOperationException();
    }

    public static final void O(oyc oycVar, ArrayList arrayList) {
        oycVar.getClass();
        qwp g2 = oycVar.g(arrayList, kb5.Z);
        if (g2 instanceof iyc) {
            return;
        }
        if (g2 instanceof gyc) {
            StringBuilder sb = new StringBuilder();
            azc azcVar = (azc) CollectionsKt.Z(oycVar.b());
            sb.append(azcVar != null ? azcVar.b : false ? "At least" : "Exactly");
            sb.append(' ');
            throw new khb(f1d.i(sb, ((gyc) g2).g, " argument(s) expected."), (Throwable) null);
        }
        if (!(g2 instanceof hyc)) {
            b6e.s();
            return;
        }
        if (oycVar.i(arrayList).equals(iyc.g)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Invalid argument type: expected ");
        hyc hycVar = (hyc) g2;
        sb2.append(hycVar.g);
        mhb mhbVar = hycVar.h;
        sb2.append(", got ");
        sb2.append(mhbVar);
        sb2.append('.');
        throw new khb(sb2.toString(), (Throwable) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q91 q91Var, Function0 function0, yci yciVar, boolean z, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        xmn r;
        q91Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-515204525);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(q91Var) : oq5Var.h(q91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if (oq5Var.P(i3 & 1, (i3 & 9363) == 9362)) {
                oq5Var.S();
            } else {
                if (i4 != 0) {
                    z2 = false;
                }
                j66.p(q91Var.b, ugo.a, a.a(yciVar, "similar_artist_item"), function0, qo6.d, function02, null, ild.C(1097092193, new o91(z2, q91Var, 0), oq5Var), oq5Var, ((i3 << 6) & 7168) | 12607488 | ((i3 << 3) & 458752), 64);
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new p91(q91Var, function0, yciVar, z2, function02, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(y12 y12Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        final y12 y12Var2;
        oq5 oq5Var;
        yci yciVar2;
        gz2 gz2Var;
        int i2;
        boolean z2;
        int i3;
        int i4;
        Object obj;
        boolean h2;
        Object K;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-156782442);
        int i5 = i | (oq5Var2.f(y12Var) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | 384;
        if (oq5Var2.P(i5 & 1, (i5 & 147) != 146)) {
            Object K2 = oq5Var2.K();
            Object obj2 = gq5.a;
            if (K2 == obj2) {
                K2 = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K2);
            }
            final mm6 mm6Var = (mm6) K2;
            gz2 gz2Var2 = b2c.o;
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            Object K3 = oq5Var2.K();
            if (z3 || K3 == obj2) {
                gz2Var = gz2Var2;
                i2 = i6;
                Object le0Var = new le0(2, y12Var, y12.class, "onVisibilityChanged", "onVisibilityChanged(ZLjava/lang/String;)V", 0, 4);
                oq5Var2.k0(le0Var);
                K3 = le0Var;
            } else {
                i2 = i6;
                gz2Var = gz2Var2;
            }
            vci vciVar = vci.a;
            yci a2 = a.a(com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, (Function2) ((h9f) K3), 15), "collection_downloaded_auto_cache_onboarding_block");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var2, 48);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function0);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a3, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            irf.r(a0g.E(R.drawable.onboarding_auto_download, 0, oq5Var2), null, d.m(a.a(vciVar, "auto_cache_onboarding_banner"), 140), null, null, 0.0f, null, oq5Var2, 432, 120);
            float f2 = 24;
            String o = vz1.o(vciVar, f2, oq5Var2, R.string.auto_downloaded_onbording_title, oq5Var2);
            ges c2 = nu0.c();
            ozm ozmVar = eq0.a;
            long b2 = d85.b(((dq0) oq5Var2.j(ozmVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14);
            Object K4 = oq5Var2.K();
            int i8 = 8;
            if (K4 == obj2) {
                K4 = new uv1(i8);
                oq5Var2.k0(K4);
            }
            xcs.b(o, a.a(nfp.b(vciVar, false, (Function1) K4), "auto_cache_onboarding_title"), b2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var2, 0, 0, 65016);
            u1g.l(oq5Var2, d.e(vciVar, 12));
            if (z) {
                i3 = 711488595;
                i4 = R.string.auto_downloading_onboarding_description;
                z2 = false;
            } else {
                z2 = false;
                if (z) {
                    throw vz1.i(oq5Var2, 711486937, false);
                }
                i3 = 711491697;
                i4 = R.string.auto_downloaded_onbording_description;
            }
            float f3 = 8;
            final int i9 = 1;
            xcs.b(vz1.n(oq5Var2, i3, i4, oq5Var2, z2), a.a(androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), f3, 0.0f, 2), "auto_cache_onboarding_description"), d85.b(((dq0) oq5Var2.j(ozmVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 48, 0, 65016);
            u1g.l(oq5Var2, d.e(vciVar, f2));
            yci d2 = d.d(vciVar, 1.0f);
            nho a4 = lho.a(qx0.e, b2c.k, oq5Var2, 6);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, d2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function0);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a4, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            String M = rvf.M(R.string.manage_auto_downloaded_from_onboarding, oq5Var2);
            int i11 = i2;
            boolean h3 = oq5Var2.h(mm6Var) | (i11 == 4);
            Object K5 = oq5Var2.K();
            if (h3) {
                obj = obj2;
            } else {
                obj = obj2;
                if (K5 != obj) {
                    y12Var2 = y12Var;
                    Object obj3 = obj;
                    oq5Var = oq5Var2;
                    hdg.t(M, (Function0) K5, a.a(vciVar, "auto_cache_onboarding_manage_button"), null, oq5Var, 384, 8);
                    u1g.l(oq5Var, d.r(vciVar, f3));
                    String M2 = rvf.M(R.string.close_auto_downloaded_onboarding, oq5Var);
                    h2 = oq5Var.h(mm6Var) | (i11 != 4);
                    K = oq5Var.K();
                    if (!h2 || K == obj3) {
                        K = new Function0() { // from class: s12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        x97.y(mm6Var, null, null, new t12(y12Var2, null, 0), 3);
                                        break;
                                    default:
                                        x97.y(mm6Var, null, null, new t12(y12Var2, null, 1), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K);
                    }
                    hdg.o(M2, (Function0) K, a.a(vciVar, "auto_cache_onboarding_close_button"), 0.0f, oq5Var, 384, 8);
                    oq5Var.p(true);
                    oq5Var.p(true);
                    yciVar2 = vciVar;
                }
            }
            final int i12 = 0;
            y12Var2 = y12Var;
            K5 = new Function0() { // from class: s12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            x97.y(mm6Var, null, null, new t12(y12Var2, null, 0), 3);
                            break;
                        default:
                            x97.y(mm6Var, null, null, new t12(y12Var2, null, 1), 3);
                            break;
                    }
                    return Unit.a;
                }
            };
            oq5Var2.k0(K5);
            Object obj32 = obj;
            oq5Var = oq5Var2;
            hdg.t(M, (Function0) K5, a.a(vciVar, "auto_cache_onboarding_manage_button"), null, oq5Var, 384, 8);
            u1g.l(oq5Var, d.r(vciVar, f3));
            String M22 = rvf.M(R.string.close_auto_downloaded_onboarding, oq5Var);
            h2 = oq5Var.h(mm6Var) | (i11 != 4);
            K = oq5Var.K();
            if (!h2) {
            }
            K = new Function0() { // from class: s12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i9) {
                        case 0:
                            x97.y(mm6Var, null, null, new t12(y12Var2, null, 0), 3);
                            break;
                        default:
                            x97.y(mm6Var, null, null, new t12(y12Var2, null, 1), 3);
                            break;
                    }
                    return Unit.a;
                }
            };
            oq5Var.k0(K);
            hdg.o(M22, (Function0) K, a.a(vciVar, "auto_cache_onboarding_close_button"), 0.0f, oq5Var, 384, 8);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            y12Var2 = y12Var;
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(y12Var2, z, yciVar2, i, 2);
        }
    }

    public static final void c(h93 h93Var, u0s u0sVar, jab jabVar, thj thjVar, va3 va3Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2;
        wdj G;
        h93Var.getClass();
        va3Var.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-802294025);
        int i2 = i | (oq5Var3.f(h93Var) ? 4 : 2) | (oq5Var3.h(u0sVar) ? 32 : 16) | (oq5Var3.h(jabVar) ? 256 : 128) | (oq5Var3.h(thjVar) ? 2048 : 1024) | (oq5Var3.f(va3Var) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var3.P(i2 & 1, (i2 & 9363) != 9362)) {
            saj sajVar = h93Var.e;
            if (sajVar == null) {
                oq5Var3.Z(351957883);
                oq5Var3.p(false);
                G = null;
                oq5Var2 = oq5Var3;
            } else {
                oq5Var3.Z(351957884);
                mqs mqsVar = sajVar.b;
                oq5Var2 = oq5Var3;
                int i3 = i2 << 6;
                G = t7g.G(va3Var, mqsVar, 0, u0sVar, jabVar, szf.M(mqsVar, 0, 0), oq5Var2, (i3 & 57344) | ((i2 >> 12) & 14) | 1573248 | (i3 & 7168), 0);
                oq5Var2.p(false);
            }
            wdj wdjVar = G;
            int i4 = i2 & 57344;
            boolean h2 = (i4 == 16384) | oq5Var2.h(jabVar) | oq5Var2.h(u0sVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new f93(va3Var, jabVar, u0sVar, 0);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h3 = (i4 == 16384) | oq5Var2.h(u0sVar) | oq5Var2.h(jabVar);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                K2 = new f93(va3Var, u0sVar, jabVar);
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = new uu1(26);
                oq5Var2.k0(K3);
            }
            Function0 function03 = (Function0) K3;
            boolean h4 = oq5Var2.h(jabVar) | (i4 == 16384) | oq5Var2.h(thjVar) | oq5Var2.h(u0sVar);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == kjnVar) {
                g93 g93Var = new g93(va3Var, jabVar, thjVar, u0sVar, 0);
                oq5Var2.k0(g93Var);
                K4 = g93Var;
            }
            oq5 oq5Var4 = oq5Var2;
            vut.f(h93Var, wdjVar, function0, function02, function03, androidx.compose.foundation.layout.a.q(com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K4, 15), 0.0f, 8, 0.0f, 0.0f, 13), oq5Var4, (i2 & 14) | 24576);
            oq5Var = oq5Var4;
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(i, 6, h93Var, u0sVar, jabVar, thjVar, va3Var);
        }
    }

    public static final void d(long j, k75 k75Var, hq5 hq5Var, int i) {
        k75Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(224249436);
        int i2 = 4;
        int i3 = (oq5Var.e(j) ? 4 : 2) | i | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            vci vciVar = vci.a;
            yci a2 = a.a(d.d(vciVar, 1.0f), "collection_wave_onboarding");
            ta5 a3 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            u1g.l(oq5Var, d.e(vciVar, 10));
            pd.b(new qzm[0], true, ild.C(-785731057, new bu0(j, i2), oq5Var), oq5Var, 432, 0);
            String M = rvf.M(R.string.collection_wave_onboarding_dialog_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            float f2 = 12;
            xv7.j(M, a.a(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.k(vciVar, true, null), f2, f2), "collection_wave_onboarding_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, c2, oq5Var, 0, 0, 65272);
            xv7.j(rvf.M(R.string.collection_wave_onboarding_dialog_description, oq5Var), a.a(androidx.compose.foundation.layout.a.q(vciVar, f2, 0.0f, f2, f2, 2), "collection_wave_onboarding_description"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65272);
            String M2 = rvf.M(R.string.collection_wave_onboarding_dialog_button, oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new r25(3, k75Var);
                oq5Var.k0(K);
            }
            hdg.o(M2, (Function0) K, a.a(androidx.compose.foundation.layout.a.m(vciVar, f2), "collection_wave_onboarding_button"), 0.0f, oq5Var, 384, 8);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, 18));
            oq5Var.Z(-1083151844);
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cu0(j, k75Var, i);
        }
    }

    public static final void e(xep xepVar, wn5 wn5Var, hq5 hq5Var, int i) {
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(605522716);
        int i2 = (oq5Var.h(xepVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new nf6();
                oq5Var.k0(K);
            }
            nf6 nf6Var = (nf6) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new qf6(nf6Var, 1);
                oq5Var.k0(K2);
            }
            wn5Var2 = wn5Var;
            wdp.O(nf6Var, (Function0) K2, new gcp(3, nf6Var, xepVar), null, false, null, wn5Var2, oq5Var, 1572918, 56);
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rf6(xepVar, wn5Var2, i);
        }
    }

    public static final void f(qbs qbsVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1985516685);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(qbsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        int i3 = 0;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new nf6();
                oq5Var.k0(K);
            }
            nf6 nf6Var = (nf6) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = gld.R(g.a, oq5Var);
                oq5Var.k0(K2);
            }
            mm6 mm6Var = (mm6) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.g0(new xxh(i3));
                oq5Var.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new qf6(nf6Var, 0);
                oq5Var.k0(K4);
            }
            Function0 function0 = (Function0) K4;
            lma lmaVar = new lma(26, aqiVar, nf6Var, qbsVar);
            boolean i4 = qbsVar.i();
            boolean h2 = oq5Var.h(mm6Var) | oq5Var.h(qbsVar);
            Object K5 = oq5Var.K();
            if (h2 || K5 == kjnVar) {
                K5 = new t03(5, mm6Var, aqiVar, qbsVar);
                oq5Var.k0(K5);
            }
            wn5Var2 = wn5Var;
            wdp.O(nf6Var, function0, lmaVar, null, i4, (Function0) K5, wn5Var2, oq5Var, ((i2 << 15) & 3670016) | 54, 8);
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(qbsVar, wn5Var2, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x024b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10.K(), java.lang.Integer.valueOf(r9)) == false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(int i, w1u w1uVar, hvq hvqVar, Function0 function0, hq5 hq5Var, int i2) {
        float f2;
        float f3;
        boolean z;
        float f4;
        boolean z2;
        float f5;
        d8t d8tVar;
        boolean z3;
        wdc Q;
        pwq pwqVar;
        ak2 ak2Var;
        qbu qbuVar;
        vci vciVar;
        z7t z7tVar;
        boolean z4;
        String a2;
        yci yciVar;
        yci c2;
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(867178963);
        int i3 = i2 | (oq5Var.d(i) ? 4 : 2) | (oq5Var.f(w1uVar) ? 32 : 16) | (oq5Var.h(hvqVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ruq w = hvqVar.w();
            pwq k = hvqVar.k();
            aqi Q2 = szf.Q(k.K(), oq5Var);
            int i4 = i3 & 14;
            boolean f6 = oq5Var.f(Q2) | (i4 == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f6 || K == kjnVar) {
                K = new as7(Q2, i, 0);
                oq5Var.k0(K);
            }
            aqi P = szf.P(szf.s0((Function0) K), Boolean.FALSE, null, oq5Var, 48, 2);
            oq5Var = oq5Var;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            ewq b2 = hvqVar.b();
            qbu qbuVar2 = w1uVar.b;
            ak2 ak2Var2 = w1uVar.c;
            d8t e2 = i8t.e(qbuVar2, "Video state transition", oq5Var, 48, 0);
            x6k x6kVar = e2.d;
            oct octVar = azt.a;
            qbu qbuVar3 = (qbu) e2.c();
            oq5Var.Z(1209159794);
            int ordinal = qbuVar3.ordinal();
            if (ordinal == 0) {
                f2 = 1.0f;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    b6e.s();
                    return;
                }
                f2 = 0.0f;
            }
            oq5Var.p(false);
            Float valueOf = Float.valueOf(f2);
            qbu qbuVar4 = (qbu) x6kVar.getValue();
            oq5Var.Z(1209159794);
            int ordinal2 = qbuVar4.ordinal();
            if (ordinal2 == 0) {
                f3 = 1.0f;
            } else {
                if (ordinal2 != 1 && ordinal2 != 2) {
                    b6e.s();
                    return;
                }
                f3 = 0.0f;
            }
            oq5Var.p(false);
            Float valueOf2 = Float.valueOf(f3);
            e2.f();
            oq5Var.Z(-522164544);
            b9r Q3 = weo.Q(0.0f, 0.0f, null, 7);
            oq5Var.p(false);
            z7t c3 = i8t.c(e2, valueOf, valueOf2, Q3, octVar, oq5Var, 196608);
            qbu qbuVar5 = (qbu) e2.c();
            oq5Var.Z(-476059758);
            int ordinal3 = qbuVar5.ordinal();
            if (ordinal3 == 0) {
                z = false;
                f4 = 0.0f;
            } else if (ordinal3 != 1 && ordinal3 != 2) {
                b6e.s();
                return;
            } else {
                z = false;
                f4 = 1.0f;
            }
            oq5Var.p(z);
            Float valueOf3 = Float.valueOf(f4);
            qbu qbuVar6 = (qbu) x6kVar.getValue();
            oq5Var.Z(-476059758);
            int ordinal4 = qbuVar6.ordinal();
            if (ordinal4 == 0) {
                z2 = false;
                f5 = 0.0f;
            } else if (ordinal4 != 1 && ordinal4 != 2) {
                b6e.s();
                return;
            } else {
                z2 = false;
                f5 = 1.0f;
            }
            oq5Var.p(z2);
            Float valueOf4 = Float.valueOf(f5);
            x7t f7 = e2.f();
            f7.getClass();
            oq5Var.Z(648172512);
            if (f7.c(qbu.a, qbu.b)) {
                d8tVar = e2;
                z3 = false;
                Q = weo.S(1500, 0, null, 6);
            } else {
                d8tVar = e2;
                z3 = false;
                Q = weo.Q(0.0f, 0.0f, null, 7);
            }
            oq5Var.p(z3);
            z7t c4 = i8t.c(d8tVar, valueOf3, valueOf4, Q, octVar, oq5Var, 196608);
            long j = ((dq0) oq5Var.j(eq0.a)).c.a;
            vci vciVar2 = vci.a;
            yci b3 = androidx.compose.foundation.a.b(d.c(vciVar2, 1.0f), j, vnj.i);
            b3.getClass();
            if (function0 != null && (c2 = androidx.compose.ui.draw.a.c(b3, new ex(17, function0))) != null) {
                b3 = c2;
            }
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b3);
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
            if (oq5Var.O) {
                pwqVar = k;
            } else {
                pwqVar = k;
            }
            ouj.x(i5, oq5Var, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            ak2Var2.getClass();
            yj2 yj2Var = ak2Var2 instanceof yj2 ? (yj2) ak2Var2 : null;
            if (yj2Var != null) {
                ak2Var = ak2Var2;
                qbuVar = qbuVar2;
                if (qbuVar != qbu.c) {
                    oq5Var.Z(515466233);
                    boolean f8 = oq5Var.f(c3);
                    Object K3 = oq5Var.K();
                    if (f8 || K3 == kjnVar) {
                        K3 = new la1(c3, 25);
                        oq5Var.k0(K3);
                    }
                    yci c5 = d.c(wyf.s(vciVar2, (Function0) K3), 1.0f);
                    kfh d3 = ug3.d(iz2Var, false);
                    int i6 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, c5);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    aqi Q4 = szf.Q(b2.b(), oq5Var);
                    ccg L = pwqVar.L();
                    Object K4 = oq5Var.K();
                    if (K4 == kjnVar) {
                        K4 = new cp5(29);
                        oq5Var.k0(K4);
                    }
                    Function0 function02 = (Function0) K4;
                    boolean h2 = oq5Var.h(w) | (i4 == 4) | oq5Var.h(mm6Var);
                    Object K5 = oq5Var.K();
                    if (h2 || K5 == kjnVar) {
                        K5 = new de(w, i, mm6Var, 9);
                        oq5Var.k0(K5);
                    }
                    Function0 function03 = (Function0) K5;
                    pwq pwqVar2 = pwqVar;
                    boolean h3 = (i4 == 4) | oq5Var.h(pwqVar2);
                    Object K6 = oq5Var.K();
                    if (h3 || K6 == kjnVar) {
                        K6 = new as7(pwqVar2, i, 1);
                        oq5Var.k0(K6);
                    }
                    Function0 function04 = (Function0) K6;
                    z7tVar = c4;
                    vciVar = vciVar2;
                    z4 = false;
                    y1g.n(yj2Var, P, Q4, function02, function03, function04, L, null, oq5Var, 3072);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                    oq5Var.p(z4);
                    a2 = ak2Var.a();
                    if (a2 == null) {
                        oq5Var.Z(516605514);
                        gtq gtqVar = gtq.d;
                        oq5Var.Z(-2061539333);
                        if (qbuVar != qbu.c) {
                            boolean f9 = oq5Var.f(z7tVar);
                            Object K7 = oq5Var.K();
                            if (f9 || K7 == kjnVar) {
                                K7 = new la1(z7tVar, 26);
                                oq5Var.k0(K7);
                            }
                            yciVar = wyf.s(vciVar, (Function0) K7);
                        } else {
                            yciVar = vciVar;
                        }
                        oq5Var.p(z4);
                        yci c6 = d.c(yciVar, 1.0f);
                        oq5 oq5Var2 = oq5Var;
                        ocg.e(a2, gtqVar, c6, null, oq5Var2, 48, 8);
                        oq5Var = oq5Var2;
                    } else {
                        oq5Var.Z(511827081);
                    }
                    oq5Var.p(z4);
                    oq5Var.p(true);
                }
            } else {
                ak2Var = ak2Var2;
                qbuVar = qbuVar2;
            }
            vciVar = vciVar2;
            z7tVar = c4;
            z4 = false;
            oq5Var.Z(511827081);
            oq5Var.p(z4);
            a2 = ak2Var.a();
            if (a2 == null) {
            }
            oq5Var.p(z4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bs7(i, w1uVar, hvqVar, function0, i2);
        }
    }

    public static final void h(tea teaVar, hq5 hq5Var, int i) {
        teaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1577542051);
        int i2 = (oq5Var.h(teaVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            wea weaVar = (wea) szf.Q(teaVar.h, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(teaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                dda ddaVar = new dda(0, teaVar, tea.class, "onBackClicked", "onBackClicked()V", 0, 6);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(teaVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, teaVar, tea.class, "onSearchClicked", "onSearchClicked()V", 0, 7);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            kg5.g(R.string.downloaded_audiobooks, a2, function0, (Function0) ((h9f) K2), null, ild.C(1475089424, new xk(25, weaVar, teaVar, a2), oq5Var), oq5Var, 196608, 16);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(teaVar, i, 27);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, String str) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(488325608);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16);
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
            xcs.b(str, a.a(androidx.compose.foundation.layout.a.q(vci.a, f2, 64, f2, 0.0f, 8), "empty_collection_kids_screen"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i2 & 14, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 7);
        }
    }

    public static final void j(h53 h53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        boolean z;
        boolean z2;
        kjn kjnVar;
        eqpVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-434802623);
        int i2 = 2;
        int i3 = i | (oq5Var2.f(h53Var) ? 4 : 2) | (oq5Var2.f(eqpVar) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            yci a2 = a.a(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), "help_and_feedback_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
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
            g0g.U(oq5Var2, a3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            a0g.v(0, oq5Var2, null, rvf.M(R.string.settings_section_help_and_feedback, oq5Var2));
            fk0 N = u1g.N(eqpVar, lsp.j, oq5Var2, ((i3 >> 3) & 14) | 48);
            String M = rvf.M(R.string.pushes_title, oq5Var2);
            String M2 = rvf.M(R.string.pushes_descriptions, oq5Var2);
            boolean z3 = h53Var.a;
            int i5 = i3 & 112;
            boolean z4 = i5 == 32;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z4 || K == kjnVar2) {
                z = z3;
                z2 = false;
                kjnVar = kjnVar2;
                aub aubVar = new aub(1, eqpVar, eqp.class, "onNotificationsClick", "onNotificationsClick(Z)V", 0, 10);
                oq5Var2.k0(aubVar);
                K = aubVar;
            } else {
                z = z3;
                z2 = false;
                kjnVar = kjnVar2;
            }
            Function1 function1 = (Function1) ((h9f) K);
            boolean h2 = oq5Var2.h(N);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new kw4(N, i2);
                oq5Var2.k0(K2);
            }
            vci vciVar = vci.a;
            a0g.s(M, M2, z, function1, b.c(a.a(wyf.t(vciVar, (Function0) K2), "new_releases_switcher"), "new_releases_state", Boolean.valueOf(h53Var.a)), oq5Var2, 0);
            String M3 = rvf.M(R.string.about_app_text, oq5Var2);
            String N2 = rvf.N(R.string.about_app_description, new Object[]{h53Var.b}, oq5Var2);
            boolean z5 = i5 != 32 ? z2 : true;
            Object K3 = oq5Var2.K();
            if (z5 || K3 == kjnVar) {
                K3 = new v2d(0, eqpVar, eqp.class, "aboutAppClick", "aboutAppClick()V", 0, 5);
                oq5Var2.k0(K3);
            }
            a0g.b(M3, N2, (Function0) ((h9f) K3), a.a(vciVar, "settings_about_button"), null, oq5Var2, 3072, 16);
            String M4 = rvf.M(R.string.open_help, oq5Var2);
            boolean z6 = i5 != 32 ? z2 : true;
            Object K4 = oq5Var2.K();
            if (z6 || K4 == kjnVar) {
                v2d v2dVar = new v2d(0, eqpVar, eqp.class, "onOpenHelpClick", "onOpenHelpClick()V", 0, 6);
                oq5Var2.k0(v2dVar);
                K4 = v2dVar;
            }
            oq5Var = oq5Var2;
            a0g.b(M4, null, (Function0) ((h9f) K4), a.a(vciVar, "settings_help_button"), Integer.valueOf(R.drawable.ic_link_default_24), oq5Var, 3120, 0);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i, 16, yciVar, h53Var, eqpVar);
        }
    }

    public static final void k(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-416513488);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pm0.a(lm0.i, ild.C(122335865, new cxd(yciVar, 0), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 1);
        }
    }

    public static final void l(List list, wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, int i) {
        int i2;
        int i3;
        wn5 wn5Var3;
        wn5 wn5Var4;
        List list2;
        oq5 oq5Var;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-199219575);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(list) : oq5Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(wn5Var2) ? 256 : 128;
        }
        int i4 = i & 3072;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i2 |= oq5Var2.f(vciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            wn5Var3 = wn5Var2;
            wn5Var4 = wn5Var;
            list2 = list;
            oq5Var = oq5Var2;
        } else {
            boolean z = true;
            int i5 = list.size() == 1 ? 1 : Integer.MAX_VALUE;
            if (i5 != 1) {
                int i6 = i5 / 2;
                i3 = i6 - (i6 % list.size());
            } else {
                i3 = 0;
            }
            boolean d2 = oq5Var2.d(i5);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (d2 || K == kjnVar) {
                K = new uw1(i5, 1);
                oq5Var2.k0(K);
            }
            fp7 b2 = r3k.b(i3, (Function0) K, oq5Var2, 0, 2);
            boolean f2 = oq5Var2.f(b2);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !oq5Var2.f(list))) {
                z = false;
            }
            boolean z2 = f2 | z;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new ml4(b2, list.size());
                oq5Var2.k0(K2);
            }
            ml4 ml4Var = (ml4) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = new mvd(28);
                oq5Var2.k0(K3);
            }
            wn5Var3 = wn5Var2;
            wn5Var4 = wn5Var;
            list2 = list;
            oq5Var = oq5Var2;
            bg3.a(nfp.b(vciVar, false, (Function1) K3), null, false, ild.C(1016435315, new lc(ml4Var, wn5Var2, b2, wn5Var, list, 6), oq5Var2), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(list2, wn5Var4, wn5Var3, i);
        }
    }

    public static Collection m(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof j9f) || (abstractCollection instanceof k9f)) {
            return abstractCollection;
        }
        I(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map n(Object obj) {
        if ((obj instanceof j9f) && !(obj instanceof n9f)) {
            I(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            Intrinsics.g(e2, wct.class.getName());
            throw e2;
        }
    }

    public static void o(int i, Object obj) {
        if (obj == null || D(i, obj)) {
            return;
        }
        I(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final on0 p(c cVar) {
        cVar.getClass();
        return new on0(cVar.d(), cVar.c());
    }

    public static final List q(ttf ttfVar, buf bufVar, oxa oxaVar) {
        IntRange intRange;
        eqi eqiVar = (eqi) oxaVar.b;
        if (!(eqiVar.c != 0) && bufVar.a.isEmpty()) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        if (((eqi) oxaVar.b).c != 0) {
            int i = eqiVar.c;
            if (i == 0) {
                wvs.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr = eqiVar.a;
            int i2 = ((dtf) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((dtf) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                vme.a("negative minIndex");
            }
            int i5 = eqiVar.c;
            if (i5 == 0) {
                wvs.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = eqiVar.a;
            int i6 = ((dtf) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((dtf) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            intRange = new IntRange(i2, Math.min(i6, ttfVar.a() - 1), 1);
        } else {
            IntRange.e.getClass();
            intRange = IntRange.f;
        }
        int size = bufVar.a.size();
        for (int i9 = 0; i9 < size; i9++) {
            auf aufVar = (auf) bufVar.get(i9);
            int F = i4w.F(aufVar.c, ttfVar, aufVar.a);
            int i10 = intRange.a;
            if ((F > intRange.b || i10 > F) && F >= 0 && F < ttfVar.a()) {
                arrayList.add(Integer.valueOf(F));
            }
        }
        int i11 = intRange.a;
        int i12 = intRange.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final byte r(char c2) {
        if (c2 < '~') {
            return wd4.b[c2];
        }
        return (byte) 0;
    }

    public static final int s() {
        return frv.b() / 4;
    }

    public static final int t() {
        return frv.b() / 2;
    }

    public static final void u(Throwable th) {
        HashMap hashMap;
        v6c v6cVar;
        if (!h || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            stackTraceElement.getClass();
            String className = stackTraceElement.getClassName();
            className.getClass();
            synchronized (x6c.b) {
                hashMap = x6c.a;
                if (hashMap.isEmpty()) {
                    hashMap.put(v6c.AAM, new String[]{"com.facebook.appevents.aam."});
                    hashMap.put(v6c.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    hashMap.put(v6c.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    hashMap.put(v6c.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    hashMap.put(v6c.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    hashMap.put(v6c.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    hashMap.put(v6c.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    hashMap.put(v6c.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    hashMap.put(v6c.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    hashMap.put(v6c.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    hashMap.put(v6c.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    hashMap.put(v6c.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    v6cVar = v6c.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                v6cVar = (v6c) entry.getKey();
                for (String str : (String[]) entry.getValue()) {
                    if (kotlin.text.c.v(className, str, false)) {
                        break;
                    }
                }
            }
            if (v6cVar != v6c.Unknown) {
                v6cVar.getClass();
                j3c.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + v6cVar, "12.2.0").apply();
                hashSet.add(v6cVar.toString());
            }
        }
        HashSet hashSet2 = j3c.a;
        if (!gtt.c() || hashSet.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) hashSet);
        dpe dpeVar = new dpe();
        dpeVar.b = cpe.b;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        dpeVar.g = valueOf;
        dpeVar.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        dpeVar.a = stringBuffer2;
        dpeVar.b();
    }

    public static final LinkedHashSet v(rv8 rv8Var) {
        rv8Var.getClass();
        gw8 gw8Var = new gw8();
        Iterator it = rv8Var.c.iterator();
        while (it.hasNext()) {
            gw8Var.U(((qv8) it.next()).a, xzb.a);
        }
        List<au9> list = rv8Var.d;
        if (list != null) {
            for (au9 au9Var : list) {
                List list2 = au9Var.d;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        szb szbVar = ((bd8) it2.next()).k;
                        if (szbVar != null) {
                            gw8Var.W(szbVar);
                        }
                    }
                }
                List list3 = au9Var.b;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        szb szbVar2 = ((bd8) it3.next()).k;
                        if (szbVar2 != null) {
                            gw8Var.W(szbVar2);
                        }
                    }
                }
            }
        }
        List list4 = rv8Var.f;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((ix9) it4.next()).a.iterator();
                while (it5.hasNext()) {
                    szb szbVar3 = ((bd8) it5.next()).k;
                    if (szbVar3 != null) {
                        gw8Var.W(szbVar3);
                    }
                }
            }
        }
        return gw8Var.n;
    }

    public static final ArrayList w(rv8 rv8Var) {
        ofc ofcVar = new ofc(21);
        ArrayList arrayList = new ArrayList();
        Iterator it = rv8Var.c.iterator();
        if (it.hasNext()) {
            qv8 qv8Var = (qv8) it.next();
            long j = qv8Var.b;
            Iterator it2 = ofcVar.J(qv8Var.a).iterator();
            while (it2.hasNext()) {
                arrayList.add(j + "/" + ((String) it2.next()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(qbs qbsVar, cg6 cg6Var) {
        sf6 sf6Var;
        int i;
        int i2;
        int i3;
        int i4;
        qbs qbsVar2;
        int i5;
        ?? r1;
        ?? r12;
        dp4 dp4Var;
        if (cg6Var instanceof sf6) {
            sf6Var = (sf6) cg6Var;
            int i6 = sf6Var.n;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                sf6Var.n = i6 - Integer.MIN_VALUE;
                Object obj = sf6Var.m;
                nm6 nm6Var = nm6.a;
                i = sf6Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    tiu tiuVar = qbsVar.f;
                    i2 = !rds.b(qbsVar.k().b) ? 1 : 0;
                    if (!qbsVar.h()) {
                        i3 = i2;
                        r12 = false;
                        if (i2 == 0) {
                        }
                        if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                        }
                        if (qbsVar.h()) {
                        }
                        return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
                    }
                    kp4 kp4Var = qbsVar.h;
                    if (kp4Var == null) {
                        i3 = i2;
                        r1 = false;
                        if (r1 != false) {
                            r12 = true;
                            return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
                        }
                        r12 = false;
                        if (i2 == 0) {
                        }
                        if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                        }
                        if (qbsVar.h()) {
                        }
                        return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
                    }
                    sf6Var.j = qbsVar;
                    sf6Var.k = i2;
                    sf6Var.l = i2;
                    sf6Var.n = 1;
                    ClipData primaryClip = ((ce0) kp4Var).a.a.getPrimaryClip();
                    dp4 dp4Var2 = primaryClip != null ? new dp4(primaryClip) : null;
                    if (dp4Var2 == nm6Var) {
                        return nm6Var;
                    }
                    i4 = i2;
                    obj = dp4Var2;
                    qbsVar2 = qbsVar;
                    i5 = i4;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = sf6Var.l;
                    i4 = sf6Var.k;
                    qbsVar2 = sf6Var.j;
                    qgg.h0(obj);
                }
                dp4Var = (dp4) obj;
                if (dp4Var == null && dp4Var.a.getDescription().hasMimeType("text/*")) {
                    qbs qbsVar3 = qbsVar2;
                    i3 = i5;
                    qbsVar = qbsVar3;
                    i2 = i4;
                    r1 = true;
                    if (r1 != false) {
                    }
                    r12 = false;
                    if (i2 == 0) {
                    }
                    if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                    }
                    if (qbsVar.h()) {
                    }
                    return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
                }
                qbs qbsVar4 = qbsVar2;
                i3 = i5;
                qbsVar = qbsVar4;
                i2 = i4;
                r1 = false;
                if (r1 != false) {
                }
                r12 = false;
                if (i2 == 0) {
                }
                if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
                }
                if (qbsVar.h()) {
                }
                return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
            }
        }
        sf6Var = new sf6(cg6Var);
        Object obj2 = sf6Var.m;
        nm6 nm6Var2 = nm6.a;
        i = sf6Var.n;
        if (i != 0) {
        }
        dp4Var = (dp4) obj2;
        if (dp4Var == null) {
        }
        qbs qbsVar42 = qbsVar2;
        i3 = i5;
        qbsVar = qbsVar42;
        i2 = i4;
        r1 = false;
        if (r1 != false) {
        }
        r12 = false;
        if (i2 == 0) {
        }
        if (rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) {
        }
        if (qbsVar.h()) {
        }
        return new xxh((r12 == false ? 2 : 0) | i3 | ((i2 == 0 && qbsVar.h()) == false ? 4 : 0) | ((rds.c(qbsVar.k().b) == qbsVar.k().a.b.length()) == false ? 8 : 0) | (!qbsVar.h() && rds.b(qbsVar.k().b) ? 16 : 0));
    }

    public static khb y(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new khb("Function requires non empty argument list.", (Throwable) null);
        }
        return new khb("Function has no matching overload for given argument types: " + ghh.T(arrayList) + '.', (Throwable) null);
    }

    public static ys3 z(ws3 ws3Var) {
        vs3 vs3Var = new vs3();
        vs3Var.c = new h2o();
        ys3 ys3Var = new ys3(vs3Var);
        vs3Var.b = ys3Var;
        vs3Var.a = ws3Var.getClass();
        try {
            Object d2 = ws3Var.d(vs3Var);
            if (d2 == null) {
                return ys3Var;
            }
            vs3Var.a = d2;
            return ys3Var;
        } catch (Exception e2) {
            ys3Var.b.m(e2);
            return ys3Var;
        }
    }
}
