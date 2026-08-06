package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f3895a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3896b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f3897c;

    public SimpleThreadSafeToggle(boolean z2, String str) {
        this.f3895a = str;
        this.f3896b = z2;
        this.f3897c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f3896b;
    }

    public final String getTag() {
        return this.f3895a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z2) {
        this.f3897c.add(toggleObserver);
        if (z2) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f3897c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z2) {
        if (z2 != getActualState()) {
            this.f3896b = z2;
            Iterator it = this.f3897c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z2);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z2, String str, int i2, e eVar) {
        this((i2 & 1) != 0 ? false : z2, str);
    }
}
