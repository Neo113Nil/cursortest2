package com.squareup.cash.money.views;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabUIKt$MoneyTabLoaded$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$2$1(LazyListState lazyListState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LazyListState lazyListState = this.$listState;
        switch (i) {
            case 0:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 0);
            case 1:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 1);
            case 2:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 2);
            case 3:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 3);
            case 4:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 4);
            case 5:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 5);
            default:
                return new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneyTabUIKt$MoneyTabLoaded$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        LazyListState lazyListState = this.$listState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                    if (lazyListState.animateScrollToItem(0, 0, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int intValue = lazyListState.scrollPosition.index$delegate.getIntValue() + 1;
                        this.label = 1;
                        if (lazyListState.animateScrollToItem(intValue, 0, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (IllegalArgumentException unused) {
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int intValue2 = lazyListState.scrollPosition.index$delegate.getIntValue() - 1;
                        this.label = 1;
                        if (lazyListState.animateScrollToItem(intValue2, 0, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (IllegalArgumentException unused2) {
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    WorkLauncherImpl workLauncherImpl2 = LazyListState.Saver;
                    if (lazyListState.scrollToItem(0, 0, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    WorkLauncherImpl workLauncherImpl3 = LazyListState.Saver;
                    if (lazyListState.scrollToItem(0, 0, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (lazyListState != null) {
                        this.label = 1;
                        if (CardViewApi21Impl.access$scrollToBottom(lazyListState, true, this) == coroutineSingletons6) {
                            break;
                        }
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    WorkLauncherImpl workLauncherImpl4 = LazyListState.Saver;
                    if (lazyListState.animateScrollToItem(1, 0, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i8 != 1) {
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
