package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class kkm extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ hyl l;
    public rjc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkm(hyl hylVar, Continuation continuation) {
        super(continuation);
        this.l = hylVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
