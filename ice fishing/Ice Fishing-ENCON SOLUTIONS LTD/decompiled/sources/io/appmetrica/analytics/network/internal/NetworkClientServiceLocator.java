package io.appmetrica.analytics.network.internal;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public class NetworkClientServiceLocator {

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkClientServiceLocator f7415b;

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f7416a;

    public NetworkClientServiceLocator(Bundle bundle) {
        this.f7416a = bundle;
    }

    public static NetworkClientServiceLocator getInstance() {
        return f7415b;
    }

    public static void init(Context context) {
        init(context, new SafePackageManager());
    }

    public Bundle getApplicationMetaData() {
        return this.f7416a;
    }

    public static void init(Context context, SafePackageManager safePackageManager) {
        if (f7415b == null) {
            synchronized (NetworkClientServiceLocator.class) {
                try {
                    if (f7415b == null) {
                        f7415b = new NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } finally {
                }
            }
        }
    }
}
