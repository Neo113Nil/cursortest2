package com.anythink.expressad.foundation.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f19626a = 2048;

    private static Bitmap a(String str, int i) {
        if (i <= 0) {
            i = 10;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str).openStream(), f19626a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, f19626a);
            a(bufferedInputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            return b(Bitmap.createScaledBitmap(decodeByteArray, decodeByteArray.getWidth() / i, decodeByteArray.getHeight() / i, false));
        } catch (IOException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static Bitmap b(Bitmap bitmap) {
        char c9;
        int i;
        int i6;
        int i9;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = width - 1;
        int i12 = height - 1;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i10];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[20736];
        int i13 = 0;
        for (int i14 = 0; i14 < 20736; i14++) {
            iArr6[i14] = i14 / 81;
        }
        char c10 = 2;
        boolean z3 = true;
        char c11 = 17;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            c9 = c10;
            i = 8;
            if (i15 >= height) {
                break;
            }
            int i18 = i13;
            int i19 = i18;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            boolean z6 = z3;
            int i26 = -8;
            int i27 = i25;
            while (i26 <= 8) {
                char c12 = c11;
                int i28 = iArr[Math.min(i11, Math.max(i26, i13)) + i16];
                int[] iArr8 = iArr7[i26 + 8];
                iArr8[i13] = (i28 & 16711680) >> 16;
                iArr8[z6 ? 1 : 0] = (i28 & 65280) >> 8;
                iArr8[c9] = i28 & com.anythink.basead.exoplayer.k.p.f8473b;
                int abs = 9 - Math.abs(i26);
                int i29 = iArr8[i13];
                i27 = (i29 * abs) + i27;
                int i30 = iArr8[z6 ? 1 : 0];
                i18 = (i30 * abs) + i18;
                int i31 = iArr8[c9];
                i19 = (abs * i31) + i19;
                if (i26 > 0) {
                    i23 += i29;
                    i24 += i30;
                    i25 += i31;
                } else {
                    i20 += i29;
                    i21 += i30;
                    i22 += i31;
                }
                i26++;
                c11 = c12;
            }
            char c13 = c11;
            int i32 = 8;
            int i33 = i13;
            while (i33 < width) {
                iArr2[i16] = iArr6[i27];
                iArr3[i16] = iArr6[i18];
                iArr4[i16] = iArr6[i19];
                int i34 = i27 - i20;
                int i35 = i18 - i21;
                int i36 = i19 - i22;
                int[] iArr9 = iArr7[(i32 + 9) % 17];
                int i37 = i20 - iArr9[i13];
                int i38 = i21 - iArr9[z6 ? 1 : 0];
                int i39 = i22 - iArr9[c9];
                if (i15 == 0) {
                    i9 = i13;
                    iArr5[i33] = Math.min(i33 + 9, i11);
                } else {
                    i9 = i13;
                }
                int i40 = iArr[i17 + iArr5[i33]];
                int i41 = (i40 & 16711680) >> 16;
                iArr9[i9] = i41;
                int i42 = (i40 & 65280) >> 8;
                iArr9[z6 ? 1 : 0] = i42;
                int i43 = i40 & com.anythink.basead.exoplayer.k.p.f8473b;
                iArr9[c9] = i43;
                int i44 = i23 + i41;
                int i45 = i24 + i42;
                int i46 = i25 + i43;
                i27 = i34 + i44;
                i18 = i35 + i45;
                i19 = i36 + i46;
                i32 = (i32 + 1) % 17;
                int[] iArr10 = iArr7[i32 % 17];
                int i47 = iArr10[i9];
                i20 = i37 + i47;
                int i48 = iArr10[z6 ? 1 : 0];
                i21 = i38 + i48;
                int i49 = iArr10[c9];
                i22 = i39 + i49;
                i23 = i44 - i47;
                i24 = i45 - i48;
                i25 = i46 - i49;
                i16++;
                i33++;
                i13 = i9;
            }
            i17 += width;
            i15++;
            c10 = c9;
            z3 = z6 ? 1 : 0;
            c11 = c13;
        }
        int i50 = i13;
        boolean z9 = z3;
        int i51 = i50;
        while (i51 < width) {
            int i52 = width * (-8);
            int i53 = i51;
            int i54 = -8;
            int i55 = i50;
            int i56 = i55;
            int i57 = i56;
            int i58 = i57;
            int i59 = i58;
            int i60 = i59;
            int i61 = i60;
            int i62 = i61;
            int i63 = i62;
            while (i54 <= i) {
                int i64 = i;
                int i65 = i50;
                int max = Math.max(i65, i52) + i53;
                int[] iArr11 = iArr7[i54 + 8];
                iArr11[i65] = iArr2[max];
                iArr11[z9 ? 1 : 0] = iArr3[max];
                iArr11[c9] = iArr4[max];
                int abs2 = 9 - Math.abs(i54);
                i55 = (iArr2[max] * abs2) + i55;
                i56 = (iArr3[max] * abs2) + i56;
                i57 = (iArr4[max] * abs2) + i57;
                if (i54 > 0) {
                    i61 += iArr11[0];
                    i62 += iArr11[z9 ? 1 : 0];
                    i63 += iArr11[c9];
                } else {
                    i58 += iArr11[0];
                    i59 += iArr11[z9 ? 1 : 0];
                    i60 += iArr11[c9];
                }
                if (i54 < i12) {
                    i52 += width;
                }
                i54++;
                i = i64;
                i50 = 0;
            }
            int i66 = i;
            int i67 = i53;
            int i68 = i66;
            for (int i69 = 0; i69 < height; i69++) {
                iArr[i67] = (iArr[i67] & (-16777216)) | (iArr6[i55] << 16) | (iArr6[i56] << 8) | iArr6[i57];
                int i70 = i55 - i58;
                int i71 = i56 - i59;
                int i72 = i57 - i60;
                int[] iArr12 = iArr7[(i68 + 9) % 17];
                int i73 = i58 - iArr12[0];
                int i74 = i59 - iArr12[z9 ? 1 : 0];
                int i75 = i60 - iArr12[c9];
                if (i53 == 0) {
                    i6 = i67;
                    iArr5[i69] = Math.min(i69 + 9, i12) * width;
                } else {
                    i6 = i67;
                }
                int i76 = i53 + iArr5[i69];
                int i77 = iArr2[i76];
                iArr12[0] = i77;
                int i78 = iArr3[i76];
                iArr12[z9 ? 1 : 0] = i78;
                int i79 = iArr4[i76];
                iArr12[c9] = i79;
                int i80 = i61 + i77;
                int i81 = i62 + i78;
                int i82 = i63 + i79;
                i55 = i70 + i80;
                i56 = i71 + i81;
                i57 = i72 + i82;
                i68 = (i68 + 1) % 17;
                int[] iArr13 = iArr7[i68];
                int i83 = iArr13[0];
                i58 = i73 + i83;
                int i84 = iArr13[z9 ? 1 : 0];
                i59 = i74 + i84;
                int i85 = iArr13[c9];
                i60 = i75 + i85;
                i61 = i80 - i83;
                i62 = i81 - i84;
                i63 = i82 - i85;
                i67 = i6 + width;
            }
            i50 = 0;
            i51 = i53 + 1;
            i = i66;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[f19626a];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        return b(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 10, bitmap.getHeight() / 10, false));
    }
}
