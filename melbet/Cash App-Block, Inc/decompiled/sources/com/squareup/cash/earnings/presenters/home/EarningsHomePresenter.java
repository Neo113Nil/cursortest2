package com.squareup.cash.earnings.presenters.home;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import coil3.ComponentRegistry;
import com.google.android.gms.internal.mlkit_common.zzy;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanl;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.backend.api.EarningsParsingErrorFactory;
import com.squareup.cash.earnings.backend.api.mapper.EarningsAllocationDistributionMappersKt;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$MetroFactory;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel$DistributionsSection$NullState;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import papa.InputEventTrigger;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public final class EarningsHomePresenter implements MoleculePresenter, HasObservability {
    public final ActivitiesManager activitiesManager;
    public final ActivitiesManager.ActivityContext activityContext;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final EarningsHomeScreen args;
    public final RealClientSyncer clientSyncer;
    public final AndroidDateFormatManager dateFormatManager;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final RealDisclosureProvider disclosureProvider;
    public final Result earnerModeRepository;
    public final zzb earningsActivityItemEventDecorator;
    public final EarningsHomeAnalytics earningsHomeAnalytics;
    public final RealEarningsSyncStateRepository earningsSyncStateRepository;
    public final ErrorReporter errorReporter;
    public final EarningsHeaderPresenter headerPresenter;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public EarningsHomePresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, ActivitiesManager.Factory factory, SessionManager sessionManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, zzb zzbVar, SyncValueReader syncValueReader, RealEarningsSyncStateRepository realEarningsSyncStateRepository, Result result, RealDisclosureProvider realDisclosureProvider, EarningsHomeAnalytics earningsHomeAnalytics, RealClientSyncer realClientSyncer, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager, EarningsHeaderPresenter$AssistedInjectionFactory$Impl earningsHeaderPresenter$AssistedInjectionFactory$Impl, CoroutineContext coroutineContext, EarningsHomeScreen earningsHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        earningsHomeScreen.getClass();
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.earningsActivityItemEventDecorator = zzbVar;
        this.syncValueReader = syncValueReader;
        this.earningsSyncStateRepository = realEarningsSyncStateRepository;
        this.earnerModeRepository = result;
        this.disclosureProvider = realDisclosureProvider;
        this.earningsHomeAnalytics = earningsHomeAnalytics;
        this.clientSyncer = realClientSyncer;
        this.stringManager = androidStringManager;
        this.dateFormatManager = androidDateFormatManager;
        this.ioDispatcher = coroutineContext;
        this.args = earningsHomeScreen;
        this.navigator = screenNavigator;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        ComponentRegistry.Builder builder = earningsHeaderPresenter$AssistedInjectionFactory$Impl.delegateFactory;
        EglCore eglCore = (EglCore) ((RealEarningsChartRepository$MetroFactory) builder.interceptors).invoke();
        AndroidClock androidClock = (AndroidClock) ((LambdaProvider) builder.mappers).lambda.invoke();
        LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) ((Provider) builder.keyers).invoke();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) builder.lazyFetcherFactories).lambda.invoke();
        EarningsHomeAnalytics earningsHomeAnalytics2 = (EarningsHomeAnalytics) ((Provider) builder.lazyDecoderFactories).invoke();
        androidClock.getClass();
        factory2.getClass();
        androidStringManager2.getClass();
        earningsHomeAnalytics2.getClass();
        this.headerPresenter = new EarningsHeaderPresenter(eglCore, androidClock, factory2, androidStringManager2, earningsHomeAnalytics2);
        ActivitiesManager.ActivityContext earningsActivityContext$default = zzanl.earningsActivityContext$default(6, PlatformKt.activeAccountToken(sessionManager), null);
        this.activityContext = earningsActivityContext$default;
        this.activitiesManager = factory.create(earningsActivityContext$default, new ActivitiesCache.InMemory());
    }

    public static EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection getActivitySection(EarningsUiConfiguration.EarningsHomeUi earningsHomeUi) {
        Object obj;
        Iterator it = earningsHomeUi.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection) obj) instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection) {
                break;
            }
        }
        if (obj instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection) {
            return (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection) obj;
        }
        return null;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x056d, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection activitySection;
        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection activitySection2;
        boolean z;
        Iterator it;
        boolean z2;
        NeverEqualPolicy neverEqualPolicy;
        UiCallbackModel uiCallbackModel;
        UiCallbackModel uiCallbackModel2;
        ArrayList arrayList;
        MutableState mutableState;
        GapComposer gapComposer;
        int i2;
        Object disclosureFooter;
        Iterator it2;
        MutableState mutableState2;
        String str;
        UiCallbackModel uiCallbackModel3;
        ArrayList arrayList2;
        GapComposer gapComposer2;
        String str2;
        char c;
        StackedAvatarViewModel stackedAvatarViewModel;
        EarningsHomeViewModel.EarningToolsItem earningToolsItem;
        StackedAvatarViewModel single;
        EarningsHomeViewModel.EarningToolsItem earningToolsItem2;
        boolean z3;
        String str3;
        EarningsHomeViewModel.EarnerModeSheet earnerModeSheet;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(845667659);
        Object rememberedValue = gapComposer3.rememberedValue();
        final int i3 = 0;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            rememberedValue = StateFlowKt.mapState(this.earningsSyncStateRepository.homeUiState, new Function1(this) { // from class: com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ EarningsHomePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration;
                    int i4 = i3;
                    EarningsParsingErrorFactory earningsParsingErrorFactory = EarningsParsingErrorFactory.INSTANCE;
                    EarningsHomePresenter earningsHomePresenter = this.f$0;
                    switch (i4) {
                        case 0:
                            EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
                            if (earningsHomeUIState == null || (earningsHomeConfiguration = earningsHomeUIState.earnings_home_configuration) == null) {
                                return null;
                            }
                            try {
                                ProtoValidationScope protoValidationScope = new ProtoValidationScope(earningsHomeConfiguration, earningsParsingErrorFactory, earningsHomePresenter);
                                EarningsHomeUi earningsHomeUi = earningsHomeConfiguration.earnings_home_ui;
                                ProtoValidationScope.required(earningsHomeUi, "earnings_home_ui");
                                try {
                                    EarningsUiConfiguration.EarningsHomeUi earningsHomeUi2 = zzy.toEarningsHomeUi(new ProtoValidationScope(earningsHomeUi, earningsParsingErrorFactory, protoValidationScope), earningsHomeUi);
                                    EmptyList emptyList = EmptyList.INSTANCE;
                                    return new EarningsUiConfiguration(earningsHomeUi2, emptyList, emptyList);
                                } catch (Exception e) {
                                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUi.class), earningsParsingErrorFactory, null);
                                }
                            } catch (Exception e2) {
                                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUIState.EarningsHomeConfiguration.class), earningsParsingErrorFactory, null);
                            }
                        default:
                            AllocationDistribution allocationDistribution = (AllocationDistribution) obj;
                            allocationDistribution.getClass();
                            try {
                                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(allocationDistribution, earningsParsingErrorFactory, earningsHomePresenter);
                                List<AllocationDistribution.DestinationAndShare> list = allocationDistribution.allocations;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(EarningsAllocationDistributionMappersKt.toDestinationAndShare(protoValidationScope2, (AllocationDistribution.DestinationAndShare) it3.next()));
                                }
                                return new EarningsAllocationDistribution(arrayList3);
                            } catch (Exception e3) {
                                throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.class), earningsParsingErrorFactory, null);
                            }
                    }
                }
            });
            gapComposer3.updateRememberedValue(rememberedValue);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer3);
        Object rememberedValue2 = gapComposer3.rememberedValue();
        final int i4 = 1;
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy2) {
            rememberedValue2 = this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksAllocationDistribution, null, new Function1(this) { // from class: com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ EarningsHomePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration;
                    int i42 = i4;
                    EarningsParsingErrorFactory earningsParsingErrorFactory = EarningsParsingErrorFactory.INSTANCE;
                    EarningsHomePresenter earningsHomePresenter = this.f$0;
                    switch (i42) {
                        case 0:
                            EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
                            if (earningsHomeUIState == null || (earningsHomeConfiguration = earningsHomeUIState.earnings_home_configuration) == null) {
                                return null;
                            }
                            try {
                                ProtoValidationScope protoValidationScope = new ProtoValidationScope(earningsHomeConfiguration, earningsParsingErrorFactory, earningsHomePresenter);
                                EarningsHomeUi earningsHomeUi = earningsHomeConfiguration.earnings_home_ui;
                                ProtoValidationScope.required(earningsHomeUi, "earnings_home_ui");
                                try {
                                    EarningsUiConfiguration.EarningsHomeUi earningsHomeUi2 = zzy.toEarningsHomeUi(new ProtoValidationScope(earningsHomeUi, earningsParsingErrorFactory, protoValidationScope), earningsHomeUi);
                                    EmptyList emptyList = EmptyList.INSTANCE;
                                    return new EarningsUiConfiguration(earningsHomeUi2, emptyList, emptyList);
                                } catch (Exception e) {
                                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUi.class), earningsParsingErrorFactory, null);
                                }
                            } catch (Exception e2) {
                                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUIState.EarningsHomeConfiguration.class), earningsParsingErrorFactory, null);
                            }
                        default:
                            AllocationDistribution allocationDistribution = (AllocationDistribution) obj;
                            allocationDistribution.getClass();
                            try {
                                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(allocationDistribution, earningsParsingErrorFactory, earningsHomePresenter);
                                List<AllocationDistribution.DestinationAndShare> list = allocationDistribution.allocations;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(EarningsAllocationDistributionMappersKt.toDestinationAndShare(protoValidationScope2, (AllocationDistribution.DestinationAndShare) it3.next()));
                                }
                                return new EarningsAllocationDistribution(arrayList3);
                            } catch (Exception e3) {
                                throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.class), earningsParsingErrorFactory, null);
                            }
                    }
                }
            });
            gapComposer3.updateRememberedValue(rememberedValue2);
        }
        MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue2, gapComposer3);
        Object rememberedValue3 = gapComposer3.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy2) {
            rememberedValue3 = this.disclosureProvider.disclosure(DisclosureForScreen.PAYCHECKS, "");
            gapComposer3.updateRememberedValue(rememberedValue3);
        }
        Flow flow2 = (Flow) rememberedValue3;
        MutableState collectAsState = Updater.collectAsState(flow2, null, null, gapComposer3, 48, 2);
        GapComposer gapComposer4 = gapComposer3;
        EarningsUiConfiguration earningsUiConfiguration = (EarningsUiConfiguration) receiveValueAsState.getValue();
        boolean changed = gapComposer4.changed(earningsUiConfiguration != null ? earningsUiConfiguration.home : null) | gapComposer4.changed(this.activityContext);
        Object rememberedValue4 = gapComposer4.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy2) {
            EarningsUiConfiguration earningsUiConfiguration2 = (EarningsUiConfiguration) receiveValueAsState.getValue();
            String str4 = (earningsUiConfiguration2 == null || (activitySection2 = getActivitySection(earningsUiConfiguration2.home)) == null) ? null : activitySection2.loadFailureSubtitle;
            EarningsUiConfiguration earningsUiConfiguration3 = (EarningsUiConfiguration) receiveValueAsState.getValue();
            rememberedValue4 = this.activityEmbeddedPresenterFactory.create(this.navigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(this.activityContext, null, null, new ArcadeModal$$ExternalSyntheticLambda2(this, 11), 3, (earningsUiConfiguration3 == null || (activitySection = getActivitySection(earningsUiConfiguration3.home)) == null) ? null : activitySection.noActivitySubtitle, str4, InputEventTrigger.Companion.decoratedWith(this.defaultActivityItemEventHandlerFactory, this.earningsActivityItemEventDecorator), null, null, 7242));
            gapComposer4.updateRememberedValue(rememberedValue4);
        }
        UiCallbackModel models = ((RealActivityEmbeddedPresenter) rememberedValue4).models(gapComposer4, 0);
        Object rememberedValue5 = gapComposer4.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy2) {
            rememberedValue5 = Updater.mutableStateOf$default(EarningsHomeViewModel.EarnerModeSheet.SubmitState.IDLE);
            gapComposer4.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState3 = (MutableState) rememberedValue5;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer4.changedInstance(this);
        Object rememberedValue6 = gapComposer4.rememberedValue();
        if (changedInstance || rememberedValue6 == neverEqualPolicy2) {
            rememberedValue6 = new RealAppConfigManager$update$2$2(this, continuation, 20);
            gapComposer4.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue6);
        boolean changedInstance2 = gapComposer4.changedInstance(this);
        Object rememberedValue7 = gapComposer4.rememberedValue();
        if (changedInstance2 || rememberedValue7 == neverEqualPolicy2) {
            rememberedValue7 = new EarningsHomePresenter$models$2$1(this, continuation, i3);
            gapComposer4.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue7);
        EarningsHomePresenter earningsHomePresenter = this;
        Continuation continuation2 = null;
        Updater.LaunchedEffect(gapComposer4, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation2, earningsHomePresenter, mutableState3, 2));
        EarningsUiConfiguration earningsUiConfiguration4 = (EarningsUiConfiguration) receiveValueAsState.getValue();
        if (earningsUiConfiguration4 == null) {
            gapComposer4.end(false);
            return EarningsHomeViewModel.Loading.INSTANCE;
        }
        ArrayList arrayList3 = earningsUiConfiguration4.home.sections;
        UiCallbackModel models2 = earningsHomePresenter.headerPresenter.models(gapComposer4);
        Disclosure disclosure = (Disclosure) collectAsState.getValue();
        EarningsAllocationDistribution earningsAllocationDistribution = (EarningsAllocationDistribution) receiveValueAsState2.getValue();
        EarningsHomeViewModel.EarnerModeSheet.SubmitState submitState = (EarningsHomeViewModel.EarnerModeSheet.SubmitState) mutableState3.getValue();
        if (!arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (((EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection) it3.next()) instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.FdicFooterSection) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(disclosure != null ? disclosure.text : null);
        boolean z4 = (disclosure != null && disclosure.showIcon) || z;
        EarningsHomeViewModel.Loaded.DisclosureFooter disclosureFooter2 = continuation2;
        if (!listOfNotNull.isEmpty() || z) {
            disclosureFooter2 = new EarningsHomeViewModel.Loaded.DisclosureFooter(z4, listOfNotNull);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection earningsHomeSection = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection) it4.next();
            if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.HeaderSection) {
                it = it4;
                uiCallbackModel2 = models2;
                z2 = z;
                arrayList = arrayList4;
                mutableState = collectAsState;
                gapComposer = gapComposer4;
                disclosureFooter = new EarningsHomeViewModel.SectionContent.Header(models2);
                neverEqualPolicy = neverEqualPolicy2;
                i2 = i4;
                uiCallbackModel = models;
            } else {
                if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection) {
                    it = it4;
                    uiCallbackModel2 = models2;
                    z2 = z;
                    arrayList = arrayList4;
                    mutableState = collectAsState;
                    gapComposer = gapComposer4;
                    disclosureFooter = new EarningsHomeViewModel.SectionContent.Activity(new EarningsHomeViewModel.EarningsActivity(models, ((EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection) earningsHomeSection).title));
                    neverEqualPolicy = neverEqualPolicy2;
                    uiCallbackModel = models;
                } else if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActiveDistributionSection) {
                    it = it4;
                    uiCallbackModel2 = models2;
                    z2 = z;
                    arrayList = arrayList4;
                    mutableState = collectAsState;
                    gapComposer = gapComposer4;
                    neverEqualPolicy = neverEqualPolicy2;
                    uiCallbackModel = models;
                    disclosureFooter = null;
                } else if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.DistributionNuxSection) {
                    EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.DistributionNuxSection distributionNuxSection = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.DistributionNuxSection) earningsHomeSection;
                    it = it4;
                    z2 = z;
                    uiCallbackModel = models;
                    neverEqualPolicy = neverEqualPolicy2;
                    uiCallbackModel2 = models2;
                    arrayList = arrayList4;
                    mutableState = collectAsState;
                    gapComposer = gapComposer4;
                    disclosureFooter = new EarningsHomeViewModel.SectionContent.Distributions(new EarningsHomeViewModel$DistributionsSection$NullState(distributionNuxSection.title, distributionNuxSection.subtitle, distributionNuxSection.callToActionText, new EarningsHomeViewEvent.CallToAction(distributionNuxSection.callToActionClientRoute)));
                } else {
                    it = it4;
                    z2 = z;
                    neverEqualPolicy = neverEqualPolicy2;
                    uiCallbackModel = models;
                    if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection) {
                        ArrayList<EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection.ActionButtonItem> arrayList5 = ((EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection) earningsHomeSection).buttons;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                        for (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection.ActionButtonItem actionButtonItem : arrayList5) {
                            arrayList6.add(new EarningsHomeViewModel.Loaded.Button(actionButtonItem.text, new EarningsHomeViewEvent.CallToAction(actionButtonItem.clientRouteURL)));
                        }
                        uiCallbackModel2 = models2;
                        arrayList = arrayList4;
                        mutableState = collectAsState;
                        gapComposer = gapComposer4;
                        i2 = 1;
                        disclosureFooter = new EarningsHomeViewModel.SectionContent.ActionButtons(arrayList6);
                    } else if (earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection) {
                        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection earningToolsSection = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection) earningsHomeSection;
                        ArrayList arrayList7 = earningToolsSection.tools;
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it5 = arrayList7.iterator();
                        while (true) {
                            boolean hasNext = it5.hasNext();
                            AndroidStringManager androidStringManager = earningsHomePresenter.stringManager;
                            if (hasNext) {
                                EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem earningToolItem = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem) it5.next();
                                if (earningToolItem instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerMode) {
                                    EarningsHomeViewModel.EarningToolType earningToolType = EarningsHomeViewModel.EarningToolType.EARNER_MODE;
                                    EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerMode earnerMode = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerMode) earningToolItem;
                                    boolean z5 = earnerMode.isEnabled;
                                    it2 = it5;
                                    String str5 = earnerMode.title;
                                    Instant instant = earnerMode.earnerModeEndsAt;
                                    if (!z5 || instant == null) {
                                        z3 = z5;
                                        mutableState2 = collectAsState;
                                        str3 = earnerMode.subtitle;
                                    } else {
                                        z3 = z5;
                                        AndroidDateFormatManager androidDateFormatManager = earningsHomePresenter.dateFormatManager;
                                        mutableState2 = collectAsState;
                                        String format2 = androidDateFormatManager.getDateFormat("jmm", androidDateFormatManager.clock.timeZone()).formatter.format(instant);
                                        format2.getClass();
                                        Locale locale = Locale.getDefault();
                                        locale.getClass();
                                        String lowerCase = format2.toLowerCase(locale);
                                        lowerCase.getClass();
                                        String replace = EarningsHomePresenterKt.SPACE_BEFORE_DAY_PERIOD_REGEX.replace(lowerCase, "");
                                        ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, replace, "time", replace);
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        str3 = new MessageFormat(resources.getString(R.string.earning_tool_earner_mode_ends_at)).format(m);
                                        str3.getClass();
                                    }
                                    String str6 = str3;
                                    String str7 = z3 ? androidStringManager.get(R.string.earning_tool_earner_mode_status_on) : androidStringManager.get(R.string.earning_tool_earner_mode_status_off);
                                    String str8 = earnerMode.clientRoute;
                                    EarningsHomeViewEvent.EarnerToolTapped earnerToolTapped = str8 != null ? new EarningsHomeViewEvent.EarnerToolTapped(earningToolType, str8) : null;
                                    EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerModeSheetData earnerModeSheetData = earnerMode.sheetData;
                                    if (earnerModeSheetData != null) {
                                        String str9 = earnerModeSheetData.title;
                                        String str10 = earnerModeSheetData.body;
                                        ArrayList arrayList9 = earnerModeSheetData.durationOptions;
                                        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                        Iterator it6 = arrayList9.iterator();
                                        while (it6.hasNext()) {
                                            arrayList10.add(new EarningsHomeViewModel.EarnerModeSheet.DurationOption(((EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerModeSheetData.DurationOption) it6.next()).seconds));
                                            it6 = it6;
                                            str10 = str10;
                                        }
                                        earnerModeSheet = new EarningsHomeViewModel.EarnerModeSheet(str9, str10, arrayList10, earnerModeSheetData.primaryButtonText, submitState);
                                    } else {
                                        earnerModeSheet = null;
                                    }
                                    earningToolsItem2 = new EarningsHomeViewModel.EarningToolsItem(earningToolType, str5, str6, str7, earnerToolTapped, earnerModeSheet, null, 64);
                                } else {
                                    it2 = it5;
                                    mutableState2 = collectAsState;
                                    if (earningToolItem instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerOnboarding) {
                                        EarningsHomeViewModel.EarningToolType earningToolType2 = EarningsHomeViewModel.EarningToolType.EARNER_ONBOARDING;
                                        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerOnboarding earnerOnboarding = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerOnboarding) earningToolItem;
                                        earningToolsItem2 = new EarningsHomeViewModel.EarningToolsItem(earningToolType2, earnerOnboarding.title, earnerOnboarding.subtitle, null, new EarningsHomeViewEvent.EarnerToolTapped(earningToolType2, earnerOnboarding.clientRoute), null, null, 96);
                                    } else if (earningToolItem instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.ManageCustomers) {
                                        EarningsHomeViewModel.EarningToolType earningToolType3 = EarningsHomeViewModel.EarningToolType.MANAGE_CUSTOMERS;
                                        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.ManageCustomers manageCustomers = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.ManageCustomers) earningToolItem;
                                        earningToolsItem2 = new EarningsHomeViewModel.EarningToolsItem(earningToolType3, manageCustomers.title, manageCustomers.subtitle, null, new EarningsHomeViewEvent.EarnerToolTapped(earningToolType3, manageCustomers.clientRoute), null, null, 96);
                                    } else if (earningToolItem instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.AddPaycheck) {
                                        EarningsHomeViewModel.EarningToolType earningToolType4 = EarningsHomeViewModel.EarningToolType.ADD_PAYCHECK;
                                        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.AddPaycheck addPaycheck = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.AddPaycheck) earningToolItem;
                                        earningToolsItem2 = new EarningsHomeViewModel.EarningToolsItem(earningToolType4, addPaycheck.title, addPaycheck.subtitle, null, new EarningsHomeViewEvent.EarnerToolTapped(earningToolType4, addPaycheck.clientRoute), null, null, 96);
                                    } else {
                                        if (!(earningToolItem instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.PaycheckDistribution)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        EarningsHomeViewModel.EarningToolType earningToolType5 = EarningsHomeViewModel.EarningToolType.PAYCHECK_DISTRIBUTION;
                                        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.PaycheckDistribution paycheckDistribution = (EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.PaycheckDistribution) earningToolItem;
                                        String str11 = paycheckDistribution.title;
                                        if (earningsAllocationDistribution != null) {
                                            NumberFormat percentInstance = NumberFormat.getPercentInstance();
                                            percentInstance.getClass();
                                            ArrayList arrayList11 = earningsAllocationDistribution.allocations;
                                            ArrayList arrayList12 = new ArrayList();
                                            for (Object obj : arrayList11) {
                                                String str12 = str11;
                                                UiCallbackModel uiCallbackModel4 = models2;
                                                if (((EarningsAllocationDistribution.DestinationAndShare) obj).shareInBasisPoints > 0) {
                                                    arrayList12.add(obj);
                                                }
                                                models2 = uiCallbackModel4;
                                                str11 = str12;
                                            }
                                            str = str11;
                                            uiCallbackModel3 = models2;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it7 = arrayList12.iterator();
                                            while (it7.hasNext()) {
                                                Object next = it7.next();
                                                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(((EarningsAllocationDistribution.DestinationAndShare) next).destination.getClass());
                                                Object obj2 = linkedHashMap.get(orCreateKotlinClass);
                                                if (obj2 == null) {
                                                    obj2 = new ArrayList();
                                                    linkedHashMap.put(orCreateKotlinClass, obj2);
                                                }
                                                ((List) obj2).add(next);
                                            }
                                            ArrayList arrayList13 = new ArrayList(linkedHashMap.size());
                                            Iterator it8 = linkedHashMap.entrySet().iterator();
                                            while (it8.hasNext()) {
                                                List list = (List) ((Map.Entry) it8.next()).getValue();
                                                AllocationDestination allocationDestination = ((EarningsAllocationDistribution.DestinationAndShare) CollectionsKt.first(list)).destination;
                                                GapComposer gapComposer5 = gapComposer4;
                                                long j = 0;
                                                for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                                                    j += ((EarningsAllocationDistribution.DestinationAndShare) it9.next()).shareInBasisPoints;
                                                    arrayList4 = arrayList4;
                                                    it8 = it8;
                                                }
                                                arrayList13.add(new EarningsAllocationDistribution.DestinationAndShare(allocationDestination, j));
                                                gapComposer4 = gapComposer5;
                                                it8 = it8;
                                            }
                                            arrayList2 = arrayList4;
                                            gapComposer2 = gapComposer4;
                                            if (arrayList13.isEmpty()) {
                                                str2 = null;
                                            } else {
                                                Comparator thenComparing = new b.C0008b(12).thenComparing(new VideoCapture$$ExternalSyntheticLambda6(new AllowanceViewKt$$ExternalSyntheticLambda3(9), 8));
                                                thenComparing.getClass();
                                                str2 = CollectionsKt.joinToString$default(CollectionsKt.sortedWith(CollectionsKt.sortedWith(arrayList13, thenComparing), new b.C0008b(13)), ", ", null, null, 0, null, new ProfileQueries$$ExternalSyntheticLambda13(19, percentInstance, androidStringManager), 30);
                                            }
                                        } else {
                                            str = str11;
                                            uiCallbackModel3 = models2;
                                            arrayList2 = arrayList4;
                                            gapComposer2 = gapComposer4;
                                        }
                                        str2 = androidStringManager.get(R.string.earning_tool_paycheck_distribution_subtitle);
                                        String str13 = str2;
                                        EarningsHomeViewEvent.EarnerToolTapped earnerToolTapped2 = new EarningsHomeViewEvent.EarnerToolTapped(EarningsHomeViewModel.EarningToolType.PAYCHECK_DISTRIBUTION, paycheckDistribution.clientRoute);
                                        List take = CollectionsKt.take(paycheckDistribution.avatars, 2);
                                        int i5 = ActiveDistributionRenderingFallbackKt.$r8$clinit;
                                        take.getClass();
                                        List list2 = take;
                                        c = '\n';
                                        ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                        Iterator it10 = list2.iterator();
                                        while (it10.hasNext()) {
                                            arrayList14.add(StackedAvatarViewModelKt.toStackedAvatarViewModel((UiAvatar) it10.next()).avatar);
                                        }
                                        int size = arrayList14.size();
                                        if (size != 0) {
                                            if (size == 1) {
                                                single = new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList14.get(0));
                                            } else if (size != 2) {
                                                stackedAvatarViewModel = new StackedAvatarViewModel.Trio((StackedAvatarViewModel.Avatar) arrayList14.get(0), (StackedAvatarViewModel.Avatar) arrayList14.get(1), (StackedAvatarViewModel.Avatar) arrayList14.get(2), true, arrayList14.size() - 1);
                                            } else {
                                                single = new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList14.get(0), (StackedAvatarViewModel.Avatar) arrayList14.get(1));
                                            }
                                            stackedAvatarViewModel = single;
                                        } else {
                                            stackedAvatarViewModel = null;
                                        }
                                        earningToolsItem = new EarningsHomeViewModel.EarningToolsItem(earningToolType5, str, str13, null, earnerToolTapped2, null, stackedAvatarViewModel, 32);
                                        arrayList8.add(earningToolsItem);
                                        earningsHomePresenter = this;
                                        models2 = uiCallbackModel3;
                                        gapComposer4 = gapComposer2;
                                        arrayList4 = arrayList2;
                                        it5 = it2;
                                        collectAsState = mutableState2;
                                    }
                                }
                                uiCallbackModel3 = models2;
                                arrayList2 = arrayList4;
                                gapComposer2 = gapComposer4;
                                earningToolsItem = earningToolsItem2;
                                c = '\n';
                                arrayList8.add(earningToolsItem);
                                earningsHomePresenter = this;
                                models2 = uiCallbackModel3;
                                gapComposer4 = gapComposer2;
                                arrayList4 = arrayList2;
                                it5 = it2;
                                collectAsState = mutableState2;
                            } else {
                                uiCallbackModel2 = models2;
                                arrayList = arrayList4;
                                mutableState = collectAsState;
                                gapComposer = gapComposer4;
                                i2 = 1;
                                String str14 = earningToolsSection.title;
                                if (str14 == null) {
                                    str14 = androidStringManager.get(R.string.earning_tools_section_title);
                                }
                                if (!arrayList8.isEmpty()) {
                                    disclosureFooter = new EarningsHomeViewModel.SectionContent.EarningTools(str14, arrayList8);
                                }
                            }
                        }
                        disclosureFooter = null;
                    } else {
                        uiCallbackModel2 = models2;
                        arrayList = arrayList4;
                        mutableState = collectAsState;
                        gapComposer = gapComposer4;
                        i2 = 1;
                        if (!(earningsHomeSection instanceof EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.FdicFooterSection)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (disclosureFooter2 != 0) {
                            disclosureFooter = new EarningsHomeViewModel.SectionContent.DisclosureFooter(disclosureFooter2);
                        }
                        disclosureFooter = null;
                    }
                }
                i2 = 1;
            }
            ArrayList arrayList15 = arrayList;
            if (disclosureFooter != null) {
                arrayList15.add(disclosureFooter);
            }
            earningsHomePresenter = this;
            i4 = i2;
            models2 = uiCallbackModel2;
            gapComposer4 = gapComposer;
            z = z2;
            models = uiCallbackModel;
            neverEqualPolicy2 = neverEqualPolicy;
            collectAsState = mutableState;
            arrayList4 = arrayList15;
            it4 = it;
        }
        UiCallbackModel uiCallbackModel5 = models2;
        ArrayList arrayList16 = arrayList4;
        MutableState mutableState4 = collectAsState;
        GapComposer gapComposer6 = gapComposer4;
        NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
        ArrayList plus = (z || disclosureFooter2 == 0) ? arrayList16 : CollectionsKt.plus((Collection) arrayList16, (Object) new EarningsHomeViewModel.SectionContent.DisclosureFooter(disclosureFooter2));
        if (!plus.isEmpty()) {
            Iterator it11 = plus.iterator();
            while (it11.hasNext()) {
                if (((EarningsHomeViewModel.SectionContent) it11.next()) instanceof EarningsHomeViewModel.SectionContent.Header) {
                    break;
                }
            }
        }
        plus = CollectionsKt.plus((Iterable) plus, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new EarningsHomeViewModel.SectionContent.Header(uiCallbackModel5)));
        ArrayList arrayList17 = plus;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(arrayList17, gapComposer6);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance3 = gapComposer6.changedInstance(flow2) | gapComposer6.changed(mutableState4) | gapComposer6.changedInstance(this) | gapComposer6.changed(rememberUpdatedState);
        Object rememberedValue8 = gapComposer6.rememberedValue();
        if (changedInstance3 || rememberedValue8 == neverEqualPolicy3) {
            RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(flow2, this, mutableState4, rememberUpdatedState, null, 3);
            gapComposer6.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
            rememberedValue8 = realFidesmoClient$observeDeviceState$1;
        }
        Updater.LaunchedEffect(gapComposer6, unit2, (Function2) rememberedValue8);
        EarningsHomeViewModel.Loaded loaded = new EarningsHomeViewModel.Loaded(arrayList17);
        gapComposer6.end(false);
        return loaded;
    }
}
