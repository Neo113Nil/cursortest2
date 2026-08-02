package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0769x4 {
    public final Xh a;
    public final CounterConfiguration b;

    public C0769x4(Xh xh, CounterConfiguration counterConfiguration) {
        this.a = xh;
        this.b = counterConfiguration;
    }

    public static C0769x4 a(@NonNull Context context, @NonNull Bundle bundle) {
        Xh xh;
        CounterConfiguration fromBundle;
        String str = Xh.c;
        if (bundle != null) {
            try {
                xh = (Xh) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && xh != null && context.getPackageName().equals(xh.a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && xh.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new C0769x4(xh, fromBundle);
            }
            return null;
        }
        xh = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.a + ", mCounterConfiguration=" + this.b + '}';
    }

    @NonNull
    public final Xh a() {
        return this.a;
    }
}
