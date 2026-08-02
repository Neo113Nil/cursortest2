package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zkc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ alc l;
    public Object m;
    public rjc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkc(alc alcVar, Continuation continuation) {
        super(continuation);
        this.l = alcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
