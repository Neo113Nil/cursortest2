package io.appmetrica.analytics.locationinternal.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0854b1 implements ChargeTypeChangeListener, ApplicationStateObserver {
    public List a;
    public final ChargeTypeProvider b;
    public final ApplicationStateProvider c;
    public C0856c d;
    public final HashSet e = new HashSet();

    public C0854b1(@NonNull ChargeTypeProvider chargeTypeProvider, @NonNull ApplicationStateProvider applicationStateProvider, M0 m0) {
        this.a = new ArrayList();
        this.b = chargeTypeProvider;
        this.c = applicationStateProvider;
        if (m0 != null) {
            synchronized (this) {
                this.a = m0.a();
            }
        }
    }

    public final synchronized void a(@NonNull J0 j0) {
        this.e.add(j0);
        C0856c c0856c = this.d;
        if (c0856c != null) {
            j0.a(c0856c);
        }
    }

    public final void b() {
        C0856c c0856c;
        ApplicationState currentState = this.c.getCurrentState();
        ChargeType chargeType = this.b.getChargeType();
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0856c = null;
                break;
            }
            X x = (X) it.next();
            if (x.a.a.contains(chargeType) && x.a.b.contains(currentState)) {
                c0856c = x.b;
                break;
            }
        }
        if (c0856c == null) {
            c0856c = AbstractC0853b0.a;
        }
        C0856c c0856c2 = this.d;
        if (c0856c2 == null && c0856c == null) {
            return;
        }
        if (c0856c2 == null || c0856c == null || !c0856c2.equals(c0856c)) {
            this.d = c0856c;
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                ((J0) it2.next()).a(c0856c);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(@NonNull ApplicationState applicationState) {
        b();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener
    public final synchronized void onChargeTypeChanged(@NonNull ChargeType chargeType) {
        b();
    }

    public final synchronized void a() {
        this.b.registerChargeTypeListener(this);
        this.c.registerStickyObserver(this);
    }

    public final synchronized void a(@NonNull M0 m0) {
        this.a = m0.a;
        b();
    }
}
