package androidx.work.impl.background.systemalarm;

import J0.s;
import M0.j;
import T0.n;
import T0.o;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0506y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0506y {

    /* renamed from: w, reason: collision with root package name */
    public static final String f5384w = s.f("SystemAlarmService");

    /* renamed from: u, reason: collision with root package name */
    public j f5385u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5386v;

    public final void a() {
        this.f5386v = true;
        s.d().a(f5384w, "All commands completed in dispatcher");
        String str = n.f3052a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (o.f3053a) {
            linkedHashMap.putAll(o.f3054b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(n.f3052a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0506y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f5385u = jVar;
        if (jVar.f1813B != null) {
            s.d().b(j.f1811C, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f1813B = this;
        }
        this.f5386v = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0506y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5386v = true;
        j jVar = this.f5385u;
        jVar.getClass();
        s.d().a(j.f1811C, "Destroying SystemAlarmDispatcher");
        jVar.f1817w.e(jVar);
        jVar.f1813B = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i6) {
        super.onStartCommand(intent, i, i6);
        if (this.f5386v) {
            s.d().e(f5384w, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f5385u;
            jVar.getClass();
            s d2 = s.d();
            String str = j.f1811C;
            d2.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f1817w.e(jVar);
            jVar.f1813B = null;
            j jVar2 = new j(this);
            this.f5385u = jVar2;
            if (jVar2.f1813B != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f1813B = this;
            }
            this.f5386v = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5385u.a(i6, intent);
        return 3;
    }
}
