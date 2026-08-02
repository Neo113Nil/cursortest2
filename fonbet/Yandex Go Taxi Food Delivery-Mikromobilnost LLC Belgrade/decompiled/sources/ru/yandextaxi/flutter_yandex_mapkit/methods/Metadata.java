package ru.yandextaxi.flutter_yandex_mapkit.methods;

import defpackage.k4o;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/methods/Metadata;", "", "BILLBOARD_OBJECT_METADATA", "ROAD_EVENT_METADATA", "BUSINESS_OBJECT_METADATA", "SELECTION_METADATA", "ROUTE_POINT_METADATA", "URI_OBJECT_METADATA", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Metadata {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Metadata[] $VALUES;
    public static final Metadata BILLBOARD_OBJECT_METADATA;
    public static final Metadata BUSINESS_OBJECT_METADATA;
    public static final Metadata ROAD_EVENT_METADATA;
    public static final Metadata ROUTE_POINT_METADATA;
    public static final Metadata SELECTION_METADATA;
    public static final Metadata URI_OBJECT_METADATA;

    static {
        Metadata metadata = new Metadata("BILLBOARD_OBJECT_METADATA", 0);
        BILLBOARD_OBJECT_METADATA = metadata;
        Metadata metadata2 = new Metadata("ROAD_EVENT_METADATA", 1);
        ROAD_EVENT_METADATA = metadata2;
        Metadata metadata3 = new Metadata("BUSINESS_OBJECT_METADATA", 2);
        BUSINESS_OBJECT_METADATA = metadata3;
        Metadata metadata4 = new Metadata("SELECTION_METADATA", 3);
        SELECTION_METADATA = metadata4;
        Metadata metadata5 = new Metadata("ROUTE_POINT_METADATA", 4);
        ROUTE_POINT_METADATA = metadata5;
        Metadata metadata6 = new Metadata("URI_OBJECT_METADATA", 5);
        URI_OBJECT_METADATA = metadata6;
        Metadata[] metadataArr = {metadata, metadata2, metadata3, metadata4, metadata5, metadata6};
        $VALUES = metadataArr;
        $ENTRIES = a.a(metadataArr);
    }

    public static Metadata valueOf(String str) {
        return (Metadata) Enum.valueOf(Metadata.class, str);
    }

    public static Metadata[] values() {
        return (Metadata[]) $VALUES.clone();
    }
}
