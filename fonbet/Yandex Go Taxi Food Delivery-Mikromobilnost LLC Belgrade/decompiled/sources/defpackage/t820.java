package defpackage;

import ru.yandextaxi.flutter_yandex_mapkit.methods.Metadata;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class t820 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Metadata.values().length];
        try {
            iArr[Metadata.BILLBOARD_OBJECT_METADATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Metadata.ROAD_EVENT_METADATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Metadata.BUSINESS_OBJECT_METADATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Metadata.SELECTION_METADATA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Metadata.ROUTE_POINT_METADATA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Metadata.URI_OBJECT_METADATA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
