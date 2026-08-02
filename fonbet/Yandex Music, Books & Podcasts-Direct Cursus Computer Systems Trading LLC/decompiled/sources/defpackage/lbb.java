package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class lbb extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ hbb l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbb(hbb hbbVar, Continuation continuation) {
        super(continuation);
        this.l = hbbVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
