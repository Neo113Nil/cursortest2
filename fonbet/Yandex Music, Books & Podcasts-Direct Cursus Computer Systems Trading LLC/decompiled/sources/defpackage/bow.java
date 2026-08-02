package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import ru.yandex.music.gallery.GalleryWidgetActivity;

/* loaded from: classes3.dex */
public abstract class bow {
    public static volatile k3i a;
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final Object j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final Long[] o;
    public static String p;

    static {
        int i2 = 21;
        b = new wn5(new bo5(i2), 1128069126, false);
        int i3 = 22;
        new wn5(new bo5(i3), 495529513, false);
        new wn5(new bo5(23), -983261301, false);
        new wn5(new bo5(24), 1281086116, false);
        int i4 = 3;
        c = new wn5(new lo5(i4), -1932887721, false);
        d = new wn5(new po5(i2), 697005844, false);
        e = new wn5(new wo5(0), -1618496986, false);
        f = new wn5(new wo5(1), -486087439, false);
        g = new wn5(new wo5(2), -561926000, false);
        h = new wn5(new wo5(i4), 1215145533, false);
        i = new wn5(new wo5(4), -204178498, false);
        new wn5(new po5(i3), 37513546, false);
        new wn5(new wo5(5), -854702092, false);
        j = new Object();
        k = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        l = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        m = new int[]{3, 6};
        n = new int[]{1, 2, 4, 5, 7, 8};
        o = new Long[]{0L, 1L, 5L, 10L};
    }

