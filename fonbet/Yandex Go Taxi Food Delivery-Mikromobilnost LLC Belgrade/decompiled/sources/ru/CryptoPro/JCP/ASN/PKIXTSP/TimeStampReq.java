package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BigInteger;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class TimeStampReq extends Asn1Type {
    public Asn1Boolean certReq;
    public Extensions extensions;
    public MessageImprint messageImprint;
    public Asn1BigInteger nonce;
    public TSAPolicyId reqPolicy;
    public TimeStampReq_version version;

    public TimeStampReq(TimeStampReq_version timeStampReq_version, MessageImprint messageImprint, int[] iArr, Asn1BigInteger asn1BigInteger, boolean z, Extensions extensions) {
        this.version = timeStampReq_version;
        this.messageImprint = messageImprint;
        this.reqPolicy = new TSAPolicyId(iArr);
        this.nonce = asn1BigInteger;
        this.certReq = new Asn1Boolean(z);
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        TimeStampReq_version timeStampReq_version = new TimeStampReq_version();
        this.version = timeStampReq_version;
        timeStampReq_version.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        MessageImprint messageImprint = new MessageImprint();
        this.messageImprint = messageImprint;
        messageImprint.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            TSAPolicyId tSAPolicyId = new TSAPolicyId();
            this.reqPolicy = tSAPolicyId;
            tSAPolicyId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1BigInteger asn1BigInteger = new Asn1BigInteger();
            this.nonce = asn1BigInteger;
            asn1BigInteger.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.certReq = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        } else {
            i = 0;
        }
        if (!this.certReq.equals(false)) {
            i += this.certReq.encode(asn1BerEncodeBuffer, true);
        }
        Asn1BigInteger asn1BigInteger = this.nonce;
        if (asn1BigInteger != null) {
            i += asn1BigInteger.encode(asn1BerEncodeBuffer, true);
        }
        TSAPolicyId tSAPolicyId = this.reqPolicy;
        if (tSAPolicyId != null) {
            i += tSAPolicyId.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.version.encode(asn1BerEncodeBuffer, true) + this.messageImprint.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.messageImprint = null;
        this.reqPolicy = null;
        this.nonce = null;
        this.certReq = new Asn1Boolean(false);
        this.extensions = null;
    }

    public TimeStampReq(TimeStampReq_version timeStampReq_version, MessageImprint messageImprint, TSAPolicyId tSAPolicyId, Asn1BigInteger asn1BigInteger, Asn1Boolean asn1Boolean, Extensions extensions) {
        this.version = timeStampReq_version;
        this.messageImprint = messageImprint;
        this.reqPolicy = tSAPolicyId;
        this.nonce = asn1BigInteger;
        this.certReq = asn1Boolean;
        this.extensions = extensions;
    }

    public TimeStampReq(TimeStampReq_version timeStampReq_version, MessageImprint messageImprint) {
        this.version = timeStampReq_version;
        this.messageImprint = messageImprint;
        this.certReq = new Asn1Boolean(false);
    }

    public TimeStampReq() {
        this.certReq = new Asn1Boolean(false);
    }
}
