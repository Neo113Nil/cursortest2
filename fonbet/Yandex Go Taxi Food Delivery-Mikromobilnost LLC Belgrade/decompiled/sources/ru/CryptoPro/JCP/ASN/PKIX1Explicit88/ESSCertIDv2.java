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
public class ESSCertIDv2 extends Asn1Type {
    public CertHash certHash;
    public AlgorithmIdentifier hashAlgorithm;
    public IssuerSerial issuerSerial;

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
        this.hashAlgorithm = algorithmIdentifier;
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
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.hashAlgorithm = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
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
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        IssuerSerial issuerSerial = this.issuerSerial;
        int encode = this.certHash.encode(asn1BerEncodeBuffer, true) + (issuerSerial != null ? issuerSerial.encode(asn1BerEncodeBuffer, true) : 0);
        AlgorithmIdentifier algorithmIdentifier = this.hashAlgorithm;
        if (algorithmIdentifier != null) {
            encode += algorithmIdentifier.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.hashAlgorithm = null;
        this.certHash = null;
        this.issuerSerial = null;
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, CertHash certHash, IssuerSerial issuerSerial) {
        this.hashAlgorithm = algorithmIdentifier;
        this.certHash = certHash;
        this.issuerSerial = issuerSerial;
    }

    public ESSCertIDv2(CertHash certHash) {
        this.certHash = certHash;
    }

    public ESSCertIDv2() {
    }

    public ESSCertIDv2(byte[] bArr) {
        this.certHash = new CertHash(bArr);
    }
}
