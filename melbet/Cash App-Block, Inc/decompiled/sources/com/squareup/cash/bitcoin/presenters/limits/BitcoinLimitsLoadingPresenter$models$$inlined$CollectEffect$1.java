package com.squareup.cash.bitcoin.presenters.limits;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.NavigationModule$Companion;
import com.squareup.cash.bitcoin.viewmodels.limits.BitcoinLimitsLoadingViewEvent$BackPressed;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.limits.backend.api.CustomerLimitsModel;
import com.squareup.cash.limits.screens.LimitsSectionScreen;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.screens.Back;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ErrorPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, ErrorPresenter errorPresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.this$0 = errorPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ErrorPresenter errorPresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1 bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1 = new BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1(flow, continuation, errorPresenter, 0);
                bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1;
            default:
                BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1 bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$12 = new BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1(flow, continuation, errorPresenter, 1);
                bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return bitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ErrorPresenter errorPresenter = this.this$0;
        Flow flow = this.$flow;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = new FlowCollector(coroutineScope, errorPresenter, 0) { // from class: com.squareup.cash.bitcoin.presenters.limits.BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1.1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ErrorPresenter this$0;

                        {
                            this.$r8$classId = r3;
                            this.this$0 = errorPresenter;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i4 = this.$r8$classId;
                            Back back = Back.INSTANCE;
                            ErrorPresenter errorPresenter2 = this.this$0;
                            Object obj3 = null;
                            switch (i4) {
                                case 0:
                                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) errorPresenter2.navigator;
                                    CustomerLimitsModel customerLimitsModel = (CustomerLimitsModel) obj2;
                                    if (!Intrinsics.areEqual(customerLimitsModel, CustomerLimitsModel.Loading.INSTANCE)) {
                                        if (customerLimitsModel instanceof CustomerLimitsModel.Loaded) {
                                            Iterator it = ((CustomerLimitsModel.Loaded) customerLimitsModel).limits.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (((LimitViewModel) next).sectionType == LimitsSectionType.BITCOIN) {
                                                        obj3 = next;
                                                    }
                                                }
                                            }
                                            LimitViewModel limitViewModel = (LimitViewModel) obj3;
                                            screenNavigator.goTo(back);
                                            if (limitViewModel != null) {
                                                screenNavigator.goTo(new LimitsSectionScreen(NavigationModule$Companion.toSectionData(limitViewModel)));
                                            }
                                        } else {
                                            if (!Intrinsics.areEqual(customerLimitsModel, CustomerLimitsModel.Unavailable.INSTANCE)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            screenNavigator.goTo(back);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (Intrinsics.areEqual((BitcoinLimitsLoadingViewEvent$BackPressed) obj2, BitcoinLimitsLoadingViewEvent$BackPressed.INSTANCE)) {
                                        ((BetterNavigator.ScreenNavigator) errorPresenter2.navigator).goTo(back);
                                        return Unit.INSTANCE;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = new FlowCollector(coroutineScope2, errorPresenter, i2) { // from class: com.squareup.cash.bitcoin.presenters.limits.BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1.1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ErrorPresenter this$0;

                        {
                            this.$r8$classId = i2;
                            this.this$0 = errorPresenter;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i42 = this.$r8$classId;
                            Back back = Back.INSTANCE;
                            ErrorPresenter errorPresenter2 = this.this$0;
                            Object obj3 = null;
                            switch (i42) {
                                case 0:
                                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) errorPresenter2.navigator;
                                    CustomerLimitsModel customerLimitsModel = (CustomerLimitsModel) obj2;
                                    if (!Intrinsics.areEqual(customerLimitsModel, CustomerLimitsModel.Loading.INSTANCE)) {
                                        if (customerLimitsModel instanceof CustomerLimitsModel.Loaded) {
                                            Iterator it = ((CustomerLimitsModel.Loaded) customerLimitsModel).limits.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (((LimitViewModel) next).sectionType == LimitsSectionType.BITCOIN) {
                                                        obj3 = next;
                                                    }
                                                }
                                            }
                                            LimitViewModel limitViewModel = (LimitViewModel) obj3;
                                            screenNavigator.goTo(back);
                                            if (limitViewModel != null) {
                                                screenNavigator.goTo(new LimitsSectionScreen(NavigationModule$Companion.toSectionData(limitViewModel)));
                                            }
                                        } else {
                                            if (!Intrinsics.areEqual(customerLimitsModel, CustomerLimitsModel.Unavailable.INSTANCE)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            screenNavigator.goTo(back);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (Intrinsics.areEqual((BitcoinLimitsLoadingViewEvent$BackPressed) obj2, BitcoinLimitsLoadingViewEvent$BackPressed.INSTANCE)) {
                                        ((BetterNavigator.ScreenNavigator) errorPresenter2.navigator).goTo(back);
                                        return Unit.INSTANCE;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
