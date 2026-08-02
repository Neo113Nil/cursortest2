package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.o871;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class f extends ContinuationImpl {
    public o871 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o871 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o871 o871Var, Continuation continuation) {
        super(continuation);
        this.c = o871Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
