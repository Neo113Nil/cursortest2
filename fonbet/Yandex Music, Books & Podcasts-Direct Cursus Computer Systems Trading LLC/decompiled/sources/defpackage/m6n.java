package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class m6n extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ tek l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6n(tek tekVar, Continuation continuation) {
        super(continuation);
        this.l = tekVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
