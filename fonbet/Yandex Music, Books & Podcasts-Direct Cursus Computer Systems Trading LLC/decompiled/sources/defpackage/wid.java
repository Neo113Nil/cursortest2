package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class wid extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t58 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wid(t58 t58Var, Continuation continuation) {
        super(continuation);
        this.k = t58Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
