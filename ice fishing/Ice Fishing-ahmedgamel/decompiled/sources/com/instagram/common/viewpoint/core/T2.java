package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T2 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, 12, 14};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i, int i4) throws IOException {
        C1081Lo c1081Lo = new C1081Lo(inputStream);
        c1081Lo.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1081Lo, null, options);
        c1081Lo.reset();
        if (!c1081Lo.A00()) {
            options.inSampleSize = A00(options, i4, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c1081Lo, null, options);
        }
        return BitmapFactory.decodeStream(c1081Lo);
    }

    public static Bitmap A02(String str, int i, int i4, T8 t82) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i4, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t6) {
            t82.A08().ABC(A03(0, 5, 116), AbstractC1272Td.A1h, new C1273Te(t6));
            return null;
        }
    }
}
