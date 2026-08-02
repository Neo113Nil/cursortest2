package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.semantics.Role;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormUpsellKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FormBlocker.Element.UpsellElement f$0;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ArcadeFormUpsellKt$$ExternalSyntheticLambda2(FormBlocker.Element.UpsellElement upsellElement, Function1 function1) {
        this.f$0 = upsellElement;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        FormBlocker.Element.UpsellElement upsellElement = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.standard, gapComposer, 0);
                    BlockerAction blockerAction = upsellElement.card_layout == FormBlocker.Element.UpsellElement.CardLayout.HORIZONTAL ? upsellElement.button_action : null;
                    gapComposer.startReplaceGroup(928725618);
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    if (blockerAction != null) {
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Object obj3 = DefaultSizes.border.entries;
                        Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                        Role role = new Role(0);
                        boolean changed = gapComposer.changed(rememberHapticTrigger) | gapComposer.changed(function1) | gapComposer.changedInstance(blockerAction);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(13, rememberHapticTrigger, function1, blockerAction);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        modifier = ImageKt.m183clickableoSLSa3U$default(clip, false, null, role, (Function0) rememberedValue, 11);
                    }
                    Modifier modifier2 = modifier;
                    gapComposer.end(false);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    MoneybotTheme.m3623Cardjb40ds(modifier2, false, colors.semantic.background.f1047app, 16.0f, null, null, Expect_jvmKt.rememberComposableLambda(-1925454131, new FamilyHomeViewKt$$ExternalSyntheticLambda10(upsellElement, function1, i2), gapComposer), gapComposer, 1572864, 50);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ArcadeFormUpsellKt.VerticalUpsellContent(upsellElement, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeFormUpsellKt$$ExternalSyntheticLambda2(FormBlocker.Element.UpsellElement upsellElement, Function1 function1, int i) {
        this.f$0 = upsellElement;
        this.f$2 = function1;
    }
}
