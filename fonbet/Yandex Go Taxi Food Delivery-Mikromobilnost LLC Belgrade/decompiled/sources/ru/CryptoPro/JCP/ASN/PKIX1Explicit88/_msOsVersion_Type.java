package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import java.io.IOException;

/* loaded from: classes4.dex */
public class _msOsVersion_Type extends Asn1IA5String {
    public _msOsVersion_Type() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1IA5String, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() < 1 || getLength() > 32768) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1IA5String, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() < 1 || getLength() > 32768) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public _msOsVersion_Type(String str) {
        super(str);
    }
}
