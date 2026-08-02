package ru.yandextaxi.flutter_yandex_mapkit.models;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/ProjectionType;", "", "<init>", "(Ljava/lang/String;I)V", "WGS_84_MERCATOR", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProjectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProjectionType[] $VALUES;

    @ysq0("wgs84Mercator")
    public static final ProjectionType WGS_84_MERCATOR;

    static {
        ProjectionType projectionType = new ProjectionType("WGS_84_MERCATOR", 0);
        WGS_84_MERCATOR = projectionType;
        ProjectionType[] projectionTypeArr = {projectionType};
        $VALUES = projectionTypeArr;
        $ENTRIES = a.a(projectionTypeArr);
    }

    private ProjectionType(String str, int i) {
    }

    public static ProjectionType valueOf(String str) {
        return (ProjectionType) Enum.valueOf(ProjectionType.class, str);
    }

    public static ProjectionType[] values() {
        return (ProjectionType[]) $VALUES.clone();
    }
}
