package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes9.dex */
public final class Cdo {
    public final C0401ho a;
    public final Map b;

    public Cdo(Context context, K5 k5) {
        k5.a();
        C0401ho c0401ho = new C0401ho(context, k5);
        this.a = c0401ho;
        this.b = new LinkedHashMap(c0401ho.a());
    }
}
