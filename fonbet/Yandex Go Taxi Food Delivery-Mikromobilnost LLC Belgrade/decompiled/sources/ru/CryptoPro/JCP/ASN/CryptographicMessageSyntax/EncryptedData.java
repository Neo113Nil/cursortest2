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
public class EncryptedData extends Asn1Type {
    public EncryptedContentInfo encryptedContentInfo;
    public UnprotectedAttributes unprotectedAttrs;
    public CMSVersion version;

    public EncryptedData(long j, EncryptedContentInfo encryptedContentInfo, UnprotectedAttributes unprotectedAttributes) {
        this.version = new CMSVersion(j);
        this.encryptedContentInfo = encryptedContentInfo;
        this.unprotectedAttrs = unprotectedAttributes;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptedContentInfo encryptedContentInfo = new EncryptedContentInfo();
        this.encryptedContentInfo = encryptedContentInfo;
        encryptedContentInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            UnprotectedAttributes unprotectedAttributes = new UnprotectedAttributes();
            this.unprotectedAttrs = unprotectedAttributes;
            unprotectedAttributes.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        UnprotectedAttributes unprotectedAttributes = this.unprotectedAttrs;
        int i = 0;
        if (unprotectedAttributes != null) {
            int encode = unprotectedAttributes.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        }
        int encode2 = this.version.encode(asn1BerEncodeBuffer, true) + this.encryptedContentInfo.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.encryptedContentInfo = null;
        this.unprotectedAttrs = null;
    }

    public EncryptedData(CMSVersion cMSVersion, EncryptedContentInfo encryptedContentInfo, UnprotectedAttributes unprotectedAttributes) {
        this.version = cMSVersion;
        this.encryptedContentInfo = encryptedContentInfo;
        this.unprotectedAttrs = unprotectedAttributes;
    }

    public EncryptedData(CMSVersion cMSVersion, EncryptedContentInfo encryptedContentInfo) {
        this.version = cMSVersion;
        this.encryptedContentInfo = encryptedContentInfo;
    }

    public EncryptedData() {
    }

    public EncryptedData(long j, EncryptedContentInfo encryptedContentInfo) {
        this.version = new CMSVersion(j);
        this.encryptedContentInfo = encryptedContentInfo;
    }
}
