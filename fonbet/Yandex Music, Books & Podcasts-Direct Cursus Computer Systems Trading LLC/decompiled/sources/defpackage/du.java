package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class du extends cg6 {
    public String j;
    public HashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(mu muVar, Continuation continuation) {
        super(continuation);
        this.m = muVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return mu.b(this.m, null, this);
    }
}
