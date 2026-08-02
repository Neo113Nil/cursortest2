package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vok0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardItemDto$Timeline.TimelineType.values().length];
        try {
            iArr[RideCardItemDto$Timeline.TimelineType.HORIZONTAL_REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardItemDto$Timeline.TimelineType.HORIZONTAL_COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
