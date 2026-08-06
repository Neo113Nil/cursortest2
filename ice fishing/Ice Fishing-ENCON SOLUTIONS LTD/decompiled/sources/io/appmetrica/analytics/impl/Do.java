package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Do extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f4330a;

    public Do() {
        super(false, "[WakelocksToggle]");
        this.f4330a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f4330a.put(obj, null);
        if (this.f4330a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f4330a.remove(obj);
        if (this.f4330a.isEmpty()) {
            updateState(false);
        }
    }
}
