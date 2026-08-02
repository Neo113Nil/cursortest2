package M0;

import J0.r;
import K0.p;
import Q2.A;
import T0.n;
import T0.u;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.ads.C3067cm;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements K0.c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1844C = r.f("SystemAlarmDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public Intent f1845A;

    /* renamed from: B, reason: collision with root package name */
    public SystemAlarmService f1846B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1847n;

    /* renamed from: u, reason: collision with root package name */
    public final b3.e f1848u;

    /* renamed from: v, reason: collision with root package name */
    public final u f1849v;

    /* renamed from: w, reason: collision with root package name */
    public final K0.f f1850w;

    /* renamed from: x, reason: collision with root package name */
    public final p f1851x;

    /* renamed from: y, reason: collision with root package name */
    public final c f1852y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1853z;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f1847n = applicationContext;
        this.f1852y = new c(applicationContext, new C3067cm(2));
        p b9 = p.b(systemAlarmService);
        this.f1851x = b9;
        this.f1849v = new u((C4586c) b9.f1642b.f1400h);
        K0.f fVar = b9.f1646f;
        this.f1850w = fVar;
        this.f1848u = b9.f1644d;
        fVar.a(this);
        this.f1853z = new ArrayList();
        this.f1845A = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        r d9 = r.d();
        String str = f1844C;
        d9.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            r.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f1853z) {
                try {
                    Iterator it = this.f1853z.iterator();
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
        synchronized (this.f1853z) {
            try {
                boolean isEmpty = this.f1853z.isEmpty();
                this.f1853z.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z6) {
        A a9 = (A) this.f1848u.f5559w;
        String str = c.f1813x;
        Intent intent = new Intent(this.f1847n, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        c.d(intent, jVar);
        a9.execute(new i(0, 0, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a9 = n.a(this.f1847n, "ProcessCommand");
        try {
            a9.acquire();
            this.f1851x.f1644d.h(new h(this, 0));
        } finally {
            a9.release();
        }
    }
}
