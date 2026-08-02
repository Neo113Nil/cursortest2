package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0462k implements ActiveNetworkTypeProvider {
    @Override // io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider
    public final NetworkType getNetworkType(Context context) {
        C0625ph c0625ph = AbstractC0740th.a;
        return (NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new C0711sh());
    }
}
