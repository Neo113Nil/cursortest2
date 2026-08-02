package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public abstract class B3 implements Qq {
    public final int a;
    public final String b;

    @NonNull
    protected final PublicLogger c;

    public B3(int i, String str, PublicLogger publicLogger) {
        this.a = i;
        this.b = str;
        this.c = publicLogger;
    }
}
