package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes4.dex */
public final class Hl {
    public final Revenue a;
    public final C0663qq b;
    public final C0894yq c;
    public final C0894yq d;
    public final PublicLogger e;

    public Hl(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new C0663qq(30720, "revenue payload", publicLogger);
        this.c = new C0894yq(new C0663qq(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new C0894yq(new C0749tq(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
