package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class KeyIdentifier extends Asn1OctetString {
    public KeyIdentifier() {
    }

    public KeyIdentifier(byte[] bArr) {
        super(bArr);
    }

    public KeyIdentifier(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public KeyIdentifier(String str) throws Asn1ValueParseException {
        super(str);
    }
}
