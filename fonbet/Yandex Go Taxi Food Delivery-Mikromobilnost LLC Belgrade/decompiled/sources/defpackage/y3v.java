package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class y3v extends y170 {
    public static final int[] b = {1, 1, 1, 1};
    public static final int[] c = {3, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            ny61.g("The length of the input should be even");
            return null;
        }
        if (length > 80) {
            ny61.g(oyr.i(length, "Requested contents should be less than 80 digits long, but got "));
            return null;
        }
        y170.c(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int b2 = y170.b(zArr, 0, b, true);
        for (int i = 0; i < length; i += 2) {
            int digit = Character.digit(str.charAt(i), 10);
            int digit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = d;
                iArr[i3] = iArr2[digit][i2];
                iArr[i3 + 1] = iArr2[digit2][i2];
            }
            b2 += y170.b(zArr, b2, iArr, true);
        }
        y170.b(zArr, b2, c, true);
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.ITF);
    }
}
