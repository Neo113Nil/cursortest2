package ru.rt.ebs.cryptosdk.core.verification.consumer.data;

import defpackage.m9e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ m9e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m9e m9eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = m9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
