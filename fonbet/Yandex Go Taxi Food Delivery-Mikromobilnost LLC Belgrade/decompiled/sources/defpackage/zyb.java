package defpackage;

import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PointsVisiblePriorityDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class zyb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointsVisiblePriorityDto.values().length];
        try {
            iArr[PointsVisiblePriorityDto.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointsVisiblePriorityDto.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointsVisiblePriorityDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
