package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.cash.ui.AlertBannerKt;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class MoneyTabUIKt {
    public static final void MoneyTabBackground(int i, Composer composer, Modifier modifier, CardNestedScrollExpander cardNestedScrollExpander, ToolbarNestedScrollExpander toolbarNestedScrollExpander, Image image, CardTheme.Identifier identifier, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(317876633);
        int i2 = (gapComposer.changed(identifier == null ? -1 : identifier.ordinal()) ? 32 : 16) | i | (gapComposer.changedInstance(image) ? 256 : 128) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(toolbarNestedScrollExpander) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(cardNestedScrollExpander) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            MoneyTabThemedHeaderKt.MoneyTabThemedHeader(((i2 >> 3) & 14) | 48 | (i2 & 896) | 3072 | (57344 & i2) | (458752 & i2) | (i2 & 3670016), gapComposer, modifier, cardNestedScrollExpander, toolbarNestedScrollExpander, image, identifier, z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipKt$$ExternalSyntheticLambda2(modifier, identifier, image, z, toolbarNestedScrollExpander, cardNestedScrollExpander, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public static final void MoneyTabLoaded(UiScope uiScope, Modifier modifier, MoneyTabModel.Loaded loaded, boolean z, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, CoroutineScope coroutineScope, int i, Function1 function1, Function0 function0, ElementBoundsRegistry elementBoundsRegistry, boolean z2, Composer composer, int i2) {
        GapComposer gapComposer;
        int i3;
        LazyListState lazyListState;
        NeverEqualPolicy neverEqualPolicy;
        ?? r13;
        Continuation continuation;
        boolean z3;
        ?? r1;
        Integer num;
        boolean z4;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-218702346);
        int i4 = i2 | (gapComposer2.changed(uiScope) ? 4 : 2) | (gapComposer2.changed(loaded) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024) | (gapComposer2.changedInstance(realScrollPerformanceTrackerFactory) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(coroutineScope) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(i) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(function12) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function0) ? 67108864 : 33554432) | (gapComposer2.changedInstance(elementBoundsRegistry) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && ((gapComposer2.changed(z2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            boolean z5 = loaded.trackVisibleIndexes;
            AlertBannerViewModel alertBannerViewModel = loaded.alertBannerViewModel;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z5) {
                gapComposer2.startReplaceGroup(104267905);
                Integer valueOf = Integer.valueOf(i);
                i3 = i4;
                boolean changed = gapComposer2.changed(rememberLazyListState) | ((i4 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    num = valueOf;
                    lazyListState = rememberLazyListState;
                    neverEqualPolicy = neverEqualPolicy2;
                    z4 = false;
                    z3 = true;
                    MoneyTabUIKt$MoneyTabLoaded$1$1 moneyTabUIKt$MoneyTabLoaded$1$1 = new MoneyTabUIKt$MoneyTabLoaded$1$1(lazyListState, i, function12, (Continuation) null, 0);
                    continuation = null;
                    gapComposer2.updateRememberedValue(moneyTabUIKt$MoneyTabLoaded$1$1);
                    rememberedValue = moneyTabUIKt$MoneyTabLoaded$1$1;
                } else {
                    lazyListState = rememberLazyListState;
                    num = valueOf;
                    neverEqualPolicy = neverEqualPolicy2;
                    continuation = null;
                    z4 = false;
                    z3 = true;
                }
                Updater.LaunchedEffect(lazyListState, num, (Function2) rememberedValue, gapComposer2);
                gapComposer2.end(z4);
                r13 = z4;
            } else {
                i3 = i4;
                lazyListState = rememberLazyListState;
                neverEqualPolicy = neverEqualPolicy2;
                r13 = 0;
                continuation = null;
                z3 = true;
                gapComposer2.startReplaceGroup(104524492);
                gapComposer2.end(false);
            }
            int i5 = loaded.scrollToTopTick;
            if (i5 > 0) {
                gapComposer2.startReplaceGroup(104601310);
                Integer valueOf2 = Integer.valueOf(i5);
                boolean changed2 = gapComposer2.changed(lazyListState);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, continuation, r13);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer2, valueOf2, (Function2) rememberedValue2);
                gapComposer2.end(r13);
            } else {
                gapComposer2.startReplaceGroup(104676268);
                gapComposer2.end(r13);
            }
            boolean changed3 = gapComposer2.changed(alertBannerViewModel);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boolean.valueOf(alertBannerViewModel != null ? z3 : r13);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            boolean booleanValue = ((Boolean) rememberedValue3).booleanValue();
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            AlertBannerViewModel alertBannerViewModel2 = loaded.alertBannerViewModel;
            int i6 = i3 & 29360128;
            boolean z6 = i6 == 8388608 ? z3 : r13;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z6 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new CashMapViewKt$$ExternalSyntheticLambda4(29, function12);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            boolean z7 = z3;
            MoneyTabUIKt$$ExternalSyntheticLambda20 moneyTabUIKt$$ExternalSyntheticLambda20 = new MoneyTabUIKt$$ExternalSyntheticLambda20(function12, function0, loaded, z, lazyListState, uiScope, elementBoundsRegistry, z2, realScrollPerformanceTrackerFactory, coroutineScope, booleanValue);
            function12 = function12;
            gapComposer = gapComposer2;
            AlertBannerKt.AlertBannerContainer(alertBannerViewModel2, fillMaxSize, (Function0) rememberedValue4, Expect_jvmKt.rememberComposableLambda(-173904448, moneyTabUIKt$$ExternalSyntheticLambda20, gapComposer2), gapComposer, 24576);
            boolean z8 = i6 == 8388608 ? z7 ? 1 : 0 : false;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z8 || rememberedValue5 == neverEqualPolicy3) {
                r1 = 0;
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda21(0, function12);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                r1 = 0;
            }
            DBUtil.BackHandler(r1, (Function0) rememberedValue5, gapComposer, r1, z7 ? 1 : 0);
            Unit unit = Unit.INSTANCE;
            boolean z9 = i6 == 8388608 ? z7 ? 1 : 0 : r1;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (z9 || rememberedValue6 == neverEqualPolicy3) {
                rememberedValue6 = new TaxAuthorizationView$Content$1$1(function12, (Continuation) null, 7);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda22(uiScope, modifier, loaded, z, realScrollPerformanceTrackerFactory, coroutineScope, i, function12, function0, elementBoundsRegistry, z2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void MoneyTabLoading(UiScope uiScope, Modifier modifier, TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, boolean z, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, boolean z2, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        int i2;
        Object obj;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1712453092);
        int i3 = i | (gapComposer2.changed(uiScope) ? 4 : 2) | (gapComposer2.changedInstance(tabToolbarInternalViewModel) ? 256 : 128) | (gapComposer2.changed(str) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(elementBoundsRegistry) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(z2) ? 8388608 : 4194304);
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj2 = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                obj2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            boolean changed = gapComposer2.changed(density) | gapComposer2.changed(8.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj3 = rememberedValue2;
            if (changed || rememberedValue2 == neverEqualPolicy) {
                Float valueOf = Float.valueOf(density.mo236toPx0680j_4(8.0f));
                gapComposer2.updateRememberedValue(valueOf);
                obj3 = valueOf;
            }
            float floatValue = ((Number) obj3).floatValue();
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.subtle;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            boolean changed2 = gapComposer2.changed(floatValue);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                i2 = 0;
                MoneyTabUIKt$$ExternalSyntheticLambda12 moneyTabUIKt$$ExternalSyntheticLambda12 = new MoneyTabUIKt$$ExternalSyntheticLambda12(floatValue, parcelableSnapshotMutableIntState, i2);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda12);
                obj = moneyTabUIKt$$ExternalSyntheticLambda12;
            } else {
                i2 = 0;
                obj = rememberedValue3;
            }
            Modifier layout = ValueInsets.layout(companion, (Function3) obj);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj4 = rememberedValue4;
            if (rememberedValue4 == neverEqualPolicy) {
                MoneyTabUIKt$$ExternalSyntheticLambda13 moneyTabUIKt$$ExternalSyntheticLambda13 = new MoneyTabUIKt$$ExternalSyntheticLambda13(i2);
                gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda13);
                obj4 = moneyTabUIKt$$ExternalSyntheticLambda13;
            }
            int i4 = i3 >> 3;
            boolean z3 = i2;
            MoneyTabToolbarKt.MoneyTabToolbar(uiScope, tabToolbarInternalViewModel, str, null, null, null, elementBoundsRegistry, function1, SemanticsModifierKt.clearAndSetSemantics(layout, (Function1) obj4), false, z2, gapComposer2, (i3 & 14) | 224256 | (i4 & 112) | (i4 & 896) | (i3 & 3670016) | (29360128 & (i3 << 6)), (i3 >> 21) & 14, 256);
            GapComposer gapComposer3 = gapComposer2;
            String stringResource = Room.stringResource(gapComposer3, R.string.money_tab_loading_shimmer_content_description);
            Object rememberedValue5 = gapComposer3.rememberedValue();
            Object obj5 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(mutableStateOf$default);
                obj5 = mutableStateOf$default;
            }
            MutableState mutableState = (MutableState) obj5;
            Unit unit = Unit.INSTANCE;
            Object rememberedValue6 = gapComposer3.rememberedValue();
            Object obj6 = rememberedValue6;
            if (rememberedValue6 == neverEqualPolicy) {
                HeroCardViewKt$Render$1$8$1.AnonymousClass3 anonymousClass3 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 8);
                gapComposer3.updateRememberedValue(anonymousClass3);
                obj6 = anonymousClass3;
            }
            Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj6);
            modifier2 = modifier;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
            Object rememberedValue7 = gapComposer3.rememberedValue();
            Object obj7 = rememberedValue7;
            if (rememberedValue7 == neverEqualPolicy) {
                MoneyTabUIKt$$ExternalSyntheticLambda14 moneyTabUIKt$$ExternalSyntheticLambda14 = new MoneyTabUIKt$$ExternalSyntheticLambda14(z3 ? 1 : 0, parcelableSnapshotMutableIntState);
                gapComposer3.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda14);
                obj7 = moneyTabUIKt$$ExternalSyntheticLambda14;
            }
            Modifier offset = OffsetKt.offset(fillMaxSize, (Function1) obj7);
            boolean changed3 = gapComposer3.changed(stringResource);
            Object rememberedValue8 = gapComposer3.rememberedValue();
            Object obj8 = rememberedValue8;
            if (changed3 || rememberedValue8 == neverEqualPolicy) {
                ClusterItemKt$$ExternalSyntheticLambda3 clusterItemKt$$ExternalSyntheticLambda3 = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 12);
                gapComposer3.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda3);
                obj8 = clusterItemKt$$ExternalSyntheticLambda3;
            }
            VisibleKt.ShimmerBox(SemanticsModifierKt.semantics(offset, z3, (Function1) obj8), ((Boolean) mutableState.getValue()).booleanValue(), null, Expect_jvmKt.rememberComposableLambda(419817491, new MoneyTabUIKt$$ExternalSyntheticLambda16(rememberLazyListState, z, z3 ? 1 : 0), gapComposer3), gapComposer3, 3072, 4);
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            modifier2 = modifier;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda17(uiScope, modifier2, tabToolbarInternalViewModel, str, z, function1, elementBoundsRegistry, z2, i);
        }
    }

    public static final void MoneyTabScaffold(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, final int i, final float f, ComposableLambdaImpl composableLambdaImpl3, Modifier modifier, final int i2, Composer composer, int i3) {
        ComposableLambdaImpl composableLambdaImpl4;
        ComposableLambdaImpl composableLambdaImpl5;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1098151110);
        Applier applier = gapComposer.applier;
        int i4 = i3 | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(f) ? 2048 : 1024) | 196608 | (gapComposer.changed(i2) ? 1048576 : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | ((3670016 & i4) == 1048576);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MeasurePolicy() { // from class: com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabScaffold$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                        measureScope.getClass();
                        list.getClass();
                        int m1024getMaxHeightimpl = (Constraints.m1024getMaxHeightimpl(j) - i) + i2;
                        final Placeable mo833measureBRTryo0 = ((Measurable) list.get(0)).mo833measureBRTryo0(j);
                        final Placeable mo833measureBRTryo02 = ((Measurable) list.get(1)).mo833measureBRTryo0(j);
                        final Placeable mo833measureBRTryo03 = ((Measurable) list.get(2)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, m1024getMaxHeightimpl, 7));
                        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                        int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(j);
                        final float f2 = f;
                        final int i5 = i;
                        final int i6 = i2;
                        return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, m1024getMaxHeightimpl2, new Function1() { // from class: com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabScaffold$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                placementScope.getClass();
                                placementScope.placeRelative(Placeable.this, 0, 0, RecyclerView.DECELERATION_RATE);
                                placementScope.placeRelative(mo833measureBRTryo02, 0, 0, f2);
                                placementScope.placeRelative(mo833measureBRTryo03, 0, i5 - i6, RecyclerView.DECELERATION_RATE);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl4 = composableLambdaImpl2;
            composableLambdaImpl4.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl5 = composableLambdaImpl3;
            composableLambdaImpl5.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            composableLambdaImpl4 = composableLambdaImpl2;
            composableLambdaImpl5 = composableLambdaImpl3;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda37(composableLambdaImpl, composableLambdaImpl4, i, f, composableLambdaImpl5, modifier2, i2, i3);
        }
    }

    public static final void MoneyTabUI(MoneyTabModel moneyTabModel, Function1 function1, RealImageLoader realImageLoader, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, ElementBoundsRegistry elementBoundsRegistry, Function0 function0, boolean z, Composer composer, int i, int i2) {
        Function1 function12;
        ElementBoundsRegistry elementBoundsRegistry2;
        int i3;
        Function0 function02;
        int i4;
        boolean z2;
        int i5;
        ElementBoundsRegistry elementBoundsRegistry3;
        Function0 function03;
        boolean z3;
        moneyTabModel.getClass();
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-875267930);
        int i6 = i | ((i & 8) == 0 ? gapComposer.changed(moneyTabModel) : gapComposer.changedInstance(moneyTabModel) ? 4 : 2);
        if ((i & 48) == 0) {
            function12 = function1;
            i6 |= gapComposer.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        int i7 = i6 | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changedInstance(realScrollPerformanceTrackerFactory) ? 2048 : 1024);
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i7 | 24576;
            elementBoundsRegistry2 = elementBoundsRegistry;
        } else {
            elementBoundsRegistry2 = elementBoundsRegistry;
            i3 = i7 | (gapComposer.changedInstance(elementBoundsRegistry2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i4 = i3 | 196608;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i3 | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i10 = i2 & 64;
        if (i10 != 0) {
            i5 = i4 | 1572864;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (gapComposer.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            if (i8 != 0) {
                elementBoundsRegistry2 = null;
            }
            Function0 function04 = i9 != 0 ? null : function02;
            z3 = i10 != 0 ? false : z2;
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-633528221, new MoneyTabUIKt$$ExternalSyntheticLambda0(realImageLoader, moneyTabModel, realScrollPerformanceTrackerFactory, function12, function04, elementBoundsRegistry2, z3), gapComposer), gapComposer, 6);
            ElementBoundsRegistry elementBoundsRegistry4 = elementBoundsRegistry2;
            function03 = function04;
            elementBoundsRegistry3 = elementBoundsRegistry4;
        } else {
            gapComposer.skipToGroupEnd();
            elementBoundsRegistry3 = elementBoundsRegistry2;
            function03 = function02;
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(moneyTabModel, function1, realImageLoader, realScrollPerformanceTrackerFactory, elementBoundsRegistry3, function03, z3, i, i2);
        }
    }

    public static final MutableState statusBarThreshold(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(10.0f);
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        return Updater.rememberUpdatedState(Integer.valueOf(Arrangement$End$1.current(gapComposer).statusBarsIgnoringVisibility.getValue$foundation_layout().top + mo230roundToPx0680j_4), gapComposer);
    }
}
