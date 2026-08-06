package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Tm extends Ci {
    public Tm(Context context, String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Ci
    public final Object a(int i2) {
        return this.f4267a.getResources().getStringArray(i2);
    }

    public final String[] b(int i2) {
        return this.f4267a.getResources().getStringArray(i2);
    }
}
