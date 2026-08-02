package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class vlc extends cg6 {
    public wlc j;
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ wlc m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlc(wlc wlcVar, Continuation continuation) {
        super(continuation);
        this.m = wlcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
