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
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyInformation;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class DVCSRequestInformation extends Asn1Type {
    public GeneralNames dataLocations;
    public GeneralNames dvcs;
    public Extensions extensions;
    public Nonce nonce;
    public PolicyInformation requestPolicy;
    public DVCSTime requestTime;
    public GeneralNames requester;
    public ServiceType service;
    public Asn1BigInteger version;

    public DVCSRequestInformation(Asn1BigInteger asn1BigInteger, int i, Nonce nonce, DVCSTime dVCSTime, GeneralNames generalNames, PolicyInformation policyInformation, GeneralNames generalNames2, GeneralNames generalNames3, Extensions extensions) {
        this.version = asn1BigInteger;
        this.service = new ServiceType(i);
        this.nonce = nonce;
        this.requestTime = dVCSTime;
        this.requester = generalNames;
        this.requestPolicy = policyInformation;
        this.dvcs = generalNames2;
        this.dataLocations = generalNames3;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 10, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ServiceType serviceType = new ServiceType();
        this.service = serviceType;
        serviceType.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Nonce nonce = new Nonce();
            this.nonce = nonce;
            nonce.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 24)) {
                DVCSTime dVCSTime = new DVCSTime();
                this.requestTime = dVCSTime;
                dVCSTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            GeneralNames generalNames = new GeneralNames();
            this.requester = generalNames;
            generalNames.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            PolicyInformation policyInformation = new PolicyInformation();
            this.requestPolicy = policyInformation;
            policyInformation.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            GeneralNames generalNames2 = new GeneralNames();
            this.dvcs = generalNames2;
            generalNames2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            GeneralNames generalNames3 = new GeneralNames();
            this.dataLocations = generalNames3;
            generalNames3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 0, (short) 0, 2) || peekTag2.equals((short) 0, (short) 0, 10) || peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 32, 1) || peekTag2.equals((short) 128, (short) 32, 2) || peekTag2.equals((short) 128, (short) 32, 3) || peekTag2.equals((short) 128, (short) 32, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode) + encode;
        } else {
            i = 0;
        }
        GeneralNames generalNames = this.dataLocations;
        if (generalNames != null) {
            int encode2 = generalNames.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode2);
        }
        GeneralNames generalNames2 = this.dvcs;
        if (generalNames2 != null) {
            int encode3 = generalNames2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode3);
        }
        PolicyInformation policyInformation = this.requestPolicy;
        if (policyInformation != null) {
            int encode4 = policyInformation.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode4);
        }
        GeneralNames generalNames3 = this.requester;
        if (generalNames3 != null) {
            int encode5 = generalNames3.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode5);
        }
        DVCSTime dVCSTime = this.requestTime;
        if (dVCSTime != null) {
            i += dVCSTime.encode(asn1BerEncodeBuffer, true);
        }
        Nonce nonce = this.nonce;
        if (nonce != null) {
            i += nonce.encode(asn1BerEncodeBuffer, true);
        }
        int encode6 = this.service.encode(asn1BerEncodeBuffer, true) + i;
        if (!this.version.equals("1")) {
            encode6 += this.version.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode6) + encode6 : encode6;
    }

    public void init() {
        this.version = new Asn1BigInteger("1");
        this.service = null;
        this.nonce = null;
        this.requestTime = null;
        this.requester = null;
        this.requestPolicy = null;
        this.dvcs = null;
        this.dataLocations = null;
        this.extensions = null;
    }

    public DVCSRequestInformation(Asn1BigInteger asn1BigInteger, ServiceType serviceType, Nonce nonce, DVCSTime dVCSTime, GeneralNames generalNames, PolicyInformation policyInformation, GeneralNames generalNames2, GeneralNames generalNames3, Extensions extensions) {
        this.version = asn1BigInteger;
        this.service = serviceType;
        this.nonce = nonce;
        this.requestTime = dVCSTime;
        this.requester = generalNames;
        this.requestPolicy = policyInformation;
        this.dvcs = generalNames2;
        this.dataLocations = generalNames3;
        this.extensions = extensions;
    }

    public DVCSRequestInformation(ServiceType serviceType) {
        this.version = new Asn1BigInteger("1");
        this.service = serviceType;
    }

    public DVCSRequestInformation() {
        this.version = new Asn1BigInteger("1");
    }

    public DVCSRequestInformation(int i) {
        this.version = new Asn1BigInteger("1");
        this.service = new ServiceType(i);
    }
}
