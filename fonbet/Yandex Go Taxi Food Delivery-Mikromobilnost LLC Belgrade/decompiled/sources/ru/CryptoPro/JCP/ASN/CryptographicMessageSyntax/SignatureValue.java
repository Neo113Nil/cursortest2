package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class SignatureValue extends Asn1OctetString {
    public SignatureValue() {
    }

    public SignatureValue(byte[] bArr) {
        super(bArr);
    }

    public SignatureValue(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public SignatureValue(String str) throws Asn1ValueParseException {
        super(str);
    }
}
