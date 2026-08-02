package com.squareup.cash.cashapppay.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
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
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GrantScreenKt {
    public static final void Body(GrantViewModel.Main main, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(984036881);
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
                gapComposer.startReplaceGroup(-2003440650);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2003440649);
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda10(main, i, 1);
        }
    }

    public static final void GrantScreenContent(GrantViewModel grantViewModel, RealImageLoader realImageLoader, MoneyFormatter moneyFormatter, Function1 function1, Composer composer, int i) {
        int i2;
        grantViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1617980752);
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-795776507, new GrantSheetKt$$ExternalSyntheticLambda0(realImageLoader, grantViewModel, moneyFormatter, function1, 1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda1(grantViewModel, realImageLoader, moneyFormatter, function1, i, 1);
        }
    }

    public static final void Main(GrantViewModel.Main main, MoneyFormatter moneyFormatter, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        GrantViewModel.Main main2;
        float f;
        float f2;
        boolean z;
        String valueOf;
        int i3;
        MoneyFormatter moneyFormatter2 = moneyFormatter;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(343105513);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(main) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(moneyFormatter2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(24, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            int i4 = i2;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
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
            main2 = main;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1095341688, new GrantSheetKt$$ExternalSyntheticLambda5(main2, 1), gapComposer), gapComposer, 6);
            String str = main2.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-1020924893);
                z = false;
                gapComposer.end(false);
                f = 16.0f;
                f2 = 0.0f;
            } else {
                gapComposer.startReplaceGroup(-1020924892);
                f = 16.0f;
                f2 = 0.0f;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                z = false;
                gapComposer.end(false);
            }
            Body(main2, gapComposer, i4 & 14);
            Money money = main2.amount;
            if (money == null) {
                gapComposer.startReplaceGroup(-1020722432);
                gapComposer.end(z);
                moneyFormatter2 = moneyFormatter;
                i3 = 14;
            } else {
                gapComposer.startReplaceGroup(-1020722431);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, f2, f, 1);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).hero;
                moneyFormatter2 = moneyFormatter;
                if (moneyFormatter == null || (valueOf = moneyFormatter2.format(money)) == null) {
                    valueOf = String.valueOf(money.amount);
                }
                String str2 = valueOf;
                i3 = 14;
                GapComposer gapComposer3 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, m300paddingVpY3zN4$default2, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer3;
                z = false;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            PayWithCashAuthorizationBlocker.Footer footer = main2.footer;
            if (footer == null) {
                gapComposer.startReplaceGroup(-1050667151);
                gapComposer.end(z);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-1050667150);
                String str3 = footer.disclaimer_text;
                if (str3 == null) {
                    gapComposer.startReplaceGroup(-143101294);
                    gapComposer.end(z);
                    function12 = function1;
                } else {
                    gapComposer.startReplaceGroup(-143101293);
                    function12 = function1;
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1411767300, new TabContentViewKt$$ExternalSyntheticLambda11(str3, function12, i3), gapComposer);
                    gapComposer.end(z);
                }
                GapComposer gapComposer4 = gapComposer;
                DimensionKt.ButtonCtaGroup(null, false, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-661152087, new GrantSheetKt$$ExternalSyntheticLambda7(footer, function12, 1), gapComposer), gapComposer4, 24576, 7);
                gapComposer = gapComposer4;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            main2 = main;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrantSheetKt$$ExternalSyntheticLambda8(main2, moneyFormatter2, function12, i, 1);
        }
    }
}
