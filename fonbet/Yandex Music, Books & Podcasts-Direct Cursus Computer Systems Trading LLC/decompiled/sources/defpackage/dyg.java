package defpackage;

import android.net.TrafficStats;
import android.os.Binder;
import android.os.DeadSystemException;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import androidx.fragment.app.t;
import androidx.media3.session.MediaSessionService;
import androidx.media3.ui.PlayerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.ClockFaceView;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import com.yandex.music.shared.media.session.session.b;
import com.yandex.pulse.metrics.MetricsService;
import com.yandex.pulse.metrics.k;
import com.yandex.pulse.metrics.o;
import com.yandex.pulse.processcpu.MeasurementTask;
import io.appmetrica.analytics.impl.Q2;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.player.a;
import ru.yandex.video.m3.ott.impl.OttTrackingReporterImpl$reportPendingEvents$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$from$1;
import ru.yandex.video.m3.preload_manager.JobResult;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.l;
import ru.yandex.video.m3.preload_manager.m;

/* loaded from: classes.dex */
public final /* synthetic */ class dyg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dyg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        sfh sfhVar;
        boolean z;
        Object obj;
        int i;
        b bVar;
        byte[] w;
        byte[] w2;
        LinkedHashMap a;
        long j2 = 60000;
        long j3 = -1;
        Continuation continuation = null;
        int i2 = 1;
        switch (this.a) {
            case 0:
                rvt.b((ZipInputStream) this.b);
                return;
            case 1:
                ((pzg) this.b).c();
                return;
            case 2:
                MaterialButton.a((MaterialButton) this.b);
                return;
            case 3:
                sfh sfhVar2 = (sfh) this.b;
                Iterator it = sfhVar2.a.iterator();
                while (it.hasNext()) {
                    xsm xsmVar = (xsm) it.next();
                    tfh tfhVar = new tfh(ezf.a, ezf.b);
                    switch (xsmVar.a) {
                        case 0:
                            j = j2;
                            sfhVar = sfhVar2;
                            ysm ysmVar = (ysm) xsmVar.b;
                            MeasurementTask measurementTask = ysmVar.k;
                            if (measurementTask != null) {
                                z = true;
                                measurementTask.h.set(true);
                                obj = null;
                                ysmVar.k = null;
                            } else {
                                z = true;
                                obj = null;
                            }
                            LinkedHashSet linkedHashSet = ysmVar.l;
                            Map map = ysmVar.m;
                            linkedHashSet.getClass();
                            map.getClass();
                            MeasurementTask measurementTask2 = new MeasurementTask(ysmVar.a, ysmVar, linkedHashSet, map, tfhVar);
                            ysmVar.k = measurementTask2;
                            Executor executor = ysmVar.b;
                            executor.getClass();
                            i = 4;
                            executor.execute(new dyg(i, measurementTask2));
                            break;
                        default:
                            o4t o4tVar = (o4t) ((lum) xsmVar.b).a;
                            int i3 = o4tVar.c;
                            if (o4tVar.e != j3 && o4tVar.f != j3) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                long j4 = uptimeMillis - o4tVar.d;
                                if (j4 >= 59000) {
                                    float f = j4 / j2;
                                    if (f < 1.0f) {
                                        f = 1.0f;
                                    }
                                    int i4 = (int) f;
                                    j = j2;
                                    try {
                                        long uidRxBytes = TrafficStats.getUidRxBytes(i3);
                                        long uidTxBytes = TrafficStats.getUidTxBytes(i3);
                                        sfhVar = sfhVar2;
                                        long j5 = ((uidRxBytes - o4tVar.e) * j) / j4;
                                        long j6 = ((uidTxBytes - o4tVar.f) * j) / j4;
                                        lyd lydVar = o4tVar.a;
                                        lydVar.getClass();
                                        lydVar.a((int) j5, i4);
                                        lyd lydVar2 = o4tVar.b;
                                        lydVar2.getClass();
                                        lydVar2.a((int) j6, i4);
                                        long j7 = i4;
                                        long j8 = (j5 * j7) + o4tVar.e;
                                        o4tVar.e = j8;
                                        long j9 = (j6 * j7) + o4tVar.f;
                                        o4tVar.f = j9;
                                        long j10 = (j7 * j) + o4tVar.d;
                                        o4tVar.d = j10;
                                        if (j8 > uidRxBytes) {
                                            o4tVar.e = uidRxBytes;
                                        }
                                        if (j9 > uidTxBytes) {
                                            o4tVar.f = uidTxBytes;
                                        }
                                        if (j10 > uptimeMillis) {
                                            o4tVar.d = uptimeMillis;
                                        }
                                    } catch (RuntimeException e) {
                                        sfhVar = sfhVar2;
                                        if (!(e.getCause() instanceof DeadSystemException)) {
                                            throw e;
                                        }
                                    }
                                    z = true;
                                    obj = null;
                                    i = 4;
                                    break;
                                }
                            }
                            j = j2;
                            sfhVar = sfhVar2;
                            z = true;
                            obj = null;
                            i = 4;
                            break;
                    }
                    j2 = j;
                    sfhVar2 = sfhVar;
                    j3 = -1;
                }
                sfh sfhVar3 = sfhVar2;
                sfhVar3.b.taskDone(sfhVar3.c);
                return;
            case 4:
                MeasurementTask measurementTask3 = (MeasurementTask) this.b;
                lyd lydVar3 = MeasurementTask.j;
                zav zavVar = measurementTask3.d;
                if (measurementTask3.h.get()) {
                    return;
                }
                try {
                    Process.setThreadPriority(10);
                    measurementTask3.a();
                    Binder.flushPendingCommands();
                    return;
                } finally {
                    zavVar.sendEmptyMessage(0);
                }
            case 5:
                ((kkh) this.b).a();
                return;
            case 6:
                ulh ulhVar = (ulh) this.b;
                rlh rlhVar = ulhVar.m;
                if (rlhVar != null) {
                    ulhVar.d.unbindService(rlhVar);
                    ulhVar.m = null;
                }
                ulhVar.c.a.clear();
                return;
            case 7:
                ((gph) this.b).n = -1;
                return;
            case 8:
                ((grh) this.b).d();
                return;
            case 9:
                MediaSessionService mediaSessionService = (MediaSessionService) this.b;
                synchronized (mediaSessionService.a) {
                    bVar = mediaSessionService.f;
                }
                if (bVar != null) {
                    Media3SessionService.k().a(new Media3SessionService.MusicBackgroundServiceStartNotAllowedException());
                    return;
                }
                return;
            case 10:
                q4i q4iVar = (q4i) this.b;
                j4i j4iVar = q4iVar.b;
                if (q4iVar.f != -1) {
                    q4i.g.b((int) ((SystemClock.elapsedRealtime() - q4iVar.f) / 60000));
                    q4iVar.f = -1L;
                }
                if (!q4iVar.c) {
                    e5i e5iVar = q4iVar.e;
                    e5iVar.getClass();
                    e5iVar.stop();
                    e5iVar.taskDone(3000L);
                    return;
                }
                boolean P = j4iVar.P();
                olk olkVar = j4iVar.d;
                olk olkVar2 = j4iVar.e;
                if (!P) {
                    e5i e5iVar2 = q4iVar.e;
                    e5iVar2.getClass();
                    e5iVar2.stop();
                    e5i e5iVar3 = q4iVar.e;
                    e5iVar3.getClass();
                    e5iVar3.a(true);
                    return;
                }
                if (!j4iVar.O()) {
                    j4iVar.O();
                    if (olkVar.g.size() > 0) {
                        ArrayList arrayList = olkVar.g;
                        if (arrayList.size() == 0) {
                            xq0.q("No logs to stage.");
                            return;
                        }
                        olkVar.h = arrayList.size() - 1;
                    } else {
                        ArrayList arrayList2 = olkVar2.g;
                        if (arrayList2.size() == 0) {
                            xq0.q("No logs to stage.");
                            return;
                        }
                        olkVar2.h = arrayList2.size() - 1;
                    }
                }
                j4iVar.O();
                if (q4iVar.d == null) {
                    m4i m4iVar = q4iVar.a;
                    q4iVar.d = m4iVar.createUploader(m4iVar.getUploadURL(), "application/vnd.chrome.uma", "X-Chrome-UMA-Log-SHA1", new p4i(q4iVar));
                }
                if (olkVar.O()) {
                    w = ((k) olkVar.g.get(olkVar.h)).getHash().w();
                    w.getClass();
                } else {
                    w = ((k) olkVar2.g.get(olkVar2.h)).getHash().w();
                    w.getClass();
                }
                char[] cArr = new char[w.length * 2];
                int length = w.length;
                for (int i5 = 0; i5 < length; i5++) {
                    byte b = w[i5];
                    int i6 = i5 * 2;
                    char[] cArr2 = fgq.f;
                    cArr[i6] = cArr2[(b >> 4) & 15];
                    cArr[i6 + 1] = cArr2[b & 15];
                }
                String str = new String(cArr);
                l4i l4iVar = q4iVar.d;
                l4iVar.getClass();
                if (olkVar.O()) {
                    w2 = ((k) olkVar.g.get(olkVar.h)).getCompressedLogData().w();
                    w2.getClass();
                } else {
                    w2 = ((k) olkVar2.g.get(olkVar2.h)).getCompressedLogData().w();
                    w2.getClass();
                }
                l4iVar.a(str, w2);
                return;
            case 11:
                ((MetricsService) this.b).startScheduledUpload();
                return;
            case 12:
                ((MirroringService) this.b).stopSelf();
                return;
            case 13:
                i2j i2jVar = (i2j) this.b;
                ik7 ik7Var = (ik7) i2jVar.a.get();
                if (ik7Var != null) {
                    int b2 = i2jVar.c.b();
                    jk7 jk7Var = ik7Var.a;
                    synchronized (jk7Var) {
                        int i7 = jk7Var.n;
                        if (i7 == 0 || jk7Var.e) {
                            if (i7 != b2 || jk7Var.o == null) {
                                jk7Var.n = b2;
                                if (b2 != 1 && b2 != 0 && b2 != 8) {
                                    if (jk7Var.o == null) {
                                        jk7Var.o = dvt.A(jk7Var.a);
                                    }
                                    jk7Var.l = jk7Var.g(b2);
                                    jk7Var.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    int i8 = jk7Var.g > 0 ? (int) (elapsedRealtime - jk7Var.h) : 0;
                                    long j11 = jk7Var.i;
                                    long j12 = jk7Var.l;
                                    if (i8 != 0 || j11 != 0 || j12 != jk7Var.m) {
                                        jk7Var.m = j12;
                                        jk7Var.c.T(i8, j11, j12);
                                    }
                                    jk7Var.h = elapsedRealtime;
                                    jk7Var.i = 0L;
                                    jk7Var.k = 0L;
                                    jk7Var.j = 0L;
                                    ywq ywqVar = jk7Var.f;
                                    ywqVar.a.clear();
                                    ywqVar.b = -1;
                                    ywqVar.c = 0;
                                    ywqVar.d = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 14:
                v4n v4nVar = ((hfj) this.b).f;
                mkn mknVar = v4nVar.h;
                if (mknVar != null) {
                    mknVar.cancel();
                }
                v4nVar.h = null;
                return;
            case 15:
                gs4 gs4Var = (gs4) this.b;
                try {
                    r7o r7oVar = z7o.b;
                    synchronized (gs4Var) {
                        do {
                            try {
                                a = ((kc7) gs4Var.c).a();
                                if (!a.isEmpty()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Map.Entry entry : a.entrySet()) {
                                        n4f n4fVar = (n4f) gs4Var.a;
                                        String str2 = (String) entry.getValue();
                                        Type type = new OttTrackingReporterImpl$reportPendingEvents$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$from$1().getType();
                                        type.getClass();
                                        Map map2 = (Map) n4fVar.a(str2, type);
                                        if (map2 != null) {
                                            arrayList3.add(map2);
                                        }
                                    }
                                    new kxj((lxj) gs4Var.b, arrayList3).invoke();
                                    ((kc7) gs4Var.c).D(a.keySet());
                                }
                            } finally {
                            }
                        } while (!a.isEmpty());
                    }
                    r7o r7oVar2 = z7o.b;
                    return;
                } catch (Throwable unused) {
                    r7o r7oVar3 = z7o.b;
                    return;
                }
            case 16:
                o9l o9lVar = (o9l) this.b;
                o9lVar.i = true;
                o9lVar.b.invoke();
                o9lVar.i = false;
                return;
            case 17:
                a aVar = (a) this.b;
                cjl cjlVar = aVar.v;
                x97.y(cjlVar.f, null, null, new bjl(cjlVar, continuation, i2), 3);
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (!((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).h() || (aVar instanceof y48)) {
                    return;
                }
                px2.c(aVar);
                return;
            case 18:
                nbl nblVar = (nbl) this.b;
                float[] fArr = nbl.g1;
                nblVar.n();
                return;
            case 19:
                ((PlayerView) this.b).invalidate();
                return;
            case 20:
                l lVar = (l) this.b;
                Intrinsics.d(Looper.myLooper(), lVar.c.getLooper());
                try {
                    lVar.c(lVar.d.d(lVar.b()));
                    m mVar = lVar.i;
                    mVar.getClass();
                    List a2 = mVar.a();
                    lVar.b().b.getClass();
                    l.d(lVar, JobResult.SUCCESS, null, a2, 2);
                    return;
                } catch (PreloadException.CanceledOperationException e2) {
                    l.d(lVar, JobResult.CANCELED, e2, null, 4);
                    return;
                } catch (PreloadException e3) {
                    l.d(lVar, JobResult.ERROR, e3, null, 4);
                    return;
                } catch (Throwable th) {
                    l.d(lVar, JobResult.ERROR, new PreloadException.UnknownError("Unhandled throwable during job execution", th), null, 4);
                    return;
                }
            case 21:
                com comVar = (com) this.b;
                wnm wnmVar = comVar.a.n;
                wnmVar.getClass();
                fo7 fo7Var = new fo7(wnmVar);
                try {
                    Iterator it2 = comVar.d.iterator();
                    while (it2.hasNext()) {
                        comVar.b((bom) it2.next());
                    }
                    fo7Var.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yd5.q(fo7Var, th2);
                        throw th3;
                    }
                }
            case 22:
                eqm eqmVar = (eqm) this.b;
                eqmVar.getClass();
                v7g.C(new ssb(29, ((tdk) eqmVar.k).e(), eqmVar));
                return;
            case 23:
                ctm ctmVar = (ctm) this.b;
                gzf gzfVar = ctmVar.f;
                if (ctmVar.b == 0) {
                    ctmVar.c = true;
                    gzfVar.g(kyf.ON_PAUSE);
                }
                if (ctmVar.a == 0 && ctmVar.c) {
                    gzfVar.g(kyf.ON_STOP);
                    ctmVar.d = true;
                    return;
                }
                return;
            case 24:
                Q2.a((Q2) this.b);
                return;
            case 25:
                ((ClockFaceView) this.b).u();
                return;
            case 26:
                t requireActivity = ((g8o) this.b).requireActivity();
                requireActivity.getClass();
                ((op2) requireActivity).k();
                return;
            case 27:
                xco xcoVar = ((wco) this.b).b;
                xcoVar.c.a(new dsd(28, xcoVar));
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                beo.setRippleState$lambda$2((beo) this.b);
                return;
            default:
                ((HandlerThread) this.b).quit();
                return;
        }
    }
}
