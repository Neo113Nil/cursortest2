package com.squareup.cash.payments.presenters;

import android.content.Context;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.math.MathUtils;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationSent;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationWarned;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.featureflags.AmplitudeExperiments$ExpressivePaymentsDrafts;
import com.squareup.cash.featureflags.AmplitudeExperiments$MusicExpressionSender;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pExpressivePayments;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ExpressivePaymentDetailsModel;
import com.squareup.cash.payments.viewmodels.ListProperty;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.Position;
import com.squareup.cash.payments.viewmodels.Rotation;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.viewmodels.Zoom;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.transfers.presenters.WithdrawPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SignalsContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PaymentScreens.PersonalizePayment args;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final Context context;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public ViewTracking dialogViewTracking;
    public final PersonalizationDraftStore draftStore;
    public final ExperienceType experienceType;
    public final RealImageLoader imageLoader;
    public final RealInstrumentManager instrumentManager;
    public final boolean isDoneMode;
    public final boolean isMusicEnabled;
    public int lastDraggedElementId;
    public final MoneyFormatter moneyFormatter;
    public final RealMusicPlayer musicPlayer;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNetworkInfo networkInfo;
    public final RealObservabilityManager observabilityManager;
    public final RealPaymentInitiator paymentInitiator;
    public final FeatureFlag$JsonFeatureFlag.Options personalizationOptions;
    public final RealPersonalizePaymentManager personalizePaymentManager;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final boolean showExpressivePaymentsUi;
    public final KeyValue showPersonalizePaymentGrid;
    public final AndroidStringManager stringManager;
    public final LinkedHashMap zIndexes;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalizationOrigin.values().length];
            try {
                PersonalizationOrigin personalizationOrigin = PersonalizationOrigin.BUTTON;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PersonalizePaymentPresenter(PaymentScreens.PersonalizePayment personalizePayment, BetterNavigator.ScreenNavigator screenNavigator, RealPaymentInitiator realPaymentInitiator, RealCryptoBalanceRepo realCryptoBalanceRepo, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AndroidStringManager androidStringManager, RealNetworkInfo realNetworkInfo, Analytics analytics, RealObservabilityManager realObservabilityManager, FeatureFlagManager featureFlagManager, RealPersonalizePaymentManager realPersonalizePaymentManager, SecuritySignalsAggregator securitySignalsAggregator, RealMusicPlayer realMusicPlayer, LocalizedMoneyFormatter.Factory factory, KeyValue keyValue, RealImageLoader realImageLoader, PersonalizationDraftStore personalizationDraftStore, Context context) {
        personalizePayment.getClass();
        this.args = personalizePayment;
        this.navigator = screenNavigator;
        this.paymentInitiator = realPaymentInitiator;
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.stringManager = androidStringManager;
        this.networkInfo = realNetworkInfo;
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
        this.personalizePaymentManager = realPersonalizePaymentManager;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.musicPlayer = realMusicPlayer;
        this.showPersonalizePaymentGrid = keyValue;
        this.imageLoader = realImageLoader;
        this.draftStore = personalizationDraftStore;
        this.context = context;
        this.zIndexes = new LinkedHashMap();
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.personalizationOptions = (FeatureFlag$JsonFeatureFlag.Options) realFeatureFlagManager.peekCurrentValue(JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.INSTANCE);
        this.showExpressivePaymentsUi = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$P2pExpressivePayments.INSTANCE)).enabled();
        this.isMusicEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MusicExpressionSender.INSTANCE)).enabled();
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        boolean enabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ExpressivePaymentsDrafts.INSTANCE)).enabled();
        PersonalizationOrigin personalizationOrigin = personalizePayment.origin;
        this.isDoneMode = personalizationOrigin == PersonalizationOrigin.BOTTOM_SHEET_CORE_FLOW && enabled;
        this.experienceType = WhenMappings.$EnumSwitchMapping$0[personalizationOrigin.ordinal()] == 1 ? ExperienceType.BOTTOM_SHEET : ExperienceType.LEGACY;
    }

    public static final PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.ConfirmOfflinePaymentDialog access$buildOfflineConfirmationDialogViewModel(PersonalizePaymentPresenter personalizePaymentPresenter, String str) {
        AndroidStringManager androidStringManager = personalizePaymentPresenter.stringManager;
        String str2 = androidStringManager.get(R.string.confirm_personalized_payment_offline_send_message);
        Analytics analytics = personalizePaymentPresenter.analytics;
        PaymentScreens.PersonalizePayment personalizePayment = personalizePaymentPresenter.args;
        analytics.track(new AssetSendPersonalizationWarned(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, str2), null);
        return new PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.ConfirmOfflinePaymentDialog(str, str2, androidStringManager.get(R.string.confirm_personalized_payment_offline_send_message_positive_button), androidStringManager.get(R.string.confirm_personalized_payment_offline_send_message_negative_button));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$retryResourceRefresh(PersonalizePaymentPresenter personalizePaymentPresenter, ContinuationImpl continuationImpl) {
        PersonalizePaymentPresenter$retryResourceRefresh$1 personalizePaymentPresenter$retryResourceRefresh$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PersonalizePaymentPresenter$retryResourceRefresh$1) {
            personalizePaymentPresenter$retryResourceRefresh$1 = (PersonalizePaymentPresenter$retryResourceRefresh$1) continuationImpl;
            int i2 = personalizePaymentPresenter$retryResourceRefresh$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                personalizePaymentPresenter$retryResourceRefresh$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = personalizePaymentPresenter$retryResourceRefresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalizePaymentPresenter$retryResourceRefresh$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPersonalizePaymentManager realPersonalizePaymentManager = personalizePaymentPresenter.personalizePaymentManager;
                    personalizePaymentPresenter$retryResourceRefresh$1.label = 1;
                    obj = realPersonalizePaymentManager.personalizationRepository.refreshPersonalizationResources(personalizePaymentPresenter$retryResourceRefresh$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                AndroidStringManager androidStringManager = personalizePaymentPresenter.stringManager;
                return new ConfirmRetryResourceDialog(androidStringManager.get(R.string.retry_personalization_title), androidStringManager.get(R.string.retry_personalization_message), androidStringManager.get(R.string.retry_personalization_refresh_positive_button), androidStringManager.get(R.string.retry_personalization_refresh_negative_button));
            }
        }
        personalizePaymentPresenter$retryResourceRefresh$1 = new PersonalizePaymentPresenter$retryResourceRefresh$1(personalizePaymentPresenter, continuationImpl);
        obj = personalizePaymentPresenter$retryResourceRefresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalizePaymentPresenter$retryResourceRefresh$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static String getInitiatorNote(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Text) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == 1 ? ((Text) arrayList.get(0)).value : str;
    }

    public final Text createTextElement(Size size, float f, String str, boolean z, boolean z2) {
        float f2 = size.width / 2.0f;
        LinkedHashMap linkedHashMap = this.zIndexes;
        ListProperty listProperty = new ListProperty(new Position(f2, f, ElementUtilKt.getNextzIndex(linkedHashMap)), (Rotation) null, (Zoom) null, (Size) null, 30);
        Text text = new Text(listProperty, (Math.max(size.width, size.height) / 2.0f) * 0.1f, z2, z, str, 1);
        linkedHashMap.put(Integer.valueOf(text.id), Float.valueOf(listProperty.position.z));
        return text;
    }

    public final float getzIndex(Element element) {
        Integer valueOf = Integer.valueOf(element.getId());
        LinkedHashMap linkedHashMap = this.zIndexes;
        Float f = (Float) linkedHashMap.get(valueOf);
        if (f != null) {
            return f.floatValue();
        }
        float nextzIndex = ElementUtilKt.getNextzIndex(linkedHashMap);
        linkedHashMap.put(Integer.valueOf(element.getId()), Float.valueOf(nextzIndex));
        return nextzIndex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02fe, code lost:
    
        if (r5 == r0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r49v1, types: [java.lang.Throwable] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object dotGridKt$DotGrid$3$1;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        List list;
        Continuation continuation;
        PersonalizationDraft personalizationDraft;
        GapComposer gapComposer;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        Object dotGridKt$DotGrid$3$12;
        MutableState mutableState10;
        NeverEqualPolicy neverEqualPolicy;
        Object obj;
        String str;
        Object obj2;
        MutableState mutableState11;
        String str2;
        ?? r10;
        ExpressivePaymentDetailsModel expressivePaymentDetailsModel;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-828072218);
        Object rememberedValue = gapComposer2.rememberedValue();
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Object obj3 = rememberedValue;
        if (rememberedValue == neverEqualPolicy2) {
            PersonalizationDraft personalizationDraft2 = (PersonalizationDraft) this.draftStore.draft.$$delegate_0.getValue();
            gapComposer2.updateRememberedValue(personalizationDraft2);
            obj3 = personalizationDraft2;
        }
        PersonalizationDraft personalizationDraft3 = (PersonalizationDraft) obj3;
        final int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj4 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy2) {
            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda0 = new MainPaymentViewKt$$ExternalSyntheticLambda0(13);
            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda0);
            obj4 = mainPaymentViewKt$$ExternalSyntheticLambda0;
        }
        MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj4, gapComposer2, 48);
        Object[] objArr2 = new Object[0];
        boolean changedInstance = gapComposer2.changedInstance(this);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj5 = rememberedValue3;
        if (changedInstance || rememberedValue3 == neverEqualPolicy2) {
            Function0 function0 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$$ExternalSyntheticLambda1
                public final /* synthetic */ PersonalizePaymentPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    PersonalizePaymentPresenter personalizePaymentPresenter = this.f$0;
                    switch (i3) {
                        case 0:
                            return Updater.mutableStateOf$default(personalizePaymentPresenter.args.amount);
                        default:
                            return Updater.mutableStateOf$default(personalizePaymentPresenter.args.recipients.getValue());
                    }
                }
            };
            gapComposer2.updateRememberedValue(function0);
            obj5 = function0;
        }
        MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) obj5, gapComposer2, 0);
        Object[] objArr3 = new Object[0];
        boolean changedInstance2 = gapComposer2.changedInstance(this);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        final int i3 = 1;
        Object obj6 = rememberedValue4;
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy2) {
            Function0 function02 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$$ExternalSyntheticLambda1
                public final /* synthetic */ PersonalizePaymentPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    PersonalizePaymentPresenter personalizePaymentPresenter = this.f$0;
                    switch (i32) {
                        case 0:
                            return Updater.mutableStateOf$default(personalizePaymentPresenter.args.amount);
                        default:
                            return Updater.mutableStateOf$default(personalizePaymentPresenter.args.recipients.getValue());
                    }
                }
            };
            gapComposer2.updateRememberedValue(function02);
            obj6 = function02;
        }
        MutableState mutableState14 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) obj6, gapComposer2, 0);
        Object[] objArr4 = new Object[0];
        boolean changedInstance3 = gapComposer2.changedInstance(personalizationDraft3);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj7 = rememberedValue5;
        if (changedInstance3 || rememberedValue5 == neverEqualPolicy2) {
            MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(personalizationDraft3, 27);
            gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda5);
            obj7 = moneyTabUIKt$$ExternalSyntheticLambda5;
        }
        MutableState mutableState15 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) obj7, gapComposer2, 0);
        Object[] objArr5 = new Object[0];
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy2) {
            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda02 = new MainPaymentViewKt$$ExternalSyntheticLambda0(14);
            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda02);
            obj8 = mainPaymentViewKt$$ExternalSyntheticLambda02;
        }
        MutableState mutableState16 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) obj8, gapComposer2, 48);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        int i4 = 17;
        Continuation continuation2 = null;
        if (rememberedValue7 == neverEqualPolicy2) {
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CashQrScannerPresenter$special$$inlined$filter$1(this.personalizePaymentManager.personalizationRepository.loadBackgrounds(false), 2), new TabContentPresenter$models$4$1$1$1(mutableState16, continuation2, i4), 3);
            gapComposer2.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue7 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, (List) mutableState16.getValue(), null, gapComposer2, 0, 2);
        Object[] objArr6 = new Object[0];
        Object rememberedValue8 = gapComposer2.rememberedValue();
        Object obj9 = rememberedValue8;
        if (rememberedValue8 == neverEqualPolicy2) {
            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda03 = new MainPaymentViewKt$$ExternalSyntheticLambda0(15);
            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda03);
            obj9 = mainPaymentViewKt$$ExternalSyntheticLambda03;
        }
        MutableState mutableState17 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) obj9, gapComposer2, 48);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj10 = rememberedValue9;
        if (rememberedValue9 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj10 = mutableStateOf$default;
        }
        MutableState mutableState18 = (MutableState) obj10;
        Object rememberedValue10 = gapComposer2.rememberedValue();
        Object obj11 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(EmptySet.INSTANCE);
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj11 = mutableStateOf$default2;
        }
        MutableState mutableState19 = (MutableState) obj11;
        Object rememberedValue11 = gapComposer2.rememberedValue();
        Object obj12 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj12 = mutableStateOf$default3;
        }
        MutableState mutableState20 = (MutableState) obj12;
        Object rememberedValue12 = gapComposer2.rememberedValue();
        Object obj13 = rememberedValue12;
        if (rememberedValue12 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(new CanvasDetails());
            gapComposer2.updateRememberedValue(mutableStateOf$default4);
            obj13 = mutableStateOf$default4;
        }
        MutableState mutableState21 = (MutableState) obj13;
        Object rememberedValue13 = gapComposer2.rememberedValue();
        Object obj14 = rememberedValue13;
        if (rememberedValue13 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(new CanvasDetails());
            gapComposer2.updateRememberedValue(mutableStateOf$default5);
            obj14 = mutableStateOf$default5;
        }
        MutableState mutableState22 = (MutableState) obj14;
        Object rememberedValue14 = gapComposer2.rememberedValue();
        Object obj15 = rememberedValue14;
        if (rememberedValue14 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(new CanvasDetails());
            gapComposer2.updateRememberedValue(mutableStateOf$default6);
            obj15 = mutableStateOf$default6;
        }
        MutableState mutableState23 = (MutableState) obj15;
        Object rememberedValue15 = gapComposer2.rememberedValue();
        Object obj16 = rememberedValue15;
        if (rememberedValue15 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default7);
            obj16 = mutableStateOf$default7;
        }
        MutableState mutableState24 = (MutableState) obj16;
        Object[] objArr7 = new Object[0];
        Object rememberedValue16 = gapComposer2.rememberedValue();
        Object obj17 = rememberedValue16;
        if (rememberedValue16 == neverEqualPolicy2) {
            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda04 = new MainPaymentViewKt$$ExternalSyntheticLambda0(16);
            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda04);
            obj17 = mainPaymentViewKt$$ExternalSyntheticLambda04;
        }
        MutableState mutableState25 = (MutableState) SaverKt.rememberSaveable(objArr7, (Function0) obj17, gapComposer2, 48);
        List list2 = (List) collectAsState.getValue();
        boolean changed = gapComposer2.changed(mutableState12) | gapComposer2.changedInstance(personalizationDraft3) | gapComposer2.changed(collectAsState) | gapComposer2.changed(mutableState17);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        if (changed || rememberedValue17 == neverEqualPolicy2) {
            mutableState = mutableState24;
            mutableState2 = mutableState12;
            mutableState3 = collectAsState;
            mutableState4 = mutableState15;
            mutableState5 = mutableState17;
            list = list2;
            continuation = null;
            dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) personalizationDraft3, (Object) mutableState2, (Object) mutableState3, (Object) mutableState5, (Continuation) null, 20);
            personalizationDraft = personalizationDraft3;
            gapComposer2.updateRememberedValue(dotGridKt$DotGrid$3$1);
        } else {
            personalizationDraft = personalizationDraft3;
            mutableState = mutableState24;
            mutableState2 = mutableState12;
            dotGridKt$DotGrid$3$1 = rememberedValue17;
            continuation = null;
            mutableState3 = collectAsState;
            mutableState5 = mutableState17;
            list = list2;
            mutableState4 = mutableState15;
        }
        Updater.LaunchedEffect(gapComposer2, list, (Function2) dotGridKt$DotGrid$3$1);
        CanvasDetails canvasDetails = (CanvasDetails) mutableState22.getValue();
        boolean changed2 = gapComposer2.changed(mutableState2) | gapComposer2.changedInstance(this) | gapComposer2.changed(mutableState4);
        Object rememberedValue18 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue18 == neverEqualPolicy2) {
            MutableState mutableState26 = mutableState2;
            gapComposer = gapComposer2;
            mutableState6 = mutableState;
            MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(this, mutableState26, mutableState4, mutableState21, mutableState22, null, 23);
            mutableState7 = mutableState4;
            mutableState8 = mutableState21;
            mutableState9 = mutableState22;
            gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
            rememberedValue18 = moleculeKt$immediateClockFlow$1$1$1;
        } else {
            mutableState6 = mutableState;
            gapComposer = gapComposer2;
            mutableState7 = mutableState4;
            mutableState9 = mutableState22;
            mutableState8 = mutableState21;
        }
        Updater.LaunchedEffect(gapComposer, canvasDetails, (Function2) rememberedValue18);
        Integer valueOf = Integer.valueOf(((Number) mutableState5.getValue()).intValue());
        boolean changedInstance4 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState3) | gapComposer.changed(mutableState5);
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue19 == neverEqualPolicy2) {
            mutableState10 = mutableState18;
            dotGridKt$DotGrid$3$12 = new DotGridKt$DotGrid$3$1((Object) this, (Object) mutableState10, (Object) mutableState3, (Object) mutableState5, (Continuation) null, 21);
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$12);
        } else {
            dotGridKt$DotGrid$3$12 = rememberedValue19;
            mutableState10 = mutableState18;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) dotGridKt$DotGrid$3$12);
        DialogViewModel dialogViewModel = (DialogViewModel) mutableState6.getValue();
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue20 == neverEqualPolicy2) {
            rememberedValue20 = new MainPaymentView$Content$2$1(this, mutableState6, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue20);
        }
        Updater.LaunchedEffect(gapComposer, dialogViewModel, (Function2) rememberedValue20);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue21 == neverEqualPolicy2) {
            rememberedValue21 = new AndroidFileSaver$save$2(this, mutableState6, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue21);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue21);
        MutableState mutableState27 = mutableState7;
        MutableState mutableState28 = mutableState3;
        MutableState mutableState29 = mutableState5;
        MutableState mutableState30 = mutableState6;
        GapComposer gapComposer3 = gapComposer;
        Updater.LaunchedEffect(gapComposer3, flow, new WithdrawPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, this, mutableState27, mutableState28, mutableState29, mutableState8, mutableState25, mutableState30, mutableState9, mutableState10, mutableState20, mutableState19, mutableState23));
        boolean changed3 = gapComposer3.changed(mutableState13);
        Object rememberedValue22 = gapComposer3.rememberedValue();
        if (changed3) {
            neverEqualPolicy = neverEqualPolicy2;
        } else {
            neverEqualPolicy = neverEqualPolicy2;
            obj = rememberedValue22;
        }
        HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda12 = new HeroTagViewKt$$ExternalSyntheticLambda12(22, mutableState13);
        gapComposer3.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda12);
        obj = heroTagViewKt$$ExternalSyntheticLambda12;
        Function2 function2 = (Function2) obj;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
        boolean changed4 = gapComposer3.changed(function2) | gapComposer3.changedInstance(answerDispatcher);
        Object rememberedValue23 = gapComposer3.rememberedValue();
        Object obj18 = rememberedValue23;
        if (changed4 || rememberedValue23 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$1 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 17);
            gapComposer3.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$1);
            obj18 = articlePresenter$models$$inlined$AnswerHandler$1;
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) obj18, gapComposer3);
        boolean changed5 = gapComposer3.changed(mutableState25);
        Object rememberedValue24 = gapComposer3.rememberedValue();
        Object obj19 = rememberedValue24;
        if (changed5 || rememberedValue24 == neverEqualPolicy) {
            HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda122 = new HeroTagViewKt$$ExternalSyntheticLambda12(23, mutableState25);
            gapComposer3.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda122);
            obj19 = heroTagViewKt$$ExternalSyntheticLambda122;
        }
        Function2 function22 = (Function2) obj19;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
        boolean changed6 = gapComposer3.changed(function22) | gapComposer3.changedInstance(answerDispatcher2);
        Object rememberedValue25 = gapComposer3.rememberedValue();
        Object obj20 = rememberedValue25;
        if (changed6 || rememberedValue25 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$12 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 18);
            gapComposer3.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$12);
            obj20 = articlePresenter$models$$inlined$AnswerHandler$12;
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) obj20, gapComposer3);
        SelectedTrack selectedTrack = (SelectedTrack) mutableState25.getValue();
        boolean changed7 = gapComposer3.changed(mutableState25) | gapComposer3.changedInstance(this);
        Object rememberedValue26 = gapComposer3.rememberedValue();
        if (changed7 || rememberedValue26 == neverEqualPolicy) {
            str = null;
            OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1(this, mutableState25, false ? 1 : 0, 21);
            gapComposer3.updateRememberedValue(overlayKt$Overlay$1$1$1$1$1);
            obj2 = overlayKt$Overlay$1$1$1$1$1;
        } else {
            str = null;
            obj2 = rememberedValue26;
        }
        Updater.LaunchedEffect(gapComposer3, selectedTrack, (Function2) obj2);
        boolean isEmpty = ((List) mutableState28.getValue()).isEmpty();
        boolean z = this.showExpressivePaymentsUi;
        if (isEmpty) {
            List<PaymentRecipient> list3 = (List) mutableState14.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (PaymentRecipient paymentRecipient : list3) {
                paymentRecipient.getClass();
                arrayList.add(UtilsKt.toHeaderAvatar(MathUtils.toDbRecipient(paymentRecipient.sendableUiCustomer)));
            }
            PersonalizePaymentViewModel.LoadingPersonalizePaymentMenu loadingPersonalizePaymentMenu = new PersonalizePaymentViewModel.LoadingPersonalizePaymentMenu(new PersonalizePaymentToolbarViewModel(arrayList, new PersonalizePaymentToolbarViewModel.SendButtonConfiguration(false, str), true, false), (ConfirmRetryResourceDialog) ((DialogViewModel) mutableState30.getValue()), z);
            gapComposer3.end(false);
            return loadingPersonalizePaymentMenu;
        }
        List<PaymentRecipient> list4 = (List) mutableState14.getValue();
        ?? r49 = str;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (PaymentRecipient paymentRecipient2 : list4) {
            paymentRecipient2.getClass();
            arrayList2.add(UtilsKt.toHeaderAvatar(MathUtils.toDbRecipient(paymentRecipient2.sendableUiCustomer)));
        }
        boolean z2 = !((List) mutableState14.getValue()).isEmpty();
        boolean z3 = this.isDoneMode;
        if (z3) {
            mutableState11 = mutableState27;
            str2 = this.stringManager.get(R.string.personalize_payment_done);
        } else {
            mutableState11 = mutableState27;
            str2 = r49;
        }
        PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel = new PersonalizePaymentToolbarViewModel(arrayList2, new PersonalizePaymentToolbarViewModel.SendButtonConfiguration(z2, str2), true, z3 && personalizationDraft != null);
        Set set = (Set) mutableState19.getValue();
        boolean booleanValue = ((Boolean) mutableState20.getValue()).booleanValue();
        String format2 = this.moneyFormatter.format((Money) mutableState13.getValue());
        List list5 = (List) mutableState28.getValue();
        int intValue = ((Number) mutableState29.getValue()).intValue();
        PaymentScreens.PersonalizePayment personalizePayment = this.args;
        if (z) {
            Iterator it = ((List) mutableState11.getValue()).iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                }
                Element element = (Element) it.next();
                if ((element instanceof Text) && Intrinsics.areEqual(((Text) element).value, personalizePayment.note.getValue())) {
                    break;
                }
                i5++;
            }
            List list6 = (List) mutableState11.getValue();
            r10 = new ArrayList();
            int i6 = 0;
            for (Object obj21 : list6) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r49;
                }
                if (i6 != i5) {
                    r10.add(obj21);
                }
                i6 = i7;
            }
        } else {
            r10 = (List) mutableState11.getValue();
        }
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization = new PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization(format2, list5, intValue, r10);
        boolean z4 = !ElementUtilKt.canAddText((List) mutableState11.getValue());
        boolean z5 = !ElementUtilKt.canAddSticker((List) mutableState11.getValue());
        boolean booleanValue2 = ((Boolean) this.showPersonalizePaymentGrid.blockingGet()).booleanValue();
        JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions menuOptions = (JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions) this.personalizationOptions.value;
        boolean z6 = menuOptions.stickers;
        boolean z7 = (!menuOptions.text || personalizePayment.forceHideTextOptions || z) ? false : true;
        boolean z8 = !personalizePayment.forceHideTextOptions;
        float f = ((CanvasDetails) mutableState23.getValue()).start.y;
        DialogViewModel dialogViewModel2 = (DialogViewModel) mutableState30.getValue();
        if (z) {
            PaymentRecipient paymentRecipient3 = (PaymentRecipient) CollectionsKt.firstOrNull((List) mutableState14.getValue());
            expressivePaymentDetailsModel = new ExpressivePaymentDetailsModel(paymentRecipient3 != null ? UtilsKt.toHeaderAvatar(MathUtils.toDbRecipient(paymentRecipient3.sendableUiCustomer)) : r49, true, (String) personalizePayment.note.getValue());
        } else {
            expressivePaymentDetailsModel = r49;
        }
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu = new PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu(personalizePaymentToolbarViewModel, expressivePaymentDetailsModel, personalization, set, booleanValue, z4, z5, booleanValue2, z6, z7, this.isMusicEnabled, z8, this.showExpressivePaymentsUi, f, dialogViewModel2, (SelectedTrack) mutableState25.getValue());
        gapComposer3.end(false);
        return loadedPersonalizePaymentMenu;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object send$presenters(List list, String str, PersonalizationInput personalizationInput, boolean z, ContinuationImpl continuationImpl) {
        PersonalizePaymentPresenter$send$1 personalizePaymentPresenter$send$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        UUID uuid;
        Money money;
        List list2;
        RealPaymentInitiator realPaymentInitiator;
        boolean z2;
        PersonalizationInput personalizationInput2;
        InstrumentSelectionData instrumentSelectionData;
        String str2;
        Object obj;
        BetterNavigator.ScreenNavigator screenNavigator;
        List list3;
        Object initiate;
        Navigator navigator;
        if (continuationImpl instanceof PersonalizePaymentPresenter$send$1) {
            personalizePaymentPresenter$send$1 = (PersonalizePaymentPresenter$send$1) continuationImpl;
            int i2 = personalizePaymentPresenter$send$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                personalizePaymentPresenter$send$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = personalizePaymentPresenter$send$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalizePaymentPresenter$send$1.label;
                PaymentScreens.PersonalizePayment personalizePayment = this.args;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    String str3 = personalizePayment.flowToken;
                    uuid = personalizePayment.paymentToken;
                    this.analytics.track(new AssetSendPersonalizationSent(uuid.toString(), str3, Boolean.valueOf(z)), null);
                    money = personalizePayment.amount;
                    list2 = (List) personalizePayment.recipients.getValue();
                    InstrumentSelectionData instrumentSelectionData2 = personalizePayment.instrumentSelection;
                    ChannelFlowTransformLatest select = this.balanceSnapshotManager.select();
                    ChannelFlowTransformLatest bitcoinBalance = this.cryptoBalanceRepo.getBitcoinBalance();
                    EnumEntries entries = CashInstrumentType.getEntries();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : entries) {
                        if (((CashInstrumentType) obj3) != CashInstrumentType.CASH_BALANCE) {
                            arrayList.add(obj3);
                        }
                    }
                    CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
                    FinishSetupTileBadgeCounter combine = FlowKt.combine(select, bitcoinBalance, this.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length)), new AnchoredDraggableKt$snapTo$2(4, continuation, 5));
                    personalizePaymentPresenter$send$1.L$0 = list;
                    personalizePaymentPresenter$send$1.L$1 = str;
                    personalizePaymentPresenter$send$1.L$2 = personalizationInput;
                    realPaymentInitiator = this.paymentInitiator;
                    personalizePaymentPresenter$send$1.L$3 = realPaymentInitiator;
                    personalizePaymentPresenter$send$1.L$4 = uuid;
                    personalizePaymentPresenter$send$1.L$5 = money;
                    personalizePaymentPresenter$send$1.L$6 = list2;
                    personalizePaymentPresenter$send$1.L$7 = instrumentSelectionData2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
                    personalizePaymentPresenter$send$1.L$8 = screenNavigator2;
                    z2 = z;
                    personalizePaymentPresenter$send$1.Z$0 = z2;
                    personalizePaymentPresenter$send$1.label = 1;
                    Object first = FlowKt.first(combine, personalizePaymentPresenter$send$1);
                    if (first == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    personalizationInput2 = personalizationInput;
                    instrumentSelectionData = instrumentSelectionData2;
                    str2 = str;
                    obj = first;
                    screenNavigator = screenNavigator2;
                    list3 = list;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        navigator = (Navigator) personalizePaymentPresenter$send$1.L$3;
                        List list4 = personalizePaymentPresenter$send$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        navigator.goTo((Screen) obj2);
                        return Unit.INSTANCE;
                    }
                    boolean z3 = personalizePaymentPresenter$send$1.Z$0;
                    BetterNavigator.ScreenNavigator screenNavigator3 = personalizePaymentPresenter$send$1.L$8;
                    InstrumentSelectionData instrumentSelectionData3 = personalizePaymentPresenter$send$1.L$7;
                    list2 = personalizePaymentPresenter$send$1.L$6;
                    money = personalizePaymentPresenter$send$1.L$5;
                    uuid = personalizePaymentPresenter$send$1.L$4;
                    realPaymentInitiator = (RealPaymentInitiator) personalizePaymentPresenter$send$1.L$3;
                    PersonalizationInput personalizationInput3 = personalizePaymentPresenter$send$1.L$2;
                    str2 = personalizePaymentPresenter$send$1.L$1;
                    list3 = personalizePaymentPresenter$send$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    screenNavigator = screenNavigator3;
                    instrumentSelectionData = instrumentSelectionData3;
                    personalizationInput2 = personalizationInput3;
                    z2 = z3;
                }
                List list5 = (List) obj;
                List list6 = list2;
                String str4 = personalizePayment.flowToken;
                Orientation orientation = Orientation.CASH;
                String str5 = str2;
                AppCreationActivity appCreationActivity = personalizePayment.appCreationActivity;
                ClientScenario.Companion companion = ClientScenario.INSTANCE;
                SignalsContext buildSignalsContext = this.securitySignalsAggregator.buildSignalsContext(list3);
                String str6 = personalizePayment.referrer;
                String str7 = personalizePayment.launchUrl;
                BlockersData.MoneybotContext moneybotContext = personalizePayment.moneybotContext;
                String str8 = personalizePayment.flowToken;
                Screen screen = personalizePayment.exitScreen;
                personalizePaymentPresenter$send$1.L$0 = null;
                personalizePaymentPresenter$send$1.L$1 = null;
                personalizePaymentPresenter$send$1.L$2 = null;
                personalizePaymentPresenter$send$1.L$3 = screenNavigator;
                personalizePaymentPresenter$send$1.L$4 = null;
                personalizePaymentPresenter$send$1.L$5 = null;
                personalizePaymentPresenter$send$1.L$6 = null;
                personalizePaymentPresenter$send$1.L$7 = null;
                personalizePaymentPresenter$send$1.L$8 = null;
                personalizePaymentPresenter$send$1.Z$0 = z2;
                personalizePaymentPresenter$send$1.label = 2;
                RealPaymentInitiator realPaymentInitiator2 = realPaymentInitiator;
                UUID uuid2 = uuid;
                initiate = realPaymentInitiator2.initiate(uuid2, money, str5, list6, instrumentSelectionData, (r57 & 32) != 0 ? null : personalizationInput2, (r57 & 64) != 0 ? null : str4, (r57 & 128) != 0 ? null : null, (r57 & 256) != 0 ? null : null, (r57 & 512) != 0 ? EmptyList.INSTANCE : list5, orientation, appCreationActivity, screen, (32768 & r57) != 0 ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, true, true, buildSignalsContext, str6, str7, (2097152 & r57) != 0 ? null : moneybotContext, (4194304 & r57) != 0 ? null : str8, (8388608 & r57) != 0 ? null : null, (16777216 & r57) != 0 ? null : null, (33554432 & r57) != 0 ? null : null, (r57 & 67108864) != 0 ? null : null, personalizePaymentPresenter$send$1);
                if (initiate != coroutineSingletons) {
                    return coroutineSingletons;
                }
                navigator = screenNavigator;
                obj2 = initiate;
                navigator.goTo((Screen) obj2);
                return Unit.INSTANCE;
            }
        }
        personalizePaymentPresenter$send$1 = new PersonalizePaymentPresenter$send$1(this, continuationImpl);
        Object obj22 = personalizePaymentPresenter$send$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalizePaymentPresenter$send$1.label;
        PaymentScreens.PersonalizePayment personalizePayment2 = this.args;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List list52 = (List) obj;
        List list62 = list2;
        String str42 = personalizePayment2.flowToken;
        Orientation orientation2 = Orientation.CASH;
        String str52 = str2;
        AppCreationActivity appCreationActivity2 = personalizePayment2.appCreationActivity;
        ClientScenario.Companion companion2 = ClientScenario.INSTANCE;
        SignalsContext buildSignalsContext2 = this.securitySignalsAggregator.buildSignalsContext(list3);
        String str62 = personalizePayment2.referrer;
        String str72 = personalizePayment2.launchUrl;
        BlockersData.MoneybotContext moneybotContext2 = personalizePayment2.moneybotContext;
        String str82 = personalizePayment2.flowToken;
        Screen screen2 = personalizePayment2.exitScreen;
        personalizePaymentPresenter$send$1.L$0 = null;
        personalizePaymentPresenter$send$1.L$1 = null;
        personalizePaymentPresenter$send$1.L$2 = null;
        personalizePaymentPresenter$send$1.L$3 = screenNavigator;
        personalizePaymentPresenter$send$1.L$4 = null;
        personalizePaymentPresenter$send$1.L$5 = null;
        personalizePaymentPresenter$send$1.L$6 = null;
        personalizePaymentPresenter$send$1.L$7 = null;
        personalizePaymentPresenter$send$1.L$8 = null;
        personalizePaymentPresenter$send$1.Z$0 = z2;
        personalizePaymentPresenter$send$1.label = 2;
        RealPaymentInitiator realPaymentInitiator22 = realPaymentInitiator;
        UUID uuid22 = uuid;
        initiate = realPaymentInitiator22.initiate(uuid22, money, str52, list62, instrumentSelectionData, (r57 & 32) != 0 ? null : personalizationInput2, (r57 & 64) != 0 ? null : str42, (r57 & 128) != 0 ? null : null, (r57 & 256) != 0 ? null : null, (r57 & 512) != 0 ? EmptyList.INSTANCE : list52, orientation2, appCreationActivity2, screen2, (32768 & r57) != 0 ? PaymentScreens$HomeScreens$Home.INSTANCE : screen2, true, true, buildSignalsContext2, str62, str72, (2097152 & r57) != 0 ? null : moneybotContext2, (4194304 & r57) != 0 ? null : str82, (8388608 & r57) != 0 ? null : null, (16777216 & r57) != 0 ? null : null, (33554432 & r57) != 0 ? null : null, (r57 & 67108864) != 0 ? null : null, personalizePaymentPresenter$send$1);
        if (initiate != coroutineSingletons) {
        }
    }
}
