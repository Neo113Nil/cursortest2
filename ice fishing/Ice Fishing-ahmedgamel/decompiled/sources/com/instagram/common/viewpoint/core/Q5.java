package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import com.anythink.basead.exoplayer.k.p;
import com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public final class Q5 {
    public static String[] A00 = {"GWFI2aEH9IwS9jlAmW7GhK1fzlhYxOYr", "8RR4W", "CWkLBEDZ3ckMIO6tTC6BOoN3cIPuPWQc", "H5jmeoVh4LyksNQ25zvZiIvxmGmhytkO", "GsHsqvgNRqvbvAJVDBzizJhfh8WArm0A", "4fKWUv5SQTvzMYF7waz6SD9Pf2i1NBM9", "aULd2mQrGZaata6Wu7225", "sYPqpaaM0HqFzSjGFkcoBixd8ZNH3dn1"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    /* JADX WARN: Code restructure failed: missing block: B:102:0x03d6, code lost:
    
        r38 = r38 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:54:0x01f9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A00(int[] iArr, int i, int minY, int minX, int i4, int i6, int i9) {
        int stack_start = i - 1;
        int i10 = minY - 1;
        int stack_start2 = (minX * 2) + 1;
        short s9 = A02[minX];
        byte b9 = A01[minX];
        int[] iArr2 = new int[stack_start2];
        long j6 = 0;
        if (i9 == 1) {
            int maxY = (i6 * minY) / i4;
            int i11 = ((i6 + 1) * minY) / i4;
            while (maxY < i11) {
                long j9 = j6;
                String[] strArr = A00;
                if (strArr[0].charAt(0) == strArr[4].charAt(0)) {
                    A00[7] = "PfdY9h9ksw7pIrLHvaMDkidEUsYS2xix";
                    long j10 = j6;
                    long j11 = j6;
                    long j12 = j6;
                    long j13 = j6;
                    long j14 = j6;
                    long j15 = j6;
                    long j16 = j6;
                    int hm = i * maxY;
                    for (int i12 = 0; i12 <= minX; i12++) {
                        iArr2[i12] = iArr[hm];
                        j16 += ((iArr[hm] >>> 16) & p.f9259b) * (i12 + 1);
                        j15 += ((iArr[hm] >>> 8) & p.f9259b) * (i12 + 1);
                        j14 += (iArr[hm] & p.f9259b) * (i12 + 1);
                        j10 += (iArr[hm] >>> 16) & p.f9259b;
                        j9 += (iArr[hm] >>> 8) & p.f9259b;
                        j6 += iArr[hm] & p.f9259b;
                    }
                    for (int i13 = 1; i13 <= minX; i13++) {
                        if (i13 <= stack_start) {
                            hm++;
                        }
                        iArr2[i13 + minX] = iArr[hm];
                        j16 += ((iArr[hm] >>> 16) & p.f9259b) * ((minX + 1) - i13);
                        j15 += ((iArr[hm] >>> 8) & p.f9259b) * ((minX + 1) - i13);
                        j14 += (iArr[hm] & p.f9259b) * ((minX + 1) - i13);
                        j13 += (iArr[hm] >>> 16) & p.f9259b;
                        j12 += (iArr[hm] >>> 8) & p.f9259b;
                        j11 += iArr[hm] & p.f9259b;
                    }
                    int i14 = minX;
                    int i15 = minX;
                    if (i15 > stack_start) {
                        i15 = stack_start;
                    }
                    int i16 = (maxY * i) + i15;
                    int i17 = maxY * i;
                    for (int i18 = 0; i18 < i; i18++) {
                        iArr[i17] = (int) ((iArr[i17] & (-16777216)) | ((((s9 * j16) >>> b9) & 255) << 16) | ((((s9 * j15) >>> b9) & 255) << 8) | (((s9 * j14) >>> b9) & 255));
                        i17++;
                        long j17 = j16 - j10;
                        long j18 = j15 - j9;
                        long j19 = j14 - j6;
                        int i19 = (i14 + stack_start2) - minX;
                        if (i19 >= stack_start2) {
                            i19 -= stack_start2;
                        }
                        long j20 = j10 - ((iArr2[i19] >>> 16) & p.f9259b);
                        long j21 = j9 - ((iArr2[i19] >>> 8) & p.f9259b);
                        long j22 = j6 - (iArr2[i19] & p.f9259b);
                        int stack_i = i15;
                        if (stack_i < stack_start) {
                            i16++;
                            i15++;
                        }
                        iArr2[i19] = iArr[i16];
                        long j23 = j13 + ((iArr[i16] >>> 16) & p.f9259b);
                        long j24 = j12 + ((iArr[i16] >>> 8) & p.f9259b);
                        long j25 = j11 + (iArr[i16] & p.f9259b);
                        j16 = j17 + j23;
                        j15 = j18 + j24;
                        j14 = j19 + j25;
                        int i20 = i14 + 1;
                        if (i20 >= stack_start2) {
                            i20 = 0;
                        }
                        int stack_i2 = iArr2[i20];
                        i14 = i20;
                        j10 = j20 + ((stack_i2 >>> 16) & p.f9259b);
                        int stack_i3 = iArr2[i20];
                        long j26 = (stack_i3 >>> 8) & p.f9259b;
                        if (A00[1].length() == 5) {
                            String[] strArr2 = A00;
                            strArr2[0] = "Gs6cp7XtkyimKPtddkds3pD39xD98rye";
                            strArr2[4] = "GzHB2OA1jqluXk2iMzoyOJbysCDiG3Ta";
                            j9 = j21 + j26;
                            int stack_i4 = iArr2[i20];
                            j6 = j22 + (stack_i4 & p.f9259b);
                            int stack_i5 = iArr2[i20];
                            j13 = j23 - ((stack_i5 >>> 16) & p.f9259b);
                            int stack_i6 = iArr2[i20];
                            j12 = j24 - ((stack_i6 >>> 8) & p.f9259b);
                            int stack_i7 = iArr2[i20];
                            j11 = j25 - (stack_i7 & p.f9259b);
                        }
                    }
                    maxY++;
                    j6 = 0;
                }
            }
            return;
        }
        if (i9 == 2) {
            int i21 = (i6 * i) / i4;
            int i22 = ((i6 + 1) * i) / i4;
            loop4: while (maxX < i22) {
                long j27 = 0;
                long j28 = 0;
                long j29 = 0;
                long j30 = 0;
                long j31 = 0;
                long j32 = 0;
                long j33 = 0;
                long j34 = 0;
                long j35 = 0;
                int i23 = i21;
                for (int i24 = 0; i24 <= minX; i24++) {
                    iArr2[i24] = iArr[i23];
                    int maxX = i24 + 1;
                    j35 += ((iArr[i23] >>> 16) & p.f9259b) * maxX;
                    j34 += ((iArr[i23] >>> 8) & p.f9259b) * (i24 + 1);
                    j33 += (iArr[i23] & p.f9259b) * (i24 + 1);
                    j29 += (iArr[i23] >>> 16) & p.f9259b;
                    j28 += (iArr[i23] >>> 8) & p.f9259b;
                    j27 += iArr[i23] & p.f9259b;
                }
                int i25 = 1;
                while (i25 <= minX) {
                    if (i25 <= i10) {
                        i23 += i;
                    }
                    int stack_i8 = i25 + minX;
                    iArr2[stack_i8] = iArr[i23];
                    int stack_i9 = minX + 1;
                    j35 += ((iArr[i23] >>> 16) & p.f9259b) * (stack_i9 - i25);
                    int stack_i10 = minX + 1;
                    j34 += ((iArr[i23] >>> 8) & p.f9259b) * (stack_i10 - i25);
                    int stack_i11 = minX + 1;
                    j33 += (iArr[i23] & p.f9259b) * (stack_i11 - i25);
                    j32 += (iArr[i23] >>> 16) & p.f9259b;
                    long j36 = (iArr[i23] >>> 8) & p.f9259b;
                    int hm2 = A00[7].charAt(21);
                    if (hm2 != 105) {
                        j31 += j36;
                        j30 += iArr[i23] & p.f9259b;
                        i25++;
                    } else {
                        String[] strArr3 = A00;
                        strArr3[0] = "GE7urBSjjLMQkFl7rA6N87J3ehhA8Hz6";
                        strArr3[4] = "GOWeQyuTSoYbh2z5UHQkrSxrHOD9hfFJ";
                        j31 += j36;
                        j30 += iArr[i23] & p.f9259b;
                        i25++;
                    }
                }
                int hm3 = minX;
                int i26 = minX;
                if (i26 > i10) {
                    i26 = i10;
                }
                int i27 = (i26 * i) + i21;
                int i28 = i21;
                int i29 = 0;
                while (true) {
                    String[] strArr4 = A00;
                    String str = strArr4[0];
                    String str2 = strArr4[4];
                    int sp = str.charAt(0);
                    int y7 = str2.charAt(0);
                    if (sp != y7) {
                        break loop4;
                    }
                    A00[6] = "1bwVAFoQI5Ok5WJFtwrUe";
                    int sp2 = i29;
                    if (sp2 < minY) {
                        int i30 = iArr[i28];
                        int sp3 = A00[7].charAt(21);
                        if (sp3 != 105) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A00;
                        strArr5[0] = "GGduL95yG2tM0AFXVNzOOayl6jJ8thFl";
                        strArr5[4] = "GuBrpivSQbykanIV4Dv04bmlZ4tKSmwR";
                        int y9 = (int) ((i30 & (-16777216)) | ((((s9 * j35) >>> b9) & 255) << 16) | ((((s9 * j34) >>> b9) & 255) << 8) | (((s9 * j33) >>> b9) & 255));
                        iArr[i28] = y9;
                        i28 += i;
                        long j37 = j35 - j29;
                        long j38 = j34 - j28;
                        long j39 = j33 - j27;
                        int stack_start3 = (hm3 + stack_start2) - minX;
                        if (stack_start3 >= stack_start2) {
                            stack_start3 -= stack_start2;
                        }
                        int y10 = iArr2[stack_start3];
                        long j40 = j29 - ((y10 >>> 16) & p.f9259b);
                        int y11 = iArr2[stack_start3];
                        long j41 = j28 - ((y11 >>> 8) & p.f9259b);
                        int y12 = iArr2[stack_start3];
                        long j42 = j27 - (y12 & p.f9259b);
                        int sp4 = i26;
                        if (sp4 < i10) {
                            i27 += i;
                            i26++;
                        }
                        int y13 = iArr[i27];
                        iArr2[stack_start3] = y13;
                        int y14 = iArr[i27];
                        long j43 = j32 + ((y14 >>> 16) & p.f9259b);
                        int y15 = iArr[i27];
                        long j44 = j31 + ((y15 >>> 8) & p.f9259b);
                        int y16 = iArr[i27];
                        long j45 = j30 + (y16 & p.f9259b);
                        j35 = j37 + j43;
                        j34 = j38 + j44;
                        j33 = j39 + j45;
                        hm3++;
                        if (hm3 >= stack_start2) {
                            hm3 = 0;
                        }
                        int y17 = iArr2[hm3];
                        j29 = j40 + ((y17 >>> 16) & p.f9259b);
                        int y18 = iArr2[hm3];
                        j28 = j41 + ((y18 >>> 8) & p.f9259b);
                        int y19 = iArr2[hm3];
                        j27 = j42 + (y19 & p.f9259b);
                        int y20 = iArr2[hm3];
                        j32 = j43 - ((y20 >>> 16) & p.f9259b);
                        int y21 = iArr2[hm3];
                        j31 = j44 - ((y21 >>> 8) & p.f9259b);
                        int y22 = iArr2[hm3];
                        j30 = j45 - (y22 & p.f9259b);
                        i29++;
                    }
                }
            }
            return;
        }
        return;
        throw new RuntimeException();
    }

    @Nullable
    public final Bitmap A02(Bitmap bitmap, float f2) {
        int w3 = bitmap.getWidth();
        int h3 = bitmap.getHeight();
        try {
            int[] iArr = new int[w3 * h3];
            bitmap.getPixels(iArr, 0, w3, 0, 0, w3, h3);
            int i = YP.A00;
            ArrayList arrayList = new ArrayList(i);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i);
            for (int i4 = 0; i4 < i; i4++) {
                int h9 = h3;
                int cores = i4;
                arrayList.add(new YO(iArr, w3, h9, (int) f2, i, cores, 1));
                h3 = h9;
                int cores2 = i4;
                vertical.add(new YO(iArr, w3, h3, (int) f2, i, cores2, 2));
            }
            try {
                YP.A01.invokeAll(arrayList);
                try {
                    YP.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w3, h3, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    String[] strArr = A00;
                    if (strArr[0].charAt(0) != strArr[4].charAt(0)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A00;
                    strArr2[0] = "GYxXddv1X7Qsu4uKyRk7X4E4VL4ApWq6";
                    strArr2[4] = "GxDga6TmLrnNDJa4WhYbU4AfHiRAiIT6";
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
