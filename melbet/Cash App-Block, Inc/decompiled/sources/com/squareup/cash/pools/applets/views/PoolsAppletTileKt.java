package com.squareup.cash.pools.applets.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda11;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarKt$Avatar$5$1$1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.applets.presenters.ActivePool;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.viewmodels.PoolParticipant;
import com.squareup.cash.pools.views.PoolAvatarSize;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class PoolsAppletTileKt {

    /* renamed from: lambda$-1879300490, reason: not valid java name */
    public static final ComposableLambdaImpl f567lambda$1879300490 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(20), false, -1879300490);
    public static final ComposableLambdaImpl lambda$320785312 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(21), false, 320785312);

    public static final void InstalledPoolsUI(PoolsAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        Pair pair;
        ArrayList arrayList;
        List list;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1068482028);
        int i2 = i | (gapComposer.changed(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128);
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = appletTileAppearance.useRedesignedTiles;
            if (z2) {
                gapComposer.startReplaceGroup(-788248118);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, 8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), new Dp(64.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-787909071);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), new Dp(28.0f));
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            float f = ((Dp) pair.second).value;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(Room.stringResource(gapComposer, R.string.pools_applet_title), null, null, 14);
            ArrayList arrayList2 = installed.activePools;
            int size = arrayList2.size() + installed.overflowCount;
            if (arrayList2.isEmpty()) {
                gapComposer.startReplaceGroup(929994598);
                list = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, Room.stringResource(gapComposer, R.string.pools_applet_no_active_pools), null, Expect_jvmKt.rememberComposableLambda(1481939860, new MoneyTabUIKt$$ExternalSyntheticLambda38(z2, 8), gapComposer), 5));
                gapComposer.end(false);
            } else if (!z2 || size <= 2) {
                if (z2) {
                    gapComposer.startReplaceGroup(930016094);
                    gapComposer.end(false);
                    List take = CollectionsKt.take(arrayList2, 2);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                    Iterator it = take.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new InstalledServiceAppletTileContentModel(null, ((ActivePool) it.next()).name, null, null, 13));
                    }
                } else {
                    gapComposer.startReplaceGroup(-1234147536);
                    List<ActivePool> take2 = CollectionsKt.take(arrayList2, 2);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take2, 10));
                    for (ActivePool activePool : take2) {
                        arrayList.add(new InstalledServiceAppletTileContentModel(null, activePool.name, null, Expect_jvmKt.rememberComposableLambda(747814002, new PoolListSectionKt$$ExternalSyntheticLambda2(activePool, 15), gapComposer), 5));
                        z = false;
                    }
                    gapComposer.end(z);
                }
                list = arrayList;
            } else {
                gapComposer.startReplaceGroup(930009589);
                list = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, Room.stringResource(R.string.pools_applet_active_pools_count, new Object[]{Integer.valueOf(size)}, gapComposer), null, null, 13));
                gapComposer.end(false);
            }
            if (z2) {
                gapComposer.startReplaceGroup(-1144957896);
                gapComposer.end(z);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-1144896392);
                String str = installed.footerText;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1144896393);
                    gapComposer.end(z);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(-1144896392);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1514196263, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 26), gapComposer);
                    gapComposer.end(z);
                }
                gapComposer.end(z);
            }
            if (z2) {
                gapComposer.startReplaceGroup(-1144577495);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-167579287, new LocalToolbarKt$$ExternalSyntheticLambda0(installed, f, 3), gapComposer);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-1144381544);
                gapComposer.end(z);
                composableLambdaImpl = null;
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, list, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, rememberComposableLambda, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, i2 & 896, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(installed, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 26);
        }
    }

    public static final void PoolsApplet(TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, PoolsAppletTileModel poolsAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1951738887);
        int i2 = (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 4 : 2) | i | (gapComposer.changedInstance(poolsAppletTileModel) ? 32 : 16) | (gapComposer.changed(appletTileAppearance) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1844005423, new PoolToastKt$$ExternalSyntheticLambda0(29, poolsAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SharedUIKt.AppletTileRow(companion, rememberComposableLambda, gapComposer, 54, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(taxesAppletViewsModule$$ExternalSyntheticLambda1, poolsAppletTileModel, appletTileAppearance, modifier2, i, 14);
        }
    }

    /* renamed from: PoolsSharedVisual-TDGSqEk, reason: not valid java name */
    public static final void m3715PoolsSharedVisualTDGSqEk(ArrayList arrayList, int i, float f, Composer composer, int i2) {
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1302429578);
        int i3 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i2 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(f) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int size = arrayList.size() + i;
            if (arrayList.isEmpty()) {
                gapComposer.startReplaceGroup(-54811398);
                Icons icons = Icons.Pools24;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                f2 = f;
                SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, colors.semantic.background.brand, f2, gapComposer, (i3 & 896) | 6, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-54632714);
                f2 = f;
                m3716PoolsTileEndContentjt2gSs(((ActivePool) arrayList.get(0)).icon, size == 1 ? null : (size != 2 || arrayList.size() < 2) ? new PoolIcon.Overflow(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size - 1, Marker.ANY_NON_NULL_MARKER)) : ((ActivePool) arrayList.get(1)).icon, size > 1, f2, gapComposer, 8 | ((i3 << 3) & 7168));
                gapComposer.end(false);
            }
        } else {
            f2 = f;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda4(arrayList, i, f2, i2);
        }
    }

    /* renamed from: PoolsTileEndContent--jt2gSs, reason: not valid java name */
    public static final void m3716PoolsTileEndContentjt2gSs(PoolIcon.Pool pool, PoolIcon poolIcon, boolean z, float f, Composer composer, int i) {
        int i2;
        Modifier semantics;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1558413309);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(pool) : gapComposer.changedInstance(pool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(poolIcon) : gapComposer.changedInstance(poolIcon) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            String stringResource = Room.stringResource(R.string.progress_meter_label, new Object[]{Integer.valueOf(MathKt__MathJVMKt.roundToInt(pool.progressPercent * 100.0f))}, gapComposer);
            float f2 = f / (-3.0f);
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer.startReplaceGroup(-1575361736);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1575357800);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = PoolsAppletTileKt$PoolsTileEndContent$1$1$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                semantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1575293103);
                boolean changed = gapComposer.changed(stringResource);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AvatarKt$Avatar$5$1$1(stringResource, 2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2);
                gapComposer.end(false);
            }
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f2, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m1459clippedOutlinewH6b6FI = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f);
            ImmutableList avatarEntries = toAvatarEntries(pool.participants, gapComposer);
            PoolAvatarSize poolAvatarSize = PoolAvatarSize.Size64;
            PoolToastKt.m3717PoolAvatarnxwB2Kw(avatarEntries, poolAvatarSize, m1459clippedOutlinewH6b6FI, 0L, pool.progressPercent, 4.0f, RecyclerView.DECELERATION_RATE, 0L, Strings.getColors(gapComposer).surface.money.applet.data.inactive.border, f567lambda$1879300490, gapComposer, 805503024, 200);
            gapComposer = gapComposer;
            if (poolIcon == null) {
                gapComposer.startReplaceGroup(-1728813899);
                gapComposer.end(false);
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(-1728813898);
                if (poolIcon instanceof PoolIcon.Pool) {
                    gapComposer.startReplaceGroup(609043463);
                    PoolIcon.Pool pool2 = (PoolIcon.Pool) poolIcon;
                    PoolToastKt.m3717PoolAvatarnxwB2Kw(toAvatarEntries(pool2.participants, gapComposer), poolAvatarSize, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f), 0L, pool2.progressPercent, 4.0f, RecyclerView.DECELERATION_RATE, 0L, Strings.getColors(gapComposer).surface.money.applet.data.inactive.border, lambda$320785312, gapComposer, 805503024, 200);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                    z2 = true;
                } else {
                    if (!(poolIcon instanceof PoolIcon.Overflow)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -257449070, false);
                    }
                    gapComposer.startReplaceGroup(609732903);
                    Modifier m1459clippedOutlinewH6b6FI2 = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(companion, f), 1.0f, Strings.getColors(gapComposer).surface.money.applet.data.inactive.border, roundedCornerShape), Strings.getColors(gapComposer).surface.money.applet.background, roundedCornerShape), roundedCornerShape, 3.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m1459clippedOutlinewH6b6FI2);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, ((PoolIcon.Overflow) poolIcon).count, (Map) null, (Function1) null, false);
                    z2 = true;
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            gapComposer.end(z2);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda11(pool, poolIcon, z, f, i);
        }
    }

    public static Applet poolsApplet(RealPoolsRepository realPoolsRepository, PoolsAppletTilePresenter$Factory$Impl poolsAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.POOLS, realPoolsRepository.appletAvailabilityState, new PdfPreviewViewKt$$ExternalSyntheticLambda0(20, poolsAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static final ImmutableList toAvatarEntries(ImmutableList immutableList, Composer composer) {
        long j;
        AvatarImage.Remote.Image image;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-186268184);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            PoolParticipant poolParticipant = (PoolParticipant) it.next();
            String str = poolParticipant.name;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Color m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1397457356, poolParticipant.accentColor, gapComposer, false);
            if (m == null) {
                gapComposer.startReplaceGroup(-1397455664);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1397458020);
                gapComposer.end(false);
                j = m.value;
            }
            long j2 = j;
            Image image2 = poolParticipant.photoImage;
            if (image2 == null) {
                gapComposer.startReplaceGroup(-371351749);
                gapComposer.end(false);
                image = null;
            } else {
                gapComposer.startReplaceGroup(-371351748);
                AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer), false, null, 0L, new PoolsAppletTileKt$$ExternalSyntheticLambda3(0), 62);
                gapComposer.end(false);
                image = image3;
            }
            arrayList.add(new AvatarEntry(str2, j2, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE));
        }
        gapComposer.end(false);
        return Tags.toImmutableList(arrayList);
    }
}
