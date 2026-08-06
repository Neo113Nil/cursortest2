package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662pa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6733a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6734b;

    public C0662pa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f6733a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f6733a.toString();
    }

    public C0662pa(boolean z2) {
        this.f6733a = new HashMap();
        this.f6734b = z2;
    }
}
