package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class kfl extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ ta3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfl(ta3 ta3Var, Continuation continuation) {
        super(continuation);
        this.l = ta3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
