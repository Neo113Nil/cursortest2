package defpackage;

/* loaded from: classes13.dex */
public final class rzm0 implements d1n0 {
    public final String a;

    public rzm0(String str) {
        this.a = str;
    }

    @Override // defpackage.d1n0
    public final byte[] a() {
        byte[] bytes = this.a.getBytes(uza.a);
        byte[] bArr = new byte[15];
        int i = 0;
        bArr[0] = (byte) (k2o0.c().b().d() >> 8);
        bArr[1] = (byte) (k2o0.c().b().d() & 255);
        bArr[2] = 8;
        bArr[4] = 0;
        bArr[5] = 1;
        int length = bytes.length;
        int i2 = 0;
        while (i < length) {
            bArr[i2 + 6] = bytes[i];
            i++;
            i2++;
        }
        return bArr;
    }
}
