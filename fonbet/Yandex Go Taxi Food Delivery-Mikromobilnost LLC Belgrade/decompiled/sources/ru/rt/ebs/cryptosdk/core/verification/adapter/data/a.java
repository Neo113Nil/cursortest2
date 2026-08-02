package ru.rt.ebs.cryptosdk.core.verification.adapter.data;

import defpackage.z70;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public z70 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z70 z70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = z70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
