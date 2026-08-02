package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class x78 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ t58 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x78(t58 t58Var, Continuation continuation) {
        super(continuation);
        this.l = t58Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
