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
public class EncryptedContentInfo extends Asn1Type {
    public ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithm;
    public ContentType contentType;
    public EncryptedContent encryptedContent;

    public EncryptedContentInfo(int[] iArr, ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithmIdentifier, byte[] bArr) {
        this.contentType = new ContentType(iArr);
        this.contentEncryptionAlgorithm = contentEncryptionAlgorithmIdentifier;
        this.encryptedContent = new EncryptedContent(bArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ContentType contentType = new ContentType();
        this.contentType = contentType;
        contentType.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithmIdentifier = new ContentEncryptionAlgorithmIdentifier();
        this.contentEncryptionAlgorithm = contentEncryptionAlgorithmIdentifier;
        contentEncryptionAlgorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            EncryptedContent encryptedContent = new EncryptedContent();
            this.encryptedContent = encryptedContent;
            encryptedContent.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 0, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        EncryptedContent encryptedContent = this.encryptedContent;
        int i = 0;
        if (encryptedContent != null) {
            int encode = encryptedContent.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode) + encode;
        }
        int encode2 = this.contentType.encode(asn1BerEncodeBuffer, true) + this.contentEncryptionAlgorithm.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.contentType = null;
        this.contentEncryptionAlgorithm = null;
        this.encryptedContent = null;
    }

    public EncryptedContentInfo(ContentType contentType, ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithmIdentifier, EncryptedContent encryptedContent) {
        this.contentType = contentType;
        this.contentEncryptionAlgorithm = contentEncryptionAlgorithmIdentifier;
        this.encryptedContent = encryptedContent;
    }

    public EncryptedContentInfo(ContentType contentType, ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithmIdentifier) {
        this.contentType = contentType;
        this.contentEncryptionAlgorithm = contentEncryptionAlgorithmIdentifier;
    }

    public EncryptedContentInfo() {
    }

    public EncryptedContentInfo(int[] iArr, ContentEncryptionAlgorithmIdentifier contentEncryptionAlgorithmIdentifier) {
        this.contentType = new ContentType(iArr);
        this.contentEncryptionAlgorithm = contentEncryptionAlgorithmIdentifier;
    }
}
