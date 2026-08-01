package D;

import H3.C0312e;
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
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.LD;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.onesignal.notifications.activities.a;
import j4.C4605A;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: D.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0282a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f465n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f466u;

    public /* synthetic */ RunnableC0282a(int i, Object obj) {
        this.f465n = i;
        this.f466u = obj;
    }

    private final void a() {
        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) this.f466u;
        synchronized (pVar.f4791w) {
            try {
                if (pVar.f4787A == null) {
                    return;
                }
                try {
                    L.h c9 = pVar.c();
                    int i = c9.f1602e;
                    if (i == 2) {
                        synchronized (pVar.f4791w) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i6 = K.n.f1485a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        a4.e eVar = pVar.f4790v;
                        Context context = pVar.f4788n;
                        eVar.getClass();
                        Typeface e9 = G.j.f1012a.e(context, new L.h[]{c9}, 0);
                        MappedByteBuffer M8 = X2.e.M(pVar.f4788n, c9.f1598a);
                        if (M8 == null || e9 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            S0.i iVar = new S0.i(e9, L3.F.o(M8));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (pVar.f4791w) {
                                try {
                                    t8.g gVar = pVar.f4787A;
                                    if (gVar != null) {
                                        gVar.t(iVar);
                                    }
                                } finally {
                                }
                            }
                            pVar.b();
                        } finally {
                            int i9 = K.n.f1485a;
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f4791w) {
                        try {
                            t8.g gVar2 = pVar.f4787A;
                            if (gVar2 != null) {
                                gVar2.s(th2);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
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
        int i = 4;
        ?? r32 = 3;
        char c9 = 3;
        ?? r52 = 1;
        r52 = 1;
        switch (this.f465n) {
            case 0:
                Activity activity = (Activity) this.f466u;
                if (activity.isFinishing()) {
                    return;
                }
                ?? r62 = Build.VERSION.SDK_INT;
                if (r62 >= 28) {
                    Class cls = AbstractC0290i.f473a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0290i.f473a;
                boolean z3 = r62 == 26 || r62 == 27;
                Method method = AbstractC0290i.f478f;
                if ((!z3 || method != null) && (AbstractC0290i.f477e != null || AbstractC0290i.f476d != null)) {
                    try {
                        Object obj2 = AbstractC0290i.f475c.get(activity);
                        if (obj2 != null && (obj = AbstractC0290i.f474b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0289h c0289h = new C0289h(activity);
                            application.registerActivityLifecycleCallbacks(c0289h);
                            Handler handler = AbstractC0290i.f479g;
                            handler.post(new LD(c9, c0289h, obj2));
                            if (r62 != 26 && r62 != 27) {
                                r52 = 0;
                            }
                            try {
                                if (r52 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r32 = application;
                                        r52 = c0289h;
                                        r62 = handler;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        C0289h c0289h2 = c0289h;
                                        Handler handler2 = handler;
                                        handler2.post(new LD(i, application2, c0289h2));
                                        throw th;
                                    }
                                } else {
                                    r32 = application;
                                    r52 = c0289h;
                                    r62 = handler;
                                    activity.recreate();
                                }
                                r62.post(new LD(i, r32, r52));
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
                F3.e eVar = (F3.e) this.f466u;
                eVar.f960b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f963e;
                W.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.g()) {
                    eVar.a(eVar.f961c);
                    return;
                } else {
                    if (sideSheetBehavior.f36045h == 2) {
                        sideSheetBehavior.r(eVar.f961c);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0312e) this.f466u).t(true);
                return;
            case 3:
                H3.m mVar = (H3.m) this.f466u;
                boolean isPopupShowing = mVar.f1132h.isPopupShowing();
                mVar.t(isPopupShowing);
                mVar.f1136m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f466u).f36133w.requestLayout();
                return;
            case 5:
                CoroutineWorker.a((CoroutineWorker) this.f466u);
                return;
            case 6:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f466u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (this$0.f5401w.f3159n instanceof U0.a) {
                    return;
                }
                String b9 = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                J0.s d2 = J0.s.d();
                kotlin.jvm.internal.h.d(d2, "get()");
                if (b9 == null || b9.length() == 0) {
                    d2.b(W0.a.f3401a, "No worker to delegate to.");
                    U0.k future = this$0.f5401w;
                    kotlin.jvm.internal.h.d(future, "future");
                    future.j(new J0.n());
                    return;
                }
                J0.r a9 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), b9, this$0.f5398n);
                this$0.f5402x = a9;
                if (a9 == null) {
                    d2.a(W0.a.f3401a, "No worker to delegate to.");
                    U0.k future2 = this$0.f5401w;
                    kotlin.jvm.internal.h.d(future2, "future");
                    future2.j(new J0.n());
                    return;
                }
                K0.p b10 = K0.p.b(this$0.getApplicationContext());
                S0.q t6 = b10.f1534c.t();
                String uuid = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid, "id.toString()");
                S0.p h9 = t6.h(uuid);
                if (h9 == null) {
                    U0.k future3 = this$0.f5401w;
                    kotlin.jvm.internal.h.d(future3, "future");
                    String str = W0.a.f3401a;
                    future3.j(new J0.n());
                    return;
                }
                S0.i iVar = b10.f1540j;
                kotlin.jvm.internal.h.d(iVar, "workManagerImpl.trackers");
                Z2.e eVar3 = new Z2.e(iVar, this$0);
                eVar3.E(d6.c.k(h9));
                String uuid2 = this$0.getId().toString();
                kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                if (!eVar3.l(uuid2)) {
                    d2.a(W0.a.f3401a, "Constraints not met for delegate " + b9 + ". Requesting retry.");
                    U0.k future4 = this$0.f5401w;
                    kotlin.jvm.internal.h.d(future4, "future");
                    future4.j(new J0.o());
                    return;
                }
                d2.a(W0.a.f3401a, "Constraints met for delegate ".concat(b9));
                try {
                    J0.r rVar = this$0.f5402x;
                    kotlin.jvm.internal.h.b(rVar);
                    N3.a startWork = rVar.startWork();
                    kotlin.jvm.internal.h.d(startWork, "delegate!!.startWork()");
                    startWork.a(new F.n(11, this$0, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th3) {
                    String str2 = W0.a.f3401a;
                    String o6 = y.o("Delegated worker ", b9, " threw exception in startWork.");
                    if (d2.f1405a <= 3) {
                        Log.d(str2, o6, th3);
                    }
                    synchronized (this$0.f5399u) {
                        try {
                            if (!this$0.f5400v) {
                                U0.k future5 = this$0.f5401w;
                                kotlin.jvm.internal.h.d(future5, "future");
                                future5.j(new J0.n());
                                return;
                            } else {
                                d2.a(str2, "Constraints were unmet, Retrying.");
                                U0.k future6 = this$0.f5401w;
                                kotlin.jvm.internal.h.d(future6, "future");
                                future6.j(new J0.o());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 7:
                j1.j.b((ByteArrayInputStream) this.f466u);
                return;
            case 8:
                ((X0.C) this.f466u).c();
                return;
            case 9:
                ((CountDownLatch) this.f466u).countDown();
                return;
            case 10:
                androidx.activity.l lVar = (androidx.activity.l) this.f466u;
                Runnable runnable = lVar.f4451u;
                if (runnable != null) {
                    runnable.run();
                    lVar.f4451u = null;
                    return;
                }
                return;
            case 11:
                androidx.activity.q.a((androidx.activity.q) this.f466u);
                return;
            case 12:
                a();
                return;
            case 13:
                androidx.lifecycle.G this$02 = (androidx.lifecycle.G) this.f466u;
                kotlin.jvm.internal.h.e(this$02, "this$0");
                int i6 = this$02.f5106u;
                C0505x c0505x = this$02.f5110y;
                if (i6 == 0) {
                    this$02.f5107v = true;
                    c0505x.e(EnumC0496n.ON_PAUSE);
                }
                if (this$02.f5105n == 0 && this$02.f5107v) {
                    c0505x.e(EnumC0496n.ON_STOP);
                    this$02.f5108w = true;
                    return;
                }
                return;
            case 14:
                ((com.anythink.core.common.n.b.a.b.f) this.f466u).d();
                return;
            case 15:
                ((com.anythink.core.common.n.b.a.k.a) this.f466u).q();
                return;
            case 16:
                ((com.google.android.material.timepicker.e) this.f466u).m();
                return;
            case 17:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.e) this.f466u);
                return;
            case 18:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f466u);
                return;
            case 19:
                com.onesignal.core.internal.startup.c.scheduleStart$lambda$2((com.onesignal.core.internal.startup.c) this.f466u);
                return;
            case 20:
                com.onesignal.debug.internal.crash.b.start$lambda$0((com.onesignal.debug.internal.crash.b) this.f466u);
                return;
            case 21:
                a.C0225a.invokeSuspend$lambda$0((com.onesignal.notifications.activities.a) this.f466u);
                return;
            case 22:
                f2.j jVar = (f2.j) this.f466u;
                jVar.getClass();
                ((g2.h) jVar.f37493d).m(new H3.l(9, jVar));
                return;
            case 23:
                com.bumptech.glide.b.a((Intent) this.f466u);
                return;
            case 24:
                C2.N n9 = (C2.N) this.f466u;
                synchronized (((ArrayDeque) n9.f304x)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) n9.f301u).edit();
                    String str3 = (String) n9.f302v;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) n9.f304x).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) n9.f303w);
                    }
                    edit.putString(str3, sb.toString()).commit();
                }
                return;
            case 25:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                C4605A c4605a = (C4605A) this.f466u;
                sb2.append(c4605a.f38375a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                c4605a.f38376b.d(null);
                return;
            case 26:
                ((CarouselLayoutManager) this.f466u).l0();
                return;
            default:
                View view = (View) this.f466u;
                ((InputMethodManager) E.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ RunnableC0282a(com.bumptech.glide.b bVar, Intent intent) {
        this.f465n = 23;
        this.f466u = intent;
    }
}
