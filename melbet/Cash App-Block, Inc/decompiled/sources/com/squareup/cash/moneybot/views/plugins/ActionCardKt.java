package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.compose.ModifierKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ActionCardKt {
    static {
        new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639);
        ArcadeButtonProminences.prominent.getClass();
        ArcadeButtonProminences.standard.getClass();
        zzd zzdVar = Icons.Companion;
        new Icon("FirlgD");
    }

    public static final void ActionCard(ActionCardViewModel actionCardViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Object ta__externalsyntheticlambda1;
        Haptics haptics;
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1174645189);
        int i2 = (gapComposer.changedInstance(actionCardViewModel) ? 4 : 2) | i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics2 = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, 320.0f);
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 24.0f, 1);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            long j = moneybotColors.card.background;
            ActionCardViewEvent actionCardViewEvent = actionCardViewModel.action;
            if (actionCardViewEvent == null) {
                gapComposer.startReplaceGroup(1539154600);
                gapComposer.end(false);
                function0 = null;
                haptics = haptics2;
            } else {
                gapComposer.startReplaceGroup(1539154601);
                boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(actionCardViewModel) | gapComposer.changedInstance(realHapticVibrator) | gapComposer.changed(haptics2) | gapComposer.changedInstance(actionCardViewEvent);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    haptics = haptics2;
                    ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(actionCardViewModel, realHapticVibrator, haptics, function1, actionCardViewEvent, 15);
                    gapComposer.updateRememberedValue(ta__externalsyntheticlambda1);
                } else {
                    ta__externalsyntheticlambda1 = rememberedValue;
                    haptics = haptics2;
                }
                function0 = (Function0) ta__externalsyntheticlambda1;
                gapComposer.end(false);
            }
            CardUiKt.m3624CardContainerhTdSg4(m290width3ABfNKs, m295PaddingValuesYgX7TsA$default, RecyclerView.DECELERATION_RATE, j, function0, Expect_jvmKt.rememberComposableLambda(-1721462165, new BasicShieetScope$$ExternalSyntheticLambda0(actionCardViewModel, realHapticVibrator, haptics, function1, 4), gapComposer), gapComposer, 1572912, 20);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) actionCardViewModel, (Object) modifier2, (Object) function1, false, i, 14);
        }
    }

    public static final void ActionCardIcon(ActionCardViewModel.Icon icon, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        AvatarSize avatarSize;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1548374458);
        int i2 = i | (gapComposer.changedInstance(icon) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = icon instanceof ActionCardViewModel.Icon.Avatar;
            if (z) {
                avatarSize = AvatarSize.Size64;
            } else {
                if (!(icon instanceof ActionCardViewModel.Icon.EmojiIcon)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                avatarSize = AvatarSize.Size48;
            }
            if (function0 != null) {
                gapComposer.startReplaceGroup(325626941);
                modifier2 = modifier;
                Modifier clipOffscreen = ModifierKt.clipOffscreen(SizeKt.m285size3ABfNKs(modifier2, avatarSize.size), RoundedCornerShapeKt.CircleShape);
                boolean z2 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(28, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier3 = ImageKt.m183clickableoSLSa3U$default(clipOffscreen, false, null, null, (Function0) rememberedValue, 15);
                gapComposer.end(false);
            } else {
                modifier2 = modifier;
                gapComposer.startReplaceGroup(325724870);
                gapComposer.end(false);
                modifier3 = modifier2;
            }
            if (z) {
                gapComposer.startReplaceGroup(325817715);
                TextViewKt.Avatar(avatarSize, AvatarsKt.toAvatarEntry(((ActionCardViewModel.Icon.Avatar) icon).avatar, null, gapComposer, 1), modifier3, false, gapComposer, 0, 24);
                gapComposer.end(false);
            } else {
                Modifier modifier4 = modifier3;
                AvatarSize avatarSize2 = avatarSize;
                if (!(icon instanceof ActionCardViewModel.Icon.EmojiIcon)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1929154153, false);
                }
                gapComposer.startReplaceGroup(326015836);
                ActionCardViewModel.Icon.EmojiIcon emojiIcon = (ActionCardViewModel.Icon.EmojiIcon) icon;
                String str = emojiIcon.iconId;
                float f = avatarSize2.size;
                String str2 = emojiIcon.accessibilityText;
                VisibleKt.m3489EmojiIconDzVHIIc(str, f, modifier4, str2 == null ? str : str2, gapComposer, 0, 0);
                gapComposer.end(false);
            }
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) icon, (Object) modifier2, (Function) function0, i, 18);
        }
    }
}
