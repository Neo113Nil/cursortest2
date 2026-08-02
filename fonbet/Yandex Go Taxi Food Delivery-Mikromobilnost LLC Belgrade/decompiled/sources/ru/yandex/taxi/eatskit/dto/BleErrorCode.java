package ru.yandex.taxi.eatskit.dto;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.h26;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/eatskit/dto/BleErrorCode;", "", "Companion", "h26", "PERMISSION_ERROR", "CONNECTION_FAILED", "DISCONNECTED", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BleErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleErrorCode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BleErrorCode CONNECTION_FAILED;
    public static final h26 Companion;
    public static final BleErrorCode DISCONNECTED;
    public static final BleErrorCode PERMISSION_ERROR;

    static {
        BleErrorCode bleErrorCode = new BleErrorCode("PERMISSION_ERROR", 0);
        PERMISSION_ERROR = bleErrorCode;
        BleErrorCode bleErrorCode2 = new BleErrorCode("CONNECTION_FAILED", 1);
        CONNECTION_FAILED = bleErrorCode2;
        BleErrorCode bleErrorCode3 = new BleErrorCode("DISCONNECTED", 2);
        DISCONNECTED = bleErrorCode3;
        BleErrorCode[] bleErrorCodeArr = {bleErrorCode, bleErrorCode2, bleErrorCode3};
        $VALUES = bleErrorCodeArr;
        $ENTRIES = kotlin.enums.a.a(bleErrorCodeArr);
        Companion = new h26();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(5));
    }

    public static BleErrorCode valueOf(String str) {
        return (BleErrorCode) Enum.valueOf(BleErrorCode.class, str);
    }

    public static BleErrorCode[] values() {
        return (BleErrorCode[]) $VALUES.clone();
    }
}
