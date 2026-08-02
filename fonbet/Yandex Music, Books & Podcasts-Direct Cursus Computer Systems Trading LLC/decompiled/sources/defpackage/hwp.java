package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class hwp extends cg6 {
    public zwp j;
    public File k;
    public /* synthetic */ Object l;
    public final /* synthetic */ owp m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwp(owp owpVar, Continuation continuation) {
        super(continuation);
        this.m = owpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, null, this);
    }
}
