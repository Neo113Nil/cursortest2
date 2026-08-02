package androidx.media3.container;

/* loaded from: classes3.dex */
public final class NalUnitUtil$H265ProfileTierLevel {
    public final int[] constraintBytes;
    public final int generalLevelIdc;
    public final int generalProfileCompatibilityFlags;
    public final int generalProfileIdc;
    public final int generalProfileSpace;
    public final boolean generalTierFlag;

    public NalUnitUtil$H265ProfileTierLevel(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        this.generalProfileSpace = i;
        this.generalTierFlag = z;
        this.generalProfileIdc = i2;
        this.generalProfileCompatibilityFlags = i3;
        this.constraintBytes = iArr;
        this.generalLevelIdc = i4;
    }
}
