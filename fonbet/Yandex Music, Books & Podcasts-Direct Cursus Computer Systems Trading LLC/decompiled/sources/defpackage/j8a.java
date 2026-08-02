package defpackage;

import android.os.SystemClock;
import android.webkit.WebView;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.DrmAdvanced;
import ru.yandex.video.m3.ott.data.dto.DrmAdvancedWidevine;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class j8a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j8a(long j, nbg nbgVar) {
        this.a = 7;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        this.b = j;
        this.c = nbgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        String proxyUrl;
        DrmAdvancedWidevine widevine;
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        Object t7oVar2;
        kyk kykVar;
        float f = 0.0f;
        int i = 2;
        switch (this.a) {
            case 0:
                long j2 = this.b;
                sdr sdrVar = (sdr) this.c;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                int i2 = 0;
                while (i2 < 4) {
                    double floatValue = (i2 * 0.25d) + ((Number) sdrVar.getValue()).floatValue();
                    if (floatValue > 2.0d) {
                        floatValue -= i;
                    } else if (floatValue > 1.0d) {
                        floatValue = i - floatValue;
                    }
                    float f2 = k8a.a;
                    float f3 = (float) floatValue;
                    float I = fxf.I(f2, 1.25f * f2, f3);
                    float J = fxf.J(f3, f, 1.0f, 0.3f, 0.1f);
                    float n0 = jpaVar.n0(I);
                    float n02 = jpaVar.n0((((i * f2) + k8a.b) * i2) + f2);
                    double n03 = jpaVar.n0(f2);
                    jpa jpaVar2 = jpaVar;
                    jpa.D0(jpaVar2, j2, n0, swf.i(n02, (float) (((1 - floatValue) * jpaVar.n0(k8a.c)) + n03)), J, null, 0, 112);
                    i2++;
                    jpaVar = jpaVar2;
                    sdrVar = sdrVar;
                    f = 0.0f;
                    i = 2;
                }
                return Unit.a;
            case 1:
                dup dupVar = (dup) this.c;
                long j3 = this.b;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                ou3 ou3Var = opfVar.a;
                float min = Math.min(nmq.d(ou3Var.e()), nmq.b(ou3Var.e()));
                if (min <= 0.0f) {
                    return Unit.a;
                }
                float f4 = min * 0.046875f;
                float f5 = f4 / 2.0f;
                float d = nmq.d(ou3Var.e()) - f4;
                if (d < 0.0f) {
                    d = 0.0f;
                }
                float b = nmq.b(ou3Var.e()) - f4;
                if (b < 0.0f) {
                    b = 0.0f;
                }
                long i3 = a4g.i(d, b);
                if (nmq.d(i3) <= 0.0f || nmq.b(i3) <= 0.0f) {
                    return Unit.a;
                }
                ocg I2 = dupVar.I(i3, opfVar.getLayoutDirection(), opfVar);
                nsh nshVar = ou3Var.b;
                long B = nshVar.B();
                nshVar.s().r();
                try {
                    ((xzi) nshVar.b).m0(f5, f5);
                    try {
                        amr amrVar = new amr(f4, 0.0f, 0, 0, 30);
                        j = B;
                        try {
                            pcg.z(opfVar, I2, j3, amrVar, 52);
                            vz1.A(nshVar, j);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            vz1.A(nshVar, j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = B;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j = B;
                }
                break;
            case 2:
                cds cdsVar = (cds) this.c;
                long j4 = this.b;
                jpa jpaVar3 = (jpa) obj;
                jpaVar3.getClass();
                v5g.A(jpaVar3, cdsVar, j4, 0L, 252);
                return Unit.a;
            case 3:
                long j5 = this.b;
                Vh.Stream stream = (Vh.Stream) this.c;
                c cVar = (c) obj;
                cVar.getClass();
                cVar.c = Long.valueOf(j5);
                DrmParams drmConfig = stream.getDrmConfig();
                DrmProxy drmProxy = null;
                r4 = null;
                String str = null;
                if (drmConfig != null) {
                    DrmServers servers = drmConfig.getServers();
                    if (servers == null || (proxyUrl = servers.getProxyUrl()) == null) {
                        throw new ManifestLoadingException.UnknownError(new IllegalStateException("ProxyUrl mustn't be null"), null, 2, null);
                    }
                    DrmRequestParams requestParams = drmConfig.getRequestParams();
                    if (requestParams == null) {
                        throw new ManifestLoadingException.UnknownError(new IllegalStateException("Drm request params mustn't be null"), null, 2, null);
                    }
                    DrmAdvanced advanced = drmConfig.getAdvanced();
                    if (advanced != null && (widevine = advanced.getWidevine()) != null) {
                        str = widevine.getProvisioningUrl();
                    }
                    drmProxy = new DrmProxy(proxyUrl, str, requestParams);
                }
                cVar.d = drmProxy;
                return Unit.a;
            case 4:
                long j6 = this.b;
                yfv yfvVar = (yfv) this.c;
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.setBackgroundColor(c3x.U(j6));
                webView.addJavascriptInterface(yfvVar.c, yfvVar.a);
                webView.getSettings().setSupportMultipleWindows(yfvVar.d);
                return Unit.a;
            case 5:
                w4k w4kVar = (w4k) this.c;
                long j7 = this.b;
                jpa jpaVar4 = (jpa) obj;
                jpaVar4.getClass();
                float n04 = jpaVar4.n0(16);
                nsh q0 = jpaVar4.q0();
                long B2 = q0.B();
                q0.s().r();
                try {
                    ((xzi) q0.b).f0(0.45454544f, 0.45454544f, 0L);
                    w4k.h(w4kVar, jpaVar4, a4g.i(n04, n04), new d43(j7, 5), 2);
                    vz1.A(q0, B2);
                    return Unit.a;
                } catch (Throwable th4) {
                    vz1.A(q0, B2);
                    throw th4;
                }
            case 6:
                long j8 = this.b;
                aqi aqiVar = (aqi) this.c;
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                fk0 fk0Var = (fk0) aqiVar.getValue();
                long j9 = fk0Var != null ? ((enj) fk0Var.e()).a : 0L;
                return new wpe(xv.t(eeh.b(enj.e(j9) * jx7Var.n0(fma.c(j8))), eeh.b(enj.f(j9) * jx7Var.n0(fma.b(j8)))));
            default:
                long j10 = this.b;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                nbg nbgVar = (nbg) this.c;
                ListYandexPlayerView listYandexPlayerView = (ListYandexPlayerView) obj;
                listYandexPlayerView.getClass();
                listYandexPlayerView.setBackgroundColor(c3x.U(j10));
                listYandexPlayerView.setScaleType(scaleType);
                acg acgVar = nbgVar.a;
                rre rreVar = listYandexPlayerView.a;
                rreVar.getClass();
                rreVar.H(listYandexPlayerView.e(), "attachPlayer", "new player = ".concat(y7g.v(acgVar)), new Object[0]);
                listYandexPlayerView.i = acgVar;
                yjj yjjVar = listYandexPlayerView.b;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        rag ragVar = (rag) next;
                        ragVar.getClass();
                        mbg mbgVar = ragVar.a;
                        acgVar.u.a(mbgVar.g);
                        acgVar.a(mbgVar.h);
                        imh d2 = acgVar.d();
                        if (d2 != null && (kykVar = acgVar.q) != null) {
                            tzn tznVar = mbgVar.p;
                            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
                            tznVar.getClass();
                            tznVar.d = valueOf;
                            mbgVar.k = d2;
                            mbgVar.l = kykVar;
                        }
                        paw pawVar = acgVar.j;
                        if (pawVar != null) {
                            mbg.a(mbgVar, pawVar);
                        }
                        t7oVar2 = Unit.a;
                    } catch (Throwable th5) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar2 = new t7o(th5);
                    }
                    Throwable a = z7o.a(t7oVar2);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                omr omrVar = listYandexPlayerView.d;
                omrVar.getClass();
                acgVar.a.H(acgVar.h, "onAttachToView", "attach view isWithEngine = " + acgVar.f(), new Object[0]);
                acgVar.m = omrVar;
                acgVar.n = listYandexPlayerView;
                paw pawVar2 = acgVar.j;
                if (pawVar2 == null) {
                    acgVar.A = new sea(29, acgVar, omrVar);
                } else {
                    omrVar.d((i8l) pawVar2.J());
                }
                yjj yjjVar2 = acgVar.u;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((p9g) next2).a(acgVar, listYandexPlayerView);
                        t7oVar = Unit.a;
                    } catch (Throwable th6) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar = new t7o(th6);
                    }
                    Throwable a2 = z7o.a(t7oVar);
                    if (a2 != null) {
                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                    }
                }
                acgVar.a(listYandexPlayerView.g);
                gcg gcgVar = listYandexPlayerView.h;
                gcgVar.getClass();
                acgVar.u.a(gcgVar);
                return Unit.a;
        }
    }

    public /* synthetic */ j8a(long j, i1u i1uVar, Vh.Stream stream) {
        this.a = 3;
        this.b = j;
        this.c = stream;
    }

    public /* synthetic */ j8a(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ j8a(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
