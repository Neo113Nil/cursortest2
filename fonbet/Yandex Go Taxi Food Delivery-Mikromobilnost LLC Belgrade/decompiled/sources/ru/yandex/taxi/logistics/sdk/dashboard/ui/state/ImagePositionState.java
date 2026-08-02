package ru.yandex.taxi.logistics.sdk.dashboard.ui.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/ui/state/ImagePositionState;", "", "TOP", "TRAIL", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImagePositionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImagePositionState[] $VALUES;
    public static final ImagePositionState TOP;
    public static final ImagePositionState TRAIL;

    static {
        ImagePositionState imagePositionState = new ImagePositionState("TOP", 0);
        TOP = imagePositionState;
        ImagePositionState imagePositionState2 = new ImagePositionState("TRAIL", 1);
        TRAIL = imagePositionState2;
        ImagePositionState[] imagePositionStateArr = {imagePositionState, imagePositionState2};
        $VALUES = imagePositionStateArr;
        $ENTRIES = a.a(imagePositionStateArr);
    }

    public static ImagePositionState valueOf(String str) {
        return (ImagePositionState) Enum.valueOf(ImagePositionState.class, str);
    }

    public static ImagePositionState[] values() {
        return (ImagePositionState[]) $VALUES.clone();
    }
}
