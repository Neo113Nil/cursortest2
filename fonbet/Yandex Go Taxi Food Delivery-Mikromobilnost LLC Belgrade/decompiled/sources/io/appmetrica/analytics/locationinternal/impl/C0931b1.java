package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0931b1 implements ChargeTypeChangeListener, ApplicationStateObserver {
    public static final C0927a1 f = new C0927a1();
    public final ChargeTypeProvider a;
    public final ApplicationStateProvider b;
    public List c;
    public C0933c d;
    public final LinkedHashSet e = new LinkedHashSet();

    public C0931b1(ChargeTypeProvider chargeTypeProvider, ApplicationStateProvider applicationStateProvider, LocationConfig locationConfig) {
        this.a = chargeTypeProvider;
        this.b = applicationStateProvider;
        this.c = new ArrayList();
        if (locationConfig != null) {
            synchronized (this) {
                this.c = locationConfig.getConditionalArgumentsList$location_yandex_release();
            }
        }
    }

    public final synchronized void a(J0 j0) {
        this.e.add(j0);
        C0933c c0933c = this.d;
        if (c0933c != null) {
            j0.a(c0933c);
        }
    }

    public final void b() {
        C0933c c0933c;
        ApplicationState currentState = this.b.getCurrentState();
        ChargeType chargeType = this.a.getChargeType();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0933c = null;
                break;
            }
            X x = (X) it.next();
            if (x.a.a.contains(chargeType) && x.a.b.contains(currentState)) {
                c0933c = x.b;
                break;
            }
        }
        if (c0933c == null) {
            c0933c = AbstractC0930b0.a;
        }
        if (jl40.l(this.d, c0933c)) {
            return;
        }
        this.d = c0933c;
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((J0) it2.next()).a(c0933c);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(ApplicationState applicationState) {
        b();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener
    public final synchronized void onChargeTypeChanged(ChargeType chargeType) {
        b();
    }

    public final synchronized void a() {
        this.a.registerChargeTypeListener(this);
        this.b.registerStickyObserver(this);
    }

    public final synchronized void a(LocationConfig locationConfig) {
        this.c = locationConfig.getConditionalArgumentsList$location_yandex_release();
        b();
    }
}
