package ru.yandex.taxi.order.services;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import defpackage.chx;
import defpackage.czo0;
import defpackage.dhv;
import defpackage.dxq0;
import defpackage.ej60;
import defpackage.exq0;
import defpackage.fxq0;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.gxq0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jx81;
import defpackage.ky2;
import defpackage.l0b0;
import defpackage.ny61;
import defpackage.ojw;
import defpackage.pzt0;
import defpackage.r8h;
import defpackage.rgx;
import defpackage.s66;
import defpackage.tgx;
import defpackage.tje;
import defpackage.u180;
import defpackage.unr0;
import defpackage.v180;
import defpackage.vng;
import defpackage.vuu0;
import defpackage.w180;
import defpackage.xby;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes6.dex */
public final class d {
    public final c a;
    public final ky2 b;
    public final l0b0 c;
    public final r8h d;
    public final ej60 e;
    public final tgx f;
    public final h3y g;
    public final s66 h;
    public AbstractKeepAliveService j;
    public long k;
    public long l;
    public v180 m;
    public pzt0 r;
    public String s;
    public final hbp0 i = new hbp0(new czo0(14), "KeepAliveService", null);
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public final kotlinx.coroutines.sync.a o = gtq0.a();
    public final dhv p = new dhv(16, this);
    public final i3y q = kotlin.a.a(new ojw(29));