    public static final j00 A(fz fzVar, mt mtVar, oq5 oq5Var) {
        fzVar.getClass();
        boolean f2 = oq5Var.f(mtVar);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            e10 e10Var = fzVar.b;
            dy dyVar = fzVar.c;
            hy hyVar = fzVar.e;
            j00 j00Var = new j00(fzVar.a, fzVar.d, e10Var, dyVar, hyVar, mtVar, fzVar.f, fzVar.g, fzVar.h, fzVar.i);
            oq5Var.k0(j00Var);
            K = j00Var;
        }
        return (j00) K;
    }

    public static final eu7 B(eu7 eu7Var, boolean z) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        du7 du7Var = eu7Var.b;
        egc egcVar = cu7Var.a;
        if (egcVar.b() == z) {
            return eu7Var;
        }
        int i2 = du7Var.a;
        int g2 = u75.g(egcVar.getElements());
        if (i2 >= 0 && i2 <= g2) {
            i2 = egcVar.d(g2 - egcVar.c(i2));
        }
        int i3 = du7Var.b;
        if (i3 >= 0 && i3 <= g2) {
            i3 = i2;
        }
        return new eu7(z ? cu7.a(cu7Var, egcVar.a(), null, 2) : cu7.a(cu7Var, egcVar.g(), null, 2), new du7(i2, i3));
    }

    public static final Object C(f9f f9fVar, Object obj) {
        f9fVar.getClass();
        if (!((lm4) f9fVar).i(obj)) {
            return null;
        }
        obj.getClass();
        return obj;
    }

    public static final void D(View view) {
        view.getClass();
        wdu.q(view, new eb(0));
    }

    public static final List E(List list, ap0 ap0Var) {
        list.getClass();
        int i2 = ap0Var.a;
        int i3 = ap0Var.b;
        int i4 = i2 * i3;
        int i5 = i3 + i4;
        int size = list.size();
        if (i5 > size) {
            i5 = size;
        }
        return list.subList(i4, i5);
    }

    public static final String F(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final t4w G(List list, t4w t4wVar) {
        t4w t4wVar2;
        list.getClass();
        t4wVar.getClass();
        boolean c2 = t4wVar.e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean c3 = t4wVar.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean c4 = t4wVar.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!c2 && c3 && c4) {
            String str = t4wVar.c;
            p97 p97Var = new p97(0);
            q97 q97Var = t4wVar.e;
            q97Var.getClass();
            p97Var.f(q97Var.a);
            p97Var.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            t4wVar2 = t4w.b(t4wVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", p97Var.c(), 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            t4wVar2 = t4wVar;
        }
        if (Build.VERSION.SDK_INT > 25) {
            return t4wVar2;
        }
        fa6 fa6Var = t4wVar2.j;
        String str2 = t4wVar2.c;
        if (Intrinsics.d(str2, ConstraintTrackingWorker.class.getName())) {
            return t4wVar2;
        }
        if (!fa6Var.e && !fa6Var.f) {
            return t4wVar2;
        }
        p97 p97Var2 = new p97(0);
        q97 q97Var2 = t4wVar2.e;
        q97Var2.getClass();
        p97Var2.f(q97Var2.a);
        p97Var2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
        return t4w.b(t4wVar2, null, null, ConstraintTrackingWorker.class.getName(), p97Var2.c(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    public static final void a(int i2, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1897475378);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            bg3.a(null, null, false, ild.C(1187480220, new xk(11, yciVar, (aqi) K, str), oq5Var), oq5Var, 3072, 7);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i2, 0);
        }
    }

    public static final void b(final long j2, final d85 d85Var, final Locale locale, final yci yciVar, final String str, final um0 um0Var, long j3, long j4, hq5 hq5Var, final int i2) {
        int i3;
        final long j5;
        final long j6;
        locale.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1349231728);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(locale) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(str) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.d(um0Var == null ? -1 : um0Var.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i3 | 14155776;
        if ((i4 & 4793491) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            j6 = j3;
            j5 = j4;
        } else {
            final long z = v7g.z(10);
            final long z2 = v7g.z(100);
            String format = NumberFormat.getNumberInstance(locale).format(j2);
            format.getClass();
            final String concat = format.concat(str);
            final float Q = ff7.Q(16, oq5Var);
            final kes kesVar = (kes) ((Map) oq5Var.j(vvq.a)).get(concat);
            final ges I = wyf.I();
            final jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            final ppc ppcVar = (ppc) oq5Var.j(es5.k);
            oq5Var = oq5Var;
            bg3.a(yciVar, null, false, ild.C(-1191182394, new pyc() { // from class: m92
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long D;
                    long j7;
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
                    long j8 = j2;
                    boolean e2 = oq5Var3.e(j8);
                    String str2 = str;
                    boolean f2 = e2 | oq5Var3.f(str2);
                    long j9 = z;
                    boolean e3 = f2 | oq5Var3.e(j9);
                    long j10 = z2;
                    boolean e4 = e3 | oq5Var3.e(j10);
                    Object K = oq5Var3.K();
                    Locale locale2 = locale;
                    if (e4 || K == gq5.a) {
                        locale2.getClass();
                        String format2 = NumberFormat.getNumberInstance(locale2).format(j8);
                        format2.getClass();
                        String concat2 = format2.concat(str2);
                        kes kesVar2 = kesVar;
                        if (kesVar2 != null) {
                            D = kesVar2.a;
                        } else {
                            float c2 = kes.c(j9);
                            float c3 = kes.c(j10);
                            float f3 = c2;
                            while (c2 <= c3) {
                                float f4 = (c2 + c3) / 2;
                                ges b2 = ges.b(I, 0L, v7g.D(f4, 4294967296L), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213);
                                c5b c5bVar = c5b.a;
                                if (ga6.i(cVar.b) >= new mh0(concat2, b2, c5bVar, c5bVar, ppcVar, jx7Var).i.c() + Q) {
                                    c2 = f4 + 0.5f;
                                    f3 = f4;
                                } else {
                                    c3 = f4 - 0.5f;
                                }
                            }
                            D = v7g.D(f3, 4294967296L);
                        }
                        kes kesVar3 = new kes(D);
                        oq5Var3.k0(kesVar3);
                        K = kesVar3;
                    }
                    long j11 = ((kes) K).a;
                    ((Map) oq5Var3.j(vvq.a)).put(concat, new kes(j11));
                    d85 d85Var2 = d85Var;
                    if (d85Var2 == null) {
                        oq5Var3.Z(2030031821);
                        j7 = ((dq0) oq5Var3.j(eq0.a)).b.a;
                        oq5Var3.p(false);
                    } else {
                        oq5Var3.Z(2030030798);
                        oq5Var3.p(false);
                        j7 = d85Var2.a;
                    }
                    ldr.a(j8, locale2, d.d(d.g(d.u(vci.a, b2c.k, true), 0.0f, ff7.P(j11, oq5Var3), 1), 1.0f), str2, um0Var, new d85(j7), 0, 0, ges.b(wyf.I(), 0L, j11, null, null, 0L, 0, 0L, null, null, 0, 0, 16777213), oq5Var3, 0, 192);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i4 >> 9) & 14) | 3072, 6);
            j5 = z2;
            j6 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: n92
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bow.b(j2, d85Var, locale, yciVar, str, um0Var, j6, j5, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [u0s] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, wl] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, u0s] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hq5, java.lang.Object, oq5] */
    public static final void c(va3 va3Var, c93 c93Var, thj thjVar, wl wlVar, Function1 function1, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        c93 c93Var2;
        float f2;
        ea2 ea2Var;
        vci vciVar;
        fvf fvfVar;
        kjn kjnVar;
        tvd tvdVar;
        int i3;
        int i4;
        Continuation continuation;
        ?? r1;
        Continuation continuation2;
        Unit unit;
        int i5;
        gb3 gb3Var;
        List list;
        eoe eoeVar;
        Continuation continuation3;
        Continuation continuation4;
        ea2 ea2Var2;
        aqi aqiVar;
        fvf fvfVar2;
        int i6;
        int i7;
        boolean z;
        oq5 oq5Var2;
        fvf fvfVar3;
        tvd tvdVar2;
        String str;
        iz2 iz2Var = b2c.b;
        va3Var.getClass();
        function1.getClass();
        ?? r8 = (oq5) hq5Var;
        r8.b0(1721051501);
        int i8 = 2;
        int i9 = i2 | (r8.f(va3Var) ? 4 : 2) | (r8.f(c93Var) ? 32 : 16) | (r8.h(thjVar) ? 256 : 128) | (r8.h(wlVar) ? 2048 : 1024) | (r8.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (r8.P(i9 & 1, (i9 & 9363) != 9362)) {
            fvf a2 = hvf.a(0, 0, r8, 0, 3);
            float f3 = edo.b;
            tvd X = zwf.X(a2, r8, 6);
            WeakHashMap weakHashMap = rqv.w;
            eoe n2 = p6g.n(z7l.h(r8).f, r8);
            boolean c2 = r8.c(f3) | r8.f(n2);
            Object K = r8.K();
            kjn kjnVar2 = gq5.a;
            if (c2 || K == kjnVar2) {
                K = new mv(n2, i8);
                r8.k0(K);
            }
            ea2 v = u2x.v(a2, (Function1) K, r8);
            Object K2 = r8.K();
            if (K2 == kjnVar2) {
                K2 = szf.U(new nr(X, 11));
                r8.k0(K2);
            }
            sdr sdrVar = (sdr) K2;
            Boolean bool = (Boolean) sdrVar.getValue();
            bool.getClass();
            boolean z2 = (i9 & 57344) == 16384;
            Object K3 = r8.K();
            Continuation continuation5 = null;
            if (z2 || K3 == kjnVar2) {
                K3 = new qi(function1, sdrVar, continuation5, 16);
                r8.k0(K3);
            }
            gld.w(r8, bool, (Function2) K3);
            kfh d2 = ug3.d(iz2Var, false);
            int i10 = r8.P;
            a l2 = r8.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(r8, vciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            r8.d0();
            if (r8.O) {
                r8.k(grbVar);
            } else {
                r8.n0();
            }
            g0g.U(r8, d2, wp5.f);
            g0g.U(r8, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (r8.O || !Intrinsics.d(r8.K(), Integer.valueOf(i10))) {
                ouj.x(i10, r8, i10, kb5Var);
            }
            g0g.U(r8, H, wp5.d);
            pjc pjcVar = (pjc) va3Var.a.o;
            int i11 = i9 & 14;
            boolean z3 = i11 == 4;
            Object K4 = r8.K();
            if (z3 || K4 == kjnVar2) {
                f2 = f3;
                ea2Var = v;
                vciVar = vciVar2;
                fvfVar = a2;
                kjnVar = kjnVar2;
                tvdVar = X;
                i3 = i11;
                i4 = 0;
                continuation = null;
                t93 t93Var = new t93(0, va3Var, va3.class, "onConfirmRemoveDownloadedTracksClicked", "onConfirmRemoveDownloadedTracksClicked()V", 0, 10);
                r8.k0(t93Var);
                K4 = t93Var;
            } else {
                i3 = i11;
                tvdVar = X;
                kjnVar = kjnVar2;
                f2 = f3;
                ea2Var = v;
                vciVar = vciVar2;
                fvfVar = a2;
                i4 = 0;
                continuation = null;
            }
            y5g.j(pjcVar, (Function0) ((h9f) K4), r8, i4);
            Object[] objArr = new Object[i4];
            Object K5 = r8.K();
            if (K5 == kjnVar) {
                K5 = new uu1(28);
                r8.k0(K5);
            }
            aqi aqiVar2 = (aqi) o2g.g0(objArr, null, (Function0) K5, r8, 0, 6);
            gb3 gb3Var2 = (gb3) wlVar.invoke(r8, Integer.valueOf((i9 >> 9) & 14));
            List a3 = gb3Var2.a(((jcj) aqiVar2.getValue()).a);
            List list2 = a3;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((q93) it.next()) instanceof p93) {
                        r1 = 1;
                        break;
                    }
                }
            }
            r1 = i4;
            if (r1 != 0) {
                jcj jcjVar = (jcj) aqiVar2.getValue();
                jcjVar.getClass();
                int ordinal = jcjVar.a.ordinal();
                if (ordinal == 0) {
                    str = "details";
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    str = "chapters";
                }
                continuation2 = vq1.s(jcjVar, str);
            } else {
                continuation2 = continuation;
            }
            Unit unit2 = Unit.a;
            int i12 = i3;
            int i13 = (r8.g(r1) ? 1 : 0) | (r8.h(continuation2) ? 1 : 0) | (i12 != 4 ? i4 : 1);
            Object K6 = r8.K();
            if (i13 != 0 || K6 == kjnVar) {
                unit = unit2;
                i5 = i12;
                cg1 cg1Var = new cg1((boolean) r1, continuation2, va3Var, continuation, 2);
                r8.k0(cg1Var);
                K6 = cg1Var;
            } else {
                unit = unit2;
                i5 = i12;
            }
            gld.w(r8, unit, (Function2) K6);
            jx7 jx7Var = (jx7) r8.j(es5.h);
            fvf fvfVar4 = fvfVar;
            ea2 ea2Var3 = ea2Var;
            boolean h2 = r8.h(gb3Var2) | r8.f(fvfVar4) | r8.f(ea2Var3) | (i5 == 4) | r8.f(aqiVar2) | r8.f(jx7Var) | r8.c(f2) | r8.f(n2);
            Object K7 = r8.K();
            if (h2 || K7 == kjnVar) {
                gb3Var = gb3Var2;
                list = a3;
                eoeVar = n2;
                continuation3 = continuation2;
                continuation4 = continuation;
                ga3 ga3Var = new ga3(gb3Var, fvfVar4, va3Var, ea2Var3, jx7Var, aqiVar2, eoeVar, (Continuation) null);
                ea2Var2 = ea2Var3;
                aqiVar = aqiVar2;
                fvfVar2 = fvfVar4;
                r8.k0(ga3Var);
                K7 = ga3Var;
            } else {
                fvfVar2 = fvfVar4;
                gb3Var = gb3Var2;
                aqiVar = aqiVar2;
                list = a3;
                eoeVar = n2;
                continuation3 = continuation2;
                ea2Var2 = ea2Var3;
                continuation4 = continuation;
            }
            gld.w(r8, unit, (Function2) K7);
            Object[] objArr2 = new Object[0];
            Object K8 = r8.K();
            if (K8 == kjnVar) {
                K8 = new uu1(29);
                r8.k0(K8);
            }
            gb3 gb3Var3 = gb3Var;
            poi poiVar = (poi) o2g.g0(objArr2, null, (Function0) K8, r8, 0, 6);
            boolean f4 = r8.f(poiVar);
            Object K9 = r8.K();
            if (f4 || K9 == kjnVar) {
                K9 = new qv(poiVar, continuation4, 1);
                r8.k0(K9);
            }
            gld.w(r8, unit, (Function2) K9);
            vci vciVar3 = vciVar;
            yci a4 = androidx.compose.ui.platform.a.a(d.c(vciVar3, 1.0f), "nonmusic_screen_success");
            kfh d3 = ug3.d(iz2Var, false);
            int i14 = r8.P;
            a l3 = r8.l();
            yci H2 = vnj.H(r8, a4);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            r8.d0();
            if (r8.O) {
                r8.k(grbVar2);
            } else {
                r8.n0();
            }
            g0g.U(r8, d3, wp5.f);
            g0g.U(r8, l3, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (r8.O || !Intrinsics.d(r8.K(), Integer.valueOf(i14))) {
                ouj.x(i14, r8, i14, kb5Var2);
            }
            g0g.U(r8, H2, wp5.d);
            yci a5 = androidx.compose.ui.platform.a.a(d.c(vciVar3, 1.0f), "lazy_column");
            vm C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7), zs4.g(r8)), ogp.A(r8));
            tvd tvdVar3 = tvdVar;
            ?? r5 = continuation3;
            boolean f5 = r8.f(tvdVar3) | ((i9 & 112) == 32) | (i5 == 4) | r8.h(list) | r8.h(r5) | r8.h(gb3Var3) | r8.f(aqiVar) | r8.h(thjVar) | r8.f(poiVar) | r8.f(fvfVar2) | r8.f(eoeVar);
            Object K10 = r8.K();
            if (f5 || K10 == kjnVar) {
                i6 = 4;
                fvf fvfVar5 = fvfVar2;
                i7 = i5;
                z = false;
                oq5Var2 = r8;
                aa3 aa3Var = new aa3(list, fvfVar5, eoeVar, tvdVar3, c93Var, va3Var, (u0s) r5, gb3Var3, aqiVar, thjVar, poiVar);
                fvfVar3 = fvfVar5;
                tvdVar2 = tvdVar3;
                c93Var2 = c93Var;
                oq5Var2.k0(aa3Var);
                K10 = aa3Var;
            } else {
                c93Var2 = c93Var;
                oq5Var2 = r8;
                i6 = 4;
                tvdVar2 = tvdVar3;
                fvfVar3 = fvfVar2;
                i7 = i5;
                z = false;
            }
            int i15 = i6;
            oq5 oq5Var3 = oq5Var2;
            int i16 = i7;
            weo.f(a5, fvfVar3, C, null, null, ea2Var2, false, null, (Function1) K10, oq5Var3, 6, 440);
            oq5Var = oq5Var3;
            oq5Var.p(true);
            String str2 = c93Var2.a.a;
            boolean z4 = i16 != i15 ? z : true;
            Object K11 = oq5Var.K();
            if (z4 || K11 == kjnVar) {
                K11 = new t93(0, va3Var, va3.class, "onBackClick", "onBackClick()V", 0, 11);
                oq5Var.k0(K11);
            }
            Function0 function0 = (Function0) ((h9f) K11);
            boolean z5 = i16 != i15 ? z : true;
            Object K12 = oq5Var.K();
            if (z5 || K12 == kjnVar) {
                K12 = new t93(0, va3Var, va3.class, "onSearchClick", "onSearchClick()V", 0, 12);
                oq5Var.k0(K12);
            }
            Function0 function02 = (Function0) ((h9f) K12);
            boolean z6 = i16 != i15 ? z : true;
            Object K13 = oq5Var.K();
            if (z6 || K13 == kjnVar) {
                K13 = new t93(0, va3Var, va3.class, "onOverflowClick", "onOverflowClick()V", 0, 13);
                oq5Var.k0(K13);
            }
            edo.c(tvdVar2, str2, null, function0, function02, (Function0) ((h9f) K13), edo.b, oq5Var, 0, 4);
            oq5Var.p(true);
        } else {
            oq5Var = r8;
            c93Var2 = c93Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(i2, 7, va3Var, c93Var2, thjVar, (Object) wlVar, function1);
        }
    }

    public static final ud0 d(yg0 yg0Var) {
        Canvas canvas = vd0.a;
        ud0 ud0Var = new ud0();
        ud0Var.a = new Canvas(fx1.b(yg0Var));
        return ud0Var;
    }

    public static final void e(eg4 eg4Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(35703822);
        int i3 = (oq5Var.f(eg4Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            iht ihtVar = (iht) gld.M(eg4Var.i, oq5Var).getValue();
            if (ihtVar instanceof igt) {
                oq5Var.Z(-48358533);
                igt igtVar = (igt) ihtVar;
                int i4 = igtVar.a;
                boolean z = igtVar.b;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new h14(20);
                    oq5Var.k0(K);
                }
                f(i4, 0, oq5Var, nfp.a(yciVar, (Function1) K), z);
                oq5Var.p(false);
            } else {
                if (!(ihtVar instanceof vgt)) {
                    throw vz1.i(oq5Var, -48361392, false);
                }
                oq5Var.Z(-48351013);
                g(((vgt) ihtVar).a, eg4Var, yciVar, oq5Var, (i3 << 3) & 1008);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(eg4Var, yciVar, i2, 19);
        }
    }

    public static final void f(int i2, int i3, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-744802801);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(1740525171);
            int i6 = 0;
            while (i6 < i2) {
                i6++;
                n7w.i(i6, i4 & 112, oq5Var, null, z);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(i2, z, yciVar, i3);
        }
    }

    public static final void g(ArrayList arrayList, eg4 eg4Var, yci yciVar, hq5 hq5Var, int i2) {
        ArrayList arrayList2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1504412879);
        if ((i2 & 6) == 0) {
            arrayList2 = arrayList;
            i3 = (oq5Var.f(arrayList2) ? 4 : 2) | i2;
        } else {
            arrayList2 = arrayList;
            i3 = i2;
        }
        int i4 = 32;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(eg4Var) : oq5Var.h(eg4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        boolean z = false;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-453488150);
            int i6 = 0;
            for (Object obj : arrayList2) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u75.n();
                    throw null;
                }
                hg4 hg4Var = (hg4) obj;
                zf4 zf4Var = hg4Var.b;
                mqs mqsVar = hg4Var.a;
                int i8 = i3 & 112;
                boolean d2 = ((i8 == i4 || ((i3 & 64) != 0 && oq5Var.f(eg4Var))) ? true : z) | oq5Var.d(i6);
                Object K = oq5Var.K();
                Object obj2 = gq5.a;
                if (d2 || K == obj2) {
                    K = new dg4(eg4Var, i6, 0);
                    oq5Var.k0(K);
                }
                bg5 H2 = up6.H(mqsVar, (ag5) K, oq5Var, 6, 4);
                yci b2 = b.b(androidx.compose.ui.platform.a.a(vci.a, "chart_track"), i6);
                boolean f2 = (i8 == 32 || ((i3 & 64) != 0 && oq5Var.h(eg4Var))) | oq5Var.f(hg4Var) | oq5Var.d(i6);
                Object K2 = oq5Var.K();
                if (f2 || K2 == obj2) {
                    K2 = new z2(eg4Var, hg4Var, i6, 13);
                    oq5Var.k0(K2);
                }
                n7w.d(zf4Var, H2, com.yandex.music.core.ui.compose.a.b(b2, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 0);
                i4 = 32;
                z = false;
                i6 = i7;
            }
            oq5Var.p(z);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(arrayList, eg4Var, yciVar, i2, 22);
        }
    }

    public static final void h(d31 d31Var, hq5 hq5Var, int i2) {
        d31Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1340726828);
        if ((((oq5Var.h(d31Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            float f2 = 0;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(vci.a, 1.0f), f2, 14, f2, 6);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            tt0.g((g31) gld.O(d31Var.d, oq5Var).getValue(), null, weo.S(0, 0, nya.d, 3), "concert_informer_state", ild.C(770199481, new tt5(1, d31Var), oq5Var), oq5Var, 27648, 2);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(d31Var, i2, 11);
        }
    }

    public static final void i(o3k o3kVar, mm6 mm6Var, fvf fvfVar, fvf fvfVar2, List list, eha ehaVar, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar3;
        fvf fvfVar4;
        o3kVar.getClass();
        fvfVar.getClass();
        fvfVar2.getClass();
        list.getClass();
        ehaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1015443203);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(o3kVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(mm6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fvfVar3 = fvfVar;
            i3 |= oq5Var.f(fvfVar3) ? 256 : 128;
        } else {
            fvfVar3 = fvfVar;
        }
        if ((i2 & 3072) == 0) {
            fvfVar4 = fvfVar2;
            i3 |= oq5Var.f(fvfVar4) ? 2048 : 1024;
        } else {
            fvfVar4 = fvfVar2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(list) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(ehaVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.d(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 12, 1), 1.0f), "playlist_list_tabs");
            lx0 lx0Var = qx0.e;
            boolean z = (i3 & 57344) == 16384;
            int i4 = i3 & 14;
            boolean h2 = z | (i4 == 4) | oq5Var.h(mm6Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new g3(25, list, o3kVar, mm6Var);
                oq5Var.k0(K);
            }
            weo.i(a2, null, null, false, lx0Var, null, null, false, null, (Function1) K, oq5Var, 24582, 494);
            oq5Var = oq5Var;
            rvf.a(o3kVar, y2x.q(androidx.compose.ui.platform.a.a(vciVar, "playlist_pager_content")), null, null, 1, 0.0f, null, null, false, null, null, null, null, ild.C(-1751748860, new k71((Object) list, fvfVar3, fvfVar4, (Object) ehaVar, (Object) o3kVar, 3), oq5Var), oq5Var, i4 | 24576, 24576, 16364);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(o3kVar, mm6Var, fvfVar, fvfVar2, list, ehaVar, i2, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0352, code lost:
    
        if (r10.f(r8) == false) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x040e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(yci yciVar, o3k o3kVar, o0k o0kVar, bxj bxjVar, s1r s1rVar, boolean z, qg0 qg0Var, int i2, float f2, d2k d2kVar, wxi wxiVar, Function1 function1, gz2 gz2Var, hz2 hz2Var, z1r z1rVar, wn5 wn5Var, hq5 hq5Var, int i3, int i4) {
        int i5;
        int i6;
        hz2 hz2Var2;
        yci yciVar2;
        wxi wxiVar2;
        o3k o3kVar2;
        int i7;
        oq5 oq5Var;
        z1r z1rVar2;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        boolean z4;
        boolean f3;
        Object K;
        int i10;
        int i11;
        mm6 mm6Var;
        Object obj;
        o3k o3kVar3;
        p9f p9fVar;
        boolean z5;
        boolean g2;
        Object K2;
        boolean z6;
        Object K3;
        boolean f4;
        Object K4;
        boolean z7;
        yci yciVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1125194810);
        if ((i3 & 6) == 0) {
            i5 = i3 | (oq5Var2.f(yciVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.f(o3kVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var2.f(o0kVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var2.g(false) ? 2048 : 1024;
        }
        int i12 = i3 & 24576;
        int i13 = RemoteCameraConfig.Notification.ID;
        if (i12 == 0) {
            i5 |= oq5Var2.f(bxjVar) ? 16384 : 8192;
        }
        int i14 = i3 & 196608;
        int i15 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i14 == 0) {
            i5 |= oq5Var2.f(s1rVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : 65536;
        }
        if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var2.g(z) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= oq5Var2.f(qg0Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= oq5Var2.d(i2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= oq5Var2.c(f2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (oq5Var2.f(d2kVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= oq5Var2.h(wxiVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= oq5Var2.h(function1) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= oq5Var2.f(gz2Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            hz2Var2 = hz2Var;
            if (oq5Var2.f(hz2Var2)) {
                i13 = 16384;
            }
            i6 |= i13;
        } else {
            hz2Var2 = hz2Var;
        }
        if ((i4 & 196608) == 0) {
            if (oq5Var2.f(z1rVar)) {
                i15 = SQLiteDatabase.OPEN_SHAREDCACHE;
            }
            i6 |= i15;
        }
        if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i6 |= oq5Var2.h(wn5Var) ? 1048576 : 524288;
        }
        int i16 = i6;
        if (oq5Var2.P(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i16) == 599186) ? false : true)) {
            if (i2 < 0) {
                vme.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i2);
            }
            int i17 = i5 & 112;
            boolean z8 = i17 == 32;
            Object K5 = oq5Var2.K();
            boolean z9 = z8;
            Object obj2 = gq5.a;
            if (z9 || K5 == obj2) {
                K5 = new ztf(o3kVar, 1);
                oq5Var2.k0(K5);
            }
            Function0 function0 = (Function0) K5;
            int i18 = i5 >> 3;
            int i19 = i18 & 14;
            int i20 = i16 >> 15;
            int i21 = i19 | (i20 & 112) | (i16 & 896);
            aqi o0 = szf.o0(wn5Var, oq5Var2);
            aqi o02 = szf.o0(function1, oq5Var2);
            boolean f5 = ((((i21 & 14) ^ 6) > 4 && oq5Var2.f(o3kVar)) || (i21 & 6) == 4) | oq5Var2.f(o0) | oq5Var2.f(o02) | oq5Var2.f(function0);
            Object K6 = oq5Var2.K();
            if (f5 || K6 == obj2) {
                rwd rwdVar = rwd.h;
                K6 = new jk6(0, 3, sdr.class, szf.T(rwdVar, new ssb(10, szf.T(rwdVar, new t03(15, o0, o02, function0)), o3kVar)), Constants.KEY_VALUE, "getValue()Ljava/lang/Object;");
                oq5Var2.k0(K6);
            }
            p9f p9fVar2 = (p9f) K6;
            Object K7 = oq5Var2.K();
            if (K7 == obj2) {
                K7 = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K7);
            }
            mm6 mm6Var2 = (mm6) K7;
            boolean z10 = i17 == 32;
            Object K8 = oq5Var2.K();
            if (z10 || K8 == obj2) {
                K8 = new ztf(o3kVar, 0);
                oq5Var2.k0(K8);
            }
            Function0 function02 = (Function0) K8;
            int i22 = i5 >> 9;
            int i23 = (i5 & 65520) | (i22 & 458752) | (i22 & 3670016) | ((i16 << 21) & 29360128);
            int i24 = i16 << 15;
            int i25 = i23 | (i24 & 234881024) | (i24 & 1879048192);
            boolean z11 = ((((i25 & 896) ^ 384) > 256 && oq5Var2.f(o0kVar)) || (i25 & 384) == 256) | ((((i25 & 112) ^ 48) > 32 && oq5Var2.f(o3kVar)) || (i25 & 48) == 32) | ((((i25 & 7168) ^ 3072) > 2048 && oq5Var2.g(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) > 16384 && oq5Var2.f(bxjVar)) || (i25 & 24576) == 16384) | ((((i25 & 234881024) ^ 100663296) > 67108864 && oq5Var2.f(gz2Var)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) > 536870912 && oq5Var2.f(hz2Var2)) || (i25 & 805306368) == 536870912) | ((((i25 & 3670016) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) > 1048576 && oq5Var2.c(f2)) || (i25 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576) | ((((i25 & 29360128) ^ 12582912) > 8388608 && oq5Var2.f(d2kVar)) || (i25 & 12582912) == 8388608);
            if (((i20 & 14) ^ 6) > 4) {
                z1rVar2 = z1rVar;
                i8 = i25;
            } else {
                z1rVar2 = z1rVar;
                i8 = i25;
            }
            if ((i20 & 6) != 4) {
                z2 = false;
                boolean f6 = z2 | z11 | oq5Var2.f(function02);
                if (((i8 & 458752) ^ 196608) <= 131072) {
                    i9 = i2;
                    if (oq5Var2.d(i9)) {
                        z3 = f6;
                        z4 = true;
                        f3 = z3 | z4 | oq5Var2.f(mm6Var2);
                        K = oq5Var2.K();
                        if (!f3 || K == obj2) {
                            oq5Var = oq5Var2;
                            hz2 hz2Var3 = hz2Var2;
                            i10 = i17;
                            i11 = 4;
                            mm6Var = mm6Var2;
                            obj = obj2;
                            i7 = i2;
                            x2k x2kVar = new x2k(o3kVar, bxjVar, o0kVar, f2, d2kVar, p9fVar2, function02, hz2Var3, gz2Var, i7, z1rVar2, mm6Var);
                            o3kVar3 = o3kVar;
                            p9fVar = p9fVar2;
                            oq5Var.k0(x2kVar);
                            K = x2kVar;
                        } else {
                            mm6Var = mm6Var2;
                            o3kVar3 = o3kVar;
                            oq5Var = oq5Var2;
                            obj = obj2;
                            i10 = i17;
                            p9fVar = p9fVar2;
                            i11 = 4;
                            i7 = i9;
                        }
                        Function2 function2 = (Function2) K;
                        bxj bxjVar2 = bxj.a;
                        z5 = bxjVar != bxjVar2;
                        g2 = (((i19 ^ 6) <= i11 && oq5Var.f(o3kVar3)) || (i18 & 6) == i11) | oq5Var.g(z5);
                        K2 = oq5Var.K();
                        if (!g2 || K2 == obj) {
                            K2 = new muf(o3kVar3, z5, 0);
                            oq5Var.k0(K2);
                        }
                        luf lufVar = (luf) K2;
                        int i26 = i10;
                        z6 = (i26 != 32) | ((i5 & 458752) != 131072);
                        K3 = oq5Var.K();
                        if (!z6 || K3 == obj) {
                            K3 = new u3k(s1rVar, o3kVar3);
                            oq5Var.k0(K3);
                        }
                        u3k u3kVar = (u3k) K3;
                        sh3 sh3Var = (sh3) oq5Var.j(uh3.a);
                        f4 = (i26 != 32) | oq5Var.f(sh3Var);
                        K4 = oq5Var.K();
                        if (!f4 || K4 == obj) {
                            K4 = new j2k(o3kVar3, sh3Var);
                            oq5Var.k0(K4);
                        }
                        j2k j2kVar = (j2k) K4;
                        vci vciVar = vci.a;
                        if (z) {
                            z7 = false;
                            oq5Var.Z(1935788068);
                            oq5Var.p(false);
                            yciVar3 = vciVar;
                        } else {
                            oq5Var.Z(1935359245);
                            int i27 = i19 | ((i5 >> 21) & 112);
                            boolean z12 = ((((i27 & 112) ^ 48) > 32 && oq5Var.d(i7)) || (i27 & 48) == 32) | ((((i27 & 14) ^ 6) > i11 && oq5Var.f(o3kVar3)) || (i27 & 6) == i11);
                            Object K9 = oq5Var.K();
                            if (z12 || K9 == obj) {
                                K9 = new i2k(o3kVar3, i7);
                                oq5Var.k0(K9);
                            }
                            z7 = false;
                            yciVar3 = androidx.compose.foundation.lazy.layout.a.a((i2k) K9, o3kVar3.x, false, bxjVar);
                            oq5Var.p(false);
                        }
                        yciVar2 = yciVar;
                        boolean z13 = z7;
                        yci b2 = androidx.compose.foundation.lazy.layout.a.b(yciVar2.f(o3kVar3.A).f(o3kVar3.y), p9fVar, lufVar, bxjVar, z, z13);
                        p9f p9fVar3 = p9fVar;
                        yci f7 = !z ? b2.f(nfp.b(vciVar, false, new xbi(bxjVar != bxjVar2, o3kVar3, mm6Var, 1))) : b2.f(vciVar);
                        o3k o3kVar4 = o3kVar3;
                        o3kVar2 = o3kVar4;
                        wxiVar2 = wxiVar;
                        n7w.t(p9fVar3, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.n(f7.f(yciVar3), o3kVar4, bxjVar, z, z13, u3kVar, o3kVar4.r, false, qg0Var, j2kVar).f(eur.a(vciVar, o3kVar2, new r5(3, o3kVar2))), wxiVar2, null), o3kVar2.w, function2, oq5Var, 0, 0);
                    }
                } else {
                    i9 = i2;
                }
                z3 = f6;
                if ((i8 & 196608) != 131072) {
                    z4 = false;
                    f3 = z3 | z4 | oq5Var2.f(mm6Var2);
                    K = oq5Var2.K();
                    if (f3) {
                    }
                    oq5Var = oq5Var2;
                    hz2 hz2Var32 = hz2Var2;
                    i10 = i17;
                    i11 = 4;
                    mm6Var = mm6Var2;
                    obj = obj2;
                    i7 = i2;
                    x2k x2kVar2 = new x2k(o3kVar, bxjVar, o0kVar, f2, d2kVar, p9fVar2, function02, hz2Var32, gz2Var, i7, z1rVar2, mm6Var);
                    o3kVar3 = o3kVar;
                    p9fVar = p9fVar2;
                    oq5Var.k0(x2kVar2);
                    K = x2kVar2;
                    Function2 function22 = (Function2) K;
                    bxj bxjVar22 = bxj.a;
                    if (bxjVar != bxjVar22) {
                    }
                    g2 = (((i19 ^ 6) <= i11 && oq5Var.f(o3kVar3)) || (i18 & 6) == i11) | oq5Var.g(z5);
                    K2 = oq5Var.K();
                    if (!g2) {
                    }
                    K2 = new muf(o3kVar3, z5, 0);
                    oq5Var.k0(K2);
                    luf lufVar2 = (luf) K2;
                    int i262 = i10;
                    z6 = (i262 != 32) | ((i5 & 458752) != 131072);
                    K3 = oq5Var.K();
                    if (!z6) {
                    }
                    K3 = new u3k(s1rVar, o3kVar3);
                    oq5Var.k0(K3);
                    u3k u3kVar2 = (u3k) K3;
                    sh3 sh3Var2 = (sh3) oq5Var.j(uh3.a);
                    f4 = (i262 != 32) | oq5Var.f(sh3Var2);
                    K4 = oq5Var.K();
                    if (!f4) {
                    }
                    K4 = new j2k(o3kVar3, sh3Var2);
                    oq5Var.k0(K4);
                    j2k j2kVar2 = (j2k) K4;
                    vci vciVar2 = vci.a;
                    if (z) {
                    }
                    yciVar2 = yciVar;
                    boolean z132 = z7;
                    yci b22 = androidx.compose.foundation.lazy.layout.a.b(yciVar2.f(o3kVar3.A).f(o3kVar3.y), p9fVar, lufVar2, bxjVar, z, z132);
                    p9f p9fVar32 = p9fVar;
                    if (!z) {
                    }
                    o3k o3kVar42 = o3kVar3;
                    o3kVar2 = o3kVar42;
                    wxiVar2 = wxiVar;
                    n7w.t(p9fVar32, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.n(f7.f(yciVar3), o3kVar42, bxjVar, z, z132, u3kVar2, o3kVar42.r, false, qg0Var, j2kVar2).f(eur.a(vciVar2, o3kVar2, new r5(3, o3kVar2))), wxiVar2, null), o3kVar2.w, function22, oq5Var, 0, 0);
                }
                z4 = true;
                f3 = z3 | z4 | oq5Var2.f(mm6Var2);
                K = oq5Var2.K();
                if (f3) {
                }
                oq5Var = oq5Var2;
                hz2 hz2Var322 = hz2Var2;
                i10 = i17;
                i11 = 4;
                mm6Var = mm6Var2;
                obj = obj2;
                i7 = i2;
                x2k x2kVar22 = new x2k(o3kVar, bxjVar, o0kVar, f2, d2kVar, p9fVar2, function02, hz2Var322, gz2Var, i7, z1rVar2, mm6Var);
                o3kVar3 = o3kVar;
                p9fVar = p9fVar2;
                oq5Var.k0(x2kVar22);
                K = x2kVar22;
                Function2 function222 = (Function2) K;
                bxj bxjVar222 = bxj.a;
                if (bxjVar != bxjVar222) {
                }
                g2 = (((i19 ^ 6) <= i11 && oq5Var.f(o3kVar3)) || (i18 & 6) == i11) | oq5Var.g(z5);
                K2 = oq5Var.K();
                if (!g2) {
                }
                K2 = new muf(o3kVar3, z5, 0);
                oq5Var.k0(K2);
                luf lufVar22 = (luf) K2;
                int i2622 = i10;
                z6 = (i2622 != 32) | ((i5 & 458752) != 131072);
                K3 = oq5Var.K();
                if (!z6) {
                }
                K3 = new u3k(s1rVar, o3kVar3);
                oq5Var.k0(K3);
                u3k u3kVar22 = (u3k) K3;
                sh3 sh3Var22 = (sh3) oq5Var.j(uh3.a);
                f4 = (i2622 != 32) | oq5Var.f(sh3Var22);
                K4 = oq5Var.K();
                if (!f4) {
                }
                K4 = new j2k(o3kVar3, sh3Var22);
                oq5Var.k0(K4);
                j2k j2kVar22 = (j2k) K4;
                vci vciVar22 = vci.a;
                if (z) {
                }
                yciVar2 = yciVar;
                boolean z1322 = z7;
                yci b222 = androidx.compose.foundation.lazy.layout.a.b(yciVar2.f(o3kVar3.A).f(o3kVar3.y), p9fVar, lufVar22, bxjVar, z, z1322);
                p9f p9fVar322 = p9fVar;
                if (!z) {
                }
                o3k o3kVar422 = o3kVar3;
                o3kVar2 = o3kVar422;
                wxiVar2 = wxiVar;
                n7w.t(p9fVar322, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.n(f7.f(yciVar3), o3kVar422, bxjVar, z, z1322, u3kVar22, o3kVar422.r, false, qg0Var, j2kVar22).f(eur.a(vciVar22, o3kVar2, new r5(3, o3kVar2))), wxiVar2, null), o3kVar2.w, function222, oq5Var, 0, 0);
            }
            z2 = true;
            boolean f62 = z2 | z11 | oq5Var2.f(function02);
            if (((i8 & 458752) ^ 196608) <= 131072) {
            }
            z3 = f62;
            if ((i8 & 196608) != 131072) {
            }
            z4 = true;
            f3 = z3 | z4 | oq5Var2.f(mm6Var2);
            K = oq5Var2.K();
            if (f3) {
            }
            oq5Var = oq5Var2;
            hz2 hz2Var3222 = hz2Var2;
            i10 = i17;
            i11 = 4;
            mm6Var = mm6Var2;
            obj = obj2;
            i7 = i2;
            x2k x2kVar222 = new x2k(o3kVar, bxjVar, o0kVar, f2, d2kVar, p9fVar2, function02, hz2Var3222, gz2Var, i7, z1rVar2, mm6Var);
            o3kVar3 = o3kVar;
            p9fVar = p9fVar2;
            oq5Var.k0(x2kVar222);
            K = x2kVar222;
            Function2 function2222 = (Function2) K;
            bxj bxjVar2222 = bxj.a;
            if (bxjVar != bxjVar2222) {
            }
            g2 = (((i19 ^ 6) <= i11 && oq5Var.f(o3kVar3)) || (i18 & 6) == i11) | oq5Var.g(z5);
            K2 = oq5Var.K();
            if (!g2) {
            }
            K2 = new muf(o3kVar3, z5, 0);
            oq5Var.k0(K2);
            luf lufVar222 = (luf) K2;
            int i26222 = i10;
            z6 = (i26222 != 32) | ((i5 & 458752) != 131072);
            K3 = oq5Var.K();
            if (!z6) {
            }
            K3 = new u3k(s1rVar, o3kVar3);
            oq5Var.k0(K3);
            u3k u3kVar222 = (u3k) K3;
            sh3 sh3Var222 = (sh3) oq5Var.j(uh3.a);
            f4 = (i26222 != 32) | oq5Var.f(sh3Var222);
            K4 = oq5Var.K();
            if (!f4) {
            }
            K4 = new j2k(o3kVar3, sh3Var222);
            oq5Var.k0(K4);
            j2k j2kVar222 = (j2k) K4;
            vci vciVar222 = vci.a;
            if (z) {
            }
            yciVar2 = yciVar;
            boolean z13222 = z7;
            yci b2222 = androidx.compose.foundation.lazy.layout.a.b(yciVar2.f(o3kVar3.A).f(o3kVar3.y), p9fVar, lufVar222, bxjVar, z, z13222);
            p9f p9fVar3222 = p9fVar;
            if (!z) {
            }
            o3k o3kVar4222 = o3kVar3;
            o3kVar2 = o3kVar4222;
            wxiVar2 = wxiVar;
            n7w.t(p9fVar3222, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.n(f7.f(yciVar3), o3kVar4222, bxjVar, z, z13222, u3kVar222, o3kVar4222.r, false, qg0Var, j2kVar222).f(eur.a(vciVar222, o3kVar2, new r5(3, o3kVar2))), wxiVar2, null), o3kVar2.w, function2222, oq5Var, 0, 0);
        } else {
            yciVar2 = yciVar;
            wxiVar2 = wxiVar;
            o3kVar2 = o3kVar;
            i7 = i2;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ytf(yciVar2, o3kVar2, o0kVar, bxjVar, s1rVar, z, qg0Var, i7, f2, d2kVar, wxiVar2, function1, gz2Var, hz2Var, z1rVar, wn5Var, i3, i4);
        }
    }

    public static pn0 k(c cVar, xme[] xmeVarArr) {
        cVar.getClass();
        xme[] xmeVarArr2 = (xme[]) Arrays.copyOf(xmeVarArr, xmeVarArr.length);
        float d2 = cVar.d();
        float c2 = cVar.c();
        kn0 kn0Var = new kn0();
        for (xme xmeVar : xz0.w(xmeVarArr2)) {
            kn0Var.d(StringUtil.SPACE);
            if (xmeVar != null) {
                u2x.s(kn0Var, xmeVar.a);
            }
        }
        return new pn0(d2, c2, new nim(kn0Var.h(), "…"), 0);
    }

    public static final LinkedHashMap l(xme... xmeVarArr) {
        ArrayList arrayList = new ArrayList();
        int length = xmeVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            xme xmeVar = xmeVarArr[i2];
            Pair pair = xmeVar != null ? new Pair(xmeVar.a, new yme(new psk(1, xmeVar.b, xmeVar.c), new wn5(new tt5(17, xmeVar), -715928714, true))) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        int a2 = tah.a(v75.o(arrayList, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            linkedHashMap.put(pair2.a, pair2.b);
        }
        return linkedHashMap;
    }

    public static final void m(lm4 lm4Var, Object obj) {
        if (lm4Var.i(obj)) {
            obj.getClass();
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + lm4Var.f());
    }

    public static final void n(WorkDatabase workDatabase, r46 r46Var, s3w s3wVar) {
        int i2;
        workDatabase.getClass();
        r46Var.getClass();
        ArrayList j2 = u75.j(s3wVar);
        int i3 = 0;
        while (!j2.isEmpty()) {
            List list = ((s3w) z75.A(j2)).d;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list2.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((p4w) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        u75.m();
                        throw null;
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        int intValue = ((Number) up6.F(workDatabase.A().a, true, false, new jwv(24))).intValue();
        int i4 = r46Var.j;
        if (intValue + i3 <= i4) {
            return;
        }
        xq0.x(f1d.i(dfi.l("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i4, intValue, ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static Intent o(Context context, g1d g1dVar) {
        context.getClass();
        Intent putExtra = new Intent(context, (Class<?>) GalleryWidgetActivity.class).putExtra("galleryWidgetArgs", g1dVar);
        putExtra.getClass();
        return putExtra;
    }

    public static oje p(int i2, float f2, float f3, float f4, float f5, Float f6, Integer num) {
        return new oje(i2, new mje(f2 * f5, f3 * f5, f4 * f5), f6 != null ? f6.floatValue() : 0.0f, num != null ? num.intValue() : 0);
    }

    public static final hh6 q(hq5 hq5Var) {
        float f2 = vt0.e;
        Configuration configuration = (Configuration) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.a);
        return new hh6(((float) configuration.screenWidthDp) / configuration.fontScale < f2, f2);
    }

    public static final void r(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final byd s(uvn uvnVar) {
        uvnVar.getClass();
        return new byd(uvnVar, new kme(new lnq()));
    }

    public static final void t(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final boolean u(Context context) {
        context.getClass();
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) AccessibilityManager.class);
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static int v(String str) {
        String str2;
        str.getClass();
        if (str.length() <= 0) {
            xq0.x("Expected color string, actual string is empty");
            return 0;
        }
        if (str.charAt(0) != '#') {
            xq0.o("Unknown color ".concat(str));
            return 0;
        }
        int length = str.length();
        if (length == 4) {
            char charAt = str.charAt(1);
            char charAt2 = str.charAt(2);
            char charAt3 = str.charAt(3);
            str2 = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
        } else if (length == 5) {
            char charAt4 = str.charAt(1);
            char charAt5 = str.charAt(2);
            char charAt6 = str.charAt(3);
            char charAt7 = str.charAt(4);
            str2 = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
        } else if (length == 7) {
            str2 = "ff".concat(str.substring(1));
        } else {
            if (length != 9) {
                xq0.x("Unknown color ".concat(str));
                return 0;
            }
            str2 = str.substring(1);
        }
        return (int) Long.parseLong(str2, CharsKt.checkRadix(16));
    }

    public static final j6e w(String str, String str2, int i2, Function1 function1) {
        char charAt = str.charAt(i2);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return x(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final j6e x(String str, String str2) {
        StringBuilder m2 = tlm.m(str2, " when parsing an Instant from \"");
        m2.append(F(64, str));
        m2.append('\"');
        return new j6e(m2.toString(), str);
    }

    public static final int y(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final void z(String str, String str2) {
        str2.getClass();
        kp6 kp6Var = bec.a().a;
        ((vq6) kp6Var.o.a).d(new cy1(8, kp6Var, str, str2));
    }
}
