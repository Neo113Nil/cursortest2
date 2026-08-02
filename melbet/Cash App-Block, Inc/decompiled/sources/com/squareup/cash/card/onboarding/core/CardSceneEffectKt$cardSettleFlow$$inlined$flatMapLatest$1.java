package com.squareup.cash.card.onboarding.core;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Object $backwardResting$inlined;
    public final /* synthetic */ Object $cardRotation$inlined;
    public final /* synthetic */ Object $dampingRatio$inlined;
    public final /* synthetic */ Object $forwardResting$inlined;
    public /* synthetic */ Object $lastVelocity$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ State $stiffness$inlined;
    public FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1(Continuation continuation, Ref$LongRef ref$LongRef, DrawerViewKt$$ExternalSyntheticLambda2 drawerViewKt$$ExternalSyntheticLambda2, CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda1, CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda12, State state, State state2) {
        super(3, continuation);
        this.$lastVelocity$inlined = ref$LongRef;
        this.$cardRotation$inlined = drawerViewKt$$ExternalSyntheticLambda2;
        this.$forwardResting$inlined = cardScene$$ExternalSyntheticLambda1;
        this.$backwardResting$inlined = cardScene$$ExternalSyntheticLambda12;
        this.$dampingRatio$inlined = state;
        this.$stiffness$inlined = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$dampingRatio$inlined;
        Object obj5 = this.$backwardResting$inlined;
        Object obj6 = this.$forwardResting$inlined;
        Object obj7 = this.$cardRotation$inlined;
        switch (i) {
            case 0:
                CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1 cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1 = new CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1((Continuation) obj3, (Ref$LongRef) this.$lastVelocity$inlined, (DrawerViewKt$$ExternalSyntheticLambda2) obj7, (CardScene$$ExternalSyntheticLambda1) obj6, (CardScene$$ExternalSyntheticLambda1) obj5, (State) obj4, this.$stiffness$inlined);
                cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
                cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1.L$1 = obj2;
                return cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                ColorModel colorModel = (ColorModel) obj5;
                MutableState mutableState = (MutableState) this.$stiffness$inlined;
                CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1 cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$12 = new CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1(mutableState, colorModel, (InvestingSearchPresenter) obj7, (Collection) obj6, (Continuation) obj3, (CoroutineScope) obj4);
                cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$12.$lastVelocity$inlined = (FlowCollector) obj;
                cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$12.L$1 = obj2;
                return cardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r18) == r15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r4 == r15) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Flow m3563flingTo38CYSgM;
        Object access$filterGroupCarousels;
        int i = this.$r8$classId;
        State state = this.$stiffness$inlined;
        Object obj2 = this.$dampingRatio$inlined;
        Object obj3 = this.$cardRotation$inlined;
        switch (i) {
            case 0:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.$lastVelocity$inlined;
                FlowCollector flowCollector = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Offset offset = (Offset) obj4;
                    if (offset != null) {
                        ref$LongRef.element = offset.packedValue;
                        m3563flingTo38CYSgM = EmptyFlow.INSTANCE;
                    } else {
                        Quat quat = (Quat) ((DrawerViewKt$$ExternalSyntheticLambda2) obj3).invoke();
                        Quat quat2 = CardSceneEffectKt.forwardResting;
                        float angleShortestPath = quat.angleShortestPath(quat2);
                        Quat quat3 = CardSceneEffectKt.backwardResting;
                        m3563flingTo38CYSgM = AnimationsKt.m3563flingTo38CYSgM(quat, angleShortestPath < quat.angleShortestPath(quat3) ? quat2 : quat3, ref$LongRef.element ^ (-9223372034707292160L), new SpringSpec(((Number) ((State) obj2).getValue()).floatValue(), ((Number) state.getValue()).floatValue(), new Float(0.001f)), 60.0f);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, m3563flingTo38CYSgM, this) == coroutineSingletons) {
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
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) obj3;
                FlowCollector flowCollector2 = (FlowCollector) this.$lastVelocity$inlined;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                Object obj6 = this.$backwardResting$inlined;
                Object obj7 = this.$forwardResting$inlined;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$lastVelocity$inlined = null;
                    this.L$1 = null;
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    access$filterGroupCarousels = InvestingSearchPresenter.access$filterGroupCarousels(investingSearchPresenter, (List) obj5, (Collection) obj7, (ColorModel) obj6, this);
                    break;
                } else if (i3 == 1) {
                    flowCollector2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$filterGroupCarousels = obj;
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(new AppLockMonitor$special$$inlined$map$2(access$filterGroupCarousels, 19), new InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1((MutableState) state, (ColorModel) obj6, investingSearchPresenter, (Collection) obj7, null, (CoroutineScope) obj2));
                this.$lastVelocity$inlined = null;
                this.L$1 = null;
                this.L$0 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1(MutableState mutableState, ColorModel colorModel, InvestingSearchPresenter investingSearchPresenter, Collection collection, Continuation continuation, CoroutineScope coroutineScope) {
        super(3, continuation);
        this.$cardRotation$inlined = investingSearchPresenter;
        this.$forwardResting$inlined = collection;
        this.$backwardResting$inlined = colorModel;
        this.$dampingRatio$inlined = coroutineScope;
        this.$stiffness$inlined = mutableState;
    }
}
