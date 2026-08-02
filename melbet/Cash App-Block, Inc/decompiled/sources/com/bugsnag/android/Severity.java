package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/Severity;", "", "Lcom/bugsnag/android/JsonStream$Streamable;", "str", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "ERROR", "WARNING", "INFO", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Severity implements JsonStream.Streamable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Severity[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String str;
    public static final Severity ERROR = new Severity("ERROR", 0, BreadcrumbHelper.Category.ERROR);
    public static final Severity WARNING = new Severity("WARNING", 1, "warning");
    public static final Severity INFO = new Severity("INFO", 2, "info");

    public final class Companion {
    }

    private static final /* synthetic */ Severity[] $values() {
        return new Severity[]{ERROR, WARNING, INFO};
    }

    static {
        Severity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion();
    }

    private Severity(String str, int i, String str2) {
        this.str = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Severity valueOf(String str) {
        return (Severity) Enum.valueOf(Severity.class, str);
    }

    public static Severity[] values() {
        return (Severity[]) $VALUES.clone();
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        writer.value(this.str);
    }
}
