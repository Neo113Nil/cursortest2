package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
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
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class EarnerUpsellBlockerViewKt {
    static {
        new Image("fake:///foo.png", (String) null, 6);
        zzd zzdVar = Icons.Companion;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EarnerUpsellBlockerViewModel.SummaryItem[]{new EarnerUpsellBlockerViewModel.SummaryItem(new Icon("LQUx2D"), "No fees for goods and services"), new EarnerUpsellBlockerViewModel.SummaryItem(new Icon("b9UR6C"), "No tax reporting under $20k/year"), new EarnerUpsellBlockerViewModel.SummaryItem(new Icon("iCAtj0"), "Track your earnings in one place")});
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new EarnerUpsellBlockerViewModel.BookletTileContent[]{new EarnerUpsellBlockerViewModel.BookletTileContent.Tile(new Image("fake:///foo.png", (String) null, 6), "No fees. We promise.", "It wasn't you, it was us. We don't think it's right to charge fees when you're just trying to get paid. So we're not doing it anymore. Every payment is free, no matter what it's for."), new EarnerUpsellBlockerViewModel.BookletTileContent.Grid("Run your business worry free.", CollectionsKt__CollectionsKt.listOf((Object[]) new EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item[]{new EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item(new Icon("b9UR6C"), "No surprise tax forms", "We won't send a 1099 unless you earn over $20k a year."), new EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item(new Icon("iCAtj0"), "No payment fees", "Every payment is free, no matter what it's for."), new EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item(new Icon("LQUx2D"), "Track your earnings", "See payments, compare months, and view YTD earnings.")})), new EarnerUpsellBlockerViewModel.BookletTileContent.Tile(new Image("fake:///foo.png", (String) null, 6), "Track all your earnings.\nAll in one place.", "Track payments from customers and consolidate all of your earnings into one simple experience. Compare to last month, see YTD, and gain access to Cash products.")});
        listOf.getClass();
        listOf2.getClass();
    }

    public static final void EarnerUpsellBlocker(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1, boolean z, Composer composer, int i) {
        earnerUpsellBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(373549741);
        int i2 = (gapComposer.changedInstance(earnerUpsellBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1363530174, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda0(z, function1, earnerUpsellBlockerViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda0(earnerUpsellBlockerViewModel, function1, z, i);
        }
    }

    public static final void EarnerUpsellBookletTile(EarnerUpsellBlockerViewModel.BookletTileContent bookletTileContent, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(453339387);
        int i2 = (gapComposer.changedInstance(bookletTileContent) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = bookletTileContent instanceof EarnerUpsellBlockerViewModel.BookletTileContent.Grid;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(1867457893);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str = ((EarnerUpsellBlockerViewModel.BookletTileContent.Grid) bookletTileContent).title;
                boolean changedInstance = gapComposer.changedInstance(bookletTileContent);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(bookletTileContent, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                BookletGridKt.BookletGrid(m300paddingVpY3zN4$default, str, null, (Function1) rememberedValue, gapComposer, 0, 4);
                gapComposer.end(false);
            } else {
                if (!(bookletTileContent instanceof EarnerUpsellBlockerViewModel.BookletTileContent.Tile)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1867456508, false);
                }
                gapComposer.startReplaceGroup(1867468687);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                EarnerUpsellBlockerViewModel.BookletTileContent.Tile tile = (EarnerUpsellBlockerViewModel.BookletTileContent.Tile) bookletTileContent;
                BookletGridKt.m3424BookletTileeHTjO5g(m300paddingVpY3zN4$default2, tile.title, tile.body, tile.image, RecyclerView.DECELERATION_RATE, null, null, gapComposer, 24576, 224);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(bookletTileContent, i, 26);
        }
    }

    public static final void EarnerUpsellContent(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Modifier modifier, Composer composer, int i, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1231158510);
        int i3 = (gapComposer.changedInstance(earnerUpsellBlockerViewModel) ? 4 : 2) | i;
        int i4 = i2 & 2;
        int i5 = i4 != 0 ? i3 | 48 : i3 | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            EarnerUpsellSummary(earnerUpsellBlockerViewModel, modifier, gapComposer, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            int i6 = 0;
            for (Object obj : earnerUpsellBlockerViewModel.tiles) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                EarnerUpsellBookletTile((EarnerUpsellBlockerViewModel.BookletTileContent) obj, gapComposer, 0);
                if (i6 != earnerUpsellBlockerViewModel.tiles.size() - 1) {
                    gapComposer.startReplaceGroup(930734473);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(930773874);
                    gapComposer.end(false);
                }
                i6 = i7;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda10(earnerUpsellBlockerViewModel, modifier, i, i2);
        }
    }

    public static final void EarnerUpsellCta(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(697778427);
        int i2 = (gapComposer.changedInstance(earnerUpsellBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Updater.CompositionLocalProvider(ArcadeThemeKt.LocalScreenMargin.defaultProvidedValue$runtime(new Dp(16.0f)), Expect_jvmKt.rememberComposableLambda(88200251, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(function1, earnerUpsellBlockerViewModel), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(i, earnerUpsellBlockerViewModel, function1);
        }
    }

    public static final void EarnerUpsellHeroImage(Image image, Composer composer, int i) {
        Image image2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1767365650);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(image) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            image2 = image;
            AsyncImageKt.m1438AsyncImage10Xjiaw(image2, null, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, ContentScale.Companion.FillWidth, null, gapComposer, (i3 & 14) | 1573296, 1976);
        } else {
            image2 = image;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfilePreviewKt$$ExternalSyntheticLambda9(image2, i, i2);
        }
    }

    public static final void EarnerUpsellSummary(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(210477119);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(earnerUpsellBlockerViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i3 = i2;
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
            Image image = earnerUpsellBlockerViewModel.image;
            if (image == null) {
                gapComposer.startReplaceGroup(1597604394);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1597604395);
                EarnerUpsellHeroImage(image, gapComposer, 0);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 112, 0, 4088, 0L, (Composer) gapComposer, modifier, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle, (TextLineBalancing) null, earnerUpsellBlockerViewModel.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(-890530895);
            earnerUpsellBlockerViewModel2 = earnerUpsellBlockerViewModel;
            Iterator it = earnerUpsellBlockerViewModel2.summaryItems.iterator();
            while (it.hasNext()) {
                EarnerUpsellSummaryRow((EarnerUpsellBlockerViewModel.SummaryItem) it.next(), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            earnerUpsellBlockerViewModel2 = earnerUpsellBlockerViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda10(earnerUpsellBlockerViewModel2, modifier, i);
        }
    }

    public static final void EarnerUpsellSummaryRow(EarnerUpsellBlockerViewModel.SummaryItem summaryItem, Composer composer, int i) {
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1954508033);
        int i2 = (gapComposer.changedInstance(summaryItem) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Icons icons = null;
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
            Icon icon = summaryItem.icon;
            if (icon != null && (str = icon.arcade_id) != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            if (icons == null) {
                icons = Icons.Check24;
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, summaryItem.text, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(summaryItem, i, 27);
        }
    }
}
