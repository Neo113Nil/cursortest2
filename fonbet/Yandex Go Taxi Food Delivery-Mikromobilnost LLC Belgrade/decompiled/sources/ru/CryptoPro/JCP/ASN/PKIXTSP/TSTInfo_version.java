package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BigInteger;
import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class TSTInfo_version extends Asn1BigInteger {
    public static final int v1 = 1;

    public TSTInfo_version() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1BigInteger, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BigInteger, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public TSTInfo_version(BigInteger bigInteger) {
        super(bigInteger);
    }

    public TSTInfo_version(String str) {
        super(str);
    }

    public TSTInfo_version(String str, int i) {
        super(str, i);
    }
}
