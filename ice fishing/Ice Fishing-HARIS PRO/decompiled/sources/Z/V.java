package Z;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0092i;
import b.C0115k;
import c0.C0122c;
import java.util.LinkedHashMap;
import l0.C0233d;
import l0.InterfaceC0234e;

/* loaded from: classes.dex */
public final class V implements InterfaceC0092i, InterfaceC0234e, androidx.lifecycle.V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0070s f1494a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.U f1495b;

    /* renamed from: c, reason: collision with root package name */
    public final D.a f1496c;

    /* renamed from: d, reason: collision with root package name */
    public C0103u f1497d = null;
    public C0115k e = null;

    public V(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, androidx.lifecycle.U u2, D.a aVar) {
        this.f1494a = abstractComponentCallbacksC0070s;
        this.f1495b = u2;
        this.f1496c = aVar;
    }

    @Override // androidx.lifecycle.InterfaceC0092i
    public final C0122c a() {
        Application application;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1494a;
        Context applicationContext = abstractComponentCallbacksC0070s.H().getApplicationContext();
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
        C0122c c0122c = new C0122c(0);
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.S.f2023f, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f2008a, abstractComponentCallbacksC0070s);
        linkedHashMap.put(androidx.lifecycle.L.f2009b, this);
        Bundle bundle = abstractComponentCallbacksC0070s.f1603f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f2010c, bundle);
        }
        return c0122c;
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        f();
        return (C0233d) this.e.f2300c;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U c() {
        f();
        return this.f1495b;
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        f();
        return this.f1497d;
    }

    public final void e(EnumC0096m enumC0096m) {
        this.f1497d.d(enumC0096m);
    }

    public final void f() {
        if (this.f1497d == null) {
            this.f1497d = new C0103u(this);
            C0115k c0115k = new C0115k(this);
            this.e = c0115k;
            c0115k.a();
            this.f1496c.run();
        }
    }
}
