package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.ActionCard;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior$TapAction$Action$ClientRouteAction;
import com.squareup.cash.moneybot.components.plugins.ActionCardPlugin;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.emojis.EmojiEmbeddedImageResolver;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public abstract class ActionCardMappersKt {
    public static final TapBehavior$TapAction$Action$ClientRouteAction getAction(ProtoValidationScope protoValidationScope, ActionCard.CardTapAction cardTapAction, PatternRedaction patternRedaction) {
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            ActionCard.CardTapAction.Action action = cardTapAction.action;
            if (!(action instanceof ActionCard.CardTapAction.Action.ClientRouteAction)) {
                if (action != null) {
                    throw new NoWhenBranchMatchedException();
                }
                hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("CardTapAction", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "action", null, patternRedaction.pattern, patternRedaction.template, 8), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            String str = ((ActionCard.CardTapAction.Action.ClientRouteAction) action).getValue().client_route_url;
            if (str == null) {
                try {
                    throw new IllegalArgumentException("client_route_action client_route_url");
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActionCard.CardTapAction.class), patternRedaction, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    str = null;
                }
            }
            if (str == null) {
                return null;
            }
            return new TapBehavior$TapAction$Action$ClientRouteAction(str);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, cardTapAction != null ? Reflection.factory.getOrCreateKotlinClass(ActionCard.CardTapAction.class) : null, patternRedaction, null);
        }
    }

    public static final TapBehavior getBehavior(ProtoValidationScope protoValidationScope, ActionCard actionCard, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(actionCard, patternRedaction, protoValidationScope);
            ActionCard.TapBehavior tapBehavior = actionCard.tap_behavior;
            if (tapBehavior instanceof ActionCard.TapBehavior.CardTapAction) {
                return toTapAction(protoValidationScope2, ((ActionCard.TapBehavior.CardTapAction) tapBehavior).getValue(), patternRedaction);
            }
            if (tapBehavior instanceof ActionCard.TapBehavior.CardButtons) {
                return CommonMappersKt.toButtons(protoValidationScope2, ((ActionCard.TapBehavior.CardButtons) tapBehavior).getValue(), patternRedaction);
            }
            if (tapBehavior == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ActionCard.class), patternRedaction, null);
        }
    }

    public static final ActionCard.Icon getIcon(ProtoValidationScope protoValidationScope, com.squareup.protos.cash.kgoose.api.v3.ActionCard actionCard, PatternRedaction patternRedaction) {
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(actionCard, patternRedaction, protoValidationScope);
            ActionCard.HeaderIcon headerIcon = actionCard.header_icon;
            if (headerIcon instanceof ActionCard.HeaderIcon.Avatar) {
                return new ActionCard.Icon.Avatar(((ActionCard.HeaderIcon.Avatar) headerIcon).getValue());
            }
            if (headerIcon instanceof ActionCard.HeaderIcon.EmojiIcon) {
                return toEmojiIcon(protoValidationScope2, ((ActionCard.HeaderIcon.EmojiIcon) headerIcon).getValue(), patternRedaction);
            }
            if (headerIcon != null) {
                throw new NoWhenBranchMatchedException();
            }
            UiAvatar uiAvatar = actionCard.icon;
            if (uiAvatar != null) {
                return new ActionCard.Icon.Avatar(uiAvatar);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.ActionCard.class), patternRedaction, null);
        }
    }

    public static final ActionCard.Accessory toAccessory(ProtoValidationScope protoValidationScope, ActionCard.Accessory accessory, PatternRedaction patternRedaction) {
        String str;
        try {
            Icon icon = accessory.icon;
            try {
                ProtoValidationScope.required(icon, "icon");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, accessory != null ? Reflection.factory.getOrCreateKotlinClass(accessory.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                icon = null;
            }
            if (icon == null) {
                return null;
            }
            try {
                str = ProtoValidationScope.required(accessory.accessibility_text, "accessibility_text");
                "accessibility_text".concat(" translated_value");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, accessory != null ? Reflection.factory.getOrCreateKotlinClass(accessory.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                str = "";
            }
            return new ActionCard.Accessory(icon, str);
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, accessory != null ? Reflection.factory.getOrCreateKotlinClass(ActionCard.Accessory.class) : null, patternRedaction, null);
        }
    }

    public static com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.ActionCard toActionCard$default(ActionCardPlugin actionCardPlugin, com.squareup.protos.cash.kgoose.api.v3.ActionCard actionCard, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(actionCard, patternRedaction, actionCardPlugin);
            Integer num = actionCard.version;
            int intValue = num != null ? num.intValue() : 0;
            String required = ProtoValidationScope.required(actionCard.title, "title");
            String required2 = ProtoValidationScope.required(actionCard.description, "description");
            ActionCard.Icon icon = getIcon(protoValidationScope, actionCard, patternRedaction);
            ActionCard.Accessory accessory = actionCard.accessory;
            ActionCard.Accessory accessory2 = accessory != null ? toAccessory(protoValidationScope, accessory, patternRedaction) : null;
            TapBehavior behavior = getBehavior(protoValidationScope, actionCard, patternRedaction);
            ActionCard.CardTapAction cardTapAction = actionCard.header_icon_action;
            return new com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.ActionCard(str, intValue, icon, required, required2, accessory2, behavior, cardTapAction != null ? toTapAction(protoValidationScope, cardTapAction, patternRedaction) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.ActionCard.class), patternRedaction, null);
        }
    }

    public static final ActionCard.Icon.EmojiIcon toEmojiIcon(ProtoValidationScope protoValidationScope, ActionCard.EmojiIcon emojiIcon, PatternRedaction patternRedaction) {
        String str;
        String str2;
        HasObservability hasObservability = protoValidationScope.observability;
        try {
            String str3 = emojiIcon.icon_id;
            try {
                ProtoValidationScope.required(str3, "icon_id");
                str = str3;
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, emojiIcon != null ? Reflection.factory.getOrCreateKotlinClass(emojiIcon.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                return null;
            }
            if (EmojiEmbeddedImageResolver.supportedEmoji.contains(str)) {
                try {
                    str2 = ProtoValidationScope.required(emojiIcon.accessibility_text, "accessibility_text");
                    "accessibility_text".concat(" translated_value");
                } catch (Exception e2) {
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, emojiIcon != null ? Reflection.factory.getOrCreateKotlinClass(emojiIcon.getClass()) : null, patternRedaction, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    str2 = null;
                }
                return new ActionCard.Icon.EmojiIcon(str, str2);
            }
            hasObservability.getErrorReporter().report(new MoneybotProtoParsingError("EmojiIcon", "icon_id " + str + " is not supported", "icon_id", patternRedaction.pattern, patternRedaction.template), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, emojiIcon != null ? Reflection.factory.getOrCreateKotlinClass(ActionCard.EmojiIcon.class) : null, patternRedaction, null);
        }
    }

    public static final TapBehavior.TapAction toTapAction(ProtoValidationScope protoValidationScope, ActionCard.CardTapAction cardTapAction, PatternRedaction patternRedaction) {
        try {
            TapBehavior$TapAction$Action$ClientRouteAction action = getAction(new ProtoValidationScope(cardTapAction, patternRedaction, protoValidationScope), cardTapAction, patternRedaction);
            if (action == null) {
                return null;
            }
            return new TapBehavior.TapAction(action, cardTapAction.hidden_message, cardTapAction.cdf_event);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, cardTapAction != null ? Reflection.factory.getOrCreateKotlinClass(ActionCard.CardTapAction.class) : null, patternRedaction, null);
        }
    }
}
