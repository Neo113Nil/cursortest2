package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0496j;
import h0.AbstractC4559b;
import h0.C4561d;
import java.util.LinkedHashMap;
import x0.C5180c;
import x0.C5181d;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public final class X implements InterfaceC0496j, InterfaceC5182e, androidx.lifecycle.Y {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0479s f4886n;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.X f4887u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0476o f4888v;

    /* renamed from: w, reason: collision with root package name */
    public C0509x f4889w = null;

    /* renamed from: x, reason: collision with root package name */
    public C5181d f4890x = null;

    public X(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, androidx.lifecycle.X x9, RunnableC0476o runnableC0476o) {
        this.f4886n = abstractComponentCallbacksC0479s;
        this.f4887u = x9;
        this.f4888v = runnableC0476o;
    }

    public final void a(EnumC0500n enumC0500n) {
        this.f4889w.e(enumC0500n);
    }

    public final void b() {
        if (this.f4889w == null) {
            this.f4889w = new C0509x(this);
            C5181d c5181d = new C5181d(this);
            this.f4890x = c5181d;
            c5181d.a();
            this.f4888v.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0496j
    public final AbstractC4559b getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4886n;
        Context applicationContext = abstractComponentCallbacksC0479s.y().getApplicationContext();
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
        C4561d c4561d = new C4561d(0);
        LinkedHashMap linkedHashMap = c4561d.f37969a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5115a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5087a, abstractComponentCallbacksC0479s);
        linkedHashMap.put(androidx.lifecycle.L.f5088b, this);
        Bundle bundle = abstractComponentCallbacksC0479s.f5035y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5089c, bundle);
        }
        return c4561d;
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        b();
        return this.f4889w;
    }

    @Override // x0.InterfaceC5182e
    public final C5180c getSavedStateRegistry() {
        b();
        return this.f4890x.f41812b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        b();
        return this.f4887u;
    }
}
