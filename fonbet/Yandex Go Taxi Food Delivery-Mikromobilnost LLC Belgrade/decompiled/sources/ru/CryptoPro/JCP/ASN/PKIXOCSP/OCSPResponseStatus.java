package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Enumerated;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidEnumException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class OCSPResponseStatus extends Asn1Enumerated {
    public static final int badCRL = 8;
    public static final int internalError = 2;
    public static final int malformedRequest = 1;
    public static final int sigRequired = 5;
    public static final int successful = 0;
    public static final int tryLater = 3;
    public static final int unauthorized = 6;

    public OCSPResponseStatus() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        int i2 = this.value;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6 && i2 != 8) {
            throw new Asn1InvalidEnumException(this.value);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.value;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 5 || i == 6 || i == 8) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    public OCSPResponseStatus(int i) {
        super(i);
    }
}
