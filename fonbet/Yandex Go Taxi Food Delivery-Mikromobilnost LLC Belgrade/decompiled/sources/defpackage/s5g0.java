package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.a;
import java.util.Map;

/* loaded from: classes11.dex */
public final class s5g0 implements fc51 {
    @Override // defpackage.fc51
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            ny61.g("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            kbs.f(barcodeFormat, "Can only encode QR_CODE, but got ");
            return null;
        }
        if (i < 0 || i2 < 0) {
            h490.a(i, i2, "Requested dimensions are too small: ");
            return null;
        }
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
        int i3 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        kn1 kn1Var = a.b(str, errorCorrectionLevel, map).e;
        if (kn1Var == null) {
            ny61.k();
            return null;
        }
        int i4 = kn1Var.b;
        int i5 = kn1Var.c;
        int i6 = i3 * 2;
        int i7 = i4 + i6;
        int i8 = i6 + i5;
        int max = Math.max(i, i7);
        int max2 = Math.max(i2, i8);
        int min = Math.min(max / i7, max2 / i8);
        int i9 = (max - (i4 * min)) / 2;
        int i10 = (max2 - (i5 * min)) / 2;
        vz5 vz5Var = new vz5(max, max2);
        int i11 = 0;
        while (i11 < i5) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < i4) {
                if (kn1Var.u(i12, i11) == 1) {
                    vz5Var.d(i13, i10, min, min);
                }
                i12++;
                i13 += min;
            }
            i11++;
            i10 += min;
        }
        return vz5Var;
    }
}
