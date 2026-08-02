package com.bugsnag.android;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/ErrorType;", "", "desc", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc$bugsnag_android_core_release", "()Ljava/lang/String;", "UNKNOWN", "ANDROID", "REACTNATIVEJS", "C", "DART", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String desc;
    public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 0, "");
    public static final ErrorType ANDROID = new ErrorType("ANDROID", 1, "android");
    public static final ErrorType REACTNATIVEJS = new ErrorType("REACTNATIVEJS", 2, "reactnativejs");
    public static final ErrorType C = new ErrorType("C", 3, "c");
    public static final ErrorType DART = new ErrorType("DART", 4, "dart");

    public final class Companion {
        public static ErrorType fromDescriptor(String str) {
            for (ErrorType errorType : ErrorType.values()) {
                if (Intrinsics.areEqual(errorType.getDesc(), str)) {
                    return errorType;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{UNKNOWN, ANDROID, REACTNATIVEJS, C, DART};
    }

    static {
        ErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion();
    }

    private ErrorType(String str, int i, String str2) {
        this.desc = str2;
    }

    public static final ErrorType fromDescriptor(String str) {
        INSTANCE.getClass();
        return Companion.fromDescriptor(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }

    /* renamed from: getDesc$bugsnag_android_core_release, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }
}
