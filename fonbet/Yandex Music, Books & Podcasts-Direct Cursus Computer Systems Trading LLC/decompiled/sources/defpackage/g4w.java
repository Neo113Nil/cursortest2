package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;
import ru.yandex.music.YMApplication;

/* loaded from: classes.dex */
public final class g4w {
    public static g4w k;
    public static g4w l;
    public static final Object m;
    public final Context a;
    public final r46 b;
    public final WorkDatabase c;
    public final j4w d;
    public final List e;
    public final htm f;
    public final tae g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final l2t j;

    static {
        jsg.n("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public g4w(Context context, final r46 r46Var, j4w j4wVar, final WorkDatabase workDatabase, final List list, htm htmVar, l2t l2tVar) {
        Context applicationContext = context.getApplicationContext();
        Continuation continuation = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            xq0.q("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        jsg jsgVar = new jsg(r46Var.h, 0);
        synchronized (jsg.c) {
            try {
                if (jsg.d == null) {
                    jsg.d = jsgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = j4wVar;
        this.c = workDatabase;
        this.f = htmVar;
        this.j = l2tVar;
        this.b = r46Var;
        this.e = list;
        a aVar = j4wVar.b;
        aVar.getClass();
        tf6 e = gld.e(aVar);
        int i = 1;
        this.g = new tae(workDatabase, 1);
        final qhp qhpVar = j4wVar.a;
        String str = tto.a;
        htmVar.a(new rob() { // from class: nto
            @Override // defpackage.rob
            public final void a(a4w a4wVar, boolean z) {
                qhpVar.execute(new r8(list, a4wVar, r46Var, workDatabase, 12));
            }
        });
        j4wVar.a.execute(new crc(applicationContext, this));
        String str2 = nit.a;
        if (ftm.a(applicationContext, r46Var)) {
            zsd.r0(e, new ub7(12, zsd.b0(zsd.C(new clc(bg3.v(workDatabase.A().a, false, new String[]{"workspec"}, new jwv(25)), new zrr(4, i, continuation)), -1)), new qba(applicationContext, null)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g4w d(Context context) {
        g4w g4wVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    g4wVar = k;
                    if (g4wVar == null) {
                        g4wVar = l;
                    }
                }
                return g4wVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (g4wVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof q46)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            ((YMApplication) ((q46) applicationContext)).getClass();
            uyq uyqVar = new uyq(new jwv(29));
            qxp qxpVar = new qxp();
            qxpVar.a = uyqVar;
            e(applicationContext, new r46(qxpVar));
            g4wVar = d(applicationContext);
        }
        return g4wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (defpackage.g4w.l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        defpackage.g4w.l = defpackage.i4w.B(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        defpackage.g4w.k = defpackage.g4w.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, r46 r46Var) {
        synchronized (m) {
            try {
                g4w g4wVar = k;
                if (g4wVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void a(urj urjVar) {
        urjVar.getClass();
        List c = t75.c(urjVar);
        if (c.isEmpty()) {
            xq0.x("enqueue needs at least one WorkRequest.");
        } else {
            new s3w(this, null, opb.b, c, 0).a();
        }
    }

    public final xzi b(String str, mpb mpbVar, rkk rkkVar) {
        if (mpbVar != mpb.c) {
            return new s3w(this, str, mpbVar == mpb.b ? opb.b : opb.a, Collections.singletonList(rkkVar), 0).a();
        }
        rkkVar.getClass();
        ogp ogpVar = this.b.m;
        String concat = "enqueueUniquePeriodic_".concat(str);
        qhp qhpVar = this.d.a;
        qhpVar.getClass();
        return a4g.K(ogpVar, concat, qhpVar, new ftr(this, str, rkkVar));
    }

    public final xzi c(String str, opb opbVar, urj urjVar) {
        opbVar.getClass();
        urjVar.getClass();
        return new s3w(this, str, opbVar, t75.c(urjVar), 0).a();
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ogp ogpVar = this.b.m;
        st3 st3Var = new st3(this, 1);
        ogpVar.getClass();
        boolean H = y7g.H();
        if (H) {
            try {
                Trace.beginSection(y7g.X("ReschedulingWork"));
            } finally {
                if (H) {
                    Trace.endSection();
                }
            }
        }
        st3Var.invoke();
    }
}
