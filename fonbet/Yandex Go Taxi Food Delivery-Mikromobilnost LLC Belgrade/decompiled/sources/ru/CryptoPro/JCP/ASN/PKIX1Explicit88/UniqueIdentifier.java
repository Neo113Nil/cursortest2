package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class UniqueIdentifier extends Asn1BitString {
    public UniqueIdentifier() {
    }

    public UniqueIdentifier(int i, byte[] bArr) {
        super(i, bArr);
    }

    public UniqueIdentifier(boolean[] zArr) {
        super(zArr);
    }

    public UniqueIdentifier(String str) throws Asn1ValueParseException {
        super(str);
    }

    public UniqueIdentifier(BitSet bitSet) {
        super(bitSet);
    }
}
