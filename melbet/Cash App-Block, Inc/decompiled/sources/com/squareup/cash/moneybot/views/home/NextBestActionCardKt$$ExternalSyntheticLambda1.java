package com.squareup.cash.moneybot.views.home;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class NextBestActionCardKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MoneybotHomeViewModel.NextBestAction f$1;

    public /* synthetic */ NextBestActionCardKt$$ExternalSyntheticLambda1(Function1 function1, MoneybotHomeViewModel.NextBestAction nextBestAction, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nextBestAction;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        MoneybotHomeViewModel.NextBestAction nextBestAction = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                GapComposer gapComposer = (GapComposer) composer;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                OffsetKt.FlowRow(null, arrangement$SpacedAligned, new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 0, 0, Expect_jvmKt.rememberComposableLambda(324768857, new NextBestActionCardKt$$ExternalSyntheticLambda1(function1, nextBestAction, i2), composer), composer, 1572864, 57);
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(nextBestAction);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneybotHomeViewKt$$ExternalSyntheticLambda34(function1, nextBestAction, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, null, ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(426281726, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(nextBestAction, 25), gapComposer2), gapComposer2, 1573248, 58);
                    MoneybotHomeViewModel.NextBestAction.Action action = nextBestAction.skipAction;
                    if (action == null) {
                        gapComposer2.startReplaceGroup(-1372075924);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1372075923);
                        Strings.getSizes(gapComposer2).getClass();
                        Object obj4 = DefaultSizes.border.entries;
                        RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                        Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(Modifier.Companion.$$INSTANCE, 1.5f, Strings.getColors(gapComposer2).semantic.border.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
                        boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(action);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(10, function1, action);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue2, 15);
                        Strings.getSizes(gapComposer2).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 32.0f, 14.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).component.button.subtle.text.f168default, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).button, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.moneybot_home_nba_skip), (Map) null, (Function1) null, false);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
