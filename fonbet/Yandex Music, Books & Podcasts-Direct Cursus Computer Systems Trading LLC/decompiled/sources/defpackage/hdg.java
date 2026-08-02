package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.c;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.MviEventsReporter;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;

/* loaded from: classes4.dex */
public abstract class hdg {
    public static qxp a = null;
    public static MviEventsReporter b = null;
    public static boolean c = true;

    public hdg() {
        new ConcurrentHashMap();
    }

    public static final void A(float f, final int i, long j, hq5 hq5Var) {
        final float f2 = f;
        final long j2 = j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1080104796);
        int i2 = (oq5Var.c(f2) ? 4 : 2) | i | (oq5Var.e(j2) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            j2 = j;
            f2 = f;
            vum.a(((Number) pk0.b(f2, qum.b, "progress indicator animation", null, oq5Var, (i2 & 14) | 3072, 20).getValue()).floatValue(), null, j2, 0.0f, d85.b(j2, 0.1f, 0.0f, 0.0f, 0.0f, 14), oq5Var, (i2 << 3) & 896, 42);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(f2, i, j2) { // from class: rvv
                public final /* synthetic */ float a;
                public final /* synthetic */ long b;

                {
                    this.b = j2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    hdg.A(this.a, R, this.b, (hq5) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final void B(Function0 function0, wvv wvvVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1841497850);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(wvvVar) : oq5Var.h(wvvVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object invoke = function0.invoke();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(24);
                oq5Var.k0(K);
            }
            ixf.p(invoke, null, "footer button state transition animation", (Function1) K, null, ild.C(-434805509, new t31(26, wvvVar), oq5Var), oq5Var, 200064, 18);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(function0, wvvVar, i);
        }
    }

    public static final void C(wvv wvvVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(594723987);
        int i2 = (oq5Var.f(wvvVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            zvv zvvVar = (zvv) gld.O(wvvVar.a, oq5Var).getValue();
            if (Intrinsics.d(zvvVar, yvv.a)) {
                aqiVar.setValue(null);
            } else {
                if (!(zvvVar instanceof xvv)) {
                    b6e.s();
                    return;
                }
                aqiVar.setValue(((xvv) zvvVar).a);
            }
            yci u = xp3.u(d.r(vci.a, 376), ugo.a);
            long j = ((dq0) oq5Var.j(eq0.a)).c.b;
            jzk jzkVar = vnj.i;
            yci b2 = a.b(a.b(u, j, jzkVar), c3x.h(2148470543L), jzkVar);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K2;
            boolean z = (i2 & 14) == 4;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new hav(7, aqiVar, wvvVar);
                oq5Var.k0(K3);
            }
            yci m = androidx.compose.foundation.layout.a.m(a.d(b2, uoiVar, null, false, null, null, (Function0) K3, 28), 12);
            nho a2 = lho.a(qx0.g(8), b2c.l, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new tiv(aqiVar, 5);
                oq5Var.k0(K4);
            }
            Function0 function0 = (Function0) K4;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            E(function0, new LayoutWeightElement(true, 1.0f), oq5Var, 6);
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = new tiv(aqiVar, 6);
                oq5Var.k0(K5);
            }
            B((Function0) K5, wvvVar, oq5Var, ((i2 << 3) & 112) | 6);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(wvvVar, i, 27);
        }
    }

    public static final void D(e0w e0wVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(255719955);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(e0wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            long j = neg.n(oq5Var).b.a;
            d85 d85Var = (d85) CollectionsKt.S(CollectionsKt.g0(t75.c(new d85(j)), u75.h(new d85(c3x.h(4289133449L)), new d85(c3x.h(4289921014L)), new d85(c3x.h(4286273508L)))), e0wVar.b);
            if (d85Var != null) {
                j = d85Var.a;
            }
            yci u = xp3.u(d.m(vci.a, 40), ugo.a);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            A(e0wVar.c, 0, j, oq5Var);
            xcs.b(String.valueOf(e0wVar.a), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 1, 0, null, neg.t(oq5Var).b.a, oq5Var, 0, 3072, 56826);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(e0wVar, i, 25);
        }
    }

    public static final void E(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2091017792);
        int i2 = (oq5Var.f(yciVar) ? 32 : 16) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object invoke = function0.invoke();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(26);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            ixf.p(invoke, yciVar2, "footer progress state transition animation", (Function1) K, null, fgq.d, oq5Var, (i2 & 112) | 200064, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar2, i, 15);
        }
    }

    public static final void F(g0w g0wVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1408399614);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(g0wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else if (g0wVar instanceof f0w) {
            oq5Var.Z(-97240069);
            vvv.b(((f0w) g0wVar).a, oq5Var, 0);
            oq5Var.p(false);
        } else {
            if (!(g0wVar instanceof e0w)) {
                throw vz1.i(oq5Var, -557327923, false);
            }
            oq5Var.Z(-97061168);
            D((e0w) g0wVar, oq5Var, i2 & 14);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qvv(g0wVar, i, 1);
        }
    }

    public static final void G(g0w g0wVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-240001766);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(g0wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.g(8), b2c.l, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            F(g0wVar, oq5Var, i2 & 14);
            xcs.b(g0wVar.getText(), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(5), 0L, 2, false, 2, 0, null, neg.t(oq5Var).b.c, oq5Var, 0, 3120, 54778);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qvv(g0wVar, i, 0);
        }
    }

    public static final void H(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-991610619);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.g(8), b2c.l, oq5Var, 54);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ArrayList arrayList = new ArrayList(2);
            for (int i3 = 0; i3 < 2; i3++) {
                arrayList.add(Unit.a);
            }
            xee.c(arrayList, 36, 24, null, 0.0f, null, fgq.e, oq5Var, 1573296, 56);
            ta5 a3 = sa5.a(qx0.g(4), b2c.n, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var2);
            }
            g0g.U(oq5Var, H2, wp5.d);
            qs5 qs5Var = e3w.a;
            ((d3w) oq5Var.j(qs5Var)).k.invoke(neg.t(oq5Var).b.c, d.r(vciVar, 112), oq5Var, 48);
            ((d3w) oq5Var.j(qs5Var)).k.invoke(neg.t(oq5Var).b.c, d.r(vciVar, 64), oq5Var, 48);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jiv(i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(hur hurVar, kq2 kq2Var) {
        kep kepVar;
        int i;
        int size;
        int i2;
        if (kq2Var instanceof kep) {
            kepVar = (kep) kq2Var;
            int i3 = kepVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kepVar.l = i3 - Integer.MIN_VALUE;
                Object obj = kepVar.k;
                nm6 nm6Var = nm6.a;
                i = kepVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    gfm gfmVar = gfm.b;
                    kepVar.j = hurVar;
                    kepVar.l = 1;
                    obj = hurVar.a(gfmVar, kepVar);
                    if (obj == nm6Var) {
                    }
                    ffm ffmVar = (ffm) obj;
                    List list = ffmVar.a;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return ffmVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hurVar = kepVar.j;
                qgg.h0(obj);
                ffm ffmVar2 = (ffm) obj;
                List list2 = ffmVar2.a;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (swf.z((lfm) list2.get(i2))) {
                        i2++;
                    } else {
                        gfm gfmVar2 = gfm.b;
                        kepVar.j = hurVar;
                        kepVar.l = 1;
                        obj = hurVar.a(gfmVar2, kepVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        ffm ffmVar22 = (ffm) obj;
                        List list22 = ffmVar22.a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return ffmVar22;
            }
        }
        kepVar = new kep(kq2Var);
        Object obj2 = kepVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kepVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(hur hurVar, bfi bfiVar, x0 x0Var, ffm ffmVar, kq2 kq2Var) {
        lep lepVar;
        int i;
        int i2;
        lfm lfmVar;
        zdp zdpVar;
        tqn tqnVar;
        Object i3;
        int size;
        int i4;
        hur hurVar2 = hurVar;
        bfi bfiVar2 = bfiVar;
        zdp zdpVar2 = o6c.o;
        if (kq2Var instanceof lep) {
            lepVar = (lep) kq2Var;
            int i5 = lepVar.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lepVar.n = i5 - Integer.MIN_VALUE;
                Object obj = lepVar.m;
                nm6 nm6Var = nm6.a;
                i = lepVar.n;
                if (i == 0) {
                    if (i == 1) {
                        bfi bfiVar3 = lepVar.k;
                        hur hurVar3 = lepVar.j;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            List list = hurVar3.f.t.a;
                            int size2 = list.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                lfm lfmVar2 = (lfm) list.get(i6);
                                if (swf.A(lfmVar2)) {
                                    lfmVar2.a();
                                }
                            }
                        }
                        bfiVar3.i();
                        return Unit.a;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tqn tqnVar2 = lepVar.l;
                    bfiVar2 = lepVar.k;
                    hur hurVar4 = lepVar.j;
                    qgg.h0(obj);
                    tqnVar = tqnVar2;
                    hurVar2 = hurVar4;
                    i3 = obj;
                    i2 = 0;
                    if (((Boolean) i3).booleanValue() && tqnVar.a) {
                        List list2 = hurVar2.f.t.a;
                        size = list2.size();
                        for (i4 = i2; i4 < size; i4++) {
                            lfm lfmVar3 = (lfm) list2.get(i4);
                            if (swf.A(lfmVar3)) {
                                lfmVar3.a();
                            }
                        }
                    }
                    bfiVar2.i();
                    return Unit.a;
                }
                qgg.h0(obj);
                aeu aeuVar = (aeu) x0Var.c;
                lfm lfmVar4 = (lfm) x0Var.d;
                lfm lfmVar5 = (lfm) ffmVar.a.get(0);
                if (lfmVar4 != null && lfmVar5.b - lfmVar4.b < aeuVar.a()) {
                    if (enj.d(enj.g(lfmVar4.c, lfmVar5.c)) < wna.l(aeuVar, lfmVar4.i)) {
                        x0Var.b++;
                        x0Var.d = lfmVar5;
                        i2 = 0;
                        lfmVar = (lfm) ffmVar.a.get(0);
                        int i7 = x0Var.b;
                        zdpVar = i7 == 1 ? i7 != 2 ? o6c.q : o6c.p : zdpVar2;
                        if (bfiVar2.b(lfmVar.c, zdpVar)) {
                            tqnVar = new tqn();
                            tqnVar.a = !zdpVar.equals(zdpVar2);
                            long j = lfmVar.a;
                            lma lmaVar = new lma(21, bfiVar2, zdpVar, tqnVar);
                            lepVar.j = hurVar2;
                            lepVar.k = bfiVar2;
                            lepVar.l = tqnVar;
                            lepVar.n = 2;
                            i3 = wna.i(hurVar2, j, lmaVar, lepVar);
                            if (i3 == nm6Var) {
                                return nm6Var;
                            }
                            if (((Boolean) i3).booleanValue()) {
                                List list22 = hurVar2.f.t.a;
                                size = list22.size();
                                while (i4 < size) {
                                }
                            }
                            bfiVar2.i();
                        }
                        return Unit.a;
                    }
                }
                x0Var.b = 1;
                x0Var.d = lfmVar5;
                i2 = 0;
                lfmVar = (lfm) ffmVar.a.get(0);
                int i72 = x0Var.b;
                if (i72 == 1) {
                }
                if (bfiVar2.b(lfmVar.c, zdpVar)) {
                }
                return Unit.a;
            }
        }
        lepVar = new lep(kq2Var);
        Object obj2 = lepVar.m;
        nm6 nm6Var2 = nm6.a;
        i = lepVar.n;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00a0, B:15:0x00a8, B:17:0x00b7, B:19:0x00c3, B:21:0x00c6, B:24:0x00c9, B:28:0x00cd, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0085, B:45:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(hur hurVar, has hasVar, ffm ffmVar, kq2 kq2Var) {
        mep mepVar;
        int i;
        lfm lfmVar;
        lfm lfmVar2;
        try {
            if (kq2Var instanceof mep) {
                mepVar = (mep) kq2Var;
                int i2 = mepVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mepVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = mepVar.m;
                    nm6 nm6Var = nm6.a;
                    i = mepVar.n;
                    boolean z = true;
                    if (i != 0) {
                        qgg.h0(obj);
                        lfmVar = (lfm) CollectionsKt.Q(ffmVar.a);
                        long j = lfmVar.a;
                        mepVar.j = hurVar;
                        mepVar.k = hasVar;
                        mepVar.l = lfmVar;
                        mepVar.n = 1;
                        obj = wna.d(hurVar, j, mepVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hasVar = mepVar.k;
                            hurVar = mepVar.j;
                            qgg.h0(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = hurVar.f.t.a;
                                int size = list.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    lfm lfmVar3 = (lfm) list.get(i3);
                                    if (swf.A(lfmVar3)) {
                                        lfmVar3.a();
                                    }
                                }
                                hasVar.onStop();
                            } else {
                                hasVar.onCancel();
                            }
                            return Unit.a;
                        }
                        lfm lfmVar4 = mepVar.l;
                        hasVar = mepVar.k;
                        hur hurVar2 = mepVar.j;
                        qgg.h0(obj);
                        lfmVar = lfmVar4;
                        hurVar = hurVar2;
                    }
                    lfmVar2 = (lfm) obj;
                    if (lfmVar2 != null) {
                        long j2 = lfmVar2.c;
                        if (enj.d(enj.g(lfmVar.c, j2)) >= wna.l(hurVar.c(), lfmVar.i)) {
                            z = false;
                        }
                        if (z) {
                            hasVar.b(j2);
                            long j3 = lfmVar2.a;
                            fvg fvgVar = new fvg(hasVar, 1);
                            mepVar.j = hurVar;
                            mepVar.k = hasVar;
                            mepVar.l = null;
                            mepVar.n = 2;
                            obj = wna.i(hurVar, j3, fvgVar, mepVar);
                        }
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            lfmVar2 = (lfm) obj;
            if (lfmVar2 != null) {
            }
            return Unit.a;
        } catch (CancellationException e) {
            hasVar.onCancel();
            throw e;
        }
        mepVar = new mep(kq2Var);
        Object obj2 = mepVar.m;
        nm6 nm6Var2 = nm6.a;
        i = mepVar.n;
        boolean z2 = true;
    }

    public static final r2h L(mqs mqsVar) {
        mqsVar.getClass();
        if (!wyf.O(mqsVar) && !mqsVar.C()) {
            hqs hqsVar = mqsVar.o;
            if (hqsVar != null && hqsVar.b) {
                return r2h.LRC;
            }
            if (hqsVar != null && hqsVar.a) {
                return r2h.TEXT;
            }
        }
        return null;
    }

    public static Object M(ExoPlayer exoPlayer, cg6 cg6Var) {
        zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
        zt3Var.s();
        mal.a();
        lw1 lw1Var = new lw1(exoPlayer, zt3Var);
        exoPlayer.j0(lw1Var);
        if (exoPlayer.e()) {
            exoPlayer.x0(lw1Var);
            if (zt3Var.w()) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(Unit.a);
            }
        } else {
            zt3Var.u(new kw1(2, exoPlayer, lw1Var));
        }
        Object q = zt3Var.q();
        return q == nm6.a ? q : Unit.a;
    }

    public static final boolean N(s9p s9pVar) {
        s9pVar.getClass();
        List<g9p> list = s9pVar.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (g9p g9pVar : list) {
            if (Intrinsics.d(g9pVar, r9p.a) || (g9pVar instanceof h9p)) {
                return true;
            }
            if (!(g9pVar instanceof i9p) && !(g9pVar instanceof j9p) && !(g9pVar instanceof k9p) && !(g9pVar instanceof l9p) && !(g9pVar instanceof n9p) && !(g9pVar instanceof p9p) && !(g9pVar instanceof q9p) && !(g9pVar instanceof o9p)) {
                b6e.s();
                return false;
            }
        }
        return false;
    }

    public static boolean S(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static vqc T(vqc[] vqcVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        vqc vqcVar = null;
        int i3 = Integer.MAX_VALUE;
        for (vqc vqcVar2 : vqcVarArr) {
            int abs = (Math.abs(vqcVar2.c - i2) * 2) + (vqcVar2.d == z ? 0 : 1);
            if (vqcVar == null || i3 > abs) {
                vqcVar = vqcVar2;
                i3 = abs;
            }
        }
        return vqcVar;
    }

    public static int U(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }

    public static int V(Drawable drawable) {
        Rect bounds;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return 0;
        }
        return bounds.width();
    }

    public static final o4q W(e5q e5qVar) {
        e5qVar.getClass();
        if (e5qVar instanceof u4q) {
            return ((u4q) e5qVar).d;
        }
        if (e5qVar instanceof s4q) {
            return ((s4q) e5qVar).d;
        }
        if (e5qVar instanceof w4q) {
            return ((w4q) e5qVar).d;
        }
        if (e5qVar instanceof d5q) {
            return o4q.b;
        }
        b6e.s();
        return null;
    }

    public static final float Z(hq5 hq5Var) {
        ids O = o5g.O(0, 1, hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        ges i = nu0.i();
        boolean f = oq5Var.f(i) | oq5Var.f(jx7Var);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new cma((16 * 2) + jx7Var.c0((int) (ids.a(O, "A\nA\nA", i, 2, false, 3, 0L, 1000).c & 4294967295L)));
            oq5Var.k0(K);
        }
        return ((cma) K).a;
    }

    public static final void a(String str, d85 d85Var, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1438259626);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(d85Var) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            float f = 80;
            kfh d = ug3.d(b2c.c, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci s = pcg.s(xp3.u(androidx.compose.foundation.layout.a.o(d.m(vciVar, f), 4, 0.0f, 2), o5g.F(oq5Var)));
            d85 d85Var2 = d85Var != null ? new d85(d85.b(d85Var.a, 0.5f, 0.0f, 0.0f, 0.0f, 14)) : null;
            if (d85Var2 == null) {
                oq5Var.Z(-238166161);
                j = ((dq0) oq5Var.j(eq0.a)).c.c;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-238167928);
                oq5Var.p(false);
                j = d85Var2.a;
            }
            ug3.a(androidx.compose.ui.platform.a.a(a.b(s, j, vnj.i), "cover_image_with_background"), oq5Var, 0);
            irf.y(str, qo6.m, d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), f), false, true, null, null, null, oq5Var, (i2 & 14) | 25008, 232);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new c6i(str, d85Var, yciVar2, i, 1);
        }
    }

    public static Intent a0(Context context, String str, String str2) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) PromoCodeWebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("promo_code", str2);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, Function0 function0, yci yciVar, d85 d85Var, d85 d85Var2, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function02;
        d85 d85Var3;
        int i4;
        d85 d85Var4;
        d85 d85Var5;
        d85 d85Var6;
        long j;
        int i5;
        long r;
        long j2;
        float f;
        float f2;
        oq5 oq5Var;
        d85 d85Var7;
        d85 d85Var8;
        xmn r2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-736589843);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var2.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            d85Var3 = d85Var;
            i3 |= oq5Var2.f(d85Var3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                d85Var4 = d85Var2;
                i3 |= oq5Var2.f(d85Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((i3 & 9363) == 9362 || !oq5Var2.z()) {
                    d85Var5 = i6 != 0 ? null : d85Var3;
                    d85Var6 = i4 != 0 ? null : d85Var4;
                    if (d85Var5 == null) {
                        oq5Var2.Z(806774237);
                        j = kg5.r(R.color.button_primary_day, oq5Var2);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(806773648);
                        oq5Var2.p(false);
                        j = d85Var5.a;
                    }
                    if (d85Var6 != null) {
                        r = d85Var6.a;
                    } else {
                        if (d85Var5 != null) {
                            oq5Var2.Z(806778397);
                            i5 = R.color.text_primary_night;
                        } else {
                            oq5Var2.Z(806780123);
                            i5 = R.color.text_primary_day;
                        }
                        r = kg5.r(i5, oq5Var2);
                        oq5Var2.p(false);
                    }
                    if (d85Var5 == null) {
                        oq5Var2.Z(806784541);
                        j2 = kg5.r(R.color.button_primary_day, oq5Var2);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(806783952);
                        oq5Var2.p(false);
                        j2 = d85Var5.a;
                    }
                    p85 b0 = pd.b0(j2);
                    float f3 = b0.a;
                    f = b0.b + 0.1f;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    f2 = b0.c - 0.06f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    int i7 = d85.o;
                    oq5Var = oq5Var2;
                    Function0 function03 = function02;
                    c(function03, j, r, mvt.z(f3, f, f2, 1.0f, 16), d.g(yciVar, mu0.d, 0.0f, 2), true, ild.C(946248447, new mf3(str, 6), oq5Var2), oq5Var, ((i3 >> 3) & 14) | 14155824, 0);
                    d85Var7 = d85Var5;
                    d85Var8 = d85Var6;
                } else {
                    oq5Var2.S();
                    oq5Var = oq5Var2;
                    d85Var7 = d85Var3;
                    d85Var8 = d85Var4;
                }
                r2 = oq5Var.r();
                if (r2 != null) {
                    r2.d = new cj((Object) str, function0, yciVar, (Object) d85Var7, (Object) d85Var8, i, i2, 13);
                    return;
                }
                return;
            }
            d85Var4 = d85Var2;
            if ((i3 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (d85Var5 == null) {
            }
            if (d85Var6 != null) {
            }
            if (d85Var5 == null) {
            }
            p85 b02 = pd.b0(j2);
            float f32 = b02.a;
            f = b02.b + 0.1f;
            if (f > 1.0f) {
            }
            f2 = b02.c - 0.06f;
            if (f2 < 0.0f) {
            }
            int i72 = d85.o;
            oq5Var = oq5Var2;
            Function0 function032 = function02;
            c(function032, j, r, mvt.z(f32, f, f2, 1.0f, 16), d.g(yciVar, mu0.d, 0.0f, 2), true, ild.C(946248447, new mf3(str, 6), oq5Var2), oq5Var, ((i3 >> 3) & 14) | 14155824, 0);
            d85Var7 = d85Var5;
            d85Var8 = d85Var6;
            r2 = oq5Var.r();
            if (r2 != null) {
            }
        }
        d85Var3 = d85Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        d85Var4 = d85Var2;
        if ((i3 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (d85Var5 == null) {
        }
        if (d85Var6 != null) {
        }
        if (d85Var5 == null) {
        }
        p85 b022 = pd.b0(j2);
        float f322 = b022.a;
        f = b022.b + 0.1f;
        if (f > 1.0f) {
        }
        f2 = b022.c - 0.06f;
        if (f2 < 0.0f) {
        }
        int i722 = d85.o;
        oq5Var = oq5Var2;
        Function0 function0322 = function02;
        c(function0322, j, r, mvt.z(f322, f, f2, 1.0f, 16), d.g(yciVar, mu0.d, 0.0f, 2), true, ild.C(946248447, new mf3(str, 6), oq5Var2), oq5Var, ((i3 >> 3) & 14) | 14155824, 0);
        d85Var7 = d85Var5;
        d85Var8 = d85Var6;
        r2 = oq5Var.r();
        if (r2 != null) {
        }
    }

    public static final boolean b0(ffm ffmVar) {
        List list = ffmVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((lfm) list.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final Function0 function0, final long j, final long j2, final long j3, final yci yciVar, boolean z, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        Function0 function02;
        int i3;
        final boolean z2;
        oq5 oq5Var;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-285811614);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (oq5Var2.h(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.e(j3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            z2 = z;
            i3 |= oq5Var2.g(z2) ? 1048576 : 524288;
            if ((i & 12582912) == 0) {
                i3 |= oq5Var2.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
            if ((i3 & 4793491) == 4793490 || !oq5Var2.z()) {
                boolean z3 = i4 == 0 ? false : z2;
                yci b2 = a.b(xp3.u(yciVar, ugo.a), j, vnj.i);
                wn5 C = ild.C(-128501823, new j26(wn5Var, 12), oq5Var2);
                int i5 = (i3 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i3 & 112);
                int i6 = i3 >> 3;
                oq5Var = oq5Var2;
                pd.o((i6 & 458752) | i5 | (i6 & 896) | (i6 & 7168), 0, j2, j3, C, oq5Var, b2, function02, true, z3);
                z2 = z3;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: tyj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hdg.c(Function0.this, j, j2, j3, yciVar, z2, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i4 == 0) {
        }
        yci b22 = a.b(xp3.u(yciVar, ugo.a), j, vnj.i);
        wn5 C2 = ild.C(-128501823, new j26(wn5Var, 12), oq5Var2);
        int i52 = (i3 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i3 & 112);
        int i62 = i3 >> 3;
        oq5Var = oq5Var2;
        pd.o((i62 & 458752) | i52 | (i62 & 896) | (i62 & 7168), 0, j2, j3, C2, oq5Var, b22, function02, true, z3);
        z2 = z3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final uob c0(String str) {
        return new uob(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new y36(str, new AtomicInteger()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final Function0 function0, final long j, final long j2, final long j3, final yci yciVar, o0k o0kVar, boolean z, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        long j4;
        o0k o0kVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        o0k o0kVar3;
        oq5 oq5Var;
        final o0k o0kVar4;
        final boolean z2;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1247983532);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i3 |= oq5Var2.e(j4) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.e(j3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i5 = i3 | (oq5Var2.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
                if ((i & 100663296) == 0) {
                    i5 |= oq5Var2.h(wn5Var) ? 67108864 : 33554432;
                }
                i6 = i5;
                if ((i6 & 38347923) == 38347922 || !oq5Var2.z()) {
                    if (i8 != 0) {
                        i7 = 2;
                        o0kVar3 = androidx.compose.foundation.layout.a.a(mu0.g, 0.0f, 2);
                    } else {
                        i7 = 2;
                        o0kVar3 = o0kVar2;
                    }
                    boolean z3 = i4 != 0 ? false : z;
                    oq5Var = oq5Var2;
                    c(function0, j, j4, j3, d.g(yciVar, mu0.f, 0.0f, i7), z3, ild.C(2016958054, new gab(21, o0kVar3, wn5Var), oq5Var2), oq5Var, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | ((i6 >> 3) & 3670016), 0);
                    o0kVar4 = o0kVar3;
                    z2 = z3;
                } else {
                    oq5Var2.S();
                    z2 = z;
                    oq5Var = oq5Var2;
                    o0kVar4 = o0kVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: uyj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            hdg.d(Function0.this, j, j2, j3, yciVar, o0kVar4, z2, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i5 = i3;
            if ((i & 100663296) == 0) {
            }
            i6 = i5;
            if ((i6 & 38347923) == 38347922) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            oq5Var = oq5Var2;
            c(function0, j, j4, j3, d.g(yciVar, mu0.f, 0.0f, i7), z3, ild.C(2016958054, new gab(21, o0kVar3, wn5Var), oq5Var2), oq5Var, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | ((i6 >> 3) & 3670016), 0);
            o0kVar4 = o0kVar3;
            z2 = z3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        o0kVar2 = o0kVar;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i5 = i3;
        if ((i & 100663296) == 0) {
        }
        i6 = i5;
        if ((i6 & 38347923) == 38347922) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        oq5Var = oq5Var2;
        c(function0, j, j4, j3, d.g(yciVar, mu0.f, 0.0f, i7), z3, ild.C(2016958054, new gab(21, o0kVar3, wn5Var), oq5Var2), oq5Var, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | ((i6 >> 3) & 3670016), 0);
        o0kVar4 = o0kVar3;
        z2 = z3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final String d0() {
        IntRange intRange = new IntRange(0, yhn.j(new IntRange(4, 32, 1), phn.a), 1);
        ArrayList arrayList = new ArrayList(v75.o(intRange, 10));
        ype it = intRange.iterator();
        while (it.c) {
            it.nextInt();
            ge4 ge4Var = new ge4('a', 'z');
            phn.a.getClass();
            try {
                arrayList.add(Character.valueOf((char) phn.b.e(97, ge4Var.b + 1)));
            } catch (IllegalArgumentException e) {
                wvs.h(e.getMessage());
                return null;
            }
        }
        return CollectionsKt.X(arrayList, null, null, null, null, 63);
    }

    public static final void e(int i, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-983776751);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, ((ma5) oq5Var.j(pa5.a)).g(), ild.C(40309913, new pyj(function0, d85.b(((dq0) oq5Var.j(eq0.a)).c.a, 0.33f, 0.0f, 0.0f, 0.0f, 14), yciVar, wn5Var, 2), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl3(yciVar, function0, wn5Var, i, 1);
        }
    }

    public static final List e0(cko ckoVar) {
        int o = s7g.o(ckoVar, ConnectableDevice.KEY_ID);
        int o2 = s7g.o(ckoVar, "seq");
        int o3 = s7g.o(ckoVar, "from");
        int o4 = s7g.o(ckoVar, "to");
        n8g b2 = t75.b();
        while (ckoVar.q()) {
            b2.add(new xrc((int) ckoVar.getLong(o), (int) ckoVar.getLong(o2), ckoVar.x0(o3), ckoVar.x0(o4)));
        }
        return CollectionsKt.n0(t75.a(b2));
    }

    public static final void f(int i, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1028497203);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, ((ma5) oq5Var.j(pa5.a)).g(), ild.C(-1584554581, new pyj(yciVar, function0, d85.b(((dq0) oq5Var.j(eq0.a)).c.a, 0.33f, 0.0f, 0.0f, 0.0f, 14), wn5Var), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl3(yciVar, function0, wn5Var, i, 4);
        }
    }

    public static final e2s f0(xjo xjoVar, String str, boolean z) {
        cko D0 = xjoVar.D0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int o = s7g.o(D0, "seqno");
            int o2 = s7g.o(D0, "cid");
            int o3 = s7g.o(D0, "name");
            int o4 = s7g.o(D0, "desc");
            if (o != -1 && o2 != -1 && o3 != -1 && o4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (D0.q()) {
                    if (((int) D0.getLong(o2)) >= 0) {
                        int i = (int) D0.getLong(o);
                        String x0 = D0.x0(o3);
                        String str2 = D0.getLong(o4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), x0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List o0 = CollectionsKt.o0(linkedHashMap.entrySet(), new t1n(3));
                ArrayList arrayList = new ArrayList(v75.o(o0, 10));
                Iterator it = o0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List w0 = CollectionsKt.w0(arrayList);
                List o02 = CollectionsKt.o0(linkedHashMap2.entrySet(), new t1n(4));
                ArrayList arrayList2 = new ArrayList(v75.o(o02, 10));
                Iterator it2 = o02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                e2s e2sVar = new e2s(str, z, w0, CollectionsKt.w0(arrayList2));
                i4w.w(D0, null);
                return e2sVar;
            }
            i4w.w(D0, null);
            return null;
        } finally {
        }
    }

    public static final void g(int i, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-281531032);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, ((ma5) oq5Var.j(pa5.a)).g(), ild.C(501493728, new pyj(function0, d85.b(((dq0) oq5Var.j(eq0.a)).c.a, 0.33f, 0.0f, 0.0f, 0.0f, 14), yciVar, wn5Var, 0), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl3(yciVar, function0, wn5Var, i, 2);
        }
    }

    public static final obh g0(String str, oq5 oq5Var) {
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (K == obj) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        Object obj2 = ((fs5) K).a;
        boolean f = oq5Var.f(str);
        Object K2 = oq5Var.K();
        if (f || K2 == obj) {
            K2 = new obh(str, vq2.a(0.0f));
            oq5Var.k0(K2);
        }
        obh obhVar = (obh) K2;
        Unit unit = Unit.a;
        boolean h = oq5Var.h(obj2) | oq5Var.h(obhVar);
        Object K3 = oq5Var.K();
        if (h || K3 == obj) {
            K3 = new seg(obj2, obhVar, (Continuation) null, 4);
            oq5Var.k0(K3);
        }
        gld.w(oq5Var, unit, (Function2) K3);
        return obhVar;
    }

    public static final void h(float f, boolean z, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1018229311);
        int i2 = (oq5Var.c(f) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.i, false);
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            qgg.j(f, z, null, oq5Var, i2 & 126);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new om2(f, z, yciVar, i, 1);
        }
    }

    public static final s9p h0(a5q a5qVar) {
        a5qVar.getClass();
        if (a5qVar instanceof w4q) {
            return ((w4q) a5qVar).a.a;
        }
        if (a5qVar instanceof y4q) {
            return ((y4q) a5qVar).a.e();
        }
        b6e.s();
        return null;
    }

    public static final void i(d6i d6iVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1255564390);
        int i2 = i | (oq5Var2.f(d6iVar) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            yci u = xp3.u(yciVar, o5g.F(oq5Var2));
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new or(27, function0);
                oq5Var2.k0(K);
            }
            yci a2 = androidx.compose.ui.platform.a.a(a.e(u, false, null, null, (Function0) K, 7), "mixes_block_item");
            boolean h = irv.h(oq5Var2);
            vci vciVar = vci.a;
            yci f = a2.f(d.r(vciVar, h ? 120 : 100));
            ta5 a3 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, f);
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
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            a(d6iVar.d, d6iVar.e, null, oq5Var2, 0);
            u1g.l(oq5Var2, d.e(vciVar, 8));
            xcs.b(d6iVar.b, androidx.compose.foundation.layout.a.o(d.d(androidx.compose.ui.platform.a.a(vciVar, "mixes_block_item_title"), 1.0f), 6, 0.0f, 2), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 2, null, nu0.i(), oq5Var2, 48, 27696, 38392);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(d6iVar, function0, yciVar, i, 2);
        }
    }

    public static final s9p i0(e5q e5qVar) {
        aou id = e5qVar.getId();
        if (id instanceof wnu) {
            return ((wnu) id).e();
        }
        if (id instanceof tnu) {
            return ((tnu) id).a;
        }
        if (id instanceof unu) {
            return ((unu) id).a;
        }
        if (id instanceof ynu) {
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-988916819);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                vci vciVar = vci.a;
                yci yciVar4 = i4 != 0 ? vciVar : yciVar2;
                float f = 8;
                yci q = androidx.compose.foundation.layout.a.q(d.r(xp3.u(yciVar4, o5g.F(oq5Var)), irv.h(oq5Var) ? 120 : 100), 0.0f, f, 0.0f, 0.0f, 13);
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                int i5 = oq5Var.P;
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
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                int i6 = i3 & 14;
                ivf.k(i6, 0, oq5Var, xp3.u(d.m(vciVar, 80), o5g.E(oq5Var)), z);
                u1g.l(oq5Var, d.e(vciVar, f));
                yci e = d.e(vciVar, w1g.p(nu0.i(), 0, oq5Var, 0, 2) * 2);
                kfh d = ug3.d(b2c.b, false);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, e);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                ivf.l(z, d.r(xp3.u(vciVar, o5g.C(oq5Var)), 72), nu0.i(), oq5Var, i6, 0);
                oq5Var.p(true);
                oq5Var.p(true);
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new n10(z, yciVar3, i, i2, 5);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static void j0(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            mi.L(viewGroup, z);
        } else if (c) {
            try {
                mi.L(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static final void k(Function0 function0, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1645247188);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            tgo F = o5g.F(oq5Var);
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(xp3.u(vciVar, F), "mixes_block_view_all_button_item");
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new or(28, function0);
                oq5Var.k0(K);
            }
            yci f = a.e(a2, false, null, null, (Function0) K, 7).f(irv.h(oq5Var) ? d.r(vciVar, 120) : d.t(vciVar, 100, 0.0f, 2));
            ta5 a3 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a3, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            kfh d = ug3.d(b2c.c, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f2 = 6;
            yci u = xp3.u(d.r(d.e(vciVar, f2), 72), ugo.c(f2, f2));
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).c.c;
            jzk jzkVar = vnj.i;
            ug3.a(a.b(u, j, jzkVar), oq5Var, 0);
            float f3 = 8;
            yci b2 = a.b(xp3.u(d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f3, 0.0f, 0.0f, 13), 80), o5g.F(oq5Var)), ((dq0) oq5Var.j(agrVar)).c.c, jzkVar);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            gae.b(a0g.E(R.drawable.ic_arrow_big_right_24, 0, oq5Var), rvf.M(R.string.skeleton_block_see_all, oq5Var), b.a.a(d.m(vciVar, 24), b2c.f), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 0, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, f3));
            xcs.b(rvf.M(R.string.skeleton_block_see_all, oq5Var), androidx.compose.ui.platform.a.a(vciVar, "mixes_block_item_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 2, 2, null, nu0.i(), oq5Var, 48, 27696, 38904);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zk(function0, i, 23);
        }
    }

    public static final dud k0(u9b u9bVar) {
        Integer d = u9bVar != null ? u9bVar.d() : null;
        return u9bVar == null ? cud.a : d != null ? new bud(d.intValue()) : new aud(u9bVar.e(wct.s(), WebPath$Storage.AVATARS));
    }

    public static final void l(ulf ulfVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci u;
        ulf ulfVar2;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2121215926);
        int i3 = i | (oq5Var2.h(ulfVar) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            ulfVar2 = ulfVar;
            oq5Var = oq5Var2;
        } else {
            View view = (View) oq5Var2.j(AndroidCompositionLocals_androidKt.f);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            Object obj2 = ((fs5) K).a;
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = vq2.a(1.0f);
                oq5Var2.k0(K2);
            }
            fk0 fk0Var = (fk0) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = szf.g0(true);
                oq5Var2.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            Object K4 = oq5Var2.K();
            if (K4 == obj) {
                K4 = szf.g0(true);
                oq5Var2.k0(K4);
            }
            aqi aqiVar2 = (aqi) K4;
            Object K5 = oq5Var2.K();
            if (K5 == obj) {
                K5 = szf.g0(true);
                oq5Var2.k0(K5);
            }
            aqi aqiVar3 = (aqi) K5;
            oq5Var2.Z(1286729388);
            oq5Var2.p(false);
            oq5Var2.Z(159096244);
            oq5Var2.p(false);
            boolean f = oq5Var2.f(zvi.a);
            Object K6 = oq5Var2.K();
            if (f || K6 == obj) {
                K6 = new awi();
                oq5Var2.k0(K6);
            }
            awi awiVar = (awi) K6;
            oq5Var2.Z(1100004279);
            oq5Var2.p(false);
            uvi uviVar = uvi.a;
            boolean f2 = oq5Var2.f(uviVar);
            Object K7 = oq5Var2.K();
            if (f2 || K7 == obj) {
                K7 = new vvi();
                oq5Var2.k0(K7);
            }
            vvi vviVar = (vvi) K7;
            Boolean valueOf = Boolean.valueOf(ulfVar.a.a);
            boolean h = oq5Var2.h(ulfVar) | oq5Var2.h(fk0Var);
            Object K8 = oq5Var2.K();
            Continuation continuation = null;
            if (h || K8 == obj) {
                i2 = i3;
                K8 = new zig(ulfVar, fk0Var, continuation, 29);
                oq5Var2.k0(K8);
            } else {
                i2 = i3;
            }
            gld.w(oq5Var2, valueOf, (Function2) K8);
            vviVar.getClass();
            if (!uviVar.equals(uviVar)) {
                throw vz1.i(oq5Var2, 699657366, false);
            }
            oq5Var2.Z(699658111);
            oq5Var2.p(false);
            f3r f3rVar = new f3r(d85.m);
            boolean h2 = oq5Var2.h(view) | ((i2 & 112) == 32);
            Object K9 = oq5Var2.K();
            if (h2 || K9 == obj) {
                K9 = new wvi(view, function0);
                oq5Var2.k0(K9);
            }
            Function0 function02 = (Function0) K9;
            Object K10 = oq5Var2.K();
            if (K10 == obj) {
                K10 = new jc(aqiVar3, 14);
                oq5Var2.k0(K10);
            }
            yci D = vq1.D(yciVar, function02, (Function0) K10, null, 0.95f, new meo(0), oq5Var2, ((i2 >> 6) & 14) | 24960, 52);
            oq5 oq5Var3 = oq5Var2;
            u = d.u(d.d(D, 1.0f), b2c.l, (r2 & 2) == 0);
            boolean h3 = oq5Var3.h(fk0Var);
            Object K11 = oq5Var3.K();
            if (h3 || K11 == obj) {
                K11 = new en4(fk0Var, 1);
                oq5Var3.k0(K11);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(u, (Function1) K11);
            Object K12 = oq5Var3.K();
            if (K12 == obj) {
                K12 = new coi(6);
                oq5Var3.k0(K12);
            }
            yci e = d.e(nfp.b(a2, true, (Function1) K12), 72);
            tgo tgoVar = ugo.a;
            yci a3 = androidx.compose.ui.platform.a.a(xp3.u(e, tgoVar), "landing_wave_block_button_container");
            lx0 lx0Var = qx0.e;
            hz2 hz2Var = b2c.l;
            nho a4 = lho.a(lx0Var, hz2Var, oq5Var3, 54);
            int i4 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, a3);
            xp5.T.getClass();
            Function0 function03 = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(function03);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var3, a4, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var3, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var3, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var4);
            yci u2 = xp3.u(d.z(d.b(vci.a, 1.0f), 3), tgoVar);
            boolean f3 = oq5Var3.f(f3rVar);
            Object K13 = oq5Var3.K();
            if (f3 || K13 == obj) {
                K13 = new xvi(f3rVar, 1);
                oq5Var3.k0(K13);
            }
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.ui.draw.a.b(u2, (Function1) K13), 24, 0.0f, 2);
            nho a5 = lho.a(lx0Var, hz2Var, oq5Var3, 54);
            int i5 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, o);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(function03);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a5, kb5Var);
            g0g.U(oq5Var3, l2, kb5Var2);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var3, i5, kb5Var3);
            }
            g0g.U(oq5Var3, H2, kb5Var4);
            boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
            Object K14 = oq5Var3.K();
            if (K14 == obj) {
                K14 = new uv1(15);
                oq5Var3.k0(K14);
            }
            e9b a6 = c.k(1, (Function1) K14).a(c.b(b2c.p, 13)).a(c.e(weo.S(500, 0, null, 6), 2));
            Object K15 = oq5Var3.K();
            if (K15 == obj) {
                K15 = new jc(aqiVar3, 15);
                oq5Var3.k0(K15);
            }
            ulfVar2 = ulfVar;
            men.c(booleanValue, (Function0) K15, null, a6, null, null, ild.C(-530116009, new gab(12, ulfVar2, awiVar), oq5Var3), oq5Var3, 1575984);
            boolean booleanValue2 = ((Boolean) aqiVar2.getValue()).booleanValue();
            e9b e2 = c.e(weo.S(200, 0, null, 6), 2);
            boolean h4 = oq5Var3.h(obj2);
            Object K16 = oq5Var3.K();
            if (h4 || K16 == obj) {
                K16 = new y6g(17, obj2, aqiVar);
                oq5Var3.k0(K16);
            }
            men.c(booleanValue2, (Function0) K16, null, e2, null, null, ild.C(10278030, new tt5(24, awiVar), oq5Var3), oq5Var3, 1575936);
            oq5Var3.p(true);
            oq5Var3.p(true);
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(ulfVar2, function0, yciVar, i, 7);
        }
    }

    public static final xku l0(p4q p4qVar) {
        p4qVar.getClass();
        int ordinal = p4qVar.ordinal();
        if (ordinal == 0) {
            return xku.a;
        }
        if (ordinal == 1) {
            return xku.b;
        }
        if (ordinal == 2) {
            return xku.c;
        }
        b6e.s();
        return null;
    }

    public static final void m(fvf fvfVar, o0k o0kVar, nam namVar, mam mamVar, hq5 hq5Var, int i) {
        int i2;
        fvfVar.getClass();
        o0kVar.getClass();
        mamVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-923441972);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(namVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(mamVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.Q(mamVar.h, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(mamVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                ayl aylVar = new ayl(0, mamVar, mam.class, "onRefresh", "onRefresh()V", 0, 19);
                oq5Var.k0(aylVar);
                K = aylVar;
            }
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, false, ild.C(-1472923572, new gvl(fvfVar, o0kVar, namVar, mamVar, 8), oq5Var), oq5Var, ((i3 << 3) & 896) | 196608, 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 1, fvfVar, o0kVar, namVar, mamVar);
        }
    }

    public static final e5q m0(e5q e5qVar, cu7 cu7Var) {
        cu7Var.getClass();
        o4q n = bfg.n(cu7Var);
        if (W(e5qVar) == n) {
            return e5qVar;
        }
        if (e5qVar instanceof u4q) {
            return u4q.h((u4q) e5qVar, n, null, 55);
        }
        if (e5qVar instanceof s4q) {
            return e5qVar;
        }
        if (e5qVar instanceof w4q) {
            return w4q.h((w4q) e5qVar, n, null, 55);
        }
        if (e5qVar instanceof d5q) {
            return e5qVar;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(int i, int i2, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        float f;
        float f2;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-103008708);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                yciVar3 = i4 == 0 ? vci.a : yciVar2;
                agr agrVar = eq0.a;
                long j = ((dq0) oq5Var.j(agrVar)).d.a;
                long j2 = ((dq0) oq5Var.j(agrVar)).b.e;
                p85 b0 = pd.b0(((dq0) oq5Var.j(agrVar)).d.a);
                float f3 = b0.a;
                f = b0.b + 0.1f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                f2 = b0.c - 0.06f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                int i5 = d85.o;
                c(function0, j, j2, mvt.z(f3, f, f2, 1.0f, 16), d.g(yciVar3, mu0.d, 0.0f, 2), true, ild.C(-187270934, new j26(wn5Var, 6), oq5Var), oq5Var, (i3 & 14) | 14155824, 0);
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new z61(function0, yciVar3, wn5Var, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        agr agrVar2 = eq0.a;
        long j3 = ((dq0) oq5Var.j(agrVar2)).d.a;
        long j22 = ((dq0) oq5Var.j(agrVar2)).b.e;
        p85 b02 = pd.b0(((dq0) oq5Var.j(agrVar2)).d.a);
        float f32 = b02.a;
        f = b02.b + 0.1f;
        if (f > 1.0f) {
        }
        f2 = b02.c - 0.06f;
        if (f2 < 0.0f) {
        }
        int i52 = d85.o;
        c(function0, j3, j22, mvt.z(f32, f, f2, 1.0f, 16), d.g(yciVar3, mu0.d, 0.0f, 2), true, ild.C(-187270934, new j26(wn5Var, 6), oq5Var), oq5Var, (i3 & 14) | 14155824, 0);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static String n0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String s;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                s = "null";
            } else {
                try {
                    s = obj.toString();
                } catch (Exception e) {
                    String o = ouj.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o), (Throwable) e);
                    s = hrg.s("<", o, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = s;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(String str, Function0 function0, yci yciVar, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function02;
        yci yciVar2;
        int i4;
        yci yciVar3;
        float f2;
        xmn r;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1528217699);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i4 & 1171) == 1170 || !oq5Var.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                float f3 = mu0.e;
                long j = ((dq0) oq5Var.j(eq0.a)).d.a;
                long r2 = kg5.r(R.color.text_primary_day, oq5Var);
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                int i6 = i4 & 126;
                int i7 = i4 << 9;
                p(str, function02, j, r2, nu0.j(), yciVar4, f3, oq5Var, i6 | (458752 & i7) | (i7 & 3670016), 0);
                yciVar3 = yciVar4;
                f2 = f3;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                f2 = f;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new jg6(str, function0, yciVar3, f2, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = i3 | 3072;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 == 0) {
        }
        float f32 = mu0.e;
        long j2 = ((dq0) oq5Var.j(eq0.a)).d.a;
        long r22 = kg5.r(R.color.text_primary_day, oq5Var);
        h6g h6gVar3 = nu0.a;
        h6g h6gVar22 = h6g.c;
        int i62 = i4 & 126;
        int i72 = i4 << 9;
        p(str, function02, j2, r22, nu0.j(), yciVar4, f32, oq5Var, i62 | (458752 & i72) | (i72 & 3670016), 0);
        yciVar3 = yciVar4;
        f2 = f32;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final String str, final Function0 function0, final long j, final long j2, final ges gesVar, final yci yciVar, float f, hq5 hq5Var, final int i, final int i2) {
        int i3;
        long j3;
        ges gesVar2;
        float f2;
        float f3;
        float f4;
        oq5 oq5Var;
        final float f5;
        xmn r;
        str.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(344719177);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i3 |= oq5Var2.e(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gesVar2 = gesVar;
            i3 |= oq5Var2.f(gesVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            gesVar2 = gesVar;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            f2 = f;
            i3 |= oq5Var2.c(f2) ? 1048576 : 524288;
            if ((599187 & i3) == 599186 || !oq5Var2.z()) {
                final float f6 = i4 == 0 ? mu0.e : f2;
                p85 b0 = pd.b0(j3);
                float f7 = b0.a;
                f3 = b0.b + 0.1f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                f4 = b0.c - 0.06f;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                int i5 = d85.o;
                final ges gesVar3 = gesVar2;
                oq5Var = oq5Var2;
                c(function0, j3, j2, mvt.z(f7, f3, f4, 1.0f, 16), d.g(yciVar, mu0.d, 0.0f, 2), true, ild.C(1296149751, new pyc() { // from class: ryj
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((dh3) obj).getClass();
                        if ((intValue & 17) == 16) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        xcs.b(str, androidx.compose.foundation.layout.a.o(vci.a, f6, 0.0f, 2), j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar3, hq5Var2, 0, 3120, 55288);
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var, ((i3 >> 3) & 14) | 14155824 | (i3 & 896) | (i3 & 7168), 0);
                f5 = f6;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                f5 = f2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: syj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hdg.p(str, function0, j, j2, gesVar, yciVar, f5, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((599187 & i3) == 599186) {
        }
        if (i4 == 0) {
        }
        p85 b02 = pd.b0(j3);
        float f72 = b02.a;
        f3 = b02.b + 0.1f;
        if (f3 > 1.0f) {
        }
        f4 = b02.c - 0.06f;
        if (f4 < 0.0f) {
        }
        int i52 = d85.o;
        final ges gesVar32 = gesVar2;
        oq5Var = oq5Var2;
        c(function0, j3, j2, mvt.z(f72, f3, f4, 1.0f, 16), d.g(yciVar, mu0.d, 0.0f, 2), true, ild.C(1296149751, new pyc() { // from class: ryj
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                xcs.b(str, androidx.compose.foundation.layout.a.o(vci.a, f6, 0.0f, 2), j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar32, hq5Var2, 0, 3120, 55288);
                return Unit.a;
            }
        }, oq5Var2), oq5Var, ((i3 >> 3) & 14) | 14155824 | (i3 & 896) | (i3 & 7168), 0);
        f5 = f6;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void q(String str, Function0 function0, yci yciVar, q0k q0kVar, hq5 hq5Var, int i) {
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-351773571);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            r(function0, yciVar, q0kVar, ild.C(63459693, new mf3(str, 7), oq5Var), oq5Var, ((i2 >> 3) & 14) | 3504, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i, 28, str, function0, yciVar, q0kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(Function0 function0, yci yciVar, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        int i3;
        yci yciVar2;
        int i4;
        o0k o0kVar2;
        float f;
        float f2;
        oq5 oq5Var;
        yci yciVar3;
        o0k o0kVar3;
        xmn r;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2138974500);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (oq5Var2.h(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                o0kVar2 = o0kVar;
                i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 || !oq5Var2.z()) {
                    yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                    o0k a2 = i4 != 0 ? androidx.compose.foundation.layout.a.a(mu0.g, 0.0f, 2) : o0kVar2;
                    agr agrVar = eq0.a;
                    long j = ((dq0) oq5Var2.j(agrVar)).d.a;
                    long j2 = ((dq0) oq5Var2.j(agrVar)).b.e;
                    p85 b0 = pd.b0(((dq0) oq5Var2.j(agrVar)).d.a);
                    float f3 = b0.a;
                    f = b0.b + 0.1f;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    f2 = b0.c - 0.06f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    int i6 = d85.o;
                    int i7 = (i3 & 14) | 113246256;
                    int i8 = i3 << 12;
                    oq5Var = oq5Var2;
                    d(function02, j, j2, mvt.z(f3, f, f2, 1.0f, 16), yciVar4, a2, true, ild.C(1282376772, new j26(wn5Var, 13), oq5Var2), oq5Var, i7 | (458752 & i8) | (i8 & 3670016), 0);
                    yciVar3 = yciVar4;
                    o0kVar3 = a2;
                } else {
                    oq5Var2.S();
                    oq5Var = oq5Var2;
                    yciVar3 = yciVar2;
                    o0kVar3 = o0kVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new qyj(function0, yciVar3, o0kVar3, wn5Var, i, i2, 1);
                    return;
                }
                return;
            }
            o0kVar2 = o0kVar;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            agr agrVar2 = eq0.a;
            long j3 = ((dq0) oq5Var2.j(agrVar2)).d.a;
            long j22 = ((dq0) oq5Var2.j(agrVar2)).b.e;
            p85 b02 = pd.b0(((dq0) oq5Var2.j(agrVar2)).d.a);
            float f32 = b02.a;
            f = b02.b + 0.1f;
            if (f > 1.0f) {
            }
            f2 = b02.c - 0.06f;
            if (f2 < 0.0f) {
            }
            int i62 = d85.o;
            int i72 = (i3 & 14) | 113246256;
            int i82 = i3 << 12;
            oq5Var = oq5Var2;
            d(function02, j3, j22, mvt.z(f32, f, f2, 1.0f, 16), yciVar4, a2, true, ild.C(1282376772, new j26(wn5Var, 13), oq5Var2), oq5Var, i72 | (458752 & i82) | (i82 & 3670016), 0);
            yciVar3 = yciVar4;
            o0kVar3 = a2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        o0kVar2 = o0kVar;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        agr agrVar22 = eq0.a;
        long j32 = ((dq0) oq5Var2.j(agrVar22)).d.a;
        long j222 = ((dq0) oq5Var2.j(agrVar22)).b.e;
        p85 b022 = pd.b0(((dq0) oq5Var2.j(agrVar22)).d.a);
        float f322 = b022.a;
        f = b022.b + 0.1f;
        if (f > 1.0f) {
        }
        f2 = b022.c - 0.06f;
        if (f2 < 0.0f) {
        }
        int i622 = d85.o;
        int i722 = (i3 & 14) | 113246256;
        int i822 = i3 << 12;
        oq5Var = oq5Var2;
        d(function02, j32, j222, mvt.z(f322, f, f2, 1.0f, 16), yciVar4, a2, true, ild.C(1282376772, new j26(wn5Var, 13), oq5Var2), oq5Var, i722 | (458752 & i822) | (i822 & 3670016), 0);
        yciVar3 = yciVar4;
        o0kVar3 = a2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void s(int i, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1357501302);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            agr agrVar = eq0.a;
            c(function0, ((dq0) oq5Var.j(agrVar)).d.c, ((dq0) oq5Var.j(agrVar)).b.a, ((dq0) oq5Var.j(agrVar)).c.c, d.g(yciVar, mu0.d, 0.0f, 2), false, ild.C(-729121864, new j26(wn5Var, 11), oq5Var), oq5Var, (i2 & 14) | 12582960, 64);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl3(yciVar, function0, wn5Var, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if ((r16 & 8) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(String str, Function0 function0, yci yciVar, ges gesVar, hq5 hq5Var, int i, int i2) {
        int i3;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1627375263);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && oq5Var.f(gesVar)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                if (i4 != 0) {
                    yciVar = vci.a;
                }
                if ((i2 & 8) != 0) {
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    gesVar = nu0.j();
                    i3 &= -7169;
                }
                oq5Var.q();
                s((i3 & 896) | ((i3 >> 3) & 14) | 48, ild.C(454834006, new gab(20, str, gesVar), oq5Var), oq5Var, yciVar, function0);
            } else {
                oq5Var.S();
            }
        }
        yci yciVar2 = yciVar;
        ges gesVar2 = gesVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(str, function0, yciVar2, gesVar2, i, i2, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(Function0 function0, yci yciVar, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        int i3;
        o0k o0kVar2;
        oq5 oq5Var;
        o0k o0kVar3;
        xmn r;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1610467734);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (oq5Var2.h(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !oq5Var2.z()) {
                o0k a2 = i4 == 0 ? androidx.compose.foundation.layout.a.a(mu0.g, 0.0f, 2) : o0kVar2;
                agr agrVar = eq0.a;
                int i5 = (i3 & 14) | 100663344;
                int i6 = i3 << 12;
                oq5Var = oq5Var2;
                d(function02, ((dq0) oq5Var2.j(agrVar)).d.c, ((dq0) oq5Var2.j(agrVar)).b.a, ((dq0) oq5Var2.j(agrVar)).c.c, yciVar, a2, false, ild.C(-1241195338, new j26(wn5Var, 7), oq5Var2), oq5Var, i5 | (458752 & i6) | (i6 & 3670016), 128);
                o0kVar3 = a2;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                o0kVar3 = o0kVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new qyj(function0, yciVar, o0kVar3, wn5Var, i, i2, 0);
                return;
            }
            return;
        }
        o0kVar2 = o0kVar;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        agr agrVar2 = eq0.a;
        int i52 = (i3 & 14) | 100663344;
        int i62 = i3 << 12;
        oq5Var = oq5Var2;
        d(function02, ((dq0) oq5Var2.j(agrVar2)).d.c, ((dq0) oq5Var2.j(agrVar2)).b.a, ((dq0) oq5Var2.j(agrVar2)).c.c, yciVar, a2, false, ild.C(-1241195338, new j26(wn5Var, 7), oq5Var2), oq5Var, i52 | (458752 & i62) | (i62 & 3670016), 128);
        o0kVar3 = a2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void v(j2s j2sVar, Function1 function1, yci yciVar, boolean z, hq5 hq5Var, int i) {
        boolean z2;
        j2sVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1826558368);
        int i2 = i | (oq5Var.f(j2sVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            w(j2sVar.a, ((Number) gld.M(j2sVar.b, oq5Var).getValue()).intValue(), function1, yciVar, true, false, false, 0L, 0L, false, null, oq5Var, (i2 << 3) & 65408, 4064);
            z2 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(j2sVar, function1, yciVar, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(final List list, final int i, final Function1 function1, yci yciVar, boolean z, boolean z2, boolean z3, long j, long j2, boolean z4, pyc pycVar, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        Function1 function12;
        yci yciVar2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        long j3;
        long j4;
        pyc pycVar2;
        boolean z6;
        boolean z7;
        int i8;
        boolean z8;
        oq5 oq5Var;
        final long j5;
        final long j6;
        final boolean z9;
        final yci yciVar3;
        final boolean z10;
        final pyc pycVar3;
        final boolean z11;
        final boolean z12;
        xmn r;
        list.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2069248293);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i4 |= oq5Var2.h(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z5 = z;
                i4 |= oq5Var2.g(z5) ? 16384 : RemoteCameraConfig.Notification.ID;
                int i10 = 1769472 | i4;
                if ((12582912 & i2) == 0) {
                    i10 = 5963776 | i4;
                }
                if ((100663296 & i2) == 0) {
                    i10 |= 33554432;
                }
                i6 = 805306368 | i10;
                if ((306783379 & i6) == 306783378 || !oq5Var2.z()) {
                    oq5Var2.U();
                    i7 = i2 & 1;
                    yci yciVar4 = vci.a;
                    if (i7 != 0 || oq5Var2.y()) {
                        if (i9 != 0) {
                            yciVar2 = yciVar4;
                        }
                        if (i5 != 0) {
                            z5 = true;
                        }
                        agr agrVar = eq0.a;
                        j3 = ((dq0) oq5Var2.j(agrVar)).b.b;
                        j4 = ((dq0) oq5Var2.j(agrVar)).b.a;
                        pycVar2 = kg5.f;
                        z6 = true;
                        z7 = true;
                        yciVar2 = yciVar2;
                        i8 = i6 & (-264241153);
                        z8 = true;
                    } else {
                        oq5Var2.S();
                        z7 = z3;
                        j3 = j;
                        j4 = j2;
                        z6 = z4;
                        pycVar2 = pycVar;
                        i8 = i6 & (-264241153);
                        z8 = z2;
                    }
                    oq5Var2.q();
                    oq5Var2.Z(22271534);
                    yci e = d.e(d.d(yciVar2, 1.0f), 40);
                    if (z5) {
                        yci b2 = androidx.compose.ui.graphics.a.b(yciVar4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
                        Object K = oq5Var2.K();
                        if (K == gq5.a) {
                            K = new csr(13);
                            oq5Var2.k0(K);
                        }
                        yciVar4 = androidx.compose.ui.draw.a.b(b2, (Function1) K);
                    }
                    yci f = e.f(yciVar4);
                    oq5Var2.p(false);
                    final boolean z13 = z8;
                    final Function1 function13 = function12;
                    final long j7 = j4;
                    final long j8 = j3;
                    oq5Var = oq5Var2;
                    vxo.a(i, b2c.f, f, d85.m, 0L, 8, pycVar2, kg5.g, z6, z7, ild.C(-683000405, new Function2() { // from class: h2s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i11;
                            yci b3;
                            jzk jzkVar = vnj.i;
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            int i12 = 0;
                            for (Object obj3 : list) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                m0s m0sVar = (m0s) obj3;
                                boolean z14 = i == i12;
                                float f2 = 40;
                                vci vciVar = vci.a;
                                yci u = xp3.u(d.e(vciVar, f2), ugo.a(f2));
                                if (z13 && z14) {
                                    oq5 oq5Var4 = (oq5) hq5Var2;
                                    oq5Var4.Z(955303056);
                                    agr agrVar2 = eq0.a;
                                    i11 = i12;
                                    b3 = a.b(vciVar, c3x.D(((dq0) oq5Var4.j(agrVar2)).d.c, ((dq0) oq5Var4.j(agrVar2)).c.a), jzkVar);
                                    oq5Var4.p(false);
                                } else {
                                    i11 = i12;
                                    oq5 oq5Var5 = (oq5) hq5Var2;
                                    oq5Var5.Z(955455111);
                                    oq5Var5.p(false);
                                    b3 = a.b(vciVar, d85.m, jzkVar);
                                }
                                yci f3 = u.f(b3);
                                int i14 = i11;
                                yci c2 = com.yandex.music.core.ui.compose.b.c(com.yandex.music.core.ui.compose.b.b(f3, i14), "tab_item_selected", Boolean.valueOf(z14));
                                oq5 oq5Var6 = (oq5) hq5Var2;
                                Function1 function14 = function13;
                                boolean f4 = oq5Var6.f(function14) | oq5Var6.d(i14);
                                Object K2 = oq5Var6.K();
                                if (f4 || K2 == gq5.a) {
                                    K2 = new q9n(i14, 1, function14);
                                    oq5Var6.k0(K2);
                                }
                                f1s.b(z14, (Function0) K2, c2, false, ild.C(1365480803, new rl3(z14, j7, j8, m0sVar), oq5Var6), 0L, 0L, oq5Var6, 24576);
                                i12 = i13;
                            }
                            return Unit.a;
                        }
                    }, oq5Var2), oq5Var, ((i8 >> 3) & 14) | 115018800 | ((i8 << 9) & 1879048192), 16);
                    j5 = j4;
                    j6 = j3;
                    z9 = z8;
                    yciVar3 = yciVar2;
                    z10 = z5;
                    pycVar3 = pycVar2;
                    z11 = z6;
                    z12 = z7;
                } else {
                    oq5Var2.S();
                    z9 = z2;
                    j6 = j;
                    j5 = j2;
                    z11 = z4;
                    pycVar3 = pycVar;
                    oq5Var = oq5Var2;
                    yciVar3 = yciVar2;
                    z10 = z5;
                    z12 = z3;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: i2s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int R = rvf.R(i2 | 1);
                            hdg.w(list, i, function1, yciVar3, z10, z9, z12, j6, j5, z11, pycVar3, (hq5) obj, R, i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z;
            int i102 = 1769472 | i4;
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            i6 = 805306368 | i102;
            if ((306783379 & i6) == 306783378) {
            }
            oq5Var2.U();
            i7 = i2 & 1;
            yci yciVar42 = vci.a;
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            agr agrVar2 = eq0.a;
            j3 = ((dq0) oq5Var2.j(agrVar2)).b.b;
            j4 = ((dq0) oq5Var2.j(agrVar2)).b.a;
            pycVar2 = kg5.f;
            z6 = true;
            z7 = true;
            yciVar2 = yciVar2;
            i8 = i6 & (-264241153);
            z8 = true;
            oq5Var2.q();
            oq5Var2.Z(22271534);
            yci e2 = d.e(d.d(yciVar2, 1.0f), 40);
            if (z5) {
            }
            yci f2 = e2.f(yciVar42);
            oq5Var2.p(false);
            final boolean z132 = z8;
            final Function1 function132 = function12;
            final long j72 = j4;
            final long j82 = j3;
            oq5Var = oq5Var2;
            vxo.a(i, b2c.f, f2, d85.m, 0L, 8, pycVar2, kg5.g, z6, z7, ild.C(-683000405, new Function2() { // from class: h2s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i11;
                    yci b3;
                    jzk jzkVar = vnj.i;
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    int i12 = 0;
                    for (Object obj3 : list) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            u75.n();
                            throw null;
                        }
                        m0s m0sVar = (m0s) obj3;
                        boolean z14 = i == i12;
                        float f22 = 40;
                        vci vciVar = vci.a;
                        yci u = xp3.u(d.e(vciVar, f22), ugo.a(f22));
                        if (z132 && z14) {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            oq5Var4.Z(955303056);
                            agr agrVar22 = eq0.a;
                            i11 = i12;
                            b3 = a.b(vciVar, c3x.D(((dq0) oq5Var4.j(agrVar22)).d.c, ((dq0) oq5Var4.j(agrVar22)).c.a), jzkVar);
                            oq5Var4.p(false);
                        } else {
                            i11 = i12;
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            oq5Var5.Z(955455111);
                            oq5Var5.p(false);
                            b3 = a.b(vciVar, d85.m, jzkVar);
                        }
                        yci f3 = u.f(b3);
                        int i14 = i11;
                        yci c2 = com.yandex.music.core.ui.compose.b.c(com.yandex.music.core.ui.compose.b.b(f3, i14), "tab_item_selected", Boolean.valueOf(z14));
                        oq5 oq5Var6 = (oq5) hq5Var2;
                        Function1 function14 = function132;
                        boolean f4 = oq5Var6.f(function14) | oq5Var6.d(i14);
                        Object K2 = oq5Var6.K();
                        if (f4 || K2 == gq5.a) {
                            K2 = new q9n(i14, 1, function14);
                            oq5Var6.k0(K2);
                        }
                        f1s.b(z14, (Function0) K2, c2, false, ild.C(1365480803, new rl3(z14, j72, j82, m0sVar), oq5Var6), 0L, 0L, oq5Var6, 24576);
                        i12 = i13;
                    }
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, ((i8 >> 3) & 14) | 115018800 | ((i8 << 9) & 1879048192), 16);
            j5 = j4;
            j6 = j3;
            z9 = z8;
            yciVar3 = yciVar2;
            z10 = z5;
            pycVar3 = pycVar2;
            z11 = z6;
            z12 = z7;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z5 = z;
        int i1022 = 1769472 | i4;
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        i6 = 805306368 | i1022;
        if ((306783379 & i6) == 306783378) {
        }
        oq5Var2.U();
        i7 = i2 & 1;
        yci yciVar422 = vci.a;
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        agr agrVar22 = eq0.a;
        j3 = ((dq0) oq5Var2.j(agrVar22)).b.b;
        j4 = ((dq0) oq5Var2.j(agrVar22)).b.a;
        pycVar2 = kg5.f;
        z6 = true;
        z7 = true;
        yciVar2 = yciVar2;
        i8 = i6 & (-264241153);
        z8 = true;
        oq5Var2.q();
        oq5Var2.Z(22271534);
        yci e22 = d.e(d.d(yciVar2, 1.0f), 40);
        if (z5) {
        }
        yci f22 = e22.f(yciVar422);
        oq5Var2.p(false);
        final boolean z1322 = z8;
        final Function1 function1322 = function12;
        final long j722 = j4;
        final long j822 = j3;
        oq5Var = oq5Var2;
        vxo.a(i, b2c.f, f22, d85.m, 0L, 8, pycVar2, kg5.g, z6, z7, ild.C(-683000405, new Function2() { // from class: h2s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i11;
                yci b3;
                jzk jzkVar = vnj.i;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                int i12 = 0;
                for (Object obj3 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        u75.n();
                        throw null;
                    }
                    m0s m0sVar = (m0s) obj3;
                    boolean z14 = i == i12;
                    float f222 = 40;
                    vci vciVar = vci.a;
                    yci u = xp3.u(d.e(vciVar, f222), ugo.a(f222));
                    if (z1322 && z14) {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(955303056);
                        agr agrVar222 = eq0.a;
                        i11 = i12;
                        b3 = a.b(vciVar, c3x.D(((dq0) oq5Var4.j(agrVar222)).d.c, ((dq0) oq5Var4.j(agrVar222)).c.a), jzkVar);
                        oq5Var4.p(false);
                    } else {
                        i11 = i12;
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        oq5Var5.Z(955455111);
                        oq5Var5.p(false);
                        b3 = a.b(vciVar, d85.m, jzkVar);
                    }
                    yci f3 = u.f(b3);
                    int i14 = i11;
                    yci c2 = com.yandex.music.core.ui.compose.b.c(com.yandex.music.core.ui.compose.b.b(f3, i14), "tab_item_selected", Boolean.valueOf(z14));
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    Function1 function14 = function1322;
                    boolean f4 = oq5Var6.f(function14) | oq5Var6.d(i14);
                    Object K2 = oq5Var6.K();
                    if (f4 || K2 == gq5.a) {
                        K2 = new q9n(i14, 1, function14);
                        oq5Var6.k0(K2);
                    }
                    f1s.b(z14, (Function0) K2, c2, false, ild.C(1365480803, new rl3(z14, j722, j822, m0sVar), oq5Var6), 0L, 0L, oq5Var6, 24576);
                    i12 = i13;
                }
                return Unit.a;
            }
        }, oq5Var2), oq5Var, ((i8 >> 3) & 14) | 115018800 | ((i8 << 9) & 1879048192), 16);
        j5 = j4;
        j6 = j3;
        z9 = z8;
        yciVar3 = yciVar2;
        z10 = z5;
        pycVar3 = pycVar2;
        z11 = z6;
        z12 = z7;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void x(zru zruVar, sai saiVar, hq5 hq5Var, int i) {
        int i2;
        saiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-738658503);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(zruVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(saiVar) ? 32 : 16;
        }
        int i3 = i & 384;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s7g.k(qld.g, qld.h, qld.i, ild.C(610424202, new kws(11, zruVar, saiVar, gld.O(zruVar.getState(), oq5Var)), oq5Var), vciVar, false, qld.k, oq5Var, ((i2 << 6) & 57344) | 12586422, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(zruVar, saiVar, i);
        }
    }

    public static final void y(Function0 function0, Function0 function02, Function0 function03, r4v r4vVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        r4vVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(220019428);
        if ((i & 48) == 0) {
            i2 = (oq5Var.h(function02) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function03) ? 256 : 128;
        }
        if (((i2 | (oq5Var.h(r4vVar) ? 2048 : 1024) | 24576) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            float f = 160;
            float f2 = 20;
            float Z = Z(oq5Var);
            vdr vdrVar = r4vVar.b;
            e7v e7vVar = new e7v(vdrVar, 1);
            a7v a7vVar = (a7v) vdrVar.getValue();
            a7vVar.getClass();
            x7v x7vVar = a7vVar.j ? x7v.a : x7v.b;
            t7l t7lVar = lbq.a;
            b7v b7vVar = new b7v(f, function03, Z, (x7v) gld.O(zsd.F0(e7vVar, mm6Var, t7lVar, x7vVar), oq5Var).getValue(), ((Boolean) gld.O(zsd.F0(new y4s(vdrVar, 29), mm6Var, t7lVar, Boolean.valueOf(((a7v) vdrVar.getValue()).l)), oq5Var).getValue()).booleanValue(), ((Boolean) gld.O(zsd.F0(new e7v(vdrVar, 0), mm6Var, t7lVar, Boolean.valueOf(((a7v) vdrVar.getValue()).k)), oq5Var).getValue()).booleanValue(), f2);
            iz2 iz2Var = b2c.f;
            boolean f3 = oq5Var.f(b7vVar);
            Object K2 = oq5Var.K();
            if (f3 || K2 == kjnVar) {
                K2 = new olu(5, b7vVar);
                oq5Var.k0(K2);
            }
            vci vciVar = vci.a;
            bg3.a(d.d(androidx.compose.ui.layout.a.b(vciVar, (pyc) K2), 1.0f), iz2Var, false, ild.C(-2003559110, new mdn(r4vVar, b7vVar, function0, function02, 10), oq5Var), oq5Var, 3120, 4);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(i, 0, function0, function02, function03, r4vVar, yciVar2);
        }
    }

    public static final void z(wvv wvvVar, yci yciVar, hq5 hq5Var, int i) {
        wvvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(392413757);
        if ((((oq5Var.f(wvvVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean booleanValue = ((Boolean) gld.O(wvvVar.b, oq5Var).getValue()).booleanValue();
            yci a0 = gut.a0(androidx.compose.ui.platform.a.a(yciVar, "wizard_footer"));
            ov6 ov6Var = lya.c;
            act S = weo.S(0, 0, ov6Var, 3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new ulv(23);
                oq5Var.k0(K);
            }
            e9b l = c.l(S, (Function1) K);
            act S2 = weo.S(0, 0, ov6Var, 3);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new ulv(25);
                oq5Var.k0(K2);
            }
            etn.f(booleanValue, a0, l, c.n(S2, (Function1) K2), "footer visibility animation", ild.C(768380005, new olu(8, wvvVar), oq5Var), oq5Var, 221184, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(wvvVar, yciVar, i, 11);
        }
    }

    public abstract Typeface O(Context context, iqc iqcVar, Resources resources, int i);

    public abstract Typeface P(Context context, vqc[] vqcVarArr, int i);

    public Typeface Q(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface R(Context context, Resources resources, int i, String str, int i2) {
        File v = ldg.v(context);
        if (v == null) {
            return null;
        }
        try {
            if (ldg.o(v, resources, i)) {
                return Typeface.createFromFile(v.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            v.delete();
        }
    }

    public abstract String X();

    public Object Y() {
        if (this instanceof mir) {
            return ((mir) this).e;
        }
        if (this instanceof lir) {
            return Long.valueOf(((lir) this).e);
        }
        if (this instanceof hir) {
            return Boolean.valueOf(((hir) this).e);
        }
        if (this instanceof kir) {
            return Double.valueOf(((kir) this).e);
        }
        if (this instanceof iir) {
            return new c85(((iir) this).e);
        }
        if (this instanceof nir) {
            return new lpt(((nir) this).e);
        }
        if (this instanceof gir) {
            return ((gir) this).e;
        }
        if (this instanceof jir) {
            return ((jir) this).e;
        }
        b6e.s();
        return null;
    }
}
