package A3;

import D.AbstractC0278h;
import D.C0277g;
import D.x;
import E2.M;
import J3.C0321e;
import Z0.C;
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
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.G;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.LD;
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
import l4.C4674A;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f182n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f183u;

    public /* synthetic */ p(int i, Object obj) {
        this.f182n = i;
        this.f183u = obj;
    }

    private final void a() {
        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f183u;
        synchronized (pVar.f4759w) {
            try {
                if (pVar.f4755A == null) {
                    return;
                }
                try {
                    L.h b9 = pVar.b();
                    int i = b9.f1711e;
                    if (i == 2) {
                        synchronized (pVar.f4759w) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i4 = K.n.f1594a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        G3.e eVar = pVar.f4758v;
                        Context context = pVar.f4756n;
                        eVar.getClass();
                        Typeface d9 = G.j.f1038a.d(context, new L.h[]{b9}, 0);
                        MappedByteBuffer p9 = S0.f.p(pVar.f4756n, b9.f1707a);
                        if (p9 == null || d9 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            S0.n nVar = new S0.n(d9, Q3.b.r(p9));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (pVar.f4759w) {
                                try {
                                    A8.b bVar = pVar.f4755A;
                                    if (bVar != null) {
                                        bVar.s(nVar);
                                    }
                                } finally {
                                }
                            }
                            pVar.a();
                        } finally {
                            int i6 = K.n.f1594a;
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f4759w) {
                        try {
                            A8.b bVar2 = pVar.f4755A;
                            if (bVar2 != null) {
                                bVar2.r(th2);
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
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 2;
        ?? r42 = 1;
        r42 = 1;
        switch (this.f182n) {
            case 0:
                View view = (View) this.f183u;
                ((InputMethodManager) E.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                Activity activity = (Activity) this.f183u;
                if (activity.isFinishing()) {
                    return;
                }
                ?? r52 = Build.VERSION.SDK_INT;
                if (r52 >= 28) {
                    Class cls = AbstractC0278h.f368a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0278h.f368a;
                ?? r62 = 27;
                boolean z6 = r52 == 26 || r52 == 27;
                Method method = AbstractC0278h.f373f;
                if ((!z6 || method != null) && (AbstractC0278h.f372e != null || AbstractC0278h.f371d != null)) {
                    try {
                        Object obj2 = AbstractC0278h.f370c.get(activity);
                        if (obj2 != null && (obj = AbstractC0278h.f369b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0277g c0277g = new C0277g(activity);
                            application.registerActivityLifecycleCallbacks(c0277g);
                            Handler handler = AbstractC0278h.f374g;
                            handler.post(new LD(1 == true ? 1 : 0, c0277g, obj2));
                            if (r52 != 26 && r52 != 27) {
                                r42 = 0;
                            }
                            try {
                                if (r42 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r42 = application;
                                        r52 = c0277g;
                                        r62 = handler;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        C0277g c0277g2 = c0277g;
                                        Handler handler2 = handler;
                                        handler2.post(new LD(i, application2, c0277g2));
                                        throw th;
                                    }
                                } else {
                                    r42 = application;
                                    r52 = c0277g;
                                    r62 = handler;
                                    activity.recreate();
                                }
                                r62.post(new LD(i, r42, r52));
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
            case 2:
                H3.e eVar = (H3.e) this.f183u;
                eVar.f1245b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f1248e;
                W.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.g()) {
                    eVar.a(eVar.f1246c);
                    return;
                } else {
                    if (sideSheetBehavior.f36813h == 2) {
                        sideSheetBehavior.r(eVar.f1246c);
                        return;
                    }
                    return;
                }
            case 3:
                CoroutineWorker.a((CoroutineWorker) this.f183u);
                return;
            case 4:
                ((C0321e) this.f183u).t(true);
                return;
            case 5:
                J3.m mVar = (J3.m) this.f183u;
                boolean isPopupShowing = mVar.f1488h.isPopupShowing();
                mVar.t(isPopupShowing);
                mVar.f1492m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f183u).f36900w.requestLayout();
                return;
            case 7:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f183u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (this$0.f5366w.f3276n instanceof U0.a) {
                    return;
                }
                String b9 = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                J0.r d9 = J0.r.d();
                kotlin.jvm.internal.h.d(d9, "get()");
                if (b9 == null || b9.length() == 0) {
                    d9.b(W0.a.f3531a, "No worker to delegate to.");
                    U0.k future = this$0.f5366w;
                    kotlin.jvm.internal.h.d(future, "future");
                    future.j(new J0.m());
                    return;
                }
                J0.q a9 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), b9, this$0.f5363n);
                this$0.f5367x = a9;
                if (a9 == null) {
                    d9.a(W0.a.f3531a, "No worker to delegate to.");
                    U0.k future2 = this$0.f5366w;
                    kotlin.jvm.internal.h.d(future2, "future");
                    future2.j(new J0.m());
                    return;
                }
                K0.p b10 = K0.p.b(this$0.getApplicationContext());
                S0.q t6 = b10.f1643c.t();
                String uuid = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid, "id.toString()");
                S0.p h3 = t6.h(uuid);
                if (h3 == null) {
                    U0.k future3 = this$0.f5366w;
                    kotlin.jvm.internal.h.d(future3, "future");
                    String str = W0.a.f3531a;
                    future3.j(new J0.m());
                    return;
                }
                S0.i iVar = b10.f1649j;
                kotlin.jvm.internal.h.d(iVar, "workManagerImpl.trackers");
                b3.e eVar3 = new b3.e(iVar, this$0);
                eVar3.E(Z2.d.n(h3));
                String uuid2 = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                if (!eVar3.l(uuid2)) {
                    d9.a(W0.a.f3531a, "Constraints not met for delegate " + b9 + ". Requesting retry.");
                    U0.k future4 = this$0.f5366w;
                    kotlin.jvm.internal.h.d(future4, "future");
                    future4.j(new J0.n());
                    return;
                }
                d9.a(W0.a.f3531a, "Constraints met for delegate ".concat(b9));
                try {
                    J0.q qVar = this$0.f5367x;
                    kotlin.jvm.internal.h.b(qVar);
                    P3.a startWork = qVar.startWork();
                    kotlin.jvm.internal.h.d(startWork, "delegate!!.startWork()");
                    startWork.a(new F.n(11, this$0, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th3) {
                    String str2 = W0.a.f3531a;
                    String l9 = x.l("Delegated worker ", b9, " threw exception in startWork.");
                    if (d9.f1433a <= 3) {
                        Log.d(str2, l9, th3);
                    }
                    synchronized (this$0.f5364u) {
                        try {
                            if (!this$0.f5365v) {
                                U0.k future5 = this$0.f5366w;
                                kotlin.jvm.internal.h.d(future5, "future");
                                future5.j(new J0.m());
                                return;
                            } else {
                                d9.a(str2, "Constraints were unmet, Retrying.");
                                U0.k future6 = this$0.f5366w;
                                kotlin.jvm.internal.h.d(future6, "future");
                                future6.j(new J0.n());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 8:
                ((CountDownLatch) this.f183u).countDown();
                return;
            case 9:
                l1.i.b((ByteArrayInputStream) this.f183u);
                return;
            case 10:
                ((C) this.f183u).c();
                return;
            case 11:
                androidx.activity.l lVar = (androidx.activity.l) this.f183u;
                Runnable runnable = lVar.f4419u;
                if (runnable != null) {
                    runnable.run();
                    lVar.f4419u = null;
                    return;
                }
                return;
            case 12:
                androidx.activity.q.a((androidx.activity.q) this.f183u);
                return;
            case 13:
                a();
                return;
            case 14:
                G this$02 = (G) this.f183u;
                kotlin.jvm.internal.h.e(this$02, "this$0");
                int i4 = this$02.f5073u;
                C0509x c0509x = this$02.f5077y;
                if (i4 == 0) {
                    this$02.f5074v = true;
                    c0509x.e(EnumC0500n.ON_PAUSE);
                }
                if (this$02.f5072n == 0 && this$02.f5074v) {
                    c0509x.e(EnumC0500n.ON_STOP);
                    this$02.f5075w = true;
                    return;
                }
                return;
            case 15:
                ((com.anythink.core.common.n.b.a.b.f) this.f183u).d();
                return;
            case 16:
                ((com.anythink.core.common.n.b.a.k.a) this.f183u).q();
                return;
            case 17:
                ((com.google.android.material.timepicker.e) this.f183u).m();
                return;
            case 18:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.e) this.f183u);
                return;
            case 19:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f183u);
                return;
            case 20:
                com.onesignal.core.internal.startup.c.scheduleStart$lambda$2((com.onesignal.core.internal.startup.c) this.f183u);
                return;
            case 21:
                com.onesignal.debug.internal.crash.b.start$lambda$0((com.onesignal.debug.internal.crash.b) this.f183u);
                return;
            case 22:
                a.C0225a.invokeSuspend$lambda$0((com.onesignal.notifications.activities.a) this.f183u);
                return;
            case 23:
                h2.j jVar = (h2.j) this.f183u;
                jVar.getClass();
                ((i2.h) jVar.f38117d).m(new J3.l(9, jVar));
                return;
            case 24:
                com.bumptech.glide.b.a((Intent) this.f183u);
                return;
            case 25:
                M m9 = (M) this.f183u;
                synchronized (((ArrayDeque) m9.f764x)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) m9.f761u).edit();
                    String str3 = (String) m9.f762v;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) m9.f764x).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) m9.f763w);
                    }
                    edit.putString(str3, sb.toString()).commit();
                }
                return;
            case 26:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                C4674A c4674a = (C4674A) this.f183u;
                sb2.append(c4674a.f38887a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                c4674a.f38888b.d(null);
                return;
            default:
                ((CarouselLayoutManager) this.f183u).l0();
                return;
        }
    }

    public /* synthetic */ p(com.bumptech.glide.b bVar, Intent intent) {
        this.f182n = 24;
        this.f183u = intent;
    }
}
