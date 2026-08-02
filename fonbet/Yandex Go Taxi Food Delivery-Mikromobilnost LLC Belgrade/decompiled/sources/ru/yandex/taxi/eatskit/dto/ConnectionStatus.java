package ru.yandex.taxi.eatskit.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l5e;
import defpackage.m3e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ConnectionStatus;", "", "Companion", "l5e", "CONNECTED", "TIMEOUT", "PERMISSION_ERROR", "UNKNOWN", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConnectionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConnectionStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ConnectionStatus CONNECTED;
    public static final l5e Companion;
    public static final ConnectionStatus PERMISSION_ERROR;
    public static final ConnectionStatus TIMEOUT;
    public static final ConnectionStatus UNKNOWN;

    static {
        ConnectionStatus connectionStatus = new ConnectionStatus("CONNECTED", 0);
        CONNECTED = connectionStatus;
        ConnectionStatus connectionStatus2 = new ConnectionStatus("TIMEOUT", 1);
        TIMEOUT = connectionStatus2;
        ConnectionStatus connectionStatus3 = new ConnectionStatus("PERMISSION_ERROR", 2);
        PERMISSION_ERROR = connectionStatus3;
        ConnectionStatus connectionStatus4 = new ConnectionStatus("UNKNOWN", 3);
        UNKNOWN = connectionStatus4;
        ConnectionStatus[] connectionStatusArr = {connectionStatus, connectionStatus2, connectionStatus3, connectionStatus4};
        $VALUES = connectionStatusArr;
        $ENTRIES = kotlin.enums.a.a(connectionStatusArr);
        Companion = new l5e();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(5));
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) $VALUES.clone();
    }
}
