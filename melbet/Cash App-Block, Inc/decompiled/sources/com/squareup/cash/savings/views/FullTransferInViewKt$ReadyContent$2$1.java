package com.squareup.cash.savings.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class FullTransferInViewKt$ReadyContent$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountDisplayState $amountDisplayState;
    public final /* synthetic */ MutableState $manuallyModified$delegate;
    public final /* synthetic */ AmountPickerViewModel.Ready $model;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullTransferInViewKt$ReadyContent$2$1(AmountPickerViewModel.Ready ready, AmountDisplayState amountDisplayState, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = ready;
        this.$amountDisplayState = amountDisplayState;
        this.$manuallyModified$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FullTransferInViewKt$ReadyContent$2$1(this.$model, this.$amountDisplayState, this.$manuallyModified$delegate, continuation, 0);
            case 1:
                return new FullTransferInViewKt$ReadyContent$2$1(this.$model, this.$amountDisplayState, this.$manuallyModified$delegate, continuation, 1);
            case 2:
                return new FullTransferInViewKt$ReadyContent$2$1(this.$model, this.$amountDisplayState, this.$manuallyModified$delegate, continuation, 2);
            default:
                return new FullTransferInViewKt$ReadyContent$2$1(this.$model, this.$amountDisplayState, this.$manuallyModified$delegate, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FullTransferInViewKt$ReadyContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Function1 function1;
        int i = this.$r8$classId;
        AmountPickerViewModel.Ready ready = this.$model;
        MutableState mutableState = this.$manuallyModified$delegate;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    String str2 = ready.presetAmount;
                    str = str2 != null ? str2 : "0";
                    if (!amountDisplayState.getRawAmount().equals(str)) {
                        function1 = amountDisplayState.onEvent;
                        amountDisplayState.onEvent = null;
                        try {
                            AmountDisplayState.reset$default(amountDisplayState, str, 2);
                        } finally {
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    String str3 = ready.presetAmount;
                    str = str3 != null ? str3 : "0";
                    if (!amountDisplayState.getRawAmount().equals(str)) {
                        function1 = amountDisplayState.onEvent;
                        amountDisplayState.onEvent = null;
                        try {
                            AmountDisplayState.reset$default(amountDisplayState, str, 2);
                        } finally {
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    String str4 = ready.presetAmount;
                    str = str4 != null ? str4 : "0";
                    if (!amountDisplayState.getRawAmount().equals(str)) {
                        function1 = amountDisplayState.onEvent;
                        amountDisplayState.onEvent = null;
                        try {
                            AmountDisplayState.reset$default(amountDisplayState, str, 2);
                        } finally {
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    String str5 = ready.presetAmount;
                    str = str5 != null ? str5 : "0";
                    if (!amountDisplayState.getRawAmount().equals(str)) {
                        function1 = amountDisplayState.onEvent;
                        amountDisplayState.onEvent = null;
                        try {
                            AmountDisplayState.reset$default(amountDisplayState, str, 2);
                        } finally {
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
