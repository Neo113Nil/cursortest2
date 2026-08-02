package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;

/* loaded from: classes4.dex */
public class UserKeyingMaterial extends Asn1OctetString {
    public UserKeyingMaterial() {
    }

    public UserKeyingMaterial(byte[] bArr) {
        super(bArr);
    }

    public UserKeyingMaterial(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public UserKeyingMaterial(String str) throws Asn1ValueParseException {
        super(str);
    }
}
