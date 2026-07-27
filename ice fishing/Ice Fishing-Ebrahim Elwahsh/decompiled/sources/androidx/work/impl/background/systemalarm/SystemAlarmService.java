package androidx.work.impl.background.systemalarm;

import J0.s;
import M0.j;
import T0.n;
import T0.o;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0516y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0516y {

    /* renamed from: w, reason: collision with root package name */
    public static final String f5496w = s.f("SystemAlarmService");

    /* renamed from: u, reason: collision with root package name */
    public j f5497u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5498v;

    public final void a() {
        this.f5498v = true;
        s.d().a(f5496w, "All commands completed in dispatcher");
        String str = n.f3062a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (o.f3063a) {
            linkedHashMap.putAll(o.f3064b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(n.f3062a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0516y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f5497u = jVar;
        if (jVar.f1867B != null) {
            s.d().b(j.f1865C, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f1867B = this;
        }
        this.f5498v = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0516y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5498v = true;
        j jVar = this.f5497u;
        jVar.getClass();
        s.d().a(j.f1865C, "Destroying SystemAlarmDispatcher");
        jVar.f1871w.e(jVar);
        jVar.f1867B = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        super.onStartCommand(intent, i, i4);
        if (this.f5498v) {
            s.d().e(f5496w, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f5497u;
            jVar.getClass();
            s d2 = s.d();
            String str = j.f1865C;
            d2.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f1871w.e(jVar);
            jVar.f1867B = null;
            j jVar2 = new j(this);
            this.f5497u = jVar2;
            if (jVar2.f1867B != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f1867B = this;
            }
            this.f5498v = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5497u.a(i4, intent);
        return 3;
    }
}
