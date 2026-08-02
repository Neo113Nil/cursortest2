package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l6i extends cg6 {
    public af5 j;
    public gcc k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lrf o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6i(lrf lrfVar, Continuation continuation) {
        super(continuation);
        this.o = lrfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
