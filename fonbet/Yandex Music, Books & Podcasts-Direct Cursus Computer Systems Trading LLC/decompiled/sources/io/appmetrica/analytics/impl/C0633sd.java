package io.appmetrica.analytics.impl;

import defpackage.dy1;
import defpackage.o37;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0633sd implements InterfaceC0547pd, ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = C0747wb.k().w().d();
    public Pq c;
    public boolean d;

    public static final void a(C0633sd c0633sd, boolean z) {
        if (c0633sd.d != z) {
            c0633sd.d = z;
            Function1 function1 = z ? C0576qd.a : C0604rd.a;
            Iterator it = c0633sd.a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void b(@NotNull Object obj) {
        Pq pq = this.c;
        if (pq != null) {
            pq.b.b(obj);
        } else {
            Intrinsics.j("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.b.execute(new dy1(this, z, 7));
    }

    public final void a(@NotNull LocationControllerObserver locationControllerObserver, boolean z) {
        this.b.execute(new o37(this, locationControllerObserver, z, 2));
    }

    public static final void a(C0633sd c0633sd, LocationControllerObserver locationControllerObserver, boolean z) {
        c0633sd.a.add(locationControllerObserver);
        if (z) {
            if (c0633sd.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public final void a(Toggle toggle) {
        Pq pq = new Pq(toggle);
        this.c = pq;
        pq.c.registerObserver(this, true);
    }

    public final void a(@NotNull Object obj) {
        Pq pq = this.c;
        if (pq != null) {
            pq.b.a(obj);
        } else {
            Intrinsics.j("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z) {
        Pq pq = this.c;
        if (pq != null) {
            pq.a.a(z);
        } else {
            Intrinsics.j("togglesHolder");
            throw null;
        }
    }
}
