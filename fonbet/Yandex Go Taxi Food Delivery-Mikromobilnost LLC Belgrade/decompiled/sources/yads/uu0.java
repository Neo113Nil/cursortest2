package yads;

import defpackage.aw81;
import defpackage.ud71;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class uu0 extends ContinuationImpl {
    public ud71 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aw81 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(aw81 aw81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aw81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
