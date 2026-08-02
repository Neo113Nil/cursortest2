package defpackage;

/* loaded from: classes8.dex */
public final class v4o extends w4o {
    public static final v4o d;

    static {
        byte[] bArr = tje.Q0;
        byte[] bArr2 = new byte[42];
        for (int i = 0; i < 42; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        d = new v4o("https://authproxy.prod.yb.yandex.net/", "https://authproxy-pcidss.prod.yb.yandex.net/", new String(bArr2, uza.a));
    }
}
