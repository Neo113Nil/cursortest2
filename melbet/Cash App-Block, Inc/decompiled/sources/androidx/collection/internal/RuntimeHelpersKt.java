package androidx.collection.internal;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.internal.PositionProvider;
import com.squareup.cash.arcade.components.internal.TooltipKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda2;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class RuntimeHelpersKt {
    /* renamed from: MoneybotMessageList-hGBTI10, reason: not valid java name */
    public static final void m135MoneybotMessageListhGBTI10(Modifier modifier, MoneybotChatViewModel.Content.Chat chat, LazyListState lazyListState, float f, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Map map;
        Object realKeyStoreProvider$setEntry$2;
        NeverEqualPolicy neverEqualPolicy;
        Integer num;
        chat.getClass();
        List list = chat.messages;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1278732248);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(chat) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new LinkedHashMap();
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Map map2 = (Map) rememberedValue;
            Integer valueOf = Integer.valueOf(list.size());
            boolean changedInstance = gapComposer2.changedInstance(chat) | gapComposer2.changedInstance(realHapticVibrator) | gapComposer2.changed(haptics);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                map = map2;
                neverEqualPolicy = neverEqualPolicy2;
                num = valueOf;
                realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(chat, realHapticVibrator, haptics, (Continuation) null, 12);
                gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            } else {
                map = map2;
                realKeyStoreProvider$setEntry$2 = rememberedValue2;
                neverEqualPolicy = neverEqualPolicy2;
                num = valueOf;
            }
            Updater.LaunchedEffect(gapComposer2, num, (Function2) realKeyStoreProvider$setEntry$2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(16.0f, RecyclerView.DECELERATION_RATE, 16.0f, !list.isEmpty() ? f : 0.0f, 2);
            boolean changedInstance2 = gapComposer2.changedInstance(chat) | gapComposer2.changedInstance(map) | ((57344 & i3) == 16384);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda39(6, chat, map, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            gapComposer = gapComposer2;
            LazyDslKt.LazyColumn(modifier, lazyListState, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, (i3 & 14) | ((i3 >> 3) & 112), 504);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda2(modifier, chat, lazyListState, f, function1, i);
        }
    }

    public static final void Tooltip(int i, Composer composer, String str, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-270427566);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(SpacerKt.m298padding3ABfNKs(AlphaKt.alpha(Modifier.Companion.$$INSTANCE, ((Number) function0.invoke()).floatValue()), 8.0f), Strings.getColors(gapComposer).component.toast.background.f220default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), 16.0f, 6.5f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).helpText, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(str, function0, i, 2);
        }
    }

    public static final void TooltipBox(ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(638161236);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(tooltipState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 2048 : 1024;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (tooltipState._alpha$delegate.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer.startReplaceGroup(48645092);
                boolean changedInstance = gapComposer.changedInstance(tooltipState);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TooltipKt$$ExternalSyntheticLambda2(tooltipState, i4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AndroidPopup_androidKt.Popup(PositionProvider.INSTANCE, (Function0) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1577564789, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 10), gapComposer), gapComposer, 3078, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(48875732);
                gapComposer.end(false);
            }
            composableLambdaImpl2.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i2 >> 6) & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(composableLambdaImpl, tooltipState, composableLambdaImpl2, i);
        }
    }

    public static final String stableKey(MessageViewModel messageViewModel, int i) {
        if (messageViewModel instanceof MessageViewModel.MoneybotMessageViewModel) {
            Object obj = ((MessageViewModel.MoneybotMessageViewModel) messageViewModel).id;
            if (obj == null) {
                obj = Integer.valueOf(i);
            }
            return "moneybot_" + obj + "_" + i;
        }
        if (messageViewModel instanceof MessageViewModel.UserMessageViewModel) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "user_");
        }
        if (messageViewModel instanceof MessageViewModel.CardMessageViewModel) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "card_");
        }
        if (messageViewModel instanceof MessageViewModel.ImageMessageViewModel) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "image_");
        }
        if (messageViewModel instanceof MessageViewModel.ToolRequestMessageViewModel) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "tool_");
        }
        if (!(messageViewModel instanceof MessageViewModel.QuickActionsBarViewModel)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return "quickactions_" + ((MessageViewModel.QuickActionsBarViewModel) messageViewModel).messageId + "_" + i;
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void TooltipBox(Modifier modifier, String str, TooltipState tooltipState, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        str.getClass();
        tooltipState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1134468376);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(tooltipState) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            TooltipBox(Expect_jvmKt.rememberComposableLambda(-647913538, new BadgeKt$$ExternalSyntheticLambda2(6, str, tooltipState), gapComposer), tooltipState, composableLambdaImpl, gapComposer, (i2 & 896) | 3126);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier2, i, str, tooltipState, composableLambdaImpl, 27);
        }
    }
}
