package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Sb implements Pb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5050a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f5051b = C0610na.k().w().b();

    /* renamed from: c, reason: collision with root package name */
    public Kn f5052c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5053d;

    public final void a(Toggle toggle) {
        Kn kn = new Kn(toggle);
        this.f5052c = kn;
        kn.f4650c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Kn kn = this.f5052c;
        if (kn != null) {
            kn.f4649b.b(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z2) {
        this.f5051b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Po
            @Override // java.lang.Runnable
            public final void run() {
                Sb.a(Sb.this, z2);
            }
        });
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z2) {
        this.f5051b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // java.lang.Runnable
            public final void run() {
                Sb.a(Sb.this, locationControllerObserver, z2);
            }
        });
    }

    public static final void a(Sb sb, LocationControllerObserver locationControllerObserver, boolean z2) {
        sb.f5050a.add(locationControllerObserver);
        if (z2) {
            if (sb.f5053d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Sb sb, boolean z2) {
        if (sb.f5053d != z2) {
            sb.f5053d = z2;
            t1.l lVar = z2 ? Qb.f4952a : Rb.f4994a;
            Iterator it = sb.f5050a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Kn kn = this.f5052c;
        if (kn != null) {
            kn.f4649b.a(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z2) {
        Kn kn = this.f5052c;
        if (kn != null) {
            kn.f4648a.a(z2);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }
}
