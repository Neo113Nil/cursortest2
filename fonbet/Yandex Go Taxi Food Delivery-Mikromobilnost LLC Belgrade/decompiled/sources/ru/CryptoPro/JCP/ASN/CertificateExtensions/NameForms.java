package ru.CryptoPro.JCP.ASN.CertificateExtensions;

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
public class NameForms extends Asn1Type {
    public BasicNameForms basicNameForms;
    public NameForms_otherNameForms otherNameForms;

    public NameForms(BasicNameForms basicNameForms, NameForms_otherNameForms nameForms_otherNameForms) {
        this.basicNameForms = basicNameForms;
        this.otherNameForms = nameForms_otherNameForms;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            BasicNameForms basicNameForms = new BasicNameForms();
            this.basicNameForms = basicNameForms;
            basicNameForms.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            NameForms_otherNameForms nameForms_otherNameForms = new NameForms_otherNameForms();
            this.otherNameForms = nameForms_otherNameForms;
            nameForms_otherNameForms.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        NameForms_otherNameForms nameForms_otherNameForms = this.otherNameForms;
        int encode = nameForms_otherNameForms != null ? nameForms_otherNameForms.encode(asn1BerEncodeBuffer, true) : 0;
        BasicNameForms basicNameForms = this.basicNameForms;
        if (basicNameForms != null) {
            int encode2 = basicNameForms.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.basicNameForms = null;
        this.otherNameForms = null;
    }

    public NameForms() {
    }
}
