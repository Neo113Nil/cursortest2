package ru.yandex.video.m3.first_frame;

import android.graphics.Color;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes7.dex */
final class ThumbHash {

    public static final class Channel {
        float[] ac;
        float dc;
        int nx;
        int ny;
        float scale;

        public Channel(int i, int i2) {
            this.nx = i;
            this.ny = i2;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                for (int i5 = i3 > 0 ? 0 : 1; i5 * i2 < (i2 - i3) * i; i5++) {
                    i4++;
                }
                i3++;
            }
            this.ac = new float[i4];
        }

        public int decode(byte[] bArr, int i, int i2, float f) {
            int i3 = 0;
            while (true) {
                float[] fArr = this.ac;
                if (i3 >= fArr.length) {
                    return i2;
                }
                fArr[i3] = ((((bArr[(i2 >> 1) + i] >> ((i2 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f;
                i2++;
                i3++;
            }
        }

        public Channel encode(int i, int i2, float[] fArr) {
            float[] fArr2 = new float[i];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                float f = 0.5f;
                if (i4 >= this.ny) {
                    break;
                }
                int i6 = 0;
                while (true) {
                    int i7 = this.ny;
                    if (i6 * i7 < (i7 - i4) * this.nx) {
                        for (int i8 = 0; i8 < i; i8++) {
                            fArr2[i8] = (float) Math.cos((3.141592653589793d / i) * i6 * (i8 + f));
                        }
                        int i9 = 0;
                        float f2 = 0.0f;
                        while (i9 < i2) {
                            float f3 = f;
                            float cos = (float) Math.cos((3.141592653589793d / i2) * i4 * (i9 + f3));
                            for (int i10 = 0; i10 < i; i10++) {
                                f2 += fArr[(i9 * i) + i10] * fArr2[i10] * cos;
                            }
                            i9++;
                            f = f3;
                        }
                        float f4 = f;
                        float f5 = f2 / (i * i2);
                        if (i6 > 0 || i4 > 0) {
                            this.ac[i5] = f5;
                            this.scale = Math.max(this.scale, Math.abs(f5));
                            i5++;
                        } else {
                            this.dc = f5;
                        }
                        i6++;
                        f = f4;
                    }
                }
                i4++;
            }
            if (this.scale > 0.0f) {
                while (true) {
                    float[] fArr3 = this.ac;
                    if (i3 >= fArr3.length) {
                        break;
                    }
                    fArr3[i3] = ((0.5f / this.scale) * fArr3[i3]) + 0.5f;
                    i3++;
                }
            }
            return this;
        }

        public int writeTo(byte[] bArr, int i, int i2) {
            for (float f : this.ac) {
                int i3 = (i2 >> 1) + i;
                bArr[i3] = (byte) ((Math.round(f * 15.0f) << ((i2 & 1) << 2)) | bArr[i3]);
                i2++;
            }
            return i2;
        }
    }

    public static final class Image {
        public int[] argb;
        public int height;
        public int width;

        public Image(int i, int i2, int[] iArr) {
            this.width = i;
            this.height = i2;
            this.argb = iArr;
        }
    }

    public static byte[] argbToThumbHash(int i, int i2, int[] iArr) {
        int i3;
        if (i > 100 || i2 > 100) {
            throw new IllegalArgumentException(i + RemoteBioParameters.X + i2 + " doesn't fit in 100x100");
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i4 = 0;
        while (true) {
            i3 = i * i2;
            if (i4 >= i3) {
                break;
            }
            float alpha = Color.alpha(iArr[i4]) / 255.0f;
            float f5 = alpha / 255.0f;
            f2 += Color.red(iArr[i4]) * f5;
            f3 += Color.green(iArr[i4]) * f5;
            f4 += f5 * Color.blue(iArr[i4]);
            f += alpha;
            i4++;
        }
        if (f > 0.0f) {
            f2 /= f;
            f3 /= f;
            f4 /= f;
        }
        boolean z = f < ((float) i3);
        int i5 = z ? 5 : 7;
        int max = Math.max(1, Math.round((i5 * i) / Math.max(i, i2)));
        int max2 = Math.max(1, Math.round((i5 * i2) / Math.max(i, i2)));
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i3];
        float[] fArr3 = new float[i3];
        float[] fArr4 = new float[i3];
        int i6 = 0;
        while (i6 < i3) {
            float alpha2 = Color.alpha(iArr[i6]) / 255.0f;
            float f6 = 1.0f - alpha2;
            float f7 = alpha2 / 255.0f;
            float red = (Color.red(iArr[i6]) * f7) + (f2 * f6);
            boolean z2 = z;
            float green = (Color.green(iArr[i6]) * f7) + (f3 * f6);
            float blue = (f7 * Color.blue(iArr[i6])) + (f6 * f4);
            float f8 = red + green;
            fArr[i6] = (f8 + blue) / 3.0f;
            fArr2[i6] = (f8 / 2.0f) - blue;
            fArr3[i6] = red - green;
            fArr4[i6] = alpha2;
            i6++;
            z = z2;
        }
        boolean z3 = z;
        Channel encode = new Channel(Math.max(3, max), Math.max(3, max2)).encode(i, i2, fArr);
        Channel encode2 = new Channel(3, 3).encode(i, i2, fArr2);
        Channel encode3 = new Channel(3, 3).encode(i, i2, fArr3);
        Channel encode4 = z3 ? new Channel(5, 5).encode(i, i2, fArr4) : null;
        boolean z4 = i > i2;
        int round = Math.round(encode.dc * 63.0f) | (Math.round((encode2.dc * 31.5f) + 31.5f) << 6) | (Math.round((encode3.dc * 31.5f) + 31.5f) << 12) | (Math.round(encode.scale * 31.0f) << 18) | (z3 ? SelfTester_JCP.ENCRYPT_CNT : 0);
        if (z4) {
            max = max2;
        }
        int round2 = (z4 ? 32768 : 0) | (Math.round(encode3.scale * 63.0f) << 9) | (Math.round(encode2.scale * 63.0f) << 3) | max;
        int i7 = z3 ? 6 : 5;
        byte[] bArr = new byte[(((((encode.ac.length + encode2.ac.length) + encode3.ac.length) + (z3 ? encode4.ac.length : 0)) + 1) / 2) + i7];
        bArr[0] = (byte) round;
        bArr[1] = (byte) (round >> 8);
        bArr[2] = (byte) (round >> 16);
        bArr[3] = (byte) round2;
        bArr[4] = (byte) (round2 >> 8);
        if (z3) {
            bArr[5] = (byte) (Math.round(encode4.dc * 15.0f) | (Math.round(encode4.scale * 15.0f) << 4));
        }
        int writeTo = encode3.writeTo(bArr, i7, encode2.writeTo(bArr, i7, encode.writeTo(bArr, i7, 0)));
        if (z3) {
            encode4.writeTo(bArr, i7, writeTo);
        }
        return bArr;
    }

    private static int float2int(float f) {
        return Math.max(0, Math.round(Math.min(1.0f, f) * 255.0f));
    }

    public static Image thumbHashToARGB(byte[] bArr) {
        float f;
        int i;
        Channel channel;
        int i2;
        int i3;
        float f2;
        int i4 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        int i5 = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        float f3 = (i4 & 63) / 63.0f;
        float f4 = (((i4 >> 6) & 63) / 31.5f) - 1.0f;
        float f5 = (((i4 >> 12) & 63) / 31.5f) - 1.0f;
        float f6 = ((i4 >> 18) & 31) / 31.0f;
        boolean z = (i4 >> 23) != 0;
        float f7 = ((i5 >> 3) & 63) / 63.0f;
        float f8 = ((i5 >> 9) & 63) / 63.0f;
        boolean z2 = (i5 >> 15) != 0;
        int i6 = 7;
        int max = Math.max(3, z2 ? z ? 5 : 7 : i5 & 7);
        if (z2) {
            i6 = 7 & i5;
        } else if (z) {
            i6 = 5;
        }
        int max2 = Math.max(3, i6);
        float f9 = z ? (bArr[5] & PKIBody._CCP) / 15.0f : 1.0f;
        float f10 = ((bArr[5] >> 4) & 15) / 15.0f;
        if (z) {
            f = 1.0f;
            i = 6;
        } else {
            f = 1.0f;
            i = 5;
        }
        Channel channel2 = new Channel(max, max2);
        Channel channel3 = new Channel(3, 3);
        boolean z3 = z;
        Channel channel4 = new Channel(3, 3);
        int decode = channel4.decode(bArr, i, channel3.decode(bArr, i, channel2.decode(bArr, i, 0, f6), f7 * 1.25f), f8 * 1.25f);
        if (z3) {
            channel = new Channel(5, 5);
            channel.decode(bArr, i, decode, f10);
        } else {
            channel = null;
        }
        float[] fArr = channel2.ac;
        float[] fArr2 = channel3.ac;
        float[] fArr3 = channel4.ac;
        float[] fArr4 = z3 ? channel.ac : null;
        float thumbHashToApproximateAspectRatio = thumbHashToApproximateAspectRatio(bArr);
        int round = Math.round(thumbHashToApproximateAspectRatio > f ? 32.0f : thumbHashToApproximateAspectRatio * 32.0f);
        int round2 = Math.round(thumbHashToApproximateAspectRatio > f ? 32.0f / thumbHashToApproximateAspectRatio : 32.0f);
        int[] iArr = new int[round * round2];
        int max3 = Math.max(max, z3 ? 5 : 3);
        int max4 = Math.max(max2, z3 ? 5 : 3);
        float[] fArr5 = new float[max3];
        float[] fArr6 = new float[max4];
        int i7 = 0;
        int i8 = 0;
        while (i7 < round2) {
            float[] fArr7 = fArr3;
            int i9 = 0;
            while (i9 < round) {
                float[] fArr8 = fArr;
                int i10 = 0;
                while (i10 < max3) {
                    fArr5[i10] = (float) Math.cos((3.141592653589793d / round) * (i9 + 0.5f) * i10);
                    i10++;
                    f3 = f3;
                    max = max;
                }
                int i11 = max;
                float f11 = f3;
                int i12 = 0;
                while (i12 < max4) {
                    fArr6[i12] = (float) Math.cos((3.141592653589793d / round2) * (i7 + 0.5f) * i12);
                    i12++;
                    i9 = i9;
                    i7 = i7;
                }
                int i13 = i7;
                int i14 = i9;
                float f12 = f11;
                int i15 = 0;
                int i16 = 0;
                while (i15 < max2) {
                    float f13 = fArr6[i15] * 2.0f;
                    int i17 = i15 > 0 ? 0 : 1;
                    int i18 = i15;
                    while (true) {
                        f2 = f12;
                        if (i17 * max2 < (max2 - i18) * i11) {
                            f12 = (fArr8[i16] * fArr5[i17] * f13) + f2;
                            i17++;
                            i16++;
                        }
                    }
                    i15 = i18 + 1;
                    f12 = f2;
                }
                float f14 = f4;
                float f15 = f5;
                int i19 = 0;
                int i20 = 0;
                while (i19 < 3) {
                    float f16 = fArr6[i19] * 2.0f;
                    int i21 = i19 > 0 ? 0 : 1;
                    while (true) {
                        i3 = i19;
                        if (i21 < 3 - i3) {
                            float f17 = fArr5[i21] * f16;
                            f14 = (fArr2[i20] * f17) + f14;
                            f15 = (fArr7[i20] * f17) + f15;
                            i21++;
                            i20++;
                            i19 = i3;
                        }
                    }
                    i19 = i3 + 1;
                }
                float f18 = f12;
                float f19 = f9;
                if (z3) {
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < 5) {
                        float f20 = fArr6[i22] * 2.0f;
                        int i24 = i22 > 0 ? 0 : 1;
                        while (true) {
                            i2 = i22;
                            if (i24 < 5 - i2) {
                                f19 += fArr4[i23] * fArr5[i24] * f20;
                                i24++;
                                i23++;
                                i22 = i2;
                            }
                        }
                        i22 = i2 + 1;
                    }
                }
                float f21 = f18 - (f14 * 0.6666667f);
                float f22 = (((3.0f * f18) - f21) + f15) / 2.0f;
                iArr[i8] = Color.argb(float2int(f19), float2int(f22), float2int(f22 - f15), float2int(f21));
                i9 = i14 + 1;
                i8++;
                fArr = fArr8;
                f3 = f11;
                max = i11;
                i7 = i13;
            }
            i7++;
            fArr3 = fArr7;
        }
        return new Image(round, round2, iArr);
    }

    public static float thumbHashToApproximateAspectRatio(byte[] bArr) {
        byte b = bArr[3];
        boolean z = (bArr[2] & DerValue.TAG_CONTEXT) != 0;
        boolean z2 = (bArr[4] & DerValue.TAG_CONTEXT) != 0;
        int i = 5;
        int i2 = z2 ? z ? 5 : 7 : b & 7;
        if (z2) {
            i = b & 7;
        } else if (!z) {
            i = 7;
        }
        return i2 / i;
    }

    public static int thumbHashToAverageARGB(byte[] bArr) {
        float f = (r0 & 63) / 63.0f;
        float f2 = (((r0 >> 6) & 63) / 31.5f) - 1.0f;
        float f3 = (((r0 >> 12) & 63) / 31.5f) - 1.0f;
        float f4 = ((((bArr[0] & 255) | ((bArr[1] & 255) << 8)) | ((bArr[2] & 255) << 16)) >> 23) != 0 ? (bArr[5] & PKIBody._CCP) / 15.0f : 1.0f;
        float f5 = f - (f2 * 0.6666667f);
        float f6 = (((f * 3.0f) - f5) + f3) / 2.0f;
        return Color.argb(float2int(f4), float2int(f6), float2int(f6 - f3), float2int(f5));
    }
}
