package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class W2 extends Ci {
    public W2(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Ci
    public final Object a(int i2) {
        return Boolean.valueOf(this.f4267a.getResources().getBoolean(i2));
    }

    public final Boolean b(int i2) {
        return Boolean.valueOf(this.f4267a.getResources().getBoolean(i2));
    }
}
