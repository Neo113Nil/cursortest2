package ru.CryptoPro.JCP.ASN.CPPKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class PKIFreeText extends Asn1Type {
    public Asn1UTF8String[] elements;

    public PKIFreeText(int i) {
        this.elements = new Asn1UTF8String[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
            asn1UTF8String.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(asn1UTF8String);
        }
        Asn1UTF8String[] asn1UTF8StringArr = new Asn1UTF8String[linkedList.size()];
        this.elements = asn1UTF8StringArr;
        linkedList.toArray(asn1UTF8StringArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1UTF8String[] asn1UTF8StringArr = this.elements;
        if (asn1UTF8StringArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = asn1UTF8StringArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public PKIFreeText() {
        this.elements = null;
    }

    public PKIFreeText(Asn1UTF8String[] asn1UTF8StringArr) {
        this.elements = asn1UTF8StringArr;
    }
}
