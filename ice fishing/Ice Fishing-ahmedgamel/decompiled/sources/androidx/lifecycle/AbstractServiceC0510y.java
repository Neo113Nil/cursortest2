package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0510y extends Service implements InterfaceC0507v {

    /* renamed from: n, reason: collision with root package name */
    public final b3.e f5150n = new b3.e(this);

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        return (C0509x) this.f5150n.f5557u;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        this.f5150n.B(EnumC0500n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5150n.B(EnumC0500n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0500n enumC0500n = EnumC0500n.ON_STOP;
        b3.e eVar = this.f5150n;
        eVar.B(enumC0500n);
        eVar.B(EnumC0500n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f5150n.B(EnumC0500n.ON_START);
        super.onStart(intent, i);
    }
}
