package io.appmetrica.analytics.impl;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* loaded from: classes9.dex */
public final class Ge implements Nq {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final CellularNetworkTypeExtractor c;
    public final CachedDataProvider.CachedData d;

    public Ge(Context context) {
        this.a = context;
        this.b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Jb.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.c = new CellularNetworkTypeExtractor(context);
        this.d = new CachedDataProvider.CachedData(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, 40000L, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.Nq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Fe a() {
        Fe fe;
        try {
            fe = (Fe) this.d.getData();
            if (fe != null) {
                if (this.d.shouldUpdateData()) {
                }
            }
            fe = new Fe(this.b.hasNecessaryPermissions(this.a) ? this.c.getNetworkType() : "unknown");
            this.d.setData(fe);
        } catch (Throwable th) {
            throw th;
        }
        return fe;
    }
}
