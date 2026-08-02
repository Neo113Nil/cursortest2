package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fl extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(gl glVar, Continuation continuation) {
        super(continuation);
        this.l = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
