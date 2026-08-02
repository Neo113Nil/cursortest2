package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.values.BorderStyle;
import app.cash.arcade.values.ImageResource;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.Dp;
import app.cash.redwood.widget.Widget;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RoundedRectBinding extends AbstractComposeView implements Widget {
    public final ParcelableSnapshotMutableState backgroundImage$delegate;
    public final ParcelableSnapshotMutableState borderColor$delegate;
    public final ParcelableSnapshotMutableState borderStyle$delegate;
    public final ParcelableSnapshotMutableFloatState borderWidth$delegate;
    public final ParcelableSnapshotMutableState color$delegate;
    public final ParcelableSnapshotMutableFloatState cornerRadius$delegate;
    public final RealImageLoader imageLoader;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onClick$delegate;
    public final ThemeInfo themeInfo;
    public final RoundedRectBinding value;

    public RoundedRectBinding(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.themeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.color$delegate = Updater.mutableStateOf$default(null);
        this.cornerRadius$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.borderStyle$delegate = Updater.mutableStateOf$default(null);
        this.borderColor$delegate = Updater.mutableStateOf$default(null);
        this.borderWidth$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.backgroundImage$delegate = Updater.mutableStateOf$default(null);
        this.onClick$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        Color m;
        final Stroke stroke;
        Stroke stroke2;
        boolean changed;
        Object rememberedValue;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-6663293);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Function0 function0 = (Function0) this.onClick$delegate.getValue();
            androidx.compose.ui.Modifier modifier = Modifier.Companion.$$INSTANCE;
            Object obj = Composer.Companion.Empty;
            if (function0 != null) {
                gapComposer.startReplaceGroup(-937602626);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == obj) {
                    rememberedValue2 = new ErrorView$$ExternalSyntheticLambda0(this, 8);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue2, 15);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-937533186);
                gapComposer.end(false);
            }
            app.cash.arcade.values.Color color = (app.cash.arcade.values.Color) this.borderColor$delegate.getValue();
            if (color == null) {
                gapComposer.startReplaceGroup(-937408443);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(-2108448964);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, ColorsKt.toComposeColor(color, this.themeInfo, gapComposer));
            }
            long j = m != null ? m.value : Color.Transparent;
            BorderStyle borderStyle = (BorderStyle) this.borderStyle$delegate.getValue();
            boolean areEqual = Intrinsics.areEqual(borderStyle, BorderStyle.Solid.INSTANCE);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.borderWidth$delegate;
            if (areEqual) {
                gapComposer.startReplaceGroup(-2108444024);
                stroke2 = new Stroke(DensityUtilsKt.m3477toPx8Feqmps(parcelableSnapshotMutableFloatState.getFloatValue(), gapComposer), RecyclerView.DECELERATION_RATE, 0, 0, null, 30);
                gapComposer.end(false);
            } else if (borderStyle instanceof BorderStyle.Dashed) {
                gapComposer.startReplaceGroup(-2108441201);
                BorderStyle.Dashed dashed = (BorderStyle.Dashed) borderStyle;
                stroke2 = new Stroke(DensityUtilsKt.m3477toPx8Feqmps(parcelableSnapshotMutableFloatState.getFloatValue(), gapComposer), RecyclerView.DECELERATION_RATE, 0, 0, new AndroidPathEffect(new DashPathEffect(new float[]{DensityUtilsKt.m3477toPx8Feqmps(dashed.dashWidth, gapComposer), DensityUtilsKt.m3477toPx8Feqmps(dashed.gapWidth, gapComposer)}, RecyclerView.DECELERATION_RATE)), 14);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-936893254);
                gapComposer.end(false);
                stroke = null;
                Resources resources = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources();
                changed = gapComposer.changed(resources);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == obj) {
                    resources.getClass();
                    rememberedValue = new Density(DensityKt.Density(resources));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                double d = ((Density) rememberedValue).rawDensity;
                double floatValue = this.cornerRadius$delegate.getFloatValue();
                Dp.m1405constructorimpl(floatValue);
                final float m1401toPxmnpKzHI = (float) Density.m1401toPxmnpKzHI(d, floatValue);
                final androidx.compose.ui.Modifier modifier2 = modifier;
                final long j2 = j;
                Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(104507075, new Function2() { // from class: com.squareup.cash.arcade.treehouse.RoundedRectBinding$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Color m2;
                        Composer composer2 = (Composer) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            float f = m1401toPxmnpKzHI;
                            androidx.compose.ui.Modifier clip = ClipKt.clip(androidx.compose.ui.Modifier.this, RoundedCornerShapeKt.RoundedCornerShape(f));
                            RoundedRectBinding roundedRectBinding = this;
                            app.cash.arcade.values.Color color2 = (app.cash.arcade.values.Color) roundedRectBinding.color$delegate.getValue();
                            if (color2 == null) {
                                gapComposer2.startReplaceGroup(-480830011);
                                gapComposer2.end(false);
                                m2 = null;
                            } else {
                                gapComposer2.startReplaceGroup(1647057340);
                                m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, ColorsKt.toComposeColor(color2, roundedRectBinding.themeInfo, gapComposer2));
                            }
                            androidx.compose.ui.Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, m2 != null ? m2.value : Color.Transparent, ColorKt.RectangleShape);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            androidx.compose.ui.Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                            ImageResource imageResource = (ImageResource) roundedRectBinding.backgroundImage$delegate.getValue();
                            boolean z = imageResource instanceof ImageResource.Url;
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (z) {
                                gapComposer2.startReplaceGroup(-880141368);
                                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(ImageResourcesKt.toProto((ImageResource.Url) imageResource), gapComposer2), null, boxScopeInstance.matchParentSize(), null, ContentScale.Companion.FillBounds, null, gapComposer2, 1572912, 1976);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-879825013);
                                gapComposer2.end(false);
                                if (imageResource != null) {
                                    UnsupportedImageResource unsupportedImageResource = new UnsupportedImageResource(imageResource);
                                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                                    if (errorReporter == null) {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                        return null;
                                    }
                                    errorReporter.report(unsupportedImageResource, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                            }
                            Stroke stroke3 = stroke;
                            if (stroke3 == null) {
                                gapComposer2.startReplaceGroup(-879715274);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-879715273);
                                androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize();
                                boolean changedInstance2 = gapComposer2.changedInstance(stroke3) | gapComposer2.changed(f);
                                long j3 = j2;
                                boolean changed2 = gapComposer2.changed(j3) | changedInstance2;
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.Companion.Empty) {
                                    BlurEffectKt$$ExternalSyntheticLambda0 blurEffectKt$$ExternalSyntheticLambda0 = new BlurEffectKt$$ExternalSyntheticLambda0(stroke3, f, j3, 2);
                                    gapComposer2.updateRememberedValue(blurEffectKt$$ExternalSyntheticLambda0);
                                    rememberedValue3 = blurEffectKt$$ExternalSyntheticLambda0;
                                }
                                CanvasKt.Canvas(0, gapComposer2, matchParentSize, (Function1) rememberedValue3);
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(true);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 56);
            }
            stroke = stroke2;
            Resources resources2 = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources();
            changed = gapComposer.changed(resources2);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            resources2.getClass();
            rememberedValue = new Density(DensityKt.Density(resources2));
            gapComposer.updateRememberedValue(rememberedValue);
            double d2 = ((Density) rememberedValue).rawDensity;
            double floatValue2 = this.cornerRadius$delegate.getFloatValue();
            Dp.m1405constructorimpl(floatValue2);
            final float m1401toPxmnpKzHI2 = (float) Density.m1401toPxmnpKzHI(d2, floatValue2);
            final androidx.compose.ui.Modifier modifier22 = modifier;
            final long j22 = j;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(104507075, new Function2() { // from class: com.squareup.cash.arcade.treehouse.RoundedRectBinding$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Color m2;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        float f = m1401toPxmnpKzHI2;
                        androidx.compose.ui.Modifier clip = ClipKt.clip(androidx.compose.ui.Modifier.this, RoundedCornerShapeKt.RoundedCornerShape(f));
                        RoundedRectBinding roundedRectBinding = this;
                        app.cash.arcade.values.Color color2 = (app.cash.arcade.values.Color) roundedRectBinding.color$delegate.getValue();
                        if (color2 == null) {
                            gapComposer2.startReplaceGroup(-480830011);
                            gapComposer2.end(false);
                            m2 = null;
                        } else {
                            gapComposer2.startReplaceGroup(1647057340);
                            m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, ColorsKt.toComposeColor(color2, roundedRectBinding.themeInfo, gapComposer2));
                        }
                        androidx.compose.ui.Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, m2 != null ? m2.value : Color.Transparent, ColorKt.RectangleShape);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        androidx.compose.ui.Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                        ImageResource imageResource = (ImageResource) roundedRectBinding.backgroundImage$delegate.getValue();
                        boolean z = imageResource instanceof ImageResource.Url;
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z) {
                            gapComposer2.startReplaceGroup(-880141368);
                            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(ImageResourcesKt.toProto((ImageResource.Url) imageResource), gapComposer2), null, boxScopeInstance.matchParentSize(), null, ContentScale.Companion.FillBounds, null, gapComposer2, 1572912, 1976);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-879825013);
                            gapComposer2.end(false);
                            if (imageResource != null) {
                                UnsupportedImageResource unsupportedImageResource = new UnsupportedImageResource(imageResource);
                                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                                if (errorReporter == null) {
                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                    return null;
                                }
                                errorReporter.report(unsupportedImageResource, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                            }
                        }
                        Stroke stroke3 = stroke;
                        if (stroke3 == null) {
                            gapComposer2.startReplaceGroup(-879715274);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-879715273);
                            androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize();
                            boolean changedInstance2 = gapComposer2.changedInstance(stroke3) | gapComposer2.changed(f);
                            long j3 = j22;
                            boolean changed2 = gapComposer2.changed(j3) | changedInstance2;
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.Companion.Empty) {
                                BlurEffectKt$$ExternalSyntheticLambda0 blurEffectKt$$ExternalSyntheticLambda0 = new BlurEffectKt$$ExternalSyntheticLambda0(stroke3, f, j3, 2);
                                gapComposer2.updateRememberedValue(blurEffectKt$$ExternalSyntheticLambda0);
                                rememberedValue3 = blurEffectKt$$ExternalSyntheticLambda0;
                            }
                            CanvasKt.Canvas(0, gapComposer2, matchParentSize, (Function1) rememberedValue3);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 23);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
