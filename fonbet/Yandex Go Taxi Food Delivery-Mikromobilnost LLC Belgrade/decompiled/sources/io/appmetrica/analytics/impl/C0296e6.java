package io.appmetrica.analytics.impl;

import defpackage.b64;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0296e6 implements PermissionStrategy {
    public final PermissionStrategy[] a;

    public C0296e6(PermissionStrategy... permissionStrategyArr) {
        this.a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return b64.p(new StringBuilder("CompositePermissionStrategy(strategies="), Arrays.toString(this.a), ')');
    }
}
