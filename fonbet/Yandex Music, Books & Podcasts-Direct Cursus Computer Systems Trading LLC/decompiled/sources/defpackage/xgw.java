package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class xgw extends cg6 {
    public String j;
    public Function2 k;
    public long l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ghw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgw(ghw ghwVar, Continuation continuation) {
        super(continuation);
        this.o = ghwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, this);
    }
}
