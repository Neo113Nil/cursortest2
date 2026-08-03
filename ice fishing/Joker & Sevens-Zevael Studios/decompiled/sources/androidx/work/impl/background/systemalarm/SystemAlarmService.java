package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.x;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.o;
import r4.i;
import y4.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class SystemAlarmService extends x {

    /* renamed from: j, reason: collision with root package name */
    public static final String f773j = o.f("SystemAlarmService");

    /* renamed from: h, reason: collision with root package name */
    public i f774h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f775i;

    public final void c() {
        this.f775i = true;
        o.d().a(f773j, "All commands completed in dispatcher");
        String str = n.f8759a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (y4.o.f8760a) {
            linkedHashMap.putAll(y4.o.f8761b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                o.d().g(n.f8759a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f774h = iVar;
        if (iVar.f6084o != null) {
            o.d().b(i.f6075p, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.f6084o = this;
        }
        this.f775i = false;
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f775i = true;
        i iVar = this.f774h;
        iVar.getClass();
        o.d().a(i.f6075p, "Destroying SystemAlarmDispatcher");
        iVar.f6079j.e(iVar);
        iVar.f6084o = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f775i) {
            o.d().e(f773j, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f774h;
            iVar.getClass();
            o d10 = o.d();
            String str = i.f6075p;
            d10.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f6079j.e(iVar);
            iVar.f6084o = null;
            i iVar2 = new i(this);
            this.f774h = iVar2;
            if (iVar2.f6084o != null) {
                o.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.f6084o = this;
            }
            this.f775i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f774h.a(i11, intent);
        return 3;
    }
}
