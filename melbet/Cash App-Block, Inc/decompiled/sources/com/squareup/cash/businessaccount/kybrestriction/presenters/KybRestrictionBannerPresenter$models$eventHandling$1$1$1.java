package com.squareup.cash.businessaccount.kybrestriction.presenters;

import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewEvent;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.cdf.featurerestrictionbanner.ActionLocation;
import com.squareup.cash.cdf.featurerestrictionbanner.FeatureRestrictionBannerInteractTap;
import com.squareup.cash.cdf.featurerestrictionbanner.FeatureRestrictionBannerViewImpression;
import com.squareup.cash.cdf.featurerestrictionbanner.Location;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class KybRestrictionBannerPresenter$models$eventHandling$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ KybRestrictionBannerViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationCardPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KybRestrictionBannerPresenter$models$eventHandling$1$1$1(NavigationCardPresenter navigationCardPresenter, KybRestrictionBannerViewEvent kybRestrictionBannerViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = navigationCardPresenter;
        this.$event = kybRestrictionBannerViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        KybRestrictionBannerViewEvent kybRestrictionBannerViewEvent = this.$event;
        NavigationCardPresenter navigationCardPresenter = this.this$0;
        switch (i) {
            case 0:
                return new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, 0);
            case 1:
                return new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, 1);
            default:
                return new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((KybRestrictionBannerPresenter$models$eventHandling$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        KybRestrictionBannerViewEvent kybRestrictionBannerViewEvent = this.$event;
        NavigationCardPresenter navigationCardPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = (Analytics) navigationCardPresenter.analyticsService;
                KybEligibilityWarning.RestrictedFeature restrictedFeature = ((KybRestrictionBannerViewEvent.ImpressionEvent) kybRestrictionBannerViewEvent).bannerDetail.restricted_feature;
                analytics.track(new FeatureRestrictionBannerViewImpression(restrictedFeature != null ? UtilsKt.access$toAnalyticsLocation(restrictedFeature) : null), null);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KybRestrictionBannerViewEvent.PrimaryActionEvent primaryActionEvent = (KybRestrictionBannerViewEvent.PrimaryActionEvent) kybRestrictionBannerViewEvent;
                RealRouter realRouter = navigationCardPresenter.router;
                KybRestrictionBannerScreen kybRestrictionBannerScreen = (KybRestrictionBannerScreen) navigationCardPresenter.pluginContext;
                Analytics analytics2 = (Analytics) navigationCardPresenter.analyticsService;
                KybEligibilityWarning.BannerDetail bannerDetail = primaryActionEvent.bannerDetail;
                KybEligibilityWarning.RestrictedFeature restrictedFeature2 = bannerDetail.restricted_feature;
                Location access$toAnalyticsLocation = restrictedFeature2 != null ? UtilsKt.access$toAnalyticsLocation(restrictedFeature2) : null;
                KybEligibilityWarning.Action action = bannerDetail.action;
                analytics2.track(new FeatureRestrictionBannerInteractTap(access$toAnalyticsLocation, action != null ? action.title : null, ActionLocation.BUTTON), null);
                realRouter.route(new RoutingParams(null, null, kybRestrictionBannerScreen.exitScreen, null, null, null, 503), primaryActionEvent.routeUrl);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent subtitleMarkdownActionEvent = (KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent) kybRestrictionBannerViewEvent;
                RealRouter realRouter2 = navigationCardPresenter.router;
                KybRestrictionBannerScreen kybRestrictionBannerScreen2 = (KybRestrictionBannerScreen) navigationCardPresenter.pluginContext;
                Analytics analytics3 = (Analytics) navigationCardPresenter.analyticsService;
                String str = subtitleMarkdownActionEvent.displayText;
                KybEligibilityWarning.BannerDetail bannerDetail2 = subtitleMarkdownActionEvent.bannerDetail;
                str.getClass();
                KybEligibilityWarning.RestrictedFeature restrictedFeature3 = bannerDetail2.restricted_feature;
                analytics3.track(new FeatureRestrictionBannerInteractTap(restrictedFeature3 != null ? UtilsKt.access$toAnalyticsLocation(restrictedFeature3) : null, str, ActionLocation.MARKDOWN_LINK), null);
                realRouter2.route(new RoutingParams(null, null, kybRestrictionBannerScreen2.exitScreen, null, null, null, 503), subtitleMarkdownActionEvent.markdownUrl);
                break;
        }
        return Unit.INSTANCE;
    }
}
