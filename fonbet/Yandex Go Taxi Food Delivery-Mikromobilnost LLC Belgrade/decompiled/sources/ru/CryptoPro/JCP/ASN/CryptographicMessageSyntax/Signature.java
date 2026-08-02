package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class Signature extends Asn1BitString {
    public Signature() {
    }

    public Signature(int i, byte[] bArr) {
        super(i, bArr);
    }

    public Signature(boolean[] zArr) {
        super(zArr);
    }

    public Signature(String str) throws Asn1ValueParseException {
        super(str);
    }

    public Signature(BitSet bitSet) {
        super(bitSet);
    }
}
