package com.squareup.cash.recurringpayments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.recurringpayments.backend.OptimisticRecurringPaymentDisplay;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.recurringpayments.backend.RecurringPayment;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.protos.cash.p2pencoreedge.RecurringPaymentsService;
import com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesRequest;
import com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes7.dex */
public final class RealCreateOrEditRecurringPaymentPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RecurringPaymentsService appService;
    public final CreateOrEditRecurringPaymentScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final RealRecurringPaymentsManager recurringPaymentsManager;
    public final MoneyFormatter standardMoneyFormatter;
    public final AndroidStringManager stringManager;

    public final class Companion {
        public static AmountChooserViewModel.Content.AmountChooserActionButtonModel toAmountChooserActionButtonModel$default(RecurringPaymentBlocker.Button button) {
            String str = button.text;
            str.getClass();
            return new AmountChooserViewModel.Content.AmountChooserActionButtonModel(str, true, button.action == RecurringPaymentBlocker.Button.Action.DELETE);
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecurringPaymentBlocker.Button.Action.values().length];
            try {
                iArr[RecurringPaymentBlocker.Button.Action.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringPaymentBlocker.Button.Action.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringPaymentBlocker.AmountOption.Type.values().length];
            try {
                iArr2[RecurringPaymentBlocker.AmountOption.Type.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecurringPaymentBlocker.AmountOption.Type.PRESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecurringPaymentBlocker.AmountOption.Type.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealCreateOrEditRecurringPaymentPresenter(CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen, BetterNavigator.ScreenNavigator screenNavigator, RecurringPaymentsService recurringPaymentsService, RealRecurringPaymentsManager realRecurringPaymentsManager, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, Analytics analytics, LocalizedMoneyFormatter.Factory factory, RealObservabilityManager realObservabilityManager) {
        createOrEditRecurringPaymentScreen.getClass();
        this.args = createOrEditRecurringPaymentScreen;
        this.navigator = screenNavigator;
        this.appService = recurringPaymentsService;
        this.recurringPaymentsManager = realRecurringPaymentsManager;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
        this.standardMoneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        List list = createOrEditRecurringPaymentScreen.amountOptions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Boolean bool = ((RecurringPaymentBlocker.AmountOption) obj).is_selected;
            if (bool != null ? bool.booleanValue() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        if (this.args.amountOptions.size() <= 6) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleButtonTap(RealCreateOrEditRecurringPaymentPresenter realCreateOrEditRecurringPaymentPresenter, RecurringPaymentBlocker.Button.Action action, RecurringPaymentBlocker.Schedule schedule, Money money, ContinuationImpl continuationImpl) {
        RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1 realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1;
        int i;
        SetRecurringPaymentPreferencesRequest build;
        RecurringPaymentBlocker.Button.Action action2;
        Money money2;
        ApiResult apiResult;
        RecurringPaymentBlocker.Schedule schedule2 = schedule;
        BetterNavigator.ScreenNavigator screenNavigator = realCreateOrEditRecurringPaymentPresenter.navigator;
        CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = realCreateOrEditRecurringPaymentPresenter.args;
        if (continuationImpl instanceof RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1) {
            realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1 = (RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1) continuationImpl;
            int i2 = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                    if (i3 == 1) {
                        SetRecurringPaymentPreferencesRequest.Builder builder = new SetRecurringPaymentPreferencesRequest.Builder();
                        builder.request_context = createOrEditRecurringPaymentScreen.blockersData.requestContext;
                        builder.action = RecurringPaymentBlocker.Button.Action.SET;
                        builder.schedule = schedule2;
                        builder.amount = money;
                        build = builder.build();
                    } else {
                        if (i3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        SetRecurringPaymentPreferencesRequest.Builder builder2 = new SetRecurringPaymentPreferencesRequest.Builder();
                        builder2.request_context = createOrEditRecurringPaymentScreen.blockersData.requestContext;
                        builder2.action = RecurringPaymentBlocker.Button.Action.DELETE;
                        build = builder2.build();
                    }
                    RecurringPaymentsService recurringPaymentsService = realCreateOrEditRecurringPaymentPresenter.appService;
                    String str = createOrEditRecurringPaymentScreen.blockersData.flowToken;
                    action2 = action;
                    realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$0 = action2;
                    realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$1 = schedule2;
                    realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$2 = money;
                    realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.label = 1;
                    obj = recurringPaymentsService.setRecurringPaymentPreferences(str, build, realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    money2 = money;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Money money3 = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$2;
                    RecurringPaymentBlocker.Schedule schedule3 = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$1;
                    RecurringPaymentBlocker.Button.Action action3 = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    money2 = money3;
                    schedule2 = schedule3;
                    action2 = action3;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(new FailureMessageBlockerScreen(createOrEditRecurringPaymentScreen.blockersData, TextUtilsCompat.errorMessaging(realCreateOrEditRecurringPaymentPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 4));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (action2 == RecurringPaymentBlocker.Button.Action.SET) {
                        RealRecurringPaymentsManager realRecurringPaymentsManager = realCreateOrEditRecurringPaymentPresenter.recurringPaymentsManager;
                        String description = realCreateOrEditRecurringPaymentPresenter.description(schedule2);
                        money2.getClass();
                        StateFlowImpl stateFlowImpl = realRecurringPaymentsManager.recurringPayments;
                        Object value = stateFlowImpl.getValue();
                        RecurringPayments.Loaded loaded = value instanceof RecurringPayments.Loaded ? (RecurringPayments.Loaded) value : null;
                        if (loaded != null) {
                            ArrayList<RecurringPayment> arrayList = loaded.recurringPayments;
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (!((RecurringPayment) it.next()).isCanceled) {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (RecurringPayment recurringPayment : arrayList) {
                                boolean z2 = recurringPayment.isCanceled;
                                if (!z2) {
                                    recurringPayment = new RecurringPayment(recurringPayment.token, money2, description, recurringPayment.timeToPaymentDescription, recurringPayment.initiatorNote, recurringPayment.editUrl, z2);
                                }
                                arrayList2.add(recurringPayment);
                                description = description;
                            }
                            String str2 = description;
                            String str3 = loaded.initializationUrl;
                            if (!z && arrayList.isEmpty()) {
                                str3 = null;
                            }
                            RecurringPayments.Loaded loaded2 = new RecurringPayments.Loaded(str3, arrayList2);
                            realRecurringPaymentsManager.optimisticPaymentDisplay.setValue(z ? null : new OptimisticRecurringPaymentDisplay(money2, str2));
                            stateFlowImpl.updateState(null, loaded2);
                        }
                    }
                    BlockersData blockersData = createOrEditRecurringPaymentScreen.blockersData;
                    ResponseContext responseContext = ((SetRecurringPaymentPreferencesResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(realCreateOrEditRecurringPaymentPresenter.blockersNavigator.getNext(createOrEditRecurringPaymentScreen, blockersData.updateFromResponseContext(responseContext, false)));
                }
                return Unit.INSTANCE;
            }
        }
        realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1 = new RealCreateOrEditRecurringPaymentPresenter$handleButtonTap$1(realCreateOrEditRecurringPaymentPresenter, continuationImpl);
        Object obj2 = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCreateOrEditRecurringPaymentPresenter$handleButtonTap$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    public final String description(RecurringPaymentBlocker.Schedule schedule) {
        Object obj;
        Iterator it = this.args.enumerated_cadences.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((RecurringPaymentBlocker.EnumeratedCadence) obj).cadence, schedule.cadence)) {
                break;
            }
        }
        obj.getClass();
        Map<Integer, String> map = ((RecurringPaymentBlocker.EnumeratedCadence) obj).enumerated_descriptions;
        Integer num = schedule.day_of_cadence;
        num.getClass();
        String str = map.get(num);
        str.getClass();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        boolean z;
        Object obj;
        String str3;
        Object obj2;
        Object obj3;
        String str4;
        Long l;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1994568750);
        RealObservabilityManager.startTrackingView$default(this.observabilityManager, "create_or_edit_recurring_payment_screen");
        Object rememberedValue = gapComposer.rememberedValue();
        CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = this.args;
        String str5 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            Iterator it = createOrEditRecurringPaymentScreen.amountOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                Boolean bool = ((RecurringPaymentBlocker.AmountOption) obj3).is_selected;
                if (bool != null ? bool.booleanValue() : false) {
                    break;
                }
            }
            RecurringPaymentBlocker.AmountOption amountOption = (RecurringPaymentBlocker.AmountOption) obj3;
            if (amountOption == null || (l = amountOption.amount) == null || (str4 = WiresAccountInfo.WiresProfile.toRawAmount(l.longValue())) == null) {
                str4 = "0";
            }
            rememberedValue = Updater.mutableStateOf$default(str4);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        MoneyFormatter moneyFormatter = this.standardMoneyFormatter;
        int i2 = 1;
        if (rememberedValue2 == neverEqualPolicy) {
            List<RecurringPaymentBlocker.AmountOption> list = createOrEditRecurringPaymentScreen.amountOptions;
            CurrencyCode currencyCode = createOrEditRecurringPaymentScreen.currencyCode;
            ArrayList arrayList = new ArrayList();
            for (RecurringPaymentBlocker.AmountOption amountOption2 : list) {
                RecurringPaymentBlocker.AmountOption.Type type2 = amountOption2.type;
                type2.getClass();
                int i3 = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
                if (i3 == i2) {
                    str3 = str5;
                    obj2 = str3;
                } else if (i3 == 2) {
                    Long l2 = amountOption2.amount;
                    l2.getClass();
                    String format2 = moneyFormatter.format(new Money(l2, currencyCode, 4));
                    Boolean bool2 = amountOption2.is_selected;
                    boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    str3 = str5;
                    Long l3 = amountOption2.amount;
                    l3.getClass();
                    obj2 = new AmountSelectorOption.PreSetAmountSelectorOption(new Money(l3, currencyCode, 4), format2, booleanValue);
                } else {
                    if (i3 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return str5;
                    }
                    Boolean bool3 = amountOption2.is_selected;
                    obj2 = new AmountSelectorOption.CustomAmountSelectorOption(bool3 != null ? bool3.booleanValue() : false);
                    str3 = str5;
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
                str5 = str3;
                i2 = 1;
            }
            str = str5;
            rememberedValue2 = Updater.mutableStateOf$default(arrayList);
            gapComposer.updateRememberedValue(rememberedValue2);
        } else {
            str = null;
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            if (!createOrEditRecurringPaymentScreen.shouldForceExpand) {
                Iterator it2 = createOrEditRecurringPaymentScreen.amountOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = str;
                        break;
                    }
                    obj = it2.next();
                    RecurringPaymentBlocker.AmountOption amountOption3 = (RecurringPaymentBlocker.AmountOption) obj;
                    Boolean bool4 = amountOption3.is_selected;
                    if ((bool4 != null ? bool4.booleanValue() : false) && amountOption3.type == RecurringPaymentBlocker.AmountOption.Type.CUSTOM) {
                        break;
                    }
                }
                if (obj == null) {
                    z = false;
                    rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer);
                }
            }
            z = true;
            rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState4 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(new Versioned(Boolean.FALSE, 0));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState5 = (MutableState) rememberedValue5;
        Updater.LaunchedEffect(gapComposer, flow, new CardSchemePresenter$models$3$1(flow, (Continuation) null, this, mutableState, mutableState2, mutableState3, mutableState5, mutableState4, 1));
        String str6 = createOrEditRecurringPaymentScreen.title;
        CurrencyCode currencyCode2 = createOrEditRecurringPaymentScreen.currencyCode;
        if (str6 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return str;
        }
        boolean booleanValue2 = ((Boolean) ((Versioned) mutableState5.getValue()).value).booleanValue();
        if (!booleanValue2) {
            str2 = str;
        } else {
            if (!booleanValue2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return str;
            }
            Long l4 = createOrEditRecurringPaymentScreen.minAmountInCents;
            l4.getClass();
            String format3 = moneyFormatter.format(new Money(l4, currencyCode2, 4));
            Long l5 = createOrEditRecurringPaymentScreen.maxAmountInCents;
            l5.getClass();
            String format4 = moneyFormatter.format(new Money(l5, currencyCode2, 4));
            format3.getClass();
            format4.getClass();
            Object[] objArr = {format3, format4};
            Resources resources = this.stringManager.resources;
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.create_or_edit_recurring_payment_subtitle)).format(objArr);
            format5.getClass();
            str2 = format5;
        }
        String str7 = (String) mutableState.getValue();
        List list2 = (List) mutableState2.getValue();
        RecurringPaymentBlocker.Schedule schedule = createOrEditRecurringPaymentScreen.selectedSchedule;
        schedule.getClass();
        AmountChooserViewModel.Content.AmountChooserConfigButtonModel amountChooserConfigButtonModel = new AmountChooserViewModel.Content.AmountChooserConfigButtonModel(description(schedule));
        RecurringPaymentBlocker.Button button = createOrEditRecurringPaymentScreen.primaryButton;
        AmountChooserViewModel.Content.AmountChooserActionButtonModel amountChooserActionButtonModel$default = button != null ? Companion.toAmountChooserActionButtonModel$default(button) : str;
        RecurringPaymentBlocker.Button button2 = createOrEditRecurringPaymentScreen.secondaryButton;
        Object content = new AmountChooserViewModel.Content(str6, str2, str7, list2, amountChooserConfigButtonModel, amountChooserActionButtonModel$default, button2 != null ? Companion.toAmountChooserActionButtonModel$default(button2) : str, createOrEditRecurringPaymentScreen.currencyCode, ((Boolean) mutableState3.getValue()).booleanValue(), (Versioned) mutableState5.getValue());
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            content = AmountChooserViewModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return content;
    }
}
