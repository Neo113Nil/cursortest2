package ru.yandextaxi.flutter_yandex_mapkit.models;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/TileFormat;", "", "<init>", "(Ljava/lang/String;I)V", "PNG", "JPG", "VECTOR2", "VECTOR3", "GEO_JSON", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TileFormat[] $VALUES;

    @ysq0("geoJson")
    public static final TileFormat GEO_JSON;

    @ysq0("jpg")
    public static final TileFormat JPG;

    @ysq0("png")
    public static final TileFormat PNG;

    @ysq0("vector2")
    public static final TileFormat VECTOR2;

    @ysq0("vector3")
    public static final TileFormat VECTOR3;

    static {
        TileFormat tileFormat = new TileFormat("PNG", 0);
        PNG = tileFormat;
        TileFormat tileFormat2 = new TileFormat("JPG", 1);
        JPG = tileFormat2;
        TileFormat tileFormat3 = new TileFormat("VECTOR2", 2);
        VECTOR2 = tileFormat3;
        TileFormat tileFormat4 = new TileFormat("VECTOR3", 3);
        VECTOR3 = tileFormat4;
        TileFormat tileFormat5 = new TileFormat("GEO_JSON", 4);
        GEO_JSON = tileFormat5;
        TileFormat[] tileFormatArr = {tileFormat, tileFormat2, tileFormat3, tileFormat4, tileFormat5};
        $VALUES = tileFormatArr;
        $ENTRIES = a.a(tileFormatArr);
    }

    private TileFormat(String str, int i) {
    }

    public static TileFormat valueOf(String str) {
        return (TileFormat) Enum.valueOf(TileFormat.class, str);
    }

    public static TileFormat[] values() {
        return (TileFormat[]) $VALUES.clone();
    }
}
