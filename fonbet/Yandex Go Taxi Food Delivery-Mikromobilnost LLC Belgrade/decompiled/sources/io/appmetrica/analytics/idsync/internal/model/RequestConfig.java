package io.appmetrica.analytics.idsync.internal.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u0017\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020\u001e\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u00100\u001a\u00020\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u00105J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00103\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\f¨\u00066"}, d2 = {"Lio/appmetrica/analytics/idsync/internal/model/RequestConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "getUrl", "url", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "c", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "getPreconditions", "()Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "preconditions", "", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "", "e", "J", "getResendIntervalForValidResponse", "()J", "resendIntervalForValidResponse", "f", "getResendIntervalForInvalidResponse", "resendIntervalForInvalidResponse", "g", "Ljava/util/List;", "getValidResponseCodes", "()Ljava/util/List;", "validResponseCodes", "h", "Z", "getReportEventEnabled", "()Z", "reportEventEnabled", CoreConstants.PushMessage.SERVICE_TYPE, "getReportUrl", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/idsync/internal/model/Preconditions;Ljava/util/Map;JJLjava/util/List;ZLjava/lang/String;)V", "id-sync_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RequestConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final Preconditions preconditions;

    /* renamed from: d, reason: from kotlin metadata */
    private final Map headers;

    /* renamed from: e, reason: from kotlin metadata */
    private final long resendIntervalForValidResponse;

    /* renamed from: f, reason: from kotlin metadata */
    private final long resendIntervalForInvalidResponse;

    /* renamed from: g, reason: from kotlin metadata */
    private final List validResponseCodes;

    /* renamed from: h, reason: from kotlin metadata */
    private final boolean reportEventEnabled;

    /* renamed from: i, reason: from kotlin metadata */
    private final String reportUrl;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j, long j2, List<Integer> list, boolean z, String str3) {
        this.type = str;
        this.url = str2;
        this.preconditions = preconditions;
        this.headers = map;
        this.resendIntervalForValidResponse = j;
        this.resendIntervalForInvalidResponse = j2;
        this.validResponseCodes = list;
        this.reportEventEnabled = z;
        this.reportUrl = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RequestConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        RequestConfig requestConfig = (RequestConfig) other;
        return this.resendIntervalForValidResponse == requestConfig.resendIntervalForValidResponse && this.resendIntervalForInvalidResponse == requestConfig.resendIntervalForInvalidResponse && jl40.l(this.type, requestConfig.type) && jl40.l(this.url, requestConfig.url) && jl40.l(this.preconditions, requestConfig.preconditions) && jl40.l(this.headers, requestConfig.headers) && jl40.l(this.validResponseCodes, requestConfig.validResponseCodes) && this.reportEventEnabled == requestConfig.reportEventEnabled && jl40.l(this.reportUrl, requestConfig.reportUrl);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final Preconditions getPreconditions() {
        return this.preconditions;
    }

    public final boolean getReportEventEnabled() {
        return this.reportEventEnabled;
    }

    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.resendIntervalForInvalidResponse;
    }

    public final long getResendIntervalForValidResponse() {
        return this.resendIntervalForValidResponse;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.validResponseCodes;
    }

    public int hashCode() {
        int e = unr0.e(unr0.c(unr0.d((this.preconditions.hashCode() + unr0.b(unr0.b(qv10.c(Long.hashCode(this.resendIntervalForValidResponse) * 31, 31, this.resendIntervalForInvalidResponse), 31, this.type), 31, this.url)) * 31, 31, this.headers), 31, this.validResponseCodes), 31, this.reportEventEnabled);
        String str = this.reportUrl;
        return e + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestConfig(type='");
        sb.append(this.type);
        sb.append("', url='");
        sb.append(this.url);
        sb.append("', preconditions=");
        sb.append(this.preconditions);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", resendIntervalForValidResponse=");
        sb.append(this.resendIntervalForValidResponse);
        sb.append(", resendIntervalForInvalidResponse=");
        sb.append(this.resendIntervalForInvalidResponse);
        sb.append(", validResponseCodes=");
        sb.append(this.validResponseCodes);
        sb.append(", reportEventEnabled=");
        sb.append(this.reportEventEnabled);
        sb.append(", reportUrl=");
        return b64.p(sb, this.reportUrl, ')');
    }
}
