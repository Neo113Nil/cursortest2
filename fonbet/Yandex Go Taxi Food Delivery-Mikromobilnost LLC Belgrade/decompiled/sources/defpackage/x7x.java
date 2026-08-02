package defpackage;

import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: classes4.dex */
public final class x7x extends hdu implements b9i0 {
    public Signature c;

    @Override // defpackage.b9i0
    public final boolean verify(byte[] bArr, byte[] bArr2) {
        Signature signature = this.c;
        try {
            try {
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining raw signature: " + e.getMessage(), e);
            }
        } finally {
            try {
                signature.verify(bArr2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.hdu, defpackage.xie
    public final boolean verify(byte[] bArr) {
        Signature signature = this.c;
        try {
            return super.verify(bArr);
        } finally {
            try {
                signature.verify(bArr);
            } catch (Exception unused) {
            }
        }
    }
}
