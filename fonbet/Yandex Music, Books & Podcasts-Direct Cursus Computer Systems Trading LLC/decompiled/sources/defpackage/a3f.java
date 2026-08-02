package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a3f extends zt3 {
    public final h3f i;

    public a3f(Continuation continuation, h3f h3fVar) {
        super(1, continuation);
        this.i = h3fVar;
    }

    @Override // defpackage.zt3
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // defpackage.zt3
    public final Throwable p(h3f h3fVar) {
        Throwable c;
        h3f h3fVar2 = this.i;
        h3fVar2.getClass();
        Object obj = h3f.a.get(h3fVar2);
        return (!(obj instanceof c3f) || (c = ((c3f) obj).c()) == null) ? obj instanceof sm5 ? ((sm5) obj).a : h3fVar.D() : c;
    }
}
