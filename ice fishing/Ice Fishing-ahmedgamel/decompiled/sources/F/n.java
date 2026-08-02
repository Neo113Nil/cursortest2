package F;

import O.C0342l;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.activity.G;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.IceFishing.LiveIceFishing.F;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import e4.InterfaceC4481a;
import e7.C4485a;
import i1.C4586c;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f936n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f938v;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f936n = i;
        this.f937u = obj;
        this.f938v = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0298, code lost:
    
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
        D0.n nVar;
        switch (this.f936n) {
            case 0:
                ((b) this.f937u).h((Typeface) this.f938v);
                return;
            case 1:
                kotlin.jvm.internal.h.e((H5.b) this.f938v, "this$0");
                Y6.c cVar = (Y6.c) this.f937u;
                if (cVar.b()) {
                    Log.d("OneSignalOtel", "OTEL export response received: success");
                    return;
                }
                synchronized (cVar.f3924d) {
                    th = cVar.f3922b;
                }
                String str2 = com.anythink.core.common.v.m.f17596e;
                if (th != null) {
                    try {
                    } catch (Throwable unused) {
                        message = th.getMessage();
                        break;
                    }
                    if (Q7.q.a0(th.getClass().getName(), "FailedExportException$HttpExportException")) {
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
                            String str3 = bArr != null ? new String(bArr, Q7.a.f2701a) : null;
                            StringBuilder sb = new StringBuilder("status=");
                            sb.append(invoke2);
                            sb.append(" message=");
                            sb.append(invoke3);
                            if (str3 != null && !Q7.j.s0(str3)) {
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
                ((K0.f) this.f937u).b((S0.j) this.f938v, false);
                return;
            case 3:
                K0.q qVar = (K0.q) this.f937u;
                U0.k kVar = (U0.k) this.f938v;
                if (qVar.J.f3276n instanceof U0.a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case 4:
                List<P0.b> list = (List) this.f937u;
                Q0.f this$0 = (Q0.f) this.f938v;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                for (P0.b bVar : list) {
                    Object obj = this$0.f2470e;
                    bVar.f2347d = obj;
                    bVar.d(bVar.f2348e, obj);
                }
                return;
            case 5:
                d dVar = (d) this.f937u;
                dVar.getClass();
                Q6.c cVar2 = (Q6.c) this.f938v;
                cVar2.e();
                ((ConcurrentLinkedDeque) dVar.f918c).add(cVar2);
                return;
            case 6:
                T0.p pVar = (T0.p) this.f937u;
                U0.k kVar2 = (U0.k) this.f938v;
                if (pVar.f3139n.f3276n instanceof U0.a) {
                    kVar2.cancel(true);
                    return;
                } else {
                    kVar2.l(pVar.f3142w.getForegroundInfoAsync());
                    return;
                }
            case 7:
                T3.p pVar2 = (T3.p) this.f937u;
                InterfaceC4481a interfaceC4481a = (InterfaceC4481a) this.f938v;
                if (pVar2.f3206b != T3.p.f3204d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar2) {
                    nVar = pVar2.f3205a;
                    pVar2.f3205a = null;
                    pVar2.f3206b = interfaceC4481a;
                }
                nVar.getClass();
                return;
            case 8:
                T3.o oVar = (T3.o) this.f937u;
                InterfaceC4481a interfaceC4481a2 = (InterfaceC4481a) this.f938v;
                synchronized (oVar) {
                    try {
                        if (oVar.f3202b == null) {
                            oVar.f3201a.add(interfaceC4481a2);
                        } else {
                            oVar.f3202b.add(interfaceC4481a2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                U3.a aVar = (U3.a) this.f937u;
                Process.setThreadPriority(aVar.f3296c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f3297d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f938v).run();
                return;
            case 10:
                Callable callable = (Callable) this.f937u;
                U3.h hVar = (U3.h) ((C4586c) this.f938v).f38154u;
                try {
                    hVar.j(callable.call());
                    return;
                } catch (Exception e9) {
                    hVar.k(e9);
                    return;
                }
            case 11:
                ConstraintTrackingWorker this$02 = (ConstraintTrackingWorker) this.f937u;
                P3.a aVar2 = (P3.a) this.f938v;
                kotlin.jvm.internal.h.e(this$02, "this$0");
                synchronized (this$02.f5364u) {
                    try {
                        if (this$02.f5365v) {
                            U0.k future = this$02.f5366w;
                            kotlin.jvm.internal.h.d(future, "future");
                            String str4 = W0.a.f3531a;
                            future.j(new J0.n());
                        } else {
                            this$02.f5366w.l(aVar2);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                r0.getLifecycle().a(new C0342l(1, (G) this.f938v, (androidx.activity.p) this.f937u));
                return;
            case 13:
                int i = SplashActivity.f6375A;
                if (((SplashActivity) this.f937u).f()) {
                    ((F) this.f938v).run();
                    return;
                }
                return;
            case 14:
                com.onesignal.internal.c.logout$lambda$5((com.onesignal.internal.c) this.f937u, (e.a) this.f938v);
                return;
            case 15:
                com.onesignal.internal.c.login$lambda$4((com.onesignal.internal.c) this.f937u, (d.a) this.f938v);
                return;
            case 16:
                ((C4485a) this.f937u).accept((n7.e) this.f938v);
                return;
            case 17:
                Runnable runnable = (Runnable) this.f938v;
                T0.l lVar = (T0.l) this.f937u;
                lVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    lVar.a();
                }
            case 18:
                int i4 = JobInfoSchedulerService.f24332n;
                ((JobInfoSchedulerService) this.f937u).jobFinished((JobParameters) this.f938v, false);
                return;
            case 19:
                l3.h hVar2 = (l3.h) this.f938v;
                C4586c c4586c = FirebaseMessaging.f36957k;
                try {
                    hVar2.b(((FirebaseMessaging) this.f937u).a());
                    return;
                } catch (Exception e10) {
                    hVar2.a(e10);
                    return;
                }
            default:
                l3.h hVar3 = (l3.h) this.f938v;
                try {
                    hVar3.b(((l4.m) this.f937u).b());
                    return;
                } catch (Exception e11) {
                    hVar3.a(e11);
                    return;
                }
        }
    }
}
