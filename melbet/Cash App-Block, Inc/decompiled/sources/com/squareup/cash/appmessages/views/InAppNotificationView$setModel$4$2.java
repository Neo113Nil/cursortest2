package com.squareup.cash.appmessages.views;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.scroll.BitcoinHomeScrollViewEvent;
import java.time.YearMonth;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final /* synthetic */ class InAppNotificationView$setModel$4$2 implements FlowCollector, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 $tmp0;

    public /* synthetic */ InAppNotificationView$setModel$4$2(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$tmp0 = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$tmp0;
        switch (i) {
            case 0:
                function1.invoke((AppMessageViewEvent) obj);
                Unit unit = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit;
            case 1:
                function1.invoke((BitcoinHomeScrollViewEvent) obj);
                Unit unit2 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit2;
            default:
                function1.invoke((YearMonth) obj);
                Unit unit3 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit3;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
            case 0:
                return new AdaptedFunctionReference(2, 12, Function1.class, this.$tmp0, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;");
            case 1:
                return new FunctionReferenceImpl(2, 0, ArrayIteratorKt.class, this.$tmp0, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/squareup/cash/bitcoin/viewmodels/applet/scroll/BitcoinHomeScrollViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new FunctionReferenceImpl(2, 0, ArrayIteratorKt.class, this.$tmp0, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/time/YearMonth;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }
}
