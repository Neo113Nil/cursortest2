package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class GostPrivateCertificateStore extends Asn1Type {
    public Asn1OpenType[] elements;

    public GostPrivateCertificateStore(int i) {
        this.elements = new Asn1OpenType[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            asn1OpenType.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(asn1OpenType);
        }
        Asn1OpenType[] asn1OpenTypeArr = new Asn1OpenType[linkedList.size()];
        this.elements = asn1OpenTypeArr;
        linkedList.toArray(asn1OpenTypeArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
        Asn1OpenType[] asn1OpenTypeArr = this.elements;
        Asn1OctetString[] asn1OctetStringArr = new Asn1OctetString[asn1OpenTypeArr.length];
        int i = 0;
        for (int length = asn1OpenTypeArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode((Asn1BerEncodeBuffer) asn1DerEncodeBuffer, true);
            asn1OctetStringArr[length] = new Asn1OctetString(asn1DerEncodeBuffer.getMsgCopy());
            asn1DerEncodeBuffer.reset();
        }
        Arrays.sort(asn1OctetStringArr);
        for (int length2 = this.elements.length - 1; length2 >= 0; length2--) {
            asn1OctetStringArr[length2].encode(asn1BerEncodeBuffer, false);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, i) + i : i;
    }

    public GostPrivateCertificateStore() {
        this.elements = null;
    }

    public GostPrivateCertificateStore(Asn1OpenType[] asn1OpenTypeArr) {
        this.elements = asn1OpenTypeArr;
    }
}
