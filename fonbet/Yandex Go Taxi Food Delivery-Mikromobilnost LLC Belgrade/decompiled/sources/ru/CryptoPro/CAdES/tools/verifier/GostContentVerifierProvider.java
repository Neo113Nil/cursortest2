package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.b9i0;
import defpackage.xie;
import defpackage.xr1;
import defpackage.yie;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public class GostContentVerifierProvider implements yie {
    public final String a;
    public final X509Certificate b;
    public final X509CertificateHolder c;

    public GostContentVerifierProvider(X509Certificate x509Certificate, String str) throws CAdESException {
        this.b = x509Certificate;
        this.a = str;
        try {
            this.c = new X509CertificateHolder(x509Certificate.getEncoded());
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecInternal);
        } catch (CertificateEncodingException e2) {
            throw new CAdESException(e2, IAdESException.ecInternal);
        }
    }

    @Override // defpackage.yie
    public xie get(xr1 xr1Var) throws OperatorCreationException {
        return new C1SignatureContentVerifier(xr1Var, new SignatureOutputStream(xr1Var, this.a, this.b));
    }

    @Override // defpackage.yie
    public X509CertificateHolder getAssociatedCertificate() {
        return this.c;
    }

    @Override // defpackage.yie
    public boolean hasAssociatedCertificate() {
        return this.b != null;
    }

    /* renamed from: ru.CryptoPro.CAdES.tools.verifier.GostContentVerifierProvider$1SignatureContentVerifier, reason: invalid class name */
    class C1SignatureContentVerifier implements xie, b9i0 {
        public final /* synthetic */ xr1 a;
        public final /* synthetic */ SignatureOutputStream b;

        public C1SignatureContentVerifier(xr1 xr1Var, SignatureOutputStream signatureOutputStream) {
            this.a = xr1Var;
            this.b = signatureOutputStream;
        }

        public xr1 getAlgorithmIdentifier() {
            return this.a;
        }

        @Override // defpackage.xie
        public OutputStream getOutputStream() {
            return this.b;
        }

        @Override // defpackage.xie
        public boolean verify(byte[] bArr) {
            return this.b.verify(bArr);
        }

        @Override // defpackage.b9i0
        public boolean verify(byte[] bArr, byte[] bArr2) {
            return this.b.verify(bArr, bArr2);
        }
    }
}
