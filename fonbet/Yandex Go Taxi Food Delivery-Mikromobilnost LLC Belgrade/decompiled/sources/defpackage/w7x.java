package defpackage;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.HashSet;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes4.dex */
public final class w7x {
    public static final HashSet d;
    public final String a;
    public yc70 b = new yc70(new rdh());
    public xr1 c;

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add("DILITHIUM");
        hashSet.add("SPHINCS+");
        hashSet.add("SPHINCSPlus");
    }

    public w7x(String str) {
        this.a = str;
    }

    public final r1s a(PrivateKey privateKey) {
        String str = this.a;
        try {
            this.c = d.contains(quu0.e(str)) ? k4f0.m(privateKey.getEncoded()).b : new ikh().find(str);
            xr1 xr1Var = this.c;
            Signature c = this.b.c(xr1Var);
            c.initSign(privateKey);
            return new r1s(c, xr1Var);
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create signer: " + e.getMessage(), e);
        }
    }
}
