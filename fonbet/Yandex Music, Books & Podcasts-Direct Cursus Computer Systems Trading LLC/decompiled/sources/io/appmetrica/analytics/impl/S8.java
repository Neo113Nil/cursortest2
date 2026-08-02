package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import defpackage.gtm;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class S8 implements InterfaceC0153bn {

    @NotNull
    public static final R8 c = new R8();
    public static final int d = 3;
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();

    public S8(@NotNull Context context) {
        this.a = context;
    }

    public static final void a(S8 s8, Bundle bundle, H6 h6) {
        J8 j8;
        synchronized (s8) {
            try {
                C0769x4 a = C0769x4.a(s8.a, bundle);
                if (a == null) {
                    j8 = null;
                } else {
                    F4 a2 = F4.a(a);
                    Od od = new Od(a2.b, a2.a);
                    new C0212dp(a);
                    C0250f5 c0250f5 = new C0250f5(a.b, Fc.d(a.a.a.getAsString("PROCESS_CFG_CLIDS")));
                    a.a.getClass();
                    LinkedHashMap linkedHashMap = s8.b;
                    String apiKey = a.b.getApiKey();
                    Object obj = linkedHashMap.get(apiKey);
                    Object obj2 = obj;
                    if (obj == null) {
                        Ko ko = Jo.a;
                        Ep a3 = ko.a(s8.a, od, new C0212dp(a));
                        J8 j82 = new J8(s8.a, od, c0250f5, a3.e(), new C0350ij(a3), CounterConfigurationReporterType.MAIN);
                        ko.a(od, j82);
                        linkedHashMap.put(apiKey, j82);
                        obj2 = j82;
                    }
                    J8 j83 = (J8) obj2;
                    j83.d.a(c0250f5);
                    j8 = j83;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j8 != null) {
            j8.c.a(h6);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0153bn
    public final void reportData(int i, @NotNull Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C0747wb.I.d.f().execute(new gtm(2, this, bundle, H6.b(bundle)));
    }
}
