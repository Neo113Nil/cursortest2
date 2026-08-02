package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class PrivateKeyTimeValidityControlMode extends Asn1BitString {
    public static final int pktvcmUseCertificate = 0;
    public static final int pktvcmUseContainer = 1;

    public PrivateKeyTimeValidityControlMode() {
        this.value = new byte[1];
    }

    public PrivateKeyTimeValidityControlMode(int i, byte[] bArr) {
        super(i, bArr);
    }

    public PrivateKeyTimeValidityControlMode(boolean[] zArr) {
        super(zArr);
    }

    public PrivateKeyTimeValidityControlMode(String str) throws Asn1ValueParseException {
        super(str);
    }

    public PrivateKeyTimeValidityControlMode(BitSet bitSet) {
        super(bitSet);
    }
}
