package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetAmountRequest$Result$AmountResult;
import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes4.dex */
public final class AtmPickerAmountBlockerPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.AtmPickerAmountBlockerScreen args;
    public final AtmPickerAmountBlocker.AtmPicker atmPicker;
    public final AtmPickerAmountBlocker blocker;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final AtmPickerAmountBlocker.KeypadPicker keypadPicker;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PickerType {
        public static final /* synthetic */ PickerType[] $VALUES;
        public static final PickerType Atm;
        public static final PickerType Keypad;

        static {
            PickerType pickerType = new PickerType("Atm", 0);
            Atm = pickerType;
            PickerType pickerType2 = new PickerType("Keypad", 1);
            Keypad = pickerType2;
            $VALUES = new PickerType[]{pickerType, pickerType2};
        }

        public static PickerType valueOf(String str) {
            return (PickerType) Enum.valueOf(PickerType.class, str);
        }

        public static PickerType[] values() {
            return (PickerType[]) $VALUES.clone();
        }
    }

    public AtmPickerAmountBlockerPresenter(AppService appService, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.appService = appService;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = atmPickerAmountBlockerScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        AtmPickerAmountBlocker blocker = atmPickerAmountBlockerScreen.getBlocker();
        this.blocker = blocker;
        AtmPickerAmountBlocker.AtmPicker atmPicker = blocker.atm_picker;
        atmPicker.getClass();
        this.atmPicker = atmPicker;
        AtmPickerAmountBlocker.KeypadPicker keypadPicker = blocker.keypad_picker;
        keypadPicker.getClass();
        this.keypadPicker = keypadPicker;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitAmount(AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter, Money money, ContinuationImpl continuationImpl) {
        AtmPickerAmountBlockerPresenter$submitAmount$1 atmPickerAmountBlockerPresenter$submitAmount$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = atmPickerAmountBlockerPresenter.navigator;
        BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen = atmPickerAmountBlockerPresenter.args;
        if (continuationImpl instanceof AtmPickerAmountBlockerPresenter$submitAmount$1) {
            atmPickerAmountBlockerPresenter$submitAmount$1 = (AtmPickerAmountBlockerPresenter$submitAmount$1) continuationImpl;
            int i2 = atmPickerAmountBlockerPresenter$submitAmount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                atmPickerAmountBlockerPresenter$submitAmount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = atmPickerAmountBlockerPresenter$submitAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = atmPickerAmountBlockerPresenter$submitAmount$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = atmPickerAmountBlockerPresenter.appService;
                    ClientScenario clientScenario = atmPickerAmountBlockerScreen.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = atmPickerAmountBlockerScreen.getBlockersData().flowToken;
                    SetAmountRequest setAmountRequest = new SetAmountRequest(atmPickerAmountBlockerScreen.getBlockersData().requestContext, new SetAmountRequest$Result$AmountResult(new SetAmountRequest.AmountResult(money)), 4);
                    atmPickerAmountBlockerPresenter$submitAmount$1.label = 1;
                    obj = appService.setAmount(clientScenario, str, setAmountRequest, atmPickerAmountBlockerPresenter$submitAmount$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersDataNavigator blockersDataNavigator = atmPickerAmountBlockerPresenter.blockersDataNavigator;
                    BlockersData blockersData = atmPickerAmountBlockerScreen.getBlockersData();
                    ResponseContext responseContext = ((SetAmountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(blockersDataNavigator.getNext(atmPickerAmountBlockerScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(atmPickerAmountBlockerPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
                }
                return Unit.INSTANCE;
            }
        }
        atmPickerAmountBlockerPresenter$submitAmount$1 = new AtmPickerAmountBlockerPresenter$submitAmount$1(atmPickerAmountBlockerPresenter, continuationImpl);
        Object obj2 = atmPickerAmountBlockerPresenter$submitAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = atmPickerAmountBlockerPresenter$submitAmount$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[LOOP:0: B:14:0x004e->B:26:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[EDGE_INSN: B:27:0x0081->B:28:0x0081 BREAK  A[LOOP:0: B:14:0x004e->B:26:0x007d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6 A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object atmPicker;
        Object obj;
        Object obj2;
        AtmPickerAmountBlockerViewModel.AtmPicker.Option option;
        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount presetAmount;
        AtmPickerAmountBlocker.AtmPickerOption.Option option2;
        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount presetAmount2;
        boolean z;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-104460526);
        Object rememberedValue = gapComposer.rememberedValue();
        BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen = this.args;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(atmPickerAmountBlockerScreen instanceof BlockersScreens.AtmPickerAmountBlockerScreen.Fullscreen ? PickerType.Keypad : PickerType.Atm);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        AtmPickerAmountBlocker.AtmPicker atmPicker2 = this.atmPicker;
        Throwable th = null;
        if (rememberedValue3 == neverEqualPolicy) {
            Iterator<AtmPickerAmountBlocker.AtmPickerOption> it = atmPicker2.options.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                AtmPickerAmountBlocker.AtmPickerOption.Option option3 = it.next().option;
                if (option3 != null) {
                    AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount3 = option3 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option3 : null;
                    AtmPickerAmountBlocker.AtmPickerOption.PresetAmount value = presetAmount3 != null ? presetAmount3.getValue() : null;
                    if (value != null) {
                        z = Intrinsics.areEqual(value.is_preselected, Boolean.TRUE);
                        if (!z) {
                            break;
                        }
                        i2++;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(i2, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, parcelableSnapshotMutableIntState, mutableState, mutableState2, 28));
        int ordinal = ((PickerType) mutableState.getValue()).ordinal();
        AtmPickerAmountBlocker atmPickerAmountBlocker = this.blocker;
        if (ordinal == 0) {
            String str = atmPicker2.title;
            str.getClass();
            boolean z2 = true;
            String str2 = atmPicker2.subtitle;
            List<AtmPickerAmountBlocker.AtmPickerOption> list = atmPicker2.options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i3 = 0;
            for (Object obj3 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th2;
                }
                AtmPickerAmountBlocker.AtmPickerOption atmPickerOption = (AtmPickerAmountBlocker.AtmPickerOption) obj3;
                boolean z3 = z2;
                AtmPickerAmountBlocker.AtmPickerOption.Option option4 = atmPickerOption.option;
                Throwable th3 = th;
                if (option4 != null) {
                    AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount4 = option4 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option4 : th3;
                    if (presetAmount4 != 0) {
                        obj = presetAmount4.getValue();
                        if (obj == null) {
                            AtmPickerAmountBlocker.AtmPickerOption.Option option5 = atmPickerOption.option;
                            if (option5 != null) {
                                AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount5 = option5 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option5 : th3;
                                if (presetAmount5 != 0) {
                                    presetAmount = presetAmount5.getValue();
                                    presetAmount.getClass();
                                    Money money = presetAmount.amount;
                                    money.getClass();
                                    String format2 = this.moneyFormatter.format(money);
                                    option2 = atmPickerOption.option;
                                    if (option2 != null) {
                                        AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount6 = option2 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option2 : th3;
                                        if (presetAmount6 != 0) {
                                            presetAmount2 = presetAmount6.getValue();
                                            presetAmount2.getClass();
                                            option = new AtmPickerAmountBlockerViewModel.AtmPicker.PresetAmountOption(format2, !Intrinsics.areEqual(presetAmount2.is_disabled, Boolean.TRUE), i3 == parcelableSnapshotMutableIntState.getIntValue() ? z3 : false);
                                        }
                                    }
                                    presetAmount2 = th3;
                                    presetAmount2.getClass();
                                    option = new AtmPickerAmountBlockerViewModel.AtmPicker.PresetAmountOption(format2, !Intrinsics.areEqual(presetAmount2.is_disabled, Boolean.TRUE), i3 == parcelableSnapshotMutableIntState.getIntValue() ? z3 : false);
                                }
                            }
                            presetAmount = th3;
                            presetAmount.getClass();
                            Money money2 = presetAmount.amount;
                            money2.getClass();
                            String format22 = this.moneyFormatter.format(money2);
                            option2 = atmPickerOption.option;
                            if (option2 != null) {
                            }
                            presetAmount2 = th3;
                            presetAmount2.getClass();
                            option = new AtmPickerAmountBlockerViewModel.AtmPicker.PresetAmountOption(format22, !Intrinsics.areEqual(presetAmount2.is_disabled, Boolean.TRUE), i3 == parcelableSnapshotMutableIntState.getIntValue() ? z3 : false);
                        } else {
                            AtmPickerAmountBlocker.AtmPickerOption.Option option6 = atmPickerOption.option;
                            if (option6 != null) {
                                AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad keypad = option6 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad ? (AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) option6 : th3;
                                if (keypad != 0) {
                                    obj2 = keypad.getValue();
                                    if (obj2 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Unsupported Option");
                                        return th3;
                                    }
                                    option = AtmPickerAmountBlockerViewModel.AtmPicker.KeypadOption.INSTANCE;
                                }
                            }
                            obj2 = th3;
                            if (obj2 != null) {
                            }
                        }
                        arrayList.add(option);
                        z2 = z3;
                        th = th3;
                        i3 = i4;
                    }
                }
                obj = th3;
                if (obj == null) {
                }
                arrayList.add(option);
                z2 = z3;
                th = th3;
                i3 = i4;
            }
            boolean z4 = z2;
            ButtonDefault buttonDefault = atmPickerAmountBlocker.primary_button;
            buttonDefault.getClass();
            LocalizedString localizedString = buttonDefault.text;
            localizedString.getClass();
            String str3 = localizedString.translated_value;
            str3.getClass();
            atmPicker = new AtmPickerAmountBlockerViewModel.AtmPicker(str, str2, arrayList, str3, ((Boolean) mutableState2.getValue()).booleanValue(), atmPickerAmountBlockerScreen.getRetreatAction() != null ? z4 : false, AtmPickerAmountBlockerPresenterKt.toAnimationDirection(atmPickerAmountBlockerScreen.getBlocker().submit_animation_direction));
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AtmPickerAmountBlocker.KeypadPicker keypadPicker = this.keypadPicker;
            String str4 = keypadPicker.title;
            str4.getClass();
            String str5 = keypadPicker.subtitle;
            ButtonDefault buttonDefault2 = atmPickerAmountBlocker.primary_button;
            buttonDefault2.getClass();
            LocalizedString localizedString2 = buttonDefault2.text;
            localizedString2.getClass();
            String str6 = localizedString2.translated_value;
            str6.getClass();
            atmPicker = new AtmPickerAmountBlockerViewModel.KeypadPicker(str4, str5, str6, ((Boolean) mutableState2.getValue()).booleanValue(), keypadPicker.minimum_amount, keypadPicker.maximum_amount, atmPickerAmountBlockerScreen.getRetreatAction() != null, AtmPickerAmountBlockerPresenterKt.toAnimationDirection(atmPickerAmountBlockerScreen.getBlocker().submit_animation_direction));
        }
        gapComposer.end(false);
        return atmPicker;
    }
}
