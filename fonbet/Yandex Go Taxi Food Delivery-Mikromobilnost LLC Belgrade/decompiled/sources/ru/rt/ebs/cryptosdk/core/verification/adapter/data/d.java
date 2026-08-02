package ru.rt.ebs.cryptosdk.core.verification.adapter.data;

import defpackage.z70;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class d extends ContinuationImpl {
    public z70 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z70 z70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = z70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, this);
    }
}
