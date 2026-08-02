package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class usw extends cg6 {
    public vkw j;
    public gfw k;
    public fmw l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vsw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usw(vsw vswVar, Continuation continuation) {
        super(continuation);
        this.o = vswVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
