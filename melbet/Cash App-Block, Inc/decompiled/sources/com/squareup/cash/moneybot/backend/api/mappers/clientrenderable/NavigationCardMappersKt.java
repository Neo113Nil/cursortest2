package com.squareup.cash.moneybot.backend.api.mappers.clientrenderable;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard$Icon$Avatar;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard$TapAction$ClientRouteAction;
import com.squareup.cash.moneybot.components.plugins.NavigationCardPlugin;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.protos.cash.kgoose.api.v3.NavigationCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public abstract class NavigationCardMappersKt {
    public static final NavigationCard$Icon$Avatar getIcon(ProtoValidationScope protoValidationScope, NavigationCard navigationCard, PatternRedaction patternRedaction) {
        try {
            NavigationCard.Icon icon = navigationCard.icon;
            if (icon instanceof NavigationCard.Icon.Avatar) {
                return new NavigationCard$Icon$Avatar(((NavigationCard.Icon.Avatar) icon).getValue());
            }
            if (icon == null) {
                throw new MoneybotProtoParsingError("NavigationCard", "icon is required", "icon", patternRedaction.pattern, patternRedaction.template);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(NavigationCard.class), patternRedaction, null);
        }
    }

    public static final NavigationCard$TapAction$ClientRouteAction getTapAction(ProtoValidationScope protoValidationScope, NavigationCard navigationCard, PatternRedaction patternRedaction) {
        try {
            NavigationCard.TapAction tapAction = navigationCard.tap_action;
            if (!(tapAction instanceof NavigationCard.TapAction.ClientRoute)) {
                if (tapAction == null) {
                    throw new MoneybotProtoParsingError("NavigationCard", "tap_action is required", "tap_action", patternRedaction.pattern, patternRedaction.template);
                }
                throw new NoWhenBranchMatchedException();
            }
            NavigationCard.ClientRouteAction value = ((NavigationCard.TapAction.ClientRoute) tapAction).getValue();
            try {
                String str = value.client_route_url;
                if (str != null) {
                    return new NavigationCard$TapAction$ClientRouteAction(str);
                }
                throw new IllegalArgumentException("client_route_url");
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, value != null ? Reflection.factory.getOrCreateKotlinClass(NavigationCard.ClientRouteAction.class) : null, patternRedaction, null);
            }
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(NavigationCard.class), patternRedaction, null);
        }
    }

    public static com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard toNavigationCard$default(NavigationCardPlugin navigationCardPlugin, NavigationCard navigationCard, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(navigationCard, patternRedaction, navigationCardPlugin);
            Integer num = navigationCard.version;
            return new com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard(str, num != null ? num.intValue() : 0, getIcon(protoValidationScope, navigationCard, patternRedaction), ProtoValidationScope.required(navigationCard.cta, "cta"), getTapAction(protoValidationScope, navigationCard, patternRedaction));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(NavigationCard.class), patternRedaction, null);
        }
    }
}
