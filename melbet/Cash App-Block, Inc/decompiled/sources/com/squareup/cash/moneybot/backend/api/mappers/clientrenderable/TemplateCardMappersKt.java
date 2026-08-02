package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.mappers.ClientRenderableMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.cash.moneybot.components.plugins.TemplateCardPlugin;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.AmountFieldConfig;
import com.squareup.protos.cash.kgoose.api.v3.EditableField;
import com.squareup.protos.cash.kgoose.api.v3.InlineContent;
import com.squareup.protos.cash.kgoose.api.v3.PickerFieldConfig;
import com.squareup.protos.cash.kgoose.api.v3.PickerOption;
import com.squareup.protos.cash.kgoose.api.v3.SavingsTransferOptionPicker;
import com.squareup.protos.cash.kgoose.api.v3.StaticPickerSource;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardAction;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardBottomPicker;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardButton;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardButtons;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardServerToolCall;
import com.squareup.protos.cash.kgoose.api.v3.TemplateCardTapBehavior;
import com.squareup.protos.cash.kgoose.api.v3.TextFieldConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes7.dex */
public abstract class TemplateCardMappersKt {
    public static final TemplateCard.Action toAction(ProtoValidationScope protoValidationScope, TemplateCardAction templateCardAction, PatternRedaction patternRedaction) {
        try {
            TemplateCardAction.Action action = templateCardAction.action;
            if (action instanceof TemplateCardAction.Action.ClientRouteUrlTemplate) {
                return new TemplateCard.Action.ClientRouteAction(((TemplateCardAction.Action.ClientRouteUrlTemplate) action).getValue(), templateCardAction.tap_cdf_event);
            }
            if (action instanceof TemplateCardAction.Action.ServerToolCall) {
                TemplateCardServerToolCall value = ((TemplateCardAction.Action.ServerToolCall) action).getValue();
                String str = value.extension_name;
                try {
                    ProtoValidationScope.required(str, "server_tool_call extension_name");
                } catch (Exception e) {
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, templateCardAction != null ? Reflection.factory.getOrCreateKotlinClass(templateCardAction.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    str = null;
                }
                if (str != null) {
                    String str2 = value.tool_name;
                    try {
                        ProtoValidationScope.required(str2, "server_tool_call tool_name");
                    } catch (Exception e2) {
                        protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, templateCardAction != null ? Reflection.factory.getOrCreateKotlinClass(templateCardAction.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                        str2 = null;
                    }
                    if (str2 != null) {
                        return new TemplateCard.Action.ServerToolCall(str, str2, value.arguments_template, templateCardAction.tap_cdf_event);
                    }
                }
            } else if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, templateCardAction != null ? Reflection.factory.getOrCreateKotlinClass(TemplateCardAction.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.EditableField.Amount toAmountEditableField(ProtoValidationScope protoValidationScope, AmountFieldConfig amountFieldConfig, PatternRedaction patternRedaction, String str, String str2) {
        try {
            LocalizedString localizedString = amountFieldConfig.cta;
            String str3 = localizedString != null ? localizedString.translated_value : null;
            Money money = amountFieldConfig.prefilled_amount;
            if (money != null) {
                return new TemplateCard.EditableField.Amount(money, amountFieldConfig.min_amount, amountFieldConfig.max_amount, str, str2, str3);
            }
            throw new IllegalArgumentException("prefilled_amount");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, amountFieldConfig != null ? Reflection.factory.getOrCreateKotlinClass(AmountFieldConfig.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.BottomPicker toBottomPicker(ProtoValidationScope protoValidationScope, TemplateCardBottomPicker templateCardBottomPicker, PatternRedaction patternRedaction) {
        TemplateCard.Picker savingsTransferOptionPicker;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(templateCardBottomPicker, patternRedaction, protoValidationScope);
            TemplateCardBottomPicker.Source source = templateCardBottomPicker.source;
            if (source instanceof TemplateCardBottomPicker.Source.StaticSource) {
                savingsTransferOptionPicker = toStaticPicker$default(protoValidationScope2, ((TemplateCardBottomPicker.Source.StaticSource) source).getValue(), patternRedaction, null, 4);
            } else {
                if (!(source instanceof TemplateCardBottomPicker.Source.SavingsTransferOptionPicker)) {
                    return null;
                }
                savingsTransferOptionPicker = toSavingsTransferOptionPicker(((TemplateCardBottomPicker.Source.SavingsTransferOptionPicker) source).getValue());
            }
            String str = templateCardBottomPicker.placeholder_key;
            ProtoValidationScope.required(str, "placeholder_key");
            LocalizedString localizedString = templateCardBottomPicker.accessibility_label;
            return new TemplateCard.BottomPicker(str, localizedString != null ? localizedString.translated_value : null, savingsTransferOptionPicker);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, templateCardBottomPicker != null ? Reflection.factory.getOrCreateKotlinClass(TemplateCardBottomPicker.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.Button toButton(ProtoValidationScope protoValidationScope, TemplateCardButton templateCardButton, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(templateCardButton, patternRedaction, protoValidationScope);
            ActionableButtonDefault actionableButtonDefault = templateCardButton.button;
            ProtoValidationScope.required(actionableButtonDefault, "button");
            ButtonDefault buttonDefault = actionableButtonDefault.button;
            ProtoValidationScope.required(buttonDefault, "button button");
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(buttonDefault.text, "text", (String) null);
            if (reportIfNullAndContinue == null) {
                return null;
            }
            TemplateCardAction templateCardAction = templateCardButton.action;
            TemplateCard.Action action = templateCardAction != null ? toAction(protoValidationScope2, templateCardAction, patternRedaction) : null;
            if (action == null) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("TemplateCardButton", "Button must have an action", "action", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            ButtonProminence buttonProminence = buttonDefault.button_prominence;
            if (buttonProminence == null) {
                buttonProminence = ButtonProminence.STANDARD;
            }
            Boolean bool = buttonDefault.is_destructive;
            return new TemplateCard.Button(reportIfNullAndContinue, ClientRenderableMappersKt.getProminenceId(buttonProminence, bool != null ? bool.booleanValue() : false), action);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, templateCardButton != null ? Reflection.factory.getOrCreateKotlinClass(TemplateCardButton.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.TapBehavior.CardButtons toCardButtons(ProtoValidationScope protoValidationScope, TemplateCardButtons templateCardButtons, PatternRedaction patternRedaction) {
        TemplateCard.Button button;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(templateCardButtons, patternRedaction, protoValidationScope);
            TemplateCardButton templateCardButton = (TemplateCardButton) protoValidationScope2.reportIfNullAndContinue("primary_button", (String) null, templateCardButtons.primary_button);
            if (templateCardButton == null || (button = toButton(protoValidationScope2, templateCardButton, patternRedaction)) == null) {
                return null;
            }
            TemplateCardButton templateCardButton2 = templateCardButtons.secondary_button;
            return new TemplateCard.TapBehavior.CardButtons(button, templateCardButton2 != null ? toButton(protoValidationScope2, templateCardButton2, patternRedaction) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, templateCardButtons != null ? Reflection.factory.getOrCreateKotlinClass(TemplateCardButtons.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.EditableField toEditableField(ProtoValidationScope protoValidationScope, EditableField editableField, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(editableField, patternRedaction, protoValidationScope);
            LocalizedString localizedString = editableField.display_format;
            String str = localizedString != null ? localizedString.translated_value : null;
            LocalizedString localizedString2 = editableField.accessibility_label;
            String str2 = localizedString2 != null ? localizedString2.translated_value : null;
            EditableField.FieldConfig fieldConfig = editableField.field_config;
            if (!(fieldConfig instanceof EditableField.FieldConfig.TextConfig)) {
                if (fieldConfig instanceof EditableField.FieldConfig.PickerConfig) {
                    return toPickerEditableField(protoValidationScope2, ((EditableField.FieldConfig.PickerConfig) fieldConfig).getValue(), patternRedaction, str, str2);
                }
                if (fieldConfig instanceof EditableField.FieldConfig.AmountConfig) {
                    return toAmountEditableField(protoValidationScope2, ((EditableField.FieldConfig.AmountConfig) fieldConfig).getValue(), patternRedaction, str, str2);
                }
                return null;
            }
            TextFieldConfig value = ((EditableField.FieldConfig.TextConfig) fieldConfig).getValue();
            try {
                String str3 = value.prefilled_text;
                LocalizedString localizedString3 = value.empty_placeholder_text;
                return new TemplateCard.EditableField.Text(value.max_length, str, str2, str3, localizedString3 != null ? localizedString3.translated_value : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, value != null ? Reflection.factory.getOrCreateKotlinClass(TextFieldConfig.class) : null, patternRedaction, null);
            }
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(EditableField.class), patternRedaction, null);
        }
    }

    public static final TemplateCard.InlineContent toInlineContent(ProtoValidationScope protoValidationScope, InlineContent inlineContent, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(inlineContent, patternRedaction, protoValidationScope);
            String str = inlineContent.placeholder_key;
            ProtoValidationScope.required(str, "placeholder_key");
            InlineContent.Content content = inlineContent.content;
            InlineContent.Content.EditableField editableField = content instanceof InlineContent.Content.EditableField ? (InlineContent.Content.EditableField) content : null;
            EditableField value = editableField != null ? editableField.getValue() : null;
            ProtoValidationScope.required(value, "editable_field");
            TemplateCard.EditableField editableField2 = toEditableField(protoValidationScope2, value, patternRedaction);
            ProtoValidationScope.required(editableField2, "editable_field field_config");
            return new TemplateCard.InlineContent(str, editableField2);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, inlineContent != null ? Reflection.factory.getOrCreateKotlinClass(InlineContent.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.EditableField.Picker toPickerEditableField(ProtoValidationScope protoValidationScope, PickerFieldConfig pickerFieldConfig, PatternRedaction patternRedaction, String str, String str2) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(pickerFieldConfig, patternRedaction, protoValidationScope);
            PickerFieldConfig.Source source = pickerFieldConfig.source;
            return new TemplateCard.EditableField.Picker(str, str2, source instanceof PickerFieldConfig.Source.StaticSource ? toStaticPicker$default(protoValidationScope2, ((PickerFieldConfig.Source.StaticSource) source).getValue(), patternRedaction, pickerFieldConfig.prefilled_value, 8) : source instanceof PickerFieldConfig.Source.SavingsTransferOptionPicker ? toSavingsTransferOptionPicker(((PickerFieldConfig.Source.SavingsTransferOptionPicker) source).getValue()) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, pickerFieldConfig != null ? Reflection.factory.getOrCreateKotlinClass(PickerFieldConfig.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.Picker.StaticPicker.Option toPickerOption(ProtoValidationScope protoValidationScope, PickerOption pickerOption, PatternRedaction patternRedaction) {
        TemplateCard.Picker.StaticPicker.Icon icon;
        TemplateCard.Picker.StaticPicker.Icon savingsGoalIcon;
        try {
            String str = pickerOption.value;
            if (str == null) {
                throw new IllegalArgumentException("picker_option value");
            }
            LocalizedString localizedString = pickerOption.label;
            if (localizedString == null) {
                throw new IllegalArgumentException("picker_option label");
            }
            String str2 = localizedString.translated_value;
            if (str2 == null) {
                throw new IllegalArgumentException("picker_option label translated_value".toString());
            }
            LocalizedString localizedString2 = pickerOption.subtitle;
            String str3 = localizedString2 != null ? localizedString2.translated_value : null;
            Money money = pickerOption.max_amount;
            PickerOption.Icon icon2 = pickerOption.icon;
            if (!(icon2 instanceof PickerOption.Icon.Avatar)) {
                if (icon2 instanceof PickerOption.Icon.SavingsGoalIcon) {
                    PickerOption.Icon.SavingsGoalIcon savingsGoalIcon2 = (PickerOption.Icon.SavingsGoalIcon) icon2;
                    if (savingsGoalIcon2.getValue().icon_id != null) {
                        savingsGoalIcon = new TemplateCard.Picker.StaticPicker.Icon.SavingsGoalIcon(savingsGoalIcon2.getValue());
                    }
                } else if (icon2 != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                icon = null;
                return new TemplateCard.Picker.StaticPicker.Option(str, str2, str3, money, icon);
            }
            savingsGoalIcon = new TemplateCard.Picker.StaticPicker.Icon.Avatar(((PickerOption.Icon.Avatar) icon2).getValue());
            icon = savingsGoalIcon;
            return new TemplateCard.Picker.StaticPicker.Option(str, str2, str3, money, icon);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, pickerOption != null ? Reflection.factory.getOrCreateKotlinClass(PickerOption.class) : null, patternRedaction, null);
        }
    }

    public static final TemplateCard.Picker.SavingsTransferOptionPicker toSavingsTransferOptionPicker(SavingsTransferOptionPicker savingsTransferOptionPicker) {
        String str = savingsTransferOptionPicker.prefilled_value;
        String str2 = savingsTransferOptionPicker.amount_field_placeholder_key;
        LocalizedString localizedString = savingsTransferOptionPicker.title_template;
        String str3 = localizedString != null ? localizedString.translated_value : null;
        LocalizedString localizedString2 = savingsTransferOptionPicker.cta;
        return new TemplateCard.Picker.SavingsTransferOptionPicker(str, str2, savingsTransferOptionPicker.transfer_option_kinds, savingsTransferOptionPicker.link_transfer_options, savingsTransferOptionPicker.option_rules, str3, localizedString2 != null ? localizedString2.translated_value : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:8:0x000d, B:9:0x001f, B:11:0x0025, B:13:0x0036, B:15:0x0043, B:17:0x0047, B:24:0x0073, B:26:0x0079, B:27:0x007e, B:32:0x004e, B:33:0x0052, B:35:0x0058, B:41:0x006d), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TemplateCard.Picker.StaticPicker toStaticPicker$default(ProtoValidationScope protoValidationScope, StaticPickerSource staticPickerSource, PatternRedaction patternRedaction, String str, int i) {
        String str2;
        if ((i & 4) != 0) {
            str = null;
        }
        boolean z = (i & 8) != 0;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(staticPickerSource, patternRedaction, protoValidationScope);
            List<PickerOption> list = staticPickerSource.options;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toPickerOption(protoValidationScope2, (PickerOption) it.next(), patternRedaction));
            }
            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            ProtoValidationScope.required(firstOrNull, "static_picker_source options");
            TemplateCard.Picker.StaticPicker.Option option = (TemplateCard.Picker.StaticPicker.Option) firstOrNull;
            if (str == null) {
                str = staticPickerSource.prefilled_value;
            }
            if (str != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((TemplateCard.Picker.StaticPicker.Option) it2.next()).value, str)) {
                            break;
                        }
                    }
                }
                str = null;
                if (str == null) {
                }
                str2 = str;
                LocalizedString localizedString = staticPickerSource.title;
                return new TemplateCard.Picker.StaticPicker(arrayList, str2, localizedString != null ? localizedString.translated_value : null, protoValidationScope2.reportIfNullAndContinue(staticPickerSource.cta, "static_picker_source cta", (String) null), staticPickerSource.amount_field_placeholder_key);
            }
            str = option.value;
            if (z) {
                str2 = str;
                LocalizedString localizedString2 = staticPickerSource.title;
                return new TemplateCard.Picker.StaticPicker(arrayList, str2, localizedString2 != null ? localizedString2.translated_value : null, protoValidationScope2.reportIfNullAndContinue(staticPickerSource.cta, "static_picker_source cta", (String) null), staticPickerSource.amount_field_placeholder_key);
            }
            str2 = null;
            LocalizedString localizedString22 = staticPickerSource.title;
            return new TemplateCard.Picker.StaticPicker(arrayList, str2, localizedString22 != null ? localizedString22.translated_value : null, protoValidationScope2.reportIfNullAndContinue(staticPickerSource.cta, "static_picker_source cta", (String) null), staticPickerSource.amount_field_placeholder_key);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, staticPickerSource != null ? Reflection.factory.getOrCreateKotlinClass(StaticPickerSource.class) : null, patternRedaction, null);
        }
    }

    public static TemplateCard toTemplateCard$default(TemplateCardPlugin templateCardPlugin, com.squareup.protos.cash.kgoose.api.v3.TemplateCard templateCard, String str, int i) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(templateCard, patternRedaction, templateCardPlugin);
            String required = ProtoValidationScope.required(templateCard.display_template, "display_template");
            List<InlineContent> list = templateCard.inline_content;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toInlineContent(protoValidationScope, (InlineContent) it.next(), patternRedaction));
            }
            TemplateCardBottomPicker templateCardBottomPicker = templateCard.bottom_picker;
            TemplateCard.BottomPicker bottomPicker = templateCardBottomPicker != null ? toBottomPicker(protoValidationScope, templateCardBottomPicker, patternRedaction) : null;
            TemplateCardTapBehavior templateCardTapBehavior = templateCard.tap_behavior;
            TemplateCard.TapBehavior templateCardTapBehavior2 = templateCardTapBehavior != null ? toTemplateCardTapBehavior(protoValidationScope, templateCardTapBehavior, patternRedaction) : null;
            LocalizedString localizedString = templateCard.description;
            return new TemplateCard(str, i, required, arrayList, bottomPicker, templateCardTapBehavior2, localizedString != null ? localizedString.translated_value : null, templateCard.non_editable != null ? Boolean.valueOf(!r15.booleanValue()) : null, templateCard.source_placeholder_key, templateCard.target_placeholder_key);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.TemplateCard.class), patternRedaction, null);
        }
    }

    public static final TemplateCard.TapBehavior toTemplateCardTapBehavior(ProtoValidationScope protoValidationScope, TemplateCardTapBehavior templateCardTapBehavior, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(templateCardTapBehavior, patternRedaction, protoValidationScope);
            TemplateCardTapBehavior.Behavior behavior = templateCardTapBehavior.behavior;
            if (behavior instanceof TemplateCardTapBehavior.Behavior.TapAction) {
                TemplateCardAction templateCardAction = ((TemplateCardTapBehavior.Behavior.TapAction) behavior).getValue().action;
                TemplateCard.Action action = templateCardAction != null ? toAction(protoValidationScope2, templateCardAction, patternRedaction) : null;
                if (action != null) {
                    return new TemplateCard.TapBehavior.TapAction(action);
                }
            } else {
                if (behavior instanceof TemplateCardTapBehavior.Behavior.CardButtons) {
                    return toCardButtons(protoValidationScope2, ((TemplateCardTapBehavior.Behavior.CardButtons) behavior).getValue(), patternRedaction);
                }
                if (behavior != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, templateCardTapBehavior != null ? Reflection.factory.getOrCreateKotlinClass(TemplateCardTapBehavior.class) : null, patternRedaction, null);
        }
    }
}
