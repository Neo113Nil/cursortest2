package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v4u extends cg6 {
    public String j;
    public HashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c5u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4u(c5u c5uVar, Continuation continuation) {
        super(continuation);
        this.m = c5uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return c5u.b(this.m, null, this);
    }
}
