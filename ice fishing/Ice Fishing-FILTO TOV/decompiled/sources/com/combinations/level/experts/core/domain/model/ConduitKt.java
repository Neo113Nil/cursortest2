package com.combinations.level.experts.core.domain.model;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ConduitKt {
    public static final boolean hasSide(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final int orientationCount(int i) {
        for (int i2 = 1; i2 < 4; i2++) {
            if (rotateCw(i, i2) == (i & 15)) {
                return i2;
            }
        }
        return 4;
    }

    public static final int rotateCw(int i, int i2) {
        int i3 = ((i2 % 4) + 4) % 4;
        if (i3 == 0) {
            return i & 15;
        }
        int i4 = i & 15;
        return ((i4 >> (4 - i3)) | (i4 << i3)) & 15;
    }

    public static /* synthetic */ int rotateCw$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        return rotateCw(i, i2);
    }

    public static final ConduitShape shape(int i) {
        int i2 = i & 15;
        int bitCount = Integer.bitCount(i2);
        return bitCount != 0 ? bitCount != 1 ? bitCount != 2 ? bitCount != 3 ? ConduitShape.CROSS : ConduitShape.TEE : (i2 == 5 || i2 == 10) ? ConduitShape.STRAIGHT : ConduitShape.ELBOW : ConduitShape.TERMINAL : ConduitShape.EMPTY;
    }

    public static final int turnsTo(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            if (rotateCw(i, i3) == (i2 & 15)) {
                return i3;
            }
        }
        return -1;
    }
}
