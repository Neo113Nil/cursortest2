package app.cash.redwood.yoga.internal;

import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import app.cash.redwood.yoga.internal.detail.StyleEnumFlagsKey;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class YGLayout {
    public static final int hadOverflowOffset = GlobalMembers.bitWidthFn(YGDirection.values()) + 2;
    public final float[] border;
    public final YGCachedMeasurement cachedLayout;
    public final ArrayList cachedMeasurements;
    public float computedFlexBasis;
    public final float[] dimensions;
    public final LinkedHashMap flags = new LinkedHashMap();
    public int generationCount;
    public YGDirection lastOwnerDirection;
    public final float[] margin;
    public final float[] measuredDimensions;
    public int nextCachedMeasurementsIndex;
    public final float[] padding;
    public final float[] position;

    public YGLayout() {
        float[] fArr = new float[4];
        for (int i = 0; i < 4; i++) {
            fArr[i] = 0.0f;
        }
        this.position = fArr;
        float[] fArr2 = new float[2];
        for (int i2 = 0; i2 < 2; i2++) {
            fArr2[i2] = Float.NaN;
        }
        this.dimensions = fArr2;
        float[] fArr3 = new float[4];
        for (int i3 = 0; i3 < 4; i3++) {
            fArr3[i3] = 0.0f;
        }
        this.margin = fArr3;
        float[] fArr4 = new float[4];
        for (int i4 = 0; i4 < 4; i4++) {
            fArr4[i4] = 0.0f;
        }
        this.border = fArr4;
        float[] fArr5 = new float[4];
        for (int i5 = 0; i5 < 4; i5++) {
            fArr5[i5] = 0.0f;
        }
        this.padding = fArr5;
        ArrayList arrayList = new ArrayList(8);
        for (int i6 = 0; i6 < 8; i6++) {
            arrayList.add(new YGCachedMeasurement());
        }
        this.cachedMeasurements = arrayList;
        float[] fArr6 = new float[2];
        for (int i7 = 0; i7 < 2; i7++) {
            fArr6[i7] = Float.NaN;
        }
        this.measuredDimensions = fArr6;
        this.cachedLayout = new YGCachedMeasurement();
        this.computedFlexBasis = Float.NaN;
        this.lastOwnerDirection = YGDirection.YGDirectionInherit;
    }

    public final YGDirection direction() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGDirection.class);
        YGDirection[] values = YGDirection.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(0, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGDirection) ((Enum) obj);
    }

    public final float[] getMeasuredDimensions() {
        return this.measuredDimensions;
    }

    public final boolean hadOverflow() {
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(Integer.valueOf(hadOverflowOffset));
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }
}
