package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class TeletexOrganizationalUnitNames extends Asn1Type {
    public TeletexOrganizationalUnitName[] elements;

    public TeletexOrganizationalUnitNames(int i) {
        this.elements = new TeletexOrganizationalUnitName[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            TeletexOrganizationalUnitName teletexOrganizationalUnitName = new TeletexOrganizationalUnitName();
            teletexOrganizationalUnitName.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(teletexOrganizationalUnitName);
        }
        TeletexOrganizationalUnitName[] teletexOrganizationalUnitNameArr = new TeletexOrganizationalUnitName[linkedList.size()];
        this.elements = teletexOrganizationalUnitNameArr;
        linkedList.toArray(teletexOrganizationalUnitNameArr);
        TeletexOrganizationalUnitName[] teletexOrganizationalUnitNameArr2 = this.elements;
        if (teletexOrganizationalUnitNameArr2.length < 1 || teletexOrganizationalUnitNameArr2.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        TeletexOrganizationalUnitName[] teletexOrganizationalUnitNameArr = this.elements;
        if (teletexOrganizationalUnitNameArr.length < 1 || teletexOrganizationalUnitNameArr.length > 4) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = teletexOrganizationalUnitNameArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public TeletexOrganizationalUnitNames() {
        this.elements = null;
    }

    public TeletexOrganizationalUnitNames(TeletexOrganizationalUnitName[] teletexOrganizationalUnitNameArr) {
        this.elements = teletexOrganizationalUnitNameArr;
    }
}
