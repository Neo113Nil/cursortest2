package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vhw extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ uhw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhw(uhw uhwVar, Continuation continuation) {
        super(continuation);
        this.l = uhwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
