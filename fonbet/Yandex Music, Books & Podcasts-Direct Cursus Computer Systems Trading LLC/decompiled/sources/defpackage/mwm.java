package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mwm extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ tek l;
    public rjc m;
    public zw n;
    public sw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwm(tek tekVar, Continuation continuation) {
        super(continuation);
        this.l = tekVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
