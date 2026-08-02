package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class mbn extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ nbn l;
    public Object m;
    public rjc n;
    public sbn o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbn(nbn nbnVar, Continuation continuation) {
        super(continuation);
        this.l = nbnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
