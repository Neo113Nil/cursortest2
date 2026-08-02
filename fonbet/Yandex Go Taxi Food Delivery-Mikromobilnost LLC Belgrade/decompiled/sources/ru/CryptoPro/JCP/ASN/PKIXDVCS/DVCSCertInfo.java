package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BigInteger;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyInformation;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.SignerInfos;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIStatusInfo;

/* loaded from: classes4.dex */
public class DVCSCertInfo extends Asn1Type {
    public DVCSCertInfo_certs certs;
    public DVCSRequestInformation dvReqInfo;
    public PKIStatusInfo dvStatus;
    public Extensions extensions;
    public DigestInfo messageImprint;
    public PolicyInformation policy;
    public SignerInfos reqSignature;
    public DVCSTime responseTime;
    public Asn1BigInteger serialNumber;
    public Asn1BigInteger version;

    public DVCSCertInfo(Asn1BigInteger asn1BigInteger, DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, Asn1BigInteger asn1BigInteger2, DVCSTime dVCSTime, PKIStatusInfo pKIStatusInfo, PolicyInformation policyInformation, SignerInfos signerInfos, DVCSCertInfo_certs dVCSCertInfo_certs, Extensions extensions) {
        this.version = asn1BigInteger;
        this.dvReqInfo = dVCSRequestInformation;
        this.messageImprint = digestInfo;
        this.serialNumber = asn1BigInteger2;
        this.responseTime = dVCSTime;
        this.dvStatus = pKIStatusInfo;
        this.policy = policyInformation;
        this.reqSignature = signerInfos;
        this.certs = dVCSCertInfo_certs;
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
            Asn1BigInteger asn1BigInteger = new Asn1BigInteger();
            this.version = asn1BigInteger;
            asn1BigInteger.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        DVCSRequestInformation dVCSRequestInformation = new DVCSRequestInformation();
        this.dvReqInfo = dVCSRequestInformation;
        dVCSRequestInformation.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        DigestInfo digestInfo = new DigestInfo();
        this.messageImprint = digestInfo;
        digestInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BigInteger asn1BigInteger2 = new Asn1BigInteger();
        this.serialNumber = asn1BigInteger2;
        asn1BigInteger2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 32, 16) && !peekTag.equals((short) 0, (short) 0, 24)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        DVCSTime dVCSTime = new DVCSTime();
        this.responseTime = dVCSTime;
        dVCSTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
            this.dvStatus = pKIStatusInfo;
            pKIStatusInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            PolicyInformation policyInformation = new PolicyInformation();
            this.policy = policyInformation;
            policyInformation.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            SignerInfos signerInfos = new SignerInfos();
            this.reqSignature = signerInfos;
            signerInfos.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, false)) {
            DVCSCertInfo_certs dVCSCertInfo_certs = new DVCSCertInfo_certs();
            this.certs = dVCSCertInfo_certs;
            dVCSCertInfo_certs.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        if (peekTag2.equals((short) 0, (short) 0, 2) || peekTag2.equals((short) 0, (short) 32, 16) || peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 32, 1) || peekTag2.equals((short) 128, (short) 32, 2) || peekTag2.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Extensions extensions = this.extensions;
        int encode = extensions != null ? extensions.encode(asn1BerEncodeBuffer, true) : 0;
        DVCSCertInfo_certs dVCSCertInfo_certs = this.certs;
        if (dVCSCertInfo_certs != null) {
            encode += dVCSCertInfo_certs.encode(asn1BerEncodeBuffer, true);
        }
        SignerInfos signerInfos = this.reqSignature;
        if (signerInfos != null) {
            int encode2 = signerInfos.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        PolicyInformation policyInformation = this.policy;
        if (policyInformation != null) {
            int encode3 = policyInformation.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        PKIStatusInfo pKIStatusInfo = this.dvStatus;
        if (pKIStatusInfo != null) {
            int encode4 = pKIStatusInfo.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4);
        }
        int encode5 = this.dvReqInfo.encode(asn1BerEncodeBuffer, true) + this.messageImprint.encode(asn1BerEncodeBuffer, true) + this.serialNumber.encode(asn1BerEncodeBuffer, true) + this.responseTime.encode(asn1BerEncodeBuffer, true) + encode;
        if (!this.version.equals("1")) {
            encode5 += this.version.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode5) + encode5 : encode5;
    }

    public void init() {
        this.version = new Asn1BigInteger("1");
        this.dvReqInfo = null;
        this.messageImprint = null;
        this.serialNumber = null;
        this.responseTime = null;
        this.dvStatus = null;
        this.policy = null;
        this.reqSignature = null;
        this.certs = null;
        this.extensions = null;
    }

    public DVCSCertInfo() {
        this.version = new Asn1BigInteger("1");
    }

    public DVCSCertInfo(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, Asn1BigInteger asn1BigInteger, DVCSTime dVCSTime) {
        this.version = new Asn1BigInteger("1");
        this.dvReqInfo = dVCSRequestInformation;
        this.messageImprint = digestInfo;
        this.serialNumber = asn1BigInteger;
        this.responseTime = dVCSTime;
    }
}
