package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class f6c extends cg6 {
    public List j;
    public g6c k;
    public xdr l;
    public /* synthetic */ Object m;
    public final /* synthetic */ e6c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6c(e6c e6cVar, Continuation continuation) {
        super(continuation);
        this.n = e6cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
