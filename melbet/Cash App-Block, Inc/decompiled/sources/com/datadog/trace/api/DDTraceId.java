package com.datadog.trace.api;

/* loaded from: classes4.dex */
public abstract class DDTraceId {
    public static final DD64bTraceId ZERO = DD64bTraceId.create(0, null);

    public abstract String toHexString();

    public abstract String toHexStringPadded();

    public abstract long toHighOrderLong();

    public abstract long toLong();

    public abstract String toString();
}
