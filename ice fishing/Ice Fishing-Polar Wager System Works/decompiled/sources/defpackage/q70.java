package defpackage;

/* loaded from: classes.dex */
public abstract class q70 {
    public static final java.nio.charset.Charset IHQe1A4L2xu;
    public static final byte[] oh6vYeIP;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        IHQe1A4L2xu = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        oh6vYeIP = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        try {
            new defpackage.md(bArr, 0, 0, false).SH1y5HwkJhh(0);
        } catch (defpackage.g80 e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static void IHQe1A4L2xu(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static int oh6vYeIP(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
