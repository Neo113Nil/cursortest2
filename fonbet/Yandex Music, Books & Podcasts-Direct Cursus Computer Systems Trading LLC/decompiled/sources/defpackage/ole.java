package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ole extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ o0b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ole(o0b o0bVar, Continuation continuation) {
        super(continuation);
        this.l = o0bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
