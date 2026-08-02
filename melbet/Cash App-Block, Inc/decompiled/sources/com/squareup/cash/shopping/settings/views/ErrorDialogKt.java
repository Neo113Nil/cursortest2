package com.squareup.cash.shopping.settings.views;

import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewModel;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ErrorDialogKt {

    /* renamed from: lambda$-260209585, reason: not valid java name */
    public static final ComposableLambdaImpl f663lambda$260209585 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(29), false, -260209585);
    public static final ComposableLambdaImpl lambda$1464963287 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(18), false, 1464963287);
    public static final ComposableLambdaImpl lambda$646275853 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(1), false, 646275853);

    /* renamed from: lambda$-1834110129, reason: not valid java name */
    public static final ComposableLambdaImpl f662lambda$1834110129 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(2), false, -1834110129);

    /* renamed from: lambda$-1585617311, reason: not valid java name */
    public static final ComposableLambdaImpl f661lambda$1585617311 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(19), false, -1585617311);
    public static final ComposableLambdaImpl lambda$1214835769 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(27), false, 1214835769);
    public static final ComposableLambdaImpl lambda$133223582 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(28), false, 133223582);
    public static final ComposableLambdaImpl lambda$983817354 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(29), false, 983817354);
    public static final ComposableLambdaImpl lambda$1211239551 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(20), false, 1211239551);
    public static final ComposableLambdaImpl lambda$868355742 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(21), false, 868355742);

    public static final void AddNewAddress(int i, Composer composer, Modifier modifier, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-615952022);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier = Modifier.Companion.$$INSTANCE;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(modifier, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1491973928, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(15, function1), gapComposer), gapComposer, 24576, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(function1, modifier, i, 6);
        }
    }

    public static final void Address(final ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded loaded, boolean z, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-958056561);
        int i2 = i | (gapComposer2.changedInstance(loaded) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer2, null);
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, f662lambda$1834110129, 15);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-638450368, new Function2() { // from class: com.squareup.cash.shopping.settings.views.ShoppingSettingsAutofillViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded loaded2 = loaded;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.fullName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.address, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            r8 = (i2 & 896) == 256 ? 1 : 0;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (r8 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f661lambda$1585617311, rememberComposableLambda, null, (Function0) rememberedValue, z, false, Expect_jvmKt.rememberComposableLambda(749583994, new Function2() { // from class: com.squareup.cash.shopping.settings.views.ShoppingSettingsAutofillViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    ShoppingSettingsAutofillViewModel.AddressViewModel.Loaded loaded2 = loaded;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.fullName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.address, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, buttonCompact, 0L, gapComposer, ((i2 << 12) & 458752) | 12582966, 3412);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(i, 3, loaded, function1, z);
        }
    }

    public static final void AddressLoading(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1124261528);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 15);
        }
    }

    public static final void AddressLoadingError(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-533398804);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            String stringResource = Room.stringResource(gapComposer, R.string.shopping_settings_autofill_address_load_error);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 14);
        }
    }

    public static final void ErrorDialog(ErrorViewModel errorViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        errorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1338700297);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(errorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-220568418, new CalloutKt$$ExternalSyntheticLambda0(errorViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(errorViewModel, function1, modifier2, i, 29);
        }
    }

    public static final void ShoppingSettingsAutofillView(ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        shoppingSettingsAutofillViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1999508102);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(shoppingSettingsAutofillViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1880976623, new CalloutKt$$ExternalSyntheticLambda0(function1, shoppingSettingsAutofillViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(shoppingSettingsAutofillViewModel, function1, modifier2, i, 1);
        }
    }

    public static final void ShoppingSettingsView(ShoppingSettingsViewModel shoppingSettingsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        shoppingSettingsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-969702568);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(shoppingSettingsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1517368547, new CalloutKt$$ExternalSyntheticLambda0(function1, shoppingSettingsViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(shoppingSettingsViewModel, function1, modifier2, i, 2);
        }
    }
}
