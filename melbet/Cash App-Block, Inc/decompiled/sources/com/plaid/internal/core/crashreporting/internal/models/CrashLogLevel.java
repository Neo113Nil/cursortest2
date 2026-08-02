package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.annotations.SerializedName;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.ecr.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "", "(Ljava/lang/String;I)V", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrashLogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CrashLogLevel[] $VALUES;

    @SerializedName("fatal")
    public static final CrashLogLevel FATAL = new CrashLogLevel("FATAL", 0);

    @SerializedName(BreadcrumbHelper.Category.ERROR)
    public static final CrashLogLevel ERROR = new CrashLogLevel("ERROR", 1);

    @SerializedName("warning")
    public static final CrashLogLevel WARNING = new CrashLogLevel("WARNING", 2);

    @SerializedName("info")
    public static final CrashLogLevel INFO = new CrashLogLevel("INFO", 3);

    @SerializedName(BuildConfig.BUILD_TYPE)
    public static final CrashLogLevel DEBUG = new CrashLogLevel("DEBUG", 4);

    private static final /* synthetic */ CrashLogLevel[] $values() {
        return new CrashLogLevel[]{FATAL, ERROR, WARNING, INFO, DEBUG};
    }

    static {
        CrashLogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private CrashLogLevel(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CrashLogLevel valueOf(String str) {
        return (CrashLogLevel) Enum.valueOf(CrashLogLevel.class, str);
    }

    public static CrashLogLevel[] values() {
        return (CrashLogLevel[]) $VALUES.clone();
    }
}
