package defpackage;

import android.bluetooth.le.ScanSettings;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.yandex.taxi.masstransit.geopayment.adapter.a;

/* loaded from: classes12.dex */
public final class y26 {
    public static final byte[] c = {76, 0, 2, 21};
    public static final List d = scc.g(new byte[]{-66, 9, -66, -17}, new byte[]{PKIBody._CANN, 2, -66, -17});
    public static final Set e = j73.f0(new Integer[]{20, 21});
    public final a a;
    public final ScanSettings b = new ScanSettings.Builder().setScanMode(2).setCallbackType(1).setMatchMode(1).setNumOfMatches(1).setReportDelay(0).build();

    public y26(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x26 a(byte[] bArr) {
        int i;
        int i2;
        byte[] m;
        String r;
        if (bArr != null) {
            int length = bArr.length - 4;
            if (length >= 0) {
                i = 0;
                while (!Arrays.equals(f73.m(i, i + 4, bArr), c)) {
                    if (i != length) {
                        i++;
                    }
                }
                if (i != -1 && bArr.length > (i2 = i + 24)) {
                    int i3 = i + 20;
                    m = f73.m(i + 4, i3, bArr);
                    int i4 = i + 22;
                    byte[] m2 = f73.m(i3, i4, bArr);
                    byte[] m3 = f73.m(i4, i2, bArr);
                    if (m.length >= 16) {
                        r = null;
                    } else {
                        String K = j73.K(f73.m(0, 16, m), "", new ar5(17), 30);
                        r = g8e.r(oyr.w(gvu0.A0(8, K), "-", K.substring(8, 12), "-", K.substring(12, 16)), "-", K.substring(16, 20), "-", K.substring(20, 32));
                    }
                    if (r != null) {
                        return new x26(r, ((m2[0] & 255) << 8) | (m2[1] & 255), (m3[1] & 255) | ((m3[0] & 255) << 8));
                    }
                }
            }
            i = -1;
            if (i != -1) {
                int i32 = i + 20;
                m = f73.m(i + 4, i32, bArr);
                int i42 = i + 22;
                byte[] m22 = f73.m(i32, i42, bArr);
                byte[] m32 = f73.m(i42, i2, bArr);
                if (m.length >= 16) {
                }
                if (r != null) {
                }
            }
        }
        return null;
    }
}
