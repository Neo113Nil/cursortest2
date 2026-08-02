package yads;

import defpackage.pp81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class vl0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ pp81 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(pp81 pp81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pp81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
