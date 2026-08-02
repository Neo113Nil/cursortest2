package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class gpr implements nsg {
    public final String a;
    public volatile nsg b;
    public Boolean c;
    public Method d;
    public vib e;
    public final Queue f;
    public final boolean g;

    public gpr(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    @Override // defpackage.nsg
    public final void a(String str, uxe uxeVar) {
        m().a(str, uxeVar);
    }

    @Override // defpackage.nsg
    public final boolean b() {
        return m().b();
    }

    @Override // defpackage.nsg
    public final boolean c() {
        return m().c();
    }

    @Override // defpackage.nsg
    public final void d(String str) {
        m().d(str);
    }

    @Override // defpackage.nsg
    public final boolean e() {
        return m().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gpr.class == obj.getClass() && this.a.equals(((gpr) obj).a);
    }

    @Override // defpackage.nsg
    public final boolean f() {
        return m().f();
    }

    @Override // defpackage.nsg
    public final void g(String str, Integer num, Object obj) {
        m().g(str, num, obj);
    }

    @Override // defpackage.nsg
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.nsg
    public final void h(String str, Exception exc) {
        m().h(str, exc);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nsg
    public final void i(Object obj, String str) {
        m().i(obj, str);
    }

    @Override // defpackage.nsg
    public final boolean j() {
        return m().j();
    }

    @Override // defpackage.nsg
    public final void k(String str) {
        m().k(str);
    }

    @Override // defpackage.nsg
    public final boolean l(int i) {
        return m().l(i);
    }

    public final nsg m() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return cwi.a;
        }
        if (this.e == null) {
            Queue queue = this.f;
            vib vibVar = new vib();
            vibVar.b = this;
            vibVar.a = this.a;
            vibVar.c = queue;
            this.e = vibVar;
        }
        return this.e;
    }

    public final boolean n() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", hpr.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}
