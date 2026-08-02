package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PKIHeader_pvno extends Asn1Integer {
    public static final int ietf_version2 = 1;

    public PKIHeader_pvno() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Integer, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public PKIHeader_pvno(long j) {
        super(j);
    }
}
