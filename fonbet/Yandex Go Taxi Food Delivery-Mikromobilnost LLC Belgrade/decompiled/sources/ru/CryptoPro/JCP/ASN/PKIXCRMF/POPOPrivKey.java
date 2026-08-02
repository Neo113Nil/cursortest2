package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class POPOPrivKey extends Asn1Choice {
    public static final byte _DHMAC = 3;
    public static final byte _SUBSEQUENTMESSAGE = 2;
    public static final byte _THISMESSAGE = 1;

    public POPOPrivKey(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 0, 0)) {
            setElement(1, new Asn1BitString());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 0, 1)) {
            setElement(2, new SubsequentMessage());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 0, 2)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new Asn1BitString());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((Asn1BitString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode);
        } else if (i == 2) {
            encode = ((SubsequentMessage) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((Asn1BitString) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "dhMAC" : "subsequentMessage" : "thisMessage";
    }

    public void set_dhMAC(Asn1BitString asn1BitString) {
        setElement(3, asn1BitString);
    }

    public void set_subsequentMessage(SubsequentMessage subsequentMessage) {
        setElement(2, subsequentMessage);
    }

    public void set_thisMessage(Asn1BitString asn1BitString) {
        setElement(1, asn1BitString);
    }

    public POPOPrivKey() {
    }
}
