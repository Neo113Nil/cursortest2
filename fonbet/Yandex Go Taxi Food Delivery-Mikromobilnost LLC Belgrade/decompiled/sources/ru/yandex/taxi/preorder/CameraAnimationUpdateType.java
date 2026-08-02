package ru.yandex.taxi.preorder;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/preorder/CameraAnimationUpdateType;", "", "ANIMATE_TO_PICKUP_POINT", "ANIMATE_TO_POINT", "ANIMATE_TO_TRANSLATED_POINT", "ANIMATE_TO_POINT_AND_ZOOM_IF_NEEDED", "ANIMATE_TO_USER_POSITION", "ANIMATE_TAP_ON_PICKUP_POINT", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraAnimationUpdateType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraAnimationUpdateType[] $VALUES;
    public static final CameraAnimationUpdateType ANIMATE_TAP_ON_PICKUP_POINT;
    public static final CameraAnimationUpdateType ANIMATE_TO_PICKUP_POINT;
    public static final CameraAnimationUpdateType ANIMATE_TO_POINT;
    public static final CameraAnimationUpdateType ANIMATE_TO_POINT_AND_ZOOM_IF_NEEDED;
    public static final CameraAnimationUpdateType ANIMATE_TO_TRANSLATED_POINT;
    public static final CameraAnimationUpdateType ANIMATE_TO_USER_POSITION;

    static {
        CameraAnimationUpdateType cameraAnimationUpdateType = new CameraAnimationUpdateType("ANIMATE_TO_PICKUP_POINT", 0);
        ANIMATE_TO_PICKUP_POINT = cameraAnimationUpdateType;
        CameraAnimationUpdateType cameraAnimationUpdateType2 = new CameraAnimationUpdateType("ANIMATE_TO_POINT", 1);
        ANIMATE_TO_POINT = cameraAnimationUpdateType2;
        CameraAnimationUpdateType cameraAnimationUpdateType3 = new CameraAnimationUpdateType("ANIMATE_TO_TRANSLATED_POINT", 2);
        ANIMATE_TO_TRANSLATED_POINT = cameraAnimationUpdateType3;
        CameraAnimationUpdateType cameraAnimationUpdateType4 = new CameraAnimationUpdateType("ANIMATE_TO_POINT_AND_ZOOM_IF_NEEDED", 3);
        ANIMATE_TO_POINT_AND_ZOOM_IF_NEEDED = cameraAnimationUpdateType4;
        CameraAnimationUpdateType cameraAnimationUpdateType5 = new CameraAnimationUpdateType("ANIMATE_TO_USER_POSITION", 4);
        ANIMATE_TO_USER_POSITION = cameraAnimationUpdateType5;
        CameraAnimationUpdateType cameraAnimationUpdateType6 = new CameraAnimationUpdateType("ANIMATE_TAP_ON_PICKUP_POINT", 5);
        ANIMATE_TAP_ON_PICKUP_POINT = cameraAnimationUpdateType6;
        CameraAnimationUpdateType[] cameraAnimationUpdateTypeArr = {cameraAnimationUpdateType, cameraAnimationUpdateType2, cameraAnimationUpdateType3, cameraAnimationUpdateType4, cameraAnimationUpdateType5, cameraAnimationUpdateType6};
        $VALUES = cameraAnimationUpdateTypeArr;
        $ENTRIES = a.a(cameraAnimationUpdateTypeArr);
    }

    public static CameraAnimationUpdateType valueOf(String str) {
        return (CameraAnimationUpdateType) Enum.valueOf(CameraAnimationUpdateType.class, str);
    }

    public static CameraAnimationUpdateType[] values() {
        return (CameraAnimationUpdateType[]) $VALUES.clone();
    }
}
