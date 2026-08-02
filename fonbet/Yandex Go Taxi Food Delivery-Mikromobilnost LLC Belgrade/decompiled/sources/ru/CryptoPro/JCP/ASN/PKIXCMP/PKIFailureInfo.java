package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class PKIFailureInfo extends Asn1BitString {
    public static final int addInfoNotAvailable = 17;
    public static final int badAlg = 0;
    public static final int badCertId = 4;
    public static final int badDataFormat = 5;
    public static final int badMessageCheck = 1;
    public static final int badPOP = 9;
    public static final int badRequest = 2;
    public static final int badTime = 3;
    public static final int incorrectData = 7;
    public static final int missingTimeStamp = 8;
    public static final int systemFailure = 25;
    public static final int timeNotAvailable = 14;
    public static final int unacceptedExtension = 16;
    public static final int unacceptedPolicy = 15;
    public static final int wrongAuthority = 6;

    public PKIFailureInfo() {
        this.value = new byte[4];
    }

    public PKIFailureInfo(int i, byte[] bArr) {
        super(i, bArr);
    }

    public PKIFailureInfo(boolean[] zArr) {
        super(zArr);
    }

    public PKIFailureInfo(String str) throws Asn1ValueParseException {
        super(str);
    }

    public PKIFailureInfo(BitSet bitSet) {
        super(bitSet);
    }
}
