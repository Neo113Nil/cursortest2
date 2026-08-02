package ru.CryptoPro.AdES.evidence.wrapper;

import defpackage.he5;
import defpackage.m79;
import defpackage.v2k0;

/* loaded from: classes4.dex */
public class RevocationValuesWrapper extends v2k0 {
    private final BasicOCSPResponseWrapper[] basicOCSPResponseWrappers;
    private final CertificateListWrapper[] certificateListWrappers;

    public RevocationValuesWrapper(CertificateListWrapper[] certificateListWrapperArr, BasicOCSPResponseWrapper[] basicOCSPResponseWrapperArr) {
        super(makeCertificateLists(certificateListWrapperArr), makeBasicOCSPResponses(basicOCSPResponseWrapperArr));
        this.certificateListWrappers = certificateListWrapperArr;
        this.basicOCSPResponseWrappers = basicOCSPResponseWrapperArr;
    }

    public static he5[] makeBasicOCSPResponses(BasicOCSPResponseWrapper[] basicOCSPResponseWrapperArr) {
        if (basicOCSPResponseWrapperArr == null) {
            return null;
        }
        he5[] he5VarArr = new he5[basicOCSPResponseWrapperArr.length];
        for (int i = 0; i < basicOCSPResponseWrapperArr.length; i++) {
            he5VarArr[i] = basicOCSPResponseWrapperArr[i].getEvidence();
        }
        return he5VarArr;
    }

    public static m79[] makeCertificateLists(CertificateListWrapper[] certificateListWrapperArr) {
        if (certificateListWrapperArr == null) {
            return null;
        }
        m79[] m79VarArr = new m79[certificateListWrapperArr.length];
        for (int i = 0; i < certificateListWrapperArr.length; i++) {
            m79VarArr[i] = certificateListWrapperArr[i].getEvidence();
        }
        return m79VarArr;
    }

    public CertificateListWrapper[] getCrlValWrappers() {
        return this.certificateListWrappers;
    }

    public BasicOCSPResponseWrapper[] getOcspValWrappers() {
        return this.basicOCSPResponseWrappers;
    }
}
