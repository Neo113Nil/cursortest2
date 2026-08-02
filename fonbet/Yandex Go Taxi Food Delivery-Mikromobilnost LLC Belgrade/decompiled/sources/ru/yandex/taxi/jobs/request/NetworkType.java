package ru.yandex.taxi.jobs.request;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/jobs/request/NetworkType;", "", "ANY", "CONNECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType ANY;
    public static final NetworkType CONNECTED;

    static {
        NetworkType networkType = new NetworkType("ANY", 0);
        ANY = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        CONNECTED = networkType2;
        NetworkType[] networkTypeArr = {networkType, networkType2};
        $VALUES = networkTypeArr;
        $ENTRIES = a.a(networkTypeArr);
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
