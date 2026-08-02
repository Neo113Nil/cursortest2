package ru.CryptoPro.JCSP.MSCAPI;

/* loaded from: classes4.dex */
public class CSPProvRSA_1 extends HProv {
    public static final int PROV_RSA_1 = 1;

    public CSPProvRSA_1() {
        super(0L);
    }

    @Override // ru.CryptoPro.JCSP.MSCAPI.HProv
    public int getProvType() {
        return 1;
    }

    public CSPProvRSA_1(long j) {
        super(j);
    }
}
