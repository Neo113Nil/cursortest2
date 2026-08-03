package a1;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import bc.a0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d.y;
import d8.n;
import d8.v;
import java.util.List;
import java.util.concurrent.Callable;
import l7.o;
import l7.p;
import m.s;
import o4.k;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f160i;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f158g = i10;
        this.f159h = obj;
        this.f160i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d6.f fVar;
        switch (this.f158g) {
            case 0:
                a0.i((h) this.f159h, (LongSparseArray) this.f160i);
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f159h;
                h7.a aVar = (h7.a) this.f160i;
                synchronized (constraintTrackingWorker.f788h) {
                    try {
                        if (constraintTrackingWorker.f789i) {
                            z4.j jVar = constraintTrackingWorker.f790j;
                            pc.j.d(jVar, "future");
                            String str = b5.a.f1015a;
                            jVar.i(new k());
                        } else {
                            constraintTrackingWorker.f790j.k(aVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f159h;
                JobParameters jobParameters = (JobParameters) this.f160i;
                int i10 = JobInfoSchedulerService.f1402g;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 3:
                MainActivity mainActivity = (MainActivity) this.f159h;
                mainActivity.f1510g.a(new d.g((y) this.f160i, mainActivity));
                return;
            case 4:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f159h;
                g7.h hVar = (g7.h) this.f160i;
                v vVar = FirebaseMessaging.f1457k;
                try {
                    hVar.a(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    hVar.f2537a.k(e10);
                    return;
                }
            case 5:
                n nVar = (n) this.f159h;
                g7.h hVar2 = (g7.h) this.f160i;
                try {
                    hVar2.a(nVar.a());
                    return;
                } catch (Exception e11) {
                    hVar2.f2537a.k(e11);
                    return;
                }
            case 6:
                p pVar = (p) this.f159h;
                w7.a aVar2 = (w7.a) this.f160i;
                if (pVar.f4250b != p.f4248d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    fVar = pVar.f4249a;
                    pVar.f4249a = null;
                    pVar.f4250b = aVar2;
                }
                fVar.getClass();
                return;
            case 7:
                o oVar = (o) this.f159h;
                w7.a aVar3 = (w7.a) this.f160i;
                synchronized (oVar) {
                    try {
                        if (oVar.f4246b == null) {
                            oVar.f4245a.add(aVar3);
                        } else {
                            oVar.f4246b.add(aVar3.get());
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                m7.a aVar4 = (m7.a) this.f159h;
                Runnable runnable = (Runnable) this.f160i;
                Process.setThreadPriority(aVar4.f4935c);
                StrictMode.ThreadPolicy threadPolicy = aVar4.f4936d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 9:
                Callable callable = (Callable) this.f159h;
                m7.g gVar = (m7.g) this.f160i;
                try {
                    Object call = callable.call();
                    m7.i iVar = (m7.i) gVar.f4957h;
                    if (call == null) {
                        call = v2.h.f7204m;
                    }
                    if (v2.h.f7203l.g(iVar, null, call)) {
                        v2.h.d(iVar);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    gVar.v(e12);
                    return;
                }
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                ((p4.e) this.f159h).b((x4.j) this.f160i, false);
                return;
            case 11:
                p4.o oVar2 = (p4.o) this.f159h;
                h7.a aVar5 = (h7.a) this.f160i;
                if (oVar2.f5520w.f9129g instanceof z4.a) {
                    aVar5.cancel(true);
                    return;
                }
                return;
            case 12:
                List<u4.b> list = (List) this.f159h;
                v4.e eVar = (v4.e) this.f160i;
                for (u4.b bVar : list) {
                    Object obj = eVar.f7218e;
                    bVar.f6692d = obj;
                    bVar.d(bVar.f6693e, obj);
                }
                return;
            case 13:
                y4.p pVar2 = (y4.p) this.f159h;
                z4.j jVar2 = (z4.j) this.f160i;
                if (pVar2.f8763g.f9129g instanceof z4.a) {
                    jVar2.cancel(true);
                    return;
                } else {
                    jVar2.k(pVar2.f8766j.getForegroundInfoAsync());
                    return;
                }
            default:
                ((s) this.f159h).c((Typeface) this.f160i);
                return;
        }
    }
}
