package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1BigInteger;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class Nonce extends Asn1BigInteger {
    public Nonce() {
    }

    public Nonce(BigInteger bigInteger) {
        super(bigInteger);
    }

    public Nonce(String str) {
        super(str);
    }

    public Nonce(String str, int i) {
        super(str, i);
    }
}
