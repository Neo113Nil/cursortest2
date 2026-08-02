package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final class GridConfig {
    public final int cardCount;
    public final float cardHeight;
    public final float cardWidth;
    public final float farStepX;
    public final float farStepY;
    public final float mediumStepX;
    public final float mediumStepY;
    public final int rows;
    public final int[] tileCards;

    public GridConfig(int i, float f, float f2, int i2, float f3, float f4, float f5, float f6) {
        int[] iArr;
        this.rows = i;
        this.cardWidth = f;
        this.cardHeight = f2;
        this.cardCount = i2;
        this.farStepX = f3;
        this.farStepY = f4;
        this.mediumStepX = f5;
        this.mediumStepY = f6;
        int i3 = i * 4;
        if (i2 <= 0 || i3 <= 0) {
            iArr = new int[0];
        } else {
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = -1;
            }
            int i5 = i2 > i3 ? i3 : i2;
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = i6;
            }
            List list = CollectionsKt.toList(RangesKt___RangesKt.until(i2, i3));
            if (!list.isEmpty()) {
                int size = list.size();
                int[] iArr2 = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr2[i7] = -1;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= list.size()) {
                        break;
                    }
                    int intValue = ((Number) list.get(i8)).intValue();
                    HashSet hashSet = new HashSet();
                    for (int i9 : GridLayout.brickNeighborSlots(intValue / 4, intValue % 4, i)) {
                        int i10 = iArr[i9];
                        if (i10 >= 0) {
                            hashSet.add(Integer.valueOf(i10));
                        }
                    }
                    int i11 = iArr2[i8];
                    while (true) {
                        i11++;
                        if (i11 < i2) {
                            if (!hashSet.contains(Integer.valueOf(i11))) {
                                break;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 < 0) {
                        iArr2[i8] = -1;
                        iArr[intValue] = -1;
                        i8--;
                        if (i8 < 0) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                int intValue2 = ((Number) it.next()).intValue();
                                HashMap hashMap = new HashMap();
                                for (int i12 : GridLayout.brickNeighborSlots(intValue2 / 4, intValue2 % 4, i)) {
                                    int i13 = iArr[i12];
                                    if (i13 >= 0) {
                                        Integer valueOf = Integer.valueOf(i13);
                                        Integer num = (Integer) hashMap.get(Integer.valueOf(i13));
                                        hashMap.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                    }
                                }
                                int i14 = Integer.MAX_VALUE;
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i15 >= i2) {
                                        i15 = i16;
                                        break;
                                    }
                                    Integer num2 = (Integer) hashMap.get(Integer.valueOf(i15));
                                    int intValue3 = num2 != null ? num2.intValue() : 0;
                                    if (intValue3 < i14) {
                                        if (intValue3 != 0) {
                                            i16 = i15;
                                            i14 = intValue3;
                                        }
                                    }
                                    i15++;
                                }
                                iArr[intValue2] = i15;
                            }
                        } else {
                            iArr[((Number) list.get(i8)).intValue()] = -1;
                        }
                    } else {
                        iArr[intValue] = i11;
                        iArr2[i8] = i11;
                        i8++;
                    }
                }
            }
        }
        this.tileCards = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridConfig)) {
            return false;
        }
        GridConfig gridConfig = (GridConfig) obj;
        return this.rows == gridConfig.rows && Float.compare(this.cardWidth, gridConfig.cardWidth) == 0 && Float.compare(this.cardHeight, gridConfig.cardHeight) == 0 && this.cardCount == gridConfig.cardCount && Float.compare(this.farStepX, gridConfig.farStepX) == 0 && Float.compare(this.farStepY, gridConfig.farStepY) == 0 && Float.compare(this.mediumStepX, gridConfig.mediumStepX) == 0 && Float.compare(this.mediumStepY, gridConfig.mediumStepY) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.mediumStepY) + CameraState$Type$EnumUnboxingLocalUtility.m(this.mediumStepX, CameraState$Type$EnumUnboxingLocalUtility.m(this.farStepY, CameraState$Type$EnumUnboxingLocalUtility.m(this.farStepX, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cardCount, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardHeight, CameraState$Type$EnumUnboxingLocalUtility.m(this.cardWidth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rows, Integer.hashCode(4) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridConfig(columns=4, rows=");
        sb.append(this.rows);
        sb.append(", cardWidth=");
        sb.append(this.cardWidth);
        sb.append(", cardHeight=");
        sb.append(this.cardHeight);
        sb.append(", cardCount=");
        sb.append(this.cardCount);
        sb.append(", farStepX=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.farStepX, ", farStepY=", this.farStepY, ", mediumStepX=");
        sb.append(this.mediumStepX);
        sb.append(", mediumStepY=");
        sb.append(this.mediumStepY);
        sb.append(")");
        return sb.toString();
    }
}
