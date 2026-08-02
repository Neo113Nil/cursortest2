package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ESSCertID extends Asn1Type {
    public CertHash certHash;
    public IssuerSerial issuerSerial;

    public ESSCertID(byte[] bArr, IssuerSerial issuerSerial) {
        this.certHash = new CertHash(bArr);
        this.issuerSerial = issuerSerial;
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
        CertHash certHash = new CertHash();
        this.certHash = certHash;
        certHash.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            IssuerSerial issuerSerial = new IssuerSerial();
            this.issuerSerial = issuerSerial;
            issuerSerial.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        IssuerSerial issuerSerial = this.issuerSerial;
        int encode = this.certHash.encode(asn1BerEncodeBuffer, true) + (issuerSerial != null ? issuerSerial.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.certHash = null;
        this.issuerSerial = null;
    }

    public ESSCertID(CertHash certHash, IssuerSerial issuerSerial) {
        this.certHash = certHash;
        this.issuerSerial = issuerSerial;
    }

    public ESSCertID(CertHash certHash) {
        this.certHash = certHash;
    }

    public ESSCertID() {
    }

    public ESSCertID(byte[] bArr) {
        this.certHash = new CertHash(bArr);
    }
}
