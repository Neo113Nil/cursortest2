package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Enumerated;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidEnumException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ServiceType extends Asn1Enumerated {
    public static final int ccpd = 4;
    public static final int cpd = 1;
    public static final int cpkc = 3;
    public static final int vsd = 2;

    public ServiceType() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        int i2 = this.value;
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw new Asn1InvalidEnumException(this.value);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.value;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    public ServiceType(int i) {
        super(i);
    }
}
