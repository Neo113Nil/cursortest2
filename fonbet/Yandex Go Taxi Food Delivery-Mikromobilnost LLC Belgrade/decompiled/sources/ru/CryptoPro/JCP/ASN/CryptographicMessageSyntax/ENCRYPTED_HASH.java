package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class ENCRYPTED_HASH extends Asn1BitString {
    public ENCRYPTED_HASH() {
    }

    public ENCRYPTED_HASH(int i, byte[] bArr) {
        super(i, bArr);
    }

    public ENCRYPTED_HASH(boolean[] zArr) {
        super(zArr);
    }

    public ENCRYPTED_HASH(String str) throws Asn1ValueParseException {
        super(str);
    }

    public ENCRYPTED_HASH(BitSet bitSet) {
        super(bitSet);
    }
}
