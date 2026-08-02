package defpackage;

import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes13.dex */
public final class t3n0 implements d1n0 {
    public final /* synthetic */ int a;
    public final byte b;

    public /* synthetic */ t3n0(byte b, int i) {
        this.a = i;
        this.b = b;
    }

    @Override // defpackage.d1n0
    public final byte[] a() {
        switch (this.a) {
            case 0:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, -127, 1, 0};
            case 1:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, 21, 1, 0};
            case 2:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, 21, 2, 0};
            case 3:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, -94, 2, 0};
            case 4:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, DerValue.TAG_PRIVATE, 1, 0};
            case 5:
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 10, 0, this.b, 5, 1, k2o0.c().b().c()[0], k2o0.c().b().c()[1], k2o0.c().b().c()[2], k2o0.c().b().c()[3], (byte) (currentTimeMillis >> 24), (byte) (currentTimeMillis >> 16), (byte) (currentTimeMillis >> 8), (byte) (currentTimeMillis & 255), 0, 0};
            default:
                return new byte[]{(byte) (k2o0.c().b().d() >> 8), (byte) (k2o0.c().b().d() & 255), 1, 0, this.b, 5, 2, 0};
        }
    }
}
