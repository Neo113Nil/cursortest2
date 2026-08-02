package com.squareup.cash.bitcoin.views.exchange;

import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import string.TrimMode;

/* loaded from: classes5.dex */
public abstract class BitcoinExchangeViewKt {
    public static final ComposableLambdaImpl lambda$1822452600 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(2), false, 1822452600);
    public static final ComposableLambdaImpl lambda$1542626061 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(3), false, 1542626061);
    public static final ComposableLambdaImpl lambda$717609880 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(27), false, 717609880);

    /* renamed from: lambda$-455661375, reason: not valid java name */
    public static final ComposableLambdaImpl f261lambda$455661375 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(28), false, -455661375);
    public static final ComposableLambdaImpl lambda$1041784736 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(29), false, 1041784736);
    public static final ComposableLambdaImpl lambda$746500205 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(4), false, 746500205);
    public static final ComposableLambdaImpl lambda$1817449382 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(5), false, 1817449382);

    public static final void BitcoinExchangeAtmPicker(BitcoinTransferViewModel.Content.BottomSheetContent bottomSheetContent, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        GapComposer gapComposer;
        Modifier modifier3;
        bottomSheetContent.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(355898568);
        int i4 = i | (gapComposer2.changedInstance(bottomSheetContent) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer2.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Function0 function0 = null;
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
            OrderHeader(bottomSheetContent.title, bottomSheetContent.subtitle, bottomSheetContent.orderTypeButtonVisible, function1, gapComposer2, (i3 << 6) & 7168);
            function12 = function1;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            List list = bottomSheetContent.amountSelections;
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(16, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            TrimMode.AtmPickerGrid(0, 0, gapComposer2, m300paddingVpY3zN4$default, list, (Function1) rememberedValue);
            gapComposer = gapComposer2;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            InstrumentCellViewModel instrumentCellViewModel = bottomSheetContent.instrumentCellViewModel;
            if (instrumentCellViewModel == null) {
                gapComposer.startReplaceGroup(1441804526);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1441804527);
                if (bottomSheetContent.instrumentCellEnabled) {
                    gapComposer.startReplaceGroup(776554192);
                    boolean z2 = i6 == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(10, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    function0 = (Function0) rememberedValue2;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(776620656);
                    gapComposer.end(false);
                }
                InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, null, null, function0, gapComposer, 0, 13);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(bottomSheetContent, function12, modifier3, i, i2, 19);
        }
    }

    public static final void BitcoinExchangeContent(BitcoinTransferViewModel bitcoinTransferViewModel, Function1 function1, RealImageLoader realImageLoader, BitcoinTransferScreen bitcoinTransferScreen, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-758887664);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinTransferViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(bitcoinTransferScreen) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).fontScale;
            boolean changed = gapComposer.changed(bitcoinTransferScreen) | gapComposer.changed(f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Integer.valueOf(((bitcoinTransferScreen.isBuy || !(bitcoinTransferScreen.orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder)) ? 479 : 519) + ((int) (((f - 1.0f) * 8.0f) / 0.15f)));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
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
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-344405093, new SetPinViewKt$$ExternalSyntheticLambda3(realImageLoader, bitcoinTransferViewModel, function1, intValue, 12), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(bitcoinTransferViewModel, function1, realImageLoader, bitcoinTransferScreen, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BitcoinExchangeKeypadAmountPicker(BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent, AmountDisplayState amountDisplayState, Shaker shaker, Function1 function1, Modifier modifier, Function3 function3, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1 function12;
        BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent2;
        Modifier modifier3;
        GapComposer gapComposer;
        Function3 function32;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        Object maxCentsCappedKeypadListener;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        NavigationType navigationType;
        Modifier modifier4;
        BiasAlignment.Horizontal horizontal;
        float f;
        int i7;
        NeverEqualPolicy neverEqualPolicy;
        int i8;
        float f2;
        int i9;
        boolean z3;
        fullScreenContent.getClass();
        shaker.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-484205232);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(fullScreenContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(amountDisplayState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(shaker) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                i3 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.unsupportedVersion : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier modifier5 = i10 != 0 ? companion : modifier2;
                    Function3 function33 = i4 != 0 ? null : function3;
                    boolean z4 = i5 != 0 ? false : z;
                    RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
                    Money money = fullScreenContent.maxAmount;
                    BitcoinTransferViewModel.Content.Subtitle subtitle = fullScreenContent.subtitle;
                    Long l = money.amount;
                    l.getClass();
                    long longValue = l.longValue();
                    boolean changed = ((i3 & 112) == 32) | gapComposer2.changed(longValue) | gapComposer2.changed(realCashVibrator) | gapComposer2.changed(shaker);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        i6 = i3;
                        maxCentsCappedKeypadListener = new MaxCentsCappedKeypadListener(new AmountDisplayKeypadListener(amountDisplayState), amountDisplayState, longValue, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker, 2));
                        gapComposer2.updateRememberedValue(maxCentsCappedKeypadListener);
                    } else {
                        maxCentsCappedKeypadListener = rememberedValue;
                        i6 = i3;
                    }
                    MaxCentsCappedKeypadListener maxCentsCappedKeypadListener2 = (MaxCentsCappedKeypadListener) maxCentsCappedKeypadListener;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier5);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    int ordinal = fullScreenContent.navigationType.ordinal();
                    if (ordinal != 0) {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        navigationType = NavigationType.BACK;
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        navigationType = NavigationType.CLOSE;
                    }
                    int i11 = i6 & 7168;
                    NavigationType navigationType2 = navigationType;
                    boolean z5 = i11 == 2048;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    int i12 = i6;
                    if (z5 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier modifier6 = modifier5;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, function33, gapComposer2, ((i12 << 3) & 3670016) | 6, 44);
                    Function3 function34 = function33;
                    if (((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).getFontScale() < 1.5f) {
                        gapComposer2.startReplaceGroup(1182808767);
                        modifier4 = null;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                        gapComposer2.end(false);
                    } else {
                        modifier4 = null;
                        gapComposer2.startReplaceGroup(1182848168);
                        gapComposer2.end(false);
                    }
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(29);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue3);
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$16);
                    Modifier modifier7 = modifier4;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, fullScreenContent.title, (Map) null, (Function1) null, false);
                    if (subtitle == null) {
                        gapComposer2.startReplaceGroup(-1082742828);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1082742827);
                        Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer2), companion, 4.0f, gapComposer2);
                        BitcoinExchangeSubtitleKt.m3418BitcoinExchangeSubtitle5stqomU(subtitle, subtitle.icon == BitcoinTransferViewModel.Content.Icon.RECURRING ? 1 : 3, gapComposer2, 0, 0);
                        gapComposer2.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, modifier7);
                    if (fullScreenContent.orderTypeButtonVisible) {
                        gapComposer2.startReplaceGroup(-1082344446);
                        boolean z6 = i11 == 2048;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (z6 || rememberedValue4 == neverEqualPolicy2) {
                            rememberedValue4 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(16, function1);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        horizontal = horizontal2;
                        i7 = i11;
                        f = 1.0f;
                        coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue4, null, false, null, lambda$1542626061, gapComposer2, 24576, 14);
                        gapComposer2.end(false);
                    } else {
                        horizontal = horizontal2;
                        f = 1.0f;
                        i7 = i11;
                        gapComposer2.startReplaceGroup(-1082133026);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    SpacerKt.Spacer(gapComposer2, columnScopeInstance.weight(f, companion, true));
                    Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, f), shaker);
                    Strings.getSizes(gapComposer2).getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(shakeWith, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(1);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue5), Strings.getColors(gapComposer2).semantic.text.prominent, Room.getSp(96), 0, 0, gapComposer2, ((i12 >> 3) & 14) | 3072, 48);
                    GapComposer gapComposer3 = gapComposer2;
                    SpacerKt.Spacer(gapComposer3, columnScopeInstance.weight(f, companion, true));
                    int i13 = 17;
                    if (z4) {
                        gapComposer3.startReplaceGroup(1184400958);
                        f2 = RecyclerView.DECELERATION_RATE;
                        Modifier align = columnScopeInstance.align(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), horizontal);
                        i8 = i7;
                        i9 = 2048;
                        boolean z7 = i8 == 2048;
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        neverEqualPolicy = neverEqualPolicy2;
                        if (z7 || rememberedValue6 == neverEqualPolicy) {
                            function12 = function1;
                            rememberedValue6 = new AvatarsKt$$ExternalSyntheticLambda1(i13, function12);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        } else {
                            function12 = function1;
                        }
                        FilterBarKt.FilterBar(align, null, null, (Function1) rememberedValue6, gapComposer3, 0, 6);
                        gapComposer3 = gapComposer3;
                        Strings.getSizes(gapComposer3).getClass();
                        SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 16.0f));
                        gapComposer3.end(false);
                    } else {
                        function12 = function1;
                        neverEqualPolicy = neverEqualPolicy2;
                        i8 = i7;
                        f2 = RecyclerView.DECELERATION_RATE;
                        i9 = 2048;
                        gapComposer3.startReplaceGroup(1185333128);
                        gapComposer3.end(false);
                    }
                    boolean changedInstance = gapComposer3.changedInstance(maxCentsCappedKeypadListener2);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ErrorView$$ExternalSyntheticLambda0(maxCentsCappedKeypadListener2, 19);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function0 = (Function0) rememberedValue7;
                    boolean changedInstance2 = gapComposer3.changedInstance(maxCentsCappedKeypadListener2);
                    Object rememberedValue8 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new BadgeQueries$$ExternalSyntheticLambda5(maxCentsCappedKeypadListener2, 15);
                        gapComposer3.updateRememberedValue(rememberedValue8);
                    }
                    KeypadViewModel keypadViewModel = new KeypadViewModel(null, false, function0, (Function1) rememberedValue8, 3);
                    long j = Strings.getColors(gapComposer3).semantic.text.standard;
                    Strings.getSizes(gapComposer3).getClass();
                    RelationUtil.m1189KeypadViewww6aTOc(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, f2, 2), keypadViewModel, null, j, gapComposer3, 0, 4);
                    fullScreenContent2 = fullScreenContent;
                    InstrumentCellViewModel instrumentCellViewModel = fullScreenContent2.instrumentCellViewModel;
                    if (instrumentCellViewModel == null) {
                        gapComposer3.startReplaceGroup(1185864839);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1185864840);
                        Function0 function02 = null;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                        if (fullScreenContent2.instrumentCellEnabled) {
                            gapComposer3.startReplaceGroup(2061158208);
                            boolean z8 = i8 == i9;
                            Object rememberedValue9 = gapComposer3.rememberedValue();
                            if (z8 || rememberedValue9 == neverEqualPolicy) {
                                rememberedValue9 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(17, function12);
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            z3 = false;
                            gapComposer3.end(false);
                            function02 = (Function0) rememberedValue9;
                        } else {
                            z3 = false;
                            gapComposer3.startReplaceGroup(2061224672);
                            gapComposer3.end(false);
                        }
                        InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, null, null, function02, gapComposer3, 0, 13);
                        gapComposer3.end(z3);
                    }
                    gapComposer3.end(true);
                    gapComposer = gapComposer3;
                    z2 = z4;
                    modifier3 = modifier6;
                    function32 = function34;
                } else {
                    function12 = function1;
                    fullScreenContent2 = fullScreenContent;
                    gapComposer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    gapComposer = gapComposer2;
                    function32 = function3;
                    z2 = z;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(fullScreenContent2, amountDisplayState, shaker, function12, modifier3, function32, z2, i, i2);
                    return;
                }
                return;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OrderHeader(String str, BitcoinTransferViewModel.Content.Subtitle subtitle, boolean z, Function1 function1, Composer composer, int i) {
        String str2;
        int i2;
        GapComposer gapComposer;
        BitcoinTransferViewModel.Content.Subtitle subtitle2 = subtitle;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1792965627);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(subtitle2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(28);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i3 = i2;
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
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).header;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            if (subtitle == null) {
                gapComposer.startReplaceGroup(1010307439);
                gapComposer.end(false);
                subtitle2 = subtitle;
            } else {
                gapComposer.startReplaceGroup(1010307440);
                Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 4.0f, gapComposer);
                subtitle2 = subtitle;
                BitcoinExchangeSubtitleKt.m3418BitcoinExchangeSubtitle5stqomU(subtitle2, 0, gapComposer, 0, 2);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            if (z) {
                gapComposer.startReplaceGroup(1010504321);
                boolean z2 = (i3 & 7168) == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue2, null, false, null, lambda$1822452600, gapComposer, 24576, 14);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1010706131);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(str, subtitle2, z, function1, i, 11);
        }
    }

    public static final String amountString(AmountSelection.HasAmount hasAmount) {
        return (hasAmount.getAmount() % 100 == 0 ? Long.valueOf(hasAmount.getAmount() / 100) : Float.valueOf(hasAmount.getAmount() / 100.0f)).toString();
    }
}
