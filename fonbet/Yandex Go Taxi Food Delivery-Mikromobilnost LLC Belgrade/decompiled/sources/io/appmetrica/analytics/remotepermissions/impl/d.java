package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class d implements PermissionStrategy {
    public Set a = EmptySet.a;

    public final synchronized void a(Set<String> set) {
        this.a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.a.contains(str);
    }
}
