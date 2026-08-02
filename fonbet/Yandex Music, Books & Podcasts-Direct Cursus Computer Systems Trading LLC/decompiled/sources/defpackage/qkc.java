package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class qkc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ fs l;
    public fs m;
    public rjc n;
    public int o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc(fs fsVar, Continuation continuation) {
        super(continuation);
        this.l = fsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
