package bo.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class k4 {
    public static final String m = BrazeLogger.getBrazeLogTag((Class<?>) k4.class);
    public final Context a;
    public final r7 b;
    public final d4 c;
    public final i4 d;
    public final g4 e;
    public bf f;
    public long g;
    public volatile boolean h;
    public final ConnectivityManager i;
    public cb j;
    public Job k;
    public boolean l;

    public k4(Context context, r7 r7Var, d4 d4Var) {
        context.getClass();
        r7Var.getClass();
        d4Var.getClass();
        this.a = context;
        this.b = r7Var;
        this.c = d4Var;
        this.f = bf.NO_SESSION;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.i = (ConnectivityManager) systemService;
        this.j = cb.GOOD;
        if (Build.VERSION.SDK_INT >= 30) {
            this.e = new g4(this);
        } else {
            this.d = new i4(this);
        }
        a(r7Var);
    }

    public static final String d(k4 k4Var) {
        return Recorder$$ExternalSyntheticOutline2.m(k4Var.g, "currentIntervalMs: ");
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final Job a(long j) {
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda9(j, this, 1), 6, (Object) null);
            return JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new j4(this, j, null), 3);
        }
        Braze.INSTANCE.getInstance(this.a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda6(this, 1), 7, (Object) null);
        return null;
    }

    public final void b() {
        long j;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda6(this, 0), 6, (Object) null);
        long j2 = this.g;
        if (this.f == bf.NO_SESSION || this.l) {
            this.g = -1L;
        } else {
            int ordinal = this.j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    d4 d4Var = this.c;
                    d4Var.getClass();
                    f1 f1Var = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = d4Var.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (ordinal == 2) {
                    d4 d4Var2 = this.c;
                    d4Var2.getClass();
                    f1 f1Var2 = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = d4Var2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    d4 d4Var3 = this.c;
                    d4Var3.getClass();
                    f1 f1Var3 = f1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = d4Var3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                }
                j = intValue * 1000;
            } else {
                j = -1;
            }
            this.g = j;
            if (j != -1 && j < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda6(this, 2), 6, (Object) null);
                this.g = 1000L;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda6(this, 3), 6, (Object) null);
        if (j2 != this.g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k4$$ExternalSyntheticLambda9(j2, this, 0), 7, (Object) null);
            b(this.g);
        }
    }

    public final synchronized void c() {
        if (this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(22), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(25), 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.i;
            g4 g4Var = this.e;
            if (g4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                throw null;
            }
            connectivityManager.registerDefaultNetworkCallback(g4Var);
            a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
        } else {
            this.a.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        b(this.g);
        this.h = true;
    }

    public final synchronized void f() {
        if (!this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(26), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(27), 7, (Object) null);
        Job job = this.k;
        if (job != null) {
            job.cancel(null);
        }
        this.k = null;
        i();
        this.h = false;
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.a.unregisterReceiver(this.d);
                return;
            }
            ConnectivityManager connectivityManager = this.i;
            g4 g4Var = this.e;
            if (g4Var != null) {
                connectivityManager.unregisterNetworkCallback(g4Var);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                throw null;
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(24), 4, (Object) null);
        }
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String a(long j, k4 k4Var) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(k4Var.g, " ms", Boxes$$ExternalSyntheticOutline1.m1149m(j, "Kicking off the Sync Job. initialDelaysMs: ", ": currentIntervalMs "));
    }

    public static final String a(k4 k4Var) {
        return Boxes$$ExternalSyntheticOutline1.m(k4Var.g, "Data flush interval is ", " ms. Not scheduling a proceeding data flush.");
    }

    public final void a(r7 r7Var, Exception exc) {
        try {
            r7Var.b(exc, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(23), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        cb cbVar = this.j;
        cb a = com.braze.support.b.a(networkCapabilities);
        this.j = a;
        if (cbVar != a) {
            this.b.b(new db(cbVar, a), db.class);
        }
        b();
    }

    public final void a(r7 r7Var) {
        r7Var.getClass();
        final int i = 0;
        r7Var.c(af.class, new IEventSubscriber(this) { // from class: bo.app.k4$$ExternalSyntheticLambda2
            public final /* synthetic */ k4 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                k4 k4Var = this.f$0;
                switch (i2) {
                    case 0:
                        k4.a(k4Var, (af) obj);
                        break;
                    default:
                        k4.a(k4Var, (cf) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        r7Var.c(cf.class, new IEventSubscriber(this) { // from class: bo.app.k4$$ExternalSyntheticLambda2
            public final /* synthetic */ k4 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                k4 k4Var = this.f$0;
                switch (i22) {
                    case 0:
                        k4.a(k4Var, (af) obj);
                        break;
                    default:
                        k4.a(k4Var, (cf) obj);
                        break;
                }
            }
        });
    }

    public static final void a(k4 k4Var, af afVar) {
        afVar.getClass();
        k4Var.f = bf.OPEN_SESSION;
        k4Var.b();
    }

    public static final void a(k4 k4Var, cf cfVar) {
        cfVar.getClass();
        k4Var.f = bf.NO_SESSION;
        k4Var.b();
    }

    public static final String c(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "Posting new sync runnable with delay ", " ms");
    }

    public static final String c(k4 k4Var) {
        return Boxes$$ExternalSyntheticOutline1.m(k4Var.g, "Flush interval was too low (", "), moving to minimum of 1000 ms");
    }

    public final void b(long j) {
        Job job = this.k;
        if (job != null) {
            job.cancel(null);
        }
        this.k = null;
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j, 8), 7, (Object) null);
            this.k = a(j);
        }
    }

    public static final String b(k4 k4Var) {
        return "recalculateDispatchState called with session state: " + k4Var.f + " lastNetworkLevel: " + k4Var.j;
    }

    public static final String b(long j, k4 k4Var) {
        long j2 = k4Var.g;
        cb cbVar = k4Var.j;
        bf bfVar = k4Var.f;
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Data flush interval has changed from ", " ms to ");
        m1149m.append(j2);
        m1149m.append(" ms after connectivity state change to: ");
        m1149m.append(cbVar);
        m1149m.append(" and session state: ");
        m1149m.append(bfVar);
        return m1149m.toString();
    }
}
