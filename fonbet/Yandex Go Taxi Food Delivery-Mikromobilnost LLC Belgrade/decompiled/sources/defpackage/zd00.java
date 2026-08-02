package defpackage;

import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes15.dex */
public final class zd00 implements e2c, mwi0 {
    public final boolean a;
    public tls b;

    public zd00(int i) {
        this.a = true;
    }

    @Override // defpackage.mwi0
    public final void remove() {
        this.b = null;
    }

    @Override // defpackage.e2c
    public final mwi0 setListener(tls tlsVar) {
        if (this.a) {
            if (tlsVar != null) {
                tlsVar = new a7b(23, new Ref$LongRef(), tlsVar);
            } else {
                tlsVar = null;
            }
        }
        this.b = tlsVar;
        return this;
    }

    public zd00() {
        this(0);
    }
}
