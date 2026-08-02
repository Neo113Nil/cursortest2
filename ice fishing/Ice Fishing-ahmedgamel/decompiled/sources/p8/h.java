package p8;

import com.google.android.gms.internal.ads.Wv;
import x.C5175n;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final y8.h f39898a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39899b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f39900c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f39901d;

    static {
        y8.h hVar = y8.h.f41925w;
        f39898a = C5175n.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f39899b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f39900c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.h.d(binaryString, "toBinaryString(...)");
            strArr[i] = Q7.q.e0(j8.d.e("%8s", binaryString), ' ', '0');
        }
        f39901d = strArr;
        String[] strArr2 = f39900c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = Wv.i(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i9 = iArr2[i6];
            int i10 = iArr[0];
            String[] strArr3 = f39900c;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + '|' + strArr3[i9];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i10]);
            sb.append('|');
            strArr3[i11 | 8] = Wv.i(sb, strArr3[i9], "|PADDED");
        }
        int length = f39900c.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr4 = f39900c;
            if (strArr4[i12] == null) {
                strArr4[i12] = f39901d[i12];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = f39899b;
        return i < strArr.length ? strArr[i] : j8.d.e("0x%02x", Integer.valueOf(i));
    }

    public static String b(int i, int i4, int i6, int i9, boolean z6) {
        String str;
        String str2;
        String a9 = a(i6);
        if (i9 == 0) {
            str = "";
        } else {
            String[] strArr = f39901d;
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i9 == 1 ? "ACK" : strArr[i9];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr2 = f39900c;
                    if (i9 < strArr2.length) {
                        str2 = strArr2[i9];
                        kotlin.jvm.internal.h.b(str2);
                    } else {
                        str2 = strArr[i9];
                    }
                    str = (i6 != 5 || (i9 & 4) == 0) ? (i6 != 0 || (i9 & 32) == 0) ? str2 : Q7.q.f0(str2, "PRIORITY", "COMPRESSED") : Q7.q.f0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i9];
        }
        return j8.d.e("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i4), a9, str);
    }

    public static String c(int i, int i4, long j6, boolean z6) {
        return j8.d.e("%s 0x%08x %5d %-13s %d", z6 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i4), a(8), Long.valueOf(j6));
    }
}
