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
public class KeyAgreeRecipientInfo extends Asn1Type {
    public KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithm;
    public OriginatorIdentifierOrKey originator;
    public RecipientEncryptedKeys recipientEncryptedKeys;
    public UserKeyingMaterial ukm;
    public CMSVersion version;

    public KeyAgreeRecipientInfo(long j, OriginatorIdentifierOrKey originatorIdentifierOrKey, byte[] bArr, KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithmIdentifier, RecipientEncryptedKeys recipientEncryptedKeys) {
        this.version = new CMSVersion(j);
        this.originator = originatorIdentifierOrKey;
        this.ukm = new UserKeyingMaterial(bArr);
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithmIdentifier;
        this.recipientEncryptedKeys = recipientEncryptedKeys;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        OriginatorIdentifierOrKey originatorIdentifierOrKey = new OriginatorIdentifierOrKey();
        this.originator = originatorIdentifierOrKey;
        originatorIdentifierOrKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            UserKeyingMaterial userKeyingMaterial = new UserKeyingMaterial();
            this.ukm = userKeyingMaterial;
            userKeyingMaterial.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithmIdentifier = new KeyEncryptionAlgorithmIdentifier();
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithmIdentifier;
        keyEncryptionAlgorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        RecipientEncryptedKeys recipientEncryptedKeys = new RecipientEncryptedKeys();
        this.recipientEncryptedKeys = recipientEncryptedKeys;
        recipientEncryptedKeys.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.keyEncryptionAlgorithm.encode(asn1BerEncodeBuffer, true) + this.recipientEncryptedKeys.encode(asn1BerEncodeBuffer, true);
        UserKeyingMaterial userKeyingMaterial = this.ukm;
        if (userKeyingMaterial != null) {
            int encode2 = userKeyingMaterial.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        int encode3 = this.originator.encode(asn1BerEncodeBuffer, true);
        int encode4 = this.version.encode(asn1BerEncodeBuffer, true) + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3) + encode + encode3;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode4) + encode4 : encode4;
    }

    public void init() {
        this.version = null;
        this.originator = null;
        this.ukm = null;
        this.keyEncryptionAlgorithm = null;
        this.recipientEncryptedKeys = null;
    }

    public KeyAgreeRecipientInfo(CMSVersion cMSVersion, OriginatorIdentifierOrKey originatorIdentifierOrKey, UserKeyingMaterial userKeyingMaterial, KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithmIdentifier, RecipientEncryptedKeys recipientEncryptedKeys) {
        this.version = cMSVersion;
        this.originator = originatorIdentifierOrKey;
        this.ukm = userKeyingMaterial;
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithmIdentifier;
        this.recipientEncryptedKeys = recipientEncryptedKeys;
    }

    public KeyAgreeRecipientInfo(CMSVersion cMSVersion, OriginatorIdentifierOrKey originatorIdentifierOrKey, KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithmIdentifier, RecipientEncryptedKeys recipientEncryptedKeys) {
        this.version = cMSVersion;
        this.originator = originatorIdentifierOrKey;
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithmIdentifier;
        this.recipientEncryptedKeys = recipientEncryptedKeys;
    }

    public KeyAgreeRecipientInfo() {
    }

    public KeyAgreeRecipientInfo(long j, OriginatorIdentifierOrKey originatorIdentifierOrKey, KeyEncryptionAlgorithmIdentifier keyEncryptionAlgorithmIdentifier, RecipientEncryptedKeys recipientEncryptedKeys) {
        this.version = new CMSVersion(j);
        this.originator = originatorIdentifierOrKey;
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithmIdentifier;
        this.recipientEncryptedKeys = recipientEncryptedKeys;
    }
}
