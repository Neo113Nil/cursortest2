package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.common.composeui.InfoUpsellContentScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.offers.presenters.RealOffersDetailsStateManager$states$1$1;
import com.squareup.cash.treehouse.android.platform.LoadingScrimKt;
import com.squareup.util.compose.ScaledSizeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda38 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda38(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        int i4;
        Easing easing;
        float f;
        int i5 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        boolean z = this.f$0;
        switch (i5) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 17) != 16)) {
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, z ? 148.0f : 88.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    HypeWelcomeUIKt.FullWidthTileLoadingShimmer(SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, z ? R.string.local_views_add_items : R.string.local_views_add_more), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                InfoUpsellContentScope infoUpsellContentScope = (InfoUpsellContentScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                infoUpsellContentScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(infoUpsellContentScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    int i6 = ((intValue3 << 15) & 458752) | 6;
                    infoUpsellContentScope.InfoCell(Icons.Search24, Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_label_discover), Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_description_discover), gapComposer3, i6);
                    Icons icons = Icons.Location24;
                    String stringResource = Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_label_visit);
                    if (z) {
                        i = 1246238586;
                        i2 = R.string.bitcoin_views_map_onboarding_description_visit;
                    } else {
                        i = 1246340855;
                        i2 = R.string.bitcoin_views_map_onboarding_description_visit_ny;
                    }
                    infoUpsellContentScope.InfoCell(icons, stringResource, re$$ExternalSyntheticOutline0.m(gapComposer3, i, i2, gapComposer3, false), gapComposer3, i6);
                    if (z) {
                        gapComposer3.startReplaceGroup(1246486090);
                        infoUpsellContentScope.InfoCell(Icons.Gift24, Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_label_earn), Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_description_earn), gapComposer3, i6);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1246717691);
                        gapComposer3.end(false);
                    }
                    String stringResource2 = Room.stringResource(gapComposer3, R.string.bitcoin_views_map_onboarding_disclaimer);
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j = colors.semantic.text.subtle;
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer3, SpacerKt.m298padding3ABfNKs(companion, 16.0f), textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BoxScope boxScope = (BoxScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier clip = ClipKt.clip(OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 4.0f), 1.0f), false), RoundedCornerShapeKt.CircleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier align = boxScope.align(ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.inverse, rectangleShapeKt$RectangleShape$1), Alignment.Companion.TopCenter);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, align);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Icons icons2 = z ? Icons.LogoSquare24 : Icons.LogoBtc24;
                    Colors colors3 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors3.semantic.text.inverse, gapComposer4, 48, 4);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                realSubcomposeAsyncImageScope.getClass();
                AsyncImagePainter asyncImagePainter = realSubcomposeAsyncImageScope.painter;
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18);
                Applier applier = gapComposer5.applier;
                if (shouldExecute) {
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = asyncImagePainter.state;
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer5, 1).getValue();
                    if (Intrinsics.areEqual(state, AsyncImagePainter.State.Empty.INSTANCE) || (state instanceof AsyncImagePainter.State.Error)) {
                        gapComposer5.startReplaceGroup(-2108398648);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                        Colors colors4 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal2);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors4.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer5.startReusableNode();
                        if (gapComposer5.inserting) {
                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer5.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        if (z) {
                            gapComposer5.startReplaceGroup(-304469503);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer5, 54);
                            int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, companion);
                            gapComposer5.startReusableNode();
                            if (gapComposer5.inserting) {
                                gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer5.useNode();
                            }
                            Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            BugReportingViewKt.TriangleShape(gapComposer5, 0);
                            gapComposer5.end(true);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(-304235515);
                            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
                            Icons icons3 = Icons.Document32;
                            Colors colors5 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal2);
                            if (colors5 == null) {
                                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            Trace.m1191Iconww6aTOc(icons3, (String) null, wrapContentSize$default, colors5.semantic.icon.standard, gapComposer5, 438, 0);
                            gapComposer5.end(false);
                        }
                        gapComposer5.end(true);
                        gapComposer5.end(false);
                    } else if (state instanceof AsyncImagePainter.State.Loading) {
                        gapComposer5.startReplaceGroup(-2107650928);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        Colors colors6 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors6.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer5.startReusableNode();
                        if (gapComposer5.inserting) {
                            gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer5.useNode();
                        }
                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer5, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer5, SizeKt.m285size3ABfNKs(companion, 24.0f));
                        gapComposer5.end(true);
                        gapComposer5.end(false);
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 1733100872, false);
                        }
                        gapComposer5.startReplaceGroup(-2107343873);
                        ImageKt.Image(asyncImagePainter, null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer5, 25008, 104);
                        gapComposer5.end(false);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(z ? Icons.Edit24 : Icons.Time24, Room.stringResource(gapComposer6, z ? R.string.payment_schedule_edit_button_accessibility_label : R.string.payment_schedule_button_accessibility_label), (Modifier) null, 0L, gapComposer6, 0, 12);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (!gapComposer7.shouldExecute(1 & intValue7, (intValue7 & 17) != 16)) {
                    gapComposer7.skipToGroupEnd();
                } else if (z) {
                    gapComposer7.startReplaceGroup(1957030440);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer7, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer7.end(false);
                } else {
                    gapComposer7.startReplaceGroup(1957107227);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.request_share_option_share_link), (Map) null, (Function1) null, false);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (!gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 17) != 16)) {
                    gapComposer8.skipToGroupEnd();
                } else if (z) {
                    gapComposer8.startReplaceGroup(1678858180);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer8, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer8.end(false);
                } else {
                    gapComposer8.startReplaceGroup(1678934967);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.request_share_option_share_link), (Map) null, (Function1) null, false);
                    gapComposer8.end(false);
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(1 & intValue9, (intValue9 & 17) != 16)) {
                    gapComposer9.skipToGroupEnd();
                } else if (z) {
                    gapComposer9.startReplaceGroup(501808462);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.startReplaceGroup(501571095);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                    Colors colors7 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal3);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    long j2 = colors7.semantic.background.brand;
                    Icons icons4 = Icons.Pools16;
                    Colors colors8 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal3);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j2, icons4, colors8.semantic.icon.inverse, RecyclerView.DECELERATION_RATE, gapComposer9, 48, 8);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(1 & intValue10, (intValue10 & 17) != 16)) {
                    if (z) {
                        i3 = -1765093044;
                        i4 = R.string.contact_support_message_continue;
                    } else {
                        i3 = -1765001005;
                        i4 = R.string.contact_support_input_yes;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer10, i3, i4, gapComposer10, false), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                GapComposer gapComposer11 = (GapComposer) composer11;
                Colors colors9 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                if (colors9 == null) {
                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                } else {
                    gapComposer11.startReplaceGroup(-1762997739);
                    gapComposer11.end(false);
                }
                Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors9.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer11, m177backgroundbw27NRU3);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer12.startReusableNode();
                if (gapComposer12.inserting) {
                    gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer12.useNode();
                }
                Updater.m576setimpl(composer11, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer11, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer11, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer11, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                Object rememberedValue2 = gapComposer12.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer12.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Boolean valueOf2 = Boolean.valueOf(z);
                boolean changed = gapComposer12.changed(z);
                Object rememberedValue3 = gapComposer12.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    easing = null;
                    rememberedValue3 = new RealOffersDetailsStateManager$states$1$1(z, mutableState, null, 2);
                    gapComposer12.updateRememberedValue(rememberedValue3);
                } else {
                    easing = null;
                }
                Updater.LaunchedEffect(composer11, valueOf2, (Function2) rememberedValue3);
                AnimatedContentKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, easing, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, easing, 6), 2), (String) null, (Function3) LoadingScrimKt.f740lambda$1979329545, composer11, 200064, 18);
                gapComposer12.end(true);
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (!gapComposer13.shouldExecute(1 & intValue11, (intValue11 & 17) != 16)) {
                    gapComposer13.skipToGroupEnd();
                } else if (z) {
                    gapComposer13.startReplaceGroup(-1886186390);
                    TextStyle textStyle2 = (TextStyle) gapComposer13.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle2 == null) {
                        gapComposer13.startReplaceGroup(-1100573765);
                        textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer13.startReplaceGroup(-1100574912);
                    }
                    gapComposer13.end(false);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer13, ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(companion, textStyle2.paragraphStyle.lineHeight, gapComposer13));
                    gapComposer13.end(false);
                } else {
                    gapComposer13.startReplaceGroup(-1886020137);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.work_views_continue_button), (Map) null, (Function1) null, false);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (!gapComposer14.shouldExecute(1 & intValue12, (intValue12 & 17) != 16)) {
                    gapComposer14.skipToGroupEnd();
                } else if (z) {
                    gapComposer14.startReplaceGroup(-1038770743);
                    TextStyle textStyle3 = (TextStyle) gapComposer14.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle3 == null) {
                        gapComposer14.startReplaceGroup(-1100573765);
                        textStyle3 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer14.startReplaceGroup(-1100574912);
                    }
                    gapComposer14.end(false);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer14, ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(companion, textStyle3.paragraphStyle.lineHeight, gapComposer14));
                    gapComposer14.end(false);
                } else {
                    gapComposer14.startReplaceGroup(-1038604459);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.work_views_clock_out_button), (Map) null, (Function1) null, false);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (!gapComposer15.shouldExecute(1 & intValue13, (intValue13 & 17) != 16)) {
                    gapComposer15.skipToGroupEnd();
                } else if (z) {
                    gapComposer15.startReplaceGroup(-18840517);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer15, SizeKt.m285size3ABfNKs(companion, 16.0f));
                    gapComposer15.end(false);
                } else {
                    gapComposer15.startReplaceGroup(-18744324);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.work_views_choose), (Map) null, (Function1) null, false);
                    gapComposer15.end(false);
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer16, z ? R.string.stripe_prepane_cancel_cta : R.string.stripe_prepane_choose_different_bank_cta), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, gapComposer16, 0, 0, 130558);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Brush brush = (Brush) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                brush.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changed(brush) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer17, 0);
                    int hashCode6 = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer17, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer17.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer17.startReusableNode();
                    if (gapComposer17.inserting) {
                        gapComposer17.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer17.useNode();
                    }
                    Updater.m576setimpl(gapComposer17, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer17, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    SpacerKt.Spacer(gapComposer17, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    BoxKt.Box(ImageKt.background$default(SizeKt.m285size3ABfNKs(companion, 56.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    SpacerKt.Spacer(gapComposer17, SizeKt.m285size3ABfNKs(companion, 16.0f));
                    BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    SpacerKt.Spacer(gapComposer17, SizeKt.m285size3ABfNKs(companion, 16.0f));
                    BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    SpacerKt.Spacer(gapComposer17, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.5f), 16.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    if (z) {
                        re$$ExternalSyntheticOutline0.m(gapComposer17, -1605346913, companion, 16.0f, gapComposer17);
                        gapComposer17.end(false);
                        f = 1.0f;
                    } else {
                        gapComposer17.startReplaceGroup(-1605268638);
                        f = 1.0f;
                        SpacerKt.Spacer(gapComposer17, new LayoutWeightElement(1.0f, true));
                        gapComposer17.end(false);
                    }
                    BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, f), 56.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    BoxKt.Box(ImageKt.background$default(SizeKt.m277height3ABfNKs(Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer17, companion, f), 56.0f), brush, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), 4), gapComposer17, 0);
                    SpacerKt.Spacer(gapComposer17, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer17.end(true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
