package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MeasuringIntrinsics$IntrinsicMinMax {
    public static final /* synthetic */ MeasuringIntrinsics$IntrinsicMinMax[] $VALUES;
    public static final MeasuringIntrinsics$IntrinsicMinMax Max;
    public static final MeasuringIntrinsics$IntrinsicMinMax Min;

    static {
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = new MeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        Min = measuringIntrinsics$IntrinsicMinMax;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax2 = new MeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        Max = measuringIntrinsics$IntrinsicMinMax2;
        $VALUES = new MeasuringIntrinsics$IntrinsicMinMax[]{measuringIntrinsics$IntrinsicMinMax, measuringIntrinsics$IntrinsicMinMax2};
    }

    public static MeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(MeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (MeasuringIntrinsics$IntrinsicMinMax[]) $VALUES.clone();
    }
}
