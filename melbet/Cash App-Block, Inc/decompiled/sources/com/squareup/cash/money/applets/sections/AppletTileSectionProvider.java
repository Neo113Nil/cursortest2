package com.squareup.cash.money.applets.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$InstalledAppletRedesign;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.applets.sections.CustomResult;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.SectionProviderId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class AppletTileSectionProvider implements SectionProvider {
    public final RealMoneyContentSpanTrackingService appletSpanTrackingService;
    public final Set applets;
    public final StateFlowKt$stateFlowOf$1 availabilityState = new StateFlowKt$stateFlowOf$1(SectionAvailabilityState.AVAILABLE);
    public final RealBalancePrivacy balancePrivacy;
    public final zzr clientRecommendationProvider;
    public final RealMoneyContentSpanTrackingService contentSpanTrackingService;
    public final ErrorReporter errorReporter;
    public final RealFamilyProfileManager familyProfileManager;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final LinkedHashSet missingAppletIds;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealAppletTileServerRecommendationProvider serverRecommendationProvider;
    public final AndroidStringManager stringManager;
    public final AppletTileUninstalledRowVariantProvider uninstalledRowVariantProvider;

    public interface Element {

        public final class Loaded implements Element {
            public final AppletTileItem item;

            public Loaded(AppletTileItem appletTileItem) {
                this.item = appletTileItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && this.item.equals(((Loaded) obj).item);
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final String toString() {
                return "Loaded(item=" + this.item + ")";
            }
        }

        public final class Loading implements Element {
            public final AppletId appletId;

            public Loading(AppletId appletId) {
                appletId.getClass();
                this.appletId = appletId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && this.appletId == ((Loading) obj).appletId;
            }

            public final int hashCode() {
                return this.appletId.hashCode();
            }

            public final String toString() {
                return "Loading(appletId=" + this.appletId + ")";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppletAvailabilityState.values().length];
            try {
                AppletAvailabilityState appletAvailabilityState = AppletAvailabilityState.AVAILABLE;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppletAvailabilityState appletAvailabilityState2 = AppletAvailabilityState.AVAILABLE;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AppletAvailabilityState appletAvailabilityState3 = AppletAvailabilityState.AVAILABLE;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppletTileSectionProvider(Set set, RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService, zzr zzrVar, RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider, zzb zzbVar, AppletTileUninstalledRowVariantProvider appletTileUninstalledRowVariantProvider, RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService2, RealFamilyProfileManager realFamilyProfileManager, RealBalancePrivacy realBalancePrivacy, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, ErrorReporter errorReporter, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator) {
        this.applets = set;
        this.appletSpanTrackingService = realMoneyContentSpanTrackingService;
        this.clientRecommendationProvider = zzrVar;
        this.serverRecommendationProvider = realAppletTileServerRecommendationProvider;
        this.uninstalledRowVariantProvider = appletTileUninstalledRowVariantProvider;
        this.contentSpanTrackingService = realMoneyContentSpanTrackingService2;
        this.familyProfileManager = realFamilyProfileManager;
        this.balancePrivacy = realBalancePrivacy;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.errorReporter = errorReporter;
        this.ioDispatcher = coroutineContext;
        this.navigator = screenNavigator;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Applet) it.next()).id);
        }
        this.missingAppletIds = CollectionsKt.toMutableSet(arrayList);
    }

    public static StateFlow section(AppletTile appletTile, AppletTileInstallationState appletTileInstallationState) {
        if (appletTileInstallationState instanceof AppletTileInstallationState.Installed) {
            return StateFlowKt.mapState(appletTile.getInstallationSectionId(), new CashMapViewKt$$ExternalSyntheticLambda0(27));
        }
        if (appletTileInstallationState instanceof AppletTileInstallationState.Uninstalled) {
            return StateFlowKt.mapState(appletTile.uninstallationSectionId(), new CashMapViewKt$$ExternalSyntheticLambda0(28));
        }
        if (appletTileInstallationState instanceof AppletTileInstallationState.Loading) {
            return new StateFlowKt$stateFlowOf$1(new CustomResult.Success(null));
        }
        if (appletTileInstallationState instanceof AppletTileInstallationState.Failure) {
            return new StateFlowKt$stateFlowOf$1(new CustomResult.Failure(Unit.INSTANCE));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final StateFlow getAvailabilityState() {
        return this.availabilityState;
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final SectionProviderId getId() {
        return SectionProviderId.APPLET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        CoroutineScope coroutineScope;
        ?? r4;
        Object derivedStateFlow;
        RealFamilyProfileManager realFamilyProfileManager = this.familyProfileManager;
        ReadonlyStateFlow readonlyStateFlow = realFamilyProfileManager.familyProfile;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-908596474);
        Set set = this.applets;
        boolean z = true;
        boolean z2 = true;
        int i2 = 0;
        if (set.isEmpty()) {
            SectionProvider.Content content = new SectionProvider.Content(EmptyList.INSTANCE, true);
            gapComposer.end(false);
            return content;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(createCompositionCoroutineScope);
            obj = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) obj;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj2 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$InstalledAppletRedesign.INSTANCE)).enabled());
            gapComposer.updateRememberedValue(valueOf);
            obj2 = valueOf;
        }
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i3 = 10;
        Object obj3 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            DerivedStateFlow mapState = StateFlowKt.mapState(readonlyStateFlow, new MoneyTabUIKt$$ExternalSyntheticLambda24(booleanValue, i3));
            gapComposer.updateRememberedValue(mapState);
            obj3 = mapState;
        }
        StateFlow stateFlow = (StateFlow) obj3;
        boolean changed = gapComposer.changed(set);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue4 == neverEqualPolicy) {
            Set<Applet> set2 = set;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
            for (Applet applet : set2) {
                StateFlow stateFlow2 = stateFlow;
                CoroutineScope coroutineScope3 = coroutineScope2;
                Lazy lazy = LazyKt.lazy(new ta$$ExternalSyntheticLambda1(this, applet, coroutineScope3, StateFlowKt.mapState(Countries.observeState(this.balancePrivacy.obfuscationEnabled), new MoneyTabUIKt$$ExternalSyntheticLambda13(6)), stateFlow2, 14));
                AppletId appletId = applet.id;
                appletId.getClass();
                RealMoneyContentSpanTrackingService.AppletTileOperation appletTileOperation = RealMoneyContentSpanTrackingService.AppletTileOperation.AVAILABILITY_LOAD;
                RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = this.appletSpanTrackingService;
                realMoneyContentSpanTrackingService.startSpan(appletId, appletTileOperation);
                realMoneyContentSpanTrackingService.startSpan(appletId, RealMoneyContentSpanTrackingService.AppletTileOperation.TOTAL_LOAD);
                StateFlow stateFlow3 = applet.availabilityState;
                Continuation continuation2 = continuation;
                arrayList.add(FlowKt.stateIn(FlowKt.transformLatest(stateFlow3, new PaymentActionHandler$transform$$inlined$flatMapLatest$2(this, applet, lazy, continuation2, 3)), coroutineScope3, SharingStarted.Companion.Lazily, WhenMappings.$EnumSwitchMapping$0[((AppletAvailabilityState) stateFlow3.getValue()).ordinal()] == 3 ? (Element) ((StateFlow) lazy.getValue()).getValue() : continuation2));
                continuation = continuation2;
                coroutineScope2 = coroutineScope3;
                stateFlow = stateFlow2;
            }
            coroutineScope = coroutineScope2;
            r4 = continuation;
            derivedStateFlow = new DerivedStateFlow(new OTPController$special$$inlined$combineAsStateFlow$2(1, arrayList), new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), 5));
            gapComposer.updateRememberedValue(derivedStateFlow);
        } else {
            derivedStateFlow = rememberedValue4;
            r4 = 0;
            coroutineScope = coroutineScope2;
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) derivedStateFlow, r4, gapComposer, 1);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            Map map = (Map) ((StateFlow) this.serverRecommendationProvider.cachedUninstalledSectionSortValues$delegate.getValue()).getValue();
            gapComposer.updateRememberedValue(map);
            obj4 = map;
        }
        Map map2 = (Map) obj4;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(map2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue6;
        if (changedInstance || rememberedValue6 == neverEqualPolicy) {
            MusicPresenter$models$1$1 musicPresenter$models$1$1 = new MusicPresenter$models$1$1(this, map2, r4);
            gapComposer.updateRememberedValue(musicPresenter$models$1$1);
            obj5 = musicPresenter$models$1$1;
        }
        MutableState produceState = Updater.produceState(gapComposer, map2, (Function2) obj5);
        Object rememberedValue7 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue7;
        if (rememberedValue7 == neverEqualPolicy) {
            DerivedStateFlow mapState2 = StateFlowKt.mapState(readonlyStateFlow, new RecipientQueries$$ExternalSyntheticLambda0(realFamilyProfileManager, 26));
            gapComposer.updateRememberedValue(mapState2);
            obj6 = mapState2;
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) obj6, r4, gapComposer, 1);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue8;
        if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
            AppletTileSectionProvider$models$1$1 appletTileSectionProvider$models$1$1 = new AppletTileSectionProvider$models$1$1(this, r4, i2);
            gapComposer.updateRememberedValue(appletTileSectionProvider$models$1$1);
            obj7 = appletTileSectionProvider$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, this, (Function2) obj7);
        List list = (List) collectAsState.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        Object obj8 = rememberedValue9;
        if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
            AppletTileSectionProvider$models$1$1 appletTileSectionProvider$models$1$12 = new AppletTileSectionProvider$models$1$1(this, r4, z2 ? 1 : 0);
            gapComposer.updateRememberedValue(appletTileSectionProvider$models$1$12);
            obj8 = appletTileSectionProvider$models$1$12;
        }
        Updater.LaunchedEffect(gapComposer, list, (Function2) obj8);
        boolean changed2 = gapComposer.changed((List) collectAsState.getValue()) | gapComposer.changed((String) collectAsState2.getValue()) | gapComposer.changed((Map) produceState.getValue());
        Object rememberedValue10 = gapComposer.rememberedValue();
        Object obj9 = rememberedValue10;
        if (changed2 || rememberedValue10 == neverEqualPolicy) {
            DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new ta$$ExternalSyntheticLambda1(this, coroutineScope, collectAsState, produceState, collectAsState2, 13));
            gapComposer.updateRememberedValue(derivedStateOf);
            obj9 = derivedStateOf;
        }
        List list2 = (List) ((State) obj9).getValue();
        List list3 = (List) collectAsState.getValue();
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((Element) it.next()) instanceof Element.Loading) {
                    break;
                }
            }
        }
        z = false;
        SectionProvider.Content content2 = new SectionProvider.Content(list2, z);
        gapComposer.end(false);
        return content2;
    }
}
