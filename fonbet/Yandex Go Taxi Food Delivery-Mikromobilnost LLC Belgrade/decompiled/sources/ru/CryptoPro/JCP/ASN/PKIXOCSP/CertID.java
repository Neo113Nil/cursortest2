package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;

/* loaded from: classes4.dex */
public class CertID extends Asn1Type {
    public AlgorithmIdentifier hashAlgorithm;
    public Asn1OctetString issuerKeyHash;
    public Asn1OctetString issuerNameHash;
    public CertificateSerialNumber serialNumber;

    public CertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, CertificateSerialNumber certificateSerialNumber) {
        this.hashAlgorithm = algorithmIdentifier;
        this.issuerNameHash = new Asn1OctetString(bArr);
        this.issuerKeyHash = new Asn1OctetString(bArr2);
        this.serialNumber = certificateSerialNumber;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.hashAlgorithm = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.issuerNameHash = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.issuerKeyHash = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertificateSerialNumber certificateSerialNumber = new CertificateSerialNumber();
        this.serialNumber = certificateSerialNumber;
        certificateSerialNumber.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.hashAlgorithm.encode(asn1BerEncodeBuffer, true) + this.issuerNameHash.encode(asn1BerEncodeBuffer, true) + this.issuerKeyHash.encode(asn1BerEncodeBuffer, true) + this.serialNumber.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.hashAlgorithm = null;
        this.issuerNameHash = null;
        this.issuerKeyHash = null;
        this.serialNumber = null;
    }

    public CertID(AlgorithmIdentifier algorithmIdentifier, Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, CertificateSerialNumber certificateSerialNumber) {
        this.hashAlgorithm = algorithmIdentifier;
        this.issuerNameHash = asn1OctetString;
        this.issuerKeyHash = asn1OctetString2;
        this.serialNumber = certificateSerialNumber;
    }

    public CertID() {
    }
}
