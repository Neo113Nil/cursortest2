package yads;

import android.content.Context;
import defpackage.f971;
import defpackage.tg81;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class f62 extends ContinuationImpl {
    public Context b;
    public tg81 c;
    public Object d;
    public f5 e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ f971 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f62(f971 f971Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = f971Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
