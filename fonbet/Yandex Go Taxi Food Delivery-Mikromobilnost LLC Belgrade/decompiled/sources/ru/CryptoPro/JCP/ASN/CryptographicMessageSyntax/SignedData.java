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

/* loaded from: classes4.dex */
public class SignedData extends Asn1Type {
    public CertificateSet certificates;
    public CertificateRevocationLists crls;
    public DigestAlgorithmIdentifiers digestAlgorithms;
    public EncapsulatedContentInfo encapContentInfo;
    public SignerInfos signerInfos;
    public CMSVersion version;

    public SignedData(long j, DigestAlgorithmIdentifiers digestAlgorithmIdentifiers, EncapsulatedContentInfo encapsulatedContentInfo, CertificateSet certificateSet, CertificateRevocationLists certificateRevocationLists, SignerInfos signerInfos) {
        this.version = new CMSVersion(j);
        this.digestAlgorithms = digestAlgorithmIdentifiers;
        this.encapContentInfo = encapsulatedContentInfo;
        this.certificates = certificateSet;
        this.crls = certificateRevocationLists;
        this.signerInfos = signerInfos;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CMSVersion cMSVersion = new CMSVersion();
        this.version = cMSVersion;
        cMSVersion.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 17, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        DigestAlgorithmIdentifiers digestAlgorithmIdentifiers = new DigestAlgorithmIdentifiers();
        this.digestAlgorithms = digestAlgorithmIdentifiers;
        digestAlgorithmIdentifiers.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncapsulatedContentInfo encapsulatedContentInfo = new EncapsulatedContentInfo();
        this.encapContentInfo = encapsulatedContentInfo;
        encapsulatedContentInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            CertificateSet certificateSet = new CertificateSet();
            this.certificates = certificateSet;
            certificateSet.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            CertificateRevocationLists certificateRevocationLists = new CertificateRevocationLists();
            this.crls = certificateRevocationLists;
            certificateRevocationLists.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 17, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        SignerInfos signerInfos = new SignerInfos();
        this.signerInfos = signerInfos;
        signerInfos.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 17) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.signerInfos.encode(asn1BerEncodeBuffer, true);
        CertificateRevocationLists certificateRevocationLists = this.crls;
        if (certificateRevocationLists != null) {
            int encode2 = certificateRevocationLists.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        CertificateSet certificateSet = this.certificates;
        if (certificateSet != null) {
            int encode3 = certificateSet.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3);
        }
        int encode4 = this.version.encode(asn1BerEncodeBuffer, true) + this.digestAlgorithms.encode(asn1BerEncodeBuffer, true) + this.encapContentInfo.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode4) + encode4 : encode4;
    }

    public void init() {
        this.version = null;
        this.digestAlgorithms = null;
        this.encapContentInfo = null;
        this.certificates = null;
        this.crls = null;
        this.signerInfos = null;
    }

    public SignedData(CMSVersion cMSVersion, DigestAlgorithmIdentifiers digestAlgorithmIdentifiers, EncapsulatedContentInfo encapsulatedContentInfo, CertificateSet certificateSet, CertificateRevocationLists certificateRevocationLists, SignerInfos signerInfos) {
        this.version = cMSVersion;
        this.digestAlgorithms = digestAlgorithmIdentifiers;
        this.encapContentInfo = encapsulatedContentInfo;
        this.certificates = certificateSet;
        this.crls = certificateRevocationLists;
        this.signerInfos = signerInfos;
    }

    public SignedData(CMSVersion cMSVersion, DigestAlgorithmIdentifiers digestAlgorithmIdentifiers, EncapsulatedContentInfo encapsulatedContentInfo, SignerInfos signerInfos) {
        this.version = cMSVersion;
        this.digestAlgorithms = digestAlgorithmIdentifiers;
        this.encapContentInfo = encapsulatedContentInfo;
        this.signerInfos = signerInfos;
    }

    public SignedData() {
    }

    public SignedData(long j, DigestAlgorithmIdentifiers digestAlgorithmIdentifiers, EncapsulatedContentInfo encapsulatedContentInfo, SignerInfos signerInfos) {
        this.version = new CMSVersion(j);
        this.digestAlgorithms = digestAlgorithmIdentifiers;
        this.encapContentInfo = encapsulatedContentInfo;
        this.signerInfos = signerInfos;
    }
}
