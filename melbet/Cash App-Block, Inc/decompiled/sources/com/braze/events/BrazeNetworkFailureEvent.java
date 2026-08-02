package com.braze.events;

import bo.app.d9;
import bo.app.i2;
import bo.app.n9;
import bo.app.y3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\nR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent;", "", "Lbo/app/d9;", "brazeRequest", "Lbo/app/n9;", "httpConnectorResult", "<init>", "(Lbo/app/d9;Lbo/app/n9;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbo/app/d9;", "Lbo/app/n9;", "responseCode", "I", "getResponseCode", "", "responseHeaders", "Ljava/util/Map;", "getResponseHeaders", "()Ljava/util/Map;", "", "requestInitiationTime", "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "requestUrl", "Ljava/lang/String;", "getRequestUrl", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "requestType", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "getRequestType", "()Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "RequestType", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BrazeNetworkFailureEvent {
    private final d9 brazeRequest;
    private final n9 httpConnectorResult;
    private final Long requestInitiationTime;
    private final RequestType requestType;
    private final String requestUrl;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_CARDS_SYNC", "OTHER", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType CONTENT_CARDS_SYNC = new RequestType("CONTENT_CARDS_SYNC", 0);
        public static final RequestType OTHER = new RequestType("OTHER", 1);

        private static final /* synthetic */ RequestType[] $values() {
            return new RequestType[]{CONTENT_CARDS_SYNC, OTHER};
        }

        static {
            RequestType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private RequestType(String str, int i) {
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public BrazeNetworkFailureEvent(d9 d9Var, n9 n9Var) {
        d9Var.getClass();
        n9Var.getClass();
        this.brazeRequest = d9Var;
        this.httpConnectorResult = n9Var;
        this.responseCode = n9Var.a;
        this.responseHeaders = n9Var.b;
        i2 i2Var = (i2) d9Var;
        this.requestInitiationTime = i2Var.e;
        this.requestUrl = i2Var.e().a;
        this.requestType = d9Var instanceof y3 ? RequestType.CONTENT_CARDS_SYNC : RequestType.OTHER;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) other;
        return Intrinsics.areEqual(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest) && Intrinsics.areEqual(this.httpConnectorResult, brazeNetworkFailureEvent.httpConnectorResult);
    }

    public int hashCode() {
        return this.httpConnectorResult.hashCode() + (this.brazeRequest.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ", httpConnectorResult=" + this.httpConnectorResult + ")";
    }
}
