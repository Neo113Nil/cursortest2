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
    public static int f20413a = 2048;

    private static Bitmap a(String str, int i) {
        if (i <= 0) {
            i = 10;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str).openStream(), f20413a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, f20413a);
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
        int i4;
        int i6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i9 = width * height;
        int[] iArr = new int[i9];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i10 = width - 1;
        int i11 = height - 1;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        int[] iArr4 = new int[i9];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[20736];
        int i12 = 0;
        for (int i13 = 0; i13 < 20736; i13++) {
            iArr6[i13] = i13 / 81;
        }
        char c10 = 2;
        boolean z6 = true;
        char c11 = 17;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            c9 = c10;
            i = 8;
            if (i14 >= height) {
                break;
            }
            int i17 = i12;
            int i18 = i17;
            int i19 = i18;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            boolean z9 = z6;
            int i25 = -8;
            int i26 = i24;
            while (i25 <= 8) {
                char c12 = c11;
                int i27 = iArr[Math.min(i10, Math.max(i25, i12)) + i15];
                int[] iArr8 = iArr7[i25 + 8];
                iArr8[i12] = (i27 & 16711680) >> 16;
                iArr8[z9 ? 1 : 0] = (i27 & 65280) >> 8;
                iArr8[c9] = i27 & com.anythink.basead.exoplayer.k.p.f9259b;
                int abs = 9 - Math.abs(i25);
                int i28 = iArr8[i12];
                i26 = (i28 * abs) + i26;
                int i29 = iArr8[z9 ? 1 : 0];
                i17 = (i29 * abs) + i17;
                int i30 = iArr8[c9];
                i18 = (abs * i30) + i18;
                if (i25 > 0) {
                    i22 += i28;
                    i23 += i29;
                    i24 += i30;
                } else {
                    i19 += i28;
                    i20 += i29;
                    i21 += i30;
                }
                i25++;
                c11 = c12;
            }
            char c13 = c11;
            int i31 = 8;
            int i32 = i12;
            while (i32 < width) {
                iArr2[i15] = iArr6[i26];
                iArr3[i15] = iArr6[i17];
                iArr4[i15] = iArr6[i18];
                int i33 = i26 - i19;
                int i34 = i17 - i20;
                int i35 = i18 - i21;
                int[] iArr9 = iArr7[(i31 + 9) % 17];
                int i36 = i19 - iArr9[i12];
                int i37 = i20 - iArr9[z9 ? 1 : 0];
                int i38 = i21 - iArr9[c9];
                if (i14 == 0) {
                    i6 = i12;
                    iArr5[i32] = Math.min(i32 + 9, i10);
                } else {
                    i6 = i12;
                }
                int i39 = iArr[i16 + iArr5[i32]];
                int i40 = (i39 & 16711680) >> 16;
                iArr9[i6] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr9[z9 ? 1 : 0] = i41;
                int i42 = i39 & com.anythink.basead.exoplayer.k.p.f9259b;
                iArr9[c9] = i42;
                int i43 = i22 + i40;
                int i44 = i23 + i41;
                int i45 = i24 + i42;
                i26 = i33 + i43;
                i17 = i34 + i44;
                i18 = i35 + i45;
                i31 = (i31 + 1) % 17;
                int[] iArr10 = iArr7[i31 % 17];
                int i46 = iArr10[i6];
                i19 = i36 + i46;
                int i47 = iArr10[z9 ? 1 : 0];
                i20 = i37 + i47;
                int i48 = iArr10[c9];
                i21 = i38 + i48;
                i22 = i43 - i46;
                i23 = i44 - i47;
                i24 = i45 - i48;
                i15++;
                i32++;
                i12 = i6;
            }
            i16 += width;
            i14++;
            c10 = c9;
            z6 = z9 ? 1 : 0;
            c11 = c13;
        }
        int i49 = i12;
        boolean z10 = z6;
        int i50 = i49;
        while (i50 < width) {
            int i51 = width * (-8);
            int i52 = i50;
            int i53 = -8;
            int i54 = i49;
            int i55 = i54;
            int i56 = i55;
            int i57 = i56;
            int i58 = i57;
            int i59 = i58;
            int i60 = i59;
            int i61 = i60;
            int i62 = i61;
            while (i53 <= i) {
                int i63 = i;
                int i64 = i49;
                int max = Math.max(i64, i51) + i52;
                int[] iArr11 = iArr7[i53 + 8];
                iArr11[i64] = iArr2[max];
                iArr11[z10 ? 1 : 0] = iArr3[max];
                iArr11[c9] = iArr4[max];
                int abs2 = 9 - Math.abs(i53);
                i54 = (iArr2[max] * abs2) + i54;
                i55 = (iArr3[max] * abs2) + i55;
                i56 = (iArr4[max] * abs2) + i56;
                if (i53 > 0) {
                    i60 += iArr11[0];
                    i61 += iArr11[z10 ? 1 : 0];
                    i62 += iArr11[c9];
                } else {
                    i57 += iArr11[0];
                    i58 += iArr11[z10 ? 1 : 0];
                    i59 += iArr11[c9];
                }
                if (i53 < i11) {
                    i51 += width;
                }
                i53++;
                i = i63;
                i49 = 0;
            }
            int i65 = i;
            int i66 = i52;
            int i67 = i65;
            for (int i68 = 0; i68 < height; i68++) {
                iArr[i66] = (iArr[i66] & (-16777216)) | (iArr6[i54] << 16) | (iArr6[i55] << 8) | iArr6[i56];
                int i69 = i54 - i57;
                int i70 = i55 - i58;
                int i71 = i56 - i59;
                int[] iArr12 = iArr7[(i67 + 9) % 17];
                int i72 = i57 - iArr12[0];
                int i73 = i58 - iArr12[z10 ? 1 : 0];
                int i74 = i59 - iArr12[c9];
                if (i52 == 0) {
                    i4 = i66;
                    iArr5[i68] = Math.min(i68 + 9, i11) * width;
                } else {
                    i4 = i66;
                }
                int i75 = i52 + iArr5[i68];
                int i76 = iArr2[i75];
                iArr12[0] = i76;
                int i77 = iArr3[i75];
                iArr12[z10 ? 1 : 0] = i77;
                int i78 = iArr4[i75];
                iArr12[c9] = i78;
                int i79 = i60 + i76;
                int i80 = i61 + i77;
                int i81 = i62 + i78;
                i54 = i69 + i79;
                i55 = i70 + i80;
                i56 = i71 + i81;
                i67 = (i67 + 1) % 17;
                int[] iArr13 = iArr7[i67];
                int i82 = iArr13[0];
                i57 = i72 + i82;
                int i83 = iArr13[z10 ? 1 : 0];
                i58 = i73 + i83;
                int i84 = iArr13[c9];
                i59 = i74 + i84;
                i60 = i79 - i82;
                i61 = i80 - i83;
                i62 = i81 - i84;
                i66 = i4 + width;
            }
            i49 = 0;
            i50 = i52 + 1;
            i = i65;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[f20413a];
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
