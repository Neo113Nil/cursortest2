package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class yw01 implements qrq0 {
    public final qrq0 a;
    public final tls b;

    public yw01(qrq0 qrq0Var, tls tlsVar) {
        this.a = qrq0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new xw01(this);
    }
}
