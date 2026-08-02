package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rup0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServiceLevel.SearchingPulsarDTO.SearchingPulsar.values().length];
        try {
            iArr[ServiceLevel.SearchingPulsarDTO.SearchingPulsar.TWO_CIRCLES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServiceLevel.SearchingPulsarDTO.SearchingPulsar.WIDE_CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
