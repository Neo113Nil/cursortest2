package yads;

import defpackage.gg81;
import defpackage.q881;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class od1 extends ContinuationImpl {
    public gg81 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q881 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(q881 q881Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = q881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
