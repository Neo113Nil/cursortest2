package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class CommitmentTypeIndication_commitmentTypeQualifier extends Asn1Type {
    public CommitmentTypeQualifier[] elements;

    public CommitmentTypeIndication_commitmentTypeQualifier(int i) {
        this.elements = new CommitmentTypeQualifier[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            CommitmentTypeQualifier commitmentTypeQualifier = new CommitmentTypeQualifier();
            commitmentTypeQualifier.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(commitmentTypeQualifier);
        }
        CommitmentTypeQualifier[] commitmentTypeQualifierArr = new CommitmentTypeQualifier[linkedList.size()];
        this.elements = commitmentTypeQualifierArr;
        linkedList.toArray(commitmentTypeQualifierArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        CommitmentTypeQualifier[] commitmentTypeQualifierArr = this.elements;
        if (commitmentTypeQualifierArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = commitmentTypeQualifierArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public CommitmentTypeIndication_commitmentTypeQualifier() {
        this.elements = null;
    }

    public CommitmentTypeIndication_commitmentTypeQualifier(CommitmentTypeQualifier[] commitmentTypeQualifierArr) {
        this.elements = commitmentTypeQualifierArr;
    }
}
