package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ctj extends cg6 {
    public dtj j;
    public Iterator k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dtj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctj(dtj dtjVar, Continuation continuation) {
        super(continuation);
        this.m = dtjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return dtj.a(this.m, null, this);
    }
}
