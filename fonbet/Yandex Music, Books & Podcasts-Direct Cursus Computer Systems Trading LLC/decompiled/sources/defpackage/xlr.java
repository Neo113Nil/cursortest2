package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.HandlerThread;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcAppEventDispatcher;
import com.yandex.passport.internal.helper.g;
import com.yandex.passport.internal.interaction.a;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.domik.u;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.impl.C0102a1;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.T7;
import ru.kinopoisk.sdk.easylogin.internal.Z0;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.impl.TrackingEventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;

/* loaded from: classes6.dex */
public final /* synthetic */ class xlr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xlr(mmo mmoVar, Integer num, List list) {
        this.a = 3;
        this.b = mmoVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet u0;
        Object t7oVar;
        WebView webView;
        switch (this.a) {
            case 0:
                ((ylr) this.b).c((EventDefault) this.c);
                return;
            case 1:
                T7.a((T7) this.b, (Z0[]) this.c);
                return;
            case 2:
                ((y8p) ((x3n) this.b).b).o((ucr) this.c, 3);
                return;
            case 3:
                mmo mmoVar = (mmo) this.b;
                List list = (List) this.c;
                yjj yjjVar = (yjj) mmoVar.g;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    ((r9g) it.next()).getClass();
                    list.getClass();
                }
                return;
            case 4:
                v2t v2tVar = (v2t) this.b;
                Pair pair = (Pair) this.c;
                q2t q2tVar = v2tVar.j;
                v2tVar.e(q2tVar != null ? q2t.a(q2tVar, (TrackingEventType) pair.b, null, null, 14) : null);
                return;
            case 5:
                v2t v2tVar2 = (v2t) this.b;
                AtomicLong atomicLong = (AtomicLong) this.c;
                long a = v2tVar2.b.a();
                long a2 = v2tVar2.d.a();
                synchronized (v2tVar2.o) {
                    if (v2tVar2.o.get()) {
                        v2tVar2.d.b();
                        v2tVar2.d.c();
                    }
                }
                q2t q2tVar2 = v2tVar2.j;
                v2tVar2.e(q2tVar2 != null ? q2t.a(q2tVar2, TrackingEventType.HEARTBEAT_30S, null, new o2t(a - atomicLong.get(), a2, v2tVar2.c.a(), v2tVar2.n.get(), v2tVar2.e.a()), 10) : null);
                atomicLong.set(a);
                v2tVar2.n.set(0L);
                v2tVar2.c.b();
                v2tVar2.d.b();
                v2tVar2.e.b();
                return;
            case 6:
                z2t z2tVar = (z2t) this.b;
                z2tVar.a.p(z2tVar.b.a(), (nar) this.c);
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.b;
                q3t q3tVar = (q3t) this.c;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    q3tVar.g((iss) it2.next());
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((iss) it3.next()).a);
                }
                ouj.B("launchRemoveTrackFiles - finished removing ", CollectionsKt.w0(CollectionsKt.z0(arrayList2)), 3, "TracksCacheRepositoryImpl", null);
                return;
            case 8:
                Runnable runnable = (Runnable) this.b;
                qhp qhpVar = (qhp) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    qhpVar.a();
                }
            case 9:
                ((UibcAppEventDispatcher) this.b).lambda$dispatchKeyEvent$2((KeyEvent) this.c);
                return;
            case 10:
                ((klt) this.b).b.invoke((nlt) this.c);
                return;
            case 11:
                ((klt) this.b).a.invoke((CancellationException) this.c);
                return;
            case 12:
                xop xopVar = (xop) this.b;
                lcg lcgVar = (lcg) this.c;
                if (xopVar.a instanceof g6) {
                    lcgVar.cancel(false);
                    return;
                }
                return;
            case 13:
                y5g.o0((Context) this.b, (String) this.c);
                return;
            case 14:
                List<String> list2 = (ArrayList) this.b;
                jau jauVar = (jau) this.c;
                try {
                    r7o r7oVar = z7o.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str : list2) {
                        VideoData videoData = (VideoData) jauVar.b.p(str);
                        if (videoData != null) {
                            linkedHashMap.put(str, new z7o(videoData));
                        }
                    }
                    jauVar.b(linkedHashMap);
                    list2 = CollectionsKt.e0(list2, linkedHashMap.keySet());
                    if (!list2.isEmpty()) {
                        Map b = jauVar.a.b(list2);
                        jauVar.c(b);
                        jauVar.b(b);
                    }
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a3 = z7o.a(t7oVar);
                if (a3 != null) {
                    List list3 = list2;
                    int a4 = tah.a(v75.o(list3, 10));
                    if (a4 < 16) {
                        a4 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(a4);
                    for (Object obj : list3) {
                        r7o r7oVar3 = z7o.b;
                        linkedHashMap2.put(obj, new z7o(new t7o(a3)));
                    }
                    jauVar.b(linkedHashMap2);
                    return;
                }
                return;
            case 15:
                dxr dxrVar = (dxr) this.b;
                tcu tcuVar = (tcu) this.c;
                ccu ccuVar = (ccu) dxrVar.b;
                int i = dvt.a;
                ccuVar.k(tcuVar);
                return;
            case 16:
                dxr dxrVar2 = (dxr) this.b;
                Exception exc = (Exception) this.c;
                ccu ccuVar2 = (ccu) dxrVar2.b;
                int i2 = dvt.a;
                ccuVar2.i(exc);
                return;
            case 17:
                dxr dxrVar3 = (dxr) this.b;
                String str2 = (String) this.c;
                ccu ccuVar3 = (ccu) dxrVar3.b;
                int i3 = dvt.a;
                ccuVar3.b(str2);
                return;
            case 18:
                ddu dduVar = (ddu) this.b;
                ConstraintLayout constraintLayout = (ConstraintLayout) this.c;
                dduVar.getClass();
                constraintLayout.getClass();
                ddu.L(dduVar, false, constraintLayout);
                return;
            case 19:
                vhu vhuVar = (vhu) this.b;
                View[] viewArr = (View[]) this.c;
                if (vhuVar.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(vhuVar.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (vhuVar.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(vhuVar.q, null);
                    }
                    return;
                }
                return;
            case 20:
                Function1 function1 = (Function1) this.b;
                Object animatedValue = ((ValueAnimator) this.c).getAnimatedValue();
                animatedValue.getClass();
                function1.invoke((Float) animatedValue);
                return;
            case 21:
                HandlerThread handlerThread = (HandlerThread) this.b;
                suh suhVar = (suh) this.c;
                handlerThread.quit();
                cr crVar = (cr) suhVar.c;
                String str3 = (String) suhVar.b;
                iwe iweVar = (iwe) crVar.d;
                if (iweVar == null || (webView = (WebView) iweVar.b) == null) {
                    return;
                }
                webView.loadUrl(str3);
                return;
            case 22:
                cnv cnvVar = (cnv) this.b;
                ykh ykhVar = (ykh) this.c;
                kkh c = cnv.c(ykhVar);
                if (c != null) {
                    ssg.a(3, "WidgetMediaControllerHandler", "bindToSession: connected", null);
                    c.j0(new anv(cnvVar, c));
                    return;
                } else {
                    if (cnvVar.f == ykhVar) {
                        cnvVar.f = null;
                        return;
                    }
                    return;
                }
            case 23:
                Xk.a((Xk) this.b, (RtmClientEvent) this.c);
                return;
            case 24:
                Xk.a((Xk) this.b, (RtmConfig) this.c);
                return;
            case 25:
                Xk.a((Xk) this.b, (RtmErrorEvent) this.c);
                return;
            case 26:
                b9w b9wVar = (b9w) this.b;
                rnm rnmVar = (rnm) this.c;
                b9wVar.getClass();
                rnmVar.b(b9wVar);
                return;
            case 27:
                b9w b9wVar2 = (b9w) this.b;
                IOException iOException = (IOException) this.c;
                rnm rnmVar2 = b9wVar2.h;
                rnmVar2.getClass();
                rnmVar2.a(b9wVar2, iOException);
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                C0102a1.a((C0102a1) this.b, (PluginErrorDetails) this.c);
                return;
            default:
                a aVar = (a) this.b;
                d dVar = (d) this.c;
                try {
                    u a5 = ((g) aVar.e).a(dVar.f(), dVar.g());
                    aVar.c.m(Boolean.FALSE);
                    ((w4i) aVar.f).invoke(dVar, a5);
                    return;
                } catch (Throwable th2) {
                    aVar.c.m(Boolean.FALSE);
                    ((k) aVar.g).invoke(aVar.d.a(th2));
                    return;
                }
        }
    }

    public /* synthetic */ xlr(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
