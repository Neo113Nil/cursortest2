package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class flc extends cg6 {
    public u3 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flc(u3 u3Var, Continuation continuation) {
        super(continuation);
        this.l = u3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
