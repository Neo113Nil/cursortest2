package com.squareup.cash.moneybot.views.menu;

import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
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
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.PopupProperties;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda15;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.TokenUsageViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.widgets.ComposerKt$Composer$3$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda37;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ExpandableContentKt {
    public static final ComposableLambdaImpl lambda$180143265 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(3), false, 180143265);

    /* renamed from: lambda$-2051556004, reason: not valid java name */
    public static final ComposableLambdaImpl f497lambda$2051556004 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(8), false, -2051556004);

    /* renamed from: lambda$-845884201, reason: not valid java name */
    public static final ComposableLambdaImpl f503lambda$845884201 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(9), false, -845884201);

    /* renamed from: lambda$-1141934776, reason: not valid java name */
    public static final ComposableLambdaImpl f494lambda$1141934776 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(10), false, -1141934776);
    public static final ComposableLambdaImpl lambda$7808272 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(25), false, 7808272);
    public static final ComposableLambdaImpl lambda$860245072 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(11), false, 860245072);

    /* renamed from: lambda$-337399857, reason: not valid java name */
    public static final ComposableLambdaImpl f500lambda$337399857 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(12), false, -337399857);
    public static final ComposableLambdaImpl lambda$1642706440 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(26), false, 1642706440);
    public static final ComposableLambdaImpl lambda$495717704 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(4), false, 495717704);

    /* renamed from: lambda$-975659728, reason: not valid java name */
    public static final ComposableLambdaImpl f504lambda$975659728 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(5), false, -975659728);

    /* renamed from: lambda$-1236442413, reason: not valid java name */
    public static final ComposableLambdaImpl f495lambda$1236442413 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(6), false, -1236442413);

    /* renamed from: lambda$-260423450, reason: not valid java name */
    public static final ComposableLambdaImpl f498lambda$260423450 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(7), false, -260423450);
    public static final ComposableLambdaImpl lambda$1950127379 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(13), false, 1950127379);
    public static final ComposableLambdaImpl lambda$1627628796 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(14), false, 1627628796);
    public static final ComposableLambdaImpl lambda$647994812 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(15), false, 647994812);

    /* renamed from: lambda$-35498139, reason: not valid java name */
    public static final ComposableLambdaImpl f501lambda$35498139 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(16), false, -35498139);

    /* renamed from: lambda$-837318617, reason: not valid java name */
    public static final ComposableLambdaImpl f502lambda$837318617 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(17), false, -837318617);

    /* renamed from: lambda$-1338492857, reason: not valid java name */
    public static final ComposableLambdaImpl f496lambda$1338492857 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(18), false, -1338492857);

    /* renamed from: lambda$-329955404, reason: not valid java name */
    public static final ComposableLambdaImpl f499lambda$329955404 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(19), false, -329955404);

    public static final void DeleteChatConfirmationDialog(Function0 function0, Function0 function02, Composer composer, int i) {
        Function0 function03;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1125800543);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changedInstance(function02) ? 32 : 16);
        int i3 = 5;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function03 = function02;
            ModalKt.Dimmer(null, function03, null, Expect_jvmKt.rememberComposableLambda(-104056824, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function0, function02, i3), gapComposer), gapComposer, (i2 & 112) | 3072, 5);
        } else {
            function03 = function02;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActivityTabViewKt$$ExternalSyntheticLambda19(function0, function03, i, i3);
        }
    }

    /* renamed from: ExpandableContent-0aeBpQE, reason: not valid java name */
    public static final void m3634ExpandableContent0aeBpQE(final List list, final boolean z, final float f, Dp dp, final Function0 function0, Composer composer, final int i, final int i2) {
        Dp dp2;
        int i3;
        final Dp dp3;
        RoundedCornerShape roundedCornerShape;
        char c;
        long j;
        list.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-712556306);
        int i4 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            dp2 = dp;
        } else {
            dp2 = dp;
            i3 = i4 | (gapComposer.changed(dp2) ? 2048 : 1024);
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Dp dp4 = i5 != 0 ? null : dp2;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(34.0f);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                roundedCornerShape = m340RoundedCornerShape0680j_4;
                c = ' ';
                rememberedValue = Updater.mutableStateOf$default(new IntSize(0L));
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                roundedCornerShape = m340RoundedCornerShape0680j_4;
                c = ' ';
            }
            MutableState mutableState = (MutableState) rememberedValue;
            float mo233toDpu2uoSUM = (dp4 == null || ((int) (((IntSize) mutableState.getValue()).packedValue >> c)) <= 0) ? RecyclerView.DECELERATION_RATE : dp4.value - density.mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue >> c));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda9(15, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue2);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            long floatToRawIntBits = (Float.floatToRawIntBits(mo233toDpu2uoSUM) << c) | (Float.floatToRawIntBits(8.0f) & BodyPartID.bodyIdMax);
            if (Strings.getColors(gapComposer).isLight) {
                gapComposer.startReplaceGroup(-2035667336);
                j = Strings.getColors(gapComposer).semantic.background.f1047app;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2035601771);
                j = Strings.getColors(gapComposer).semantic.background.subtle;
                gapComposer.end(false);
            }
            Dp dp5 = dp4;
            AndroidMenu_androidKt.m516DropdownMenuIlH_yew(z, function0, onSizeChanged, floatToRawIntBits, null, new PopupProperties(true, 16), roundedCornerShape, j, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1674901805, new MusicViewKt$$ExternalSyntheticLambda4(list, f, function0, 2), gapComposer), gapComposer, ((i3 >> 3) & 14) | 196992 | ((i3 >> 9) & 112), 1808);
            dp3 = dp5;
        } else {
            gapComposer.skipToGroupEnd();
            dp3 = dp2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.menu.ExpandableContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ExpandableContentKt.m3634ExpandableContent0aeBpQE(list, z, f, dp3, function0, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void MainDebugToolsContent(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1164092427);
        int i2 = 32;
        int i3 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.moneybot_overflow_menu_debug_header), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f));
            gapComposer.startReplaceGroup(-2016305411);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow debugItemRow = (MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow) it.next();
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-381080208, new Function2() { // from class: com.squareup.cash.moneybot.views.menu.MoneybotDebugOverlayViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow debugItemRow2 = debugItemRow;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(debugItemRow2.icon, debugItemRow2.label, (Modifier) null, 0L, gapComposer2, 0, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str = debugItemRow2.label;
                                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(103556623, new Function2() { // from class: com.squareup.cash.moneybot.views.menu.MoneybotDebugOverlayViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow debugItemRow2 = debugItemRow;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(debugItemRow2.icon, debugItemRow2.label, (Modifier) null, 0L, gapComposer2, 0, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str = debugItemRow2.label;
                                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                int i6 = ((i3 & 112) == i2 ? i5 : i4) | (gapComposer.changedInstance(debugItemRow) ? 1 : 0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(11, function1, debugItemRow);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, null, null, push, 0L, gapComposer, 805306422, 3572);
                i4 = i4;
                i2 = i2;
                i5 = 1;
                i3 = i3;
            }
            gapComposer.end(i4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, function1, modifier, i, 5);
        }
    }

    public static final void MoneybotDebugOverlayView(MoneybotDebugOverlayViewModel moneybotDebugOverlayViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        moneybotDebugOverlayViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2043935639);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotDebugOverlayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            if (moneybotDebugOverlayViewModel instanceof MoneybotDebugOverlayViewModel.Sheet) {
                gapComposer.startReplaceGroup(1135520507);
                MoneybotDebugSheet((MoneybotDebugOverlayViewModel.Sheet) moneybotDebugOverlayViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                if (!moneybotDebugOverlayViewModel.equals(MoneybotDebugOverlayViewModel.OpenChatSessionDialog.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1422101423, false);
                }
                gapComposer.startReplaceGroup(1422106875);
                boolean z2 = i3 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0(21, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                boolean z3 = i3 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda21(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                OpenSessionByIdDialog(function12, (Function0) rememberedValue3, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotDebugOverlayViewModel, function1, i, 20);
        }
    }

    public static final void MoneybotDebugSheet(MoneybotDebugOverlayViewModel.Sheet sheet, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2008069568);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sheet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(2028538519, new MoneyTabUIKt$$ExternalSyntheticLambda11(8, (Object) sheet, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(sheet, function1, i, 21);
        }
    }

    public static final void MoneybotOverflowMenuItem(Modifier modifier, Icons icons, String str, String str2, boolean z, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        boolean z2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-179534653);
        int i2 = i | 6 | (gapComposer2.changed(str) ? 256 : 128) | (gapComposer2.changed(str2) ? 2048 : 1024) | 24576 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(717421489, new ShiftDetailViewKt$$ExternalSyntheticLambda19(3, icons, str2), gapComposer2), Expect_jvmKt.rememberComposableLambda(1296187634, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 14), gapComposer2), companion, function0, true, false, null, null, push, 0L, gapComposer, ((i2 >> 6) & 7168) | 805503414, 3536);
            modifier2 = companion;
            z2 = true;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipKt$$ExternalSyntheticLambda2(modifier2, icons, str, str2, z2, function0, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d2, code lost:
    
        if (r15.changed(r5) == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneybotOverflowMenuView(MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel2;
        GapComposer gapComposer;
        Object obj;
        SnapshotStateMap snapshotStateMap;
        Continuation continuation;
        MutableState mutableState;
        boolean z;
        boolean changed;
        Object rememberedValue;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        boolean z2;
        Object obj2;
        String m;
        boolean z3;
        boolean z4;
        Object obj3;
        Function1 function12 = function1;
        moneybotOverflowMenuViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1031391085);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(moneybotOverflowMenuViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i6 = i2 & 112;
            boolean z5 = i6 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            Object obj5 = rememberedValue2;
            if (z5 || rememberedValue2 == obj4) {
                Object moneyTabUIKt$$ExternalSyntheticLambda21 = new MoneyTabUIKt$$ExternalSyntheticLambda21(26, function12);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda21);
                obj5 = moneyTabUIKt$$ExternalSyntheticLambda21;
            }
            DBUtil.BackHandler(false, (Function0) obj5, gapComposer2, 0, 1);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            Continuation continuation2 = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i7 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion2, 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z6 = i6 == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            Object obj6 = rememberedValue3;
            if (z6 || rememberedValue3 == obj4) {
                Object moneyTabUIKt$$ExternalSyntheticLambda212 = new MoneyTabUIKt$$ExternalSyntheticLambda21(28, function12);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda212);
                obj6 = moneyTabUIKt$$ExternalSyntheticLambda212;
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj6, LazyGridKt.titleBarIconBackground(gapComposer2, companion2), Expect_jvmKt.rememberComposableLambda(-532187016, new MusicViewKt$$ExternalSyntheticLambda7(17, function12), gapComposer2), gapComposer2, 1572918, 12);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            moneybotOverflowMenuViewModel2 = moneybotOverflowMenuViewModel;
            Object obj7 = moneybotOverflowMenuViewModel2.recentChatHistoryViewModel;
            int i8 = i7 << 3;
            if ((obj7 instanceof RecentChatHistoryViewModel$Loaded ? (RecentChatHistoryViewModel$Loaded) obj7 : null) == null) {
                gapComposer2.startReplaceGroup(1649190558);
                gapComposer2.end(false);
                function12 = function1;
                z2 = false;
                companion = companion2;
                obj2 = null;
                i3 = i6;
                obj = obj4;
                i4 = 16;
                i5 = 32;
            } else {
                gapComposer2.startReplaceGroup(1649190559);
                RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded = (RecentChatHistoryViewModel$Loaded) obj7;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                obj = obj4;
                Object obj8 = rememberedValue4;
                if (rememberedValue4 == obj) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(mutableStateOf$default);
                    obj8 = mutableStateOf$default;
                }
                MutableState mutableState2 = (MutableState) obj8;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Object obj9 = rememberedValue5;
                if (rememberedValue5 == obj) {
                    Object snapshotStateMap2 = new SnapshotStateMap();
                    gapComposer2.updateRememberedValue(snapshotStateMap2);
                    obj9 = snapshotStateMap2;
                }
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj9;
                Object rememberedValue6 = gapComposer2.rememberedValue();
                Object obj10 = rememberedValue6;
                if (rememberedValue6 == obj) {
                    Object mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(mutableStateOf$default2);
                    obj10 = mutableStateOf$default2;
                }
                MutableState mutableState3 = (MutableState) obj10;
                String str = recentChatHistoryViewModel$Loaded.deleteConfirmationSessionId;
                boolean z7 = recentChatHistoryViewModel$Loaded.hasMoreSessions;
                boolean z8 = recentChatHistoryViewModel$Loaded.loadingNextPage;
                boolean changedInstance = gapComposer2.changedInstance(recentChatHistoryViewModel$Loaded);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue7 == obj) {
                    rememberedValue7 = new RealKeyStoreProvider$setEntry$2(recentChatHistoryViewModel$Loaded, snapshotStateMap3, mutableState3, continuation2, 15);
                    snapshotStateMap = snapshotStateMap3;
                    continuation = null;
                    gapComposer2.updateRememberedValue(rememberedValue7);
                } else {
                    snapshotStateMap = snapshotStateMap3;
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue7);
                Boolean valueOf2 = Boolean.valueOf(z8);
                boolean changedInstance2 = gapComposer2.changedInstance(recentChatHistoryViewModel$Loaded);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                Object obj11 = rememberedValue8;
                if (changedInstance2 || rememberedValue8 == obj) {
                    Object genieViewKt$GenieView$1$1 = new GenieViewKt$GenieView$1$1(recentChatHistoryViewModel$Loaded, mutableState2, continuation, 21);
                    gapComposer2.updateRememberedValue(genieViewKt$GenieView$1$1);
                    obj11 = genieViewKt$GenieView$1$1;
                }
                Updater.LaunchedEffect(gapComposer2, valueOf2, (Function2) obj11);
                Boolean valueOf3 = Boolean.valueOf(z7);
                boolean changed2 = gapComposer2.changed(rememberLazyListState) | gapComposer2.changedInstance(recentChatHistoryViewModel$Loaded);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue9 == obj) {
                    continuation2 = continuation;
                    mutableState = mutableState2;
                    rememberedValue9 = new RealMRIFactory$sign$2(rememberLazyListState, recentChatHistoryViewModel$Loaded, mutableState, continuation2, 4);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                } else {
                    continuation2 = continuation;
                    mutableState = mutableState2;
                }
                Updater.LaunchedEffect(rememberLazyListState, valueOf3, (Function2) rememberedValue9, gapComposer2);
                boolean z9 = (z8 || ((Boolean) mutableState.getValue()).booleanValue()) && z7 && !(recentChatHistoryViewModel$Loaded.error instanceof RecentChatHistoryViewModel$Loaded.Error.LoadingNextPage);
                boolean changedInstance3 = gapComposer2.changedInstance(recentChatHistoryViewModel$Loaded);
                if (((i8 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    function12 = function1;
                } else {
                    function12 = function1;
                }
                if ((i8 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z = false;
                    changed = changedInstance3 | z | gapComposer2.changed(z9);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changed || rememberedValue == obj) {
                        companion = companion2;
                        SnapshotStateMap snapshotStateMap4 = snapshotStateMap;
                        i3 = i6;
                        i4 = 16;
                        i5 = 32;
                        z2 = false;
                        Object userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(recentChatHistoryViewModel$Loaded, z9, snapshotStateMap4, function12, 14);
                        gapComposer2.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                        rememberedValue = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
                    } else {
                        companion = companion2;
                        i3 = i6;
                        i4 = 16;
                        i5 = 32;
                        z2 = false;
                    }
                    obj2 = (Function1) rememberedValue;
                    gapComposer2.end(z2);
                }
                z = true;
                changed = changedInstance3 | z | gapComposer2.changed(z9);
                rememberedValue = gapComposer2.rememberedValue();
                if (changed) {
                }
                companion = companion2;
                SnapshotStateMap snapshotStateMap42 = snapshotStateMap;
                i3 = i6;
                i4 = 16;
                i5 = 32;
                z2 = false;
                Object userJavascriptInterfaceBase$$ExternalSyntheticLambda252 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(recentChatHistoryViewModel$Loaded, z9, snapshotStateMap42, function12, 14);
                gapComposer2.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda252);
                rememberedValue = userJavascriptInterfaceBase$$ExternalSyntheticLambda252;
                obj2 = (Function1) rememberedValue;
                gapComposer2.end(z2);
            }
            boolean changedInstance4 = (((((i8 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer2.changed(function12)) && (i8 & MLKEMEngine.KyberPolyBytes) != 256) ? z2 : true) | gapComposer2.changedInstance(obj7) | gapComposer2.changed(obj2);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            Object obj12 = rememberedValue10;
            if (changedInstance4 || rememberedValue10 == obj) {
                Object moneyTabUIKt$$ExternalSyntheticLambda39 = new MoneyTabUIKt$$ExternalSyntheticLambda39(9, obj7, obj2, function12);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda39);
                obj12 = moneyTabUIKt$$ExternalSyntheticLambda39;
            }
            Object obj13 = (Function1) obj12;
            boolean changedInstance5 = gapComposer2.changedInstance(moneybotOverflowMenuViewModel2) | (i3 == i5 ? true : z2) | gapComposer2.changed(obj13);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Object obj14 = rememberedValue11;
            if (changedInstance5 || rememberedValue11 == obj) {
                Object moneyTabUIKt$$ExternalSyntheticLambda392 = new MoneyTabUIKt$$ExternalSyntheticLambda39(8, moneybotOverflowMenuViewModel2, obj13, function12);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda392);
                obj14 = moneyTabUIKt$$ExternalSyntheticLambda392;
            }
            Function1 function13 = (Function1) obj14;
            int i9 = i3;
            Object obj15 = obj;
            int i10 = i4;
            int i11 = i5;
            boolean z10 = z2;
            LazyDslKt.LazyColumn(null, rememberLazyListState, null, null, null, null, false, null, function13, gapComposer2, 0, 509);
            GapComposer gapComposer3 = gapComposer2;
            boolean z11 = obj7 instanceof RecentChatHistoryViewModel$Loaded;
            RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded2 = z11 ? (RecentChatHistoryViewModel$Loaded) obj7 : continuation2;
            Object obj16 = recentChatHistoryViewModel$Loaded2 != 0 ? recentChatHistoryViewModel$Loaded2.error : continuation2;
            if (obj16 == null) {
                gapComposer3.startReplaceGroup(706731827);
                gapComposer3.end(z10);
                z3 = z11;
            } else {
                gapComposer3.startReplaceGroup(706731828);
                if (obj16.equals(RecentChatHistoryViewModel$Loaded.Error.LoadingNextPage.INSTANCE)) {
                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -1457432783, R.string.moneybot_chat_history_load_next_page_error, gapComposer3, z10);
                } else {
                    if (!obj16.equals(RecentChatHistoryViewModel$Loaded.Error.Delete.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1457435067, z10);
                    }
                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -1457429439, R.string.moneybot_delete_chat_error, gapComposer3, z10);
                }
                String str2 = m;
                Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                z3 = z11;
                ModalKt.m3381ToastBAHpl2s(SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), null, str2, f503lambda$845884201, null, null, null, gapComposer3, 3072, 498);
                gapComposer3.end(z10);
            }
            gapComposer3.end(true);
            gapComposer3.end(true);
            RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded3 = z3 ? (RecentChatHistoryViewModel$Loaded) obj7 : continuation2;
            String str3 = recentChatHistoryViewModel$Loaded3 != 0 ? recentChatHistoryViewModel$Loaded3.deleteConfirmationSessionId : continuation2;
            if (str3 == 0) {
                gapComposer3.startReplaceGroup(-1401652086);
                gapComposer3.end(z10);
                z4 = true;
            } else {
                gapComposer3.startReplaceGroup(-1401652085);
                boolean changed3 = gapComposer3.changed(str3) | (i9 == i11 ? true : z10 ? 1 : 0);
                Object rememberedValue12 = gapComposer3.rememberedValue();
                Object obj17 = rememberedValue12;
                if (changed3 || rememberedValue12 == obj15) {
                    Object p2PListViewKt$$ExternalSyntheticLambda13 = new P2PListViewKt$$ExternalSyntheticLambda13(function12, str3, i10);
                    gapComposer3.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda13);
                    obj17 = p2PListViewKt$$ExternalSyntheticLambda13;
                }
                Function0 function02 = (Function0) obj17;
                boolean z12 = i9 == i11 ? true : z10 ? 1 : 0;
                Object rememberedValue13 = gapComposer3.rememberedValue();
                if (z12 || rememberedValue13 == obj15) {
                    z4 = true;
                    Object musicViewKt$$ExternalSyntheticLambda0 = new MusicViewKt$$ExternalSyntheticLambda0(1, function12);
                    gapComposer3.updateRememberedValue(musicViewKt$$ExternalSyntheticLambda0);
                    obj3 = musicViewKt$$ExternalSyntheticLambda0;
                } else {
                    z4 = true;
                    obj3 = rememberedValue13;
                }
                DeleteChatConfirmationDialog(function02, (Function0) obj3, gapComposer3, z10 ? 1 : 0);
                gapComposer3.end(z10);
            }
            gapComposer3.end(z4);
            gapComposer = gapComposer3;
        } else {
            moneybotOverflowMenuViewModel2 = moneybotOverflowMenuViewModel;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotOverflowMenuViewModel2, function12, i, 22);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    public static final void MoneybotPreambleEditorContent(String str, Function1 function1, Composer composer, int i) {
        int i2;
        ?? r8;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(193387066);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(str);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean z2 = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).keyboard == 2;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, 6);
            Boolean bool = (Boolean) collectIsFocusedAsState.getValue();
            bool.booleanValue();
            Boolean valueOf = Boolean.valueOf(z2);
            boolean changed = gapComposer.changed(collectIsFocusedAsState) | gapComposer.changed(z2) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed || rememberedValue3 == obj) {
                InteractiveCardState$animateLock$2 interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z2, delegatingSoftwareKeyboardController, collectIsFocusedAsState, continuation, 10);
                r8 = 0;
                gapComposer.updateRememberedValue(interactiveCardState$animateLock$2);
                rememberedValue3 = interactiveCardState$animateLock$2;
            } else {
                r8 = 0;
            }
            Updater.LaunchedEffect(bool, valueOf, (Function2) rememberedValue3, gapComposer);
            boolean changed2 = (i4 == 4) | gapComposer.changed(mutableState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == obj) {
                rememberedValue4 = new ComposerKt$Composer$3$1(str, mutableState, r8, 1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue4);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.imePadding(SizeKt.fillMaxSize(companion, 1.0f)), ImageKt.rememberScrollState(gapComposer), false, 14);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(verticalScroll$default, 32.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw r8;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
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
            String str2 = (String) mutableState.getValue();
            boolean changed3 = gapComposer.changed(mutableState);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue5 == obj) {
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(16, mutableState);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Object obj2 = DefaultSizes.border.entries;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(layoutWeightElement, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            long j2 = Strings.getColors(gapComposer).semantic.background.subtle;
            Strings.getSizes(gapComposer).getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m178borderxT4_qwU, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer).getClass();
            BasicTextFieldKt.BasicTextField(str2, (Function1) rememberedValue5, SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f), false, false, new TextStyle(Strings.getColors(gapComposer).semantic.text.standard, Strings.getTypography(gapComposer).bodySmall.spanStyle.fontSize, null, FontFamily.Monospace, 0L, 0L, 0, 0, 0L, null, 16777180), null, null, false, 0, 0, null, null, mutableInteractionSourceImpl, null, null, gapComposer, 0, 3072, 57304);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(R.string.moneybot_system_preamble_char_count, new Object[]{Integer.valueOf(((String) mutableState.getValue()).length())}, gapComposer), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ButtonProminence.Id id = ArcadeButtonProminences.standard;
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = CardUiKt.toButtonProminence(id);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (z3 || rememberedValue6 == obj) {
                rememberedValue6 = new MusicViewKt$$ExternalSyntheticLambda0(4, function1);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$1;
            coil3.size.SizeKt.Button((Function0) rememberedValue6, weight, buttonProminence, false, false, null, lambda$1950127379, gapComposer, 1572864, 56);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence2 = CardUiKt.toButtonProminence(id);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
            boolean z4 = i5 == 32;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (z4 || rememberedValue7 == obj) {
                rememberedValue7 = new MusicViewKt$$ExternalSyntheticLambda0(5, function1);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue7, weight2, buttonProminence2, false, false, null, lambda$1627628796, gapComposer, 1572864, 56);
            gapComposer.end(true);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 8.0f, gapComposer);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence3 = CardUiKt.toButtonProminence(id);
            Modifier weight3 = rowScopeInstance.weight(1.0f, companion, true);
            boolean z5 = i5 == 32;
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (z5 || rememberedValue8 == obj) {
                rememberedValue8 = new MusicViewKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue8, weight3, buttonProminence3, false, false, null, lambda$647994812, gapComposer, 1572864, 56);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence4 = CardUiKt.toButtonProminence(ArcadeButtonProminences.prominent);
            Modifier weight4 = rowScopeInstance.weight(1.0f, companion, true);
            boolean changed4 = gapComposer.changed(mutableState) | (i5 == 32);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue9 == obj) {
                rememberedValue9 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, 16);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue9, weight4, buttonProminence4, false, false, null, f501lambda$35498139, gapComposer, 1572864, 56);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda15(str, function1, i, 2);
        }
    }

    public static final void MoneybotPreambleEditorView(MoneybotPreambleEditorViewModel moneybotPreambleEditorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z;
        moneybotPreambleEditorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-579149093);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(moneybotPreambleEditorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int i3 = i2;
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (moneybotPreambleEditorViewModel instanceof MoneybotPreambleEditorViewModel.Loading) {
                gapComposer.startReplaceGroup(627167441);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (moneybotPreambleEditorViewModel instanceof MoneybotPreambleEditorViewModel.Loaded) {
                gapComposer.startReplaceGroup(627170168);
                MoneybotPreambleEditorContent(((MoneybotPreambleEditorViewModel.Loaded) moneybotPreambleEditorViewModel).currentPreamble, function1, gapComposer, i4);
                gapComposer.end(false);
            } else {
                if (!(moneybotPreambleEditorViewModel instanceof MoneybotPreambleEditorViewModel.Error)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 627165597, false);
                }
                gapComposer.startReplaceGroup(627175044);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, ((MoneybotPreambleEditorViewModel.Error) moneybotPreambleEditorViewModel).message, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
                z = true;
                gapComposer.end(z);
                gapComposer.end(z);
            }
            z = true;
            gapComposer.end(z);
            gapComposer.end(z);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotPreambleEditorViewModel, function1, i, 23);
        }
    }

    public static final void OpenSessionByIdDialog(Function1 function1, Function0 function0, Composer composer, int i) {
        Function0 function02;
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1032238545);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(function1) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            function02 = function0;
            ModalKt.Dimmer(null, function02, null, Expect_jvmKt.rememberComposableLambda(1148805462, new PoolToastKt$$ExternalSyntheticLambda0(i2, TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer, 6, 2), function1, function0), gapComposer), gapComposer, (i3 & 112) | 3072, 5);
            gapComposer = gapComposer;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(i, function02, function1);
        }
    }

    public static final void RecentChatHistoryPlaceholder(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(252136053);
        int i2 = i | 6;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 54.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SimpleLayoutKt$$ExternalSyntheticLambda0(modifier, composableLambdaImpl, i, i3);
        }
    }

    /* renamed from: TokenUsageProgressBar-6a0pyJM, reason: not valid java name */
    public static final void m3635TokenUsageProgressBar6a0pyJM(final float f, int i, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1901664731);
        int i2 = (gapComposer.changed(f) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            final long j = colors.semantic.border.brand;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            final long j2 = colors2.semantic.border.subtle;
            final float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(8.0f);
            boolean changed = gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(j2) | gapComposer.changed(j) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                Function1 function1 = new Function1() { // from class: com.squareup.cash.moneybot.views.menu.TokenUsageSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        drawScope.getClass();
                        float f2 = mo236toPx0680j_4;
                        float f3 = f2 / 2.0f;
                        float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f3) - f3;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                        drawScope.mo729drawLineNGM6Ib0(j2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f2, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                        drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits((intBitsToFloat * f) + f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f2, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            CanvasKt.Canvas(6, gapComposer, modifier, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda37(modifier, f, i, 3);
        }
    }

    public static final void TokenUsageSheetContent(TokenUsageViewModel tokenUsageViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1706891009);
        int i2 = (gapComposer.changedInstance(tokenUsageViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1393738100, new TokenUsageSheetContentKt$$ExternalSyntheticLambda0(modifier, tokenUsageViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TokenUsageSheetContentKt$$ExternalSyntheticLambda0(tokenUsageViewModel, modifier, i);
        }
    }
}
