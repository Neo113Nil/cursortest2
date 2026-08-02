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
public class CertificateListExactAssertion extends Asn1Type {
    public DistributionPointName distributionPoint;
    public Name issuer;
    public Time thisUpdate;

    public CertificateListExactAssertion(Name name, Time time, DistributionPointName distributionPointName) {
        this.issuer = name;
        this.thisUpdate = time;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Name name = new Name();
        this.issuer = name;
        name.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 0, 23) && !peekTag.equals((short) 0, (short) 0, 24)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Time time = new Time();
        this.thisUpdate = time;
        time.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
            if (peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 32, 1)) {
                DistributionPointName distributionPointName = new DistributionPointName();
                this.distributionPoint = distributionPointName;
                distributionPointName.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        asn1BerDecodeContext.expired();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        DistributionPointName distributionPointName = this.distributionPoint;
        int encode = this.issuer.encode(asn1BerEncodeBuffer, true) + this.thisUpdate.encode(asn1BerEncodeBuffer, true) + (distributionPointName != null ? distributionPointName.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.issuer = null;
        this.thisUpdate = null;
        this.distributionPoint = null;
    }

    public CertificateListExactAssertion() {
    }

    public CertificateListExactAssertion(Name name, Time time) {
        this.issuer = name;
        this.thisUpdate = time;
    }
}
