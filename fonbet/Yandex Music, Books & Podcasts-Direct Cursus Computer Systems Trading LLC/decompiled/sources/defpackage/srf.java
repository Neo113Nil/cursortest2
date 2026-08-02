package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public final class srf implements Enumeration {
    public i0 a;
    public s0 b;

    public final s0 a() {
        try {
            return this.a.z();
        } catch (IOException e) {
            throw new q0("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        s0 s0Var = this.b;
        if (s0Var != null) {
            this.b = a();
            return s0Var;
        }
        wvs.n();
        return null;
    }
}
