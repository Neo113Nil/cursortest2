package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c4q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4q(s3 s3Var, Continuation continuation) {
        super(continuation);
        this.k = s3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
