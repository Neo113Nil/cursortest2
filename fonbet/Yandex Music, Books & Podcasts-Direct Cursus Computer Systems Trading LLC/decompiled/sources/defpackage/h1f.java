package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class h1f implements Iterable, j9f {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final j9f c;
    public final Object d;

    public h1f(int i, j1f j1fVar, w55 w55Var) {
        this.b = i;
        this.c = j1fVar;
        this.d = w55Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                int i = this.b;
                j1f j1fVar = (j1f) this.c;
                return new i1f(i, j1fVar, (j1f) new vmr((w55) this.d, i, Math.min(i + 400, j1fVar.b)).iterator());
            default:
                return new pqd((fxq) this.c, this.b, null, (cb0) this.d);
        }
    }

    public h1f(fxq fxqVar, int i, qqd qqdVar, cb0 cb0Var) {
        this.c = fxqVar;
        this.b = i;
        this.d = cb0Var;
    }
}
