package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class BasicNameForms extends Asn1BitString {
    public static final int dNSName = 1;
    public static final int directoryName = 3;
    public static final int ediPartyName = 4;
    public static final int iPAddress = 6;
    public static final int registeredID = 7;
    public static final int rfc822Name = 0;
    public static final int uniformResourceIdentifier = 5;
    public static final int x400Address = 2;

    public BasicNameForms() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() < 1) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() >= 1) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1ConsVioException("getLength()", getLength());
    }

    public BasicNameForms(int i, byte[] bArr) {
        super(i, bArr);
    }

    public BasicNameForms(boolean[] zArr) {
        super(zArr);
    }

    public BasicNameForms(String str) throws Asn1ValueParseException {
        super(str);
    }

    public BasicNameForms(BitSet bitSet) {
        super(bitSet);
    }
}
