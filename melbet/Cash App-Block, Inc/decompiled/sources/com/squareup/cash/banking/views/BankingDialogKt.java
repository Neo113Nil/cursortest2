package com.squareup.cash.banking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.ProgressMeter$ZeroBehavior;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda12;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BankingDialogKt {

    /* renamed from: lambda$-1227555987, reason: not valid java name */
    public static final ComposableLambdaImpl f234lambda$1227555987;

    /* renamed from: lambda$-1326124245, reason: not valid java name */
    public static final ComposableLambdaImpl f235lambda$1326124245;

    /* renamed from: lambda$-1623708557, reason: not valid java name */
    public static final ComposableLambdaImpl f237lambda$1623708557;

    /* renamed from: lambda$-1777690431, reason: not valid java name */
    public static final ComposableLambdaImpl f238lambda$1777690431;

    /* renamed from: lambda$-1791509912, reason: not valid java name */
    public static final ComposableLambdaImpl f239lambda$1791509912;

    /* renamed from: lambda$-1825287989, reason: not valid java name */
    public static final ComposableLambdaImpl f240lambda$1825287989;

    /* renamed from: lambda$-1866858722, reason: not valid java name */
    public static final ComposableLambdaImpl f241lambda$1866858722;
    public static final ComposableLambdaImpl lambda$133404354;
    public static final ComposableLambdaImpl lambda$1456794970;
    public static final ComposableLambdaImpl lambda$1483460304;
    public static final ComposableLambdaImpl lambda$158419665;
    public static final ComposableLambdaImpl lambda$1928817196;
    public static final ComposableLambdaImpl lambda$1934143725;
    public static final ComposableLambdaImpl lambda$419663942;
    public static final ComposableLambdaImpl lambda$762386300;
    public static final ComposableLambdaImpl lambda$772156861;
    public static final ComposableLambdaImpl lambda$1912849443 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(10), false, 1912849443);

    /* renamed from: lambda$-1130165536, reason: not valid java name */
    public static final ComposableLambdaImpl f233lambda$1130165536 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(8), false, -1130165536);
    public static final ComposableLambdaImpl lambda$1864259841 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 19), false, 1864259841);

    /* renamed from: lambda$-1476211276, reason: not valid java name */
    public static final ComposableLambdaImpl f236lambda$1476211276 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 20), false, -1476211276);
    public static final ComposableLambdaImpl lambda$2102331400 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 21), false, 2102331400);

    static {
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 22), false, -1133896462);
        lambda$1934143725 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(11), false, 1934143725);
        lambda$1483460304 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 23), false, 1483460304);
        f241lambda$1866858722 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(9), false, -1866858722);
        f237lambda$1623708557 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 24), false, -1623708557);
        lambda$158419665 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 25), false, 158419665);
        f234lambda$1227555987 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 26), false, -1227555987);
        f239lambda$1791509912 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 27), false, -1791509912);
        f240lambda$1825287989 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 28), false, -1825287989);
        lambda$133404354 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 29), false, 133404354);
        f235lambda$1326124245 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(1), false, -1326124245);
        lambda$762386300 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(2), false, 762386300);
        lambda$772156861 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(3), false, 772156861);
        f238lambda$1777690431 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(4), false, -1777690431);
        lambda$1456794970 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(5), false, 1456794970);
        lambda$419663942 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(6), false, 419663942);
        lambda$1928817196 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(7), false, 1928817196);
    }

    public static final void AccountAndRoutingNumbersSection(String str, final AccountDetailsContent accountDetailsContent, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1168609981);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer2.changedInstance(accountDetailsContent) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128) | (gapComposer2.changedInstance(function02) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
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
            if (str == null) {
                gapComposer2.startReplaceGroup(1449511706);
            } else {
                gapComposer2.startReplaceGroup(1449511707);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(965044481, new TransfersViewKt$$ExternalSyntheticLambda5(str, 27), gapComposer2);
            }
            gapComposer2.end(false);
            ViewfinderDefaults.SectionHeader(lambda$1456794970, (Modifier) null, (Function2) null, (Function0) null, composableLambdaImpl, gapComposer2, 6, 14);
            String str2 = accountDetailsContent.routingLabel;
            String str3 = accountDetailsContent.routingNumber;
            String stringResource = Room.stringResource(gapComposer2, R.string.copy_routing_number_content_description);
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(17, function0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CopyCodeKt.CopyCode(str2, str3, stringResource, null, null, (Function1) rememberedValue, gapComposer2, 0, 120);
            if (accountDetailsContent.allowAccountCopy) {
                gapComposer2.startReplaceGroup(1449836215);
                String str4 = accountDetailsContent.accountLabel;
                String str5 = accountDetailsContent.accountNumber;
                String stringResource2 = Room.stringResource(gapComposer2, R.string.copy_account_number_content_description);
                boolean z2 = (i3 & 7168) == 2048;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda10(18, function02);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                CopyCodeKt.CopyCode(str4, str5, stringResource2, null, null, (Function1) rememberedValue2, gapComposer2, 0, 120);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                final int i4 = 0;
                gapComposer2.startReplaceGroup(1450092523);
                final int i5 = 1;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(432491877, new Function2() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        AccountDetailsContent accountDetailsContent2 = accountDetailsContent;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailsContent2.accountLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailsContent2.accountNumber, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), null, null, false, false, Expect_jvmKt.rememberComposableLambda(-920223073, new Function2() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        AccountDetailsContent accountDetailsContent2 = accountDetailsContent;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailsContent2.accountLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountDetailsContent2.accountNumber, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), null, 0L, null, null, gapComposer2, 1572870, 1982);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(str, accountDetailsContent, function0, function02, i, 12);
        }
    }

    public static final void BankTransferSegment(final TransfersViewModel.BankTransferContent bankTransferContent, Function1 function1, Composer composer, int i) {
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1906978344);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(bankTransferContent) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            final int i4 = 0;
            ViewfinderDefaults.SectionHeader(f235lambda$1326124245, (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(-1079560913, new CashtagViewKt$$ExternalSyntheticLambda10(bankTransferContent, 7), gapComposer), gapComposer, 24582, 14);
            gapComposer = gapComposer;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 16.0f), 1.0f);
            boolean z3 = bankTransferContent instanceof TransfersViewModel.BankTransferContent.HasCashCard;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z3) {
                gapComposer.startReplaceGroup(-1413639030);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                boolean z4 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new TransfersView$$ExternalSyntheticLambda0(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                z = z3;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1726678603, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        TransfersViewModel.BankTransferContent bankTransferContent2 = bankTransferContent;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.HasCashCard) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardNotOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1573248, 58);
                gapComposer.end(false);
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                z = z3;
                if (bankTransferContent instanceof TransfersViewModel.BankTransferContent.NoCashCard.CashCardNotOrdered) {
                    gapComposer.startReplaceGroup(-1413464128);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean z5 = (i3 & 112) == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    final int i5 = 1;
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(51586412, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i52 = i5;
                            TransfersViewModel.BankTransferContent bankTransferContent2 = bankTransferContent;
                            switch (i52) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.HasCashCard) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardNotOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573248, 56);
                    gapComposer.end(false);
                    neverEqualPolicy = neverEqualPolicy2;
                } else {
                    if (!(bankTransferContent instanceof TransfersViewModel.BankTransferContent.NoCashCard.CashCardOrdered)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1015433546, false);
                    }
                    gapComposer.startReplaceGroup(-1413221212);
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    boolean z6 = (i3 & 112) == 32;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z6 || rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new TransfersView$$ExternalSyntheticLambda0(24, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    neverEqualPolicy = neverEqualPolicy2;
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(61356973, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i52 = i2;
                            TransfersViewModel.BankTransferContent bankTransferContent2 = bankTransferContent;
                            switch (i52) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.HasCashCard) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardNotOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard.CashCardOrdered) bankTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573248, 56);
                    gapComposer.end(false);
                }
            }
            if (z) {
                gapComposer.startReplaceGroup(-1412975754);
                z2 = true;
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                AccountDetailsContent accountDetailsContent = ((TransfersViewModel.BankTransferContent.HasCashCard) bankTransferContent).accountDetailsContent;
                int i6 = i3 & 112;
                boolean z7 = i6 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
                if (z7 || rememberedValue4 == neverEqualPolicy3) {
                    rememberedValue4 = new TransfersView$$ExternalSyntheticLambda0(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                boolean z8 = i6 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z8 || rememberedValue5 == neverEqualPolicy3) {
                    rememberedValue5 = new TransfersView$$ExternalSyntheticLambda0(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                AccountAndRoutingNumbersSection(null, accountDetailsContent, function0, (Function0) rememberedValue5, gapComposer, 6);
                gapComposer.end(false);
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(-1412581744);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(bankTransferContent, function1, i, 18);
        }
    }

    public static final void BankingDialog(BankingDialogViewModel bankingDialogViewModel, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        bankingDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1447402223);
        int i2 = (gapComposer.changedInstance(bankingDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(122909474, new BankingDialogKt$$ExternalSyntheticLambda0(bankingDialogViewModel, i3), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-91919679, new BankingDialogKt$$ExternalSyntheticLambda0(bankingDialogViewModel, i4), gapComposer);
            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1466873197, new BankingDialogKt$$ExternalSyntheticLambda2(i3, function1, bankingDialogViewModel), gapComposer);
            BankingDialogViewModel.Button button = bankingDialogViewModel.secondaryButton;
            if (button == null) {
                gapComposer.startReplaceGroup(1912515318);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1912515319);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(301795225, new BankingDialogKt$$ExternalSyntheticLambda2(8, function1, button), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.Modal((Modifier) null, rememberComposableLambda2, rememberComposableLambda3, rememberComposableLambda4, rememberComposableLambda, (Function3) null, gapComposer, 3504, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda0(bankingDialogViewModel, function1, i);
        }
    }

    public static final void BetterOverdraftView(BetterOverdraftViewModel betterOverdraftViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        betterOverdraftViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1195017664);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(betterOverdraftViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(316728843, new BankingDialog$$ExternalSyntheticLambda1(betterOverdraftViewModel, function1, (MutableState) rememberedValue, 10), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(betterOverdraftViewModel, function1, i, 12);
        }
    }

    public static final void OverdraftActivated(OverdraftViewModel.Loaded.ActivatedViewModel activatedViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1307585807);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(activatedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            OverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel = activatedViewModel.overdraftUsageViewModel;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            OverdraftUsageMeter(overdraftUsageViewModel, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer, 0);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(activatedViewModel, modifier, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static final void OverdraftCoverage(OverdraftViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        ComposableLambdaImpl rememberComposableLambda;
        int i3;
        ?? r1;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ?? r5;
        Arrangement$Top$1 arrangement$Top$1;
        GapComposer gapComposer2;
        Modifier modifier3;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1940715835);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer3.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            long j = colors.component.sheet.background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1);
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
            OverdraftViewModel.Loaded.ToggleViewModel toggleViewModel = loaded.getToggleViewModel();
            if (toggleViewModel == null) {
                gapComposer3.startReplaceGroup(1022995108);
                gapComposer3.end(false);
                companion = companion2;
                i3 = i4;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                r1 = 0;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                r5 = 1;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(1022995109);
                String str = toggleViewModel.body;
                if (str == null) {
                    gapComposer3.startReplaceGroup(401935687);
                    gapComposer3.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer3.startReplaceGroup(401935688);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-153108886, new TransfersViewKt$$ExternalSyntheticLambda5(str, 23), gapComposer3);
                    gapComposer3.end(false);
                }
                CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(toggleViewModel.checked);
                boolean z = toggleViewModel.enabled;
                i3 = i4;
                ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1676113140, new CashtagViewKt$$ExternalSyntheticLambda10(toggleViewModel, 6), gapComposer3);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer3.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TransfersView$$ExternalSyntheticLambda0(10, function1);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                r1 = 0;
                companion = companion2;
                horizontal = horizontal2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                r5 = 1;
                arrangement$Top$1 = arrangement$Top$12;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, function0, z, true, composableLambdaImpl, null, 0L, toggle, null, gapComposer3, 196614, 1418);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            DBUtil.SpacerBetweenSectionLarge(r1, r5, gapComposer2, null);
            OverdraftViewModel.Loaded.RepaymentSectionViewModel repaymentSection = loaded.getRepaymentSection();
            if (repaymentSection == null) {
                gapComposer2.startReplaceGroup(1023405920);
                gapComposer2.end(r1);
                modifier3 = null;
            } else {
                gapComposer2.startReplaceGroup(1023405921);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier.Companion companion3 = companion;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, r1);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                String str2 = repaymentSection.amountUsed;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                companion = companion3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).numeralLarge, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, repaymentSection.label, (Map) null, (Function1) null, false);
                modifier3 = null;
                DBUtil.SpacerWithinSectionMedium(r1, r5, gapComposer2, null);
                gapComposer2.end(r5);
                gapComposer2.end(r1);
            }
            if (loaded instanceof OverdraftViewModel.Loaded.ActivatedViewModel) {
                gapComposer2.startReplaceGroup(1023771132);
                OverdraftActivated((OverdraftViewModel.Loaded.ActivatedViewModel) loaded, modifier3, gapComposer2, i3 & 14);
                gapComposer2.end(r1);
            } else if (loaded instanceof OverdraftViewModel.Loaded.DisabledViewModel) {
                gapComposer2.startReplaceGroup(1023844509);
                OverdraftDisabled((OverdraftViewModel.Loaded.DisabledViewModel) loaded, modifier3, gapComposer2, i3 & 14);
                gapComposer2.end(r1);
            } else if (loaded instanceof OverdraftViewModel.Loaded.EligibleViewModel) {
                gapComposer2.startReplaceGroup(1023916925);
                OverdraftEligible((OverdraftViewModel.Loaded.EligibleViewModel) loaded, modifier3, gapComposer2, i3 & 14);
                gapComposer2.end(r1);
            } else {
                if (!(loaded instanceof OverdraftViewModel.Loaded.PermanentlyDisabledViewModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1213902293, (boolean) r1);
                }
                gapComposer2.startReplaceGroup(1024000594);
                OverdraftPermanentlyDisabled((OverdraftViewModel.Loaded.PermanentlyDisabledViewModel) loaded, modifier3, gapComposer2, i3 & 14);
                gapComposer2.end(r1);
            }
            OverdraftViewModel.Loaded.RepaymentSectionViewModel repaymentSection2 = loaded.getRepaymentSection();
            OverdraftFooter(repaymentSection2 != null ? repaymentSection2.buttonText : null, loaded.getFooterButtonText(), function1, gapComposer2, (i3 << 3) & 896);
            gapComposer2.end(r5);
            modifier2 = companion;
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 18, modifier2, loaded, function1);
        }
    }

    public static final void OverdraftDisabled(OverdraftViewModel.Loaded.DisabledViewModel disabledViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-407898755);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(disabledViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            String str = disabledViewModel.bodyText;
            if (str == null) {
                gapComposer.startReplaceGroup(-1921381275);
                gapComposer.end(false);
                z = true;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1921381274);
                companion = companion2;
                z = true;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f237lambda$1623708557, Expect_jvmKt.rememberComposableLambda(-2018112396, new TransfersViewKt$$ExternalSyntheticLambda5(str, 25), gapComposer), null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(disabledViewModel, modifier2, i, 16);
        }
    }

    public static final void OverdraftEligible(OverdraftViewModel.Loaded.EligibleViewModel eligibleViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1092068317);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(eligibleViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 24.0f);
            String str = eligibleViewModel.bodyText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, colors.semantic.text.subtle, (Composer) gapComposer, m298padding3ABfNKs, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(eligibleViewModel, modifier2, i, 15);
        }
    }

    public static final void OverdraftFooter(String str, String str2, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-166925536);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1309894306, new OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5(str2, str, function1), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda6(str, str2, function1, i, 0);
        }
    }

    public static final void OverdraftLimitsInfoSheet(BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1389861289);
        int i2 = (gapComposer.changedInstance(overdraftLimitsInfo) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            SheetKt.Sheet(function02, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1920735200, new BetterOverdraftViewKt$$ExternalSyntheticLambda9(overdraftLimitsInfo, i3), gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(overdraftLimitsInfo, function02, i, 14);
        }
    }

    public static final void OverdraftPermanentlyDisabled(OverdraftViewModel.Loaded.PermanentlyDisabledViewModel permanentlyDisabledViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1709985883);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(permanentlyDisabledViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            String str = permanentlyDisabledViewModel.bodyText;
            if (str == null) {
                gapComposer.startReplaceGroup(-1448763321);
                gapComposer.end(false);
                z = true;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1448763320);
                companion = companion2;
                z = true;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$158419665, Expect_jvmKt.rememberComposableLambda(1987626002, new TransfersViewKt$$ExternalSyntheticLambda5(str, 24), gapComposer), null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(permanentlyDisabledViewModel, modifier2, i, 13);
        }
    }

    public static final void OverdraftUsageCircle(BetterOverdraftViewModel.Loaded loaded, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2085473568);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 0.75f);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            gapComposer = gapComposer2;
            VisibleKt.m3497ProgressMeterUV7SVM(loaded.usageViewModel.usedPercent, Strings.getColors(gapComposer2).semantic.text.brand, 10.0f, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer2).semantic.border.subtle, 2.0f, 0L, ProgressMeter$CompletionBehavior.NONE, ProgressMeter$ZeroBehavior.HIDDEN, null, null, null, Expect_jvmKt.rememberComposableLambda(2077417711, new BankingDialogKt$$ExternalSyntheticLambda8(loaded, 13), gapComposer2), gapComposer, 113443200, MLKEMEngine.KyberPolyBytes, 3648);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(loaded, modifier, i, 10);
        }
    }

    public static final void OverdraftUsageMeter(OverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        float f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1243825431);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changedInstance(overdraftUsageViewModel) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            long j = Strings.getColors(gapComposer2).semantic.icon.brand;
            long j2 = Strings.getColors(gapComposer2).component.button.standard.background.f163default;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$15);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$16);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 4.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = gapComposer2.changedInstance(overdraftUsageViewModel) | gapComposer2.changed(j2) | gapComposer2.changed(j);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                f = 1.0f;
                PendingPaymentQueries$$ExternalSyntheticLambda12 pendingPaymentQueries$$ExternalSyntheticLambda12 = new PendingPaymentQueries$$ExternalSyntheticLambda12(overdraftUsageViewModel, j2, j);
                gapComposer2.updateRememberedValue(pendingPaymentQueries$$ExternalSyntheticLambda12);
                rememberedValue = pendingPaymentQueries$$ExternalSyntheticLambda12;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                f = 1.0f;
            }
            CanvasKt.Canvas(6, gapComposer2, m300paddingVpY3zN4$default, (Function1) rememberedValue);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion, 8.0f, gapComposer2, companion, f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            i2 = 16;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, overdraftUsageViewModel.amountUsed, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, overdraftUsageViewModel.limit, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            i2 = 16;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(overdraftUsageViewModel, modifier, i, i2);
        }
    }

    public static final void RecurringDepositsArcadeView(final RecurringDepositsViewModel recurringDepositsViewModel, final Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-230720347);
        int i2 = (gapComposer.changedInstance(recurringDepositsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(1164248701, new Function3() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Function1 function12 = function1;
                    RecurringDepositsViewModel recurringDepositsViewModel2 = recurringDepositsViewModel;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = recurringDepositsViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new TransfersView$$ExternalSyntheticLambda0(15, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1061465084, new BrandSheetViewKt$$ExternalSyntheticLambda6(21, function12), gapComposer2), gapComposer2, 1572912, 44);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                Countries.PageHeader(recurringDepositsViewModel2.title, ScreenScaffoldContentScope.markAsScaffoldTitle(gapComposer3, Modifier.Companion.$$INSTANCE), (Function2) null, Room.stringResource(gapComposer3, R.string.recurring_transfer_arcade_page_header_body), gapComposer3, 0, 4);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                final RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash = recurringDepositsViewModel2.balanceBasedAddCash;
                                if (balanceBasedAddCash == null) {
                                    gapComposer3.startReplaceGroup(270996290);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(270996291);
                                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(balanceBasedAddCash.state instanceof RecurringDepositsViewModel.BalanceBasedAddCash.State.Enabled ? re$$ExternalSyntheticOutline0.m(gapComposer3, -840821800, R.string.recurring_transfer_status_on, gapComposer3, false) : re$$ExternalSyntheticOutline0.m(gapComposer3, -840741324, R.string.recurring_transfer_status_set_up, gapComposer3, false), 2);
                                    ComposableLambdaImpl composableLambdaImpl = BankingDialogKt.f234lambda$1227555987;
                                    final Object[] objArr3 = objArr == true ? 1 : 0;
                                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1531413522, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = objArr3;
                                            RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash2 = balanceBasedAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(16, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, rememberComposableLambda, null, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(940408564, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = i6;
                                            RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash2 = balanceBasedAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, label, 0L, gapComposer3, 12582966, 3444);
                                    gapComposer3 = gapComposer3;
                                    gapComposer3.end(false);
                                }
                                final RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash = recurringDepositsViewModel2.scheduledAddCash;
                                if (scheduledAddCash == null) {
                                    gapComposer3.startReplaceGroup(271656063);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(271656064);
                                    CellDefaultAccessory.Label label2 = new CellDefaultAccessory.Label(scheduledAddCash.state instanceof RecurringDepositsViewModel.ScheduledAddCash.State.Enabled ? re$$ExternalSyntheticOutline0.m(gapComposer3, -991684607, R.string.recurring_transfer_status_on, gapComposer3, false) : re$$ExternalSyntheticOutline0.m(gapComposer3, -991604131, R.string.recurring_transfer_status_set_up, gapComposer3, false), 2);
                                    ComposableLambdaImpl composableLambdaImpl2 = BankingDialogKt.f239lambda$1791509912;
                                    final Object[] objArr4 = objArr2 == true ? 1 : 0;
                                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1385276871, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = objArr4;
                                            RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash2 = scheduledAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3);
                                    boolean changed3 = gapComposer3.changed(function12);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new TransfersView$$ExternalSyntheticLambda0(13, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    GapComposer gapComposer4 = gapComposer3;
                                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl2, rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(-1028838911, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = i6;
                                            RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash2 = scheduledAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer42 = (GapComposer) composer4;
                                                    if (gapComposer42.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, label2, 0L, gapComposer4, 12582966, 3444);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, Expect_jvmKt.rememberComposableLambda(736573415, new Function3() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Function1 function12 = function1;
                    RecurringDepositsViewModel recurringDepositsViewModel2 = recurringDepositsViewModel;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ColumnScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = recurringDepositsViewModel2.title;
                                NavigationType navigationType = NavigationType.BACK;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new TransfersView$$ExternalSyntheticLambda0(15, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1061465084, new BrandSheetViewKt$$ExternalSyntheticLambda6(21, function12), gapComposer2), gapComposer2, 1572912, 44);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            scrollingScaffoldContentScope.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                Countries.PageHeader(recurringDepositsViewModel2.title, ScreenScaffoldContentScope.markAsScaffoldTitle(gapComposer3, Modifier.Companion.$$INSTANCE), (Function2) null, Room.stringResource(gapComposer3, R.string.recurring_transfer_arcade_page_header_body), gapComposer3, 0, 4);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                                final RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash = recurringDepositsViewModel2.balanceBasedAddCash;
                                if (balanceBasedAddCash == null) {
                                    gapComposer3.startReplaceGroup(270996290);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(270996291);
                                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(balanceBasedAddCash.state instanceof RecurringDepositsViewModel.BalanceBasedAddCash.State.Enabled ? re$$ExternalSyntheticOutline0.m(gapComposer3, -840821800, R.string.recurring_transfer_status_on, gapComposer3, false) : re$$ExternalSyntheticOutline0.m(gapComposer3, -840741324, R.string.recurring_transfer_status_set_up, gapComposer3, false), 2);
                                    ComposableLambdaImpl composableLambdaImpl = BankingDialogKt.f234lambda$1227555987;
                                    final int objArr3 = objArr == true ? 1 : 0;
                                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1531413522, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = objArr3;
                                            RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash2 = balanceBasedAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(16, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, rememberComposableLambda, null, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(940408564, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = i6;
                                            RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash2 = balanceBasedAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, label, 0L, gapComposer3, 12582966, 3444);
                                    gapComposer3 = gapComposer3;
                                    gapComposer3.end(false);
                                }
                                final RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash = recurringDepositsViewModel2.scheduledAddCash;
                                if (scheduledAddCash == null) {
                                    gapComposer3.startReplaceGroup(271656063);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(271656064);
                                    CellDefaultAccessory.Label label2 = new CellDefaultAccessory.Label(scheduledAddCash.state instanceof RecurringDepositsViewModel.ScheduledAddCash.State.Enabled ? re$$ExternalSyntheticOutline0.m(gapComposer3, -991684607, R.string.recurring_transfer_status_on, gapComposer3, false) : re$$ExternalSyntheticOutline0.m(gapComposer3, -991604131, R.string.recurring_transfer_status_set_up, gapComposer3, false), 2);
                                    ComposableLambdaImpl composableLambdaImpl2 = BankingDialogKt.f239lambda$1791509912;
                                    final int objArr4 = objArr2 == true ? 1 : 0;
                                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1385276871, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = objArr4;
                                            RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash2 = scheduledAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer42 = (GapComposer) composer4;
                                                    if (gapComposer42.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3);
                                    boolean changed3 = gapComposer3.changed(function12);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new TransfersView$$ExternalSyntheticLambda0(13, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    GapComposer gapComposer4 = gapComposer3;
                                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl2, rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(-1028838911, new Function2() { // from class: com.squareup.cash.banking.views.RecurringDepositsViewKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i7 = i6;
                                            RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash2 = scheduledAddCash;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj4;
                                                    int intValue3 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer42 = (GapComposer) composer4;
                                                    if (gapComposer42.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.title, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj4;
                                                    int intValue4 = ((Integer) obj5).intValue();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, scheduledAddCash2.toggleDescription, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, label2, 0L, gapComposer4, 12582966, 3444);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RecurringDepositsViewKt$$ExternalSyntheticLambda0(recurringDepositsViewModel, function1, i, 2);
        }
    }

    public static final void RecurringDepositsFirstTimeUser(Modifier modifier, RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel, Function1 function1, Composer composer, int i) {
        RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel2;
        Function1 function12;
        Modifier modifier2;
        Icons icons;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        recurringDepositsFirstTimeUserViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1570951629);
        Applier applier = gapComposer.applier;
        int i2 = i | 6 | (gapComposer.changedInstance(recurringDepositsFirstTimeUserViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            float f = 16.0f;
            NavigationType navigationType = NavigationType.CLOSE;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TransfersView$$ExternalSyntheticLambda0(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, m302paddingqDBjuR0$default, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(new LayoutWeightElement(1.0f, false), 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(companion, 24.0f, gapComposer, companion, 1.0f), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = companion;
            ImageKt.Image(Countries.painterResource(R.drawable.recurring_deposits_illustration, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            boolean z2 = true;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion2, 24.0f, gapComposer);
            ViewfinderKt.HeroHeader(recurringDepositsFirstTimeUserViewModel.title, (Modifier) null, recurringDepositsFirstTimeUserViewModel.subtitle, (TextStyle) null, gapComposer, 0, 10);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion2, 36.0f));
            gapComposer.startReplaceGroup(-1043761477);
            for (RecurringDepositsFirstTimeUserViewModel.InfoSection infoSection : recurringDepositsFirstTimeUserViewModel.infoSections) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalScreenMargin;
                Modifier.Companion companion3 = companion2;
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value, RecyclerView.DECELERATION_RATE, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value, 32.0f, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 11);
                int ordinal = infoSection.icon.ordinal();
                if (ordinal == 0) {
                    icons = Icons.RecurringAutomatic24;
                } else {
                    if (ordinal != z2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.Edit24;
                }
                Icons icons2 = icons;
                GapComposer gapComposer2 = gapComposer;
                Trace.m1191Iconww6aTOc(icons2, (String) null, m302paddingqDBjuR0$default3, 0L, gapComposer2, 432, 8);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, companion3);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(new HorizontalAlignElement(horizontal), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2.0f, 7), Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, infoSection.title, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) new HorizontalAlignElement(horizontal), Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, infoSection.description, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                gapComposer.end(true);
                companion2 = companion3;
                z2 = true;
                arrangement$Top$1 = arrangement$Top$1;
                f = 16.0f;
            }
            modifier2 = companion2;
            boolean z3 = z2;
            gapComposer.end(false);
            gapComposer.end(z3);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(modifier2, 16.0f), 1.0f);
            boolean z4 = i3 == 256 ? z3 : false;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(12, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            recurringDepositsFirstTimeUserViewModel2 = recurringDepositsFirstTimeUserViewModel;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(866721230, new BankingDialogKt$$ExternalSyntheticLambda8(recurringDepositsFirstTimeUserViewModel2, 15), gapComposer), gapComposer, 1573296, 56);
            gapComposer.end(z3);
        } else {
            recurringDepositsFirstTimeUserViewModel2 = recurringDepositsFirstTimeUserViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(modifier2, recurringDepositsFirstTimeUserViewModel2, function12, i, 13);
        }
    }

    public static final void RecurringDepositsView(RecurringDepositsViewModel recurringDepositsViewModel, Function1 function1, Composer composer, int i) {
        recurringDepositsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-964905355);
        int i2 = (gapComposer.changedInstance(recurringDepositsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(229432832, new RecurringDepositsViewKt$$ExternalSyntheticLambda0(recurringDepositsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RecurringDepositsViewKt$$ExternalSyntheticLambda0(recurringDepositsViewModel, function1, i, 1);
        }
    }

    public static final void TransferDetailsSection(TransfersViewModel.WireTransferContent.Eligible eligible, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-549171718);
        int i2 = i | (gapComposer.changedInstance(eligible) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.wire_transfer_details_section_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str = eligible.legalName;
            if (str == null) {
                gapComposer.startReplaceGroup(-844044455);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-844044454);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$419663942, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-2057979008, new TransfersViewKt$$ExternalSyntheticLambda5(str, 26), gapComposer), null, 0L, null, null, gapComposer, 1572870, 1982);
                gapComposer.end(false);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1928817196, null, null, false, false, Expect_jvmKt.rememberComposableLambda(219350706, new TransfersViewKt$$ExternalSyntheticLambda28(eligible), gapComposer), null, 0L, null, null, gapComposer, 1572870, 1982);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransfersViewKt$$ExternalSyntheticLambda28(eligible, i);
        }
    }

    public static final void TransferRequirementsSection(int i, Composer composer, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1815736333);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.wire_transfer_requirements_section_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ListUnorderedItem((String) it.next(), Icons.BulletGeneric16, null, null, 12));
            }
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 3, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Transfers(TransfersViewModel transfersViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        TransfersViewModel transfersViewModel2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        NeverEqualPolicy neverEqualPolicy;
        Object rememberedValue;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-923729338);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(transfersViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            String stringResource = Room.stringResource(gapComposer, R.string.transfers_screen_title);
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z || rememberedValue2 == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(17, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            gapComposer = gapComposer;
            int i4 = 14;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            transfersViewModel2 = transfersViewModel;
            if (transfersViewModel2.wireTransferContent != null) {
                gapComposer.startReplaceGroup(208373212);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                int i5 = transfersViewModel2.tab.id;
                boolean z2 = i3 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z2) {
                    neverEqualPolicy = neverEqualPolicy2;
                } else {
                    neverEqualPolicy = neverEqualPolicy2;
                    if (rememberedValue3 != neverEqualPolicy) {
                        function12 = function1;
                        Function1 function13 = (Function1) rememberedValue3;
                        rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new AvatarsKt$$ExternalSyntheticLambda2(28);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        ModalKt.SegmentedControl(i5, function13, fillMaxWidth, (Function1) rememberedValue, gapComposer, 3456, 0);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                        CrossfadeKt.Crossfade(transfersViewModel2.tab, (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(1278037255, new BankingDialogKt$$ExternalSyntheticLambda2(i4, (Object) transfersViewModel2, function12), gapComposer), gapComposer, 24576, 14);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                }
                function12 = function1;
                rememberedValue3 = new AvatarsKt$$ExternalSyntheticLambda1(10, function12);
                gapComposer.updateRememberedValue(rememberedValue3);
                Function1 function132 = (Function1) rememberedValue3;
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                }
                ModalKt.SegmentedControl(i5, function132, fillMaxWidth, (Function1) rememberedValue, gapComposer, 3456, 0);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                CrossfadeKt.Crossfade(transfersViewModel2.tab, (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(1278037255, new BankingDialogKt$$ExternalSyntheticLambda2(i4, (Object) transfersViewModel2, function12), gapComposer), gapComposer, 24576, 14);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                function12 = function1;
                gapComposer.startReplaceGroup(209138695);
                BankTransferSegment(transfersViewModel2.bankTransferContent, function12, gapComposer, i3);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function12 = function1;
            transfersViewModel2 = transfersViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(transfersViewModel2, function12, i, 19);
        }
    }

    public static final void TurnOffOverdraftConfirmationSheet(BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet turnOffConfirmationSheet, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(661401617);
        int i2 = (gapComposer.changedInstance(turnOffConfirmationSheet) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SheetKt.Sheet(function02, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(114693786, new BetterOverdraftViewKt$$ExternalSyntheticLambda11(turnOffConfirmationSheet, function0), gapComposer), gapComposer, ((i2 >> 6) & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(turnOffConfirmationSheet, function0, function02, i, 11);
        }
    }

    public static final void WireTransferSegment(final TransfersViewModel.WireTransferContent wireTransferContent, Function1 function1, Composer composer, int i) {
        char c;
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1419533882);
        int i2 = (gapComposer.changedInstance(wireTransferContent) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
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
            boolean z3 = wireTransferContent instanceof TransfersViewModel.WireTransferContent.Deactivated;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3) {
                gapComposer.startReplaceGroup(-1587653213);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str = ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent).description;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1587484791);
                } else {
                    gapComposer.startReplaceGroup(-1587484790);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1516106870, new TransfersViewKt$$ExternalSyntheticLambda5(str, 0), gapComposer);
                }
                gapComposer.end(false);
                ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-872095751, new Function2() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        TransfersViewModel.WireTransferContent wireTransferContent2 = wireTransferContent;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent2).title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.wire_transfer_description), (Map) null, (Function1) null, false);
                                    String str2 = ((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent2).secondaryDescription;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(-1245764147);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1245764146);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1544160354, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = i3;
                        TransfersViewModel.WireTransferContent wireTransferContent2 = wireTransferContent;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str2 = ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent2).callToActionButtonText;
                                    if (str2 == null) {
                                        gapComposer2.startReplaceGroup(-1313569201);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1313569200);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str3 = ((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent2).callToActionButtonText;
                                    str3.getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.WireTransferContent.Eligible) wireTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean z4 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TransfersView$$ExternalSyntheticLambda0(18, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CardUpsellKt.CardUpsellLarge(rememberComposableLambda, rememberComposableLambda2, (Function0) rememberedValue, m300paddingVpY3zN4$default, composableLambdaImpl2, gapComposer, 54);
                gapComposer.end(false);
            } else if (wireTransferContent instanceof TransfersViewModel.WireTransferContent.Ineligible) {
                gapComposer.startReplaceGroup(-1587264473);
                final int i4 = 1;
                ViewfinderDefaults.SectionHeader(lambda$762386300, (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(-1787460992, new Function2() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i4;
                        TransfersViewModel.WireTransferContent wireTransferContent2 = wireTransferContent;
                        switch (i42) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent2).title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.wire_transfer_description), (Map) null, (Function1) null, false);
                                    String str2 = ((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent2).secondaryDescription;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(-1245764147);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1245764146);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 24582, 14);
                if (((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent).callToActionButtonText != null) {
                    gapComposer.startReplaceGroup(-1586887048);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean z5 = (i2 & 112) == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(19, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    final int i5 = 1;
                    z2 = false;
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m300paddingVpY3zN4$default2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-923632957, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i42 = i5;
                            TransfersViewModel.WireTransferContent wireTransferContent2 = wireTransferContent;
                            switch (i42) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        String str2 = ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent2).callToActionButtonText;
                                        if (str2 == null) {
                                            gapComposer2.startReplaceGroup(-1313569201);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1313569200);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String str3 = ((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent2).callToActionButtonText;
                                        str3.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.WireTransferContent.Eligible) wireTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573248, 56);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1586543010);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            } else {
                if (!(wireTransferContent instanceof TransfersViewModel.WireTransferContent.Eligible)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1298140310, false);
                }
                gapComposer.startReplaceGroup(-1586482281);
                ViewfinderDefaults.SectionHeader(lambda$772156861, (Modifier) null, (Function2) null, (Function0) null, f238lambda$1777690431, gapComposer, 24582, 14);
                ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                int i6 = i2 & 112;
                boolean z6 = i6 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z6 || rememberedValue3 == neverEqualPolicy) {
                    c = 20;
                    rememberedValue3 = new TransfersView$$ExternalSyntheticLambda0(20, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    c = 20;
                }
                final int i7 = 2;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, null, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-426087489, new Function3() { // from class: com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i42 = i7;
                        TransfersViewModel.WireTransferContent wireTransferContent2 = wireTransferContent;
                        switch (i42) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str2 = ((TransfersViewModel.WireTransferContent.Deactivated) wireTransferContent2).callToActionButtonText;
                                    if (str2 == null) {
                                        gapComposer2.startReplaceGroup(-1313569201);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1313569200);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str3 = ((TransfersViewModel.WireTransferContent.Ineligible) wireTransferContent2).callToActionButtonText;
                                    str3.getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.WireTransferContent.Eligible) wireTransferContent2).callToActionButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1573248, 58);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                TransfersViewModel.WireTransferContent.Eligible eligible = (TransfersViewModel.WireTransferContent.Eligible) wireTransferContent;
                TransferRequirementsSection(0, gapComposer, eligible.requirements);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                String stringResource = Room.stringResource(gapComposer, R.string.wire_transfer_different_account_notice);
                AccountDetailsContent accountDetailsContent = eligible.accountDetailsContent;
                boolean z7 = i6 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z7 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new TransfersView$$ExternalSyntheticLambda0(21, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                boolean z8 = i6 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z8 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new TransfersView$$ExternalSyntheticLambda0(27, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                AccountAndRoutingNumbersSection(stringResource, accountDetailsContent, function0, (Function0) rememberedValue5, gapComposer, 0);
                gapComposer = gapComposer;
                z = true;
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                TransferDetailsSection(eligible, gapComposer, i2 & 14);
                gapComposer.end(false);
                gapComposer.end(z);
            }
            z = true;
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(wireTransferContent, function1, i, 20);
        }
    }

    public static final void OverdraftFooter(BetterOverdraftViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(67408008);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-910919798, new BankingDialogKt$$ExternalSyntheticLambda2(12, (Object) loaded, function1), gapComposer), gapComposer, 24960, 11);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(loaded, function1, i, 11);
        }
    }
}
