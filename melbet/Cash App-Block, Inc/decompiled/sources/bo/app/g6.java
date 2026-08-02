package bo.app;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class g6 {
    public static final long i = 3000;
    public final ue a;
    public final r7 b;
    public final o6 c;
    public final x7 d;
    public final com.braze.storage.d e;
    public Job f;
    public Job g;
    public int h;

    public g6(Context context, String str, String str2, ue ueVar, r7 r7Var, o6 o6Var, x7 x7Var) {
        context.getClass();
        str2.getClass();
        ueVar.getClass();
        r7Var.getClass();
        o6Var.getClass();
        x7Var.getClass();
        this.a = ueVar;
        this.b = r7Var;
        this.c = o6Var;
        this.d = x7Var;
        this.e = new com.braze.storage.d(context, str, str2);
        final int i2 = 0;
        r7Var.c(af.class, new IEventSubscriber(this) { // from class: bo.app.g6$$ExternalSyntheticLambda0
            public final /* synthetic */ g6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                g6 g6Var = this.f$0;
                switch (i3) {
                    case 0:
                        g6.a(g6Var, (af) obj);
                        break;
                    case 1:
                        g6.a(g6Var, (cf) obj);
                        break;
                    case 2:
                        g6.a(g6Var, (db) obj);
                        break;
                    default:
                        g6.a(g6Var, (u5) obj);
                        break;
                }
            }
        });
        final int i3 = 1;
        r7Var.c(cf.class, new IEventSubscriber(this) { // from class: bo.app.g6$$ExternalSyntheticLambda0
            public final /* synthetic */ g6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i32 = i3;
                g6 g6Var = this.f$0;
                switch (i32) {
                    case 0:
                        g6.a(g6Var, (af) obj);
                        break;
                    case 1:
                        g6.a(g6Var, (cf) obj);
                        break;
                    case 2:
                        g6.a(g6Var, (db) obj);
                        break;
                    default:
                        g6.a(g6Var, (u5) obj);
                        break;
                }
            }
        });
        final int i4 = 2;
        r7Var.c(db.class, new IEventSubscriber(this) { // from class: bo.app.g6$$ExternalSyntheticLambda0
            public final /* synthetic */ g6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i32 = i4;
                g6 g6Var = this.f$0;
                switch (i32) {
                    case 0:
                        g6.a(g6Var, (af) obj);
                        break;
                    case 1:
                        g6.a(g6Var, (cf) obj);
                        break;
                    case 2:
                        g6.a(g6Var, (db) obj);
                        break;
                    default:
                        g6.a(g6Var, (u5) obj);
                        break;
                }
            }
        });
        final int i5 = 3;
        r7Var.c(u5.class, new IEventSubscriber(this) { // from class: bo.app.g6$$ExternalSyntheticLambda0
            public final /* synthetic */ g6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i32 = i5;
                g6 g6Var = this.f$0;
                switch (i32) {
                    case 0:
                        g6.a(g6Var, (af) obj);
                        break;
                    case 1:
                        g6.a(g6Var, (cf) obj);
                        break;
                    case 2:
                        g6.a(g6Var, (db) obj);
                        break;
                    default:
                        g6.a(g6Var, (u5) obj);
                        break;
                }
            }
        });
    }

    public static final String c(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Scheduling stream reconnection in ", " ms");
    }

    public static final String d() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String e() {
        return "Ending DUST subscription on a delay";
    }

    public static final String f() {
        return "Received dust config. Starting/resuming a new subscription";
    }

    public static final String h() {
        return "Connection attempt succeeded. Resetting attempts to 0";
    }

    public static final String i() {
        return "Max reconnect attempts reached. Not starting DUST subscription.";
    }

    public final void a(boolean z) {
        Job job = this.g;
        String str = null;
        if (job != null) {
            job.cancel(null);
        }
        if (this.h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return;
        }
        String readString = this.e.readString(DataStoreKey.MITE_KEY, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        String readString2 = this.e.readString(DataStoreKey.DUST_HOST, "");
        if (readString2 == null || readString2.length() == 0) {
            readString2 = null;
        }
        String readString3 = this.e.readString(DataStoreKey.DUST_AUTH, "");
        if (readString3 == null || readString3.length() == 0) {
            readString3 = null;
        }
        String readString4 = this.e.readString(DataStoreKey.DUST_RCS, "");
        if (readString4 != null && readString4.length() != 0) {
            str = readString4;
        }
        if (readString == null || readString2 == null || readString3 == null || !this.a.G()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l2$$ExternalSyntheticLambda7(readString, readString2, readString3, this, 12), 7, (Object) null);
            return;
        }
        String a = a6.a(readString2, readString, readString3, str, this.h);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda11(z, readString, a, 0), 7, (Object) null);
        this.c.a(a, new d6(this), new e6(this), new f6(this), z);
    }

    public final void b(long j) {
        Job job = this.g;
        if (job != null) {
            job.cancel(null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j, 4), 6, (Object) null);
        this.g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j), null, new c6(this, j, null), 2, null);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(10), 7, (Object) null);
        this.h = 0;
        this.d.f = 0;
    }

    public static final String c() {
        return "Saving rcs value from TTL message";
    }

    public static final String b(k9 k9Var) {
        return "Ingesting DUST message of type " + k9Var.a() + "\n" + k9Var;
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String b(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(x5 x5Var) {
        g6 g6Var;
        if (x5Var == null) {
            return;
        }
        String str = x5Var.b;
        if (str != null) {
            g6Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 10), 6, (Object) null);
        } else {
            g6Var = this;
        }
        g6Var.c.b();
        Job job = g6Var.g;
        if (job != null) {
            job.cancel(null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j = x5Var.a;
        x7 x7Var = g6Var.d;
        g6Var.g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j + x7Var.a(x7Var.b)), null, new b6(g6Var, null), 2, null);
    }

    public final void a(p6 p6Var) {
        if (p6Var == null) {
            return;
        }
        String str = p6Var.b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(11), 7, (Object) null);
            this.e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l = p6Var.a;
        if (l != null) {
            long longValue = l.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(longValue, 5), 7, (Object) null);
            b(longValue);
        }
    }

    public static final void a(g6 g6Var, af afVar) {
        afVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(14), 7, (Object) null);
        Job job = g6Var.f;
        if (job != null) {
            job.cancel(null);
        }
        g6Var.a(true);
    }

    public static final void a(g6 g6Var, cf cfVar) {
        cfVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(12), 7, (Object) null);
        g6Var.f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(i), null, new z5(g6Var, null), 2, null);
    }

    public static final void a(g6 g6Var, db dbVar) {
        dbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda9(dbVar, 0), 7, (Object) null);
        cb cbVar = dbVar.b;
        cb cbVar2 = cb.NONE;
        if (cbVar == cbVar2) {
            g6Var.a();
        } else if (dbVar.a == cbVar2) {
            g6Var.a(true);
        }
    }

    public static final String a(db dbVar) {
        return "Got network change event: " + dbVar;
    }

    public static final void a(g6 g6Var, u5 u5Var) {
        u5Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(13), 7, (Object) null);
        com.braze.storage.d dVar = g6Var.e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String readString = dVar.readString(dataStoreKey, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(u5Var, 7), 7, (Object) null);
        String str = u5Var.a;
        if (str != null) {
            g6Var.e.writeData(dataStoreKey, str);
        }
        String str2 = u5Var.b;
        if (str2 != null) {
            g6Var.e.writeData(DataStoreKey.DUST_HOST, str2);
        }
        String str3 = u5Var.c;
        if (str3 != null) {
            g6Var.e.writeData(DataStoreKey.DUST_AUTH, str3);
        }
        g6Var.a(Intrinsics.areEqual(readString, u5Var.a));
    }

    public static final String a(u5 u5Var) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Setting dust config: mite=", u5Var.a, ", host=", u5Var.b);
    }

    public static final String a(String str, String str2, String str3, g6 g6Var) {
        boolean z = str3 != null;
        boolean G = g6Var.a.G();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cannot start dust subscription: mite=", str, ", host=", str2, ", auth=");
        m.append(z);
        m.append(", enabled=");
        m.append(G);
        return m.toString();
    }

    public static final String a(boolean z, String str, String str2) {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Starting (resume = ", ") DUST subscription for mite: ", str, " to url: ", z);
        m.append(str2);
        return m.toString();
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(15), 7, (Object) null);
        Job job = this.g;
        if (job != null) {
            job.cancel(null);
        }
        this.g = null;
        this.c.b();
    }

    public final void a(k9 k9Var) {
        k9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(k9Var, 5), 7, (Object) null);
        j9 a = k9Var.a();
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            r7 r7Var = this.b;
            j2 j2Var = j2.SESSION_START;
            r7Var.b(new p3(), p3.class);
            return;
        }
        if (ordinal == 2) {
            a(k9Var instanceof p6 ? (p6) k9Var : null);
            return;
        }
        if (ordinal == 3) {
            a(k9Var instanceof x5 ? (x5) k9Var : null);
        } else {
            if (ordinal != 4) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(a, 6), 6, (Object) null);
                return;
            }
            r7 r7Var2 = this.b;
            j2 j2Var2 = j2.SESSION_START;
            r7Var2.b(new a8(), a8.class);
        }
    }

    public static final String a(j9 j9Var) {
        return "Lacked logic to ingest message! Type: " + j9Var;
    }

    public static final String a(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Scheduling reconnection in ", "ms");
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Received disconnect and retry request. Reason: ", str);
    }

    public final void a(Integer num) {
        this.h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(14, this, num), 7, (Object) null);
        Job job = this.g;
        if (job != null) {
            job.cancel(null);
        }
        IntRange intRange = o6.g;
        if (num != null && intRange.contains(num.intValue())) {
            x7 x7Var = this.d;
            b(x7Var.a(x7Var.b));
        } else {
            IntRange intRange2 = o6.f;
            if (num != null) {
                intRange2.getClass();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda17(0, num), 7, (Object) null);
        }
    }

    public static final String a(g6 g6Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + g6Var.h + ". Response code: " + num;
    }
}
