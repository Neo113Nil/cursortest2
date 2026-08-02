package g8;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f37735a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f37736b = new byte[com.anythink.expressad.video.module.a.a.f22514Q];

    static {
        int i = 0;
        for (int i4 = 0; i4 < 32; i4++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f37736b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = Byte.MAX_VALUE;
            i++;
        }
    }

    public static void a(char c9, int i) {
        if (c9 != 'u') {
            f37735a[c9] = (char) i;
        }
    }
}
