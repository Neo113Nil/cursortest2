package com.squareup.cash.observability.protovalidation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/observability/protovalidation/ProtoParsingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "ErrorType", "Factory", "proto-validation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public class ProtoParsingError extends ReportedError {
    public final Throwable cause;
    public final String errorReason;
    public final String featureTitle;
    public final Set features;
    public final String invalidField;
    public final String protoName;

    /* loaded from: classes6.dex */
    public enum ErrorType {
        REQUIRED_FIELD_MISSING("Required field is null"),
        INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING("Proto provided an invalid subtype when mapping to a sealed interface"),
        UNSUPPORTED_ENUM_VALUE("Proto provided an unsupported enum value"),
        REQUIRED_FIELD_COUNT_MISSING("Required field has incorrect element count");

        public final String reason;

        ErrorType(String str) {
            this.reason = str;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public interface Factory {
        ProtoParsingError create(String str, ErrorType errorType, String str2, Exception exc);
    }

    public ProtoParsingError(String str, ErrorType errorType, String str2, Throwable th, String str3) {
        this(str, str2, th, EmptySet.INSTANCE, str3, errorType != null ? errorType.getReason() : th != null ? th.toString() : "Unknown error");
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse proto: " + this.protoName + ".");
        String str = this.invalidField;
        if (str != null) {
            sb.append(" Invalid field: " + str + ".");
        }
        sb.append(" Reason: " + this.errorReason + ".");
        return sb.toString();
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getSamplingKey() {
        return Boxes$$ExternalSyntheticOutline1.m$1(this.protoName, "/", this.invalidField, "/", this.errorReason);
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getTitle() {
        String str = this.featureTitle;
        if (str != null) {
            return Recorder$$ExternalSyntheticOutline2.m("com.squareup.cash.banking.observability.ProtoParsingError$", str);
        }
        return null;
    }

    public ProtoParsingError(String str, String str2, Throwable th, Set set, String str3, String str4) {
        str.getClass();
        set.getClass();
        str4.getClass();
        this.protoName = str;
        this.invalidField = str2;
        this.cause = th;
        this.features = set;
        this.featureTitle = str3;
        this.errorReason = str4;
    }
}
