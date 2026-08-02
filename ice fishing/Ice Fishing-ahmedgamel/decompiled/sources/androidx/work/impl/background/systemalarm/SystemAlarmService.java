package androidx.work.impl.background.systemalarm;

import J0.r;
import M0.j;
import T0.n;
import T0.o;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0510y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0510y {

    /* renamed from: w, reason: collision with root package name */
    public static final String f5349w = r.f("SystemAlarmService");

    /* renamed from: u, reason: collision with root package name */
    public j f5350u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5351v;

    public final void a() {
        this.f5351v = true;
        r.d().a(f5349w, "All commands completed in dispatcher");
        String str = n.f3135a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (o.f3136a) {
            linkedHashMap.putAll(o.f3137b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                r.d().g(n.f3135a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0510y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f5350u = jVar;
        if (jVar.f1846B != null) {
            r.d().b(j.f1844C, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f1846B = this;
        }
        this.f5351v = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0510y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5351v = true;
        j jVar = this.f5350u;
        jVar.getClass();
        r.d().a(j.f1844C, "Destroying SystemAlarmDispatcher");
        jVar.f1850w.e(jVar);
        jVar.f1846B = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        super.onStartCommand(intent, i, i4);
        if (this.f5351v) {
            r.d().e(f5349w, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f5350u;
            jVar.getClass();
            r d9 = r.d();
            String str = j.f1844C;
            d9.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f1850w.e(jVar);
            jVar.f1846B = null;
            j jVar2 = new j(this);
            this.f5350u = jVar2;
            if (jVar2.f1846B != null) {
                r.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f1846B = this;
            }
            this.f5351v = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5350u.a(i4, intent);
        return 3;
    }
}
