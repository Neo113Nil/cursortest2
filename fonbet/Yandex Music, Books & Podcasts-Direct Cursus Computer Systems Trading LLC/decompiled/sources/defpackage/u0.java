package defpackage;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public final class u0 implements Enumeration {
    public int a = 0;
    public final /* synthetic */ v0 b;

    public u0(v0 v0Var) {
        this.b = v0Var;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a < this.b.a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.a;
        d0[] d0VarArr = this.b.a;
        if (i < d0VarArr.length) {
            this.a = i + 1;
            return d0VarArr[i];
        }
        wvs.n();
        return null;
    }
}
