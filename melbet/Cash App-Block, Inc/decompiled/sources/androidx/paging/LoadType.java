package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LoadType {
    public static final /* synthetic */ LoadType[] $VALUES;
    public static final LoadType APPEND;
    public static final LoadType PREPEND;
    public static final LoadType REFRESH;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        REFRESH = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        PREPEND = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        APPEND = loadType3;
        $VALUES = new LoadType[]{loadType, loadType2, loadType3};
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) $VALUES.clone();
    }
}
