package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $homeSessionId$delegate;
    public final /* synthetic */ LifecycleOwner $presenterLifecycleOwner;
    public int I$0;
    public /* synthetic */ Object L$0;
    public MoneybotHomePresenter L$1;
    public String L$2;
    public int label;
    public final /* synthetic */ MoneybotHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotHomePresenter$models$2$1(MutableState mutableState, LifecycleOwner lifecycleOwner, MoneybotHomePresenter moneybotHomePresenter, Continuation continuation) {
        super(2, continuation);
        this.$homeSessionId$delegate = mutableState;
        this.$presenterLifecycleOwner = lifecycleOwner;
        this.this$0 = moneybotHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MoneybotHomePresenter$models$2$1 moneybotHomePresenter$models$2$1 = new MoneybotHomePresenter$models$2$1(this.$homeSessionId$delegate, this.$presenterLifecycleOwner, this.this$0, continuation);
        moneybotHomePresenter$models$2$1.L$0 = obj;
        return moneybotHomePresenter$models$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoneybotHomePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (com.squareup.cash.moneybot.presenters.MoneybotHomePresenter.access$loadContent(r6, r0, r4, r8) != r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        MoneybotHomePresenter moneybotHomePresenter;
        int i;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            String str2 = (String) this.$homeSessionId$delegate.getValue();
            if (str2 != null) {
                MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.$presenterLifecycleOwner.getLifecycle().getCurrentStateFlow(), 9);
                this.L$0 = coroutineScope;
                MoneybotHomePresenter moneybotHomePresenter2 = this.this$0;
                this.L$1 = moneybotHomePresenter2;
                this.L$2 = str2;
                this.I$0 = 0;
                this.label = 1;
                if (FlowKt.first(moneyTabPresenter$models$lambda$31$$inlined$map$1, this) != coroutineSingletons) {
                    str = str2;
                    moneybotHomePresenter = moneybotHomePresenter2;
                    i = 0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        i = this.I$0;
        str = this.L$2;
        moneybotHomePresenter = this.L$1;
        SafeTrace.throwOnFailure(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.I$0 = i;
        this.label = 2;
    }
}
