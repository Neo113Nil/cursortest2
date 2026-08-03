package r4;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import m.t;
import o4.o;
import p4.n;
import x4.j;
import x4.l;
import y4.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements p4.c {

    /* renamed from: p, reason: collision with root package name */
    public static final String f6075p = o.f("SystemAlarmDispatcher");

    /* renamed from: g, reason: collision with root package name */
    public final Context f6076g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.a f6077h;

    /* renamed from: i, reason: collision with root package name */
    public final v f6078i;

    /* renamed from: j, reason: collision with root package name */
    public final p4.e f6079j;

    /* renamed from: k, reason: collision with root package name */
    public final n f6080k;

    /* renamed from: l, reason: collision with root package name */
    public final c f6081l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f6082m;

    /* renamed from: n, reason: collision with root package name */
    public Intent f6083n;

    /* renamed from: o, reason: collision with root package name */
    public SystemAlarmService f6084o;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f6076g = applicationContext;
        this.f6081l = new c(applicationContext, new l(7));
        n a6 = n.a(systemAlarmService);
        this.f6080k = a6;
        this.f6078i = new v(a6.f5494b.f5189e);
        p4.e eVar = a6.f5498f;
        this.f6079j = eVar;
        this.f6077h = a6.f5496d;
        eVar.a(this);
        this.f6082m = new ArrayList();
        this.f6083n = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i10, Intent intent) {
        o d10 = o.d();
        String str = f6075p;
        d10.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f6082m) {
                try {
                    ArrayList arrayList = this.f6082m;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f6082m) {
            try {
                boolean isEmpty = this.f6082m.isEmpty();
                this.f6082m.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // p4.c
    public final void b(j jVar, boolean z10) {
        a5.b bVar = (a5.b) ((a5.c) this.f6077h).f263i;
        String str = c.f6049k;
        Intent intent = new Intent(this.f6076g, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        c.d(intent, jVar);
        bVar.execute(new t(0, 1, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a6 = y4.n.a(this.f6076g, "ProcessCommand");
        try {
            a6.acquire();
            this.f6080k.f5496d.a(new h(this, 0));
        } finally {
            a6.release();
        }
    }
}
