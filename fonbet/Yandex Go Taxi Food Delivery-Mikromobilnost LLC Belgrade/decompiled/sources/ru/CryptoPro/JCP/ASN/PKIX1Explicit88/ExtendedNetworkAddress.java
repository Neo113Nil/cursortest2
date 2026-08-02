package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ExtendedNetworkAddress extends Asn1Choice {
    public static final byte _E163_4_ADDRESS = 1;
    public static final byte _PSAP_ADDRESS = 2;

    public ExtendedNetworkAddress(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 32, 16)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new ExtendedNetworkAddress_e163_4_address());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 0)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(2, new PresentationAddress());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            return ((ExtendedNetworkAddress_e163_4_address) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            int encode = ((PresentationAddress) getElement()).encode(asn1BerEncodeBuffer, true);
            return asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        x8e.b();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "psap_address" : "e163_4_address";
    }

    public void set_e163_4_address(ExtendedNetworkAddress_e163_4_address extendedNetworkAddress_e163_4_address) {
        setElement(1, extendedNetworkAddress_e163_4_address);
    }

    public void set_psap_address(PresentationAddress presentationAddress) {
        setElement(2, presentationAddress);
    }

    public ExtendedNetworkAddress() {
    }
}
