package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t0b extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ t58 l;
    public Object m;
    public rjc n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0b(t58 t58Var, Continuation continuation) {
        super(continuation);
        this.l = t58Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
