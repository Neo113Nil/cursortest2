package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class q2 {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) q2.class);
    public static final long o = 10000;
    public static final long p = 10000;
    public final Context a;
    public final f7 b;
    public final r7 c;
    public final m9 d;
    public final AlarmManager e;
    public final int f;
    public final boolean g;
    public final ReentrantLock h;
    public final String i;
    public final o2 j;
    public Job k;
    public za l;
    public final LinkedHashMap m;

    public q2(Context context, f7 f7Var, r7 r7Var, m9 m9Var, AlarmManager alarmManager, int i, boolean z) {
        context.getClass();
        f7Var.getClass();
        r7Var.getClass();
        m9Var.getClass();
        alarmManager.getClass();
        this.a = context;
        this.b = f7Var;
        this.c = r7Var;
        this.d = m9Var;
        this.e = alarmManager;
        this.f = i;
        this.g = z;
        this.h = new ReentrantLock();
        this.k = JobKt.Job$default();
        this.m = new LinkedHashMap();
        o2 o2Var = new o2(this);
        this.j = o2Var;
        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(context.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.i = m$1;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(o2Var, new IntentFilter(m$1), 2);
            } else {
                context.registerReceiver(o2Var, new IntentFilter(m$1));
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new q2$$ExternalSyntheticLambda0(0, this), 4, (Object) null);
            this.j = null;
        }
    }

    public static final String d(za zaVar) {
        return "Session [" + zaVar.a + "] being sealed because its end time is over the grace period. Session: " + zaVar;
    }

    public static final String f(za zaVar) {
        return "Closed session with id " + zaVar.a;
    }

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final void a(String str, boolean z) {
        str.getClass();
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        int i = z ? 1 : -1;
        try {
            Object obj = this.m.get(str);
            if (obj == null) {
                obj = 0;
            }
            this.m.put(str, Integer.valueOf(((Number) obj).intValue() + i));
            int sumOfInt = CollectionsKt.sumOfInt(this.m.values());
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda8(sumOfInt, this, 0), 6, (Object) null);
            if (sumOfInt > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(8), 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(1), 6, (Object) null);
                p();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(4), 7, (Object) null);
        try {
            Intent intent = new Intent(this.i);
            intent.putExtra("session_id", String.valueOf(this.l));
            this.e.cancel(PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(5), 4, (Object) null);
        }
    }

    public final void c(String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 12), 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(6), 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda0(3, this), 6, (Object) null);
    }

    public final void e() {
        za zaVar = this.l;
        if (zaVar != null) {
            int i = this.f;
            boolean z = this.g;
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(j);
            if (z) {
                millis = Math.max(p, (timeUnit.toMillis((long) zaVar.b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            long j2 = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j2, 11), 7, (Object) null);
            try {
                Intent intent = new Intent(this.i);
                intent.putExtra("session_id", zaVar.toString());
                this.e.set(1, DateTimeUtils.nowInMilliseconds() + j2, PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(3), 4, (Object) null);
            }
        }
    }

    public final boolean g() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            za zaVar = this.l;
            boolean z = true;
            if (zaVar != null && !zaVar.d) {
                if (zaVar.c != null) {
                    zaVar.c = null;
                } else {
                    z = false;
                }
                return z;
            }
            i();
            if (zaVar != null && zaVar.d) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 4), 7, (Object) null);
                this.b.a(zaVar.a.b);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ye h() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            za zaVar = this.l;
            return zaVar != null ? zaVar.a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        za zaVar = new za();
        this.l = zaVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 5), 6, (Object) null);
        this.c.b(new xe(zaVar), xe.class);
        ((r7) this.d).b(new SessionStateChangedEvent(zaVar.a.b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if ((r14.toMillis((long) r5) + r9) <= r12) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        za zaVar;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.l == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(2), 7, (Object) null);
                we c = this.b.c();
                this.l = c != null ? new za(c.a, c.b, c.c, c.d) : null;
            }
            zaVar = this.l;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        if (zaVar != null) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 1), 7, (Object) null);
            Double d = zaVar.c;
            if (d != null && !zaVar.d) {
                double d2 = zaVar.b;
                double doubleValue = d.doubleValue();
                int i = this.f;
                boolean z = this.g;
                long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long millis = timeUnit.toMillis(i);
                if (z) {
                    if (timeUnit.toMillis((long) d2) + millis + p <= nowInMilliseconds) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 2), 6, (Object) null);
                        l();
                        f7 f7Var = this.b;
                        za zaVar2 = this.l;
                        f7Var.a(String.valueOf(zaVar2 != null ? zaVar2.a : null));
                        this.l = null;
                    }
                }
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public final void l() {
        za zaVar = this.l;
        if (zaVar != null) {
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                zaVar.d = true;
                zaVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(zaVar);
                this.c.b(new ze(zaVar), ze.class);
                ((r7) this.d).b(new SessionStateChangedEvent(zaVar.a.b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 0), 6, (Object) null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            o2 o2Var = this.j;
            if (o2Var != null) {
                this.a.unregisterReceiver(o2Var);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(7), 4, (Object) null);
        }
    }

    public final void o() {
        za zaVar;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (g() && (zaVar = this.l) != null) {
                this.b.a(zaVar);
            }
            this.k.cancel(null);
            b();
            this.c.b(af.a, af.class);
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda0(2, this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void p() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            g();
            za zaVar = this.l;
            if (zaVar != null) {
                zaVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(zaVar);
                this.k.cancel(null);
                this.k = JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new p2(this, null), 3);
                e();
                this.c.b(cf.a, cf.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda7(zaVar, 3), 7, (Object) null);
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda0(1, this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Attempting to open session with context: ", str);
    }

    public static final String d(q2 q2Var) {
        return "Completed the startSession call. Current session: " + q2Var.h();
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(za zaVar) {
        return "Checking if this session needs to be sealed: " + zaVar.a;
    }

    public static final String c(q2 q2Var) {
        return "Completed the attemptToOpenSession call. Current session: " + q2Var.h();
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Attempting to close session with context: ", str);
    }

    public static final String b(q2 q2Var) {
        return "Completed the attemptToCloseSession call. Current session: " + q2Var.h();
    }

    public static final String b(za zaVar) {
        return "New session created with ID: " + zaVar.a;
    }

    public static final String a(q2 q2Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to register dynamic receiver for ", q2Var.i);
    }

    public static final String e(q2 q2Var) {
        return "Completed the stopSession call. Current session: " + q2Var.h();
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public static final String e(za zaVar) {
        return "Sealed session with id " + zaVar.a;
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 13), 6, (Object) null);
        a(str, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda0(4, this), 6, (Object) null);
    }

    public static final String a(za zaVar) {
        return "Clearing completely dispatched sealed session " + zaVar.a;
    }

    public static final String a(int i, q2 q2Var) {
        return "Session context identifier map updated. sum: " + i + " map: " + q2Var.m;
    }

    public static final String a(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Creating a session seal alarm with a delay of ", " ms");
    }
}
