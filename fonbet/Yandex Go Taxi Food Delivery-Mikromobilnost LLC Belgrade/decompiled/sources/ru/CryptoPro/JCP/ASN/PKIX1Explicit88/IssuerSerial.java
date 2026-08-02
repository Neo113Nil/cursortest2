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
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;

/* loaded from: classes4.dex */
public class IssuerSerial extends Asn1Type {
    public GeneralNames issuer;
    public UniqueIdentifier issuerUID;
    public CertificateSerialNumber serialNumber;

    public IssuerSerial(GeneralNames generalNames, CertificateSerialNumber certificateSerialNumber, UniqueIdentifier uniqueIdentifier) {
        this.issuer = generalNames;
        this.serialNumber = certificateSerialNumber;
        this.issuerUID = uniqueIdentifier;
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
        GeneralNames generalNames = new GeneralNames();
        this.issuer = generalNames;
        generalNames.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertificateSerialNumber certificateSerialNumber = new CertificateSerialNumber();
        this.serialNumber = certificateSerialNumber;
        certificateSerialNumber.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            UniqueIdentifier uniqueIdentifier = new UniqueIdentifier();
            this.issuerUID = uniqueIdentifier;
            uniqueIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        UniqueIdentifier uniqueIdentifier = this.issuerUID;
        int encode = this.issuer.encode(asn1BerEncodeBuffer, true) + this.serialNumber.encode(asn1BerEncodeBuffer, true) + (uniqueIdentifier != null ? uniqueIdentifier.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.issuer = null;
        this.serialNumber = null;
        this.issuerUID = null;
    }

    public IssuerSerial() {
    }

    public IssuerSerial(GeneralNames generalNames, CertificateSerialNumber certificateSerialNumber) {
        this.issuer = generalNames;
        this.serialNumber = certificateSerialNumber;
    }
}
