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
public class TBSCertificate extends Asn1Type {
    public Extensions extensions;
    public Name issuer;
    public UniqueIdentifier issuerUniqueID;
    public CertificateSerialNumber serialNumber;
    public AlgorithmIdentifier signature;
    public Name subject;
    public SubjectPublicKeyInfo subjectPublicKeyInfo;
    public UniqueIdentifier subjectUniqueID;
    public Validity validity;
    public Version version;

    public TBSCertificate(long j, CertificateSerialNumber certificateSerialNumber, AlgorithmIdentifier algorithmIdentifier, Name name, Validity validity, Name name2, SubjectPublicKeyInfo subjectPublicKeyInfo, UniqueIdentifier uniqueIdentifier, UniqueIdentifier uniqueIdentifier2, Extensions extensions) {
        this.version = new Version(j);
        this.serialNumber = certificateSerialNumber;
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.validity = validity;
        this.subject = name2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueID = uniqueIdentifier;
        this.subjectUniqueID = uniqueIdentifier2;
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
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Version version = new Version();
            this.version = version;
            version.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
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
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.signature = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Name name = new Name();
        this.issuer = name;
        name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Validity validity = new Validity();
        this.validity = validity;
        validity.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Name name2 = new Name();
        this.subject = name2;
        name2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        subjectPublicKeyInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            UniqueIdentifier uniqueIdentifier = new UniqueIdentifier();
            this.issuerUniqueID = uniqueIdentifier;
            uniqueIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            UniqueIdentifier uniqueIdentifier2 = new UniqueIdentifier();
            this.subjectUniqueID = uniqueIdentifier2;
            uniqueIdentifier2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        } else {
            i = 0;
        }
        UniqueIdentifier uniqueIdentifier = this.subjectUniqueID;
        if (uniqueIdentifier != null) {
            int encode2 = uniqueIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode2);
        }
        UniqueIdentifier uniqueIdentifier2 = this.issuerUniqueID;
        if (uniqueIdentifier2 != null) {
            int encode3 = uniqueIdentifier2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode3);
        }
        int encode4 = this.serialNumber.encode(asn1BerEncodeBuffer, true) + this.signature.encode(asn1BerEncodeBuffer, true) + this.issuer.encode(asn1BerEncodeBuffer, true) + this.validity.encode(asn1BerEncodeBuffer, true) + this.subject.encode(asn1BerEncodeBuffer, true) + this.subjectPublicKeyInfo.encode(asn1BerEncodeBuffer, true) + i;
        Version version = this.version;
        if (version != null) {
            int encode5 = version.encode(asn1BerEncodeBuffer, true);
            encode4 = encode4 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode5);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode4) + encode4 : encode4;
    }

    public void init() {
        this.version = null;
        this.serialNumber = null;
        this.signature = null;
        this.issuer = null;
        this.validity = null;
        this.subject = null;
        this.subjectPublicKeyInfo = null;
        this.issuerUniqueID = null;
        this.subjectUniqueID = null;
        this.extensions = null;
    }

    public TBSCertificate(Version version, CertificateSerialNumber certificateSerialNumber, AlgorithmIdentifier algorithmIdentifier, Name name, Validity validity, Name name2, SubjectPublicKeyInfo subjectPublicKeyInfo, UniqueIdentifier uniqueIdentifier, UniqueIdentifier uniqueIdentifier2, Extensions extensions) {
        this.version = version;
        this.serialNumber = certificateSerialNumber;
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.validity = validity;
        this.subject = name2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueID = uniqueIdentifier;
        this.subjectUniqueID = uniqueIdentifier2;
        this.extensions = extensions;
    }

    public TBSCertificate(CertificateSerialNumber certificateSerialNumber, AlgorithmIdentifier algorithmIdentifier, Name name, Validity validity, Name name2, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.serialNumber = certificateSerialNumber;
        this.signature = algorithmIdentifier;
        this.issuer = name;
        this.validity = validity;
        this.subject = name2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
    }

    public TBSCertificate() {
    }
}
