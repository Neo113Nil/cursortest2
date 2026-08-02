package g8;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f37770a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f37771b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f37770a = strArr;
        byte[] bArr = new byte[93];
        for (int i4 = 0; i4 < 32; i4++) {
            bArr[i4] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f37771b = bArr;
    }

    public static final void a(StringBuilder sb, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = value.charAt(i4);
            String[] strArr = f37770a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i, i4);
                sb.append(strArr[charAt]);
                i = i4 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i) {
        int i4 = i & 15;
        return (char) (i4 < 10 ? i4 + 48 : i4 + 87);
    }
}
