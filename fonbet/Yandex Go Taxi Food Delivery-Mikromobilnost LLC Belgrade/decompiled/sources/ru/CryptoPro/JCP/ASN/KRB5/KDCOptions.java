package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class KDCOptions extends Asn1BitString {
    public static final int allow_postdate = 5;
    public static final int enc_tkt_in_skey = 28;
    public static final int forwardable = 1;
    public static final int forwarded = 2;
    public static final int postdated = 6;
    public static final int proxiable = 3;
    public static final int proxy = 4;
    public static final int renew = 30;
    public static final int renewable = 8;
    public static final int renewable_ok = 27;
    public static final int reserved = 0;
    public static final int unused7 = 7;
    public static final int unused9 = 9;
    public static final int validate = 31;

    public KDCOptions() {
        this.value = new byte[4];
    }

    public KDCOptions(int i, byte[] bArr) {
        super(i, bArr);
    }

    public KDCOptions(boolean[] zArr) {
        super(zArr);
    }

    public KDCOptions(String str) throws Asn1ValueParseException {
        super(str);
    }

    public KDCOptions(BitSet bitSet) {
        super(bitSet);
    }
}
