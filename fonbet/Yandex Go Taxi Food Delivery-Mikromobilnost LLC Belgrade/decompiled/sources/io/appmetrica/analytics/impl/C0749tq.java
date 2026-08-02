package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.tq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0749tq extends B3 {
    public C0749tq(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0461jr
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.a;
            if (length > i) {
                String substring = str.substring(0, i);
                this.c.warning("\"%s\" %s size exceeded limit of %d characters", this.b, str, Integer.valueOf(this.a));
                return substring;
            }
        }
        return str;
    }

    public final int b() {
        return this.a;
    }

    public C0749tq(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final String a() {
        return this.b;
    }
}
