package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;

/* compiled from: WideNavigationRail.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1", "Landroidx/compose/foundation/gestures/FlingBehavior;", "performFling", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 implements FlingBehavior {
    final /* synthetic */ TargetedFlingBehavior $anchoredDraggableFlingBehavior;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $modalAnimateToDismiss;

    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1(TargetedFlingBehavior targetedFlingBehavior, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        this.$anchoredDraggableFlingBehavior = targetedFlingBehavior;
        this.$modalAnimateToDismiss = function1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(1:20))(3:26|27|(2:29|24))|21|22))|34|6|7|(0)(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8.invoke(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r8 = r6.$modalAnimateToDismiss;
        r0.L$0 = r7;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r8.invoke(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(ScrollScope scrollScope, float f, Continuation<? super Float> continuation) {
        WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1;
        int i;
        float floatValue;
        if (continuation instanceof WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1) {
            wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 = (WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1) continuation;
            if ((wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label & Integer.MIN_VALUE) != 0) {
                wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label -= Integer.MIN_VALUE;
                Object obj = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TargetedFlingBehavior targetedFlingBehavior = this.$anchoredDraggableFlingBehavior;
                    wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label = 1;
                    obj = targetedFlingBehavior.performFling(scrollScope, f, wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            floatValue = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.F$0;
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxFloat(floatValue);
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                floatValue = ((Number) obj).floatValue();
                Function1<Continuation<? super Unit>, Object> function1 = this.$modalAnimateToDismiss;
                wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.F$0 = floatValue;
                wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label = 2;
            }
        }
        wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1 = new WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1(this, continuation);
        Object obj2 = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label;
        if (i != 0) {
        }
        floatValue = ((Number) obj2).floatValue();
        Function1<Continuation<? super Unit>, Object> function12 = this.$modalAnimateToDismiss;
        wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.F$0 = floatValue;
        wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1$performFling$1.label = 2;
    }
}
