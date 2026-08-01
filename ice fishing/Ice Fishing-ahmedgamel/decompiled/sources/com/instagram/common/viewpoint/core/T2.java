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

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 31);
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

    public static Bitmap A01(InputStream inputStream, int i, int i6) throws IOException {
        C1061Lo c1061Lo = new C1061Lo(inputStream);
        c1061Lo.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1061Lo, null, options);
        c1061Lo.reset();
        if (!c1061Lo.A00()) {
            options.inSampleSize = A00(options, i6, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c1061Lo, null, options);
        }
        return BitmapFactory.decodeStream(c1061Lo);
    }

    public static Bitmap A02(String str, int i, int i6, T8 t82) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i6, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t6) {
            t82.A08().ABC(A03(0, 5, 116), AbstractC1252Td.A1h, new C1253Te(t6));
            return null;
        }
    }
}
