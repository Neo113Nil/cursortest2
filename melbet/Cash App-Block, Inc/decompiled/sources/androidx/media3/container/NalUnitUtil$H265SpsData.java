package androidx.media3.container;

/* loaded from: classes3.dex */
public final class NalUnitUtil$H265SpsData {
    public final int bitDepthChromaMinus8;
    public final int bitDepthLumaMinus8;
    public final int chromaFormatIdc;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final int height;
    public final int maxNumReorderPics;
    public final int maxSubLayersMinus1;
    public final float pixelWidthHeightRatio;
    public final NalUnitUtil$H265ProfileTierLevel profileTierLevel;
    public final int width;

    public NalUnitUtil$H265SpsData(int i, NalUnitUtil$H265ProfileTierLevel nalUnitUtil$H265ProfileTierLevel, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, int i10, int i11, int i12) {
        this.maxSubLayersMinus1 = i;
        this.profileTierLevel = nalUnitUtil$H265ProfileTierLevel;
        this.chromaFormatIdc = i2;
        this.bitDepthLumaMinus8 = i3;
        this.bitDepthChromaMinus8 = i4;
        this.width = i5;
        this.height = i6;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i9;
        this.colorSpace = i10;
        this.colorRange = i11;
        this.colorTransfer = i12;
        this.decodedWidth = i7;
        this.decodedHeight = i8;
    }
}
