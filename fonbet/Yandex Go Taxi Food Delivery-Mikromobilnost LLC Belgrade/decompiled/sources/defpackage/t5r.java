package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class t5r implements qrq0 {
    public final qrq0 a;
    public final boolean b;
    public final tls c;

    public t5r(qrq0 qrq0Var, boolean z, tls tlsVar) {
        this.a = qrq0Var;
        this.b = z;
        this.c = tlsVar;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new s5r(this);
    }
}
