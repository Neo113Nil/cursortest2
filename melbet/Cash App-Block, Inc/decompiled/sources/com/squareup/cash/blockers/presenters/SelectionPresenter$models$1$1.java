package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.SelectionPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.screens.Back;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.SelectionOption;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SelectionPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SelectionViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ SelectionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectionPresenter$models$1$1(SelectionPresenter selectionPresenter, SelectionViewEvent selectionViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = selectionPresenter;
        this.$event = selectionViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SelectionViewEvent selectionViewEvent = this.$event;
        SelectionPresenter selectionPresenter = this.this$0;
        switch (i) {
            case 0:
                return new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, continuation, 0);
            case 1:
                return new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, continuation, 1);
            default:
                return new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SelectionPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object collect;
        int i = this.$r8$classId;
        SelectionPresenter selectionPresenter = this.this$0;
        SelectionViewEvent selectionViewEvent = this.$event;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    BlockersScreens.SelectionScreen selectionScreen = selectionPresenter.args;
                    SelectionOption selectionOption = ((SelectionViewEvent.SelectOption) selectionViewEvent).option;
                    SelectionOption.Hint hint = selectionOption.hint;
                    int i3 = hint == null ? -1 : SelectionPresenter.WhenMappings.$EnumSwitchMapping$0[hint.ordinal()];
                    if (i3 == -1) {
                        RealBlockersHelper realBlockersHelper = selectionPresenter.blockersHelper;
                        String str = selectionOption.action;
                        str.getClass();
                        BlockersData blockersData = ((BlockersScreens.SelectionFullScreen) selectionScreen).blockersData;
                        ClientScenario clientScenario = selectionOption.client_scenario;
                        if (clientScenario == null) {
                            clientScenario = blockersData.clientScenario;
                            clientScenario.getClass();
                        }
                        collect = realBlockersHelper.selectOption(selectionScreen, str, blockersData, clientScenario).collect(new RealBrazeManager$openSession$1$1(selectionPresenter, 8), this);
                        if (collect != coroutineSingletons) {
                            collect = Unit.INSTANCE;
                        }
                    } else if (i3 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        selectionPresenter.navigator.goTo(Back.INSTANCE);
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
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
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    SelectionPresenter selectionPresenter2 = this.this$0;
                    Object performHelpAction = selectionPresenter2.blockersHelper.performHelpAction(((SelectionViewEvent.HelpItemClick) selectionViewEvent).helpItem, selectionPresenter2.args, new WorkApplet$applet$1(2, selectionPresenter2, SelectionPresenter.class, "handleError", "handleError(Lcom/squareup/cash/data/blockers/BlockersHelper$BlockersAction$ShowError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), new WorkApplet$applet$1(2, selectionPresenter2.loading, MutableStateFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), this);
                    if (performHelpAction != coroutineSingletons2) {
                        performHelpAction = Unit.INSTANCE;
                    }
                    if (performHelpAction == coroutineSingletons2) {
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
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper2 = selectionPresenter.blockersHelper;
                    BlockerAction blockerAction = ((SelectionViewEvent.BlockerActionClick) selectionViewEvent).action;
                    BlockersScreens.SelectionScreen selectionScreen2 = selectionPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, blockerAction, selectionScreen2, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons3) {
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
}
