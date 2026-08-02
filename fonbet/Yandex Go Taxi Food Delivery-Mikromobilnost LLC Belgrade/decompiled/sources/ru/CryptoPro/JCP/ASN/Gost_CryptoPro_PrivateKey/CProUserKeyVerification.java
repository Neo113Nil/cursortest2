package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CProUserKeyVerification extends Asn1Type {
    public Asn1OctetString magicNumber;
    public Asn1OctetString randomVector;

    public CProUserKeyVerification(byte[] bArr, byte[] bArr2) {
        this.magicNumber = new Asn1OctetString(bArr);
        this.randomVector = new Asn1OctetString(bArr2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.magicNumber = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.magicNumber.getLength() != 10) {
            throw new Asn1ConsVioException("magicNumber.getLength()", this.magicNumber.getLength());
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.randomVector = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.randomVector.getLength() != 8) {
            throw new Asn1ConsVioException("randomVector.getLength()", this.randomVector.getLength());
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 4)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.randomVector.getLength() != 8) {
            throw new Asn1ConsVioException("randomVector.getLength()", this.randomVector.getLength());
        }
        int encode = this.randomVector.encode(asn1BerEncodeBuffer, true);
        if (this.magicNumber.getLength() != 10) {
            throw new Asn1ConsVioException("magicNumber.getLength()", this.magicNumber.getLength());
        }
        int encode2 = this.magicNumber.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.magicNumber = null;
        this.randomVector = null;
    }

    public CProUserKeyVerification(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2) {
        this.magicNumber = asn1OctetString;
        this.randomVector = asn1OctetString2;
    }

    public CProUserKeyVerification() {
    }
}
