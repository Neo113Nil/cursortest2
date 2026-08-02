package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0605re implements InterfaceC0762wq {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public C0605re(@NotNull Context context) {
        this.a = context;
        this.b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0747wb.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.c = new CellularNetworkTypeExtractor(context);
        this.d = new CachedDataProvider.CachedData(20000L, 2 * 20000, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0762wq
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C0577qe a() {
        C0577qe c0577qe;
        try {
            c0577qe = (C0577qe) this.d.getData();
            if (c0577qe != null) {
                if (this.d.shouldUpdateData()) {
                }
            }
            c0577qe = new C0577qe(this.b.hasNecessaryPermissions(this.a) ? this.c.getNetworkType() : "unknown");
            this.d.setData(c0577qe);
        } catch (Throwable th) {
            throw th;
        }
        return c0577qe;
    }
}
