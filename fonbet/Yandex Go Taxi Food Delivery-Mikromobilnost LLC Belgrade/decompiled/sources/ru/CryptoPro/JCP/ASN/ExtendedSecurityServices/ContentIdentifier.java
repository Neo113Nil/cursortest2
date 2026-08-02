package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class ContentIdentifier extends Asn1OctetString {
    public ContentIdentifier() {
    }

    public ContentIdentifier(byte[] bArr) {
        super(bArr);
    }

    public ContentIdentifier(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public ContentIdentifier(String str) throws Asn1ValueParseException {
        super(str);
    }
}
