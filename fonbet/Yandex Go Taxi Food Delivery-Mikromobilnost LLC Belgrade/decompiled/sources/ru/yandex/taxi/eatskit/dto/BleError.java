package ru.yandex.taxi.eatskit.dto;

import defpackage.av5;
import defpackage.g26;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/eatskit/dto/BleError;", "", "Companion", "g26", "NOT_CONNECTED", "WRITE_ERROR", "UNKNOWN", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BleError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleError[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final g26 Companion;
    public static final BleError NOT_CONNECTED;
    public static final BleError UNKNOWN;
    public static final BleError WRITE_ERROR;

    static {
        BleError bleError = new BleError("NOT_CONNECTED", 0);
        NOT_CONNECTED = bleError;
        BleError bleError2 = new BleError("WRITE_ERROR", 1);
        WRITE_ERROR = bleError2;
        BleError bleError3 = new BleError("UNKNOWN", 2);
        UNKNOWN = bleError3;
        BleError[] bleErrorArr = {bleError, bleError2, bleError3};
        $VALUES = bleErrorArr;
        $ENTRIES = kotlin.enums.a.a(bleErrorArr);
        Companion = new g26();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(4));
    }

    public static BleError valueOf(String str) {
        return (BleError) Enum.valueOf(BleError.class, str);
    }

    public static BleError[] values() {
        return (BleError[]) $VALUES.clone();
    }
}
