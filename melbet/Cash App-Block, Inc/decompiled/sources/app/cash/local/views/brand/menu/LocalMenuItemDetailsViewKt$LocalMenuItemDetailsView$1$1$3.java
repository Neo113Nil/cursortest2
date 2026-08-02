package app.cash.local.views.brand.menu;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ScrollState $bodyScrollState;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $scrollToErrorConsumed$delegate;
    public /* synthetic */ long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3(ScrollState scrollState, Function1 function1, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$bodyScrollState = scrollState;
        this.$onEvent = function1;
        this.$scrollToErrorConsumed$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3(this.$bodyScrollState, this.$onEvent, this.$scrollToErrorConsumed$delegate, continuation, 0);
                localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3.J$0 = ((Offset) obj).packedValue;
                return localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3;
            default:
                LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3(this.$bodyScrollState, this.$onEvent, this.$scrollToErrorConsumed$delegate, continuation, 1);
                localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32.J$0 = ((Offset) obj).packedValue;
                return localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Offset offset = (Offset) obj;
        switch (this.$r8$classId) {
            case 0:
                long j = offset.packedValue;
                MutableState mutableState = this.$scrollToErrorConsumed$delegate;
                LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3(this.$bodyScrollState, this.$onEvent, mutableState, (Continuation) obj2, 0);
                localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3.J$0 = j;
                return localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3.invokeSuspend(Unit.INSTANCE);
            default:
                long j2 = offset.packedValue;
                MutableState mutableState2 = this.$scrollToErrorConsumed$delegate;
                LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3(this.$bodyScrollState, this.$onEvent, mutableState2, (Continuation) obj2, 1);
                localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32.J$0 = j2;
                return localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$32.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        ScrollState scrollState = this.$bodyScrollState;
        MutableState mutableState = this.$scrollToErrorConsumed$delegate;
        long j = this.J$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    int intBitsToFloat = (int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j));
                    this.J$0 = j;
                    this.label = 1;
                    if (ScrollState.animateScrollTo$default(scrollState, intBitsToFloat, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                function1.invoke(LocalMenuItemDetailsViewEvent.MissingSelections.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j));
                    this.J$0 = j;
                    this.label = 1;
                    if (ScrollState.animateScrollTo$default(scrollState, intBitsToFloat2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                function1.invoke(LocalMenuComboDetailsViewEvent.MissingSlotSelections.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
