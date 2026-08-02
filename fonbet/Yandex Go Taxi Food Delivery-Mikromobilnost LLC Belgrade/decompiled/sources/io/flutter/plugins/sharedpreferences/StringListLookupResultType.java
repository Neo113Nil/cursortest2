package io.flutter.plugins.sharedpreferences;

import defpackage.k4o;
import defpackage.otu0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "otu0", "PLATFORM_ENCODED", "JSON_ENCODED", "UNEXPECTED_STRING", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringListLookupResultType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StringListLookupResultType[] $VALUES;
    public static final otu0 Companion;
    public static final StringListLookupResultType JSON_ENCODED;
    public static final StringListLookupResultType PLATFORM_ENCODED;
    public static final StringListLookupResultType UNEXPECTED_STRING;
    private final int raw;

    static {
        StringListLookupResultType stringListLookupResultType = new StringListLookupResultType("PLATFORM_ENCODED", 0, 0);
        PLATFORM_ENCODED = stringListLookupResultType;
        StringListLookupResultType stringListLookupResultType2 = new StringListLookupResultType("JSON_ENCODED", 1, 1);
        JSON_ENCODED = stringListLookupResultType2;
        StringListLookupResultType stringListLookupResultType3 = new StringListLookupResultType("UNEXPECTED_STRING", 2, 2);
        UNEXPECTED_STRING = stringListLookupResultType3;
        StringListLookupResultType[] stringListLookupResultTypeArr = {stringListLookupResultType, stringListLookupResultType2, stringListLookupResultType3};
        $VALUES = stringListLookupResultTypeArr;
        $ENTRIES = kotlin.enums.a.a(stringListLookupResultTypeArr);
        Companion = new otu0();
    }

    public StringListLookupResultType(String str, int i, int i2) {
        this.raw = i2;
    }

    public static StringListLookupResultType valueOf(String str) {
        return (StringListLookupResultType) Enum.valueOf(StringListLookupResultType.class, str);
    }

    public static StringListLookupResultType[] values() {
        return (StringListLookupResultType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
