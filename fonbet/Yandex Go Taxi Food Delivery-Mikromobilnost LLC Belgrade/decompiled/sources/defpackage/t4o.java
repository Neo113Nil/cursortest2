package defpackage;

/* loaded from: classes8.dex */
public final class t4o extends w4o {
    public static final t4o d;

    static {
        byte[] bArr = tje.Z;
        byte[] bArr2 = new byte[41];
        for (int i = 0; i < 41; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        d = new t4o("https://authproxy.uat.yb.yandex.net/", "https://authproxy-pcidss.uat.yb.yandex.net/", new String(bArr2, uza.a));
    }
}
