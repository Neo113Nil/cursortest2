package com.google.zxing.common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.common.audio.Sonic;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DecoderResult implements Sonic.SonicImpl {
    public Object byteSegments;
    public Serializable ecLevel;
    public Serializable errorsCorrected;
    public Object other;
    public int structuredAppendParity;
    public int structuredAppendSequenceNumber;
    public int symbologyModifier;
    public final Serializable text;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, short[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, short[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Serializable, short[]] */
    public DecoderResult(Sonic sonic) {
        this.other = sonic;
        int i = sonic.maxRequiredFrameCount;
        this.text = new short[i];
        int i2 = i * sonic.channelCount;
        this.ecLevel = new short[i2];
        this.byteSegments = new short[i2];
        this.errorsCorrected = new short[i2];
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public int bytesPerSample() {
        return 2;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void copyBufferToInputBuffer(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.ecLevel;
        Sonic sonic = (Sonic) this.other;
        asShortBuffer.get(sArr, sonic.inputFrameCount * sonic.channelCount, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void copyOutputToByteBuffer(int i, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.byteSegments;
        int i2 = ((Sonic) this.other).channelCount;
        asShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void downSampleInput(int i, int i2) {
        short[] sArr = (short[]) this.ecLevel;
        Sonic sonic = (Sonic) this.other;
        int i3 = sonic.maxRequiredFrameCount / i2;
        int i4 = sonic.channelCount;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[Boxes$$ExternalSyntheticOutline1.m(i7, i5, i6, i9)];
            }
            ((short[]) this.text)[i7] = (short) (i8 / i5);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void ensureAdditionalFramesInInputBuffer(int i) {
        this.ecLevel = ensureSpaceForAdditionalFrames((short[]) this.ecLevel, ((Sonic) this.other).inputFrameCount, i);
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void ensureAdditionalFramesInOutputBuffer(int i) {
        this.byteSegments = ensureSpaceForAdditionalFrames((short[]) this.byteSegments, ((Sonic) this.other).outputFrameCount, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, short[]] */
    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void ensureAdditionalFramesInPitchBuffer(int i) {
        this.errorsCorrected = ensureSpaceForAdditionalFrames((short[]) this.errorsCorrected, ((Sonic) this.other).pitchFrameCount, i);
    }

    public short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = ((Sonic) this.other).channelCount;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
        int i4 = i * ((Sonic) this.other).channelCount;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.structuredAppendParity = i6 / i7;
        this.structuredAppendSequenceNumber = i8 / i5;
        return i7;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2) {
        return findPitchPeriodInRange((short[]) this.text, 0, i, i2);
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
        return findPitchPeriodInRange((short[]) this.ecLevel, i, i2, i3);
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void flush() {
        this.symbologyModifier = 0;
        this.structuredAppendParity = 0;
        this.structuredAppendSequenceNumber = 0;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public Object getInputBuffer() {
        return (short[]) this.ecLevel;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public Object getOutputBuffer() {
        return (short[]) this.byteSegments;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public Object getPitchBuffer() {
        return (short[]) this.errorsCorrected;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void interpolateFrame(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            Sonic sonic = (Sonic) this.other;
            int i3 = sonic.channelCount;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = (short[]) this.byteSegments;
            int i4 = (sonic.outputFrameCount * i3) + i2;
            short[] sArr2 = (short[]) this.errorsCorrected;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = sonic.newRatePosition * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (sonic.oldRatePosition * j2);
            sArr[i4] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
            i2++;
        }
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public boolean isPreviousPeriodBetter() {
        int i = this.structuredAppendParity;
        return i != 0 && ((Sonic) this.other).prevPeriod != 0 && this.structuredAppendSequenceNumber <= i * 3 && i * 2 > this.symbologyModifier * 3;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void overlapAdd(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = (short[]) this.byteSegments;
        short[] sArr2 = (short[]) this.ecLevel;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) Recorder$$ExternalSyntheticOutline1.m(sArr2[i8], i10, (i - i10) * sArr2[i9], i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void updatePreviousMinDiff() {
        this.symbologyModifier = this.structuredAppendParity;
    }

    @Override // androidx.media3.common.audio.Sonic.SonicImpl
    public void zeroInputBuffer(int i, int i2) {
        for (int i3 = 0; i3 < ((Sonic) this.other).channelCount * i2; i3++) {
            ((short[]) this.ecLevel)[i + i3] = 0;
        }
    }

    public DecoderResult(byte[] bArr, String str, ArrayList arrayList, String str2, int i, int i2, int i3) {
        this.text = str;
        this.byteSegments = arrayList;
        this.ecLevel = str2;
        this.structuredAppendParity = i2;
        this.structuredAppendSequenceNumber = i;
        this.symbologyModifier = i3;
    }
}
