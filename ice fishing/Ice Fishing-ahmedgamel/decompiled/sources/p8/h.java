package p8;

import x.C5176n;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final y8.h f39851a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39852b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f39853c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f39854d;

    static {
        y8.h hVar = y8.h.f41954w;
        f39851a = C5176n.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f39852b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f39853c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.h.d(binaryString, "toBinaryString(...)");
            strArr[i] = Q7.q.O(j8.d.e("%8s", binaryString), ' ', '0');
        }
        f39854d = strArr;
        String[] strArr2 = f39853c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = u1.h.g(new StringBuilder(), strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f39853c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = u1.h.g(sb, strArr3[i10], "|PADDED");
        }
        int length = f39853c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f39853c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f39854d[i13];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = f39852b;
        return i < strArr.length ? strArr[i] : j8.d.e("0x%02x", Integer.valueOf(i));
    }

    public static String b(int i, int i6, int i9, int i10, boolean z3) {
        String str;
        String str2;
        String a9 = a(i9);
        if (i10 == 0) {
            str = "";
        } else {
            String[] strArr = f39854d;
            if (i9 != 2 && i9 != 3) {
                if (i9 == 4 || i9 == 6) {
                    str = i10 == 1 ? "ACK" : strArr[i10];
                } else if (i9 != 7 && i9 != 8) {
                    String[] strArr2 = f39853c;
                    if (i10 < strArr2.length) {
                        str2 = strArr2[i10];
                        kotlin.jvm.internal.h.b(str2);
                    } else {
                        str2 = strArr[i10];
                    }
                    str = (i9 != 5 || (i10 & 4) == 0) ? (i9 != 0 || (i10 & 32) == 0) ? str2 : Q7.q.P(str2, "PRIORITY", "COMPRESSED") : Q7.q.P(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i10];
        }
        return j8.d.e("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i6), a9, str);
    }

    public static String c(int i, int i6, long j6, boolean z3) {
        return j8.d.e("%s 0x%08x %5d %-13s %d", z3 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i6), a(8), Long.valueOf(j6));
    }
}
