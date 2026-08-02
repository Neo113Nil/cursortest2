package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0757wl {
    public final Revenue a;
    public final Yp b;
    public final C0329hq c;
    public final C0329hq d;
    public final PublicLogger e;

    public C0757wl(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new Yp(30720, "revenue payload", publicLogger);
        this.c = new C0329hq(new Yp(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new C0329hq(new C0156bq(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
