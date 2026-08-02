package ru.rt.ebs.cryptosdk.core.instructions.data;

import defpackage.p4w;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ p4w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p4w p4wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = p4wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
