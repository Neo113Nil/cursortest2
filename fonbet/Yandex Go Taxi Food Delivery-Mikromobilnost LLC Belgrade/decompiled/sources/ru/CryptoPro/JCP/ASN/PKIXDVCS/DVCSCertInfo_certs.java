package ru.CryptoPro.JCP.ASN.PKIXDVCS;

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
public class DVCSCertInfo_certs extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 3);
    public TargetEtcChain[] elements;

    public DVCSCertInfo_certs(int i) {
        this.elements = new TargetEtcChain[i];
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        LinkedList linkedList = new LinkedList();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        while (!asn1BerDecodeContext.expired()) {
            TargetEtcChain targetEtcChain = new TargetEtcChain();
            targetEtcChain.decode(asn1BerDecodeBuffer, true, 0);
            linkedList.add(targetEtcChain);
        }
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[linkedList.size()];
        this.elements = targetEtcChainArr;
        linkedList.toArray(targetEtcChainArr);
        if (this.elements.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        TargetEtcChain[] targetEtcChainArr = this.elements;
        if (targetEtcChainArr.length < 1) {
            throw new Asn1ConsVioException("elements.length", this.elements.length);
        }
        int i = 0;
        for (int length = targetEtcChainArr.length - 1; length >= 0; length--) {
            i += this.elements[length].encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) + i : i;
    }

    public DVCSCertInfo_certs() {
        this.elements = null;
    }

    public DVCSCertInfo_certs(TargetEtcChain[] targetEtcChainArr) {
        this.elements = targetEtcChainArr;
    }
}
