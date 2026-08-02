package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.ui.widget.amount.AmountLayoutAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $state;
    public /* synthetic */ float F$0;
    public /* synthetic */ CoroutineScope L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableKt$swipeable$3$4$1(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$state = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        float floatValue = ((Number) obj2).floatValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1((DismissState) this.$state, continuation, 0);
                swipeableKt$swipeable$3$4$1.L$0 = coroutineScope;
                swipeableKt$swipeable$3$4$1.F$0 = floatValue;
                return swipeableKt$swipeable$3$4$1.invokeSuspend(Unit.INSTANCE);
            default:
                SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$12 = new SwipeableKt$swipeable$3$4$1((AnchoredDraggableState) this.$state, continuation, 1);
                swipeableKt$swipeable$3$4$12.L$0 = coroutineScope;
                swipeableKt$swipeable$3$4$12.F$0 = floatValue;
                return swipeableKt$swipeable$3$4$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$state;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(this.L$0, null, null, new AnonymousClass1((DismissState) obj2, this.F$0, continuation, 0), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(this.L$0, null, null, new AnonymousClass1((AnchoredDraggableState) obj2, this.F$0, continuation, 1), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $state;
        public /* synthetic */ float $velocity;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, float f, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$state = obj;
            this.$velocity = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$state;
            switch (i) {
                case 0:
                    return new AnonymousClass1((DismissState) obj2, this.$velocity, continuation, 0);
                case 1:
                    return new AnonymousClass1((AnchoredDraggableState) obj2, this.$velocity, continuation, 1);
                case 2:
                    return new AnonymousClass1((PullRefreshState) obj2, this.$velocity, continuation, 2);
                case 3:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((ComposeScrollCaptureCallback) obj2, continuation);
                    anonymousClass1.$velocity = ((Number) obj).floatValue();
                    return anonymousClass1;
                case 4:
                    return new AnonymousClass1((CardNestedScrollExpander) obj2, this.$velocity, continuation, 4);
                default:
                    return new AnonymousClass1((AmountLayoutAnimator) obj2, this.$velocity, continuation, 5);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 3:
                    break;
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = this.$r8$classId;
            Object obj3 = this.$state;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        final DismissState dismissState = (DismissState) obj3;
                        final float f = this.$velocity;
                        this.label = 1;
                        Object collect = dismissState.latestNonEmptyAnchorsFlow.collect(new FlowCollector() { // from class: androidx.compose.material.SwipeableState$performFling$2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj4, Continuation continuation) {
                                Object obj5;
                                int i3;
                                Object obj6;
                                float f2;
                                Map map = (Map) obj4;
                                DismissState dismissState2 = DismissState.this;
                                Float access$getOffset = CardKt.access$getOffset(map, dismissState2.currentValue$delegate.getValue());
                                access$getOffset.getClass();
                                float floatValue = access$getOffset.floatValue();
                                float floatValue2 = ((Number) dismissState2.offsetState.getValue()).floatValue();
                                Set keySet = map.keySet();
                                Function2 function2 = (Function2) dismissState2.thresholds$delegate.getValue();
                                float floatValue3 = dismissState2.velocityThreshold$delegate.getFloatValue();
                                Set set = keySet;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj7 : set) {
                                    if (((Number) obj7).floatValue() <= floatValue2 + 0.001d) {
                                        arrayList.add(obj7);
                                    }
                                }
                                int i4 = 1;
                                if (arrayList.isEmpty()) {
                                    i3 = 1;
                                    obj5 = null;
                                } else {
                                    obj5 = arrayList.get(0);
                                    float floatValue4 = ((Number) obj5).floatValue();
                                    int size = arrayList.size() - 1;
                                    if (1 <= size) {
                                        int i5 = 1;
                                        while (true) {
                                            Object obj8 = arrayList.get(i5);
                                            i3 = i4;
                                            float floatValue5 = ((Number) obj8).floatValue();
                                            if (Float.compare(floatValue4, floatValue5) < 0) {
                                                floatValue4 = floatValue5;
                                                obj5 = obj8;
                                            }
                                            if (i5 == size) {
                                                break;
                                            }
                                            i5++;
                                            i4 = i3;
                                        }
                                    } else {
                                        i3 = 1;
                                    }
                                }
                                Float f3 = (Float) obj5;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj9 : set) {
                                    if (((Number) obj9).floatValue() >= floatValue2 - 0.001d) {
                                        arrayList2.add(obj9);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    obj6 = null;
                                } else {
                                    Object obj10 = arrayList2.get(0);
                                    float floatValue6 = ((Number) obj10).floatValue();
                                    int size2 = arrayList2.size() - 1;
                                    if (i3 <= size2) {
                                        int i6 = 1;
                                        while (true) {
                                            Object obj11 = arrayList2.get(i6);
                                            float floatValue7 = ((Number) obj11).floatValue();
                                            if (Float.compare(floatValue6, floatValue7) > 0) {
                                                obj10 = obj11;
                                                floatValue6 = floatValue7;
                                            }
                                            if (i6 == size2) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                    obj6 = obj10;
                                }
                                Float f4 = (Float) obj6;
                                List listOfNotNull = f3 == null ? CollectionsKt__CollectionsKt.listOfNotNull(f4) : f4 == null ? CollectionsKt__CollectionsJVMKt.listOf(f3) : Intrinsics.areEqual(f3, f4) ? CollectionsKt__CollectionsJVMKt.listOf(f3) : CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{f3, f4});
                                int size3 = listOfNotNull.size();
                                if (size3 == 0) {
                                    f2 = floatValue;
                                } else if (size3 != 1) {
                                    f2 = ((Number) listOfNotNull.get(0)).floatValue();
                                    float floatValue8 = ((Number) listOfNotNull.get(1)).floatValue();
                                    float f5 = f;
                                    if (floatValue > floatValue2 ? f5 > (-floatValue3) && floatValue2 > ((Number) function2.invoke(Float.valueOf(floatValue8), Float.valueOf(f2))).floatValue() : f5 >= floatValue3 || floatValue2 >= ((Number) function2.invoke(Float.valueOf(f2), Float.valueOf(floatValue8))).floatValue()) {
                                        f2 = floatValue8;
                                    }
                                } else {
                                    f2 = ((Number) listOfNotNull.get(0)).floatValue();
                                }
                                Object obj12 = map.get(new Float(f2));
                                if (obj12 == null || !((Boolean) dismissState2.confirmStateChange.invoke(obj12)).booleanValue()) {
                                    Object animateInternalToOffset = dismissState2.animateInternalToOffset(floatValue, dismissState2.animationSpec, continuation);
                                    return animateInternalToOffset == CoroutineSingletons.COROUTINE_SUSPENDED ? animateInternalToOffset : Unit.INSTANCE;
                                }
                                Object animateTo$default = DismissState.animateTo$default(dismissState2, obj12, continuation);
                                return animateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$default : Unit.INSTANCE;
                            }
                        }, this);
                        if (collect != coroutineSingletons) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        float f2 = this.$velocity;
                        this.label = 1;
                        if (((AnchoredDraggableState) obj3).settle(f2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PullRefreshState pullRefreshState = (PullRefreshState) obj3;
                        MutatorMutex mutatorMutex = pullRefreshState.mutatorMutex;
                        PullRefreshState$animateIndicatorTo$1$1 pullRefreshState$animateIndicatorTo$1$1 = new PullRefreshState$animateIndicatorTo$1$1(pullRefreshState, this.$velocity, null);
                        this.label = 1;
                        if (MutatorMutex.mutate$default(mutatorMutex, pullRefreshState$animateIndicatorTo$1$1, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    ComposeScrollCaptureCallback composeScrollCaptureCallback = (ComposeScrollCaptureCallback) obj3;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        float f3 = this.$velocity;
                        Object obj4 = composeScrollCaptureCallback.node.unmergedConfig.props.get(SemanticsActions.ScrollByOffset);
                        Function2 function2 = (Function2) (obj4 != null ? obj4 : null);
                        if (function2 == null) {
                            throw Boxes$$ExternalSyntheticOutline1.m1150m("Required value was null.");
                        }
                        Offset offset = new Offset((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax));
                        this.label = 1;
                        obj = function2.invoke(offset, this);
                        if (obj == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return new Float(Float.intBitsToFloat((int) (((Offset) obj).packedValue & BodyPartID.bodyIdMax)));
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj3;
                        float f4 = this.$velocity;
                        this.label = 1;
                        cardNestedScrollExpander.restingPosition = f4;
                        if (cardNestedScrollExpander.isRestored) {
                            obj2 = Unit.INSTANCE;
                        } else {
                            obj2 = cardNestedScrollExpander.m3610animateRevealDistanceToLuvzFrg(f4, 0L, this);
                            if (obj2 != coroutineSingletons5) {
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        if (obj2 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = ((AmountLayoutAnimator) obj3).textScale;
                        Float f5 = new Float(this.$velocity);
                        TweenSpec tweenSpec = AmountLayoutAnimator.TEXT_SCALE_SPEC;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f5, tweenSpec, null, null, this, 12) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 3;
            this.$state = composeScrollCaptureCallback;
        }
    }
}
