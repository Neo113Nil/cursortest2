package com.squareup.cash.paychecks.backend.api.mapper;

import androidx.compose.ui.draw.RotateKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.EmptyObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BottomSheet;
import squareup.cash.paychecks.LocalizedTemplatedString;

/* loaded from: classes6.dex */
public abstract class EditDistributionConfigurationMappersKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.values().length];
            try {
                iArr[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.SUBMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.DISMISS_ON_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior.DISMISS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.values().length];
            try {
                iArr2[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior toBackButtonBehavior(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.BackButtonBehavior backButtonBehavior) {
        int i = backButtonBehavior == null ? -1 : WhenMappings.$EnumSwitchMapping$0[backButtonBehavior.ordinal()];
        if (i == 1) {
            return EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.SUBMIT;
        }
        if (i == 2) {
            return EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.DISMISS_ON_ERROR;
        }
        if (i == 3) {
            return EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.DISMISS;
        }
        ProtoParsingError protoParsingError = new ProtoParsingError("SelectedStateUiElements BackButtonBehavior", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
        if (errorReporter != null) {
            errorReporter.report(protoParsingError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.SUBMIT;
        }
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
        return null;
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button toButton(ProtoValidationScope protoValidationScope, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button) {
        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.ButtonAction buttonAction;
        SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction buttonAction2 = button.action;
        ProtoValidationScope.required(buttonAction2, "action");
        int i = WhenMappings.$EnumSwitchMapping$1[buttonAction2.ordinal()];
        if (i == 1) {
            buttonAction = EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.ButtonAction.CONFIRM;
        } else {
            if (i != 2) {
                throw new com.squareup.cash.banking.observability.ProtoParsingError(String.valueOf(Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button.ButtonAction.class).getSimpleName()), ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            }
            buttonAction = EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button.ButtonAction.DISABLE;
        }
        return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button(buttonAction, ProtoValidationScope.required(button.label, AnnotatedPrivateKey.LABEL));
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow toConfigurationRow(ProtoValidationScope protoValidationScope, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow configurationRow) {
        Image image = configurationRow.image;
        String required = ProtoValidationScope.required(configurationRow.title_text, "title");
        String required2 = ProtoValidationScope.required(configurationRow.subtitle_text, "subtitle");
        String required3 = ProtoValidationScope.required(configurationRow.action_text, "action_label");
        LocalizedString localizedString = configurationRow.sq_accessibility_label;
        String str = localizedString != null ? localizedString.translated_value : null;
        LocalizedString localizedString2 = configurationRow.sq_accessibility_value;
        String str2 = localizedString2 != null ? localizedString2.translated_value : null;
        LocalizedString localizedString3 = configurationRow.sq_accessibility_hint;
        return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow(image, required, required2, required3, str, str2, localizedString3 != null ? localizedString3.translated_value : null);
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration toDestinationUiConfiguration(ProtoValidationScope protoValidationScope, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration destinationUiConfiguration) {
        destinationUiConfiguration.getClass();
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(destinationUiConfiguration, paychecksParsingErrorFactory, protoValidationScope);
            AllocationDestination allocationDestination = destinationUiConfiguration.destination;
            ProtoValidationScope.required(allocationDestination, "destination");
            com.squareup.cash.paychecks.backend.api.model.AllocationDestination allocationDestination2 = CommonMappersKt.toAllocationDestination(protoValidationScope2, allocationDestination);
            Long l = destinationUiConfiguration.share_in_basis_points;
            ProtoValidationScope.required(l, "share_in_basis_points");
            long longValue = l.longValue();
            Color color = destinationUiConfiguration.tint_color;
            ProtoValidationScope.required(color, "tint_color");
            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements selectedStateUIElements = destinationUiConfiguration.selected_state_ui_elements;
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = selectedStateUIElements != null ? toSelectedStateUiElements(protoValidationScope2, selectedStateUIElements) : null;
            LocalizedString localizedString = destinationUiConfiguration.sq_accessibility_label;
            return new EditDistributionConfiguration.DestinationUiConfiguration(allocationDestination2, longValue, color, selectedStateUiElements, localizedString != null ? localizedString.translated_value : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.class), paychecksParsingErrorFactory, null);
        }
    }

    public static final EditDistributionConfiguration toEditDistributionConfiguration(SetPaycheckAllocationAmountBlocker setPaycheckAllocationAmountBlocker) {
        EmptyObservability emptyObservability = EmptyObservability.INSTANCE;
        setPaycheckAllocationAmountBlocker.getClass();
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(setPaycheckAllocationAmountBlocker, paychecksParsingErrorFactory, emptyObservability);
            List<SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration> list = setPaycheckAllocationAmountBlocker.initial_destination_states;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toDestinationUiConfiguration(protoValidationScope, (SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration) it.next()));
            }
            Integer num = setPaycheckAllocationAmountBlocker.initially_selected_destination_index;
            ProtoValidationScope.required(num, "initially_selected_destination_index");
            return new EditDistributionConfiguration(arrayList, num.intValue(), CommonMappersKt.toPaychecksAlertUi(protoValidationScope, (AlertUi) protoValidationScope.reportIfNullAndContinue("exceeded_max_distribution_alert_ui", (String) null, setPaycheckAllocationAmountBlocker.exceeded_max_distribution_alert_ui)), setPaycheckAllocationAmountBlocker.average_monthly_paycheck);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountBlocker.class), paychecksParsingErrorFactory, null);
        }
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements toSelectedStateUiElements(ProtoValidationScope protoValidationScope, SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements selectedStateUIElements) {
        LocalizedString localizedString;
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(selectedStateUIElements, paychecksParsingErrorFactory, protoValidationScope);
            String required = ProtoValidationScope.required(selectedStateUIElements.header, "header_");
            String required2 = ProtoValidationScope.required(selectedStateUIElements.custom_amount_subtitle, "custom_amount_subtitle");
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior backButtonBehavior = toBackButtonBehavior(selectedStateUIElements.back_button_behavior);
            List<Long> list = selectedStateUIElements.atm_picker_options_in_basis_points;
            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button = selectedStateUIElements.primary_button;
            ProtoValidationScope.required(button, "primary_button");
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button button2 = toButton(protoValidationScope2, button);
            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.Button button3 = selectedStateUIElements.secondary_button;
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button button4 = button3 != null ? toButton(protoValidationScope2, button3) : null;
            SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.ConfigurationRow configurationRow = selectedStateUIElements.configuration_row;
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow configurationRow2 = configurationRow != null ? toConfigurationRow(protoValidationScope2, configurationRow) : null;
            LocalizedTemplatedString localizedTemplatedString = selectedStateUIElements.atm_option_accessibility_hint_template;
            String str = (localizedTemplatedString == null || (localizedString = localizedTemplatedString.android) == null) ? null : localizedString.translated_value;
            LocalizedString localizedString2 = selectedStateUIElements.custom_amount_accessibility_hint;
            String str2 = localizedString2 != null ? localizedString2.translated_value : null;
            BottomSheet bottomSheet = selectedStateUIElements.explanation;
            return new EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements(required, required2, backButtonBehavior, list, button2, button4, configurationRow2, str, str2, bottomSheet != null ? new com.squareup.cash.paychecks.backend.api.model.BottomSheet(ProtoValidationScope.required(bottomSheet.title, "title"), ProtoValidationScope.required(bottomSheet.description, "description")) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, selectedStateUIElements != null ? Reflection.factory.getOrCreateKotlinClass(SetPaycheckAllocationAmountBlocker.DestinationUiConfiguration.SelectedStateUIElements.class) : null, paychecksParsingErrorFactory, null);
        }
    }
}
