package defpackage;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusLeadImageWithOverlayImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardTimerDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class s301 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.values().length];
        try {
            iArr[TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.TopStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.TopEnd.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.BottomStart.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackingCardStatusLeadImageWithOverlayImageDto.OverlapCorner.BottomEnd.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[TrackingCardTimerDto.TimerType.values().length];
        try {
            iArr2[TrackingCardTimerDto.TimerType.Until.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TrackingCardTimerDto.TimerType.From.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[TrackingCardStatusSquareImageDto.Clipping.values().length];
        try {
            iArr3[TrackingCardStatusSquareImageDto.Clipping.RoundedSquare.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TrackingCardStatusSquareImageDto.Clipping.Circle.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
