package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0752wg implements Cr {
    public final String a;

    public C0752wg(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(String str) {
        return TextUtils.isEmpty(str) ? new Ar(this, false, AbstractC0155bp.a(new StringBuilder(), this.a, " is empty.")) : new Ar(this, true, "");
    }
}
