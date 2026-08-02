package defpackage;

import android.media.MediaFormat;
import java.util.Locale;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes7.dex */
public abstract class qfa1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", CA20Status.STATUS_REQUEST_C};
    public static au2 c;
    public static mgv d;

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = rf71.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static void b(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
