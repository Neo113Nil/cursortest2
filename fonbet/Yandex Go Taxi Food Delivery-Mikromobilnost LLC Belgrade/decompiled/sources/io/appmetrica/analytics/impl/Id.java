package io.appmetrica.analytics.impl;

import defpackage.c40;
import defpackage.t5v;
import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class Id implements Fd, ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = Jb.k().w().d();
    public C0432ir c;
    public boolean d;

    public static final void a(Id id, boolean z) {
        if (id.d != z) {
            id.d = z;
            tls tlsVar = z ? Gd.a : Hd.a;
            Iterator it = id.a.iterator();
            while (it.hasNext()) {
                tlsVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void b(Object obj) {
        C0432ir c0432ir = this.c;
        if (c0432ir == null) {
            c0432ir = null;
        }
        c0432ir.b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.b.execute(new c40(this, z, 1));
    }

    public final void a(LocationControllerObserver locationControllerObserver, boolean z) {
        this.b.execute(new t5v(this, locationControllerObserver, z));
    }

    public static final void a(Id id, LocationControllerObserver locationControllerObserver, boolean z) {
        id.a.add(locationControllerObserver);
        if (z) {
            if (id.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public final void a(Toggle toggle) {
        C0432ir c0432ir = new C0432ir(toggle);
        this.c = c0432ir;
        c0432ir.c.registerObserver(this, true);
    }

    public final void a(Object obj) {
        C0432ir c0432ir = this.c;
        if (c0432ir == null) {
            c0432ir = null;
        }
        c0432ir.b.a(obj);
    }

    public final void a(boolean z) {
        C0432ir c0432ir = this.c;
        if (c0432ir == null) {
            c0432ir = null;
        }
        c0432ir.a.a(z);
    }
}
