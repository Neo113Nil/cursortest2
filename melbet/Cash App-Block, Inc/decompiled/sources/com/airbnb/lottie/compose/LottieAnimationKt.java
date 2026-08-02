package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.model.Marker;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001f\u001aË\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0002\u0010!\u001aû\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010*\u001a¥\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010+\u001a\u001f\u0010,\u001a\u00020-*\u00020.2\u0006\u0010/\u001a\u000200H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\f\u00104\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"LottieAnimation", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "safeMode", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/Composer;III)V", "applyShadowToLayers", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "iterations", "", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;IIII)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release", "setDynamicProperties"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationKt {
    public static final void LottieAnimation(final LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, RenderMode renderMode, boolean z7, boolean z8, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z9, boolean z10, Map<String, ? extends Typeface> map, boolean z11, AsyncUpdates asyncUpdates, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1331239405);
        Modifier modifier2 = (i5 & 2) != 0 ? Modifier.Companion.$$INSTANCE : modifier;
        boolean z12 = (i5 & 4) != 0 ? true : z;
        boolean z13 = (i5 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i5 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z14 = (i5 & 128) != 0 ? false : z3;
        boolean z15 = (i5 & 256) != 0 ? false : z4;
        boolean z16 = (i5 & 512) != 0 ? true : z5;
        boolean z17 = (i5 & 1024) != 0 ? false : z6;
        RenderMode renderMode2 = (i5 & 2048) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z18 = (i5 & 4096) != 0 ? false : z7;
        boolean z19 = (i5 & PKIFailureInfo.certRevoked) != 0 ? false : z8;
        LottieDynamicProperties lottieDynamicProperties2 = (i5 & 16384) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i5 & 32768) != 0 ? Alignment.Companion.Center : alignment;
        ContentScale contentScale2 = (i5 & 65536) != 0 ? ContentScale.Companion.Fit : contentScale;
        boolean z20 = (i5 & PKIFailureInfo.unsupportedVersion) != 0 ? true : z9;
        boolean z21 = (i5 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z10;
        Map<String, ? extends Typeface> map2 = (i5 & PKIFailureInfo.signerNotTrusted) != 0 ? null : map;
        boolean z22 = (i5 & PKIFailureInfo.badCertTemplate) != 0 ? false : z11;
        AsyncUpdates asyncUpdates2 = (i5 & PKIFailureInfo.badSenderNonce) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        int i7 = i2 >> 3;
        final boolean z23 = z18;
        final boolean z24 = z13;
        final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
        final float f3 = f2;
        final int i8 = i6;
        final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z12, z24, z23, lottieClipSpec3, f3, i8, null, false, false, gapComposer, (i7 & 112) | 8 | (i7 & 896) | ((i3 << 3) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        final Modifier modifier3 = modifier2;
        final boolean z25 = z19;
        final boolean z26 = z16;
        gapComposer.startReplaceableGroup(185157769);
        boolean changed = gapComposer.changed(animateLottieCompositionAsState);
        Object rememberedValue = gapComposer.rememberedValue();
        final boolean z27 = z12;
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float LottieAnimation$lambda$6;
                    LottieAnimation$lambda$6 = LottieAnimationKt.LottieAnimation$lambda$6(LottieAnimationState.this);
                    return Float.valueOf(LottieAnimation$lambda$6);
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        gapComposer.end(false);
        int i9 = i2 >> 12;
        int i10 = ((i2 << 3) & 896) | 1073741832 | (i9 & 7168) | (i9 & 57344) | (i9 & 458752);
        int i11 = i3 << 18;
        int i12 = i10 | (i11 & 3670016) | (i11 & 29360128) | ((i3 << 15) & 234881024);
        int i13 = i3 >> 15;
        final boolean z28 = z14;
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        final boolean z29 = z15;
        final boolean z30 = z17;
        final RenderMode renderMode3 = renderMode2;
        final Alignment alignment3 = alignment2;
        final ContentScale contentScale3 = contentScale2;
        final boolean z31 = z20;
        final boolean z32 = z21;
        final Map<String, ? extends Typeface> map3 = map2;
        final boolean z33 = z22;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        LottieAnimation(lottieComposition, (Function0) rememberedValue, modifier3, z28, z29, z26, z30, renderMode3, z25, lottieDynamicProperties3, alignment3, contentScale3, z31, z32, map3, asyncUpdates3, z33, gapComposer, i12, (i13 & 14) | 32768 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | ((i4 << 12) & 458752) | ((i4 << 18) & 3670016), 0);
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void invoke(Composer composer2, int i14) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, modifier3, z27, z24, lottieClipSpec3, f3, i8, z28, z29, z26, z30, renderMode3, z23, z25, lottieDynamicProperties3, alignment3, contentScale3, z31, z32, map3, z33, asyncUpdates3, composer2, Updater.updateChangedFlags(i2 | 1), Updater.updateChangedFlags(i3), Updater.updateChangedFlags(i4), i5);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(MutableState mutableState) {
        return (LottieDynamicProperties) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return ((Number) lottieAnimationState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m1494timesUQTWf7w(long j, long j2) {
        return Countries.IntSize((int) (ScaleFactor.m857getScaleXimpl(j2) * Size.m643getWidthimpl(j)), (int) (ScaleFactor.m858getScaleYimpl(j2) * Size.m640getHeightimpl(j)));
    }

    @Deprecated
    public static final void LottieAnimation(final LottieComposition lottieComposition, final float f, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z6, boolean z7, AsyncUpdates asyncUpdates, Composer composer, final int i, final int i2, final int i3) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1170781710);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.$$INSTANCE : modifier;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? true : z3;
        boolean z11 = (i3 & 64) != 0 ? false : z4;
        RenderMode renderMode2 = (i3 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z12 = (i3 & 256) != 0 ? false : z5;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 512) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i3 & 1024) != 0 ? Alignment.Companion.Center : alignment;
        ContentScale contentScale2 = (i3 & 2048) != 0 ? ContentScale.Companion.Fit : contentScale;
        boolean z13 = (i3 & 4096) != 0 ? true : z6;
        boolean z14 = (i3 & PKIFailureInfo.certRevoked) != 0 ? false : z7;
        AsyncUpdates asyncUpdates2 = (i3 & 16384) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        gapComposer.startReplaceableGroup(185155711);
        boolean z15 = (((i & 112) ^ 48) > 32 && gapComposer.changed(f)) || (i & 48) == 32;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z15 || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    return Float.valueOf(f);
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        gapComposer.end(false);
        final boolean z16 = z8;
        final Alignment alignment3 = alignment2;
        final ContentScale contentScale3 = contentScale2;
        final boolean z17 = z11;
        final RenderMode renderMode3 = renderMode2;
        final boolean z18 = z12;
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        LottieAnimation(lottieComposition, (Function0) rememberedValue, modifier2, z16, z9, z10, z17, renderMode3, z18, lottieDynamicProperties3, alignment3, contentScale3, z13, false, null, asyncUpdates2, z14, gapComposer, (i & 7168) | (i & 896) | 1073741832 | (57344 & i) | (i & 458752) | (i & 3670016) | (i & 29360128) | (i & 234881024), (i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i2 << 3) & 458752) | ((i2 << 9) & 3670016), 24576);
        final Modifier modifier3 = modifier2;
        final boolean z19 = z9;
        final boolean z20 = z10;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z21 = z13;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z22 = z14;
            endRestartGroup.block = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(Composer composer2, int i4) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, f, modifier3, z16, z19, z20, z17, renderMode3, z18, lottieDynamicProperties3, alignment3, contentScale3, z21, z22, asyncUpdates3, composer2, Updater.updateChangedFlags(i | 1), Updater.updateChangedFlags(i2), i3);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LottieAnimation(final LottieComposition lottieComposition, final Function0<Float> function0, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z6, boolean z7, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z8, Composer composer, final int i, final int i2, final int i3) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(382909894);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.$$INSTANCE : modifier;
        final boolean z9 = (i3 & 8) != 0 ? false : z;
        final boolean z10 = (i3 & 16) != 0 ? false : z2;
        final boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        RenderMode renderMode2 = (i3 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        final boolean z13 = (i3 & 256) != 0 ? false : z5;
        final LottieDynamicProperties lottieDynamicProperties2 = (i3 & 512) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i3 & 1024) != 0 ? Alignment.Companion.Center : alignment;
        ContentScale contentScale2 = (i3 & 2048) != 0 ? ContentScale.Companion.Fit : contentScale;
        final boolean z14 = (i3 & 4096) != 0 ? true : z6;
        final boolean z15 = (i3 & PKIFailureInfo.certRevoked) != 0 ? false : z7;
        final Map<String, ? extends Typeface> map2 = (i3 & 16384) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (32768 & i3) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z16 = (i3 & 65536) != 0 ? false : z8;
        gapComposer.startReplaceableGroup(185152185);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new LottieDrawable();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(185152232);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Matrix();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        final Matrix matrix = (Matrix) rememberedValue2;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(185152312);
        boolean changed = gapComposer.changed(lottieComposition);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState = (MutableState) rememberedValue3;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(185152364);
        if (lottieComposition != null && lottieComposition.getDuration() != RecyclerView.DECELERATION_RATE) {
            gapComposer.end(false);
            final Rect bounds = lottieComposition.getBounds();
            final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Modifier lottieSize = LottieAnimationSizeNodeKt.lottieSize(modifier2, bounds.width(), bounds.height());
            final boolean z17 = z16;
            final Map<String, ? extends Typeface> map3 = map2;
            final boolean z18 = z11;
            final boolean z19 = z12;
            final RenderMode renderMode3 = renderMode2;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final Modifier modifier3 = modifier2;
            final Alignment alignment3 = alignment2;
            final ContentScale contentScale3 = contentScale2;
            final boolean z20 = z9;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void invoke(DrawScope drawScope) {
                    long m1494timesUQTWf7w;
                    LottieDynamicProperties LottieAnimation$lambda$3;
                    LottieDynamicProperties LottieAnimation$lambda$32;
                    drawScope.getClass();
                    Rect rect = bounds;
                    ContentScale contentScale4 = contentScale3;
                    Alignment alignment4 = alignment3;
                    Matrix matrix2 = matrix;
                    LottieDrawable lottieDrawable2 = lottieDrawable;
                    boolean z21 = z19;
                    boolean z22 = z17;
                    RenderMode renderMode4 = renderMode3;
                    AsyncUpdates asyncUpdates4 = asyncUpdates3;
                    LottieComposition lottieComposition2 = lottieComposition;
                    Map<String, Typeface> map4 = map3;
                    LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties3;
                    boolean z23 = z20;
                    boolean z24 = z10;
                    boolean z25 = z18;
                    boolean z26 = z13;
                    boolean z27 = z14;
                    boolean z28 = z15;
                    Context context2 = context;
                    Function0<Float> function02 = function0;
                    MutableState mutableState2 = mutableState;
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long Size = DimensionKt.Size(rect.width(), rect.height());
                    long IntSize = Countries.IntSize(MathKt__MathJVMKt.roundToInt(Size.m643getWidthimpl(drawScope.mo753getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m640getHeightimpl(drawScope.mo753getSizeNHjbRc())));
                    long mo832computeScaleFactorH7hwNQA = contentScale4.mo832computeScaleFactorH7hwNQA(Size, drawScope.mo753getSizeNHjbRc());
                    m1494timesUQTWf7w = LottieAnimationKt.m1494timesUQTWf7w(Size, mo832computeScaleFactorH7hwNQA);
                    long mo584alignKFBX0sM = alignment4.mo584alignKFBX0sM(m1494timesUQTWf7w, IntSize, drawScope.getLayoutDirection());
                    matrix2.reset();
                    matrix2.preTranslate((int) (mo584alignKFBX0sM >> 32), (int) (mo584alignKFBX0sM & BodyPartID.bodyIdMax));
                    matrix2.preScale(ScaleFactor.m857getScaleXimpl(mo832computeScaleFactorH7hwNQA), ScaleFactor.m858getScaleYimpl(mo832computeScaleFactorH7hwNQA));
                    lottieDrawable2.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z21);
                    lottieDrawable2.setSafeMode(z22);
                    lottieDrawable2.setRenderMode(renderMode4);
                    lottieDrawable2.setAsyncUpdates(asyncUpdates4);
                    lottieDrawable2.setComposition(lottieComposition2);
                    lottieDrawable2.setFontMap(map4);
                    LottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState2);
                    if (lottieDynamicProperties4 != LottieAnimation$lambda$3) {
                        LottieAnimation$lambda$32 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState2);
                        if (LottieAnimation$lambda$32 != null) {
                            LottieAnimation$lambda$32.removeFrom$lottie_compose_release(lottieDrawable2);
                        }
                        if (lottieDynamicProperties4 != null) {
                            lottieDynamicProperties4.addTo$lottie_compose_release(lottieDrawable2);
                        }
                        mutableState2.setValue(lottieDynamicProperties4);
                    }
                    lottieDrawable2.setOutlineMasksAndMattes(z23);
                    lottieDrawable2.setApplyingOpacityToLayersEnabled(z24);
                    lottieDrawable2.setApplyingShadowToLayersEnabled(z25);
                    lottieDrawable2.setMaintainOriginalImageBounds(z26);
                    lottieDrawable2.setClipToCompositionBounds(z27);
                    lottieDrawable2.setClipTextToBoundingBox(z28);
                    Marker markerForAnimationsDisabled = lottieDrawable2.getMarkerForAnimationsDisabled();
                    if (lottieDrawable2.animationsEnabled(context2) || markerForAnimationsDisabled == null) {
                        lottieDrawable2.setProgress(((Number) function02.invoke()).floatValue());
                    } else {
                        lottieDrawable2.setProgress(markerForAnimationsDisabled.startFrame);
                    }
                    lottieDrawable2.setBounds(0, 0, rect.width(), rect.height());
                    lottieDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return Unit.INSTANCE;
                }
            };
            final boolean z21 = z13;
            final boolean z22 = z10;
            final boolean z23 = z14;
            final boolean z24 = z15;
            CanvasKt.Canvas(0, gapComposer, lottieSize, function1);
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void invoke(Composer composer2, int i4) {
                        LottieAnimationKt.LottieAnimation(LottieComposition.this, function0, modifier3, z20, z22, z18, z19, renderMode3, z21, lottieDynamicProperties3, alignment3, contentScale3, z23, z24, map3, asyncUpdates3, z17, composer2, Updater.updateChangedFlags(i | 1), Updater.updateChangedFlags(i2), i3);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        final boolean z25 = z13;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final boolean z26 = z12;
        final RenderMode renderMode4 = renderMode2;
        final Modifier modifier4 = modifier2;
        final Alignment alignment4 = alignment2;
        final ContentScale contentScale4 = contentScale2;
        final boolean z27 = z10;
        final boolean z28 = z14;
        final boolean z29 = z15;
        final boolean z30 = z16;
        BoxKt.Box(modifier4, gapComposer, (i >> 6) & 14);
        gapComposer.end(false);
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void invoke(Composer composer2, int i4) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, function0, modifier4, z9, z27, z11, z26, renderMode4, z25, lottieDynamicProperties2, alignment4, contentScale4, z28, z29, map2, asyncUpdates4, z30, composer2, Updater.updateChangedFlags(i | 1), Updater.updateChangedFlags(i2), i3);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Deprecated
    public static final void LottieAnimation(final LottieComposition lottieComposition, final Function0 function0, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, boolean z6, Map map, AsyncUpdates asyncUpdates, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-674272918);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.$$INSTANCE : modifier;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z11 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i3 & 512) != 0 ? Alignment.Companion.Center : alignment;
        ContentScale contentScale2 = (i3 & 1024) != 0 ? ContentScale.Companion.Fit : contentScale;
        boolean z12 = (i3 & 2048) != 0 ? true : z5;
        boolean z13 = (i3 & 4096) != 0 ? false : z6;
        Map map2 = (i3 & PKIFailureInfo.certRevoked) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 16384) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z14 = (i3 & 32768) != 0 ? false : z7;
        int i4 = i << 3;
        int i5 = (i & 896) | (i & 112) | 1073938440 | (i & 7168) | (57344 & i) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024);
        int i6 = i2 << 3;
        int i7 = (i6 & 896) | ((i >> 27) & 14) | 32768 | (i6 & 112) | (i6 & 7168) | (458752 & i6) | (i6 & 3670016);
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        final RenderMode renderMode3 = renderMode2;
        final boolean z15 = z8;
        final Modifier modifier3 = modifier2;
        LottieAnimation(lottieComposition, function0, modifier3, z15, z9, false, z10, renderMode3, z11, lottieDynamicProperties3, alignment2, contentScale2, z12, z13, map2, asyncUpdates2, z14, gapComposer, i5, i7, 0);
        final boolean z16 = z9;
        final boolean z17 = z10;
        final boolean z18 = z11;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Alignment alignment3 = alignment2;
            final ContentScale contentScale3 = contentScale2;
            final boolean z19 = z12;
            final boolean z20 = z13;
            final Map map3 = map2;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z21 = z14;
            endRestartGroup.block = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void invoke(Composer composer2, int i8) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, function0, modifier3, z15, z16, z17, renderMode3, z18, lottieDynamicProperties3, alignment3, contentScale3, z19, z20, map3, asyncUpdates3, z21, composer2, Updater.updateChangedFlags(i | 1), Updater.updateChangedFlags(i2), i3);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
