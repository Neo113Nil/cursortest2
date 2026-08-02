package com.datadog.trace.bootstrap.instrumentation.api;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SpanLinkAttributes {
    public static final SpanLinkAttributes EMPTY;

    static {
        Map map = Collections.EMPTY_MAP;
        EMPTY = new SpanLinkAttributes();
    }

    public final String toString() {
        return "SpanLinkAttributes{" + Collections.EMPTY_MAP + '}';
    }
}
