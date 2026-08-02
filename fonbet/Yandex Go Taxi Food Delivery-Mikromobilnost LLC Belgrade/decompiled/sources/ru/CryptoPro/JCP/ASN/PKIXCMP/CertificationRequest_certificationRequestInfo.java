package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;

/* loaded from: classes4.dex */
public class CertificationRequest_certificationRequestInfo extends Asn1Type {
    public _SetOfAttribute attributes;
    public Name subject;
    public CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo subjectPublicKeyInfo;
    public Asn1Integer version;

    public CertificationRequest_certificationRequestInfo(long j, Name name, CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo, _SetOfAttribute _setofattribute) {
        this.version = new Asn1Integer(j);
        this.subject = name;
        this.subjectPublicKeyInfo = certificationRequest_certificationRequestInfo_subjectPublicKeyInfo;
        this.attributes = _setofattribute;
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
        Asn1Integer asn1Integer = new Asn1Integer();
        this.version = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Name name = new Name();
        this.subject = name;
        name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo = new CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo();
        this.subjectPublicKeyInfo = certificationRequest_certificationRequestInfo_subjectPublicKeyInfo;
        certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SetOfAttribute _setofattribute = new _SetOfAttribute();
        this.attributes = _setofattribute;
        _setofattribute.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.attributes.encode(asn1BerEncodeBuffer, false);
        int encode2 = this.version.encode(asn1BerEncodeBuffer, true) + this.subject.encode(asn1BerEncodeBuffer, true) + this.subjectPublicKeyInfo.encode(asn1BerEncodeBuffer, true) + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.subject = null;
        this.subjectPublicKeyInfo = null;
        this.attributes = null;
    }

    public CertificationRequest_certificationRequestInfo(Asn1Integer asn1Integer, Name name, CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo, _SetOfAttribute _setofattribute) {
        this.version = asn1Integer;
        this.subject = name;
        this.subjectPublicKeyInfo = certificationRequest_certificationRequestInfo_subjectPublicKeyInfo;
        this.attributes = _setofattribute;
    }

    public CertificationRequest_certificationRequestInfo() {
    }
}
