package io.appmetrica.analytics.coreutils.internal.toggle;

import R1.l;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* renamed from: c, reason: collision with root package name */
    private final String f3889c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3891e;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f3887a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f3888b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f3890d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(List<? extends Toggle> list, String str) {
        this.f3889c = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z2) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = ConjunctiveCompositeThreadSafeToggle.this;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z2, String.valueOf(q.a(toggle2.getClass()).b()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f3888b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.f3888b.values()));
            access$releaseLock(this);
        } catch (Throwable th) {
            access$releaseLock(this);
            throw th;
        }
    }

    private static boolean a(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean z2 = false;
        while (!z2) {
            try {
                z2 = conjunctiveCompositeThreadSafeToggle.f3890d.tryLock(100L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                l.h(th);
            }
            if (!z2) {
                try {
                    Thread.sleep(100L);
                } catch (Throwable th2) {
                    l.h(th2);
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f3890d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z2, String str) {
        conjunctiveCompositeThreadSafeToggle.f3888b.put(toggleObserver, Boolean.valueOf(z2));
        boolean a2 = a(conjunctiveCompositeThreadSafeToggle.f3888b.values());
        if (a2 != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(a2);
            Iterator it = conjunctiveCompositeThreadSafeToggle.f3887a.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(a2);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f3891e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(ToggleObserver toggleObserver, boolean z2) {
        try {
            access$acquireLock(this);
            this.f3887a.add(toggleObserver);
            if (z2) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f3887a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z2) {
        this.f3891e = z2;
    }

    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f3888b + ", tag='" + this.f3889c + "', actualState=" + getActualState() + ')';
    }
}
