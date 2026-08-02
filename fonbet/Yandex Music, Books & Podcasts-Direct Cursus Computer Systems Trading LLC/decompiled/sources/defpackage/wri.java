package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class wri extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ roh l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wri(roh rohVar, Continuation continuation) {
        super(continuation);
        this.l = rohVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
