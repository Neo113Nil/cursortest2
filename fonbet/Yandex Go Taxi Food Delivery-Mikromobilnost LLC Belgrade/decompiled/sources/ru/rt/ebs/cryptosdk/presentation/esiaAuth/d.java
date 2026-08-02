package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import defpackage.u271;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class d extends ContinuationImpl {
    public u271 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u271 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u271 u271Var, Continuation continuation) {
        super(continuation);
        this.c = u271Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
