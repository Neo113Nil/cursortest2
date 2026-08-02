package ru.CryptoPro.JCSP.CStructReader;

/* loaded from: classes4.dex */
public class CryptPinSourceProvStructure extends CryptPinSourcePasswStructure {
    public CryptPinSourceProvStructure() {
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.CryptPinSourcePasswStructure, ru.CryptoPro.JCSP.CStructReader.CryptPinMetaStructure
    public byte getUnionType() {
        return (byte) 1;
    }

    public CryptPinSourceProvStructure(long j) {
        super(j);
    }
}
