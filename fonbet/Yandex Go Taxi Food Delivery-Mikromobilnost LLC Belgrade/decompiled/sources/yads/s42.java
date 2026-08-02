package yads;

import defpackage.tk81;
import defpackage.z081;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class s42 extends ContinuationImpl {
    public boolean b;
    public Object c;
    public z081 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tk81 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s42(tk81 tk81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = tk81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(false, null, null, null, this);
    }
}
