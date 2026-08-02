package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.ReasonFlags;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIXCRMF.CertTemplate;

/* loaded from: classes4.dex */
public class RevDetails extends Asn1Type {
    public Asn1GeneralizedTime badSinceDate;
    public CertTemplate certDetails;
    public Extensions crlEntryDetails;
    public ReasonFlags revocationReason;

    public RevDetails(CertTemplate certTemplate, ReasonFlags reasonFlags, String str, Extensions extensions) {
        this.certDetails = certTemplate;
        this.revocationReason = reasonFlags;
        this.badSinceDate = new Asn1GeneralizedTime(str);
        this.crlEntryDetails = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertTemplate certTemplate = new CertTemplate();
        this.certDetails = certTemplate;
        certTemplate.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            ReasonFlags reasonFlags = new ReasonFlags();
            this.revocationReason = reasonFlags;
            reasonFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
            this.badSinceDate = asn1GeneralizedTime;
            asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            Extensions extensions = new Extensions();
            this.crlEntryDetails = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 3) || peekTag.equals((short) 0, (short) 0, 24)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Extensions extensions = this.crlEntryDetails;
        int encode = extensions != null ? extensions.encode(asn1BerEncodeBuffer, true) : 0;
        Asn1GeneralizedTime asn1GeneralizedTime = this.badSinceDate;
        if (asn1GeneralizedTime != null) {
            encode += asn1GeneralizedTime.encode(asn1BerEncodeBuffer, true);
        }
        ReasonFlags reasonFlags = this.revocationReason;
        if (reasonFlags != null) {
            encode += reasonFlags.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.certDetails.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.certDetails = null;
        this.revocationReason = null;
        this.badSinceDate = null;
        this.crlEntryDetails = null;
    }

    public RevDetails(CertTemplate certTemplate, ReasonFlags reasonFlags, Asn1GeneralizedTime asn1GeneralizedTime, Extensions extensions) {
        this.certDetails = certTemplate;
        this.revocationReason = reasonFlags;
        this.badSinceDate = asn1GeneralizedTime;
        this.crlEntryDetails = extensions;
    }

    public RevDetails(CertTemplate certTemplate) {
        this.certDetails = certTemplate;
    }

    public RevDetails() {
    }
}
