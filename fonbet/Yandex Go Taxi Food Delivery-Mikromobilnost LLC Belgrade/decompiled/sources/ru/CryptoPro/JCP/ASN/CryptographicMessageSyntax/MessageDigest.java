package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class MessageDigest extends Asn1OctetString {
    public MessageDigest() {
    }

    public MessageDigest(byte[] bArr) {
        super(bArr);
    }

    public MessageDigest(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public MessageDigest(String str) throws Asn1ValueParseException {
        super(str);
    }
}
