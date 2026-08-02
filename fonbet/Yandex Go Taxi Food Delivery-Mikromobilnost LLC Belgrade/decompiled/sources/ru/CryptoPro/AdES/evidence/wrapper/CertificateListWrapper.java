package ru.CryptoPro.AdES.evidence.wrapper;

import defpackage.m79;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CertificateListWrapper extends EvidenceWrapper<m79> {
    public CertificateListWrapper(m79 m79Var) throws IOException {
        super(m79.m(m79Var.getEncoded()));
    }
}
