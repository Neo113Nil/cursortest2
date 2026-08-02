package ru.rt.ebs.cryptosdk.core.verification.ebs.controllers;

import defpackage.yin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class g extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ yin b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yin yinVar, Continuation continuation) {
        super(continuation);
        this.b = yinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.fetchPhotoHandler(this);
    }
}
