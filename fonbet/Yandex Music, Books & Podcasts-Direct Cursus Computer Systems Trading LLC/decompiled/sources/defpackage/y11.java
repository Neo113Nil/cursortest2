package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y11 extends cg6 {
    public List j;
    public f21 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y11(gl glVar, Continuation continuation) {
        super(continuation);
        this.m = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
