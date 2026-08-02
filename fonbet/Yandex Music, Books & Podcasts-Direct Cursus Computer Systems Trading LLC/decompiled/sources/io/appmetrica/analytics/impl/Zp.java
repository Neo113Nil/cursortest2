package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes5.dex */
public final class Zp extends AbstractC0410kl {
    public Zp(@NonNull Context context, @NonNull String str) {
        super(context, str, PListParser.TAG_STRING);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0410kl
    public final Object a(int i) {
        return this.a.getString(i);
    }

    public final String b(int i) {
        return this.a.getString(i);
    }
}
