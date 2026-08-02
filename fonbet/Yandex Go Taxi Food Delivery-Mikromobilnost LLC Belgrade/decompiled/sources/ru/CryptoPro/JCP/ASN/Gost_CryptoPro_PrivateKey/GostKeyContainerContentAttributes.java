package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class GostKeyContainerContentAttributes extends Asn1BitString {
    public static final int kccaFKCShared = 3;
    public static final int kccaPrimaryKeyAbsent = 2;
    public static final int kccaReservePrimary = 1;
    public static final int kccaSoftPassword = 0;

    public GostKeyContainerContentAttributes() {
        this.value = new byte[1];
    }

    public GostKeyContainerContentAttributes(int i, byte[] bArr) {
        super(i, bArr);
    }

    public GostKeyContainerContentAttributes(boolean[] zArr) {
        super(zArr);
    }

    public GostKeyContainerContentAttributes(String str) throws Asn1ValueParseException {
        super(str);
    }

    public GostKeyContainerContentAttributes(BitSet bitSet) {
        super(bitSet);
    }
}
