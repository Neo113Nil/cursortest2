package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class MsgSigDigest extends Asn1OctetString {
    public MsgSigDigest() {
    }

    public MsgSigDigest(byte[] bArr) {
        super(bArr);
    }

    public MsgSigDigest(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public MsgSigDigest(String str) throws Asn1ValueParseException {
        super(str);
    }
}