    public d(c cVar, ky2 ky2Var, l0b0 l0b0Var, r8h r8hVar, ej60 ej60Var, tgx tgxVar, h3y h3yVar, s66 s66Var) {
        this.a = cVar;
        this.b = ky2Var;
        this.c = l0b0Var;
        this.d = r8hVar;
        this.e = ej60Var;
        this.f = tgxVar;
        this.g = h3yVar;
        this.h = s66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, rgx rgxVar, dxq0 dxq0Var, ContinuationImpl continuationImpl) {
        KeepAliveServicePresenter$startForeground$1 keepAliveServicePresenter$startForeground$1;
        int i;
        boolean z;
        int i2;
        l0b0 l0b0Var = dVar.c;
        ej60 ej60Var = dVar.e;
        if (continuationImpl instanceof KeepAliveServicePresenter$startForeground$1) {
            keepAliveServicePresenter$startForeground$1 = (KeepAliveServicePresenter$startForeground$1) continuationImpl;
            int i3 = keepAliveServicePresenter$startForeground$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                keepAliveServicePresenter$startForeground$1.label = i3 - Integer.MIN_VALUE;
                Object obj = keepAliveServicePresenter$startForeground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServicePresenter$startForeground$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hst hstVar = jst.e;
                    rgxVar.getServiceName();
                    hstVar.getClass();
                    v180 v180Var = dxq0Var.b;
                    Notification notification = v180Var.b;
                    int i4 = v180Var.a;
                    ej60Var.d(null, i4, notification);
                    int i5 = 0;
                    ?? r4 = (l0b0Var.b() && l0b0Var.i()) ? 1 : 0;
                    boolean k = dVar.k(rgxVar, v180Var, r4);
                    if (k || r4 == 0) {
                        i5 = r4;
                        z = k;
                    } else {
                        z = dVar.k(rgxVar, v180Var, false);
                    }
                    if (!z) {
                        ej60Var.c(i4);
                    }
                    dVar.d.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    dVar.k = uptimeMillis;
                    String str = v180Var.c;
                    DriveState driveState = v180Var.d;
                    long j = uptimeMillis - dxq0Var.a;
                    StringBuilder v = unr0.v(i4, "\n      KeepAliveServicePresenter::startForeground[", "] for order=", str, " \n      at state=");
                    v.append(driveState);
                    v.append(" in ");
                    v.append(j);
                    v.append("ms\n      ");
                    hstVar.o("KeepAliveService", vuu0.c(v.toString()));
                    keepAliveServicePresenter$startForeground$1.L$0 = null;
                    keepAliveServicePresenter$startForeground$1.L$1 = null;
                    keepAliveServicePresenter$startForeground$1.L$2 = null;
                    keepAliveServicePresenter$startForeground$1.L$3 = null;
                    keepAliveServicePresenter$startForeground$1.I$0 = r4;
                    keepAliveServicePresenter$startForeground$1.I$1 = i5;
                    keepAliveServicePresenter$startForeground$1.Z$0 = z;
                    keepAliveServicePresenter$startForeground$1.label = 1;
                    if (dVar.l(v180Var, keepAliveServicePresenter$startForeground$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i5;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = keepAliveServicePresenter$startForeground$1.Z$0;
                    i2 = keepAliveServicePresenter$startForeground$1.I$1;
                    kotlin.b.b(obj);
                }
                dVar.f();
                if (z && i2 == 0 && jx81.g() && dVar.l > 0) {
                    ((Handler) dVar.q.getValue()).postAtTime(dVar.p, dVar.l + 18000000);
                }
                return zy11.a;
            }
        }
        keepAliveServicePresenter$startForeground$1 = new KeepAliveServicePresenter$startForeground$1(dVar, continuationImpl);
        Object obj2 = keepAliveServicePresenter$startForeground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServicePresenter$startForeground$1.label;
        if (i != 0) {
        }
        dVar.f();
        if (z) {
            ((Handler) dVar.q.getValue()).postAtTime(dVar.p, dVar.l + 18000000);
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, rgx rgxVar, ContinuationImpl continuationImpl) {
        KeepAliveServicePresenter$stopService$1 keepAliveServicePresenter$stopService$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof KeepAliveServicePresenter$stopService$1) {
            keepAliveServicePresenter$stopService$1 = (KeepAliveServicePresenter$stopService$1) continuationImpl;
            int i2 = keepAliveServicePresenter$stopService$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServicePresenter$stopService$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServicePresenter$stopService$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServicePresenter$stopService$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    keepAliveServicePresenter$stopService$1.L$0 = rgxVar;
                    keepAliveServicePresenter$stopService$1.label = 1;
                    if (dVar.j(rgxVar, keepAliveServicePresenter$stopService$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rgxVar = (rgx) keepAliveServicePresenter$stopService$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!dVar.i(rgxVar).b()) {
                    jst.e.o("KeepAliveService", "KeepAliveServicePresenter::stopService " + rgxVar.getServiceName());
                    rgxVar.stopService();
                }
                return zy11.a;
            }
        }
        keepAliveServicePresenter$stopService$1 = new KeepAliveServicePresenter$stopService$1(dVar, continuationImpl);
        Object obj3 = keepAliveServicePresenter$stopService$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServicePresenter$stopService$1.label;
        if (i != 0) {
        }
        if (!dVar.i(rgxVar).b()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0084, B:13:0x0088, B:15:0x008d, B:16:0x009b, B:18:0x009f, B:19:0x00ab, B:20:0x00b0), top: B:10:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, gxq0 gxq0Var, Continuation continuation) {
        KeepAliveServicePresenter$updateState$1 keepAliveServicePresenter$updateState$1;
        int i;
        rgx rgxVar;
        r8h r8hVar = dVar.d;
        hbp0 hbp0Var = dVar.i;
        try {
            if (continuation instanceof KeepAliveServicePresenter$updateState$1) {
                keepAliveServicePresenter$updateState$1 = (KeepAliveServicePresenter$updateState$1) continuation;
                int i2 = keepAliveServicePresenter$updateState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    keepAliveServicePresenter$updateState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = keepAliveServicePresenter$updateState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = keepAliveServicePresenter$updateState$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        hst hstVar = jst.e;
                        Objects.toString(gxq0Var);
                        hstVar.getClass();
                        rgxVar = dVar.j;
                        if (rgxVar == null) {
                            g8e.B(hstVar, "KEEP_ALIVE_SERVICE:NOT_ATTACHED_SERVICE", null, g8e.o("service is not attached, experimentTag=", dVar.s), 2);
                            return zy11Var;
                        }
                        r8hVar.getClass();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        pzt0 pzt0Var = dVar.r;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                            dVar.r = null;
                        }
                        e i3 = dVar.i(rgxVar);
                        KeepAliveServicePresenter$updateState$2 keepAliveServicePresenter$updateState$2 = new KeepAliveServicePresenter$updateState$2(dVar, rgxVar, null);
                        keepAliveServicePresenter$updateState$1.L$0 = gxq0Var;
                        keepAliveServicePresenter$updateState$1.L$1 = rgxVar;
                        keepAliveServicePresenter$updateState$1.J$0 = uptimeMillis;
                        keepAliveServicePresenter$updateState$1.label = 1;
                        if (i3.d(keepAliveServicePresenter$updateState$2, keepAliveServicePresenter$updateState$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rgx rgxVar2 = (rgx) keepAliveServicePresenter$updateState$1.L$1;
                        gxq0 gxq0Var2 = (gxq0) keepAliveServicePresenter$updateState$1.L$0;
                        kotlin.b.b(obj);
                        rgxVar = rgxVar2;
                        gxq0Var = gxq0Var2;
                    }
                    if (!(gxq0Var instanceof dxq0)) {
                        if (gxq0Var instanceof exq0) {
                            dVar.r = hbp0.e(hbp0Var, null, null, new KeepAliveServicePresenter$updateState$3(dVar, rgxVar, null), 3);
                        } else {
                            if (!(gxq0Var instanceof fxq0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar.r = hbp0.e(hbp0Var, null, null, new KeepAliveServicePresenter$updateState$4(dVar, rgxVar, null), 3);
                        }
                    }
                    dVar.i(rgxVar).e();
                    hst hstVar2 = jst.e;
                    gxq0Var.getClass();
                    r8hVar.getClass();
                    SystemClock.uptimeMillis();
                    hstVar2.getClass();
                    return zy11Var;
                }
            }
            if (!(gxq0Var instanceof dxq0)) {
            }
            dVar.i(rgxVar).e();
            hst hstVar22 = jst.e;
            gxq0Var.getClass();
            r8hVar.getClass();
            SystemClock.uptimeMillis();
            hstVar22.getClass();
            return zy11Var;
        } catch (Throwable th) {
            dVar.i(rgxVar).e();
            hst hstVar3 = jst.e;
            gxq0Var.getClass();
            r8hVar.getClass();
            SystemClock.uptimeMillis();
            hstVar3.getClass();
            throw th;
        }
        keepAliveServicePresenter$updateState$1 = new KeepAliveServicePresenter$updateState$1(dVar, continuation);
        Object obj2 = keepAliveServicePresenter$updateState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServicePresenter$updateState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    public final void d(AbstractKeepAliveService abstractKeepAliveService) {
        this.j = abstractKeepAliveService;
        this.d.getClass();
        this.l = SystemClock.uptimeMillis();
        hbp0 hbp0Var = this.i;
        hbp0Var.a();
        jst.e.o("KeepAliveService", "KeepAliveServicePresenter::subscribeForCommands " + abstractKeepAliveService.getServiceName());
        tje.N(hbp0Var.c(), null, null, new KeepAliveServicePresenter$attachView$$inlined$safeCollectIn$1(i(abstractKeepAliveService).e, null, this), 3);
        com.yandex.go.coroutines.b.g(hbp0Var.c(), null, null, new KeepAliveServicePresenter$attachView$2(this, abstractKeepAliveService, null), 3);
    }

    public final void e(v180 v180Var) {
        hst hstVar = jst.e;
        int i = v180Var.a;
        String str = v180Var.c;
        DriveState driveState = v180Var.d;
        this.d.getClass();
        long uptimeMillis = SystemClock.uptimeMillis() - this.k;
        StringBuilder v = unr0.v(i, "\n      KeepAliveServicePresenter::cancelNotification[", "] for order=", str, " \n      at state=");
        v.append(driveState);
        v.append(" after ");
        v.append(uptimeMillis);
        v.append("ms\n      ");
        hstVar.o("KeepAliveService", vuu0.c(v.toString()));
        this.e.a(v180Var.a, null);
    }

    public final void f() {
        CopyOnWriteArraySet<v180> copyOnWriteArraySet = this.n;
        for (v180 v180Var : copyOnWriteArraySet) {
            e(v180Var);
            copyOnWriteArraySet.remove(v180Var);
        }
    }

    public final void g() {
        ((Handler) this.q.getValue()).removeCallbacks(this.p);
        this.i.b();
        f();
        v180 v180Var = this.m;
        if (v180Var != null) {
            e(v180Var);
        }
        AbstractKeepAliveService abstractKeepAliveService = this.j;
        if (abstractKeepAliveService != null) {
            hst hstVar = jst.e;
            hstVar.o("KeepAliveService", "KeepAliveServicePresenter::release " + abstractKeepAliveService.getServiceName());
            long j = 0;
            if (this.l != 0) {
                this.d.getClass();
                j = SystemClock.uptimeMillis() - this.l;
            }
            c cVar = this.a;
            Class<?> cls = abstractKeepAliveService.getClass();
            String str = this.s;
            synchronized (cVar) {
                try {
                    chx b = cVar.b(cls);
                    if (b.b.b()) {
                        xby.l(hstVar, "KEEP_ALIVE_SERVICE:DETACH_ACTIVE_SERVICE", null, new IllegalStateException(), "Service " + cls.getSimpleName() + " created " + j + " ms ago detached in " + b.b.e.a.getValue() + " state, experimentTag=" + str, 2);
                        b.a.getClass();
                        hstVar.getClass();
                        b.b.f();
                    }
                    cVar.c.add(b);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j = null;
        }
    }

    public final boolean h(Intent intent) {
        AbstractKeepAliveService abstractKeepAliveService;
        Object obj;
        dxq0 dxq0Var;
        Object obj2;
        Object obj3;
        Bundle extras = intent != null ? intent.getExtras() : null;
        w180 w180Var = u180.b;
        if (extras != null) {
            int i = extras.getInt(CancelNotificationBroadcastReceiver.NOTIFICATION_ID);
            Notification notification = (Notification) vng.u(extras, Notification.class, "notification");
            Iterator<E> it = OrderNotification$OrderNotificationType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((OrderNotification$OrderNotificationType) obj2).toString().equals(extras.getString("notification_type"))) {
                    break;
                }
            }
            OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = (OrderNotification$OrderNotificationType) obj2;
            if (orderNotification$OrderNotificationType == null) {
                orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.ORDER;
            }
            OrderNotification$OrderNotificationType orderNotification$OrderNotificationType2 = orderNotification$OrderNotificationType;
            String string = extras.getString("order_id");
            Iterator<E> it2 = DriveState.c().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (jl40.l(((DriveState) obj3).toString(), extras.getString("order_state"))) {
                    break;
                }
            }
            DriveState driveState = (DriveState) obj3;
            if (driveState == null) {
                driveState = DriveState.SEARCH;
            }
            DriveState driveState2 = driveState;
            if (i != 0 && notification != null && string != null) {
                w180Var = new v180(i, notification, string, driveState2, orderNotification$OrderNotificationType2);
            }
        }
        if (!(w180Var instanceof v180) || (abstractKeepAliveService = this.j) == null) {
            return false;
        }
        c cVar = this.a;
        Class<?> cls = abstractKeepAliveService.getClass();
        synchronized (cVar) {
            cVar.c.remove(cVar.b(cls));
        }
        e i2 = i(abstractKeepAliveService);
        v180 v180Var = (v180) w180Var;
        synchronized (i2) {
            try {
                Iterator it3 = i2.c.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((dxq0) obj).b.equals(v180Var)) {
                        break;
                    }
                }
                dxq0Var = (dxq0) obj;
                if (dxq0Var != null) {
                    jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::ensureForeground found notification=" + v180Var);
                } else {
                    jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::ensureForeground create new state for notification=" + v180Var);
                    dxq0Var = new dxq0(SystemClock.uptimeMillis(), v180Var);
                    r0 r0Var = i2.d;
                    r0Var.getClass();
                    r0Var.m(null, dxq0Var);
                    i2.c.offer(dxq0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.yandex.go.coroutines.b.g(this.i, null, null, new KeepAliveServicePresenter$handleCommand$1(this, dxq0Var, w180Var, null), 3);
        return true;
    }

    public final e i(rgx rgxVar) {
        return this.a.b(rgxVar.getClass()).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (l(null, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(rgx rgxVar, ContinuationImpl continuationImpl) {
        KeepAliveServicePresenter$stopForeground$1 keepAliveServicePresenter$stopForeground$1;
        int i;
        if (continuationImpl instanceof KeepAliveServicePresenter$stopForeground$1) {
            keepAliveServicePresenter$stopForeground$1 = (KeepAliveServicePresenter$stopForeground$1) continuationImpl;
            int i2 = keepAliveServicePresenter$stopForeground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keepAliveServicePresenter$stopForeground$1.label = i2 - Integer.MIN_VALUE;
                Object obj = keepAliveServicePresenter$stopForeground$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = keepAliveServicePresenter$stopForeground$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v180 v180Var = this.m;
                    if (v180Var != null) {
                        jst.e.o("KeepAliveService", "KeepAliveServicePresenter::stopForeground[" + v180Var.a + "]");
                        this.b.m(rgxVar.getClass());
                        rgxVar.stopForeground();
                        keepAliveServicePresenter$stopForeground$1.L$0 = null;
                        keepAliveServicePresenter$stopForeground$1.L$1 = null;
                        keepAliveServicePresenter$stopForeground$1.label = 1;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    f();
                    return zy11.a;
                }
                kotlin.b.b(obj);
                keepAliveServicePresenter$stopForeground$1.L$0 = null;
                keepAliveServicePresenter$stopForeground$1.L$1 = null;
                keepAliveServicePresenter$stopForeground$1.label = 2;
            }
        }
        keepAliveServicePresenter$stopForeground$1 = new KeepAliveServicePresenter$stopForeground$1(this, continuationImpl);
        Object obj3 = keepAliveServicePresenter$stopForeground$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServicePresenter$stopForeground$1.label;
        if (i != 0) {
        }
        keepAliveServicePresenter$stopForeground$1.L$0 = null;
        keepAliveServicePresenter$stopForeground$1.L$1 = null;
        keepAliveServicePresenter$stopForeground$1.label = 2;
    }

    public final boolean k(rgx rgxVar, v180 v180Var, boolean z) {
        try {
            rgxVar.startForeground(v180Var, z);
            this.b.k(rgxVar.getClass());
            return true;
        } catch (Exception e) {
            xby.l(jst.e, "KEEP_ALIVE_SERVICE:START_FOREGROUND", null, e, "Failed to start foreground on service, withLocation=" + z + ", experimentTag=" + this.s, 2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x004a, B:14:0x0050, B:16:0x0056, B:18:0x005e, B:19:0x0061), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(v180 v180Var, ContinuationImpl continuationImpl) {
        KeepAliveServicePresenter$updateNotification$1 keepAliveServicePresenter$updateNotification$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        v180 v180Var2;
        CopyOnWriteArraySet copyOnWriteArraySet;
        try {
            if (continuationImpl instanceof KeepAliveServicePresenter$updateNotification$1) {
                keepAliveServicePresenter$updateNotification$1 = (KeepAliveServicePresenter$updateNotification$1) continuationImpl;
                int i2 = keepAliveServicePresenter$updateNotification$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    keepAliveServicePresenter$updateNotification$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = keepAliveServicePresenter$updateNotification$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = keepAliveServicePresenter$updateNotification$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        keepAliveServicePresenter$updateNotification$1.L$0 = v180Var;
                        aVar = this.o;
                        keepAliveServicePresenter$updateNotification$1.L$1 = aVar;
                        keepAliveServicePresenter$updateNotification$1.label = 1;
                        if (aVar.a(keepAliveServicePresenter$updateNotification$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) keepAliveServicePresenter$updateNotification$1.L$1;
                        v180 v180Var3 = (v180) keepAliveServicePresenter$updateNotification$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        v180Var = v180Var3;
                    }
                    v180Var2 = this.m;
                    copyOnWriteArraySet = this.n;
                    if (v180Var2 != null && !v180Var2.equals(v180Var)) {
                        copyOnWriteArraySet.add(v180Var2);
                    }
                    if (v180Var != null) {
                        copyOnWriteArraySet.remove(v180Var);
                    }
                    this.m = v180Var;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            v180Var2 = this.m;
            copyOnWriteArraySet = this.n;
            if (v180Var2 != null) {
                copyOnWriteArraySet.add(v180Var2);
            }
            if (v180Var != null) {
            }
            this.m = v180Var;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        keepAliveServicePresenter$updateNotification$1 = new KeepAliveServicePresenter$updateNotification$1(this, continuationImpl);
        Object obj2 = keepAliveServicePresenter$updateNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = keepAliveServicePresenter$updateNotification$1.label;
        if (i != 0) {
        }
    }
}
