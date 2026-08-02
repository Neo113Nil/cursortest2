package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AltNameType extends Asn1Choice {
    public static final byte _BUILTINNAMEFORM = 2;
    public static final byte _OTHERNAMEFORM = 1;

    public AltNameType(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 6)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new Asn1ObjectIdentifier());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else {
            if (!h.equals((short) 0, (short) 0, 10)) {
                x8e.d(asn1BerDecodeBuffer, h);
                return;
            }
            asn1BerDecodeBuffer.reset();
            setElement(2, new AltNameType_builtinNameForm());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            return ((Asn1ObjectIdentifier) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            return ((AltNameType_builtinNameForm) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        x8e.b();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "builtinNameForm" : "otherNameForm";
    }

    public void set_builtinNameForm(AltNameType_builtinNameForm altNameType_builtinNameForm) {
        setElement(2, altNameType_builtinNameForm);
    }

    public void set_otherNameForm(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        setElement(1, asn1ObjectIdentifier);
    }

    public AltNameType() {
    }
}
