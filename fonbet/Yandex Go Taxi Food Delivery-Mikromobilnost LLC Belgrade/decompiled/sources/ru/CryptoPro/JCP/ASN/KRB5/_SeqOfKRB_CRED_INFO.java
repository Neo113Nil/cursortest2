package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class _SeqOfKRB_CRED_INFO extends Asn1Type {
    public KRB_CRED_INFO[] elements;

    public _SeqOfKRB_CRED_INFO(int i) {
        this.elements = new KRB_CRED_INFO[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            KRB_CRED_INFO krb_cred_info = new KRB_CRED_INFO();
            krb_cred_info.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(krb_cred_info);
        }
        KRB_CRED_INFO[] krb_cred_infoArr = new KRB_CRED_INFO[linkedList.size()];
        this.elements = krb_cred_infoArr;
        linkedList.toArray(krb_cred_infoArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public _SeqOfKRB_CRED_INFO() {
        this.elements = null;
    }

    public _SeqOfKRB_CRED_INFO(KRB_CRED_INFO[] krb_cred_infoArr) {
        this.elements = krb_cred_infoArr;
    }
}
