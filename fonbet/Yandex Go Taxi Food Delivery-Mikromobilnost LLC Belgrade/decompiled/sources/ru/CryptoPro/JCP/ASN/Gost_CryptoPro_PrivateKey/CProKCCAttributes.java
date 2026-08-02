package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class CProKCCAttributes extends Asn1BitString {
    public static final int cpkccaAuthPerOperation = 4;
    public static final int cpkccaFKCShared = 3;
    public static final int cpkccaPrimaryKeyAbsent = 2;
    public static final int cpkccaReservePrimary = 1;
    public static final int cpkccaSoftPassword = 0;

    public CProKCCAttributes() {
        this.value = new byte[1];
    }

    public CProKCCAttributes(int i, byte[] bArr) {
        super(i, bArr);
    }

    public CProKCCAttributes(boolean[] zArr) {
        super(zArr);
    }

    public CProKCCAttributes(String str) throws Asn1ValueParseException {
        super(str);
    }

    public CProKCCAttributes(BitSet bitSet) {
        super(bitSet);
    }
}
