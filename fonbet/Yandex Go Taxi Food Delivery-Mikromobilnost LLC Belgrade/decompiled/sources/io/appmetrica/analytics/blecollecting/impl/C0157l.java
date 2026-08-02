package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0157l {
    public final Context a;
    public final PermissionExtractor b;
    public final Provider c;

    public C0157l(Context context, PermissionExtractor permissionExtractor) {
        this.a = context;
        this.b = permissionExtractor;
        this.c = AndroidUtils.isApiAchieved(31) ? new C0154i() : AndroidUtils.isApiAchieved(29) ? new C0156k() : new C0155j();
    }
}
