package com.squareup.cash.bitcoin.views.deposits.copy;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.shadow.BlurKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.compose.CopyCheckIconState;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Function;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinAddressCopySheetViewKt {
    public static final ComposableLambdaImpl lambda$1348008411 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(29), false, 1348008411);

    /* renamed from: lambda$-432696881, reason: not valid java name */
    public static final ComposableLambdaImpl f260lambda$432696881 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(1), false, -432696881);
    public static final ComposableLambdaImpl lambda$967057319 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(21), false, 967057319);
    public static final ComposableLambdaImpl lambda$1994734046 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(22), false, 1994734046);

    public static final void AddressCopyContent(BitcoinDepositCopyViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1252284268);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
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
            String str = loaded.onChainAddressCopyText;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(-1656978063);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1656978062);
                String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_deposit_copy_bitcoin_network_title);
                boolean z = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(8, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                DepositCopyOption(lambda$967057319, stringResource, str, (Function0) rememberedValue, null, gapComposer, 6);
                gapComposer.end(false);
            }
            String str2 = loaded.lightningInvoiceCopyText;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1656640380);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1656640379);
                String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_deposit_copy_lightning_network_title);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(9, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                DepositCopyOption(lambda$1994734046, stringResource2, str2, (Function0) rememberedValue2, null, gapComposer, 6);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) loaded, function1, (Object) modifier2, i, 11);
        }
    }

    public static final void AddressCopyShimmer(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1709970726);
        int i2 = i | 6;
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
            AddressCopyShimmerItem(null, gapComposer, 0);
            AddressCopyShimmerItem(null, gapComposer, 0);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 9);
        }
    }

    public static final void AddressCopyShimmerItem(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1979531661);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, 76.0f, 1), 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ShimmerIcon(null, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(modifier2, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ShimmerLabel(null, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(modifier2, 4.0f));
            ShimmerSubtitle(null, gapComposer, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier2, i, 5);
        }
    }

    public static final void BitcoinAddressCopyContent(WalletAddressOptionsViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-41982140);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_wallet_address_sheet_title);
            CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress = content.walletAddress;
            BitcoinAddressCopyScaffold(stringResource, Expect_jvmKt.rememberComposableLambda(1124906115, new BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3(content, function1), gapComposer), Room.stringResource(gapComposer, R.string.bitcoin_address_disclaimer), Expect_jvmKt.rememberComposableLambda(-384679947, new BitcoinUiFactory$$ExternalSyntheticLambda12(19, (Object) content, function1), gapComposer), cryptoAddress$BitcoinAddress != null ? cryptoAddress$BitcoinAddress.address : null, gapComposer, 27696);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) content, function1, (Object) modifier2, i, 9);
        }
    }

    public static final void BitcoinAddressCopyErrorContent(WalletAddressOptionsViewModel.Error error, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2111461699);
        int i2 = (gapComposer.changedInstance(error) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        boolean z = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            BitcoinAddressCopyScaffold(Room.stringResource(gapComposer, R.string.bitcoin_wallet_address_sheet_title), Expect_jvmKt.rememberComposableLambda(1486216478, new BankingDialogKt$$ExternalSyntheticLambda8(error, 29), gapComposer), Room.stringResource(gapComposer, R.string.bitcoin_address_disclaimer), Expect_jvmKt.rememberComposableLambda(2010399852, new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z, 22), gapComposer), null, gapComposer, 224304);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) error, function1, (Object) modifier2, i, 8);
        }
    }

    public static final void BitcoinAddressCopyScaffold(String str, ComposableLambdaImpl composableLambdaImpl, String str2, ComposableLambdaImpl composableLambdaImpl2, String str3, Composer composer, int i) {
        String str4;
        int i2;
        ComposableLambdaImpl composableLambdaImpl3;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1026209027);
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (gapComposer.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 74899) != 74898)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            int i5 = i4 >> 6;
            Transformations.SheetHeader(str4, (Modifier) null, (Function2) null, str3, gapComposer, (i4 & 14) | (i5 & 7168), 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            composableLambdaImpl.invoke(ColumnScopeInstance.INSTANCE, gapComposer, Integer.valueOf((i4 & 112) | 6));
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            if (str2 != null) {
                gapComposer.startReplaceGroup(606842545);
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
                long j = Strings.getColors(gapComposer).semantic.text.subtle;
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                z = true;
                Room.m1165Text25TpFw(0, 0, 0, 3, i5 & 14, 0, 3824, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(607148143);
                gapComposer.end(false);
            }
            composableLambdaImpl3 = composableLambdaImpl2;
            Recorder$$ExternalSyntheticOutline2.m((i4 >> 9) & 14, composableLambdaImpl3, gapComposer, z);
        } else {
            composableLambdaImpl3 = composableLambdaImpl2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(str, composableLambdaImpl, str2, composableLambdaImpl3, str3, i);
        }
    }

    public static final void BitcoinDepositCopyContent(BitcoinDepositCopyViewModel bitcoinDepositCopyViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-10658214);
        int i2 = i | (gapComposer.changedInstance(bitcoinDepositCopyViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            long j = Strings.getColors(gapComposer).component.sheet.background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), null, 3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.bitcoin_deposit_copy_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.bitcoin_deposit_copy_description), gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (bitcoinDepositCopyViewModel instanceof BitcoinDepositCopyViewModel.Error) {
                gapComposer.startReplaceGroup(1118766144);
                gapComposer.end(false);
            } else if (bitcoinDepositCopyViewModel instanceof BitcoinDepositCopyViewModel.Loaded) {
                gapComposer.startReplaceGroup(-379550542);
                AddressCopyContent((BitcoinDepositCopyViewModel.Loaded) bitcoinDepositCopyViewModel, function1, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                if (!Intrinsics.areEqual(bitcoinDepositCopyViewModel, BitcoinDepositCopyViewModel.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -379553691, false);
                }
                gapComposer.startReplaceGroup(-379548892);
                AddressCopyShimmer(null, gapComposer, 0);
                gapComposer.end(false);
            }
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_address_disclaimer);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            long j2 = Strings.getColors(gapComposer).semantic.text.subtle;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j2, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) bitcoinDepositCopyViewModel, function1, (Object) modifier2, i, 10);
        }
    }

    public static final void DepositCopyError(BitcoinDepositCopyViewModel.Error error, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-276913280);
        int i4 = i | (gapComposer.changedInstance(error) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier4, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            String str = error.errorTitle;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Modifier modifier5 = modifier4;
            int i6 = i3;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = error.errorMessage;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i6 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(7, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-292901038, new SsnViewKt$$ExternalSyntheticLambda2(error, 2), gapComposer), gapComposer, 1573248, 58);
            gapComposer = gapComposer;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(error, function12, modifier3, i, i2, 18);
        }
    }

    public static final void DepositCopyOption(ComposableLambdaImpl composableLambdaImpl, String str, String str2, Function0 function0, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1017794951);
        int i2 = i | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changed(str2) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | 24576;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Object obj2 = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new CopyCheckIconState();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CopyCheckIconState copyCheckIconState = (CopyCheckIconState) rememberedValue2;
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer2.changedInstance(obj2) | gapComposer2.changedInstance(copyCheckIconState);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == obj) {
                rememberedValue3 = new CopyCodeKt$$ExternalSyntheticLambda4(10, function0, obj2, copyCheckIconState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue3, 15);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m183clickableoSLSa3U$default);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function02);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-56660416, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 8), gapComposer2), Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), null, null, false, false, Expect_jvmKt.rememberComposableLambda(1001309126, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, 7), gapComposer2), null, null, 0L, null, gapComposer2, 12582966, 0, 3960);
            gapComposer = gapComposer2;
            String stringResource = Room.stringResource(gapComposer, R.string.copy_address_click_label);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            modifier2 = companion;
            BlurKt.CopyCheckIcon(SpacerKt.m302paddingqDBjuR0$default(modifier2, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 9), copyCheckIconState, stringResource, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4((Object) composableLambdaImpl, (Object) str, (Object) str2, (Function) function0, modifier2, i, 11);
        }
    }

    /* renamed from: DepositCopyOptionIcon-eaDK9VM, reason: not valid java name */
    public static final void m3416DepositCopyOptionIconeaDK9VM(Icons icons, Modifier modifier, long j, long j2, Composer composer, int i) {
        Modifier modifier2;
        long j3;
        long j4;
        long j5;
        long j6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(469607559);
        int i2 = i | 1200;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j7 = colors.semantic.service.bitcoinBackground;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j8 = colors2.semantic.icon.inverse;
                modifier2 = Modifier.Companion.$$INSTANCE;
                j5 = j8;
                j6 = j7;
            } else {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                j6 = j;
                j5 = j2;
            }
            gapComposer.endDefaults();
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(modifier2, 48.0f), j6, RoundedCornerShapeKt.CircleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j5, gapComposer, 54, 4);
            gapComposer.end(true);
            j3 = j6;
            j4 = j5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j3 = j;
            j4 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxToolTipViewKt$$ExternalSyntheticLambda1(icons, modifier2, j3, j4, i);
        }
    }

    public static final void ShimmerIcon(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1418564832);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-2012324975, new AvatarsKt$$ExternalSyntheticLambda0(27), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 7);
        }
    }

    public static final void ShimmerLabel(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-700296427);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-1926991676, new AvatarsKt$$ExternalSyntheticLambda0(26), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 6);
        }
    }

    public static final void ShimmerSubtitle(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1421725119);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(-1474683472, new AvatarsKt$$ExternalSyntheticLambda0(28), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 8);
        }
    }

    /* renamed from: convertTextUnitToDp-o2QH7mI, reason: not valid java name */
    public static final float m3417convertTextUnitToDpo2QH7mI(long j, GapComposer gapComposer) {
        float f;
        float m1059getValueimpl;
        float fontScale;
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            m1059getValueimpl = TextUnit.m1059getValueimpl(j);
            fontScale = density.getDensity();
        } else {
            if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
                f = RecyclerView.DECELERATION_RATE;
                return density.mo232toDpu2uoSUM(f);
            }
            m1059getValueimpl = TextUnit.m1059getValueimpl(j);
            fontScale = density.getFontScale();
        }
        f = fontScale * m1059getValueimpl;
        return density.mo232toDpu2uoSUM(f);
    }
}
