package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u5q {
    public final Context a;
    public final pre b;
    public final jyr c = btf.b(new o5q(this, 0));
    public final jyr d = btf.b(new o5q(this, 1));
    public final jyr e = btf.b(new o5q(this, 2));
    public final jyr f = btf.b(new o5q(this, 3));
    public final jyr g = btf.b(new o5q(this, 4));

    public u5q(Context context, pre preVar) {
        this.a = context;
        this.b = preVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iy1 iy1Var, x0q x0qVar, es6 es6Var, j6q j6qVar, j0l j0lVar, jf2 jf2Var, cg6 cg6Var) {
        s5q s5qVar;
        int i;
        es6 es6Var2;
        j6q j6qVar2;
        if (cg6Var instanceof s5q) {
            s5qVar = (s5q) cg6Var;
            int i2 = s5qVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s5qVar.n = i2 - Integer.MIN_VALUE;
                Object obj = s5qVar.l;
                nm6 nm6Var = nm6.a;
                i = s5qVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    u6q b = b();
                    s5qVar.j = es6Var;
                    s5qVar.k = j6qVar;
                    s5qVar.n = 1;
                    b.getClass();
                    obj = x97.V(mal.b(), new oh3(b, x0qVar, jf2Var, j0lVar, iy1Var, null, 8), s5qVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    es6Var2 = es6Var;
                    j6qVar2 = j6qVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6qVar2 = s5qVar.k;
                    es6Var2 = s5qVar.j;
                    qgg.h0(obj);
                }
                return new n5q((a7q) obj, es6Var2, j6qVar2, new knn(7, this));
            }
        }
        s5qVar = new s5q(this, cg6Var);
        Object obj2 = s5qVar.l;
        nm6 nm6Var2 = nm6.a;
        i = s5qVar.n;
        if (i != 0) {
        }
        return new n5q((a7q) obj2, es6Var2, j6qVar2, new knn(7, this));
    }

    public final u6q b() {
        return (u6q) this.c.getValue();
    }
}
