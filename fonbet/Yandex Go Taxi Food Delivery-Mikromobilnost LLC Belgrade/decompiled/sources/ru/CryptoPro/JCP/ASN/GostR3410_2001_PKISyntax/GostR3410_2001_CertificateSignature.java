package ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class GostR3410_2001_CertificateSignature extends Asn1BitString {
    public GostR3410_2001_CertificateSignature() {
        this.value = new byte[64];
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() < 256 || getLength() > 512) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() < 256 || getLength() > 512) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
        return super.encode(asn1BerEncodeBuffer, z);
    }

    public GostR3410_2001_CertificateSignature(int i, byte[] bArr) {
        super(i, bArr);
    }

    public GostR3410_2001_CertificateSignature(boolean[] zArr) {
        super(zArr);
    }

    public GostR3410_2001_CertificateSignature(String str) throws Asn1ValueParseException {
        super(str);
    }

    public GostR3410_2001_CertificateSignature(BitSet bitSet) {
        super(bitSet);
    }
}
