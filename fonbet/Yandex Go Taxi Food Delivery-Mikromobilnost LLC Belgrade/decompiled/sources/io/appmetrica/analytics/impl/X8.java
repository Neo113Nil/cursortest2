package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import defpackage.r94;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class X8 implements InterfaceC0746tn {
    public static final W8 c = new W8();
    public static final int d = 3;
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();

    public X8(Context context) {
        this.a = context;
    }

    public static final void a(X8 x8, Bundle bundle, K6 k6) {
        O8 o8;
        synchronized (x8) {
            try {
                B4 a = B4.a(x8.a, bundle);
                if (a == null) {
                    o8 = null;
                } else {
                    J4 a2 = J4.a(a);
                    C0304ee c0304ee = new C0304ee(a2.b, a2.a);
                    new C0806vp(a);
                    C0439j5 c0439j5 = new C0439j5(a.b, Vc.d(a.a.a.getAsString("PROCESS_CFG_CLIDS")));
                    a.a.getClass();
                    LinkedHashMap linkedHashMap = x8.b;
                    String apiKey = a.b.getApiKey();
                    Object obj = linkedHashMap.get(apiKey);
                    Object obj2 = obj;
                    if (obj == null) {
                        C0258cp c0258cp = AbstractC0229bp.a;
                        Wp a3 = c0258cp.a(x8.a, c0304ee, new C0806vp(a));
                        O8 o82 = new O8(x8.a, c0304ee, c0439j5, a3.e(), new C0598oj(a3), CounterConfigurationReporterType.MAIN);
                        c0258cp.a(c0304ee, o82);
                        linkedHashMap.put(apiKey, o82);
                        obj2 = o82;
                    }
                    O8 o83 = (O8) obj2;
                    o83.d.a(c0439j5);
                    o8 = o83;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o8 != null) {
            o8.c.a(k6);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0746tn
    public final void reportData(int i, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        Jb.I.d.g().execute(new r94(12, this, bundle, K6.b(bundle)));
    }
}
