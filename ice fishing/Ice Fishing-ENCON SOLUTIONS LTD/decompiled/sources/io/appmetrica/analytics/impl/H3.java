package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes.dex */
public class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f4458a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f4459b;

    public H3(Bf bf, CounterConfiguration counterConfiguration) {
        this.f4458a = bf;
        this.f4459b = counterConfiguration;
    }

    public static H3 a(Context context, Bundle bundle) {
        Bf bf;
        CounterConfiguration fromBundle;
        String str = Bf.f4213c;
        if (bundle != null) {
            try {
                bf = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && bf != null && context.getPackageName().equals(bf.f4214a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && bf.f4214a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new H3(bf, fromBundle);
            }
            return null;
        }
        bf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    public final CounterConfiguration b() {
        return this.f4459b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f4458a + ", mCounterConfiguration=" + this.f4459b + '}';
    }

    public final Bf a() {
        return this.f4458a;
    }
}
