package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public abstract class ytu {
    public static final ByteString a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        ByteString byteString = new ByteString("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(uza.a));
        byteString.b = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        a = byteString;
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = bg61.e("%8s", Integer.toBinaryString(i)).replace(HexString.CHAR_SPACE, MoneyInputEditView.DEFAULT_VALUE);
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = oyr.t(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = oyr.t(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : bg61.e("0x%02x", Integer.valueOf(i));
    }

    public static String b(int i, int i2, int i3, int i4, boolean z) {
        String str;
        String a2 = a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = d;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = c;
                    String str2 = i4 < strArr2.length ? strArr2[i4] : strArr[i4];
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : cvu0.v(str2, "PRIORITY", "COMPRESSED", false) : cvu0.v(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr[i4];
        }
        return bg61.e("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a2, str);
    }

    public static String c(int i, int i2, long j, boolean z) {
        return bg61.e("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
