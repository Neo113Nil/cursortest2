package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x1c extends cg6 {
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public oqi o;
    public /* synthetic */ Object p;
    public final /* synthetic */ y1c q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1c(y1c y1cVar, Continuation continuation) {
        super(continuation);
        this.q = y1cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(false, false, this);
    }
}
