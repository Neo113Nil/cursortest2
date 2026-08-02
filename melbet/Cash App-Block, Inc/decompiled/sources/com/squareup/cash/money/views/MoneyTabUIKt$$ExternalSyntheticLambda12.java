package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.primitives.BrandToken;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Brand;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.wallet.ComposableSingletons$TabContentViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda12 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda12(LocalHomeViewModel$TabContent$Widget$Portfolio$Brand localHomeViewModel$TabContent$Widget$Portfolio$Brand, float f) {
        this.$r8$classId = 1;
        this.f$1 = localHomeViewModel$TabContent$Widget$Portfolio$Brand;
        this.f$0 = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Color m;
        long j;
        int i = this.$r8$classId;
        String str = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        float f = this.f$0;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                ((ParcelableSnapshotMutableIntState) obj4).setIntValue(mo833measureBRTryo0.height + ((int) f));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 15));
            case 1:
                LocalHomeViewModel$TabContent$Widget$Portfolio$Brand localHomeViewModel$TabContent$Widget$Portfolio$Brand = (LocalHomeViewModel$TabContent$Widget$Portfolio$Brand) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    LocalImage localImage = localHomeViewModel$TabContent$Widget$Portfolio$Brand.image;
                    SharedTransitionScope.SharedContentState rememberSharedContentState = uiScope.rememberSharedContentState(new BrandToken(localHomeViewModel$TabContent$Widget$Portfolio$Brand.brandSpot.brandToken), gapComposer, (intValue << 3) & 112);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier aspectRatio = OffsetKt.aspectRatio(0.8f, SizeKt.fillMaxWidth(SharedTransitionScope.sharedElement$default(uiScope, companion2, rememberSharedContentState, uiScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), 1.0f), false);
                    LocalColor localColor = localImage != null ? localImage.placeholder_color : null;
                    if (localColor == null) {
                        gapComposer.startReplaceGroup(-1906030510);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        gapComposer.startReplaceGroup(-2001147505);
                        m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(-1905962061);
                        LocalColor localColor2 = localHomeViewModel$TabContent$Widget$Portfolio$Brand.backgroundColor;
                        if (localColor2 == null) {
                            gapComposer.startReplaceGroup(-1905962062);
                            gapComposer.end(false);
                            m = null;
                        } else {
                            gapComposer.startReplaceGroup(-2001145297);
                            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor2, gapComposer, 0));
                        }
                    } else {
                        gapComposer.startReplaceGroup(-2001148242);
                    }
                    gapComposer.end(false);
                    if (m == null) {
                        gapComposer.startReplaceGroup(-2001142587);
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
                        gapComposer.startReplaceGroup(-2001148167);
                        gapComposer.end(false);
                        j = m.value;
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(aspectRatio, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), RecyclerView.DECELERATION_RATE, f, 1);
                    Float ratio = localImage != null ? LocalViewsKt.getRatio(localImage) : null;
                    Modifier aspectRatio2 = ratio != null ? OffsetKt.aspectRatio(ratio.floatValue(), companion2, false) : companion2;
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    if (localImage == null) {
                        gapComposer.startReplaceGroup(-1905524807);
                    } else {
                        gapComposer.startReplaceGroup(-2001131192);
                        str = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                    }
                    gapComposer.end(false);
                    LocalMapKt.LocalAsyncImage(m300paddingVpY3zN4$default, aspectRatio2, str, ContentScale.Companion.Fit, biasAlignment, null, ComposableSingletons$TabContentViewKt.f57lambda$1609285859, gapComposer, 1600512, 32);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Float f2 = (Float) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    zzadn.CashGreenProgressBarVisual(f, f2, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, this.f$0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                GapComposer gapComposer3 = (GapComposer) composer3;
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer3, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer4 = (GapComposer) composer3;
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
                Updater.m576setimpl(composer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke((Object) ColumnScopeInstance.INSTANCE, (Object) composer3, (Object) 6);
                gapComposer4.end(true);
                return Unit.INSTANCE;
            case 4:
                DependentActivityAppletTileViewModel dependentActivityAppletTileViewModel = (DependentActivityAppletTileViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, f));
                    UiCallbackModel activityModel = dependentActivityAppletTileViewModel.getActivityModel();
                    if (activityModel == null) {
                        gapComposer5.startReplaceGroup(2005127239);
                    } else {
                        gapComposer5.startReplaceGroup(2005127240);
                        AvatarsKt.ActivityEmbeddedView(activityModel, null, null, null, null, gapComposer5, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    }
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), (RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f) * ((Dp) RangesKt___RangesKt.coerceAtLeast(new Dp(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() - 12.0f), new Dp(RecyclerView.DECELERATION_RATE))).value) + 12.0f);
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors2.semantic.background.brand, roundedCornerShape), gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda12(float f, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = obj;
    }
}
