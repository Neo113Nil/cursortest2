package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class if3 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ g62 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if3(g62 g62Var, Continuation continuation) {
        super(continuation);
        this.l = g62Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
