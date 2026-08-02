package com.squareup.cash.boost.backend;

import androidx.compose.ui.platform.DerivedSize;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.screens.Finish;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealBoostSelector$selectBoost$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ DerivedSize.Companion $appLocation;
    public final /* synthetic */ AppPresentation $appPresentation;
    public final /* synthetic */ String $boostFlowToken;
    public final /* synthetic */ String $browseFlowToken;
    public final /* synthetic */ Finish $exitScreen;
    public final /* synthetic */ BlockersData.MoneybotContext $moneybotContext;
    public final /* synthetic */ Function0 $onComplete;
    public final /* synthetic */ String $plasmaFlowToken;
    public final /* synthetic */ String $rewardToken;
    public final /* synthetic */ String $searchFlowToken;
    public final /* synthetic */ String $shopFlowToken;
    public int label;
    public final /* synthetic */ RealBoostSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$selectBoost$1(RealBoostSelector realBoostSelector, Finish finish, String str, DerivedSize.Companion companion, String str2, String str3, String str4, String str5, String str6, AppPresentation appPresentation, Function0 function0, BlockersData.MoneybotContext moneybotContext, Continuation continuation) {
        super(1, continuation);
        this.this$0 = realBoostSelector;
        this.$exitScreen = finish;
        this.$rewardToken = str;
        this.$appLocation = companion;
        this.$boostFlowToken = str2;
        this.$plasmaFlowToken = str3;
        this.$shopFlowToken = str4;
        this.$browseFlowToken = str5;
        this.$searchFlowToken = str6;
        this.$appPresentation = appPresentation;
        this.$onComplete = function0;
        this.$moneybotContext = moneybotContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RealBoostSelector$selectBoost$1(this.this$0, this.$exitScreen, this.$rewardToken, this.$appLocation, this.$boostFlowToken, this.$plasmaFlowToken, this.$shopFlowToken, this.$browseFlowToken, this.$searchFlowToken, this.$appPresentation, this.$onComplete, this.$moneybotContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RealBoostSelector$selectBoost$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            if (RealBoostSelector.access$selectRewardInternal(this.this$0, this.$exitScreen, this.$rewardToken, this.$appLocation, this.$boostFlowToken, this.$plasmaFlowToken, this.$shopFlowToken, this.$browseFlowToken, this.$searchFlowToken, this.$appPresentation, this.$onComplete, this.$moneybotContext, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
