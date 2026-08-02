package bo.app;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class hd {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) hd.class);
    public static final long o = 3600000;
    public static final long p = 60000;
    public final q5 a;
    public final cd b;
    public final boolean c;
    public final boolean d;
    public final LinkedHashMap e;
    public Deferred f;
    public final ReentrantLock g;
    public String h;
    public long i;
    public long j;
    public final AtomicInteger k;
    public final xf l;
    public cb m;

    public hd(q5 q5Var, cd cdVar, boolean z, boolean z2) {
        q5Var.getClass();
        cdVar.getClass();
        this.a = q5Var;
        this.b = cdVar;
        this.c = z;
        this.d = z2;
        this.e = new LinkedHashMap();
        this.g = new ReentrantLock();
        this.i = -1L;
        this.j = -1L;
        final int i = 0;
        this.k = new AtomicInteger(0);
        this.l = new xf(q5Var.a.j.o(), q5Var.a.j.p(), wf.a(q5Var, "com.braze.requestframework.tokenbucket", ""));
        this.m = cb.GOOD;
        q5Var.a.i.c(o5.class, new IEventSubscriber(this) { // from class: bo.app.hd$$ExternalSyntheticLambda1
            public final /* synthetic */ hd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                hd hdVar = this.f$0;
                switch (i2) {
                    case 0:
                        hd.a(hdVar, (o5) obj);
                        break;
                    default:
                        hd.a(hdVar, (db) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        q5Var.a.i.c(db.class, new IEventSubscriber(this) { // from class: bo.app.hd$$ExternalSyntheticLambda1
            public final /* synthetic */ hd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                hd hdVar = this.f$0;
                switch (i22) {
                    case 0:
                        hd.a(hdVar, (o5) obj);
                        break;
                    default:
                        hd.a(hdVar, (db) obj);
                        break;
                }
            }
        });
    }

    public static final String c() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String d() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String f() {
        return "Got call to shutdown request framework";
    }

    public static final String h() {
        return "Kicking off request framework.";
    }

    public final void a(long j, c7 c7Var, id idVar) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, c7Var.c(), new c7$$ExternalSyntheticLambda5(j, idVar), 3, (Object) null);
        if (!a(j)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(26), 7, (Object) null);
            return;
        }
        xf b = c7Var.b();
        if (b != null && b.a(j) < 1.0d) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(27), 7, (Object) null);
            xf b2 = c7Var.b();
            idVar.b = (b2 != null ? b2.a() : 0L) + j;
            return;
        }
        d9 a = this.a.a(idVar.a);
        fd fdVar = new fd(this, idVar, c7Var);
        idVar.a(j, jd.IN_FLIGHT);
        xf b3 = c7Var.b();
        Integer num = null;
        Integer valueOf = b3 == null ? null : Integer.valueOf((int) b3.a(j));
        if (valueOf != null) {
            int intValue = valueOf.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
            num = Integer.valueOf(intValue);
        }
        idVar.f = num;
        int a2 = ((int) this.l.a(j)) - 1;
        idVar.e = a2 >= 0 ? a2 : 0;
        if (a(j, a, idVar, fdVar)) {
            return;
        }
        a(j, idVar);
        c7Var.a(j, idVar);
    }

    public final String b(long j) {
        LinkedHashMap linkedHashMap = this.e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((c7) ((Map.Entry) it.next()).getValue());
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new c7$$ExternalSyntheticLambda6(j, 8), 30);
        boolean z = this.c;
        String str = this.h;
        long j2 = this.i - j;
        long j3 = this.j - j;
        int i = this.k.get();
        xf xfVar = this.l;
        cb cbVar = this.m;
        String valueOf = String.valueOf(this.a.a.q.d.readData(DataStoreKey.SDK_AUTH, ""));
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("RequestFramework->\n            |mockAllNetworkRequests=", "\n            |lastSdkAuthFailedToken=", str, "\n            |lastSdkAuthFailureAt=", z);
        m.append(j2);
        Boxes$$ExternalSyntheticOutline1.m1151m(j3, "\n            |sdkAuthFailureBackoffUntil=", "\n            |invalidApiKeyErrorCounter=", m);
        m.append(i);
        m.append("\n            |globalRequestRateLimiter=");
        m.append(xfVar);
        m.append("\n            |lastNetworkLevel=");
        m.append(cbVar);
        m.append("\n            |currentSdkAuthToken=");
        m.append(valueOf);
        m.append("\n            |endpointQueues=\n            | \n            |");
        m.append(joinToString$default);
        m.append("\n            |  \n            |\n        ");
        return StringsKt__IndentKt.trimMargin$default(m.toString());
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(29), 14, (Object) null);
        Deferred deferred = this.f;
        if (deferred != null) {
            deferred.cancel(null);
        }
        ah ahVar = this.a.a;
        l4 l4Var = new l4(ahVar.j, ahVar.b.getBaseUrlForRequests(), new lb(null, null, null));
        this.a.a((d9) l4Var);
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(nowInMillisecondsSystemClock, l4Var, new id(l4Var, nowInMillisecondsSystemClock, nowInMillisecondsSystemClock), new gd());
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(25), 7, (Object) null);
        a();
    }

    public static final String b(long j, id idVar) {
        return "Running at " + j + " for request " + idVar.a(j);
    }

    public static final String b(hd hdVar, long j) {
        return hdVar.b(j);
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final CharSequence b(long j, c7 c7Var) {
        c7Var.getClass();
        return c7Var.d(j);
    }

    public final void a(long j, c7 c7Var) {
        c7Var.getClass();
        if (j <= c7Var.f) {
            return;
        }
        c7Var.b(j);
        ArrayList arrayList = c7Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            id idVar = (id) obj;
            jd jdVar = idVar.d;
            jdVar.getClass();
            if (jdVar == jd.PENDING_START || jdVar == jd.PENDING_RETRY) {
                if (j >= idVar.b) {
                    arrayList2.add(obj);
                }
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            a(j, c7Var, (id) obj2);
        }
    }

    public static final void a(hd hdVar, db dbVar) {
        dbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda9(dbVar, 1), 14, (Object) null);
        hdVar.m = dbVar.b;
    }

    public static final String a(db dbVar) {
        return "Got network change event: " + dbVar;
    }

    public static void a(hd hdVar) {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = hdVar.g;
        reentrantLock.lock();
        try {
            if ((!hdVar.d || hdVar.m != cb.NONE) && ((hdVar.h == null || nowInMillisecondsSystemClock >= hdVar.j || !String.valueOf(hdVar.a.a.q.d.readData(DataStoreKey.SDK_AUTH, "")).equals(hdVar.h)) && hdVar.a(nowInMillisecondsSystemClock))) {
                Iterator it = hdVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    hdVar.a(nowInMillisecondsSystemClock, (c7) ((Map.Entry) it.next()).getValue());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        Deferred deferred = this.f;
        if (deferred == null || !deferred.isActive()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(28), 6, (Object) null);
            DeferredCoroutine async$default = JobKt.async$default(BrazeCoroutineScope.INSTANCE, null, CoroutineStart.LAZY, new ed(this, null), 1);
            this.f = async$default;
            async$default.start();
        }
    }

    public static final void a(hd hdVar, o5 o5Var) {
        o5Var.getClass();
        n5 n5Var = o5Var.a;
        d9 d9Var = o5Var.d;
        ReentrantLock reentrantLock = hdVar.g;
        reentrantLock.lock();
        try {
            if (n5Var == n5.ADD_REQUEST && d9Var != null) {
                hdVar.a(d9Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(final long j, d9 d9Var, final id idVar, dd ddVar) {
        s9 s9Var;
        final boolean z = d9Var.c() || this.c;
        if (z) {
            s9Var = this.a.a.z;
        } else {
            s9Var = this.b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: bo.app.hd$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hd.a(z, idVar, j);
            }
        }, 3, (Object) null);
        s9Var.a(idVar, ddVar);
        return z;
    }

    public static final String a(boolean z, id idVar, long j) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Running on ", z ? "no-op" : "network", " executor for ", idVar.a(j));
    }

    public final void a(d9 d9Var) {
        d9Var.getClass();
        c9 b = d9Var.b();
        c7 c7Var = (c7) this.e.get(b);
        if (c7Var == null) {
            int ordinal = b.ordinal();
            if (ordinal == 0) {
                c7Var = new q3(this.a);
            } else if (ordinal == 1) {
                c7Var = new b8(this.a);
            } else if (ordinal == 2) {
                c7Var = new f4(this.a);
            } else if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        c7Var = new zd(this.a);
                        break;
                    case 10:
                        c7Var = new ce(this.a);
                        break;
                    case 11:
                        c7Var = new t5(this.a);
                        break;
                    default:
                        c7Var = new s4(b, this.a);
                        break;
                }
            } else {
                c7Var = new of(this.a);
            }
            this.e.put(b, c7Var);
        }
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        c7Var.a(nowInMillisecondsSystemClock, d9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new hd$$ExternalSyntheticLambda5(this, nowInMillisecondsSystemClock, 0), 3, (Object) null);
        a();
    }

    public static final String a(hd hdVar, long j) {
        return hdVar.b(j);
    }

    public final void a(long j, id idVar) {
        idVar.getClass();
        xf xfVar = this.l;
        xfVar.getClass();
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double a = xfVar.a(nowInMillisecondsSystemClock);
        xfVar.e = a;
        vf vfVar = xfVar.c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        vfVar.writeData(dataStoreKey, Float.valueOf((float) a));
        xfVar.d = nowInMillisecondsSystemClock;
        xfVar.c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(nowInMillisecondsSystemClock));
        double d = xfVar.e;
        if (d >= 1.0d) {
            double d2 = d - 1.0d;
            xfVar.e = d2;
            xfVar.c.writeData(dataStoreKey, Float.valueOf((float) d2));
        }
        if (!a(j)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c7$$ExternalSyntheticLambda8(idVar, j, this.l.a(), this, 1), 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new hd$$ExternalSyntheticLambda5(this, j, 1), 3, (Object) null);
    }

    public static final String a(id idVar, long j, long j2, hd hdVar) {
        String a = idVar.a(j);
        String formatDateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j + j2, null, null, 3, null);
        xf xfVar = hdVar.l;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Delaying next request after ", a, " until next token is available in ", j2);
        m.append("ms - '");
        m.append(formatDateFromMillis$default);
        m.append("'\n");
        m.append(xfVar);
        return m.toString();
    }

    public final boolean a(long j) {
        return !this.a.a.j.L() || this.l.a(j) >= 1.0d;
    }
}
