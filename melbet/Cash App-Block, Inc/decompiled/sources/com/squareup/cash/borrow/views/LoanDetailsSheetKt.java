package com.squareup.cash.borrow.views;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class LoanDetailsSheetKt {
    public static final void DetailRow(BorrowAppletLoanHistoryTile.Data.Loan.Details.Row row, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        Color m;
        long j;
        long j2;
        Modifier modifier4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1992666709);
        int i2 = i | (gapComposer.changedInstance(row) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = row.client_route_action;
            Color color = null;
            BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction tapAction = str != null ? new BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction(str) : null;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier modifier5 = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(modifier5, true, (Function1) rememberedValue);
            if (tapAction == null) {
                gapComposer.startReplaceGroup(-1503689237);
                gapComposer.end(false);
                modifier3 = modifier5;
            } else {
                gapComposer.startReplaceGroup(-1503648534);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(tapAction);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(5, (Object) tapAction, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier5, false, null, null, (Function0) rememberedValue2, 15);
                modifier3 = modifier5;
                gapComposer.end(false);
                modifier5 = m183clickableoSLSa3U$default;
            }
            Modifier then = semantics.then(modifier5);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(then, 16.0f, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            LayoutWeightElement m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true);
            LocalizedString localizedString = row.left_text;
            localizedString.getClass();
            String str2 = localizedString.translated_value;
            str2.getClass();
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
            com.squareup.protos.cash.ui.Color color2 = row.left_text_color;
            if (color2 == null) {
                gapComposer.startReplaceGroup(-206786946);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1794444771, color2, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(1794446271);
                j = Strings.getColors(gapComposer).semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1794444101);
                gapComposer.end(false);
                j = m.value;
            }
            BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction tapAction2 = tapAction;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, (Modifier) m2, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            LocalizedString localizedString2 = row.right_text;
            localizedString2.getClass();
            String str3 = localizedString2.translated_value;
            str3.getClass();
            TextStyle textStyle2 = Strings.getTypography(gapComposer).labelMedium;
            com.squareup.protos.cash.ui.Color color3 = row.right_text_color;
            if (color3 == null) {
                gapComposer.startReplaceGroup(-206576642);
                gapComposer.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1794451555, color3, gapComposer, false);
            }
            Color color4 = color;
            if (color4 == null) {
                gapComposer.startReplaceGroup(1794453055);
                j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1794450854);
                gapComposer.end(false);
                j2 = color4.value;
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            if (tapAction2 != null) {
                gapComposer.startReplaceGroup(-206479208);
                Icons icons = Icons.SubtlePush16;
                long sp = Room.getSp(4);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                modifier4 = modifier3;
                Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(modifier4, RecyclerView.DECELERATION_RATE, ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(sp), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(Room.getSp(16))), Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 54, 0);
                gapComposer.end(false);
            } else {
                modifier4 = modifier3;
                gapComposer.startReplaceGroup(-206186103);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(row, function1, modifier2, i, 19);
        }
    }

    public static final void DetailSheetHeader(BorrowHomeOverlayViewModel.LoanDetails loanDetails, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2065243385);
        int i2 = (gapComposer.changedInstance(loanDetails) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            com.squareup.protos.cash.ui.Color color = loanDetails.secondaryTextTintColor;
            Color color2 = null;
            ColorModel.Accented accented = color != null ? new ColorModel.Accented(color) : null;
            if (accented == null) {
                gapComposer.startReplaceGroup(-259025168);
            } else {
                gapComposer.startReplaceGroup(-423997647);
                color2 = ThemablesKt.forTheme(accented, gapComposer);
            }
            gapComposer.end(false);
            if (color2 == null) {
                gapComposer.startReplaceGroup(-423996147);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-423998875);
                gapComposer.end(false);
                j = color2.value;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Transformations.SheetHeader(Expect_jvmKt.rememberComposableLambda(363482054, new LoanDetailsSheetKt$$ExternalSyntheticLambda7(loanDetails), gapComposer), SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), BorrowHomeKt.f320lambda$1358520632, Expect_jvmKt.rememberComposableLambda(-72038327, new LoanDetailsSheetKt$$ExternalSyntheticLambda8(loanDetails, j, i3), gapComposer), gapComposer, 3462, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda7(loanDetails, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoanDetailsSheet(BorrowHomeOverlayViewModel.LoanDetails loanDetails, Function1 function1, LoanDetailsSheetState loanDetailsSheetState, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        loanDetails.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1991870779);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(loanDetails) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(loanDetailsSheetState.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1169666534, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(modifier4, loanDetails, loanDetailsSheetState, function1, 14), gapComposer), gapComposer, 3072, 7);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(loanDetails, function1, loanDetailsSheetState, modifier3, i, i2, 15);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LoanDetailsSheet(BorrowHomeOverlayViewModel.LoanDetails loanDetails, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        loanDetails.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1023933491);
        int i2 = (gapComposer.changedInstance(loanDetails) ? 4 : 2) | i | (gapComposer.changedInstance(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LoanDetailsSheetState loanDetailsSheetState = LoanDetailsSheetState.Details;
            int i3 = (i2 & 112) | (i2 & 14) | MLKEMEngine.KyberPolyBytes | 3072;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            LoanDetailsSheet(loanDetails, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, loanDetailsSheetState, companion, gapComposer, i3, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(loanDetails, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, modifier2, i, 18);
        }
    }
}
