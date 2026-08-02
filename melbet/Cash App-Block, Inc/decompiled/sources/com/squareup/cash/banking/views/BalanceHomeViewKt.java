package com.squareup.cash.banking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewEvent;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BalanceHomeViewKt {
    public static final BalanceHomeViewModel.Loaded PREVIEW_MODEL;

    static {
        BalanceHomeViewModel.Loaded.BalanceViewModel balanceViewModel = new BalanceHomeViewModel.Loaded.BalanceViewModel("Cash Balance", "$154.00");
        BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel restrictedBalanceViewModel = new BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel("+$245.42 on hold");
        BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel overdraftUpsellViewModel = new BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel(new Image("fake:///benefit_leaflet_savings_yield.png", (String) null, 6), "Get up to $200 in free overdraft coverage", "Earn Green status");
        BalanceHomeViewModel.Loaded.AccountDetailsViewModel accountDetailsViewModel = new BalanceHomeViewModel.Loaded.AccountDetailsViewModel(new AccountDetailsContent("073 923 033", "Routing number", "1234 4903 3020 49302", "Account number", true), null);
        BankingTab.BankingTabSection.HeaderBlock headerBlock = new BankingTab.BankingTabSection.HeaderBlock("Add money to your balance", null, null, null, null, 30, null);
        zzd zzdVar = Icons.Companion;
        PREVIEW_MODEL = new BalanceHomeViewModel.Loaded(balanceViewModel, restrictedBalanceViewModel, BalanceHomeViewModel.OverdraftPillViewModel.On.INSTANCE, accountDetailsViewModel, overdraftUpsellViewModel, null, new UiCallbackModel(new AvatarsKt$$ExternalSyntheticLambda2(25), new BankingSectionsViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) new BankingTab.BankingTabSection[]{new BankingTab.BankingTabSection(headerBlock, CollectionsKt__CollectionsJVMKt.listOf(new BankingTab.Options(new BankingTab.BankingOption("ADD_INSTANTLY", "Add instantly", null, "Transfer from linked bank", null, new Icon("GXcvqM"), null, BankingTab.Appearance.INACTIVE, null, null, null, null, 3924, null), null, null, null, null, 30, null)), null, 4, null), new BankingTab.BankingTabSection(new BankingTab.BankingTabSection.HeaderBlock("Withdraw from your balance", null, null, null, null, 30, null), CollectionsKt__CollectionsJVMKt.listOf(new BankingTab.Options(new BankingTab.BankingOption("WITHDRAW", "Withdraw", null, "Transfer to linked bank", null, new Icon("GXcvqM"), null, null, null, null, null, null, 4052, null), null, null, null, null, 30, null)), null, 4, null)}))), "Your balance is FDIC insured through our partner banks, Wells Fargo Bank, N.A. and Sutton Bank, Members FDIC, for up to $250,000 per person. Prepaid debit cards issued by Sutton Bank. [Learn more.]()", false, null, null, false, "Free overdraft coverage on");
    }

    public static final void AccountDetails(AccountDetailsContent accountDetailsContent, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1849321438);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(accountDetailsContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.balance_home_banking_details_header);
            if (z) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, 744332488, R.string.balance_home_banking_details_learn_more_button, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(744433424);
                gapComposer.end(false);
                str = null;
            }
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, str, (Function0) rememberedValue, (String) null, gapComposer, 0, 18);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str2 = accountDetailsContent.routingLabel;
            String str3 = accountDetailsContent.routingNumber;
            boolean z3 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(5, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CopyCodeKt.CopyCode(str2, str3, null, null, null, (Function1) rememberedValue2, gapComposer, MLKEMEngine.KyberPolyBytes, 120);
            String str4 = accountDetailsContent.accountLabel;
            String str5 = accountDetailsContent.accountNumber;
            boolean z4 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new AvatarsKt$$ExternalSyntheticLambda1(6, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CopyCodeKt.CopyCode(str4, str5, null, null, null, (Function1) rememberedValue3, gapComposer, MLKEMEngine.KyberPolyBytes, 120);
            if (z) {
                gapComposer.startReplaceGroup(745318474);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(745000383);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean z5 = i3 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z5 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(28, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue4, m300paddingVpY3zN4$default, buttonProminence, false, false, null, BankingDialogKt.f233lambda$1130165536, gapComposer, 1573248, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(accountDetailsContent, function1, z, i, 4);
        }
    }

    public static final void AccountDetailsPlaceholder(BalanceData.Button button, Function1 function1, Composer composer, int i) {
        int i2;
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-929917965);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Room.stringResource(gapComposer, R.string.balance_home_account_details_set_up), 2);
            if (button == null) {
                gapComposer.startReplaceGroup(-646642848);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(-646642847);
                boolean changedInstance = gapComposer.changedInstance(button) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda16(function1, button, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(BankingDialogKt.lambda$1864259841, null, function0, false, false, null, null, 0L, label, null, gapComposer, 6, 1530);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda17(button, function1, i, 0);
        }
    }

    public static final void AccountManageRow(BalanceData.Button button, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(917332921);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer2, R.string.balance_home_account_details_set_up);
            Icons icons = Icons.BankAccount24;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(stringResource, 2);
            gapComposer2.startReplaceGroup(-611336677);
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer2.changedInstance(button);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda16(function1, button, 1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, BankingDialogKt.f236lambda$1476211276, null, 0L, (Function0) rememberedValue, null, false, false, null, null, label, 0L, null, gapComposer, 3126, 0, 28592);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda17(button, function1, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceHome(BalanceHomeViewModel.Loaded loaded, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function1 function12;
        ScrollState scrollState2;
        Modifier modifier3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        ScrollState rememberScrollState;
        int i4;
        final BalanceHomeViewModel.Loaded loaded2;
        ComposableLambdaImpl composableLambdaImpl;
        int i5;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        GapComposer gapComposer4;
        Modifier modifier4;
        ?? r8;
        GapComposer gapComposer5;
        GapComposer gapComposer6;
        GapComposer gapComposer7;
        BalanceData.Button button;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer8 = (GapComposer) composer;
        gapComposer8.startRestartGroup(-1835527300);
        Applier applier = gapComposer8.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer8.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer8.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer8.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            final int i7 = 0;
            if (gapComposer8.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                function12 = function1;
                GapComposer gapComposer9 = gapComposer8;
                gapComposer9.skipToGroupEnd();
                scrollState2 = scrollState;
                modifier3 = modifier2;
                gapComposer = gapComposer9;
            } else {
                gapComposer8.startDefaults();
                int i8 = i & 1;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i8 == 0 || gapComposer8.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier2 = companion;
                    }
                    rememberScrollState = ImageKt.rememberScrollState(gapComposer8);
                    i4 = i3 & (-7169);
                } else {
                    gapComposer8.skipToGroupEnd();
                    i4 = i3 & (-7169);
                    rememberScrollState = scrollState;
                }
                int i9 = i4;
                Modifier modifier5 = modifier2;
                gapComposer8.endDefaults();
                Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                } else {
                    gapComposer8.startReplaceGroup(-1762997739);
                    gapComposer8.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier5, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 48);
                int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer8.startReusableNode();
                if (gapComposer8.inserting) {
                    gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer8.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer8, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer8, materializeModifier, composeUiNode$Companion$SetModifier$14);
                BalanceHomeViewModel.Loaded.BalanceViewModel balanceViewModel = loaded.balanceViewModel;
                UiCallbackModel uiCallbackModel = loaded.activityEmbeddedModel;
                BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel = loaded.overdraftPillViewModel;
                BalanceHomeViewModel.Loaded.AccountDetailsViewModel accountDetailsViewModel = loaded.accountDetailsViewModel;
                boolean z = loaded.evergreenOverdraftEnabled;
                String str = balanceViewModel.title;
                if (z) {
                    str = null;
                }
                NavigationType navigationType = NavigationType.BACK;
                String str2 = str;
                int i10 = i9 & 112;
                boolean z2 = i10 == 32;
                Object rememberedValue = gapComposer8.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(0, function1);
                    gapComposer8.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer10 = gapComposer8;
                modifier3 = modifier5;
                ScrollState scrollState3 = rememberScrollState;
                DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer10, 48, 108);
                Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(companion, scrollState3, false, 14));
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer10, 48);
                int hashCode2 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer10.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer10, navigationBarsPadding);
                gapComposer10.startReusableNode();
                if (gapComposer10.inserting) {
                    gapComposer10.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer10.useNode();
                }
                Updater.m576setimpl(gapComposer10, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer10, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer10, composeUiNode$Companion$SetModifier$13, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer10, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                if (z) {
                    gapComposer10.startReplaceGroup(188886450);
                    loaded2 = loaded;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2050057844, new Function2() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i7;
                            BalanceHomeViewModel.Loaded loaded3 = loaded2;
                            switch (i11) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer11 = (GapComposer) composer2;
                                    if (gapComposer11.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.balanceViewModel.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer11.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer12 = (GapComposer) composer3;
                                    if (gapComposer12.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.balanceViewModel.formattedBalance, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer12.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer10);
                    gapComposer10.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                } else {
                    loaded2 = loaded;
                    gapComposer10.startReplaceGroup(188954029);
                    gapComposer10.end(false);
                    composableLambdaImpl = null;
                }
                final int i11 = 1;
                function12 = function1;
                zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-62411914, new Function2() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i112 = i11;
                        BalanceHomeViewModel.Loaded loaded3 = loaded2;
                        switch (i112) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer11 = (GapComposer) composer2;
                                if (gapComposer11.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.balanceViewModel.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer11.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer12 = (GapComposer) composer3;
                                if (gapComposer12.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.balanceViewModel.formattedBalance, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer12.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer10), (Modifier) null, z ? 5 : 3, composableLambdaImpl, (Function3) null, Expect_jvmKt.rememberComposableLambda(-1092499159, new BankingDialogKt$$ExternalSyntheticLambda2(7, (Object) loaded2, function1), gapComposer10), Expect_jvmKt.rememberComposableLambda(2132356272, new BadgeKt$$ExternalSyntheticLambda2(12, loaded2, function1), gapComposer10), gapComposer10, 1769478, 18);
                boolean z3 = (accountDetailsViewModel != null ? accountDetailsViewModel.content : null) == null;
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer10, null);
                if (accountDetailsViewModel == null) {
                    gapComposer10.startReplaceGroup(189730951);
                    gapComposer10.end(false);
                    i5 = i10;
                } else {
                    AccountDetailsContent accountDetailsContent = accountDetailsViewModel.content;
                    gapComposer10.startReplaceGroup(189730952);
                    if (accountDetailsContent != null) {
                        gapComposer10.startReplaceGroup(-893239711);
                        i5 = i10;
                        AccountDetails(accountDetailsContent, function12, z, gapComposer10, i5);
                        gapComposer10.end(false);
                    } else {
                        i5 = i10;
                        if (z) {
                            gapComposer10.startReplaceGroup(-892932036);
                            gapComposer10.end(false);
                        } else {
                            gapComposer10.startReplaceGroup(-893013721);
                            AccountDetailsPlaceholder(accountDetailsViewModel.button, function12, gapComposer10, i5);
                            gapComposer10.end(false);
                        }
                    }
                    gapComposer10.end(false);
                }
                if (z) {
                    gapComposer10.startReplaceGroup(190148181);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer10, null);
                    BalanceData.Button button2 = (accountDetailsViewModel == null || (button = accountDetailsViewModel.button) == null || !z3) ? null : button;
                    if (button2 == null && overdraftPillViewModel == null) {
                        gapComposer10.startReplaceGroup(190731570);
                        gapComposer10.end(false);
                        gapComposer7 = gapComposer10;
                    } else {
                        gapComposer10.startReplaceGroup(190490359);
                        ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer10, R.string.balance_home_manage_header), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer10, 0, 30);
                        GapComposer gapComposer11 = gapComposer10;
                        if (button2 == null) {
                            gapComposer11.startReplaceGroup(190606732);
                        } else {
                            gapComposer11.startReplaceGroup(190606733);
                            AccountManageRow(button2, function12, gapComposer11, i5);
                        }
                        gapComposer11.end(false);
                        if (overdraftPillViewModel == null) {
                            gapComposer11.startReplaceGroup(190684170);
                        } else {
                            gapComposer11.startReplaceGroup(190684171);
                            OverdraftManageRow(overdraftPillViewModel, function12, gapComposer11, i5);
                        }
                        gapComposer11.end(false);
                        gapComposer11.end(false);
                        gapComposer7 = gapComposer11;
                    }
                    BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel overdraftUpsellViewModel = loaded2.overdraftUpsellViewModel;
                    if (overdraftUpsellViewModel == null) {
                        gapComposer7.startReplaceGroup(190777387);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(190777388);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                        OverdraftUpsellCard(overdraftUpsellViewModel, function12, gapComposer7, i5);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(false);
                    gapComposer2 = gapComposer7;
                } else {
                    gapComposer10.startReplaceGroup(190914098);
                    gapComposer10.end(false);
                    gapComposer2 = gapComposer10;
                }
                if (z) {
                    gapComposer2.startReplaceGroup(191111506);
                    gapComposer2.end(false);
                    gapComposer3 = gapComposer2;
                } else {
                    gapComposer2.startReplaceGroup(837445338);
                    if (uiCallbackModel == null) {
                        gapComposer2.startReplaceGroup(191001703);
                        gapComposer2.end(false);
                        gapComposer6 = gapComposer2;
                    } else {
                        gapComposer2.startReplaceGroup(191001704);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer2, null);
                        GapComposer gapComposer12 = gapComposer2;
                        AvatarsKt.ActivityEmbeddedView(uiCallbackModel, null, null, null, null, gapComposer12, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        GapComposer gapComposer13 = gapComposer12;
                        gapComposer13.end(false);
                        gapComposer6 = gapComposer13;
                    }
                    gapComposer6.end(false);
                    gapComposer3 = gapComposer6;
                }
                BalanceHomeViewModel.Loaded.CallToActionViewModel callToActionViewModel = loaded2.callToActionViewModel;
                if (callToActionViewModel == null) {
                    gapComposer3.startReplaceGroup(191161415);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(191161416);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str3 = callToActionViewModel.title;
                    String str4 = callToActionViewModel.subtitle;
                    String str5 = callToActionViewModel.button;
                    LinkStyle linkStyle = LinkStyle.SUBTLE;
                    boolean changedInstance = (i5 == 32) | gapComposer3.changedInstance(callToActionViewModel);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BankingDialogKt$$ExternalSyntheticLambda5(20, function12, callToActionViewModel);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    FirstOrNullOnTimeoutKt.UpsellWidget(null, str3, str4, str5, (Function0) rememberedValue2, m300paddingVpY3zN4$default, linkStyle, gapComposer3, 1572870);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                    gapComposer3.end(false);
                }
                loaded2.bankingSectionsUiCallbackModel.Show(BankingDialogKt.lambda$1912849443, gapComposer3, 6);
                if (z) {
                    gapComposer3.startReplaceGroup(837474522);
                    if (uiCallbackModel == null) {
                        gapComposer3.startReplaceGroup(191906407);
                        gapComposer3.end(false);
                        gapComposer5 = gapComposer3;
                    } else {
                        gapComposer3.startReplaceGroup(191906408);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer3, null);
                        GapComposer gapComposer14 = gapComposer3;
                        AvatarsKt.ActivityEmbeddedView(uiCallbackModel, null, null, null, null, gapComposer14, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        GapComposer gapComposer15 = gapComposer14;
                        gapComposer15.end(false);
                        gapComposer5 = gapComposer15;
                    }
                    gapComposer5.end(false);
                    gapComposer4 = gapComposer5;
                } else {
                    gapComposer3.startReplaceGroup(192016210);
                    gapComposer3.end(false);
                    gapComposer4 = gapComposer3;
                }
                String str6 = loaded2.disclosure;
                if (str6 == null) {
                    gapComposer4.startReplaceGroup(192046527);
                    gapComposer4.end(false);
                    modifier4 = null;
                    r8 = 1;
                } else {
                    gapComposer4.startReplaceGroup(192046528);
                    modifier4 = null;
                    r8 = 1;
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer4, null);
                    Disclosure(str6, loaded2.showDisclosureIcon, function12, gapComposer4, (i9 << 3) & 896);
                    gapComposer4.end(false);
                }
                DBUtil.SpacerBetweenSectionLarge(0, r8, gapComposer4, modifier4);
                gapComposer4.end(r8);
                gapComposer4.end(r8);
                scrollState2 = scrollState3;
                gapComposer = gapComposer4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(loaded, function12, modifier3, scrollState2, i, i2, 13);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        final int i72 = 0;
        if (gapComposer8.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankingOption(final BankingTab.BankingOption bankingOption, final Function1 function1, Composer composer, int i) {
        int i2;
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1567961283);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bankingOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        int i4 = 8;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icon icon = bankingOption.icon;
            if (icon != null && (str = icon.arcade_id) != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            icons = Icons.BankAccount24;
            int i5 = i2 & 112;
            boolean changedInstance = (i5 == 32) | gapComposer.changedInstance(bankingOption);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r3;
                        BankingTab.BankingOption bankingOption2 = bankingOption;
                        Function1 function12 = function1;
                        switch (i6) {
                            case 0:
                                String str2 = bankingOption2.id;
                                str2.getClass();
                                function12.invoke(new BankingSectionsViewEvent.RowViewed(str2));
                                break;
                            default:
                                function12.invoke(new BankingSectionsViewEvent.BankingRowClicked(bankingOption2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(Modifier.Companion.$$INSTANCE, (Function0) rememberedValue);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean z = bankingOption.appearance != BankingTab.Appearance.INACTIVE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1587974513, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i4), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-249211090, new Function2() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = r2;
                    BankingTab.BankingOption bankingOption2 = bankingOption;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String str2 = bankingOption2.main_text;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str3 = bankingOption2.secondary_text;
                                str3.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int i6 = (gapComposer.changedInstance(bankingOption) ? 1 : 0) | (i5 == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i6 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i3;
                        BankingTab.BankingOption bankingOption2 = bankingOption;
                        Function1 function12 = function1;
                        switch (i62) {
                            case 0:
                                String str2 = bankingOption2.id;
                                str2.getClass();
                                function12.invoke(new BankingSectionsViewEvent.RowViewed(str2));
                                break;
                            default:
                                function12.invoke(new BankingSectionsViewEvent.BankingRowClicked(bankingOption2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, onVisible$default, (Function0) rememberedValue2, z, false, Expect_jvmKt.rememberComposableLambda(-806565144, new Function2() { // from class: com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i3;
                    BankingTab.BankingOption bankingOption2 = bankingOption;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String str2 = bankingOption2.main_text;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str3 = bankingOption2.secondary_text;
                                str3.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, gapComposer, 817889334, 3408);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(bankingOption, function1, i, 8);
        }
    }

    public static final void BankingSection(BankingTab.BankingTabSection bankingTabSection, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(89237250);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bankingTabSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BankingTab.BankingTabSection.HeaderBlock headerBlock = bankingTabSection.header_block;
            String str = headerBlock != null ? headerBlock.heading : null;
            if (str == null) {
                gapComposer.startReplaceGroup(-117696393);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-117696392);
                ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            List<BankingTab.Options> list = bankingTabSection.banking_options;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BankingTab.BankingOption bankingOption = ((BankingTab.Options) it.next()).banking_option;
                if (bankingOption != null) {
                    arrayList.add(bankingOption);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BankingOption((BankingTab.BankingOption) it2.next(), function1, gapComposer, i2 & 112);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(bankingTabSection, function1, i, 7);
        }
    }

    public static final void BankingSections(BankingSectionsViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-234211370);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(loaded) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            gapComposer.startReplaceGroup(-1819778910);
            int i3 = 0;
            for (Object obj : loaded.sections) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                BankingTab.BankingTabSection bankingTabSection = (BankingTab.BankingTabSection) obj;
                if (i3 > 0) {
                    gapComposer.startReplaceGroup(1873308014);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1873360869);
                    gapComposer.end(false);
                }
                BankingSection(bankingTabSection, function1, gapComposer, i2 & 112);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(loaded, function1, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    public static final void Disclosure(String str, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        ?? r14;
        float f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-588289469);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            if (z) {
                gapComposer2.startReplaceGroup(-1182431587);
                Icons icons = Icons.Fdic24;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                companion = companion2;
                r14 = 0;
                f = 1.0f;
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.icon.standard, gapComposer2, 54, 4);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                companion = companion2;
                r14 = 0;
                f = 1.0f;
                gapComposer2.startReplaceGroup(-1182254763);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, (boolean) r14);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(r14);
            }
            long j = colors2.semantic.text.subtle;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle, 2);
            TextStyle textStyle = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyXSmall;
            boolean z2 = (i2 & 896) == 256 ? true : r14;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, r14, r14);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, markdownSpanValues, null, null, 0, 0, 0, gapComposer2, i2 & 14, 1984);
            GapComposer gapComposer3 = gapComposer2;
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda13(i, 0, str, function1, z);
        }
    }

    public static final void OverdraftBalanceSubtitle(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1667922233);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(29, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            zzacp.m2014InlineIconTextQqsJerU(str, Icons.SubtlePush16.painter(gapComposer2), ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue, 15), Strings.getColors(gapComposer2).semantic.icon.subtle, null, Strings.getTypography(gapComposer2).bodySmall, Strings.getColors(gapComposer2).semantic.text.subtle, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, (i2 & 14) | (Painter.$stable << 3), 24576, 16272);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 6);
        }
    }

    public static final void OverdraftManageRow(BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1326712525);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(overdraftPillViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String m = overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Upsell ? re$$ExternalSyntheticOutline0.m(gapComposer2, 1803927718, R.string.balance_home_account_details_set_up, gapComposer2, false) : overdraftPillViewModel.isEnabled() ? re$$ExternalSyntheticOutline0.m(gapComposer2, 1804032746, R.string.balance_home_overdraft_on_label, gapComposer2, false) : re$$ExternalSyntheticOutline0.m(gapComposer2, 1804113129, R.string.balance_home_overdraft_off_label, gapComposer2, false);
            Icons icons = Icons.OverdraftProtection24;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(m, 2);
            ComposableLambdaImpl composableLambdaImpl = BankingDialogKt.lambda$2102331400;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(24, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, composableLambdaImpl, null, 0L, (Function0) rememberedValue, null, false, false, null, null, label, 0L, null, gapComposer, 3126, 0, 28592);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(overdraftPillViewModel, function1, i, 0);
        }
    }

    public static final void OverdraftPill(BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel, Function1 function1, Composer composer, int i) {
        boolean z;
        String m;
        Modifier.Companion companion;
        String m2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2068099055);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(overdraftPillViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            long j2 = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(companion2, 1.0f, j2, m340RoundedCornerShape0680j_4);
            Strings.getSizes(gapComposer).getClass();
            Modifier clip = ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
            Role role = new Role(0);
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, role, (Function0) rememberedValue, 11);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 4.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            boolean z3 = overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.NewUserExperience;
            if (z3) {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -656306407, R.string.balance_home_overdraft_pill_upsell, gapComposer, false);
                z = false;
            } else {
                if (!(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.On) && !(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Off) && !(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Upsell) && !(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Used)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -656307836, false);
                }
                z = false;
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -656301617, R.string.overdraft_coverage_title, gapComposer, false);
            }
            boolean z4 = z;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3830, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
            if (z3) {
                companion = companion2;
                gapComposer.startReplaceGroup(1130725673);
                gapComposer.end(z4);
            } else {
                gapComposer.startReplaceGroup(1129737517);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                if (z3) {
                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, -656289097, z4, "Unreachable code path");
                }
                boolean z5 = overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.On;
                if (z5) {
                    m2 = re$$ExternalSyntheticOutline0.m(gapComposer, -656287338, R.string.balance_home_overdraft_on_label, gapComposer, z4);
                } else if ((overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Off) || (overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Upsell)) {
                    m2 = re$$ExternalSyntheticOutline0.m(gapComposer, -656283785, R.string.balance_home_overdraft_off_label, gapComposer, z4);
                } else {
                    if (!(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Used)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -656290487, z4);
                    }
                    gapComposer.startReplaceGroup(-656280829);
                    gapComposer.end(z4);
                    m2 = ((BalanceHomeViewModel.OverdraftPillViewModel.Used) overdraftPillViewModel).amountUsed;
                }
                String str = m2;
                if (z3) {
                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, -656277321, z4, "Unreachable code path");
                }
                if (z5) {
                    gapComposer.startReplaceGroup(-656274560);
                    j = Strings.getColors(gapComposer).semantic.text.success;
                    gapComposer.end(z4);
                } else if ((overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Off) || (overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Upsell)) {
                    gapComposer.startReplaceGroup(-656271681);
                    j = Strings.getColors(gapComposer).semantic.text.subtle;
                    gapComposer.end(z4);
                } else {
                    if (!(overdraftPillViewModel instanceof BalanceHomeViewModel.OverdraftPillViewModel.Used)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -656278573, z4);
                    }
                    gapComposer.startReplaceGroup(-656269969);
                    if (((BalanceHomeViewModel.OverdraftPillViewModel.Used) overdraftPillViewModel).isWarning) {
                        gapComposer.startReplaceGroup(1130485051);
                        j = Strings.getColors(gapComposer).semantic.text.warning;
                        gapComposer.end(z4);
                    } else {
                        gapComposer.startReplaceGroup(1130568348);
                        j = Strings.getColors(gapComposer).semantic.text.subtle;
                        gapComposer.end(z4);
                    }
                    gapComposer.end(z4);
                }
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, m302paddingqDBjuR0$default, Strings.getTypography(gapComposer).helpText, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(z4);
            }
            Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).component.cell.controls.icon.f174default, gapComposer, 438, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(overdraftPillViewModel, function1, i, 11);
        }
    }

    public static final void OverdraftUpsellCard(BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel overdraftUpsellViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1987998585);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(overdraftUpsellViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            CardAppMessageViewModel.Ready ready = new CardAppMessageViewModel.Ready("", new AppMessageImage.Static.Inset(overdraftUpsellViewModel.image, false), overdraftUpsellViewModel.title, (String) null, 0, new Actions$One(new Action(overdraftUpsellViewModel.buttonText, null, new AppMessageViewEvent.AppMessageActionTaken("", null, false, null, 12))), 88);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(m300paddingVpY3zN4$default, ready, (Function1) rememberedValue, null, null, null, gapComposer, 0, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(overdraftUpsellViewModel, function1, i, 5);
        }
    }

    public static final void RestrictedBalanceLabel(BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel restrictedBalanceViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(967133427);
        int i2 = (gapComposer2.changedInstance(restrictedBalanceViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default, false, null, null, (Function0) rememberedValue, 15);
            gapComposer = gapComposer2;
            zzacp.m2014InlineIconTextQqsJerU(restrictedBalanceViewModel.formattedBalance, Icons.InformationFill16.painter(gapComposer2), m183clickableoSLSa3U$default, Strings.getColors(gapComposer2).semantic.icon.subtle, null, Strings.getTypography(gapComposer2).bodySmall, Strings.getColors(gapComposer2).semantic.text.subtle, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32656);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(restrictedBalanceViewModel, function1, i, 10);
        }
    }
}
