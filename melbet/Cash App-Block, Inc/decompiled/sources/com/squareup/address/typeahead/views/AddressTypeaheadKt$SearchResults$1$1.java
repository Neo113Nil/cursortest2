package com.squareup.address.typeahead.views;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AddressTypeaheadKt$SearchResults$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BringIntoViewRequesterImpl $firstResultViewRequester;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressTypeaheadKt$SearchResults$1$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$firstResultViewRequester = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AddressTypeaheadKt$SearchResults$1$1(this.$firstResultViewRequester, continuation, 0);
            default:
                return new AddressTypeaheadKt$SearchResults$1$1(this.$firstResultViewRequester, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AddressTypeaheadKt$SearchResults$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bringIntoView;
        Object bringIntoView2;
        int i = this.$r8$classId;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl = this.$firstResultViewRequester;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    bringIntoView = bringIntoViewRequesterImpl.bringIntoView(null, this);
                    if (bringIntoView == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    bringIntoView2 = bringIntoViewRequesterImpl.bringIntoView(null, this);
                    if (bringIntoView2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
