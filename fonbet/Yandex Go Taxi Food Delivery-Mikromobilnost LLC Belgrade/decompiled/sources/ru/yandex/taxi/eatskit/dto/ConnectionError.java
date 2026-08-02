package ru.yandex.taxi.eatskit.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.m3e;
import defpackage.w4e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ConnectionError;", "", "Companion", "w4e", "PERMISSION_DENIED", "BLUETOOTH_OFF", "COURIER_NOT_FOUND", "UNKNOWN", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConnectionError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConnectionError[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ConnectionError BLUETOOTH_OFF;
    public static final ConnectionError COURIER_NOT_FOUND;
    public static final w4e Companion;
    public static final ConnectionError PERMISSION_DENIED;
    public static final ConnectionError UNKNOWN;

    static {
        ConnectionError connectionError = new ConnectionError("PERMISSION_DENIED", 0);
        PERMISSION_DENIED = connectionError;
        ConnectionError connectionError2 = new ConnectionError("BLUETOOTH_OFF", 1);
        BLUETOOTH_OFF = connectionError2;
        ConnectionError connectionError3 = new ConnectionError("COURIER_NOT_FOUND", 2);
        COURIER_NOT_FOUND = connectionError3;
        ConnectionError connectionError4 = new ConnectionError("UNKNOWN", 3);
        UNKNOWN = connectionError4;
        ConnectionError[] connectionErrorArr = {connectionError, connectionError2, connectionError3, connectionError4};
        $VALUES = connectionErrorArr;
        $ENTRIES = kotlin.enums.a.a(connectionErrorArr);
        Companion = new w4e();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(4));
    }

    public static ConnectionError valueOf(String str) {
        return (ConnectionError) Enum.valueOf(ConnectionError.class, str);
    }

    public static ConnectionError[] values() {
        return (ConnectionError[]) $VALUES.clone();
    }
}
