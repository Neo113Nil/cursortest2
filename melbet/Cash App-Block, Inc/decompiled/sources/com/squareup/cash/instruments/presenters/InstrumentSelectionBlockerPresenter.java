package com.squareup.cash.instruments.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentResponse;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.cash.cdf.instrument.InstrumentSelectTapOption;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.protos.cash.plasma.common.ExistingLinkSelectionOption;
import com.squareup.protos.cash.plasma.common.InstrumentSelectionOption;
import com.squareup.protos.cash.plasma.common.InstrumentSelectionOption$SelectionOption$ExistingLink;
import com.squareup.protos.cash.plasma.common.InstrumentSelectionOption$SelectionOption$NewLink;
import com.squareup.protos.cash.plasma.common.InstrumentSelectionOption$SelectionOption$ReplaceLink;
import com.squareup.protos.cash.plasma.common.NewLinkSelectionOption;
import com.squareup.protos.cash.plasma.common.ReplaceLinkSelectionOption;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InstrumentSelectionBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final InstrumentSelectionBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final boolean useInstrumentCardArt;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InstrumentSelectionBlockerV3.InstrumentOption.TextColor.values().length];
            try {
                iArr2[InstrumentSelectionBlockerV3.InstrumentOption.TextColor.DANGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InstrumentSelectionBlockerV3.InstrumentOption.TextColor.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InstrumentSelectionBlockerV3.IconBackgroundColor.values().length];
            try {
                iArr3[InstrumentSelectionBlockerV3.IconBackgroundColor.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InstrumentSelectionBlockerV3.IconBackgroundColor.BRAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InstrumentSelectionBlockerV3.IconBackgroundColor.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public InstrumentSelectionBlockerPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, Analytics analytics, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        instrumentSelectionBlockerScreen.getClass();
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.args = instrumentSelectionBlockerScreen;
        this.navigator = screenNavigator;
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled() && instrumentSelectionBlockerScreen.blockersData.clientScenario == ClientScenario.TRANSFER_FUNDS;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitAction(InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter, InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction, Function1 function1, ContinuationImpl continuationImpl) {
        InstrumentSelectionBlockerPresenter$submitAction$1 instrumentSelectionBlockerPresenter$submitAction$1;
        int i;
        BetterNavigator.ScreenNavigator screenNavigator;
        InstrumentSelectionOption instrumentSelectionOption;
        Function1 function12;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator2 = instrumentSelectionBlockerPresenter.navigator;
        InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen = instrumentSelectionBlockerPresenter.args;
        if (continuationImpl instanceof InstrumentSelectionBlockerPresenter$submitAction$1) {
            instrumentSelectionBlockerPresenter$submitAction$1 = (InstrumentSelectionBlockerPresenter$submitAction$1) continuationImpl;
            int i2 = instrumentSelectionBlockerPresenter$submitAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instrumentSelectionBlockerPresenter$submitAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = instrumentSelectionBlockerPresenter$submitAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instrumentSelectionBlockerPresenter$submitAction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1.invoke(Boolean.TRUE);
                    boolean z = instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Link;
                    instrumentSelectionBlockerPresenter.logAction(instrumentSelectionBlockerPresenter.analytics, z ? InstrumentSelectTapOption.Action.LINK : instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace ? InstrumentSelectTapOption.Action.REPLACE : instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select ? InstrumentSelectTapOption.Action.SUBMIT : null, z ? ((InstrumentSelectionBlockerScreen.InstrumentAction.Link) instrumentAction).instrumentType : instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace ? ((InstrumentSelectionBlockerScreen.InstrumentAction.Replace) instrumentAction).instrumentType : instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select ? ((InstrumentSelectionBlockerScreen.InstrumentAction.Select) instrumentAction).instrumentType : null);
                    AppService appService = instrumentSelectionBlockerPresenter.appService;
                    BlockersData blockersData = instrumentSelectionBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    String str = blockersData.flowToken;
                    RequestContext requestContext = instrumentSelectionBlockerScreen.blockersData.requestContext;
                    if (z) {
                        instrumentSelectionOption = new InstrumentSelectionOption(new InstrumentSelectionOption$SelectionOption$NewLink(new NewLinkSelectionOption(((InstrumentSelectionBlockerScreen.InstrumentAction.Link) instrumentAction).instrumentType, ByteString.EMPTY)));
                        screenNavigator = screenNavigator2;
                    } else if (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace) {
                        InstrumentSelectionBlockerScreen.InstrumentAction.Replace replace = (InstrumentSelectionBlockerScreen.InstrumentAction.Replace) instrumentAction;
                        screenNavigator = screenNavigator2;
                        instrumentSelectionOption = new InstrumentSelectionOption(new InstrumentSelectionOption$SelectionOption$ReplaceLink(new ReplaceLinkSelectionOption(replace.instrumentToken, replace.instrumentType, ByteString.EMPTY)));
                    } else {
                        screenNavigator = screenNavigator2;
                        if (!(instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) instrumentAction, "Invalid instrument action for instrument selection option: ");
                            return null;
                        }
                        InstrumentSelectionBlockerScreen.InstrumentAction.Select select = (InstrumentSelectionBlockerScreen.InstrumentAction.Select) instrumentAction;
                        instrumentSelectionOption = new InstrumentSelectionOption(new InstrumentSelectionOption$SelectionOption$ExistingLink(new ExistingLinkSelectionOption(select.instrumentType, select.instrumentToken, EmptyList.INSTANCE, null, null, ByteString.EMPTY)));
                    }
                    SelectInstrumentRequest selectInstrumentRequest = new SelectInstrumentRequest(requestContext, instrumentSelectionOption.encodeByteString(), (ByteString) null, 12);
                    instrumentSelectionBlockerPresenter$submitAction$1.L$1 = function1;
                    instrumentSelectionBlockerPresenter$submitAction$1.label = 1;
                    obj = appService.selectInstrument(clientScenario, str, selectInstrumentRequest, instrumentSelectionBlockerPresenter$submitAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = instrumentSelectionBlockerPresenter$submitAction$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator = screenNavigator2;
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    BetterNavigator.ScreenNavigator screenNavigator3 = screenNavigator;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersDataNavigator blockersDataNavigator = instrumentSelectionBlockerPresenter.blockersDataNavigator;
                    BlockersData blockersData2 = instrumentSelectionBlockerScreen.blockersData;
                    ResponseContext responseContext = ((SelectInstrumentResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator3.goTo(blockersDataNavigator.getNext(instrumentSelectionBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, instrumentSelectionBlockerScreen, instrumentSelectionBlockerPresenter.stringManager));
                    function12.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }
        instrumentSelectionBlockerPresenter$submitAction$1 = new InstrumentSelectionBlockerPresenter$submitAction$1(instrumentSelectionBlockerPresenter, continuationImpl);
        Object obj2 = instrumentSelectionBlockerPresenter$submitAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instrumentSelectionBlockerPresenter$submitAction$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    public final void logAction(Analytics analytics, InstrumentSelectTapOption.Action action, CashInstrumentType cashInstrumentType) {
        InstrumentType instrumentType;
        InstrumentType instrumentType2;
        InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen = this.args;
        String valueOf = String.valueOf(instrumentSelectionBlockerScreen.blockersData.clientScenario);
        String str = instrumentSelectionBlockerScreen.blockersData.flowToken;
        int i = cashInstrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
        if (i == 1) {
            instrumentType = InstrumentType.DEBIT_CARD;
        } else if (i == 2) {
            instrumentType = InstrumentType.BANK;
        } else {
            if (i != 3) {
                instrumentType2 = null;
                analytics.track(new InstrumentSelectTapOption(valueOf, str, action, instrumentType2, 48), null);
            }
            instrumentType = InstrumentType.CREDIT_CARD;
        }
        instrumentType2 = instrumentType;
        analytics.track(new InstrumentSelectTapOption(valueOf, str, action, instrumentType2, 48), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.squareup.cash.instruments.viewmodels.InstrumentIcon$LocalIcon$IconTint] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel$Accessory] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel$InstrumentLabel] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        InstrumentIcon.LocalIcon.IconBackground iconBackground;
        InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex;
        Object content;
        InstrumentIcon.LocalIcon.IconBackground iconBackground2;
        boolean z;
        String str;
        InstrumentIcon.LocalIcon.IconBackground iconBackground3;
        InstrumentIcon.LocalIcon.IconBackground iconBackground4;
        int i2;
        InstrumentIcon.LocalIcon.IconTint iconTint;
        ?? r19;
        Object localIcon;
        InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel instrumentLabel;
        boolean z2;
        ?? r22;
        InstrumentCellViewModel.InstrumentLabel.Color color;
        CashInstrumentType cashInstrumentType;
        flow.getClass();
        ?? r8 = (GapComposer) composer;
        r8.startReplaceGroup(-1724386942);
        Object rememberedValue = r8.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r8);
            r8.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen = this.args;
        Iterator it = instrumentSelectionBlockerScreen.instrumentSection.iterator();
        int i3 = 0;
        loop0: while (true) {
            iconBackground = null;
            if (!it.hasNext()) {
                selectedInstrumentOptionIndex = new InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex(-1, -1);
                break;
            }
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            int i5 = 0;
            for (Object obj2 : ((InstrumentSelectionBlockerScreen.InstrumentSection) next).instrumentOptions) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                InstrumentSelectionBlockerScreen.InstrumentOption instrumentOption = (InstrumentSelectionBlockerScreen.InstrumentOption) obj2;
                if ((instrumentOption.action instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select) && instrumentOption.selected) {
                    selectedInstrumentOptionIndex = new InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex(i3, i5);
                    break loop0;
                }
                i5 = i6;
            }
            i3 = i4;
        }
        Object rememberedValue2 = r8.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(selectedInstrumentOptionIndex);
            r8.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = r8.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            r8.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = r8.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            r8.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        boolean changedInstance = r8.changedInstance(coroutineScope) | r8.changedInstance(this);
        Object rememberedValue5 = r8.rememberedValue();
        if (changedInstance || rememberedValue5 == obj) {
            MoneyUiFactory$$ExternalSyntheticLambda1 moneyUiFactory$$ExternalSyntheticLambda1 = new MoneyUiFactory$$ExternalSyntheticLambda1(coroutineScope, this, mutableState2, mutableState3, 11);
            r8.updateRememberedValue(moneyUiFactory$$ExternalSyntheticLambda1);
            rememberedValue5 = moneyUiFactory$$ExternalSyntheticLambda1;
        }
        Function2 function2 = (Function2) rememberedValue5;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) r8.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = r8.changed(function2) | r8.changedInstance(answerDispatcher);
        Object rememberedValue6 = r8.rememberedValue();
        if (changed || rememberedValue6 == obj) {
            rememberedValue6 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 29);
            r8.updateRememberedValue(rememberedValue6);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue6, (Composer) r8);
        InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter = this;
        Updater.LaunchedEffect((Composer) r8, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState3, (State) mutableState2, (Object) mutableState, 6));
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        boolean z3 = true;
        if (booleanValue) {
            content = InstrumentSelectionBlockerViewModel.Loading.INSTANCE;
        } else {
            if (booleanValue) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list = instrumentSelectionBlockerScreen.instrumentSection;
            int i7 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InstrumentSelectionBlockerScreen.InstrumentSection instrumentSection = (InstrumentSelectionBlockerScreen.InstrumentSection) it2.next();
                String str2 = (String) instrumentSection.title.getValue();
                ArrayList<InstrumentSelectionBlockerScreen.InstrumentOption> arrayList2 = instrumentSection.instrumentOptions;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, i7));
                for (InstrumentSelectionBlockerScreen.InstrumentOption instrumentOption2 : arrayList2) {
                    if (!instrumentSelectionBlockerPresenter.useInstrumentCardArt || (cashInstrumentType = instrumentOption2.instrumentType) == null) {
                        iconBackground2 = iconBackground;
                    } else {
                        iconBackground2 = iconBackground;
                        if (cashInstrumentType != CashInstrumentType.BANK_ACCOUNT) {
                            z = z3;
                            String str3 = instrumentOption2.title;
                            String str4 = instrumentOption2.subtitle;
                            InstrumentSelectionBlockerScreen.IconData iconData = instrumentOption2.iconData;
                            Iterator it3 = it2;
                            InstrumentIcon.IconShape iconShape = !z ? InstrumentIcon.IconShape.CARD : InstrumentIcon.IconShape.CIRCLE;
                            String str5 = iconData.cardImageUrl;
                            str = iconData.iconUrl;
                            InstrumentSelectionBlockerScreen.IconData.ArcadeIcon arcadeIcon = iconData.arcadeIcon;
                            if (!z && str5 != null) {
                                localIcon = new InstrumentIcon.RemoteIcon(str5, iconShape, 2);
                            } else if (str == null) {
                                localIcon = new InstrumentIcon.RemoteIcon(str, InstrumentIcon.IconShape.CIRCLE, 2);
                            } else {
                                if (arcadeIcon == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("IconData must have at least one icon source");
                                    return iconBackground2;
                                }
                                InstrumentSelectionBlockerV3.IconBackgroundColor iconBackgroundColor = arcadeIcon.backgroundColor;
                                zzd zzdVar = Icons.Companion;
                                String str6 = arcadeIcon.arcadeId;
                                zzdVar.getClass();
                                Icons icons = zzd.get(str6);
                                icons.getClass();
                                int i8 = iconBackgroundColor == null ? -1 : WhenMappings.$EnumSwitchMapping$2[iconBackgroundColor.ordinal()];
                                if (i8 == 1) {
                                    iconBackground3 = InstrumentIcon.LocalIcon.IconBackground.SUBTLE;
                                } else if (i8 == 2) {
                                    iconBackground3 = InstrumentIcon.LocalIcon.IconBackground.BRAND;
                                } else if (i8 != 3) {
                                    iconBackground4 = iconBackground2;
                                    i2 = iconBackgroundColor != null ? -1 : WhenMappings.$EnumSwitchMapping$2[iconBackgroundColor.ordinal()];
                                    if (i2 != 1) {
                                        iconTint = InstrumentIcon.LocalIcon.IconTint.SUBTLE;
                                    } else if (i2 != 2) {
                                        r19 = iconBackground2;
                                        localIcon = new InstrumentIcon.LocalIcon(icons, r19, iconBackground4, null, iconShape, 8);
                                    } else {
                                        iconTint = InstrumentIcon.LocalIcon.IconTint.INVERSE;
                                    }
                                    r19 = iconTint;
                                    localIcon = new InstrumentIcon.LocalIcon(icons, r19, iconBackground4, null, iconShape, 8);
                                } else {
                                    iconBackground3 = InstrumentIcon.LocalIcon.IconBackground.NONE;
                                }
                                iconBackground4 = iconBackground3;
                                if (iconBackgroundColor != null) {
                                }
                                if (i2 != 1) {
                                }
                                r19 = iconTint;
                                localIcon = new InstrumentIcon.LocalIcon(icons, r19, iconBackground4, null, iconShape, 8);
                            }
                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(localIcon);
                            ?? r21 = !(instrumentOption2.action instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select) ? InstrumentCellViewModel.Accessory.Radio.INSTANCE : iconBackground2;
                            instrumentLabel = instrumentOption2.tertiaryLabel;
                            if (instrumentLabel == null) {
                                String str7 = instrumentLabel.label;
                                str7.getClass();
                                InstrumentSelectionBlockerV3.InstrumentOption.TextColor textColor = instrumentLabel.color;
                                int i9 = textColor == null ? -1 : WhenMappings.$EnumSwitchMapping$1[textColor.ordinal()];
                                if (i9 != -1) {
                                    z2 = true;
                                    if (i9 == 1) {
                                        color = InstrumentCellViewModel.InstrumentLabel.Color.DANGER;
                                        r22 = new InstrumentCellViewModel.InstrumentLabel(str7, color);
                                    } else if (i9 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return iconBackground2;
                                    }
                                } else {
                                    z2 = true;
                                }
                                color = InstrumentCellViewModel.InstrumentLabel.Color.DEFAULT;
                                r22 = new InstrumentCellViewModel.InstrumentLabel(str7, color);
                            } else {
                                z2 = true;
                                r22 = iconBackground2;
                            }
                            InstrumentCellViewModel instrumentCellViewModel = new InstrumentCellViewModel(str3, str4, true, listOf, r21, r22, null, null, null, MLKEMEngine.KyberPolyBytes);
                            Redacted redacted = instrumentOption2.infoMessage;
                            arrayList3.add(new InstrumentSelectionBlockerViewModel.Content.InstrumentSection.InstrumentOption(instrumentCellViewModel, redacted == null ? (String) redacted.getValue() : iconBackground2));
                            instrumentSelectionBlockerPresenter = this;
                            iconBackground = iconBackground2;
                            z3 = z2;
                            it2 = it3;
                        }
                    }
                    z = false;
                    String str32 = instrumentOption2.title;
                    String str42 = instrumentOption2.subtitle;
                    InstrumentSelectionBlockerScreen.IconData iconData2 = instrumentOption2.iconData;
                    Iterator it32 = it2;
                    InstrumentIcon.IconShape iconShape2 = !z ? InstrumentIcon.IconShape.CARD : InstrumentIcon.IconShape.CIRCLE;
                    String str52 = iconData2.cardImageUrl;
                    str = iconData2.iconUrl;
                    InstrumentSelectionBlockerScreen.IconData.ArcadeIcon arcadeIcon2 = iconData2.arcadeIcon;
                    if (!z) {
                    }
                    if (str == null) {
                    }
                    List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(localIcon);
                    if (!(instrumentOption2.action instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select)) {
                    }
                    instrumentLabel = instrumentOption2.tertiaryLabel;
                    if (instrumentLabel == null) {
                    }
                    InstrumentCellViewModel instrumentCellViewModel2 = new InstrumentCellViewModel(str32, str42, true, listOf2, r21, r22, null, null, null, MLKEMEngine.KyberPolyBytes);
                    Redacted redacted2 = instrumentOption2.infoMessage;
                    arrayList3.add(new InstrumentSelectionBlockerViewModel.Content.InstrumentSection.InstrumentOption(instrumentCellViewModel2, redacted2 == null ? (String) redacted2.getValue() : iconBackground2));
                    instrumentSelectionBlockerPresenter = this;
                    iconBackground = iconBackground2;
                    z3 = z2;
                    it2 = it32;
                }
                arrayList.add(new InstrumentSelectionBlockerViewModel.Content.InstrumentSection(str2, arrayList3));
                instrumentSelectionBlockerPresenter = this;
                it2 = it2;
                i7 = 10;
            }
            content = new InstrumentSelectionBlockerViewModel.Content(arrayList, (InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex) mutableState.getValue(), instrumentSelectionBlockerScreen.ctaButtonLabel);
        }
        r8.end(false);
        return content;
    }

    public final void navigateToOptionsSheet(InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet showSheet) {
        ArrayList arrayList = showSheet.options;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((InstrumentSelectionBlockerScreen.InstrumentOption) it.next()).action instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace) {
                    z = true;
                    break;
                }
            }
        }
        this.navigator.askQuestion(InstrumentLinkingOptionsQuestion.INSTANCE, new DialogHostKt$$ExternalSyntheticLambda2(showSheet, this, z, 7));
    }
}
