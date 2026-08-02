package app.cash.trifle.validators;

import app.cash.trifle.Certificate;
import app.cash.trifle.TrifleErrors;
import app.cash.trifle.extensions.CertificateExtensions;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXReason;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CertChainValidator$X509CertChainValidator {
    public static final CertPathValidator PATH_VALIDATOR = CertPathValidator.getInstance(CertPathValidator.getDefaultType());
    public final PKIXParameters pkixParams;

    public CertChainValidator$X509CertChainValidator(Certificate certificate) {
        certificate.getClass();
        PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) SetsKt__SetsJVMKt.setOf(new TrustAnchor(CertificateExtensions.toX509Certificate(certificate), null)));
        this.pkixParams = pKIXParameters;
        pKIXParameters.setRevocationEnabled(false);
        pKIXParameters.setDate(null);
    }

    public static List maybeDropRoot(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            X509Certificate x509Certificate = (X509Certificate) it.next();
            if (x509Certificate.getKeyUsage() != null && x509Certificate.getKeyUsage()[5]) {
                break;
            }
            i++;
        }
        return i > -1 ? CollectionsKt.dropLast(arrayList.size() - i, arrayList) : arrayList;
    }

    /* renamed from: validate-IoAF18A, reason: not valid java name */
    public final Object m1427validateIoAF18A(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(CertificateExtensions.toX509Certificate((Certificate) it.next()));
            }
            List<? extends java.security.cert.Certificate> maybeDropRoot = maybeDropRoot(arrayList2);
            if (maybeDropRoot.isEmpty()) {
                Result.Companion companion = Result.Companion;
                return SafeTrace.createFailure(TrifleErrors.InvalidCertPath.INSTANCE);
            }
            CertPathValidator certPathValidator = PATH_VALIDATOR;
            CertPath generateCertPath = CertificateExtensions.X509FACTORY.generateCertPath(maybeDropRoot);
            generateCertPath.getClass();
            certPathValidator.validate(generateCertPath, this.pkixParams);
            Result.Companion companion2 = Result.Companion;
            return Unit.INSTANCE;
        } catch (CertPathValidatorException e) {
            Result.Companion companion3 = Result.Companion;
            CertPathValidatorException.Reason reason = e.getReason();
            return SafeTrace.createFailure(reason == CertPathValidatorException.BasicReason.EXPIRED ? TrifleErrors.ExpiredCertificate.INSTANCE : reason == CertPathValidatorException.BasicReason.NOT_YET_VALID ? TrifleErrors.NotValidYetCertificate.INSTANCE : reason == CertPathValidatorException.BasicReason.INVALID_SIGNATURE ? TrifleErrors.InvalidSignature.INSTANCE : reason == PKIXReason.NO_TRUST_ANCHOR ? TrifleErrors.NoTrustAnchor.INSTANCE : new TrifleErrors.UnspecifiedFailure("Unspecified Trifle verification failure", e));
        } catch (Exception e2) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(new TrifleErrors.UnspecifiedFailure("Unspecified Trifle verification failure", e2));
        }
    }
}
