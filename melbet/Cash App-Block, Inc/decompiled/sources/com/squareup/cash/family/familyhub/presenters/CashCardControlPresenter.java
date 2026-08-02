package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.SponseeCashAppTag;
import com.squareup.cash.family.familyhub.backend.api.TagLockResult;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealTagLockService;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesSponsorDrivenCardLimits;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashCardControlPresenter extends BaseDependentControlPresenter {
    public final FeatureFlagManager featureFlagManager;
    public final ParcelableSnapshotMutableState inFlightTagDeviceIds$delegate;
    public final MoneyFormatter moneyFormatter;
    public SponseeCashAppTag pendingTagDisable;
    public final RealTagLockService tagLockService;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider deps;
        public final DoubleCheck featureFlagManager;
        public final Provider moneyFormatterFactory;
        public final InstanceFactory sandboxedScope;
        public final DoubleCheck tagLockService;

        public /* synthetic */ MetroFactory(MoneyUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory) {
            this.deps = metroFactory;
            this.featureFlagManager = doubleCheck;
            this.tagLockService = doubleCheck2;
            this.moneyFormatterFactory = metroFactory2;
            this.sandboxedScope = instanceFactory;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagFormFactor.values().length];
            try {
                TagFormFactor tagFormFactor = TagFormFactor.WAND;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TagFormFactor tagFormFactor2 = TagFormFactor.WAND;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TagFormFactor tagFormFactor3 = TagFormFactor.WAND;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TagFormFactor tagFormFactor4 = TagFormFactor.WAND;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TagFormFactor tagFormFactor5 = TagFormFactor.WAND;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TagFormFactor tagFormFactor6 = TagFormFactor.WAND;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCardControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, FeatureFlagManager featureFlagManager, RealTagLockService realTagLockService, LocalizedMoneyFormatter.Factory factory, DependentControlScreen.Toggle toggle, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
        toggle.getClass();
        this.featureFlagManager = featureFlagManager;
        this.tagLockService = realTagLockService;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.inFlightTagDeviceIds$delegate = Updater.mutableStateOf$default(EmptySet.INSTANCE);
    }

    public static DependentControlStatus.Loaded lastLoaded(DependentControlStatus dependentControlStatus) {
        if (dependentControlStatus instanceof DependentControlStatus.Loaded) {
            return (DependentControlStatus.Loaded) dependentControlStatus;
        }
        if (dependentControlStatus instanceof DependentControlStatus.Updating) {
            return ((DependentControlStatus.Updating) dependentControlStatus).previousLoaded;
        }
        if (dependentControlStatus instanceof DependentControlStatus.Error) {
            return ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
        }
        if (Intrinsics.areEqual(dependentControlStatus, DependentControlStatus.InitialLoading.INSTANCE)) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        boolean z;
        DependentControlsLimitsViewModel dependentControlsLimitsViewModel;
        String str2;
        String str3;
        Money money;
        Money money2;
        CashCardControlPresenter cashCardControlPresenter = this;
        AndroidStringManager androidStringManager = cashCardControlPresenter.deps.stringManager;
        str.getClass();
        dependentControlStatus.getClass();
        gapComposer.startReplaceGroup(1926373343);
        DependentControlStatus.Loaded lastLoaded = lastLoaded(dependentControlStatus);
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = lastLoaded instanceof DependentControlStatus.Loaded.LoadedCardControl ? (DependentControlStatus.Loaded.LoadedCardControl) lastLoaded : null;
        boolean z2 = lastLoaded != null && lastLoaded.getControlEnabled();
        List list = loadedCardControl != null ? loadedCardControl.sponseeTags : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((SponseeCashAppTag) it.next()).isSponsorLocked) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_p2p_controls_screen_title)).format(new Object[]{str});
        format2.getClass();
        boolean isLoading = zzki.isLoading(dependentControlStatus);
        ControlType controlType = ControlType.CASH_CARD;
        String str4 = androidStringManager.get(R.string.family_account_dependent_cash_app_card_toggle_title);
        Resources resources2 = androidStringManager.resources;
        resources2.getClass();
        String format3 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_cash_card_description)).format(new Object[]{str});
        format3.getClass();
        DependentControlsToggleViewModel dependentControlsToggleViewModel = new DependentControlsToggleViewModel(str4, format3, null, z2);
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cashCardControlPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenCardLimits.INSTANCE)).enabled()) {
            boolean z3 = z2 || z;
            String str5 = androidStringManager.get(R.string.family_account_dependent_limits_title);
            MoneyFormatter moneyFormatter = cashCardControlPresenter.moneyFormatter;
            if (loadedCardControl == null || (money2 = loadedCardControl.remainingUsage) == null) {
                str2 = null;
            } else {
                String format4 = moneyFormatter.format(money2);
                format4.getClass();
                Resources resources3 = androidStringManager.resources;
                resources3.getClass();
                String format5 = new MessageFormat(resources3.getString(R.string.family_account_dependent_limits_subtitle)).format(new Object[]{format4});
                format5.getClass();
                str2 = format5;
            }
            if (loadedCardControl == null || (money = loadedCardControl.currentLimit) == null || (str3 = moneyFormatter.format(money)) == null) {
                str3 = androidStringManager.get(R.string.family_account_dependent_limits_not_set_label);
            }
            dependentControlsLimitsViewModel = new DependentControlsLimitsViewModel(str5, str2, str3, (loadedCardControl != null ? loadedCardControl.currentLimit : null) == null, z3);
        } else {
            dependentControlsLimitsViewModel = null;
        }
        DependentControlViewModel.Toggle toggle = new DependentControlViewModel.Toggle(format2, controlType, dependentControlsToggleViewModel, dependentControlsLimitsViewModel, isLoading, null, null);
        if (list.isEmpty()) {
            gapComposer.end(false);
            return toggle;
        }
        Set set = (Set) cashCardControlPresenter.inFlightTagDeviceIds$delegate.getValue();
        List<SponseeCashAppTag> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (SponseeCashAppTag sponseeCashAppTag : list3) {
            boolean contains = set.contains(sponseeCashAppTag.deviceId);
            String resolveTitle = cashCardControlPresenter.resolveTitle(sponseeCashAppTag);
            String formFactorNoun = cashCardControlPresenter.formFactorNoun(sponseeCashAppTag);
            if (formFactorNoun == null) {
                formFactorNoun = androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_title_fallback);
            }
            ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(2, formFactorNoun, "form_factor", formFactorNoun);
            m.put("first_name", str);
            Resources resources4 = androidStringManager.resources;
            resources4.getClass();
            String format6 = new MessageFormat(resources4.getString(R.string.family_account_dependent_controls_cash_app_tag_description)).format(m);
            format6.getClass();
            arrayList.add(new DependentControlViewModel.Toggle(format2, ControlType.CASH_CARD, new DependentControlsToggleViewModel(resolveTitle, format6, null, !sponseeCashAppTag.isSponsorLocked), null, contains, null, sponseeCashAppTag.deviceId));
            cashCardControlPresenter = this;
            androidStringManager = androidStringManager;
        }
        DependentControlViewModel.CashCardWithTags cashCardWithTags = new DependentControlViewModel.CashCardWithTags(format2, isLoading, toggle, arrayList);
        gapComposer.end(false);
        return cashCardWithTags;
    }

    public final String formFactorNoun(SponseeCashAppTag sponseeCashAppTag) {
        AndroidStringManager androidStringManager = this.deps.stringManager;
        TagFormFactor tagFormFactor = sponseeCashAppTag.formFactor;
        switch (tagFormFactor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
            case 2:
                return androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_form_factor_wand);
            case 3:
            case 4:
                return androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_form_factor_heart);
            case 5:
            case 6:
                return androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_form_factor_mini_card);
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        return ControlType.CASH_CARD;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Unit handleCancelDisabling() {
        this.pendingTagDisable = null;
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleConfirmDisabling(BaseDependentControlPresenter$models$3$1 baseDependentControlPresenter$models$3$1) {
        SponseeCashAppTag sponseeCashAppTag = this.pendingTagDisable;
        if (sponseeCashAppTag == null) {
            Object handleConfirmDisabling = super.handleConfirmDisabling(baseDependentControlPresenter$models$3$1);
            return handleConfirmDisabling == CoroutineSingletons.COROUTINE_SUSPENDED ? handleConfirmDisabling : Unit.INSTANCE;
        }
        this.pendingTagDisable = null;
        Object runTagOperation = runTagOperation(sponseeCashAppTag, false, new RealMRIFactory$sign$2.AnonymousClass1(this, sponseeCashAppTag, null, 6), baseDependentControlPresenter$models$3$1);
        return runTagOperation == CoroutineSingletons.COROUTINE_SUSPENDED ? runTagOperation : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        Long l;
        Object obj;
        Object obj2;
        boolean z = dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged;
        DependentControlScreen dependentControlScreen = this.args;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        Object[] objArr = 0;
        if (z) {
            DependentControlViewEvent$ToggleEvent$ToggleChanged dependentControlViewEvent$ToggleEvent$ToggleChanged = (DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent;
            String str2 = dependentControlViewEvent$ToggleEvent$ToggleChanged.tagDeviceId;
            boolean z2 = dependentControlViewEvent$ToggleEvent$ToggleChanged.enabled;
            ControlDisablingConfirmationScreen.DisablingConfirmationQuestion disablingConfirmationQuestion = ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE;
            BaseDependentControlDependencies baseDependentControlDependencies = this.deps;
            if (str2 != null) {
                if (((Set) this.inFlightTagDeviceIds$delegate.getValue()).contains(str2)) {
                    obj2 = Unit.INSTANCE;
                } else {
                    DependentControlStatus.Loaded lastLoaded = lastLoaded(dependentControlStatus);
                    DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = lastLoaded instanceof DependentControlStatus.Loaded.LoadedCardControl ? (DependentControlStatus.Loaded.LoadedCardControl) lastLoaded : null;
                    if (loadedCardControl == null) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        Iterator it = loadedCardControl.sponseeTags.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((SponseeCashAppTag) obj).deviceId, str2)) {
                                break;
                            }
                        }
                        SponseeCashAppTag sponseeCashAppTag = (SponseeCashAppTag) obj;
                        if (sponseeCashAppTag == null) {
                            obj2 = Unit.INSTANCE;
                        } else if (z2) {
                            obj2 = runTagOperation(sponseeCashAppTag, true, new RealMRIFactory$sign$2.AnonymousClass1(this, str2, objArr == true ? 1 : 0, 7), realFidesmoClient$observeDeviceState$1);
                            if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj2 = Unit.INSTANCE;
                            }
                        } else {
                            this.pendingTagDisable = sponseeCashAppTag;
                            String resolveTitle = resolveTitle(sponseeCashAppTag);
                            String formFactorNoun = formFactorNoun(sponseeCashAppTag);
                            if (formFactorNoun == null) {
                                formFactorNoun = baseDependentControlDependencies.stringManager.get(R.string.family_account_dependent_controls_cash_app_tag_title_fallback);
                            }
                            screenNavigator.askQuestion(disablingConfirmationQuestion, new BankingConfigQueries$$ExternalSyntheticLambda0((Object) this, resolveTitle, str, formFactorNoun, 16));
                            obj2 = Unit.INSTANCE;
                        }
                    }
                }
                return obj2 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj2 : Unit.INSTANCE;
            }
            if (z2) {
                baseDependentControlDependencies.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.CashCard, ToggleValue.Enabled, ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken), null);
                Object dependentControlStatus2 = getControlStatusManager().setDependentControlStatus(true, realFidesmoClient$observeDeviceState$1);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (dependentControlStatus2 != coroutineSingletons) {
                    dependentControlStatus2 = Unit.INSTANCE;
                }
                return dependentControlStatus2 == coroutineSingletons ? dependentControlStatus2 : Unit.INSTANCE;
            }
            this.pendingTagDisable = null;
            screenNavigator.askQuestion(disablingConfirmationQuestion, new ProfileQueries$$ExternalSyntheticLambda13(26, this, str));
        } else if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) {
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenCardLimits.INSTANCE)).enabled()) {
                DependentControlStatus.Loaded.LoadedCardControl loadedCardControl2 = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedCardControl ? (DependentControlStatus.Loaded.LoadedCardControl) dependentControlStatus : null;
                if (loadedCardControl2 != null) {
                    List list = loadedCardControl2.limitPresets;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Long l2 = ((Money) it2.next()).amount;
                        if (l2 != null) {
                            arrayList.add(l2);
                        }
                    }
                    String str3 = ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken;
                    Money money = loadedCardControl2.currentLimit;
                    Money money2 = loadedCardControl2.maxLimit;
                    screenNavigator.goTo(new SetDependentCustomLimitScreen(str3, new SetDependentCustomLimitScreen.LimitCategory.CashCardSpend(money, arrayList, (money2 == null || (l = money2.amount) == null) ? 250000L : l.longValue(), str), ControlType.CASH_CARD));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final String resolveTitle(SponseeCashAppTag sponseeCashAppTag) {
        AndroidStringManager androidStringManager = this.deps.stringManager;
        String str = sponseeCashAppTag.name;
        String str2 = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        TagFormFactor tagFormFactor = sponseeCashAppTag.formFactor;
        switch (tagFormFactor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
            case -1:
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
            case 2:
                str2 = androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_default_title_wand);
                break;
            case 3:
            case 4:
                str2 = androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_default_title_heart);
                break;
            case 5:
            case 6:
                str2 = androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_default_title_mini_card);
                break;
        }
        return str2 == null ? androidStringManager.get(R.string.family_account_dependent_controls_cash_app_tag_title_fallback) : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:25:0x003f, B:26:0x006e, B:28:0x0074, B:30:0x007e, B:31:0x0083, B:35:0x0081, B:36:0x00a6, B:38:0x00aa, B:39:0x00bd, B:40:0x00c2), top: B:24:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:25:0x003f, B:26:0x006e, B:28:0x0074, B:30:0x007e, B:31:0x0083, B:35:0x0081, B:36:0x00a6, B:38:0x00aa, B:39:0x00bd, B:40:0x00c2), top: B:24:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runTagOperation(SponseeCashAppTag sponseeCashAppTag, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        CashCardControlPresenter$runTagOperation$1 cashCardControlPresenter$runTagOperation$1;
        int i;
        String str;
        SponseeCashAppTag sponseeCashAppTag2;
        String str2;
        TagLockResult tagLockResult;
        if (continuationImpl instanceof CashCardControlPresenter$runTagOperation$1) {
            cashCardControlPresenter$runTagOperation$1 = (CashCardControlPresenter$runTagOperation$1) continuationImpl;
            int i2 = cashCardControlPresenter$runTagOperation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashCardControlPresenter$runTagOperation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashCardControlPresenter$runTagOperation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashCardControlPresenter$runTagOperation$1.label;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.inFlightTagDeviceIds$delegate;
                if (i == 0) {
                    if (i == 1) {
                        z = cashCardControlPresenter$runTagOperation$1.Z$0;
                        str2 = cashCardControlPresenter$runTagOperation$1.L$2;
                        sponseeCashAppTag2 = cashCardControlPresenter$runTagOperation$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                        }
                    } else {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = cashCardControlPresenter$runTagOperation$1.L$2;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            str2 = str;
                            parcelableSnapshotMutableState.setValue(SetsKt___SetsKt.minus((Set) parcelableSnapshotMutableState.getValue(), str2));
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    parcelableSnapshotMutableState.setValue(SetsKt___SetsKt.minus((Set) parcelableSnapshotMutableState.getValue(), str));
                    throw th;
                }
                SafeTrace.throwOnFailure(obj);
                String str3 = sponseeCashAppTag.deviceId;
                parcelableSnapshotMutableState.setValue(SetsKt___SetsKt.plus((Set) parcelableSnapshotMutableState.getValue(), str3));
                try {
                    cashCardControlPresenter$runTagOperation$1.L$0 = sponseeCashAppTag;
                    cashCardControlPresenter$runTagOperation$1.L$2 = str3;
                    cashCardControlPresenter$runTagOperation$1.Z$0 = z;
                    cashCardControlPresenter$runTagOperation$1.label = 1;
                    Object invoke = function1.invoke(cashCardControlPresenter$runTagOperation$1);
                    if (invoke != obj2) {
                        sponseeCashAppTag2 = sponseeCashAppTag;
                        str2 = str3;
                        obj = invoke;
                    }
                    return obj2;
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                }
                tagLockResult = (TagLockResult) obj;
                if (tagLockResult instanceof TagLockResult.Success) {
                    if (!(tagLockResult instanceof TagLockResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showTagFailureDialog(sponseeCashAppTag2, z);
                    parcelableSnapshotMutableState.setValue(SetsKt___SetsKt.minus((Set) parcelableSnapshotMutableState.getValue(), str2));
                    return Unit.INSTANCE;
                }
                this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.CashTag, z ? ToggleValue.Enabled : ToggleValue.Disabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
                RealDependentControlStatusManager controlStatusManager = getControlStatusManager();
                cashCardControlPresenter$runTagOperation$1.L$0 = null;
                cashCardControlPresenter$runTagOperation$1.L$2 = str2;
                cashCardControlPresenter$runTagOperation$1.Z$0 = z;
                cashCardControlPresenter$runTagOperation$1.label = 2;
                if (controlStatusManager.getDependentControlStatus(false, cashCardControlPresenter$runTagOperation$1) != obj2) {
                    str = str2;
                    str2 = str;
                    parcelableSnapshotMutableState.setValue(SetsKt___SetsKt.minus((Set) parcelableSnapshotMutableState.getValue(), str2));
                    return Unit.INSTANCE;
                }
                return obj2;
            }
        }
        cashCardControlPresenter$runTagOperation$1 = new CashCardControlPresenter$runTagOperation$1(this, continuationImpl);
        Object obj3 = cashCardControlPresenter$runTagOperation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashCardControlPresenter$runTagOperation$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.inFlightTagDeviceIds$delegate;
        if (i == 0) {
        }
        tagLockResult = (TagLockResult) obj3;
        if (tagLockResult instanceof TagLockResult.Success) {
        }
    }

    public final void showTagFailureDialog(SponseeCashAppTag sponseeCashAppTag, boolean z) {
        AndroidStringManager androidStringManager = this.deps.stringManager;
        String resolveTitle = resolveTitle(sponseeCashAppTag);
        this.navigator.goTo(new ControlErrorScreen(Countries.getString(androidStringManager.resources, z ? new FormattedResource(R.string.family_account_dependent_cash_app_tag_unlock_error_dialog_title, SVG$Unit$EnumUnboxingLocalUtility.m(1, resolveTitle, "tag_title", resolveTitle)) : new FormattedResource(R.string.family_account_dependent_cash_app_tag_lock_error_dialog_title, SVG$Unit$EnumUnboxingLocalUtility.m(1, resolveTitle, "tag_title", resolveTitle))), androidStringManager.get(R.string.family_account_dependent_control_error_dialog_message), androidStringManager.get(R.string.family_account_dependent_control_error_done_button)));
    }
}
