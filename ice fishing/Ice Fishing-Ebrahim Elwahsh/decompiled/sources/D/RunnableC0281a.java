package D;

import B2.RunnableC0272f;
import F3.C0311e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.onesignal.notifications.activities.a;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: D.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0281a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f520n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f521u;

    public /* synthetic */ RunnableC0281a(int i, Object obj) {
        this.f520n = i;
        this.f521u = obj;
    }

    private final void a() {
        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f521u;
        synchronized (pVar.f4904w) {
            try {
                if (pVar.f4900A == null) {
                    return;
                }
                try {
                    L.h b9 = pVar.b();
                    int i = b9.f1690e;
                    if (i == 2) {
                        synchronized (pVar.f4904w) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i4 = K.n.f1482a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C3.e eVar = pVar.f4903v;
                        Context context = pVar.f4901n;
                        eVar.getClass();
                        Typeface i9 = G.j.f1158a.i(context, new L.h[]{b9}, 0);
                        MappedByteBuffer t9 = com.bumptech.glide.e.t(pVar.f4901n, b9.f1686a);
                        if (t9 == null || i9 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            f4.p pVar2 = new f4.p(i9, W2.e.o(t9));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (pVar.f4904w) {
                                try {
                                    S0.f fVar = pVar.f4900A;
                                    if (fVar != null) {
                                        fVar.p(pVar2);
                                    }
                                } finally {
                                }
                            }
                            pVar.a();
                        } finally {
                            int i10 = K.n.f1482a;
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f4904w) {
                        try {
                            S0.f fVar2 = pVar.f4900A;
                            if (fVar2 != null) {
                                fVar2.o(th2);
                            }
                            pVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 2;
        Application application = null;
        int i4 = 3;
        ?? r52 = 1;
        r52 = 1;
        switch (this.f520n) {
            case 0:
                Activity activity = (Activity) this.f521u;
                if (activity.isFinishing()) {
                    return;
                }
                ?? r62 = Build.VERSION.SDK_INT;
                if (r62 >= 28) {
                    Class cls = AbstractC0289i.f528a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0289i.f528a;
                boolean z8 = r62 == 26 || r62 == 27;
                Method method = AbstractC0289i.f533f;
                if ((!z8 || method != null) && (AbstractC0289i.f532e != null || AbstractC0289i.f531d != null)) {
                    try {
                        Object obj2 = AbstractC0289i.f530c.get(activity);
                        if (obj2 != null && (obj = AbstractC0289i.f529b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            C0288h c0288h = new C0288h(activity);
                            application2.registerActivityLifecycleCallbacks(c0288h);
                            Handler handler = AbstractC0289i.f534g;
                            handler.post(new RunnableC0272f(i, c0288h, obj2));
                            if (r62 != 26 && r62 != 27) {
                                r52 = 0;
                            }
                            try {
                                if (r52 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r52 = c0288h;
                                        r62 = handler;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application2;
                                        C0288h c0288h2 = c0288h;
                                        Handler handler2 = handler;
                                        handler2.post(new RunnableC0272f(i4, application, c0288h2));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r52 = c0288h;
                                    r62 = handler;
                                    activity.recreate();
                                }
                                r62.post(new RunnableC0272f(i4, application, r52));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                D3.f fVar = (D3.f) this.f521u;
                fVar.f696b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) fVar.f699e;
                W.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.g()) {
                    fVar.a(fVar.f697c);
                    return;
                } else {
                    if (sideSheetBehavior.f36210h == 2) {
                        sideSheetBehavior.r(fVar.f697c);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0311e) this.f521u).t(true);
                return;
            case 3:
                F3.m mVar = (F3.m) this.f521u;
                boolean isPopupShowing = mVar.f1045h.isPopupShowing();
                mVar.t(isPopupShowing);
                mVar.f1049m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f521u).f36298w.requestLayout();
                return;
            case 5:
                CoroutineWorker.a((CoroutineWorker) this.f521u);
                return;
            case 6:
                ((CountDownLatch) this.f521u).countDown();
                return;
            case 7:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f521u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (this$0.f5513w.f3237n instanceof U0.a) {
                    return;
                }
                String b9 = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                J0.s d2 = J0.s.d();
                kotlin.jvm.internal.h.d(d2, "get()");
                if (b9 == null || b9.length() == 0) {
                    d2.b(W0.a.f3413a, "No worker to delegate to.");
                    U0.k future = this$0.f5513w;
                    kotlin.jvm.internal.h.d(future, "future");
                    future.j(new J0.n());
                    return;
                }
                J0.r a9 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), b9, this$0.f5510n);
                this$0.f5514x = a9;
                if (a9 == null) {
                    d2.a(W0.a.f3413a, "No worker to delegate to.");
                    U0.k future2 = this$0.f5513w;
                    kotlin.jvm.internal.h.d(future2, "future");
                    future2.j(new J0.n());
                    return;
                }
                K0.p b10 = K0.p.b(this$0.getApplicationContext());
                S0.q t9 = b10.f1532c.t();
                String uuid = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid, "id.toString()");
                S0.p h9 = t9.h(uuid);
                if (h9 == null) {
                    U0.k future3 = this$0.f5513w;
                    kotlin.jvm.internal.h.d(future3, "future");
                    String str = W0.a.f3413a;
                    future3.j(new J0.n());
                    return;
                }
                f4.p pVar = b10.f1538j;
                kotlin.jvm.internal.h.d(pVar, "workManagerImpl.trackers");
                Y2.e eVar2 = new Y2.e(pVar, this$0);
                eVar2.H(p8.g.k(h9));
                String uuid2 = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                if (!eVar2.m(uuid2)) {
                    d2.a(W0.a.f3413a, "Constraints not met for delegate " + b9 + ". Requesting retry.");
                    U0.k future4 = this$0.f5513w;
                    kotlin.jvm.internal.h.d(future4, "future");
                    future4.j(new J0.o());
                    return;
                }
                d2.a(W0.a.f3413a, "Constraints met for delegate ".concat(b9));
                try {
                    J0.r rVar = this$0.f5514x;
                    kotlin.jvm.internal.h.b(rVar);
                    J3.a startWork = rVar.startWork();
                    kotlin.jvm.internal.h.d(startWork, "delegate!!.startWork()");
                    startWork.c(new D5.b(11, this$0, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th3) {
                    String str2 = W0.a.f3413a;
                    String k6 = y.k("Delegated worker ", b9, " threw exception in startWork.");
                    if (d2.f1330a <= 3) {
                        Log.d(str2, k6, th3);
                    }
                    synchronized (this$0.f5511u) {
                        try {
                            if (!this$0.f5512v) {
                                U0.k future5 = this$0.f5513w;
                                kotlin.jvm.internal.h.d(future5, "future");
                                future5.j(new J0.n());
                                return;
                            } else {
                                d2.a(str2, "Constraints were unmet, Retrying.");
                                U0.k future6 = this$0.f5513w;
                                kotlin.jvm.internal.h.d(future6, "future");
                                future6.j(new J0.o());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 8:
                j1.j.b((ByteArrayInputStream) this.f521u);
                return;
            case 9:
                ((X0.C) this.f521u).c();
                return;
            case 10:
                androidx.activity.l lVar = (androidx.activity.l) this.f521u;
                Runnable runnable = lVar.f4566u;
                if (runnable != null) {
                    runnable.run();
                    lVar.f4566u = null;
                    return;
                }
                return;
            case 11:
                androidx.activity.q.a((androidx.activity.q) this.f521u);
                return;
            case 12:
                a();
                return;
            case 13:
                androidx.lifecycle.G this$02 = (androidx.lifecycle.G) this.f521u;
                kotlin.jvm.internal.h.e(this$02, "this$0");
                int i9 = this$02.f5218u;
                C0515x c0515x = this$02.f5222y;
                if (i9 == 0) {
                    this$02.f5219v = true;
                    c0515x.e(EnumC0506n.ON_PAUSE);
                }
                if (this$02.f5217n == 0 && this$02.f5219v) {
                    c0515x.e(EnumC0506n.ON_STOP);
                    this$02.f5220w = true;
                    return;
                }
                return;
            case 14:
                ((com.anythink.core.common.n.b.a.b.f) this.f521u).d();
                return;
            case 15:
                ((com.anythink.core.common.n.b.a.k.a) this.f521u).q();
                return;
            case 16:
                ((com.google.android.material.timepicker.e) this.f521u).m();
                return;
            case 17:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.e) this.f521u);
                return;
            case 18:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f521u);
                return;
            case 19:
                com.onesignal.core.internal.startup.c.scheduleStart$lambda$2((com.onesignal.core.internal.startup.c) this.f521u);
                return;
            case 20:
                com.onesignal.debug.internal.crash.b.start$lambda$0((com.onesignal.debug.internal.crash.b) this.f521u);
                return;
            case 21:
                a.C0224a.invokeSuspend$lambda$0((com.onesignal.notifications.activities.a) this.f521u);
                return;
            case 22:
                f2.j jVar = (f2.j) this.f521u;
                jVar.getClass();
                ((g2.h) jVar.f37697d).m(new F3.l(9, jVar));
                return;
            case 23:
                com.bumptech.glide.b.a((Intent) this.f521u);
                return;
            case 24:
                B2.N n9 = (B2.N) this.f521u;
                synchronized (((ArrayDeque) n9.f199x)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) n9.f196u).edit();
                    String str3 = (String) n9.f197v;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) n9.f199x).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) n9.f198w);
                    }
                    edit.putString(str3, sb.toString()).commit();
                }
                return;
            case 25:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                f4.z zVar = (f4.z) this.f521u;
                sb2.append(zVar.f37806a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                zVar.f37807b.d(null);
                return;
            case 26:
                ((CarouselLayoutManager) this.f521u).l0();
                return;
            default:
                View view = (View) this.f521u;
                ((InputMethodManager) E.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ RunnableC0281a(com.bumptech.glide.b bVar, Intent intent) {
        this.f520n = 23;
        this.f521u = intent;
    }
}
