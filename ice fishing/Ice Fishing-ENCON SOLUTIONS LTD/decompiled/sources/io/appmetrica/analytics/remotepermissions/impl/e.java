package io.appmetrica.analytics.remotepermissions.impl;

import i1.t;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public Set f7569a = t.f3418a;

    public final synchronized void a(Set<String> set) {
        this.f7569a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f7569a.contains(str);
    }
}
