package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class v4s extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ w4s l;
    public Object m;
    public rjc n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4s(w4s w4sVar, Continuation continuation) {
        super(continuation);
        this.l = w4sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
