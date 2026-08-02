package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m57 extends cg6 {
    public k57 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k57 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m57(k57 k57Var, Continuation continuation) {
        super(continuation);
        this.l = k57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
