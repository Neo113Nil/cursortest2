package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class Digest extends Asn1OctetString {
    public Digest() {
    }

    public Digest(byte[] bArr) {
        super(bArr);
    }

    public Digest(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public Digest(String str) throws Asn1ValueParseException {
        super(str);
    }
}
