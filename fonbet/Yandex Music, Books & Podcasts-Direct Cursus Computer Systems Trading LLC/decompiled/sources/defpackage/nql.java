package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class nql extends cg6 {
    public hql j;
    public /* synthetic */ Object k;
    public final /* synthetic */ grl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nql(grl grlVar, Continuation continuation) {
        super(continuation);
        this.l = grlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return grl.a(this.l, null, this);
    }
}
