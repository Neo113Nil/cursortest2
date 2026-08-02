package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes9.dex */
public class B4 {
    public final C0597oi a;
    public final CounterConfiguration b;

    public B4(C0597oi c0597oi, CounterConfiguration counterConfiguration) {
        this.a = c0597oi;
        this.b = counterConfiguration;
    }

    public static B4 a(Context context, Bundle bundle) {
        C0597oi c0597oi;
        CounterConfiguration fromBundle;
        String str = C0597oi.c;
        if (bundle != null) {
            try {
                c0597oi = (C0597oi) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && c0597oi != null && context.getPackageName().equals(c0597oi.a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && c0597oi.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new B4(c0597oi, fromBundle);
            }
            return null;
        }
        c0597oi = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.a + ", mCounterConfiguration=" + this.b + '}';
    }

    public final C0597oi a() {
        return this.a;
    }
}
