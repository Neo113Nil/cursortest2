package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.mappers.ClientRenderableMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior$CardButtons$Button$Action$ClientRouteAction;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes6.dex */
public abstract class CommonMappersKt {
    public static final TapBehavior$CardButtons$Button$Action$ClientRouteAction getAction(ProtoValidationScope protoValidationScope, ActionableButtonDefault actionableButtonDefault, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ActionableButtonDefault.Action action = actionableButtonDefault.action;
            if (action instanceof ActionableButtonDefault.Action.ClientRouteAction) {
                String str = ((ActionableButtonDefault.Action.ClientRouteAction) action).getValue().client_route_url;
                if (str == null) {
                    try {
                        throw new IllegalArgumentException("client_route_action client_route_url");
                    } catch (Exception e) {
                        hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActionableButtonDefault.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                        str = null;
                    }
                }
                if (str != null) {
                    return new TapBehavior$CardButtons$Button$Action$ClientRouteAction(str);
                }
            } else if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, actionableButtonDefault != null ? Reflection.factory.getOrCreateKotlinClass(ActionableButtonDefault.class) : null, patternRedaction, null);
        }
    }

    public static final TapBehavior.CardButtons.Button toButton(ProtoValidationScope protoValidationScope, ActionableButtonDefault actionableButtonDefault, PatternRedaction patternRedaction, String str) {
        HasObservability hasObservability = protoValidationScope.observability;
        actionableButtonDefault.getClass();
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(actionableButtonDefault, patternRedaction, protoValidationScope);
            ButtonDefault buttonDefault = actionableButtonDefault.button;
            ProtoValidationScope.required(buttonDefault, "button");
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(buttonDefault.text, "text", (String) null);
            if (reportIfNullAndContinue == null) {
                return null;
            }
            TapBehavior$CardButtons$Button$Action$ClientRouteAction action = getAction(protoValidationScope2, actionableButtonDefault, patternRedaction);
            if (action == null && str == null) {
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("ActionableButtonDefault", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "action", null, patternRedaction.pattern, patternRedaction.template, 8), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            ButtonProminence buttonProminence = (ButtonProminence) protoValidationScope2.reportIfNullAndContinue("button_prominence", (String) null, buttonDefault.button_prominence);
            if (buttonProminence == null) {
                buttonProminence = ButtonProminence.STANDARD;
            }
            Boolean bool = (Boolean) protoValidationScope2.reportIfNullAndContinue("is_destructive", (String) null, buttonDefault.is_destructive);
            return new TapBehavior.CardButtons.Button(reportIfNullAndContinue, ClientRenderableMappersKt.getProminenceId(buttonProminence, bool != null ? bool.booleanValue() : false), buttonDefault.icon, action, str);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActionableButtonDefault.class), patternRedaction, null);
        }
    }

    public static final TapBehavior.CardButtons toButtons(ProtoValidationScope protoValidationScope, ActionCard.CardButtons cardButtons, PatternRedaction patternRedaction) {
        TapBehavior.CardButtons.Button button;
        cardButtons.getClass();
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(cardButtons, patternRedaction, protoValidationScope);
            ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) protoValidationScope2.reportIfNullAndContinue("primary_button", (String) null, cardButtons.primary_button);
            if (actionableButtonDefault == null || (button = toButton(protoValidationScope2, actionableButtonDefault, patternRedaction, cardButtons.primary_button_hidden_message)) == null) {
                return null;
            }
            ActionableButtonDefault actionableButtonDefault2 = cardButtons.secondary_button;
            return new TapBehavior.CardButtons(button, actionableButtonDefault2 != null ? toButton(protoValidationScope2, actionableButtonDefault2, patternRedaction, cardButtons.secondary_button_hidden_message) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActionCard.CardButtons.class), patternRedaction, null);
        }
    }
}
