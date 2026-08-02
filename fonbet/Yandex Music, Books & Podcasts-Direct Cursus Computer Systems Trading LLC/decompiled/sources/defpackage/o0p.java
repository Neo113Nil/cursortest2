package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class o0p extends cg6 {
    public boolean j;
    public Function2 k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lum o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0p(lum lumVar, Continuation continuation) {
        super(continuation);
        this.o = lumVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e0(false, null, this);
    }
}
