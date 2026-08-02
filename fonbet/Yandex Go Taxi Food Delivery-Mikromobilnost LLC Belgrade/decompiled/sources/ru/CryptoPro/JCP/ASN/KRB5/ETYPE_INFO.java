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
public class ETYPE_INFO extends Asn1Type {
    public ETYPE_INFO_ENTRY[] elements;

    public ETYPE_INFO(int i) {
        this.elements = new ETYPE_INFO_ENTRY[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            ETYPE_INFO_ENTRY etype_info_entry = new ETYPE_INFO_ENTRY();
            etype_info_entry.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(etype_info_entry);
        }
        ETYPE_INFO_ENTRY[] etype_info_entryArr = new ETYPE_INFO_ENTRY[linkedList.size()];
        this.elements = etype_info_entryArr;
        linkedList.toArray(etype_info_entryArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int length = this.elements.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public ETYPE_INFO() {
        this.elements = null;
    }

    public ETYPE_INFO(ETYPE_INFO_ENTRY[] etype_info_entryArr) {
        this.elements = etype_info_entryArr;
    }
}
