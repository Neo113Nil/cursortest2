package com.fidesmo.sec.local.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/local/models/ImplicitDeviceCinBatch;", "", "cin", "", "batchId", "", "batchingUrl", "(Ljava/lang/String;ILjava/lang/String;)V", "getBatchId", "()I", "getBatchingUrl", "()Ljava/lang/String;", "getCin", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImplicitDeviceCinBatch {
    private final int batchId;
    private final String batchingUrl;
    private final String cin;

    public /* synthetic */ ImplicitDeviceCinBatch(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }

    public final int getBatchId() {
        return this.batchId;
    }

    public final String getBatchingUrl() {
        return this.batchingUrl;
    }

    public final String getCin() {
        return this.cin;
    }

    public ImplicitDeviceCinBatch(String str, int i, String str2) {
        this.cin = str;
        this.batchId = i;
        this.batchingUrl = str2;
    }
}
