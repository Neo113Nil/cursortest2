package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class NameForms_otherNameForms extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 1);
    public Asn1ObjectIdentifier[] elements;

    public NameForms_otherNameForms(int i) {
        this.elements = new Asn1ObjectIdentifier[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(asn1ObjectIdentifier);
        }
        Asn1ObjectIdentifier[] asn1ObjectIdentifierArr = new Asn1ObjectIdentifier[linkedList.size()];
        this.elements = asn1ObjectIdentifierArr;
        linkedList.toArray(asn1ObjectIdentifierArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1ObjectIdentifier[] asn1ObjectIdentifierArr = this.elements;
        if (asn1ObjectIdentifierArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = asn1ObjectIdentifierArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) + i : i;
    }

    public NameForms_otherNameForms() {
        this.elements = null;
    }

    public NameForms_otherNameForms(Asn1ObjectIdentifier[] asn1ObjectIdentifierArr) {
        this.elements = asn1ObjectIdentifierArr;
    }
}
