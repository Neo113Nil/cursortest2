package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0153h implements PermissionExtractor {
    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
