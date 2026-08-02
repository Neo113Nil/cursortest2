package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class TicketFlags extends Asn1BitString {
    public static final int forwardable = 1;
    public static final int forwarded = 2;
    public static final int initial = 9;
    public static final int invalid = 7;
    public static final int may_postdate = 5;
    public static final int postdated = 6;
    public static final int proxiable = 3;
    public static final int proxy = 4;
    public static final int renewable = 8;
    public static final int reserved = 0;

    public TicketFlags() {
        this.value = new byte[2];
    }

    public TicketFlags(int i, byte[] bArr) {
        super(i, bArr);
    }

    public TicketFlags(boolean[] zArr) {
        super(zArr);
    }

    public TicketFlags(String str) throws Asn1ValueParseException {
        super(str);
    }

    public TicketFlags(BitSet bitSet) {
        super(bitSet);
    }
}
