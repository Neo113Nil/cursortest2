package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0502j;
import h0.AbstractC4556b;
import h0.C4558d;
import java.util.LinkedHashMap;
import x0.C5202c;
import x0.C5203d;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public final class X implements InterfaceC0502j, InterfaceC5204e, androidx.lifecycle.Y {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0485s f5030n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.X f5031u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0482o f5032v;

    /* renamed from: w, reason: collision with root package name */
    public C0515x f5033w = null;

    /* renamed from: x, reason: collision with root package name */
    public C5203d f5034x = null;

    public X(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, androidx.lifecycle.X x3, RunnableC0482o runnableC0482o) {
        this.f5030n = abstractComponentCallbacksC0485s;
        this.f5031u = x3;
        this.f5032v = runnableC0482o;
    }

    public final void a(EnumC0506n enumC0506n) {
        this.f5033w.e(enumC0506n);
    }

    public final void b() {
        if (this.f5033w == null) {
            this.f5033w = new C0515x(this);
            C5203d c5203d = new C5203d(this);
            this.f5034x = c5203d;
            c5203d.a();
            this.f5032v.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0502j
    public final AbstractC4556b getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5030n;
        Context applicationContext = abstractComponentCallbacksC0485s.y().getApplicationContext();
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
        C4558d c4558d = new C4558d(0);
        LinkedHashMap linkedHashMap = c4558d.f38143a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5260a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5232a, abstractComponentCallbacksC0485s);
        linkedHashMap.put(androidx.lifecycle.L.f5233b, this);
        Bundle bundle = abstractComponentCallbacksC0485s.f5180y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5234c, bundle);
        }
        return c4558d;
    }

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        b();
        return this.f5033w;
    }

    @Override // x0.InterfaceC5204e
    public final C5202c getSavedStateRegistry() {
        b();
        return this.f5034x.f41773b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        b();
        return this.f5031u;
    }
}
