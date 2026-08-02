package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class wpg {
    public final r0 a = bvf0.c(zv11.b);

    public final f3u0 a() {
        return (f3u0) this.a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r6.a > ((defpackage.qng) r2).a) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(f3u0 f3u0Var) {
        r0 r0Var;
        Object value;
        f3u0 f3u0Var2;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            f3u0Var2 = (f3u0) value;
            if (!(f3u0Var2 instanceof nbi0) && !jl40.l(f3u0Var2, zv11.b)) {
                if (!(f3u0Var2 instanceof qng)) {
                    if (!(f3u0Var2 instanceof g6r)) {
                        if (f3u0Var2 instanceof pd60) {
                            ny61.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return;
                        } else {
                            w511.b();
                            return;
                        }
                    }
                }
            }
            f3u0Var2 = f3u0Var;
        } while (!r0Var.k(value, f3u0Var2));
    }
}
