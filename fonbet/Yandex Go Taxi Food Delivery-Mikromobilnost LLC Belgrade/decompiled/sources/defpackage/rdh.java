package defpackage;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;

/* loaded from: classes4.dex */
public class rdh implements b8x {
    @Override // defpackage.b8x
    public final AlgorithmParameters b(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // defpackage.b8x
    public final MessageDigest c(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // defpackage.b8x
    public final KeyFactory e() {
        return KeyFactory.getInstance("DSA");
    }

    @Override // defpackage.b8x
    public final Signature g(String str) {
        return Signature.getInstance(str);
    }
}
