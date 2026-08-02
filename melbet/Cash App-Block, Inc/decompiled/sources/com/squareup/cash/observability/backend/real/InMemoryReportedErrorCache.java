package com.squareup.cash.observability.backend.real;

import com.squareup.cash.observability.types.ReportedError;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class InMemoryReportedErrorCache {
    public final LinkedHashSet reportedErrorSamplingKeys = new LinkedHashSet();

    public final boolean addIfNotExists(ReportedError reportedError) {
        boolean z;
        reportedError.getClass();
        synchronized (this.reportedErrorSamplingKeys) {
            if (this.reportedErrorSamplingKeys.contains(reportedError.getSamplingKey())) {
                z = false;
            } else {
                this.reportedErrorSamplingKeys.add(reportedError.getSamplingKey());
                z = true;
            }
        }
        return z;
    }
}
