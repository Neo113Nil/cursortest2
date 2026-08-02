package ru.yandex.taxi.eatskit.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ErrorSource;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EATSKIT", "WEB_VIEW_CLIENT", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorSource[] $VALUES;
    public static final ErrorSource EATSKIT;
    public static final ErrorSource WEB_VIEW_CLIENT;
    private final String rawValue;

    static {
        ErrorSource errorSource = new ErrorSource("EATSKIT", 0, "EATSKIT");
        EATSKIT = errorSource;
        ErrorSource errorSource2 = new ErrorSource("WEB_VIEW_CLIENT", 1, "WEB_VIEW_CLIENT");
        WEB_VIEW_CLIENT = errorSource2;
        ErrorSource[] errorSourceArr = {errorSource, errorSource2};
        $VALUES = errorSourceArr;
        $ENTRIES = kotlin.enums.a.a(errorSourceArr);
    }

    public ErrorSource(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ErrorSource valueOf(String str) {
        return (ErrorSource) Enum.valueOf(ErrorSource.class, str);
    }

    public static ErrorSource[] values() {
        return (ErrorSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
