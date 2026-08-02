package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g7i extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ q6i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7i(q6i q6iVar, Continuation continuation) {
        super(continuation);
        this.l = q6iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
