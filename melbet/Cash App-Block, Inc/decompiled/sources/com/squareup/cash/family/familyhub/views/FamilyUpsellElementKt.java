package com.squareup.cash.family.familyhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class FamilyUpsellElementKt {
    public static final void FamilyUpsellElement(FormBlocker.Element.UpsellElement upsellElement, Function1 function1, Modifier modifier, Composer composer, int i) {
        AppMessageImage.Static.Fixed fixed;
        Actions$One actions$One;
        String str;
        BlockerAction.Action action;
        upsellElement.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(897334684);
        int i2 = i | (gapComposer.changedInstance(upsellElement) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BlockerAction blockerAction = upsellElement.button_action;
            String str2 = upsellElement.title;
            String str3 = str2 == null ? "" : str2;
            String str4 = upsellElement.subtitle;
            Image image = upsellElement.image;
            if (image != null) {
                Integer num = upsellElement.image_width;
                int intValue = num != null ? num.intValue() : 104;
                Integer num2 = upsellElement.image_height;
                fixed = new AppMessageImage.Static.Fixed(image, false, intValue, num2 != null ? num2.intValue() : 104);
            } else {
                fixed = null;
            }
            if (blockerAction != null) {
                String str5 = blockerAction.text;
                String str6 = str5 != null ? str5 : "";
                BlockerAction blockerAction2 = upsellElement.button_action;
                if (blockerAction2 != null && (action = blockerAction2.action) != null) {
                    BlockerAction.Action.OpenUrlAction openUrlAction = action instanceof BlockerAction.Action.OpenUrlAction ? (BlockerAction.Action.OpenUrlAction) action : null;
                    BlockerAction.OpenURLAction value = openUrlAction != null ? openUrlAction.getValue() : null;
                    if (value != null) {
                        str = value.url;
                        actions$One = new Actions$One(new Action(str6, null, new AppMessageViewEvent.AppMessageActionTaken("family-upsell", str, false, null, 8)));
                    }
                }
                str = null;
                actions$One = new Actions$One(new Action(str6, null, new AppMessageViewEvent.AppMessageActionTaken("family-upsell", str, false, null, 8)));
            } else {
                actions$One = null;
            }
            CardAppMessageViewModel.Ready ready = new CardAppMessageViewModel.Ready("family-upsell", fixed, str3, str4, 0, actions$One, 80);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            boolean changedInstance = gapComposer.changedInstance(blockerAction) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda10(2, blockerAction, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(modifier, ready, (Function1) rememberedValue, new Color(j), ContentScale.Companion.Crop, null, gapComposer, ((i2 >> 6) & 14) | 24576, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(upsellElement, function1, modifier, i, 1);
        }
    }
}
