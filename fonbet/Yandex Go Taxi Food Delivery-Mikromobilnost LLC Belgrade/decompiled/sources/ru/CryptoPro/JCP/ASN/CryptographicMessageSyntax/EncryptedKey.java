package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class EncryptedKey extends Asn1OctetString {
    public EncryptedKey() {
    }

    public EncryptedKey(byte[] bArr) {
        super(bArr);
    }

    public EncryptedKey(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public EncryptedKey(String str) throws Asn1ValueParseException {
        super(str);
    }
}
