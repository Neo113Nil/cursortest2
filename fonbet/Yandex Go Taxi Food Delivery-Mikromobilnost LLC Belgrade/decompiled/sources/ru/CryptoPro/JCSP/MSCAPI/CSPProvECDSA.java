package ru.CryptoPro.JCSP.MSCAPI;

/* loaded from: classes4.dex */
public class CSPProvECDSA extends HProv {
    public CSPProvECDSA() {
        super(0L);
    }

    @Override // ru.CryptoPro.JCSP.MSCAPI.HProv
    public int getProvType() {
        return 16;
    }

    public CSPProvECDSA(long j) {
        super(j);
    }
}
