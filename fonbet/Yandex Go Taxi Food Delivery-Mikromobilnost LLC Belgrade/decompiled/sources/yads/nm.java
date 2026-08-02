package yads;

import defpackage.dj81;
import defpackage.e971;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class nm extends ContinuationImpl {
    public e971 b;
    public f5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dj81 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(dj81 dj81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = dj81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
