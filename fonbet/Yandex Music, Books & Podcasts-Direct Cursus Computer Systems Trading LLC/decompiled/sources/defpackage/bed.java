package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class bed extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ced l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bed(ced cedVar, Continuation continuation) {
        super(continuation);
        this.l = cedVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.H(null, null, null, this);
    }
}
