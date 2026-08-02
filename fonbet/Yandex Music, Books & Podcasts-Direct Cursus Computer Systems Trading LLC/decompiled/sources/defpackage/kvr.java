package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kvr extends cg6 {
    public hyl j;
    public Map k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hyl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvr(hyl hylVar, Continuation continuation) {
        super(continuation);
        this.m = hylVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
