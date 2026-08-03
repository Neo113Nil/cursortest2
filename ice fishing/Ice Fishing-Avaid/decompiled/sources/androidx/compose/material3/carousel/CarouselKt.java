package androidx.compose.material3.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Carousel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0084\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\"\u0010#\u001aÂ\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&26\u0010'\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b()\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020*0\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020(*\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010/\u001a\u0019\u00100\u001a\u00020(*\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010/\u001a:\u00101\u001a\u00020\u0007*\u00020\u00072\u0006\u00102\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0000\u001a7\u0010:\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020\u0005H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0018\u0010B\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u000205H\u0000\u001a\u0018\u0010C\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u000205H\u0001\u001a \u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020(H\u0002¨\u0006I"}, d2 = {"HorizontalMultiBrowseCarousel", "", "state", "Landroidx/compose/material3/carousel/CarouselState;", "preferredItemWidth", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "itemSpacing", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "minSmallItemWidth", "maxSmallItemWidth", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalMultiBrowseCarousel-3tcCNu0", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "itemWidth", "HorizontalUncontainedCarousel-VUP9l70", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalCenteredHeroCarousel", "maxItemWidth", "HorizontalCenteredHeroCarousel-p2lB3Bg", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/ui/Modifier;FFLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Carousel", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "keylineList", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "maxNonFocalVisibleItemCount", "Carousel-cJHQLPU", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "calculateBeforeContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateAfterContentPadding", "carouselItem", "index", "strategy", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "carouselItemDrawInfo", "Landroidx/compose/material3/carousel/CarouselItemDrawInfoImpl;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "drawDebugLines", "pageSize", "Landroidx/compose/material3/carousel/CarouselPageSize;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "drawDebugLines-1Yev-eo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/CarouselPageSize;JF)Landroidx/compose/ui/Modifier;", "calculateCurrentScrollOffset", "calculateMaxScrollOffset", "getProgress", "before", "Landroidx/compose/material3/carousel/Keyline;", "after", "unadjustedOffset", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CarouselKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel_cJHQLPU$lambda$5(CarouselState carouselState, Orientation orientation, Function2 function2, PaddingValues paddingValues, int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, Function4 function4, int i2, int i3, Composer composer, int i4) {
        m4672CarouselcJHQLPU(carouselState, orientation, function2, paddingValues, i, modifier, f, targetedFlingBehavior, z, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$1(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m4673HorizontalCenteredHeroCarouselp2lB3Bg(carouselState, modifier, f, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMultiBrowseCarousel_3tcCNu0$lambda$1(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m4674HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f, modifier, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalUncontainedCarousel_VUP9l70$lambda$1(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, Function4 function4, int i, int i2, Composer composer, int i3) {
        m4675HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier, f2, targetedFlingBehavior, z, paddingValues, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
    /* renamed from: HorizontalMultiBrowseCarousel-3tcCNu0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4674HorizontalMultiBrowseCarousel3tcCNu0(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        final float f6;
        int i7;
        int i8;
        int i9;
        int i10;
        final TargetedFlingBehavior targetedFlingBehavior3;
        float f7;
        float f8;
        boolean z3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        int i11;
        TargetedFlingBehavior targetedFlingBehavior4;
        float m4664getMinSmallItemSizeD9Ej5fM;
        TargetedFlingBehavior targetedFlingBehavior5;
        float f9;
        Modifier modifier3;
        int i12;
        PaddingValues m1194PaddingValues0680j_4;
        boolean changed;
        Object rememberedValue;
        float f10;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-221490402);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMultiBrowseCarousel)N(state,preferredItemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,minSmallItemWidth:c#ui.unit.Dp,maxSmallItemWidth:c#ui.unit.Dp,contentPadding,content)121@6255L7,125@6368L565,122@6267L1107:Carousel.kt#dcf9yb");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i10 & 306783379) != 306783378, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "114@5886L41");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i10 &= -57345;
                                }
                                carouselState2 = carouselState;
                                modifier3 = modifier2;
                                m4664getMinSmallItemSizeD9Ej5fM = f6;
                                f8 = f5;
                                targetedFlingBehavior5 = targetedFlingBehavior2;
                                z3 = z2;
                                i12 = i10;
                                f9 = f4;
                            } else {
                                Modifier modifier4 = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    f5 = Dp.m9732constructorimpl(0);
                                }
                                if ((i2 & 16) != 0) {
                                    int i15 = (i10 & 14) | 384;
                                    carouselState2 = carouselState;
                                    i10 &= -57345;
                                    targetedFlingBehavior4 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i15, 2);
                                    i11 = 0;
                                } else {
                                    carouselState2 = carouselState;
                                    i11 = 0;
                                    targetedFlingBehavior4 = targetedFlingBehavior;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                m4664getMinSmallItemSizeD9Ej5fM = i6 != 0 ? CarouselDefaults.INSTANCE.m4664getMinSmallItemSizeD9Ej5fM() : f6;
                                float m4663getMaxSmallItemSizeD9Ej5fM = i7 != 0 ? CarouselDefaults.INSTANCE.m4663getMaxSmallItemSizeD9Ej5fM() : f4;
                                if (i9 != 0) {
                                    float f11 = f5;
                                    m1194PaddingValues0680j_4 = PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(i11));
                                    f8 = f11;
                                    targetedFlingBehavior5 = targetedFlingBehavior4;
                                    f9 = m4663getMaxSmallItemSizeD9Ej5fM;
                                    z3 = z2;
                                    modifier3 = modifier4;
                                    i12 = i10;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-221490402, i12, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:120)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Orientation orientation = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1896111507, "CC(remember):Carousel.kt#9igjgp");
                                    changed = ((i12 & 112) != 32) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(carouselState2) | ((i12 & 3670016) != 1048576) | ((i12 & 29360128) == 8388608);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final CarouselState carouselState3 = carouselState2;
                                        final float f12 = f9;
                                        final float f13 = m4664getMinSmallItemSizeD9Ej5fM;
                                        rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                KeylineList HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0;
                                                HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0 = CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0(Density.this, f, carouselState3, f13, f12, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                                return HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0;
                                            }
                                        };
                                        f10 = f13;
                                        f7 = f12;
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        f7 = f9;
                                        f10 = m4664getMinSmallItemSizeD9Ej5fM;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i16 = i12 << 9;
                                    PaddingValues paddingValues3 = m1194PaddingValues0680j_4;
                                    m4672CarouselcJHQLPU(carouselState, orientation, (Function2) rememberedValue, paddingValues3, 2, modifier3, f8, targetedFlingBehavior5, z3, function4, startRestartGroup, (i12 & 14) | 24624 | ((i12 >> 15) & 7168) | (458752 & i16) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (1879048192 & i12), 0);
                                    startRestartGroup = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues2 = paddingValues3;
                                    modifier2 = modifier3;
                                    targetedFlingBehavior3 = targetedFlingBehavior5;
                                    f6 = f10;
                                } else {
                                    targetedFlingBehavior5 = targetedFlingBehavior4;
                                    f9 = m4663getMaxSmallItemSizeD9Ej5fM;
                                    f8 = f5;
                                    z3 = z2;
                                    modifier3 = modifier4;
                                    i12 = i10;
                                }
                            }
                            m1194PaddingValues0680j_4 = paddingValues;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume2;
                            Orientation orientation2 = Orientation.Horizontal;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1896111507, "CC(remember):Carousel.kt#9igjgp");
                            changed = ((i12 & 112) != 32) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(carouselState2) | ((i12 & 3670016) != 1048576) | ((i12 & 29360128) == 8388608);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            final CarouselState carouselState32 = carouselState2;
                            final float f122 = f9;
                            final float f132 = m4664getMinSmallItemSizeD9Ej5fM;
                            rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    KeylineList HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0;
                                    HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0 = CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0(Density.this, f, carouselState32, f132, f122, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                    return HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0;
                                }
                            };
                            f10 = f132;
                            f7 = f122;
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i162 = i12 << 9;
                            PaddingValues paddingValues32 = m1194PaddingValues0680j_4;
                            m4672CarouselcJHQLPU(carouselState, orientation2, (Function2) rememberedValue, paddingValues32, 2, modifier3, f8, targetedFlingBehavior5, z3, function4, startRestartGroup, (i12 & 14) | 24624 | ((i12 >> 15) & 7168) | (458752 & i162) | (i162 & 3670016) | (i162 & 29360128) | (i162 & 234881024) | (1879048192 & i12), 0);
                            startRestartGroup = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            paddingValues2 = paddingValues32;
                            modifier2 = modifier3;
                            targetedFlingBehavior3 = targetedFlingBehavior5;
                            f6 = f10;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            targetedFlingBehavior3 = targetedFlingBehavior;
                            f7 = f4;
                            f8 = f5;
                            z3 = z2;
                            paddingValues2 = paddingValues;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            final float f14 = f8;
                            final boolean z4 = z3;
                            final float f15 = f7;
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit HorizontalMultiBrowseCarousel_3tcCNu0$lambda$1;
                                    HorizontalMultiBrowseCarousel_3tcCNu0$lambda$1 = CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$1(CarouselState.this, f, modifier5, f14, targetedFlingBehavior3, z4, f6, f15, paddingValues2, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return HorizontalMultiBrowseCarousel_3tcCNu0$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i & 805306368) == 0) {
                    }
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i10 & 306783379) != 306783378, i10 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i & 805306368) == 0) {
                }
                i10 = i3;
                if (startRestartGroup.shouldExecute((i10 & 306783379) != 306783378, i10 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            i10 = i3;
            if (startRestartGroup.shouldExecute((i10 & 306783379) != 306783378, i10 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        i10 = i3;
        if (startRestartGroup.shouldExecute((i10 & 306783379) != 306783378, i10 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalMultiBrowseCarousel_3tcCNu0$lambda$0$0(Density density, float f, CarouselState carouselState, float f2, float f3, float f4, float f5) {
        return KeylinesKt.multiBrowseKeylineList(density, f4, density.mo528toPx0680j_4(f), f5, carouselState.getPagerState().getPageCountState().getValue().invoke().intValue(), density.mo528toPx0680j_4(f2), density.mo528toPx0680j_4(f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ab  */
    /* renamed from: HorizontalUncontainedCarousel-VUP9l70, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4675HorizontalUncontainedCarouselVUP9l70(final CarouselState carouselState, final float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        final float f4;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Modifier modifier4;
        float f5;
        TargetedFlingBehavior targetedFlingBehavior4;
        boolean z4;
        PaddingValues m1194PaddingValues0680j_4;
        int i9;
        boolean changed;
        Object rememberedValue;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(534621863);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalUncontainedCarousel)N(state,itemWidth:c#ui.unit.Dp,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,contentPadding,content)189@9347L7,193@9460L337,190@9359L866:Carousel.kt#dcf9yb");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
                        }
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "184@9124L21");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    f3 = Dp.m9732constructorimpl(0);
                                }
                                if ((i2 & 16) != 0) {
                                    i8 = i7 & (-57345);
                                    targetedFlingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                } else {
                                    i8 = i7;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    modifier4 = modifier2;
                                    f5 = f3;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z4 = z2;
                                    m1194PaddingValues0680j_4 = PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(0));
                                    i9 = 534621863;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i9, i8, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:188)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    Orientation orientation = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624447592, "CC(remember):Carousel.kt#9igjgp");
                                    changed = ((i8 & 112) == 32) | startRestartGroup.changed(density);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                                HorizontalUncontainedCarousel_VUP9l70$lambda$0$0 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$0$0(Density.this, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                                return HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i12 = i8 << 9;
                                    composer2 = startRestartGroup;
                                    m4672CarouselcJHQLPU(carouselState, orientation, (Function2) rememberedValue, m1194PaddingValues0680j_4, 0, modifier4, f5, targetedFlingBehavior4, z4, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues3 = m1194PaddingValues0680j_4;
                                    modifier3 = modifier4;
                                    f4 = f5;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                }
                                f5 = f3;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                z4 = z2;
                                m1194PaddingValues0680j_4 = paddingValues2;
                                i9 = 534621863;
                                modifier4 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Density density2 = (Density) consume2;
                                Orientation orientation2 = Orientation.Horizontal;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624447592, "CC(remember):Carousel.kt#9igjgp");
                                changed = ((i8 & 112) == 32) | startRestartGroup.changed(density2);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                        HorizontalUncontainedCarousel_VUP9l70$lambda$0$0 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$0$0(Density.this, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                        return HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i122 = i8 << 9;
                                composer2 = startRestartGroup;
                                m4672CarouselcJHQLPU(carouselState, orientation2, (Function2) rememberedValue, m1194PaddingValues0680j_4, 0, modifier4, f5, targetedFlingBehavior4, z4, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                paddingValues3 = m1194PaddingValues0680j_4;
                                modifier3 = modifier4;
                                f4 = f5;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                z3 = z4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i8 = i7 & (-57345);
                                    f5 = f3;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z4 = z2;
                                    m1194PaddingValues0680j_4 = paddingValues2;
                                    i9 = 534621863;
                                    modifier4 = modifier2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume22 = startRestartGroup.consume(localDensity22);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density22 = (Density) consume22;
                                    Orientation orientation22 = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624447592, "CC(remember):Carousel.kt#9igjgp");
                                    changed = ((i8 & 112) == 32) | startRestartGroup.changed(density22);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                            HorizontalUncontainedCarousel_VUP9l70$lambda$0$0 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$0$0(Density.this, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                            return HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i1222 = i8 << 9;
                                    composer2 = startRestartGroup;
                                    m4672CarouselcJHQLPU(carouselState, orientation22, (Function2) rememberedValue, m1194PaddingValues0680j_4, 0, modifier4, f5, targetedFlingBehavior4, z4, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i1222) | (3670016 & i1222) | (29360128 & i1222) | (i1222 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    paddingValues3 = m1194PaddingValues0680j_4;
                                    modifier3 = modifier4;
                                    f4 = f5;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                } else {
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z4 = z2;
                                    m1194PaddingValues0680j_4 = paddingValues2;
                                    i8 = i7;
                                    i9 = 534621863;
                                    modifier4 = modifier2;
                                    f5 = f3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume222 = startRestartGroup.consume(localDensity222);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density222 = (Density) consume222;
                                    Orientation orientation222 = Orientation.Horizontal;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1624447592, "CC(remember):Carousel.kt#9igjgp");
                                    changed = ((i8 & 112) == 32) | startRestartGroup.changed(density222);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                            HorizontalUncontainedCarousel_VUP9l70$lambda$0$0 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$0$0(Density.this, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                            return HorizontalUncontainedCarousel_VUP9l70$lambda$0$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i12222 = i8 << 9;
                                    composer2 = startRestartGroup;
                                    m4672CarouselcJHQLPU(carouselState, orientation222, (Function2) rememberedValue, m1194PaddingValues0680j_4, 0, modifier4, f5, targetedFlingBehavior4, z4, function4, composer2, (i8 & 14) | 24624 | ((i8 >> 9) & 7168) | (458752 & i12222) | (3670016 & i12222) | (29360128 & i12222) | (i12222 & 234881024) | ((i8 << 6) & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    paddingValues3 = m1194PaddingValues0680j_4;
                                    modifier3 = modifier4;
                                    f4 = f5;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                }
                            }
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            z3 = z2;
                            paddingValues3 = paddingValues2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit HorizontalUncontainedCarousel_VUP9l70$lambda$1;
                                    HorizontalUncontainedCarousel_VUP9l70$lambda$1 = CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$1(CarouselState.this, f, modifier3, f4, targetedFlingBehavior3, z3, paddingValues3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return HorizontalUncontainedCarousel_VUP9l70$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    paddingValues2 = paddingValues;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                paddingValues2 = paddingValues;
                if ((i & 12582912) == 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            paddingValues2 = paddingValues;
            if ((i & 12582912) == 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i & 12582912) == 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalUncontainedCarousel_VUP9l70$lambda$0$0(Density density, float f, float f2, float f3) {
        return KeylinesKt.uncontainedKeylineList(density, f2, density.mo528toPx0680j_4(f), f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0228  */
    /* renamed from: HorizontalCenteredHeroCarousel-p2lB3Bg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4673HorizontalCenteredHeroCarouselp2lB3Bg(final CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f5;
        int i5;
        float f6;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        boolean z2;
        int i7;
        final float f7;
        int i8;
        int i9;
        int i10;
        int i11;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final float f8;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        Composer composer2;
        final float f9;
        final float f10;
        ScopeUpdateScope endRestartGroup;
        CarouselState carouselState2;
        int i12;
        float f11;
        float f12;
        float f13;
        TargetedFlingBehavior targetedFlingBehavior4;
        Modifier modifier4;
        int i13;
        PaddingValues m1194PaddingValues0680j_4;
        final float f14;
        boolean changed;
        Object rememberedValue;
        float f15;
        float f16;
        float f17;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1493031269);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalCenteredHeroCarousel)N(state,modifier,maxItemWidth:c#ui.unit.Dp,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,minSmallItemWidth:c#ui.unit.Dp,maxSmallItemWidth:c#ui.unit.Dp,contentPadding,content)254@12506L7,258@12619L625,255@12518L1168:Carousel.kt#dcf9yb");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f5 = f;
                i3 |= startRestartGroup.changed(f5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f6 = f2;
                    i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                            if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                i14 = 16384;
                                i3 |= i14;
                            }
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i14 = 8192;
                        i3 |= i14;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            f7 = f3;
                        } else {
                            f7 = f3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(f7) ? 1048576 : 524288;
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(function4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            i11 = i3;
                            if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "247@12137L41");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i11 &= -57345;
                                    }
                                    carouselState2 = carouselState;
                                    modifier4 = modifier2;
                                    f12 = f7;
                                    f13 = f6;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i13 = i11;
                                    f11 = f4;
                                } else {
                                    Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        f5 = Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM();
                                    }
                                    if (i5 != 0) {
                                        f6 = Dp.m9732constructorimpl(0);
                                    }
                                    if ((i2 & 16) != 0) {
                                        int i16 = (i11 & 14) | 384;
                                        i12 = 0;
                                        carouselState2 = carouselState;
                                        i11 &= -57345;
                                        targetedFlingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i16, 2);
                                    } else {
                                        carouselState2 = carouselState;
                                        i12 = 0;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        f7 = CarouselDefaults.INSTANCE.m4664getMinSmallItemSizeD9Ej5fM();
                                    }
                                    float m4663getMaxSmallItemSizeD9Ej5fM = i8 != 0 ? CarouselDefaults.INSTANCE.m4663getMaxSmallItemSizeD9Ej5fM() : f4;
                                    if (i10 != 0) {
                                        f13 = f6;
                                        modifier4 = modifier5;
                                        m1194PaddingValues0680j_4 = PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(i12));
                                        f11 = m4663getMaxSmallItemSizeD9Ej5fM;
                                        f12 = f7;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        i13 = i11;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1493031269, i13, -1, "androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel (Carousel.kt:253)");
                                        }
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Density density = (Density) consume;
                                        Orientation orientation = Orientation.Horizontal;
                                        f14 = f12;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 283996118, "CC(remember):Carousel.kt#9igjgp");
                                        changed = ((i13 & 896) != 256) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(carouselState2) | ((i13 & 3670016) != 1048576) | ((i13 & 29360128) != 8388608);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            final CarouselState carouselState3 = carouselState2;
                                            final float f18 = f11;
                                            final float f19 = f5;
                                            rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda13
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    KeylineList HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0;
                                                    HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0 = CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0(Density.this, f19, carouselState3, f14, f18, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                                    return HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0;
                                                }
                                            };
                                            f15 = f19;
                                            f16 = f14;
                                            f17 = f18;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        } else {
                                            f16 = f14;
                                            f17 = f11;
                                            f15 = f5;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int i17 = i13 << 9;
                                        PaddingValues paddingValues3 = m1194PaddingValues0680j_4;
                                        boolean z4 = z2;
                                        m4672CarouselcJHQLPU(carouselState, orientation, (Function2) rememberedValue, paddingValues3, 2, modifier4, f13, targetedFlingBehavior4, z4, function4, startRestartGroup, (i13 & 14) | 24624 | ((i13 >> 15) & 7168) | ((i13 << 12) & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (1879048192 & i13), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2 = startRestartGroup;
                                        paddingValues2 = paddingValues3;
                                        modifier3 = modifier4;
                                        f8 = f13;
                                        targetedFlingBehavior3 = targetedFlingBehavior4;
                                        z3 = z4;
                                        f9 = f15;
                                        f7 = f16;
                                        f10 = f17;
                                    } else {
                                        f11 = m4663getMaxSmallItemSizeD9Ej5fM;
                                        f12 = f7;
                                        f13 = f6;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        modifier4 = modifier5;
                                        i13 = i11;
                                    }
                                }
                                m1194PaddingValues0680j_4 = paddingValues;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Density density2 = (Density) consume2;
                                Orientation orientation2 = Orientation.Horizontal;
                                f14 = f12;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 283996118, "CC(remember):Carousel.kt#9igjgp");
                                changed = ((i13 & 896) != 256) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(carouselState2) | ((i13 & 3670016) != 1048576) | ((i13 & 29360128) != 8388608);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                final CarouselState carouselState32 = carouselState2;
                                final float f182 = f11;
                                final float f192 = f5;
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        KeylineList HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0;
                                        HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0 = CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0(Density.this, f192, carouselState32, f14, f182, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                                        return HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0;
                                    }
                                };
                                f15 = f192;
                                f16 = f14;
                                f17 = f182;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i172 = i13 << 9;
                                PaddingValues paddingValues32 = m1194PaddingValues0680j_4;
                                boolean z42 = z2;
                                m4672CarouselcJHQLPU(carouselState, orientation2, (Function2) rememberedValue, paddingValues32, 2, modifier4, f13, targetedFlingBehavior4, z42, function4, startRestartGroup, (i13 & 14) | 24624 | ((i13 >> 15) & 7168) | ((i13 << 12) & 458752) | (i172 & 3670016) | (i172 & 29360128) | (i172 & 234881024) | (1879048192 & i13), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = startRestartGroup;
                                paddingValues2 = paddingValues32;
                                modifier3 = modifier4;
                                f8 = f13;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                z3 = z42;
                                f9 = f15;
                                f7 = f16;
                                f10 = f17;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                modifier3 = modifier2;
                                f8 = f6;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                z3 = z2;
                                composer2 = startRestartGroup;
                                f9 = f5;
                                f10 = f4;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$1;
                                        HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$1 = CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$1(CarouselState.this, modifier3, f9, f8, targetedFlingBehavior3, z3, f7, f10, paddingValues2, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        if ((i & 805306368) == 0) {
                        }
                        i11 = i3;
                        if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                    }
                    i11 = i3;
                    if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f6 = f2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i & 805306368) == 0) {
                }
                i11 = i3;
                if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f5 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i & 805306368) == 0) {
            }
            i11 = i3;
            if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i & 805306368) == 0) {
        }
        i11 = i3;
        if (!startRestartGroup.shouldExecute((i11 & 306783379) == 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035b  */
    /* renamed from: Carousel-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4672CarouselcJHQLPU(CarouselState carouselState, final Orientation orientation, final Function2<? super Float, ? super Float, KeylineList> function2, final PaddingValues paddingValues, final int i, Modifier modifier, float f, TargetedFlingBehavior targetedFlingBehavior, boolean z, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        int i7;
        int i8;
        final CarouselState carouselState2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z2;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        boolean z3;
        TargetedFlingBehavior targetedFlingBehavior4;
        boolean z4;
        TargetedFlingBehavior targetedFlingBehavior5;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-2077912500);
        ComposerKt.sourceInformation(startRestartGroup, "C(Carousel)N(state,orientation,keylineList,contentPadding,maxNonFocalVisibleItemCount,modifier,itemSpacing:c#ui.unit.Dp,flingBehavior,userScrollEnabled,content)323@15830L42,324@15918L41,326@15987L118:Carousel.kt#dcf9yb");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i10 = 8388608;
                            i4 |= i10;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i10 = 4194304;
                    i4 |= i10;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i7 = i11;
                    i4 |= startRestartGroup.changed(z) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i2 & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i8 = i4;
                    if (!startRestartGroup.shouldExecute((i8 & 306783379) == 306783378, i8 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "319@15629L41");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            carouselState2 = carouselState;
                            z4 = z;
                            targetedFlingBehavior5 = targetedFlingBehavior2;
                            i9 = i8;
                        } else {
                            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                f2 = Dp.m9732constructorimpl(0);
                            }
                            if ((i3 & 128) != 0) {
                                int i12 = (i8 & 14) | 384;
                                z3 = true;
                                carouselState2 = carouselState;
                                i8 &= -29360129;
                                targetedFlingBehavior4 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState2, null, startRestartGroup, i12, 2);
                            } else {
                                carouselState2 = carouselState;
                                z3 = true;
                                targetedFlingBehavior4 = targetedFlingBehavior;
                            }
                            if (i6 != 0) {
                                targetedFlingBehavior5 = targetedFlingBehavior4;
                                z4 = z3;
                            } else {
                                z4 = z;
                                targetedFlingBehavior5 = targetedFlingBehavior4;
                            }
                            modifier2 = modifier3;
                            i9 = i8;
                        }
                        float f4 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2077912500, i9, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:322)");
                        }
                        int i13 = ((i9 >> 9) & 14) | (i9 & 112);
                        float calculateBeforeContentPadding = calculateBeforeContentPadding(paddingValues, orientation, startRestartGroup, i13);
                        float calculateAfterContentPadding = calculateAfterContentPadding(paddingValues, orientation, startRestartGroup, i13);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285902946, "CC(remember):Carousel.kt#9igjgp");
                        boolean z5 = (i9 & 896) == 256;
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new CarouselPageSize(function2, calculateBeforeContentPadding, calculateAfterContentPadding);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final CarouselPageSize carouselPageSize = (CarouselPageSize) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SnapPosition KeylineSnapPosition = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
                        if (orientation == Orientation.Horizontal) {
                            startRestartGroup.startReplaceGroup(273336201);
                            ComposerKt.sourceInformation(startRestartGroup, "347@16899L24,348@16935L1024,333@16218L1741");
                            CarouselPagerState pagerState = carouselState2.getPagerState();
                            PaddingValues m1198PaddingValuesa9UjIt4$default = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, paddingValues.getTop(), 0.0f, paddingValues.getBottom(), 5, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285932036, "CC(remember):Carousel.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Carousel_cJHQLPU$lambda$1$0;
                                        Carousel_cJHQLPU$lambda$1$0 = CarouselKt.Carousel_cJHQLPU$lambda$1$0((SemanticsPropertyReceiver) obj);
                                        return Carousel_cJHQLPU$lambda$1$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i14 = i9;
                            PagerKt.m1520HorizontalPager8jOkeI(pagerState, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue2, 1, null), m1198PaddingValuesa9UjIt4$default, carouselPageSize, i, f4, null, targetedFlingBehavior5, z4, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1817116752, true, new Function4() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    Unit Carousel_cJHQLPU$lambda$2;
                                    Carousel_cJHQLPU$lambda$2 = CarouselKt.Carousel_cJHQLPU$lambda$2(CarouselState.this, carouselPageSize, function4, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                                    return Carousel_cJHQLPU$lambda$2;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i14 & 57344) | ((i14 >> 3) & 458752) | (i14 & 29360128) | (i14 & 234881024), 24576, 11840);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            int i15 = i9;
                            if (orientation == Orientation.Vertical) {
                                startRestartGroup.startReplaceGroup(275127381);
                                ComposerKt.sourceInformation(startRestartGroup, "382@18318L7,383@18410L7,391@18755L24,392@18791L1024,377@18022L1793");
                                CarouselPagerState pagerState2 = carouselState2.getPagerState();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PaddingValues m1198PaddingValuesa9UjIt4$default2 = PaddingKt.m1198PaddingValuesa9UjIt4$default(calculateStartPadding, 0.0f, PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume2), 0.0f, 10, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285991428, "CC(remember):Carousel.kt#9igjgp");
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Carousel_cJHQLPU$lambda$3$0;
                                            Carousel_cJHQLPU$lambda$3$0 = CarouselKt.Carousel_cJHQLPU$lambda$3$0((SemanticsPropertyReceiver) obj);
                                            return Carousel_cJHQLPU$lambda$3$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PagerKt.m1522VerticalPager8jOkeI(pagerState2, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue3, 1, null), m1198PaddingValuesa9UjIt4$default2, carouselPageSize, i, f4, null, targetedFlingBehavior5, z4, false, null, null, KeylineSnapPosition, null, ComposableLambdaKt.rememberComposableLambda(-1042567175, true, new Function4() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        Unit Carousel_cJHQLPU$lambda$4;
                                        Carousel_cJHQLPU$lambda$4 = CarouselKt.Carousel_cJHQLPU$lambda$4(CarouselState.this, carouselPageSize, function4, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                                        return Carousel_cJHQLPU$lambda$4;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i15 & 57344) | ((i15 >> 3) & 458752) | (i15 & 29360128) | (i15 & 234881024), 24576, 11840);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(276856406);
                                startRestartGroup.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = f4;
                        targetedFlingBehavior3 = targetedFlingBehavior5;
                        z2 = z4;
                    } else {
                        carouselState2 = carouselState;
                        startRestartGroup.skipToGroupEnd();
                        targetedFlingBehavior3 = targetedFlingBehavior;
                        z2 = z;
                        f3 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Carousel_cJHQLPU$lambda$5;
                                Carousel_cJHQLPU$lambda$5 = CarouselKt.Carousel_cJHQLPU$lambda$5(CarouselState.this, orientation, function2, paddingValues, i, modifier4, f3, targetedFlingBehavior3, z2, function4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return Carousel_cJHQLPU$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i11;
                if ((i2 & 805306368) == 0) {
                }
                i8 = i4;
                if (!startRestartGroup.shouldExecute((i8 & 306783379) == 306783378, i8 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((i2 & 12582912) == 0) {
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i11;
            if ((i2 & 805306368) == 0) {
            }
            i8 = i4;
            if (!startRestartGroup.shouldExecute((i8 & 306783379) == 306783378, i8 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 12582912) == 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i11;
        if ((i2 & 805306368) == 0) {
        }
        i8 = i4;
        if (!startRestartGroup.shouldExecute((i8 & 306783379) == 306783378, i8 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel_cJHQLPU$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8882getCarouselo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel_cJHQLPU$lambda$2(CarouselState carouselState, final CarouselPageSize carouselPageSize, Function4 function4, PagerScope pagerScope, int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "CN(page)349@16980L39,350@17044L63,351@17136L390,368@17727L21,363@17540L409:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1817116752, i2, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:349)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1802492279, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new CarouselItemDrawInfoImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl = (CarouselItemDrawInfoImpl) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1802494351, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new CarouselItemScopeImpl(carouselItemDrawInfoImpl);
            composer.updateRememberedValue(rememberedValue2);
        }
        CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1802497622, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo422createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Rectangle(CarouselItemDrawInfoImpl.this.getMaskRect());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        CarouselKt$Carousel$2$clipShape$1$1 carouselKt$Carousel$2$clipShape$1$1 = (CarouselKt$Carousel$2$clipShape$1$1) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier.Companion companion = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1802516165, "CC(remember):Carousel.kt#9igjgp");
        boolean changed = composer.changed(carouselPageSize);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Strategy strategy;
                    strategy = CarouselPageSize.this.getStrategy();
                    return strategy;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier carouselItem = carouselItem(companion, i, carouselState, (Function0) rememberedValue4, carouselItemDrawInfoImpl, carouselKt$Carousel$2$clipShape$1$1);
        ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, carouselItem);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -868976154, "C373@17922L13:Carousel.kt#dcf9yb");
        function4.invoke(carouselItemScopeImpl, Integer.valueOf(i), composer, Integer.valueOf(i2 & 112));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel_cJHQLPU$lambda$3$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8882getCarouselo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Carousel_cJHQLPU$lambda$4(CarouselState carouselState, final CarouselPageSize carouselPageSize, Function4 function4, PagerScope pagerScope, int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "CN(page)393@18836L39,394@18900L63,395@18992L390,412@19583L21,407@19396L409:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1042567175, i2, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:393)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1179673728, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new CarouselItemDrawInfoImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl = (CarouselItemDrawInfoImpl) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1179671656, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new CarouselItemScopeImpl(carouselItemDrawInfoImpl);
            composer.updateRememberedValue(rememberedValue2);
        }
        CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1179668385, "CC(remember):Carousel.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo422createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Rectangle(CarouselItemDrawInfoImpl.this.getMaskRect());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        CarouselKt$Carousel$4$clipShape$1$1 carouselKt$Carousel$4$clipShape$1$1 = (CarouselKt$Carousel$4$clipShape$1$1) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier.Companion companion = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1179649842, "CC(remember):Carousel.kt#9igjgp");
        boolean changed = composer.changed(carouselPageSize);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Strategy strategy;
                    strategy = CarouselPageSize.this.getStrategy();
                    return strategy;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier carouselItem = carouselItem(companion, i, carouselState, (Function0) rememberedValue4, carouselItemDrawInfoImpl, carouselKt$Carousel$4$clipShape$1$1);
        ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, carouselItem);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
        Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1173158141, "C417@19778L13:Carousel.kt#dcf9yb");
        function4.invoke(carouselItemScopeImpl, Integer.valueOf(i), composer, Integer.valueOf(i2 & 112));
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateStartPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1896839347, "C(calculateBeforeContentPadding)N(orientation)432@20152L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:424)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-143576798);
            composer.endReplaceGroup();
            calculateStartPadding = paddingValues.getTop();
        } else {
            composer.startReplaceGroup(-143525276);
            ComposerKt.sourceInformation(composer, "429@20103L7");
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) consume);
            composer.endReplaceGroup();
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo528toPx0680j_4 = ((Density) consume2).mo528toPx0680j_4(calculateStartPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo528toPx0680j_4;
    }

    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        float calculateEndPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1018496720, "C(calculateAfterContentPadding)N(orientation)444@20510L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:436)");
        }
        if (orientation == Orientation.Vertical) {
            composer.startReplaceGroup(-1908011422);
            composer.endReplaceGroup();
            calculateEndPadding = paddingValues.getBottom();
        } else {
            composer.startReplaceGroup(-1907957079);
            ComposerKt.sourceInformation(composer, "441@20461L7");
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) consume);
            composer.endReplaceGroup();
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo528toPx0680j_4 = ((Density) consume2).mo528toPx0680j_4(calculateEndPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mo528toPx0680j_4;
    }

    public static final Modifier carouselItem(Modifier modifier, final int i, final CarouselState carouselState, final Function0<Strategy> function0, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult carouselItem$lambda$0;
                carouselItem$lambda$0 = CarouselKt.carouselItem$lambda$0(Function0.this, carouselState, i, carouselItemDrawInfoImpl, shape, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return carouselItem$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult carouselItem$lambda$0(Function0 function0, final CarouselState carouselState, final int i, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long m9664copyZbe2FdA;
        final Strategy strategy = (Strategy) function0.invoke();
        if (!strategy.getIsValid()) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit carouselItem$lambda$0$0;
                    carouselItem$lambda$0$0 = CarouselKt.carouselItem$lambda$0$0((Placeable.PlacementScope) obj);
                    return carouselItem$lambda$0$0;
                }
            }, 4, null);
        }
        final boolean z = carouselState.getPagerState().getLayoutInfo().getOrientation() == Orientation.Vertical;
        final boolean z2 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        float itemMainAxisSize = strategy.getItemMainAxisSize();
        if (z) {
            m9664copyZbe2FdA = Constraints.m9664copyZbe2FdA(constraints.getValue(), Constraints.m9677getMinWidthimpl(constraints.getValue()), Constraints.m9675getMaxWidthimpl(constraints.getValue()), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize));
        } else {
            m9664copyZbe2FdA = Constraints.m9664copyZbe2FdA(constraints.getValue(), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize), Constraints.m9676getMinHeightimpl(constraints.getValue()), Constraints.m9674getMaxHeightimpl(constraints.getValue()));
        }
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(m9664copyZbe2FdA);
        final float f = i != carouselState.getPagerState().getCurrentPage() ? i == 0 ? 0.0f : 1.0f / i : 1.0f;
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit carouselItem$lambda$0$1;
                carouselItem$lambda$0$1 = CarouselKt.carouselItem$lambda$0$1(Placeable.this, f, carouselState, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (Placeable.PlacementScope) obj);
                return carouselItem$lambda$0$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit carouselItem$lambda$0$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit carouselItem$lambda$0$1(Placeable placeable, float f, final CarouselState carouselState, final Strategy strategy, final int i, final boolean z, final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final Shape shape, final boolean z2, Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(placeable, 0, 0, f, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit carouselItem$lambda$0$1$0;
                carouselItem$lambda$0$1$0 = CarouselKt.carouselItem$lambda$0$1$0(CarouselState.this, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (GraphicsLayerScope) obj);
                return carouselItem$lambda$0$1$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit carouselItem$lambda$0$1$0(CarouselState carouselState, Strategy strategy, int i, boolean z, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float calculateCurrentScrollOffset = calculateCurrentScrollOffset(carouselState, strategy);
        float calculateMaxScrollOffset = calculateMaxScrollOffset(carouselState, strategy);
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset, calculateMaxScrollOffset, false, 4, null);
        KeylineList keylineListForScrollOffset$material3 = strategy.getKeylineListForScrollOffset$material3(calculateCurrentScrollOffset, calculateMaxScrollOffset, true);
        float itemMainAxisSize = ((i * (strategy.getItemMainAxisSize() + strategy.getItemSpacing())) + (strategy.getItemMainAxisSize() / 2.0f)) - calculateCurrentScrollOffset;
        Keyline keylineBefore = keylineListForScrollOffset$material3$default.getKeylineBefore(itemMainAxisSize);
        Keyline keylineAfter = keylineListForScrollOffset$material3$default.getKeylineAfter(itemMainAxisSize);
        Keyline lerp = KeylineListKt.lerp(keylineBefore, keylineAfter, getProgress(keylineBefore, keylineAfter, itemMainAxisSize));
        boolean areEqual = Intrinsics.areEqual(keylineBefore, keylineAfter);
        float intBitsToFloat = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) : strategy.getItemMainAxisSize()) / 2.0f;
        float itemMainAxisSize2 = (z ? strategy.getItemMainAxisSize() : Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        float intBitsToFloat2 = (z ? Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)) : lerp.getSize()) / 2.0f;
        float size = (z ? lerp.getSize() : Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        Rect rect = new Rect(intBitsToFloat - intBitsToFloat2, itemMainAxisSize2 - size, intBitsToFloat + intBitsToFloat2, itemMainAxisSize2 + size);
        carouselItemDrawInfoImpl.setSizeState(lerp.getSize());
        Iterator<Keyline> it = keylineListForScrollOffset$material3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Keyline next = it.next();
        if (it.hasNext()) {
            float size2 = next.getSize();
            do {
                Keyline next2 = it.next();
                float size3 = next2.getSize();
                if (Float.compare(size2, size3) > 0) {
                    next = next2;
                    size2 = size3;
                }
            } while (it.hasNext());
        }
        carouselItemDrawInfoImpl.setMinSizeState(next.getSize());
        carouselItemDrawInfoImpl.setMaxSizeState(keylineListForScrollOffset$material3.getFirstFocal().getSize());
        carouselItemDrawInfoImpl.setMaskRectState(rect);
        graphicsLayerScope.setClip(!Intrinsics.areEqual(rect, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)), Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)))));
        graphicsLayerScope.setShape(shape);
        float offset = lerp.getOffset() - itemMainAxisSize;
        if (areEqual) {
            offset += (itemMainAxisSize - lerp.getUnadjustedOffset()) / lerp.getSize();
        }
        if (z) {
            graphicsLayerScope.setTranslationY(offset);
        } else {
            if (z2) {
                offset = -offset;
            }
            graphicsLayerScope.setTranslationX(offset);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: drawDebugLines-1Yev-eo$default, reason: not valid java name */
    static /* synthetic */ Modifier m4677drawDebugLines1Yeveo$default(Modifier modifier, CarouselState carouselState, CarouselPageSize carouselPageSize, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Color.INSTANCE.m6819getMagenta0d7_KjU();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            f = Dp.m9732constructorimpl(4);
        }
        return m4676drawDebugLines1Yeveo(modifier, carouselState, carouselPageSize, j2, f);
    }

    /* renamed from: drawDebugLines-1Yev-eo, reason: not valid java name */
    private static final Modifier m4676drawDebugLines1Yeveo(Modifier modifier, final CarouselState carouselState, final CarouselPageSize carouselPageSize, final long j, final float f) {
        return DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit drawDebugLines_1Yev_eo$lambda$0;
                drawDebugLines_1Yev_eo$lambda$0 = CarouselKt.drawDebugLines_1Yev_eo$lambda$0(CarouselPageSize.this, carouselState, f, j, (ContentDrawScope) obj);
                return drawDebugLines_1Yev_eo$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawDebugLines_1Yev_eo$lambda$0(CarouselPageSize carouselPageSize, CarouselState carouselState, float f, long j, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Strategy strategy = carouselPageSize.getStrategy();
        KeylineList keylineListForScrollOffset$material3$default = Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset(carouselState, strategy), calculateMaxScrollOffset(carouselState, strategy), false, 4, null);
        float f2 = contentDrawScope.mo528toPx0680j_4(f);
        int i = 0;
        for (int size = keylineListForScrollOffset$material3$default.size(); i < size; size = size) {
            DrawScope.CC.m7371drawLineNGM6Ib0$default(contentDrawScope, j, Offset.m6511constructorimpl((Float.floatToRawIntBits(keylineListForScrollOffset$material3$default.get(i).getOffset()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6511constructorimpl((Float.floatToRawIntBits(keylineListForScrollOffset$material3$default.get(i).getOffset()) << 32) | (4294967295L & Float.floatToRawIntBits(100.0f))), f2, 0, null, 0.0f, null, 0, 496, null);
            i++;
        }
        return Unit.INSTANCE;
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState().getCurrentPageOffsetFraction() * itemMainAxisSize)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState().getCurrentPage(), carouselState.getPagerState().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState().getPageCount();
        return RangesKt.coerceAtLeast(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1))) - strategy.getAvailableSpace(), 0.0f);
    }

    private static final float getProgress(Keyline keyline, Keyline keyline2, float f) {
        if (Intrinsics.areEqual(keyline, keyline2)) {
            return 1.0f;
        }
        return (f - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeylineList HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$0$0(Density density, float f, CarouselState carouselState, float f2, float f3, float f4, float f5) {
        return KeylinesKt.heroKeylineList(density, f4, !Float.isNaN(f) ? Float.valueOf(density.mo528toPx0680j_4(f)) : null, f5, carouselState.getPagerState().getPageCountState().getValue().invoke().intValue(), true, density.mo528toPx0680j_4(f2), density.mo528toPx0680j_4(f3));
    }
}
