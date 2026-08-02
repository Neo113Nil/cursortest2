package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.bwj0;
import defpackage.dqf;
import defpackage.er80;
import defpackage.fr80;
import defpackage.he5;
import defpackage.lr60;
import defpackage.mr60;
import defpackage.nr60;
import defpackage.u2;
import defpackage.xr1;
import java.io.IOException;
import ru.CryptoPro.AdES.evidence.AbstractEvidenceCompleteRevocationReference;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class OCSPEvidenceCompleteRevocationReferenceImpl extends AbstractEvidenceCompleteRevocationReference<he5, mr60> {
    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidenceCompleteRevocationReference, ru.CryptoPro.AdES.evidence.AbstractCompleteRevocationReference, ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public mr60 make(he5 he5Var) throws AdESException {
        JCPLogger.fine("Creating OCSP complete revocation reference...");
        bwj0 bwj0Var = he5Var.a;
        try {
            return new mr60(new nr60[]{new nr60(new lr60(bwj0Var.c, bwj0Var.w), new er80(new fr80(new xr1(new u2(this.digestAlgorithm)), new dqf(AdESUtility.calculateDigest(this.provider, this.digestAlgorithm, he5Var.getEncoded())))))});
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecRevocationInvalidOCSP);
        }
    }
}
