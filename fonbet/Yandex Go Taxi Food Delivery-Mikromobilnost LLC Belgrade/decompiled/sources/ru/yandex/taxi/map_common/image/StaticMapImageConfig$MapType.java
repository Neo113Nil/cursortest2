package ru.yandex.taxi.map_common.image;

import defpackage.k4o;
import defpackage.r6u0;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/map_common/image/StaticMapImageConfig$MapType", "", "Lru/yandex/taxi/map_common/image/StaticMapImageConfig$MapType;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "r6u0", "MAP", "SATELLITE", "HYBRID", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticMapImageConfig$MapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StaticMapImageConfig$MapType[] $VALUES;
    public static final r6u0 Companion;
    public static final StaticMapImageConfig$MapType HYBRID;
    public static final StaticMapImageConfig$MapType MAP;
    public static final StaticMapImageConfig$MapType SATELLITE;
    private final String value;

    static {
        StaticMapImageConfig$MapType staticMapImageConfig$MapType = new StaticMapImageConfig$MapType("MAP", 0, PolicyMappingsExtension.MAP);
        MAP = staticMapImageConfig$MapType;
        StaticMapImageConfig$MapType staticMapImageConfig$MapType2 = new StaticMapImageConfig$MapType("SATELLITE", 1, "sat");
        SATELLITE = staticMapImageConfig$MapType2;
        StaticMapImageConfig$MapType staticMapImageConfig$MapType3 = new StaticMapImageConfig$MapType("HYBRID", 2, "sat,skl");
        HYBRID = staticMapImageConfig$MapType3;
        StaticMapImageConfig$MapType[] staticMapImageConfig$MapTypeArr = {staticMapImageConfig$MapType, staticMapImageConfig$MapType2, staticMapImageConfig$MapType3};
        $VALUES = staticMapImageConfig$MapTypeArr;
        $ENTRIES = kotlin.enums.a.a(staticMapImageConfig$MapTypeArr);
        Companion = new r6u0();
    }

    public StaticMapImageConfig$MapType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static StaticMapImageConfig$MapType valueOf(String str) {
        return (StaticMapImageConfig$MapType) Enum.valueOf(StaticMapImageConfig$MapType.class, str);
    }

    public static StaticMapImageConfig$MapType[] values() {
        return (StaticMapImageConfig$MapType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
