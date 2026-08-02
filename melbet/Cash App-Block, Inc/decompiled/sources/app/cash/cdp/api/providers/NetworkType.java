package app.cash.cdp.api.providers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NetworkType {
    public static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType BLUETOOTH;
    public static final NetworkType CELLULAR;
    public static final NetworkType WIFI;

    static {
        NetworkType networkType = new NetworkType("BLUETOOTH", 0);
        BLUETOOTH = networkType;
        NetworkType networkType2 = new NetworkType("WIFI", 1);
        WIFI = networkType2;
        NetworkType networkType3 = new NetworkType("CELLULAR", 2);
        CELLULAR = networkType3;
        $VALUES = new NetworkType[]{networkType, networkType2, networkType3};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
