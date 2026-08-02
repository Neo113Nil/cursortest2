package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class L3 extends AbstractC0410kl {
    public L3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0410kl
    public final Object a(int i) {
        return Boolean.valueOf(this.a.getResources().getBoolean(i));
    }

    public final Boolean b(int i) {
        return Boolean.valueOf(this.a.getResources().getBoolean(i));
    }
}
