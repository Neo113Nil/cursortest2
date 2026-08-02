package defpackage;

import java.io.InputStream;

/* loaded from: classes10.dex */
public final class u0w implements bpg {
    public final g63 a;

    public u0w(g63 g63Var) {
        this.a = g63Var;
    }

    @Override // defpackage.bpg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bpg
    public final cpg build(Object obj) {
        return new h2t((InputStream) obj, this.a);
    }
}
