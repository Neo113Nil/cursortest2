package ru.yandex.taxi.design;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/design/ImageActionState;", "", JCP.RAW_PREFIX, "DRAG", "ZOOM", "FLING", "ANIMATE_ZOOM", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ImageActionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageActionState[] $VALUES;
    public static final ImageActionState ANIMATE_ZOOM;
    public static final ImageActionState DRAG;
    public static final ImageActionState FLING;
    public static final ImageActionState NONE;
    public static final ImageActionState ZOOM;

    static {
        ImageActionState imageActionState = new ImageActionState(JCP.RAW_PREFIX, 0);
        NONE = imageActionState;
        ImageActionState imageActionState2 = new ImageActionState("DRAG", 1);
        DRAG = imageActionState2;
        ImageActionState imageActionState3 = new ImageActionState("ZOOM", 2);
        ZOOM = imageActionState3;
        ImageActionState imageActionState4 = new ImageActionState("FLING", 3);
        FLING = imageActionState4;
        ImageActionState imageActionState5 = new ImageActionState("ANIMATE_ZOOM", 4);
        ANIMATE_ZOOM = imageActionState5;
        ImageActionState[] imageActionStateArr = {imageActionState, imageActionState2, imageActionState3, imageActionState4, imageActionState5};
        $VALUES = imageActionStateArr;
        $ENTRIES = kotlin.enums.a.a(imageActionStateArr);
    }

    public static ImageActionState valueOf(String str) {
        return (ImageActionState) Enum.valueOf(ImageActionState.class, str);
    }

    public static ImageActionState[] values() {
        return (ImageActionState[]) $VALUES.clone();
    }
}
