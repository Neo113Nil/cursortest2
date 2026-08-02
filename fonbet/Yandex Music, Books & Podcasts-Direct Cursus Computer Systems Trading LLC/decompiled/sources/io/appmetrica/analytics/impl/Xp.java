package io.appmetrica.analytics.impl;

import android.content.Context;
import com.connectsdk.service.airplay.PListParser;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Xp extends AbstractC0410kl {
    public Xp(@NotNull Context context, @NotNull String str) {
        super(context, str, PListParser.TAG_ARRAY);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0410kl
    public final Object a(int i) {
        return this.a.getResources().getStringArray(i);
    }

    public final String[] b(int i) {
        return this.a.getResources().getStringArray(i);
    }
}
