package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public abstract class c7 {
    public static final String j = BrazeLogger.getBrazeLogTag((Class<?>) c7.class);
    public final c9 a;
    public final q5 b;
    public long c;
    public long d;
    public final ArrayList e;
    public long f;
    public final long g;
    public final x7 h;
    public xf i;

    public c7(c9 c9Var, q5 q5Var) {
        c9Var.getClass();
        q5Var.getClass();
        this.a = c9Var;
        this.b = q5Var;
        this.e = new ArrayList();
        int ordinal = c9Var.ordinal();
        this.g = ordinal != 0 ? ordinal != 2 ? 0L : 75L : 25L;
        this.h = new x7(q5Var.a.j.j(), x7.g, q5Var.a.j.k(), q5Var.a.j.l());
    }

    public abstract void a(long j2);

    public final void a(long j2, id idVar) {
        idVar.getClass();
        xf b = b();
        if (b == null) {
            return;
        }
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double a = b.a(nowInMillisecondsSystemClock);
        b.e = a;
        vf vfVar = b.c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        vfVar.writeData(dataStoreKey, Float.valueOf((float) a));
        b.d = nowInMillisecondsSystemClock;
        b.c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(nowInMillisecondsSystemClock));
        double d = b.e;
        if (d >= 1.0d) {
            double d2 = d - 1.0d;
            b.e = d2;
            b.c.writeData(dataStoreKey, Float.valueOf((float) d2));
        }
        xf b2 = b();
        if (b2 != null && b2.a(j2) < 1.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new c7$$ExternalSyntheticLambda8(idVar, j2, b.a(), b, 0), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c7$$ExternalSyntheticLambda1(this, j2, 3), 7, (Object) null);
    }

    public final void b(long j2) {
        int i;
        a(j2);
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((id) obj).d == jd.BATCHED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            int i3 = ((id) it.next()).h;
            loop1: while (true) {
                i = i3;
                while (it.hasNext()) {
                    i3 = ((id) it.next()).h;
                    if (i < i3) {
                        break;
                    }
                }
            }
            ArrayList arrayList3 = this.e;
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                jd jdVar = ((id) obj2).d;
                jdVar.getClass();
                if (jdVar == jd.PENDING_START || jdVar == jd.PENDING_RETRY) {
                    arrayList4.add(obj2);
                }
            }
            int size3 = arrayList4.size();
            for (int i5 = 0; i5 < size3; i5++) {
                id idVar = (id) arrayList4.get(i5);
                idVar.h = i;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new c7$$ExternalSyntheticLambda4(idVar, j2, i, 0), 3, (Object) null);
                size3 = size3;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.e;
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList6.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj3 = arrayList6.get(i6);
            i6++;
            jd jdVar2 = ((id) obj3).d;
            if (jdVar2 == jd.BATCHED || jdVar2 == jd.COMPLETE) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.e;
        ArrayList arrayList9 = new ArrayList();
        int size5 = arrayList8.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj4 = arrayList8.get(i7);
            i7++;
            id idVar2 = (id) obj4;
            if (idVar2.h >= 15) {
                jd jdVar3 = idVar2.d;
                jdVar3.getClass();
                if (jdVar3 == jd.PENDING_START || jdVar3 == jd.PENDING_RETRY) {
                    arrayList9.add(obj4);
                }
            }
        }
        arrayList5.addAll(arrayList9);
        int size6 = arrayList5.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj5 = arrayList5.get(i8);
            i8++;
            id idVar3 = (id) obj5;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new c7$$ExternalSyntheticLambda5(idVar3, j2, 0), 6, (Object) null);
            idVar3.a.b(this.b.a.i);
        }
        this.e.removeAll(arrayList5);
    }

    public final void c(long j2) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jd jdVar = ((id) obj).d;
            jdVar.getClass();
            if (jdVar == jd.PENDING_START || jdVar == jd.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new b7());
        if (sortedWith.size() >= 2) {
            int size2 = sortedWith.size();
            for (int i2 = 1; i2 < size2; i2++) {
                id idVar = (id) sortedWith.get(i2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new h$$ExternalSyntheticLambda0(idVar, 2), 6, (Object) null);
                idVar.a(j2, jd.BATCHED);
            }
        }
    }

    public final String d(long j2) {
        String str;
        String joinToString$default = CollectionsKt.joinToString$default(this.e, "\n\n", null, null, 0, null, new c7$$ExternalSyntheticLambda6(j2, 0), 30);
        c9 c9Var = this.a;
        long j3 = this.c - j2;
        long j4 = this.d - j2;
        long j5 = this.f - j2;
        long j6 = this.g;
        xf xfVar = this.i;
        if (xfVar == null || (str = xfVar.toString()) == null) {
            str = "unset";
        }
        StringBuilder sb = new StringBuilder("\n            |EndpointQueue: ");
        sb.append(c9Var);
        sb.append("\n            |   lastFailureAt = ");
        sb.append(j3);
        Boxes$$ExternalSyntheticOutline1.m1151m(j4, "\n            |   lastSuccessAt = ", "\n            |   failureBackoffUntil = ", sb);
        sb.append(j5);
        Boxes$$ExternalSyntheticOutline1.m1151m(j6, "\n            |   pendingWaitDuration = ", "\n            |   endpointRateLimiter = ", sb);
        sb.append(str);
        sb.append("\n            |   requestInfoQueue: \n            |");
        sb.append(joinToString$default);
        sb.append("\n        ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }

    public boolean c() {
        return false;
    }

    public static final String c(c7 c7Var, long j2) {
        return Recorder$$ExternalSyntheticOutline2.m("New state after request error ", c7Var.d(j2));
    }

    public static final String d(c7 c7Var, long j2) {
        return Recorder$$ExternalSyntheticOutline2.m("New state after request success\n", c7Var.d(j2));
    }

    public final void a(long j2, d9 d9Var) {
        d9Var.getClass();
        d9Var.a(this.b.a.i);
        this.e.add(new id(d9Var, j2 + this.g, j2));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new c7$$ExternalSyntheticLambda1(this, j2, 2), 3, (Object) null);
    }

    public x7 a() {
        return this.h;
    }

    public static final String a(c7 c7Var, long j2) {
        return Recorder$$ExternalSyntheticOutline2.m("Added request now to queue ", c7Var.d(j2));
    }

    public static final String a(id idVar, long j2, int i) {
        return "Set retry count for " + idVar.a(j2) + " to " + i;
    }

    public static final String a(id idVar, long j2) {
        return Recorder$$ExternalSyntheticOutline2.m("Marking request as framework complete \n", idVar.a(j2));
    }

    public static final String a(id idVar, long j2, long j3, xf xfVar) {
        String a = idVar.a(j2);
        String formatDateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j2 + j3, null, null, 3, null);
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Delaying next request after '", a, "' until next token is available in ", j3);
        m.append("ms - '");
        m.append(formatDateFromMillis$default);
        m.append("'\n");
        m.append(xfVar);
        return m.toString();
    }

    public static final String a(id idVar) {
        return "About to batch request " + idVar;
    }

    public void a(long j2, id idVar, j jVar) {
        idVar.getClass();
        jVar.getClass();
        nb nbVar = jVar instanceof nb ? (nb) jVar : null;
        t9 t9Var = nbVar != null ? nbVar.d : null;
        Long l = jVar.b;
        long longValue = l != null ? l.longValue() : 0L;
        this.c = j2;
        if (!(t9Var instanceof pd)) {
            x7 a = a();
            this.f = longValue + j2 + a.a(a.b);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new c7$$ExternalSyntheticLambda1(this, j2, 1), 6, (Object) null);
    }

    public void a(long j2, id idVar, nb nbVar) {
        idVar.getClass();
        nbVar.getClass();
        a().f = 0;
        this.d = j2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new c7$$ExternalSyntheticLambda1(this, j2, 0), 6, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xf b() {
        Map x;
        oe oeVar;
        ue ueVar = this.b.a.j;
        ReentrantLock reentrantLock = ueVar.c;
        reentrantLock.lock();
        try {
            re reVar = ueVar.e;
            if (reVar != null) {
                x = reVar.F;
                if (x == null) {
                }
                reentrantLock.unlock();
                oeVar = (oe) x.get(this.a);
                if (oeVar != null) {
                    this.i = null;
                    return null;
                }
                xf xfVar = this.i;
                int i = oeVar.b;
                int i2 = oeVar.a;
                if (xfVar == null) {
                    xfVar = new xf(i2, i, wf.a(this.b, "com.braze.endpointqueue.tokenbucket", String.valueOf(this.a.a.hashCode())));
                } else {
                    xfVar.a(i2, i);
                }
                this.i = xfVar;
                return xfVar;
            }
            x = ueVar.x();
            reentrantLock.unlock();
            oeVar = (oe) x.get(this.a);
            if (oeVar != null) {
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(c7 c7Var, long j2) {
        return c7Var.d(j2);
    }

    public static final CharSequence b(long j2, id idVar) {
        idVar.getClass();
        return idVar.a(j2);
    }
}
