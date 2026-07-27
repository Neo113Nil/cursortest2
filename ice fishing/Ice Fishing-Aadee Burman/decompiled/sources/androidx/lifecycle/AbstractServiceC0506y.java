package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0506y extends Service implements InterfaceC0503v {

    /* renamed from: n, reason: collision with root package name */
    public final Z2.e f5183n = new Z2.e(this);

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        return (C0505x) this.f5183n.f4170u;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        this.f5183n.B(EnumC0496n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5183n.B(EnumC0496n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0496n enumC0496n = EnumC0496n.ON_STOP;
        Z2.e eVar = this.f5183n;
        eVar.B(enumC0496n);
        eVar.B(EnumC0496n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f5183n.B(EnumC0496n.ON_START);
        super.onStart(intent, i);
    }
}
