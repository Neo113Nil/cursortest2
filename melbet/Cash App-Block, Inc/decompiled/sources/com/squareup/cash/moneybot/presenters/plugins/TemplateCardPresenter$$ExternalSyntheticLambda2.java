package com.squareup.cash.moneybot.presenters.plugins;

import androidx.compose.runtime.MutableState;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardLinkTap;
import com.squareup.cash.instruments.screens.TransferOptionPickerAnswer;
import com.squareup.cash.instruments.screens.TransferOptionPickerQuestion;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.analytics.TemplateCardInputFieldAnalyticsData;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.PendingInput;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerAnswer;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class TemplateCardPresenter$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ TemplateCardPresenter f$1;
    public final /* synthetic */ MutableState f$2;
    public final /* synthetic */ MutableState f$3;

    public /* synthetic */ TemplateCardPresenter$$ExternalSyntheticLambda2(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, TemplateCardPresenter templateCardPresenter) {
        this.$r8$classId = 0;
        this.f$0 = mutableState;
        this.f$1 = templateCardPresenter;
        this.f$2 = mutableState2;
        this.f$3 = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Money money;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$3;
        MutableState mutableState2 = this.f$2;
        MutableState mutableState3 = this.f$0;
        TemplateCardPresenter templateCardPresenter = this.f$1;
        switch (i) {
            case 0:
                MoneybotAmountInputQuestion moneybotAmountInputQuestion = (MoneybotAmountInputQuestion) obj;
                MoneybotAmountInputAnswer moneybotAmountInputAnswer = (MoneybotAmountInputAnswer) obj2;
                moneybotAmountInputQuestion.getClass();
                PendingInput pendingInput = (PendingInput) mutableState3.getValue();
                PendingInput.Amount amount = pendingInput instanceof PendingInput.Amount ? (PendingInput.Amount) pendingInput : null;
                if (amount != null) {
                    if (!amount.question.equals(moneybotAmountInputQuestion)) {
                        amount = null;
                    }
                    if (amount != null) {
                        WorkLauncherImpl workLauncherImpl = TemplateCardPresenterKt.SelectedInlineContentValuesSaver;
                        MoneybotAmountInputAnswer.Selected selected = moneybotAmountInputAnswer instanceof MoneybotAmountInputAnswer.Selected ? (MoneybotAmountInputAnswer.Selected) moneybotAmountInputAnswer : null;
                        SelectedInlineContentValue.Amount amount2 = (selected == null || (money = selected.amount) == null) ? null : new SelectedInlineContentValue.Amount(money);
                        if (amount2 != null) {
                            mutableState2.setValue(MapsKt__MapsKt.plus((Map) mutableState2.getValue(), new Pair(amount.placeholderKey, amount2)));
                            RealMoneybotAnalyticsService realMoneybotAnalyticsService = templateCardPresenter.analyticsService;
                            PluginContext pluginContext = templateCardPresenter.pluginContext;
                            String str = pluginContext.chatSessionId;
                            String str2 = pluginContext.requestId;
                            String serverToolName = templateCardPresenter.getServerToolName();
                            TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData = amount.analyticsData;
                            Long l = amount2.value.amount;
                            realMoneybotAnalyticsService.submitTemplateCardFieldEditCommit(str, str2, serverToolName, templateCardInputFieldAnalyticsData, l != null ? String.valueOf(l.longValue()) : null);
                            mutableState.setValue(null);
                        }
                        mutableState3.setValue(null);
                        break;
                    }
                }
                break;
            case 1:
                MoneybotStaticPickerQuestion moneybotStaticPickerQuestion = (MoneybotStaticPickerQuestion) obj;
                MoneybotStaticPickerAnswer moneybotStaticPickerAnswer = (MoneybotStaticPickerAnswer) obj2;
                moneybotStaticPickerQuestion.getClass();
                PendingInput pendingInput2 = (PendingInput) mutableState3.getValue();
                PendingInput.StaticPicker staticPicker = pendingInput2 instanceof PendingInput.StaticPicker ? (PendingInput.StaticPicker) pendingInput2 : null;
                if (staticPicker != null) {
                    if (!staticPicker.question.equals(moneybotStaticPickerQuestion)) {
                        staticPicker = null;
                    }
                    if (staticPicker != null) {
                        if (moneybotStaticPickerAnswer instanceof MoneybotStaticPickerAnswer.Selected) {
                            Map map = (Map) mutableState2.getValue();
                            String str3 = staticPicker.placeholderKey;
                            MoneybotStaticPickerOption moneybotStaticPickerOption = ((MoneybotStaticPickerAnswer.Selected) moneybotStaticPickerAnswer).option;
                            mutableState2.setValue(MapsKt__MapsKt.plus(map, new Pair(str3, new SelectedInlineContentValue.Picker(moneybotStaticPickerOption.value, moneybotStaticPickerOption.label, moneybotStaticPickerOption.icon))));
                            RealMoneybotAnalyticsService realMoneybotAnalyticsService2 = templateCardPresenter.analyticsService;
                            PluginContext pluginContext2 = templateCardPresenter.pluginContext;
                            realMoneybotAnalyticsService2.submitTemplateCardFieldEditCommit(pluginContext2.chatSessionId, pluginContext2.requestId, templateCardPresenter.getServerToolName(), staticPicker.analyticsData, null);
                            mutableState.setValue(null);
                        }
                        mutableState3.setValue(null);
                        break;
                    }
                }
                break;
            default:
                PluginContext pluginContext3 = templateCardPresenter.pluginContext;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService3 = templateCardPresenter.analyticsService;
                TransferOptionPickerQuestion transferOptionPickerQuestion = (TransferOptionPickerQuestion) obj;
                TransferOptionPickerAnswer transferOptionPickerAnswer = (TransferOptionPickerAnswer) obj2;
                transferOptionPickerQuestion.getClass();
                PendingInput pendingInput3 = (PendingInput) mutableState3.getValue();
                PendingInput.TransferOptionPicker transferOptionPicker = pendingInput3 instanceof PendingInput.TransferOptionPicker ? (PendingInput.TransferOptionPicker) pendingInput3 : null;
                if (transferOptionPicker != null) {
                    if (!TransferOptionPickerQuestion.INSTANCE.equals(transferOptionPickerQuestion)) {
                        transferOptionPicker = null;
                    }
                    if (transferOptionPicker != null) {
                        TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData2 = transferOptionPicker.analyticsData;
                        if (!(transferOptionPickerAnswer instanceof TransferOptionPickerAnswer.Selected)) {
                            if (!(transferOptionPickerAnswer instanceof TransferOptionPickerAnswer.LinkTapped)) {
                                if (!Intrinsics.areEqual(transferOptionPickerAnswer, TransferOptionPickerAnswer.Dismissed.INSTANCE) && transferOptionPickerAnswer != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else {
                                realMoneybotAnalyticsService3.analytics.track(new MoneybotTemplateCardLinkTap(pluginContext3.chatSessionId, pluginContext3.requestId, templateCardPresenter.getServerToolName(), templateCardInputFieldAnalyticsData2.placeholderKey, templateCardInputFieldAnalyticsData2.pickerKind, templateCardInputFieldAnalyticsData2.pickerPlacement, TemplateCardPresenterKt.toAnalyticsOptionKind(((TransferOptionPickerAnswer.LinkTapped) transferOptionPickerAnswer).transferOption)), null);
                            }
                        } else {
                            Map map2 = (Map) mutableState2.getValue();
                            String str4 = transferOptionPicker.placeholderKey;
                            TransferOptionPickerSelectedOption transferOptionPickerSelectedOption = ((TransferOptionPickerAnswer.Selected) transferOptionPickerAnswer).option;
                            mutableState2.setValue(MapsKt__MapsKt.plus(map2, new Pair(str4, new SelectedInlineContentValue.TransferOption(transferOptionPickerSelectedOption))));
                            realMoneybotAnalyticsService3.submitTemplateCardFieldEditCommit(pluginContext3.chatSessionId, pluginContext3.requestId, templateCardPresenter.getServerToolName(), templateCardInputFieldAnalyticsData2, TemplateCardPresenterKt.toAnalyticsOptionKind(transferOptionPickerSelectedOption.selection.transferOption));
                            mutableState.setValue(null);
                        }
                        mutableState3.setValue(null);
                        break;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TemplateCardPresenter$$ExternalSyntheticLambda2(TemplateCardPresenter templateCardPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.$r8$classId = i;
        this.f$1 = templateCardPresenter;
        this.f$0 = mutableState;
        this.f$2 = mutableState2;
        this.f$3 = mutableState3;
    }
}
