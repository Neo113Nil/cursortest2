package Q1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final W1.j f1599a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1600b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1601c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1602d;

    static {
        W1.j jVar = W1.j.f1876d;
        f1599a = m0.j.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1600b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1601c = new String[64];
        String[] strArr = new String[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(it)");
            String replace = K1.b.i("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.i.d(replace, "replace(...)");
            strArr[i3] = replace;
        }
        f1602d = strArr;
        String[] strArr2 = f1601c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = kotlin.jvm.internal.i.h("|PADDED", strArr2[i4]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr2[i5];
            i5++;
            int i7 = iArr[0];
            String[] strArr3 = f1601c;
            int i8 = i7 | i6;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i7]);
            sb.append('|');
            sb.append((Object) strArr3[i6]);
            strArr3[i8] = sb.toString();
            strArr3[i8 | 8] = ((Object) strArr3[i7]) + '|' + ((Object) strArr3[i6]) + "|PADDED";
        }
        int length = f1601c.length;
        while (i2 < length) {
            int i9 = i2 + 1;
            String[] strArr4 = f1601c;
            if (strArr4[i2] == null) {
                strArr4[i2] = f1602d[i2];
            }
            i2 = i9;
        }
    }

    public static String a(boolean z2, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        String[] strArr = f1600b;
        String i6 = i4 < strArr.length ? strArr[i4] : K1.b.i("0x%02x", Integer.valueOf(i4));
        if (i5 == 0) {
            str = "";
        } else {
            String[] strArr2 = f1602d;
            if (i4 != 2 && i4 != 3) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : strArr2[i5];
                } else if (i4 != 7 && i4 != 8) {
                    String[] strArr3 = f1601c;
                    if (i5 < strArr3.length) {
                        str2 = strArr3[i5];
                        kotlin.jvm.internal.i.b(str2);
                    } else {
                        str2 = strArr2[i5];
                    }
                    str = (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : z1.o.P(str2, "PRIORITY", "COMPRESSED") : z1.o.P(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i5];
        }
        return K1.b.i("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), i6, str);
    }
}
