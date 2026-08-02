package yads;

import defpackage.k371;
import defpackage.wr81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class db0 extends ContinuationImpl {
    public wr81 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k371 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(k371 k371Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = k371Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
