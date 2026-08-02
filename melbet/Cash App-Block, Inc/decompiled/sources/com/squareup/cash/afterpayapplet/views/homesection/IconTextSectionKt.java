package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class IconTextSectionKt {
    public static final void IconTextSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText iconText, boolean z, boolean z2, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        long j;
        TextStyle textStyle;
        TextStyle textStyle2;
        long j2;
        iconText.getClass();
        Tap tap = iconText.tapAction;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(278006678);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(iconText) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier modifier3 = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i4 != 0 ? modifier3 : modifier2;
            if (tap != null) {
                gapComposer2.startReplaceGroup(1400228469);
                boolean changedInstance = gapComposer2.changedInstance(iconText) | ((57344 & i3) == 16384);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(25, iconText, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                modifier3 = ImageKt.m183clickableoSLSa3U$default(modifier3, false, null, null, (Function0) rememberedValue, 15);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1400410966);
                gapComposer2.end(false);
            }
            Modifier then = SizeKt.fillMaxWidth(modifier4, 1.0f).then(modifier3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (z && z2) {
                gapComposer2.startReplaceGroup(-500609198);
                LegalSectionKt.HomeSectionDivider(gapComposer2, 0);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-500543850);
                gapComposer2.end(false);
            }
            if (z2) {
                gapComposer2.startReplaceGroup(-500457701);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.icon.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-500393345);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.icon.info;
                gapComposer2.end(false);
            }
            if (z2) {
                gapComposer2.startReplaceGroup(-500298206);
                textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-500240732);
                textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                gapComposer2.end(false);
            }
            if (z2) {
                gapComposer2.startReplaceGroup(-500150181);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                textStyle2 = textStyle;
                j2 = colors3.semantic.text.standard;
                gapComposer2.end(false);
            } else {
                textStyle2 = textStyle;
                gapComposer2.startReplaceGroup(-500085763);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors4.semantic.text.subtle;
                gapComposer2.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1691287686, new LoanDetailsSheetKt$$ExternalSyntheticLambda8(iconText, j, 2), gapComposer2);
            modifier2 = modifier4;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-764532933, new ButtonBinding$$ExternalSyntheticLambda2(iconText, 8), gapComposer2), null, null, false, false, Expect_jvmKt.rememberComposableLambda(501028289, new TapToPayPaymentKt$$ExternalSyntheticLambda3(iconText, textStyle2, j2, 3), gapComposer2), null, tap != null ? CellDefaultAccessory.Push.INSTANCE : null, 0L, gapComposer2, 12582966, 3452);
            gapComposer = gapComposer2;
            if (!z || z2) {
                gapComposer.startReplaceGroup(-499196714);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-499229388);
                LegalSectionKt.HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier5 = modifier2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(modifier5, iconText, z, z2, function1, i, i2);
        }
    }
}
