package com.squareup.cash.moneybot.presenters.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardFieldEditStart;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardTap;
import com.squareup.cash.cdf.moneybot.TemplateCardFieldType;
import com.squareup.cash.cdf.moneybot.TemplateCardPickerPlacement;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.presenters.TransferOptionPickerResolver;
import com.squareup.cash.instruments.screens.TransferOptionPickerQuestion;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.maps.presenter.CashMapPresenter$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.analytics.TemplateCardInputFieldAnalyticsData;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.ExecuteToolResult;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.PendingInput;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.protos.cash.kgoose.api.v3.LinkTransferOption;
import com.squareup.protos.cash.kgoose.api.v3.TransferOptionKind;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class TemplateCardPresenter implements MoleculeCallbackPresenter, HasObservability {
    public final RealMoneybotAnalyticsService analyticsService;
    public final PiggybankAppService appService;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final ChatManager chatManager;
    public final ErrorReporter errorReporter;
    public final RealInstrumentManager instrumentManager;
    public final CoroutineContext ioDispatcher;
    public final TemplateCard metadata;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PluginContext pluginContext;
    public final RealRouter router;
    public final RealSessionFlags sessionFlags;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final TransferOptionPickerResolver transferOptionPickerResolver;

    public TemplateCardPresenter(RealMoneybotAnalyticsService realMoneybotAnalyticsService, ChatManager chatManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, SyncValueReader syncValueReader, PiggybankAppService piggybankAppService, TransferOptionPickerResolver transferOptionPickerResolver, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, RealSessionFlags realSessionFlags, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineContext coroutineContext, TemplateCard templateCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analyticsService = realMoneybotAnalyticsService;
        this.chatManager = chatManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.syncValueReader = syncValueReader;
        this.appService = piggybankAppService;
        this.transferOptionPickerResolver = transferOptionPickerResolver;
        this.stringManager = androidStringManager;
        this.sessionFlags = realSessionFlags;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.ioDispatcher = coroutineContext;
        this.metadata = templateCard;
        this.pluginContext = pluginContext;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$executeServerToolCall(TemplateCardPresenter templateCardPresenter, TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall, ContinuationImpl continuationImpl) {
        TemplateCardPresenter$executeServerToolCall$1 templateCardPresenter$executeServerToolCall$1;
        int i;
        PluginContext pluginContext;
        boolean z;
        boolean z2;
        ApiResult apiResult;
        boolean z3;
        TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall2 = executeServerToolCall;
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = templateCardPresenter.analyticsService;
        PluginContext pluginContext2 = templateCardPresenter.pluginContext;
        String str = pluginContext2.chatSessionId;
        if (continuationImpl instanceof TemplateCardPresenter$executeServerToolCall$1) {
            templateCardPresenter$executeServerToolCall$1 = (TemplateCardPresenter$executeServerToolCall$1) continuationImpl;
            int i2 = templateCardPresenter$executeServerToolCall$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                templateCardPresenter$executeServerToolCall$1.label = i2 - PKIFailureInfo.systemUnavail;
                TemplateCardPresenter$executeServerToolCall$1 templateCardPresenter$executeServerToolCall$12 = templateCardPresenter$executeServerToolCall$1;
                Object obj = templateCardPresenter$executeServerToolCall$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = templateCardPresenter$executeServerToolCall$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str == null) {
                        return Boolean.FALSE;
                    }
                    String str2 = executeServerToolCall2.requestId;
                    String str3 = executeServerToolCall2.toolName;
                    pluginContext = pluginContext2;
                    z = true;
                    realMoneybotAnalyticsService.analytics.track(new MoneybotTemplateCardTap(str, str2, str3, executeServerToolCall2.analyticsButtonRole, MoneybotTemplateCardTap.ActionType.SERVER_TOOL_CALL, executeServerToolCall2.analyticsSource, executeServerToolCall2.analyticsTarget), null);
                    CdfEvent cdfEvent = executeServerToolCall2.tapCdfEvent;
                    z2 = false;
                    if (cdfEvent != null) {
                        realMoneybotAnalyticsService.submitCdfEvent(cdfEvent, new Pair[0]);
                    }
                    ChatManager chatManager = templateCardPresenter.chatManager;
                    String str4 = executeServerToolCall2.extensionName;
                    String str5 = executeServerToolCall2.argumentsJson;
                    String str6 = executeServerToolCall2.requestId;
                    templateCardPresenter$executeServerToolCall$12.L$0 = executeServerToolCall2;
                    templateCardPresenter$executeServerToolCall$12.label = 1;
                    obj = ((RealChatManager) chatManager).executeTool(str4, str3, str5, str, str6, templateCardPresenter$executeServerToolCall$12);
                    str = str;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    executeServerToolCall2 = templateCardPresenter$executeServerToolCall$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    pluginContext = pluginContext2;
                    z = true;
                    z2 = false;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    z3 = z2;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str7 = ((ExecuteToolResult) ((ApiResult.Success) apiResult).response).clientRouteUrl;
                    if (str7 != null) {
                        RealRouter realRouter = templateCardPresenter.router;
                        Screen screen = pluginContext.contextScreen;
                        realRouter.route(new RoutingParams(screen, null, screen, null, null, str != null ? new FeatureContext.MoneybotChatContext(str, executeServerToolCall2.requestId) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), str7);
                    }
                    z3 = z;
                }
                return Boolean.valueOf(z3);
            }
        }
        templateCardPresenter$executeServerToolCall$1 = new TemplateCardPresenter$executeServerToolCall$1(templateCardPresenter, continuationImpl);
        TemplateCardPresenter$executeServerToolCall$1 templateCardPresenter$executeServerToolCall$122 = templateCardPresenter$executeServerToolCall$1;
        Object obj2 = templateCardPresenter$executeServerToolCall$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = templateCardPresenter$executeServerToolCall$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(z3);
    }

    public static PendingInput.StaticPicker createInputQuestion(TemplateCard.Picker.StaticPicker staticPicker, String str, String str2, Money money, TemplateCardPickerPlacement templateCardPickerPlacement) {
        TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData = new TemplateCardInputFieldAnalyticsData(str, TemplateCardFieldType.PICKER, templateCardPickerPlacement, 4);
        String str3 = staticPicker.title;
        String str4 = staticPicker.cta;
        ArrayList<TemplateCard.Picker.StaticPicker.Option> arrayList = staticPicker.options;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (TemplateCard.Picker.StaticPicker.Option option : arrayList) {
            String str5 = option.value;
            String str6 = option.label;
            String str7 = option.subtitle;
            Money money2 = option.maxAmount;
            TemplateCard.Picker.StaticPicker.Icon icon = option.icon;
            arrayList2.add(new MoneybotStaticPickerOption(str5, str6, str7, money2, icon != null ? TemplateCardPresenterKt.toStaticPickerIcon(icon) : null));
        }
        return new PendingInput.StaticPicker(str, templateCardInputFieldAnalyticsData, new MoneybotStaticPickerQuestion(str3, str4, arrayList2, str2, money));
    }

    public final Money amountForPlaceholder(String str, Map map) {
        Object obj;
        Money money;
        Object obj2 = map.get(str);
        SelectedInlineContentValue.Amount amount = obj2 instanceof SelectedInlineContentValue.Amount ? (SelectedInlineContentValue.Amount) obj2 : null;
        if (amount != null && (money = amount.value) != null) {
            return money;
        }
        Iterator it = this.metadata.inlineContent.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((TemplateCard.InlineContent) obj).placeholderKey, str)) {
                break;
            }
        }
        TemplateCard.InlineContent inlineContent = (TemplateCard.InlineContent) obj;
        if (inlineContent != null) {
            TemplateCard.EditableField editableField = inlineContent.editableField;
            TemplateCard.EditableField.Amount amount2 = editableField instanceof TemplateCard.EditableField.Amount ? (TemplateCard.EditableField.Amount) editableField : null;
            if (amount2 != null) {
                return amount2.prefilledAmount;
            }
        }
        return null;
    }

    public final void askQuestion(PendingInput pendingInput) {
        TemplateCardInputFieldAnalyticsData analyticsData = pendingInput.getAnalyticsData();
        if (analyticsData != null) {
            PluginContext pluginContext = this.pluginContext;
            this.analyticsService.analytics.track(new MoneybotTemplateCardFieldEditStart(pluginContext.chatSessionId, pluginContext.requestId, getServerToolName(), analyticsData.placeholderKey, analyticsData.fieldType, analyticsData.pickerKind, analyticsData.pickerPlacement), null);
        }
        boolean z = pendingInput instanceof PendingInput.Amount;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (z) {
            screenNavigator.askQuestion(((PendingInput.Amount) pendingInput).question, new MoneyTabUIKt$$ExternalSyntheticLambda13(27));
            return;
        }
        if (pendingInput instanceof PendingInput.StaticPicker) {
            screenNavigator.askQuestion(((PendingInput.StaticPicker) pendingInput).question, new MoneyTabUIKt$$ExternalSyntheticLambda13(28));
            return;
        }
        if (pendingInput instanceof PendingInput.TransferOptionPicker) {
            screenNavigator.askQuestion(TransferOptionPickerQuestion.INSTANCE, new MusicViewKt$$ExternalSyntheticLambda6(7, pendingInput, this));
        } else if (pendingInput instanceof PendingInput.Text) {
            screenNavigator.askQuestion(((PendingInput.Text) pendingInput).question, new MoneyTabUIKt$$ExternalSyntheticLambda13(26));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final String getServerToolName() {
        TemplateCard.TapBehavior tapBehavior = this.metadata.tapBehavior;
        if (tapBehavior instanceof TemplateCard.TapBehavior.TapAction) {
            TemplateCard.Action action = ((TemplateCard.TapBehavior.TapAction) tapBehavior).action;
            WorkLauncherImpl workLauncherImpl = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
            TemplateCard.Action.ServerToolCall serverToolCall = action instanceof TemplateCard.Action.ServerToolCall ? (TemplateCard.Action.ServerToolCall) action : null;
            if (serverToolCall != null) {
                return serverToolCall.toolName;
            }
            return null;
        }
        if (!(tapBehavior instanceof TemplateCard.TapBehavior.CardButtons)) {
            if (tapBehavior == null) {
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        TemplateCard.TapBehavior.CardButtons cardButtons = (TemplateCard.TapBehavior.CardButtons) tapBehavior;
        TemplateCard.Action action2 = cardButtons.primaryButton.action;
        WorkLauncherImpl workLauncherImpl2 = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
        TemplateCard.Action.ServerToolCall serverToolCall2 = action2 instanceof TemplateCard.Action.ServerToolCall ? (TemplateCard.Action.ServerToolCall) action2 : null;
        String str = serverToolCall2 != null ? serverToolCall2.toolName : null;
        if (str != null) {
            return str;
        }
        TemplateCard.Button button = cardButtons.secondaryButton;
        TemplateCard.Action action3 = button != null ? button.action : null;
        TemplateCard.Action.ServerToolCall serverToolCall3 = action3 instanceof TemplateCard.Action.ServerToolCall ? (TemplateCard.Action.ServerToolCall) action3 : null;
        if (serverToolCall3 != null) {
            return serverToolCall3.toolName;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:383:0x0860, code lost:
    
        if (r0 != 0) goto L425;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114, types: [com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard$EditableField$Picker] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v139, types: [com.squareup.cash.instruments.presenters.TransferOptionPickerResolver] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.squareup.cash.moneybot.screens.MoneybotChatScreen] */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard$EditableField$Picker] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel$BottomPicker] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4, types: [com.squareup.protos.common.Money] */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel$TapBehavior] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel$Icon] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel$Icon] */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel$Icon] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84, types: [com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard$Picker$SavingsTransferOptionPicker] */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue$Picker] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73, types: [com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard$EditableField$Text] */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r4v99 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiCallbackModel models(Composer composer) {
        TemplateCardViewModel.TapBehavior.ButtonGroup.Button button;
        Object obj;
        Object rememberedValue;
        MutableState mutableState;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        List list;
        List list2;
        Iterator it;
        Iterator it2;
        Map access$hydrateTransferOptionPrefills;
        Map access$hydrateTransferOptionPrefills2;
        Object rememberedValue5;
        boolean changedInstance;
        Object dotGridKt$DotGrid$3$1;
        Map map;
        Map map2;
        Object obj2;
        boolean changedInstance2;
        Object realKeyStoreProvider$setEntry$2;
        Object obj3;
        MutableState mutableState2;
        PendingInput pendingInput;
        MutableState mutableState3;
        boolean z;
        boolean z2;
        Object rememberedValue6;
        MutableState mutableState4;
        Map map3;
        TemplateCard.BottomPicker bottomPicker;
        Iterator it3;
        ArrayList plus;
        boolean z3;
        Iterator it4;
        List split$default;
        Iterator it5;
        ?? r26;
        TemplateCard.TapBehavior tapBehavior;
        TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall;
        ?? r28;
        ?? r0;
        String str;
        TemplateCardViewModel.BottomPicker bottomPicker2;
        String str2;
        int i;
        boolean z4;
        Iterator it6;
        ?? displayText;
        ?? r4;
        Object pair;
        String str3;
        String str4;
        Money amountForPlaceholder;
        Iterator it7;
        MutableState mutableState5;
        Object pair2;
        TemplateCard.Picker picker;
        Object text;
        Object text2;
        TemplateCardPresenter templateCardPresenter = this;
        TemplateCard templateCard = templateCardPresenter.metadata;
        TemplateCard.BottomPicker bottomPicker3 = templateCard.bottomPicker;
        ArrayList<TemplateCard.InlineContent> arrayList = templateCard.inlineContent;
        ?? r6 = (GapComposer) composer;
        r6.startReplaceGroup(-943775474);
        Object rememberedValue7 = r6.rememberedValue();
        Object obj4 = Composer.Companion.Empty;
        if (rememberedValue7 == obj4) {
            rememberedValue7 = templateCardPresenter.balanceSnapshotManager.select();
            r6.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, null, null, r6, 48, 2);
        Object rememberedValue8 = r6.rememberedValue();
        if (rememberedValue8 == obj4) {
            rememberedValue8 = templateCardPresenter.instrumentManager.select();
            r6.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue8, null, null, r6, 48, 2);
        Object rememberedValue9 = r6.rememberedValue();
        int i2 = 5;
        Continuation continuation = null;
        if (rememberedValue9 == obj4) {
            rememberedValue9 = templateCardPresenter.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, null, new Overlay$$ExternalSyntheticLambda0(templateCardPresenter, i2));
            r6.updateRememberedValue(rememberedValue9);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue9, r6);
        Object rememberedValue10 = r6.rememberedValue();
        if (rememberedValue10 == obj4) {
            rememberedValue10 = templateCardPresenter.sessionFlags.moneybotRespectSystemAppearance;
            r6.updateRememberedValue(rememberedValue10);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue10, null, r6, 1);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance3 = r6.changedInstance(templateCardPresenter);
        Object rememberedValue11 = r6.rememberedValue();
        int i3 = 0;
        if (changedInstance3 || rememberedValue11 == obj4) {
            rememberedValue11 = new TemplateCardPresenter$models$1$1(templateCardPresenter, continuation, i3);
            r6.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect((Composer) r6, unit, (Function2) rememberedValue11);
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
        Object rememberedValue12 = r6.rememberedValue();
        if (rememberedValue12 == obj4) {
            button = null;
            rememberedValue12 = new MoneyTabUIKt$$ExternalSyntheticLambda6(15);
            r6.updateRememberedValue(rememberedValue12);
        } else {
            button = null;
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue12, (Composer) r6, MLKEMEngine.KyberPolyBytes);
        ArrayList arrayList2 = new ArrayList();
        for (TemplateCard.InlineContent inlineContent : arrayList) {
            TemplateCard.EditableField editableField = inlineContent.editableField;
            if (editableField instanceof TemplateCard.EditableField.Text) {
                String str5 = ((TemplateCard.EditableField.Text) editableField).prefilledText;
                if (str5 != null) {
                    text2 = new SelectedInlineContentValue.Text(str5);
                }
                text2 = button;
            } else if (editableField instanceof TemplateCard.EditableField.Amount) {
                text2 = new SelectedInlineContentValue.Amount(((TemplateCard.EditableField.Amount) editableField).prefilledAmount);
            } else {
                if (!(editableField instanceof TemplateCard.EditableField.Picker)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TemplateCard.Picker picker2 = ((TemplateCard.EditableField.Picker) editableField).picker;
                if (picker2 instanceof TemplateCard.Picker.StaticPicker) {
                    TemplateCard.Picker.StaticPicker staticPicker = (TemplateCard.Picker.StaticPicker) picker2;
                    TemplateCard.Picker.StaticPicker.Option selectedOption = TemplateCardPresenterKt.selectedOption(staticPicker, staticPicker.selectedValue);
                    if (selectedOption != null) {
                        text2 = TemplateCardPresenterKt.toSelectedInlineContentValue(selectedOption);
                    }
                    text2 = button;
                } else {
                    if (picker2 instanceof TemplateCard.Picker.SavingsTransferOptionPicker) {
                        String str6 = ((TemplateCard.Picker.SavingsTransferOptionPicker) picker2).prefilledValue;
                        if (str6 != null) {
                            text2 = new SelectedInlineContentValue.Text(str6);
                        }
                    } else if (picker2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    text2 = button;
                }
            }
            Object pair3 = text2 != null ? new Pair(inlineContent.placeholderKey, text2) : button;
            if (pair3 != null) {
                arrayList2.add(pair3);
            }
        }
        Map map4 = MapsKt__MapsKt.toMap(arrayList2);
        if (bottomPicker3 != null) {
            TemplateCard.Picker picker3 = bottomPicker3.picker;
            if (picker3 instanceof TemplateCard.Picker.StaticPicker) {
                TemplateCard.Picker.StaticPicker staticPicker2 = (TemplateCard.Picker.StaticPicker) picker3;
                TemplateCard.Picker.StaticPicker.Option selectedOption2 = TemplateCardPresenterKt.selectedOption(staticPicker2, staticPicker2.selectedValue);
                if (selectedOption2 != null) {
                    text = TemplateCardPresenterKt.toSelectedInlineContentValue(selectedOption2);
                    if (text != null) {
                        obj = new Pair(bottomPicker3.placeholderKey, text);
                    }
                }
                text = button;
                if (text != null) {
                }
            } else {
                if (!(picker3 instanceof TemplateCard.Picker.SavingsTransferOptionPicker)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str7 = ((TemplateCard.Picker.SavingsTransferOptionPicker) picker3).prefilledValue;
                if (str7 != null) {
                    text = new SelectedInlineContentValue.Text(str7);
                    if (text != null) {
                    }
                }
                text = button;
                if (text != null) {
                }
            }
            LinkedHashMap plus2 = MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(map4, CollectionsKt__CollectionsKt.listOfNotNull(obj)), (Map) rememberSaveable.getValue());
            rememberedValue = r6.rememberedValue();
            if (rememberedValue == obj4) {
                rememberedValue = Updater.mutableStateOf$default(button);
                r6.updateRememberedValue(rememberedValue);
            }
            mutableState = (MutableState) rememberedValue;
            rememberedValue2 = r6.rememberedValue();
            if (rememberedValue2 == obj4) {
                rememberedValue2 = Updater.mutableStateOf$default(button);
                r6.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState6 = (MutableState) rememberedValue2;
            rememberedValue3 = r6.rememberedValue();
            if (rememberedValue3 == obj4) {
                rememberedValue3 = Updater.mutableStateOf$default(button);
                r6.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState7 = (MutableState) rememberedValue3;
            rememberedValue4 = r6.rememberedValue();
            if (rememberedValue4 == obj4) {
                rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r6);
                r6.updateRememberedValue(rememberedValue4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
            BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState.getValue();
            list = (List) collectAsState2.getValue();
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            List list3 = list;
            boolean z5 = ((List) collectAsState2.getValue()) == null;
            list2 = (List) receiveValueAsState.getValue();
            if (list2 == null) {
                list2 = EmptyList.INSTANCE;
            }
            List list4 = list2;
            List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker3 == null ? new Pair(bottomPicker3.placeholderKey, bottomPicker3.picker) : button);
            ArrayList arrayList3 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateCard.InlineContent inlineContent2 = (TemplateCard.InlineContent) it.next();
                TemplateCard.EditableField editableField2 = inlineContent2.editableField;
                Iterator it8 = it;
                ?? r11 = editableField2 instanceof TemplateCard.EditableField.Picker ? (TemplateCard.EditableField.Picker) editableField2 : button;
                Object pair4 = (r11 == 0 || (picker = r11.picker) == null) ? button : new Pair(inlineContent2.placeholderKey, picker);
                if (pair4 != null) {
                    arrayList3.add(pair4);
                }
                it = it8;
            }
            ArrayList plus3 = CollectionsKt.plus((Iterable) arrayList3, (Collection) listOfNotNull);
            ArrayList arrayList4 = new ArrayList();
            it2 = plus3.iterator();
            while (it2.hasNext()) {
                Pair pair5 = (Pair) it2.next();
                String str8 = (String) pair5.first;
                TemplateCard.Picker picker4 = (TemplateCard.Picker) pair5.second;
                ?? r3 = picker4 instanceof TemplateCard.Picker.SavingsTransferOptionPicker ? (TemplateCard.Picker.SavingsTransferOptionPicker) picker4 : button;
                if (r3 == 0 || (str4 = r3.amountFieldPlaceholderKey) == null || (amountForPlaceholder = templateCardPresenter.amountForPlaceholder(str4, plus2)) == null) {
                    it7 = it2;
                    mutableState5 = collectAsState3;
                } else {
                    List list5 = r3.transferOptionKinds;
                    it7 = it2;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        MutableState mutableState8 = collectAsState3;
                        TransferOptions access$toTransferOption = TemplateCardPresenterKt.access$toTransferOption((TransferOptionKind) it9.next());
                        if (access$toTransferOption != null) {
                            arrayList5.add(access$toTransferOption);
                        }
                        collectAsState3 = mutableState8;
                    }
                    mutableState5 = collectAsState3;
                    List list6 = r3.linkTransferOptions;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it10 = list6.iterator();
                    while (it10.hasNext()) {
                        Iterator it11 = it10;
                        TransferOptions access$toTransferOption2 = TemplateCardPresenterKt.access$toTransferOption((LinkTransferOption) it10.next());
                        if (access$toTransferOption2 != null) {
                            arrayList6.add(access$toTransferOption2);
                        }
                        it10 = it11;
                    }
                    ArrayList plus4 = CollectionsKt.plus((Iterable) arrayList6, (Collection) arrayList5);
                    if (!plus4.isEmpty()) {
                        pair2 = new Pair(str8, templateCardPresenter.transferOptionPickerResolver.resolve(amountForPlaceholder, plus4, balanceSnapshot, list3, list4, TemplateCardPresenterKt.access$hiddenOptionValues(r3, plus2), TemplateCardPresenterKt.access$hasBalanceGatingRule(r3) ? amountForPlaceholder : button, z5));
                        if (pair2 == null) {
                            arrayList4.add(pair2);
                        }
                        it2 = it7;
                        collectAsState3 = mutableState5;
                    }
                }
                pair2 = button;
                if (pair2 == null) {
                }
                it2 = it7;
                collectAsState3 = mutableState5;
            }
            Map map5 = MapsKt__MapsKt.toMap(arrayList4);
            access$hydrateTransferOptionPrefills = TemplateCardPresenterKt.access$hydrateTransferOptionPrefills(plus2, templateCard, map5, false);
            access$hydrateTransferOptionPrefills2 = TemplateCardPresenterKt.access$hydrateTransferOptionPrefills(plus2, templateCard, map5, true);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(access$hydrateTransferOptionPrefills2, r6);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(map5, r6);
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Boolean.valueOf(!((Boolean) collectAsState3.getValue()).booleanValue()), r6);
            rememberedValue5 = r6.rememberedValue();
            if (rememberedValue5 == obj4) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                r6.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState9 = (MutableState) rememberedValue5;
            changedInstance = r6.changedInstance(templateCardPresenter) | r6.changedInstance(access$hydrateTransferOptionPrefills) | r6.changedInstance(map5);
            Object rememberedValue13 = r6.rememberedValue();
            if (!changedInstance || rememberedValue13 == obj4) {
                map = access$hydrateTransferOptionPrefills2;
                dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) templateCardPresenter, (Object) access$hydrateTransferOptionPrefills, (Object) map5, mutableState9, (Continuation) null, 14);
                map2 = access$hydrateTransferOptionPrefills;
                r6.updateRememberedValue(dotGridKt$DotGrid$3$1);
            } else {
                map = access$hydrateTransferOptionPrefills2;
                dotGridKt$DotGrid$3$1 = rememberedValue13;
                map2 = access$hydrateTransferOptionPrefills;
            }
            Updater.LaunchedEffect(map, map5, (Function2) dotGridKt$DotGrid$3$1, r6);
            Screen screen = templateCardPresenter.pluginContext.contextScreen;
            ?? r02 = !(screen instanceof MoneybotChatScreen) ? (MoneybotChatScreen) screen : button;
            obj2 = r02 == 0 ? r02.pendingSheet : button;
            changedInstance2 = r6.changedInstance(obj2) | r6.changedInstance(templateCardPresenter);
            Object rememberedValue14 = r6.rememberedValue();
            if (!changedInstance2 || rememberedValue14 == obj4) {
                Object obj5 = obj2;
                ?? r42 = button;
                realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(obj5, this, mutableState, (Continuation) r42, 10);
                obj3 = obj5;
                templateCardPresenter = this;
                mutableState2 = mutableState;
                button = r42;
                r6.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            } else {
                obj3 = obj2;
                realKeyStoreProvider$setEntry$2 = rememberedValue14;
                mutableState2 = mutableState;
            }
            Updater.LaunchedEffect((Composer) r6, obj3, (Function2) realKeyStoreProvider$setEntry$2);
            pendingInput = (PendingInput) mutableState2.getValue();
            int i4 = 6;
            if (pendingInput instanceof PendingInput.Amount) {
                if (pendingInput instanceof PendingInput.StaticPicker) {
                    r6.startReplaceGroup(-1154277259);
                    boolean changed = r6.changed(rememberSaveable) | r6.changedInstance(templateCardPresenter);
                    Object rememberedValue15 = r6.rememberedValue();
                    if (changed || rememberedValue15 == obj4) {
                        mutableState3 = mutableState7;
                        TemplateCardPresenter$$ExternalSyntheticLambda2 templateCardPresenter$$ExternalSyntheticLambda2 = new TemplateCardPresenter$$ExternalSyntheticLambda2(templateCardPresenter, mutableState2, rememberSaveable, mutableState3, 1);
                        r6.updateRememberedValue(templateCardPresenter$$ExternalSyntheticLambda2);
                        rememberedValue15 = templateCardPresenter$$ExternalSyntheticLambda2;
                    } else {
                        mutableState3 = mutableState7;
                    }
                    Function2 function2 = (Function2) rememberedValue15;
                    AnswerDispatcher answerDispatcher = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
                    boolean changed2 = r6.changed(function2) | r6.changedInstance(answerDispatcher);
                    Object rememberedValue16 = r6.rememberedValue();
                    if (changed2 || rememberedValue16 == obj4) {
                        rememberedValue16 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 5);
                        r6.updateRememberedValue(rememberedValue16);
                    }
                    Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue16, (Composer) r6);
                    z2 = false;
                    r6.end(false);
                } else {
                    mutableState3 = mutableState7;
                    if (pendingInput instanceof PendingInput.TransferOptionPicker) {
                        r6.startReplaceGroup(-1153104126);
                        boolean changed3 = r6.changed(rememberSaveable) | r6.changedInstance(templateCardPresenter);
                        Object rememberedValue17 = r6.rememberedValue();
                        if (changed3 || rememberedValue17 == obj4) {
                            TemplateCardPresenter$$ExternalSyntheticLambda2 templateCardPresenter$$ExternalSyntheticLambda22 = new TemplateCardPresenter$$ExternalSyntheticLambda2(templateCardPresenter, mutableState2, rememberSaveable, mutableState3, 2);
                            r6.updateRememberedValue(templateCardPresenter$$ExternalSyntheticLambda22);
                            rememberedValue17 = templateCardPresenter$$ExternalSyntheticLambda22;
                        }
                        Function2 function22 = (Function2) rememberedValue17;
                        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
                        boolean changed4 = r6.changed(function22) | r6.changedInstance(answerDispatcher2);
                        Object rememberedValue18 = r6.rememberedValue();
                        if (changed4 || rememberedValue18 == obj4) {
                            rememberedValue18 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, i4);
                            r6.updateRememberedValue(rememberedValue18);
                        }
                        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue18, (Composer) r6);
                        z2 = false;
                        r6.end(false);
                    } else if (pendingInput instanceof PendingInput.Text) {
                        r6.startReplaceGroup(-1151488375);
                        boolean changed5 = r6.changed(rememberSaveable) | r6.changedInstance(templateCardPresenter);
                        Object rememberedValue19 = r6.rememberedValue();
                        if (changed5 || rememberedValue19 == obj4) {
                            rememberedValue19 = new MusicViewKt$$ExternalSyntheticLambda5(mutableState2, rememberSaveable, mutableState3, templateCardPresenter);
                            r6.updateRememberedValue(rememberedValue19);
                        }
                        Function2 function23 = (Function2) rememberedValue19;
                        AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
                        boolean changed6 = r6.changed(function23) | r6.changedInstance(answerDispatcher3);
                        Object rememberedValue20 = r6.rememberedValue();
                        if (changed6 || rememberedValue20 == obj4) {
                            rememberedValue20 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher3, 7);
                            r6.updateRememberedValue(rememberedValue20);
                        }
                        Updater.DisposableEffect(answerDispatcher3, (Function1) rememberedValue20, (Composer) r6);
                        z = false;
                        r6.end(false);
                    } else {
                        z = false;
                        if (pendingInput != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) r6, -729997857, false);
                        }
                        r6.startReplaceGroup(-729851822);
                        r6.end(false);
                    }
                }
                z = z2;
            } else {
                r6.startReplaceGroup(-1155163673);
                boolean changed7 = r6.changed(rememberSaveable) | r6.changedInstance(templateCardPresenter);
                Object rememberedValue21 = r6.rememberedValue();
                if (changed7 || rememberedValue21 == obj4) {
                    rememberedValue21 = new TemplateCardPresenter$$ExternalSyntheticLambda2(mutableState2, rememberSaveable, mutableState7, templateCardPresenter);
                    r6.updateRememberedValue(rememberedValue21);
                }
                Function2 function24 = (Function2) rememberedValue21;
                AnswerDispatcher answerDispatcher4 = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changed8 = r6.changed(function24) | r6.changedInstance(answerDispatcher4);
                Object rememberedValue22 = r6.rememberedValue();
                if (changed8 || rememberedValue22 == obj4) {
                    rememberedValue22 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function24, answerDispatcher4, 4);
                    r6.updateRememberedValue(rememberedValue22);
                }
                Updater.DisposableEffect(answerDispatcher4, (Function1) rememberedValue22, (Composer) r6);
                r6.end(false);
                z = false;
                mutableState3 = mutableState7;
            }
            rememberedValue6 = r6.rememberedValue();
            if (rememberedValue6 != obj4) {
                MutableState mutableState10 = mutableState3;
                mutableState4 = mutableState6;
                map3 = map2;
                rememberedValue6 = new CashMapPresenter$$ExternalSyntheticLambda4(templateCardPresenter, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, coroutineScope, mutableState2, mutableState4, mutableState10);
                mutableState3 = mutableState10;
                r6.updateRememberedValue(rememberedValue6);
            } else {
                mutableState4 = mutableState6;
                map3 = map2;
            }
            Function1 function1 = (Function1) rememberedValue6;
            ServerToolCallKey serverToolCallKey = (ServerToolCallKey) mutableState4.getValue();
            TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall2 = (TemplateCardViewEvent.ExecuteServerToolCall) mutableState3.getValue();
            ArrayList arrayList7 = templateCard.inlineContent;
            bottomPicker = templateCard.bottomPicker;
            Boolean bool = templateCard.editable;
            TemplateCardViewModel.EditState editState = serverToolCallKey == null ? TemplateCardViewModel.EditState.Processing : bool == null ? bool.booleanValue() : true ? TemplateCardViewModel.EditState.Editable : TemplateCardViewModel.EditState.Disabled;
            List listOfNotNull2 = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker == null ? new Pair(bottomPicker.placeholderKey, bottomPicker.picker) : button);
            ArrayList arrayList8 = new ArrayList();
            it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                TemplateCard.InlineContent inlineContent3 = (TemplateCard.InlineContent) it3.next();
                TemplateCard.EditableField editableField3 = inlineContent3.editableField;
                ArrayList arrayList9 = arrayList7;
                ?? r03 = editableField3 instanceof TemplateCard.EditableField.Picker ? (TemplateCard.EditableField.Picker) editableField3 : button;
                Object obj6 = r03 != 0 ? r03.picker : button;
                Object obj7 = obj6 instanceof TemplateCard.Picker.SavingsTransferOptionPicker ? (TemplateCard.Picker.SavingsTransferOptionPicker) obj6 : button;
                Object pair6 = obj7 != null ? new Pair(inlineContent3.placeholderKey, obj7) : button;
                if (pair6 != null) {
                    arrayList8.add(pair6);
                }
                arrayList7 = arrayList9;
            }
            ArrayList arrayList10 = arrayList7;
            plus = CollectionsKt.plus((Iterable) arrayList8, (Collection) listOfNotNull2);
            if (!plus.isEmpty()) {
                Iterator it12 = plus.iterator();
                while (it12.hasNext()) {
                    Pair pair7 = (Pair) it12.next();
                    String str9 = (String) pair7.first;
                    TemplateCard.Picker picker5 = (TemplateCard.Picker) pair7.second;
                    if (!(picker5 instanceof TemplateCard.Picker.StaticPicker)) {
                        if (!(picker5 instanceof TemplateCard.Picker.SavingsTransferOptionPicker)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (!(map3.get(str9) instanceof SelectedInlineContentValue.TransferOption)) {
                            z3 = true;
                            break;
                        }
                    } else {
                        if (!(map3.get(str9) instanceof SelectedInlineContentValue.Picker)) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z3 = false;
            String str10 = templateCard.displayTemplate;
            ArrayList arrayList11 = new ArrayList();
            it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                TemplateCard.InlineContent inlineContent4 = (TemplateCard.InlineContent) it4.next();
                String str11 = inlineContent4.placeholderKey;
                ServerToolCallKey serverToolCallKey2 = serverToolCallKey;
                TemplateCard.EditableField editableField4 = inlineContent4.editableField;
                SelectedInlineContentValue selectedInlineContentValue = (SelectedInlineContentValue) map.get(str11);
                TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall3 = executeServerToolCall2;
                if ((selectedInlineContentValue instanceof SelectedInlineContentValue.Text) && StringsKt.isBlank(((SelectedInlineContentValue.Text) selectedInlineContentValue).value)) {
                    ?? r43 = editableField4 instanceof TemplateCard.EditableField.Text ? (TemplateCard.EditableField.Text) editableField4 : button;
                    if (r43 != 0) {
                        z4 = z3;
                        str3 = r43.emptyPlaceholderText;
                        it6 = it4;
                        r4 = str3;
                    } else {
                        z4 = z3;
                        it6 = it4;
                        r4 = button;
                    }
                } else {
                    MoneyFormatter moneyFormatter = templateCardPresenter.moneyFormatter;
                    if (selectedInlineContentValue != null && (displayText = selectedInlineContentValue.displayText(moneyFormatter)) != 0) {
                        boolean isBlank = StringsKt.isBlank(displayText);
                        TemplateCardViewModel.TapBehavior.ButtonGroup.Button button2 = displayText;
                        if (isBlank) {
                            button2 = button;
                        }
                        if (button2 != null) {
                            it6 = it4;
                            r4 = button2;
                            z4 = z3;
                        }
                    }
                    z4 = z3;
                    if (editableField4 instanceof TemplateCard.EditableField.Text) {
                        TemplateCard.EditableField.Text text3 = (TemplateCard.EditableField.Text) editableField4;
                        String str12 = text3.prefilledText;
                        str3 = str12 == null ? text3.emptyPlaceholderText : str12;
                        it6 = it4;
                        r4 = str3;
                    } else if (editableField4 instanceof TemplateCard.EditableField.Picker) {
                        TemplateCard.EditableField.Picker picker6 = (TemplateCard.EditableField.Picker) editableField4;
                        TemplateCard.Picker picker7 = picker6.picker;
                        it6 = it4;
                        if (picker7 instanceof TemplateCard.Picker.StaticPicker) {
                            TemplateCard.Picker.StaticPicker staticPicker3 = (TemplateCard.Picker.StaticPicker) picker7;
                            TemplateCard.Picker.StaticPicker.Option selectedOption3 = TemplateCardPresenterKt.selectedOption(staticPicker3, staticPicker3.selectedValue);
                            if (selectedOption3 != null) {
                                r4 = selectedOption3.label;
                            }
                            r4 = button;
                        } else if (picker7 instanceof TemplateCard.Picker.SavingsTransferOptionPicker) {
                            r4 = picker6.accessibilityLabel;
                        } else {
                            if (picker7 != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            r4 = button;
                        }
                    } else {
                        it6 = it4;
                        if (!(editableField4 instanceof TemplateCard.EditableField.Amount)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        r4 = moneyFormatter.format(((TemplateCard.EditableField.Amount) editableField4).prefilledAmount);
                    }
                }
                if (r4 == 0) {
                    pair = button;
                } else {
                    String displayFormat = editableField4.getDisplayFormat();
                    String str13 = r4;
                    if (displayFormat != null) {
                        str13 = StringsKt__StringsJVMKt.replace$default(displayFormat, "{formatted_value}", r4);
                    }
                    ?? icon = selectedInlineContentValue != null ? TemplateCardPresenterKt.icon(selectedInlineContentValue) : button;
                    String str14 = inlineContent4.placeholderKey;
                    pair = new Pair(str14, new TemplateCardViewModel.DisplayTextSegment.Token(str14, str13, icon));
                }
                if (pair != null) {
                    arrayList11.add(pair);
                }
                serverToolCallKey = serverToolCallKey2;
                executeServerToolCall2 = executeServerToolCall3;
                z3 = z4;
                it4 = it6;
            }
            ServerToolCallKey serverToolCallKey3 = serverToolCallKey;
            TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall4 = executeServerToolCall2;
            boolean z6 = z3;
            Map map6 = MapsKt__MapsKt.toMap(arrayList11);
            split$default = StringsKt__StringsKt.split$default(str10, new String[]{"\n"}, false, 0, 6, null);
            List list7 = split$default;
            ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
            it5 = list7.iterator();
            while (it5.hasNext()) {
                String str15 = (String) it5.next();
                ArrayList arrayList13 = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int length = str15.length();
                Iterator it13 = it5;
                int i5 = 0;
                boolean z7 = false;
                while (i5 < length) {
                    Map map7 = map3;
                    char charAt = str15.charAt(i5);
                    int i6 = i5;
                    if (charAt == '{' && !z7) {
                        if (sb.length() > 0) {
                            CollectionsKt__MutableCollectionsKt.addAll(TemplateCardPresenterKt.parseBoldText(sb.toString()), arrayList13);
                            i = 0;
                            sb.setLength(0);
                        } else {
                            i = 0;
                        }
                        sb2.setLength(i);
                        z7 = true;
                    } else if (charAt == '}' && z7) {
                        TemplateCardViewModel.DisplayTextSegment.Token token = (TemplateCardViewModel.DisplayTextSegment.Token) map6.get(sb2.toString());
                        if (token != null) {
                            arrayList13.add(token);
                        }
                        z7 = false;
                    } else if (z7) {
                        sb2.append(charAt);
                    } else {
                        sb.append(charAt);
                    }
                    i5 = i6 + 1;
                    map3 = map7;
                }
                Map map8 = map3;
                if (sb.length() > 0) {
                    CollectionsKt__MutableCollectionsKt.addAll(TemplateCardPresenterKt.parseBoldText(sb.toString()), arrayList13);
                }
                arrayList12.add(arrayList13);
                it5 = it13;
                map3 = map8;
            }
            Map map9 = map3;
            String str16 = templateCard.description;
            AndroidStringManager androidStringManager = templateCardPresenter.stringManager;
            if (bottomPicker == null) {
                String str17 = androidStringManager.get(R.string.moneybot_template_card_select_source);
                TemplateCard.Picker picker8 = bottomPicker.picker;
                String str18 = bottomPicker.placeholderKey;
                if (picker8 instanceof TemplateCard.Picker.StaticPicker) {
                    Object obj8 = map.get(str18);
                    ?? r44 = obj8 instanceof SelectedInlineContentValue.Picker ? (SelectedInlineContentValue.Picker) obj8 : button;
                    TemplateCard.Picker.StaticPicker.Option selectedOption4 = TemplateCardPresenterKt.selectedOption((TemplateCard.Picker.StaticPicker) picker8, r44 != 0 ? r44.value : button);
                    bottomPicker2 = new TemplateCardViewModel.BottomPicker(bottomPicker.placeholderKey, (selectedOption4 == null || (str2 = selectedOption4.label) == null) ? str17 : str2, selectedOption4 != null ? selectedOption4.subtitle : button, bottomPicker.accessibilityLabel, selectedOption4 != null ? TemplateCardPresenterKt.icon(TemplateCardPresenterKt.toSelectedInlineContentValue(selectedOption4)) : button, selectedOption4 == null);
                } else {
                    if (!(picker8 instanceof TemplateCard.Picker.SavingsTransferOptionPicker)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SelectedInlineContentValue selectedInlineContentValue2 = (SelectedInlineContentValue) map.get(str18);
                    if (selectedInlineContentValue2 != null) {
                        if (!(selectedInlineContentValue2 instanceof SelectedInlineContentValue.Text)) {
                            if (selectedInlineContentValue2 instanceof SelectedInlineContentValue.Picker) {
                                r0 = ((SelectedInlineContentValue.Picker) selectedInlineContentValue2).label;
                            } else if (selectedInlineContentValue2 instanceof SelectedInlineContentValue.TransferOption) {
                                r0 = ((SelectedInlineContentValue.TransferOption) selectedInlineContentValue2).option.label;
                            } else if (!(selectedInlineContentValue2 instanceof SelectedInlineContentValue.Amount)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        r0 = button;
                    }
                    r0 = bottomPicker.accessibilityLabel;
                    if (r0 == 0) {
                        str = str18;
                        String str19 = bottomPicker.placeholderKey;
                        SelectedInlineContentValue selectedInlineContentValue3 = (SelectedInlineContentValue) map.get(str19);
                        ?? r31 = selectedInlineContentValue3 == null ? selectedInlineContentValue3 instanceof SelectedInlineContentValue.TransferOption ? ((SelectedInlineContentValue.TransferOption) selectedInlineContentValue3).option.balance : button : button;
                        String str20 = bottomPicker.accessibilityLabel;
                        SelectedInlineContentValue selectedInlineContentValue4 = (SelectedInlineContentValue) map.get(str18);
                        bottomPicker2 = new TemplateCardViewModel.BottomPicker(str19, str, r31, str20, selectedInlineContentValue4 == null ? TemplateCardPresenterKt.icon(selectedInlineContentValue4) : button, false);
                    }
                    str = r0;
                    String str192 = bottomPicker.placeholderKey;
                    SelectedInlineContentValue selectedInlineContentValue32 = (SelectedInlineContentValue) map.get(str192);
                    if (selectedInlineContentValue32 == null) {
                    }
                    String str202 = bottomPicker.accessibilityLabel;
                    SelectedInlineContentValue selectedInlineContentValue42 = (SelectedInlineContentValue) map.get(str18);
                    bottomPicker2 = new TemplateCardViewModel.BottomPicker(str192, str, r31, str202, selectedInlineContentValue42 == null ? TemplateCardPresenterKt.icon(selectedInlineContentValue42) : button, false);
                }
                r26 = bottomPicker2;
            } else {
                r26 = button;
            }
            tapBehavior = templateCard.tapBehavior;
            if (tapBehavior instanceof TemplateCard.TapBehavior.CardButtons) {
                executeServerToolCall = executeServerToolCall4;
                if (tapBehavior instanceof TemplateCard.TapBehavior.TapAction) {
                    ?? r04 = templateCardPresenter.toViewEvent(((TemplateCard.TapBehavior.TapAction) tapBehavior).action, map9, MoneybotTemplateCardTap.ButtonRole.CARD);
                    if (z6) {
                        r04 = button;
                    }
                    r28 = new TemplateCardViewModel.TapBehavior.TapAction(r04);
                } else {
                    if (tapBehavior != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    r28 = button;
                }
            } else {
                TemplateCard.TapBehavior.CardButtons cardButtons = (TemplateCard.TapBehavior.CardButtons) tapBehavior;
                executeServerToolCall = executeServerToolCall4;
                TemplateCardViewModel.TapBehavior.ButtonGroup.Button button3 = toButton(cardButtons.primaryButton, map9, serverToolCallKey3, executeServerToolCall, z6, MoneybotTemplateCardTap.ButtonRole.PRIMARY);
                TemplateCard.Button button4 = cardButtons.secondaryButton;
                r28 = new TemplateCardViewModel.TapBehavior.ButtonGroup(button3, button4 != null ? toButton(button4, map9, serverToolCallKey3, executeServerToolCall, false, MoneybotTemplateCardTap.ButtonRole.SECONDARY) : button);
            }
            UiCallbackModel uiCallbackModel = new UiCallbackModel(function1, new TemplateCardViewModel(arrayList12, str16, r26, editState, r28, executeServerToolCall == null ? androidStringManager.get(R.string.moneybot_template_card_tool_error) : button));
            r6.end(false);
            return uiCallbackModel;
        }
        obj = button;
        LinkedHashMap plus22 = MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(map4, CollectionsKt__CollectionsKt.listOfNotNull(obj)), (Map) rememberSaveable.getValue());
        rememberedValue = r6.rememberedValue();
        if (rememberedValue == obj4) {
        }
        mutableState = (MutableState) rememberedValue;
        rememberedValue2 = r6.rememberedValue();
        if (rememberedValue2 == obj4) {
        }
        MutableState mutableState62 = (MutableState) rememberedValue2;
        rememberedValue3 = r6.rememberedValue();
        if (rememberedValue3 == obj4) {
        }
        MutableState mutableState72 = (MutableState) rememberedValue3;
        rememberedValue4 = r6.rememberedValue();
        if (rememberedValue4 == obj4) {
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue4;
        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) collectAsState.getValue();
        list = (List) collectAsState2.getValue();
        if (list == null) {
        }
        List list32 = list;
        if (((List) collectAsState2.getValue()) == null) {
        }
        list2 = (List) receiveValueAsState.getValue();
        if (list2 == null) {
        }
        List list42 = list2;
        List listOfNotNull3 = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker3 == null ? new Pair(bottomPicker3.placeholderKey, bottomPicker3.picker) : button);
        ArrayList arrayList32 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        ArrayList plus32 = CollectionsKt.plus((Iterable) arrayList32, (Collection) listOfNotNull3);
        ArrayList arrayList42 = new ArrayList();
        it2 = plus32.iterator();
        while (it2.hasNext()) {
        }
        Map map52 = MapsKt__MapsKt.toMap(arrayList42);
        access$hydrateTransferOptionPrefills = TemplateCardPresenterKt.access$hydrateTransferOptionPrefills(plus22, templateCard, map52, false);
        access$hydrateTransferOptionPrefills2 = TemplateCardPresenterKt.access$hydrateTransferOptionPrefills(plus22, templateCard, map52, true);
        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(access$hydrateTransferOptionPrefills2, r6);
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(map52, r6);
        MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(Boolean.valueOf(!((Boolean) collectAsState3.getValue()).booleanValue()), r6);
        rememberedValue5 = r6.rememberedValue();
        if (rememberedValue5 == obj4) {
        }
        MutableState mutableState92 = (MutableState) rememberedValue5;
        changedInstance = r6.changedInstance(templateCardPresenter) | r6.changedInstance(access$hydrateTransferOptionPrefills) | r6.changedInstance(map52);
        Object rememberedValue132 = r6.rememberedValue();
        if (changedInstance) {
        }
        map = access$hydrateTransferOptionPrefills2;
        dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) templateCardPresenter, (Object) access$hydrateTransferOptionPrefills, (Object) map52, mutableState92, (Continuation) null, 14);
        map2 = access$hydrateTransferOptionPrefills;
        r6.updateRememberedValue(dotGridKt$DotGrid$3$1);
        Updater.LaunchedEffect(map, map52, (Function2) dotGridKt$DotGrid$3$1, r6);
        Screen screen2 = templateCardPresenter.pluginContext.contextScreen;
        if (!(screen2 instanceof MoneybotChatScreen)) {
        }
        if (r02 == 0) {
        }
        changedInstance2 = r6.changedInstance(obj2) | r6.changedInstance(templateCardPresenter);
        Object rememberedValue142 = r6.rememberedValue();
        if (changedInstance2) {
        }
        Object obj52 = obj2;
        ?? r422 = button;
        realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(obj52, this, mutableState, (Continuation) r422, 10);
        obj3 = obj52;
        templateCardPresenter = this;
        mutableState2 = mutableState;
        button = r422;
        r6.updateRememberedValue(realKeyStoreProvider$setEntry$2);
        Updater.LaunchedEffect((Composer) r6, obj3, (Function2) realKeyStoreProvider$setEntry$2);
        pendingInput = (PendingInput) mutableState2.getValue();
        int i42 = 6;
        if (pendingInput instanceof PendingInput.Amount) {
        }
        rememberedValue6 = r6.rememberedValue();
        if (rememberedValue6 != obj4) {
        }
        Function1 function12 = (Function1) rememberedValue6;
        ServerToolCallKey serverToolCallKey4 = (ServerToolCallKey) mutableState4.getValue();
        TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall22 = (TemplateCardViewEvent.ExecuteServerToolCall) mutableState3.getValue();
        ArrayList arrayList72 = templateCard.inlineContent;
        bottomPicker = templateCard.bottomPicker;
        Boolean bool2 = templateCard.editable;
        TemplateCardViewModel.EditState editState2 = serverToolCallKey4 == null ? TemplateCardViewModel.EditState.Processing : bool2 == null ? bool2.booleanValue() : true ? TemplateCardViewModel.EditState.Editable : TemplateCardViewModel.EditState.Disabled;
        List listOfNotNull22 = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker == null ? new Pair(bottomPicker.placeholderKey, bottomPicker.picker) : button);
        ArrayList arrayList82 = new ArrayList();
        it3 = arrayList72.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList102 = arrayList72;
        plus = CollectionsKt.plus((Iterable) arrayList82, (Collection) listOfNotNull22);
        if (!plus.isEmpty()) {
        }
        z3 = false;
        String str102 = templateCard.displayTemplate;
        ArrayList arrayList112 = new ArrayList();
        it4 = arrayList102.iterator();
        while (it4.hasNext()) {
        }
        ServerToolCallKey serverToolCallKey32 = serverToolCallKey4;
        TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall42 = executeServerToolCall22;
        boolean z62 = z3;
        Map map62 = MapsKt__MapsKt.toMap(arrayList112);
        split$default = StringsKt__StringsKt.split$default(str102, new String[]{"\n"}, false, 0, 6, null);
        List list72 = split$default;
        ArrayList arrayList122 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
        it5 = list72.iterator();
        while (it5.hasNext()) {
        }
        Map map92 = map3;
        String str162 = templateCard.description;
        AndroidStringManager androidStringManager2 = templateCardPresenter.stringManager;
        if (bottomPicker == null) {
        }
        tapBehavior = templateCard.tapBehavior;
        if (tapBehavior instanceof TemplateCard.TapBehavior.CardButtons) {
        }
        UiCallbackModel uiCallbackModel2 = new UiCallbackModel(function12, new TemplateCardViewModel(arrayList122, str162, r26, editState2, r28, executeServerToolCall == null ? androidStringManager2.get(R.string.moneybot_template_card_tool_error) : button));
        r6.end(false);
        return uiCallbackModel2;
    }

    public final TemplateCardViewModel.TapBehavior.ButtonGroup.Button toButton(TemplateCard.Button button, Map map, ServerToolCallKey serverToolCallKey, TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall, boolean z, MoneybotTemplateCardTap.ButtonRole buttonRole) {
        boolean z2;
        TemplateCardViewEvent viewEvent = toViewEvent(button.action, map, buttonRole);
        if (z) {
            viewEvent = null;
        }
        TemplateCardViewEvent templateCardViewEvent = viewEvent;
        String str = Intrinsics.areEqual(templateCardViewEvent, executeServerToolCall) ? this.stringManager.get(R.string.moneybot_template_card_try_again) : button.text;
        ButtonProminence.Id id = button.prominence;
        if (templateCardViewEvent instanceof TemplateCardViewEvent.ExecuteServerToolCall) {
            TemplateCardViewEvent.ExecuteServerToolCall executeServerToolCall2 = (TemplateCardViewEvent.ExecuteServerToolCall) templateCardViewEvent;
            WorkLauncherImpl workLauncherImpl = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
            if (new ServerToolCallKey(executeServerToolCall2.requestId, executeServerToolCall2.extensionName, executeServerToolCall2.toolName).equals(serverToolCallKey)) {
                z2 = true;
                return new TemplateCardViewModel.TapBehavior.ButtonGroup.Button(str, id, templateCardViewEvent, z2, (serverToolCallKey == null || templateCardViewEvent == null) ? false : true);
            }
        }
        z2 = false;
        return new TemplateCardViewModel.TapBehavior.ButtonGroup.Button(str, id, templateCardViewEvent, z2, (serverToolCallKey == null || templateCardViewEvent == null) ? false : true);
    }

    public final TemplateCardViewEvent toViewEvent(TemplateCard.Action action, Map map, MoneybotTemplateCardTap.ButtonRole buttonRole) {
        MoneyFormatter moneyFormatter;
        TemplateCard templateCard = this.metadata;
        String str = templateCard.targetPlaceholderKey;
        String str2 = templateCard.sourcePlaceholderKey;
        WorkLauncherImpl workLauncherImpl = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            moneyFormatter = this.moneyFormatter;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((SelectedInlineContentValue) entry.getValue()).templateValue(moneyFormatter));
        }
        boolean z = action instanceof TemplateCard.Action.ClientRouteAction;
        PluginContext pluginContext = this.pluginContext;
        if (z) {
            String str3 = pluginContext.requestId;
            TemplateCard.Action.ClientRouteAction clientRouteAction = (TemplateCard.Action.ClientRouteAction) action;
            return new TemplateCardViewEvent.LaunchClientRoute(str3, TemplateCardPresenterKt.replaceTemplateValues(clientRouteAction.clientRouteUrlTemplate, linkedHashMap), buttonRole, str2 != null ? TemplateCardPresenterKt.access$toOptionKind(str2, map) : null, str != null ? TemplateCardPresenterKt.access$toOptionKind(str, map) : null, clientRouteAction.tapCdfEvent);
        }
        if (!(action instanceof TemplateCard.Action.ServerToolCall)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (pluginContext.chatSessionId == null) {
            return null;
        }
        String str4 = pluginContext.requestId;
        TemplateCard.Action.ServerToolCall serverToolCall = (TemplateCard.Action.ServerToolCall) action;
        String str5 = serverToolCall.extensionName;
        String str6 = serverToolCall.toolName;
        String str7 = serverToolCall.argumentsTemplate;
        if (str7 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), ((SelectedInlineContentValue) entry2.getValue()).jsonTemplateValue(moneyFormatter));
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str8 = (String) entry3.getKey();
                JsonTemplateValue jsonTemplateValue = (JsonTemplateValue) entry3.getValue();
                str7 = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str7, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\"{", str8, "}\""), jsonTemplateValue.asJsonLiteral()), JsonLogicResult$Success$$ExternalSyntheticOutline0.m("{", str8, "}"), jsonTemplateValue.asJsonFragment());
            }
        } else {
            str7 = "{}";
        }
        return new TemplateCardViewEvent.ExecuteServerToolCall(str4, str5, str6, str7, buttonRole, str2 != null ? TemplateCardPresenterKt.access$toOptionKind(str2, map) : null, str != null ? TemplateCardPresenterKt.access$toOptionKind(str, map) : null, serverToolCall.tapCdfEvent);
    }
}
