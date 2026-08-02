package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.UniqueIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Version;

/* loaded from: classes4.dex */
public class AttributeCertificateInfo extends Asn1Type {
    public AttCertValidityPeriod attCertValidityPeriod;
    public _SeqOfAttribute attributes;
    public Extensions extensions;
    public GeneralNames issuer;
    public UniqueIdentifier issuerUniqueID;
    public CertificateSerialNumber serialNumber;
    public AlgorithmIdentifier signature;
    public AttributeCertificateInfo_subject subject;
    public Version version;

    public AttributeCertificateInfo(long j, AttributeCertificateInfo_subject attributeCertificateInfo_subject, GeneralNames generalNames, AlgorithmIdentifier algorithmIdentifier, CertificateSerialNumber certificateSerialNumber, AttCertValidityPeriod attCertValidityPeriod, _SeqOfAttribute _seqofattribute, UniqueIdentifier uniqueIdentifier, Extensions extensions) {
        this.version = new Version(j);
        this.subject = attributeCertificateInfo_subject;
        this.issuer = generalNames;
        this.signature = algorithmIdentifier;
        this.serialNumber = certificateSerialNumber;
        this.attCertValidityPeriod = attCertValidityPeriod;
        this.attributes = _seqofattribute;
        this.issuerUniqueID = uniqueIdentifier;
        this.extensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Version version = new Version();
            this.version = version;
            version.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 32, 1)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AttributeCertificateInfo_subject attributeCertificateInfo_subject = new AttributeCertificateInfo_subject();
        this.subject = attributeCertificateInfo_subject;
        attributeCertificateInfo_subject.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GeneralNames generalNames = new GeneralNames();
        this.issuer = generalNames;
        generalNames.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.signature = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertificateSerialNumber certificateSerialNumber = new CertificateSerialNumber();
        this.serialNumber = certificateSerialNumber;
        certificateSerialNumber.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AttCertValidityPeriod attCertValidityPeriod = new AttCertValidityPeriod();
        this.attCertValidityPeriod = attCertValidityPeriod;
        attCertValidityPeriod.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfAttribute _seqofattribute = new _SeqOfAttribute();
        this.attributes = _seqofattribute;
        _seqofattribute.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            UniqueIdentifier uniqueIdentifier = new UniqueIdentifier();
            this.issuerUniqueID = uniqueIdentifier;
            uniqueIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 0, (short) 0, 2) || peekTag2.equals((short) 0, (short) 32, 16) || peekTag2.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Extensions extensions = this.extensions;
        int encode = extensions != null ? extensions.encode(asn1BerEncodeBuffer, true) : 0;
        UniqueIdentifier uniqueIdentifier = this.issuerUniqueID;
        if (uniqueIdentifier != null) {
            encode += uniqueIdentifier.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.subject.encode(asn1BerEncodeBuffer, true) + this.issuer.encode(asn1BerEncodeBuffer, true) + this.signature.encode(asn1BerEncodeBuffer, true) + this.serialNumber.encode(asn1BerEncodeBuffer, true) + this.attCertValidityPeriod.encode(asn1BerEncodeBuffer, true) + this.attributes.encode(asn1BerEncodeBuffer, true) + encode;
        Version version = this.version;
        if (version != null) {
            encode2 += version.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.subject = null;
        this.issuer = null;
        this.signature = null;
        this.serialNumber = null;
        this.attCertValidityPeriod = null;
        this.attributes = null;
        this.issuerUniqueID = null;
        this.extensions = null;
    }

    public AttributeCertificateInfo(Version version, AttributeCertificateInfo_subject attributeCertificateInfo_subject, GeneralNames generalNames, AlgorithmIdentifier algorithmIdentifier, CertificateSerialNumber certificateSerialNumber, AttCertValidityPeriod attCertValidityPeriod, _SeqOfAttribute _seqofattribute, UniqueIdentifier uniqueIdentifier, Extensions extensions) {
        this.version = version;
        this.subject = attributeCertificateInfo_subject;
        this.issuer = generalNames;
        this.signature = algorithmIdentifier;
        this.serialNumber = certificateSerialNumber;
        this.attCertValidityPeriod = attCertValidityPeriod;
        this.attributes = _seqofattribute;
        this.issuerUniqueID = uniqueIdentifier;
        this.extensions = extensions;
    }

    public AttributeCertificateInfo(AttributeCertificateInfo_subject attributeCertificateInfo_subject, GeneralNames generalNames, AlgorithmIdentifier algorithmIdentifier, CertificateSerialNumber certificateSerialNumber, AttCertValidityPeriod attCertValidityPeriod, _SeqOfAttribute _seqofattribute) {
        this.subject = attributeCertificateInfo_subject;
        this.issuer = generalNames;
        this.signature = algorithmIdentifier;
        this.serialNumber = certificateSerialNumber;
        this.attCertValidityPeriod = attCertValidityPeriod;
        this.attributes = _seqofattribute;
    }

    public AttributeCertificateInfo() {
    }
}
