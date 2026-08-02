package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class e2 implements a9 {
    public static final String[] u = {"android.os.deadsystemexception"};
    public final Context a;
    public final String b;
    public final q2 c;
    public final r7 d;
    public final BrazeConfigurationProvider e;
    public final ue f;
    public final u7 g;
    public final f2 h;
    public final he i;
    public final qc j;
    public final hc k;
    public final mc l;
    public final u4 m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final ReentrantLock p;
    public Job q;
    public final m7 r;
    public volatile String s;
    public final AtomicBoolean t;

    public e2(Context context, String str, String str2, q2 q2Var, r7 r7Var, BrazeConfigurationProvider brazeConfigurationProvider, ue ueVar, u7 u7Var, f2 f2Var, he heVar, qc qcVar, hc hcVar, mc mcVar, u4 u4Var) {
        context.getClass();
        str2.getClass();
        q2Var.getClass();
        r7Var.getClass();
        brazeConfigurationProvider.getClass();
        ueVar.getClass();
        u7Var.getClass();
        f2Var.getClass();
        heVar.getClass();
        qcVar.getClass();
        hcVar.getClass();
        mcVar.getClass();
        u4Var.getClass();
        this.a = context;
        this.b = str;
        this.c = q2Var;
        this.d = r7Var;
        this.e = brazeConfigurationProvider;
        this.f = ueVar;
        this.g = u7Var;
        this.h = f2Var;
        this.i = heVar;
        this.j = qcVar;
        this.k = hcVar;
        this.l = mcVar;
        this.m = u4Var;
        final int i = 0;
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new ReentrantLock();
        this.q = JobKt.Job$default();
        this.r = new m7(context, str, str2);
        this.s = "";
        this.t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(24), 6, (Object) null);
        r7Var.c(od.class, new IEventSubscriber(this) { // from class: bo.app.e2$$ExternalSyntheticLambda6
            public final /* synthetic */ e2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                e2 e2Var = this.f$0;
                switch (i2) {
                    case 0:
                        if (obj != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            break;
                        } else {
                            e2.a(e2Var, (od) null);
                            break;
                        }
                    case 1:
                        e2.a(e2Var, (be) obj);
                        break;
                    default:
                        e2.a(e2Var, (fe) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        r7Var.c(be.class, new IEventSubscriber(this) { // from class: bo.app.e2$$ExternalSyntheticLambda6
            public final /* synthetic */ e2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                e2 e2Var = this.f$0;
                switch (i22) {
                    case 0:
                        if (obj != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            break;
                        } else {
                            e2.a(e2Var, (od) null);
                            break;
                        }
                    case 1:
                        e2.a(e2Var, (be) obj);
                        break;
                    default:
                        e2.a(e2Var, (fe) obj);
                        break;
                }
            }
        });
        final int i3 = 2;
        r7Var.c(fe.class, new IEventSubscriber(this) { // from class: bo.app.e2$$ExternalSyntheticLambda6
            public final /* synthetic */ e2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i3;
                e2 e2Var = this.f$0;
                switch (i22) {
                    case 0:
                        if (obj != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            break;
                        } else {
                            e2.a(e2Var, (od) null);
                            break;
                        }
                    case 1:
                        e2.a(e2Var, (be) obj);
                        break;
                    default:
                        e2.a(e2Var, (fe) obj);
                        break;
                }
            }
        });
    }

    public static final String e(e2 e2Var) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not opening session.", e2Var.m.c(), e2Var.i.a());
    }

    public static final String f(e2 e2Var) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not opening session.", e2Var.m.c(), e2Var.i.a());
    }

    public static final String g() {
        return "Failed to log error.";
    }

    public static final String h() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String i() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String j() {
        return "Session in background, data syncing event on delay";
    }

    public static final String k() {
        return "Logging push max campaign";
    }

    public static final String m() {
        return "Flushing Push Delivery Events now";
    }

    public static final String n() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String p() {
        return "Posting banners refresh request.";
    }

    public static final String q() {
        return "Posting feature flags refresh request.";
    }

    public static final String r() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String t() {
        return "Requesting DUST mite";
    }

    public static final String w() {
        return "Sending Push Max data";
    }

    public static final String x() {
        return "Posting SDK Debugger Logs request.";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(y8 y8Var) {
        boolean z;
        boolean z2;
        k1 k1Var;
        w7 w7Var;
        w7 w7Var2;
        e2 e2Var;
        y8Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 1), 6, (Object) null);
        boolean z3 = false;
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(12, this, y8Var), 6, (Object) null);
            return false;
        }
        if (!this.r.a(y8Var)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 2), 6, (Object) null);
            return false;
        }
        q2 q2Var = this.c;
        ReentrantLock reentrantLock = q2Var.h;
        reentrantLock.lock();
        try {
            za zaVar = q2Var.l;
            if (zaVar != null) {
                if (zaVar.d) {
                    z = true;
                    reentrantLock.unlock();
                    if (!z || this.c.h() == null) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 3), 7, (Object) null);
                        z2 = true;
                    } else {
                        ((k1) y8Var).a(this.c.h());
                        z2 = false;
                    }
                    if (this.b.length() != 0) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 4), 7, (Object) null);
                    } else {
                        k1 k1Var2 = (k1) y8Var;
                        k1Var2.e.setValue(k1Var2, k1.h[0], this.b);
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 5), 6, (Object) null);
                    k1Var = (k1) y8Var;
                    w7Var = k1Var.a;
                    w7Var2 = w7.h;
                    if (w7Var != w7Var2) {
                        e2Var = this;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(10), 7, (Object) null);
                        bc bcVar = (bc) y8Var;
                        String optString = bcVar.b.optString("cid", "");
                        r7 r7Var = e2Var.d;
                        optString.getClass();
                        r7Var.b(new fg(optString, bcVar), fg.class);
                    } else {
                        e2Var = this;
                    }
                    if (k1Var.a == w7.j || !k1Var.b.optBoolean("nop", false)) {
                        e2Var.g.a(y8Var);
                    }
                    if (z2) {
                        w7 w7Var3 = k1Var.a;
                        if (w7Var3 == w7.i) {
                            z3 = !((yb) y8Var).i;
                        } else if (w7Var3 == w7Var2 || w7Var3 == w7.g) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        r7 r7Var2 = e2Var.d;
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(y8Var);
                        listOf.getClass();
                        r7Var2.b(new o5(n5.ADD_BRAZE_EVENTS, listOf, null, null, 12), o5.class);
                    } else {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(11), 7, (Object) null);
                        r7 r7Var3 = e2Var.d;
                        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(y8Var);
                        listOf2.getClass();
                        r7Var3.b(new o5(n5.ADD_PENDING_BRAZE_EVENT, listOf2, null, null, 12), o5.class);
                    }
                    if (k1Var.a == w7.y) {
                        r7 r7Var4 = e2Var.d;
                        m5 m5Var = o5.e;
                        ra raVar = k1Var.f;
                        KProperty kProperty = k1.h[1];
                        raVar.getClass();
                        kProperty.getClass();
                        r7Var4.b(m5Var.a((ye) raVar.a), o5.class);
                    }
                    if (z2) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, priority, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(13), 6, (Object) null);
                        e2Var.q.cancel(null);
                        e2Var.q = JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new d2(e2Var, null), 3);
                    }
                    return true;
                }
            }
            z = false;
            reentrantLock.unlock();
            if (z) {
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 3), 7, (Object) null);
            z2 = true;
            if (this.b.length() != 0) {
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 5), 6, (Object) null);
            k1Var = (k1) y8Var;
            w7Var = k1Var.a;
            w7Var2 = w7.h;
            if (w7Var != w7Var2) {
            }
            if (k1Var.a == w7.j) {
            }
            e2Var.g.a(y8Var);
            if (z2) {
            }
            if (z3) {
            }
            if (k1Var.a == w7.y) {
            }
            if (z2) {
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(f fVar) {
        fVar.getClass();
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 5), 6, (Object) null);
        } else {
            this.c.c(fVar.a.toString());
            this.h.b();
        }
    }

    public final void c(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(15), 7, (Object) null);
        this.j.a(str);
    }

    public final void d() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 3), 6, (Object) null);
        } else {
            this.c.l();
        }
    }

    public final void l() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 1), 6, (Object) null);
        } else {
            this.c.c((String) null);
        }
    }

    public final void s() {
        if (this.f.G()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(21), 6, (Object) null);
            a(new v5(this.f, this.e.getBaseUrlForRequests(), this.b));
        }
    }

    public final void v() {
        List list;
        if (this.f.M()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(20), 7, (Object) null);
            ue ueVar = this.f;
            String baseUrlForRequests = this.e.getBaseUrlForRequests();
            String str = this.b;
            qc qcVar = this.j;
            Object readData = qcVar.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            readData.getClass();
            long longValue = ((Long) readData).longValue() - qcVar.a.v();
            List a = qcVar.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                if (((oc) obj).b > longValue) {
                    arrayList.add(obj);
                }
            }
            List list2 = CollectionsKt.toList(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((oc) it.next()).a);
            }
            Object readData2 = this.j.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            readData2.getClass();
            long longValue2 = ((Long) readData2).longValue();
            mc mcVar = this.l;
            long w = this.f.w();
            if (w <= 0) {
                list = EmptyList.INSTANCE;
            } else {
                long nowInSeconds = DateTimeUtils.nowInSeconds() - w;
                Map a2 = mcVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a2.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= nowInSeconds) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                list = CollectionsKt.toList(linkedHashMap.keySet());
            }
            a(new sc(ueVar, baseUrlForRequests, str, arrayList2, longValue2, list));
        }
    }

    public static final String e() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String f() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String e(y8 y8Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Not adding user id to event: ", JsonUtils.getPrettyPrintedString(((k1) y8Var).getJsonKey()));
    }

    public static final String f(y8 y8Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Attempting to log event: ", JsonUtils.getPrettyPrintedString(((k1) y8Var).getJsonKey()));
    }

    public static final String c(y8 y8Var) {
        return "Not processing event after validation failed: " + y8Var;
    }

    public static final String c(e2 e2Var) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not closing session.", e2Var.m.c(), e2Var.i.a());
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final String d(e2 e2Var) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not force closing session.", e2Var.m.c(), e2Var.i.a());
    }

    public static final String d(y8 y8Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Not adding session id to event: ", JsonUtils.getPrettyPrintedString(((k1) y8Var).getJsonKey()));
    }

    public static final String b(y8 y8Var) {
        return Recorder$$ExternalSyntheticOutline2.m("BrazeManager logEvent called for: ", JsonUtils.getPrettyPrintedString(((k1) y8Var).getJsonKey()));
    }

    public static final String b(e2 e2Var) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not adding request to dispatch.", e2Var.m.c(), e2Var.i.a());
    }

    public static final String b(Throwable th) {
        return "Not logging duplicate error: " + th;
    }

    public static final String b(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Scheduling Push Delivery Events Flush in ", " ms");
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Logging push delivery event for campaign id: ", str);
    }

    public final void b() {
        if (this.f.N()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(16), 6, (Object) null);
            a(new ae(this.f, this.e.getBaseUrlForRequests(), this.b));
        }
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final void a(e2 e2Var, be beVar) {
        beVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e2Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(9), 6, (Object) null);
        e2Var.b();
    }

    public static final void a(e2 e2Var, fe feVar) {
        feVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e2Var, BrazeLogger.Priority.D, (Throwable) null, true, (Function0) new d0$$ExternalSyntheticLambda9(14), 2, (Object) null);
        e2Var.a(feVar.a);
    }

    public final void a(boolean z) {
        this.t.set(z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 4), 6, (Object) null);
    }

    public static final String a(e2 e2Var) {
        return "Updated shouldRequestTriggersInNextRequest to: " + e2Var.t;
    }

    public final void a(f fVar) {
        fVar.getClass();
        if (!this.i.a() && !this.m.c()) {
            this.h.e();
            q2 q2Var = this.c;
            String cls = fVar.a.toString();
            cls.getClass();
            q2Var.a(cls);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 0), 6, (Object) null);
    }

    public static final void a(e2 e2Var, od odVar) {
        throw null;
    }

    public static final String a(e2 e2Var, y8 y8Var) {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not logging event: ", e2Var.m.c(), e2Var.i.a());
        m.append(y8Var);
        return m.toString();
    }

    public final void a(kb kbVar) {
        kbVar.getClass();
        Pair a = this.f.a();
        if (a != null) {
            kbVar.c = new jb(((Number) a.first).longValue(), ((Boolean) a.second).booleanValue());
        }
        if (this.t.get()) {
            kbVar.b = Boolean.TRUE;
        }
        kbVar.a = this.b;
        a(new l4(this.f, this.e.getBaseUrlForRequests(), new lb(kbVar.a, kbVar.b, kbVar.c)));
        this.t.set(false);
    }

    public final void a(j2 j2Var) {
        j2Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(22), 7, (Object) null);
        a(new k8(this.f, this.e.getBaseUrlForRequests(), this.b, j2Var));
    }

    public final void a(ArrayList arrayList, List list) {
        arrayList.getClass();
        list.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(23), 7, (Object) null);
        a(new h0(arrayList, list, this.f, this.e.getBaseUrlForRequests(), this.b));
    }

    public final void a(i2 i2Var) {
        i2Var.getClass();
        if (!this.i.a() && !this.m.c()) {
            i2Var.b = this.b;
            this.d.b(new o5(n5.ADD_REQUEST, null, null, i2Var, 6), o5.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda4(this, 2), 6, (Object) null);
        }
    }

    public final void a(long j, long j2, j2 j2Var) {
        j2Var.getClass();
        if (!this.f.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(8), 6, (Object) null);
        } else {
            a(new y3(this.f, this.e.getBaseUrlForRequests(), j, j2, this.b, j2Var));
        }
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            this.n.getAndIncrement();
            if (Intrinsics.areEqual(this.s, th.getMessage()) && this.o.get() > 3 && this.n.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            boolean areEqual = Intrinsics.areEqual(this.s, th.getMessage());
            AtomicInteger atomicInteger = this.o;
            if (areEqual) {
                atomicInteger.getAndIncrement();
            } else {
                atomicInteger.set(0);
            }
            if (this.n.get() >= 25) {
                this.n.set(0);
            }
            this.s = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, true, (Function0) new d0$$ExternalSyntheticLambda9(17), 2, (Object) null);
        a(new ee(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
    }

    public final void a(Throwable th, boolean z) {
        y8 a;
        th.getClass();
        try {
            if (a(th)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e2$$ExternalSyntheticLambda29(th, 0), 6, (Object) null);
                return;
            }
            String th2 = th.toString();
            String str = u[0];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = th2.toLowerCase(locale);
            lowerCase.getClass();
            if (StringsKt.contains((CharSequence) lowerCase, (CharSequence) str, false) || (a = k1.g.a(th, this.c.h(), z)) == null) {
                return;
            }
            a(a);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new d0$$ExternalSyntheticLambda9(19), 4, (Object) null);
        }
    }

    public final void a(long j) {
        Object systemService = this.a.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction("com.braze.FLUSH_PUSH_DELIVERY");
        int i = 0;
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j <= 0) {
            alarmManager.cancel(broadcast);
            hc hcVar = this.k;
            hcVar.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = hcVar.a;
            reentrantLock.lock();
            try {
                ArrayList arrayList2 = hcVar.b;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    dc dcVar = (dc) obj;
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(dcVar);
                    }
                }
                hcVar.b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(12), 7, (Object) null);
                    a(new ic(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(18), 7, (Object) null);
                    return;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j, 2), 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j, broadcast);
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 7), 7, (Object) null);
        this.k.a(str);
    }
}
