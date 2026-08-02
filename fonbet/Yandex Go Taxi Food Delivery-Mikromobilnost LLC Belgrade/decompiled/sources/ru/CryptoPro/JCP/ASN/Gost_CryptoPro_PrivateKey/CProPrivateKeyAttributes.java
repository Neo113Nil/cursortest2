package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class CProPrivateKeyAttributes extends Asn1BitString {
    public static final int pkaDhAllowed = 5;
    public static final int pkaEphemeral = 3;
    public static final int pkaExchange = 2;
    public static final int pkaExportable = 0;
    public static final int pkaNonCachable = 4;
    public static final int pkaUserProtect = 1;

    public CProPrivateKeyAttributes() {
        this.value = new byte[1];
    }

    public CProPrivateKeyAttributes(int i, byte[] bArr) {
        super(i, bArr);
    }

    public CProPrivateKeyAttributes(boolean[] zArr) {
        super(zArr);
    }

    public CProPrivateKeyAttributes(String str) throws Asn1ValueParseException {
        super(str);
    }

    public CProPrivateKeyAttributes(BitSet bitSet) {
        super(bitSet);
    }
}
