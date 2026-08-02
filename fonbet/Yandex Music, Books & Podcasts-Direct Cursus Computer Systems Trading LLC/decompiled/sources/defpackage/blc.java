package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class blc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ clc l;
    public clc m;
    public rjc n;
    public xmo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blc(clc clcVar, Continuation continuation) {
        super(continuation);
        this.l = clcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
