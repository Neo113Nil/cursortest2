package com.bugsnag.android;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BreadcrumbType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BreadcrumbType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BreadcrumbType ERROR = new BreadcrumbType("ERROR", 0, BreadcrumbHelper.Category.ERROR);
    public static final BreadcrumbType LOG = new BreadcrumbType("LOG", 1, "log");
    public static final BreadcrumbType MANUAL = new BreadcrumbType("MANUAL", 2, "manual");
    public static final BreadcrumbType NAVIGATION = new BreadcrumbType("NAVIGATION", 3, BreadcrumbHelper.Category.NAVIGATION);
    public static final BreadcrumbType PROCESS = new BreadcrumbType("PROCESS", 4, "process");
    public static final BreadcrumbType REQUEST = new BreadcrumbType("REQUEST", 5, "request");
    public static final BreadcrumbType STATE = new BreadcrumbType("STATE", 6, "state");
    public static final BreadcrumbType USER = new BreadcrumbType("USER", 7, "user");
    private final String type;

    public final class Companion {
    }

    private static final /* synthetic */ BreadcrumbType[] $values() {
        return new BreadcrumbType[]{ERROR, LOG, MANUAL, NAVIGATION, PROCESS, REQUEST, STATE, USER};
    }

    static {
        BreadcrumbType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion();
    }

    private BreadcrumbType(String str, int i, String str2) {
        this.type = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BreadcrumbType valueOf(String str) {
        return (BreadcrumbType) Enum.valueOf(BreadcrumbType.class, str);
    }

    public static BreadcrumbType[] values() {
        return (BreadcrumbType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
