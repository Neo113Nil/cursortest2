package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class SlottedTableKt {
    public static final AvatarSizeOverride TABLE_AVATAR_SIZE = new AvatarSizeOverride(40.0f, 20.0f, 56, Room.getSp(20));
    public static final SlotContent.Table THREE_ROWS;

    static {
        CollectionsKt__CollectionsJVMKt.listOf(new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///BlueBottle.png", "fake:///BlueBottle.png", 4), null, null, 32639), "Blue Bottle", "-$7.45")).getClass();
        CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.Table.Row[]{new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639), "Payroll", "+$2,418.90"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///cash.png", "fake:///cash.png", 4), null, null, 32639), "Grocery Outlet", "-$86.12")}).getClass();
        THREE_ROWS = new SlotContent.Table(CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.Table.Row[]{new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639), "Payroll", "+$2,418.90"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///cash.png", "fake:///cash.png", 4), null, null, 32639), "Grocery Outlet", "-$86.12"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///BlueBottle.png", "fake:///BlueBottle.png", 4), null, null, 32639), "Blue Bottle", "-$7.45")}));
        CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.Table.Row[]{new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639), "Payroll", "+$2,418.90"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///cash.png", "fake:///cash.png", 4), null, null, 32639), "Grocery Outlet", "-$86.12"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///BlueBottle.png", "fake:///BlueBottle.png", 4), null, null, 32639), "Blue Bottle", "-$7.45"), new SlotContent.Table.Row(new UiAvatar(null, null, null, null, new Image("fake:///cash.png", "fake:///cash.png", 4), null, null, 32639), "Cash App", "+$25.00")}).getClass();
    }

    public static final void SlottedTable(SlotContent.Table table, Modifier modifier, Composer composer, int i) {
        table.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-528971240);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(table) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            List take = CollectionsKt.take(table.rows, 4);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.Bottom, 17)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            gapComposer.startReplaceGroup(250216844);
            int i3 = 0;
            for (Object obj : take) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SlottedTableRow((SlotContent.Table.Row) obj, i3, gapComposer, 0);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(table, modifier, i, 1);
        }
    }

    public static final void SlottedTableRow(SlotContent.Table.Row row, int i, Composer composer, int i2) {
        SlotContent.Table.Row row2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(928987974);
        int i3 = (gapComposer.changedInstance(row) ? 4 : 2) | i2 | (gapComposer.changed(i) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer);
            Boolean valueOf = Boolean.valueOf(moneybotSlotContentAnimationsReady);
            Boolean valueOf2 = Boolean.valueOf(moneybotSlotContentAnimationsReady);
            Boolean valueOf3 = Boolean.valueOf(moneybotSlotContentShouldAnimate);
            boolean changed = gapComposer.changed(moneybotSlotContentShouldAnimate);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealBadger2$scheduleBadgeClearingWork$3(moneybotSlotContentShouldAnimate, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) Updater.produceState(valueOf, row, valueOf2, valueOf3, (Function2) rememberedValue, gapComposer, (i3 << 3) & 112).getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, i * 55, null, 4), "slottedTableRowAlpha", null, gapComposer, 3072, 20);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxWidth(companion, 1.0f), ((Number) animateFloatAsState.getValue()).floatValue());
            boolean changedInstance = gapComposer.changedInstance(row);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Overlay$$ExternalSyntheticLambda0(row, 7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(alpha, (Function1) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            row2 = row;
            TextViewKt.Avatar(TABLE_AVATAR_SIZE, AvatarsKt.toAvatarEntry(row.icon, new SlottedTableKt$$ExternalSyntheticLambda2(0), gapComposer, 0), null, false, true, gapComposer, 24582, 12);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, row2.name, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 16.0f, gapComposer);
            Room.m1165Text25TpFw(0, 1, 0, 6, 1572912, 0, 3760, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SizeKt.wrapContentWidth$default(companion, Alignment.Companion.End, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, row2.amount, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            row2 = row;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(row2, i, i2);
        }
    }
}
