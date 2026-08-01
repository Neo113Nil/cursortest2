package g8;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f37744a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f37745b;

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
        f37744a = strArr;
        byte[] bArr = new byte[93];
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i6] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f37745b = bArr;
    }

    public static final void a(StringBuilder sb, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = value.charAt(i6);
            String[] strArr = f37744a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i, i6);
                sb.append(strArr[charAt]);
                i = i6 + 1;
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
        int i6 = i & 15;
        return (char) (i6 < 10 ? i6 + 48 : i6 + 87);
    }
}
