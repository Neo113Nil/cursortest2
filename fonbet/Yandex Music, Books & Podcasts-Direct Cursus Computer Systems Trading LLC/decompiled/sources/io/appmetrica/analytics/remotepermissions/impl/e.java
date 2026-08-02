package io.appmetrica.analytics.remotepermissions.impl;

import defpackage.q5b;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e implements PermissionStrategy {
    public Set a = q5b.a;

    public final synchronized void a(@NotNull Set<String> set) {
        this.a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.a.contains(str);
    }
}
