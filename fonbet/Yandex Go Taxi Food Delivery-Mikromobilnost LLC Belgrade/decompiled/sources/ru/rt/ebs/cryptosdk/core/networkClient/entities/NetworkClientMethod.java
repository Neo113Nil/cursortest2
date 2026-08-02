package ru.rt.ebs.cryptosdk.core.networkClient.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkClientMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkClientMethod[] $VALUES;
    public static final NetworkClientMethod GET = new NetworkClientMethod("GET", 0);
    public static final NetworkClientMethod POST = new NetworkClientMethod("POST", 1);

    private static final /* synthetic */ NetworkClientMethod[] $values() {
        return new NetworkClientMethod[]{GET, POST};
    }

    static {
        NetworkClientMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NetworkClientMethod(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NetworkClientMethod valueOf(String str) {
        return (NetworkClientMethod) Enum.valueOf(NetworkClientMethod.class, str);
    }

    public static NetworkClientMethod[] values() {
        return (NetworkClientMethod[]) $VALUES.clone();
    }
}
