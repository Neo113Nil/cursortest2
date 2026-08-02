package app.cash.local.views.wallet;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TabContentViewKt$clickableWithRippleOnClick$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PressInteraction.Press $press;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableInteractionSourceImpl $rippleInteractionSource;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabContentViewKt$clickableWithRippleOnClick$2$1$1(PressInteraction.Press press, MutableInteractionSourceImpl mutableInteractionSourceImpl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$press = press;
        this.$rippleInteractionSource = mutableInteractionSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PressInteraction.Press press = this.$press;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$rippleInteractionSource;
        switch (i) {
            case 0:
                return new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, press, continuation, 0);
            case 1:
                return new TabContentViewKt$clickableWithRippleOnClick$2$1$1(press, mutableInteractionSourceImpl, continuation);
            case 2:
                return new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, press, continuation, 2);
            default:
                return new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, press, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TabContentViewKt$clickableWithRippleOnClick$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        if (r2.emit(r9, r8) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r2.emit(r1, r8) == r0) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PressInteraction.Press press = this.$press;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$rippleInteractionSource;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                PressInteraction.Release release = new PressInteraction.Release(press);
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(release2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(press, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(press, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabContentViewKt$clickableWithRippleOnClick$2$1$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, PressInteraction.Press press, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$rippleInteractionSource = mutableInteractionSourceImpl;
        this.$press = press;
    }
}
