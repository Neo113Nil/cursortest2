package ru.yandex.yx_platform_api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/yx_platform_api/NetworkReachabilityStatus;", "", "REACHABLE", "UNREACHABLE", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkReachabilityStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkReachabilityStatus[] $VALUES;
    public static final NetworkReachabilityStatus REACHABLE;
    public static final NetworkReachabilityStatus UNREACHABLE;

    static {
        NetworkReachabilityStatus networkReachabilityStatus = new NetworkReachabilityStatus("REACHABLE", 0);
        REACHABLE = networkReachabilityStatus;
        NetworkReachabilityStatus networkReachabilityStatus2 = new NetworkReachabilityStatus("UNREACHABLE", 1);
        UNREACHABLE = networkReachabilityStatus2;
        NetworkReachabilityStatus[] networkReachabilityStatusArr = {networkReachabilityStatus, networkReachabilityStatus2};
        $VALUES = networkReachabilityStatusArr;
        $ENTRIES = kotlin.enums.a.a(networkReachabilityStatusArr);
    }

    public static NetworkReachabilityStatus valueOf(String str) {
        return (NetworkReachabilityStatus) Enum.valueOf(NetworkReachabilityStatus.class, str);
    }

    public static NetworkReachabilityStatus[] values() {
        return (NetworkReachabilityStatus[]) $VALUES.clone();
    }
}
