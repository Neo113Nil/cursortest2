package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidLengthException;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class EncapsulatedContentInfo extends Asn1Type {
    public Asn1OctetString eContent;
    public Asn1ObjectIdentifier eContentType;

    public EncapsulatedContentInfo(int[] iArr, byte[] bArr) {
        this.eContentType = new Asn1ObjectIdentifier(iArr);
        this.eContent = new Asn1OctetString(bArr);
    }

    public void checkTC(boolean z) throws Asn1Exception {
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
        this.eContentType = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            int i2 = intHolder.value;
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.eContent = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
            if (i2 == -9999) {
                int readByte = asn1BerDecodeBuffer.readByte();
                int readByte2 = asn1BerDecodeBuffer.readByte();
                if (readByte != 0 || readByte2 != 0) {
                    throw new Asn1InvalidLengthException();
                }
            }
        }
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 128, (short) 32, 0)) {
                quz.g();
                return;
            }
        }
        if (i == -9999) {
            int readByte3 = asn1BerDecodeBuffer.readByte();
            int readByte4 = asn1BerDecodeBuffer.readByte();
            if (readByte3 != 0 || readByte4 != 0) {
                throw new Asn1InvalidLengthException();
            }
        }
        checkTC(true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        checkTC(false);
        Asn1OctetString asn1OctetString = this.eContent;
        if (asn1OctetString != null) {
            int encode = asn1OctetString.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        int encode2 = this.eContentType.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.eContentType = null;
        this.eContent = null;
    }

    public EncapsulatedContentInfo(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OctetString asn1OctetString) {
        this.eContentType = asn1ObjectIdentifier;
        this.eContent = asn1OctetString;
    }

    public EncapsulatedContentInfo(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.eContentType = asn1ObjectIdentifier;
    }

    public EncapsulatedContentInfo() {
    }

    public EncapsulatedContentInfo(int[] iArr) {
        this.eContentType = new Asn1ObjectIdentifier(iArr);
    }
}
