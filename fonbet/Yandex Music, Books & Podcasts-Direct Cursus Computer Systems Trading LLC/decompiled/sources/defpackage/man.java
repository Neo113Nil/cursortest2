package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class man extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ x1n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public man(x1n x1nVar, Continuation continuation) {
        super(continuation);
        this.l = x1nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
