package androidx.compose.foundation.lazy;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.timeline.RenderedRow;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyListLayoutInfoKt {
    public static final void MessageJsonBlock(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1237012719);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, m302paddingqDBjuR0$default, j, 12.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(-807270696, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 15), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i, 16);
        }
    }

    public static final void RawMessagesView(RawMessagesViewModel rawMessagesViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        Function1 function13 = function1;
        rawMessagesViewModel.getClass();
        function13.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-932945892);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(rawMessagesViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(760178659, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(10, rawMessagesViewModel, function13), gapComposer), gapComposer, 48, 1);
            boolean z = rawMessagesViewModel instanceof RawMessagesViewModel.Loaded;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-672410580);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxSize(companion, 1.0f), 16.0f, 8.0f);
                boolean changedInstance = gapComposer.changedInstance(rawMessagesViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Overlay$$ExternalSyntheticLambda0(rawMessagesViewModel, 9);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.LazyColumn(m299paddingVpY3zN4, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
                gapComposer.end(false);
            } else if (rawMessagesViewModel instanceof RawMessagesViewModel.Loading) {
                gapComposer.startReplaceGroup(-672162921);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
                gapComposer.end(true);
                gapComposer.end(false);
                function13 = function1;
            } else {
                if (!(rawMessagesViewModel instanceof RawMessagesViewModel.Error)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2056518228, false);
                }
                gapComposer.startReplaceGroup(2056534342);
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                String stringResource = Room.stringResource(gapComposer, R.string.something_went_wrong);
                String stringResource2 = Room.stringResource(gapComposer, R.string.moneybot_raw_messages_load_error);
                String stringResource3 = Room.stringResource(gapComposer, R.string.close);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda0(7, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                function13 = function12;
                UtilsKt.m3636FullscreenNotice6RhP_wg(fillMaxSize3, stringResource, stringResource2, stringResource3, (Function0) rememberedValue2, null, null, 0L, gapComposer, 6, 902);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(rawMessagesViewModel, function13, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Timeline(TimelineState timelineState, ImmutableList immutableList, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        boolean z;
        boolean z2;
        Modifier.Companion companion;
        SnapshotStateMap snapshotStateMap;
        Object obj;
        int i3;
        Object m;
        timelineState.getClass();
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(594039884);
        int i4 = (i & 6) == 0 ? (gapComposer.changed(timelineState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changed(immutableList) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 256 : 128;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i5 != 0 ? companion2 : modifier2;
                int i6 = i4 & 112;
                boolean z3 = i6 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj2 = Composer.Companion.Empty;
                if (z3 || rememberedValue == obj2) {
                    rememberedValue = Updater.derivedStateOf(new BankingDialogKt$$ExternalSyntheticLambda5(13, immutableList, timelineState));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                State state = (State) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj2) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
                }
                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj2) {
                    rememberedValue3 = new SnapshotStateMap();
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                int i7 = 14;
                if (rememberedValue4 == obj2) {
                    rememberedValue4 = Updater.derivedStateOf(new BankingDialogKt$$ExternalSyntheticLambda5(i7, snapshotStateMap2, mutableFloatState));
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                State state2 = (State) rememberedValue4;
                ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(providableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.border.subtle;
                Colors colors2 = (Colors) gapComposer.consume(providableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.border.prominent;
                boolean z4 = i6 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z4 || rememberedValue5 == obj2) {
                    rememberedValue5 = new ListOrderedKt$$ExternalSyntheticLambda0(immutableList, 2);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Modifier semantics = SemanticsModifierKt.semantics(modifier4, false, (Function1) rememberedValue5);
                Object rememberedValue6 = gapComposer.rememberedValue();
                Modifier modifier5 = modifier4;
                int i8 = 3;
                if (rememberedValue6 == obj2) {
                    rememberedValue6 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, i8);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                Modifier onPlaced = RulerKt.onPlaced(semantics, (Function1) rememberedValue6);
                boolean changed = gapComposer.changed(state) | gapComposer.changed(j) | gapComposer.changed(j2);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changed || rememberedValue7 == obj2) {
                    rememberedValue7 = new BorderKt$$ExternalSyntheticLambda0(state, state2, j, j2, 3);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                Modifier drawWithCache = ClipKt.drawWithCache(onPlaced, (Function1) rememberedValue7);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, drawWithCache);
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
                gapComposer.startReplaceGroup(569406999);
                int i9 = 0;
                for (Object obj3 : (List) state.getValue()) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Object obj4 = (RenderedRow) obj3;
                    if (obj4 instanceof RenderedRow.VisibleItem) {
                        gapComposer.startReplaceGroup(2112078310);
                        RenderedRow.VisibleItem visibleItem = (RenderedRow.VisibleItem) obj4;
                        TimelineItem timelineItem = visibleItem.item;
                        int ordinal = timelineItem.state.ordinal();
                        if (ordinal == 0) {
                            m = re$$ExternalSyntheticOutline0.m(gapComposer, -1331576251, R.string.timeline_not_started_state_description, gapComposer, false);
                        } else if (ordinal == 1) {
                            m = re$$ExternalSyntheticOutline0.m(gapComposer, -1331573436, R.string.timeline_incomplete_state_description, gapComposer, false);
                        } else if (ordinal == 2) {
                            m = re$$ExternalSyntheticOutline0.m(gapComposer, -1331570751, R.string.timeline_pending_state_description, gapComposer, false);
                        } else if (ordinal == 3) {
                            m = re$$ExternalSyntheticOutline0.m(gapComposer, -1331565759, R.string.timeline_skipped_state_description, gapComposer, false);
                        } else {
                            if (ordinal != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1331577287, false);
                            }
                            m = re$$ExternalSyntheticOutline0.m(gapComposer, -1331568258, R.string.timeline_done_state_description, gapComposer, false);
                        }
                        boolean changedInstance = gapComposer.changedInstance(obj4) | gapComposer.changed(m);
                        Object rememberedValue8 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue8 == obj2) {
                            rememberedValue8 = new BadgeQueries$$ExternalSyntheticLambda0(10, visibleItem, m);
                            gapComposer.updateRememberedValue(rememberedValue8);
                        }
                        int i11 = 0;
                        Modifier semantics2 = SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue8);
                        boolean changed2 = gapComposer.changed(i9);
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue9 == obj2) {
                            rememberedValue9 = new TimelineKt$$ExternalSyntheticLambda11(snapshotStateMap2, i9, i11);
                            gapComposer.updateRememberedValue(rememberedValue9);
                        }
                        TimelineVisibleItemRow(semantics2, (Function1) rememberedValue9, timelineItem, gapComposer, 0);
                        gapComposer.end(false);
                        i3 = i4;
                        snapshotStateMap = snapshotStateMap2;
                        companion = companion2;
                        obj = obj2;
                    } else {
                        if (!(obj4 instanceof RenderedRow.Collapsed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1869246090, false);
                        }
                        gapComposer.startReplaceGroup(2112557911);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                        String stringResource = Room.stringResource(gapComposer, R.string.timeline_expand_click_label);
                        boolean changedInstance2 = ((i4 & 14) == 4) | gapComposer.changedInstance(obj4);
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue10 == obj2) {
                            rememberedValue10 = new BankingDialogKt$$ExternalSyntheticLambda5(12, timelineState, (RenderedRow.Collapsed) obj4);
                            gapComposer.updateRememberedValue(rememberedValue10);
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, stringResource, null, (Function0) rememberedValue10, 13);
                        boolean changedInstance3 = gapComposer.changedInstance(obj4);
                        Object rememberedValue11 = gapComposer.rememberedValue();
                        if (changedInstance3 || rememberedValue11 == obj2) {
                            rememberedValue11 = new ContextKt$$ExternalSyntheticLambda1((RenderedRow.Collapsed) obj4, 27);
                            gapComposer.updateRememberedValue(rememberedValue11);
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m298padding3ABfNKs(SemanticsModifierKt.semantics(m183clickableoSLSa3U$default, false, (Function1) rememberedValue11), 16.0f), 36.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        boolean changed3 = gapComposer.changed(i9);
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        if (changed3 || rememberedValue12 == obj2) {
                            rememberedValue12 = new TimelineKt$$ExternalSyntheticLambda11(snapshotStateMap2, i9, 1);
                            gapComposer.updateRememberedValue(rememberedValue12);
                        }
                        Modifier onPlaced2 = RulerKt.onPlaced(m302paddingqDBjuR0$default, (Function1) rememberedValue12);
                        RenderedRow.Collapsed collapsed = (RenderedRow.Collapsed) obj4;
                        String str = collapsed.range.label;
                        if (str == null) {
                            gapComposer.startReplaceGroup(1869282825);
                            z2 = true;
                            str = new MessageFormat(Room.stringResource(gapComposer, R.string.timeline_expand)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(collapsed.count), "count"));
                            str.getClass();
                            z = false;
                        } else {
                            z = false;
                            z2 = true;
                            gapComposer.startReplaceGroup(1869282236);
                        }
                        gapComposer.end(z);
                        companion = companion2;
                        snapshotStateMap = snapshotStateMap2;
                        obj = obj2;
                        i3 = i4;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer, onPlaced2, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer.end(z);
                    }
                    i9 = i10;
                    i4 = i3;
                    companion2 = companion;
                    snapshotStateMap2 = snapshotStateMap;
                    obj2 = obj;
                }
                gapComposer.end(false);
                gapComposer.end(true);
                modifier3 = modifier5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(timelineState, immutableList, modifier3, i, i2, 14);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static TimelineItem TimelineItem$default(TimelineItem.State state, String str, String str2, String str3, String str4, ComposableLambdaImpl composableLambdaImpl, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        String str5 = (i & 8) != 0 ? null : str3;
        String str6 = (i & 16) != 0 ? null : str4;
        ComposableLambdaImpl composableLambdaImpl2 = (i & 64) != 0 ? null : composableLambdaImpl;
        str.getClass();
        return new TimelineItem(state, new ComposableLambdaImpl(new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 2), true, -1529113038), str2 != null ? new ComposableLambdaImpl(new TransfersViewKt$$ExternalSyntheticLambda5(str2, 16), true, 175971089) : null, str5 != null ? new ComposableLambdaImpl(new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str5, 3), true, -400907704) : null, str6 != null ? new ComposableLambdaImpl(new TransfersViewKt$$ExternalSyntheticLambda5(str6, 17), true, 703365139) : null, (Function0) null, composableLambdaImpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineVisibleItemRow(Modifier modifier, Function1 function1, final TimelineItem timelineItem, Composer composer, int i) {
        Modifier.Companion companion;
        Modifier semantics;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        boolean z;
        boolean z2;
        TextStyle textStyle;
        int ordinal;
        boolean z3;
        long j;
        int ordinal2;
        Colors colors;
        long j2;
        Colors colors2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1439496244);
        Applier applier = gapComposer.applier;
        int i2 = 16;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(timelineItem) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Function0 function0 = timelineItem.onClick;
            Function3 function3 = timelineItem.accessory;
            TimelineItem.State state = timelineItem.state;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (function0 != null) {
                gapComposer.startReplaceGroup(1216185442);
                semantics = ImageKt.m183clickableoSLSa3U$default(companion2, false, Room.stringResource(gapComposer, R.string.timeline_item_click_label), null, timelineItem.onClick, 13);
                companion = companion2;
                gapComposer.end(false);
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(1216350331);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new NavBarBinding$$ExternalSyntheticLambda2(i2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue2);
                gapComposer.end(false);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth.then(semantics), 52.0f, 16.0f, 24.0f, 16.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            Modifier.Companion companion3 = companion;
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15, 1.0f, true);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$15);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
            ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).labelMedium);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
            ProvidedValue m2 = re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalIconColor;
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, m2, Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(-399966116, new BankingDialog$$ExternalSyntheticLambda1(function1, parcelableSnapshotMutableIntState, timelineItem, 3), gapComposer), gapComposer, 56);
            if (timelineItem.body != null) {
                gapComposer.startReplaceGroup(-783063273);
                final int i4 = 0;
                Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.subtle, staticProvidableCompositionLocal), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.subtle, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(-792843785, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        TimelineItem timelineItem2 = timelineItem;
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i5) {
                            case 0:
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                                    Function3 function32 = timelineItem2.body;
                                    function32.getClass();
                                    function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function2 = timelineItem2.value;
                                    function2.getClass();
                                    function2.invoke(gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function22 = timelineItem2.valueDescriptor;
                                    function22.getClass();
                                    function22.invoke(gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), gapComposer, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-782710586);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.End, gapComposer, 48);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$15);
            if (timelineItem.value != null) {
                gapComposer.startReplaceGroup(285306178);
                int ordinal3 = state.ordinal();
                if (ordinal3 != 0 && ordinal3 != 1 && ordinal3 != 2) {
                    if (ordinal3 == 3) {
                        gapComposer.startReplaceGroup(-1584821900);
                        textStyle = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119);
                        gapComposer.end(false);
                        ProvidedValue defaultProvidedValue$runtime2 = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(textStyle);
                        ordinal = state.ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                z3 = false;
                                gapComposer.startReplaceGroup(215493910);
                                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors3 == null) {
                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                j = colors3.semantic.text.subtle;
                                gapComposer.end(false);
                                ProvidedValue m3 = re$$ExternalSyntheticOutline0.m(j, staticProvidableCompositionLocal);
                                ordinal2 = state.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 2) {
                                    }
                                }
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                                gapComposer.startReplaceGroup(473208964);
                                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors != null) {
                                }
                                j2 = colors.semantic.icon.standard;
                                gapComposer.end(z3);
                                final int i5 = 1;
                                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, m3, Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(920535470, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i52 = i5;
                                        TimelineItem timelineItem2 = timelineItem;
                                        Composer composer2 = (Composer) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        switch (i52) {
                                            case 0:
                                                GapComposer gapComposer2 = (GapComposer) composer2;
                                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                    int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                                    PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                                    Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                                    ComposeUiNode.Companion.getClass();
                                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                    if (gapComposer2.applier == null) {
                                                        Updater.invalidApplier();
                                                        throw null;
                                                    }
                                                    gapComposer2.startReusableNode();
                                                    if (gapComposer2.inserting) {
                                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                                    } else {
                                                        gapComposer2.useNode();
                                                    }
                                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                    Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                                    Function3 function32 = timelineItem2.body;
                                                    function32.getClass();
                                                    function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                                    gapComposer2.end(true);
                                                } else {
                                                    gapComposer2.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                GapComposer gapComposer3 = (GapComposer) composer2;
                                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Function2 function2 = timelineItem2.value;
                                                    function2.getClass();
                                                    function2.invoke(gapComposer3, 0);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                GapComposer gapComposer4 = (GapComposer) composer2;
                                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Function2 function22 = timelineItem2.valueDescriptor;
                                                    function22.getClass();
                                                    function22.invoke(gapComposer4, 0);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, gapComposer), gapComposer, 56);
                                gapComposer.end(z3);
                            } else if (ordinal == 3) {
                                z3 = false;
                                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                gapComposer.startReplaceGroup(215491896);
                                colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z3);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(z3);
                                }
                                j = colors2.semantic.text.standard;
                                gapComposer.end(z3);
                                ProvidedValue m32 = re$$ExternalSyntheticOutline0.m(j, staticProvidableCompositionLocal);
                                ordinal2 = state.ordinal();
                                if (ordinal2 != 0 && ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        gapComposer.startReplaceGroup(473210978);
                                        Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z3);
                                        } else {
                                            gapComposer.startReplaceGroup(-1762997739);
                                            gapComposer.end(z3);
                                        }
                                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                                        j2 = colors4.semantic.icon.subtle;
                                        gapComposer.end(z3);
                                        final int i52 = 1;
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, m32, Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(920535470, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                int i522 = i52;
                                                TimelineItem timelineItem2 = timelineItem;
                                                Composer composer2 = (Composer) obj;
                                                int intValue = ((Integer) obj2).intValue();
                                                switch (i522) {
                                                    case 0:
                                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                            int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                                            Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer2.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer2.startReusableNode();
                                                            if (gapComposer2.inserting) {
                                                                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                                            } else {
                                                                gapComposer2.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                            Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                                            Function3 function32 = timelineItem2.body;
                                                            function32.getClass();
                                                            function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                                            gapComposer2.end(true);
                                                        } else {
                                                            gapComposer2.skipToGroupEnd();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                            Function2 function2 = timelineItem2.value;
                                                            function2.getClass();
                                                            function2.invoke(gapComposer3, 0);
                                                        } else {
                                                            gapComposer3.skipToGroupEnd();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                            Function2 function22 = timelineItem2.valueDescriptor;
                                                            function22.getClass();
                                                            function22.invoke(gapComposer4, 0);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, gapComposer), gapComposer, 56);
                                        gapComposer.end(z3);
                                    } else if (ordinal2 != 3 && ordinal2 != 4) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 473205030, z3);
                                    }
                                }
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                                gapComposer.startReplaceGroup(473208964);
                                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors != null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z3);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(z3);
                                }
                                j2 = colors.semantic.icon.standard;
                                gapComposer.end(z3);
                                final int i522 = 1;
                                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, m32, Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(920535470, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i5222 = i522;
                                        TimelineItem timelineItem2 = timelineItem;
                                        Composer composer2 = (Composer) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        switch (i5222) {
                                            case 0:
                                                GapComposer gapComposer2 = (GapComposer) composer2;
                                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                    int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                                    PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                                    Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                                    ComposeUiNode.Companion.getClass();
                                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                    if (gapComposer2.applier == null) {
                                                        Updater.invalidApplier();
                                                        throw null;
                                                    }
                                                    gapComposer2.startReusableNode();
                                                    if (gapComposer2.inserting) {
                                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                                    } else {
                                                        gapComposer2.useNode();
                                                    }
                                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                    Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                                    Function3 function32 = timelineItem2.body;
                                                    function32.getClass();
                                                    function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                                    gapComposer2.end(true);
                                                } else {
                                                    gapComposer2.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                GapComposer gapComposer3 = (GapComposer) composer2;
                                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Function2 function2 = timelineItem2.value;
                                                    function2.getClass();
                                                    function2.invoke(gapComposer3, 0);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                GapComposer gapComposer4 = (GapComposer) composer2;
                                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    Function2 function22 = timelineItem2.valueDescriptor;
                                                    function22.getClass();
                                                    function22.invoke(gapComposer4, 0);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }, gapComposer), gapComposer, 56);
                                gapComposer.end(z3);
                            } else if (ordinal != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 215487962, false);
                            }
                        }
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        z3 = false;
                        gapComposer.startReplaceGroup(215491896);
                        colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                        }
                        j = colors2.semantic.text.standard;
                        gapComposer.end(z3);
                        ProvidedValue m322 = re$$ExternalSyntheticOutline0.m(j, staticProvidableCompositionLocal);
                        ordinal2 = state.ordinal();
                        if (ordinal2 != 0) {
                        }
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        gapComposer.startReplaceGroup(473208964);
                        colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                        }
                        j2 = colors.semantic.icon.standard;
                        gapComposer.end(z3);
                        final int i5222 = 1;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, m322, Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(920535470, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52222 = i5222;
                                TimelineItem timelineItem2 = timelineItem;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i52222) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                            int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                            Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                            if (gapComposer2.applier == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer2.startReusableNode();
                                            if (gapComposer2.inserting) {
                                                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                            } else {
                                                gapComposer2.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                            Function3 function32 = timelineItem2.body;
                                            function32.getClass();
                                            function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                            gapComposer2.end(true);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Function2 function2 = timelineItem2.value;
                                            function2.getClass();
                                            function2.invoke(gapComposer3, 0);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Function2 function22 = timelineItem2.valueDescriptor;
                                            function22.getClass();
                                            function22.invoke(gapComposer4, 0);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer), gapComposer, 56);
                        gapComposer.end(z3);
                    } else if (ordinal3 != 4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1584827879, false);
                    }
                }
                gapComposer.startReplaceGroup(-1584824306);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer.end(false);
                ProvidedValue defaultProvidedValue$runtime22 = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(textStyle);
                ordinal = state.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                    }
                }
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                z3 = false;
                gapComposer.startReplaceGroup(215491896);
                colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                }
                j = colors2.semantic.text.standard;
                gapComposer.end(z3);
                ProvidedValue m3222 = re$$ExternalSyntheticOutline0.m(j, staticProvidableCompositionLocal);
                ordinal2 = state.ordinal();
                if (ordinal2 != 0) {
                }
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                gapComposer.startReplaceGroup(473208964);
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors != null) {
                }
                j2 = colors.semantic.icon.standard;
                gapComposer.end(z3);
                final int i52222 = 1;
                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime22, m3222, Recorder$$ExternalSyntheticOutline2.m(j2, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(920535470, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i522222 = i52222;
                        TimelineItem timelineItem2 = timelineItem;
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i522222) {
                            case 0:
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                    Function3 function32 = timelineItem2.body;
                                    function32.getClass();
                                    function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function2 = timelineItem2.value;
                                    function2.getClass();
                                    function2.invoke(gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function22 = timelineItem2.valueDescriptor;
                                    function22.getClass();
                                    function22.invoke(gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), gapComposer, 56);
                gapComposer.end(z3);
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                gapComposer.startReplaceGroup(285595439);
                gapComposer.end(false);
            }
            if (timelineItem.valueDescriptor != null) {
                gapComposer.startReplaceGroup(285649441);
                final int i6 = 2;
                Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.subtle, staticProvidableCompositionLocal), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.subtle, dynamicProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(-1878741083, new Function2() { // from class: com.squareup.cash.arcade.components.timeline.TimelineKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i522222 = i6;
                        TimelineItem timelineItem2 = timelineItem;
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i522222) {
                            case 0:
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode42 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope42 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier42 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope42, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode42), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier42, ComposeUiNode.Companion.SetModifier);
                                    Function3 function32 = timelineItem2.body;
                                    function32.getClass();
                                    function32.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function2 = timelineItem2.value;
                                    function2.getClass();
                                    function2.invoke(gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Function2 function22 = timelineItem2.valueDescriptor;
                                    function22.getClass();
                                    function22.invoke(gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), gapComposer, 56);
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(285970415);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            if (function3 != null) {
                gapComposer.startReplaceGroup(753551796);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$15);
                function3.invoke(BoxScopeInstance.INSTANCE, gapComposer, 6);
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(753624832);
                gapComposer.end(z);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1((Object) modifier, function1, (Object) timelineItem, i, 4);
        }
    }

    public static final CollectionItemInfo toCollectionItemInfo(RenderedRow renderedRow) {
        int i;
        int originalIndex = renderedRow.getOriginalIndex();
        if (renderedRow instanceof RenderedRow.VisibleItem) {
            i = 1;
        } else {
            if (!(renderedRow instanceof RenderedRow.Collapsed)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i = ((RenderedRow.Collapsed) renderedRow).count;
        }
        return new CollectionItemInfo(originalIndex, i, 0);
    }

    public static final int visibleItemsAverageSize(LazyListMeasureResult lazyListMeasureResult) {
        List list = lazyListMeasureResult.visibleItemsInfo;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((LazyListMeasuredItem) list.get(i2)).size;
        }
        return (i / list.size()) + lazyListMeasureResult.mainAxisItemSpacing;
    }
}
