package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.BaseVerificationFlow", f = "BaseVerificationFlow.kt", l = {43}, m = "getValue$suspendImpl")
/* loaded from: classes4.dex */
final class BaseVerificationFlow$getValue$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationFlow$getValue$1(a aVar, Continuation continuation) {
        super(continuation);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return a.b(this.b, null, this);
    }
}
