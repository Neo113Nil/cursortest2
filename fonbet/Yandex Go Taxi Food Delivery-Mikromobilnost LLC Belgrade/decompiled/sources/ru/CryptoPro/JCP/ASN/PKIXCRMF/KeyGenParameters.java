package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class KeyGenParameters extends Asn1OctetString {
    public KeyGenParameters() {
    }

    public KeyGenParameters(byte[] bArr) {
        super(bArr);
    }

    public KeyGenParameters(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public KeyGenParameters(String str) throws Asn1ValueParseException {
        super(str);
    }
}
