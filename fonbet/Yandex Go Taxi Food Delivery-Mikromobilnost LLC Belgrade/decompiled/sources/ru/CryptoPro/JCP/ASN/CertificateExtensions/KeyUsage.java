package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class KeyUsage extends Asn1BitString {
    public static final int cRLSign = 6;
    public static final int dataEncipherment = 3;
    public static final int decipherOnly = 8;
    public static final int digitalSignature = 0;
    public static final int encipherOnly = 7;
    public static final int keyAgreement = 4;
    public static final int keyCertSign = 5;
    public static final int keyEncipherment = 2;
    public static final int nonRepudiation = 1;

    public KeyUsage() {
        this.value = new byte[2];
    }

    public KeyUsage(int i, byte[] bArr) {
        super(i, bArr);
    }

    public KeyUsage(boolean[] zArr) {
        super(zArr);
    }

    public KeyUsage(String str) throws Asn1ValueParseException {
        super(str);
    }

    public KeyUsage(BitSet bitSet) {
        super(bitSet);
    }
}
