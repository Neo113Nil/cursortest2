package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495j implements ActiveNetworkTypeProvider {
    @Override // io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider
    public final NetworkType getNetworkType(Context context) {
        Ce ce = Ge.f4420a;
        return (NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe());
    }
}
