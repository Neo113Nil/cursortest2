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
public class CertificatePairExactAssertion extends Asn1Type {
    public CertificateExactAssertion forwardAssertion;
    public CertificateExactAssertion reverseAssertion;

    public CertificatePairExactAssertion(CertificateExactAssertion certificateExactAssertion, CertificateExactAssertion certificateExactAssertion2) {
        this.forwardAssertion = certificateExactAssertion;
        this.reverseAssertion = certificateExactAssertion2;
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
            CertificateExactAssertion certificateExactAssertion = new CertificateExactAssertion();
            this.forwardAssertion = certificateExactAssertion;
            certificateExactAssertion.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            CertificateExactAssertion certificateExactAssertion2 = new CertificateExactAssertion();
            this.reverseAssertion = certificateExactAssertion2;
            certificateExactAssertion2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        CertificateExactAssertion certificateExactAssertion = this.reverseAssertion;
        if (certificateExactAssertion != null) {
            int encode = certificateExactAssertion.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        CertificateExactAssertion certificateExactAssertion2 = this.forwardAssertion;
        if (certificateExactAssertion2 != null) {
            int encode2 = certificateExactAssertion2.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.forwardAssertion = null;
        this.reverseAssertion = null;
    }

    public CertificatePairExactAssertion() {
    }
}
