package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0516y extends Service implements InterfaceC0513v {

    /* renamed from: n, reason: collision with root package name */
    public final Y2.e f5295n = new Y2.e(this);

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        return (C0515x) this.f5295n.f3963u;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        this.f5295n.E(EnumC0506n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5295n.E(EnumC0506n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0506n enumC0506n = EnumC0506n.ON_STOP;
        Y2.e eVar = this.f5295n;
        eVar.E(enumC0506n);
        eVar.E(EnumC0506n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f5295n.E(EnumC0506n.ON_START);
        super.onStart(intent, i);
    }
}
