package b4;

import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import bc.x;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import dd.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.e0;
import o6.b0;
import o6.l0;
import o6.p0;
import o6.s;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f964g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f965h;

    public /* synthetic */ g(int i10, Object obj) {
        this.f964g = i10;
        this.f965h = obj;
    }

    public cc.j a() {
        h hVar = (h) this.f965h;
        cc.j jVar = new cc.j();
        Cursor m10 = hVar.f967a.m(new w("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (m10.moveToNext()) {
            try {
                jVar.add(Integer.valueOf(m10.getInt(0)));
            } finally {
            }
        }
        m10.close();
        cc.j n7 = v6.a.n(jVar);
        if (n7.f1333g.isEmpty()) {
            return n7;
        }
        if (((h) this.f965h).f973g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        i4.i iVar = ((h) this.f965h).f973g;
        if (iVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        iVar.a();
        return n7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        m.i iVar;
        switch (this.f964g) {
            case 0:
                ReentrantReadWriteLock.ReadLock readLock = ((h) this.f965h).f967a.f761h.readLock();
                pc.j.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } finally {
                            readLock.unlock();
                        }
                    } catch (SQLiteException e10) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                        set = x.f1069g;
                    }
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    set = x.f1069g;
                }
                if (((h) this.f965h).a() && ((h) this.f965h).f971e.compareAndSet(true, false) && !((h) this.f965h).f967a.h().t().j()) {
                    i4.c t3 = ((h) this.f965h).f967a.h().t();
                    t3.b();
                    try {
                        set = a();
                        t3.o();
                        if (set.isEmpty()) {
                            return;
                        }
                        h hVar = (h) this.f965h;
                        synchronized (hVar.f975i) {
                            Iterator it = hVar.f975i.iterator();
                            while (true) {
                                o.b bVar = (o.b) it;
                                if (bVar.hasNext()) {
                                    ((f) ((Map.Entry) bVar.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        t3.f();
                    }
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                f7.a aVar = (f7.a) this.f965h;
                synchronized (aVar.f2320a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f2329j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f2322c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                synchronized (((g7.k) this.f965h).f2546i) {
                    ((g7.b) ((g7.k) this.f965h).f2547j).b();
                }
                return;
            case 3:
                l3.e eVar = (l3.e) this.f965h;
                e0 e0Var = eVar.f4135i;
                l3.a aVar2 = eVar.f4133g;
                if (eVar.f4147u) {
                    if (eVar.f4145s) {
                        eVar.f4145s = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f4126e = currentAnimationTimeMillis;
                        aVar2.f4128g = -1L;
                        aVar2.f4127f = currentAnimationTimeMillis;
                        aVar2.f4129h = 0.5f;
                    }
                    if ((aVar2.f4128g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f4128g + aVar2.f4130i) || !eVar.e()) {
                        eVar.f4147u = false;
                        return;
                    }
                    if (eVar.f4146t) {
                        eVar.f4146t = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        e0Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f4127f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a6 = aVar2.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar2.f4127f;
                    aVar2.f4127f = currentAnimationTimeMillis2;
                    eVar.f4149w.scrollListBy((int) (j3 * ((a6 * 4.0f) + ((-4.0f) * a6 * a6)) * aVar2.f4125d));
                    Field field = h3.w.f2829a;
                    e0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                if (((g7.h) this.f965h).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 5:
                e0 e0Var2 = (e0) this.f965h;
                e0Var2.f4293s = null;
                e0Var2.drawableStateChanged();
                return;
            case 6:
                ActionMenuView actionMenuView = ((Toolbar) this.f965h).f458g;
                if (actionMenuView == null || (iVar = actionMenuView.f425y) == null) {
                    return;
                }
                iVar.j();
                return;
            case 7:
                Worker worker = (Worker) this.f965h;
                try {
                    worker.f743g.i(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.f743g.j(th);
                    return;
                }
            case 8:
                s sVar = (s) this.f965h;
                m6.f fVar = sVar.f5329j;
                Context context = sVar.f5328i;
                fVar.getClass();
                if (m6.h.f4916a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e12) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e12);
                    return;
                }
            case 9:
                ((b0) this.f965h).e();
                return;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                n6.a aVar3 = ((b0) ((m7.g) this.f965h).f4957h).f5233e;
                aVar3.c(aVar3.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((l0) this.f965h).f5303j.b(new m6.b(4));
                return;
            case 12:
                return;
            case 13:
                ((p3.c) this.f965h).i(0);
                return;
            case 14:
                ((s3.e) this.f965h).f6422p.onDismiss(null);
                return;
            case 15:
                ((s3.j) this.f965h).i();
                throw null;
            default:
                r rVar = (r) this.f965h;
                rVar.removeCallbacks(this);
                MotionEvent motionEvent = rVar.f8639w0;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    r rVar2 = (r) this.f965h;
                    rVar2.H(motionEvent, i10, rVar2.f8641x0, false);
                    return;
                }
                return;
        }
    }

    public g(p0 p0Var, e3.j jVar) {
        this.f964g = 12;
        this.f965h = jVar;
    }
}
