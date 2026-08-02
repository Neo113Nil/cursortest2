package io.appmetrica.analytics.impl;

import defpackage.bc61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Z3 implements InterfaceC0194aj {
    public final InterfaceC0194aj a;
    public final Qi b;
    public boolean c;
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    public Z3(InterfaceC0194aj interfaceC0194aj, Qi qi) {
        this.a = interfaceC0194aj;
        this.b = qi;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        InterfaceC0309ej interfaceC0309ej;
        synchronized (this.e) {
            try {
                interfaceC0309ej = null;
                if (((fs) this.b).c()) {
                    InterfaceC0309ej b = ((fs) this.b).b();
                    if (b == null) {
                        b = new C0252cj("Referrer is null", null, 2, null);
                    }
                    interfaceC0309ej = b;
                } else {
                    this.d.add(wi);
                }
            } finally {
            }
        }
        if (interfaceC0309ej != null) {
            wi.a(interfaceC0309ej);
        }
        b();
    }

    public final void b() {
        synchronized (this.e) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (((fs) this.b).c()) {
                return;
            }
            try {
                this.a.a(new bc61(0, this));
            } catch (Throwable th) {
                a(new C0252cj("Failed to request referrer", th));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.a.a();
    }

    public static final void a(Z3 z3, InterfaceC0309ej interfaceC0309ej) {
        synchronized (z3.e) {
            ((fs) z3.b).a(interfaceC0309ej);
        }
        z3.a(interfaceC0309ej);
    }

    public final void a(InterfaceC0309ej interfaceC0309ej) {
        List J0;
        synchronized (this.e) {
            J0 = kotlin.collections.a.J0(this.d);
            this.d.clear();
        }
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            ((Wi) it.next()).a(interfaceC0309ej);
        }
    }
}
