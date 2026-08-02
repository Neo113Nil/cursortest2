package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class f8n extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g8n k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8n(g8n g8nVar, Continuation continuation) {
        super(continuation);
        this.k = g8nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, this);
    }
}
