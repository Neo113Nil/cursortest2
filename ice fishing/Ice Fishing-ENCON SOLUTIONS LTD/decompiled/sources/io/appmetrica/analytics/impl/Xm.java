package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Xm extends M2 {
    public Xm(int i2, String str) {
        this(i2, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f4726a;
    }

    public Xm(int i2, String str, PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i2 = this.f4726a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                this.f4728c.warning("\"%s\" %s size exceeded limit of %d characters", this.f4727b, str, Integer.valueOf(this.f4726a));
                return substring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f4727b;
    }
}
