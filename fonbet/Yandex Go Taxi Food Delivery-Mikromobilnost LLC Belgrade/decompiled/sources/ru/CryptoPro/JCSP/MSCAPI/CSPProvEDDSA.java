package ru.CryptoPro.JCSP.MSCAPI;

/* loaded from: classes4.dex */
public class CSPProvEDDSA extends HProv {
    public CSPProvEDDSA() {
        super(0L);
    }

    @Override // ru.CryptoPro.JCSP.MSCAPI.HProv
    public int getProvType() {
        return 32;
    }

    public CSPProvEDDSA(long j) {
        super(j);
    }
}
