package ru.yandex.video.m3.player;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import defpackage.a4g;
import defpackage.ak0;
import defpackage.anf;
import defpackage.avj;
import defpackage.b8w;
import defpackage.bl;
import defpackage.bpe;
import defpackage.bt2;
import defpackage.btf;
import defpackage.c5b;
import defpackage.c5p;
import defpackage.ca8;
import defpackage.cbw;
import defpackage.d1;
import defpackage.e3s;
import defpackage.e5;
import defpackage.ecl;
import defpackage.eph;
import defpackage.f4m;
import defpackage.fc4;
import defpackage.fcl;
import defpackage.fu3;
import defpackage.g8c;
import defpackage.gcl;
import defpackage.gld;
import defpackage.h1b;
import defpackage.hgl;
import defpackage.hjp;
import defpackage.hjq;
import defpackage.hxo;
import defpackage.j08;
import defpackage.jml;
import defpackage.jsg;
import defpackage.jt7;
import defpackage.jyr;
import defpackage.jzi;
import defpackage.k08;
import defpackage.kg7;
import defpackage.kmr;
import defpackage.kzn;
import defpackage.l48;
import defpackage.le3;
import defpackage.mnn;
import defpackage.mqa;
import defpackage.mxj;
import defpackage.n6c;
import defpackage.n6w;
import defpackage.ncs;
import defpackage.odl;
import defpackage.olr;
import defpackage.ovc;
import defpackage.paw;
import defpackage.plr;
import defpackage.pv9;
import defpackage.qp3;
import defpackage.r0o;
import defpackage.rdc;
import defpackage.rdk;
import defpackage.rgl;
import defpackage.s7j;
import defpackage.t6j;
import defpackage.t7j;
import defpackage.tao;
import defpackage.tf6;
import defpackage.tyf;
import defpackage.u13;
import defpackage.u75;
import defpackage.ujl;
import defpackage.vlm;
import defpackage.vpl;
import defpackage.wfb;
import defpackage.wzv;
import defpackage.x48;
import defpackage.x97;
import defpackage.xeb;
import defpackage.xnm;
import defpackage.xq0;
import defpackage.xq5;
import defpackage.y0t;
import defpackage.y6v;
import defpackage.yr7;
import defpackage.z9p;
import defpackage.zr7;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.player.scaling.ScalingMode;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class d {
    public Context a;
    public tao b;
    public b c;
    public boolean d;
    public boolean e;
    public tyf f;
    public c5p i;
    public boolean l;
    public final ScalingMode g = ScalingMode.DEFAULT;
    public String h = "";
    public c5p j = new c5p(3);
    public final g8c k = new g8c(new l48(21));
    public final jyr m = btf.b(b8w.v);

    /* JADX WARN: Multi-variable type inference failed */
    public final paw a(String str) {
        boolean z;
        OkHttpClient okHttpClient;
        d1 A;
        Looper looper;
        List split$default;
        jzi jziVar;
        tyf tyfVar;
        j08 j08Var;
        Context context = this.a;
        b bVar = this.c;
        tao taoVar = this.b;
        tyf tyfVar2 = this.f;
        if (context != null && k08.a == null && (j08Var = k08.c) != null) {
            AppMetricaYandex.requestStartupParams(context, j08Var, "appmetrica_device_id");
        }
        if (context == null) {
            xq0.q("Please specify context");
            return null;
        }
        if (bVar == null) {
            xq0.q("Please specify PlayerDelegateFactory");
            return null;
        }
        if (taoVar == null) {
            xq0.q("Please specify PlayerStrategyFactory");
            return null;
        }
        if (tyfVar2 == null) {
            xq0.q("Please specify StrmManagerConfig");
            return null;
        }
        if (this.e && !this.d) {
            xq0.q("experimentalDoAutoPlayLogicInsidePlayer supports only with optimizeCommandExecution");
            return null;
        }
        Timber.INSTANCE.w("MetricsManager is not specified; Please, specify it to report speed metrics", new Object[0]);
        String c = str == null ? new jml(new ujl()).c("AND") : str;
        vpl vplVar = rdk.h;
        synchronized (vplVar) {
            z = rdk.i != null;
        }
        if (z) {
            rdk rdkVar = rdk.i;
            if (rdkVar != null) {
                A = rdkVar.A(c);
            }
            A = null;
        } else {
            zr7 zr7Var = tyfVar2 instanceof zr7 ? (zr7) tyfVar2 : null;
            if (zr7Var == null || (okHttpClient = zr7Var.b) == null) {
                okHttpClient = (OkHttpClient) this.m.getValue();
            }
            vplVar.b(context, new hxo(27, okHttpClient));
            rdk rdkVar2 = rdk.i;
            if (rdkVar2 != null) {
                A = rdkVar2.A(c);
            }
            A = null;
        }
        if (A == null) {
            A = d1.g;
        }
        rdc rdcVar = new rdc(this.d ? new ThreadPoolExecutor(1, 1, Long.MAX_VALUE, TimeUnit.DAYS, new LinkedBlockingQueue(), new jt7(5)) : new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new jt7(6)), 2);
        SharedPreferences V = e3s.e.V(context);
        e5 e5Var = new e5(new jzi(V), new f4m(V));
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        pv9 pv9Var = new pv9(new Handler(mainLooper));
        bt2 kznVar = A.b.y ? new kzn() : s7j.a;
        mnn c2 = kznVar.c("YandexPlayerBuilder", new anf(50));
        xq5 xq5Var = new xq5();
        fc4 fc4Var = new fc4();
        xq5Var.a(fc4Var);
        if (fc4Var instanceof rgl) {
            xq5Var.b.add((rgl) fc4Var);
        }
        eph ephVar = new eph();
        xq5Var.a(ephVar);
        xq5Var.b.add(ephVar);
        t7j t7jVar = new t7j();
        xq5Var.a(t7jVar);
        xq5Var.b.add(t7jVar);
        mxj mxjVar = new mxj();
        xq5Var.a(mxjVar);
        if (mxjVar instanceof rgl) {
            xq5Var.b.add((rgl) mxjVar);
        }
        z9p z9pVar = new z9p();
        xq5Var.a(z9pVar);
        if (z9pVar instanceof rgl) {
            xq5Var.b.add((rgl) z9pVar);
        }
        n6w n6wVar = new n6w();
        xq5Var.a(n6wVar);
        if (n6wVar instanceof rgl) {
            xq5Var.b.add((rgl) n6wVar);
        }
        fu3 fu3Var = new fu3();
        xq5Var.a(fu3Var);
        if (fu3Var instanceof rgl) {
            xq5Var.b.add((rgl) fu3Var);
        }
        xeb xebVar = new xeb();
        xq5Var.a(xebVar);
        if (xebVar instanceof rgl) {
            xq5Var.b.add((rgl) xebVar);
        }
        xnm xnmVar = new xnm();
        xq5Var.a(xnmVar);
        if (xnmVar instanceof rgl) {
            xq5Var.b.add((rgl) xnmVar);
        }
        kmr kmrVar = new kmr();
        xq5Var.a(kmrVar);
        if (kmrVar instanceof rgl) {
            xq5Var.b.add((rgl) kmrVar);
        }
        if (StringsKt.U(this.h)) {
            looper = mainLooper;
        } else {
            if (this.h.equals("*")) {
                split$default = u75.h("Cache", "Drm", "NoInternetConnection", "QueueSecureInputBuffer", "DequeueInputBuffer", "DequeueOutputBuffer", "FailedReleaseOutputBuffer", "InstantiatingDecoder", "FrameDropDetected", "PreferH264HandlingRule");
                looper = mainLooper;
            } else {
                looper = mainLooper;
                split$default = StringsKt__StringsKt.split$default(this.h, new String[]{StringUtils.COMMA}, false, 0, 6, null);
            }
            if (split$default.contains("InstantiatingDecoder")) {
                bpe bpeVar = new bpe();
                xq5Var.a(bpeVar);
                if (bpeVar instanceof rgl) {
                    xq5Var.b.add((rgl) bpeVar);
                }
            }
            if (split$default.contains("Cache")) {
                qp3 qp3Var = new qp3();
                xq5Var.a(qp3Var);
                xq5Var.b.add(qp3Var);
            }
            if (split$default.contains("Drm")) {
                mqa mqaVar = new mqa();
                xq5Var.a(mqaVar);
                if (mqaVar instanceof rgl) {
                    xq5Var.b.add((rgl) mqaVar);
                }
            }
            if (split$default.contains("NoInternetConnection")) {
                t6j t6jVar = new t6j();
                xq5Var.a(t6jVar);
                xq5Var.b.add(t6jVar);
            }
            if (split$default.contains("QueueSecureInputBuffer")) {
                wfb wfbVar = new wfb(PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer.class);
                xq5Var.a(wfbVar);
                if (wfbVar instanceof rgl) {
                    xq5Var.b.add((rgl) wfbVar);
                }
            }
            if (split$default.contains("DequeueInputBuffer")) {
                wfb wfbVar2 = new wfb(PlaybackException.ErrorInRenderer.FailedDequeueInputBuffer.class);
                xq5Var.a(wfbVar2);
                if (wfbVar2 instanceof rgl) {
                    xq5Var.b.add((rgl) wfbVar2);
                }
            }
            if (split$default.contains("DequeueOutputBuffer")) {
                wfb wfbVar3 = new wfb(PlaybackException.ErrorInRenderer.FailedDequeueOutputBuffer.class);
                xq5Var.a(wfbVar3);
                if (wfbVar3 instanceof rgl) {
                    xq5Var.b.add((rgl) wfbVar3);
                }
            }
            if (split$default.contains("FailedReleaseOutputBuffer")) {
                wfb wfbVar4 = new wfb(PlaybackException.ErrorInRenderer.FailedReleaseOutputBuffer.class);
                xq5Var.a(wfbVar4);
                if (wfbVar4 instanceof rgl) {
                    xq5Var.b.add((rgl) wfbVar4);
                }
            }
            if (split$default.contains("FrameDropDetected")) {
                ovc ovcVar = new ovc();
                xq5Var.a(ovcVar);
                if (ovcVar instanceof rgl) {
                    xq5Var.b.add((rgl) ovcVar);
                }
            }
            if (split$default.contains("PreferH264HandlingRule")) {
                vlm vlmVar = new vlm();
                xq5Var.a(vlmVar);
                if (vlmVar instanceof rgl) {
                    xq5Var.b.add((rgl) vlmVar);
                }
            }
            c2.f(System.currentTimeMillis(), new ncs(12, xq5Var));
        }
        jzi jziVar2 = new jzi();
        jziVar2.a = new kg7();
        int andIncrement = odl.a.getAndIncrement();
        c5p c5pVar = this.j;
        if (c5pVar == null) {
            c5pVar = new c5p(3);
        }
        c5p c5pVar2 = c5pVar;
        zr7 zr7Var2 = tyfVar2 instanceof zr7 ? (zr7) tyfVar2 : null;
        if (zr7Var2 != null) {
            List list = A.a;
            list.getClass();
            bl blVar = new bl(14, list, false);
            jziVar = jziVar2;
            yr7 yr7Var = new yr7(zr7Var2.a, zr7Var2.b, zr7Var2.c, zr7Var2.d, zr7Var2.e, zr7Var2.f);
            yr7Var.g = zr7Var2.g;
            yr7Var.h = zr7Var2.h;
            yr7Var.i = zr7Var2.i;
            yr7Var.j = zr7Var2.j;
            blVar.invoke(yr7Var);
            tyfVar = yr7Var.a();
        } else {
            jziVar = jziVar2;
            tyfVar = x48.a;
        }
        d1 d1Var = A;
        jzi jziVar3 = jziVar;
        olr c3 = new hjq(4).c(tyfVar, new plr(pv9Var, kznVar, jziVar, d1Var, andIncrement, c5pVar2, false, false));
        hjp hjpVar = new hjp(6);
        hjpVar.b = new SurfaceSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        jsg jsgVar = new jsg(14);
        jsgVar.b = Integer.MAX_VALUE;
        y0t y0tVar = new y0t(hjpVar, jsgVar);
        gcl gclVar = new gcl();
        ScalingMode scalingMode = this.g;
        ak0 ak0Var = new ak0(kznVar, c3, d1Var, gclVar, 26);
        scalingMode.getClass();
        ecl eclVar = new ecl();
        ak0Var.invoke(eclVar);
        bt2 bt2Var = eclVar.a;
        f4m f4mVar = eclVar.b;
        Boolean bool = eclVar.c;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = eclVar.d;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = eclVar.e;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str2 = eclVar.f;
        if (str2 == null) {
            str2 = "DEFAULT";
        }
        String str3 = str2;
        Integer num = eclVar.g;
        int intValue = num != null ? num.intValue() : 3;
        Boolean bool4 = eclVar.h;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
        Integer num2 = eclVar.i;
        int intValue2 = num2 != null ? num2.intValue() : 1;
        Long l = eclVar.j;
        long longValue = l != null ? l.longValue() : 50L;
        Boolean bool5 = eclVar.l;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Boolean bool6 = eclVar.m;
        boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Integer num3 = eclVar.n;
        int intValue3 = num3 != null ? num3.intValue() : 50;
        Boolean bool7 = eclVar.k;
        boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        List list2 = eclVar.o;
        if (list2 == null) {
            list2 = c5b.a;
        }
        List list3 = list2;
        Boolean bool8 = eclVar.p;
        Boolean bool9 = eclVar.q;
        fcl fclVar = new fcl(pv9Var, looper, y0tVar, scalingMode, bt2Var, f4mVar, booleanValue, booleanValue2, booleanValue3, str3, intValue, booleanValue4, intValue2, longValue, booleanValue5, booleanValue6, intValue3, booleanValue7, list3, bool8, bool9 != null ? bool9.booleanValue() : false, eclVar.r, eclVar.s, eclVar.t, eclVar.u);
        le3 le3Var = new le3();
        le3Var.a = d1Var;
        le3Var.b = new n6c(false);
        u13 u13Var = new u13(21, bVar, fclVar, le3Var);
        c5p c5pVar3 = this.i;
        if (c5pVar3 == null) {
            c5pVar3 = new c5p(3);
        }
        h1b h1bVar = new h1b();
        tf6 e = gld.e(e.c(a4g.n(), ca8.a));
        boolean z2 = d1Var.b.H;
        paw avjVar = this.d ? new avj(c, andIncrement, c5pVar3, rdcVar, taoVar, e5Var, new r0o(xq5Var, h1bVar, z2, 3), c3, u13Var, hjpVar, jsgVar, this.e, jziVar3, le3Var, d1Var, this.k, d1Var.b.G, e, gclVar, this.l) : new cbw(c, andIncrement, c5pVar3, rdcVar, taoVar, e5Var, new r0o(xq5Var, h1bVar, z2, 3), c3, u13Var, hjpVar, jsgVar, kznVar, jziVar3, le3Var, this.k, d1Var.b.G, e);
        rdk rdkVar3 = rdk.i;
        if (rdkVar3 != null) {
            hgl hglVar = new hgl();
            tf6 tf6Var = (tf6) rdkVar3.c;
            Continuation continuation = null;
            x97.y(tf6Var, null, null, new y6v(hglVar, rdkVar3, continuation, 23), 3);
            x97.y(tf6Var, null, null, new wzv(hglVar, avjVar, rdkVar3, continuation, 4), 3);
            ((CopyOnWriteArraySet) rdkVar3.e).add(hglVar);
            avjVar.I(hglVar);
        }
        return avjVar;
    }
}
