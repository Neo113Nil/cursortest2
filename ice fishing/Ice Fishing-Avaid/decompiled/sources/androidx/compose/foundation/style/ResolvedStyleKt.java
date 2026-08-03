package androidx.compose.foundation.style;

import androidx.collection.MutableIntList;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.graphics.shadow.ShadowKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: ResolvedStyle.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0080\b\u001a(\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a(\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a&\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a9\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0010\u001a(\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a(\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a(\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a0\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a\r\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0082\b\u001a=\u0010\u0014\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010\u0014\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0002\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a \u0010\u0014\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020%H\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010$\u001a\u00020)*\u00020)2\u0006\u0010&\u001a\u00020)H\u0080\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010$\u001a\u00020,*\u00020,2\u0006\u0010&\u001a\u00020,H\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b/\u0010.\u001a\u0019\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0080\b\u001a!\u00103\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0080\b\u001a\u001d\u00105\u001a\u00020\u0016*\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016H\u0080\b\u001a%\u00107\u001a\u00020\u0016*\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0080\b\u001a\u0018\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0016H\u0002\u001a\u0018\u0010<\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0016H\u0002\u001a\u0015\u0010=\u001a\u00020>*\u00020?2\u0006\u00108\u001a\u00020\u0016H\u0082\b\u001a\r\u0010@\u001a\u00020\u0016*\u00020?H\u0082\b\u001a\f\u0010\\\u001a\u00020]*\u00020\u0003H\u0000\u001a\u0010\u0010^\u001a\u00020]2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\"\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010A\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010C\"\u000e\u0010E\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010V\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010W\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Y\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"lerpOuterLayout", "", "a", "Landroidx/compose/foundation/style/ResolvedStyle;", "b", "t", "", "result", "lerpMaybeNan", "lerpInnerLayout", "lerpDraw", "lerpShadows", "", "lerpArrayShadows", "", "Landroidx/compose/ui/graphics/shadow/Shadow;", "([Landroidx/compose/ui/graphics/shadow/Shadow;[Landroidx/compose/ui/graphics/shadow/Shadow;F)[Landroidx/compose/ui/graphics/shadow/Shadow;", "lerpLayer", "lerpTextDraw", "lerpTextLayout", "lerp", "flags", "", "floorToNearest100", "Landroidx/compose/ui/graphics/Brush;", "leftBrush", "leftColor", "Landroidx/compose/ui/graphics/Color;", "rightBrush", "rightColor", "lerp-wffgcV4", "(Landroidx/compose/ui/graphics/Brush;JLandroidx/compose/ui/graphics/Brush;JF)Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Shape;", "DefaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "EmptyResolvedStyle", "takeOrElse", "Landroidx/compose/ui/text/style/LineBreak;", "other", "takeOrElse-w1xZEK0", "(II)I", "Landroidx/compose/ui/text/style/BaselineShift;", "takeOrElse-y00tBZM", "(FF)F", "Landroidx/compose/ui/unit/TextUnit;", "takeOrElse-NB67dxo", "(JJ)J", "takeOrElse--OWjLjI", "applyTextEnum", "left", "right", "setBitsIfNonZero", "mask", "getBits", "shift", "setBits", "value", "updateHashEnter", "hash", "key", "updateHashExit", "push", "", "Landroidx/collection/MutableIntList;", "pop", "TextDefaultsResolvedStyle", "getTextDefaultsResolvedStyle", "()Lkotlin/Unit;", "Lkotlin/Unit;", "FontStyleShift", "TextAlignShift", "TextDirectionShift", "HyphensShift", "FontSynthesisShift", "TextDecorationShift", "FontWeightShift", "FontStyleMask", "TextAlignMask", "TextDirectionMask", "HyphensMask", "FontSynthesisMask", "TextDecorationMask", "FontWeightMask", "InnerLayoutFlag", "DrawFlag", "LayerFlag", "OuterLayoutFlag", "AnimatedFlag", "TextLayoutFlag", "TextDrawFlag", "InheritedFlags", "AnimateGroup", "flagsAsString", "", "resolvedStyleFlagsToString", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ResolvedStyleKt {
    public static final int AnimateGroup = 1318433304;
    public static final int AnimatedFlag = 16;
    public static final int DrawFlag = 2;
    private static final int FontStyleMask = 3;
    private static final int FontStyleShift = 0;
    private static final int FontSynthesisMask = 15360;
    private static final int FontSynthesisShift = 10;
    private static final int FontWeightMask = 134086656;
    private static final int FontWeightShift = 17;
    private static final int HyphensMask = 768;
    private static final int HyphensShift = 8;
    public static final int InheritedFlags = 96;
    public static final int InnerLayoutFlag = 1;
    public static final int LayerFlag = 4;
    public static final int OuterLayoutFlag = 8;
    private static final int TextAlignMask = 28;
    private static final int TextAlignShift = 2;
    private static final int TextDecorationMask = 114688;
    private static final int TextDecorationShift = 14;
    private static final Unit TextDefaultsResolvedStyle;
    private static final int TextDirectionMask = 112;
    private static final int TextDirectionShift = 4;
    public static final int TextDrawFlag = 64;
    public static final int TextLayoutFlag = 32;
    private static final SpringSpec<Float> DefaultSpringSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final ResolvedStyle EmptyResolvedStyle = new ResolvedStyle();

    public static final int applyTextEnum(int i, int i2) {
        int i3 = i2 & 3;
        int i4 = i & (-4);
        if (i3 != 0) {
            i = i3;
        }
        int i5 = i | i4;
        int i6 = i2 & 28;
        int i7 = i5 & (-29);
        if (i6 != 0) {
            i5 = i6;
        }
        int i8 = i5 | i7;
        int i9 = i2 & TextDirectionMask;
        int i10 = i8 & (-113);
        if (i9 != 0) {
            i8 = i9;
        }
        int i11 = i8 | i10;
        int i12 = i2 & HyphensMask;
        int i13 = i11 & (-769);
        if (i12 != 0) {
            i11 = i12;
        }
        int i14 = i11 | i13;
        int i15 = i2 & FontSynthesisMask;
        int i16 = i14 & (-15361);
        if (i15 != 0) {
            i14 = i15;
        }
        int i17 = i14 | i16;
        int i18 = i2 & FontWeightMask;
        int i19 = (-134086657) & i17;
        if (i18 != 0) {
            i17 = i18;
        }
        return i17 | i19;
    }

    public static final int getBits(int i, int i2, int i3) {
        return (i & i2) >> i3;
    }

    public static final int setBits(int i, int i2, int i3, int i4) {
        return (i & (~i2)) | (i2 & (i4 << i3));
    }

    public static final int setBitsIfNonZero(int i, int i2, int i3) {
        int i4 = i2 & i3;
        int i5 = (~i3) & i;
        if (i4 != 0) {
            i = i4;
        }
        return i | i5;
    }

    /* renamed from: takeOrElse--OWjLjI, reason: not valid java name */
    public static final long m1666takeOrElseOWjLjI(long j, long j2) {
        return j != 16 ? j : j2;
    }

    public static final void lerpOuterLayout(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        float externalPaddingStart = resolvedStyle.getExternalPaddingStart();
        float externalPaddingStart2 = resolvedStyle2.getExternalPaddingStart();
        boolean isNaN = Float.isNaN(externalPaddingStart);
        boolean isNaN2 = Float.isNaN(externalPaddingStart2);
        float f2 = 1 - f;
        float f3 = (f2 * externalPaddingStart) + (f * externalPaddingStart2);
        if (isNaN) {
            externalPaddingStart = externalPaddingStart2;
        } else if (!isNaN2) {
            externalPaddingStart = f3;
        }
        resolvedStyle3.setExternalPaddingStart$foundation(externalPaddingStart);
        float externalPaddingEnd = resolvedStyle.getExternalPaddingEnd();
        float externalPaddingEnd2 = resolvedStyle2.getExternalPaddingEnd();
        boolean isNaN3 = Float.isNaN(externalPaddingEnd);
        boolean isNaN4 = Float.isNaN(externalPaddingEnd2);
        float f4 = (f2 * externalPaddingEnd) + (f * externalPaddingEnd2);
        if (isNaN3) {
            externalPaddingEnd = externalPaddingEnd2;
        } else if (!isNaN4) {
            externalPaddingEnd = f4;
        }
        resolvedStyle3.setExternalPaddingEnd$foundation(externalPaddingEnd);
        float externalPaddingTop = resolvedStyle.getExternalPaddingTop();
        float externalPaddingTop2 = resolvedStyle2.getExternalPaddingTop();
        boolean isNaN5 = Float.isNaN(externalPaddingTop);
        boolean isNaN6 = Float.isNaN(externalPaddingTop2);
        float f5 = (f2 * externalPaddingTop) + (f * externalPaddingTop2);
        if (isNaN5) {
            externalPaddingTop = externalPaddingTop2;
        } else if (!isNaN6) {
            externalPaddingTop = f5;
        }
        resolvedStyle3.setExternalPaddingTop$foundation(externalPaddingTop);
        float externalPaddingBottom = resolvedStyle.getExternalPaddingBottom();
        float externalPaddingBottom2 = resolvedStyle2.getExternalPaddingBottom();
        boolean isNaN7 = Float.isNaN(externalPaddingBottom);
        boolean isNaN8 = Float.isNaN(externalPaddingBottom2);
        float f6 = (f2 * externalPaddingBottom) + (f * externalPaddingBottom2);
        if (isNaN7) {
            externalPaddingBottom = externalPaddingBottom2;
        } else if (!isNaN8) {
            externalPaddingBottom = f6;
        }
        resolvedStyle3.setExternalPaddingBottom$foundation(externalPaddingBottom);
        float left = resolvedStyle.getLeft();
        float left2 = resolvedStyle2.getLeft();
        boolean isNaN9 = Float.isNaN(left);
        boolean isNaN10 = Float.isNaN(left2);
        float f7 = (f2 * left) + (f * left2);
        if (isNaN9) {
            left = left2;
        } else if (!isNaN10) {
            left = f7;
        }
        resolvedStyle3.setLeft$foundation(left);
        float top = resolvedStyle.getTop();
        float top2 = resolvedStyle2.getTop();
        boolean isNaN11 = Float.isNaN(top);
        boolean isNaN12 = Float.isNaN(top2);
        float f8 = (f2 * top) + (f * top2);
        if (isNaN11) {
            top = top2;
        } else if (!isNaN12) {
            top = f8;
        }
        resolvedStyle3.setTop$foundation(top);
        float right = resolvedStyle.getRight();
        float right2 = resolvedStyle2.getRight();
        boolean isNaN13 = Float.isNaN(right);
        boolean isNaN14 = Float.isNaN(right2);
        float f9 = (f2 * right) + (f * right2);
        if (isNaN13) {
            right = right2;
        } else if (!isNaN14) {
            right = f9;
        }
        resolvedStyle3.setRight$foundation(right);
        float bottom = resolvedStyle.getBottom();
        float bottom2 = resolvedStyle2.getBottom();
        boolean isNaN15 = Float.isNaN(bottom);
        boolean isNaN16 = Float.isNaN(bottom2);
        float f10 = (f2 * bottom) + (f * bottom2);
        if (isNaN15) {
            bottom = bottom2;
        } else if (!isNaN16) {
            bottom = f10;
        }
        resolvedStyle3.setBottom$foundation(bottom);
        float width = resolvedStyle.getWidth();
        float width2 = resolvedStyle2.getWidth();
        boolean isNaN17 = Float.isNaN(width);
        boolean isNaN18 = Float.isNaN(width2);
        float f11 = (f2 * width) + (f * width2);
        if (isNaN17) {
            width = width2;
        } else if (!isNaN18) {
            width = f11;
        }
        resolvedStyle3.setWidth$foundation(width);
        float height = resolvedStyle.getHeight();
        float height2 = resolvedStyle2.getHeight();
        boolean isNaN19 = Float.isNaN(height);
        boolean isNaN20 = Float.isNaN(height2);
        float f12 = (f2 * height) + (f * height2);
        if (isNaN19) {
            height = height2;
        } else if (!isNaN20) {
            height = f12;
        }
        resolvedStyle3.setHeight$foundation(height);
        float widthFraction = resolvedStyle.getWidthFraction();
        float widthFraction2 = resolvedStyle2.getWidthFraction();
        boolean isNaN21 = Float.isNaN(widthFraction);
        boolean isNaN22 = Float.isNaN(widthFraction2);
        float f13 = (f2 * widthFraction) + (f * widthFraction2);
        if (isNaN21) {
            widthFraction = widthFraction2;
        } else if (!isNaN22) {
            widthFraction = f13;
        }
        resolvedStyle3.setWidthFraction$foundation(widthFraction);
        float heightFraction = resolvedStyle.getHeightFraction();
        float heightFraction2 = resolvedStyle2.getHeightFraction();
        boolean isNaN23 = Float.isNaN(heightFraction);
        boolean isNaN24 = Float.isNaN(heightFraction2);
        float f14 = (f2 * heightFraction) + (f * heightFraction2);
        if (isNaN23) {
            heightFraction = heightFraction2;
        } else if (!isNaN24) {
            heightFraction = f14;
        }
        resolvedStyle3.setHeightFraction$foundation(heightFraction);
        float minWidth = resolvedStyle.getMinWidth();
        float minWidth2 = resolvedStyle2.getMinWidth();
        boolean isNaN25 = Float.isNaN(minWidth);
        boolean isNaN26 = Float.isNaN(minWidth2);
        float f15 = (f2 * minWidth) + (f * minWidth2);
        if (isNaN25) {
            minWidth = minWidth2;
        } else if (!isNaN26) {
            minWidth = f15;
        }
        resolvedStyle3.setMinWidth$foundation(minWidth);
        float maxWidth = resolvedStyle.getMaxWidth();
        float maxWidth2 = resolvedStyle2.getMaxWidth();
        boolean isNaN27 = Float.isNaN(maxWidth);
        boolean isNaN28 = Float.isNaN(maxWidth2);
        float f16 = (f2 * maxWidth) + (f * maxWidth2);
        if (isNaN27) {
            maxWidth = maxWidth2;
        } else if (!isNaN28) {
            maxWidth = f16;
        }
        resolvedStyle3.setMaxWidth$foundation(maxWidth);
        float minHeight = resolvedStyle.getMinHeight();
        float minHeight2 = resolvedStyle2.getMinHeight();
        boolean isNaN29 = Float.isNaN(minHeight);
        boolean isNaN30 = Float.isNaN(minHeight2);
        float f17 = (f2 * minHeight) + (f * minHeight2);
        if (isNaN29) {
            minHeight = minHeight2;
        } else if (!isNaN30) {
            minHeight = f17;
        }
        resolvedStyle3.setMinHeight$foundation(minHeight);
        float maxHeight = resolvedStyle.getMaxHeight();
        float maxHeight2 = resolvedStyle2.getMaxHeight();
        boolean isNaN31 = Float.isNaN(maxHeight);
        boolean isNaN32 = Float.isNaN(maxHeight2);
        float f18 = (f2 * maxHeight) + (f * maxHeight2);
        if (isNaN31) {
            maxHeight = maxHeight2;
        } else if (!isNaN32) {
            maxHeight = f18;
        }
        resolvedStyle3.setMaxHeight$foundation(maxHeight);
    }

    public static final float lerpMaybeNan(float f, float f2, float f3) {
        return Float.isNaN(f) ? f2 : Float.isNaN(f2) ? f : ((1 - f3) * f) + (f3 * f2);
    }

    public static final void lerpInnerLayout(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        resolvedStyle3.setContentPaddingStart$foundation(MathHelpersKt.lerp(resolvedStyle.getContentPaddingStart(), resolvedStyle2.getContentPaddingStart(), f));
        resolvedStyle3.setContentPaddingEnd$foundation(MathHelpersKt.lerp(resolvedStyle.getContentPaddingEnd(), resolvedStyle2.getContentPaddingEnd(), f));
        resolvedStyle3.setContentPaddingTop$foundation(MathHelpersKt.lerp(resolvedStyle.getContentPaddingTop(), resolvedStyle2.getContentPaddingTop(), f));
        resolvedStyle3.setContentPaddingBottom$foundation(MathHelpersKt.lerp(resolvedStyle.getContentPaddingBottom(), resolvedStyle2.getContentPaddingBottom(), f));
    }

    public static final void lerpDraw(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        resolvedStyle3.setBorderWidth$foundation(MathHelpersKt.lerp(resolvedStyle.getBorderWidth(), resolvedStyle2.getBorderWidth(), f));
        resolvedStyle3.m1647setBorderColor8_81llA$foundation(ColorKt.m6837lerpjxsXWHM(resolvedStyle.getBorderColor(), resolvedStyle2.getBorderColor(), f));
        resolvedStyle3.setBorderBrush$foundation(m1665lerpwffgcV4(resolvedStyle.getBorderBrush(), resolvedStyle.getBorderColor(), resolvedStyle2.getBorderBrush(), resolvedStyle2.getBorderColor(), f));
        resolvedStyle3.m1645setBackgroundColor8_81llA$foundation(ColorKt.m6837lerpjxsXWHM(resolvedStyle.getBackgroundColor(), resolvedStyle2.getBackgroundColor(), f));
        resolvedStyle3.setBackgroundBrush$foundation(m1665lerpwffgcV4(resolvedStyle.getBackgroundBrush(), resolvedStyle.getBackgroundColor(), resolvedStyle2.getBackgroundBrush(), resolvedStyle2.getBackgroundColor(), f));
        resolvedStyle3.setForegroundBrush$foundation(m1665lerpwffgcV4(resolvedStyle.getForegroundBrush(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), resolvedStyle2.getForegroundBrush(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), f));
        resolvedStyle3.setInnerShadow$foundation(lerpShadows(resolvedStyle.getInnerShadow(), resolvedStyle2.getInnerShadow(), f));
        resolvedStyle3.setDropShadow$foundation(lerpShadows(resolvedStyle.getDropShadow(), resolvedStyle2.getDropShadow(), f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object lerpShadows(Object obj, Object obj2, float f) {
        Shadow[] shadowArr;
        Shadow[] shadowArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return ShadowKt.lerp(obj instanceof Shadow ? (Shadow) obj : null, obj2 instanceof Shadow ? (Shadow) obj2 : null, f);
        }
        if (z) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<androidx.compose.ui.graphics.shadow.Shadow>");
            shadowArr = (Shadow[]) obj;
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.graphics.shadow.Shadow");
            shadowArr = new Shadow[]{obj};
        }
        if (z2) {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<androidx.compose.ui.graphics.shadow.Shadow>");
            shadowArr2 = (Shadow[]) obj2;
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.graphics.shadow.Shadow");
            shadowArr2 = new Shadow[]{obj2};
        }
        return lerpArrayShadows(shadowArr, shadowArr2, f);
    }

    public static final Shadow[] lerpArrayShadows(Shadow[] shadowArr, Shadow[] shadowArr2, float f) {
        int max = Math.max(shadowArr.length, shadowArr2.length);
        Shadow[] shadowArr3 = new Shadow[max];
        for (int i = 0; i < max; i++) {
            shadowArr3[i] = null;
        }
        for (int i2 = 0; i2 < max; i2++) {
            shadowArr3[i2] = ShadowKt.lerp((Shadow) ArraysKt.getOrNull(shadowArr, i2), (Shadow) ArraysKt.getOrNull(shadowArr2, i2), f);
        }
        return shadowArr3;
    }

    public static final void lerpLayer(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        resolvedStyle3.setAlpha$foundation(MathHelpersKt.lerp(resolvedStyle.getAlpha(), resolvedStyle2.getAlpha(), f));
        resolvedStyle3.setScaleX$foundation(MathHelpersKt.lerp(resolvedStyle.getScaleX(), resolvedStyle2.getScaleX(), f));
        resolvedStyle3.setScaleY$foundation(MathHelpersKt.lerp(resolvedStyle.getScaleY(), resolvedStyle2.getScaleY(), f));
        resolvedStyle3.setTranslationX$foundation(MathHelpersKt.lerp(resolvedStyle.getTranslationX(), resolvedStyle2.getTranslationX(), f));
        resolvedStyle3.setTranslationY$foundation(MathHelpersKt.lerp(resolvedStyle.getTranslationY(), resolvedStyle2.getTranslationY(), f));
        resolvedStyle3.setRotationX$foundation(MathHelpersKt.lerp(resolvedStyle.getRotationX(), resolvedStyle2.getRotationX(), f));
        resolvedStyle3.setRotationY$foundation(MathHelpersKt.lerp(resolvedStyle.getRotationY(), resolvedStyle2.getRotationY(), f));
        resolvedStyle3.setRotationZ$foundation(MathHelpersKt.lerp(resolvedStyle.getRotationZ(), resolvedStyle2.getRotationZ(), f));
        resolvedStyle3.m1654setTransformOrigin__ExYCQ$foundation(TransformOriginKt.TransformOrigin(MathHelpersKt.lerp(TransformOrigin.m7206getPivotFractionXimpl(resolvedStyle.getTransformOrigin()), TransformOrigin.m7206getPivotFractionXimpl(resolvedStyle2.getTransformOrigin()), f), MathHelpersKt.lerp(TransformOrigin.m7207getPivotFractionYimpl(resolvedStyle.getTransformOrigin()), TransformOrigin.m7207getPivotFractionYimpl(resolvedStyle2.getTransformOrigin()), f)));
        resolvedStyle3.setZIndex$foundation(MathHelpersKt.lerp(resolvedStyle.getZIndex(), resolvedStyle2.getZIndex(), f));
        resolvedStyle3.setShape$foundation(lerp(resolvedStyle.getShape(), resolvedStyle2.getShape(), f));
        resolvedStyle3.setClip$foundation(f < 0.5f ? resolvedStyle.getClip() : resolvedStyle2.getClip());
    }

    public static final void lerpTextDraw(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        resolvedStyle3.m1648setContentColor8_81llA$foundation(ColorKt.m6837lerpjxsXWHM(resolvedStyle.getContentColor(), resolvedStyle2.getContentColor(), f));
        resolvedStyle3.setContentBrush$foundation(m1665lerpwffgcV4(resolvedStyle.getContentBrush(), resolvedStyle.getContentColor(), resolvedStyle2.getContentBrush(), resolvedStyle2.getContentColor(), f));
    }

    public static final void lerpTextLayout(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, ResolvedStyle resolvedStyle3) {
        if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle.getFontSize()) == 0)) {
            if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle2.getFontSize()) == 0)) {
                resolvedStyle3.m1649setFontSizeR2X_6o$foundation(TextUnitKt.m9950lerpC3pnCVY(resolvedStyle.getFontSize(), resolvedStyle2.getFontSize(), f));
            }
        }
        if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle.getLineHeight()) == 0)) {
            if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle2.getLineHeight()) == 0)) {
                resolvedStyle3.m1653setLineHeightR2X_6o$foundation(TextUnitKt.m9950lerpC3pnCVY(resolvedStyle.getLineHeight(), resolvedStyle2.getLineHeight(), f));
            }
        }
        if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle.getLetterSpacing()) == 0)) {
            if (!(TextUnit.m9928getRawTypeimpl(resolvedStyle2.getLetterSpacing()) == 0)) {
                resolvedStyle3.m1651setLetterSpacingR2X_6o$foundation(TextUnitKt.m9950lerpC3pnCVY(resolvedStyle.getLetterSpacing(), resolvedStyle2.getLetterSpacing(), f));
            }
        }
        resolvedStyle3.setFontFamily$foundation(f < 0.5f ? resolvedStyle.getFontFamily() : resolvedStyle2.getFontFamily());
        resolvedStyle3.setTextIndent$foundation(f < 0.5f ? resolvedStyle.getTextIndent() : resolvedStyle2.getTextIndent());
        resolvedStyle3.m1646setBaselineShift4Dl_Bck$foundation(f < 0.5f ? resolvedStyle.getBaselineShift() : resolvedStyle2.getBaselineShift());
        resolvedStyle3.m1652setLineBreakCZqVlQI$foundation(f < 0.5f ? resolvedStyle.getLineBreak() : resolvedStyle2.getLineBreak());
        resolvedStyle3.setTextEnums$foundation(f < 0.5f ? resolvedStyle.getTextEnums() : resolvedStyle2.getTextEnums());
        int textEnums = (resolvedStyle.getTextEnums() & FontWeightMask) >> 17;
        int textEnums2 = (resolvedStyle2.getTextEnums() & FontWeightMask) >> 17;
        if (textEnums <= 0 || textEnums2 <= 0) {
            return;
        }
        resolvedStyle3.setTextEnums$foundation(((((MathHelpersKt.lerp(textEnums, textEnums2, f) / 100) * 100) << 17) & FontWeightMask) | (resolvedStyle3.getTextEnums() & (-134086657)));
    }

    public static final void lerp(ResolvedStyle resolvedStyle, ResolvedStyle resolvedStyle2, float f, int i, ResolvedStyle resolvedStyle3) {
        int i2 = resolvedStyle.flags | resolvedStyle2.flags;
        resolvedStyle3.flags = i2;
        int i3 = i & i2;
        if ((i3 & 8) != 0) {
            lerpOuterLayout(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
        if ((i3 & 1) != 0) {
            lerpInnerLayout(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
        if ((i3 & 2) != 0) {
            lerpDraw(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
        if ((i3 & 4) != 0) {
            lerpLayer(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
        if ((i3 & 64) != 0) {
            lerpTextDraw(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
        if ((i3 & 32) != 0) {
            lerpTextLayout(resolvedStyle, resolvedStyle2, f, resolvedStyle3);
        }
    }

    private static final int floorToNearest100(int i) {
        return (i / 100) * 100;
    }

    /* renamed from: lerp-wffgcV4, reason: not valid java name */
    private static final Brush m1665lerpwffgcV4(Brush brush, long j, Brush brush2, long j2, float f) {
        if (brush == null && brush2 == null) {
            return null;
        }
        if (brush == null) {
            brush = new SolidColor(j, null);
        } else if (brush2 == null) {
            brush2 = new SolidColor(j2, null);
        }
        Object lerp = Interpolatable.INSTANCE.lerp(brush, brush2, f);
        if (lerp instanceof Brush) {
            return (Brush) lerp;
        }
        return null;
    }

    private static final Brush lerp(Brush brush, Brush brush2, float f) {
        Object lerp = Interpolatable.INSTANCE.lerp(brush, brush2, f);
        if (lerp instanceof Brush) {
            return (Brush) lerp;
        }
        return null;
    }

    private static final Shape lerp(Shape shape, Shape shape2, float f) {
        Object lerp = Interpolatable.INSTANCE.lerp(shape, shape2, f);
        Shape shape3 = lerp instanceof Shape ? (Shape) lerp : null;
        return shape3 == null ? RectangleShapeKt.getRectangleShape() : shape3;
    }

    static {
        StyleScopeKt.apply(new ResolvedStyle(), new Style() { // from class: androidx.compose.foundation.style.ResolvedStyleKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope) {
                ResolvedStyleKt.TextDefaultsResolvedStyle$lambda$0(styleScope);
            }
        });
        TextDefaultsResolvedStyle = Unit.INSTANCE;
    }

    /* renamed from: takeOrElse-y00tBZM, reason: not valid java name */
    public static final float m1669takeOrElsey00tBZM(float f, float f2) {
        return BaselineShift.m9465equalsimpl0(f, BaselineShift.INSTANCE.m9476getUnspecifiedy9eOQZs()) ? f : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateHashEnter(int i, int i2) {
        return Integer.rotateLeft(i, 3) ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateHashExit(int i, int i2) {
        return Integer.rotateRight(i ^ i2, 3);
    }

    private static final boolean push(MutableIntList mutableIntList, int i) {
        return mutableIntList.add(i);
    }

    private static final int pop(MutableIntList mutableIntList) {
        return mutableIntList.removeAt(mutableIntList._size - 1);
    }

    public static final Unit getTextDefaultsResolvedStyle() {
        return TextDefaultsResolvedStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextDefaultsResolvedStyle$lambda$0(StyleScope styleScope) {
        styleScope.mo1611fontSizeR2X_6o(TextUnitKt.getSp(14));
        styleScope.mo1633letterSpacingR2X_6o(TextUnitKt.getSp(0));
        styleScope.mo1592contentColor8_81llA(Color.INSTANCE.m6812getBlack0d7_KjU());
        styleScope.fontWeight(FontWeight.INSTANCE.getNormal());
        styleScope.mo1612fontStylenzbMABs(FontStyle.INSTANCE.m9286getNormal_LCdwA());
        styleScope.mo1613fontSynthesis6p3vJLY(FontSynthesis.INSTANCE.m9296getAllGVVA2EU());
        styleScope.fontFamily(FontFamily.INSTANCE.getDefault());
        styleScope.mo1586baselineShift4Dl_Bck(BaselineShift.INSTANCE.m9473getNoney9eOQZs());
        styleScope.textDecoration(TextDecoration.INSTANCE.getNone());
    }

    public static final String flagsAsString(ResolvedStyle resolvedStyle) {
        return resolvedStyleFlagsToString(resolvedStyle.flags);
    }

    public static final String resolvedStyleFlagsToString(int i) {
        StringBuilder sb = new StringBuilder();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if ((i & 1) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "InnerLayoutFlag");
        }
        if ((i & 2) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "DrawFlag");
        }
        if ((i & 4) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "LayerFlag");
        }
        if ((i & 8) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "OuterLayoutFlag");
        }
        if ((i & 16) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "AnimatedFlag");
        }
        if ((i & 32) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "TextLayoutFlag");
        }
        if ((i & 64) != 0) {
            resolvedStyleFlagsToString$lambda$0$emit(booleanRef, sb, "TextDrawFlag");
        }
        return sb.toString();
    }

    private static final void resolvedStyleFlagsToString$lambda$0$emit(Ref.BooleanRef booleanRef, StringBuilder sb, String str) {
        if (!booleanRef.element) {
            sb.append(", ");
        }
        booleanRef.element = false;
        sb.append(str);
    }

    /* renamed from: takeOrElse-w1xZEK0, reason: not valid java name */
    public static final int m1668takeOrElsew1xZEK0(int i, int i2) {
        return !LineBreak.m9504equalsimpl0(i, LineBreak.INSTANCE.m9518getUnspecifiedrAG3T2k()) ? i : i2;
    }

    /* renamed from: takeOrElse-NB67dxo, reason: not valid java name */
    public static final long m1667takeOrElseNB67dxo(long j, long j2) {
        return !((TextUnit.m9928getRawTypeimpl(j) > 0L ? 1 : (TextUnit.m9928getRawTypeimpl(j) == 0L ? 0 : -1)) == 0) ? j : j2;
    }
}
