package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class a1o implements n76 {
    public final fmq a;
    public final /* synthetic */ b1o b;

    public a1o(b1o b1oVar, fmq fmqVar) {
        this.b = b1oVar;
        this.a = fmqVar;
    }

    @Override // defpackage.n76
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                fmq fmqVar = this.a;
                Iterator it = xut.e((Set) fmqVar.c).iterator();
                while (it.hasNext()) {
                    e0o e0oVar = (e0o) it.next();
                    if (!e0oVar.e() && !e0oVar.d()) {
                        e0oVar.clear();
                        if (fmqVar.b) {
                            ((HashSet) fmqVar.d).add(e0oVar);
                        } else {
                            e0oVar.k();
                        }
                    }
                }
            }
        }
    }
}
