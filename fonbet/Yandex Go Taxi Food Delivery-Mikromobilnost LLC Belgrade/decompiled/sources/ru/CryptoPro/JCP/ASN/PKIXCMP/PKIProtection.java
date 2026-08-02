package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class PKIProtection extends Asn1BitString {
    public PKIProtection() {
    }

    public PKIProtection(int i, byte[] bArr) {
        super(i, bArr);
    }

    public PKIProtection(boolean[] zArr) {
        super(zArr);
    }

    public PKIProtection(String str) throws Asn1ValueParseException {
        super(str);
    }

    public PKIProtection(BitSet bitSet) {
        super(bitSet);
    }
}
