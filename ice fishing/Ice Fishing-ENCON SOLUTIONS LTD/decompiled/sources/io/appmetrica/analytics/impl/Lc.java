package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Lc implements InterfaceC0726rn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4698a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f4699b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f4700c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f4701d;

    public Lc(Context context) {
        this.f4698a = context;
        this.f4699b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0610na.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f4700c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f4701d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726rn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Kc a() {
        Kc kc;
        try {
            kc = (Kc) this.f4701d.getData();
            if (kc != null) {
                if (this.f4701d.shouldUpdateData()) {
                }
            }
            kc = new Kc(this.f4699b.hasNecessaryPermissions(this.f4698a) ? this.f4700c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f4701d.setData(kc);
        } catch (Throwable th) {
            throw th;
        }
        return kc;
    }
}
