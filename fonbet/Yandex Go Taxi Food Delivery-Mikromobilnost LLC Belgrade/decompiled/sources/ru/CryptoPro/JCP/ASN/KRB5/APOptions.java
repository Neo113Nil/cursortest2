package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class APOptions extends Asn1BitString {
    public static final int mutual_required = 2;
    public static final int reserved = 0;
    public static final int use_session_key = 1;

    public APOptions() {
        this.value = new byte[1];
    }

    public APOptions(int i, byte[] bArr) {
        super(i, bArr);
    }

    public APOptions(boolean[] zArr) {
        super(zArr);
    }

    public APOptions(String str) throws Asn1ValueParseException {
        super(str);
    }

    public APOptions(BitSet bitSet) {
        super(bitSet);
    }
}
