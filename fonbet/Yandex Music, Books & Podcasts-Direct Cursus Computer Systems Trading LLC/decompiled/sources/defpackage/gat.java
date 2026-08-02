package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gat extends cg6 {
    public int[] j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gat(pm pmVar, Continuation continuation) {
        super(continuation);
        this.l = pmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
