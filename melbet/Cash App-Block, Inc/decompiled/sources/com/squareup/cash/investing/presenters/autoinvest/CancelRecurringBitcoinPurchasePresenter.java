package com.squareup.cash.investing.presenters.autoinvest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CancelRecurringBitcoinPurchasePresenter implements MoleculePresenter {
    public final AppService appService;
    public final InvestingScreens.CancelRecurringPurchase.Bitcoin args;
    public final FlowStarter flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public CancelRecurringBitcoinPurchasePresenter(AppService appService, FlowStarter flowStarter, AndroidStringManager androidStringManager, InvestingScreens.CancelRecurringPurchase.Bitcoin bitcoin, BetterNavigator.ScreenNavigator screenNavigator) {
        bitcoin.getClass();
        this.appService = appService;
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.args = bitcoin;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public final void m3585models(final Flow flow, Composer composer, final int i) {
        int i2;
        Function2 function2;
        RecomposeScopeImpl recomposeScopeImpl;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-379804248);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InvestingHomeView$onScrollFlow$1((MoleculePresenter) this, mutableState, (Continuation) null, 15);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue2);
            ApiResult apiResult = (ApiResult) mutableState.getValue();
            boolean z = apiResult instanceof ApiResult.Failure;
            BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
            if (z) {
                screenNavigator.goTo(new Finish(null));
                ApiResult apiResult2 = (ApiResult) mutableState.getValue();
                apiResult2.getClass();
                screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult2, null).message, null, 14));
            } else {
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (apiResult != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    recomposeScopeImpl = gapComposer.endRestartGroup();
                    if (recomposeScopeImpl != null) {
                        function2 = new Function2(this) { // from class: com.squareup.cash.investing.presenters.autoinvest.CancelRecurringBitcoinPurchasePresenter$$ExternalSyntheticLambda0
                            public final /* synthetic */ CancelRecurringBitcoinPurchasePresenter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i3;
                                int i6 = i;
                                Flow flow2 = flow;
                                CancelRecurringBitcoinPurchasePresenter cancelRecurringBitcoinPurchasePresenter = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i5) {
                                    case 0:
                                        cancelRecurringBitcoinPurchasePresenter.m3585models(flow2, composer2, Updater.updateChangedFlags(i6 | 1));
                                        break;
                                    default:
                                        cancelRecurringBitcoinPurchasePresenter.m3585models(flow2, composer2, Updater.updateChangedFlags(i6 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        recomposeScopeImpl.block = function2;
                    }
                    return;
                }
                ApiResult apiResult3 = (ApiResult) mutableState.getValue();
                apiResult3.getClass();
                Object obj = ((ApiResult.Success) apiResult3).response;
                obj.getClass();
                GetFlowResponse getFlowResponse = (GetFlowResponse) obj;
                String str = getFlowResponse.token;
                str.getClass();
                Finish finish = new Finish(null);
                this.args.getClass();
                ResponseContext responseContext = getFlowResponse.response_context;
                responseContext.getClass();
                ClientScenario clientScenario = getFlowResponse.client_scenario;
                clientScenario.getClass();
                RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
                screenNavigator.goTo(realFlowStarter.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, finish, null, clientScenario, str, null, null, null, new BadgedBoxKt$$ExternalSyntheticLambda0(13, ColorModel.Bitcoin.INSTANCE, responseContext), 468)));
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            function2 = new Function2(this) { // from class: com.squareup.cash.investing.presenters.autoinvest.CancelRecurringBitcoinPurchasePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ CancelRecurringBitcoinPurchasePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i5 = i4;
                    int i6 = i;
                    Flow flow2 = flow;
                    CancelRecurringBitcoinPurchasePresenter cancelRecurringBitcoinPurchasePresenter = this.f$0;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i5) {
                        case 0:
                            cancelRecurringBitcoinPurchasePresenter.m3585models(flow2, composer2, Updater.updateChangedFlags(i6 | 1));
                            break;
                        default:
                            cancelRecurringBitcoinPurchasePresenter.m3585models(flow2, composer2, Updater.updateChangedFlags(i6 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        m3585models(flow, composer, i);
        return Unit.INSTANCE;
    }
}
