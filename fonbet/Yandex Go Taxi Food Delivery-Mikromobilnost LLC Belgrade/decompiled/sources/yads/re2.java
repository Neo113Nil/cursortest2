package yads;

import android.content.Context;
import defpackage.ms71;
import defpackage.xb81;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class re2 extends ContinuationImpl {
    public Context b;
    public Iterator c;
    public ms71 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xb81 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re2(xb81 xb81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = xb81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
