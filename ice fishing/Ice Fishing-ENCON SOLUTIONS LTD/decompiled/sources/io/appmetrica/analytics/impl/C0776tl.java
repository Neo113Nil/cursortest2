package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776tl implements PermissionExtractor {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6953b = "[SimplePermissionExtractor]";

    /* renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f6954a;

    public C0776tl(PermissionStrategy permissionStrategy) {
        this.f6954a = permissionStrategy;
    }

    public final PermissionStrategy a() {
        return this.f6954a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f6954a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
