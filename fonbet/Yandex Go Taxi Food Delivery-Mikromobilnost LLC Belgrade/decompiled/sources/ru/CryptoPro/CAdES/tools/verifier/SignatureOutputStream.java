package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.kbs;
import defpackage.xr1;
import java.io.IOException;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.spec.LocalContextSpec;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
class SignatureOutputStream extends OutputStream {
    public Signature a;
    public Signature b;

    public SignatureOutputStream(xr1 xr1Var, String str, PrivateKey privateKey, boolean z) throws OperatorCreationException {
        try {
            a(xr1Var, str);
            this.a.initSign(privateKey);
            if (z) {
                this.a.setParameter(new LocalContextSpec());
            }
        } catch (Exception e) {
            throw new OperatorCreationException(e.getMessage(), e);
        }
    }

    public final void a(xr1 xr1Var, String str) {
        String str2 = xr1Var.a.a;
        this.a = Signature.getInstance(str2, str);
        String signOidToSignatureAlgorithm = AlgorithmUtility.signOidToSignatureAlgorithm(str2);
        this.b = Signature.getInstance(JCP.RAW_PREFIX.concat(signOidToSignatureAlgorithm.substring(signOidToSignatureAlgorithm.toUpperCase().indexOf("WITH"))), str);
    }

    public byte[] sign() {
        try {
            return this.a.sign();
        } catch (SignatureException e) {
            JCPLogger.thrown(e);
            return null;
        }
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return false;
        }
        try {
            this.b.update(bArr);
            return this.b.verify(bArr2);
        } catch (SignatureException e) {
            JCPLogger.thrown(e);
            return false;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        try {
            this.a.update(bArr);
        } catch (SignatureException e) {
            kbs.r(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.a.update((byte) i);
        } catch (SignatureException e) {
            kbs.r(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        try {
            this.a.update(bArr, i, i2);
        } catch (SignatureException e) {
            kbs.r(e);
        }
    }

    public boolean verify(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            return this.a.verify(bArr);
        } catch (SignatureException e) {
            JCPLogger.thrown(e);
            return false;
        }
    }

    public SignatureOutputStream(xr1 xr1Var, String str, X509Certificate x509Certificate) throws OperatorCreationException {
        try {
            a(xr1Var, str);
            this.a.initVerify(x509Certificate);
            this.b.initVerify(x509Certificate);
        } catch (Exception e) {
            throw new OperatorCreationException(e.getMessage(), e);
        }
    }
}
