package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vs extends cg6 {
    public vhn j;
    public Boolean k;
    public Boolean l;
    public Integer m;
    public /* synthetic */ Object n;
    public final /* synthetic */ et o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(et etVar, Continuation continuation) {
        super(continuation);
        this.o = etVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, null, null, null, null, this);
    }
}
