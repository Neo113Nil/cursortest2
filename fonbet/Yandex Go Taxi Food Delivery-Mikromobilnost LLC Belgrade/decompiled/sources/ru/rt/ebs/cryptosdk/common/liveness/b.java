package ru.rt.ebs.cryptosdk.common.liveness;

import defpackage.pn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class b extends ContinuationImpl {
    public pn7 a;
    public pn7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pn7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pn7 pn7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pn7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
