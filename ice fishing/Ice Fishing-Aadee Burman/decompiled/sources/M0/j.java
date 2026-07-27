package M0;

import J0.s;
import K0.p;
import O2.B;
import T0.n;
import T0.u;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g1.C4523c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements K0.c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1811C = s.f("SystemAlarmDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public Intent f1812A;

    /* renamed from: B, reason: collision with root package name */
    public SystemAlarmService f1813B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1814n;

    /* renamed from: u, reason: collision with root package name */
    public final Z2.e f1815u;

    /* renamed from: v, reason: collision with root package name */
    public final u f1816v;

    /* renamed from: w, reason: collision with root package name */
    public final K0.f f1817w;

    /* renamed from: x, reason: collision with root package name */
    public final p f1818x;

    /* renamed from: y, reason: collision with root package name */
    public final c f1819y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1820z;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f1814n = applicationContext;
        this.f1819y = new c(applicationContext, new S0.c(3));
        p b9 = p.b(systemAlarmService);
        this.f1818x = b9;
        this.f1816v = new u((C4523c) b9.f1533b.f1371h);
        K0.f fVar = b9.f1537f;
        this.f1817w = fVar;
        this.f1815u = b9.f1535d;
        fVar.a(this);
        this.f1820z = new ArrayList();
        this.f1812A = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        s d2 = s.d();
        String str = f1811C;
        d2.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f1820z) {
                try {
                    Iterator it = this.f1820z.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f1820z) {
            try {
                boolean isEmpty = this.f1820z.isEmpty();
                this.f1820z.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z3) {
        B b9 = (B) this.f1815u.f4172w;
        String str = c.f1780x;
        Intent intent = new Intent(this.f1814n, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        c.d(intent, jVar);
        b9.execute(new i(0, 0, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a9 = n.a(this.f1814n, "ProcessCommand");
        try {
            a9.acquire();
            this.f1818x.f1535d.i(new h(this, 0));
        } finally {
            a9.release();
        }
    }
}
