package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt$plus$1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.GridItemVisual;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda28;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PaymentDeviceCustomizationViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        new Image("fake:///pdp_image_carousel_2.webp", "fake:///pdp_image_carousel_1.webp", 4);
    }

    /* renamed from: FallbackCardVisual--b7W0Lw, reason: not valid java name */
    public static final void m3436FallbackCardVisualb7W0Lw(final PaymentDeviceItemViewModel paymentDeviceItemViewModel, final boolean z, final float f, final float f2, final SharedTransitionScope sharedTransitionScope, final AnimatedVisibilityScope animatedVisibilityScope, final Modifier modifier, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1123457704);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paymentDeviceItemViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(sharedTransitionScope) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(animatedVisibilityScope) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            OffsetKt.BoxWithConstraints(modifier, Alignment.Companion.Center, false, Expect_jvmKt.rememberComposableLambda(-1211732802, new Function3() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        PaymentDeviceItemViewModel paymentDeviceItemViewModel2 = paymentDeviceItemViewModel;
                        String str = "card-" + paymentDeviceItemViewModel2.id;
                        SharedTransitionScope sharedTransitionScope2 = SharedTransitionScope.this;
                        SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope2.rememberSharedContentState(str, gapComposer2, 0);
                        GridItemVisual gridItemVisual = paymentDeviceItemViewModel2.visual;
                        boolean z2 = gridItemVisual instanceof GridItemVisual.Card;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (z2) {
                            gapComposer2.startReplaceGroup(468396037);
                            Modifier fillMaxSize = z ? SizeKt.fillMaxSize(companion, 1.0f) : SizeKt.m287sizeVpY3zN4(companion, boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM(), boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
                            StyledCardViewModel styledCardViewModel = ((GridItemVisual.Card) gridItemVisual).viewModel;
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new SharedBoundsNode$$ExternalSyntheticLambda0(6);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(sharedTransitionScope2, fillMaxSize, rememberSharedContentState, animatedVisibilityScope2, (BoundsTransform) rememberedValue, null, 120);
                            float f3 = f;
                            boolean changed = gapComposer2.changed(f3);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new PulsingState$$ExternalSyntheticLambda0(f3, 5);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, ColorKt.graphicsLayer(sharedElement$default, (Function1) rememberedValue2), null, RecyclerView.DECELERATION_RATE, f2, false, gapComposer2, 196608, 12);
                            gapComposer2.end(false);
                        } else {
                            if (!(gridItemVisual instanceof GridItemVisual.Tag)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -539080529, false);
                            }
                            gapComposer2.startReplaceGroup(469269152);
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new SharedBoundsNode$$ExternalSyntheticLambda0(7);
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            Modifier sharedElement$default2 = SharedTransitionScope.sharedElement$default(sharedTransitionScope2, fillMaxSize2, rememberSharedContentState, animatedVisibilityScope2, (BoundsTransform) rememberedValue3, null, 120);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, sharedElement$default2);
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
                            int ordinal = ((GridItemVisual.Tag) gridItemVisual).viewModel.formFactor.ordinal();
                            if (ordinal == 0) {
                                i3 = R.drawable.fallback_wand;
                            } else if (ordinal == 1) {
                                i3 = R.drawable.fallback_heart;
                            } else if (ordinal == 2) {
                                i3 = R.drawable.fallback_mini_card;
                            } else if (ordinal == 3) {
                                i3 = R.drawable.fallback_wand_first_edition;
                            } else if (ordinal == 4) {
                                i3 = R.drawable.fallback_heart_first_edition;
                            } else {
                                if (ordinal != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i3 = R.drawable.fallback_mini_card_first_edition;
                            }
                            ImageKt.Image(Countries.painterResource(i3, 0, gapComposer2), null, null, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable | 24624, 108);
                            gapComposer2.end(true);
                            gapComposer2.end(false);
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i2 >> 18) & 14) | 3120, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PaymentDeviceCustomizationViewKt.m3436FallbackCardVisualb7W0Lw(PaymentDeviceItemViewModel.this, z, f, f2, sharedTransitionScope, animatedVisibilityScope, modifier, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: FallbackGrid-jIwJxvA, reason: not valid java name */
    public static final void m3437FallbackGridjIwJxvA(final List list, final String str, final float f, final float f2, final SharedTransitionScope sharedTransitionScope, final AnimatedVisibilityScope animatedVisibilityScope, final Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(984387102);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(sharedTransitionScope) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(animatedVisibilityScope) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            OffsetKt.BoxWithConstraints(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(-935761676, new Function3() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        GridCells.Fixed fixed = new GridCells.Fixed(RangesKt___RangesKt.coerceIn((int) (boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() / 90.0f), 4, 6));
                        Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer2).systemBars, gapComposer2);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                        DefaultSizes.spacing.getClass();
                        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                        PaddingKt$plus$1 paddingKt$plus$1 = new PaddingKt$plus$1(asPaddingValues, new PaddingValuesImpl(16.0f, 64.0f, 16.0f, 12.0f));
                        Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                        Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                        final List list2 = list;
                        boolean changedInstance = gapComposer2.changedInstance(list2);
                        final Function1 function12 = function1;
                        boolean changed = changedInstance | gapComposer2.changed(function12);
                        final String str2 = str;
                        boolean changed2 = changed | gapComposer2.changed(str2);
                        final float f3 = f;
                        boolean changed3 = changed2 | gapComposer2.changed(f3);
                        final float f4 = f2;
                        boolean changed4 = changed3 | gapComposer2.changed(f4);
                        final SharedTransitionScope sharedTransitionScope2 = sharedTransitionScope;
                        boolean changed5 = changed4 | gapComposer2.changed(sharedTransitionScope2);
                        final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                        boolean changedInstance2 = changed5 | gapComposer2.changedInstance(animatedVisibilityScope2);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue == Composer.Companion.Empty) {
                            Function1 function13 = new Function1() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda45
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj4;
                                    lazyGridIntervalContent.getClass();
                                    CalendarRowKt$$ExternalSyntheticLambda10 calendarRowKt$$ExternalSyntheticLambda10 = new CalendarRowKt$$ExternalSyntheticLambda10(22);
                                    final List list3 = list2;
                                    int size = list3.size();
                                    Latch$await$2$2 latch$await$2$2 = new Latch$await$2$2(29, calendarRowKt$$ExternalSyntheticLambda10, list3);
                                    SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3 sectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3 = new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list3, 12);
                                    final Function1 function14 = function12;
                                    final String str3 = str2;
                                    final float f5 = f3;
                                    final float f6 = f4;
                                    final SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                                    final AnimatedVisibilityScope animatedVisibilityScope3 = animatedVisibilityScope2;
                                    lazyGridIntervalContent.items(size, latch$await$2$2, null, sectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$FallbackGrid_jIwJxvA$lambda$0$0$0$$inlined$items$default$5
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            int i3;
                                            float f7;
                                            LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj5;
                                            int intValue2 = ((Number) obj6).intValue();
                                            Composer composer3 = (Composer) obj7;
                                            int intValue3 = ((Number) obj8).intValue();
                                            if ((intValue3 & 6) == 0) {
                                                i3 = (((GapComposer) composer3).changed(lazyGridItemScopeImpl) ? 4 : 2) | intValue3;
                                            } else {
                                                i3 = intValue3;
                                            }
                                            if ((intValue3 & 48) == 0) {
                                                i3 |= ((GapComposer) composer3).changed(intValue2) ? 32 : 16;
                                            }
                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                            if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                                                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) list3.get(intValue2);
                                                gapComposer3.startReplaceGroup(-1940980643);
                                                Object obj9 = function14;
                                                boolean changed6 = gapComposer3.changed(obj9) | gapComposer3.changedInstance(paymentDeviceItemViewModel);
                                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                                Object obj10 = Composer.Companion.Empty;
                                                if (changed6 || rememberedValue2 == obj10) {
                                                    rememberedValue2 = new CardModelView$1$3$4$2(11, obj9, paymentDeviceItemViewModel);
                                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                                }
                                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue2, 15), 1.0f);
                                                boolean changedInstance3 = gapComposer3.changedInstance(paymentDeviceItemViewModel);
                                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                                if (changedInstance3 || rememberedValue3 == obj10) {
                                                    rememberedValue3 = new KClasses$$Lambda$2(paymentDeviceItemViewModel, 13);
                                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                                }
                                                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue3);
                                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, semantics);
                                                ComposeUiNode.Companion.getClass();
                                                Function0 function0 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer3.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(function0);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                boolean areEqual = Intrinsics.areEqual(paymentDeviceItemViewModel.id, str3);
                                                float f8 = areEqual ? f5 : 90.0f;
                                                if (areEqual) {
                                                    f7 = f6;
                                                } else {
                                                    int i4 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                                                    f7 = 4.0f;
                                                }
                                                PaymentDeviceCustomizationViewKt.m3436FallbackCardVisualb7W0Lw(paymentDeviceItemViewModel, false, f8, f7, sharedTransitionScope3, animatedVisibilityScope3, OffsetKt.aspectRatio(0.6306075f, SizeKt.fillMaxWidth(companion, 1.0f), false), gapComposer3, 1572912);
                                                PaymentDeviceAvailabilityStyleKt.CardOverlayContent(paymentDeviceItemViewModel, ZoomLevel.FAR, gapComposer3, 48);
                                                gapComposer3.end(true);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, -1117249557));
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer2.updateRememberedValue(function13);
                            rememberedValue = function13;
                        }
                        LazyGridDslKt.LazyVerticalGrid(fixed, fillMaxSize, null, paddingKt$plus$1, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue, gapComposer2, 1769520, 916);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3078, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgedBoxKt$$ExternalSyntheticLambda2(list, str, f, f2, sharedTransitionScope, animatedVisibilityScope, function1, i);
        }
    }

    /* renamed from: FallbackHero-942rkJo, reason: not valid java name */
    public static final void m3438FallbackHero942rkJo(PaymentDeviceItemViewModel paymentDeviceItemViewModel, float f, float f2, SharedTransitionScope sharedTransitionScope, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-722117941);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paymentDeviceItemViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(sharedTransitionScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(animatedVisibilityScope) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 96.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, SizeKt.fillMaxWidth(SpacerKt.padding(m302paddingqDBjuR0$default, SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).statusBars, gapComposer)), 0.75f), false);
            int i3 = (i2 & 14) | 48;
            int i4 = i2 << 3;
            m3436FallbackCardVisualb7W0Lw(paymentDeviceItemViewModel, true, f, f2, sharedTransitionScope, animatedVisibilityScope, aspectRatio, gapComposer, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda41(paymentDeviceItemViewModel, f, f2, sharedTransitionScope, animatedVisibilityScope, i, 0);
        }
    }

    public static final void PaymentDeviceCustomizationView(PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel, Function1 function1, Composer composer, int i) {
        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel2;
        GapComposer gapComposer;
        PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0 paymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0;
        RecomposeScopeImpl recomposeScopeImpl;
        boolean booleanValue;
        int i2;
        Object obj;
        EnterTransitionImpl slideInVertically$default;
        int i3;
        MutableState mutableState;
        Object obj2;
        Object anonymousClass1;
        String str;
        int i4;
        EnterTransitionImpl enterTransitionImpl;
        NeverEqualPolicy neverEqualPolicy;
        int i5;
        int i6;
        MutableState mutableState2;
        List list;
        CardDesignLibraryState cardDesignLibraryState;
        Unit unit;
        Function1 function12 = function1;
        paymentDeviceCustomizationViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1266738287);
        int i7 = (gapComposer2.changedInstance(paymentDeviceCustomizationViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        int i8 = i7;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Object obj3 = rememberedValue;
            if (rememberedValue == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(mutableStateOf$default);
                obj3 = mutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) obj3;
            if (paymentDeviceCustomizationViewModel.disable3D) {
                gapComposer2.startReplaceGroup(-1817430571);
                gapComposer2.end(false);
                booleanValue = true;
            } else {
                gapComposer2.startReplaceGroup(-1859741096);
                booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                gapComposer2.end(false);
            }
            if (booleanValue || ((Boolean) mutableState3.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(-1817370234);
                PaymentDeviceCustomizationViewFallback(paymentDeviceCustomizationViewModel, function12, gapComposer2, i8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer2.end(false);
                recomposeScopeImpl = gapComposer2.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    paymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0 = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0(paymentDeviceCustomizationViewModel, function12, i, 0);
                    recomposeScopeImpl.block = paymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0;
                }
                return;
            }
            gapComposer2.startReplaceGroup(-1817298159);
            gapComposer2.end(false);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(paymentDeviceCustomizationViewModel.items, gapComposer2);
            List list2 = (List) rememberUpdatedState.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) it.next();
                String str2 = paymentDeviceItemViewModel.id;
                GridItemVisual gridItemVisual = paymentDeviceItemViewModel.visual;
                String str3 = paymentDeviceItemViewModel.name;
                String str4 = paymentDeviceItemViewModel.priceLabel;
                String str5 = paymentDeviceItemViewModel.accessibilityText;
                PaymentDeviceAvailability paymentDeviceAvailability = paymentDeviceItemViewModel.availability;
                Iterator it2 = it;
                AvailabilityPill availabilityPill = paymentDeviceItemViewModel.availabilityPill;
                Image image = paymentDeviceItemViewModel.backgroundImage;
                str2.getClass();
                gridItemVisual.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                paymentDeviceAvailability.getClass();
                arrayList.add(new PaymentDeviceItemViewModel(str2, gridItemVisual, str3, str4, str5, paymentDeviceAvailability, availabilityPill, null, image));
                it = it2;
            }
            boolean changed = gapComposer2.changed(arrayList);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj4 = rememberedValue2;
            if (changed || rememberedValue2 == neverEqualPolicy2) {
                List list3 = (List) rememberUpdatedState.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((PaymentDeviceItemViewModel) it3.next()).visual);
                }
                gapComposer2.updateRememberedValue(arrayList2);
                obj4 = arrayList2;
            }
            List list4 = (List) obj4;
            Object[] objArr = new Object[0];
            WorkLauncherImpl workLauncherImpl = CardDesignLibraryState.Saver;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            Object obj5 = rememberedValue3;
            if (rememberedValue3 == neverEqualPolicy2) {
                CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda1 = new CardScene$$ExternalSyntheticLambda1(17);
                gapComposer2.updateRememberedValue(cardScene$$ExternalSyntheticLambda1);
                obj5 = cardScene$$ExternalSyntheticLambda1;
            }
            CardDesignLibraryState cardDesignLibraryState2 = (CardDesignLibraryState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) obj5, (Composer) gapComposer2, MLKEMEngine.KyberPolyBytes);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            boolean changed2 = gapComposer2.changed(rememberScrollState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj6 = rememberedValue4;
            if (changed2 || rememberedValue4 == neverEqualPolicy2) {
                PdpPanelState pdpPanelState = new PdpPanelState(rememberScrollState);
                gapComposer2.updateRememberedValue(pdpPanelState);
                obj6 = pdpPanelState;
            }
            PdpPanelState pdpPanelState2 = (PdpPanelState) obj6;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj7 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy2) {
                obj7 = Recorder$$ExternalSyntheticOutline1.m(cardDesignLibraryState2.getZoomLevel() == ZoomLevel.NEAR, gapComposer2);
            }
            MutableState mutableState4 = (MutableState) obj7;
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(-1859706027);
                gapComposer2.end(false);
                slideInVertically$default = EnterTransitionImpl.None;
                i3 = 0;
            } else {
                gapComposer2.startReplaceGroup(-1859705669);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy2) {
                    i2 = 1;
                    SvgDecoder$$ExternalSyntheticLambda0 svgDecoder$$ExternalSyntheticLambda0 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                    gapComposer2.updateRememberedValue(svgDecoder$$ExternalSyntheticLambda0);
                    obj = svgDecoder$$ExternalSyntheticLambda0;
                } else {
                    i2 = 1;
                    obj = rememberedValue6;
                }
                slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(i2, (Function1) obj);
                i3 = 0;
                gapComposer2.end(false);
            }
            EnterTransitionImpl enterTransitionImpl2 = slideInVertically$default;
            Object[] objArr2 = new Object[i3];
            Object rememberedValue7 = gapComposer2.rememberedValue();
            Object obj8 = rememberedValue7;
            if (rememberedValue7 == neverEqualPolicy2) {
                CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda12 = new CardScene$$ExternalSyntheticLambda1(9);
                gapComposer2.updateRememberedValue(cardScene$$ExternalSyntheticLambda12);
                obj8 = cardScene$$ExternalSyntheticLambda12;
            }
            MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) obj8, gapComposer2, 48);
            Object[] objArr3 = new Object[0];
            Object rememberedValue8 = gapComposer2.rememberedValue();
            Object obj9 = rememberedValue8;
            if (rememberedValue8 == neverEqualPolicy2) {
                CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda13 = new CardScene$$ExternalSyntheticLambda1(10);
                gapComposer2.updateRememberedValue(cardScene$$ExternalSyntheticLambda13);
                obj9 = cardScene$$ExternalSyntheticLambda13;
            }
            MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) obj9, gapComposer2, 48);
            Object[] objArr4 = new Object[0];
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy2) {
                mutableState = mutableState4;
                CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda14 = new CardScene$$ExternalSyntheticLambda1(11);
                gapComposer2.updateRememberedValue(cardScene$$ExternalSyntheticLambda14);
                obj2 = cardScene$$ExternalSyntheticLambda14;
            } else {
                mutableState = mutableState4;
                obj2 = rememberedValue9;
            }
            MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) obj2, gapComposer2, 48);
            String str6 = paymentDeviceCustomizationViewModel.focusedDeviceId;
            boolean changedInstance = gapComposer2.changedInstance(list4) | gapComposer2.changed(mutableState5) | gapComposer2.changed(mutableState7) | gapComposer2.changedInstance(paymentDeviceCustomizationViewModel) | gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(mutableState6) | gapComposer2.changed(cardDesignLibraryState2);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue10 == neverEqualPolicy2) {
                str = str6;
                i4 = 1;
                enterTransitionImpl = enterTransitionImpl2;
                neverEqualPolicy = neverEqualPolicy2;
                MutableState mutableState8 = mutableState;
                i5 = i8;
                i6 = 0;
                anonymousClass1 = new Hero3DCardViewKt$InteractiveCard$13$touchInput$1$1.AnonymousClass1(list4, paymentDeviceCustomizationViewModel, cardDesignLibraryState2, mutableState5, mutableState7, rememberUpdatedState, mutableState6, mutableState8, (Continuation) null);
                mutableState2 = mutableState8;
                list = list4;
                cardDesignLibraryState = cardDesignLibraryState2;
                gapComposer2.updateRememberedValue(anonymousClass1);
            } else {
                anonymousClass1 = rememberedValue10;
                str = str6;
                enterTransitionImpl = enterTransitionImpl2;
                mutableState2 = mutableState;
                i4 = 1;
                neverEqualPolicy = neverEqualPolicy2;
                cardDesignLibraryState = cardDesignLibraryState2;
                list = list4;
                i5 = i8;
                i6 = 0;
            }
            Updater.LaunchedEffect(list, str, (Function2) anonymousClass1, gapComposer2);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Continuation continuation = null;
            Object obj10 = rememberedValue11;
            if (rememberedValue11 == neverEqualPolicy) {
                ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(mutableStateOf$default2);
                obj10 = mutableStateOf$default2;
            }
            MutableState mutableState9 = (MutableState) obj10;
            Object[] objArr5 = new Object[i6];
            Object rememberedValue12 = gapComposer2.rememberedValue();
            Object obj11 = rememberedValue12;
            if (rememberedValue12 == neverEqualPolicy) {
                CardScene$$ExternalSyntheticLambda1 cardScene$$ExternalSyntheticLambda15 = new CardScene$$ExternalSyntheticLambda1(12);
                gapComposer2.updateRememberedValue(cardScene$$ExternalSyntheticLambda15);
                obj11 = cardScene$$ExternalSyntheticLambda15;
            }
            MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) obj11, gapComposer2, 48);
            Unit unit2 = Unit.INSTANCE;
            int i9 = (gapComposer2.changed(cardDesignLibraryState) ? 1 : 0) | (gapComposer2.changed(rememberUpdatedState) ? 1 : 0) | (gapComposer2.changed(mutableState10) ? 1 : 0) | ((i5 & 112) == 32 ? i4 : i6);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (i9 != 0 || rememberedValue13 == neverEqualPolicy) {
                unit = unit2;
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(cardDesignLibraryState, rememberUpdatedState, function1, mutableState10, mutableState9, null, 7);
                rememberUpdatedState = rememberUpdatedState;
                gapComposer2.updateRememberedValue(realBlockersHelper$skipBlocker$1);
                rememberedValue13 = realBlockersHelper$skipBlocker$1;
            } else {
                unit = unit2;
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue13);
            ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) mutableState9.getValue();
            boolean changed3 = gapComposer2.changed(pdpPanelState2);
            Object rememberedValue14 = gapComposer2.rememberedValue();
            Object obj12 = rememberedValue14;
            if (changed3 || rememberedValue14 == neverEqualPolicy) {
                PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2(pdpPanelState2, mutableState9, continuation, 20);
                gapComposer2.updateRememberedValue(anonymousClass2);
                obj12 = anonymousClass2;
            }
            Updater.LaunchedEffect(gapComposer2, productDetailsPageViewModel, (Function2) obj12);
            paymentDeviceCustomizationViewModel2 = paymentDeviceCustomizationViewModel;
            function12 = function1;
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1489665050, new NavHostKt$$ExternalSyntheticLambda2(cardDesignLibraryState, paymentDeviceCustomizationViewModel, pdpPanelState2, function1, enterTransitionImpl, rememberUpdatedState, list, mutableState3, mutableState2), gapComposer2), gapComposer, 3072, 7);
        } else {
            paymentDeviceCustomizationViewModel2 = paymentDeviceCustomizationViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            paymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0 = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0(paymentDeviceCustomizationViewModel2, function12, i, 2);
            recomposeScopeImpl.block = paymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0;
        }
    }

    public static final void PaymentDeviceCustomizationViewFallback(final PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel, final Function1 function1, Composer composer, int i) {
        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel2;
        GapComposer gapComposer;
        Function1 function12;
        Object moleculeKt$immediateClockFlow$1$1$1;
        ZoomLevel zoomLevel;
        MutableState mutableState;
        Object obj;
        int i2;
        EnterTransitionImpl slideInVertically;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1549091693);
        int i3 = i | (gapComposer2.changedInstance(paymentDeviceCustomizationViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            final ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            List list = paymentDeviceCustomizationViewModel.items;
            ZoomLevel zoomLevel2 = paymentDeviceCustomizationViewModel.initialZoomLevel;
            String str = (list.isEmpty() || zoomLevel2 != ZoomLevel.NEAR) ? null : paymentDeviceCustomizationViewModel.focusedDeviceId;
            Object[] objArr = new Object[0];
            boolean changed = gapComposer2.changed(str);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new UriUtils$$ExternalSyntheticLambda2(str, 28);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer2, 0);
            Object[] objArr2 = new Object[0];
            boolean changed2 = gapComposer2.changed(str);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == obj2) {
                rememberedValue3 = new UriUtils$$ExternalSyntheticLambda2(str, 29);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Object obj3 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue3, gapComposer2, 0);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj2) {
                rememberedValue5 = Recorder$$ExternalSyntheticOutline1.m(str != null, gapComposer2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj2) {
                rememberedValue6 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue6;
            boolean changed3 = ((i3 & 112) == 32) | gapComposer2.changed(obj3) | gapComposer2.changedInstance(paymentDeviceCustomizationViewModel) | gapComposer2.changed(mutableState2);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue7 == obj2) {
                zoomLevel = zoomLevel2;
                moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(paymentDeviceCustomizationViewModel, function1, obj3, mutableState2, mutableState4, null, 11);
                mutableState = mutableState2;
                gapComposer2.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
            } else {
                zoomLevel = zoomLevel2;
                moleculeKt$immediateClockFlow$1$1$1 = rememberedValue7;
                mutableState = mutableState2;
            }
            Updater.LaunchedEffect(list, zoomLevel, (Function2) moleculeKt$immediateClockFlow$1$1$1, gapComposer2);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((PaymentDeviceItemViewModel) obj).id, (String) mutableState.getValue())) {
                        break;
                    }
                }
            }
            final PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) obj;
            ProductDetailsPageViewModel productDetailsPageViewModel = paymentDeviceItemViewModel != null ? paymentDeviceItemViewModel.productDetailsPage : null;
            TweenSpec tween$default = AnimatableKt.tween$default(700, 0, null, 6);
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(1676609431);
                gapComposer2.end(false);
                slideInVertically = EnterTransitionImpl.None;
                i2 = 1;
            } else {
                gapComposer2.startReplaceGroup(1676609947);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == obj2) {
                    i2 = 1;
                    rememberedValue8 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                } else {
                    i2 = 1;
                }
                slideInVertically = EnterExitTransitionKt.slideInVertically(tween$default, (Function1) rememberedValue8);
                gapComposer2.end(false);
            }
            final EnterTransitionImpl enterTransitionImpl = slideInVertically;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj2) {
                rememberedValue9 = new SvgDecoder$$ExternalSyntheticLambda0(i2);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            final ExitTransitionImpl slideOutVertically = EnterExitTransitionKt.slideOutVertically(tween$default, (Function1) rememberedValue9);
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((String) mutableState.getValue()) == null ? 90.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(700, 0, null, 6), "fallbackCardRotation", null, gapComposer2, 3120, 20);
            final State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(((String) mutableState.getValue()) == null ? 4.0f : 16.0f, AnimatableKt.tween$default(700, 0, null, 6), "fallbackCardCornerRadius", null, gapComposer2, 432, 8);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (rememberedValue10 == obj2) {
                rememberedValue10 = Updater.mutableStateOf$default((String) mutableState.getValue());
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            final MutableState mutableState6 = (MutableState) rememberedValue10;
            String str2 = (String) mutableState.getValue();
            boolean changed4 = gapComposer2.changed(mutableState);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue11 == obj2) {
                rememberedValue11 = new OffersHomePresenter$models$2$1(mutableState, mutableState6, null, 3);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            Updater.LaunchedEffect(gapComposer2, str2, (Function2) rememberedValue11);
            boolean changedInstance = gapComposer2.changedInstance(productDetailsPageViewModel);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue12 == obj2) {
                rememberedValue12 = new InteractiveCardView$flingTo$1.AnonymousClass2(productDetailsPageViewModel, mutableState4, (Continuation) null, 28);
                gapComposer2.updateRememberedValue(rememberedValue12);
            }
            Updater.LaunchedEffect(gapComposer2, productDetailsPageViewModel, (Function2) rememberedValue12);
            final MutableState mutableState7 = mutableState;
            final ProductDetailsPageViewModel productDetailsPageViewModel2 = productDetailsPageViewModel;
            Function2 function2 = new Function2() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
                        final PaymentDeviceItemViewModel paymentDeviceItemViewModel2 = PaymentDeviceItemViewModel.this;
                        final PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel3 = paymentDeviceCustomizationViewModel;
                        final MutableState mutableState8 = mutableState7;
                        final Function1 function13 = function1;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final ScrollState scrollState = rememberScrollState;
                        final ProductDetailsPageViewModel productDetailsPageViewModel3 = productDetailsPageViewModel2;
                        final EnterTransitionImpl enterTransitionImpl2 = enterTransitionImpl;
                        final ExitTransitionImpl exitTransitionImpl = slideOutVertically;
                        final MutableState mutableState9 = mutableState6;
                        final State state = animateFloatAsState;
                        final State state2 = m155animateDpAsStateAjpBEmI;
                        final MutableState mutableState10 = mutableState3;
                        final MutableState mutableState11 = mutableState5;
                        OffsetKt.BoxWithConstraints(fillMaxSize, null, false, Expect_jvmKt.rememberComposableLambda(-1941910338, new Function3() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                float f;
                                float f2;
                                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel4;
                                boolean z;
                                Modifier.Companion companion;
                                GapComposer gapComposer4;
                                Object obj9;
                                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl;
                                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj6;
                                Composer composer3 = (Composer) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                boxWithConstraintsScopeImpl2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(boxWithConstraintsScopeImpl2) ? 4 : 2;
                                }
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    float m258getMaxHeightD9Ej5fM = boxWithConstraintsScopeImpl2.m258getMaxHeightD9Ej5fM();
                                    float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl2.m259getMaxWidthD9Ej5fM();
                                    PaymentDeviceItemViewModel paymentDeviceItemViewModel3 = PaymentDeviceItemViewModel.this;
                                    PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel5 = paymentDeviceCustomizationViewModel3;
                                    Image image = paymentDeviceItemViewModel3 != null ? paymentDeviceItemViewModel3.backgroundImage : paymentDeviceCustomizationViewModel5.backgroundImage;
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    CrossfadeKt.Crossfade(image, boxScopeInstance.matchParentSize(), (FiniteAnimationSpec) null, "paymentDeviceBackground", CanvasKt.lambda$1819955824, gapComposer5, 27648, 4);
                                    final MutableState mutableState12 = mutableState8;
                                    String str3 = (String) mutableState12.getValue();
                                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                    if (str3 == null) {
                                        gapComposer5.startReplaceGroup(1759514248);
                                        Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1762997739);
                                            gapComposer5.end(false);
                                        }
                                        long j = colors2.semantic.background.f1047app;
                                        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14);
                                        f = m258getMaxHeightD9Ej5fM;
                                        f2 = m259getMaxWidthD9Ej5fM;
                                        boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                                        paymentDeviceCustomizationViewModel4 = paymentDeviceCustomizationViewModel5;
                                        companion = companion2;
                                        ChromeConfigKt.ChromeConfig(null, null, null, Boolean.TRUE, null, null, null, gapComposer5, 3072, 119);
                                        gapComposer4 = gapComposer5;
                                        obj9 = null;
                                        Modifier background$default = ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion, Alignment.Companion.BottomCenter), 1.0f), 120.0f), Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(m675copywmQWz5c$default), new Color(j)})), null, 6);
                                        z = false;
                                        BoxKt.Box(background$default, gapComposer4, 0);
                                        gapComposer4.end(false);
                                    } else {
                                        f = m258getMaxHeightD9Ej5fM;
                                        f2 = m259getMaxWidthD9Ej5fM;
                                        paymentDeviceCustomizationViewModel4 = paymentDeviceCustomizationViewModel5;
                                        z = false;
                                        companion = companion2;
                                        gapComposer4 = gapComposer5;
                                        obj9 = null;
                                        boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                                        gapComposer4.startReplaceGroup(1760094692);
                                        gapComposer4.end(false);
                                    }
                                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                                    final ScrollState scrollState2 = scrollState;
                                    final ProductDetailsPageViewModel productDetailsPageViewModel4 = productDetailsPageViewModel3;
                                    final EnterTransitionImpl enterTransitionImpl3 = enterTransitionImpl2;
                                    Modifier.Companion companion3 = companion;
                                    final ExitTransitionImpl exitTransitionImpl2 = exitTransitionImpl;
                                    final Function1 function14 = function13;
                                    final MutableState mutableState13 = mutableState9;
                                    final State state3 = state;
                                    final State state4 = state2;
                                    final MutableState mutableState14 = mutableState10;
                                    final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl3 = boxWithConstraintsScopeImpl;
                                    GapComposer gapComposer6 = gapComposer4;
                                    final PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel6 = paymentDeviceCustomizationViewModel4;
                                    final float f3 = f;
                                    final float f4 = f2;
                                    SharedTransitionScopeKt.SharedTransitionLayout(fillMaxSize2, Expect_jvmKt.rememberComposableLambda(-1359986308, new Function3() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda22
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            final SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj10;
                                            Composer composer4 = (Composer) obj11;
                                            int intValue3 = ((Integer) obj12).intValue();
                                            sharedTransitionScope.getClass();
                                            if ((intValue3 & 6) == 0) {
                                                intValue3 |= ((GapComposer) composer4).changed(sharedTransitionScope) ? 4 : 2;
                                            }
                                            GapComposer gapComposer7 = (GapComposer) composer4;
                                            boolean shouldExecute = gapComposer7.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18);
                                            Applier applier = gapComposer7.applier;
                                            if (shouldExecute) {
                                                final MutableState mutableState15 = mutableState12;
                                                boolean z2 = ((String) mutableState15.getValue()) != null;
                                                Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                                Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion4, ScrollState.this, z2, 12);
                                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                                                int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, verticalScroll$default);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                if (applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer7.startReusableNode();
                                                if (gapComposer7.inserting) {
                                                    gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                                                } else {
                                                    gapComposer7.useNode();
                                                }
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                                                Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                                Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                                                Integer valueOf = Integer.valueOf(hashCode);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                                Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$13);
                                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                                Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                                                Updater.m576setimpl(gapComposer7, materializeModifier, composeUiNode$Companion$SetModifier$14);
                                                float f5 = f3;
                                                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion4, f5);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m277height3ABfNKs);
                                                gapComposer7.startReusableNode();
                                                if (gapComposer7.inserting) {
                                                    gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                                                } else {
                                                    gapComposer7.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                                Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                                Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                                                String str4 = (String) mutableState15.getValue();
                                                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion4, 1.0f);
                                                Object rememberedValue13 = gapComposer7.rememberedValue();
                                                if (rememberedValue13 == Composer.Companion.Empty) {
                                                    rememberedValue13 = new CalendarRowKt$$ExternalSyntheticLambda10(21);
                                                    gapComposer7.updateRememberedValue(rememberedValue13);
                                                }
                                                final PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel7 = paymentDeviceCustomizationViewModel6;
                                                final Function1 function15 = function14;
                                                final MutableState mutableState16 = mutableState13;
                                                final State state5 = state3;
                                                final State state6 = state4;
                                                AnimatedContentKt.AnimatedContent(str4, fillMaxSize3, (Function1) rememberedValue13, null, "fallbackFocus", null, Expect_jvmKt.rememberComposableLambda(-536407646, new Function4() { // from class: com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda30
                                                    @Override // kotlin.jvm.functions.Function4
                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                        Object obj17;
                                                        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj13;
                                                        String str5 = (String) obj14;
                                                        Composer composer5 = (Composer) obj15;
                                                        int intValue4 = ((Integer) obj16).intValue();
                                                        animatedContentScopeImpl.getClass();
                                                        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel8 = PaymentDeviceCustomizationViewModel.this;
                                                        SharedTransitionScope sharedTransitionScope2 = sharedTransitionScope;
                                                        State state7 = state5;
                                                        State state8 = state6;
                                                        if (str5 == null) {
                                                            GapComposer gapComposer8 = (GapComposer) composer5;
                                                            gapComposer8.startReplaceGroup(1453215309);
                                                            List list2 = paymentDeviceCustomizationViewModel8.items;
                                                            String str6 = (String) mutableState16.getValue();
                                                            float floatValue = ((Number) state7.getValue()).floatValue();
                                                            float f6 = ((Dp) state8.getValue()).value;
                                                            MutableState mutableState17 = mutableState15;
                                                            boolean changed5 = gapComposer8.changed(mutableState17);
                                                            Function1 function16 = function15;
                                                            boolean changed6 = changed5 | gapComposer8.changed(function16);
                                                            Object rememberedValue14 = gapComposer8.rememberedValue();
                                                            if (changed6 || rememberedValue14 == Composer.Companion.Empty) {
                                                                rememberedValue14 = new CashMapViewKt$$ExternalSyntheticLambda3(function16, mutableState17, 10);
                                                                gapComposer8.updateRememberedValue(rememberedValue14);
                                                            }
                                                            PaymentDeviceCustomizationViewKt.m3437FallbackGridjIwJxvA(list2, str6, floatValue, f6, sharedTransitionScope2, animatedContentScopeImpl, (Function1) rememberedValue14, gapComposer8, (intValue4 << 15) & 458752);
                                                            gapComposer8.end(false);
                                                        } else {
                                                            GapComposer gapComposer9 = (GapComposer) composer5;
                                                            gapComposer9.startReplaceGroup(1453962254);
                                                            Iterator it2 = paymentDeviceCustomizationViewModel8.items.iterator();
                                                            while (true) {
                                                                if (!it2.hasNext()) {
                                                                    obj17 = null;
                                                                    break;
                                                                }
                                                                obj17 = it2.next();
                                                                if (Intrinsics.areEqual(((PaymentDeviceItemViewModel) obj17).id, str5)) {
                                                                    break;
                                                                }
                                                            }
                                                            PaymentDeviceItemViewModel paymentDeviceItemViewModel4 = (PaymentDeviceItemViewModel) obj17;
                                                            if (paymentDeviceItemViewModel4 != null) {
                                                                gapComposer9.startReplaceGroup(1454074195);
                                                                PaymentDeviceCustomizationViewKt.m3438FallbackHero942rkJo(paymentDeviceItemViewModel4, ((Number) state7.getValue()).floatValue(), ((Dp) state8.getValue()).value, sharedTransitionScope2, animatedContentScopeImpl, gapComposer9, (intValue4 << 12) & 57344);
                                                                gapComposer9.end(false);
                                                            } else {
                                                                gapComposer9.startReplaceGroup(1454424960);
                                                                gapComposer9.end(false);
                                                            }
                                                            gapComposer9.end(false);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, gapComposer7), gapComposer7, 1597872, 40);
                                                gapComposer7.end(true);
                                                ProductDetailsPageViewModel productDetailsPageViewModel5 = productDetailsPageViewModel4;
                                                boolean z3 = productDetailsPageViewModel5 != null;
                                                float f6 = f4;
                                                MutableState mutableState17 = mutableState14;
                                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1778786762, new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31(f6, f5, productDetailsPageViewModel5, function15, mutableState17), gapComposer7);
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                EnterTransitionImpl enterTransitionImpl4 = enterTransitionImpl3;
                                                ExitTransitionImpl exitTransitionImpl3 = exitTransitionImpl2;
                                                AnimatedContentKt.AnimatedVisibility(columnScopeInstance, z3, null, enterTransitionImpl4, exitTransitionImpl3, null, rememberComposableLambda, gapComposer7, 1597446, 18);
                                                gapComposer7.end(true);
                                                boolean z4 = productDetailsPageViewModel5 != null;
                                                BiasAlignment biasAlignment = Alignment.Companion.BottomCenter;
                                                boxWithConstraintsScopeImpl3.getClass();
                                                AnimatedContentKt.AnimatedVisibility(z4, BoxScopeInstance.INSTANCE.align(companion4, biasAlignment), enterTransitionImpl4, exitTransitionImpl3, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-906553772, new SectionKt$$ExternalSyntheticLambda2(18, productDetailsPageViewModel5, function15, mutableState17), gapComposer7), (Composer) gapComposer7, 199680, 16);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer6), gapComposer6, 54, 0);
                                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                    } else {
                                        gapComposer6.startReplaceGroup(-1762997739);
                                        gapComposer6.end(false);
                                    }
                                    long j2 = colors3.component.titleBar.background;
                                    long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j2, 14);
                                    float mo236toPx0680j_4 = ((Density) gapComposer6.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(8.0f);
                                    Object rememberedValue13 = gapComposer6.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                    if (rememberedValue13 == neverEqualPolicy) {
                                        rememberedValue13 = Updater.derivedStateOf(new MoneyTabUIKt$$ExternalSyntheticLambda28(scrollState2, mo236toPx0680j_4, mutableState12, 2));
                                        gapComposer6.updateRememberedValue(rememberedValue13);
                                    }
                                    State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac((((String) mutableState12.getValue()) == null || !((Boolean) ((State) rememberedValue13).getValue()).booleanValue()) ? m675copywmQWz5c$default2 : j2, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5), "fallbackToolbarGradientEnd", gapComposer6, 432, 8);
                                    NavigationType navigationType = ((String) mutableState12.getValue()) != null ? NavigationType.BACK : NavigationType.CLOSE;
                                    Modifier background$default2 = ImageKt.background$default(companion3, Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(j2), new Color(((Color) m153animateColorAsStateeuL9pac.getValue()).value)})), null, 6);
                                    boolean changed5 = gapComposer6.changed(mutableState12) | gapComposer6.changed(function14);
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean changedInstance2 = changed5 | gapComposer6.changedInstance(coroutineScope3) | gapComposer6.changed(scrollState2);
                                    Object rememberedValue14 = gapComposer6.rememberedValue();
                                    if (changedInstance2 || rememberedValue14 == neverEqualPolicy) {
                                        ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(function14, coroutineScope3, mutableState12, mutableState11, scrollState2, 7);
                                        gapComposer6.updateRememberedValue(ta__externalsyntheticlambda1);
                                        rememberedValue14 = ta__externalsyntheticlambda1;
                                    }
                                    DBUtil.TitleBarSub((String) null, navigationType, background$default2, (DynamicColorConfiguration) null, (Function0) rememberedValue14, (Modifier) null, (Function3) null, gapComposer6, 6, 104);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 3072, 6);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            paymentDeviceCustomizationViewModel2 = paymentDeviceCustomizationViewModel;
            function12 = function1;
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2009989144, function2, gapComposer2), gapComposer, 3072, 7);
        } else {
            paymentDeviceCustomizationViewModel2 = paymentDeviceCustomizationViewModel;
            gapComposer = gapComposer2;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda0(paymentDeviceCustomizationViewModel2, function12, i, 1);
        }
    }
}
