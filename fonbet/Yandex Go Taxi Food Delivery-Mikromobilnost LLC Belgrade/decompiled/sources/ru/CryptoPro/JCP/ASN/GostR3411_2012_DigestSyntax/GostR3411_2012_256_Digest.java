package ru.CryptoPro.JCP.ASN.GostR3411_2012_DigestSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GostR3411_2012_256_Digest extends Asn1OctetString {
    public GostR3411_2012_256_Digest() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() != 32) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() == 32) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1ConsVioException("getLength()", getLength());
    }

    public GostR3411_2012_256_Digest(byte[] bArr) {
        super(bArr);
    }

    public GostR3411_2012_256_Digest(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public GostR3411_2012_256_Digest(String str) throws Asn1ValueParseException {
        super(str);
    }
}
