package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class knr implements rjc {
    public final rjc a;
    public final aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public knr(rjc rjcVar, Function2 function2) {
        this.a = rjcVar;
        this.b = (aur) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (((defpackage.knr) r7).b(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cg6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aur, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        jnr jnrVar;
        ?? r2;
        xmo xmoVar;
        knr knrVar;
        try {
            if (cg6Var instanceof jnr) {
                jnrVar = (jnr) cg6Var;
                int i = jnrVar.n;
                if ((i & Integer.MIN_VALUE) != 0) {
                    jnrVar.n = i - Integer.MIN_VALUE;
                    Object obj = jnrVar.l;
                    nm6 nm6Var = nm6.a;
                    r2 = jnrVar.n;
                    if (r2 != 0) {
                        qgg.h0(obj);
                        xmoVar = new xmo(this.a, jnrVar.getContext());
                        ?? r7 = this.b;
                        jnrVar.j = this;
                        jnrVar.k = xmoVar;
                        jnrVar.n = 1;
                        if (r7.invoke(xmoVar, jnrVar) != nm6Var) {
                            knrVar = this;
                        }
                        return nm6Var;
                    }
                    if (r2 != 1) {
                        if (r2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xmoVar = jnrVar.k;
                    knrVar = jnrVar.j;
                    qgg.h0(obj);
                    xmoVar.releaseIntercepted();
                    rjc rjcVar = knrVar.a;
                    r2 = rjcVar instanceof knr;
                    if (r2 != 0) {
                        return Unit.a;
                    }
                    jnrVar.j = null;
                    jnrVar.k = null;
                    jnrVar.n = 2;
                }
            }
            if (r2 != 0) {
            }
            xmoVar.releaseIntercepted();
            rjc rjcVar2 = knrVar.a;
            r2 = rjcVar2 instanceof knr;
            if (r2 != 0) {
            }
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        jnrVar = new jnr(this, cg6Var);
        Object obj2 = jnrVar.l;
        nm6 nm6Var2 = nm6.a;
        r2 = jnrVar.n;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        return this.a.emit(obj, continuation);
    }
}
