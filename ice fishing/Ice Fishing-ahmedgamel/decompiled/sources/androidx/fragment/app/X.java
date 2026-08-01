package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0492j;
import h0.AbstractC4554b;
import h0.C4556d;
import java.util.LinkedHashMap;
import x0.C5181c;
import x0.C5182d;
import x0.InterfaceC5183e;

/* loaded from: classes.dex */
public final class X implements InterfaceC0492j, InterfaceC5183e, androidx.lifecycle.Y {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0475s f4918n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.X f4919u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0472o f4920v;

    /* renamed from: w, reason: collision with root package name */
    public C0505x f4921w = null;

    /* renamed from: x, reason: collision with root package name */
    public C5182d f4922x = null;

    public X(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, androidx.lifecycle.X x9, RunnableC0472o runnableC0472o) {
        this.f4918n = abstractComponentCallbacksC0475s;
        this.f4919u = x9;
        this.f4920v = runnableC0472o;
    }

    public final void a(EnumC0496n enumC0496n) {
        this.f4921w.e(enumC0496n);
    }

    public final void b() {
        if (this.f4921w == null) {
            this.f4921w = new C0505x(this);
            C5182d c5182d = new C5182d(this);
            this.f4922x = c5182d;
            c5182d.a();
            this.f4920v.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0492j
    public final AbstractC4554b getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4918n;
        Context applicationContext = abstractComponentCallbacksC0475s.y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C4556d c4556d = new C4556d(0);
        LinkedHashMap linkedHashMap = c4556d.f37943a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5148a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5120a, abstractComponentCallbacksC0475s);
        linkedHashMap.put(androidx.lifecycle.L.f5121b, this);
        Bundle bundle = abstractComponentCallbacksC0475s.f5068y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5122c, bundle);
        }
        return c4556d;
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        b();
        return this.f4921w;
    }

    @Override // x0.InterfaceC5183e
    public final C5181c getSavedStateRegistry() {
        b();
        return this.f4922x.f41757b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        b();
        return this.f4919u;
    }
}
