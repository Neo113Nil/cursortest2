package com.datadog.trace.api.sampling;

import org.slf4j.Marker;

/* loaded from: classes4.dex */
public interface SamplingRule {
    static String normalizeGlob(String str) {
        return (str == null || Marker.ANY_MARKER.equals(str)) ? Marker.ANY_MARKER : str;
    }
}
