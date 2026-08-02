package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1T61String;
import java.io.IOException;

/* loaded from: classes4.dex */
public class TeletexCommonName extends Asn1T61String {
    public TeletexCommonName() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1T61String, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() < 1 || getLength() > 32768) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1T61String, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() < 1 || getLength() > 32768) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public TeletexCommonName(String str) {
        super(str);
    }
}
