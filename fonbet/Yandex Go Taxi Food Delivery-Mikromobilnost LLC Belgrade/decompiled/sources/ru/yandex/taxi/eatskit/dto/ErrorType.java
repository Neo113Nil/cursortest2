package ru.yandex.taxi.eatskit.dto;

import defpackage.cao;
import defpackage.dao;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ErrorType;", "", "Companion", "dao", "API_ERROR", "RUNTIME_ERROR", "BAN_ERROR", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ErrorType API_ERROR;
    public static final ErrorType BAN_ERROR;
    public static final dao Companion;
    public static final ErrorType RUNTIME_ERROR;
    private static final i3y stringConverter$delegate;

    static {
        ErrorType errorType = new ErrorType("API_ERROR", 0);
        API_ERROR = errorType;
        ErrorType errorType2 = new ErrorType("RUNTIME_ERROR", 1);
        RUNTIME_ERROR = errorType2;
        ErrorType errorType3 = new ErrorType("BAN_ERROR", 2);
        BAN_ERROR = errorType3;
        ErrorType[] errorTypeArr = {errorType, errorType2, errorType3};
        $VALUES = errorTypeArr;
        $ENTRIES = kotlin.enums.a.a(errorTypeArr);
        Companion = new dao();
        stringConverter$delegate = kotlin.a.a(new cao(0));
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cao(1));
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
