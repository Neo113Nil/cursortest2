package ru.CryptoPro.JCSP.MSCAPI;

/* loaded from: classes4.dex */
public class CSPProvRSA extends HProv {
    public static final int PROV_RSA = 24;

    public CSPProvRSA() {
        super(0L);
    }

    @Override // ru.CryptoPro.JCSP.MSCAPI.HProv
    public int getProvType() {
        return 24;
    }

    public CSPProvRSA(long j) {
        super(j);
    }
}
