package yads;

import defpackage.e471;
import defpackage.e971;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class aj0 extends ContinuationImpl {
    public e971 b;
    public f5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e471 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(e471 e471Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = e471Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
