package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PresentationAddress extends Asn1Type {
    public PresentationAddress_nAddresses nAddresses;
    public Asn1OctetString pSelector;
    public Asn1OctetString sSelector;
    public Asn1OctetString tSelector;

    public PresentationAddress(byte[] bArr, byte[] bArr2, byte[] bArr3, PresentationAddress_nAddresses presentationAddress_nAddresses) {
        this.pSelector = new Asn1OctetString(bArr);
        this.sSelector = new Asn1OctetString(bArr2);
        this.tSelector = new Asn1OctetString(bArr3);
        this.nAddresses = presentationAddress_nAddresses;
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
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.pSelector = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Asn1OctetString asn1OctetString2 = new Asn1OctetString();
            this.sSelector = asn1OctetString2;
            asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            Asn1OctetString asn1OctetString3 = new Asn1OctetString();
            this.tSelector = asn1OctetString3;
            asn1OctetString3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PresentationAddress_nAddresses presentationAddress_nAddresses = new PresentationAddress_nAddresses();
        this.nAddresses = presentationAddress_nAddresses;
        presentationAddress_nAddresses.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.nAddresses.encode(asn1BerEncodeBuffer, true);
        Asn1OctetString asn1OctetString = this.tSelector;
        if (asn1OctetString != null) {
            int encode2 = asn1OctetString.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        Asn1OctetString asn1OctetString2 = this.sSelector;
        if (asn1OctetString2 != null) {
            int encode3 = asn1OctetString2.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        Asn1OctetString asn1OctetString3 = this.pSelector;
        if (asn1OctetString3 != null) {
            int encode4 = asn1OctetString3.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.pSelector = null;
        this.sSelector = null;
        this.tSelector = null;
        this.nAddresses = null;
    }

    public PresentationAddress(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1OctetString asn1OctetString3, PresentationAddress_nAddresses presentationAddress_nAddresses) {
        this.pSelector = asn1OctetString;
        this.sSelector = asn1OctetString2;
        this.tSelector = asn1OctetString3;
        this.nAddresses = presentationAddress_nAddresses;
    }

    public PresentationAddress(PresentationAddress_nAddresses presentationAddress_nAddresses) {
        this.nAddresses = presentationAddress_nAddresses;
    }

    public PresentationAddress() {
    }
}
