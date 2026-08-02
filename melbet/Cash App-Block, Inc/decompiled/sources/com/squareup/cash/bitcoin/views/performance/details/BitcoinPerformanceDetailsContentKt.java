package com.squareup.cash.bitcoin.views.performance.details;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.StatefulReactionButtonKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda8;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.TakeUntilKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinPerformanceDetailsContentKt {
    static {
        new BitcoinPerformanceDetailsContentViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection[]{new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection("Total", CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem[]{new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("Current value", "$100.00", "Current value", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem()), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("All time returns", "+$20.00", "All time returns", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem()), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("All time return %", "10%", "All time return %", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem())})), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection("In", CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem[]{new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("Purchases", "$400.00", "Purchases", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem()), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("Deposits", "$100.00", "Deposits", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem())})), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection("Out", CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem[]{new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("Sales", "$200.00", "Sales", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem()), new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem("Withdrawals", "$50.00", "Withdrawals", new BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem())}))}), "This information is not to be used for tax purposes. Please see [terms](https://www.google.com) for more details.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BitcoinPerformanceDetailsContent(final BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel, final Function1 function1, final Function2 function2, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        GapComposer gapComposer;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        Pair pair;
        boolean z4;
        bitcoinPerformanceDetailsContentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1988721465);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(bitcoinPerformanceDetailsContentViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                if (i4 != 0) {
                    z2 = false;
                }
                if (z2) {
                    gapComposer2.startReplaceGroup(-1221972169);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Color color = new Color(colors.semantic.text.disabled);
                    Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    pair = new Pair(color, new Color(colors2.semantic.icon.disabled));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1221867079);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Color color2 = new Color(colors3.semantic.text.standard);
                    Colors colors4 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    pair = new Pair(color2, new Color(colors4.semantic.icon.subtle));
                    gapComposer2.end(false);
                }
                final long j = ((Color) pair.first).value;
                final long j2 = ((Color) pair.second).value;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                boolean changed = ((i3 & 14) == 4) | ((57344 & i3) == 16384) | ((i3 & 112) == 32) | gapComposer2.changed(j) | gapComposer2.changed(j2) | ((i3 & 896) == 256);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    final boolean z5 = z2;
                    Function1 function12 = new Function1() { // from class: com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LazyListScope lazyListScope = (LazyListScope) obj;
                            lazyListScope.getClass();
                            if (z5) {
                                LazyListScope.item$default(lazyListScope, null, null, BitcoinPerformanceDetailsViewKt.lambda$757845495, 3);
                            }
                            LazyListScope.item$default(lazyListScope, null, null, BitcoinPerformanceDetailsViewKt.f271lambda$2013748196, 3);
                            BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel2 = bitcoinPerformanceDetailsContentViewModel;
                            Iterator it = bitcoinPerformanceDetailsContentViewModel2.sections.iterator();
                            while (it.hasNext()) {
                                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda2((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection) it.next(), function1, j, j2), true, 1818598030), 3);
                            }
                            String str = bitcoinPerformanceDetailsContentViewModel2.footer;
                            if (str != null) {
                                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new StatefulReactionButtonKt$$ExternalSyntheticLambda11(str, function2), true, 2115352316), 3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    z4 = z5;
                    gapComposer2.updateRememberedValue(function12);
                    rememberedValue = function12;
                } else {
                    z4 = z2;
                }
                gapComposer = gapComposer2;
                LazyDslKt.LazyColumn(fillMaxWidth, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 510);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(bitcoinPerformanceDetailsContentViewModel, function1, function2, modifier, z3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BitcoinPerformanceDetailsContentFooter(String str, Function2 function2, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1523945819);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function2) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, function2, null, textStyle, colors.semantic.text.subtle, null, null, null, 0, 0, 3, gapComposer2, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 996);
            gapComposer = gapComposer2;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(str, function2, modifier, i, 21);
        }
    }

    /* renamed from: BitcoinPerformanceDetailsSection-t6yy7ic, reason: not valid java name */
    public static final void m3419BitcoinPerformanceDetailsSectiont6yy7ic(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection bitcoinPerformanceDetailsSection, Function1 function1, long j, long j2, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1410953221);
        int i2 = i | (gapComposer2.changed(bitcoinPerformanceDetailsSection) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(j) ? 256 : 128) | (gapComposer2.changed(j2) ? 2048 : 1024) | 24576;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            String str = bitcoinPerformanceDetailsSection.sectionTitle;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1296026965, new BitcoinPerformanceDetailsContentKt$$ExternalSyntheticLambda2(bitcoinPerformanceDetailsSection, j, function1, j2), gapComposer2);
            gapComposer = gapComposer2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            TakeUntilKt.WidgetSectionView(str, companion, null, null, rememberComposableLambda, gapComposer, 196656, 28);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda8(bitcoinPerformanceDetailsSection, function1, j, j2, modifier2, i);
        }
    }

    /* renamed from: BitcoinPerformanceDetailsSectionLabel-eopBjH0, reason: not valid java name */
    public static final void m3420BitcoinPerformanceDetailsSectionLabeleopBjH0(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem, long j, long j2, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1012577091);
        int i2 = i | (gapComposer.changed(bitcoinPerformanceDetailsSectionItem) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 << 6) & 7168, 0, 4086, j, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinPerformanceDetailsSectionItem.label, (Map) null, (Function1) null, false);
            if (bitcoinPerformanceDetailsSectionItem.infoItem != null) {
                gapComposer.startReplaceGroup(-2029865530);
                Icons icons = Icons.InformationFill16;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m302paddingqDBjuR0$default(m285size3ABfNKs, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), j2, gapComposer, ((i2 << 3) & 7168) | 54, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2029654885);
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
            endRestartGroup.block = new TaxToolTipViewKt$$ExternalSyntheticLambda1(bitcoinPerformanceDetailsSectionItem, j, j2, modifier2, i, 4);
        }
    }

    public static final void StaleDataHeader(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1097732074);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_performance_details_stale_label);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors.semantic.text.disabled, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier2, i, 11);
        }
    }
}
