package com.squareup.cash.money.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.ValueInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import androidx.media3.ui.compose.modifiers.ExtensionsKt;
import androidx.media3.ui.compose.state.PresentationStateKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.common.collect.ImmutableList;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class HypeWelcomeUIKt {
    public static final ComposableLambdaImpl lambda$1960999335 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(1), false, 1960999335);

    /* renamed from: lambda$-1850672312, reason: not valid java name */
    public static final ComposableLambdaImpl f476lambda$1850672312 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(2), false, -1850672312);
    public static final ComposableLambdaImpl lambda$1373795263 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(3), false, 1373795263);
    public static final ComposableLambdaImpl lambda$1474821147 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(4), false, 1474821147);
    public static final ComposableLambdaImpl lambda$1301099835 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(5), false, 1301099835);
    public static final ComposableLambdaImpl lambda$371650462 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(0), false, 371650462);
    public static final ComposableLambdaImpl lambda$1127266183 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(6), false, 1127266183);

    /* renamed from: lambda$-1658600635, reason: not valid java name */
    public static final ComposableLambdaImpl f475lambda$1658600635 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(7), false, -1658600635);
    public static final ComposableLambdaImpl lambda$1243433252 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(8), false, 1243433252);

    /* renamed from: lambda$-149500157, reason: not valid java name */
    public static final ComposableLambdaImpl f473lambda$149500157 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(9), false, -149500157);
    public static final ComposableLambdaImpl lambda$550885429 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(0), false, 550885429);

    /* renamed from: lambda$-1542433566, reason: not valid java name */
    public static final ComposableLambdaImpl f474lambda$1542433566 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(10), false, -1542433566);
    public static final ComposableLambdaImpl lambda$1803135045 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(1), false, 1803135045);

    public static final void BalanceAppletTileLoadingShimmer(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-663489106);
        Applier applier = gapComposer.applier;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Strings.getSizes(gapComposer).getClass();
            RoundedCornerShape m341RoundedCornerShapea9UjIt4 = RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(40.0f, 40.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer).surface.money.background, m341RoundedCornerShapea9UjIt4);
            boolean isSystemInDarkTheme = ImageKt.isSystemInDarkTheme(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (isSystemInDarkTheme) {
                modifier2 = companion;
            } else {
                modifier2 = ImageKt.background$default(companion, Lock.m132linearGradientmHitzGk(new Pair[]{new Pair(Float.valueOf(0.13f), new Color(Color.White)), new Pair(Float.valueOf(1.0f), new Color(Color.Transparent))}, 0L, (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32)), m341RoundedCornerShapea9UjIt4, 4);
            }
            Modifier then = m177backgroundbw27NRU.then(modifier2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(then, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 32.0f, gapComposer);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 120.0f), 16.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Modifier clip = ClipKt.clip(m300paddingVpY3zN4$default2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            long j = Strings.getColors(gapComposer).semantic.background.standard;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 8.0f, gapComposer);
            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 160.0f), 48.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs2, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m300paddingVpY3zN4$default3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 88.0f));
            Strings.getSizes(gapComposer).getClass();
            coil3.size.SizeKt.AdaptiveStack(null, null, null, new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, null, lambda$1474821147, gapComposer, 1572864, 55);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 24);
        }
    }

    public static final void FallbackImage(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1425729988);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            modifier2 = modifier;
            ImageKt.Image(Countries.painterResource(i, i3 & 14, gapComposer), null, modifier2, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624 | ((i3 << 3) & 896), 104);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(i, modifier2, i2, 10);
        }
    }

    public static final void FullWidthTileLoadingShimmer(Modifier modifier, Composer composer, int i) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2083657393);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            long j = Strings.getColors(gapComposer).surface.money.background;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Modifier fillMaxSize = SizeKt.fillMaxSize(SizeKt.fillMaxWidth(modifier, 1.0f), 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(fillMaxSize, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(SemanticsModifierKt.clearAndSetSemantics(m177backgroundbw27NRU2, (Function1) rememberedValue), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.squareup.cash.money.viewmodels.api.Item] */
    /* renamed from: GroupedInnerContent-TDGSqEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3611GroupedInnerContentTDGSqEk(List list, boolean z, Composer composer, int i) {
        RoundedCornerShape roundedCornerShape;
        Modifier clip;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        ?? r5 = (GapComposer) composer;
        r5.startRestartGroup(300767831);
        Applier applier = r5.applier;
        int i2 = (r5.changedInstance(list) ? 4 : 2) | i | (r5.changed(40.0f) ? 256 : 128);
        int i3 = 1;
        boolean z2 = 0;
        if (r5.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r5, 0);
            int hashCode = Long.hashCode(r5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r5.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(r5, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            RoundedCornerShape roundedCornerShape2 = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r5.startReusableNode();
            if (r5.inserting) {
                r5.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r5.useNode();
            }
            Updater.m576setimpl(r5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r5, materializeModifier, ComposeUiNode.Companion.SetModifier);
            r5.startReplaceGroup(-906758167);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    ?? r19 = roundedCornerShape2;
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r19;
                }
                ?? r9 = (Item) obj;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                if (z && list.size() == i3) {
                    r5.startReplaceGroup(134327288);
                    r5.end(z2);
                    clip = ClipKt.clip(companion, RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(40.0f, 40.0f, 12));
                } else if (z || i4 != i3) {
                    roundedCornerShape = roundedCornerShape2;
                    r5.startReplaceGroup(134757754);
                    r5.end(z2);
                    clip = ClipKt.clip(companion, RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(i4 != 0 ? 0.0f : 40.0f, i4 == 0 ? 40.0f : 0.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                    Modifier then = fillMaxWidth.then(clip);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r5, z2);
                    int hashCode2 = Long.hashCode(r5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(r5, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    r5.startReusableNode();
                    if (r5.inserting) {
                        r5.useNode();
                    } else {
                        r5.createNode(layoutNode$Companion$Constructor$12);
                    }
                    Updater.m576setimpl(r5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(r5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(r5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(r5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(r5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) r5.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    r9.UI(r5, 0);
                    ((DefaultSizes) r5.consume(staticProvidableCompositionLocal)).getClass();
                    r5.end(true);
                    i3 = 1;
                    z2 = 0;
                    i4 = i5;
                    roundedCornerShape2 = roundedCornerShape;
                } else {
                    r5.startReplaceGroup(134593485);
                    clip = evolutionBackground(companion, roundedCornerShape2, r5, 3);
                    r5.end(z2);
                }
                roundedCornerShape = roundedCornerShape2;
                Modifier then2 = fillMaxWidth.then(clip);
                ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r5, z2);
                int hashCode22 = Long.hashCode(r5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope22 = r5.currentCompositionLocalScope();
                Modifier materializeModifier22 = PlatformKt.materializeModifier(r5, then2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                r5.startReusableNode();
                if (r5.inserting) {
                }
                Updater.m576setimpl(r5, columnMeasurePolicy22, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(r5, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(r5, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(r5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(r5, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) r5.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                r9.UI(r5, 0);
                ((DefaultSizes) r5.consume(staticProvidableCompositionLocal2)).getClass();
                r5.end(true);
                i3 = 1;
                z2 = 0;
                i4 = i5;
                roundedCornerShape2 = roundedCornerShape;
            }
            r5.end(z2);
            r5.end(i3);
        } else {
            r5.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r5.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(list, z, i, 9);
        }
    }

    public static final void HeaderText(Modifier modifier, String str, PaddingValues paddingValues, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(349467987);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(paddingValues) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier padding = SpacerKt.padding(modifier, paddingValues);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4088, 0L, (Composer) gapComposer, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(modifier, str, paddingValues, i, 0);
        }
    }

    public static final void HypeWelcomeUI(HypeWelcomeModel hypeWelcomeModel, Function1 function1, Composer composer, int i) {
        int i2;
        hypeWelcomeModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-341728556);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(hypeWelcomeModel) : gapComposer.changedInstance(hypeWelcomeModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-559941409, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(i3, (Object) hypeWelcomeModel, (Object) function1), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(hypeWelcomeModel, function1, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HypeWelcomeVideo(final String str, int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        final String str2;
        int i4;
        Modifier modifier2;
        int i5;
        GapComposer gapComposer;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        ExoPlayer exoPlayer;
        LifecycleOwner lifecycleOwner;
        final int i6 = i;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-601196897);
        int currentMarker = gapComposer2.getCurrentMarker();
        if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (gapComposer2.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(i6) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i5 = i4;
            if (!gapComposer2.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                final Modifier modifier4 = i7 != 0 ? companion : modifier2;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier4);
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
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer2.startReplaceGroup(740024498);
                boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (booleanValue) {
                    gapComposer2.startReplaceGroup(739972789);
                    FallbackImage(i6, (i5 >> 3) & 14, gapComposer2, boxScopeInstance.matchParentSize());
                    gapComposer2.endToMarker(currentMarker);
                    RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final int i8 = 0;
                        endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i9 = i8;
                                int i10 = i2;
                                switch (i9) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str2, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str2, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                        break;
                                    case 2:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str2, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str2, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                gapComposer2.startReplaceGroup(740084265);
                gapComposer2.end(false);
                Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                Object rememberedValue = gapComposer2.rememberedValue();
                float f = RecyclerView.DECELERATION_RATE;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    try {
                        ExoPlayerImpl build = new ExoPlayer.Builder(context.getApplicationContext()).build();
                        build.setMediaItems(ImmutableList.of((Object) MediaItem.fromUri(str)));
                        build.setRepeatMode(2);
                        build.setPlayWhenReady(true);
                        build.setVolume(RecyclerView.DECELERATION_RATE);
                        build.prepare();
                        rememberedValue = build;
                    } catch (Throwable unused) {
                        rememberedValue = null;
                    }
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                ExoPlayer exoPlayer2 = (ExoPlayer) rememberedValue;
                if (exoPlayer2 == null) {
                    gapComposer2.startReplaceGroup(740563029);
                    FallbackImage(i6, (i5 >> 3) & 14, gapComposer2, boxScopeInstance.matchParentSize());
                    gapComposer2.endToMarker(currentMarker);
                    endRestartGroup = gapComposer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final int i9 = 1;
                    function2 = new Function2() { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i92 = i9;
                            int i10 = i2;
                            switch (i92) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier4, (Composer) obj, Updater.updateChangedFlags(i10 | 1), i3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    final Modifier modifier5 = modifier4;
                    gapComposer2.startReplaceGroup(740674505);
                    gapComposer2.end(false);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue3;
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        f = 1.0f;
                    }
                    gapComposer = gapComposer2;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), "videoFadeIn", null, gapComposer, 3120, 20);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(741077877);
                        FallbackImage(i6, (i5 >> 3) & 14, gapComposer, boxScopeInstance.matchParentSize());
                        gapComposer.endToMarker(currentMarker);
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final int i10 = 2;
                        function2 = new Function2() { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i92 = i10;
                                int i102 = i2;
                                switch (i92) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier5, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier5, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                        break;
                                    case 2:
                                        ((Integer) obj2).getClass();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier5, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier5, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        i6 = i6;
                        modifier3 = modifier5;
                        gapComposer.startReplaceGroup(741189353);
                        gapComposer.end(false);
                        if (((Number) animateFloatAsState.getValue()).floatValue() < 1.0f) {
                            gapComposer.startReplaceGroup(741337378);
                            FallbackImage(i6, (i5 >> 3) & 14, gapComposer, boxScopeInstance.matchParentSize());
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(741436361);
                            gapComposer.end(false);
                        }
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
                        boolean changedInstance = gapComposer.changedInstance(exoPlayer2) | gapComposer.changedInstance(lifecycleOwner2);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new BankingConfigQueries$$ExternalSyntheticLambda0(exoPlayer2, lifecycleOwner2, mutableState, mutableState2, 21);
                            exoPlayer = exoPlayer2;
                            lifecycleOwner = lifecycleOwner2;
                            gapComposer.updateRememberedValue(rememberedValue4);
                        } else {
                            lifecycleOwner = lifecycleOwner2;
                            exoPlayer = exoPlayer2;
                        }
                        Updater.DisposableEffect(exoPlayer, lifecycleOwner, (Function1) rememberedValue4, gapComposer);
                        Modifier m1153resizeWithContentScaleXrYQPog = ExtensionsKt.m1153resizeWithContentScaleXrYQPog(companion, ContentScale.Companion.Fit, (Size) PresentationStateKt.rememberPresentationState(exoPlayer, gapComposer, 0).videoSizeDp$delegate.getValue(), gapComposer, 54);
                        boolean changed = gapComposer.changed(animateFloatAsState);
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        if (changed || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 12);
                            gapComposer.updateRememberedValue(rememberedValue5);
                        }
                        PlayerSurfaceKt.PlayerSurface(exoPlayer, ColorKt.graphicsLayer(m1153resizeWithContentScaleXrYQPog, (Function1) rememberedValue5), 2, gapComposer, MLKEMEngine.KyberPolyBytes);
                        gapComposer.end(false);
                        gapComposer.end(true);
                    }
                }
                endRestartGroup.block = function2;
                return;
            }
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final int i11 = 3;
                function2 = new Function2() { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i92 = i11;
                        int i102 = i2;
                        switch (i92) {
                            case 0:
                                ((Integer) obj2).getClass();
                                HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier3, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier3, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier3, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                HypeWelcomeUIKt.HypeWelcomeVideo(str, i6, modifier3, (Composer) obj, Updater.updateChangedFlags(i102 | 1), i3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                endRestartGroup.block = function2;
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i4;
        if (!gapComposer2.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void UI(Section.Header header, SectionId sectionId, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2074446145);
        int i2 = (gapComposer.changed(header) ? 4 : 2) | i | (gapComposer.changed(sectionId.ordinal()) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = header instanceof Section.Header.Spacer;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-458879099);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), ((Section.Header.Spacer) header).height));
                gapComposer.end(false);
            } else {
                if (!(header instanceof Section.Header.DividerWithText)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 677922200, false);
                }
                gapComposer.startReplaceGroup(-458781356);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                Section.Header.DividerWithText dividerWithText = (Section.Header.DividerWithText) header;
                HeaderText(TestTagKt.testTag(SpacerKt.padding(companion, dividerWithText.titleMargin).then(companion), sectionId.name()), dividerWithText.title, dividerWithText.padding, gapComposer, 0);
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(header, sectionId, i, 25);
        }
    }

    public static final void UninstalledTileLoadingShimmer(Modifier modifier, Composer composer, int i) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(148157017);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            long j = Strings.getColors(gapComposer).surface.money.background;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), 80.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 10;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m277height3ABfNKs, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 36.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 80.0f), 16.0f);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m277height3ABfNKs2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 4.0f, gapComposer);
            Modifier m277height3ABfNKs3 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 120.0f), 16.0f);
            Strings.getSizes(gapComposer).getClass();
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m277height3ABfNKs3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda6(10);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, SizeKt.m290width3ABfNKs(companion, 64.0f), null, false, false, null, lambda$1301099835, gapComposer, 1572918, 60);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 25);
        }
    }

    public static final void UpsellTileLoadingShimmer(Modifier modifier, Composer composer, int i) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1568216417);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.surface.money.background;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(SizeKt.fillMaxWidth(modifier, 1.0f), 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.standard, rectangleShapeKt$RectangleShape$1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(SemanticsModifierKt.clearAndSetSemantics(m177backgroundbw27NRU2, (Function1) rememberedValue), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 23);
        }
    }

    public static final TransitionFactory.CustomTransition access$moneyToWalletTransition() {
        return new TransitionFactory.CustomTransition(EnterTransitionImpl.None, EnterExitTransitionKt.fadeOut$default(new SnapSpec(800), 2), true);
    }

    public static final TransitionFactory.CustomTransition access$walletToMoneyTransition() {
        return new TransitionFactory.CustomTransition(EnterTransitionImpl.None, EnterExitTransitionKt.fadeOut$default(new SnapSpec(800), 2), false);
    }

    /* renamed from: calculateScrollTransitionProgress-Kz89ssw, reason: not valid java name */
    public static final float m3612calculateScrollTransitionProgressKz89ssw(float f, ToolbarNestedScrollExpander toolbarNestedScrollExpander, CardNestedScrollExpander cardNestedScrollExpander, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        long m939getContainerSizeYbymL2g = ((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g();
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        ValueInsets valueInsets = Arrangement$End$1.current(gapComposer).statusBarsIgnoringVisibility;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
        float f2 = valueInsets.getValue$foundation_layout().top;
        gapComposer.startReplaceGroup(-1279207262);
        Density density = (Density) gapComposer.consume(staticProvidableCompositionLocal);
        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
        Object obj = DefaultSizes.border.entries;
        float mo236toPx0680j_4 = density.mo236toPx0680j_4(40.0f);
        gapComposer.end(false);
        float mo236toPx0680j_42 = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo236toPx0680j_4(60.0f);
        float mo236toPx0680j_43 = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo236toPx0680j_4(f);
        State cardTransitionState = CardTransitionKt.cardTransitionState(gapComposer);
        int i = (int) (m939getContainerSizeYbymL2g >> 32);
        int i2 = (int) (m939getContainerSizeYbymL2g & BodyPartID.bodyIdMax);
        float f3 = RecyclerView.DECELERATION_RATE;
        float floatValue = toolbarNestedScrollExpander != null ? toolbarNestedScrollExpander._toolbarHeight.getFloatValue() : 0.0f;
        if (cardNestedScrollExpander != null) {
            f3 = cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue();
        }
        return scrollTransitionProgress(i, i2, f2, floatValue, mo236toPx0680j_4, mo236toPx0680j_42, f3, ((Number) cardTransitionState.getValue()).floatValue(), mo236toPx0680j_43);
    }

    public static final Modifier evolutionBackground(Modifier modifier, RoundedCornerShape roundedCornerShape, Composer composer, int i) {
        Shape shape = roundedCornerShape;
        if ((i & 2) != 0) {
            shape = ColorKt.RectangleShape;
        }
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(689893091);
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j = colors.surface.money.background;
        gapComposer.end(false);
        return modifier.then(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, j, shape));
    }

    public static final boolean isFullyExpanded(ToolbarNestedScrollExpander toolbarNestedScrollExpander) {
        toolbarNestedScrollExpander.getClass();
        return toolbarNestedScrollExpander._toolbarScrollDelta.getFloatValue() == toolbarNestedScrollExpander._toolbarHeight.getFloatValue();
    }

    public static final float moneyTabHeroTagPeekOffset(TagFormFactor tagFormFactor) {
        int i = tagFormFactor == null ? -1 : MoneyTabSectionUIKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()];
        if (i == 1 || i == 2) {
            return 125.0f;
        }
        return (i == 3 || i == 4) ? 133.0f : 10.0f;
    }

    public static final float scrollTransitionProgress(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = i / 0.9006928f;
        float f9 = f + f2 + f3;
        float f10 = f5 - f4;
        if (f10 < RecyclerView.DECELERATION_RATE) {
            f10 = 0.0f;
        }
        return (((f6 * i2) + f10) - (((f8 - f9) - f4) - f7)) / f7;
    }
}
