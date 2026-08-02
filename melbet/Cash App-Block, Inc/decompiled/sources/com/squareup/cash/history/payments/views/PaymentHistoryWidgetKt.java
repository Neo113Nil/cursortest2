package com.squareup.cash.history.payments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.charting.components.BarChart$Configuration;
import com.squareup.cash.charting.components.BarChart$Direction;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda6;
import com.squareup.cash.history.payments.viewmodels.BarColorState;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfileTransactionsBarViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PaymentHistoryWidgetKt {

    /* renamed from: lambda$-1221205865, reason: not valid java name */
    public static final ComposableLambdaImpl f429lambda$1221205865 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(7), false, -1221205865);

    public static final void EmptyState(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1109934577);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.profile_payment_history_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, f429lambda$1221205865, gapComposer, 196992, 27);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda1(i, 5);
        }
    }

    public static final void PaymentHistoryWidgetView(ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        profilePaymentHistoryViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1388251617);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(profilePaymentHistoryViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            if (profilePaymentHistoryViewModel instanceof ProfilePaymentHistoryViewModel.Data) {
                gapComposer.startReplaceGroup(-1156714152);
                AvatarsKt.ActivityEmbeddedView(((ProfilePaymentHistoryViewModel.Data) profilePaymentHistoryViewModel).activityEmbeddedViewModel, null, Expect_jvmKt.rememberComposableLambda(-783399701, new MoneyTabBookletKt$$ExternalSyntheticLambda4(9, function1, profilePaymentHistoryViewModel), gapComposer), null, null, gapComposer, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                gapComposer.end(false);
            } else {
                if (!profilePaymentHistoryViewModel.equals(ProfilePaymentHistoryViewModel.Empty.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1902347403, false);
                }
                gapComposer.startReplaceGroup(1902388131);
                EmptyState(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) profilePaymentHistoryViewModel, function1, modifier2, i, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileTransactionsBar(ProfileTransactionsBarViewModel profileTransactionsBarViewModel, Composer composer, int i) {
        long j;
        int ordinal;
        Colors colors;
        long j2;
        int ordinal2;
        Colors colors2;
        long j3;
        boolean z;
        char c;
        char c2;
        char c3;
        char c4;
        long j4;
        char c5;
        char c6;
        int ordinal3;
        Colors colors3;
        long j5;
        Colors colors4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1174769533);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(profileTransactionsBarViewModel) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BarColorState barColorState = profileTransactionsBarViewModel.transactionBarColor;
            float f = profileTransactionsBarViewModel.percentageFilled;
            barColorState.getClass();
            int ordinal4 = barColorState.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 == 1 || ordinal4 == 2) {
                    gapComposer.startReplaceGroup(939920872);
                    gapComposer.end(false);
                    j = Color.Transparent;
                } else if (ordinal4 != 3) {
                    if (ordinal4 == 4) {
                        gapComposer.startReplaceGroup(939926187);
                        Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors5.semantic.background.extraProminent;
                        gapComposer.end(false);
                    } else if (ordinal4 != 5) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 939919464, false);
                    }
                }
                long j6 = j;
                ordinal = barColorState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        gapComposer.startReplaceGroup(-2006502826);
                        Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j2 = colors6.semantic.text.disabled;
                        gapComposer.end(false);
                    } else if (ordinal != 2) {
                        if (ordinal == 3 || ordinal == 4) {
                            gapComposer.startReplaceGroup(-2006496845);
                            Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors7 == null) {
                                colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j2 = colors7.semantic.background.brand;
                            gapComposer.end(false);
                        } else if (ordinal != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2006504591, false);
                        }
                    }
                    long j7 = j2;
                    float f2 = (f > RecyclerView.DECELERATION_RATE || f >= 1.0f) ? 0.0f : 2.0f;
                    ordinal2 = barColorState.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            gapComposer.startReplaceGroup(324776299);
                            gapComposer.end(false);
                            j3 = Color.Transparent;
                        } else if (ordinal2 == 2) {
                            gapComposer.startReplaceGroup(324778478);
                            Colors colors8 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors8 == null) {
                                colors8 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors8.semantic.background.extraProminent;
                            gapComposer.end(false);
                        } else if (ordinal2 != 3 && ordinal2 != 4 && ordinal2 != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 324775369, false);
                        }
                        long j8 = j3;
                        BarChart$Direction barChart$Direction = BarChart$Direction.HORIZONTAL;
                        BarChart$Configuration barChart$Configuration = new BarChart$Configuration(j6, j7, j8, f2, profileTransactionsBarViewModel.shouldReverseDirection, 128);
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier != null) {
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
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 6);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
                        String str = profileTransactionsBarViewModel.totalReceived;
                        long arcadeAmountLabelColor = arcadeAmountLabelColor(barColorState, gapComposer);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, arcadeAmountLabelColor, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, arcadeAmountLabelColor(barColorState, gapComposer), (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).sectionTitle, (TextLineBalancing) null, profileTransactionsBarViewModel.totalSent, (Map) null, (Function1) null, false);
                        gapComposer.end(true);
                        BarChartKt.BasicBarChart(SizeKt.m277height3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1), 12.0f), f, barChart$Configuration, gapComposer, 6);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 6);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        String stringResource = Room.stringResource(gapComposer, R.string.profile_payment_history_arcade_total_received);
                        int ordinal5 = barColorState.ordinal();
                        if (ordinal5 != 0) {
                            c = 2;
                            if (ordinal5 == 1 || ordinal5 == 2) {
                                z = false;
                                c2 = 3;
                                c3 = 4;
                                c4 = 5;
                                gapComposer.startReplaceGroup(-1806706235);
                                Colors colors9 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                c6 = 52446;
                                if (colors9 == null) {
                                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                    c5 = 51733;
                                } else {
                                    c5 = 51733;
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j4 = colors9.semantic.text.disabled;
                                gapComposer.end(false);
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j4, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                String stringResource2 = Room.stringResource(gapComposer, R.string.profile_payment_history_arcade_total_sent);
                                ordinal3 = barColorState.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            if (ordinal3 != 3) {
                                                if (ordinal3 != 4 && ordinal3 != 5) {
                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1229173716, false);
                                                }
                                            }
                                        }
                                    }
                                    gapComposer.startReplaceGroup(-1229171282);
                                    Colors colors10 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors10 == null) {
                                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(false);
                                    }
                                    j5 = colors10.semantic.text.disabled;
                                    gapComposer.end(false);
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j5, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                                    gapComposer.end(true);
                                    gapComposer.end(true);
                                }
                                gapComposer.startReplaceGroup(-1229167892);
                                colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors3 != null) {
                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j5 = colors3.semantic.text.subtle;
                                gapComposer.end(false);
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j5, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                                gapComposer.end(true);
                                gapComposer.end(true);
                            } else {
                                c2 = 3;
                                if (ordinal5 != 3) {
                                    c3 = 4;
                                    if (ordinal5 != 4) {
                                        c4 = 5;
                                        if (ordinal5 != 5) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1806708541, false);
                                        }
                                        z = false;
                                        c6 = 52446;
                                        c5 = 51733;
                                        gapComposer.startReplaceGroup(-1806702717);
                                        colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                                        } else {
                                            gapComposer.startReplaceGroup(-1762997739);
                                            gapComposer.end(z);
                                        }
                                        j4 = colors4.semantic.text.subtle;
                                        gapComposer.end(z);
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j4, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                        String stringResource22 = Room.stringResource(gapComposer, R.string.profile_payment_history_arcade_total_sent);
                                        ordinal3 = barColorState.ordinal();
                                        if (ordinal3 != 0) {
                                        }
                                        gapComposer.startReplaceGroup(-1229167892);
                                        colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 != null) {
                                        }
                                        j5 = colors3.semantic.text.subtle;
                                        gapComposer.end(false);
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j5, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource22, (Map) null, (Function1) null, false);
                                        gapComposer.end(true);
                                        gapComposer.end(true);
                                    } else {
                                        z = false;
                                        c4 = 5;
                                        c6 = 52446;
                                        c5 = 51733;
                                        gapComposer.startReplaceGroup(-1806702717);
                                        colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                        }
                                        j4 = colors4.semantic.text.subtle;
                                        gapComposer.end(z);
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j4, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                        String stringResource222 = Room.stringResource(gapComposer, R.string.profile_payment_history_arcade_total_sent);
                                        ordinal3 = barColorState.ordinal();
                                        if (ordinal3 != 0) {
                                        }
                                        gapComposer.startReplaceGroup(-1229167892);
                                        colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 != null) {
                                        }
                                        j5 = colors3.semantic.text.subtle;
                                        gapComposer.end(false);
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j5, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource222, (Map) null, (Function1) null, false);
                                        gapComposer.end(true);
                                        gapComposer.end(true);
                                    }
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                            c = 2;
                            c2 = 3;
                        }
                        c3 = 4;
                        c4 = 5;
                        c6 = 52446;
                        c5 = 51733;
                        gapComposer.startReplaceGroup(-1806702717);
                        colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                        }
                        j4 = colors4.semantic.text.subtle;
                        gapComposer.end(z);
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j4, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                        String stringResource2222 = Room.stringResource(gapComposer, R.string.profile_payment_history_arcade_total_sent);
                        ordinal3 = barColorState.ordinal();
                        if (ordinal3 != 0) {
                        }
                        gapComposer.startReplaceGroup(-1229167892);
                        colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 != null) {
                        }
                        j5 = colors3.semantic.text.subtle;
                        gapComposer.end(false);
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j5, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, stringResource2222, (Map) null, (Function1) null, false);
                        gapComposer.end(true);
                        gapComposer.end(true);
                    }
                    gapComposer.startReplaceGroup(324782371);
                    colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j3 = colors2.semantic.background.f1047app;
                    gapComposer.end(false);
                    long j82 = j3;
                    BarChart$Direction barChart$Direction2 = BarChart$Direction.HORIZONTAL;
                    BarChart$Configuration barChart$Configuration2 = new BarChart$Configuration(j6, j7, j82, f2, profileTransactionsBarViewModel.shouldReverseDirection, 128);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                    }
                }
                gapComposer.startReplaceGroup(-2006499716);
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors != null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors.semantic.background.extraProminent;
                gapComposer.end(false);
                long j72 = j2;
                if (f > RecyclerView.DECELERATION_RATE) {
                }
                ordinal2 = barColorState.ordinal();
                if (ordinal2 != 0) {
                }
                gapComposer.startReplaceGroup(324782371);
                colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                }
                j3 = colors2.semantic.background.f1047app;
                gapComposer.end(false);
                long j822 = j3;
                BarChart$Direction barChart$Direction22 = BarChart$Direction.HORIZONTAL;
                BarChart$Configuration barChart$Configuration22 = new BarChart$Configuration(j6, j72, j822, f2, profileTransactionsBarViewModel.shouldReverseDirection, 128);
                Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
                Modifier m302paddingqDBjuR0$default22 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion22, 1.0f), 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
                ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode42 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default22);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                }
            }
            gapComposer.startReplaceGroup(939924194);
            Colors colors11 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors11 == null) {
                colors11 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors11.semantic.background.brand;
            gapComposer.end(false);
            long j62 = j;
            ordinal = barColorState.ordinal();
            if (ordinal != 0) {
            }
            gapComposer.startReplaceGroup(-2006499716);
            colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors != null) {
            }
            j2 = colors.semantic.background.extraProminent;
            gapComposer.end(false);
            long j722 = j2;
            if (f > RecyclerView.DECELERATION_RATE) {
            }
            ordinal2 = barColorState.ordinal();
            if (ordinal2 != 0) {
            }
            gapComposer.startReplaceGroup(324782371);
            colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
            }
            j3 = colors2.semantic.background.f1047app;
            gapComposer.end(false);
            long j8222 = j3;
            BarChart$Direction barChart$Direction222 = BarChart$Direction.HORIZONTAL;
            BarChart$Configuration barChart$Configuration222 = new BarChart$Configuration(j62, j722, j8222, f2, profileTransactionsBarViewModel.shouldReverseDirection, 128);
            Modifier.Companion companion222 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default222 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion222, 1.0f), 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8);
            ColumnMeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode422 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope422 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier422 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default222);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1222 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(profileTransactionsBarViewModel, i, 28);
        }
    }

    public static final long arcadeAmountLabelColor(BarColorState barColorState, Composer composer) {
        barColorState.getClass();
        int ordinal = barColorState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(484182414);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.disabled;
                gapComposer.end(false);
                return j;
            }
            if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 484180590, false);
            }
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(484186414);
        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
        } else {
            gapComposer2.startReplaceGroup(-1762997739);
            gapComposer2.end(false);
        }
        long j2 = colors2.semantic.text.standard;
        gapComposer2.end(false);
        return j2;
    }
}
