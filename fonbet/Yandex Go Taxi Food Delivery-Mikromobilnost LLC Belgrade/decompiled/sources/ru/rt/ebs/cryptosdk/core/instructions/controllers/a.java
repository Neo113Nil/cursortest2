package ru.rt.ebs.cryptosdk.core.instructions.controllers;

import defpackage.m4w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ m4w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m4w m4wVar, Continuation continuation) {
        super(continuation);
        this.b = m4wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.updateInstructionsMetadata(this);
    }
}
