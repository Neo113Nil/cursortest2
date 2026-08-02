package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class TBSRequest extends Asn1Type {
    public Extensions requestExtensions;
    public _SeqOfRequest requestList;
    public GeneralName requestorName;
    public OCSPVersion version;

    public TBSRequest(long j, GeneralName generalName, _SeqOfRequest _seqofrequest, Extensions extensions) {
        this.version = new OCSPVersion(j);
        this.requestorName = generalName;
        this.requestList = _seqofrequest;
        this.requestExtensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            OCSPVersion oCSPVersion = new OCSPVersion();
            this.version = oCSPVersion;
            oCSPVersion.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            GeneralName generalName = new GeneralName();
            this.requestorName = generalName;
            generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfRequest _seqofrequest = new _SeqOfRequest();
        this.requestList = _seqofrequest;
        _seqofrequest.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.requestExtensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.requestExtensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.requestList.encode(asn1BerEncodeBuffer, true) + i;
        GeneralName generalName = this.requestorName;
        if (generalName != null) {
            int encode3 = generalName.encode(asn1BerEncodeBuffer, true);
            encode2 = encode2 + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        OCSPVersion oCSPVersion = this.version;
        if (oCSPVersion != null) {
            int encode4 = oCSPVersion.encode(asn1BerEncodeBuffer, true);
            encode2 = encode2 + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.requestorName = null;
        this.requestList = null;
        this.requestExtensions = null;
    }

    public TBSRequest(OCSPVersion oCSPVersion, GeneralName generalName, _SeqOfRequest _seqofrequest, Extensions extensions) {
        this.version = oCSPVersion;
        this.requestorName = generalName;
        this.requestList = _seqofrequest;
        this.requestExtensions = extensions;
    }

    public TBSRequest(_SeqOfRequest _seqofrequest) {
        this.requestList = _seqofrequest;
    }

    public TBSRequest() {
    }
}
