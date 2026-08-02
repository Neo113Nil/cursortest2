package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class KEKIdentifier extends Asn1Type {
    public Asn1GeneralizedTime date;
    public Asn1OctetString keyIdentifier;
    public OtherKeyAttribute other;

    public KEKIdentifier(byte[] bArr, String str, OtherKeyAttribute otherKeyAttribute) {
        this.keyIdentifier = new Asn1OctetString(bArr);
        this.date = new Asn1GeneralizedTime(str);
        this.other = otherKeyAttribute;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.keyIdentifier = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
            this.date = asn1GeneralizedTime;
            asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            OtherKeyAttribute otherKeyAttribute = new OtherKeyAttribute();
            this.other = otherKeyAttribute;
            otherKeyAttribute.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        OtherKeyAttribute otherKeyAttribute = this.other;
        int encode = otherKeyAttribute != null ? otherKeyAttribute.encode(asn1BerEncodeBuffer, true) : 0;
        Asn1GeneralizedTime asn1GeneralizedTime = this.date;
        if (asn1GeneralizedTime != null) {
            encode += asn1GeneralizedTime.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.keyIdentifier.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.keyIdentifier = null;
        this.date = null;
        this.other = null;
    }

    public KEKIdentifier(Asn1OctetString asn1OctetString, Asn1GeneralizedTime asn1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.keyIdentifier = asn1OctetString;
        this.date = asn1GeneralizedTime;
        this.other = otherKeyAttribute;
    }

    public KEKIdentifier(Asn1OctetString asn1OctetString) {
        this.keyIdentifier = asn1OctetString;
    }

    public KEKIdentifier() {
    }

    public KEKIdentifier(byte[] bArr) {
        this.keyIdentifier = new Asn1OctetString(bArr);
    }
}
