package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dom {
    public final rs6 a;
    public boolean b;
    public boolean c;

    public dom(String str, rs6 rs6Var) {
        this.a = rs6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ipt] */
    public final void a(qnm qnmVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Continuation continuation = null;
        if (qnmVar != null) {
            xgp a = dhp.a(new zqc(qnmVar, continuation, 4));
            continuation = (ipt) (a.hasNext() ? a.next() : null);
        }
        this.b = continuation != null;
        this.a.invoke();
    }
}
