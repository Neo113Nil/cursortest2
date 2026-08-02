package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class ReasonFlags extends Asn1BitString {
    public static final int aACompromise = 8;
    public static final int affiliationChanged = 3;
    public static final int caCompromise = 2;
    public static final int certificateHold = 6;
    public static final int cessationOfOperation = 5;
    public static final int keyCompromise = 1;
    public static final int privilegeWithdrawn = 7;
    public static final int superseded = 4;
    public static final int unused = 0;

    public ReasonFlags() {
        this.value = new byte[2];
    }

    public ReasonFlags(int i, byte[] bArr) {
        super(i, bArr);
    }

    public ReasonFlags(boolean[] zArr) {
        super(zArr);
    }

    public ReasonFlags(String str) throws Asn1ValueParseException {
        super(str);
    }

    public ReasonFlags(BitSet bitSet) {
        super(bitSet);
    }
}
