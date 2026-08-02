package com.squareup.cash.borrow.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.CreditFirstTimeBorrowBlocker;
import com.squareup.protos.franklin.api.FirstTimeBorrowData;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CreditFirstTimeBorrowRequest;
import com.squareup.protos.franklin.app.CreditFirstTimeBorrowResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CreditFirstTimeBorrowBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.CreditFirstTimeBorrowBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final ErrorReporter errorReporter;
    public final String flowToken;
    public final IntentLauncher launcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final zzb outboundNavigator;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AmountPickerState {
        public static final /* synthetic */ AmountPickerState[] $VALUES;
        public static final AmountPickerState Closed;
        public static final AmountPickerState Condensed;
        public static final AmountPickerState Full;

        static {
            AmountPickerState amountPickerState = new AmountPickerState("Closed", 0);
            Closed = amountPickerState;
            AmountPickerState amountPickerState2 = new AmountPickerState("Condensed", 1);
            Condensed = amountPickerState2;
            AmountPickerState amountPickerState3 = new AmountPickerState("Full", 2);
            Full = amountPickerState3;
            $VALUES = new AmountPickerState[]{amountPickerState, amountPickerState2, amountPickerState3};
        }

        public static AmountPickerState valueOf(String str) {
            return (AmountPickerState) Enum.valueOf(AmountPickerState.class, str);
        }

        public static AmountPickerState[] values() {
            return (AmountPickerState[]) $VALUES.clone();
        }
    }

    public CreditFirstTimeBorrowBlockerPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, IntentLauncher intentLauncher, LocalizedMoneyFormatter.Factory factory, zzb zzbVar, AndroidStringManager androidStringManager, ErrorReporter errorReporter, Analytics analytics, BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        creditFirstTimeBorrowBlockerScreen.getClass();
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.launcher = intentLauncher;
        this.outboundNavigator = zzbVar;
        this.stringManager = androidStringManager;
        this.errorReporter = errorReporter;
        this.analytics = analytics;
        this.args = creditFirstTimeBorrowBlockerScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        String str = creditFirstTimeBorrowBlockerScreen.blockersData.flowToken;
        if (str == null) {
            BlockersData.Flow.INSTANCE.getClass();
            str = BlockersData.Flow.Companion.generateToken();
        }
        this.flowToken = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSecondaryButtonClick(CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter, FirstTimeBorrowViewEvent.SecondaryButtonClick secondaryButtonClick, MutableState mutableState, ContinuationImpl continuationImpl) {
        CreditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1 creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = creditFirstTimeBorrowBlockerPresenter.navigator;
        BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen = creditFirstTimeBorrowBlockerPresenter.args;
        if (continuationImpl instanceof CreditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1) {
            creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1 = (CreditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1) continuationImpl;
            int i2 = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    AppService appService = creditFirstTimeBorrowBlockerPresenter.appService;
                    BlockersData blockersData = creditFirstTimeBorrowBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData.flowToken;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(blockersData.requestContext, secondaryButtonClick.submitId, (List) null, 12);
                    creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.L$1 = mutableState;
                    creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.label = 1;
                    obj = appService.submitForm(clientScenario, str, submitFormRequest, creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData blockersData2 = creditFirstTimeBorrowBlockerScreen.blockersData;
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(creditFirstTimeBorrowBlockerPresenter.blockersDataNavigator.getNext(creditFirstTimeBorrowBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState.setValue(Boolean.FALSE);
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, creditFirstTimeBorrowBlockerScreen, creditFirstTimeBorrowBlockerPresenter.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1 = new CreditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1(creditFirstTimeBorrowBlockerPresenter, continuationImpl);
        Object obj2 = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditFirstTimeBorrowBlockerPresenter$handleSecondaryButtonClick$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAmountPickerConfirmAmount(Money money, MutableState mutableState, MutableState mutableState2, ContinuationImpl continuationImpl) {
        CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1 creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1) {
            creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1 = (CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1) continuationImpl;
            int i2 = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.label;
                BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    BlockersData blockersData = creditFirstTimeBorrowBlockerScreen.blockersData;
                    BlockersData blockersData2 = creditFirstTimeBorrowBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData2.flowToken;
                    CreditFirstTimeBorrowRequest creditFirstTimeBorrowRequest = new CreditFirstTimeBorrowRequest(blockersData2.requestContext, money, ByteString.EMPTY);
                    creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.L$1 = mutableState;
                    creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.L$2 = mutableState2;
                    creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.label = 1;
                    obj = this.appService.creditFirstTimeBorrow(clientScenario, str, creditFirstTimeBorrowRequest, creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState2 = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.L$2;
                    mutableState = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersData blockersData3 = creditFirstTimeBorrowBlockerScreen.blockersData;
                    ResponseContext responseContext = ((CreditFirstTimeBorrowResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    this.navigator.goTo(this.blockersDataNavigator.getNext(creditFirstTimeBorrowBlockerScreen, blockersData3.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState.setValue(Boolean.FALSE);
                    AndroidStringManager androidStringManager = this.stringManager;
                    mutableState2.setValue(new AlertDialogViewModel.Show(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, androidStringManager.get(R.string.close)));
                }
                return Unit.INSTANCE;
            }
        }
        creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1 = new CreditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1(this, continuationImpl);
        Object obj2 = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditFirstTimeBorrowBlockerPresenter$handleAmountPickerConfirmAmount$1.label;
        BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen2 = this.args;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0292  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        FirstTimeBorrowViewModel.Content.Notice notice;
        MutableState mutableState;
        FirstTimeBorrowViewModel.Content.Bullets bullets;
        FirstTimeBorrowViewModel.Content.HelpAction helpAction;
        int ordinal;
        BorrowAmountPickerViewModel borrowAmountPickerViewModel;
        BlockerAction blockerAction;
        FirstTimeBorrowViewModel.Content.SecondaryButton secondaryButton;
        Object content;
        BlockerAction.SubmitAction submitAction;
        String str;
        String str2;
        ArrayList arrayList;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-840041644);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(AmountPickerState.Closed);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(AlertDialogViewModel.Dismissed.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState5 = (MutableState) rememberedValue4;
        BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen = this.args;
        CreditFirstTimeBorrowBlocker creditFirstTimeBorrowBlocker = creditFirstTimeBorrowBlockerScreen.blocker;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new CreditFirstTimeBorrowBlockerPresenter$models$1$1(this, null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, creditFirstTimeBorrowBlocker, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new EngineInterceptor$intercept$2(22, mutableState4, flow, this, mutableState3, mutableState5, mutableState2, (Continuation) null));
        FirstTimeBorrowData firstTimeBorrowData = creditFirstTimeBorrowBlockerScreen.blocker.first_time_borrow_data;
        firstTimeBorrowData.getClass();
        InitiateLoanData initiateLoanData = firstTimeBorrowData.picker_data;
        initiateLoanData.getClass();
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        if (booleanValue) {
            content = FirstTimeBorrowViewModel.Loading.INSTANCE;
        } else {
            if (booleanValue) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str3 = firstTimeBorrowData.title;
            str3.getClass();
            String str4 = firstTimeBorrowData.subtitle;
            str4.getClass();
            Image image = firstTimeBorrowData.image;
            String str5 = firstTimeBorrowData.button_title;
            str5.getClass();
            FirstTimeBorrowViewModel.Content.BorrowButton borrowButton = new FirstTimeBorrowViewModel.Content.BorrowButton(str5);
            FirstTimeBorrowData.NoticeContent noticeContent = firstTimeBorrowData.notice_content;
            if (noticeContent != null) {
                String str6 = noticeContent.title;
                str6.getClass();
                String str7 = noticeContent.body;
                str7.getClass();
                notice = new FirstTimeBorrowViewModel.Content.Notice(str6, str7);
            } else {
                notice = null;
            }
            FirstTimeBorrowData.BulletContent bulletContent = firstTimeBorrowData.bullet_content;
            if (bulletContent != null) {
                if (bulletContent.bullet_items.isEmpty()) {
                    mutableState = mutableState4;
                    List<String> list = bulletContent.bullets;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FirstTimeBorrowViewModel.Content.BulletItem((String) it.next(), null));
                    }
                } else {
                    List<FirstTimeBorrowData.BulletContent.BulletItem> list2 = bulletContent.bullet_items;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (FirstTimeBorrowData.BulletContent.BulletItem bulletItem : list2) {
                        MutableState mutableState6 = mutableState4;
                        String str8 = bulletItem.text;
                        str8.getClass();
                        Icon icon = bulletItem.icon;
                        arrayList.add(new FirstTimeBorrowViewModel.Content.BulletItem(str8, icon != null ? icon.arcade_id : null));
                        mutableState4 = mutableState6;
                    }
                    mutableState = mutableState4;
                }
                FirstTimeBorrowData.BulletContent.SupportData supportData = bulletContent.support_data;
                bullets = new FirstTimeBorrowViewModel.Content.Bullets(supportData != null ? supportData.button_title : null, arrayList);
            } else {
                mutableState = mutableState4;
                bullets = null;
            }
            FirstTimeBorrowData.PromoContent promoContent = firstTimeBorrowData.promo_content;
            if (promoContent != null) {
                FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = promoContent.support_node_routing;
                if (supportNodeRouting != null) {
                    FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode buttonSupportNode = supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode ? (FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting : null;
                    if (buttonSupportNode != null) {
                        str = buttonSupportNode.getValue();
                        if (str == null) {
                            FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting2 = promoContent.support_node_routing;
                            if (supportNodeRouting2 != null) {
                                FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl buttonUrl = supportNodeRouting2 instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl ? (FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) supportNodeRouting2 : null;
                                if (buttonUrl != null) {
                                    str2 = buttonUrl.getValue();
                                    if (str2 == null) {
                                        promoContent = null;
                                    }
                                }
                            }
                            str2 = null;
                            if (str2 == null) {
                            }
                        }
                        if (promoContent != null) {
                            helpAction = FirstTimeBorrowViewModel.Content.HelpAction.INSTANCE;
                            ordinal = ((AmountPickerState) mutableState3.getValue()).ordinal();
                            if (ordinal != 0) {
                                borrowAmountPickerViewModel = null;
                            } else if (ordinal == 1) {
                                LocalizedString localizedString = initiateLoanData.title;
                                localizedString.getClass();
                                String str9 = localizedString.translated_value;
                                str9.getClass();
                                LocalizedString localizedString2 = initiateLoanData.subtitle;
                                String str10 = localizedString2 != null ? localizedString2.translated_value : null;
                                LocalizedString localizedString3 = initiateLoanData.primary_button_text;
                                localizedString3.getClass();
                                String str11 = localizedString3.translated_value;
                                str11.getClass();
                                boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                                List<InitiateLoanData.QuickLoanOption> list3 = initiateLoanData.quick_loan_options;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                Iterator<T> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    Money money = ((InitiateLoanData.QuickLoanOption) it2.next()).amount;
                                    money.getClass();
                                    arrayList2.add(this.moneyFormatter.format(money));
                                }
                                InitiateLoanData.CustomLoanOption customLoanOption = initiateLoanData.custom_loan_option;
                                customLoanOption.getClass();
                                LocalizedString localizedString4 = customLoanOption.display_string;
                                localizedString4.getClass();
                                String str12 = localizedString4.translated_value;
                                str12.getClass();
                                borrowAmountPickerViewModel = new BorrowAmountPickerViewModel.Condensed(str9, str10, str11, booleanValue2, CollectionsKt.plus((Collection) arrayList2, (Object) str12));
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                LocalizedString localizedString5 = initiateLoanData.title;
                                localizedString5.getClass();
                                String str13 = localizedString5.translated_value;
                                str13.getClass();
                                LocalizedString localizedString6 = initiateLoanData.subtitle;
                                String str14 = localizedString6 != null ? localizedString6.translated_value : null;
                                LocalizedString localizedString7 = initiateLoanData.primary_button_text;
                                localizedString7.getClass();
                                String str15 = localizedString7.translated_value;
                                str15.getClass();
                                borrowAmountPickerViewModel = new BorrowAmountPickerViewModel.Full(initiateLoanData.minimum_loan_amount, initiateLoanData.maximum_loan_amount, str13, str14, str15, ((Boolean) mutableState.getValue()).booleanValue());
                            }
                            AlertDialogViewModel alertDialogViewModel = (AlertDialogViewModel) mutableState5.getValue();
                            blockerAction = firstTimeBorrowData.secondary_action;
                            if (blockerAction == null) {
                                String str16 = blockerAction.text;
                                str16.getClass();
                                BlockerAction.Action action = blockerAction.action;
                                if (action != null) {
                                    BlockerAction.Action.SubmitAction submitAction2 = action instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action : null;
                                    if (submitAction2 != null) {
                                        submitAction = submitAction2.getValue();
                                        submitAction.getClass();
                                        String str17 = submitAction.id;
                                        str17.getClass();
                                        secondaryButton = new FirstTimeBorrowViewModel.Content.SecondaryButton(str16, str17);
                                    }
                                }
                                submitAction = null;
                                submitAction.getClass();
                                String str172 = submitAction.id;
                                str172.getClass();
                                secondaryButton = new FirstTimeBorrowViewModel.Content.SecondaryButton(str16, str172);
                            } else {
                                secondaryButton = null;
                            }
                            content = new FirstTimeBorrowViewModel.Content(str3, str4, image, borrowButton, secondaryButton, notice, bullets, helpAction, borrowAmountPickerViewModel, alertDialogViewModel);
                        }
                    }
                }
                str = null;
                if (str == null) {
                }
                if (promoContent != null) {
                }
            }
            helpAction = null;
            ordinal = ((AmountPickerState) mutableState3.getValue()).ordinal();
            if (ordinal != 0) {
            }
            AlertDialogViewModel alertDialogViewModel2 = (AlertDialogViewModel) mutableState5.getValue();
            blockerAction = firstTimeBorrowData.secondary_action;
            if (blockerAction == null) {
            }
            content = new FirstTimeBorrowViewModel.Content(str3, str4, image, borrowButton, secondaryButton, notice, bullets, helpAction, borrowAmountPickerViewModel, alertDialogViewModel2);
        }
        gapComposer.end(false);
        return content;
    }
}
