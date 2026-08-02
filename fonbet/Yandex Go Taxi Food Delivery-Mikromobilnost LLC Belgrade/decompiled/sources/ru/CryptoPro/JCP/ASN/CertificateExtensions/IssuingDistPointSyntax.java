package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class IssuingDistPointSyntax extends Asn1Type {
    public DistributionPointName distributionPoint;
    public Asn1Boolean indirectCRL;
    public Asn1Boolean onlyContainsCACerts;
    public Asn1Boolean onlyContainsUserCerts;
    public ReasonFlags onlySomeReasons;

    public IssuingDistPointSyntax(DistributionPointName distributionPointName, boolean z, boolean z2, ReasonFlags reasonFlags, boolean z3) {
        this.distributionPoint = distributionPointName;
        this.onlyContainsUserCerts = new Asn1Boolean(z);
        this.onlyContainsCACerts = new Asn1Boolean(z2);
        this.onlySomeReasons = reasonFlags;
        this.indirectCRL = new Asn1Boolean(z3);
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
            DistributionPointName distributionPointName = new DistributionPointName();
            this.distributionPoint = distributionPointName;
            distributionPointName.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.onlyContainsUserCerts = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            Asn1Boolean asn1Boolean2 = new Asn1Boolean();
            this.onlyContainsCACerts = asn1Boolean2;
            asn1Boolean2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 3, intHolder, true)) {
            ReasonFlags reasonFlags = new ReasonFlags();
            this.onlySomeReasons = reasonFlags;
            reasonFlags.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 4, intHolder, true)) {
            Asn1Boolean asn1Boolean3 = new Asn1Boolean();
            this.indirectCRL = asn1Boolean3;
            asn1Boolean3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 0, 3) || peekTag.equals((short) 128, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        if (this.indirectCRL.equals(false)) {
            i = 0;
        } else {
            int encode = this.indirectCRL.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 4, encode) + encode;
        }
        ReasonFlags reasonFlags = this.onlySomeReasons;
        if (reasonFlags != null) {
            int encode2 = reasonFlags.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 3, encode2);
        }
        if (!this.onlyContainsCACerts.equals(false)) {
            int encode3 = this.onlyContainsCACerts.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode3);
        }
        if (!this.onlyContainsUserCerts.equals(false)) {
            int encode4 = this.onlyContainsUserCerts.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode4);
        }
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            int encode5 = distributionPointName.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode5);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.distributionPoint = null;
        this.onlyContainsUserCerts = new Asn1Boolean(false);
        this.onlyContainsCACerts = new Asn1Boolean(false);
        this.onlySomeReasons = null;
        this.indirectCRL = new Asn1Boolean(false);
    }

    public IssuingDistPointSyntax(DistributionPointName distributionPointName, Asn1Boolean asn1Boolean, Asn1Boolean asn1Boolean2, ReasonFlags reasonFlags, Asn1Boolean asn1Boolean3) {
        this.distributionPoint = distributionPointName;
        this.onlyContainsUserCerts = asn1Boolean;
        this.onlyContainsCACerts = asn1Boolean2;
        this.onlySomeReasons = reasonFlags;
        this.indirectCRL = asn1Boolean3;
    }

    public IssuingDistPointSyntax() {
        this.onlyContainsUserCerts = new Asn1Boolean(false);
        this.onlyContainsCACerts = new Asn1Boolean(false);
        this.indirectCRL = new Asn1Boolean(false);
    }
}
