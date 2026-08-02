package ru.CryptoPro.AdES.evidence;

import defpackage.cr80;
import defpackage.tbf;
import defpackage.v2k0;
import java.util.List;

/* loaded from: classes4.dex */
public interface StatusValidator {
    void setCompleteCertificateReferences(List<cr80> list);

    void setCompleteRevocationReferences(List<tbf> list);

    void setRevocationValues(v2k0 v2k0Var);

    void setSignerMustHaveOcspEvidence(boolean z);
}
