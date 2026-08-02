package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class CBCParameter extends IV {
    public CBCParameter() {
    }

    public CBCParameter(byte[] bArr) {
        super(bArr);
    }

    public CBCParameter(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public CBCParameter(String str) throws Asn1ValueParseException {
        super(str);
    }
}
