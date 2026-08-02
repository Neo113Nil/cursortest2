package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.gms.tasks.Task;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.chart.catalog.data.dto.AlbumsChartDto;
import ru.yandex.music.chart.catalog.data.dto.ChartAlbumDto;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public abstract class y2x {
    public static ClassLoader a;
    public static Thread b;
    public static final wn5 c = new wn5(new bo5(26), -1679753871, false);
    public static final wn5 d = new wn5(new bo5(27), 439297104, false);
    public static final wn5 e = new wn5(new no5(0), -1918602057, false);
    public static final wn5 f = new wn5(new rz3(15), -58717419, false);
    public static final gx0 g = new gx0(1);
    public static final ns9 h = new ns9(18);
    public static final StackTraceElement[] i = new StackTraceElement[0];

    public static final void B(ComposeView composeView, final mg2 mg2Var, final vdr vdrVar, final cce cceVar, final q8r q8rVar, final float f2, final Boolean bool, final float f3) {
        composeView.getClass();
        vdrVar.getClass();
        composeView.setContent(new wn5(new Function2() { // from class: hg2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean booleanValue;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                Boolean bool2 = bool;
                if (bool2 == null) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-527651700);
                    booleanValue = ((Boolean) gld.O(vdrVar, oq5Var2).getValue()).booleanValue();
                    oq5Var2.p(false);
                } else {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-527653591);
                    oq5Var3.p(false);
                    booleanValue = bool2.booleanValue();
                }
                boolean z = booleanValue;
                jf0.g(new qzm[0], z, cceVar, q8rVar, ild.C(587098573, new ig2(f2, f3, mg2Var), hq5Var), hq5Var, 24576);
                return Unit.a;
            }
        }, 1304477415, true));
    }

    public static final boolean C(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        return StringsKt.M(uri2, "?attach=true", false) && StringsKt.M(uri2, str, false);
    }

    public static final int D(String str) {
        if (str == null || str.length() == 0 || "transparent".equals(str)) {
            return 0;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e2) {
            ssg.a(6, null, "failed to parse color ".concat(str), e2);
            return 0;
        }
    }

    public static final jc3 E(String... strArr) {
        return new jc3(new mi2(xz0.Y(strArr)));
    }

    public static onx F(Task task, Task task2) {
        rp7 rp7Var = new rp7(10);
        i8s i8sVar = new i8s((sml) rp7Var.a);
        u13 u13Var = new u13(1, i8sVar, new AtomicBoolean(false), rp7Var);
        gx0 gx0Var = g;
        task.f(gx0Var, u13Var);
        task2.f(gx0Var, u13Var);
        return i8sVar.a;
    }

    public static c9c G(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar) {
        return I(hzjVar, jSONObject, str, z, c9cVar, bcx.i, bcx.h);
    }

    public static c9c H(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, arf arfVar) {
        try {
            return new a9c(etn.O(hzjVar, jSONObject, str, arfVar), z);
        } catch (z7k e2) {
            if (e2.a != b8k.b) {
                throw e2;
            }
            c9c V = V(z, U(hzjVar, jSONObject, str), c9cVar);
            if (V != null) {
                return V;
            }
            throw e2;
        }
    }

    public static c9c I(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, Function1 function1, ywt ywtVar) {
        try {
            return new a9c(etn.Q(jSONObject, str, function1, ywtVar), z);
        } catch (z7k e2) {
            if (e2.a != b8k.b) {
                throw e2;
            }
            c9c V = V(z, U(hzjVar, jSONObject, str), c9cVar);
            if (V != null) {
                return V;
            }
            throw e2;
        }
    }

    public static c9c J(hzj hzjVar, JSONObject jSONObject, String str, uct uctVar, boolean z, c9c c9cVar) {
        return K(hzjVar, jSONObject, str, uctVar, z, c9cVar, bcx.i, bcx.h);
    }

    public static c9c K(hzj hzjVar, JSONObject jSONObject, String str, uct uctVar, boolean z, c9c c9cVar, Function1 function1, ywt ywtVar) {
        try {
            return new a9c(e5f.b(hzjVar, jSONObject, str, uctVar, function1, ywtVar), z);
        } catch (z7k e2) {
            if (e2.a != b8k.b) {
                throw e2;
            }
            c9c V = V(z, U(hzjVar, jSONObject, str), c9cVar);
            if (V != null) {
                return V;
            }
            throw e2;
        }
    }

    public static c9c L(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, arf arfVar, mag magVar) {
        try {
            return new a9c(etn.S(hzjVar, jSONObject, str, arfVar, magVar), z);
        } catch (z7k e2) {
            if (e2.a != b8k.b) {
                throw e2;
            }
            c9c V = V(z, U(hzjVar, jSONObject, str), c9cVar);
            if (V != null) {
                return V;
            }
            throw e2;
        }
    }

    public static c9c M(hzj hzjVar, JSONObject jSONObject, uct uctVar, boolean z, c9c c9cVar, mag magVar) {
        vzb f2 = e5f.f(hzjVar, jSONObject, "colors", uctVar, magVar);
        if (f2 != null) {
            return new a9c(f2, z);
        }
        String U = U(hzjVar, jSONObject, "colors");
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c N(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, arf arfVar) {
        Object U = etn.U(hzjVar, jSONObject, str, arfVar);
        if (U != null) {
            return new a9c(U, z);
        }
        String U2 = U(hzjVar, jSONObject, str);
        return U2 != null ? new z8c(z, U2) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c O(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, Function1 function1) {
        Object W = etn.W(hzjVar, jSONObject, str, function1);
        if (W != null) {
            return new a9c(W, z);
        }
        String U = U(hzjVar, jSONObject, str);
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c P(hzj hzjVar, JSONObject jSONObject, String str, uct uctVar, boolean z, c9c c9cVar, Function1 function1, ywt ywtVar) {
        szb e2 = e5f.e(hzjVar, jSONObject, str, uctVar, function1, ywtVar, null);
        if (e2 != null) {
            return new a9c(e2, z);
        }
        String U = U(hzjVar, jSONObject, str);
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c Q(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar) {
        return P(hzjVar, jSONObject, str, vct.c, z, c9cVar, bcx.i, bcx.h);
    }

    public static c9c R(hzj hzjVar, JSONObject jSONObject, String str, boolean z, c9c c9cVar, arf arfVar) {
        List Y = etn.Y(hzjVar, jSONObject, str, arfVar);
        if (Y != null) {
            return new a9c(Y, z);
        }
        String U = U(hzjVar, jSONObject, str);
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c S(hzj hzjVar, JSONObject jSONObject, boolean z, c9c c9cVar, mag magVar) {
        List a0 = etn.a0(hzjVar, jSONObject, "transition_triggers", magVar);
        if (a0 != null) {
            return new a9c(a0, z);
        }
        String U = U(hzjVar, jSONObject, "transition_triggers");
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static c9c T(hzj hzjVar, JSONObject jSONObject, boolean z, c9c c9cVar, jyr jyrVar, mag magVar) {
        List Z = etn.Z(hzjVar, jSONObject, "color_map", jyrVar, magVar);
        if (Z != null) {
            return new a9c(Z, z);
        }
        String U = U(hzjVar, jSONObject, "color_map");
        return U != null ? new z8c(z, U) : c9cVar != null ? ltg.y(c9cVar, z) : z ? y8c.d : y8c.c;
    }

    public static String U(t7k t7kVar, JSONObject jSONObject, String str) {
        return (String) etn.V(t7kVar, jSONObject, f1d.g("$", str), h);
    }

    public static c9c V(boolean z, String str, c9c c9cVar) {
        if (str != null) {
            return new z8c(z, str);
        }
        if (c9cVar != null) {
            return ltg.y(c9cVar, z);
        }
        if (z) {
            return z ? y8c.d : y8c.c;
        }
        return null;
    }

    public static final ScheduledFuture W(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object t7oVar;
        scheduledExecutorService.getClass();
        timeUnit.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Log.e(null, "Exception occurred in scheduleAtFixedRateSafely", a2);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (ScheduledFuture) t7oVar;
    }

    public static final ScheduledFuture X(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j) {
        Object t7oVar;
        scheduledExecutorService.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Log.e(null, "Exception occurred in submitSafely", a2);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (ScheduledFuture) t7oVar;
    }

    public static final Future Z(ExecutorService executorService, Runnable runnable) {
        Object t7oVar;
        executorService.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = executorService.submit(runnable);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Log.e(null, "Exception occurred in submitSafely", a2);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (Future) t7oVar;
    }

    public static final void a(String str, String str2, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        vci vciVar;
        agr agrVar;
        int i3;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-964720436);
        int i4 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hz2 hz2Var = b2c.l;
            yci e2 = a.e(xp3.u(yciVar, o5g.D(oq5Var)), false, null, null, function0, 7);
            agr agrVar2 = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar2)).d.c;
            jzk jzkVar = vnj.i;
            yci o = androidx.compose.foundation.layout.a.o(d.e(a.b(e2, j, jzkVar), 84), 16, 0.0f, 2);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar2 = vci.a;
            int i6 = 0;
            if (str != null) {
                oq5Var.Z(-1175426672);
                yci u = xp3.u(d.m(vciVar2, 52), o5g.E(oq5Var));
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    oq5Var.Z(-1175309213);
                    u1g.l(oq5Var, a.b(u, d85.l, jzkVar));
                    oq5Var.p(false);
                    vciVar = vciVar2;
                    agrVar = agrVar2;
                    i3 = i4;
                    z = false;
                } else {
                    oq5Var.Z(-1175191537);
                    yci a3 = androidx.compose.ui.platform.a.a(vciVar2, "cards_action_button_image");
                    wn5 C = ild.C(1483085071, new wv3(u, i6), oq5Var);
                    int i7 = (i4 & 14) | 432;
                    vciVar = vciVar2;
                    i3 = i4;
                    z = false;
                    agrVar = agrVar2;
                    w1g.j(str, null, a3, null, null, null, null, 0.0f, null, 0, C, oq5Var, i7, 1016);
                    oq5Var.p(false);
                }
            } else {
                vciVar = vciVar2;
                agrVar = agrVar2;
                i3 = i4;
                z = false;
                oq5Var.Z(-1181604910);
            }
            oq5Var.p(z);
            ges j2 = nu0.j();
            long j3 = ((dq0) oq5Var.j(agrVar)).b.a;
            vci vciVar3 = vciVar;
            yci q = androidx.compose.foundation.layout.a.q(androidx.compose.ui.platform.a.a(vciVar3, "cards_action_button_title"), 12, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xv7.j(str2, vz1.g(1.0f, q, true), j3, 0L, 0L, 0, 0L, 2, false, 3, 0, null, j2, oq5Var, (i3 >> 3) & 14, 3120, 55288);
            oq5Var = oq5Var;
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, 0, oq5Var), null, d.m(vciVar3, 24), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 432, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 24, str, str2, function0, yciVar);
        }
    }

    public static final v20 a0(AlbumsChartDto albumsChartDto) {
        AlbumDto album;
        oq G;
        ChartPositionInfoDto chartPosition;
        jf4 U;
        albumsChartDto.getClass();
        String title = albumsChartDto.getTitle();
        String description = albumsChartDto.getDescription();
        String typeForFrom = albumsChartDto.getTypeForFrom();
        List<ChartAlbumDto> albums = albumsChartDto.getAlbums();
        if (albums != null) {
            ArrayList arrayList = new ArrayList();
            for (ChartAlbumDto chartAlbumDto : albums) {
                re4 re4Var = (chartAlbumDto == null || (album = chartAlbumDto.getAlbum()) == null || (G = ild.G(album)) == null || (chartPosition = chartAlbumDto.getChartPosition()) == null || (U = i4w.U(chartPosition)) == null) ? null : new re4(G, U);
                if (re4Var != null) {
                    arrayList.add(re4Var);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new v20(title, description, typeForFrom, arrayList);
            }
        }
        return null;
    }

    public static final void b(db1 db1Var, yci yciVar, hq5 hq5Var, int i2) {
        String N;
        long r;
        int i3 = db1Var.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-961871005);
        int i4 = i2 | (oq5Var.f(db1Var) ? 4 : 2);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i5 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zs0(17);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            yci b2 = nfp.b(vciVar, true, (Function1) K);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            yci a4 = androidx.compose.ui.platform.a.a(vciVar, "artist_info_listeners_count");
            String D = tt0.D(i3);
            ges e2 = nu0.e();
            agr agrVar = eq0.a;
            xcs.b(D, a4, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, oq5Var, 48, 0, 65528);
            xcs.b(StringsKt.t0(rvf.H(R.plurals.number_of_listeners_per_month, i3, new Object[]{""}, oq5Var)).toString(), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65530);
            oq5Var = oq5Var;
            oq5Var.p(true);
            Integer num = db1Var.b;
            if (num == null) {
                oq5Var.Z(1868595647);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1868595648);
                int intValue = num.intValue();
                float f2 = 12;
                u1g.l(oq5Var, d.e(vciVar, f2));
                yci n = androidx.compose.foundation.layout.a.n(a.b(xp3.u(d.d(vciVar, 1.0f), o5g.G(oq5Var)), ((dq0) oq5Var.j(agrVar)).c.c, vnj.i), f2, 8);
                ta5 a5 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, n);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a5, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                yci a6 = androidx.compose.ui.platform.a.a(vciVar, "artist_info_listeners_delta_count");
                oq5Var.Z(-1064473258);
                kn0 kn0Var = new kn0();
                String D2 = tt0.D(Math.abs(intValue));
                if (intValue >= 0) {
                    oq5Var.Z(1637200178);
                    N = rvf.N(R.string.artist_info_listeners_more, new Object[]{D2}, oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(1637344018);
                    N = rvf.N(R.string.artist_info_listeners_less, new Object[]{D2}, oq5Var);
                    oq5Var.p(false);
                }
                if (intValue > 0) {
                    oq5Var.Z(1637595986);
                    r = ((dq0) oq5Var.j(agrVar)).a.f;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(1637708578);
                    r = kg5.r(R.color.icon_like_day, oq5Var);
                    oq5Var.p(false);
                }
                kn0Var.b(nn0.a(N, new c4r(r, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534)));
                kn0Var.d(rvf.M(R.string.artist_info_listeners_than_last_period, oq5Var));
                mn0 h2 = kn0Var.h();
                oq5Var.p(false);
                xcs.c(h2, a6, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, nu0.i(), oq5Var, 48, 0, 131064);
                oq5Var = oq5Var;
                oq5Var.p(true);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new a3(db1Var, yciVar, i2, 13);
        }
    }

    public static final Integer b0(String str) {
        str.getClass();
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e2) {
            ssg.a(6, null, "failed to parse color " + str, e2);
            return null;
        } catch (IndexOutOfBoundsException e3) {
            ssg.a(6, null, "failed to parse color " + str, e3);
            return null;
        }
    }

    public static final void c(final xv xvVar, ny3 ny3Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        final ny3 ny3Var2;
        oq5 oq5Var;
        xvVar.getClass();
        ny3Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1841471049);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(xvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(ny3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            iz2 iz2Var = b2c.i;
            yci c2 = d.c(yciVar, 1.0f);
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var2.P;
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
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h2 = oq5Var2.h(ny3Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                t93 t93Var = new t93(0, ny3Var, ny3.class, "reportButtonShown", "reportButtonShown()V", 0, 15);
                ny3Var2 = ny3Var;
                oq5Var2.k0(t93Var);
                K = t93Var;
            } else {
                ny3Var2 = ny3Var;
            }
            com.yandex.music.core.ui.compose.a.a((Function0) ((h9f) K), oq5Var2, 0);
            boolean z = xvVar instanceof de3;
            vci vciVar = vci.a;
            if (z) {
                oq5Var2.Z(-523305790);
                de3 de3Var = (de3) xvVar;
                String str = de3Var.l;
                String str2 = de3Var.k;
                yci a2 = androidx.compose.ui.platform.a.a(vciVar, "cards_action_button");
                boolean h3 = oq5Var2.h(ny3Var2) | oq5Var2.h(xvVar);
                Object K2 = oq5Var2.K();
                if (h3 || K2 == kjnVar) {
                    final int i5 = 0;
                    K2 = new Function0() { // from class: vv3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = i5;
                            xv xvVar2 = xvVar;
                            ny3 ny3Var3 = ny3Var2;
                            switch (i6) {
                                case 0:
                                    de3 de3Var2 = (de3) xvVar2;
                                    ny3Var3.getClass();
                                    de3Var2.getClass();
                                    bz2 bz2Var = ny3Var3.b.o;
                                    Integer b2 = ny3Var3.b();
                                    Integer c3 = ny3Var3.c();
                                    nmb nmbVar = (nmb) bz2Var.c;
                                    emb[] embVarArr = emb.a;
                                    int intValue = b2 != null ? b2.intValue() : -1;
                                    int intValue2 = c3 != null ? c3.intValue() : -1;
                                    dmb[] dmbVarArr = dmb.a;
                                    nmbVar.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("stories_type", "promo_stories");
                                    ouj.y(intValue, linkedHashMap, "stories_count", intValue2, "stories_pos");
                                    linkedHashMap.put("stories_name", "");
                                    linkedHashMap.put("from", "stories_screen");
                                    dfi.p(1, "to", "playlist_screen", "_meta", linkedHashMap);
                                    nmbVar.C("Stories.Button.Navigated", linkedHashMap);
                                    fy3 fy3Var = ny3Var3.a;
                                    String str3 = de3Var2.m;
                                    str3.getClass();
                                    w1g.y(fy3Var.a, str3, true);
                                    return Unit.a;
                                default:
                                    return new w5l(ny3Var3.j, new jab(qkb.MyWave, 1, 3, 1), new thj(pkb.Wave, ((ee3) xvVar2).m.h(), 1, 1, ""), null);
                            }
                        }
                    };
                    oq5Var2.k0(K2);
                }
                Function0 function0 = (Function0) K2;
                oq5Var = oq5Var2;
                a(str2, str, function0, a2, oq5Var, 3072);
                oq5Var.p(false);
            } else {
                if (!(xvVar instanceof ee3)) {
                    throw vz1.i(oq5Var2, -16880813, false);
                }
                oq5Var2.Z(-522528558);
                ee3 ee3Var = (ee3) xvVar;
                StationId stationId = ee3Var.m;
                Object K3 = oq5Var2.K();
                if (K3 == kjnVar) {
                    K3 = new xv3(ny3Var2);
                    oq5Var2.k0(K3);
                }
                xv3 xv3Var = (xv3) K3;
                kxi kxiVar = ny3Var2.h;
                k6l k6lVar = ny3Var2.f;
                uwu uwuVar = ny3Var2.g;
                qwu qwuVar = ny3Var2.e;
                boolean h4 = oq5Var2.h(ny3Var2) | oq5Var2.h(xvVar);
                Object K4 = oq5Var2.K();
                if (h4 || K4 == kjnVar) {
                    final int i6 = 1;
                    K4 = new Function0() { // from class: vv3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i62 = i6;
                            xv xvVar2 = xvVar;
                            ny3 ny3Var3 = ny3Var2;
                            switch (i62) {
                                case 0:
                                    de3 de3Var2 = (de3) xvVar2;
                                    ny3Var3.getClass();
                                    de3Var2.getClass();
                                    bz2 bz2Var = ny3Var3.b.o;
                                    Integer b2 = ny3Var3.b();
                                    Integer c3 = ny3Var3.c();
                                    nmb nmbVar = (nmb) bz2Var.c;
                                    emb[] embVarArr = emb.a;
                                    int intValue = b2 != null ? b2.intValue() : -1;
                                    int intValue2 = c3 != null ? c3.intValue() : -1;
                                    dmb[] dmbVarArr = dmb.a;
                                    nmbVar.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("stories_type", "promo_stories");
                                    ouj.y(intValue, linkedHashMap, "stories_count", intValue2, "stories_pos");
                                    linkedHashMap.put("stories_name", "");
                                    linkedHashMap.put("from", "stories_screen");
                                    dfi.p(1, "to", "playlist_screen", "_meta", linkedHashMap);
                                    nmbVar.C("Stories.Button.Navigated", linkedHashMap);
                                    fy3 fy3Var = ny3Var3.a;
                                    String str3 = de3Var2.m;
                                    str3.getClass();
                                    w1g.y(fy3Var.a, str3, true);
                                    return Unit.a;
                                default:
                                    return new w5l(ny3Var3.j, new jab(qkb.MyWave, 1, 3, 1), new thj(pkb.Wave, ((ee3) xvVar2).m.h(), 1, 1, ""), null);
                            }
                        }
                    };
                    oq5Var2.k0(K4);
                }
                owu X = wyf.X(stationId, kxiVar, (Function0) K4, k6lVar, uwuVar, qwuVar, xv3Var, null, oq5Var2, 12582918, 384);
                String str3 = ee3Var.k;
                String str4 = ee3Var.l;
                String str5 = ee3Var.n;
                d85 d85Var = ee3Var.p;
                e9q.b(new lnu(str3, str4, d85Var != null ? d85Var.a : d85.n, null, str5, null, null, null, 232), X, ny3Var2.d, androidx.compose.ui.platform.a.a(vciVar, "cards_wave_button"), 0.0f, oq5Var2, 3072, 16);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(xvVar, ny3Var, yciVar, i2, 17);
        }
    }

    public static final long c0(long j) {
        boolean m = nsa.m(j);
        if (m) {
            return nsa.f(nsa.o(j, yd5.N(999999L, ssa.NANOSECONDS)));
        }
        if (!m) {
            return 0L;
        }
        b6e.s();
        return 0L;
    }

    public static final void d(List list, yci yciVar, long j, long j2, long j3, int i2, long j4, final int i3, Function1 function1, ges gesVar, hq5 hq5Var, int i4, int i5) {
        List list2;
        int i6;
        long j5;
        Function1 function12;
        long j6;
        long j7;
        long j8;
        final yci yciVar2;
        int i7;
        Function1 function13;
        yci yciVar3;
        long j9;
        long j10;
        int i8;
        long j11;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(850525738);
        if ((i4 & 6) == 0) {
            list2 = list;
            i6 = (oq5Var.f(list2) ? 4 : 2) | i4;
        } else {
            list2 = list;
            i6 = i4;
        }
        int i9 = i6 | 48;
        if ((i4 & 384) == 0) {
            j5 = j;
            i9 |= oq5Var.e(j5) ? 256 : 128;
        } else {
            j5 = j;
        }
        int i10 = 14380032 | i9;
        if ((100663296 & i4) == 0) {
            i10 = 47934464 | i9;
        }
        int i11 = 805306368 | i10;
        int i12 = i5 | 6;
        if ((i5 & 48) == 0) {
            i12 |= oq5Var.d(i3) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if ((i5 & 3072) == 0) {
            i13 |= oq5Var.f(gesVar) ? 2048 : 1024;
        }
        if ((i11 & 306783379) == 306783378 && (i13 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
            j9 = j2;
            j10 = j3;
            i8 = i2;
            j11 = j4;
            function13 = function1;
        } else {
            oq5Var.U();
            if ((i4 & 1) == 0 || oq5Var.y()) {
                long j12 = kes.c;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new kz5(24);
                    oq5Var.k0(K);
                }
                function12 = (Function1) K;
                j6 = j12;
                j7 = j6;
                j8 = j7;
                yciVar2 = vci.a;
                i7 = Integer.MIN_VALUE;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                j6 = j2;
                j7 = j3;
                i7 = i2;
                j8 = j4;
                function12 = function1;
            }
            oq5Var.q();
            int i14 = u5g.b;
            final long j13 = j7;
            final long j14 = j6;
            final ges e2 = gesVar.e(new ges(0L, j14, null, null, null, null, null, j13, null, i7, j8, null, null, v5g.l(2, 4), 14511953));
            final List list3 = list2;
            final long j15 = j5;
            final int i15 = i7;
            final long j16 = j8;
            final Function1 function14 = function12;
            bg3.a(null, null, false, ild.C(924934656, new pyc() { // from class: yh6
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ges gesVar2;
                    Object obj4;
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
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    int L = ((jx7) oq5Var3.j(es5.h)).L(cVar.d());
                    ids O = o5g.O(0, 1, oq5Var3);
                    Object obj5 = list3;
                    boolean f2 = oq5Var3.f(obj5) | oq5Var3.d(L);
                    Object K2 = oq5Var3.K();
                    ges gesVar3 = e2;
                    Object obj6 = gq5.a;
                    if (f2 || K2 == obj6) {
                        StringBuilder sb = new StringBuilder(16);
                        new ArrayList();
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = ((Iterable) obj5).iterator();
                        int i16 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                u75.n();
                                throw null;
                            }
                            String str = (String) next;
                            String g2 = f1d.g(", ", str);
                            ges gesVar4 = gesVar3;
                            ArrayList arrayList2 = arrayList;
                            Iterator it2 = it;
                            StringBuilder sb3 = sb2;
                            Object obj7 = obj6;
                            if (((int) (ids.a(O, sb2.length() == 0 ? str : ((Object) sb2) + g2, gesVar4, 1, false, 0, ia6.b(Integer.MAX_VALUE, 0, 12), 976).c >> 32)) <= L) {
                                sb2 = sb3;
                                sb2.append(sb2.length() > 0 ? g2 : str);
                            } else if (((int) (ids.a(O, str, gesVar4, 1, false, 0, ia6.b(Integer.MAX_VALUE, 0, 12), 976).c >> 32)) < L) {
                                StringBuilder sb4 = new StringBuilder();
                                sb2 = sb3;
                                sb4.append((Object) sb2);
                                sb4.append(", ");
                                sb.append(sb4.toString());
                                sb.append(StringUtil.LF);
                                sb2.setLength(0);
                                sb2.append(str);
                            } else {
                                sb2 = sb3;
                                sb.append(sb2.toString());
                                sb2.setLength(0);
                            }
                            arrayList = arrayList2;
                            it = it2;
                            obj6 = obj7;
                            i16 = i17;
                            gesVar3 = gesVar4;
                        }
                        ArrayList arrayList3 = arrayList;
                        gesVar2 = gesVar3;
                        obj4 = obj6;
                        if (sb2.length() > 0) {
                            sb.append(sb2.toString());
                        }
                        String sb5 = sb.toString();
                        ArrayList arrayList4 = new ArrayList(arrayList3.size());
                        int size = arrayList3.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            arrayList4.add(((jn0) arrayList3.get(i18)).a(sb.length()));
                        }
                        K2 = new mn0(sb5, arrayList4);
                        oq5Var3.k0(K2);
                    } else {
                        gesVar2 = gesVar3;
                        obj4 = obj6;
                    }
                    mn0 mn0Var = (mn0) K2;
                    Function1 function15 = function14;
                    boolean f3 = oq5Var3.f(function15);
                    Object K3 = oq5Var3.K();
                    if (f3 || K3 == obj4) {
                        K3 = new ai6(0, function15);
                        oq5Var3.k0(K3);
                    }
                    xv7.i(mn0Var, yciVar2, j15, j14, j13, i15, j16, 2, true, i3, 0, null, (Function2) K3, gesVar2, null, null, oq5Var3, 0, 432, 835584);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 7);
            function13 = function12;
            yciVar3 = yciVar2;
            j9 = j14;
            j10 = j13;
            i8 = i7;
            j11 = j8;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zh6(list, yciVar3, j, j9, j10, i8, j11, i3, function13, gesVar, i4, i5);
        }
    }

    public static final ExtractedText d0(ybs ybsVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = ybsVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = ybsVar.b;
        extractedText.selectionStart = rds.e(j);
        extractedText.selectionEnd = rds.d(j);
        extractedText.flags = !StringsKt.N(ybsVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void e(xia xiaVar, hq5 hq5Var, int i2) {
        xiaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-999289777);
        int i3 = (oq5Var.f(xiaVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            cja cjaVar = (cja) gld.O(xiaVar.c, oq5Var).getValue();
            if (cjaVar instanceof bja) {
                oq5Var.Z(1755205379);
                bcx.f(xiaVar, ((bja) cjaVar).a, oq5Var, i3 & 14);
                oq5Var.p(false);
            } else if (cjaVar instanceof aja) {
                oq5Var.Z(1755208701);
                c3x.o(((aja) cjaVar).b, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(cjaVar, zia.a)) {
                    throw vz1.i(oq5Var, 1755201690, false);
                }
                oq5Var.Z(-1423014161);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(xiaVar, i2, 1);
        }
    }

    public static void e0(c9c c9cVar, t7k t7kVar, String str, Function1 function1, JSONObject jSONObject) {
        if (c9cVar instanceof a9c) {
            e5f.h(t7kVar, jSONObject, str, (szb) ((a9c) c9cVar).c, function1);
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat(str), ((z8c) c9cVar).c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, yci yciVar, int i2, g40 g40Var, o0k o0kVar, hq5 hq5Var, int i3, int i4) {
        yci yciVar2;
        o0k o0kVar2;
        int i5;
        int i6;
        g40 g40Var2;
        o0k o0kVar3;
        int i7;
        xmn r;
        int i8;
        yci yciVar3;
        g40 g40Var3;
        o0k o0kVar4;
        int i9;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1150516696);
        int i10 = i3 | (oq5Var.f(str) ? 4 : 2);
        int i11 = i4 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i3 & 48) == 0) {
            yciVar2 = yciVar;
            i10 |= oq5Var.f(yciVar2) ? 32 : 16;
            int i12 = i10 | 3456;
            if ((i4 & 16) != 0) {
                o0kVar2 = o0kVar;
                if (oq5Var.f(o0kVar2)) {
                    i5 = 16384;
                    i6 = i12 | i5;
                    if (oq5Var.P(i6 & 1, (i6 & 9363) != 9362)) {
                        oq5Var.U();
                        if ((i3 & 1) == 0 || oq5Var.y()) {
                            yci yciVar4 = i11 != 0 ? vci.a : yciVar2;
                            iz2 iz2Var = b2c.f;
                            if ((i4 & 16) != 0) {
                                o0kVar2 = t9b.a(15, 0.0f);
                                i6 &= -57345;
                            }
                            o0k o0kVar5 = o0kVar2;
                            i8 = i6;
                            yciVar3 = yciVar4;
                            g40Var3 = iz2Var;
                            o0kVar4 = o0kVar5;
                            i9 = 1;
                        } else {
                            oq5Var.S();
                            if ((i4 & 16) != 0) {
                                i6 &= -57345;
                            }
                            o0k o0kVar6 = o0kVar2;
                            i8 = i6;
                            yciVar3 = yciVar2;
                            o0kVar4 = o0kVar6;
                            i9 = i2;
                            g40Var3 = g40Var;
                        }
                        oq5Var.q();
                        yci d2 = d.d(yciVar3, 1.0f);
                        Object K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new rua(27);
                            oq5Var.k0(K);
                        }
                        yci l = androidx.compose.foundation.layout.a.l(nfp.b(d2, true, (Function1) K), o0kVar4);
                        kfh d3 = ug3.d(g40Var3, false);
                        int i13 = oq5Var.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var.l();
                        yci H = vnj.H(oq5Var, l);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(oq5Var, d3, wp5.f);
                        g0g.U(oq5Var, l2, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i13))) {
                            ouj.x(i13, oq5Var, i13, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        o0k o0kVar7 = o0kVar4;
                        xcs.b(str, null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, i9, 0, null, nu0.c(), oq5Var, i8 & 14, 3120, 54778);
                        oq5Var = oq5Var;
                        oq5Var.p(true);
                        i7 = i9;
                        g40Var2 = g40Var3;
                        yciVar2 = yciVar3;
                        o0kVar3 = o0kVar7;
                    } else {
                        oq5Var.S();
                        g40Var2 = g40Var;
                        o0kVar3 = o0kVar2;
                        i7 = i2;
                    }
                    r = oq5Var.r();
                    if (r != null) {
                        r.d = new xj(str, yciVar2, i7, g40Var2, o0kVar3, i3, i4);
                        return;
                    }
                    return;
                }
            } else {
                o0kVar2 = o0kVar;
            }
            i5 = RemoteCameraConfig.Notification.ID;
            i6 = i12 | i5;
            if (oq5Var.P(i6 & 1, (i6 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        int i122 = i10 | 3456;
        if ((i4 & 16) != 0) {
        }
        i5 = RemoteCameraConfig.Notification.ID;
        i6 = i122 | i5;
        if (oq5Var.P(i6 & 1, (i6 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static void f0(t7k t7kVar, JSONObject jSONObject, String str, c9c c9cVar) {
        e0(c9cVar, t7kVar, str, bcx.i, jSONObject);
    }

    public static final void g(g2d g2dVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        g2dVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(478574129);
        int i3 = i2 | (oq5Var2.h(g2dVar) ? 4 : 2);
        if ((i3 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean h2 = oq5Var2.h(g2dVar);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                ceb cebVar = new ceb(0, g2dVar, g2d.class, "onStop", "onStop()V", 0, 29);
                oq5Var2.k0(cebVar);
                K = cebVar;
            }
            oq5Var = oq5Var2;
            wyf.c(null, null, null, (Function0) ((h9f) K), null, oq5Var, 0, 47);
            bcx.i(g2dVar, oq5Var, i3 & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d2d(g2dVar, i2, 0);
        }
    }

    public static void g0(t7k t7kVar, JSONObject jSONObject, c9c c9cVar) {
        if (c9cVar instanceof a9c) {
            e5f.i(t7kVar, jSONObject, (vzb) ((a9c) c9cVar).c);
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$colors", ((z8c) c9cVar).c);
        }
    }

    public static final long h(int i2) {
        long j = (i2 << 32) | (0 & 4294967295L);
        int i3 = faf.n;
        return j;
    }

    public static void h0(t7k t7kVar, JSONObject jSONObject, String str, c9c c9cVar) {
        if (!(c9cVar instanceof a9c)) {
            if (c9cVar instanceof z8c) {
                etn.l0(t7kVar, jSONObject, "$".concat(str), ((z8c) c9cVar).c);
                return;
            }
            return;
        }
        Object obj = ((a9c) c9cVar).c;
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
    }

    public static final void i(fvf fvfVar, aqi aqiVar, int i2, Function1 function1, hq5 hq5Var, int i3) {
        int i4;
        fvfVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1399728904);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(fvfVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(aqiVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new suf();
                oq5Var.k0(K);
            }
            ((suf) K).a(fvfVar, aqiVar, i2, function1, oq5Var, i4 & 8190);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(fvfVar, aqiVar, i2, function1, i3, 12);
        }
    }

    public static void i0(t7k t7kVar, JSONObject jSONObject, String str, c9c c9cVar, arf arfVar) {
        if (c9cVar instanceof a9c) {
            etn.m0(t7kVar, jSONObject, str, ((a9c) c9cVar).c, arfVar);
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat(str), ((z8c) c9cVar).c);
        }
    }

    public static final void j(fvf fvfVar, List list, Function1 function1, hq5 hq5Var, int i2) {
        fvf fvfVar2;
        List list2;
        Function1 function12;
        list.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1094077254);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.f(list) ? 32 : 16);
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            fvfVar2 = fvfVar;
            list2 = list;
            function12 = function1;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new suf();
                oq5Var.k0(K);
            }
            fvfVar2 = fvfVar;
            list2 = list;
            function12 = function1;
            ((suf) K).b(fvfVar2, list2, function12, 2, oq5Var, ((i3 >> 3) & 7168) | (i3 & 1022) | 24576);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(fvfVar2, list2, function12, i2);
        }
    }

    public static void j0(t7k t7kVar, JSONObject jSONObject, c9c c9cVar) {
        if (!(c9cVar instanceof a9c)) {
            if (c9cVar instanceof z8c) {
                etn.l0(t7kVar, jSONObject, "$transition_triggers", ((z8c) c9cVar).c);
                return;
            }
            return;
        }
        List list = (List) ((a9c) c9cVar).c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray.put(((nw9) list.get(i2)).a);
        }
        try {
            jSONObject.put("transition_triggers", jSONArray);
        } catch (JSONException e2) {
            t7kVar.a().a(e2);
        }
    }

    public static final jvf k(fvf fvfVar) {
        int h2 = fvfVar.h();
        cvf cvfVar = (cvf) CollectionsKt.Z(fvfVar.j().k);
        return new jvf(h2, cvfVar != null ? Integer.valueOf(cvfVar.a) : null, fvfVar.j().k.size(), fvfVar.j().n);
    }

    public static void k0(t7k t7kVar, JSONObject jSONObject, String str, c9c c9cVar, arf arfVar) {
        if (c9cVar instanceof a9c) {
            etn.n0(t7kVar, jSONObject, str, (List) ((a9c) c9cVar).c, arfVar);
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat(str), ((z8c) c9cVar).c);
        }
    }

    public static final thj l(kx5 kx5Var, int i2) {
        kx5Var.getClass();
        if (kx5Var instanceof ix5) {
            return new thj(pkb.LocationAutoDetect, "location_auto_detect", 1, i2, "");
        }
        if (!(kx5Var instanceof jx5)) {
            b6e.s();
            return null;
        }
        pkb pkbVar = pkb.Location;
        String valueOf = String.valueOf(((jx5) kx5Var).a.a);
        valueOf.getClass();
        return new thj(pkbVar, valueOf, 1, i2, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader l0() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        jt1 jt1Var;
        synchronized (y2x.class) {
            if (a == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i3];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i2 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i2];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (thread == null) {
                                        try {
                                            jt1Var = new jt1(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e3) {
                                            e2 = e3;
                                        }
                                        try {
                                            jt1Var.setContextClassLoader(null);
                                            jt1Var.start();
                                            thread = jt1Var;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = jt1Var;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e5) {
                                    e2 = e5;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e6) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e6.getMessage());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(cg6 cg6Var) {
        zu7 zu7Var;
        int i2;
        if (cg6Var instanceof zu7) {
            zu7Var = (zu7) cg6Var;
            int i3 = zu7Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zu7Var.k = i3 - Integer.MIN_VALUE;
                Object obj = zu7Var.j;
                nm6 nm6Var = nm6.a;
                i2 = zu7Var.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    zu7Var.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(zu7Var));
                    zt3Var.s();
                    if (zt3Var.q() == nm6Var) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
            }
        }
        zu7Var = new zu7(cg6Var);
        Object obj2 = zu7Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = zu7Var.k;
        if (i2 != 0) {
        }
        rj7.f();
    }

    public static zq6 n(String str, String str2) {
        Exception q;
        try {
            as6 as6Var = new as6(new o2(26), null);
            if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                q = hld.q(new o2(0), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                q = hld.q(new o2(1), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                q = hld.q(new o2(2), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                q = hld.q(new o2(3), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                q = hld.q(new o2(4), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                q = hld.q(new o2(5), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                q = hld.q(new o2(6), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                q = hld.q(new o2(7), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                q = hld.q(new o2(8), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                q = hld.q(new o2(9), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                q = hld.q(new o2(10), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                q = hld.q(new o2(11), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                q = hld.q(new o2(12), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                q = hld.q(new o2(13), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                q = hld.q(new o2(14), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                q = hld.q(new o2(15), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                q = hld.q(new o2(16), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                q = hld.q(new o2(17), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                q = hld.q(new o2(18), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                q = hld.q(new o2(19), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                q = hld.q(new o2(20), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                q = hld.q(new o2(21), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                q = hld.q(new o2(22), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                q = hld.q(new o2(23), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                q = hld.q(new o2(24), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                q = hld.q(new o2(25), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                q = hld.q(new o2(26), str2, as6Var);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                q = hld.q(new o2(27), str2, as6Var);
            } else {
                if (!str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new uvc();
                }
                q = hld.q(new o2(28), str2, as6Var);
            }
            return (zq6) q;
        } catch (uvc unused) {
            return new yq6(str, str2);
        }
    }

    public static final Object o(long j, Continuation continuation) {
        if (j <= 0) {
            return Unit.a;
        }
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        if (j < Long.MAX_VALUE) {
            v(zt3Var.e).Q(j, zt3Var);
        }
        Object q = zt3Var.q();
        return q == nm6.a ? q : Unit.a;
    }

    public static final Object p(long j, Continuation continuation) {
        Object o = o(c0(j), continuation);
        return o == nm6.a ? o : Unit.a;
    }

    public static final yci q(yci yciVar) {
        yciVar.getClass();
        return nfp.b(yciVar, false, new u4(4));
    }

    public static final boolean r(jc3 jc3Var, Set set, String str, r0o r0oVar) {
        set.getClass();
        r0oVar.getClass();
        r23 r23Var = new r23(set, r0oVar, null, str);
        if (jc3Var.equals(kc3.t)) {
            return true;
        }
        if (jc3Var.equals(kc3.s)) {
            return false;
        }
        return ((Boolean) r23Var.invoke(jc3Var.s)).booleanValue();
    }

    public static final void s(Runnable runnable, Executor executor) {
        Object t7oVar;
        executor.getClass();
        try {
            r7o r7oVar = z7o.b;
            executor.execute(runnable);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Log.e(null, "Exception occurred in executeSafely", a2);
        }
    }

    public static final lyd t(long j, long j2, int i2, String str) {
        str.getClass();
        TimeUnit.MILLISECONDS.getClass();
        Object obj = ComponentHistograms.b;
        return u(xee.B(), str, j, j2, i2);
    }

    public static lyd u(ComponentHistograms componentHistograms, String str, long j, long j2, int i2) {
        int i3 = Integer.MIN_VALUE;
        int i4 = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        if (j2 > 2147483647L) {
            i3 = Integer.MAX_VALUE;
        } else if (j2 >= -2147483648L) {
            i3 = (int) j2;
        }
        return componentHistograms.b(str, i4, i3, i2);
    }

    public static final xu7 v(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.t0);
        xu7 xu7Var = element instanceof xu7 ? (xu7) element : null;
        return xu7Var == null ? zl7.a : xu7Var;
    }

    public static Drawable w(Context context, int i2) {
        return w2o.c().d(context, i2);
    }

    public static final szb x(wj9 wj9Var) {
        return wj9Var instanceof l1a ? ((l1a) wj9Var).j : wj9Var instanceof tw8 ? ((tw8) wj9Var).a : new ozb(0L);
    }

    public static final lyd y(int i2, String str) {
        Object obj = ComponentHistograms.b;
        return xee.B().c(str, 1, i2, i2 + 1);
    }

    public static final lyd z(String str) {
        Object obj = ComponentHistograms.b;
        return xee.B().c(str, 1, 101, 102);
    }

    public abstract float A(Object obj);

    public abstract void Y(Object obj, float f2);
}
