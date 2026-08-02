package app.cash.trifle.providers.jca;

import app.cash.trifle.Certificate;
import app.cash.trifle.KeyHandle$keyPair$2;
import app.cash.trifle.TrifleAlgorithmIdentifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;

/* loaded from: classes3.dex */
public final class JCAContentVerifierProvider implements ContentVerifierProvider {
    public final Lazy delegateProvider$delegate;
    public final SubjectPublicKeyInfo subjectPublicKeyInfo;

    public JCAContentVerifierProvider(Certificate certificate) {
        certificate.getClass();
        SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.certificate).getSubjectPublicKeyInfo();
        subjectPublicKeyInfo.getClass();
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.delegateProvider$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 9));
    }

    @Override // org.bouncycastle.operator.ContentVerifierProvider
    public final ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) {
        algorithmIdentifier.getClass();
        if (!Intrinsics.areEqual(algorithmIdentifier, TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier.INSTANCE) && !Intrinsics.areEqual(algorithmIdentifier, TrifleAlgorithmIdentifier.EdDSAAlgorithmIdentifier.INSTANCE)) {
            a$$ExternalSyntheticBUOutline0.m("Unknown/unsupported AlgorithmId provided to obtain Trifle ContentVerifier");
            return null;
        }
        ContentVerifier contentVerifier = ((ContentVerifierProvider) this.delegateProvider$delegate.getValue()).get(algorithmIdentifier);
        contentVerifier.getClass();
        return contentVerifier;
    }

    @Override // org.bouncycastle.operator.ContentVerifierProvider
    public final X509CertificateHolder getAssociatedCertificate() {
        return null;
    }

    @Override // org.bouncycastle.operator.ContentVerifierProvider
    public final boolean hasAssociatedCertificate() {
        return false;
    }
}
