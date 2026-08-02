package com.squareup.cash.cashapppay.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GrantSheetKt {
    static {
        new Money((Long) 1234L, CurrencyCode.USD, 4);
        new FormBlocker.Element.CallToActionElement("CTA_Title", "CTA_Subtitle.", null, null, null, null, null, null, null, 508, null);
        new PayWithCashAuthorizationBlocker.Footer(new PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter(new PayWithCashAuthorizationBlocker.Footer.ButtonFooter(new BlockerAction("primary", null, 30), new BlockerAction("secondary", null, 30), null, 4, null)), null, null, 4, null);
    }

    public static final void Body(GrantViewModel.Main main, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1465070514);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(main) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = main.subtitle;
            if (str == null) {
                str = null;
            } else if (!StringsKt__StringsJVMKt.endsWith(str, ".", false)) {
                str = str.concat(".");
            }
            if (str == null) {
                str = "";
            }
            FormBlocker.Element.CallToActionElement callToActionElement = main.callToAction;
            String str2 = callToActionElement != null ? callToActionElement.subtitle : null;
            String obj = StringsKt.trim(str + " " + (str2 != null ? str2 : "")).toString();
            String str3 = obj.length() > 0 ? obj : null;
            if (str3 == null) {
                gapComposer.startReplaceGroup(458620597);
                gapComposer.end(false);
                i3 = 0;
            } else {
                gapComposer.startReplaceGroup(458620598);
                i3 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            i3 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda10(main, i, i3);
        }
    }

    public static final void GrantSheetContent(GrantViewModel grantViewModel, RealImageLoader realImageLoader, MoneyFormatter moneyFormatter, Function1 function1, Composer composer, int i) {
        int i2;
        grantViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1004335606);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(grantViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(moneyFormatter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(15513247, new GrantSheetKt$$ExternalSyntheticLambda0(realImageLoader, grantViewModel, moneyFormatter, function1, 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda1(grantViewModel, realImageLoader, moneyFormatter, function1, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static final void Main(GrantViewModel.Main main, MoneyFormatter moneyFormatter, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        MoneyFormatter moneyFormatter2;
        ?? r0;
        Modifier.Companion companion;
        float f;
        ?? r4;
        String valueOf;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1326551334);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(main) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(moneyFormatter) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int i3 = i2;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(775924331, new GrantSheetKt$$ExternalSyntheticLambda5(main, 0), gapComposer), gapComposer, 6);
            String str = main.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-1310955974);
                gapComposer.end(false);
                r0 = 0;
                companion = companion2;
                f = 16.0f;
                r4 = 1;
            } else {
                gapComposer.startReplaceGroup(-1310955973);
                r0 = 0;
                companion = companion2;
                f = 16.0f;
                r4 = 1;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            Body(main, gapComposer, i3 & 14);
            Money money = main.amount;
            if (money == null) {
                gapComposer.startReplaceGroup(-1310753513);
                gapComposer.end(r0);
                moneyFormatter2 = moneyFormatter;
            } else {
                gapComposer.startReplaceGroup(-1310753512);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, f, r4);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).hero;
                moneyFormatter2 = moneyFormatter;
                if (moneyFormatter == null || (valueOf = moneyFormatter2.format(money)) == null) {
                    valueOf = String.valueOf(money.amount);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default2, textStyle, (TextLineBalancing) null, valueOf, (Map) null, (Function1) null, false);
                gapComposer.end(r0);
            }
            gapComposer.end(r4);
            PayWithCashAuthorizationBlocker.Footer footer = main.footer;
            if (footer == null) {
                gapComposer.startReplaceGroup(489734292);
                gapComposer.end(r0);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(489734293);
                String str2 = footer.disclaimer_text;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1626521021);
                    gapComposer.end(r0);
                    function12 = function1;
                } else {
                    gapComposer.startReplaceGroup(1626521022);
                    function12 = function1;
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(140860519, new TabContentViewKt$$ExternalSyntheticLambda11(str2, function12, 15), gapComposer);
                    gapComposer.end(r0);
                }
                DimensionKt.ButtonCtaGroup(null, false, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(1273452570, new GrantSheetKt$$ExternalSyntheticLambda7(footer, function12, r0), gapComposer), gapComposer, 24576, 7);
                gapComposer.end(r0);
            }
            gapComposer.end(r4);
        } else {
            function12 = function1;
            moneyFormatter2 = moneyFormatter;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda8(main, moneyFormatter2, function12, i, 0);
        }
    }
}
