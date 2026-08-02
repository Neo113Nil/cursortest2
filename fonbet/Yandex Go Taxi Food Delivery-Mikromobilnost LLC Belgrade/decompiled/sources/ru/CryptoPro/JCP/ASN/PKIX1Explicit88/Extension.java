package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class Extension extends Asn1Type {
    public Asn1Boolean critical;
    public Asn1ObjectIdentifier extnID;
    public Asn1OctetString extnValue;

    public Extension(int[] iArr, byte[] bArr) {
        this.extnID = new Asn1ObjectIdentifier(iArr);
        this.critical = new Asn1Boolean(false);
        this.extnValue = new Asn1OctetString(bArr);
    }

    public void checkTC(boolean z) throws Asn1Exception {
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
        this.extnID = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.critical = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.extnValue = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 0, (short) 0, 4)) {
                quz.g();
                return;
            }
        }
        checkTC(true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        checkTC(false);
        int encode = this.extnValue.encode(asn1BerEncodeBuffer, true);
        if (!this.critical.equals(false)) {
            encode += this.critical.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.extnID.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.extnID = null;
        this.critical = new Asn1Boolean(false);
        this.extnValue = null;
    }

    public Extension(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Boolean asn1Boolean, Asn1OctetString asn1OctetString) {
        this.extnID = asn1ObjectIdentifier;
        this.critical = asn1Boolean;
        this.extnValue = asn1OctetString;
    }

    public Extension(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OctetString asn1OctetString) {
        this.extnID = asn1ObjectIdentifier;
        this.critical = new Asn1Boolean(false);
        this.extnValue = asn1OctetString;
    }

    public Extension(int[] iArr, boolean z, byte[] bArr) {
        this.extnID = new Asn1ObjectIdentifier(iArr);
        this.critical = new Asn1Boolean(z);
        this.extnValue = new Asn1OctetString(bArr);
    }

    public Extension() {
        this.critical = new Asn1Boolean(false);
    }
}
