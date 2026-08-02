package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ContentInfo extends Asn1Type {
    public Asn1Type content;
    public Asn1ObjectIdentifier contentType;

    public ContentInfo(int[] iArr, Asn1Type asn1Type) {
        this.contentType = new Asn1ObjectIdentifier(iArr);
        this.content = asn1Type;
    }

    public void checkTC(boolean z) throws Asn1Exception {
        CONTENT_TYPE content_type;
        int i = 0;
        while (true) {
            CONTENT_TYPE[] content_typeArr = _CryptographicMessageSyntaxValues.SupportedContentTypes;
            if (i >= content_typeArr.length) {
                content_type = null;
                break;
            } else {
                if (content_typeArr[i].id.equals(this.contentType)) {
                    content_type = content_typeArr[i];
                    break;
                }
                i++;
            }
        }
        if (content_type != null && z) {
            try {
                Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) this.content).value);
                Asn1Type asn1Type = (Asn1Type) content_type.Type.getClass().newInstance();
                this.content = asn1Type;
                asn1Type.decode(asn1BerDecodeBuffer, true, 0);
            } catch (Exception unused) {
                quz.s("table constraint: content decode failed");
            }
        }
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
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.contentType = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OpenType asn1OpenType = new Asn1OpenType();
        this.content = asn1OpenType;
        asn1OpenType.decode(asn1BerDecodeBuffer, true, 0);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 128, (short) 32, 0)) {
                quz.g();
                return;
            }
        }
        checkTC(true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        checkTC(false);
        int encode = this.content.encode(asn1BerEncodeBuffer, true);
        int encode2 = this.contentType.encode(asn1BerEncodeBuffer, true) + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.contentType = null;
        this.content = null;
    }

    public ContentInfo(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        this.contentType = asn1ObjectIdentifier;
        this.content = asn1OpenType;
    }

    public ContentInfo() {
    }
}
