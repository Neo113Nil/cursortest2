package com.squareup.cash.bitcoin.views.applet.education;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoryViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.util.coroutines.TakeUntilKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinStoriesWidgetViewKt {
    public static final ComposableLambdaImpl lambda$1954937809 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(17), false, 1954937809);
    public static final ComposableLambdaImpl lambda$549006659 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(17), false, 549006659);
    public static final ComposableLambdaImpl lambda$593781961 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(18), false, 593781961);

    public static final void BitcoinStoriesWidgetView(Modifier modifier, Function1 function1, BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        function1.getClass();
        bitcoinStoriesWidgetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1694193439);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changedInstance(function1) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(bitcoinStoriesWidgetViewModel) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier2 = modifier;
            TakeUntilKt.WidgetSectionView(Room.stringResource(gapComposer, R.string.bitcoin_stories_title), modifier2, null, null, Expect_jvmKt.rememberComposableLambda(808323833, new BankingDialogKt$$ExternalSyntheticLambda2(25, (Object) bitcoinStoriesWidgetViewModel, function1), gapComposer), gapComposer, ((i3 << 3) & 112) | 196608, 28);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3(modifier2, function1, bitcoinStoriesWidgetViewModel, i);
        }
    }

    public static final void ErrorContent(int i, Composer composer, Modifier modifier, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2028826641);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1954937809, 15);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$549006659, null, (Function0) rememberedValue, false, true, lambda$593781961, null, 0L, buttonCompact, null, gapComposer, 1769478, 1434);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(modifier, function1, i, 1);
        }
    }

    public static final void FillRemainingTiles(int i, int i2, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1936203873);
        int i3 = (gapComposer.changed(i) ? 32 : 16) | i2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (i < 2) {
            gapComposer.startReplaceGroup(-38714289);
            int i4 = 2 - i;
            for (int i5 = 0; i5 < i4; i5++) {
                float f = 1.0f;
                if (!(((double) 1.0f) > 0.0d)) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                SpacerKt.Spacer(gapComposer, new LayoutWeightElement(f, true));
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-38633565);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, i2, 4);
        }
    }

    public static final void LoadingContent(Modifier modifier, BitcoinStoriesWidgetViewModel.Loading loading, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1998744550);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(loading) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            VisibleKt.ShimmerBox(modifier2, false, null, Expect_jvmKt.rememberComposableLambda(1037411081, new BankingDialogKt$$ExternalSyntheticLambda8(loading, 26), gapComposer), gapComposer, (i2 & 14) | 3072, 6);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(modifier2, loading, i, i3);
        }
    }

    public static final void StoryGrid(Modifier modifier, BitcoinStoriesWidgetViewModel.Content content, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1882504946);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(content) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i4 = 3;
            float f = 16.0f;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changed = gapComposer.changed(content.storyList);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = CollectionsKt.chunked(content.storyList, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer.startReplaceGroup(-610367395);
            for (List<BitcoinStoryViewModel> list : (List) rememberedValue) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f, true, new Drop$$ExternalSyntheticBUOutline0(i4)), Alignment.Companion.Top, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(1422514655);
                for (BitcoinStoryViewModel bitcoinStoryViewModel : list) {
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(bitcoinStoryViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(i3, function1, bitcoinStoryViewModel);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    StoryTile(layoutWeightElement, (Function0) rememberedValue2, bitcoinStoryViewModel, gapComposer, 0);
                }
                gapComposer.end(false);
                FillRemainingTiles(list.size(), 6, gapComposer);
                gapComposer.end(true);
                i4 = 3;
                f = 16.0f;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3(modifier, (Object) content, function1, i, 3);
        }
    }

    public static final void StoryTile(Modifier modifier, Function0 function0, BitcoinStoryViewModel bitcoinStoryViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(88437607);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(bitcoinStoryViewModel) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, new Role(0), function0, 11);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.2958f, companion, false);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), ColorKt.Color(bitcoinStoryViewModel.primaryColor), ColorKt.RectangleShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AsyncImageKt.m1438AsyncImage10Xjiaw(bitcoinStoryViewModel.coverImageUrl, null, SemanticsModifierKt.clearAndSetSemantics(m177backgroundbw27NRU, (Function1) rememberedValue), null, ContentScale.Companion.Crop, null, gapComposer, 1572912, 1976);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, bitcoinStoryViewModel.title, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, function0, bitcoinStoryViewModel, i, 5);
        }
    }
}
