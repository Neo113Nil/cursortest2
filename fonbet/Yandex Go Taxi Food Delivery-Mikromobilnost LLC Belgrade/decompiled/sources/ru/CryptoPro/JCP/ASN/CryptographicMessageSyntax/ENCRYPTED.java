package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class ENCRYPTED extends Asn1BitString {
    public ENCRYPTED() {
    }

    public ENCRYPTED(int i, byte[] bArr) {
        super(i, bArr);
    }

    public ENCRYPTED(boolean[] zArr) {
        super(zArr);
    }

    public ENCRYPTED(String str) throws Asn1ValueParseException {
        super(str);
    }

    public ENCRYPTED(BitSet bitSet) {
        super(bitSet);
    }
}
