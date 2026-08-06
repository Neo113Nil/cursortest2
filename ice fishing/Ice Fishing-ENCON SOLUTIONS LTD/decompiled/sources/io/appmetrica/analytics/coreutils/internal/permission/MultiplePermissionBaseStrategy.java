package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f3845a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3846b;

    public MultiplePermissionBaseStrategy(PermissionExtractor permissionExtractor, List<String> list) {
        this.f3845a = permissionExtractor;
        this.f3846b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f3846b.isEmpty() || hasNecessaryPermissions(context, this.f3845a, this.f3846b);
    }

    public abstract boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list);
}
