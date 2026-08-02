package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.playback.api.commands.SetVolumeCommand;
import com.yandex.music.shared.playback.utils.api.commands.MovePlayableCommand;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes.dex */
public abstract class sj2 {
    public static ExecutorService a = null;
    public static final pj0 b = new pj0();
    public static final wn5 c = new wn5(new go5(13), -1351639651, false);
    public static final wn5 d = new wn5(new po5(0), 2130114750, false);
    public static final wn5 e = new wn5(new po5(1), 118996935, false);
    public static final wn5 f = new wn5(new zo5(11), -620970393, false);
    public static final wn5 g = new wn5(new zo5(12), -1531850136, false);
    public static final lc8 h;
    public static volatile ksg i = null;
    public static final Object j;
    public static final SetVolumeCommand k;
    public static Boolean l = null;
    public static Boolean m = null;
    public static Boolean n = null;
    public static Boolean o = null;
    public static volatile boolean p = true;

    static {
        new wn5(new zo5(13), 1954865300, false);
        h = new lc8(14);
        j = new Object();
        k = new SetVolumeCommand(new n4q(1.0f));
    }

    public static final boolean A(String str) {
        str.getClass();
        return (Intrinsics.d(str, ServiceCommand.TYPE_GET) || Intrinsics.d(str, "HEAD")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void B(wn5 wn5Var, cg6 cg6Var) {
        fkd fkdVar;
        int i2;
        if (cg6Var instanceof fkd) {
            fkdVar = (fkd) cg6Var;
            int i3 = fkdVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fkdVar.k = i3 - Integer.MIN_VALUE;
                Object obj = fkdVar.j;
                nm6 nm6Var = nm6.a;
                i2 = fkdVar.k;
                if (i2 == 0) {
                    if (i2 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                qgg.h0(obj);
                fd6 fd6Var = (fd6) fkdVar.getContext().get(o6c.i);
                if (fd6Var == null) {
                    xq0.q("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
                    return;
                } else {
                    fkdVar.k = 1;
                    ((dw0) fd6Var).c(wn5Var, fkdVar);
                    return;
                }
            }
        }
        fkdVar = new fkd(cg6Var);
        Object obj2 = fkdVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = fkdVar.k;
        if (i2 == 0) {
        }
    }

    public static final boolean C(Context context, Intent intent) {
        intent.getClass();
        context.getClass();
        ComponentName component = intent.getComponent();
        return component != null && Intrinsics.d(context.getPackageName(), component.getPackageName());
    }

    public static final ArrayList D(tfo tfoVar, v80 v80Var, d6v d6vVar, boolean z) {
        v80Var.getClass();
        List<zfo> list = tfoVar.c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (zfo zfoVar : list) {
            arrayList.add(new jzs(zfoVar.a, v80Var, zfoVar.b, tfoVar.a, tfoVar.b, Boolean.valueOf(z), d6vVar, false));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable E(AppsFlyerLib appsFlyerLib, cg6 cg6Var) {
        zw0 zw0Var;
        int i2;
        DeepLink deepLink;
        if (cg6Var instanceof zw0) {
            zw0Var = (zw0) cg6Var;
            int i3 = zw0Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zw0Var.k = i3 - Integer.MIN_VALUE;
                Object obj = zw0Var.j;
                nm6 nm6Var = nm6.a;
                i2 = zw0Var.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    zw0Var.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(zw0Var));
                    zt3Var.s();
                    appsFlyerLib.subscribeForDeepLink(new yw0(zt3Var));
                    obj = zt3Var.q();
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                deepLink = (DeepLink) obj;
                Continuation continuation = null;
                ssg.a(3, "AppsFlyerDeeplinks", "DeepLink data: " + deepLink, null);
                if (deepLink != null) {
                    ssg.a(3, "AppsFlyerDeeplinks", "Deeplink is ".concat(Intrinsics.d(deepLink.isDeferred(), Boolean.TRUE) ? "deferred" : "direct"), null);
                    String deepLinkValue = deepLink.getDeepLinkValue();
                    v3w.l("DeepLink value: ", deepLinkValue, 3, "AppsFlyerDeeplinks", null);
                    String campaignId = deepLink.getCampaignId();
                    v3w.l("DeepLink campaign id: ", campaignId, 3, "AppsFlyerDeeplinks", null);
                    if (deepLinkValue != null && campaignId != null) {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(sw0.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        ww0 ww0Var = (ww0) ((sw0) qdcVar.C(I));
                        ww0Var.d.d(ww0.e[0], x97.y(ww0Var.b, null, null, new l5(ww0Var, campaignId, continuation, 21), 3));
                    }
                    if (deepLinkValue != null) {
                        return fqt.a(deepLinkValue, true, false);
                    }
                }
                return null;
            }
        }
        zw0Var = new zw0(cg6Var);
        Object obj2 = zw0Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = zw0Var.k;
        if (i2 != 0) {
        }
        deepLink = (DeepLink) obj2;
        Continuation continuation2 = null;
        ssg.a(3, "AppsFlyerDeeplinks", "DeepLink data: " + deepLink, null);
        if (deepLink != null) {
        }
        return null;
    }

    public static Activity F(Context context) {
        return (Activity) Preconditions.nonNull(G(context), "no activity context found in " + context + ", possibly app/service context is provided");
    }

    public static Activity G(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return G(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r8 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(pv0 pv0Var, Context context, cg6 cg6Var) {
        gkd gkdVar;
        int i2;
        pv0 pv0Var2;
        Iterator it;
        int i3;
        if (cg6Var instanceof gkd) {
            gkdVar = (gkd) cg6Var;
            int i4 = gkdVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gkdVar.n = i4 - Integer.MIN_VALUE;
                Object obj = gkdVar.m;
                Object obj2 = nm6.a;
                i2 = gkdVar.n;
                if (i2 != 0) {
                    qgg.h0(obj);
                    okd okdVar = new okd(context);
                    Class<?> cls = pv0Var.getClass();
                    gkdVar.j = pv0Var;
                    gkdVar.k = context;
                    gkdVar.n = 1;
                    obj = okdVar.a(cls, gkdVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = gkdVar.l;
                        context = gkdVar.k;
                        pv0Var2 = gkdVar.j;
                        qgg.h0(obj);
                        while (it.hasNext()) {
                            rkd rkdVar = (rkd) it.next();
                            gkdVar.j = pv0Var2;
                            gkdVar.k = context;
                            gkdVar.l = it;
                            gkdVar.n = 2;
                            pv0Var2.getClass();
                            if (!(rkdVar instanceof rv0) || (Integer.MIN_VALUE <= (i3 = ((rv0) rkdVar).a) && i3 < -1)) {
                                xq0.x("Invalid Glance ID");
                                return null;
                            }
                            Object i5 = pv0.i(pv0Var2, context, i3, gkdVar);
                            if (i5 != nm6.a) {
                                i5 = Unit.a;
                            }
                            if (i5 == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.a;
                    }
                    context = gkdVar.k;
                    pv0Var = gkdVar.j;
                    qgg.h0(obj);
                }
                pv0Var2 = pv0Var;
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        gkdVar = new gkd(cg6Var);
        Object obj3 = gkdVar.m;
        Object obj22 = nm6.a;
        i2 = gkdVar.n;
        if (i2 != 0) {
        }
        pv0Var2 = pv0Var;
        it = ((Iterable) obj3).iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public static final void a(u51 u51Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        agr agrVar;
        String str;
        boolean z;
        u9b u9bVar = u51Var.c;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1145239090);
        int i4 = i2 | (oq5Var.h(u51Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.valueOf((u9bVar != null ? u9bVar.a : null) != null));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            yci g2 = a.g(yciVar, hxe.b);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, g2);
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
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            vci vciVar = vci.a;
            yci b2 = d.b(d.d(vciVar, 1.0f), 1.0f);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                i3 = i4;
                yciVar2 = a.k(vciVar, 0.0f, 66, 1);
            } else {
                i3 = i4;
                yciVar2 = vciVar;
            }
            yci f2 = b2.f(yciVar2);
            float f3 = 24;
            yci u = xp3.u(f2, ugo.c(f3, f3));
            agr agrVar2 = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar2)).c.a;
            jzk jzkVar = vnj.i;
            ug3.a(androidx.compose.foundation.a.b(u, j2, jzkVar), oq5Var, 0);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(1073775904);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    oq5Var.Z(1073807741);
                    z = false;
                    ug3.a(androidx.compose.foundation.a.b(xp3.u(d.m(vciVar, 110), ugo.a), ((dq0) oq5Var.j(agrVar2)).c.c, jzkVar), oq5Var, 0);
                    oq5Var.p(false);
                    agrVar = agrVar2;
                } else {
                    oq5Var.Z(1074111262);
                    float f4 = 110;
                    yci u2 = xp3.u(d.m(vciVar, f4), ugo.a);
                    if (u9bVar == null) {
                        oq5Var.Z(1074296951);
                        oq5Var.p(false);
                        str = null;
                    } else {
                        oq5Var.Z(1835770058);
                        String e2 = u9bVar.e(ff7.K(f4, oq5Var), WebPath$Storage.AVATARS);
                        oq5Var.p(false);
                        str = e2;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new x80(aqiVar, 2);
                        oq5Var.k0(K2);
                    }
                    Function1 function1 = (Function1) K2;
                    agrVar = agrVar2;
                    irf.d(str2, u2, null, function1, oq5Var, 3072, 4);
                    z = false;
                    oq5Var.p(false);
                }
                oq5Var.p(z);
            } else {
                agrVar = agrVar2;
                oq5Var.Z(1074625273);
                ot0.f(0, 1, oq5Var, null);
                oq5Var.p(false);
            }
            float f5 = 16;
            u1g.l(oq5Var, d.e(vciVar, f5));
            xcs.b(rvf.N(R.string.artist_pick_onboarding_title, new Object[]{u51Var.b}, oq5Var), a.o(vciVar, f5, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 48, 0, 65016);
            u1g.l(oq5Var, d.e(vciVar, 8));
            xcs.b(rvf.M(R.string.artist_pick_onboarding_subtitle, oq5Var), a.o(vciVar, f5, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, f3));
            hdg.o(rvf.M(R.string.look, oq5Var), function0, d.e(a.q(d.d(vciVar, 1.0f), f5, 0.0f, f5, f5, 2), 56), 0.0f, oq5Var, (i3 & 112) | 384, 8);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(u51Var, function0, yciVar, i2, 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        if (r2.f(r14) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final sdr sdrVar, final List list, final int i2, final List list2, final Function0 function0, final Function1 function1, final Function2 function2, final cjc cjcVar, final boolean z, yci yciVar, sdr sdrVar2, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        final int i6;
        final Function1 function12;
        boolean z2;
        sdr sdrVar3;
        oq5 oq5Var;
        final yci yciVar2;
        final sdr sdrVar4;
        yci yciVar3;
        final sdr g0;
        Object K;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1193294219);
        char c2 = 4;
        if ((i3 & 6) == 0) {
            i5 = (oq5Var2.f(sdrVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i5 | (oq5Var2.f(list) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i6 = i2;
            i7 |= oq5Var2.d(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if ((i3 & 3072) == 0) {
            i7 |= oq5Var2.f(list2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            function12 = function1;
            i7 |= oq5Var2.h(function12) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function12 = function1;
        }
        if ((1572864 & i3) == 0) {
            i7 |= oq5Var2.h(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= oq5Var2.f(cjcVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i3) == 0) {
            z2 = z;
            i7 |= oq5Var2.g(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        int i8 = i7 | 805306368;
        if ((i4 & 1024) == 0) {
            sdrVar3 = sdrVar2;
        } else {
            sdrVar3 = sdrVar2;
        }
        c2 = 2;
        if (oq5Var2.P(i8 & 1, ((i8 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            oq5Var2.U();
            if ((i3 & 1) == 0 || oq5Var2.y()) {
                int i9 = i4 & 1024;
                yciVar3 = vci.a;
                if (i9 != 0) {
                    g0 = szf.g0(Boolean.FALSE);
                    oq5Var2.q();
                    K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = szf.U(new wf3(cjcVar, 0));
                        oq5Var2.k0(K);
                    }
                    final sdr sdrVar5 = (sdr) K;
                    final long a2 = svd.a(oq5Var2);
                    final String M = rvf.M(R.string.has_notification, oq5Var2);
                    final yci yciVar4 = yciVar3;
                    final boolean z3 = z2;
                    oq5Var = oq5Var2;
                    etn.l(t2b.a.a(null), ild.C(-105485899, new Function2() { // from class: yf3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z4;
                            kjn kjnVar;
                            Function1 function13;
                            vci vciVar;
                            List list3;
                            boolean z5;
                            boolean z6;
                            boolean z7;
                            vci vciVar2;
                            boolean z8;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                long j2 = a2;
                                boolean e2 = oq5Var3.e(j2);
                                cjc cjcVar2 = cjcVar;
                                boolean f2 = e2 | oq5Var3.f(cjcVar2);
                                Object K2 = oq5Var3.K();
                                kjn kjnVar2 = gq5.a;
                                if (f2 || K2 == kjnVar2) {
                                    K2 = new mm0(j2, cjcVar2, 3);
                                    oq5Var3.k0(K2);
                                }
                                yci t = wyf.t(yci.this, (Function0) K2);
                                kfh d2 = ug3.d(b2c.b, true);
                                int i10 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H = vnj.H(oq5Var3, t);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar);
                                } else {
                                    oq5Var3.n0();
                                }
                                kb5 kb5Var = wp5.f;
                                g0g.U(oq5Var3, d2, kb5Var);
                                kb5 kb5Var2 = wp5.e;
                                g0g.U(oq5Var3, l2, kb5Var2);
                                kb5 kb5Var3 = wp5.g;
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i10))) {
                                    ouj.x(i10, oq5Var3, i10, kb5Var3);
                                }
                                kb5 kb5Var4 = wp5.d;
                                g0g.U(oq5Var3, H, kb5Var4);
                                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                                int i11 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                                vci vciVar3 = vci.a;
                                yci H2 = vnj.H(oq5Var3, vciVar3);
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, a3, kb5Var);
                                g0g.U(oq5Var3, l3, kb5Var2);
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i11))) {
                                    ouj.x(i11, oq5Var3, i11, kb5Var3);
                                }
                                g0g.U(oq5Var3, H2, kb5Var4);
                                yci q = a.q(d.e(d.d(gut.p1(vciVar3), 1.0f), ild.v(oq5Var3)), 6, 0.0f, 4, 0.0f, 10);
                                nho a4 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                                int i12 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                                yci H3 = vnj.H(oq5Var3, q);
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, a4, kb5Var);
                                g0g.U(oq5Var3, l4, kb5Var2);
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i12))) {
                                    ouj.x(i12, oq5Var3, i12, kb5Var3);
                                }
                                g0g.U(oq5Var3, H3, kb5Var4);
                                if (((Boolean) oq5Var3.j((agr) dlg.d.c)).booleanValue()) {
                                    z4 = false;
                                    oq5Var3.Z(529387533);
                                } else {
                                    oq5Var3.Z(537289185);
                                    u1g.l(oq5Var3, d.m(vciVar3, 48));
                                    z4 = false;
                                }
                                oq5Var3.p(z4);
                                boolean booleanValue = ((Boolean) sdrVar5.getValue()).booleanValue();
                                boolean z9 = z3;
                                List list4 = list;
                                Function1 function14 = function12;
                                qho qhoVar = qho.a;
                                if (booleanValue) {
                                    oq5Var3.Z(537485477);
                                    boolean z10 = list4.size() > 1;
                                    sdr sdrVar6 = sdrVar;
                                    if (z10) {
                                        oq5Var3.Z(537527389);
                                        if (z9) {
                                            oq5Var3.Z(537562481);
                                            String str = (String) sdrVar6.getValue();
                                            yci q2 = a.q(qhoVar.a(1.0f, vciVar3, true), 12, 0.0f, 0.0f, 0.0f, 14);
                                            boolean f3 = oq5Var3.f(cjcVar2);
                                            Object K3 = oq5Var3.K();
                                            if (f3 || K3 == kjnVar2) {
                                                K3 = new wf3(cjcVar2, 1);
                                                oq5Var3.k0(K3);
                                            }
                                            sj2.i(0, oq5Var3, wyf.s(q2, (Function0) K3), str);
                                            oq5Var3.p(false);
                                            z8 = false;
                                            kjnVar = kjnVar2;
                                            function13 = function14;
                                            vciVar2 = vciVar3;
                                            list3 = list4;
                                        } else {
                                            oq5Var3.Z(538010803);
                                            yci a5 = qhoVar.a(1.0f, vciVar3, true);
                                            boolean f4 = oq5Var3.f(cjcVar2);
                                            Object K4 = oq5Var3.K();
                                            if (f4 || K4 == kjnVar2) {
                                                K4 = new wf3(cjcVar2, 2);
                                                oq5Var3.k0(K4);
                                            }
                                            yci s = wyf.s(a5, (Function0) K4);
                                            vciVar2 = vciVar3;
                                            kjnVar = kjnVar2;
                                            hdg.w(list4, i6, function14, s, false, false, false, 0L, 0L, false, null, oq5Var3, 0, 4080);
                                            list3 = list4;
                                            function13 = function14;
                                            oq5Var3 = oq5Var3;
                                            z8 = false;
                                            oq5Var3.p(false);
                                        }
                                        oq5Var3.p(z8);
                                        z7 = z8;
                                        vciVar = vciVar2;
                                    } else {
                                        kjnVar = kjnVar2;
                                        function13 = function14;
                                        vciVar = vciVar3;
                                        list3 = list4;
                                        if (z10) {
                                            throw vz1.i(oq5Var3, -121209091, false);
                                        }
                                        oq5Var3.Z(538578289);
                                        String str2 = (String) sdrVar6.getValue();
                                        yci q3 = a.q(qhoVar.a(1.0f, vciVar, true), 12, 0.0f, 0.0f, 0.0f, 14);
                                        boolean f5 = oq5Var3.f(cjcVar2);
                                        Object K5 = oq5Var3.K();
                                        if (f5 || K5 == kjnVar) {
                                            K5 = new wf3(cjcVar2, 3);
                                            oq5Var3.k0(K5);
                                        }
                                        z7 = false;
                                        sj2.i(0, oq5Var3, wyf.s(q3, (Function0) K5), str2);
                                        oq5Var3.p(false);
                                    }
                                    oq5Var3.p(z7);
                                    z5 = true;
                                } else {
                                    kjnVar = kjnVar2;
                                    function13 = function14;
                                    vciVar = vciVar3;
                                    list3 = list4;
                                    if (booleanValue) {
                                        throw vz1.i(oq5Var3, -121210639, false);
                                    }
                                    oq5Var3.Z(-121159077);
                                    z5 = true;
                                    u1g.l(oq5Var3, qhoVar.a(1.0f, vciVar, true));
                                    oq5Var3.p(false);
                                }
                                aae.a(function0, null, false, kg5.d, oq5Var3, 24576, 14);
                                oq5Var3.p(z5);
                                if (z9 && ((Boolean) g0.getValue()).booleanValue()) {
                                    oq5Var3.Z(-1333170168);
                                    yci d3 = d.d(d.e(vciVar, ild.v(oq5Var3)), 1.0f);
                                    boolean f6 = oq5Var3.f(cjcVar2);
                                    Object K6 = oq5Var3.K();
                                    if (f6 || K6 == kjnVar) {
                                        K6 = new wf3(cjcVar2, 4);
                                        oq5Var3.k0(K6);
                                    }
                                    oq5 oq5Var4 = oq5Var3;
                                    hag.h(list3, ild.C(-504274828, new ln1(list2, M, function2, function13, 1), oq5Var3), wyf.s(d3, (Function0) K6), false, false, oq5Var4, 48);
                                    oq5Var3 = oq5Var4;
                                    z6 = false;
                                } else {
                                    z6 = false;
                                    oq5Var3.Z(-1343731031);
                                }
                                oq5Var3.p(z6);
                                oq5Var3.p(true);
                                oq5Var3.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            return Unit.a;
                        }
                    }, oq5Var), oq5Var, 56);
                    yciVar2 = yciVar4;
                    sdrVar4 = g0;
                }
            } else {
                oq5Var2.S();
                yciVar3 = yciVar;
            }
            g0 = sdrVar3;
            oq5Var2.q();
            K = oq5Var2.K();
            if (K == gq5.a) {
            }
            final sdr sdrVar52 = (sdr) K;
            final long a22 = svd.a(oq5Var2);
            final String M2 = rvf.M(R.string.has_notification, oq5Var2);
            final yci yciVar42 = yciVar3;
            final boolean z32 = z2;
            oq5Var = oq5Var2;
            etn.l(t2b.a.a(null), ild.C(-105485899, new Function2() { // from class: yf3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    kjn kjnVar;
                    Function1 function13;
                    vci vciVar;
                    List list3;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    vci vciVar2;
                    boolean z8;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                        long j2 = a22;
                        boolean e2 = oq5Var3.e(j2);
                        cjc cjcVar2 = cjcVar;
                        boolean f2 = e2 | oq5Var3.f(cjcVar2);
                        Object K2 = oq5Var3.K();
                        kjn kjnVar2 = gq5.a;
                        if (f2 || K2 == kjnVar2) {
                            K2 = new mm0(j2, cjcVar2, 3);
                            oq5Var3.k0(K2);
                        }
                        yci t = wyf.t(yci.this, (Function0) K2);
                        kfh d2 = ug3.d(b2c.b, true);
                        int i10 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                        yci H = vnj.H(oq5Var3, t);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar);
                        } else {
                            oq5Var3.n0();
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var3, d2, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var3, l2, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i10))) {
                            ouj.x(i10, oq5Var3, i10, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var3, H, kb5Var4);
                        ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                        int i11 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                        vci vciVar3 = vci.a;
                        yci H2 = vnj.H(oq5Var3, vciVar3);
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(oq5Var3, a3, kb5Var);
                        g0g.U(oq5Var3, l3, kb5Var2);
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i11))) {
                            ouj.x(i11, oq5Var3, i11, kb5Var3);
                        }
                        g0g.U(oq5Var3, H2, kb5Var4);
                        yci q = a.q(d.e(d.d(gut.p1(vciVar3), 1.0f), ild.v(oq5Var3)), 6, 0.0f, 4, 0.0f, 10);
                        nho a4 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                        int i12 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                        yci H3 = vnj.H(oq5Var3, q);
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(oq5Var3, a4, kb5Var);
                        g0g.U(oq5Var3, l4, kb5Var2);
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i12))) {
                            ouj.x(i12, oq5Var3, i12, kb5Var3);
                        }
                        g0g.U(oq5Var3, H3, kb5Var4);
                        if (((Boolean) oq5Var3.j((agr) dlg.d.c)).booleanValue()) {
                            z4 = false;
                            oq5Var3.Z(529387533);
                        } else {
                            oq5Var3.Z(537289185);
                            u1g.l(oq5Var3, d.m(vciVar3, 48));
                            z4 = false;
                        }
                        oq5Var3.p(z4);
                        boolean booleanValue = ((Boolean) sdrVar52.getValue()).booleanValue();
                        boolean z9 = z32;
                        List list4 = list;
                        Function1 function14 = function12;
                        qho qhoVar = qho.a;
                        if (booleanValue) {
                            oq5Var3.Z(537485477);
                            boolean z10 = list4.size() > 1;
                            sdr sdrVar6 = sdrVar;
                            if (z10) {
                                oq5Var3.Z(537527389);
                                if (z9) {
                                    oq5Var3.Z(537562481);
                                    String str = (String) sdrVar6.getValue();
                                    yci q2 = a.q(qhoVar.a(1.0f, vciVar3, true), 12, 0.0f, 0.0f, 0.0f, 14);
                                    boolean f3 = oq5Var3.f(cjcVar2);
                                    Object K3 = oq5Var3.K();
                                    if (f3 || K3 == kjnVar2) {
                                        K3 = new wf3(cjcVar2, 1);
                                        oq5Var3.k0(K3);
                                    }
                                    sj2.i(0, oq5Var3, wyf.s(q2, (Function0) K3), str);
                                    oq5Var3.p(false);
                                    z8 = false;
                                    kjnVar = kjnVar2;
                                    function13 = function14;
                                    vciVar2 = vciVar3;
                                    list3 = list4;
                                } else {
                                    oq5Var3.Z(538010803);
                                    yci a5 = qhoVar.a(1.0f, vciVar3, true);
                                    boolean f4 = oq5Var3.f(cjcVar2);
                                    Object K4 = oq5Var3.K();
                                    if (f4 || K4 == kjnVar2) {
                                        K4 = new wf3(cjcVar2, 2);
                                        oq5Var3.k0(K4);
                                    }
                                    yci s = wyf.s(a5, (Function0) K4);
                                    vciVar2 = vciVar3;
                                    kjnVar = kjnVar2;
                                    hdg.w(list4, i6, function14, s, false, false, false, 0L, 0L, false, null, oq5Var3, 0, 4080);
                                    list3 = list4;
                                    function13 = function14;
                                    oq5Var3 = oq5Var3;
                                    z8 = false;
                                    oq5Var3.p(false);
                                }
                                oq5Var3.p(z8);
                                z7 = z8;
                                vciVar = vciVar2;
                            } else {
                                kjnVar = kjnVar2;
                                function13 = function14;
                                vciVar = vciVar3;
                                list3 = list4;
                                if (z10) {
                                    throw vz1.i(oq5Var3, -121209091, false);
                                }
                                oq5Var3.Z(538578289);
                                String str2 = (String) sdrVar6.getValue();
                                yci q3 = a.q(qhoVar.a(1.0f, vciVar, true), 12, 0.0f, 0.0f, 0.0f, 14);
                                boolean f5 = oq5Var3.f(cjcVar2);
                                Object K5 = oq5Var3.K();
                                if (f5 || K5 == kjnVar) {
                                    K5 = new wf3(cjcVar2, 3);
                                    oq5Var3.k0(K5);
                                }
                                z7 = false;
                                sj2.i(0, oq5Var3, wyf.s(q3, (Function0) K5), str2);
                                oq5Var3.p(false);
                            }
                            oq5Var3.p(z7);
                            z5 = true;
                        } else {
                            kjnVar = kjnVar2;
                            function13 = function14;
                            vciVar = vciVar3;
                            list3 = list4;
                            if (booleanValue) {
                                throw vz1.i(oq5Var3, -121210639, false);
                            }
                            oq5Var3.Z(-121159077);
                            z5 = true;
                            u1g.l(oq5Var3, qhoVar.a(1.0f, vciVar, true));
                            oq5Var3.p(false);
                        }
                        aae.a(function0, null, false, kg5.d, oq5Var3, 24576, 14);
                        oq5Var3.p(z5);
                        if (z9 && ((Boolean) g0.getValue()).booleanValue()) {
                            oq5Var3.Z(-1333170168);
                            yci d3 = d.d(d.e(vciVar, ild.v(oq5Var3)), 1.0f);
                            boolean f6 = oq5Var3.f(cjcVar2);
                            Object K6 = oq5Var3.K();
                            if (f6 || K6 == kjnVar) {
                                K6 = new wf3(cjcVar2, 4);
                                oq5Var3.k0(K6);
                            }
                            oq5 oq5Var4 = oq5Var3;
                            hag.h(list3, ild.C(-504274828, new ln1(list2, M2, function2, function13, 1), oq5Var3), wyf.s(d3, (Function0) K6), false, false, oq5Var4, 48);
                            oq5Var3 = oq5Var4;
                            z6 = false;
                        } else {
                            z6 = false;
                            oq5Var3.Z(-1343731031);
                        }
                        oq5Var3.p(z6);
                        oq5Var3.p(true);
                        oq5Var3.p(true);
                    } else {
                        oq5Var3.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 56);
            yciVar2 = yciVar42;
            sdrVar4 = g0;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
            sdrVar4 = sdrVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: zf3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sj2.b(sdr.this, list, i2, list2, function0, function1, function2, cjcVar, z, yciVar2, sdrVar4, (hq5) obj, rvf.R(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(522736797);
        if ((((oq5Var.g(z) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = 2;
            u1g.l(oq5Var, androidx.compose.foundation.a.b(xp3.u(a.o(d.r(d.e(vci.a, 4), 24), f2, 0.0f, 2), ugo.a(f2)), z ? d85.f : d85.b(d85.f, 0.078f, 0.0f, 0.0f, 0.0f, 14), vnj.i));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sm(i2, 10, z);
        }
    }

    public static final void d(int i2, int i3, int i4, hq5 hq5Var, yci yciVar) {
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1915978341);
        if ((i4 & 6) == 0) {
            i5 = (oq5Var.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= oq5Var.d(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci c2 = d.c(a.m(yciVar, 8), 1.0f);
            nho a2 = lho.a(qx0.e, b2c.k, oq5Var, 6);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(1672332768);
            int i7 = 0;
            while (true) {
                boolean z = true;
                if (i7 >= i2) {
                    break;
                }
                if (i7 != i3) {
                    z = false;
                }
                c(z, oq5Var, 0);
                i7++;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sy3(i2, i3, yciVar, i4);
        }
    }

    public static final void e(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(587921489);
        if ((((oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u1g.l(oq5Var, p(d.b(d.d(yciVar, 0.45f), 1.0f), function0, oq5Var));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i2, 3);
        }
    }

    public static final void f(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1903236745);
        if ((((oq5Var.h(function0) ? 256 : 128) | i2 | (oq5Var.f(yciVar) ? 2048 : 1024)) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci b2 = d.b(yciVar, 1.0f);
            if (0.5f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, p(b2.f(new LayoutWeightElement(true, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f)), function0, oq5Var));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i2, 4);
        }
    }

    public static final void g(sub subVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        yci yciVar2;
        aqi aqiVar;
        ayn aynVar;
        u6k u6kVar;
        vci vciVar;
        sub subVar2 = subVar;
        subVar2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1770645305);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(subVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (oq5Var2.P(i4 & 1, (i4 & 19) != 18)) {
            Object value = gld.M(subVar2.c, oq5Var2).getValue();
            gdn gdnVar = value instanceof gdn ? (gdn) value : null;
            if (gdnVar == null) {
                xmn r = oq5Var2.r();
                if (r != null) {
                    r.d = new i4(subVar2, i2);
                    return;
                }
                return;
            }
            boolean f2 = oq5Var2.f(gdnVar);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (f2 || K == obj) {
                K = szf.g0(gdnVar.a);
                oq5Var2.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            fvf a2 = hvf.a(gdnVar.b, 0, oq5Var2, 0, 2);
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = szf.g0(null);
                oq5Var2.k0(K2);
            }
            aqi aqiVar3 = (aqi) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = szf.g0(null);
                oq5Var2.k0(K3);
            }
            aqi aqiVar4 = (aqi) K3;
            boolean f3 = oq5Var2.f(aqiVar2) | oq5Var2.h(subVar2);
            Object K4 = oq5Var2.K();
            if (f3 || K4 == obj) {
                K4 = new ny2(25, subVar2, aqiVar2);
                oq5Var2.k0(K4);
            }
            Function1 function1 = (Function1) K4;
            boolean f4 = oq5Var2.f(aqiVar2);
            Object K5 = oq5Var2.K();
            if (f4 || K5 == obj) {
                K5 = new qub(aqiVar3, aqiVar4, aqiVar2, null);
                oq5Var2.k0(K5);
            }
            ayn B = s7g.B(a2, (ryc) K5, oq5Var2, 0);
            Boolean valueOf = Boolean.valueOf(B.g());
            boolean f5 = oq5Var2.f(B) | oq5Var2.h(subVar2);
            Object K6 = oq5Var2.K();
            if (f5 || K6 == obj) {
                aqiVar = aqiVar4;
                Object v24Var = new v24((Object) B, aqiVar3, aqiVar, (Object) subVar2, (Continuation) null, 5);
                oq5Var2.k0(v24Var);
                K6 = v24Var;
            } else {
                aqiVar = aqiVar4;
            }
            gld.w(oq5Var2, valueOf, (Function2) K6);
            Object K7 = oq5Var2.K();
            if (K7 == obj) {
                K7 = k5r.h(0, oq5Var2);
            }
            u6k u6kVar2 = (u6k) K7;
            boolean h2 = oq5Var2.h(subVar2);
            Object K8 = oq5Var2.K();
            if (h2 || K8 == obj) {
                aynVar = B;
                u6kVar = u6kVar2;
                Object d57Var = new d57(u6kVar, aqiVar3, aqiVar, subVar2, (Continuation) null, 7);
                oq5Var2.k0(d57Var);
                K8 = d57Var;
            } else {
                aynVar = B;
                u6kVar = u6kVar2;
            }
            gld.w(oq5Var2, u6kVar, (Function2) K8);
            WeakHashMap weakHashMap = rqv.w;
            vm C = ghh.C(p6g.n(z7l.h(oq5Var2).e, oq5Var2), a.c(0.0f, tt0.F(oq5Var2), 0.0f, 0.0f, 13));
            nx0 g2 = qx0.g(8);
            vci vciVar2 = vci.a;
            yci c2 = d.c(vciVar2, 1.0f);
            boolean f6 = oq5Var2.f(aqiVar2) | oq5Var2.f(aynVar) | oq5Var2.h(subVar2) | oq5Var2.h(gdnVar) | oq5Var2.f(function1);
            Object K9 = oq5Var2.K();
            if (f6 || K9 == obj) {
                vciVar = vciVar2;
                Object lubVar = new lub(aqiVar2, aynVar, gdnVar, function1, subVar2, u6kVar, aqiVar3, aqiVar);
                subVar2 = subVar2;
                oq5Var2.k0(lubVar);
                K9 = lubVar;
            } else {
                vciVar = vciVar2;
            }
            oq5Var = oq5Var2;
            weo.f(c2, a2, C, g2, null, null, false, null, (Function1) K9, oq5Var, 24576, 488);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new gva(subVar2, yciVar2, i2, 5);
        }
    }

    public static final void h(ArrayList arrayList, zef zefVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        zefVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2066657097);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(zefVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "playlists_list");
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(zefVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(6, arrayList, zefVar);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 14, arrayList, zefVar, fvfVar, o0kVar);
        }
    }

    public static final void i(int i2, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1918560104);
        int i3 = (oq5Var2.f(str) ? 4 : 2) | i2 | (oq5Var2.f(yciVar) ? 32 : 16);
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            oq5Var = oq5Var2;
            xcs.b(str == null ? "" : str, yciVar, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.g(), oq5Var, i3 & 112, 3120, 55288);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i2, 2);
        }
    }

    public static final void j(aqi aqiVar, aqi aqiVar2, aqi aqiVar3, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (aqiVar.getValue() == null) {
            aqiVar.setValue(Integer.valueOf(i2));
            aqiVar2.setValue(Integer.valueOf(i3));
        } else {
            aqiVar2.setValue(Integer.valueOf(i3));
        }
        if (i2 < 0 || i2 >= ((List) aqiVar3.getValue()).size() || i3 < 0 || i3 >= ((List) aqiVar3.getValue()).size()) {
            return;
        }
        ArrayList y0 = CollectionsKt.y0((List) aqiVar3.getValue());
        y0.add(i3, y0.remove(i2));
        aqiVar3.setValue(y0);
    }

    public static final void k(aqi aqiVar, aqi aqiVar2, sub subVar) {
        Integer num = (Integer) aqiVar.getValue();
        Integer num2 = (Integer) aqiVar2.getValue();
        if (num == null || num2 == null) {
            return;
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        fdn fdnVar = subVar.a;
        if (intValue != intValue2) {
            fdnVar.b.a(new MovePlayableCommand(intValue, intValue2), new b3t("queue_move"));
        }
        aqiVar.setValue(null);
        aqiVar2.setValue(null);
    }

    public static final void l(View view, mpf mpfVar) {
        long S = ((ane) mpfVar.F.c).S(0L);
        int round = Math.round(Float.intBitsToFloat((int) (S >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (S & 4294967295L)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    public static final boolean m(n7q n7qVar, aab aabVar) {
        if (aabVar instanceof lt) {
            return wct.E(n7qVar, ((lt) aabVar).a, i3q.a, null, 12);
        }
        if (aabVar instanceof u51) {
            return zc4.K(n7qVar, ((u51) aabVar).a, k3q.a, null);
        }
        if (aabVar instanceof eul) {
            return szf.f0(n7qVar, ((eul) aabVar).d(), o3q.b, null, null, 28);
        }
        b6e.s();
        return false;
    }

    public static final pkb n(g6v g6vVar, pkb pkbVar) {
        g6vVar.getClass();
        String str = g6vVar.b;
        h6v[] h6vVarArr = h6v.a;
        return str.equals("concert") ? pkb.Concert : str.equals("donation") ? pkb.Donation : str.equals("audiobook") ? pkb.Audiobook : str.equals("fact") ? pkb.Fact : pkbVar;
    }

    public static final thj o(m6v m6vVar) {
        String str;
        m6vVar.getClass();
        g6v g6vVar = m6vVar.f;
        String str2 = g6vVar.a;
        n6v n6vVar = m6vVar.e;
        if (n6vVar == null || (str = n6vVar.f) == null) {
            str = "";
        }
        return new thj(n(g6vVar, pkb.Fact), str2, 1, 1, str);
    }

    public static final yci p(yci yciVar, Function0 function0, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = vz1.h(oq5Var);
        }
        return androidx.compose.foundation.a.d(yciVar, (uoi) K, null, false, null, null, function0, 28);
    }

    public static final by7 q(vdr vdrVar, vdr vdrVar2, Function2 function2) {
        vdrVar.getClass();
        vdrVar2.getClass();
        return new by7(new vd(12, function2, vdrVar, vdrVar2), new u21(10, vdrVar, vdrVar2, new za5(function2, null, 1)), 0);
    }

    public static final rmb r(tmb tmbVar, int i2, int i3) {
        tmbVar.getClass();
        return tmbVar.a(new jab(qkb.ConcertTabFeed, 1, i2, i3), null);
    }

    public static final rmb s(tmb tmbVar, int i2) {
        tmbVar.getClass();
        return tmbVar.a(new jab(qkb.ConcertTabHeader, 1, 1, i2), null);
    }

    public static final boolean t(dp8 dp8Var, String str) {
        dp8Var.getClass();
        List n2 = dp8Var.n();
        if (n2 == null) {
            return false;
        }
        List list = n2;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((rx8) it.next()).a, str)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized Executor u() {
        ExecutorService executorService;
        synchronized (sj2.class) {
            try {
                if (a == null) {
                    int i2 = dvt.a;
                    a = Executors.newSingleThreadExecutor(new y36("ExoPlayer:BackgroundExecutor", 3));
                }
                executorService = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static Drawable v(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (p) {
                return y(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i2);
        } catch (NoClassDefFoundError unused2) {
            p = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = e3o.a;
        return resources.getDrawable(i2, theme);
    }

    public static PlaybackScope w(Intent intent, PlaybackScope playbackScope) {
        intent.getClass();
        playbackScope.getClass();
        PlaybackScope playbackScope2 = (PlaybackScope) intent.getSerializableExtra("extra.playbackScope");
        if (Intrinsics.d(playbackScope2, PlaybackScope.a)) {
            playbackScope2 = null;
        }
        return playbackScope2 == null ? playbackScope : playbackScope2;
    }

    public static boolean x(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (l == null) {
            l = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        l.booleanValue();
        if (m == null) {
            m = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (m.booleanValue()) {
            return !fxf.F() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static Drawable y(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            uf6 uf6Var = new uf6(context, theme);
            uf6Var.a(theme.getResources().getConfiguration());
            context = uf6Var;
        }
        return y2x.w(context, i2);
    }

    public static final void z(String str) {
        ksg hilVar;
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    try {
                        Log.isLoggable("", 3);
                        hilVar = new e88(13);
                    } catch (Throwable unused) {
                        hilVar = new hil();
                    }
                    i = hilVar;
                }
            }
        }
        ksg ksgVar = i;
        if (ksgVar != null) {
            ksgVar.b(str);
        } else {
            xq0.x("Required value was null.");
        }
    }
}
