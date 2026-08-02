package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t24 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ u3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t24(u3 u3Var, Continuation continuation) {
        super(continuation);
        this.l = u3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
