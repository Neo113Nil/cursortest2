package F;

import B1.x;
import O.C0337l;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.activity.G;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c4.InterfaceC0542a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingbigwin.E;
import com.icefishing.icefishingbigwin.SplashActivity;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import e7.C4468a;
import g1.C4523c;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f873n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f874u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f875v;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f873n = i;
        this.f874u = obj;
        this.f875v = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0299, code lost:
    
        if (r0 != null) goto L117;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        String message;
        String str;
        x xVar;
        switch (this.f873n) {
            case 0:
                ((b) this.f874u).h((Typeface) this.f875v);
                return;
            case 1:
                kotlin.jvm.internal.h.e((H5.b) this.f875v, "this$0");
                Y6.c cVar = (Y6.c) this.f874u;
                if (cVar.b()) {
                    Log.d("OneSignalOtel", "OTEL export response received: success");
                    return;
                }
                synchronized (cVar.f3980d) {
                    th = cVar.f3978b;
                }
                String str2 = com.anythink.core.common.v.m.f16809e;
                if (th != null) {
                    try {
                    } catch (Throwable unused) {
                        message = th.getMessage();
                        break;
                    }
                    if (Q7.q.K(th.getClass().getName(), "FailedExportException$HttpExportException")) {
                        Object invoke = th.getClass().getMethod("getResponse", new Class[0]).invoke(th, new Object[0]);
                        if (invoke == null) {
                            message = th.getMessage();
                            if (message == null) {
                            }
                            str2 = message;
                        } else {
                            Object invoke2 = invoke.getClass().getMethod("statusCode", new Class[0]).invoke(invoke, new Object[0]);
                            Object invoke3 = invoke.getClass().getMethod("statusMessage", new Class[0]).invoke(invoke, new Object[0]);
                            Object invoke4 = invoke.getClass().getMethod("responseBody", new Class[0]).invoke(invoke, new Object[0]);
                            byte[] bArr = invoke4 instanceof byte[] ? (byte[]) invoke4 : null;
                            String str3 = bArr != null ? new String(bArr, Q7.a.f2664a) : null;
                            StringBuilder sb = new StringBuilder("status=");
                            sb.append(invoke2);
                            sb.append(" message=");
                            sb.append(invoke3);
                            if (str3 != null && !Q7.j.c0(str3)) {
                                str = " body=".concat(str3);
                                sb.append(str);
                                str2 = sb.toString();
                            }
                            str = "";
                            sb.append(str);
                            str2 = sb.toString();
                        }
                    } else {
                        message = th.getMessage();
                        if (message == null) {
                        }
                        str2 = message;
                    }
                }
                Log.e("OneSignalOtel", "OTEL export response received: failed - " + str2, th);
                return;
            case 2:
                ((K0.f) this.f874u).b((S0.j) this.f875v, false);
                return;
            case 3:
                K0.q qVar = (K0.q) this.f874u;
                U0.k kVar = (U0.k) this.f875v;
                if (qVar.J.f3159n instanceof U0.a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case 4:
                List<P0.b> list = (List) this.f874u;
                Q0.f this$0 = (Q0.f) this.f875v;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                for (P0.b bVar : list) {
                    Object obj = this$0.f2635e;
                    bVar.f2416d = obj;
                    bVar.d(bVar.f2417e, obj);
                }
                return;
            case 5:
                d dVar = (d) this.f874u;
                dVar.getClass();
                Q6.c cVar2 = (Q6.c) this.f875v;
                cVar2.e();
                ((ConcurrentLinkedDeque) dVar.f855c).add(cVar2);
                return;
            case 6:
                R3.p pVar = (R3.p) this.f874u;
                InterfaceC0542a interfaceC0542a = (InterfaceC0542a) this.f875v;
                if (pVar.f2751b != R3.p.f2749d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    xVar = pVar.f2750a;
                    pVar.f2750a = null;
                    pVar.f2751b = interfaceC0542a;
                }
                xVar.getClass();
                return;
            case 7:
                R3.o oVar = (R3.o) this.f874u;
                InterfaceC0542a interfaceC0542a2 = (InterfaceC0542a) this.f875v;
                synchronized (oVar) {
                    try {
                        if (oVar.f2747b == null) {
                            oVar.f2746a.add(interfaceC0542a2);
                        } else {
                            oVar.f2747b.add(interfaceC0542a2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                S3.a aVar = (S3.a) this.f874u;
                Process.setThreadPriority(aVar.f2857c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f2858d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f875v).run();
                return;
            case 9:
                Callable callable = (Callable) this.f874u;
                S3.h hVar = (S3.h) ((F1.a) this.f875v).f903u;
                try {
                    hVar.j(callable.call());
                    return;
                } catch (Exception e9) {
                    hVar.k(e9);
                    return;
                }
            case 10:
                T0.p pVar2 = (T0.p) this.f874u;
                U0.k kVar2 = (U0.k) this.f875v;
                if (pVar2.f3056n.f3159n instanceof U0.a) {
                    kVar2.cancel(true);
                    return;
                } else {
                    kVar2.l(pVar2.f3059w.getForegroundInfoAsync());
                    return;
                }
            case 11:
                ConstraintTrackingWorker this$02 = (ConstraintTrackingWorker) this.f874u;
                N3.a aVar2 = (N3.a) this.f875v;
                kotlin.jvm.internal.h.e(this$02, "this$0");
                synchronized (this$02.f5399u) {
                    try {
                        if (this$02.f5400v) {
                            U0.k future = this$02.f5401w;
                            kotlin.jvm.internal.h.d(future, "future");
                            String str4 = W0.a.f3401a;
                            future.j(new J0.o());
                        } else {
                            this$02.f5401w.l(aVar2);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                r0.getLifecycle().a(new C0337l(1, (G) this.f875v, (androidx.activity.p) this.f874u));
                return;
            case 13:
                int i = SplashActivity.f36886A;
                if (((SplashActivity) this.f874u).f()) {
                    ((E) this.f875v).run();
                    return;
                }
                return;
            case 14:
                com.onesignal.internal.c.logout$lambda$5((com.onesignal.internal.c) this.f874u, (e.a) this.f875v);
                return;
            case 15:
                com.onesignal.internal.c.login$lambda$4((com.onesignal.internal.c) this.f874u, (d.a) this.f875v);
                return;
            case 16:
                int i6 = JobInfoSchedulerService.f23552n;
                ((JobInfoSchedulerService) this.f874u).jobFinished((JobParameters) this.f875v, false);
                return;
            case 17:
                ((C4468a) this.f874u).accept((n7.e) this.f875v);
                return;
            case 18:
                Runnable runnable = (Runnable) this.f875v;
                T0.l lVar = (T0.l) this.f874u;
                lVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    lVar.a();
                }
            case 19:
                j3.h hVar2 = (j3.h) this.f875v;
                C4523c c4523c = FirebaseMessaging.f36190k;
                try {
                    hVar2.b(((FirebaseMessaging) this.f874u).a());
                    return;
                } catch (Exception e10) {
                    hVar2.a(e10);
                    return;
                }
            default:
                j3.h hVar3 = (j3.h) this.f875v;
                try {
                    hVar3.b(((j4.m) this.f874u).b());
                    return;
                } catch (Exception e11) {
                    hVar3.a(e11);
                    return;
                }
        }
    }
}
