package ru.yandex.taxi.net.tracker.analytics;

import defpackage.jst;
import java.util.Arrays;
import java.util.Objects;
import ru.yandex.taxi.net.tracker.analytics.TaxiRouteError;

/* loaded from: classes6.dex */
public final class a {
    public TaxiRouteError a;

    public final synchronized void a(TaxiRouteError taxiRouteError) {
        try {
            TaxiRouteError taxiRouteError2 = this.a;
            if (taxiRouteError2 == null || !taxiRouteError2.getClass().equals(taxiRouteError.getClass()) || !Objects.equals(taxiRouteError2.getMessage(), taxiRouteError.getMessage()) || !Arrays.equals(taxiRouteError2.getStackTrace(), taxiRouteError.getStackTrace())) {
                if (taxiRouteError instanceof TaxiRouteError.AnotherError) {
                    jst.e.k((TaxiRouteError.AnotherError) taxiRouteError, "3.0/taxiroute");
                } else {
                    jst.e.p("Request 3.0/taxiroute error: " + taxiRouteError.getMessage(), taxiRouteError);
                }
                this.a = taxiRouteError;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
