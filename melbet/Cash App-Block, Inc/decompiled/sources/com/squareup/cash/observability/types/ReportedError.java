package com.squareup.cash.observability.types;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntriesList;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/observability/types/ReportedError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/squareup/cash/observability/types/FeatureError;", "ErrorReportingTarget", "types"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ReportedError extends Exception implements FeatureError {
    public final ErrorImpact impact;
    public final EmptyMap metadata;
    public final Set targets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorReportingTarget {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ErrorReportingTarget[] $VALUES;
        public static final ErrorReportingTarget BUGSNAG;
        public static final ErrorReportingTarget DATADOG;
        public static final ErrorReportingTarget LOGS;

        static {
            ErrorReportingTarget errorReportingTarget = new ErrorReportingTarget("BUGSNAG", 0);
            BUGSNAG = errorReportingTarget;
            ErrorReportingTarget errorReportingTarget2 = new ErrorReportingTarget("DATADOG", 1);
            DATADOG = errorReportingTarget2;
            ErrorReportingTarget errorReportingTarget3 = new ErrorReportingTarget("LOGS", 2);
            LOGS = errorReportingTarget3;
            ErrorReportingTarget[] errorReportingTargetArr = {errorReportingTarget, errorReportingTarget2, errorReportingTarget3};
            $VALUES = errorReportingTargetArr;
            $ENTRIES = new EnumEntriesList(errorReportingTargetArr);
        }

        public static ErrorReportingTarget valueOf(String str) {
            return (ErrorReportingTarget) Enum.valueOf(ErrorReportingTarget.class, str);
        }

        public static ErrorReportingTarget[] values() {
            return (ErrorReportingTarget[]) $VALUES.clone();
        }
    }

    public ReportedError() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.metadata = emptyMap;
        this.targets = CollectionsKt.toSet(ErrorReportingTarget.$ENTRIES);
        this.impact = ErrorImpact.GRACEFUL_DEGRADATION;
    }

    public String getContext() {
        return null;
    }

    /* renamed from: getGroupingDescriptor */
    public String getMessage() {
        return null;
    }

    public ErrorImpact getImpact() {
        return this.impact;
    }

    public Map getMetadata() {
        return this.metadata;
    }

    public String getSamplingKey() {
        String message = getMessage();
        if (message != null) {
            return message;
        }
        String title = getTitle();
        if (title == null) {
            title = getClass().getSimpleName();
        }
        return Recorder$$ExternalSyntheticOutline2.m(title, ".", getMessage());
    }

    public Set getTargets() {
        return this.targets;
    }

    public String getTitle() {
        return null;
    }
}
