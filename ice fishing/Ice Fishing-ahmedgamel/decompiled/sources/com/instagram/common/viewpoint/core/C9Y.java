package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9Y {
    public static String[] A0M = {"T7VAgrMlNjunoCY92EX", "RGUT9owbnhx8phDbzrCYMg", "CVNC8QX", "fBdqcrRV46KfIZmPA23V4p", "8FvZMHzhr", "kMgSgwu", "1eJdCrNjGcKHTUWf60z", "EzFxZEW8JHF4ThmiFQVxs9z"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C9Y(int i, int i6, float f3, float f9, int i9) {
        this.A0H = i;
        this.A0G = i6;
        this.A0F = f3;
        this.A0D = f9;
        this.A0E = i / i9;
        this.A0K = i / 400;
        this.A0I = i / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i6];
        this.A0B = new short[this.A0J * i6];
        this.A0C = new short[this.A0J * i6];
    }

    private int A00(int i) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i) {
        int minP;
        int maxP;
        int i6 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int i9 = this.A0G;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[5] = "ihqHcMR";
        if (i9 == 1 && i6 == 1) {
            int i10 = this.A0K;
            int skip = this.A0I;
            minP = A04(sArr, i, i10, skip);
        } else {
            A0E(sArr, i, i6);
            short[] sArr2 = this.A0L;
            int i11 = this.A0K / i6;
            int skip2 = this.A0I;
            minP = A04(sArr2, 0, i11, skip2 / i6);
            if (i6 != 1) {
                int minP2 = minP * i6;
                int skip3 = i6 * 4;
                int period = minP2 - skip3;
                int i12 = (i6 * 4) + minP2;
                int skip4 = this.A0K;
                if (period < skip4) {
                    period = this.A0K;
                }
                int skip5 = this.A0I;
                if (i12 > skip5) {
                    i12 = this.A0I;
                }
                int skip6 = this.A0G;
                if (skip6 == 1) {
                    minP = A04(sArr, i, period, i12);
                } else {
                    A0E(sArr, i, 1);
                    minP = A04(this.A0L, 0, period, i12);
                }
            }
        }
        int period2 = this.A02;
        int skip7 = this.A01;
        if (A0F(period2, skip7)) {
            maxP = this.A08;
        } else {
            maxP = minP;
        }
        int skip8 = this.A02;
        this.A07 = skip8;
        if (A0M[5].length() != 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[6] = "cTOoGT7MMdDrVmklJ8r";
        strArr[0] = "keLDEQoIXNVpWb6w58r";
        this.A08 = minP;
        return maxP;
    }

    private int A02(short[] sArr, int i, float f3, int i6) {
        int i9;
        if (f3 < 0.5f) {
            i9 = (int) ((i6 * f3) / (1.0f - f3));
        } else {
            i9 = i6;
            int newFrameCount = (int) ((i6 * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i6 + i9;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount2);
        int i10 = this.A0G * i;
        short[] sArr2 = this.A0B;
        int i11 = this.A05;
        int newFrameCount3 = this.A0G;
        int i12 = i11 * newFrameCount3;
        int newFrameCount4 = this.A0G;
        System.arraycopy(sArr, i10, sArr2, i12, newFrameCount4 * i6);
        A0C(i9, this.A0G, this.A0B, this.A05 + i6, sArr, i + i6, sArr, i);
        int newFrameCount5 = this.A05;
        this.A05 = newFrameCount5 + i6 + i9;
        return i9;
    }

    private int A03(short[] sArr, int i, float f3, int i6) {
        int newFrameCount;
        if (f3 >= 2.0f) {
            newFrameCount = (int) (i6 / (f3 - 1.0f));
        } else {
            this.A09 = (int) ((i6 * (2.0f - f3)) / (f3 - 1.0f));
            newFrameCount = i6;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i, sArr, i + i6);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i, int i6, int i9) {
        int i10 = 0;
        int i11 = p.f8473b;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i12 = i * bestPeriod;
        while (i6 <= i9) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i6; minDiff++) {
                int bestPeriod2 = i12 + minDiff;
                short s9 = sArr[bestPeriod2];
                int bestPeriod3 = i12 + i6;
                int worstPeriod = s9 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i10;
            int bestPeriod5 = period * i6;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i10 = i6;
            }
            int worstPeriod3 = diff * i11;
            int bestPeriod6 = maxDiff * i6;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i11 = i6;
            }
            i6++;
        }
        this.A02 = period / i10;
        this.A01 = maxDiff / i11;
        return i10;
    }

    private short A05(short[] sArr, int i, int i6, int i9) {
        short s9 = sArr[i];
        short s10 = sArr[this.A0G + i];
        int leftPosition = this.A03 * i6;
        int i10 = this.A04 * i9;
        int position = (this.A04 + 1) * i9;
        int i11 = position - leftPosition;
        int position2 = position - i10;
        short left = (short) (((i11 * s9) + ((position2 - i11) * s10)) / position2);
        return left;
    }

    private void A06() {
        int i = this.A05;
        float f3 = this.A0F / this.A0D;
        float f9 = this.A0E * this.A0D;
        if (f3 > 1.00001d || f3 < 0.99999d) {
            A07(f3);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f9 != 1.0f) {
            A08(f9, i);
        }
    }

    private void A07(float f3) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i = this.A00;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[4] = "1EAucAhfj";
        int i6 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i6);
                i6 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i6);
                if (f3 > 1.0d) {
                    int frameCount4 = A03(this.A0A, i6, f3, A01);
                    i6 += frameCount4 + A01;
                } else {
                    int A02 = A02(this.A0A, i6, f3, A01);
                    int positionFrames = A0M[4].length();
                    if (positionFrames != 9) {
                        i6 += A02;
                    } else {
                        String[] strArr = A0M;
                        strArr[7] = "LI3iTvxeiLHfC3eQqEyHhGd";
                        strArr[2] = "DQqtHf8";
                        i6 += A02;
                    }
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i6 <= i);
        A0B(i6);
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0070 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(float f3, int i) {
        if (this.A05 == i) {
            return;
        }
        int i6 = (int) (this.A0H / f3);
        int i9 = this.A0H;
        while (true) {
            if (i6 > 16384 || i9 > 16384) {
                i6 /= 2;
                int oldSampleRate = A0M[4].length();
                if (oldSampleRate != 9) {
                    break;
                }
                A0M[4] = "8yLWj9SnB";
                i9 /= 2;
            } else {
                A09(i);
                String[] strArr = A0M;
                String str = strArr[3];
                String str2 = strArr[1];
                int oldSampleRate2 = str.length();
                int newSampleRate = str2.length();
                if (oldSampleRate2 == newSampleRate) {
                    String[] strArr2 = A0M;
                    strArr2[3] = "6iwvuS4pXw8rJ8Q1q7RXek";
                    strArr2[1] = "P2j6LGlMYimVuvOXYheyMm";
                    int newSampleRate2 = 0;
                    while (true) {
                        int oldSampleRate3 = this.A06;
                        if (newSampleRate2 < oldSampleRate3 - 1) {
                            while (true) {
                                int position = this.A04;
                                int position2 = (position + 1) * i6;
                                int oldSampleRate4 = this.A03;
                                if (position2 <= oldSampleRate4 * i9) {
                                    break;
                                }
                                short[] sArr = this.A0B;
                                int oldSampleRate5 = this.A05;
                                this.A0B = A0G(sArr, oldSampleRate5, 1);
                                for (int i10 = 0; i10 < oldSampleRate; i10++) {
                                    short[] sArr2 = this.A0B;
                                    int i11 = this.A05;
                                    int oldSampleRate6 = this.A0G;
                                    int i12 = (i11 * oldSampleRate6) + i10;
                                    short[] sArr3 = this.A0C;
                                    int oldSampleRate7 = this.A0G;
                                    sArr2[i12] = A05(sArr3, (oldSampleRate7 * newSampleRate2) + i10, i9, i6);
                                }
                                int oldSampleRate8 = this.A03;
                                this.A03 = oldSampleRate8 + 1;
                                int oldSampleRate9 = this.A05;
                                this.A05 = oldSampleRate9 + 1;
                            }
                            int oldSampleRate10 = this.A04;
                            this.A04 = oldSampleRate10 + 1;
                            int oldSampleRate11 = this.A04;
                            if (oldSampleRate11 == i9) {
                                this.A04 = 0;
                                int oldSampleRate12 = this.A03;
                                AbstractC06243y.A08(oldSampleRate12 == i6);
                                this.A03 = 0;
                            }
                            newSampleRate2++;
                        } else {
                            int newSampleRate3 = this.A06;
                            A0A(newSampleRate3 - 1);
                            return;
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i) {
        int i6 = this.A05 - i;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i6);
        short[] sArr2 = this.A0B;
        int i9 = this.A0G * i;
        short[] sArr3 = this.A0C;
        int i10 = this.A06;
        int frameCount2 = this.A0G;
        int i11 = i10 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(sArr2, i9, sArr3, i11, frameCount3 * i6);
        this.A05 = i;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i6;
    }

    private void A0A(int i) {
        if (i == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i, this.A0C, 0, (this.A06 - i) * this.A0G);
        this.A06 -= i;
    }

    private void A0B(int i) {
        int i6 = this.A00 - i;
        System.arraycopy(this.A0A, this.A0G * i, this.A0A, 0, this.A0G * i6);
        this.A00 = i6;
    }

    public static void A0C(int i, int i6, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = (i9 * i6) + i12;
            int t6 = (i11 * i6) + i12;
            int d2 = (i10 * i6) + i12;
            for (int u3 = 0; u3 < i; u3++) {
                int i14 = i - u3;
                int o6 = sArr2[d2] * i14;
                int i15 = sArr3[t6] * u3;
                sArr[i13] = (short) ((o6 + i15) / i);
                i13 += i6;
                d2 += i6;
                t6 += i6;
            }
        }
    }

    private void A0D(short[] sArr, int i, int i6) {
        this.A0B = A0G(this.A0B, this.A05, i6);
        System.arraycopy(sArr, this.A0G * i, this.A0B, this.A05 * this.A0G, this.A0G * i6);
        this.A05 += i6;
    }

    private void A0E(short[] sArr, int i, int i6) {
        int i9 = this.A0J / i6;
        int value = this.A0G * i6;
        int frameCount = this.A0G;
        int i10 = i * frameCount;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 0;
            for (int samplesPerValue = 0; samplesPerValue < value; samplesPerValue++) {
                int frameCount2 = i11 * value;
                i12 += sArr[frameCount2 + i10 + samplesPerValue];
            }
            int i13 = i12 / value;
            String[] strArr = A0M;
            String str = strArr[6];
            String str2 = strArr[0];
            int samplesPerValue2 = str.length();
            int frameCount3 = str2.length();
            if (samplesPerValue2 != frameCount3) {
                throw new RuntimeException();
            }
            A0M[4] = "fFYg0yxzP";
            this.A0L[i11] = (short) i13;
        }
    }

    private boolean A0F(int i, int i6) {
        if (i == 0 || this.A08 == 0 || i6 > i * 3 || i * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i, int i6) {
        int length = sArr.length / this.A0G;
        if (i + i6 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i6;
        int currentCapacityFrames2 = this.A0G;
        return Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
    }

    public final int A0H() {
        return this.A05 * this.A0G * 2;
    }

    public final int A0I() {
        return this.A00 * this.A0G * 2;
    }

    public final void A0J() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0K() {
        int i = this.A00;
        float f3 = this.A0F / this.A0D;
        float r9 = this.A0E * this.A0D;
        int i6 = this.A05;
        float s9 = i;
        int remainingFrameCount = this.A06;
        int i9 = i6 + ((int) ((((s9 / f3) + remainingFrameCount) / r9) + 0.5f));
        short[] sArr = this.A0A;
        int i10 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i10, (remainingFrameCount2 * 2) + i);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i11 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i11 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i12 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i12 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i9) {
            this.A05 = i9;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i = this.A0G * min;
        short[] sArr3 = this.A0B;
        int i6 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i, sArr3, 0, i6 * framesToRead3);
    }

    public final void A0M(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i = framesToWrite * remaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, remaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + remaining;
        A06();
    }
}
