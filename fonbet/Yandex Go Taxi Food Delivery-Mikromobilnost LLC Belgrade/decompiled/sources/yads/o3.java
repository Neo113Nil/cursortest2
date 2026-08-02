package yads;

import android.view.View;
import defpackage.b181;
import defpackage.fj71;
import defpackage.mk81;
import defpackage.vw81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class o3 extends ContinuationImpl {
    public View b;
    public fj71 c;
    public vw81 d;
    public mk81 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b181 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(b181 b181Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = b181Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, null, null, this);
    }
}
