package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ntn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntn(s3 s3Var, Continuation continuation) {
        super(continuation);
        this.k = s3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
