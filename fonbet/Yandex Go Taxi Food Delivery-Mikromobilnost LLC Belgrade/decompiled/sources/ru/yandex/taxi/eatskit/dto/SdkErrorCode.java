package ru.yandex.taxi.eatskit.dto;

import defpackage.c6p0;
import defpackage.gop0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/eatskit/dto/SdkErrorCode;", "", "Companion", "gop0", "CANCEL", "INVALID_MASTER_TOKEN", "UNKNOWN_ERROR", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SdkErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkErrorCode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SdkErrorCode CANCEL;
    public static final gop0 Companion;
    public static final SdkErrorCode INVALID_MASTER_TOKEN;
    public static final SdkErrorCode UNKNOWN_ERROR;

    static {
        SdkErrorCode sdkErrorCode = new SdkErrorCode("CANCEL", 0);
        CANCEL = sdkErrorCode;
        SdkErrorCode sdkErrorCode2 = new SdkErrorCode("INVALID_MASTER_TOKEN", 1);
        INVALID_MASTER_TOKEN = sdkErrorCode2;
        SdkErrorCode sdkErrorCode3 = new SdkErrorCode("UNKNOWN_ERROR", 2);
        UNKNOWN_ERROR = sdkErrorCode3;
        SdkErrorCode[] sdkErrorCodeArr = {sdkErrorCode, sdkErrorCode2, sdkErrorCode3};
        $VALUES = sdkErrorCodeArr;
        $ENTRIES = kotlin.enums.a.a(sdkErrorCodeArr);
        Companion = new gop0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(28));
    }

    public static SdkErrorCode valueOf(String str) {
        return (SdkErrorCode) Enum.valueOf(SdkErrorCode.class, str);
    }

    public static SdkErrorCode[] values() {
        return (SdkErrorCode[]) $VALUES.clone();
    }
}
