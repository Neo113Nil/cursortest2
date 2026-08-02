package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.bjn;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ CustomizableHeader b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CustomizableHeader customizableHeader, Continuation continuation) {
        super(2, continuation);
        this.b = customizableHeader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bjn bjnVar;
        bjn bjnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            bjnVar = this.b.viewBinding;
            bjnVar.b.setImageAlpha(128);
            this.a = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        bjnVar2 = this.b.viewBinding;
        bjnVar2.b.setImageAlpha(255);
        return zy11.a;
    }
}
