package coil3.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DataSource {
    public static final /* synthetic */ DataSource[] $VALUES;
    public static final DataSource DISK;
    public static final DataSource MEMORY;
    public static final DataSource MEMORY_CACHE;
    public static final DataSource NETWORK;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        MEMORY_CACHE = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        MEMORY = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        DISK = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        NETWORK = dataSource4;
        $VALUES = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) $VALUES.clone();
    }
}
