package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vcw extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ rcw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcw(rcw rcwVar, Continuation continuation) {
        super(continuation);
        this.l = rcwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
