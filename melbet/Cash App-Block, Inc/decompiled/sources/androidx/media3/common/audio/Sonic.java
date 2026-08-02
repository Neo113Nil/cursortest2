package androidx.media3.common.audio;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.zxing.common.DecoderResult;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Sonic {
    public double accumulatedSpeedAdjustmentError;
    public final int channelCount;
    public final SonicImpl impl;
    public int inputFrameCount;
    public final int inputSampleRateHz;
    public final int maxPeriod;
    public final int maxRequiredFrameCount;
    public final int minPeriod;
    public int newRatePosition;
    public int oldRatePosition;
    public int outputFrameCount;
    public final float pitch;
    public int pitchFrameCount;
    public int prevPeriod;
    public final float rate;
    public int remainingInputToCopyFrameCount;
    public final float speed;

    public final class SonicFloatImpl implements SonicImpl {
        public final float[] downSampleBuffer;
        public float[] inputBuffer;
        public double maxDiff;
        public double minDiff;
        public float[] outputBuffer;
        public float[] pitchBuffer;
        public double prevMinDiff;

        public SonicFloatImpl() {
            int i = Sonic.this.maxRequiredFrameCount;
            this.downSampleBuffer = new float[i];
            int i2 = i * Sonic.this.channelCount;
            this.inputBuffer = new float[i2];
            this.outputBuffer = new float[i2];
            this.pitchBuffer = new float[i2];
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int bytesPerSample() {
            return 4;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void copyBufferToInputBuffer(int i, ByteBuffer byteBuffer) {
            FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.inputBuffer;
            Sonic sonic = Sonic.this;
            asFloatBuffer.get(fArr, sonic.inputFrameCount * sonic.channelCount, i / 4);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void copyOutputToByteBuffer(int i, ByteBuffer byteBuffer) {
            FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.outputBuffer;
            int i2 = Sonic.this.channelCount;
            asFloatBuffer.put(fArr, 0, i * i2);
            byteBuffer.position((i * 4 * i2) + byteBuffer.position());
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void downSampleInput(int i, int i2) {
            Sonic sonic = Sonic.this;
            int i3 = sonic.maxRequiredFrameCount / i2;
            int i4 = sonic.channelCount;
            int i5 = i2 * i4;
            int i6 = i * i4;
            for (int i7 = 0; i7 < i3; i7++) {
                double d = 0.0d;
                for (int i8 = 0; i8 < i5; i8++) {
                    d += this.inputBuffer[Boxes$$ExternalSyntheticOutline1.m(i7, i5, i6, i8)];
                }
                this.downSampleBuffer[i7] = (float) (d / i5);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void ensureAdditionalFramesInInputBuffer(int i) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(Sonic.this.inputFrameCount, i, this.inputBuffer);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void ensureAdditionalFramesInOutputBuffer(int i) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(Sonic.this.outputFrameCount, i, this.outputBuffer);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void ensureAdditionalFramesInPitchBuffer(int i) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(Sonic.this.pitchFrameCount, i, this.pitchBuffer);
        }

        public final float[] ensureSpaceForAdditionalFrames(int i, int i2, float[] fArr) {
            int length = fArr.length;
            int i3 = Sonic.this.channelCount;
            int i4 = length / i3;
            return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
        }

        public final int findPitchPeriodInRange(float[] fArr, int i, int i2, int i3) {
            int i4 = Sonic.this.channelCount * i;
            double d = 1.0d;
            int i5 = 0;
            double d2 = 0.0d;
            int i6 = 255;
            int i7 = i2;
            while (i7 <= i3) {
                double d3 = 0.0d;
                for (int i8 = 0; i8 < i7; i8++) {
                    d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
                }
                int i9 = i4;
                double d4 = i7;
                if (i5 * d3 < d * d4) {
                    i5 = i7;
                    d = d3;
                }
                if (i6 * d3 > d4 * d2) {
                    i6 = i7;
                    d2 = d3;
                }
                i7++;
                i4 = i9;
            }
            this.minDiff = d / i5;
            this.maxDiff = d2 / i6;
            return i5;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2) {
            return findPitchPeriodInRange(this.downSampleBuffer, 0, i, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.inputBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void flush() {
            this.prevMinDiff = 0.0d;
            this.minDiff = 0.0d;
            this.maxDiff = 0.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final Object getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final Object getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final Object getPitchBuffer() {
            return this.pitchBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void interpolateFrame(int i, long j, long j2) {
            int i2 = 0;
            while (true) {
                Sonic sonic = Sonic.this;
                int i3 = sonic.channelCount;
                if (i2 >= i3) {
                    return;
                }
                float[] fArr = this.outputBuffer;
                int i4 = (sonic.outputFrameCount * i3) + i2;
                float[] fArr2 = this.pitchBuffer;
                int i5 = (i * i3) + i2;
                float f = fArr2[i5];
                float f2 = fArr2[i5 + i3];
                long j3 = sonic.newRatePosition * j;
                long j4 = (r1 + 1) * j2;
                long j5 = j4 - j3;
                fArr[i4] = (((r10 - j5) * f2) + (j5 * f)) / (j4 - (sonic.oldRatePosition * j2));
                i2++;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final boolean isPreviousPeriodBetter() {
            double d = this.minDiff;
            return d != 0.0d && Sonic.this.prevPeriod != 0 && this.maxDiff <= d * 3.0d && d * 2.0d > this.prevMinDiff * 3.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void overlapAdd(int i, int i2, int i3, int i4, int i5) {
            float[] fArr = this.outputBuffer;
            float[] fArr2 = this.inputBuffer;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public final void zeroInputBuffer(int i, int i2) {
            for (int i3 = 0; i3 < Sonic.this.channelCount * i2; i3++) {
                this.inputBuffer[i + i3] = 0.0f;
            }
        }
    }

    public interface SonicImpl {
        int bytesPerSample();

        void copyBufferToInputBuffer(int i, ByteBuffer byteBuffer);

        void copyOutputToByteBuffer(int i, ByteBuffer byteBuffer);

        void downSampleInput(int i, int i2);

        void ensureAdditionalFramesInInputBuffer(int i);

        void ensureAdditionalFramesInOutputBuffer(int i);

        void ensureAdditionalFramesInPitchBuffer(int i);

        int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2);

        int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3);

        void flush();

        Object getInputBuffer();

        Object getOutputBuffer();

        Object getPitchBuffer();

        void interpolateFrame(int i, long j, long j2);

        boolean isPreviousPeriodBetter();

        void overlapAdd(int i, int i2, int i3, int i4, int i5);

        void updatePreviousMinDiff();

        void zeroInputBuffer(int i, int i2);
    }

    public Sonic(int i, int i2, float f, float f2, int i3, boolean z) {
        this.inputSampleRateHz = i;
        this.channelCount = i2;
        this.speed = f;
        this.pitch = f2;
        this.rate = i / i3;
        this.minPeriod = i / 400;
        int i4 = i / 65;
        this.maxPeriod = i4;
        this.maxRequiredFrameCount = i4 * 2;
        this.impl = z ? new SonicFloatImpl() : new DecoderResult(this);
    }

    public final void copyToOutput(int i, int i2) {
        SonicImpl sonicImpl = this.impl;
        sonicImpl.ensureAdditionalFramesInOutputBuffer(i2);
        Object inputBuffer = sonicImpl.getInputBuffer();
        int i3 = this.channelCount;
        System.arraycopy(inputBuffer, i * i3, sonicImpl.getOutputBuffer(), this.outputFrameCount * i3, i3 * i2);
        this.outputFrameCount += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void processStreamInput() {
        float f;
        int i;
        double d;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        int i9 = this.outputFrameCount;
        float f2 = this.speed;
        float f3 = this.pitch;
        double d2 = f2 / f3;
        float f4 = this.rate * f3;
        int i10 = this.inputSampleRateHz;
        int i11 = 1;
        SonicImpl sonicImpl = this.impl;
        int i12 = this.channelCount;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i13 = this.inputFrameCount;
            int i14 = this.maxRequiredFrameCount;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.remainingInputToCopyFrameCount;
                    if (i16 > 0) {
                        int min = Math.min(i14, i16);
                        copyToOutput(i15, min);
                        this.remainingInputToCopyFrameCount -= min;
                        i15 += min;
                        f = f4;
                        d = d2;
                        i4 = i11;
                        i2 = i14;
                    } else {
                        int i17 = i10 > 4000 ? i10 / 4000 : i11;
                        int i18 = this.maxPeriod;
                        int i19 = this.minPeriod;
                        if (i12 == i11 && i17 == i11) {
                            i = sonicImpl.findPitchPeriodInRangeWithInputBuffer(i15, i19, i18);
                            f = f4;
                        } else {
                            sonicImpl.downSampleInput(i15, i17);
                            f = f4;
                            int findPitchPeriodInRangeWithDownsampleBuffer = sonicImpl.findPitchPeriodInRangeWithDownsampleBuffer(i19 / i17, i18 / i17);
                            if (i17 != i11) {
                                int i20 = findPitchPeriodInRangeWithDownsampleBuffer * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i12 == i11) {
                                    i = sonicImpl.findPitchPeriodInRangeWithInputBuffer(i15, i19, i18);
                                } else {
                                    sonicImpl.downSampleInput(i15, i11);
                                    i = sonicImpl.findPitchPeriodInRangeWithDownsampleBuffer(i19, i18);
                                }
                            } else {
                                i = findPitchPeriodInRangeWithDownsampleBuffer;
                            }
                        }
                        int i24 = sonicImpl.isPreviousPeriodBetter() ? this.prevPeriod : i;
                        sonicImpl.updatePreviousMinDiff();
                        this.prevPeriod = i;
                        double d3 = this.accumulatedSpeedAdjustmentError;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i5 = i11;
                                double d4 = (i24 / (d2 - 1.0d)) + d3;
                                i6 = (int) Math.round(d4);
                                d = d2;
                                this.accumulatedSpeedAdjustmentError = d4 - i6;
                                sonicImpl = sonicImpl;
                            } else {
                                d = d2;
                                i5 = i11;
                                double d5 = (((2.0d - d) * i24) / (d - 1.0d)) + d3;
                                int round = (int) Math.round(d5);
                                this.remainingInputToCopyFrameCount = round;
                                this.accumulatedSpeedAdjustmentError = d5 - round;
                                i6 = i24;
                            }
                            sonicImpl.ensureAdditionalFramesInOutputBuffer(i6);
                            int i25 = i14;
                            int i26 = i6;
                            sonicImpl.overlapAdd(i26, this.channelCount, this.outputFrameCount, i15, i15 + i24);
                            this.outputFrameCount += i26;
                            i15 = i24 + i26 + i15;
                            i2 = i25;
                            i4 = i5;
                        } else {
                            d = d2;
                            int i27 = i11;
                            int i28 = i14;
                            if (d < 0.5d) {
                                i2 = i28;
                                double d6 = ((i24 * d) / (1.0d - d)) + d3;
                                i3 = (int) Math.round(d6);
                                this.accumulatedSpeedAdjustmentError = d6 - i3;
                            } else {
                                i2 = i28;
                                double d7 = ((((2.0d * d) - 1.0d) * i24) / (1.0d - d)) + d3;
                                int round2 = (int) Math.round(d7);
                                this.remainingInputToCopyFrameCount = round2;
                                this.accumulatedSpeedAdjustmentError = d7 - round2;
                                i3 = i24;
                            }
                            int i29 = i24 + i3;
                            sonicImpl.ensureAdditionalFramesInOutputBuffer(i29);
                            i4 = i27;
                            System.arraycopy(sonicImpl.getInputBuffer(), i15 * i12, sonicImpl.getOutputBuffer(), this.outputFrameCount * i12, i24 * i12);
                            int i30 = i15;
                            sonicImpl.overlapAdd(i3, this.channelCount, this.outputFrameCount + i24, i24 + i15, i30);
                            this.outputFrameCount += i29;
                            i15 = i30 + i3;
                        }
                    }
                    if (i15 + i2 > i13) {
                        break;
                    }
                    i14 = i2;
                    f4 = f;
                    i11 = i4;
                    d2 = d;
                }
                int i31 = this.inputFrameCount - i15;
                System.arraycopy(sonicImpl.getInputBuffer(), i15 * i12, sonicImpl.getInputBuffer(), 0, i31 * i12);
                this.inputFrameCount = i31;
                if (f != 1.0f || this.outputFrameCount == i9) {
                }
                long j3 = (long) (i10 / f);
                long j4 = i10;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i32 = this.outputFrameCount - i9;
                sonicImpl.ensureAdditionalFramesInPitchBuffer(i32);
                System.arraycopy(sonicImpl.getOutputBuffer(), i9 * i12, sonicImpl.getPitchBuffer(), this.pitchFrameCount * i12, i32 * i12);
                this.outputFrameCount = i9;
                this.pitchFrameCount += i32;
                int i33 = 0;
                while (true) {
                    i7 = this.pitchFrameCount - 1;
                    if (i33 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.oldRatePosition + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.newRatePosition;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        int i34 = i4;
                        sonicImpl.ensureAdditionalFramesInOutputBuffer(i34);
                        sonicImpl.interpolateFrame(i33, j4, j3);
                        this.newRatePosition += i34;
                        this.outputFrameCount += i34;
                    }
                    int i35 = i4;
                    this.oldRatePosition = i8;
                    if (j == j4) {
                        this.oldRatePosition = 0;
                        Trace.checkState(j2 == j3 ? i35 : 0);
                        this.newRatePosition = 0;
                    }
                    i33++;
                    i4 = i35;
                }
                if (i7 == 0) {
                    return;
                }
                System.arraycopy(sonicImpl.getPitchBuffer(), i7 * i12, sonicImpl.getPitchBuffer(), 0, (this.pitchFrameCount - i7) * i12);
                this.pitchFrameCount -= i7;
                return;
            }
        } else {
            copyToOutput(0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        f = f4;
        i4 = 1;
        if (f != 1.0f) {
        }
    }
}
