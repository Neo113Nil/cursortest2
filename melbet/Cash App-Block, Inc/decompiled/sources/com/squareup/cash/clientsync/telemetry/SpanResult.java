package com.squareup.cash.clientsync.telemetry;

/* loaded from: classes8.dex */
public enum SpanResult {
    Canceled("canceled"),
    PersistenceFailure("persistence_fail"),
    RequestFailure("request_fail"),
    Skipped("skipped"),
    Success("success");

    public final String value;

    SpanResult(String str) {
        this.value = str;
    }
}
