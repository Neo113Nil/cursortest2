package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.xml.security.utils.Base64;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedInternalTimeStampValidationProcessImpl;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.SignatureTimeStampImpl;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public final class st61 extends SignatureTimeStampImpl implements ot61 {
    public st61(SignatureTimeStampImpl signatureTimeStampImpl) {
        super(signatureTimeStampImpl.E);
        this.w = signatureTimeStampImpl.w;
        this.x = signatureTimeStampImpl.x;
        this.y = signatureTimeStampImpl.y;
        this.a = signatureTimeStampImpl.a;
        this.b = signatureTimeStampImpl.b;
        this.B.addAll(signatureTimeStampImpl.B);
        this.C.addAll(signatureTimeStampImpl.C);
        this.D.addAll(signatureTimeStampImpl.D);
    }

    public final void d() {
        JCPLogger.subEnter();
        JCPLogger.fine("Replacing signature-timestamp to enhanced...");
        try {
            this.b.f("EncapsulatedTimeStamp").setTextContent(Base64.encode(this.w.a.b.getEncoded("DL")));
            JCPLogger.fine("Replacement completed.");
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
        }
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStampImpl, ru.CryptoPro.XAdES.SignatureTimeStamp
    public final void verify(Set set, Set set2) {
        JCPLogger.subEnter();
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        if (set2 == null) {
            set2 = Collections.EMPTY_SET;
        }
        HashSet hashSet = this.C;
        hashSet.addAll(set);
        HashSet hashSet2 = this.D;
        hashSet2.addAll(set2);
        try {
            JCPLogger.fine("Validating enhanced signature-timestamp (internal) imprint...");
            kt61 kt61Var = new kt61(this.B, this.a);
            JCPLogger.fine("Digest OID found: " + this.x);
            kt61Var.w = this.x;
            kt61Var.c = this.y;
            JCPLogger.fine("Validating enhanced signature-timestamp (internal)...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            EnhancedInternalTimeStampValidationProcessImpl enhancedInternalTimeStampValidationProcessImpl = new EnhancedInternalTimeStampValidationProcessImpl(kt61Var, this.w);
            enhancedInternalTimeStampValidationProcessImpl.setCertificateValues(hashSet);
            enhancedInternalTimeStampValidationProcessImpl.setCRLs(hashSet2);
            enhancedInternalTimeStampValidationProcessImpl.setExternalDate(null);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) enhancedInternalTimeStampValidationProcessImpl);
            JCPLogger.fine("Validation enhanced signature-timestamp completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }
}
