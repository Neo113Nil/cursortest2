package androidx.media3.container;

/* loaded from: classes3.dex */
public final class NalUnitUtil$SpsData {
    public final int bitDepthChromaMinus8;
    public final int bitDepthLumaMinus8;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int constraintsFlagsAndReservedZero2Bits;
    public final boolean deltaPicOrderAlwaysZeroFlag;
    public final boolean frameMbsOnlyFlag;
    public final int frameNumLength;
    public final int height;
    public final int levelIdc;
    public final int maxNumReorderFrames;
    public final int picOrderCntLsbLength;
    public final int picOrderCountType;
    public final float pixelWidthHeightRatio;
    public final int profileIdc;
    public final boolean separateColorPlaneFlag;
    public final int seqParameterSetId;
    public final int width;

    public NalUnitUtil$SpsData(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
        this.profileIdc = i;
        this.constraintsFlagsAndReservedZero2Bits = i2;
        this.levelIdc = i3;
        this.seqParameterSetId = i4;
        this.width = i5;
        this.height = i6;
        this.pixelWidthHeightRatio = f;
        this.bitDepthLumaMinus8 = i7;
        this.bitDepthChromaMinus8 = i8;
        this.separateColorPlaneFlag = z;
        this.frameMbsOnlyFlag = z2;
        this.frameNumLength = i9;
        this.picOrderCountType = i10;
        this.picOrderCntLsbLength = i11;
        this.deltaPicOrderAlwaysZeroFlag = z3;
        this.colorSpace = i12;
        this.colorRange = i13;
        this.colorTransfer = i14;
        this.maxNumReorderFrames = i15;
    }
}
