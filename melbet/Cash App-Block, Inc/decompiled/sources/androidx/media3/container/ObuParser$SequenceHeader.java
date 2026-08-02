package androidx.media3.container;

import androidx.media3.extractor.VorbisBitArray;
import androidx.tracing.Trace;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ObuParser$SequenceHeader {
    public final int chromaSamplePosition;
    public final byte colorPrimaries;
    public final boolean decoderModelInfoPresentFlag;
    public final boolean frameIdNumbersPresentFlag;
    public final boolean highBitdepth;
    public final int initialDisplayDelayMinus1;
    public final boolean initialDisplayDelayPresentFlag;
    public final byte matrixCoefficients;
    public final boolean monochrome;
    public final int orderHintBits;
    public final boolean reducedStillPictureHeader;
    public final boolean seqForceIntegerMv;
    public final boolean seqForceScreenContentTools;
    public final int seqLevelIdx0;
    public final int seqProfile;
    public final int seqTier0;
    public final boolean subsamplingX;
    public final boolean subsamplingY;
    public final byte transferCharacteristics;
    public final boolean twelveBit;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public ObuParser$SequenceHeader(ObuParser$Obu obuParser$Obu) {
        int i;
        int i2;
        boolean z;
        ?? r8;
        int i3 = obuParser$Obu.f873type;
        ByteBuffer byteBuffer = obuParser$Obu.payload;
        Trace.checkArgument(i3 == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, remaining);
        this.seqProfile = vorbisBitArray.readBits(3);
        vorbisBitArray.skipBit();
        boolean readBit = vorbisBitArray.readBit();
        this.reducedStillPictureHeader = readBit;
        if (readBit) {
            i2 = vorbisBitArray.readBits(5);
            this.decoderModelInfoPresentFlag = false;
            this.initialDisplayDelayPresentFlag = false;
            r8 = 0;
            i = 0;
        } else {
            if (vorbisBitArray.readBit()) {
                vorbisBitArray.skipBits(64);
                if (vorbisBitArray.readBit()) {
                    int i4 = 0;
                    while (!vorbisBitArray.readBit()) {
                        i4++;
                    }
                    if (i4 < 32) {
                        vorbisBitArray.skipBits(i4);
                    }
                }
                boolean readBit2 = vorbisBitArray.readBit();
                this.decoderModelInfoPresentFlag = readBit2;
                if (readBit2) {
                    vorbisBitArray.skipBits(47);
                }
            } else {
                this.decoderModelInfoPresentFlag = false;
            }
            this.initialDisplayDelayPresentFlag = vorbisBitArray.readBit();
            int readBits = vorbisBitArray.readBits(5);
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            i = 0;
            while (i6 <= readBits) {
                vorbisBitArray.skipBits(12);
                if (i6 == 0) {
                    i5 = vorbisBitArray.readBits(5);
                    z = z2;
                    if (i5 > 7) {
                        z = vorbisBitArray.readBit();
                    }
                } else {
                    z = z2;
                    if (vorbisBitArray.readBits(5) > 7) {
                        vorbisBitArray.skipBit();
                        z = z2;
                    }
                }
                if (this.decoderModelInfoPresentFlag) {
                    vorbisBitArray.skipBit();
                }
                if (this.initialDisplayDelayPresentFlag && vorbisBitArray.readBit()) {
                    if (i6 == 0) {
                        i = vorbisBitArray.readBits(4);
                    } else {
                        vorbisBitArray.skipBits(4);
                    }
                }
                i6++;
                z2 = z;
            }
            i2 = i5;
            r8 = z2;
        }
        int readBits2 = vorbisBitArray.readBits(4);
        int readBits3 = vorbisBitArray.readBits(4);
        vorbisBitArray.skipBits(readBits2 + 1);
        vorbisBitArray.skipBits(readBits3 + 1);
        if (this.reducedStillPictureHeader) {
            this.frameIdNumbersPresentFlag = false;
        } else {
            this.frameIdNumbersPresentFlag = vorbisBitArray.readBit();
        }
        if (this.frameIdNumbersPresentFlag) {
            vorbisBitArray.skipBits(4);
            vorbisBitArray.skipBits(3);
        }
        vorbisBitArray.skipBits(3);
        if (this.reducedStillPictureHeader) {
            this.seqForceIntegerMv = true;
            this.seqForceScreenContentTools = true;
            this.orderHintBits = 0;
        } else {
            vorbisBitArray.skipBits(4);
            boolean readBit3 = vorbisBitArray.readBit();
            if (readBit3) {
                vorbisBitArray.skipBits(2);
            }
            if (vorbisBitArray.readBit()) {
                this.seqForceScreenContentTools = true;
            } else {
                this.seqForceScreenContentTools = vorbisBitArray.readBit();
            }
            if (!this.seqForceScreenContentTools) {
                this.seqForceIntegerMv = true;
            } else if (vorbisBitArray.readBit()) {
                this.seqForceIntegerMv = true;
            } else {
                this.seqForceIntegerMv = vorbisBitArray.readBit();
            }
            if (readBit3) {
                this.orderHintBits = vorbisBitArray.readBits(3) + 1;
            } else {
                this.orderHintBits = 0;
            }
        }
        this.seqLevelIdx0 = i2;
        this.seqTier0 = r8;
        this.initialDisplayDelayMinus1 = i;
        vorbisBitArray.skipBits(3);
        boolean readBit4 = vorbisBitArray.readBit();
        this.highBitdepth = readBit4;
        if (this.seqProfile == 2 && readBit4) {
            this.twelveBit = vorbisBitArray.readBit();
        } else {
            this.twelveBit = false;
        }
        if (this.seqProfile != 1) {
            this.monochrome = vorbisBitArray.readBit();
        } else {
            this.monochrome = false;
        }
        if (vorbisBitArray.readBit()) {
            this.colorPrimaries = (byte) vorbisBitArray.readBits(8);
            this.transferCharacteristics = (byte) vorbisBitArray.readBits(8);
            this.matrixCoefficients = (byte) vorbisBitArray.readBits(8);
        } else {
            this.colorPrimaries = (byte) 0;
            this.transferCharacteristics = (byte) 0;
            this.matrixCoefficients = (byte) 0;
        }
        if (this.monochrome) {
            vorbisBitArray.skipBit();
            this.subsamplingX = false;
            this.subsamplingY = false;
            this.chromaSamplePosition = 0;
        } else if (this.colorPrimaries == 1 && this.transferCharacteristics == 13 && this.matrixCoefficients == 0) {
            this.subsamplingX = false;
            this.subsamplingY = false;
            this.chromaSamplePosition = 0;
        } else {
            vorbisBitArray.skipBit();
            int i7 = this.seqProfile;
            if (i7 == 0) {
                this.subsamplingX = true;
                this.subsamplingY = true;
            } else if (i7 == 1) {
                this.subsamplingX = false;
                this.subsamplingY = false;
            } else if (this.twelveBit) {
                boolean readBit5 = vorbisBitArray.readBit();
                this.subsamplingX = readBit5;
                if (readBit5) {
                    this.subsamplingY = vorbisBitArray.readBit();
                } else {
                    this.subsamplingY = false;
                }
            } else {
                this.subsamplingX = true;
                this.subsamplingY = false;
            }
            if (this.subsamplingX && this.subsamplingY) {
                this.chromaSamplePosition = vorbisBitArray.readBits(2);
            } else {
                this.chromaSamplePosition = 0;
            }
        }
        vorbisBitArray.skipBit();
    }
}
