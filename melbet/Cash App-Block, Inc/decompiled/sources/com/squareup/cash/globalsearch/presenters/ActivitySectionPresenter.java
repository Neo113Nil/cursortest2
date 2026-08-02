package com.squareup.cash.globalsearch.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.globalsearch.GlobalSearchSelectItem;
import com.squareup.cash.cdf.globalsearch.TapTarget;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ActivitySectionPresenter implements SectionPresenter {
    public final ActivityItemPresenter.Factory activityItemPresenterFactory;
    public final ActivityToken activityToken;
    public final Analytics analytics;
    public final RealGlobalSearchAnalyticsHelper analyticsHelper;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final GlobalSearchActivityEventDecorator$Factory$Impl globalSearchActivityEventDecoratorFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final GlobalSearchScreen screen;
    public final RealGlobalSearchRepository.RealSectionHandle sectionHandle;

    public ActivitySectionPresenter(BetterNavigator.ScreenNavigator screenNavigator, GlobalSearchScreen globalSearchScreen, RealGlobalSearchRepository.RealSectionHandle realSectionHandle, RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0, ActivityItemPresenter.Factory factory, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, Analytics analytics, RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, RealActivityTokenFactory realActivityTokenFactory, GlobalSearchActivityEventDecorator$Factory$Impl globalSearchActivityEventDecorator$Factory$Impl) {
        globalSearchScreen.getClass();
        this.navigator = screenNavigator;
        this.screen = globalSearchScreen;
        this.sectionHandle = realSectionHandle;
        this.activityItemPresenterFactory = factory;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.analytics = analytics;
        this.analyticsHelper = realGlobalSearchAnalyticsHelper;
        this.globalSearchActivityEventDecoratorFactory = globalSearchActivityEventDecorator$Factory$Impl;
        this.activityToken = RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r1 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$trackLoadMoreSelectAnalytics(ActivitySectionPresenter activitySectionPresenter, ContinuationImpl continuationImpl) {
        ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1 activitySectionPresenter$trackLoadMoreSelectAnalytics$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Analytics analytics;
        Object sharedPreference;
        String str;
        Object sharedPreference2;
        String str2;
        Analytics analytics2;
        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = activitySectionPresenter.analyticsHelper;
        if (continuationImpl instanceof ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1) {
            activitySectionPresenter$trackLoadMoreSelectAnalytics$1 = (ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1) continuationImpl;
            int i2 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics = activitySectionPresenter.analytics;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0 = analytics;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = 1;
                    obj = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", activitySectionPresenter$trackLoadMoreSelectAnalytics$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str3 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$2;
                            String str4 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1;
                            analytics2 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            str2 = str3;
                            str = str4;
                            analytics2.track(new GlobalSearchSelectItem(str, str2, (String) obj, activitySectionPresenter.screen.searchOrigin, null, null, null, TapTarget.SEE_MORE, 752), null);
                            return Unit.INSTANCE;
                        }
                        String str5 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1;
                        Analytics analytics3 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str = str5;
                        analytics = analytics3;
                        String str6 = (String) obj;
                        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0 = analytics;
                        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1 = str;
                        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$2 = str6;
                        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = 3;
                        sharedPreference2 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", activitySectionPresenter$trackLoadMoreSelectAnalytics$1);
                        if (sharedPreference2 != coroutineSingletons) {
                            str2 = str6;
                            obj = sharedPreference2;
                            analytics2 = analytics;
                            analytics2.track(new GlobalSearchSelectItem(str, str2, (String) obj, activitySectionPresenter.screen.searchOrigin, null, null, null, TapTarget.SEE_MORE, 752), null);
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    analytics = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str7 = (String) obj;
                activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0 = analytics;
                activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1 = str7;
                activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = 2;
                sharedPreference = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", activitySectionPresenter$trackLoadMoreSelectAnalytics$1);
                if (sharedPreference != coroutineSingletons) {
                    str = str7;
                    obj = sharedPreference;
                    String str62 = (String) obj;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0 = analytics;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1 = str;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$2 = str62;
                    activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = 3;
                    sharedPreference2 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", activitySectionPresenter$trackLoadMoreSelectAnalytics$1);
                    if (sharedPreference2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        activitySectionPresenter$trackLoadMoreSelectAnalytics$1 = new ActivitySectionPresenter$trackLoadMoreSelectAnalytics$1(activitySectionPresenter, continuationImpl);
        Object obj2 = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label;
        if (i != 0) {
        }
        String str72 = (String) obj2;
        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$0 = analytics;
        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.L$1 = str72;
        activitySectionPresenter$trackLoadMoreSelectAnalytics$1.label = 2;
        sharedPreference = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", activitySectionPresenter$trackLoadMoreSelectAnalytics$1);
        if (sharedPreference != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.squareup.cash.globalsearch.presenters.SectionPresenter
    public final GlobalSearchViewModel.Section models(GapComposer gapComposer) {
        GlobalSearchViewModel.SectionTrailer sectionTrailer;
        GlobalSearchViewModel.SectionTrailer sectionTrailer2;
        boolean changedInstance;
        MutableState mutableState;
        GlobalSearchActivityEventDecorator globalSearchActivityEventDecorator;
        gapComposer.startReplaceGroup(-718447042);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (rememberedValue == obj) {
            Object createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(createCompositionCoroutineScope);
            obj2 = createCompositionCoroutineScope;
        }
        Object obj3 = (CoroutineScope) obj2;
        boolean z = false;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue2;
        if (rememberedValue2 == obj) {
            Object clusterItemKt$$ExternalSyntheticLambda0 = new ClusterItemKt$$ExternalSyntheticLambda0(4);
            gapComposer.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda0);
            obj4 = clusterItemKt$$ExternalSyntheticLambda0;
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj4, gapComposer, 48);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue3;
        if (rememberedValue3 == obj) {
            Object mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj5 = mutableStateOf$default;
        }
        MutableState mutableState3 = (MutableState) obj5;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            SearchOrigin searchOrigin = this.screen.searchOrigin;
            CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(18, mutableState2);
            searchOrigin.getClass();
            VariantAppComponent.Impl.ZombieLegacyGraphExtensionImpl zombieLegacyGraphExtensionImpl = this.globalSearchActivityEventDecoratorFactory.delegateFactory;
            Analytics analytics = (Analytics) zombieLegacyGraphExtensionImpl.provideSandboxedContextProvider.getValue();
            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = (RealGlobalSearchAnalyticsHelper) zombieLegacyGraphExtensionImpl.provideAccountDatabaseHelperProvider.getValue();
            RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext = (RealGlobalSearchAnalyticsContext) zombieLegacyGraphExtensionImpl.provideSharedPreferencesProvider.getValue();
            analytics.getClass();
            realGlobalSearchAnalyticsHelper.getClass();
            realGlobalSearchAnalyticsContext.getClass();
            Object globalSearchActivityEventDecorator2 = new GlobalSearchActivityEventDecorator(searchOrigin, captureCheckFaceKt$$ExternalSyntheticLambda5, analytics, realGlobalSearchAnalyticsHelper, realGlobalSearchAnalyticsContext);
            gapComposer.updateRememberedValue(globalSearchActivityEventDecorator2);
            rememberedValue4 = globalSearchActivityEventDecorator2;
        }
        GlobalSearchActivityEventDecorator globalSearchActivityEventDecorator3 = (GlobalSearchActivityEventDecorator) rememberedValue4;
        RealGlobalSearchRepository.RealSectionHandle realSectionHandle = this.sectionHandle;
        boolean changed = gapComposer.changed(realSectionHandle);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue5;
        if (changed || rememberedValue5 == obj) {
            Object mapState = StateFlowKt.mapState(realSectionHandle.section, RowSectionPresenter$models$lambda$3$$inlined$section$1.INSTANCE$1);
            gapComposer.updateRememberedValue(mapState);
            obj6 = mapState;
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) obj6, null, gapComposer, 1);
        Unit unit = Unit.INSTANCE;
        boolean changed2 = gapComposer.changed(mutableState2) | gapComposer.changed(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue6;
        if (changed2 || rememberedValue6 == obj) {
            Object activitySectionPresenter$models$1$1 = new ActivitySectionPresenter$models$1$1(this, mutableState2, continuation, z2 ? 1 : 0);
            gapComposer.updateRememberedValue(activitySectionPresenter$models$1$1);
            obj7 = activitySectionPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj7);
        GlobalSearchViewModel.Modal modal = ((GlobalSearchResponseSectionModel.Activities) collectAsState.getValue()).warning;
        String str = ((GlobalSearchResponseSectionModel.Activities) collectAsState.getValue()).title;
        gapComposer.startReplaceGroup(1062160887);
        List list = ((GlobalSearchResponseSectionModel.Activities) collectAsState.getValue()).items;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = (GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel) list.get(i);
            Object rememberedValue7 = gapComposer.rememberedValue();
            Object obj8 = rememberedValue7;
            if (rememberedValue7 == obj) {
                Object createCompositionCoroutineScope2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(createCompositionCoroutineScope2);
                obj8 = createCompositionCoroutineScope2;
            }
            CoroutineScope coroutineScope = (CoroutineScope) obj8;
            boolean changed3 = gapComposer.changed(globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel) | gapComposer.changed(i);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue8 == obj) {
                mutableState = collectAsState;
                globalSearchActivityEventDecorator = globalSearchActivityEventDecorator3;
                rememberedValue8 = this.activityItemPresenterFactory.create(this.navigator, globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel, new ActivityItemPresentationContext(ActivityItemOrigin.SEARCH_RESULTS, i, this.screen, ActivityScope.GLOBAL_SEARCH, this.activityToken, 1), InputEventTrigger.Companion.decoratedWith(this.defaultActivityItemEventHandlerFactory, globalSearchActivityEventDecorator3), new GpsConfigQueries$$ExternalSyntheticLambda3(10, coroutineScope, this, globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel));
                gapComposer.updateRememberedValue(rememberedValue8);
            } else {
                globalSearchActivityEventDecorator = globalSearchActivityEventDecorator3;
                mutableState = collectAsState;
            }
            arrayList.add(((ActivityItemPresenter) rememberedValue8).models(gapComposer));
            i++;
            collectAsState = mutableState;
            globalSearchActivityEventDecorator3 = globalSearchActivityEventDecorator;
            z = false;
        }
        MutableState mutableState4 = collectAsState;
        gapComposer.end(z);
        if (((GlobalSearchResponseSectionModel.Activities) mutableState4.getValue()).showLoadMore && !((Boolean) mutableState3.getValue()).booleanValue()) {
            sectionTrailer2 = GlobalSearchViewModel.SectionTrailer.LoadMoreButton.INSTANCE;
        } else if (modal != null && !((Boolean) mutableState3.getValue()).booleanValue()) {
            sectionTrailer2 = new GlobalSearchViewModel.SectionTrailer.WarningModal(modal);
        } else {
            if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                sectionTrailer = null;
                String str2 = ((GlobalSearchResponseSectionModel.Activities) mutableState4.getValue()).title;
                changedInstance = gapComposer.changedInstance(obj3) | gapComposer.changed(this);
                Object rememberedValue9 = gapComposer.rememberedValue();
                Object obj9 = rememberedValue9;
                if (!changedInstance || rememberedValue9 == obj) {
                    Object gpsConfigQueries$$ExternalSyntheticLambda3 = new GpsConfigQueries$$ExternalSyntheticLambda3(11, obj3, this, mutableState3);
                    gapComposer.updateRememberedValue(gpsConfigQueries$$ExternalSyntheticLambda3);
                    obj9 = gpsConfigQueries$$ExternalSyntheticLambda3;
                }
                GlobalSearchViewModel.ActivitySection activitySection = new GlobalSearchViewModel.ActivitySection(str, str2, arrayList, sectionTrailer, (Function1) obj9);
                gapComposer.end(false);
                return activitySection;
            }
            sectionTrailer2 = GlobalSearchViewModel.SectionTrailer.LoadingSpinner.INSTANCE;
        }
        sectionTrailer = sectionTrailer2;
        String str22 = ((GlobalSearchResponseSectionModel.Activities) mutableState4.getValue()).title;
        changedInstance = gapComposer.changedInstance(obj3) | gapComposer.changed(this);
        Object rememberedValue92 = gapComposer.rememberedValue();
        Object obj92 = rememberedValue92;
        if (!changedInstance) {
        }
        Object gpsConfigQueries$$ExternalSyntheticLambda32 = new GpsConfigQueries$$ExternalSyntheticLambda3(11, obj3, this, mutableState3);
        gapComposer.updateRememberedValue(gpsConfigQueries$$ExternalSyntheticLambda32);
        obj92 = gpsConfigQueries$$ExternalSyntheticLambda32;
        GlobalSearchViewModel.ActivitySection activitySection2 = new GlobalSearchViewModel.ActivitySection(str, str22, arrayList, sectionTrailer, (Function1) obj92);
        gapComposer.end(false);
        return activitySection2;
    }
}
