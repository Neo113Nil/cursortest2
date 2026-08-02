package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class SAMFlags extends Asn1BitString {
    public SAMFlags() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        if (getLength() < 32) {
            throw new Asn1ConsVioException("getLength()", getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (getLength() >= 32) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1ConsVioException("getLength()", getLength());
    }

    public SAMFlags(int i, byte[] bArr) {
        super(i, bArr);
    }

    public SAMFlags(boolean[] zArr) {
        super(zArr);
    }

    public SAMFlags(String str) throws Asn1ValueParseException {
        super(str);
    }

    public SAMFlags(BitSet bitSet) {
        super(bitSet);
    }
}
