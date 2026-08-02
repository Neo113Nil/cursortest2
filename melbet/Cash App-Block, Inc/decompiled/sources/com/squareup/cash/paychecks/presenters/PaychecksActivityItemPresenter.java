package com.squareup.cash.paychecks.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.WindowInfoImpl;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.presenters.util.RealPaycheckSettlementDateFormatter;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class PaychecksActivityItemPresenter implements ActivityItemPresenter, HasObservability {
    public final PaycheckActivityData activityItem;
    public final MoneyFormatter amountFormatter;
    public final ErrorReporter errorReporter;
    public final Lazy eventHandler$delegate;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ActivityItemPresentationContext presentationContext;
    public final RealPaycheckSettlementDateFormatter settlementDateFormatter;
    public final AndroidStringManager stringManager;

    public PaychecksActivityItemPresenter(LocalizedMoneyFormatter.Factory factory, PaychecksActivityItemHandler$Factory$Impl paychecksActivityItemHandler$Factory$Impl, RealPaycheckSettlementDateFormatter realPaycheckSettlementDateFormatter, AndroidStringManager androidStringManager, Navigator navigator, ActivityItem activityItem, Function1 function1, ActivityItemPresentationContext activityItemPresentationContext, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        navigator.getClass();
        activityItem.getClass();
        this.settlementDateFormatter = realPaycheckSettlementDateFormatter;
        this.stringManager = androidStringManager;
        this.presentationContext = activityItemPresentationContext;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.activityItem = (PaycheckActivityData) activityItem;
        this.amountFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.eventHandler$delegate = LazyKt.lazy(new BasicShieetScope$$ExternalSyntheticLambda10(8, paychecksActivityItemHandler$Factory$Impl, navigator, function1));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter
    public final UiCallbackModel models(Composer composer) {
        String str;
        PaymentHistoryData.AmountTreatment amountTreatment;
        StackedAvatarViewModel.Avatar avatar;
        Color color;
        PaychecksUiState.Employer.EmployerUiConfiguration employerUiConfiguration;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1118641254);
        PaycheckActivityData paycheckActivityData = this.activityItem;
        PaychecksUiState.Paycheck paycheck = WindowInfoImpl.Companion.toPaycheck(this, paycheckActivityData.paycheck);
        PaychecksUiState.Paycheck.SettlementDate settlementDate = paycheck.settlementDate;
        String format2 = this.settlementDateFormatter.format(settlementDate);
        PaychecksUiState.Employer employer = paycheck.employer;
        if (employer == null || (employerUiConfiguration = employer.uiConfiguration) == null || (str = employerUiConfiguration.title) == null) {
            str = this.stringManager.get(R.string.paycheck_employer_unknown);
        }
        String str2 = str;
        String format3 = this.amountFormatter.format(UtilsKt.realizedAmount(paycheck));
        String str3 = paycheckActivityData.rowId;
        int ordinal = settlementDate.f1181type.ordinal();
        if (ordinal == 0) {
            amountTreatment = PaymentHistoryData.AmountTreatment.FADED;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            amountTreatment = PaymentHistoryData.AmountTreatment.STANDARD;
        }
        ItemAccessory.Amount amount = new ItemAccessory.Amount(format3, amountTreatment);
        PaychecksUiState.Employer.EmployerUiConfiguration employerUiConfiguration2 = employer != null ? employer.uiConfiguration : null;
        ColorModel.Accented accented = (employerUiConfiguration2 == null || (color = employerUiConfiguration2.avatarAccentColor) == null) ? null : new ColorModel.Accented(color);
        Image image = employerUiConfiguration2 != null ? employerUiConfiguration2.avatar : null;
        if (image != null) {
            avatar = new StackedAvatarViewModel.Avatar(accented, null, null, image, null, null, null, null, false, false, null, false, null, null, 131062);
        } else {
            zzd zzdVar = Icons.Companion;
            avatar = new StackedAvatarViewModel.Avatar(accented, null, null, null, null, new Icon("LQUx2D"), ColorModel.Icon.INSTANCE, null, false, false, null, false, null, null, 130526);
        }
        ActivityItemViewModel activityItemViewModel = new ActivityItemViewModel(str3, format2, str2, (String) null, (ItemAccessory) amount, (StackedAvatarViewModel) new StackedAvatarViewModel.Single(avatar), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{format2, str2, format3}), null, null, null, 0, null, null, 63), 5640);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(this) | gapComposer.changedInstance(activityItemViewModel);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda39(21, coroutineScope, this, activityItemViewModel);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue2, activityItemViewModel);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}
