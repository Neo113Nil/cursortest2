package com.fidesmo.sec.delivery.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/fidesmo/sec/delivery/models/RetryConfig;", "", "retryDelay", "", "maxRetries", "maxRetryInterval", "httpErrorCodes", "Ljava/util/ArrayList;", "(IIILjava/util/ArrayList;)V", "getHttpErrorCodes", "()Ljava/util/ArrayList;", "getMaxRetries", "()I", "getMaxRetryInterval", "getRetryDelay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RetryConfig {
    private static final int DEFAULT_DELAY = 0;
    private static final int DEFAULT_MAX_INTERVAL = 32;
    private static final int DEFAULT_MAX_RETRIES = 5;
    private final ArrayList<Integer> httpErrorCodes;
    private final int maxRetries;
    private final int maxRetryInterval;
    private final int retryDelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ArrayList<Integer> DEFAULT_ERROR_CODES = new ArrayList<>(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{408, Integer.valueOf(HttpStatusCode.CONFLICT_409), Integer.valueOf(HttpStatusCode.TOO_MANY_REQUESTS_429), 499, 500, Integer.valueOf(HttpStatusCode.BAD_GATEWAY_502), 503, 504}));

    public RetryConfig(int i, int i2, int i3, ArrayList<Integer> arrayList) {
        arrayList.getClass();
        this.retryDelay = i;
        this.maxRetries = i2;
        this.maxRetryInterval = i3;
        this.httpErrorCodes = arrayList;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("retryDelay must be a non-negative integer");
            throw null;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("maxRetries must be a non-negative integer");
            throw null;
        }
        if (i3 > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("maxRetryInterval must be a positive integer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetryConfig copy$default(RetryConfig retryConfig, int i, int i2, int i3, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = retryConfig.retryDelay;
        }
        if ((i4 & 2) != 0) {
            i2 = retryConfig.maxRetries;
        }
        if ((i4 & 4) != 0) {
            i3 = retryConfig.maxRetryInterval;
        }
        if ((i4 & 8) != 0) {
            arrayList = retryConfig.httpErrorCodes;
        }
        return retryConfig.copy(i, i2, i3, arrayList);
    }

    public static final RetryConfig defaultConfig() {
        return INSTANCE.defaultConfig();
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetryDelay() {
        return this.retryDelay;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxRetryInterval() {
        return this.maxRetryInterval;
    }

    public final ArrayList<Integer> component4() {
        return this.httpErrorCodes;
    }

    public final RetryConfig copy(int retryDelay, int maxRetries, int maxRetryInterval, ArrayList<Integer> httpErrorCodes) {
        httpErrorCodes.getClass();
        return new RetryConfig(retryDelay, maxRetries, maxRetryInterval, httpErrorCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryConfig)) {
            return false;
        }
        RetryConfig retryConfig = (RetryConfig) other;
        return this.retryDelay == retryConfig.retryDelay && this.maxRetries == retryConfig.maxRetries && this.maxRetryInterval == retryConfig.maxRetryInterval && Intrinsics.areEqual(this.httpErrorCodes, retryConfig.httpErrorCodes);
    }

    public final ArrayList<Integer> getHttpErrorCodes() {
        return this.httpErrorCodes;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getMaxRetryInterval() {
        return this.maxRetryInterval;
    }

    public final int getRetryDelay() {
        return this.retryDelay;
    }

    public int hashCode() {
        return this.httpErrorCodes.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxRetryInterval, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxRetries, Integer.hashCode(this.retryDelay) * 31, 31), 31);
    }

    public String toString() {
        return "RetryConfig(retryDelay=" + this.retryDelay + ", maxRetries=" + this.maxRetries + ", maxRetryInterval=" + this.maxRetryInterval + ", httpErrorCodes=" + this.httpErrorCodes + ')';
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/fidesmo/sec/delivery/models/RetryConfig$Companion;", "", "()V", "DEFAULT_DELAY", "", "DEFAULT_ERROR_CODES", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "DEFAULT_MAX_INTERVAL", "DEFAULT_MAX_RETRIES", "defaultConfig", "Lcom/fidesmo/sec/delivery/models/RetryConfig;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RetryConfig defaultConfig() {
            return new RetryConfig(0, 5, 32, RetryConfig.DEFAULT_ERROR_CODES);
        }

        private Companion() {
        }
    }

    public RetryConfig() {
        this(0, 0, 0, null, 15, null);
    }

    public /* synthetic */ RetryConfig(int i, int i2, int i3, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 5 : i2, (i4 & 4) != 0 ? 32 : i3, (i4 & 8) != 0 ? DEFAULT_ERROR_CODES : arrayList);
    }
}
