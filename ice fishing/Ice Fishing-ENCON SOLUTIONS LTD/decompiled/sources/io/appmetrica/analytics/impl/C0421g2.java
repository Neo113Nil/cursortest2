package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421g2 implements InterfaceC0568lk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6046a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6047b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f6048c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f6049d = new CopyOnWriteArraySet();

    public final void a(int i2) {
        this.f6046a.remove(Integer.valueOf(i2));
        a();
    }

    public final void b(int i2) {
        this.f6047b.add(Integer.valueOf(i2));
        this.f6046a.remove(Integer.valueOf(i2));
        a();
    }

    public final void c(int i2) {
        this.f6046a.add(Integer.valueOf(i2));
        this.f6047b.remove(Integer.valueOf(i2));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f6048c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onDestroy() {
        if (this.f6048c == ApplicationState.VISIBLE) {
            this.f6048c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f6049d.add(applicationStateObserver);
        }
        return this.f6048c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f6046a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f6047b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f6048c != applicationState) {
            this.f6048c = applicationState;
            Iterator it = this.f6049d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f6048c);
            }
        }
    }
}
