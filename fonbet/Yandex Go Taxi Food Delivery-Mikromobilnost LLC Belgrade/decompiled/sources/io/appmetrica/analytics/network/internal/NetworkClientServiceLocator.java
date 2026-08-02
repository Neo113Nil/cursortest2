package io.appmetrica.analytics.network.internal;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes9.dex */
public class NetworkClientServiceLocator {
    private static volatile NetworkClientServiceLocator b;
    private final Bundle a;

    public NetworkClientServiceLocator(Bundle bundle) {
        this.a = bundle;
    }

    public static NetworkClientServiceLocator getInstance() {
        return b;
    }

    public static void init(Context context, SafePackageManager safePackageManager) {
        if (b == null) {
            synchronized (NetworkClientServiceLocator.class) {
                try {
                    if (b == null) {
                        b = new NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Bundle getApplicationMetaData() {
        return this.a;
    }

    public static void init(Context context) {
        init(context, new SafePackageManager());
    }
}
