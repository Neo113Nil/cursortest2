package defpackage;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Intent;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import android.webkit.WebView;
import androidx.media3.session.MediaSessionService;
import androidx.media3.session.i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.impl.Ie;
import io.appmetrica.analytics.impl.Il;
import io.appmetrica.analytics.impl.Ki;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.Vi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class juc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ juc(jtc jtcVar, String str) {
        this.a = 9;
        this.c = jtcVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        HashSet u03;
        Object t7oVar3;
        ump umpVar;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                iiu iiuVar = (iiu) this.c;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str), iiuVar);
                throw iiuVar;
            case 1:
                nyf nyfVar = (nyf) this.b;
                cr crVar = (cr) this.c;
                nyfVar.a(new cld(crVar));
                if (nyfVar.b().compareTo(lyf.d) >= 0) {
                    ((b1o) crVar.h).l();
                    return;
                }
                return;
            case 2:
                ((zt3) this.b).E((bsd) this.c, Unit.a);
                return;
            case 3:
                ((xm7) ((pzd) ((t0e) this.b).c.a).b.d.get(((ozd) this.c).m)).c(true);
                return;
            case 4:
                Ie.a((Ie) this.b, (List) this.c);
                return;
            case 5:
                Il.a((Il) this.b, (Bundle) this.c);
                return;
            case 6:
                pbe pbeVar = (pbe) this.b;
                i8s i8sVar = (i8s) this.c;
                try {
                    i8sVar.b(pbeVar.a());
                    return;
                } catch (Exception e) {
                    i8sVar.a(e);
                    return;
                }
            case 7:
                ((wge) this.b).a((String) ((wrm) this.c).invoke());
                return;
            case 8:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 9:
                ((WebView) ((jtc) this.c).a).evaluateJavascript((String) this.b, null);
                return;
            case 10:
                Ki.a((Li) this.b, (Vi) this.c);
                return;
            case 11:
                Li.b((Vi) this.b, (Throwable) this.c);
                return;
            case 12:
                tbg tbgVar = (tbg) this.b;
                PreparingParams preparingParams = (PreparingParams) this.c;
                qdc qdcVar = tbgVar.c;
                String str2 = tbgVar.d;
                imh d = tbgVar.a.d();
                qdcVar.H(str2, "onPreparingStarted", String.valueOf(d != null ? d.d : null), new Object[0]);
                yjj yjjVar = tbgVar.a.o;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((r9g) next).j(preparingParams);
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                return;
            case 13:
                wbg wbgVar = (wbg) this.b;
                PlaybackException playbackException = (PlaybackException) this.c;
                qdc qdcVar2 = wbgVar.c;
                String str3 = wbgVar.d;
                imh d2 = wbgVar.a.d();
                ngl.r(qdcVar2, str3, "onPlaybackError", String.valueOf(d2 != null ? d2.d : null), null, new Object[0], 8);
                yjj yjjVar2 = wbgVar.a.o;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((r9g) next2).P(playbackException);
                        t7oVar2 = Unit.a;
                    } catch (Throwable th2) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    Throwable a2 = z7o.a(t7oVar2);
                    if (a2 != null) {
                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                    }
                }
                return;
            case 14:
                wbg wbgVar2 = (wbg) this.b;
                VideoData videoData = (VideoData) this.c;
                imh d3 = wbgVar2.a.d();
                String str4 = d3 != null ? d3.d : null;
                boolean z = videoData instanceof VhVideoData;
                VhVideoData vhVideoData = z ? (VhVideoData) videoData : null;
                boolean d4 = Intrinsics.d(str4, vhVideoData != null ? vhVideoData.getContentId() : null);
                if (!d4) {
                    ngl.r(wbgVar2.c, wbgVar2.d, "onVideoDataPrepared", "inequality", null, new Object[0], 8);
                }
                qdc qdcVar3 = wbgVar2.c;
                String str5 = wbgVar2.d;
                StringBuilder sb = new StringBuilder();
                imh d5 = wbgVar2.a.d();
                sb.append(d5 != null ? d5.d : null);
                sb.append(" vs ");
                sb.append(z ? (VhVideoData) videoData : null);
                qdcVar3.H(str5, "onVideoDataPrepared", sb.toString(), new Object[0]);
                if (d4) {
                    acg acgVar = wbgVar2.a;
                    yjj yjjVar3 = acgVar.u;
                    synchronized (yjjVar3.a) {
                        u03 = CollectionsKt.u0(yjjVar3.a);
                    }
                    Iterator it3 = u03.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        try {
                            r7o r7oVar5 = z7o.b;
                            ((p9g) next3).g(acgVar, acgVar.n, videoData, acgVar.r);
                            t7oVar3 = Unit.a;
                        } catch (Throwable th3) {
                            r7o r7oVar6 = z7o.b;
                            t7oVar3 = new t7o(th3);
                        }
                        Throwable a3 = z7o.a(t7oVar3);
                        if (a3 != null) {
                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                        }
                    }
                    return;
                }
                return;
            case 15:
                bmh bmhVar = (bmh) this.b;
                iwe iweVar = new iwe(bmhVar.a, (msh) this.c);
                bmhVar.i = iweVar;
                zlh zlhVar = bmhVar.e;
                Handler handler = bmhVar.b.e;
                if (zlhVar == null) {
                    xq0.x("callback must not be null");
                    return;
                }
                if (!((Set) iweVar.c).add(zlhVar)) {
                    Log.w("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                zlhVar.j(handler);
                okh okhVar = (okh) iweVar.b;
                MediaController mediaController = okhVar.a;
                lkh lkhVar = zlhVar.a;
                lkhVar.getClass();
                mediaController.registerCallback(lkhVar, handler);
                synchronized (okhVar.b) {
                    d9e d6 = okhVar.e.d();
                    if (d6 != null) {
                        mkh mkhVar = new mkh(zlhVar);
                        okhVar.d.put(zlhVar, mkhVar);
                        zlhVar.c = mkhVar;
                        try {
                            d6.G(mkhVar);
                            zlhVar.i(13, null, null);
                        } catch (RemoteException e2) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                        }
                    } else {
                        zlhVar.c = null;
                        okhVar.c.add(zlhVar);
                    }
                }
                return;
            case 16:
                bmh bmhVar2 = (bmh) this.b;
                yde ydeVar = (yde) ((mmo) this.c).e;
                kkh kkhVar = bmhVar2.b;
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                ikh ikhVar = kkhVar.d;
                ikhVar.c(kkhVar, ydeVar);
                ikhVar.d();
                return;
            case 17:
                ulh ulhVar = (ulh) this.b;
                fmh fmhVar = (fmh) this.c;
                if (ulhVar.n) {
                    return;
                }
                fmhVar.f(ulhVar);
                return;
            case 18:
                ((joh) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 19:
                ((joh) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 20:
                ((joh) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 21:
                ((joh) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 22:
                ((joh) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 23:
                ((xop) this.c).l(Boolean.valueOf(((i) this.b).q()));
                return;
            case 24:
                i iVar = (i) this.b;
                lrl lrlVar = (lrl) this.c;
                sth sthVar = iVar.h;
                iVar.t = lrlVar;
                jth jthVar = new jth(iVar, lrlVar);
                lrlVar.j0(jthVar);
                iVar.v = jthVar;
                try {
                    sthVar.j.z(0, lrlVar);
                } catch (RemoteException e3) {
                    vq1.L("MediaSessionImpl", "Exception in using media1 API", e3);
                }
                nsh nshVar = sthVar.l;
                ((dsh) nshVar.b).a.setActive(true);
                Iterator it4 = ((ArrayList) nshVar.d).iterator();
                if (it4.hasNext()) {
                    throw hrg.j(it4);
                }
                iVar.s = lrlVar.j1();
                iVar.g(lrlVar.f0());
                return;
            case 25:
                i iVar2 = (i) this.b;
                Runnable runnable = (Runnable) this.c;
                iVar2.getClass();
                runnable.run();
                return;
            case 26:
                lcg lcgVar = (lcg) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    umpVar = (ump) lcgVar.get();
                    vq1.y(umpVar, "SessionResult must not be null");
                } catch (InterruptedException e4) {
                    e = e4;
                    vq1.o0("MediaSessionLegacyStub", "Custom command failed", e);
                    umpVar = new ump(-1);
                } catch (CancellationException e5) {
                    vq1.o0("MediaSessionLegacyStub", "Custom command cancelled", e5);
                    umpVar = new ump(1);
                } catch (ExecutionException e6) {
                    e = e6;
                    vq1.o0("MediaSessionLegacyStub", "Custom command failed", e);
                    umpVar = new ump(-1);
                }
                resultReceiver.send(umpVar.a, umpVar.b);
                return;
            case 27:
                i iVar3 = (i) this.b;
                Intent intent = (Intent) this.c;
                int i2 = MediaSessionService.g;
                wrh f = iVar3.f();
                if (f == null) {
                    ComponentName component = intent.getComponent();
                    f = new wrh(new xth(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1006001300, 7, false, null, Bundle.EMPTY);
                }
                if (iVar3.p(f, intent)) {
                    return;
                }
                vq1.H("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                gvh gvhVar = (gvh) this.b;
                u8e u8eVar = (u8e) this.c;
                g06 g06Var = gvhVar.i;
                wrh y = g06Var.y(u8eVar.asBinder());
                if (y != null) {
                    g06Var.U(y);
                    return;
                }
                return;
            default:
                ((gvh) this.b).i.v((wrh) this.c);
                return;
        }
    }

    public /* synthetic */ juc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ juc(i iVar, wrh wrhVar, Runnable runnable) {
        this.a = 25;
        this.b = iVar;
        this.c = runnable;
    }
}
