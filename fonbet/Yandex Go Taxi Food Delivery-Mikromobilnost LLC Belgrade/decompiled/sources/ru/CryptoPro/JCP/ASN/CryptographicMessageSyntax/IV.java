package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class IV extends Asn1OctetString {
    public IV() {
    }

    public IV(byte[] bArr) {
        super(bArr);
    }

    public IV(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public IV(String str) throws Asn1ValueParseException {
        super(str);
    }
}
