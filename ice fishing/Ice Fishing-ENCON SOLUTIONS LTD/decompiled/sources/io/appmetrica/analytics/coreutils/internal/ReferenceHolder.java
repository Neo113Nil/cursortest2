package io.appmetrica.analytics.coreutils.internal;

import i1.AbstractC0252i;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f3822a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return AbstractC0252i.V(this.f3822a);
    }

    public final void removeReference(Object obj) {
        this.f3822a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f3822a.add(obj);
    }
}
