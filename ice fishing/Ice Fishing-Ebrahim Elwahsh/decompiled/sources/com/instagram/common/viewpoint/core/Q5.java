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
    public static void A00(int[] iArr, int i, int minY, int minX, int i4, int i9, int i10) {
        int stack_start = i - 1;
        int i11 = minY - 1;
        int stack_start2 = (minX * 2) + 1;
        short s3 = A02[minX];
        byte b9 = A01[minX];
        int[] iArr2 = new int[stack_start2];
        long j9 = 0;
        if (i10 == 1) {
            int maxY = (i9 * minY) / i4;
            int i12 = ((i9 + 1) * minY) / i4;
            while (maxY < i12) {
                long j10 = j9;
                String[] strArr = A00;
                if (strArr[0].charAt(0) == strArr[4].charAt(0)) {
                    A00[7] = "PfdY9h9ksw7pIrLHvaMDkidEUsYS2xix";
                    long j11 = j9;
                    long j12 = j9;
                    long j13 = j9;
                    long j14 = j9;
                    long j15 = j9;
                    long j16 = j9;
                    long j17 = j9;
                    int hm = i * maxY;
                    for (int i13 = 0; i13 <= minX; i13++) {
                        iArr2[i13] = iArr[hm];
                        j17 += ((iArr[hm] >>> 16) & p.f8630b) * (i13 + 1);
                        j16 += ((iArr[hm] >>> 8) & p.f8630b) * (i13 + 1);
                        j15 += (iArr[hm] & p.f8630b) * (i13 + 1);
                        j11 += (iArr[hm] >>> 16) & p.f8630b;
                        j10 += (iArr[hm] >>> 8) & p.f8630b;
                        j9 += iArr[hm] & p.f8630b;
                    }
                    for (int i14 = 1; i14 <= minX; i14++) {
                        if (i14 <= stack_start) {
                            hm++;
                        }
                        iArr2[i14 + minX] = iArr[hm];
                        j17 += ((iArr[hm] >>> 16) & p.f8630b) * ((minX + 1) - i14);
                        j16 += ((iArr[hm] >>> 8) & p.f8630b) * ((minX + 1) - i14);
                        j15 += (iArr[hm] & p.f8630b) * ((minX + 1) - i14);
                        j14 += (iArr[hm] >>> 16) & p.f8630b;
                        j13 += (iArr[hm] >>> 8) & p.f8630b;
                        j12 += iArr[hm] & p.f8630b;
                    }
                    int i15 = minX;
                    int i16 = minX;
                    if (i16 > stack_start) {
                        i16 = stack_start;
                    }
                    int i17 = (maxY * i) + i16;
                    int i18 = maxY * i;
                    for (int i19 = 0; i19 < i; i19++) {
                        iArr[i18] = (int) ((iArr[i18] & (-16777216)) | ((((s3 * j17) >>> b9) & 255) << 16) | ((((s3 * j16) >>> b9) & 255) << 8) | (((s3 * j15) >>> b9) & 255));
                        i18++;
                        long j18 = j17 - j11;
                        long j19 = j16 - j10;
                        long j20 = j15 - j9;
                        int i20 = (i15 + stack_start2) - minX;
                        if (i20 >= stack_start2) {
                            i20 -= stack_start2;
                        }
                        long j21 = j11 - ((iArr2[i20] >>> 16) & p.f8630b);
                        long j22 = j10 - ((iArr2[i20] >>> 8) & p.f8630b);
                        long j23 = j9 - (iArr2[i20] & p.f8630b);
                        int stack_i = i16;
                        if (stack_i < stack_start) {
                            i17++;
                            i16++;
                        }
                        iArr2[i20] = iArr[i17];
                        long j24 = j14 + ((iArr[i17] >>> 16) & p.f8630b);
                        long j25 = j13 + ((iArr[i17] >>> 8) & p.f8630b);
                        long j26 = j12 + (iArr[i17] & p.f8630b);
                        j17 = j18 + j24;
                        j16 = j19 + j25;
                        j15 = j20 + j26;
                        int i21 = i15 + 1;
                        if (i21 >= stack_start2) {
                            i21 = 0;
                        }
                        int stack_i2 = iArr2[i21];
                        i15 = i21;
                        j11 = j21 + ((stack_i2 >>> 16) & p.f8630b);
                        int stack_i3 = iArr2[i21];
                        long j27 = (stack_i3 >>> 8) & p.f8630b;
                        if (A00[1].length() == 5) {
                            String[] strArr2 = A00;
                            strArr2[0] = "Gs6cp7XtkyimKPtddkds3pD39xD98rye";
                            strArr2[4] = "GzHB2OA1jqluXk2iMzoyOJbysCDiG3Ta";
                            j10 = j22 + j27;
                            int stack_i4 = iArr2[i21];
                            j9 = j23 + (stack_i4 & p.f8630b);
                            int stack_i5 = iArr2[i21];
                            j14 = j24 - ((stack_i5 >>> 16) & p.f8630b);
                            int stack_i6 = iArr2[i21];
                            j13 = j25 - ((stack_i6 >>> 8) & p.f8630b);
                            int stack_i7 = iArr2[i21];
                            j12 = j26 - (stack_i7 & p.f8630b);
                        }
                    }
                    maxY++;
                    j9 = 0;
                }
            }
            return;
        }
        if (i10 == 2) {
            int i22 = (i9 * i) / i4;
            int i23 = ((i9 + 1) * i) / i4;
            loop4: while (maxX < i23) {
                long j28 = 0;
                long j29 = 0;
                long j30 = 0;
                long j31 = 0;
                long j32 = 0;
                long j33 = 0;
                long j34 = 0;
                long j35 = 0;
                long j36 = 0;
                int i24 = i22;
                for (int i25 = 0; i25 <= minX; i25++) {
                    iArr2[i25] = iArr[i24];
                    int maxX = i25 + 1;
                    j36 += ((iArr[i24] >>> 16) & p.f8630b) * maxX;
                    j35 += ((iArr[i24] >>> 8) & p.f8630b) * (i25 + 1);
                    j34 += (iArr[i24] & p.f8630b) * (i25 + 1);
                    j30 += (iArr[i24] >>> 16) & p.f8630b;
                    j29 += (iArr[i24] >>> 8) & p.f8630b;
                    j28 += iArr[i24] & p.f8630b;
                }
                int i26 = 1;
                while (i26 <= minX) {
                    if (i26 <= i11) {
                        i24 += i;
                    }
                    int stack_i8 = i26 + minX;
                    iArr2[stack_i8] = iArr[i24];
                    int stack_i9 = minX + 1;
                    j36 += ((iArr[i24] >>> 16) & p.f8630b) * (stack_i9 - i26);
                    int stack_i10 = minX + 1;
                    j35 += ((iArr[i24] >>> 8) & p.f8630b) * (stack_i10 - i26);
                    int stack_i11 = minX + 1;
                    j34 += (iArr[i24] & p.f8630b) * (stack_i11 - i26);
                    j33 += (iArr[i24] >>> 16) & p.f8630b;
                    long j37 = (iArr[i24] >>> 8) & p.f8630b;
                    int hm2 = A00[7].charAt(21);
                    if (hm2 != 105) {
                        j32 += j37;
                        j31 += iArr[i24] & p.f8630b;
                        i26++;
                    } else {
                        String[] strArr3 = A00;
                        strArr3[0] = "GE7urBSjjLMQkFl7rA6N87J3ehhA8Hz6";
                        strArr3[4] = "GOWeQyuTSoYbh2z5UHQkrSxrHOD9hfFJ";
                        j32 += j37;
                        j31 += iArr[i24] & p.f8630b;
                        i26++;
                    }
                }
                int hm3 = minX;
                int i27 = minX;
                if (i27 > i11) {
                    i27 = i11;
                }
                int i28 = (i27 * i) + i22;
                int i29 = i22;
                int i30 = 0;
                while (true) {
                    String[] strArr4 = A00;
                    String str = strArr4[0];
                    String str2 = strArr4[4];
                    int sp = str.charAt(0);
                    int y6 = str2.charAt(0);
                    if (sp != y6) {
                        break loop4;
                    }
                    A00[6] = "1bwVAFoQI5Ok5WJFtwrUe";
                    int sp2 = i30;
                    if (sp2 < minY) {
                        int i31 = iArr[i29];
                        int sp3 = A00[7].charAt(21);
                        if (sp3 != 105) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A00;
                        strArr5[0] = "GGduL95yG2tM0AFXVNzOOayl6jJ8thFl";
                        strArr5[4] = "GuBrpivSQbykanIV4Dv04bmlZ4tKSmwR";
                        int y8 = (int) ((i31 & (-16777216)) | ((((s3 * j36) >>> b9) & 255) << 16) | ((((s3 * j35) >>> b9) & 255) << 8) | (((s3 * j34) >>> b9) & 255));
                        iArr[i29] = y8;
                        i29 += i;
                        long j38 = j36 - j30;
                        long j39 = j35 - j29;
                        long j40 = j34 - j28;
                        int stack_start3 = (hm3 + stack_start2) - minX;
                        if (stack_start3 >= stack_start2) {
                            stack_start3 -= stack_start2;
                        }
                        int y9 = iArr2[stack_start3];
                        long j41 = j30 - ((y9 >>> 16) & p.f8630b);
                        int y10 = iArr2[stack_start3];
                        long j42 = j29 - ((y10 >>> 8) & p.f8630b);
                        int y11 = iArr2[stack_start3];
                        long j43 = j28 - (y11 & p.f8630b);
                        int sp4 = i27;
                        if (sp4 < i11) {
                            i28 += i;
                            i27++;
                        }
                        int y12 = iArr[i28];
                        iArr2[stack_start3] = y12;
                        int y13 = iArr[i28];
                        long j44 = j33 + ((y13 >>> 16) & p.f8630b);
                        int y14 = iArr[i28];
                        long j45 = j32 + ((y14 >>> 8) & p.f8630b);
                        int y15 = iArr[i28];
                        long j46 = j31 + (y15 & p.f8630b);
                        j36 = j38 + j44;
                        j35 = j39 + j45;
                        j34 = j40 + j46;
                        hm3++;
                        if (hm3 >= stack_start2) {
                            hm3 = 0;
                        }
                        int y16 = iArr2[hm3];
                        j30 = j41 + ((y16 >>> 16) & p.f8630b);
                        int y17 = iArr2[hm3];
                        j29 = j42 + ((y17 >>> 8) & p.f8630b);
                        int y18 = iArr2[hm3];
                        j28 = j43 + (y18 & p.f8630b);
                        int y19 = iArr2[hm3];
                        j33 = j44 - ((y19 >>> 16) & p.f8630b);
                        int y20 = iArr2[hm3];
                        j32 = j45 - ((y20 >>> 8) & p.f8630b);
                        int y21 = iArr2[hm3];
                        j31 = j46 - (y21 & p.f8630b);
                        i30++;
                    }
                }
            }
            return;
        }
        return;
        throw new RuntimeException();
    }

    @Nullable
    public final Bitmap A02(Bitmap bitmap, float f6) {
        int w9 = bitmap.getWidth();
        int h9 = bitmap.getHeight();
        try {
            int[] iArr = new int[w9 * h9];
            bitmap.getPixels(iArr, 0, w9, 0, 0, w9, h9);
            int i = YP.A00;
            ArrayList arrayList = new ArrayList(i);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i);
            for (int i4 = 0; i4 < i; i4++) {
                int h10 = h9;
                int cores = i4;
                arrayList.add(new YO(iArr, w9, h10, (int) f6, i, cores, 1));
                h9 = h10;
                int cores2 = i4;
                vertical.add(new YO(iArr, w9, h9, (int) f6, i, cores2, 2));
            }
            try {
                YP.A01.invokeAll(arrayList);
                try {
                    YP.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w9, h9, Bitmap.Config.ARGB_8888);
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
