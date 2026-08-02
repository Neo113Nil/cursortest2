package defpackage;

import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public final class z7x implements ljj {
    public final /* synthetic */ xr1 a;
    public final /* synthetic */ xp6 b;

    public z7x(xr1 xr1Var, xp6 xp6Var) {
        this.a = xr1Var;
        this.b = xp6Var;
    }

    @Override // defpackage.ljj
    public final xr1 getAlgorithmIdentifier() {
        return this.a;
    }

    @Override // defpackage.ljj
    public final byte[] getDigest() {
        return ((MessageDigest) this.b.b).digest();
    }

    @Override // defpackage.ljj
    public final OutputStream getOutputStream() {
        return this.b;
    }
}
