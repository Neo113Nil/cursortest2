package com.google.android.gms.internal.mlkit_genai_prompt;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.NestedScrollInteropConnection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.views.dependents.BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.viewmodels.OffersRedemptionViewModel;
import com.squareup.cash.offers.views.redemption.OffersRedemptionSheetView$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes6.dex */
public abstract class zzaet {
    public static final void BitcoinWelcomeScreenContent(BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel, Function1 function1, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0 bitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1697470083);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(bitcoinDependentWelcomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinDependentWelcomeViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    bitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0 = new BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0(bitcoinDependentWelcomeViewModel, function1, i, i4);
                    endRestartGroup.block = bitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0;
                }
                return;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(1166851602, new BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0(bitcoinDependentWelcomeViewModel, function1), gapComposer), gapComposer, 3072, 6);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            bitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0 = new BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0(bitcoinDependentWelcomeViewModel, function1, i, i2);
            endRestartGroup.block = bitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda0;
        }
    }

    public static final void RedemptionSheetContent(OffersRedemptionViewModel offersRedemptionViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1883737418);
        int i2 = i | (gapComposer.changedInstance(offersRedemptionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            NestedScrollInteropConnection rememberNestedScrollInteropConnection = zzagn.rememberNestedScrollInteropConnection(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(companion, rememberNestedScrollInteropConnection, null), ImageKt.rememberScrollState(gapComposer), false, 14), MooncakeTheme.getColors(gapComposer).elevatedBackground, ColorKt.RectangleShape), 24.0f, 24.0f, 24.0f, 19.0f), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ImageKt.Image(Countries.painterResource(offersRedemptionViewModel.imgResource, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).header2, (TextLineBalancing) null, offersRedemptionViewModel.headerText, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, offersRedemptionViewModel.bodyText, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 48.0f));
            String stringResource = Room.stringResource(gapComposer, R.string.redemption_done);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue, fillMaxWidth2, null, null, style, null, false, 0, null, null, gapComposer, 196992, 0, 4056);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersRedemptionSheetView$$ExternalSyntheticLambda1(offersRedemptionViewModel, function1, i);
        }
    }

    public static final MotionEvent getNativeEvent(HuffmanTreeGroup huffmanTreeGroup) {
        return (MotionEvent) huffmanTreeGroup.trees;
    }

    public static final int indirectPrimaryDirectionalScrollAxis(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(PKIFailureInfo.badSenderNonce)) {
            a$$ExternalSyntheticBUOutline0.m$3("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != RecyclerView.DECELERATION_RATE && range / range2 < 5.0f)) {
                        if (range2 > range && (range == RecyclerView.DECELERATION_RATE || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }
}
