package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dnw extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ azu l;
    public rjc m;
    public jcw n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnw(azu azuVar, Continuation continuation) {
        super(continuation);
        this.l = azuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
