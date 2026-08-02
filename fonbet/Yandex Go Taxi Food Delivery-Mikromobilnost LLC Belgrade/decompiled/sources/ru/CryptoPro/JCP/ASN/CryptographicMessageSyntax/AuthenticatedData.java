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
public class AuthenticatedData extends Asn1Type {
    public AuthAttributes authenticatedAttributes;
    public DigestAlgorithmIdentifier digestAlgorithm;
    public EncapsulatedContentInfo encapContentInfo;
    public MessageAuthenticationCode mac;
    public MessageAuthenticationCodeAlgorithm macAlgorithm;
    public OriginatorInfo originatorInfo;
    public RecipientInfos recipientInfos;
    public UnauthAttributes unauthenticatedAttributes;
    public CMSVersion version;

    public AuthenticatedData(long j, OriginatorInfo originatorInfo, RecipientInfos recipientInfos, MessageAuthenticationCodeAlgorithm messageAuthenticationCodeAlgorithm, DigestAlgorithmIdentifier digestAlgorithmIdentifier, EncapsulatedContentInfo encapsulatedContentInfo, AuthAttributes authAttributes, byte[] bArr, UnauthAttributes unauthAttributes) {
        this.version = new CMSVersion(j);
        this.originatorInfo = originatorInfo;
        this.recipientInfos = recipientInfos;
        this.macAlgorithm = messageAuthenticationCodeAlgorithm;
        this.digestAlgorithm = digestAlgorithmIdentifier;
        this.encapContentInfo = encapsulatedContentInfo;
        this.authenticatedAttributes = authAttributes;
        this.mac = new MessageAuthenticationCode(bArr);
        this.unauthenticatedAttributes = unauthAttributes;
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
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            OriginatorInfo originatorInfo = new OriginatorInfo();
            this.originatorInfo = originatorInfo;
            originatorInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 17, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        RecipientInfos recipientInfos = new RecipientInfos();
        this.recipientInfos = recipientInfos;
        recipientInfos.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        MessageAuthenticationCodeAlgorithm messageAuthenticationCodeAlgorithm = new MessageAuthenticationCodeAlgorithm();
        this.macAlgorithm = messageAuthenticationCodeAlgorithm;
        messageAuthenticationCodeAlgorithm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            DigestAlgorithmIdentifier digestAlgorithmIdentifier = new DigestAlgorithmIdentifier();
            this.digestAlgorithm = digestAlgorithmIdentifier;
            digestAlgorithmIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncapsulatedContentInfo encapsulatedContentInfo = new EncapsulatedContentInfo();
        this.encapContentInfo = encapsulatedContentInfo;
        encapsulatedContentInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            AuthAttributes authAttributes = new AuthAttributes();
            this.authenticatedAttributes = authAttributes;
            authAttributes.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        MessageAuthenticationCode messageAuthenticationCode = new MessageAuthenticationCode();
        this.mac = messageAuthenticationCode;
        messageAuthenticationCode.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            UnauthAttributes unauthAttributes = new UnauthAttributes();
            this.unauthenticatedAttributes = unauthAttributes;
            unauthAttributes.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 0, (short) 32, 17) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        UnauthAttributes unauthAttributes = this.unauthenticatedAttributes;
        if (unauthAttributes != null) {
            int encode = unauthAttributes.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.mac.encode(asn1BerEncodeBuffer, true) + i;
        AuthAttributes authAttributes = this.authenticatedAttributes;
        if (authAttributes != null) {
            int encode3 = authAttributes.encode(asn1BerEncodeBuffer, false);
            encode2 = encode2 + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode3);
        }
        int encode4 = this.encapContentInfo.encode(asn1BerEncodeBuffer, true) + encode2;
        DigestAlgorithmIdentifier digestAlgorithmIdentifier = this.digestAlgorithm;
        if (digestAlgorithmIdentifier != null) {
            int encode5 = digestAlgorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            encode4 = encode4 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5);
        }
        int encode6 = this.recipientInfos.encode(asn1BerEncodeBuffer, true) + this.macAlgorithm.encode(asn1BerEncodeBuffer, true) + encode4;
        OriginatorInfo originatorInfo = this.originatorInfo;
        if (originatorInfo != null) {
            int encode7 = originatorInfo.encode(asn1BerEncodeBuffer, false);
            encode6 = encode6 + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode7);
        }
        int encode8 = this.version.encode(asn1BerEncodeBuffer, true) + encode6;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode8) + encode8 : encode8;
    }

    public void init() {
        this.version = null;
        this.originatorInfo = null;
        this.recipientInfos = null;
        this.macAlgorithm = null;
        this.digestAlgorithm = null;
        this.encapContentInfo = null;
        this.authenticatedAttributes = null;
        this.mac = null;
        this.unauthenticatedAttributes = null;
    }

    public AuthenticatedData(CMSVersion cMSVersion, OriginatorInfo originatorInfo, RecipientInfos recipientInfos, MessageAuthenticationCodeAlgorithm messageAuthenticationCodeAlgorithm, DigestAlgorithmIdentifier digestAlgorithmIdentifier, EncapsulatedContentInfo encapsulatedContentInfo, AuthAttributes authAttributes, MessageAuthenticationCode messageAuthenticationCode, UnauthAttributes unauthAttributes) {
        this.version = cMSVersion;
        this.originatorInfo = originatorInfo;
        this.recipientInfos = recipientInfos;
        this.macAlgorithm = messageAuthenticationCodeAlgorithm;
        this.digestAlgorithm = digestAlgorithmIdentifier;
        this.encapContentInfo = encapsulatedContentInfo;
        this.authenticatedAttributes = authAttributes;
        this.mac = messageAuthenticationCode;
        this.unauthenticatedAttributes = unauthAttributes;
    }

    public AuthenticatedData(CMSVersion cMSVersion, RecipientInfos recipientInfos, MessageAuthenticationCodeAlgorithm messageAuthenticationCodeAlgorithm, EncapsulatedContentInfo encapsulatedContentInfo, MessageAuthenticationCode messageAuthenticationCode) {
        this.version = cMSVersion;
        this.recipientInfos = recipientInfos;
        this.macAlgorithm = messageAuthenticationCodeAlgorithm;
        this.encapContentInfo = encapsulatedContentInfo;
        this.mac = messageAuthenticationCode;
    }

    public AuthenticatedData() {
    }

    public AuthenticatedData(long j, RecipientInfos recipientInfos, MessageAuthenticationCodeAlgorithm messageAuthenticationCodeAlgorithm, EncapsulatedContentInfo encapsulatedContentInfo, byte[] bArr) {
        this.version = new CMSVersion(j);
        this.recipientInfos = recipientInfos;
        this.macAlgorithm = messageAuthenticationCodeAlgorithm;
        this.encapContentInfo = encapsulatedContentInfo;
        this.mac = new MessageAuthenticationCode(bArr);
    }
}
