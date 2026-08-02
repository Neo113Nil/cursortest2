package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AccessDescription extends Asn1Type {
    public GeneralName accessLocation;
    public Asn1ObjectIdentifier accessMethod;

    public AccessDescription(int[] iArr, GeneralName generalName) {
        this.accessMethod = new Asn1ObjectIdentifier(iArr);
        this.accessLocation = generalName;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.accessMethod = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 0, 1) && !peekTag.equals((short) 128, (short) 0, 2) && !peekTag.equals((short) 128, (short) 32, 3) && !peekTag.equals((short) 128, (short) 32, 4) && !peekTag.equals((short) 128, (short) 32, 5) && !peekTag.equals((short) 128, (short) 0, 6) && !peekTag.equals((short) 128, (short) 0, 7) && !peekTag.equals((short) 128, (short) 0, 8)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GeneralName generalName = new GeneralName();
        this.accessLocation = generalName;
        generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.accessMethod.encode(asn1BerEncodeBuffer, true) + this.accessLocation.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.accessMethod = null;
        this.accessLocation = null;
    }

    public AccessDescription(Asn1ObjectIdentifier asn1ObjectIdentifier, GeneralName generalName) {
        this.accessMethod = asn1ObjectIdentifier;
        this.accessLocation = generalName;
    }

    public AccessDescription() {
    }
}
