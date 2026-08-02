package com.squareup.cash.moneybot.presenters.plugins;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.ActionCard;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior$CardButtons$Button$Action$ClientRouteAction;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ActionCardPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final RealMoneybotAnalyticsService analyticsService;
    public final ActionCard metadata;
    public final Function2 onMessage;
    public final ActionCard originalMetadata;
    public final PluginContext pluginContext;
    public final RealRouter router;

    public ActionCardPresenter(RealMoneybotAnalyticsService realMoneybotAnalyticsService, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, ActionCard actionCard, ActionCard actionCard2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.analyticsService = realMoneybotAnalyticsService;
        this.analytics = analytics;
        this.metadata = actionCard;
        this.originalMetadata = actionCard2;
        this.pluginContext = pluginContext;
        this.onMessage = function2;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public static ActionCardViewEvent.LaunchClientRoute toAction(TapBehavior tapBehavior, String str) {
        if ((tapBehavior instanceof TapBehavior.TapAction ? (TapBehavior.TapAction) tapBehavior : null) == null) {
            return null;
        }
        TapBehavior.TapAction tapAction = (TapBehavior.TapAction) tapBehavior;
        return new ActionCardViewEvent.LaunchClientRoute(str, tapAction.action.clientRoute, tapAction.hiddenTapMessage, tapAction.cdfEvent);
    }

    public static ActionCardViewModel.Icon toActionCardIcon(ActionCard.Icon icon) {
        if (icon instanceof ActionCard.Icon.Avatar) {
            return new ActionCardViewModel.Icon.Avatar(((ActionCard.Icon.Avatar) icon).avatar);
        }
        if (!(icon instanceof ActionCard.Icon.EmojiIcon)) {
            return null;
        }
        ActionCard.Icon.EmojiIcon emojiIcon = (ActionCard.Icon.EmojiIcon) icon;
        return new ActionCardViewModel.Icon.EmojiIcon(emojiIcon.iconId, emojiIcon.accessibilityText);
    }

    public static ActionCardViewModel.ButtonGroup.Button toButton(TapBehavior.CardButtons.Button button, String str) {
        ActionCardViewEvent sendHiddenMessage;
        String str2 = button.text;
        String str3 = button.hiddenTapMessage;
        ButtonProminence.Id id = button.prominence;
        TapBehavior$CardButtons$Button$Action$ClientRouteAction tapBehavior$CardButtons$Button$Action$ClientRouteAction = button.action;
        if (tapBehavior$CardButtons$Button$Action$ClientRouteAction != null) {
            sendHiddenMessage = new ActionCardViewEvent.LaunchClientRoute(str, tapBehavior$CardButtons$Button$Action$ClientRouteAction.clientRoute, str3, null);
        } else {
            if (tapBehavior$CardButtons$Button$Action$ClientRouteAction != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sendHiddenMessage = str3 != null ? new ActionCardViewEvent.SendHiddenMessage(str, str3) : null;
        }
        return new ActionCardViewModel.ButtonGroup.Button(str2, id, sendHiddenMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel$ButtonGroup] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel$ButtonGroup] */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        ActionCardViewEvent.LaunchClientRoute action;
        ActionCardViewEvent.LaunchClientRoute launchClientRoute;
        TapBehavior.TapAction tapAction;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(395552142);
        ActionCard actionCard = this.metadata;
        ActionCard.Icon icon = actionCard.icon;
        TapBehavior tapBehavior = actionCard.behavior;
        String str = actionCard.requestId;
        ActionCardViewModel.Icon actionCardIcon = toActionCardIcon(icon);
        ActionCard actionCard2 = this.originalMetadata;
        if (actionCardIcon == null) {
            actionCardIcon = toActionCardIcon(actionCard2 != null ? actionCard2.icon : null);
        }
        ActionCardViewModel.Icon icon2 = actionCardIcon;
        TapBehavior.TapAction tapAction2 = actionCard.headerTapAction;
        if (icon == null) {
            if (tapAction2 == null || (action = toAction(tapAction2, str)) == null) {
                if (actionCard2 != null && (tapAction = actionCard2.headerTapAction) != null) {
                    action = toAction(tapAction, str);
                }
                launchClientRoute = null;
            }
            launchClientRoute = action;
        } else {
            if (tapAction2 != null) {
                action = toAction(tapAction2, str);
                launchClientRoute = action;
            }
            launchClientRoute = null;
        }
        String str2 = actionCard.title;
        String str3 = actionCard.description;
        ActionCard.Accessory accessory = actionCard.accessory;
        ActionCardViewModel.Accessory accessory2 = accessory != null ? new ActionCardViewModel.Accessory(accessory.icon, accessory.accessibilityText) : null;
        ActionCardViewEvent.LaunchClientRoute action2 = tapBehavior != null ? toAction(tapBehavior, str) : null;
        if (tapBehavior != null) {
            if ((tapBehavior instanceof TapBehavior.CardButtons ? (TapBehavior.CardButtons) tapBehavior : null) != null) {
                TapBehavior.CardButtons cardButtons = (TapBehavior.CardButtons) tapBehavior;
                ActionCardViewModel.ButtonGroup.Button button = toButton(cardButtons.primaryButton, str);
                TapBehavior.CardButtons.Button button2 = cardButtons.secondaryButton;
                r8 = new ActionCardViewModel.ButtonGroup(button, button2 != null ? toButton(button2, str) : null);
            }
        }
        ActionCardViewModel actionCardViewModel = new ActionCardViewModel(icon2, launchClientRoute, str2, str3, accessory2, action2, r8);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Overlay$$ExternalSyntheticLambda0(this, 2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue, actionCardViewModel);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}
