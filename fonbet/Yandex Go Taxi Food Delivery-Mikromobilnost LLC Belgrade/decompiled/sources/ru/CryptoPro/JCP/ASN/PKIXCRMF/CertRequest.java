package ru.CryptoPro.JCP.ASN.PKIXCRMF;

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

/* loaded from: classes4.dex */
public class CertRequest extends Asn1Type {
    public Asn1Integer certReqId;
    public CertTemplate certTemplate;
    public Controls controls;

    public CertRequest(long j, CertTemplate certTemplate, Controls controls) {
        this.certReqId = new Asn1Integer(j);
        this.certTemplate = certTemplate;
        this.controls = controls;
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
        this.certReqId = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertTemplate certTemplate = new CertTemplate();
        this.certTemplate = certTemplate;
        certTemplate.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            Controls controls = new Controls();
            this.controls = controls;
            controls.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Controls controls = this.controls;
        int encode = this.certReqId.encode(asn1BerEncodeBuffer, true) + this.certTemplate.encode(asn1BerEncodeBuffer, true) + (controls != null ? controls.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.certReqId = null;
        this.certTemplate = null;
        this.controls = null;
    }

    public CertRequest(Asn1Integer asn1Integer, CertTemplate certTemplate, Controls controls) {
        this.certReqId = asn1Integer;
        this.certTemplate = certTemplate;
        this.controls = controls;
    }

    public CertRequest(Asn1Integer asn1Integer, CertTemplate certTemplate) {
        this.certReqId = asn1Integer;
        this.certTemplate = certTemplate;
    }

    public CertRequest() {
    }

    public CertRequest(long j, CertTemplate certTemplate) {
        this.certReqId = new Asn1Integer(j);
        this.certTemplate = certTemplate;
    }
}
