package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class PrincipalName_name_string extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 1);
    public Asn1GeneralString[] elements;

    public PrincipalName_name_string(int i) {
        this.elements = new Asn1GeneralString[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        while (!asn1BerDecodeContext.expired()) {
            Asn1GeneralString asn1GeneralString = new Asn1GeneralString();
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(asn1GeneralString);
        }
        Asn1GeneralString[] asn1GeneralStringArr = new Asn1GeneralString[linkedList.size()];
        this.elements = asn1GeneralStringArr;
        linkedList.toArray(asn1GeneralStringArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public PrincipalName_name_string() {
        this.elements = null;
    }

    public PrincipalName_name_string(Asn1GeneralString[] asn1GeneralStringArr) {
        this.elements = asn1GeneralStringArr;
    }
}
