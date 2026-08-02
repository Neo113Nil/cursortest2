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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Time;

/* loaded from: classes4.dex */
public class CertificateListAssertion extends Asn1Type {
    public Time dateAndTime;
    public DistributionPointName distributionPoint;
    public Name issuer;
    public CRLNumber maxCRLNumber;
    public CRLNumber minCRLNumber;
    public ReasonFlags reasonFlags;

    public CertificateListAssertion(Name name, long j, long j2, ReasonFlags reasonFlags, Time time, DistributionPointName distributionPointName) {
        this.issuer = name;
        this.minCRLNumber = new CRLNumber(j);
        this.maxCRLNumber = new CRLNumber(j2);
        this.reasonFlags = reasonFlags;
        this.dateAndTime = time;
        this.distributionPoint = distributionPointName;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            Name name = new Name();
            this.issuer = name;
            name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            CRLNumber cRLNumber = new CRLNumber();
            this.minCRLNumber = cRLNumber;
            cRLNumber.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            CRLNumber cRLNumber2 = new CRLNumber();
            this.maxCRLNumber = cRLNumber2;
            cRLNumber2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            ReasonFlags reasonFlags = new ReasonFlags();
            this.reasonFlags = reasonFlags;
            reasonFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 23) || peekTag.equals((short) 0, (short) 0, 24)) {
                Time time = new Time();
                this.dateAndTime = time;
                time.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            DistributionPointName distributionPointName = new DistributionPointName();
            this.distributionPoint = distributionPointName;
            distributionPointName.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 128, (short) 0, 0) || peekTag2.equals((short) 128, (short) 0, 1) || peekTag2.equals((short) 0, (short) 0, 3) || peekTag2.equals((short) 128, (short) 32, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            int encode = distributionPointName.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode) + encode;
        } else {
            i = 0;
        }
        Time time = this.dateAndTime;
        if (time != null) {
            i += time.encode(asn1BerEncodeBuffer, true);
        }
        ReasonFlags reasonFlags = this.reasonFlags;
        if (reasonFlags != null) {
            i += reasonFlags.encode(asn1BerEncodeBuffer, true);
        }
        CRLNumber cRLNumber = this.maxCRLNumber;
        if (cRLNumber != null) {
            int encode2 = cRLNumber.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode2);
        }
        CRLNumber cRLNumber2 = this.minCRLNumber;
        if (cRLNumber2 != null) {
            int encode3 = cRLNumber2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode3);
        }
        Name name = this.issuer;
        if (name != null) {
            i += name.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.issuer = null;
        this.minCRLNumber = null;
        this.maxCRLNumber = null;
        this.reasonFlags = null;
        this.dateAndTime = null;
        this.distributionPoint = null;
    }

    public CertificateListAssertion(Name name, CRLNumber cRLNumber, CRLNumber cRLNumber2, ReasonFlags reasonFlags, Time time, DistributionPointName distributionPointName) {
        this.issuer = name;
        this.minCRLNumber = cRLNumber;
        this.maxCRLNumber = cRLNumber2;
        this.reasonFlags = reasonFlags;
        this.dateAndTime = time;
        this.distributionPoint = distributionPointName;
    }

    public CertificateListAssertion() {
    }
}
