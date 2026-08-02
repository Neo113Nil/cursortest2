package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public abstract class y170 implements fc51 {
    public static final Pattern a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static void c(String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        ny61.g("Input should only contain digits 0-9");
    }

    @Override // defpackage.fc51
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            ny61.g("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            h490.a(i, i2, "Negative size is not allowed. Input: ");
            return null;
        }
        Collection g = g();
        if (g != null && !g.contains(barcodeFormat)) {
            w511.l("Can only encode ", g, ", but got ", barcodeFormat);
            return null;
        }
        int f = f();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                f = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        boolean[] e = e(str, map);
        int length = e.length;
        int i3 = f + length;
        int max = Math.max(i, i3);
        int max2 = Math.max(1, i2);
        int i4 = max / i3;
        int i5 = (max - (length * i4)) / 2;
        vz5 vz5Var = new vz5(max, max2);
        int i6 = 0;
        while (i6 < length) {
            if (e[i6]) {
                vz5Var.d(i5, 0, i4, max2);
            }
            i6++;
            i5 += i4;
        }
        return vz5Var;
    }

    public abstract boolean[] d(String str);

    public boolean[] e(String str, Map map) {
        return d(str);
    }

    public int f() {
        return 10;
    }

    public Collection g() {
        return null;
    }
}
