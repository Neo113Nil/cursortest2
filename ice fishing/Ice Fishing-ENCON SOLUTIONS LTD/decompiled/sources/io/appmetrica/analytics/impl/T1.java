package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f5083a;

    /* renamed from: b, reason: collision with root package name */
    public final C0861x2 f5084b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5085c;

    public T1(List list, C0861x2 c0861x2, List list2) {
        this.f5083a = list;
        this.f5084b = c0861x2;
        this.f5085c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f5083a + ", mBackgroundRestrictionsState=" + this.f5084b + ", mAvailableProviders=" + this.f5085c + '}';
    }
}
