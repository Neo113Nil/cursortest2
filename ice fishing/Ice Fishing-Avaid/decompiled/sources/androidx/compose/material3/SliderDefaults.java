package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.window.core.layout.WindowSizeClass;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006Js\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#JG\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010+J\u0093\u0001\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\b\u0002\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02%\b\u0002\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u009b\u0001\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u00108\u001a\u0002042\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\b\u0002\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02%\b\u0002\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007¢\u0006\u0004\b9\u0010:J\u009d\u0001\u0010;\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\b\u0002\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02%\b\u0002\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00108\u001a\u000204H\u0007¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u00108\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u001f\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02#\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001fH\u0003¢\u0006\u0004\bA\u0010BJ3\u0010(\u001a\u00020\u00192\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010EJ\u0093\u0001\u0010(\u001a\u00020\u00192\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\b\u0002\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02%\b\u0002\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u0010FJ\u009b\u0001\u0010(\u001a\u00020\u00192\u0006\u0010C\u001a\u00020D2\u0006\u00108\u001a\u0002042\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\b\u0002\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02%\b\u0002\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007¢\u0006\u0004\b9\u0010GJ\u008d\u0001\u0010>\u001a\u00020\u00192\u0006\u0010C\u001a\u00020D2\u0006\u00108\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u001f\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02#\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0003¢\u0006\u0004\bH\u0010IJï\u0001\u0010J\u001a\u00020\u0019*\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020N2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010P\u001a\u0002042\u0006\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u0002042\u0006\u0010S\u001a\u0002042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00108\u001a\u0002042\u001f\u0010,\u001a\u001b\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0019\u0018\u00010-¢\u0006\u0002\b02#\u00101\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001902¢\u0006\u0002\b02\u0006\u0010T\u001a\u00020\u001f2\b\b\u0002\u0010?\u001a\u00020\u001f2\b\b\u0002\u0010U\u001a\u00020V2\b\b\u0002\u0010@\u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010XJC\u0010Y\u001a\u00020\u0019*\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010Z\u001a\u00020/2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\b2\u0006\u0010^\u001a\u00020N2\u0006\u0010_\u001a\u00020NH\u0002¢\u0006\u0004\b`\u0010aJ)\u0010,\u001a\u00020\u0019*\u00020.2\u0006\u0010Z\u001a\u00020/2\u0006\u0010[\u001a\u0002042\u0006\u0010]\u001a\u00020\b¢\u0006\u0004\bb\u0010cR\u0018\u0010\u0014\u001a\u00020\u0005*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010d\u001a\u000204¢\u0006\n\n\u0002\u0010g\u001a\u0004\be\u0010fR\u0013\u0010h\u001a\u000204¢\u0006\n\n\u0002\u0010g\u001a\u0004\bi\u0010fR\u000e\u0010j\u001a\u00020kX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/SliderColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "defaultSliderColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "Thumb-HwbPF3A", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "thumbTrackGapSize", "Landroidx/compose/ui/unit/Dp;", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "trackCornerSize", "Track-mnvyFg4", "(Landroidx/compose/material3/SliderState;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "CenteredTrack", "CenteredTrack-7LSsfP0", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFFLandroidx/compose/runtime/Composer;II)V", "TrackImpl", "enableCornerShrinking", "isCentered", "TrackImpl-VvwgllI", "(Landroidx/compose/material3/SliderState;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFZZLandroidx/compose/runtime/Composer;II)V", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/RangeSliderState;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "TrackImpl-xlyIBlM", "(Landroidx/compose/material3/RangeSliderState;FLandroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;I)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "startThumbWidth", "startThumbHeight", "endThumbWidth", "endThumbHeight", "isRangeSlider", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "drawTrack-GVD57ws", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;ZZLandroidx/compose/foundation/gestures/Orientation;Z)V", "drawTrackPath", "offset", "size", "Landroidx/compose/ui/geometry/Size;", "color", "startCornerRadius", "endCornerRadius", "drawTrackPath-zXTsYAs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/foundation/gestures/Orientation;JJJFF)V", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "()F", "F", "TickSize", "getTickSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m5581getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m5581getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenteredTrack_7LSsfP0$lambda$2(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3991CenteredTrack7LSsfP0(sliderState, modifier, z, sliderColors, function2, function3, f, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Thumb_9LiSoMs$lambda$0(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3992Thumb9LiSoMs(mutableInteractionSource, modifier, sliderColors, z, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Thumb_HwbPF3A$lambda$0(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3993ThumbHwbPF3A(mutableInteractionSource, sliderState, modifier, sliderColors, z, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$1(SliderDefaults sliderDefaults, SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, Composer composer, int i3) {
        sliderDefaults.Track(sliderPositions, modifier, sliderColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$2(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, Composer composer, int i3) {
        sliderDefaults.Track(rangeSliderState, modifier, sliderColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_VvwgllI$lambda$3(SliderDefaults sliderDefaults, SliderState sliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3986TrackImplVvwgllI(sliderState, f, modifier, z, sliderColors, function2, function3, f2, f3, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_xlyIBlM$lambda$2(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i, Composer composer, int i2) {
        sliderDefaults.m3987TrackImplxlyIBlM(rangeSliderState, f, modifier, z, sliderColors, function2, function3, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_4EFweAY$lambda$2(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3995Track4EFweAY(sliderState, modifier, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) function2, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) function3, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_4EFweAY$lambda$5(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3994Track4EFweAY(rangeSliderState, modifier, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) function2, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) function3, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_mnvyFg4$lambda$2(SliderDefaults sliderDefaults, SliderState sliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3997TrackmnvyFg4(sliderState, f, modifier, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) function2, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) function3, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_mnvyFg4$lambda$5(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m3996TrackmnvyFg4(rangeSliderState, f, modifier, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) function2, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) function3, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)1362@59359L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1362)");
        }
        SliderColors defaultSliderColors$material3 = getDefaultSliderColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m3998colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)N(thumbColor:c#ui.graphics.Color,activeTrackColor:c#ui.graphics.Color,activeTickColor:c#ui.graphics.Color,inactiveTrackColor:c#ui.graphics.Color,inactiveTickColor:c#ui.graphics.Color,disabledThumbColor:c#ui.graphics.Color,disabledActiveTrackColor:c#ui.graphics.Color,disabledActiveTickColor:c#ui.graphics.Color,disabledInactiveTrackColor:c#ui.graphics.Color,disabledInactiveTickColor:c#ui.graphics.Color)1404@61683L11:Slider.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        long m6822getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j5;
        long m6822getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j6;
        long m6822getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j7;
        long m6822getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j8;
        long m6822getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j9;
        long m6822getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1404)");
        }
        SliderColors m3966copyK518z4 = getDefaultSliderColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3966copyK518z4(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4, m6822getUnspecified0d7_KjU5, m6822getUnspecified0d7_KjU6, m6822getUnspecified0d7_KjU7, m6822getUnspecified0d7_KjU8, m6822getUnspecified0d7_KjU9, m6822getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3966copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m6831compositeOverOWjLjI(Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0059  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3992Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        Composer composer2;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final boolean z3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        SliderColors sliderColors4;
        long j4;
        boolean z4;
        Modifier modifier4;
        long j5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)N(interactionSource,modifier,colors,enabled,thumbSize:c#ui.unit.DpSize)1468@65115L227:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1464@65017L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            sliderColors4 = sliderColors2;
                            j4 = j2;
                            z4 = z2;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 4) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = colors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                j5 = SliderKt.ThumbSize;
                                j4 = j5;
                                sliderColors4 = sliderColors2;
                            } else {
                                sliderColors4 = sliderColors2;
                                j4 = j2;
                            }
                            z4 = z2;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1468)");
                        }
                        composer2 = startRestartGroup;
                        SliderKt.m4022Thumb9LiSoMs(mutableInteractionSource, modifier4, sliderColors4, z4, j4, false, composer2, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        sliderColors3 = sliderColors4;
                        z3 = z4;
                        j3 = j4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        sliderColors3 = sliderColors2;
                        z3 = z2;
                        j3 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Thumb_9LiSoMs$lambda$0;
                                Thumb_9LiSoMs$lambda$0 = SliderDefaults.Thumb_9LiSoMs$lambda$0(SliderDefaults.this, mutableInteractionSource, modifier3, sliderColors3, z3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Thumb_9LiSoMs$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006e  */
    /* renamed from: Thumb-HwbPF3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3993ThumbHwbPF3A(final MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        SliderState sliderState2;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        Composer composer2;
        final SliderColors sliderColors3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        long j5;
        SliderColors sliderColors4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-889714565);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)N(interactionSource,sliderState,modifier,colors,enabled,thumbSize:c#ui.unit.DpSize)1502@66554L257:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            sliderState2 = sliderState;
            i3 |= startRestartGroup.changedInstance(sliderState2) ? 32 : 16;
        } else {
            sliderState2 = sliderState;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1498@66456L8");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -7169;
                                sliderColors2 = colors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                j4 = SliderKt.ThumbSize;
                                j5 = j4;
                                sliderColors4 = sliderColors2;
                                boolean z3 = z2;
                                Modifier modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-889714565, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1502)");
                                }
                                int i8 = i3 & 14;
                                int i9 = i3 >> 3;
                                composer2 = startRestartGroup;
                                SliderKt.m4022Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors4, z3, j5, sliderState2.getOrientation() != Orientation.Vertical, composer2, i8 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                sliderColors3 = sliderColors4;
                                z2 = z3;
                                j3 = j5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        sliderColors4 = sliderColors2;
                        j5 = j2;
                        boolean z32 = z2;
                        Modifier modifier32 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 & 14;
                        int i92 = i3 >> 3;
                        composer2 = startRestartGroup;
                        SliderKt.m4022Thumb9LiSoMs(mutableInteractionSource, modifier32, sliderColors4, z32, j5, sliderState2.getOrientation() != Orientation.Vertical, composer2, i82 | (i92 & 112) | (i92 & 896) | (i92 & 7168) | (i92 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier32;
                        sliderColors3 = sliderColors4;
                        z2 = z32;
                        j3 = j5;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        sliderColors3 = sliderColors2;
                        j3 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final SliderState sliderState3 = sliderState2;
                        final Modifier modifier4 = modifier2;
                        final boolean z4 = z2;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Thumb_HwbPF3A$lambda$0;
                                Thumb_HwbPF3A$lambda$0 = SliderDefaults.Thumb_HwbPF3A$lambda$0(SliderDefaults.this, mutableInteractionSource, sliderState3, modifier4, sliderColors3, z4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Thumb_HwbPF3A$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            j2 = j;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        j2 = j;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0059  */
    @Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i5;
        SliderColors sliderColors4;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        boolean z5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(sliderPositions,modifier,colors,enabled)1536@68125L1838,1536@68073L1890:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1529@67720L8");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        SliderColors sliderColors5 = sliderColors2;
                        i5 = i3;
                        sliderColors4 = sliderColors5;
                        companion = modifier2;
                    } else {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = colors;
                        }
                        SliderColors sliderColors6 = sliderColors2;
                        i5 = i3;
                        sliderColors4 = sliderColors6;
                        if (i4 != 0) {
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1546713545, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1531)");
                            }
                            int i9 = i5;
                            final long m3979trackColorWaAFU9c$material3 = sliderColors4.m3979trackColorWaAFU9c$material3(z4, false);
                            final long m3979trackColorWaAFU9c$material32 = sliderColors4.m3979trackColorWaAFU9c$material3(z4, true);
                            final long m3978tickColorWaAFU9c$material3 = sliderColors4.m3978tickColorWaAFU9c$material3(z4, false);
                            final long m3978tickColorWaAFU9c$material32 = sliderColors4.m3978tickColorWaAFU9c$material3(z4, true);
                            SliderColors sliderColors7 = sliderColors4;
                            modifier3 = companion;
                            Modifier m1257height3ABfNKs = SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -333013595, "CC(remember):Slider.kt#9igjgp");
                            changed = startRestartGroup.changed(m3979trackColorWaAFU9c$material3) | ((i9 & 14) != 4) | startRestartGroup.changed(m3979trackColorWaAFU9c$material32) | startRestartGroup.changed(m3978tickColorWaAFU9c$material3) | startRestartGroup.changed(m3978tickColorWaAFU9c$material32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                z5 = z4;
                                i6 = 0;
                                Function1 function1 = new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Track$lambda$0$0;
                                        Track$lambda$0$0 = SliderDefaults.Track$lambda$0$0(m3979trackColorWaAFU9c$material3, sliderPositions, m3979trackColorWaAFU9c$material32, m3978tickColorWaAFU9c$material3, m3978tickColorWaAFU9c$material32, (DrawScope) obj);
                                        return Track$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(function1);
                                rememberedValue = function1;
                            } else {
                                z5 = z4;
                                i6 = 0;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(m1257height3ABfNKs, (Function1) rememberedValue, startRestartGroup, i6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sliderColors3 = sliderColors7;
                            z3 = z5;
                        }
                    }
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i5;
                    final long m3979trackColorWaAFU9c$material33 = sliderColors4.m3979trackColorWaAFU9c$material3(z4, false);
                    final long m3979trackColorWaAFU9c$material322 = sliderColors4.m3979trackColorWaAFU9c$material3(z4, true);
                    final long m3978tickColorWaAFU9c$material33 = sliderColors4.m3978tickColorWaAFU9c$material3(z4, false);
                    final long m3978tickColorWaAFU9c$material322 = sliderColors4.m3978tickColorWaAFU9c$material3(z4, true);
                    SliderColors sliderColors72 = sliderColors4;
                    modifier3 = companion;
                    Modifier m1257height3ABfNKs2 = SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -333013595, "CC(remember):Slider.kt#9igjgp");
                    changed = startRestartGroup.changed(m3979trackColorWaAFU9c$material33) | ((i92 & 14) != 4) | startRestartGroup.changed(m3979trackColorWaAFU9c$material322) | startRestartGroup.changed(m3978tickColorWaAFU9c$material33) | startRestartGroup.changed(m3978tickColorWaAFU9c$material322);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    z5 = z4;
                    i6 = 0;
                    Function1 function12 = new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Track$lambda$0$0;
                            Track$lambda$0$0 = SliderDefaults.Track$lambda$0$0(m3979trackColorWaAFU9c$material33, sliderPositions, m3979trackColorWaAFU9c$material322, m3978tickColorWaAFU9c$material33, m3978tickColorWaAFU9c$material322, (DrawScope) obj);
                            return Track$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function12);
                    rememberedValue = function12;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CanvasKt.Canvas(m1257height3ABfNKs2, (Function1) rememberedValue, startRestartGroup, i6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sliderColors3 = sliderColors72;
                    z3 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Track$lambda$1;
                            Track$lambda$1 = SliderDefaults.Track$lambda$1(SliderDefaults.this, sliderPositions, modifier3, sliderColors3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Track$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$0$0(long j, SliderPositions sliderPositions, long j2, long j3, long j4, DrawScope drawScope) {
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32));
        long m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        long j5 = m6511constructorimpl;
        long j6 = z ? m6511constructorimpl2 : j5;
        if (!z) {
            j5 = m6511constructorimpl2;
        }
        float f = drawScope.mo528toPx0680j_4(TickSize);
        float f2 = drawScope.mo528toPx0680j_4(SliderKt.getTrackHeight());
        DrawScope.CC.m7371drawLineNGM6Ib0$default(drawScope, j, j6, j5, f2, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), null, 0.0f, null, 0, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        int i = (int) (j6 >> 32);
        int i2 = (int) (j5 >> 32);
        long j7 = j6;
        long j8 = j5;
        DrawScope.CC.m7371drawLineNGM6Ib0$default(drawScope, j2, Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i)) * sliderPositions.getActiveRange().getStart().floatValue())) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L)), Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) + ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i)) * sliderPositions.getActiveRange().getEndInclusive().floatValue())) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L)), f2, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), null, 0.0f, null, 0, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        float[] tickFractions = sliderPositions.getTickFractions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i3 = 0; i3 < length; i3++) {
            float f3 = tickFractions[i3];
            Boolean valueOf = Boolean.valueOf(f3 > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions.getActiveRange().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f3));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (OffsetKt.m6542lerpWko1d7g(j7, j8, ((Number) list.get(i4)).floatValue()) >> 32));
                arrayList.add(Offset.m6508boximpl(Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32))));
                i4++;
                booleanValue = booleanValue;
                list = list;
            }
            long j9 = j7;
            j8 = j8;
            DrawScope.CC.m7376drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m7118getPointsr_lszbg(), booleanValue ? j3 : j4, f, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), null, 0.0f, null, 0, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
            j7 = j9;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_4EFweAY$lambda$0$0(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m3999drawStopIndicatorx3O1jOs(drawScope, offset.m6529unboximpl(), TrackStopIndicatorSize, m3979trackColorWaAFU9c$material3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3995Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        int i6;
        final float f3;
        int i7;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        final Modifier modifier3;
        final boolean z3;
        final SliderColors sliderColors3;
        final Function2<? super DrawScope, ? super Offset, Unit> function23;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        float f5;
        int i8;
        float f6;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(49984771);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(sliderState,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp)1618@71682L467:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        function22 = function2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1604@71123L8,1605@71192L199,1612@71447L107");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                            i3 &= -7169;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 16) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 790731818, "CC(remember):Slider.kt#9igjgp");
                            boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Track_4EFweAY$lambda$0$0;
                                        Track_4EFweAY$lambda$0$0 = SliderDefaults.Track_4EFweAY$lambda$0$0(SliderColors.this, z2, (DrawScope) obj, (Offset) obj2);
                                        return Track_4EFweAY$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            function22 = (Function2) rememberedValue;
                            i3 = (-57345) & i3;
                        }
                        if (i5 != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 790739886, "CC(remember):Slider.kt#9igjgp");
                            SliderDefaults$Track$4$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m4005invokewPWG1Vc(drawScope, offset.m6529unboximpl(), color.m6796unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m4005invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m3999drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m4000getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function33 = (Function3) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        } else {
                            function33 = function3;
                        }
                        if (i6 != 0) {
                            f6 = SliderKt.ThumbTrackGapSize;
                            f3 = f6;
                        }
                        if (i7 != 0) {
                            f5 = SliderKt.TrackInsideCornerSize;
                            function32 = function33;
                            i8 = i3;
                            z3 = z2;
                            sliderColors3 = sliderColors2;
                            f4 = f5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(49984771, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1617)");
                            }
                            int i12 = i8 << 3;
                            modifier3 = modifier2;
                            function23 = function22;
                            m3986TrackImplVvwgllI(sliderState, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, function23, function32, f3, f4, false, false, startRestartGroup, (i8 & 14) | 805306416 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), ((i8 >> 21) & 112) | 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            function32 = function33;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        function32 = function3;
                    }
                    i8 = i3;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    f4 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i8 << 3;
                    modifier3 = modifier2;
                    function23 = function22;
                    m3986TrackImplVvwgllI(sliderState, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, function23, function32, f3, f4, false, false, startRestartGroup, (i8 & 14) | 805306416 | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), ((i8 >> 21) & 112) | 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function32 = function3;
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    function23 = function22;
                    f4 = f2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Track_4EFweAY$lambda$2;
                            Track_4EFweAY$lambda$2 = SliderDefaults.Track_4EFweAY$lambda$2(SliderDefaults.this, sliderState, modifier3, z3, sliderColors3, function23, function32, f3, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Track_4EFweAY$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_mnvyFg4$lambda$0$0(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m3999drawStopIndicatorx3O1jOs(drawScope, offset.m6529unboximpl(), TrackStopIndicatorSize, m3979trackColorWaAFU9c$material3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-mnvyFg4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3997TrackmnvyFg4(final SliderState sliderState, final float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f2, float f3, Composer composer, final int i, final int i2) {
        SliderState sliderState2;
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        int i6;
        float f4;
        int i7;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        final Modifier modifier3;
        final boolean z3;
        final SliderColors sliderColors3;
        final float f5;
        final Function2<? super DrawScope, ? super Offset, Unit> function23;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        float f7;
        float f8;
        float f9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1691224881);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(sliderState,trackCornerSize:c#ui.unit.Dp,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp)1674@74141L467:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            sliderState2 = sliderState;
            i3 = (startRestartGroup.changedInstance(sliderState2) ? 4 : 2) | i;
        } else {
            sliderState2 = sliderState;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        function22 = function2;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1660@73582L8,1661@73651L199,1668@73906L107");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                            i3 &= -57345;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 32) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1769480824, "CC(remember):Slider.kt#9igjgp");
                            boolean z4 = ((((57344 & i3) ^ 24576) > 16384 && startRestartGroup.changed(sliderColors2)) || (i3 & 24576) == 16384) | ((i3 & 7168) == 2048);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Track_mnvyFg4$lambda$0$0;
                                        Track_mnvyFg4$lambda$0$0 = SliderDefaults.Track_mnvyFg4$lambda$0$0(SliderColors.this, z2, (DrawScope) obj, (Offset) obj2);
                                        return Track_mnvyFg4$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            function22 = (Function2) rememberedValue;
                            i3 = (-458753) & i3;
                        }
                        if (i5 != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1769488892, "CC(remember):Slider.kt#9igjgp");
                            SliderDefaults$Track$7$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$7$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m4006invokewPWG1Vc(drawScope, offset.m6529unboximpl(), color.m6796unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m4006invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m3999drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m4000getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function33 = (Function3) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        } else {
                            function33 = function3;
                        }
                        if (i6 != 0) {
                            f9 = SliderKt.ThumbTrackGapSize;
                            f4 = f9;
                        }
                        if (i7 != 0) {
                            f7 = SliderKt.TrackInsideCornerSize;
                            f8 = f7;
                            int i11 = i3;
                            boolean z5 = z2;
                            SliderColors sliderColors4 = sliderColors2;
                            float f10 = f4;
                            Function2<? super DrawScope, ? super Offset, Unit> function24 = function22;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1691224881, i11, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1673)");
                            }
                            int i12 = (i11 & 14) | 805306368 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11);
                            int i13 = ((i11 >> 24) & 112) | 6;
                            Modifier modifier4 = modifier2;
                            Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34 = function33;
                            m3986TrackImplVvwgllI(sliderState2, f, modifier4, z5, sliderColors4, function24, function34, f10, f8, true, false, startRestartGroup, i12, i13);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f6 = f8;
                            f5 = f10;
                            function32 = function34;
                            function23 = function24;
                            sliderColors3 = sliderColors4;
                            z3 = z5;
                            modifier3 = modifier4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        function33 = function3;
                    }
                    f8 = f3;
                    int i112 = i3;
                    boolean z52 = z2;
                    SliderColors sliderColors42 = sliderColors2;
                    float f102 = f4;
                    Function2<? super DrawScope, ? super Offset, Unit> function242 = function22;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = (i112 & 14) | 805306368 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112);
                    int i132 = ((i112 >> 24) & 112) | 6;
                    Modifier modifier42 = modifier2;
                    Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function342 = function33;
                    m3986TrackImplVvwgllI(sliderState2, f, modifier42, z52, sliderColors42, function242, function342, f102, f8, true, false, startRestartGroup, i122, i132);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f6 = f8;
                    f5 = f102;
                    function32 = function342;
                    function23 = function242;
                    sliderColors3 = sliderColors42;
                    z3 = z52;
                    modifier3 = modifier42;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function32 = function3;
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    f5 = f4;
                    function23 = function22;
                    f6 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Track_mnvyFg4$lambda$2;
                            Track_mnvyFg4$lambda$2 = SliderDefaults.Track_mnvyFg4$lambda$2(SliderDefaults.this, sliderState, f, modifier3, z3, sliderColors3, function23, function32, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Track_mnvyFg4$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenteredTrack_7LSsfP0$lambda$0$0(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m3999drawStopIndicatorx3O1jOs(drawScope, offset.m6529unboximpl(), TrackStopIndicatorSize, m3979trackColorWaAFU9c$material3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: CenteredTrack-7LSsfP0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3991CenteredTrack7LSsfP0(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        int i6;
        final float f4;
        int i7;
        int i8;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        final Modifier modifier3;
        final boolean z3;
        final SliderColors sliderColors3;
        final Function2<? super DrawScope, ? super Offset, Unit> function23;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        int i9;
        float f7;
        float f8;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1199441071);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenteredTrack)N(sliderState,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp,trackCornerSize:c#ui.unit.Dp)1729@76574L466:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        function22 = function2;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f4 = f;
                } else {
                    f4 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1714@75969L8,1715@76038L199,1722@76293L107");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                            i3 &= -7169;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 16) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1611641302, "CC(remember):Slider.kt#9igjgp");
                            boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit CenteredTrack_7LSsfP0$lambda$0$0;
                                        CenteredTrack_7LSsfP0$lambda$0$0 = SliderDefaults.CenteredTrack_7LSsfP0$lambda$0$0(SliderColors.this, z2, (DrawScope) obj, (Offset) obj2);
                                        return CenteredTrack_7LSsfP0$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            function22 = (Function2) rememberedValue;
                            i3 = (-57345) & i3;
                        }
                        if (i5 != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1611649370, "CC(remember):Slider.kt#9igjgp");
                            SliderDefaults$CenteredTrack$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$CenteredTrack$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m4002invokewPWG1Vc(drawScope, offset.m6529unboximpl(), color.m6796unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m4002invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m3999drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m4000getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function33 = (Function3) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        } else {
                            function33 = function3;
                        }
                        if (i6 != 0) {
                            f8 = SliderKt.ThumbTrackGapSize;
                            f4 = f8;
                        }
                        float f9 = i7 != 0 ? SliderKt.TrackInsideCornerSize : f2;
                        if (i8 != 0) {
                            function32 = function33;
                            i9 = i3;
                            z3 = z2;
                            f5 = f9;
                            f7 = Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM();
                            sliderColors3 = sliderColors2;
                        } else {
                            function32 = function33;
                            i9 = i3;
                            z3 = z2;
                            sliderColors3 = sliderColors2;
                            f5 = f9;
                            f7 = f3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        function32 = function3;
                        f7 = f3;
                        i9 = i3;
                        z3 = z2;
                        sliderColors3 = sliderColors2;
                        f5 = f2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1199441071, i9, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1728)");
                    }
                    int i13 = i9 << 3;
                    modifier3 = modifier2;
                    function23 = function22;
                    m3986TrackImplVvwgllI(sliderState, f7, modifier3, z3, sliderColors3, function23, function32, f4, f5, true, true, startRestartGroup, (i9 & 14) | 805306368 | ((i9 >> 21) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024), ((i9 >> 24) & 112) | 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f6 = f7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function32 = function3;
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    function23 = function22;
                    f5 = f2;
                    f6 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit CenteredTrack_7LSsfP0$lambda$2;
                            CenteredTrack_7LSsfP0$lambda$2 = SliderDefaults.CenteredTrack_7LSsfP0$lambda$2(SliderDefaults.this, sliderState, modifier3, z3, sliderColors3, function23, function32, f4, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return CenteredTrack_7LSsfP0$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L111;
     */
    /* renamed from: TrackImpl-VvwgllI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m3986TrackImplVvwgllI(final SliderState sliderState, final float f, final Modifier modifier, final boolean z, final SliderColors sliderColors, final Function2<? super DrawScope, ? super Offset, Unit> function2, final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, final float f2, final float f3, final boolean z2, final boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        int i5;
        Modifier m1257height3ABfNKs;
        long j;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(133396521);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrackImpl)N(sliderState,trackCornerSize:c#ui.unit.Dp,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp,enableCornerShrinking,isCentered)1771@78247L957,1792@79233L1481,1762@77834L2880:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(133396521, i3, i4, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1757)");
            }
            final long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, false);
            final long m3979trackColorWaAFU9c$material32 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
            final long m3978tickColorWaAFU9c$material3 = sliderColors.m3978tickColorWaAFU9c$material3(z, false);
            int i6 = i4;
            long m3978tickColorWaAFU9c$material32 = sliderColors.m3978tickColorWaAFU9c$material3(z, true);
            if (sliderState.getOrientation() == Orientation.Vertical) {
                i5 = i3;
                m1257height3ABfNKs = SizeKt.fillMaxHeight$default(SizeKt.m1276width3ABfNKs(modifier, SliderKt.getTrackHeight()), 0.0f, 1, null);
                if (sliderState.getReverseVerticalDirection()) {
                    m1257height3ABfNKs = ScaleKt.scale(m1257height3ABfNKs, 1.0f, -1.0f);
                }
            } else {
                i5 = i3;
                m1257height3ABfNKs = SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SliderKt.getTrackHeight());
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -654923770, "CC(remember):Slider.kt#9igjgp");
            int i7 = i5 & 112;
            boolean changedInstance = (i7 == 32) | startRestartGroup.changedInstance(sliderState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance) {
                j = m3978tickColorWaAFU9c$material32;
            } else {
                j = m3978tickColorWaAFU9c$material32;
            }
            rememberedValue = new Function3() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult TrackImpl_VvwgllI$lambda$1$0;
                    TrackImpl_VvwgllI$lambda$1$0 = SliderDefaults.TrackImpl_VvwgllI$lambda$1$0(f, sliderState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return TrackImpl_VvwgllI$lambda$1$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then = m1257height3ABfNKs.then(LayoutModifierKt.layout(companion, (Function3) rememberedValue));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -654891694, "CC(remember):Slider.kt#9igjgp");
            final long j2 = j;
            boolean changedInstance2 = (i7 == 32) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m3979trackColorWaAFU9c$material3) | startRestartGroup.changed(m3979trackColorWaAFU9c$material32) | startRestartGroup.changed(m3978tickColorWaAFU9c$material3) | startRestartGroup.changed(j2) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i6 & 14) == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                modifier2 = then;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TrackImpl_VvwgllI$lambda$2$0;
                        TrackImpl_VvwgllI$lambda$2$0 = SliderDefaults.TrackImpl_VvwgllI$lambda$2$0(f, sliderState, m3979trackColorWaAFU9c$material3, m3979trackColorWaAFU9c$material32, m3978tickColorWaAFU9c$material3, j2, f2, f3, function2, function3, z2, z3, (DrawScope) obj);
                        return TrackImpl_VvwgllI$lambda$2$0;
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(function1);
                rememberedValue2 = function1;
            } else {
                modifier2 = then;
                composer2 = startRestartGroup;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifier2, (Function1) rememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrackImpl_VvwgllI$lambda$3;
                    TrackImpl_VvwgllI$lambda$3 = SliderDefaults.TrackImpl_VvwgllI$lambda$3(SliderDefaults.this, sliderState, f, modifier, z, sliderColors, function2, function3, f2, f3, z2, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TrackImpl_VvwgllI$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TrackImpl_VvwgllI$lambda$1$0(float f, SliderState sliderState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int i;
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        if (Dp.m9737equalsimpl0(f, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM())) {
            if (sliderState.getOrientation() == Orientation.Vertical) {
                i = mo8285measureBRTryo0.getWidth() / 2;
            } else {
                i = mo8285measureBRTryo0.getHeight() / 2;
            }
        } else {
            i = measureScope.mo522roundToPx0680j_4(f);
        }
        return measureScope.layout(mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), MapsKt.mapOf(TuplesKt.to(SliderKt.getCornerSizeAlignmentLine(), Integer.valueOf(i))), new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TrackImpl_VvwgllI$lambda$1$0$0;
                TrackImpl_VvwgllI$lambda$1$0$0 = SliderDefaults.TrackImpl_VvwgllI$lambda$1$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return TrackImpl_VvwgllI$lambda$1$0$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_VvwgllI$lambda$1$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_VvwgllI$lambda$2$0(float f, SliderState sliderState, long j, long j2, long j3, long j4, float f2, float f3, Function2 function2, Function3 function3, boolean z, boolean z2, DrawScope drawScope) {
        float f4;
        float intBitsToFloat;
        if (Dp.m9737equalsimpl0(f, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM())) {
            if (sliderState.getOrientation() == Orientation.Vertical) {
                intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L));
            }
            f4 = intBitsToFloat / 2;
        } else {
            f4 = drawScope.mo528toPx0680j_4(f);
        }
        INSTANCE.m3988drawTrackGVD57ws(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction(), j, j2, j3, j4, drawScope.mo525toDpu2uoSUM(0), drawScope.mo525toDpu2uoSUM(0), drawScope.mo525toDpu2uoSUM(sliderState.getThumbWidth$material3()), drawScope.mo525toDpu2uoSUM(sliderState.getThumbHeight$material3()), f2, f3, drawScope.mo524toDpu2uoSUM(f4), function2, function3, false, z, sliderState.getOrientation(), z2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0055  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SliderColors sliderColors4;
        int i5;
        boolean z4;
        float f;
        float f2;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(rangeSliderState,modifier,colors,enabled)1858@82080L219:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1855@82021L8");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                        sliderColors4 = sliderColors2;
                        i5 = i3;
                    } else {
                        companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors4 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors4 = sliderColors2;
                        }
                        i5 = i3;
                        if (i4 != 0) {
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617869097, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1857)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            Modifier modifier4 = companion;
                            sliderColors3 = sliderColors4;
                            m3994Track4EFweAY(rangeSliderState, modifier4, z4, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            modifier3 = modifier4;
                        }
                    }
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    Modifier modifier42 = companion;
                    sliderColors3 = sliderColors4;
                    m3994Track4EFweAY(rangeSliderState, modifier42, z4, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    modifier3 = modifier42;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Track$lambda$2;
                            Track$lambda$2 = SliderDefaults.Track$lambda$2(SliderDefaults.this, rangeSliderState, modifier3, sliderColors3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Track$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_4EFweAY$lambda$3$0(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m3999drawStopIndicatorx3O1jOs(drawScope, offset.m6529unboximpl(), TrackStopIndicatorSize, m3979trackColorWaAFU9c$material3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3994Track4EFweAY(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        int i6;
        float f3;
        int i7;
        final Modifier modifier3;
        final boolean z3;
        final SliderColors sliderColors3;
        final Function2<? super DrawScope, ? super Offset, Unit> function23;
        final float f4;
        final float f5;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        ScopeUpdateScope endRestartGroup;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        int i8;
        float f6;
        float f7;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-541824132);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(rangeSliderState,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp)1903@84051L402:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        function22 = function2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1889@83492L8,1890@83561L199,1897@83816L107");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                            i3 &= -7169;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 16) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1001940573, "CC(remember):Slider.kt#9igjgp");
                            boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Track_4EFweAY$lambda$3$0;
                                        Track_4EFweAY$lambda$3$0 = SliderDefaults.Track_4EFweAY$lambda$3$0(SliderColors.this, z2, (DrawScope) obj, (Offset) obj2);
                                        return Track_4EFweAY$lambda$3$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            function22 = (Function2) rememberedValue;
                            i3 = (-57345) & i3;
                        }
                        if (i5 != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1001932505, "CC(remember):Slider.kt#9igjgp");
                            SliderDefaults$Track$11$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m4003invokewPWG1Vc(drawScope, offset.m6529unboximpl(), color.m6796unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m4003invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m3999drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m4000getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function33 = (Function3) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        } else {
                            function33 = function3;
                        }
                        if (i6 != 0) {
                            f7 = SliderKt.ThumbTrackGapSize;
                            f3 = f7;
                        }
                        if (i7 != 0) {
                            f6 = SliderKt.TrackInsideCornerSize;
                            z3 = z2;
                            function23 = function22;
                            f5 = f3;
                            function32 = function33;
                            i8 = i3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            f4 = f6;
                        } else {
                            z3 = z2;
                            function23 = function22;
                            f5 = f3;
                            function32 = function33;
                            i8 = i3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            f4 = f2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i8 = i3;
                        modifier3 = modifier2;
                        z3 = z2;
                        sliderColors3 = sliderColors2;
                        function23 = function22;
                        f4 = f2;
                        f5 = f3;
                        function32 = function3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-541824132, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1902)");
                    }
                    int i12 = (i8 & 14) | 48;
                    int i13 = i8 << 3;
                    m3987TrackImplxlyIBlM(rangeSliderState, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, function23, function32, f5, f4, startRestartGroup, i12 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    function23 = function22;
                    f4 = f2;
                    f5 = f3;
                    function32 = function3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Track_4EFweAY$lambda$5;
                            Track_4EFweAY$lambda$5 = SliderDefaults.Track_4EFweAY$lambda$5(SliderDefaults.this, rangeSliderState, modifier3, z3, sliderColors3, function23, function32, f5, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Track_4EFweAY$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track_mnvyFg4$lambda$3$0(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m3999drawStopIndicatorx3O1jOs(drawScope, offset.m6529unboximpl(), TrackStopIndicatorSize, m3979trackColorWaAFU9c$material3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-mnvyFg4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3996TrackmnvyFg4(final RangeSliderState rangeSliderState, final float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        final Modifier modifier3;
        final boolean z3;
        Composer composer2;
        final SliderColors sliderColors3;
        final float f5;
        final Function2<? super DrawScope, ? super Offset, Unit> function23;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34;
        float f7;
        int i9;
        Modifier modifier4;
        boolean z4;
        SliderColors sliderColors4;
        float f8;
        Function2<? super DrawScope, ? super Offset, Unit> function24;
        float f9;
        float f10;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1952945688);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(rangeSliderState,trackCornerSize:c#ui.unit.Dp,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp)1954@86334L403:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        function22 = function2;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i3 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1940@85775L8,1941@85844L199,1948@86099L107");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                                i3 &= -57345;
                                sliderColors2 = colors;
                            }
                            if ((i2 & 32) != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -119893793, "CC(remember):Slider.kt#9igjgp");
                                boolean z5 = ((((57344 & i3) ^ 24576) > 16384 && startRestartGroup.changed(sliderColors2)) || (i3 & 24576) == 16384) | ((i3 & 7168) == 2048);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Track_mnvyFg4$lambda$3$0;
                                            Track_mnvyFg4$lambda$3$0 = SliderDefaults.Track_mnvyFg4$lambda$3$0(SliderColors.this, z2, (DrawScope) obj, (Offset) obj2);
                                            return Track_mnvyFg4$lambda$3$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                function22 = (Function2) rememberedValue;
                                i3 = (-458753) & i3;
                            }
                            if (i5 != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -119885725, "CC(remember):Slider.kt#9igjgp");
                                SliderDefaults$Track$14$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$14$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                            m4004invokewPWG1Vc(drawScope, offset.m6529unboximpl(), color.m6796unboximpl());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                        public final void m4004invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                            SliderDefaults.INSTANCE.m3999drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m4000getTickSizeD9Ej5fM(), j2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function33 = (Function3) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                function33 = function3;
                            }
                            if (i6 != 0) {
                                f10 = SliderKt.ThumbTrackGapSize;
                                f4 = f10;
                            }
                            if (i8 != 0) {
                                f7 = SliderKt.TrackInsideCornerSize;
                                function34 = function33;
                                i9 = i3;
                                modifier4 = modifier2;
                                z4 = z2;
                                sliderColors4 = sliderColors2;
                                f8 = f4;
                                function24 = function22;
                                f9 = f7;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1952945688, i9, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1953)");
                                }
                                m3987TrackImplxlyIBlM(rangeSliderState, f, modifier4, z4, sliderColors4, function24, function34, f8, f9, startRestartGroup, i9 & 2147483646);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                f6 = f9;
                                f5 = f8;
                                function32 = function34;
                                function23 = function24;
                                sliderColors3 = sliderColors4;
                                z3 = z4;
                                modifier3 = modifier4;
                            } else {
                                function34 = function33;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            function34 = function3;
                        }
                        i9 = i3;
                        modifier4 = modifier2;
                        z4 = z2;
                        sliderColors4 = sliderColors2;
                        f8 = f4;
                        function24 = function22;
                        f9 = f3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m3987TrackImplxlyIBlM(rangeSliderState, f, modifier4, z4, sliderColors4, function24, function34, f8, f9, startRestartGroup, i9 & 2147483646);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        f6 = f9;
                        f5 = f8;
                        function32 = function34;
                        function23 = function24;
                        sliderColors3 = sliderColors4;
                        z3 = z4;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function32 = function3;
                        modifier3 = modifier2;
                        z3 = z2;
                        composer2 = startRestartGroup;
                        sliderColors3 = sliderColors2;
                        f5 = f4;
                        function23 = function22;
                        f6 = f3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Track_mnvyFg4$lambda$5;
                                Track_mnvyFg4$lambda$5 = SliderDefaults.Track_mnvyFg4$lambda$5(SliderDefaults.this, rangeSliderState, f, modifier3, z3, sliderColors3, function23, function32, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Track_mnvyFg4$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: TrackImpl-xlyIBlM, reason: not valid java name */
    private final void m3987TrackImplxlyIBlM(final RangeSliderState rangeSliderState, final float f, final Modifier modifier, final boolean z, final SliderColors sliderColors, final Function2<? super DrawScope, ? super Offset, Unit> function2, final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, final float f2, final float f3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1719396904);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrackImpl)N(rangeSliderState,trackCornerSize:c#ui.unit.Dp,modifier,enabled,colors,drawStopIndicator,drawTick,thumbTrackGapSize:c#ui.unit.Dp,trackInsideCornerSize:c#ui.unit.Dp)1984@87503L449,1995@87963L1310,1983@87432L1841:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (!startRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719396904, i2, -1, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1978)");
            }
            final long m3979trackColorWaAFU9c$material3 = sliderColors.m3979trackColorWaAFU9c$material3(z, false);
            int i3 = i2;
            final long m3979trackColorWaAFU9c$material32 = sliderColors.m3979trackColorWaAFU9c$material3(z, true);
            final long m3978tickColorWaAFU9c$material3 = sliderColors.m3978tickColorWaAFU9c$material3(z, false);
            final long m3978tickColorWaAFU9c$material32 = sliderColors.m3978tickColorWaAFU9c$material3(z, true);
            Modifier m1257height3ABfNKs = SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SliderKt.getTrackHeight());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1222008025, "CC(remember):Slider.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function3() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult TrackImpl_xlyIBlM$lambda$0$0;
                        TrackImpl_xlyIBlM$lambda$0$0 = SliderDefaults.TrackImpl_xlyIBlM$lambda$0$0((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                        return TrackImpl_xlyIBlM$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layout = LayoutModifierKt.layout(m1257height3ABfNKs, (Function3) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1222023606, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m3979trackColorWaAFU9c$material3) | startRestartGroup.changed(m3979trackColorWaAFU9c$material32) | startRestartGroup.changed(m3978tickColorWaAFU9c$material3) | startRestartGroup.changed(m3978tickColorWaAFU9c$material32) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                modifier2 = layout;
                composer2 = startRestartGroup;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TrackImpl_xlyIBlM$lambda$1$0;
                        TrackImpl_xlyIBlM$lambda$1$0 = SliderDefaults.TrackImpl_xlyIBlM$lambda$1$0(f, rangeSliderState, m3979trackColorWaAFU9c$material3, m3979trackColorWaAFU9c$material32, m3978tickColorWaAFU9c$material3, m3978tickColorWaAFU9c$material32, f2, f3, function2, function3, (DrawScope) obj);
                        return TrackImpl_xlyIBlM$lambda$1$0;
                    }
                };
                composer2.updateRememberedValue(function1);
                rememberedValue2 = function1;
            } else {
                modifier2 = layout;
                composer2 = startRestartGroup;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifier2, (Function1) rememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrackImpl_xlyIBlM$lambda$2;
                    TrackImpl_xlyIBlM$lambda$2 = SliderDefaults.TrackImpl_xlyIBlM$lambda$2(SliderDefaults.this, rangeSliderState, f, modifier, z, sliderColors, function2, function3, f2, f3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TrackImpl_xlyIBlM$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TrackImpl_xlyIBlM$lambda$0$0(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return measureScope.layout(mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), MapsKt.mapOf(TuplesKt.to(SliderKt.getCornerSizeAlignmentLine(), Integer.valueOf(mo8285measureBRTryo0.getHeight() / 2))), new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TrackImpl_xlyIBlM$lambda$0$0$0;
                TrackImpl_xlyIBlM$lambda$0$0$0 = SliderDefaults.TrackImpl_xlyIBlM$lambda$0$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return TrackImpl_xlyIBlM$lambda$0$0$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_xlyIBlM$lambda$0$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrackImpl_xlyIBlM$lambda$1$0(float f, RangeSliderState rangeSliderState, long j, long j2, long j3, long j4, float f2, float f3, Function2 function2, Function3 function3, DrawScope drawScope) {
        float f4;
        if (!Dp.m9737equalsimpl0(f, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM())) {
            f4 = drawScope.mo528toPx0680j_4(f);
        } else {
            f4 = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L)) / 2;
        }
        m3989drawTrackGVD57ws$default(INSTANCE, drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3(), j, j2, j3, j4, drawScope.mo524toDpu2uoSUM(rangeSliderState.getStartThumbWidth$material3()), drawScope.mo524toDpu2uoSUM(rangeSliderState.getStartThumbHeight$material3()), drawScope.mo524toDpu2uoSUM(rangeSliderState.getEndThumbWidth$material3()), drawScope.mo524toDpu2uoSUM(rangeSliderState.getEndThumbHeight$material3()), f2, f3, drawScope.mo524toDpu2uoSUM(f4), function2, function3, true, false, null, false, 917504, null);
        return Unit.INSTANCE;
    }

    /* renamed from: drawTrack-GVD57ws$default, reason: not valid java name */
    static /* synthetic */ void m3989drawTrackGVD57ws$default(SliderDefaults sliderDefaults, DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Function2 function2, Function3 function3, boolean z, boolean z2, Orientation orientation, boolean z3, int i, Object obj) {
        sliderDefaults.m3988drawTrackGVD57ws(drawScope, fArr, f, f2, j, j2, j3, j4, f3, f4, f5, f6, f7, f8, f9, function2, function3, z, (i & 131072) != 0 ? false : z2, (i & 262144) != 0 ? Orientation.Horizontal : orientation, (i & 524288) != 0 ? false : z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if ((r35.length == 0) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x025f, code lost:
    
        if ((r35.length == 0 ? r29 : false) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c8  */
    /* renamed from: drawTrack-GVD57ws, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m3988drawTrackGVD57ws(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z, boolean z2, Orientation orientation, boolean z3) {
        float f10;
        float f11;
        boolean z4;
        long m6511constructorimpl;
        long m6579constructorimpl;
        float f12;
        float f13;
        long m6511constructorimpl2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int length;
        int i;
        ClosedFloatingPointRange<Float> closedFloatingPointRange;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        long m6511constructorimpl3;
        long m6511constructorimpl4;
        long m6579constructorimpl2;
        long m6511constructorimpl5;
        long m6579constructorimpl3;
        long m6511constructorimpl6;
        float f20;
        float f21;
        float f22;
        boolean z5 = orientation == Orientation.Vertical;
        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        boolean z7 = z6 && !z5;
        float f23 = drawScope.mo528toPx0680j_4(f9);
        long mo7294getSizeNHjbRc = drawScope.mo7294getSizeNHjbRc();
        float intBitsToFloat = Float.intBitsToFloat((int) (z5 ? mo7294getSizeNHjbRc & 4294967295L : mo7294getSizeNHjbRc >> 32));
        boolean z8 = Intrinsics.areEqual(f, ArraysKt.firstOrNull(fArr)) || Intrinsics.areEqual(f, ArraysKt.lastOrNull(fArr));
        float f24 = ((fArr.length == 0) || (Intrinsics.areEqual(f2, ArraysKt.firstOrNull(fArr)) || Intrinsics.areEqual(f2, ArraysKt.lastOrNull(fArr)))) ? 0.0f + ((intBitsToFloat - 0.0f) * f2) : (((intBitsToFloat - 0.0f) - (2 * f23)) * f2) + 0.0f + f23;
        float f25 = ((fArr.length == 0) || z8) ? 0.0f + ((intBitsToFloat - 0.0f) * f) : (((intBitsToFloat - 0.0f) - (2 * f23)) * f) + 0.0f + f23;
        float f26 = drawScope.mo528toPx0680j_4(f8);
        if (Dp.m9731compareTo0680j_4(f7, Dp.m9732constructorimpl(0)) > 0) {
            if (z5) {
                float f27 = 2;
                f20 = (drawScope.mo528toPx0680j_4(f4) / f27) + drawScope.mo528toPx0680j_4(f7);
                f21 = drawScope.mo528toPx0680j_4(f6) / f27;
                f22 = drawScope.mo528toPx0680j_4(f7);
            } else {
                float f28 = 2;
                f20 = (drawScope.mo528toPx0680j_4(f3) / f28) + drawScope.mo528toPx0680j_4(f7);
                f21 = drawScope.mo528toPx0680j_4(f5) / f28;
                f22 = drawScope.mo528toPx0680j_4(f7);
            }
            f10 = f20;
            f11 = f21 + f22;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        long mo7293getCenterF1C5BW0 = drawScope.mo7293getCenterF1C5BW0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (z5 ? mo7293getCenterF1C5BW0 & 4294967295L : mo7293getCenterF1C5BW0 >> 32));
        float f29 = f10 + 0.0f;
        if (z2) {
        }
        f29 += f23;
        float min = z3 ? Math.min(f24, intBitsToFloat2) : f25;
        if ((z3 || z) && min > f29) {
            float f30 = z7 ? f26 : f23;
            float f31 = z7 ? f23 : f26;
            float f32 = min - f10;
            if (z7) {
                z4 = true;
                m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) - f32) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            } else {
                z4 = true;
                m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
            if (z5) {
                m6579constructorimpl = Size.m6579constructorimpl((Float.floatToRawIntBits(f32 - 0.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32))) << 32));
            } else {
                m6579constructorimpl = Size.m6579constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f32 - 0.0f) << 32));
            }
            f12 = intBitsToFloat2;
            f13 = f24;
            m3990drawTrackPathzXTsYAs(drawScope, orientation, m6511constructorimpl, m6579constructorimpl, j, f30, f31);
            if (z5) {
                m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(f23 + 0.0f) & 4294967295L));
            } else if (z6) {
                m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) - 0.0f) - f23) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            } else {
                m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(f23 + 0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            }
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m6508boximpl(m6511constructorimpl2));
                Unit unit = Unit.INSTANCE;
            }
        } else {
            f12 = intBitsToFloat2;
            f13 = f24;
            z4 = true;
        }
        float f33 = intBitsToFloat - f11;
        if (z2) {
        }
        f33 -= f23;
        float max = z3 ? Math.max(f13, f12) : f13;
        if (max < f33) {
            float f34 = z7 ? f23 : f26;
            float f35 = z7 ? f26 : f23;
            float f36 = intBitsToFloat - (max + f11);
            if (z5) {
                m6511constructorimpl5 = Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L));
            } else if (z6) {
                m6511constructorimpl5 = Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            } else {
                m6511constructorimpl5 = Offset.m6511constructorimpl((Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
            if (z5) {
                m6579constructorimpl3 = Size.m6579constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f36) & 4294967295L));
            } else if (z6 && !z) {
                m6579constructorimpl3 = Size.m6579constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) - r0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L))) & 4294967295L));
            } else {
                m6579constructorimpl3 = Size.m6579constructorimpl((Float.floatToRawIntBits(f36) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L))) & 4294967295L));
            }
            m3990drawTrackPathzXTsYAs(drawScope, orientation, m6511constructorimpl5, m6579constructorimpl3, j, f34, f35);
            if (z5) {
                m6511constructorimpl6 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat - f23) & 4294967295L));
            } else if (z6) {
                m6511constructorimpl6 = Offset.m6511constructorimpl((Float.floatToRawIntBits(f23) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            } else {
                m6511constructorimpl6 = Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat - f23) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            }
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m6508boximpl(m6511constructorimpl6));
                Unit unit2 = Unit.INSTANCE;
            }
        }
        if (z3) {
            f14 = min + (min < f12 ? f10 : 0.0f);
        } else {
            f14 = z ? f25 + f10 : 0.0f;
        }
        if (z3) {
            f15 = max - (max > f12 ? f11 : 0.0f);
        } else {
            f15 = f13 - f11;
        }
        float f37 = (z7 || z3 || z) ? f26 : f23;
        float f38 = (!z7 || z3 || z) ? f26 : f23;
        float f39 = (!z7 || z3 || z) ? f15 - f14 : f15;
        if (z2) {
            if (fArr.length == 0 ? z4 : false) {
                f16 = 0.0f;
                if (f39 <= f16) {
                    if (z5) {
                        m6511constructorimpl4 = Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L));
                    } else if (z6) {
                        m6511constructorimpl4 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) - f15) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                    } else {
                        m6511constructorimpl4 = Offset.m6511constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                    }
                    long j5 = m6511constructorimpl4;
                    if (z5) {
                        m6579constructorimpl2 = Size.m6579constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f39) & 4294967295L));
                    } else if (z6 && !z3 && !z) {
                        m6579constructorimpl2 = Size.m6579constructorimpl((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L))) & 4294967295L));
                    } else {
                        m6579constructorimpl2 = Size.m6579constructorimpl((Float.floatToRawIntBits(f39) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L))) & 4294967295L));
                    }
                    f17 = f13;
                    f18 = f14;
                    f19 = f15;
                    m3990drawTrackPathzXTsYAs(drawScope, orientation, j5, m6579constructorimpl2, j2, f37, f38);
                } else {
                    f17 = f13;
                    f18 = f14;
                    f19 = f15;
                }
                float f40 = 0.0f + f23;
                float f41 = intBitsToFloat - f23;
                ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(f18, f19);
                ClosedFloatingPointRange<Float> rangeTo2 = RangesKt.rangeTo(f12 - f11, f12 + f11);
                ClosedFloatingPointRange<Float> rangeTo3 = RangesKt.rangeTo(f25 - f10, f25 + f10);
                ClosedFloatingPointRange<Float> rangeTo4 = RangesKt.rangeTo(f17 - f11, f17 + f11);
                length = fArr.length;
                int i2 = 0;
                i = 0;
                while (i < length) {
                    float f42 = fArr[i];
                    int i3 = i2 + 1;
                    if (function2 == null || (((!z3 && !z) || i2 != 0) && i2 != fArr.length - 1)) {
                        float lerp = MathHelpersKt.lerp(f40, f41, f42);
                        if ((!z3 || !rangeTo2.contains(Float.valueOf(lerp))) && ((!z || !rangeTo3.contains(Float.valueOf(lerp))) && !rangeTo4.contains(Float.valueOf(lerp)))) {
                            if (z5) {
                                closedFloatingPointRange = rangeTo2;
                                closedFloatingPointRange2 = rangeTo3;
                                m6511constructorimpl3 = Offset.m6511constructorimpl((Float.floatToRawIntBits(lerp) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() >> 32))) << 32));
                            } else {
                                closedFloatingPointRange = rangeTo2;
                                closedFloatingPointRange2 = rangeTo3;
                                if (z6) {
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) - lerp;
                                    m6511constructorimpl3 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                                } else {
                                    m6511constructorimpl3 = Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo7293getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(lerp) << 32));
                                }
                            }
                            function3.invoke(drawScope, Offset.m6508boximpl(m6511constructorimpl3), Color.m6776boximpl(rangeTo.contains(Float.valueOf(lerp)) ? j4 : j3));
                            i++;
                            rangeTo2 = closedFloatingPointRange;
                            rangeTo3 = closedFloatingPointRange2;
                            i2 = i3;
                        }
                    }
                    closedFloatingPointRange = rangeTo2;
                    closedFloatingPointRange2 = rangeTo3;
                    i++;
                    rangeTo2 = closedFloatingPointRange;
                    rangeTo3 = closedFloatingPointRange2;
                    i2 = i3;
                }
            }
        }
        f16 = f37;
        if (f39 <= f16) {
        }
        float f402 = 0.0f + f23;
        float f412 = intBitsToFloat - f23;
        ClosedFloatingPointRange<Float> rangeTo5 = RangesKt.rangeTo(f18, f19);
        ClosedFloatingPointRange<Float> rangeTo22 = RangesKt.rangeTo(f12 - f11, f12 + f11);
        ClosedFloatingPointRange<Float> rangeTo32 = RangesKt.rangeTo(f25 - f10, f25 + f10);
        ClosedFloatingPointRange<Float> rangeTo42 = RangesKt.rangeTo(f17 - f11, f17 + f11);
        length = fArr.length;
        int i22 = 0;
        i = 0;
        while (i < length) {
        }
    }

    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m3999drawStopIndicatorx3O1jOs(DrawScope drawScope, long j, float f, long j2) {
        DrawScope.CC.m7366drawCircleVaOC9Bg$default(drawScope, j2, drawScope.mo528toPx0680j_4(f) / 2.0f, j, 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m4001getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m4000getTickSizeD9Ej5fM() {
        return TickSize;
    }

    /* renamed from: drawTrackPath-zXTsYAs, reason: not valid java name */
    private final void m3990drawTrackPathzXTsYAs(DrawScope drawScope, Orientation orientation, long j, long j2, long j3, float f, float f2) {
        RoundRect m6571RoundRectZAM2FJo;
        long m6473constructorimpl = CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        long m6473constructorimpl2 = CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        if (orientation == Orientation.Vertical) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m6571RoundRectZAM2FJo = RoundRectKt.m6571RoundRectZAM2FJo(RectKt.m6559Recttz77jQw(j, Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32))), m6473constructorimpl, m6473constructorimpl, m6473constructorimpl2, m6473constructorimpl2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m6571RoundRectZAM2FJo = RoundRectKt.m6571RoundRectZAM2FJo(RectKt.m6559Recttz77jQw(j, Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32))), m6473constructorimpl, m6473constructorimpl2, m6473constructorimpl2, m6473constructorimpl);
        }
        Path path = trackPath;
        Path.CC.addRoundRect$default(path, m6571RoundRectZAM2FJo, null, 2, null);
        DrawScope.CC.m7375drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }
}
