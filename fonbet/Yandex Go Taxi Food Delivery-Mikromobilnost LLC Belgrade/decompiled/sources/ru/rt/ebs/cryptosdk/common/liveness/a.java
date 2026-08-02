package ru.rt.ebs.cryptosdk.common.liveness;

import defpackage.pn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public pn7 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pn7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pn7 pn7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pn7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0, this);
    }
}
