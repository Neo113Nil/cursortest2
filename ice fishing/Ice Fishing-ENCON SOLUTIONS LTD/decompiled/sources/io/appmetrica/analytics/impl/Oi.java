package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Oi {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f4868a;

    /* renamed from: b, reason: collision with root package name */
    public final Um f4869b;

    /* renamed from: c, reason: collision with root package name */
    public final C0365dn f4870c;

    /* renamed from: d, reason: collision with root package name */
    public final C0365dn f4871d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f4872e;

    public Oi(Revenue revenue, PublicLogger publicLogger) {
        this.f4872e = publicLogger;
        this.f4868a = revenue;
        this.f4869b = new Um(30720, "revenue payload", publicLogger);
        this.f4870c = new C0365dn(new Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f4871d = new C0365dn(new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
