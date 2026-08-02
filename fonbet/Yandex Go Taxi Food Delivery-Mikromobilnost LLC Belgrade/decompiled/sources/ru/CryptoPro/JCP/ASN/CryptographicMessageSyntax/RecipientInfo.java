package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

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
public class RecipientInfo extends Asn1Choice {
    public static final byte _KARI = 2;
    public static final byte _KEKRI = 3;
    public static final byte _KTRI = 1;

    public RecipientInfo(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 32, 16)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new KeyTransRecipientInfo());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 1)) {
            setElement(2, new KeyAgreeRecipientInfo());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 2)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new KEKRecipientInfo());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            return ((KeyTransRecipientInfo) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            encode = ((KeyAgreeRecipientInfo) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((KEKRecipientInfo) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "kekri" : "kari" : "ktri";
    }

    public void set_kari(KeyAgreeRecipientInfo keyAgreeRecipientInfo) {
        setElement(2, keyAgreeRecipientInfo);
    }

    public void set_kekri(KEKRecipientInfo kEKRecipientInfo) {
        setElement(3, kEKRecipientInfo);
    }

    public void set_ktri(KeyTransRecipientInfo keyTransRecipientInfo) {
        setElement(1, keyTransRecipientInfo);
    }

    public RecipientInfo() {
    }
}
