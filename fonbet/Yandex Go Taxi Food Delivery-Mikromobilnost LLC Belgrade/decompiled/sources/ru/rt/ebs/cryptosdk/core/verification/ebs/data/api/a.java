package ru.rt.ebs.cryptosdk.core.verification.ebs.data.api;

import defpackage.xin;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ xin b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xin xinVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = xinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.Ug(null, null, null, null, this);
    }
}
