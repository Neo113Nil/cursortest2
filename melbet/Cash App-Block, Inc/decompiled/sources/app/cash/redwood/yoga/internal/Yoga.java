package app.cash.redwood.yoga.internal;

import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import app.cash.redwood.yoga.Node;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.detail.StyleEnumFlagsKey;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGAlign;
import app.cash.redwood.yoga.internal.enums.YGDimension;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import app.cash.redwood.yoga.internal.enums.YGDisplay;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import app.cash.redwood.yoga.internal.enums.YGJustify;
import app.cash.redwood.yoga.internal.enums.YGLogLevel;
import app.cash.redwood.yoga.internal.enums.YGMeasureMode;
import app.cash.redwood.yoga.internal.enums.YGNodeType;
import app.cash.redwood.yoga.internal.enums.YGOverflow;
import app.cash.redwood.yoga.internal.enums.YGPositionType;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import app.cash.redwood.yoga.internal.enums.YGWrap;
import app.cash.redwood.yoga.internal.event.EmptyEventData;
import app.cash.redwood.yoga.internal.event.Event;
import app.cash.redwood.yoga.internal.event.LayoutPassReason;
import app.cash.redwood.yoga.internal.event.LayoutType;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.protos.cash.cashsuggest.api.Section;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.KClass;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Yoga {
    public static final Yoga INSTANCE = new Yoga();
    public static final YGValue YGValueAuto = new YGValue(Float.NaN, YGUnit.YGUnitAuto);
    public static final YGValue YGValueUndefined = new YGValue(Float.NaN, YGUnit.YGUnitUndefined);
    public static final YGValue YGValueZero = new YGValue(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint);
    public static final AtomicInteger currentGenerationCount;
    public static final List dim;
    public static final List leading;
    public static final List pos;
    public static final List trailing;

    static {
        YGEdge yGEdge = YGEdge.YGEdgeTop;
        YGEdge yGEdge2 = YGEdge.YGEdgeBottom;
        YGEdge yGEdge3 = YGEdge.YGEdgeLeft;
        YGEdge yGEdge4 = YGEdge.YGEdgeRight;
        leading = CollectionsKt__CollectionsKt.listOf((Object[]) new YGEdge[]{yGEdge, yGEdge2, yGEdge3, yGEdge4});
        trailing = CollectionsKt__CollectionsKt.listOf((Object[]) new YGEdge[]{yGEdge2, yGEdge, yGEdge4, yGEdge3});
        pos = CollectionsKt__CollectionsKt.listOf((Object[]) new YGEdge[]{yGEdge, yGEdge2, yGEdge3, yGEdge4});
        YGDimension yGDimension = YGDimension.YGDimensionHeight;
        YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
        dim = CollectionsKt__CollectionsKt.listOf((Object[]) new YGDimension[]{yGDimension, yGDimension, yGDimension2, yGDimension2});
        currentGenerationCount = new AtomicInteger(1);
    }

    public static void YGAssertWithNode(YGNode yGNode, boolean z, String str) {
        if (z) {
            return;
        }
        YGLogLevel[] yGLogLevelArr = YGLogLevel.$VALUES;
        Object[] objArr = {str};
        YGConfig yGConfig = yGNode != null ? yGNode.config : null;
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        if (yGConfig == null) {
            yGConfig = YGConfig.Default;
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        yGConfig.getClass();
        ((Yoga$YGConfigNew$1) yGConfig.logger_struct.this$0).getClass();
        Arrays.copyOf(copyOf2, copyOf2.length);
        OptionalProvider$$ExternalSyntheticLambda0.m$1(str);
    }

    public static float YGBaseline(YGNode yGNode) {
        YGNode YGNodeGetChild;
        yGNode.baseline.getClass();
        int size = yGNode.children.size();
        YGNode yGNode2 = null;
        for (int i = 0; i < size && ((YGNodeGetChild = YGNodeGetChild(yGNode, i)) == null || YGNodeGetChild.lineIndex <= 0); i++) {
            YGNodeGetChild.getClass();
            if (YGNodeGetChild.style.positionType() != YGPositionType.YGPositionTypeAbsolute) {
                if (YGNodeAlignItem(yGNode, YGNodeGetChild) != YGAlign.YGAlignBaseline) {
                    LinkedHashMap linkedHashMap = YGNodeGetChild.flags;
                    linkedHashMap.getClass();
                    Object obj = linkedHashMap.get(1);
                    if (obj == null) {
                        obj = Boolean.FALSE;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        if (yGNode2 == null) {
                            yGNode2 = YGNodeGetChild;
                        }
                    }
                }
                yGNode2 = YGNodeGetChild;
                break;
            }
        }
        if (yGNode2 == null) {
            YGLayout yGLayout = yGNode.layout;
            yGLayout.getClass();
            float[] fArr = yGLayout.measuredDimensions;
            YGDimension yGDimension = YGDimension.YGDimensionWidth;
            return fArr[1];
        }
        float YGBaseline = YGBaseline(yGNode2);
        YGLayout yGLayout2 = yGNode2.layout;
        yGLayout2.getClass();
        float[] fArr2 = yGLayout2.position;
        YGEdge yGEdge = YGEdge.YGEdgeLeft;
        return YGBaseline + fArr2[1];
    }

    public static void YGConstrainMaxSizeForMode(YGNode yGNode, YGFlexDirection yGFlexDirection, float f, float f2, YGMeasureMode yGMeasureMode, Recorder.AnonymousClass6 anonymousClass6) {
        float m1416getMarginForAxisnjjmY0 = yGNode.m1416getMarginForAxisnjjmY0(yGFlexDirection, f2) + m1422YGResolveValuenjjmY0(yGNode.style.maxDimensions.getCompactValue(((YGDimension) dim.get(yGFlexDirection.ordinal())).ordinal()).convertToYgValue(), f);
        int ordinal = yGMeasureMode.ordinal();
        if (ordinal == 0) {
            if (Float.isNaN(m1416getMarginForAxisnjjmY0)) {
                return;
            }
            anonymousClass6.this$0 = Float.valueOf(m1416getMarginForAxisnjjmY0);
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            if (Float.isNaN(m1416getMarginForAxisnjjmY0) || ((Float) anonymousClass6.this$0).floatValue() < m1416getMarginForAxisnjjmY0) {
                m1416getMarginForAxisnjjmY0 = ((Float) anonymousClass6.this$0).floatValue();
            }
            anonymousClass6.this$0 = Float.valueOf(m1416getMarginForAxisnjjmY0);
        }
    }

    public static boolean YGDoubleEqual(double d, double d2) {
        return (Double.isNaN(d) || Double.isNaN(d2)) ? Double.isNaN(d) && Double.isNaN(d2) : Math.abs(d - d2) < 1.0E-4d;
    }

    public static boolean YGFlexDirectionIsColumn(YGFlexDirection yGFlexDirection) {
        return yGFlexDirection == YGFlexDirection.YGFlexDirectionColumn || yGFlexDirection == YGFlexDirection.YGFlexDirectionColumnReverse;
    }

    public static boolean YGFlexDirectionIsRow(YGFlexDirection yGFlexDirection) {
        yGFlexDirection.getClass();
        return yGFlexDirection == YGFlexDirection.YGFlexDirectionRow || yGFlexDirection == YGFlexDirection.YGFlexDirectionRowReverse;
    }

    public static float YGFloatMax(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) ? f2 : f : Math.max(f, f2);
    }

    public static float YGFloatMin(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) ? f2 : f : Math.min(f, f2);
    }

    /* renamed from: YGFloatOptionalMax-7X9vPvM, reason: not valid java name */
    public static float m1420YGFloatOptionalMax7X9vPvM(float f, float f2) {
        return (f > f2 || f == f2 || (f2 <= f && !Float.isNaN(f))) ? f : f2;
    }

    public static boolean YGFloatsEqual(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f - f2) < 1.0E-4f;
    }

    public static boolean YGIsBaselineLayout(YGNode yGNode) {
        yGNode.getClass();
        YGStyle yGStyle = yGNode.style;
        if (!YGFlexDirectionIsColumn(yGStyle.flexDirection())) {
            if (yGStyle.alignItems() == YGAlign.YGAlignBaseline) {
                return true;
            }
            int size = yGNode.children.size();
            for (int i = 0; i < size; i++) {
                YGNode YGNodeGetChild = YGNodeGetChild(yGNode, i);
                if (YGNodeGetChild != null) {
                    YGStyle yGStyle2 = YGNodeGetChild.style;
                    if (yGStyle2.positionType() != YGPositionType.YGPositionTypeAbsolute && yGStyle2.alignSelf() == YGAlign.YGAlignBaseline) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void YGJustifyMainAxis(YGNode yGNode, YGCollectFlexItemsRowValues yGCollectFlexItemsRowValues, int i, YGFlexDirection yGFlexDirection, YGFlexDirection yGFlexDirection2, YGMeasureMode yGMeasureMode, YGMeasureMode yGMeasureMode2, float f, float f2, float f3, float f4, float f5, boolean z) {
        float f6;
        float f7;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int ordinal;
        YGNode yGNode2 = yGNode;
        float f8 = f3;
        yGNode2.getClass();
        YGStyle yGStyle = yGNode2.style;
        float leadingBorder = yGNode2.getLeadingBorder(yGFlexDirection) + yGNode2.m1414getLeadingPaddingnjjmY0(yGFlexDirection, f2);
        float trailingBorder = yGNode2.getTrailingBorder(yGFlexDirection) + yGNode2.m1418getTrailingPaddingnjjmY0(yGFlexDirection, f2);
        if (yGMeasureMode == YGMeasureMode.YGMeasureModeAtMost && yGCollectFlexItemsRowValues.remainingFreeSpace > RecyclerView.DECELERATION_RATE) {
            Values values = yGStyle.minDimensions;
            int ordinal2 = yGFlexDirection.ordinal();
            List list = dim;
            if (values.getCompactValue(((YGDimension) list.get(ordinal2)).ordinal()).isUndefined() || Float.isNaN(m1422YGResolveValuenjjmY0(values.getCompactValue(((YGDimension) list.get(yGFlexDirection.ordinal())).ordinal()).convertToYgValue(), f))) {
                yGCollectFlexItemsRowValues.remainingFreeSpace = RecyclerView.DECELERATION_RATE;
            } else {
                yGCollectFlexItemsRowValues.remainingFreeSpace = YGFloatMax(RecyclerView.DECELERATION_RATE, ((m1422YGResolveValuenjjmY0(values.getCompactValue(((YGDimension) list.get(yGFlexDirection.ordinal())).ordinal()).convertToYgValue(), f) - leadingBorder) - trailingBorder) - (f8 - yGCollectFlexItemsRowValues.remainingFreeSpace));
            }
        }
        int i4 = yGCollectFlexItemsRowValues.endOfLineIndex;
        int i5 = 0;
        for (int i6 = i; i6 < i4; i6++) {
            YGNode child = yGNode2.getChild(i6);
            if (child.style.positionType() != YGPositionType.YGPositionTypeAbsolute) {
                YGUnit yGUnit = child.marginLeadingValue(yGFlexDirection).unit;
                YGUnit yGUnit2 = YGUnit.YGUnitAuto;
                if (yGUnit == yGUnit2) {
                    i5++;
                }
                if (child.marginTrailingValue(yGFlexDirection).unit == yGUnit2) {
                    i5++;
                }
            }
        }
        YGJustify justifyContent = yGStyle.justifyContent();
        boolean z4 = true;
        if (i5 != 0 || (ordinal = justifyContent.ordinal()) == 0) {
            f6 = 0.0f;
        } else {
            if (ordinal == 1) {
                f6 = yGCollectFlexItemsRowValues.remainingFreeSpace / 2.0f;
            } else {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        f7 = yGCollectFlexItemsRowValues.itemsOnLine > 1 ? YGFloatMax(yGCollectFlexItemsRowValues.remainingFreeSpace, RecyclerView.DECELERATION_RATE) / (yGCollectFlexItemsRowValues.itemsOnLine - 1) : 0.0f;
                        f6 = 0.0f;
                    } else if (ordinal == 4) {
                        float f9 = yGCollectFlexItemsRowValues.remainingFreeSpace / yGCollectFlexItemsRowValues.itemsOnLine;
                        f7 = f9;
                        f6 = f9 / 2.0f;
                    } else {
                        if (ordinal != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        f6 = yGCollectFlexItemsRowValues.remainingFreeSpace / (yGCollectFlexItemsRowValues.itemsOnLine + 1);
                    }
                    yGCollectFlexItemsRowValues.mainDim = leadingBorder + f6;
                    yGCollectFlexItemsRowValues.crossDim = RecyclerView.DECELERATION_RATE;
                    boolean YGIsBaselineLayout = YGIsBaselineLayout(yGNode2);
                    i2 = yGCollectFlexItemsRowValues.endOfLineIndex;
                    float f10 = 0.0f;
                    float f11 = 0.0f;
                    i3 = i;
                    while (i3 < i2) {
                        YGNode child2 = yGNode2.getChild(i3);
                        boolean z5 = z4;
                        YGStyle yGStyle2 = child2.style;
                        float f12 = f6;
                        YGLayout yGLayout = child2.layout;
                        float f13 = trailingBorder;
                        if (yGStyle2.display() == YGDisplay.YGDisplayNone) {
                            z3 = YGIsBaselineLayout;
                        } else {
                            YGPositionType positionType = yGStyle2.positionType();
                            YGPositionType yGPositionType = YGPositionType.YGPositionTypeAbsolute;
                            z3 = YGIsBaselineLayout;
                            List list2 = pos;
                            if (positionType == yGPositionType && child2.isLeadingPositionDefined(yGFlexDirection)) {
                                if (z) {
                                    child2.setLayoutPosition(child2.m1413getLeadingMarginnjjmY0(yGFlexDirection, f5) + yGNode2.getLeadingBorder(yGFlexDirection) + child2.m1415getLeadingPositionnjjmY0(yGFlexDirection, f8), ((YGEdge) list2.get(yGFlexDirection.ordinal())).ordinal());
                                }
                            } else if (yGStyle2.positionType() != yGPositionType) {
                                YGUnit yGUnit3 = child2.marginLeadingValue(yGFlexDirection).unit;
                                YGUnit yGUnit4 = YGUnit.YGUnitAuto;
                                if (yGUnit3 == yGUnit4) {
                                    yGCollectFlexItemsRowValues.mainDim = (yGCollectFlexItemsRowValues.remainingFreeSpace / i5) + yGCollectFlexItemsRowValues.mainDim;
                                }
                                if (z) {
                                    yGLayout.getClass();
                                    child2.setLayoutPosition(yGLayout.position[((YGEdge) list2.get(yGFlexDirection.ordinal())).ordinal()] + yGCollectFlexItemsRowValues.mainDim, ((YGEdge) list2.get(yGFlexDirection.ordinal())).ordinal());
                                }
                                if (child2.marginTrailingValue(yGFlexDirection).unit == yGUnit4) {
                                    yGCollectFlexItemsRowValues.mainDim = (yGCollectFlexItemsRowValues.remainingFreeSpace / i5) + yGCollectFlexItemsRowValues.mainDim;
                                }
                                if (!z && yGMeasureMode2 == YGMeasureMode.YGMeasureModeExactly) {
                                    float f14 = yGCollectFlexItemsRowValues.mainDim;
                                    float m1416getMarginForAxisnjjmY0 = child2.m1416getMarginForAxisnjjmY0(yGFlexDirection, f5) + f7;
                                    yGLayout.getClass();
                                    yGCollectFlexItemsRowValues.mainDim = m1416getMarginForAxisnjjmY0 + yGLayout.computedFlexBasis + f14;
                                    yGCollectFlexItemsRowValues.crossDim = f4;
                                }
                                yGCollectFlexItemsRowValues.mainDim = YGNodeDimWithMargin(child2, yGFlexDirection, f5) + f7 + yGCollectFlexItemsRowValues.mainDim;
                                if (z3) {
                                    float YGBaseline = YGBaseline(child2);
                                    YGFlexDirection yGFlexDirection3 = YGFlexDirection.YGFlexDirectionColumn;
                                    float m1413getLeadingMarginnjjmY0 = child2.m1413getLeadingMarginnjjmY0(yGFlexDirection3, f5) + YGBaseline;
                                    YGLayout yGLayout2 = child2.layout;
                                    yGLayout2.getClass();
                                    float[] fArr = yGLayout2.measuredDimensions;
                                    YGDimension yGDimension = YGDimension.YGDimensionWidth;
                                    float m1416getMarginForAxisnjjmY02 = (child2.m1416getMarginForAxisnjjmY0(yGFlexDirection3, f5) + fArr[z5 ? 1 : 0]) - m1413getLeadingMarginnjjmY0;
                                    f10 = YGFloatMax(f10, m1413getLeadingMarginnjjmY0);
                                    f11 = YGFloatMax(f11, m1416getMarginForAxisnjjmY02);
                                } else {
                                    yGCollectFlexItemsRowValues.crossDim = YGFloatMax(yGCollectFlexItemsRowValues.crossDim, YGNodeDimWithMargin(child2, yGFlexDirection2, f5));
                                }
                            } else if (z) {
                                yGLayout.getClass();
                                child2.setLayoutPosition(yGNode2.getLeadingBorder(yGFlexDirection) + yGLayout.position[((YGEdge) list2.get(yGFlexDirection.ordinal())).ordinal()] + f12, ((YGEdge) list2.get(yGFlexDirection.ordinal())).ordinal());
                            }
                        }
                        i3++;
                        yGNode2 = yGNode;
                        z4 = z5 ? 1 : 0;
                        f6 = f12;
                        trailingBorder = f13;
                        f8 = f3;
                        YGIsBaselineLayout = z3;
                    }
                    z2 = YGIsBaselineLayout;
                    yGCollectFlexItemsRowValues.mainDim += trailingBorder;
                    if (z2) {
                        yGCollectFlexItemsRowValues.crossDim = f10 + f11;
                        return;
                    }
                    return;
                }
                f6 = yGCollectFlexItemsRowValues.remainingFreeSpace;
            }
            f7 = 0.0f;
            yGCollectFlexItemsRowValues.mainDim = leadingBorder + f6;
            yGCollectFlexItemsRowValues.crossDim = RecyclerView.DECELERATION_RATE;
            boolean YGIsBaselineLayout2 = YGIsBaselineLayout(yGNode2);
            i2 = yGCollectFlexItemsRowValues.endOfLineIndex;
            float f102 = 0.0f;
            float f112 = 0.0f;
            i3 = i;
            while (i3 < i2) {
            }
            z2 = YGIsBaselineLayout2;
            yGCollectFlexItemsRowValues.mainDim += trailingBorder;
            if (z2) {
            }
        }
        f7 = f6;
        yGCollectFlexItemsRowValues.mainDim = leadingBorder + f6;
        yGCollectFlexItemsRowValues.crossDim = RecyclerView.DECELERATION_RATE;
        boolean YGIsBaselineLayout22 = YGIsBaselineLayout(yGNode2);
        i2 = yGCollectFlexItemsRowValues.endOfLineIndex;
        float f1022 = 0.0f;
        float f1122 = 0.0f;
        i3 = i;
        while (i3 < i2) {
        }
        z2 = YGIsBaselineLayout22;
        yGCollectFlexItemsRowValues.mainDim += trailingBorder;
        if (z2) {
        }
    }

    public static boolean YGMeasureModeNewMeasureSizeIsStricterAndStillValid(YGMeasureMode yGMeasureMode, float f, YGMeasureMode yGMeasureMode2, float f2, float f3) {
        YGMeasureMode yGMeasureMode3 = YGMeasureMode.YGMeasureModeAtMost;
        if (yGMeasureMode2 != yGMeasureMode3 || yGMeasureMode != yGMeasureMode3 || Float.isNaN(f2) || Float.isNaN(f) || Float.isNaN(f3) || f2 <= f) {
            return false;
        }
        return f3 <= f || YGFloatsEqual(f, f3);
    }

    public static YGAlign YGNodeAlignItem(YGNode yGNode, YGNode yGNode2) {
        yGNode.getClass();
        YGStyle yGStyle = yGNode.style;
        YGStyle yGStyle2 = yGNode2.style;
        YGAlign alignItems = yGStyle2.alignSelf() == YGAlign.YGAlignAuto ? yGStyle.alignItems() : yGStyle2.alignSelf();
        return (alignItems == YGAlign.YGAlignBaseline && YGFlexDirectionIsColumn(yGStyle.flexDirection())) ? YGAlign.YGAlignFlexStart : alignItems;
    }

    public static float YGNodeBoundAxis(YGNode yGNode, YGFlexDirection yGFlexDirection, float f, float f2, float f3) {
        yGNode.getClass();
        return YGFloatMax(m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(yGNode, yGFlexDirection, f, f2), YGNodePaddingAndBorderForAxis(yGNode, yGFlexDirection, f3));
    }

    /* renamed from: YGNodeBoundAxisWithinMinAndMax-6Z_1uto, reason: not valid java name */
    public static float m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(YGNode yGNode, YGFlexDirection yGFlexDirection, float f, float f2) {
        float f3;
        float f4;
        yGNode.getClass();
        YGStyle yGStyle = yGNode.style;
        if (YGFlexDirectionIsColumn(yGFlexDirection)) {
            Values values = yGStyle.minDimensions;
            YGDimension yGDimension = YGDimension.YGDimensionWidth;
            f3 = m1422YGResolveValuenjjmY0(values.get(1), f2);
            f4 = m1422YGResolveValuenjjmY0(yGStyle.maxDimensions.get(1), f2);
        } else if (YGFlexDirectionIsRow(yGFlexDirection)) {
            Values values2 = yGStyle.minDimensions;
            YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
            f3 = m1422YGResolveValuenjjmY0(values2.get(0), f2);
            f4 = m1422YGResolveValuenjjmY0(yGStyle.maxDimensions.get(0), f2);
        } else {
            f3 = Float.NaN;
            f4 = Float.NaN;
        }
        return ((f4 > RecyclerView.DECELERATION_RATE || f4 == RecyclerView.DECELERATION_RATE) && f > f4) ? f4 : ((f3 > RecyclerView.DECELERATION_RATE || f3 == RecyclerView.DECELERATION_RATE) && f < f3) ? f3 : f;
    }

    public static float YGNodeCalculateAvailableInnerDim(YGNode yGNode, YGDimension yGDimension, float f, float f2, float f3) {
        yGNode.getClass();
        YGStyle yGStyle = yGNode.style;
        float f4 = f - f2;
        if (Float.isNaN(f4)) {
            return f4;
        }
        float m1422YGResolveValuenjjmY0 = m1422YGResolveValuenjjmY0(yGStyle.minDimensions.get(yGDimension.ordinal()), f3);
        float f5 = Float.isNaN(m1422YGResolveValuenjjmY0) ? RecyclerView.DECELERATION_RATE : m1422YGResolveValuenjjmY0 - f2;
        float m1422YGResolveValuenjjmY02 = m1422YGResolveValuenjjmY0(yGStyle.maxDimensions.get(yGDimension.ordinal()), f3);
        return YGFloatMax(YGFloatMin(f4, Float.isNaN(m1422YGResolveValuenjjmY02) ? Float.MAX_VALUE : m1422YGResolveValuenjjmY02 - f2), f5);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 float, still in use, count: 2, list:
          (r9v6 float) from 0x0083: INVOKE (r1v6 float), (r9v6 float) STATIC call: app.cash.redwood.yoga.internal.Yoga.YGFloatsEqual(float, float):boolean A[MD:(float, float):boolean (m), WRAPPED]
          (r9v6 float) from 0x008c: PHI (r9v5 float) = (r9v4 float), (r9v6 float) binds: [B:65:0x008a, B:33:0x0087] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean YGNodeCanUseCachedMeasurement(app.cash.redwood.yoga.internal.enums.YGMeasureMode r17, float r18, app.cash.redwood.yoga.internal.enums.YGMeasureMode r19, float r20, app.cash.redwood.yoga.internal.enums.YGMeasureMode r21, float r22, app.cash.redwood.yoga.internal.enums.YGMeasureMode r23, float r24, float r25, float r26, float r27, float r28, app.cash.redwood.yoga.internal.YGConfig r29) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.redwood.yoga.internal.Yoga.YGNodeCanUseCachedMeasurement(app.cash.redwood.yoga.internal.enums.YGMeasureMode, float, app.cash.redwood.yoga.internal.enums.YGMeasureMode, float, app.cash.redwood.yoga.internal.enums.YGMeasureMode, float, app.cash.redwood.yoga.internal.enums.YGMeasureMode, float, float, float, float, float, app.cash.redwood.yoga.internal.YGConfig):boolean");
    }

    public static float YGNodeDimWithMargin(YGNode yGNode, YGFlexDirection yGFlexDirection, float f) {
        YGLayout yGLayout = yGNode.layout;
        yGLayout.getClass();
        return yGNode.m1417getTrailingMarginnjjmY0(yGFlexDirection, f) + yGNode.m1413getLeadingMarginnjjmY0(yGFlexDirection, f) + yGLayout.measuredDimensions[((YGDimension) dim.get(yGFlexDirection.ordinal())).ordinal()];
    }

    public static YGNode YGNodeGetChild(YGNode yGNode, int i) {
        yGNode.getClass();
        if (i < yGNode.children.size()) {
            return yGNode.getChild(i);
        }
        return null;
    }

    public static boolean YGNodeIsStyleDimDefined(YGNode yGNode, YGFlexDirection yGFlexDirection, float f) {
        yGNode.getClass();
        YGValue yGValue = (YGValue) yGNode.resolvedDimensions.get(((YGDimension) dim.get(yGFlexDirection.ordinal())).ordinal());
        boolean isNaN = Float.isNaN(yGValue.value);
        YGUnit yGUnit = yGValue.unit;
        boolean z = yGUnit == YGUnit.YGUnitAuto;
        boolean z2 = yGUnit == YGUnit.YGUnitUndefined;
        boolean z3 = yGUnit == YGUnit.YGUnitPoint;
        boolean z4 = yGValue.value < RecyclerView.DECELERATION_RATE;
        return (z || z2 || (z3 && !isNaN && z4) || ((yGUnit == YGUnit.YGUnitPercent) && !isNaN && (z4 || Float.isNaN(f)))) ? false : true;
    }

    public static float YGNodePaddingAndBorderForAxis(YGNode yGNode, YGFlexDirection yGFlexDirection, float f) {
        yGNode.getClass();
        return yGNode.getTrailingBorder(yGFlexDirection) + yGNode.m1418getTrailingPaddingnjjmY0(yGFlexDirection, f) + yGNode.getLeadingBorder(yGFlexDirection) + yGNode.m1414getLeadingPaddingnjjmY0(yGFlexDirection, f);
    }

    public static void YGNodeSetChildTrailingPosition(YGNode yGNode, YGNode yGNode2, YGFlexDirection yGFlexDirection) {
        yGNode.getClass();
        YGLayout yGLayout = yGNode2.layout;
        yGLayout.getClass();
        float[] fArr = yGLayout.measuredDimensions;
        int ordinal = yGFlexDirection.ordinal();
        List list = dim;
        float f = fArr[((YGDimension) list.get(ordinal)).ordinal()];
        YGLayout yGLayout2 = yGNode.layout;
        yGLayout2.getClass();
        float f2 = yGLayout2.measuredDimensions[((YGDimension) list.get(yGFlexDirection.ordinal())).ordinal()] - f;
        YGLayout yGLayout3 = yGNode2.layout;
        yGLayout3.getClass();
        yGNode2.setLayoutPosition(f2 - yGLayout3.position[((YGEdge) pos.get(yGFlexDirection.ordinal())).ordinal()], ((YGEdge) trailing.get(yGFlexDirection.ordinal())).ordinal());
    }

    public static YGFlexDirection YGResolveFlexDirection(YGFlexDirection yGFlexDirection, YGDirection yGDirection) {
        if (yGDirection == YGDirection.YGDirectionRTL) {
            YGFlexDirection yGFlexDirection2 = YGFlexDirection.YGFlexDirectionRow;
            if (yGFlexDirection == yGFlexDirection2) {
                return YGFlexDirection.YGFlexDirectionRowReverse;
            }
            if (yGFlexDirection == YGFlexDirection.YGFlexDirectionRowReverse) {
                return yGFlexDirection2;
            }
        }
        return yGFlexDirection;
    }

    /* renamed from: YGResolveValue-njjmY-0, reason: not valid java name */
    public static float m1422YGResolveValuenjjmY0(YGValue yGValue, float f) {
        yGValue.getClass();
        YGUnit yGUnit = yGValue.unit;
        float f2 = yGValue.value;
        int ordinal = yGUnit.ordinal();
        if (ordinal == 1) {
            return f2;
        }
        if (ordinal != 2) {
            return Float.NaN;
        }
        return f2 * f * 0.01f;
    }

    public static void YGRoundToPixelGrid(YGNode yGNode, double d, double d2) {
        yGNode.getClass();
        YGLayout yGLayout = yGNode.layout;
        yGLayout.getClass();
        float[] fArr = yGLayout.position;
        YGEdge yGEdge = YGEdge.YGEdgeLeft;
        double d3 = fArr[0];
        YGLayout yGLayout2 = yGNode.layout;
        yGLayout2.getClass();
        double d4 = yGLayout2.position[1];
        YGLayout yGLayout3 = yGNode.layout;
        yGLayout3.getClass();
        float[] fArr2 = yGLayout3.dimensions;
        YGDimension yGDimension = YGDimension.YGDimensionWidth;
        double d5 = fArr2[0];
        YGLayout yGLayout4 = yGNode.layout;
        yGLayout4.getClass();
        double d6 = yGLayout4.dimensions[1];
        double d7 = d + d3;
        double d8 = d2 + d4;
        double d9 = d7 + d5;
        double d10 = d8 + d6;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGNodeType.class);
        LinkedHashMap linkedHashMap = yGNode.flags;
        YGNodeType[] values = YGNodeType.values();
        values.getClass();
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(3, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        boolean z = ((YGNodeType) ((Enum) obj)) == YGNodeType.YGNodeTypeText;
        yGNode.setLayoutPosition(YGRoundValueToPixelGrid(d3, false, z), 0);
        yGNode.setLayoutPosition(YGRoundValueToPixelGrid(d4, false, z), 1);
        boolean z2 = z;
        double d11 = (d5 * 1.0d) % 1.0d;
        boolean z3 = (YGDoubleEqual(d11, 0.0d) || YGDoubleEqual(d11, 1.0d)) ? false : true;
        double d12 = (d6 * 1.0d) % 1.0d;
        boolean z4 = (YGDoubleEqual(d12, 0.0d) || YGDoubleEqual(d12, 1.0d)) ? false : true;
        yGNode.setLayoutDimension(YGRoundValueToPixelGrid(d9, z2 && z3, z2 && !z3) - YGRoundValueToPixelGrid(d7, false, z2), 0);
        yGNode.setLayoutDimension(YGRoundValueToPixelGrid(d10, z2 && z4, z2 && !z4) - YGRoundValueToPixelGrid(d8, false, z2), 1);
        int size = yGNode.children.size();
        for (int i = 0; i < size; i++) {
            YGNode YGNodeGetChild = YGNodeGetChild(yGNode, i);
            YGNodeGetChild.getClass();
            YGRoundToPixelGrid(YGNodeGetChild, d7, d8);
        }
    }

    public static float YGRoundValueToPixelGrid(double d, boolean z, boolean z2) {
        double d2;
        double d3 = d * 1.0d;
        double d4 = d3 % 1.0d;
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        if (!YGDoubleEqual(d4, 0.0d)) {
            if (YGDoubleEqual(d4, 1.0d) || z) {
                d2 = (d3 - d4) + 1.0d;
            } else if (!z2) {
                double d6 = d3 - d4;
                if (!Double.isNaN(d4) && (d4 > 0.5d || YGDoubleEqual(d4, 0.5d))) {
                    d5 = 1.0d;
                }
                d2 = d6 + d5;
            }
            if (Double.isNaN(d2) && !Double.isNaN(1.0d)) {
                return (float) (d2 / 1.0d);
            }
        }
        d2 = d3 - d4;
        return Double.isNaN(d2) ? Float.NaN : Float.NaN;
    }

    public static void YGZeroOutLayoutRecursivly(YGNode yGNode, Object obj) {
        yGNode.getClass();
        yGNode.layout = null;
        yGNode.setLayoutDimension(RecyclerView.DECELERATION_RATE, 0);
        yGNode.setLayoutDimension(RecyclerView.DECELERATION_RATE, 1);
        LinkedHashMap linkedHashMap = yGNode.flags;
        linkedHashMap.getClass();
        linkedHashMap.put(0, Boolean.TRUE);
        WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, INSTANCE, Yoga.class, "YGZeroOutLayoutRecursivly", "YGZeroOutLayoutRecursivly(Lapp/cash/redwood/yoga/internal/YGNode;Ljava/lang/Object;)V", 0, 9);
        Iterator it = yGNode.children.iterator();
        while (it.hasNext()) {
            YGNode yGNode2 = (YGNode) it.next();
            if (yGNode2.owner != yGNode) {
                yGNode.config.getClass();
                YGNode yGNode3 = new YGNode(yGNode2);
                Event.publish(new EmptyEventData());
                yGNode3.owner = null;
                yGNode2.owner = yGNode;
                yGNode2 = yGNode3;
            }
            workApplet$applet$1.invoke(yGNode2, obj);
        }
    }

    public static boolean isUndefined(float f) {
        return Float.isNaN(f);
    }

    public static void updateStyle(YGNode yGNode, KClass kClass, Enum r4, Function1 function1) {
        yGNode.getClass();
        kClass.getClass();
        Yoga$$ExternalSyntheticLambda7 yoga$$ExternalSyntheticLambda7 = new Yoga$$ExternalSyntheticLambda7(0, function1, yGNode, kClass);
        YGStyle yGStyle = yGNode.style;
        if (((Boolean) yoga$$ExternalSyntheticLambda7.invoke(yGStyle, r4)).booleanValue()) {
            yGStyle.getClass();
            YGStyle.BitfieldRef bitfieldRef = (YGStyle.BitfieldRef) function1.invoke(yGStyle);
            bitfieldRef.getClass();
            r4.getClass();
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(r4.getClass());
            LinkedHashMap linkedHashMap = bitfieldRef.style.flags;
            int i = bitfieldRef.offset;
            linkedHashMap.getClass();
            linkedHashMap.put(new StyleEnumFlagsKey(i, orCreateKotlinClass), r4);
            yGNode.markDirtyAndPropogate();
        }
    }

    public static void updateStyleIndexed(YGNode yGNode, Enum r3, float f, Function1 function1) {
        CompactValue compactValue = (Float.isNaN(f) || Float.isInfinite(f)) ? new CompactValue() : Section.Content.of(f, YGUnit.YGUnitPoint);
        Yoga$$ExternalSyntheticLambda7 yoga$$ExternalSyntheticLambda7 = new Yoga$$ExternalSyntheticLambda7(11, function1, yGNode, r3);
        yGNode.getClass();
        YGStyle yGStyle = yGNode.style;
        if (((Boolean) yoga$$ExternalSyntheticLambda7.invoke(yGStyle, compactValue)).booleanValue()) {
            yGStyle.getClass();
            Values values = (Values) function1.invoke(yGNode.style);
            int ordinal = r3.ordinal();
            values.getClass();
            values.values_.set(ordinal, compactValue);
            yGNode.markDirtyAndPropogate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r1.generationCount == r27) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        if (r4.heightMeasureMode == r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean YGLayoutNodeInternal(float f, float f2, float f3, float f4, int i, int i2, Sniffer sniffer, YGConfig yGConfig, YGNode yGNode, YGDirection yGDirection, YGMeasureMode yGMeasureMode, YGMeasureMode yGMeasureMode2, LayoutPassReason layoutPassReason, boolean z) {
        boolean z2;
        float f5;
        YGMeasureMode yGMeasureMode3;
        YGLayout yGLayout;
        char c;
        int i3;
        float f6;
        YGMeasureMode yGMeasureMode4;
        YGCachedMeasurement yGCachedMeasurement;
        char c2;
        int i4;
        ?? r8;
        ?? r14;
        YGCachedMeasurement yGCachedMeasurement2;
        boolean z3;
        YGNode yGNode2;
        yGNode.getClass();
        YGLayout yGLayout2 = yGNode.layout;
        int i5 = i + 1;
        if (yGNode.isDirty()) {
            yGLayout2.getClass();
        }
        yGLayout2.getClass();
        if (yGLayout2.lastOwnerDirection == yGDirection) {
            z2 = false;
            if (z2) {
                yGLayout2.nextCachedMeasurementsIndex = 0;
                YGCachedMeasurement yGCachedMeasurement3 = yGLayout2.cachedLayout;
                yGCachedMeasurement3.availableWidth = -1.0f;
                yGCachedMeasurement3.availableHeight = -1.0f;
                YGMeasureMode yGMeasureMode5 = YGMeasureMode.YGMeasureModeUndefined;
                yGCachedMeasurement3.widthMeasureMode = yGMeasureMode5;
                yGCachedMeasurement3.heightMeasureMode = yGMeasureMode5;
                yGCachedMeasurement3.computedWidth = -1.0f;
                yGCachedMeasurement3.computedHeight = -1.0f;
            }
            if (((Transition.AnonymousClass1) yGNode.measure.b) == null) {
                float m1416getMarginForAxisnjjmY0 = yGNode.m1416getMarginForAxisnjjmY0(YGFlexDirection.YGFlexDirectionRow, f3);
                float m1416getMarginForAxisnjjmY02 = yGNode.m1416getMarginForAxisnjjmY0(YGFlexDirection.YGFlexDirectionColumn, f3);
                YGCachedMeasurement yGCachedMeasurement4 = yGLayout2.cachedLayout;
                ArrayList arrayList = yGLayout2.cachedMeasurements;
                yGLayout = yGLayout2;
                char c3 = 1;
                i3 = 0;
                if (YGNodeCanUseCachedMeasurement(yGMeasureMode, f, yGMeasureMode2, f2, yGCachedMeasurement4.widthMeasureMode, yGCachedMeasurement4.availableWidth, yGCachedMeasurement4.heightMeasureMode, yGCachedMeasurement4.availableHeight, yGCachedMeasurement4.computedWidth, yGCachedMeasurement4.computedHeight, m1416getMarginForAxisnjjmY0, m1416getMarginForAxisnjjmY02, yGConfig)) {
                    f6 = f;
                    f5 = f2;
                    yGMeasureMode4 = yGMeasureMode2;
                    yGCachedMeasurement = yGLayout.cachedLayout;
                    c2 = 1;
                    yGMeasureMode3 = yGMeasureMode;
                } else {
                    int i6 = yGLayout.nextCachedMeasurementsIndex;
                    int i7 = 0;
                    while (i7 < i6) {
                        YGMeasureMode yGMeasureMode6 = ((YGCachedMeasurement) arrayList.get(i7)).widthMeasureMode;
                        float f7 = ((YGCachedMeasurement) arrayList.get(i7)).availableWidth;
                        YGMeasureMode yGMeasureMode7 = ((YGCachedMeasurement) arrayList.get(i7)).heightMeasureMode;
                        float f8 = ((YGCachedMeasurement) arrayList.get(i7)).availableHeight;
                        float f9 = ((YGCachedMeasurement) arrayList.get(i7)).computedWidth;
                        float f10 = ((YGCachedMeasurement) arrayList.get(i7)).computedHeight;
                        f5 = f2;
                        yGMeasureMode4 = yGMeasureMode2;
                        int i8 = i6;
                        char c4 = c3;
                        yGMeasureMode3 = yGMeasureMode;
                        int i9 = i7;
                        f6 = f;
                        if (YGNodeCanUseCachedMeasurement(yGMeasureMode3, f6, yGMeasureMode4, f5, yGMeasureMode6, f7, yGMeasureMode7, f8, f9, f10, m1416getMarginForAxisnjjmY0, m1416getMarginForAxisnjjmY02, yGConfig)) {
                            yGCachedMeasurement = (YGCachedMeasurement) arrayList.get(i9);
                            c2 = c4;
                            break;
                        }
                        i7 = i9 + 1;
                        i6 = i8;
                        c3 = c4;
                    }
                    f6 = f;
                    f5 = f2;
                    yGMeasureMode3 = yGMeasureMode;
                    yGMeasureMode4 = yGMeasureMode2;
                    c = c3;
                    yGCachedMeasurement = null;
                    c2 = c;
                }
            } else {
                f5 = f2;
                yGMeasureMode3 = yGMeasureMode;
                yGLayout = yGLayout2;
                c = 1;
                i3 = 0;
                f6 = f;
                yGMeasureMode4 = yGMeasureMode2;
                if (z) {
                    yGCachedMeasurement = yGLayout.cachedLayout;
                    if (YGFloatsEqual(yGCachedMeasurement.availableWidth, f6) && YGFloatsEqual(yGCachedMeasurement.availableHeight, f5) && yGCachedMeasurement.widthMeasureMode == yGMeasureMode3) {
                        c2 = c;
                    }
                    yGCachedMeasurement = null;
                    c2 = c;
                } else {
                    int i10 = yGLayout.nextCachedMeasurementsIndex;
                    ArrayList arrayList2 = yGLayout.cachedMeasurements;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (YGFloatsEqual(((YGCachedMeasurement) arrayList2.get(i11)).availableWidth, f6) && YGFloatsEqual(((YGCachedMeasurement) arrayList2.get(i11)).availableHeight, f5) && ((YGCachedMeasurement) arrayList2.get(i11)).widthMeasureMode == yGMeasureMode3 && ((YGCachedMeasurement) arrayList2.get(i11)).heightMeasureMode == yGMeasureMode4) {
                            yGCachedMeasurement = (YGCachedMeasurement) arrayList2.get(i11);
                            c2 = c;
                            break;
                        }
                    }
                    yGCachedMeasurement = null;
                    c2 = c;
                }
            }
            if (!z2 || yGCachedMeasurement == null) {
                i4 = i2;
                YGNode yGNode3 = yGNode;
                YGMeasureMode yGMeasureMode8 = yGMeasureMode3;
                YGMeasureMode yGMeasureMode9 = yGMeasureMode4;
                float f11 = f5;
                YGNodeLayoutImpl(f6, f11, f3, f4, i5, i4, sniffer, yGConfig, yGNode3, yGDirection, yGMeasureMode8, yGMeasureMode9, layoutPassReason, z);
                yGLayout.getClass();
                yGLayout.lastOwnerDirection = yGDirection;
                yGCachedMeasurement = yGCachedMeasurement;
                if (yGCachedMeasurement != null) {
                    int i12 = yGLayout.nextCachedMeasurementsIndex;
                    int i13 = i12 + 1;
                    if (i13 > sniffer.peekLength) {
                        sniffer.peekLength = i13;
                    }
                    if (i12 == 8) {
                        yGLayout.nextCachedMeasurementsIndex = i3;
                    }
                    if (z) {
                        yGCachedMeasurement2 = yGLayout.cachedLayout;
                        z3 = true;
                    } else {
                        yGCachedMeasurement2 = (YGCachedMeasurement) yGLayout.cachedMeasurements.get(yGLayout.nextCachedMeasurementsIndex);
                        z3 = true;
                        yGLayout.nextCachedMeasurementsIndex++;
                    }
                    yGCachedMeasurement2.availableWidth = f6;
                    yGCachedMeasurement2.availableHeight = f11;
                    yGCachedMeasurement2.widthMeasureMode = yGMeasureMode8;
                    yGCachedMeasurement2.heightMeasureMode = yGMeasureMode9;
                    float[] fArr = yGLayout.measuredDimensions;
                    YGDimension yGDimension = YGDimension.YGDimensionWidth;
                    r8 = 0;
                    yGCachedMeasurement2.computedWidth = fArr[0];
                    yGCachedMeasurement2.computedHeight = fArr[z3 ? 1 : 0];
                    yGNode2 = yGNode3;
                    r14 = z3;
                } else {
                    r8 = i3;
                    r14 = 1;
                    yGNode2 = yGNode3;
                }
            } else {
                float[] fArr2 = yGLayout.measuredDimensions;
                YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
                fArr2[i3] = yGCachedMeasurement.computedWidth;
                fArr2[c2] = yGCachedMeasurement.computedHeight;
                r8 = i3;
                i4 = i2;
                yGNode2 = yGNode;
                r14 = c2;
            }
            if (z) {
                YGLayout yGLayout3 = yGNode2.layout;
                yGLayout3.getClass();
                float[] fArr3 = yGLayout3.measuredDimensions;
                YGDimension yGDimension3 = YGDimension.YGDimensionWidth;
                yGNode2.setLayoutDimension(fArr3[r8], r8);
                YGLayout yGLayout4 = yGNode2.layout;
                yGLayout4.getClass();
                yGNode2.setLayoutDimension(yGLayout4.measuredDimensions[r14], r14);
                LinkedHashMap linkedHashMap = yGNode2.flags;
                linkedHashMap.getClass();
                linkedHashMap.put(Integer.valueOf((int) r8), Boolean.TRUE);
                yGNode2.setDirty(r8);
            }
            yGLayout.generationCount = i4;
            if (z) {
                LayoutType[] layoutTypeArr = LayoutType.$VALUES;
            } else {
                if (!z2) {
                    YGCachedMeasurement yGCachedMeasurement5 = yGLayout.cachedLayout;
                }
                LayoutType[] layoutTypeArr2 = LayoutType.$VALUES;
            }
            LinkedHashMap linkedHashMap2 = Event.listeners;
            Event.publish(new EmptyEventData());
            if (!z2 || yGCachedMeasurement == null) {
                return r14;
            }
            return false;
        }
        z2 = true;
        if (z2) {
        }
        if (((Transition.AnonymousClass1) yGNode.measure.b) == null) {
        }
        if (z2) {
        }
        i4 = i2;
        YGNode yGNode32 = yGNode;
        YGMeasureMode yGMeasureMode82 = yGMeasureMode3;
        YGMeasureMode yGMeasureMode92 = yGMeasureMode4;
        float f112 = f5;
        YGNodeLayoutImpl(f6, f112, f3, f4, i5, i4, sniffer, yGConfig, yGNode32, yGDirection, yGMeasureMode82, yGMeasureMode92, layoutPassReason, z);
        yGLayout.getClass();
        yGLayout.lastOwnerDirection = yGDirection;
        yGCachedMeasurement = yGCachedMeasurement;
        if (yGCachedMeasurement != null) {
        }
        if (z) {
        }
        yGLayout.generationCount = i4;
        if (z) {
        }
        LinkedHashMap linkedHashMap22 = Event.listeners;
        Event.publish(new EmptyEventData());
        if (z2) {
        }
        return r14;
    }

    public final void YGNodeAbsoluteLayoutChild(YGNode yGNode, YGNode yGNode2, float f, YGMeasureMode yGMeasureMode, float f2, YGDirection yGDirection, YGConfig yGConfig, Sniffer sniffer, int i, int i2) {
        float f3;
        float f4;
        float f5;
        YGStyle yGStyle;
        YGFlexDirection yGFlexDirection;
        YGFlexDirection yGFlexDirection2;
        boolean z;
        boolean z2;
        YGNode yGNode3;
        yGNode.getClass();
        YGStyle yGStyle2 = yGNode.style;
        YGFlexDirection YGResolveFlexDirection = YGResolveFlexDirection(yGStyle2.flexDirection(), yGDirection);
        YGFlexDirection YGResolveFlexDirection2 = YGFlexDirectionIsColumn(YGResolveFlexDirection) ? YGResolveFlexDirection(YGFlexDirection.YGFlexDirectionRow, yGDirection) : YGFlexDirection.YGFlexDirectionColumn;
        boolean YGFlexDirectionIsRow = YGFlexDirectionIsRow(YGResolveFlexDirection);
        YGFlexDirection yGFlexDirection3 = YGFlexDirection.YGFlexDirectionRow;
        float m1416getMarginForAxisnjjmY0 = yGNode2.m1416getMarginForAxisnjjmY0(yGFlexDirection3, f);
        ArrayList arrayList = yGNode2.resolvedDimensions;
        YGFlexDirection yGFlexDirection4 = YGFlexDirection.YGFlexDirectionColumn;
        float m1416getMarginForAxisnjjmY02 = yGNode2.m1416getMarginForAxisnjjmY0(yGFlexDirection4, f);
        if (YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection3, f)) {
            YGDimension yGDimension = YGDimension.YGDimensionWidth;
            f3 = m1422YGResolveValuenjjmY0((YGValue) arrayList.get(0), f) + m1416getMarginForAxisnjjmY0;
        } else if (yGNode2.isLeadingPositionDefined(yGFlexDirection3) && yGNode2.isTrailingPosDefined(yGFlexDirection3)) {
            YGLayout yGLayout = yGNode.layout;
            yGLayout.getClass();
            float[] fArr = yGLayout.measuredDimensions;
            YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
            f3 = YGNodeBoundAxis(yGNode2, yGFlexDirection3, (fArr[0] - (yGNode.getTrailingBorder(yGFlexDirection3) + yGNode.getLeadingBorder(yGFlexDirection3))) - (yGNode2.m1419getTrailingPositionnjjmY0(yGFlexDirection3, f) + yGNode2.m1415getLeadingPositionnjjmY0(yGFlexDirection3, f)), f, f);
        } else {
            f3 = Float.NaN;
        }
        if (YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f2)) {
            YGDimension yGDimension3 = YGDimension.YGDimensionWidth;
            f4 = m1422YGResolveValuenjjmY0((YGValue) arrayList.get(1), f2) + m1416getMarginForAxisnjjmY02;
        } else if (yGNode2.isLeadingPositionDefined(yGFlexDirection4) && yGNode2.isTrailingPosDefined(yGFlexDirection4)) {
            YGLayout yGLayout2 = yGNode.layout;
            yGLayout2.getClass();
            float[] fArr2 = yGLayout2.measuredDimensions;
            YGDimension yGDimension4 = YGDimension.YGDimensionWidth;
            f4 = YGNodeBoundAxis(yGNode2, yGFlexDirection4, (fArr2[1] - (yGNode.getTrailingBorder(yGFlexDirection4) + yGNode.getLeadingBorder(yGFlexDirection4))) - (yGNode2.m1419getTrailingPositionnjjmY0(yGFlexDirection4, f2) + yGNode2.m1415getLeadingPositionnjjmY0(yGFlexDirection4, f2)), f2, f);
        } else {
            f4 = Float.NaN;
        }
        YGStyle yGStyle3 = yGNode2.style;
        if (Float.isNaN(f3) ^ Float.isNaN(f4)) {
            float f6 = yGStyle3.aspectRatio;
            if (!Float.isNaN(f6)) {
                if (Float.isNaN(f3)) {
                    f3 = CameraState$Type$EnumUnboxingLocalUtility.m(f4, m1416getMarginForAxisnjjmY02, f6, m1416getMarginForAxisnjjmY0);
                } else if (Float.isNaN(f4)) {
                    f4 = Recorder$$ExternalSyntheticOutline2.m(f3, m1416getMarginForAxisnjjmY0, f6, m1416getMarginForAxisnjjmY02);
                }
            }
        }
        if (Float.isNaN(f3) || Float.isNaN(f4)) {
            YGMeasureMode yGMeasureMode2 = Float.isNaN(f3) ? YGMeasureMode.YGMeasureModeUndefined : YGMeasureMode.YGMeasureModeExactly;
            YGMeasureMode yGMeasureMode3 = Float.isNaN(f4) ? YGMeasureMode.YGMeasureModeUndefined : YGMeasureMode.YGMeasureModeExactly;
            if (!YGFlexDirectionIsRow && Float.isNaN(f3) && yGMeasureMode != YGMeasureMode.YGMeasureModeUndefined && !Float.isNaN(f) && f > RecyclerView.DECELERATION_RATE) {
                yGMeasureMode2 = YGMeasureMode.YGMeasureModeAtMost;
                f3 = f;
            }
            f5 = f;
            yGStyle = yGStyle2;
            yGFlexDirection = YGResolveFlexDirection;
            yGFlexDirection2 = YGResolveFlexDirection2;
            z = false;
            z2 = true;
            YGLayoutNodeInternal(f3, f4, f3, f4, i, i2, sniffer, yGConfig, yGNode2, yGDirection, yGMeasureMode2, yGMeasureMode3, LayoutPassReason.kAbsMeasureChild, false);
            YGLayout yGLayout3 = yGNode2.layout;
            yGLayout3.getClass();
            float[] fArr3 = yGLayout3.measuredDimensions;
            YGDimension yGDimension5 = YGDimension.YGDimensionWidth;
            f3 = yGNode2.m1416getMarginForAxisnjjmY0(yGFlexDirection3, f5) + fArr3[0];
            YGLayout yGLayout4 = yGNode2.layout;
            yGLayout4.getClass();
            f4 = yGNode2.m1416getMarginForAxisnjjmY0(yGFlexDirection4, f5) + yGLayout4.measuredDimensions[1];
        } else {
            f5 = f;
            yGStyle = yGStyle2;
            yGFlexDirection = YGResolveFlexDirection;
            yGFlexDirection2 = YGResolveFlexDirection2;
            z2 = true;
            z = false;
        }
        float f7 = f4;
        float f8 = f3;
        YGMeasureMode yGMeasureMode4 = YGMeasureMode.YGMeasureModeExactly;
        YGLayoutNodeInternal(f8, f7, f8, f7, i, i2, sniffer, yGConfig, yGNode2, yGDirection, yGMeasureMode4, yGMeasureMode4, LayoutPassReason.kAbsLayout, true);
        YGFlexDirection yGFlexDirection5 = yGFlexDirection;
        boolean isTrailingPosDefined = yGNode2.isTrailingPosDefined(yGFlexDirection5);
        List list = leading;
        List list2 = dim;
        if (!isTrailingPosDefined || yGNode2.isLeadingPositionDefined(yGFlexDirection5)) {
            yGNode3 = yGNode;
            if (!yGNode2.isLeadingPositionDefined(yGFlexDirection5) && yGStyle.justifyContent() == YGJustify.YGJustifyCenter) {
                YGLayout yGLayout5 = yGNode3.layout;
                yGLayout5.getClass();
                float f9 = yGLayout5.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()];
                YGLayout yGLayout6 = yGNode2.layout;
                yGLayout6.getClass();
                yGNode2.setLayoutPosition((f9 - yGLayout6.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()]) / 2.0f, ((YGEdge) list.get(yGFlexDirection5.ordinal())).ordinal());
            } else if (!yGNode2.isLeadingPositionDefined(yGFlexDirection5) && yGStyle.justifyContent() == YGJustify.YGJustifyFlexEnd) {
                YGLayout yGLayout7 = yGNode3.layout;
                yGLayout7.getClass();
                float f10 = yGLayout7.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()];
                YGLayout yGLayout8 = yGNode2.layout;
                yGLayout8.getClass();
                yGNode2.setLayoutPosition(f10 - yGLayout8.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()], ((YGEdge) list.get(yGFlexDirection5.ordinal())).ordinal());
            }
        } else {
            yGNode3 = yGNode;
            YGLayout yGLayout9 = yGNode3.layout;
            yGLayout9.getClass();
            float f11 = yGLayout9.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()];
            YGLayout yGLayout10 = yGNode2.layout;
            yGLayout10.getClass();
            yGNode2.setLayoutPosition((((f11 - yGLayout10.measuredDimensions[((YGDimension) list2.get(yGFlexDirection5.ordinal())).ordinal()]) - yGNode3.getTrailingBorder(yGFlexDirection5)) - yGNode2.m1417getTrailingMarginnjjmY0(yGFlexDirection5, f5)) - yGNode2.m1419getTrailingPositionnjjmY0(yGFlexDirection5, YGFlexDirectionIsRow ? f5 : f2), ((YGEdge) list.get(yGFlexDirection5.ordinal())).ordinal());
        }
        YGFlexDirection yGFlexDirection6 = yGFlexDirection2;
        if (yGNode2.isTrailingPosDefined(yGFlexDirection6) && !yGNode2.isLeadingPositionDefined(yGFlexDirection6)) {
            YGLayout yGLayout11 = yGNode3.layout;
            yGLayout11.getClass();
            float f12 = yGLayout11.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()];
            YGLayout yGLayout12 = yGNode2.layout;
            yGLayout12.getClass();
            float trailingBorder = ((f12 - yGLayout12.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()]) - yGNode3.getTrailingBorder(yGFlexDirection6)) - yGNode2.m1417getTrailingMarginnjjmY0(yGFlexDirection6, f5);
            if (YGFlexDirectionIsRow) {
                f5 = f2;
            }
            yGNode2.setLayoutPosition(trailingBorder - yGNode2.m1419getTrailingPositionnjjmY0(yGFlexDirection6, f5), ((YGEdge) list.get(yGFlexDirection6.ordinal())).ordinal());
            return;
        }
        if (!yGNode2.isLeadingPositionDefined(yGFlexDirection6) && YGNodeAlignItem(yGNode, yGNode2) == YGAlign.YGAlignCenter) {
            YGLayout yGLayout13 = yGNode3.layout;
            yGLayout13.getClass();
            float f13 = yGLayout13.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()];
            YGLayout yGLayout14 = yGNode2.layout;
            yGLayout14.getClass();
            yGNode2.setLayoutPosition((f13 - yGLayout14.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()]) / 2.0f, ((YGEdge) list.get(yGFlexDirection6.ordinal())).ordinal());
            return;
        }
        if (yGNode2.isLeadingPositionDefined(yGFlexDirection6)) {
            return;
        }
        boolean z3 = YGNodeAlignItem(yGNode, yGNode2) == YGAlign.YGAlignFlexEnd ? z2 : z;
        if (yGStyle.flexWrap() == YGWrap.YGWrapWrapReverse) {
            z = z2;
        }
        if (z3 ^ z) {
            YGLayout yGLayout15 = yGNode3.layout;
            yGLayout15.getClass();
            float f14 = yGLayout15.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()];
            YGLayout yGLayout16 = yGNode2.layout;
            yGLayout16.getClass();
            yGNode2.setLayoutPosition(f14 - yGLayout16.measuredDimensions[((YGDimension) list2.get(yGFlexDirection6.ordinal())).ordinal()], ((YGEdge) list.get(yGFlexDirection6.ordinal())).ordinal());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x020a, code lost:
    
        if (r5.overflow() != app.cash.redwood.yoga.internal.enums.YGOverflow.YGOverflowScroll) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021b, code lost:
    
        if (java.lang.Float.isNaN(r24) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0221, code lost:
    
        if (java.lang.Float.isNaN(r7) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0223, code lost:
    
        r14 = app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeAtMost;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0229, code lost:
    
        r3 = r3.aspectRatio;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022f, code lost:
    
        if (java.lang.Float.isNaN(r3) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
    
        if (r6 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0233, code lost:
    
        r8 = app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0235, code lost:
    
        if (r4 != r8) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0237, code lost:
    
        r6 = androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m(r5, r15, r3, r2);
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023d, code lost:
    
        if (r6 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023f, code lost:
    
        r8 = app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        if (r14 != r8) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0243, code lost:
    
        r5 = androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility.m(r6, r2, r3, r15);
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024c, code lost:
    
        if (java.lang.Float.isNaN(r30) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024e, code lost:
    
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0254, code lost:
    
        if (r32 != app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0256, code lost:
    
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0261, code lost:
    
        r2 = YGNodeAlignItem(r0, r1);
        r3 = app.cash.redwood.yoga.internal.enums.YGAlign.YGAlignStretch;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0269, code lost:
    
        if (r2 != r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026d, code lost:
    
        if (r4 == app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026f, code lost:
    
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0273, code lost:
    
        if (r6 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0275, code lost:
    
        if (r20 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0277, code lost:
    
        if (r8 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0279, code lost:
    
        if (r2 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027b, code lost:
    
        r4 = app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0281, code lost:
    
        if (java.lang.Float.isNaN(r3) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0283, code lost:
    
        r6 = (r30 - r21) / r3;
        r5 = r30;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028b, code lost:
    
        r5 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0291, code lost:
    
        if (java.lang.Float.isNaN(r7) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0297, code lost:
    
        if (r33 != app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0299, code lost:
    
        r20 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a4, code lost:
    
        if (YGNodeAlignItem(r0, r1) != r3) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a8, code lost:
    
        if (r14 == app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ad, code lost:
    
        if (r6 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02af, code lost:
    
        if (r12 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b1, code lost:
    
        if (r20 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b3, code lost:
    
        if (r23 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b5, code lost:
    
        r14 = app.cash.redwood.yoga.internal.enums.YGMeasureMode.YGMeasureModeExactly;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bb, code lost:
    
        if (java.lang.Float.isNaN(r3) != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bd, code lost:
    
        r2 = (r7 - r2) * r3;
        r12 = r7;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02cc, code lost:
    
        r3 = 29;
        r6 = new androidx.camera.video.Recorder.AnonymousClass6(java.lang.Float.valueOf(r2), r3);
        r4 = r30;
        YGConstrainMaxSizeForMode(r1, r26, r30, r4, r5, r6);
        r6 = r12;
        r12 = r5;
        r20 = ((java.lang.Float) r6.this$0).floatValue();
        r6 = new androidx.camera.video.Recorder.AnonymousClass6(java.lang.Float.valueOf(r6), r3);
        r5 = r14;
        YGConstrainMaxSizeForMode(r1, r9, r7, r4, r5, r6);
        r0 = r10;
        r20 = r19;
        r19 = null;
        YGLayoutNodeInternal(r20, ((java.lang.Float) r6.this$0).floatValue(), r4, r31, r39, r40, r38, r36, r1, r11, r12, r5, app.cash.redwood.yoga.internal.event.LayoutPassReason.kMeasureChild, false);
        r1 = r1;
        r2 = r1.layout;
        r2.getClass();
        r2 = YGFloatMax(r2.measuredDimensions[((app.cash.redwood.yoga.internal.enums.YGDimension) app.cash.redwood.yoga.internal.Yoga.dim.get(r13.ordinal())).ordinal()], YGNodePaddingAndBorderForAxis(r1, r13, r4));
        r3 = r1.layout;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0347, code lost:
    
        if (r3 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0349, code lost:
    
        r3.computedFlexBasis = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c5, code lost:
    
        r2 = r5;
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c7, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c9, code lost:
    
        r2 = r5;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ab, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x029e, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0272, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x025f, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x025b, code lost:
    
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0227, code lost:
    
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0215, code lost:
    
        if (r5.overflow() != app.cash.redwood.yoga.internal.enums.YGOverflow.YGOverflowScroll) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float YGNodeComputeFlexBasisForChildren(YGNode yGNode, float f, float f2, YGMeasureMode yGMeasureMode, YGMeasureMode yGMeasureMode2, YGDirection yGDirection, YGFlexDirection yGFlexDirection, YGConfig yGConfig, boolean z, Sniffer sniffer, int i, int i2) {
        YGNode yGNode2;
        Iterator it;
        YGFlexDirection yGFlexDirection2;
        YGMeasureMode yGMeasureMode3;
        float f3;
        boolean z2;
        boolean z3;
        YGNode yGNode3;
        float f4;
        Object obj;
        YGNode yGNode4 = yGNode;
        float f5 = f;
        float f6 = f2;
        YGDirection yGDirection2 = yGDirection;
        yGNode4.getClass();
        ArrayList arrayList = yGNode4.children;
        YGMeasureMode yGMeasureMode4 = YGFlexDirectionIsRow(yGFlexDirection) ? yGMeasureMode : yGMeasureMode2;
        YGMeasureMode yGMeasureMode5 = YGMeasureMode.YGMeasureModeExactly;
        Object obj2 = null;
        float f7 = RecyclerView.DECELERATION_RATE;
        if (yGMeasureMode4 == yGMeasureMode5) {
            Iterator it2 = arrayList.iterator();
            YGNode yGNode5 = null;
            while (it2.hasNext()) {
                YGNode yGNode6 = (YGNode) it2.next();
                if (yGNode6.isNodeFlexible()) {
                    if (yGNode5 == null && !YGFloatsEqual(yGNode6.resolveFlexGrow(), RecyclerView.DECELERATION_RATE) && !YGFloatsEqual(yGNode6.resolveFlexShrink(), RecyclerView.DECELERATION_RATE)) {
                        yGNode5 = yGNode6;
                    }
                }
            }
            yGNode2 = yGNode5;
            it = arrayList.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                YGNode yGNode7 = (YGNode) it.next();
                yGNode7.resolveDimension();
                LinkedHashMap linkedHashMap = yGNode7.flags;
                YGStyle yGStyle = yGNode7.style;
                if (yGStyle.display() == YGDisplay.YGDisplayNone) {
                    YGZeroOutLayoutRecursivly(yGNode7, obj2);
                    linkedHashMap.getClass();
                    linkedHashMap.put(0, Boolean.TRUE);
                    yGNode7.setDirty(false);
                } else {
                    if (z) {
                        yGNode7.setPosition(yGNode7.resolveDirection(yGDirection2), YGFlexDirectionIsRow(yGFlexDirection) ? f5 : f6, YGFlexDirectionIsRow(yGFlexDirection) ? f6 : f5, f5);
                    }
                    if (yGStyle.positionType() != YGPositionType.YGPositionTypeAbsolute) {
                        if (yGNode7 == yGNode2) {
                            yGNode7.layout.getClass();
                            YGLayout yGLayout = yGNode7.layout;
                            if (yGLayout != null) {
                                yGLayout.computedFlexBasis = f7;
                            }
                            obj = obj2;
                            f4 = f7;
                            yGNode3 = yGNode2;
                        } else {
                            YGStyle yGStyle2 = yGNode4.style;
                            YGFlexDirection YGResolveFlexDirection = YGResolveFlexDirection(yGStyle2.flexDirection(), yGDirection2);
                            boolean YGFlexDirectionIsRow = YGFlexDirectionIsRow(YGResolveFlexDirection);
                            float f9 = YGFlexDirectionIsRow ? f5 : f6;
                            float f10 = YGFlexDirectionIsRow ? f5 : f6;
                            ArrayList arrayList2 = yGNode7.resolvedDimensions;
                            float f11 = f7;
                            CompactValue compactValue = yGStyle.flexBasis;
                            float f12 = yGStyle.flex;
                            YGValue convertToYgValue = compactValue.convertToYgValue();
                            YGUnit yGUnit = convertToYgValue.unit;
                            if (yGUnit == YGUnit.YGUnitAuto || yGUnit == YGUnit.YGUnitUndefined) {
                                boolean isNaN = Float.isNaN(f12);
                                convertToYgValue = YGValueAuto;
                                if (!isNaN && f12 > f11) {
                                    linkedHashMap.getClass();
                                    Object obj3 = linkedHashMap.get(7);
                                    if (obj3 == null) {
                                        obj3 = Boolean.FALSE;
                                    }
                                    if (!((Boolean) obj3).booleanValue()) {
                                        convertToYgValue = YGValueZero;
                                    }
                                }
                            }
                            float m1422YGResolveValuenjjmY0 = m1422YGResolveValuenjjmY0(convertToYgValue, f10);
                            YGFlexDirection yGFlexDirection3 = YGFlexDirection.YGFlexDirectionRow;
                            boolean YGNodeIsStyleDimDefined = YGNodeIsStyleDimDefined(yGNode7, yGFlexDirection3, f5);
                            YGFlexDirection yGFlexDirection4 = YGFlexDirection.YGFlexDirectionColumn;
                            boolean YGNodeIsStyleDimDefined2 = YGNodeIsStyleDimDefined(yGNode7, yGFlexDirection4, f6);
                            if (Float.isNaN(m1422YGResolveValuenjjmY0) || Float.isNaN(f9)) {
                                if (YGFlexDirectionIsRow && YGNodeIsStyleDimDefined) {
                                    float YGNodePaddingAndBorderForAxis = YGNodePaddingAndBorderForAxis(yGNode7, yGFlexDirection3, f5);
                                    YGDimension yGDimension = YGDimension.YGDimensionWidth;
                                    float m1420YGFloatOptionalMax7X9vPvM = m1420YGFloatOptionalMax7X9vPvM(m1422YGResolveValuenjjmY0((YGValue) arrayList2.get(0), f5), YGNodePaddingAndBorderForAxis);
                                    YGLayout yGLayout2 = yGNode7.layout;
                                    if (yGLayout2 != null) {
                                        yGLayout2.computedFlexBasis = m1420YGFloatOptionalMax7X9vPvM;
                                    }
                                } else if (YGFlexDirectionIsRow || !YGNodeIsStyleDimDefined2) {
                                    YGMeasureMode yGMeasureMode6 = YGMeasureMode.YGMeasureModeUndefined;
                                    float m1416getMarginForAxisnjjmY0 = yGNode7.m1416getMarginForAxisnjjmY0(yGFlexDirection3, f5);
                                    float m1416getMarginForAxisnjjmY02 = yGNode7.m1416getMarginForAxisnjjmY0(yGFlexDirection4, f5);
                                    float f13 = Float.NaN;
                                    if (YGNodeIsStyleDimDefined) {
                                        YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
                                        yGFlexDirection2 = yGFlexDirection3;
                                        f3 = m1422YGResolveValuenjjmY0((YGValue) arrayList2.get(0), f5) + m1416getMarginForAxisnjjmY0;
                                        yGMeasureMode3 = YGMeasureMode.YGMeasureModeExactly;
                                    } else {
                                        yGFlexDirection2 = yGFlexDirection3;
                                        yGMeasureMode3 = yGMeasureMode6;
                                        f3 = Float.NaN;
                                    }
                                    if (YGNodeIsStyleDimDefined2) {
                                        YGDimension yGDimension3 = YGDimension.YGDimensionWidth;
                                        f13 = m1422YGResolveValuenjjmY0((YGValue) arrayList2.get(1), f6) + m1416getMarginForAxisnjjmY02;
                                        z2 = true;
                                        yGMeasureMode6 = YGMeasureMode.YGMeasureModeExactly;
                                    } else {
                                        z2 = true;
                                    }
                                    if (((!YGFlexDirectionIsRow && yGStyle2.overflow() == YGOverflow.YGOverflowScroll) || yGStyle2.overflow() != YGOverflow.YGOverflowScroll) && Float.isNaN(f3) && !Float.isNaN(f)) {
                                        yGMeasureMode3 = YGMeasureMode.YGMeasureModeAtMost;
                                        f3 = f;
                                    }
                                    YGMeasureMode yGMeasureMode7 = yGMeasureMode3;
                                    if (YGFlexDirectionIsRow) {
                                        z3 = YGNodeIsStyleDimDefined;
                                    } else {
                                        z3 = YGNodeIsStyleDimDefined;
                                    }
                                } else {
                                    float YGNodePaddingAndBorderForAxis2 = YGNodePaddingAndBorderForAxis(yGNode7, yGFlexDirection4, f5);
                                    YGDimension yGDimension4 = YGDimension.YGDimensionWidth;
                                    float m1420YGFloatOptionalMax7X9vPvM2 = m1420YGFloatOptionalMax7X9vPvM(m1422YGResolveValuenjjmY0((YGValue) arrayList2.get(1), f6), YGNodePaddingAndBorderForAxis2);
                                    YGLayout yGLayout3 = yGNode7.layout;
                                    if (yGLayout3 != null) {
                                        yGLayout3.computedFlexBasis = m1420YGFloatOptionalMax7X9vPvM2;
                                    }
                                }
                            } else if (yGNode7.config != null) {
                                YGLayout yGLayout4 = yGNode7.layout;
                                yGLayout4.getClass();
                                if (Float.isNaN(yGLayout4.computedFlexBasis)) {
                                    float m1420YGFloatOptionalMax7X9vPvM3 = m1420YGFloatOptionalMax7X9vPvM(m1422YGResolveValuenjjmY0, YGNodePaddingAndBorderForAxis(yGNode7, YGResolveFlexDirection, f5));
                                    YGLayout yGLayout5 = yGNode7.layout;
                                    if (yGLayout5 != null) {
                                        yGLayout5.computedFlexBasis = m1420YGFloatOptionalMax7X9vPvM3;
                                    }
                                }
                            }
                            yGNode3 = yGNode2;
                            f4 = f11;
                            obj = null;
                            yGNode7.layout.getClass();
                        }
                        YGLayout yGLayout6 = yGNode7.layout;
                        yGLayout6.getClass();
                        f8 = yGNode7.m1416getMarginForAxisnjjmY0(yGFlexDirection, f5) + yGLayout6.computedFlexBasis + f8;
                        f6 = f2;
                        yGDirection2 = yGDirection;
                        yGNode2 = yGNode3;
                        obj2 = obj;
                        f7 = f4;
                        yGNode4 = yGNode;
                    }
                }
            }
            return f8;
        }
        yGNode2 = null;
        it = arrayList.iterator();
        float f82 = 0.0f;
        while (it.hasNext()) {
        }
        return f82;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x075b, code lost:
    
        if (isUndefined(r2.position[((app.cash.redwood.yoga.internal.enums.YGEdge) r6.get(r4.ordinal())).ordinal()]) != false) goto L345;
     */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06ce A[ADDED_TO_REGION, LOOP:3: B:283:0x06ce->B:289:0x0995, LOOP_START, PHI: r0 r2 r3 r4 r6 r7 r10 r11 r13 r15 r17 r20 r32 r36 r38 r42 r50 r51
      0x06ce: PHI (r0v73 float) = (r0v69 float), (r0v95 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r2v38 int) = (r2v34 int), (r2v74 int) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r3v65 app.cash.redwood.yoga.internal.enums.YGFlexDirection) = 
      (r3v61 app.cash.redwood.yoga.internal.enums.YGFlexDirection)
      (r3v75 app.cash.redwood.yoga.internal.enums.YGFlexDirection)
     binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r4v53 app.cash.redwood.yoga.internal.enums.YGFlexDirection) = 
      (r4v49 app.cash.redwood.yoga.internal.enums.YGFlexDirection)
      (r4v77 app.cash.redwood.yoga.internal.enums.YGFlexDirection)
     binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r6v24 float) = (r6v22 float), (r6v30 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r7v46 float) = (r7v43 float), (r7v55 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r10v11 float) = (r10v8 float), (r10v21 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r11v14 app.cash.redwood.yoga.internal.enums.YGMeasureMode) = 
      (r11v10 app.cash.redwood.yoga.internal.enums.YGMeasureMode)
      (r11v35 app.cash.redwood.yoga.internal.enums.YGMeasureMode)
     binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r13v7 int) = (r13v3 int), (r13v29 int) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r15v40 float) = (r15v37 float), (r15v57 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r17v23 float) = (r17v21 float), (r17v29 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r20v6 float) = (r20v4 float), (r20v13 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r32v4 boolean) = (r32v2 boolean), (r32v13 boolean) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r36v6 float) = (r36v1 float), (r36v7 float) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r38v4 app.cash.redwood.yoga.internal.enums.YGDirection) = (r38v1 app.cash.redwood.yoga.internal.enums.YGDirection), (r38v5 app.cash.redwood.yoga.internal.enums.YGDirection) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r42v4 int) = (r42v2 int), (r42v5 int) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r50v1 java.util.List) = (r50v0 java.util.List), (r50v2 java.util.List) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]
      0x06ce: PHI (r51v1 java.util.List) = (r51v0 java.util.List), (r51v2 java.util.List) binds: [B:282:0x06cc, B:289:0x0995] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0f2e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void YGNodeLayoutImpl(float f, float f2, float f3, float f4, int i, int i2, Sniffer sniffer, YGConfig yGConfig, YGNode yGNode, YGDirection yGDirection, YGMeasureMode yGMeasureMode, YGMeasureMode yGMeasureMode2, LayoutPassReason layoutPassReason, boolean z) {
        float f5;
        float f6;
        float f7;
        List list;
        List list2;
        YGMeasureMode yGMeasureMode3;
        int i3;
        int i4;
        int i5;
        float f8;
        int i6;
        int i7;
        YGMeasureMode yGMeasureMode4;
        int i8;
        float f9;
        char c;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        YGMeasureMode yGMeasureMode5;
        boolean z2;
        boolean z3;
        float f15;
        float f16;
        float f17;
        float f18;
        YGFlexDirection yGFlexDirection;
        float f19;
        float f20;
        float f21;
        List list3;
        float f22;
        YGMeasureMode yGMeasureMode6;
        int i9;
        YGDirection yGDirection2;
        int i10;
        YGFlexDirection yGFlexDirection2;
        YGFlexDirection yGFlexDirection3;
        float f23;
        float f24;
        List list4;
        YGNode yGNode2;
        float f25;
        float f26;
        float f27;
        boolean z4;
        YGFlexDirection yGFlexDirection4;
        YGNode yGNode3;
        YGMeasureMode yGMeasureMode7;
        int i11;
        float f28;
        int i12;
        int i13;
        char c2;
        char c3;
        char c4;
        int i14;
        int i15;
        float f29 = f4;
        YGNode yGNode4 = yGNode;
        YGAssertWithNode(yGNode4, !Float.isNaN(f) || yGMeasureMode == YGMeasureMode.YGMeasureModeUndefined, "availableWidth is indefinite so widthMeasureMode must be YGMeasureModeUndefined");
        YGAssertWithNode(yGNode4, !Float.isNaN(f2) || yGMeasureMode2 == YGMeasureMode.YGMeasureModeUndefined, "availableHeight is indefinite so heightMeasureMode must be YGMeasureModeUndefined");
        YGDirection resolveDirection = yGNode.resolveDirection(yGDirection);
        YGStyle yGStyle = yGNode4.style;
        YGLayout yGLayout = yGNode4.layout;
        yGLayout.getClass();
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGDirection.class);
        LinkedHashMap linkedHashMap = yGLayout.flags;
        linkedHashMap.getClass();
        linkedHashMap.put(new StyleEnumFlagsKey(0, orCreateKotlinClass), resolveDirection);
        YGFlexDirection yGFlexDirection5 = YGFlexDirection.YGFlexDirectionRow;
        YGFlexDirection YGResolveFlexDirection = YGResolveFlexDirection(yGFlexDirection5, resolveDirection);
        YGFlexDirection yGFlexDirection6 = YGFlexDirection.YGFlexDirectionColumn;
        YGFlexDirection YGResolveFlexDirection2 = YGResolveFlexDirection(yGFlexDirection6, resolveDirection);
        YGDirection yGDirection3 = YGDirection.YGDirectionLTR;
        YGEdge yGEdge = resolveDirection == yGDirection3 ? YGEdge.YGEdgeLeft : YGEdge.YGEdgeRight;
        YGEdge yGEdge2 = resolveDirection == yGDirection3 ? YGEdge.YGEdgeRight : YGEdge.YGEdgeLeft;
        float m1413getLeadingMarginnjjmY0 = yGNode4.m1413getLeadingMarginnjjmY0(YGResolveFlexDirection, f3);
        int ordinal = yGEdge.ordinal();
        YGLayout yGLayout2 = yGNode4.layout;
        yGLayout2.getClass();
        yGLayout2.margin[ordinal] = m1413getLeadingMarginnjjmY0;
        float m1417getTrailingMarginnjjmY0 = yGNode4.m1417getTrailingMarginnjjmY0(YGResolveFlexDirection, f3);
        int ordinal2 = yGEdge2.ordinal();
        YGLayout yGLayout3 = yGNode4.layout;
        yGLayout3.getClass();
        yGLayout3.margin[ordinal2] = m1417getTrailingMarginnjjmY0;
        float m1413getLeadingMarginnjjmY02 = yGNode4.m1413getLeadingMarginnjjmY0(YGResolveFlexDirection2, f3);
        YGLayout yGLayout4 = yGNode4.layout;
        yGLayout4.getClass();
        yGLayout4.margin[1] = m1413getLeadingMarginnjjmY02;
        float m1417getTrailingMarginnjjmY02 = yGNode4.m1417getTrailingMarginnjjmY0(YGResolveFlexDirection2, f3);
        YGLayout yGLayout5 = yGNode4.layout;
        yGLayout5.getClass();
        yGLayout5.margin[3] = m1417getTrailingMarginnjjmY02;
        float f30 = m1413getLeadingMarginnjjmY0 + m1417getTrailingMarginnjjmY0;
        float f31 = m1413getLeadingMarginnjjmY02 + m1417getTrailingMarginnjjmY02;
        float leadingBorder = yGNode4.getLeadingBorder(YGResolveFlexDirection);
        int ordinal3 = yGEdge.ordinal();
        YGLayout yGLayout6 = yGNode4.layout;
        yGLayout6.getClass();
        yGLayout6.border[ordinal3] = leadingBorder;
        float trailingBorder = yGNode4.getTrailingBorder(YGResolveFlexDirection);
        int ordinal4 = yGEdge2.ordinal();
        YGLayout yGLayout7 = yGNode4.layout;
        yGLayout7.getClass();
        yGLayout7.border[ordinal4] = trailingBorder;
        float leadingBorder2 = yGNode4.getLeadingBorder(YGResolveFlexDirection2);
        YGLayout yGLayout8 = yGNode4.layout;
        yGLayout8.getClass();
        yGLayout8.border[1] = leadingBorder2;
        float trailingBorder2 = yGNode4.getTrailingBorder(YGResolveFlexDirection2);
        YGLayout yGLayout9 = yGNode4.layout;
        yGLayout9.getClass();
        yGLayout9.border[3] = trailingBorder2;
        float m1414getLeadingPaddingnjjmY0 = yGNode4.m1414getLeadingPaddingnjjmY0(YGResolveFlexDirection, f3);
        int ordinal5 = yGEdge.ordinal();
        YGLayout yGLayout10 = yGNode4.layout;
        yGLayout10.getClass();
        yGLayout10.padding[ordinal5] = m1414getLeadingPaddingnjjmY0;
        float m1418getTrailingPaddingnjjmY0 = yGNode4.m1418getTrailingPaddingnjjmY0(YGResolveFlexDirection, f3);
        int ordinal6 = yGEdge2.ordinal();
        YGLayout yGLayout11 = yGNode4.layout;
        yGLayout11.getClass();
        yGLayout11.padding[ordinal6] = m1418getTrailingPaddingnjjmY0;
        float m1414getLeadingPaddingnjjmY02 = yGNode4.m1414getLeadingPaddingnjjmY0(YGResolveFlexDirection2, f3);
        YGLayout yGLayout12 = yGNode4.layout;
        yGLayout12.getClass();
        yGLayout12.padding[1] = m1414getLeadingPaddingnjjmY02;
        float m1418getTrailingPaddingnjjmY02 = yGNode4.m1418getTrailingPaddingnjjmY0(YGResolveFlexDirection2, f3);
        YGLayout yGLayout13 = yGNode4.layout;
        yGLayout13.getClass();
        yGLayout13.padding[3] = m1418getTrailingPaddingnjjmY02;
        Transition.AnonymousClass1 anonymousClass1 = (Transition.AnonymousClass1) yGNode4.measure.b;
        float f32 = RecyclerView.DECELERATION_RATE;
        if (anonymousClass1 != null) {
            float f33 = f - f30;
            float f34 = f2 - f31;
            YGAssertWithNode(yGNode4, anonymousClass1 != null, "Expected node to have custom measure function");
            YGMeasureMode yGMeasureMode8 = YGMeasureMode.YGMeasureModeUndefined;
            if (yGMeasureMode == yGMeasureMode8) {
                f33 = Float.NaN;
            }
            if (yGMeasureMode2 == yGMeasureMode8) {
                f34 = Float.NaN;
            }
            YGLayout yGLayout14 = yGNode4.layout;
            yGLayout14.getClass();
            float[] fArr = yGLayout14.padding;
            YGLayout yGLayout15 = yGNode4.layout;
            yGLayout15.getClass();
            float[] fArr2 = yGLayout15.border;
            float f35 = fArr[0] + fArr[2] + fArr2[0] + fArr2[2];
            float f36 = fArr[1] + fArr[3] + fArr2[1] + fArr2[3];
            float YGFloatMax = Float.isNaN(f33) ? f33 : YGFloatMax(RecyclerView.DECELERATION_RATE, f33 - f35);
            float YGFloatMax2 = Float.isNaN(f34) ? f34 : YGFloatMax(RecyclerView.DECELERATION_RATE, f34 - f36);
            YGMeasureMode yGMeasureMode9 = YGMeasureMode.YGMeasureModeExactly;
            if (yGMeasureMode == yGMeasureMode9 && yGMeasureMode2 == yGMeasureMode9) {
                float YGNodeBoundAxis = YGNodeBoundAxis(yGNode4, yGFlexDirection5, f33, f3, f3);
                YGDimension yGDimension = YGDimension.YGDimensionWidth;
                yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis, 0);
                yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode4, yGFlexDirection6, f34, f29, f3), 1);
                return;
            }
            LinkedHashMap linkedHashMap2 = Event.listeners;
            Event.publish(EmptyEventData.INSTANCE);
            LinkedHashMap linkedHashMap3 = yGNode4.flags;
            linkedHashMap3.getClass();
            Object obj = linkedHashMap3.get(4);
            if (obj == null) {
                obj = Boolean.FALSE;
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            n.b bVar = yGNode4.measure;
            if (booleanValue) {
                bVar.getClass();
                throw null;
            }
            ((Transition.AnonymousClass1) bVar.b).getClass();
            new Node(yGNode4);
            int ordinal7 = yGMeasureMode.ordinal();
            if (ordinal7 != 0) {
                i13 = 1;
                if (ordinal7 == 1) {
                    c2 = 1;
                } else {
                    if (ordinal7 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    c2 = 2;
                }
            } else {
                i13 = 1;
                c2 = 0;
            }
            int ordinal8 = yGMeasureMode2.ordinal();
            if (ordinal8 == 0) {
                c3 = 0;
            } else if (ordinal8 == i13) {
                c3 = 1;
            } else {
                if (ordinal8 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                c3 = 2;
            }
            View view = yGNode4.context;
            view.getClass();
            int roundToInt = Math.abs(YGFloatMax) <= Float.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(YGFloatMax) : 0;
            int roundToInt2 = Math.abs(YGFloatMax2) <= Float.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(YGFloatMax2) : 0;
            float f37 = f33;
            if (c2 == 2) {
                i14 = Integer.MIN_VALUE;
                c4 = 1;
            } else {
                c4 = 1;
                if (c2 == 1) {
                    i14 = 1073741824;
                } else {
                    if (c2 != 0) {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    }
                    i14 = 0;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(roundToInt, i14);
            if (c3 == 2) {
                i15 = Integer.MIN_VALUE;
            } else if (c3 == c4) {
                i15 = 1073741824;
            } else {
                if (c3 != 0) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
                i15 = 0;
            }
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(roundToInt2, i15));
            float measuredWidth = view.getMeasuredWidth();
            float measuredHeight = view.getMeasuredHeight();
            ((int[]) sniffer.scratch)[layoutPassReason.ordinal()] = 1;
            Event.publish(new EmptyEventData());
            float YGNodeBoundAxis2 = YGNodeBoundAxis(yGNode4, yGFlexDirection5, (yGMeasureMode == yGMeasureMode8 || yGMeasureMode == YGMeasureMode.YGMeasureModeAtMost) ? measuredWidth + f35 : f37, f3, f3);
            YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
            yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis2, 0);
            if (yGMeasureMode2 == yGMeasureMode8 || yGMeasureMode2 == YGMeasureMode.YGMeasureModeAtMost) {
                f34 = measuredHeight + f36;
            }
            yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode4, yGFlexDirection6, f34, f29, f3), 1);
            return;
        }
        YGNode yGNode5 = null;
        int size = yGNode4.children.size();
        if (size == 0) {
            float f38 = f - f30;
            float f39 = f2 - f31;
            YGLayout yGLayout16 = yGNode4.layout;
            yGLayout16.getClass();
            float[] fArr3 = yGLayout16.padding;
            YGLayout yGLayout17 = yGNode4.layout;
            yGLayout17.getClass();
            float[] fArr4 = yGLayout17.border;
            YGMeasureMode yGMeasureMode10 = YGMeasureMode.YGMeasureModeUndefined;
            if (yGMeasureMode == yGMeasureMode10 || yGMeasureMode == YGMeasureMode.YGMeasureModeAtMost) {
                i11 = 0;
                f28 = fArr3[0] + fArr3[2] + fArr4[0] + fArr4[2];
            } else {
                f28 = f38;
                i11 = 0;
            }
            float YGNodeBoundAxis3 = YGNodeBoundAxis(yGNode4, yGFlexDirection5, f28, f3, f3);
            YGDimension yGDimension3 = YGDimension.YGDimensionWidth;
            yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis3, i11);
            if (yGMeasureMode2 == yGMeasureMode10 || yGMeasureMode2 == YGMeasureMode.YGMeasureModeAtMost) {
                i12 = 1;
                f39 = fArr3[1] + fArr3[3] + fArr4[1] + fArr4[3];
            } else {
                i12 = 1;
            }
            yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode4, yGFlexDirection6, f39, f29, f3), i12);
            return;
        }
        if (!z) {
            float f40 = f - f30;
            float f41 = f2 - f31;
            if ((!Float.isNaN(f40) && yGMeasureMode == YGMeasureMode.YGMeasureModeAtMost && f40 <= RecyclerView.DECELERATION_RATE) || ((!Float.isNaN(f41) && yGMeasureMode2 == YGMeasureMode.YGMeasureModeAtMost && f41 <= RecyclerView.DECELERATION_RATE) || (yGMeasureMode == (yGMeasureMode7 = YGMeasureMode.YGMeasureModeExactly) && yGMeasureMode2 == yGMeasureMode7))) {
                if (Float.isNaN(f40) || (yGMeasureMode == YGMeasureMode.YGMeasureModeAtMost && f40 < RecyclerView.DECELERATION_RATE)) {
                    f40 = 0.0f;
                }
                float YGNodeBoundAxis4 = YGNodeBoundAxis(yGNode4, yGFlexDirection5, f40, f3, f3);
                YGDimension yGDimension4 = YGDimension.YGDimensionWidth;
                yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis4, 0);
                if (!Float.isNaN(f41) && (yGMeasureMode2 != YGMeasureMode.YGMeasureModeAtMost || f41 >= RecyclerView.DECELERATION_RATE)) {
                    f32 = f41;
                }
                yGNode4.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode4, yGFlexDirection6, f32, f29, f3), 1);
                return;
            }
        }
        Iterator it = yGNode4.children.iterator();
        while (it.hasNext()) {
            YGNode yGNode6 = (YGNode) it.next();
            if (yGNode6.owner != yGNode4) {
                yGNode4.config.getClass();
                YGNode yGNode7 = new YGNode(yGNode6);
                LinkedHashMap linkedHashMap4 = Event.listeners;
                Event.publish(new EmptyEventData());
                yGNode3 = yGNode5;
                yGNode7.owner = yGNode3;
                yGNode6.owner = yGNode4;
            } else {
                yGNode3 = yGNode5;
            }
            yGNode5 = yGNode3;
        }
        yGNode4.setLayoutHadOverflow(false);
        YGFlexDirection YGResolveFlexDirection3 = YGResolveFlexDirection(yGStyle.flexDirection(), resolveDirection);
        YGFlexDirection YGResolveFlexDirection4 = YGFlexDirectionIsColumn(YGResolveFlexDirection3) ? YGResolveFlexDirection(YGFlexDirection.YGFlexDirectionRow, resolveDirection) : YGFlexDirection.YGFlexDirectionColumn;
        boolean YGFlexDirectionIsRow = YGFlexDirectionIsRow(YGResolveFlexDirection3);
        boolean z5 = yGStyle.flexWrap() != YGWrap.YGWrapNoWrap;
        float f42 = YGFlexDirectionIsRow ? f3 : f29;
        float f43 = YGFlexDirectionIsRow ? f29 : f3;
        float YGNodePaddingAndBorderForAxis = YGNodePaddingAndBorderForAxis(yGNode4, YGResolveFlexDirection3, f3);
        float leadingBorder3 = yGNode4.getLeadingBorder(YGResolveFlexDirection4) + yGNode4.m1414getLeadingPaddingnjjmY0(YGResolveFlexDirection4, f3);
        float trailingBorder3 = yGNode4.getTrailingBorder(YGResolveFlexDirection4) + yGNode4.m1418getTrailingPaddingnjjmY0(YGResolveFlexDirection4, f3) + leadingBorder3;
        float f44 = 0.0f;
        YGMeasureMode yGMeasureMode11 = YGFlexDirectionIsRow ? yGMeasureMode : yGMeasureMode2;
        YGMeasureMode yGMeasureMode12 = YGFlexDirectionIsRow ? yGMeasureMode2 : yGMeasureMode;
        float f45 = YGFlexDirectionIsRow ? YGNodePaddingAndBorderForAxis : trailingBorder3;
        YGFlexDirection yGFlexDirection7 = YGResolveFlexDirection3;
        float f46 = YGFlexDirectionIsRow ? trailingBorder3 : YGNodePaddingAndBorderForAxis;
        YGFlexDirection yGFlexDirection8 = YGResolveFlexDirection4;
        float f47 = f - f30;
        float YGNodeCalculateAvailableInnerDim = YGNodeCalculateAvailableInnerDim(yGNode4, YGDimension.YGDimensionWidth, f47, f45, f3);
        float f48 = f45;
        float f49 = f2 - f31;
        float YGNodeCalculateAvailableInnerDim2 = YGNodeCalculateAvailableInnerDim(yGNode4, YGDimension.YGDimensionHeight, f49, f46, f29);
        float f50 = YGFlexDirectionIsRow ? YGNodeCalculateAvailableInnerDim : YGNodeCalculateAvailableInnerDim2;
        if (YGFlexDirectionIsRow) {
            f6 = YGNodeCalculateAvailableInnerDim2;
            f5 = f6;
            f7 = YGNodeCalculateAvailableInnerDim;
        } else {
            f5 = YGNodeCalculateAvailableInnerDim2;
            f6 = YGNodeCalculateAvailableInnerDim;
            f7 = f6;
        }
        float f51 = f47;
        float f52 = f49;
        float f53 = f7;
        YGDirection yGDirection4 = resolveDirection;
        boolean z6 = yGMeasureMode11 != YGMeasureMode.YGMeasureModeUndefined && YGNodeComputeFlexBasisForChildren(yGNode4, f7, f5, yGMeasureMode, yGMeasureMode2, resolveDirection, yGFlexDirection7, yGConfig, z, sniffer, i, i2) > f50;
        if (z5 && z6 && yGMeasureMode11 == YGMeasureMode.YGMeasureModeAtMost) {
            yGMeasureMode11 = YGMeasureMode.YGMeasureModeExactly;
        }
        float f54 = f46;
        float f55 = f50;
        float f56 = 0.0f;
        float f57 = 0.0f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            list = dim;
            list2 = pos;
            if (i17 >= size) {
                break;
            }
            YGCollectFlexItemsRowValues yGCollectFlexItemsRowValues = new YGCollectFlexItemsRowValues();
            int i19 = size;
            int size2 = yGNode4.children.size();
            ArrayList arrayList = yGCollectFlexItemsRowValues.relativeChildren;
            arrayList.ensureCapacity(size2);
            float f58 = f6;
            YGFlexDirection YGResolveFlexDirection5 = YGResolveFlexDirection(yGStyle.flexDirection(), yGNode.resolveDirection(yGDirection));
            float f59 = f51;
            int i20 = i16;
            boolean z7 = yGStyle.flexWrap() != YGWrap.YGWrapNoWrap;
            float f60 = f44;
            while (true) {
                if (i20 >= yGNode4.children.size()) {
                    f13 = f43;
                    f14 = YGNodePaddingAndBorderForAxis;
                    break;
                }
                YGNode child = yGNode4.getChild(i20);
                f13 = f43;
                f14 = YGNodePaddingAndBorderForAxis;
                if (child.style.display() == YGDisplay.YGDisplayNone || child.style.positionType() == YGPositionType.YGPositionTypeAbsolute) {
                    yGFlexDirection4 = YGResolveFlexDirection5;
                } else {
                    child.lineIndex = i18;
                    float m1416getMarginForAxisnjjmY0 = child.m1416getMarginForAxisnjjmY0(YGResolveFlexDirection5, f53);
                    YGLayout yGLayout18 = child.layout;
                    yGLayout18.getClass();
                    float m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(child, YGResolveFlexDirection5, yGLayout18.computedFlexBasis, f42);
                    if (f60 + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto + m1416getMarginForAxisnjjmY0 > f55 && z7) {
                        yGFlexDirection4 = YGResolveFlexDirection5;
                        if (yGCollectFlexItemsRowValues.itemsOnLine > 0) {
                            break;
                        }
                    } else {
                        yGFlexDirection4 = YGResolveFlexDirection5;
                    }
                    float f61 = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto + m1416getMarginForAxisnjjmY0;
                    f60 += f61;
                    yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine += f61;
                    yGCollectFlexItemsRowValues.itemsOnLine++;
                    if (child.isNodeFlexible()) {
                        yGCollectFlexItemsRowValues.totalFlexGrowFactors = child.resolveFlexGrow() + yGCollectFlexItemsRowValues.totalFlexGrowFactors;
                        float f62 = yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors;
                        float f63 = -child.resolveFlexShrink();
                        YGLayout yGLayout19 = child.layout;
                        yGLayout19.getClass();
                        yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors = (f63 * yGLayout19.computedFlexBasis) + f62;
                    }
                    arrayList.add(child);
                }
                i20++;
                YGResolveFlexDirection5 = yGFlexDirection4;
                f43 = f13;
                YGNodePaddingAndBorderForAxis = f14;
            }
            float f64 = yGCollectFlexItemsRowValues.totalFlexGrowFactors;
            if (f64 > f44 && f64 < 1.0f) {
                yGCollectFlexItemsRowValues.totalFlexGrowFactors = 1.0f;
            }
            float f65 = yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors;
            if (f65 > f44 && f65 < 1.0f) {
                yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors = 1.0f;
            }
            yGCollectFlexItemsRowValues.endOfLineIndex = i20;
            boolean z8 = !z && yGMeasureMode12 == YGMeasureMode.YGMeasureModeExactly;
            YGMeasureMode yGMeasureMode13 = YGMeasureMode.YGMeasureModeExactly;
            if (yGMeasureMode11 != yGMeasureMode13) {
                Values values = yGStyle.minDimensions;
                Values values2 = yGStyle.maxDimensions;
                YGDimension yGDimension5 = YGDimension.YGDimensionWidth;
                yGMeasureMode5 = yGMeasureMode12;
                float m1422YGResolveValuenjjmY0 = m1422YGResolveValuenjjmY0(values.get(0), f3) - f48;
                float m1422YGResolveValuenjjmY02 = m1422YGResolveValuenjjmY0(values2.get(0), f3) - f48;
                z2 = true;
                float m1422YGResolveValuenjjmY03 = m1422YGResolveValuenjjmY0(values.get(1), f29) - f54;
                float m1422YGResolveValuenjjmY04 = m1422YGResolveValuenjjmY0(values2.get(1), f29) - f54;
                if (YGFlexDirectionIsRow) {
                    m1422YGResolveValuenjjmY03 = m1422YGResolveValuenjjmY0;
                }
                if (!YGFlexDirectionIsRow) {
                    m1422YGResolveValuenjjmY02 = m1422YGResolveValuenjjmY04;
                }
                if (!Float.isNaN(m1422YGResolveValuenjjmY03) && yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine < m1422YGResolveValuenjjmY03) {
                    f55 = m1422YGResolveValuenjjmY03;
                } else if (Float.isNaN(m1422YGResolveValuenjjmY02) || yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine <= m1422YGResolveValuenjjmY02) {
                    yGNode4.config.getClass();
                    if ((Float.isNaN(yGCollectFlexItemsRowValues.totalFlexGrowFactors) && yGCollectFlexItemsRowValues.totalFlexGrowFactors == f44) || (Float.isNaN(yGNode4.resolveFlexGrow()) && yGNode4.resolveFlexGrow() == f44)) {
                        f55 = yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine;
                    }
                    yGNode4.config.getClass();
                    yGNode4.config.getClass();
                    z3 = true;
                    if (!z3 || Float.isNaN(f55)) {
                        f15 = yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine;
                        if (f15 < f44) {
                            yGCollectFlexItemsRowValues.remainingFreeSpace = -f15;
                        }
                    } else {
                        yGCollectFlexItemsRowValues.remainingFreeSpace = f55 - yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine;
                    }
                    if (z8) {
                        f18 = f42;
                        float f66 = f53;
                        float f67 = f5;
                        YGFlexDirection yGFlexDirection9 = yGFlexDirection7;
                        yGFlexDirection = yGFlexDirection8;
                        float f68 = f55;
                        YGResolveFlexibleLength(yGNode4, yGCollectFlexItemsRowValues, yGFlexDirection9, yGFlexDirection, f18, f68, f58, f66, f67, z6, yGMeasureMode5, z, yGConfig, sniffer, i, i2);
                        f19 = f68;
                        f58 = f58;
                        f17 = f67;
                        yGFlexDirection7 = yGFlexDirection9;
                        f16 = f66;
                    } else {
                        float f69 = f5;
                        f16 = f53;
                        f17 = f69;
                        f18 = f42;
                        yGFlexDirection = yGFlexDirection8;
                        f19 = f55;
                    }
                    boolean z9 = z6;
                    YGLayout layout = yGNode4.getLayout();
                    layout.getClass();
                    yGNode4.setLayoutHadOverflow((!layout.hadOverflow() || yGCollectFlexItemsRowValues.remainingFreeSpace < f44) ? z2 : false);
                    float f70 = f52;
                    List list5 = list;
                    YGStyle yGStyle2 = yGStyle;
                    int i21 = i18;
                    int i22 = i20;
                    YGNode yGNode8 = yGNode4;
                    float f71 = f16;
                    YGFlexDirection yGFlexDirection10 = yGFlexDirection;
                    float f72 = f18;
                    YGFlexDirection yGFlexDirection11 = yGFlexDirection7;
                    YGMeasureMode yGMeasureMode14 = yGMeasureMode5;
                    List list6 = list2;
                    float f73 = f13;
                    float f74 = f14;
                    boolean z10 = false;
                    int i23 = i16;
                    f5 = f17;
                    YGMeasureMode yGMeasureMode15 = yGMeasureMode11;
                    f20 = f58;
                    YGJustifyMainAxis(yGNode8, yGCollectFlexItemsRowValues, i23, yGFlexDirection11, yGFlexDirection10, yGMeasureMode15, yGMeasureMode14, f72, f3, f19, f20, f71, z);
                    float f75 = f19;
                    float f76 = f71;
                    YGMeasureMode yGMeasureMode16 = yGMeasureMode14;
                    float YGNodeBoundAxis5 = (yGMeasureMode16 != YGMeasureMode.YGMeasureModeUndefined || yGMeasureMode16 == YGMeasureMode.YGMeasureModeAtMost) ? YGNodeBoundAxis(yGNode8, yGFlexDirection10, yGCollectFlexItemsRowValues.crossDim + trailingBorder3, f73, f3) - trailingBorder3 : f20;
                    if (!z5 && yGMeasureMode16 == yGMeasureMode13) {
                        yGCollectFlexItemsRowValues.crossDim = f20;
                    }
                    yGCollectFlexItemsRowValues.crossDim = YGNodeBoundAxis(yGNode8, yGFlexDirection10, yGCollectFlexItemsRowValues.crossDim + trailingBorder3, f73, f3) - trailingBorder3;
                    if (!z) {
                        while (i23 < i22) {
                            YGNode child2 = yGNode8.getChild(i23);
                            int i24 = i23;
                            if (child2.getStyle().display() == YGDisplay.YGDisplayNone) {
                                f22 = f76;
                                f21 = YGNodeBoundAxis5;
                                f26 = f72;
                                yGMeasureMode6 = yGMeasureMode16;
                                i9 = i22;
                                f25 = f73;
                                yGDirection2 = yGDirection4;
                                i10 = i19;
                                list3 = list6;
                            } else if (child2.getStyle().positionType() == YGPositionType.YGPositionTypeAbsolute) {
                                boolean isLeadingPositionDefined = child2.isLeadingPositionDefined(yGFlexDirection10);
                                if (isLeadingPositionDefined) {
                                    z4 = isLeadingPositionDefined;
                                    f21 = YGNodeBoundAxis5;
                                    list3 = list6;
                                    child2.setLayoutPosition(child2.m1413getLeadingMarginnjjmY0(yGFlexDirection10, f76) + yGNode8.getLeadingBorder(yGFlexDirection10) + child2.m1415getLeadingPositionnjjmY0(yGFlexDirection10, f20), ((YGEdge) list3.get(yGFlexDirection10.ordinal())).ordinal());
                                } else {
                                    z4 = isLeadingPositionDefined;
                                    f21 = YGNodeBoundAxis5;
                                    list3 = list6;
                                }
                                if (z4) {
                                    YGLayout layout2 = child2.getLayout();
                                    layout2.getClass();
                                }
                                child2.setLayoutPosition(child2.m1413getLeadingMarginnjjmY0(yGFlexDirection10, f76) + yGNode8.getLeadingBorder(yGFlexDirection10), ((YGEdge) list3.get(yGFlexDirection10.ordinal())).ordinal());
                                f22 = f76;
                                f26 = f72;
                                yGMeasureMode6 = yGMeasureMode16;
                                i9 = i22;
                                f25 = f73;
                                yGDirection2 = yGDirection4;
                                i10 = i19;
                            } else {
                                f21 = YGNodeBoundAxis5;
                                list3 = list6;
                                YGAlign YGNodeAlignItem = YGNodeAlignItem(yGNode8, child2);
                                YGAlign yGAlign = YGAlign.YGAlignStretch;
                                if (YGNodeAlignItem == yGAlign) {
                                    i9 = i22;
                                    YGUnit unit = child2.marginLeadingValue(yGFlexDirection10).getUnit();
                                    f25 = f73;
                                    YGUnit yGUnit = YGUnit.YGUnitAuto;
                                    if (unit == yGUnit || child2.marginTrailingValue(yGFlexDirection10).getUnit() == yGUnit) {
                                        f22 = f76;
                                        yGFlexDirection3 = yGFlexDirection10;
                                        yGNode2 = child2;
                                        yGMeasureMode6 = yGMeasureMode16;
                                        yGDirection2 = yGDirection4;
                                        i10 = i19;
                                        f24 = f25;
                                        yGFlexDirection2 = yGFlexDirection11;
                                        f23 = f20;
                                        list4 = list5;
                                    } else {
                                        if (YGNodeIsStyleDimDefined(child2, yGFlexDirection10, f20)) {
                                            f22 = f76;
                                            yGFlexDirection3 = yGFlexDirection10;
                                            yGNode2 = child2;
                                            yGMeasureMode6 = yGMeasureMode16;
                                            yGDirection2 = yGDirection4;
                                            i10 = i19;
                                            yGFlexDirection2 = yGFlexDirection11;
                                            f23 = f20;
                                            list4 = list5;
                                            f26 = f72;
                                        } else {
                                            YGLayout layout3 = child2.getLayout();
                                            layout3.getClass();
                                            float f77 = f20;
                                            list4 = list5;
                                            Recorder.AnonymousClass6 anonymousClass6 = new Recorder.AnonymousClass6(Float.valueOf(layout3.getMeasuredDimensions()[((YGDimension) list4.get(yGFlexDirection11.ordinal())).ordinal()]), 29);
                                            YGStyle style = child2.getStyle();
                                            yGMeasureMode6 = yGMeasureMode16;
                                            float f78 = style.aspectRatio;
                                            float f79 = style.aspectRatio;
                                            Recorder.AnonymousClass6 anonymousClass62 = new Recorder.AnonymousClass6(Float.valueOf(Float.isNaN(f78) ? yGCollectFlexItemsRowValues.crossDim : child2.m1416getMarginForAxisnjjmY0(yGFlexDirection10, f76) + (YGFlexDirectionIsRow ? ((Number) anonymousClass6.getArgValue()).floatValue() / f79 : ((Number) anonymousClass6.getArgValue()).floatValue() * f79)), 29);
                                            anonymousClass6.this$0 = Float.valueOf(child2.m1416getMarginForAxisnjjmY0(yGFlexDirection11, f76) + ((Number) anonymousClass6.getArgValue()).floatValue());
                                            YGMeasureMode yGMeasureMode17 = YGMeasureMode.YGMeasureModeExactly;
                                            float f80 = f76;
                                            YGFlexDirection yGFlexDirection12 = yGFlexDirection11;
                                            YGConstrainMaxSizeForMode(child2, yGFlexDirection12, f75, f80, yGMeasureMode17, anonymousClass6);
                                            yGFlexDirection2 = yGFlexDirection12;
                                            float f81 = f75;
                                            YGFlexDirection yGFlexDirection13 = yGFlexDirection10;
                                            YGConstrainMaxSizeForMode(child2, yGFlexDirection13, f77, f80, yGMeasureMode17, anonymousClass62);
                                            yGFlexDirection3 = yGFlexDirection13;
                                            f23 = f77;
                                            float floatValue = ((Number) (YGFlexDirectionIsRow ? anonymousClass6.getArgValue() : anonymousClass62.getArgValue())).floatValue();
                                            float floatValue2 = ((Number) (!YGFlexDirectionIsRow ? anonymousClass6.getArgValue() : anonymousClass62.getArgValue())).floatValue();
                                            boolean z11 = (yGNode8.getStyle().alignContent() == yGAlign || !z5) ? z10 : true;
                                            YGMeasureMode yGMeasureMode18 = (isUndefined(floatValue) || (!YGFlexDirectionIsRow && z11)) ? YGMeasureMode.YGMeasureModeUndefined : yGMeasureMode17;
                                            if (isUndefined(floatValue2) || (YGFlexDirectionIsRow && z11)) {
                                                yGMeasureMode17 = YGMeasureMode.YGMeasureModeUndefined;
                                            }
                                            yGDirection2 = yGDirection4;
                                            i10 = i19;
                                            float f82 = f5;
                                            YGLayoutNodeInternal(floatValue, floatValue2, f80, f82, i, i2, sniffer, yGConfig, child2, yGDirection2, yGMeasureMode18, yGMeasureMode17, LayoutPassReason.kStretch, true);
                                            f22 = f80;
                                            f5 = f82;
                                            yGNode2 = child2;
                                            f26 = f72;
                                            f75 = f81;
                                        }
                                        f27 = leadingBorder3;
                                        YGLayout layout4 = yGNode2.getLayout();
                                        layout4.getClass();
                                        yGNode2.setLayoutPosition(layout4.position[((YGEdge) list3.get(yGFlexDirection3.ordinal())).ordinal()] + f56 + f27, ((YGEdge) list3.get(yGFlexDirection3.ordinal())).ordinal());
                                        i23 = i24 + 1;
                                        i19 = i10;
                                        list6 = list3;
                                        list5 = list4;
                                        yGFlexDirection10 = yGFlexDirection3;
                                        f76 = f22;
                                        yGDirection4 = yGDirection2;
                                        f72 = f26;
                                        i22 = i9;
                                        f73 = f25;
                                        z10 = false;
                                        f44 = RecyclerView.DECELERATION_RATE;
                                        YGNodeBoundAxis5 = f21;
                                        f20 = f23;
                                        yGFlexDirection11 = yGFlexDirection2;
                                        yGMeasureMode16 = yGMeasureMode6;
                                    }
                                } else {
                                    f22 = f76;
                                    yGMeasureMode6 = yGMeasureMode16;
                                    i9 = i22;
                                    yGDirection2 = yGDirection4;
                                    i10 = i19;
                                    yGFlexDirection2 = yGFlexDirection11;
                                    yGFlexDirection3 = yGFlexDirection10;
                                    f23 = f20;
                                    f24 = f73;
                                    list4 = list5;
                                    yGNode2 = child2;
                                }
                                float YGNodeDimWithMargin = f21 - YGNodeDimWithMargin(yGNode2, yGFlexDirection3, f22);
                                f25 = f24;
                                YGUnit unit2 = yGNode2.marginLeadingValue(yGFlexDirection3).getUnit();
                                f26 = f72;
                                YGUnit yGUnit2 = YGUnit.YGUnitAuto;
                                if (unit2 == yGUnit2 && yGNode2.marginTrailingValue(yGFlexDirection3).getUnit() == yGUnit2) {
                                    f27 = YGFloatMax(RecyclerView.DECELERATION_RATE, YGNodeDimWithMargin / 2.0f) + leadingBorder3;
                                } else {
                                    if (yGNode2.marginTrailingValue(yGFlexDirection3).getUnit() != yGUnit2) {
                                        if (yGNode2.marginLeadingValue(yGFlexDirection3).getUnit() == yGUnit2) {
                                            f27 = YGFloatMax(RecyclerView.DECELERATION_RATE, YGNodeDimWithMargin) + leadingBorder3;
                                        } else if (YGNodeAlignItem != YGAlign.YGAlignFlexStart) {
                                            f27 = YGNodeAlignItem == YGAlign.YGAlignCenter ? (YGNodeDimWithMargin / 2.0f) + leadingBorder3 : leadingBorder3 + YGNodeDimWithMargin;
                                        }
                                    }
                                    f27 = leadingBorder3;
                                }
                                YGLayout layout42 = yGNode2.getLayout();
                                layout42.getClass();
                                yGNode2.setLayoutPosition(layout42.position[((YGEdge) list3.get(yGFlexDirection3.ordinal())).ordinal()] + f56 + f27, ((YGEdge) list3.get(yGFlexDirection3.ordinal())).ordinal());
                                i23 = i24 + 1;
                                i19 = i10;
                                list6 = list3;
                                list5 = list4;
                                yGFlexDirection10 = yGFlexDirection3;
                                f76 = f22;
                                yGDirection4 = yGDirection2;
                                f72 = f26;
                                i22 = i9;
                                f73 = f25;
                                z10 = false;
                                f44 = RecyclerView.DECELERATION_RATE;
                                YGNodeBoundAxis5 = f21;
                                f20 = f23;
                                yGFlexDirection11 = yGFlexDirection2;
                                yGMeasureMode16 = yGMeasureMode6;
                            }
                            yGFlexDirection2 = yGFlexDirection11;
                            yGFlexDirection3 = yGFlexDirection10;
                            f23 = f20;
                            list4 = list5;
                            i23 = i24 + 1;
                            i19 = i10;
                            list6 = list3;
                            list5 = list4;
                            yGFlexDirection10 = yGFlexDirection3;
                            f76 = f22;
                            yGDirection4 = yGDirection2;
                            f72 = f26;
                            i22 = i9;
                            f73 = f25;
                            z10 = false;
                            f44 = RecyclerView.DECELERATION_RATE;
                            YGNodeBoundAxis5 = f21;
                            f20 = f23;
                            yGFlexDirection11 = yGFlexDirection2;
                            yGMeasureMode16 = yGMeasureMode6;
                        }
                    }
                    f53 = f76;
                    YGMeasureMode yGMeasureMode19 = yGMeasureMode16;
                    int i25 = i22;
                    float f83 = f73;
                    YGFlexDirection yGFlexDirection14 = yGFlexDirection10;
                    f56 = yGCollectFlexItemsRowValues.crossDim + f56;
                    f57 = YGFloatMax(f57, yGCollectFlexItemsRowValues.mainDim);
                    i18 = i21 + 1;
                    yGNode4 = yGNode8;
                    f6 = f20;
                    yGFlexDirection7 = yGFlexDirection11;
                    yGMeasureMode11 = yGMeasureMode15;
                    yGFlexDirection8 = yGFlexDirection14;
                    f55 = f75;
                    yGDirection4 = yGDirection4;
                    yGStyle = yGStyle2;
                    z6 = z9;
                    f42 = f72;
                    i16 = i25;
                    i17 = i16;
                    f51 = f59;
                    f43 = f83;
                    YGNodePaddingAndBorderForAxis = f74;
                    f52 = f70;
                    f44 = RecyclerView.DECELERATION_RATE;
                    f29 = f4;
                    size = i19;
                    yGMeasureMode12 = yGMeasureMode19;
                } else {
                    f55 = m1422YGResolveValuenjjmY02;
                }
            } else {
                yGMeasureMode5 = yGMeasureMode12;
                z2 = true;
            }
            z3 = false;
            if (z3) {
            }
            f15 = yGCollectFlexItemsRowValues.sizeConsumedOnCurrentLine;
            if (f15 < f44) {
            }
            if (z8) {
            }
            boolean z92 = z6;
            YGLayout layout5 = yGNode4.getLayout();
            layout5.getClass();
            yGNode4.setLayoutHadOverflow((!layout5.hadOverflow() || yGCollectFlexItemsRowValues.remainingFreeSpace < f44) ? z2 : false);
            float f702 = f52;
            List list52 = list;
            YGStyle yGStyle22 = yGStyle;
            int i212 = i18;
            int i222 = i20;
            YGNode yGNode82 = yGNode4;
            float f712 = f16;
            YGFlexDirection yGFlexDirection102 = yGFlexDirection;
            float f722 = f18;
            YGFlexDirection yGFlexDirection112 = yGFlexDirection7;
            YGMeasureMode yGMeasureMode142 = yGMeasureMode5;
            List list62 = list2;
            float f732 = f13;
            float f742 = f14;
            boolean z102 = false;
            int i232 = i16;
            f5 = f17;
            YGMeasureMode yGMeasureMode152 = yGMeasureMode11;
            f20 = f58;
            YGJustifyMainAxis(yGNode82, yGCollectFlexItemsRowValues, i232, yGFlexDirection112, yGFlexDirection102, yGMeasureMode152, yGMeasureMode142, f722, f3, f19, f20, f712, z);
            float f752 = f19;
            float f762 = f712;
            YGMeasureMode yGMeasureMode162 = yGMeasureMode142;
            if (yGMeasureMode162 != YGMeasureMode.YGMeasureModeUndefined) {
            }
            if (!z5) {
                yGCollectFlexItemsRowValues.crossDim = f20;
            }
            yGCollectFlexItemsRowValues.crossDim = YGNodeBoundAxis(yGNode82, yGFlexDirection102, yGCollectFlexItemsRowValues.crossDim + trailingBorder3, f732, f3) - trailingBorder3;
            if (!z) {
            }
            f53 = f762;
            YGMeasureMode yGMeasureMode192 = yGMeasureMode162;
            int i252 = i222;
            float f832 = f732;
            YGFlexDirection yGFlexDirection142 = yGFlexDirection102;
            f56 = yGCollectFlexItemsRowValues.crossDim + f56;
            f57 = YGFloatMax(f57, yGCollectFlexItemsRowValues.mainDim);
            i18 = i212 + 1;
            yGNode4 = yGNode82;
            f6 = f20;
            yGFlexDirection7 = yGFlexDirection112;
            yGMeasureMode11 = yGMeasureMode152;
            yGFlexDirection8 = yGFlexDirection142;
            f55 = f752;
            yGDirection4 = yGDirection4;
            yGStyle = yGStyle22;
            z6 = z92;
            f42 = f722;
            i16 = i252;
            i17 = i16;
            f51 = f59;
            f43 = f832;
            YGNodePaddingAndBorderForAxis = f742;
            f52 = f702;
            f44 = RecyclerView.DECELERATION_RATE;
            f29 = f4;
            size = i19;
            yGMeasureMode12 = yGMeasureMode192;
        }
        float f84 = f52;
        YGMeasureMode yGMeasureMode20 = yGMeasureMode12;
        int i26 = size;
        int i27 = i18;
        float f85 = f6;
        float f86 = f51;
        float f87 = f42;
        float f88 = f43;
        float f89 = YGNodePaddingAndBorderForAxis;
        YGNode yGNode9 = yGNode4;
        YGFlexDirection yGFlexDirection15 = yGFlexDirection7;
        YGFlexDirection yGFlexDirection16 = yGFlexDirection8;
        YGDirection yGDirection5 = yGDirection4;
        float f90 = f57;
        float f91 = 2.0f;
        YGMeasureMode yGMeasureMode21 = yGMeasureMode11;
        if (z && (z5 || YGIsBaselineLayout(yGNode9))) {
            if (!isUndefined(f85)) {
                float f92 = f85 - f56;
                switch (yGNode9.getStyle().alignContent().ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                        break;
                    case 2:
                        i4 = i27;
                        i5 = 1;
                        leadingBorder3 = (f92 / 2.0f) + leadingBorder3;
                        f8 = RecyclerView.DECELERATION_RATE;
                        int i28 = i5;
                        float f93 = leadingBorder3;
                        i6 = 0;
                        int i29 = 0;
                        while (i6 < i4) {
                            float f94 = f8;
                            float f95 = f90;
                            int i30 = i4;
                            int i31 = i29;
                            int i32 = i31;
                            float f96 = RecyclerView.DECELERATION_RATE;
                            float f97 = RecyclerView.DECELERATION_RATE;
                            float f98 = RecyclerView.DECELERATION_RATE;
                            while (true) {
                                i7 = i26;
                                if (i32 < i26) {
                                    YGNode child3 = yGNode9.getChild(i32);
                                    yGMeasureMode4 = yGMeasureMode21;
                                    if (child3.getStyle().display() != YGDisplay.YGDisplayNone && child3.getStyle().positionType() != YGPositionType.YGPositionTypeAbsolute) {
                                        if (child3.lineIndex == i6) {
                                            YGLayout yGLayout20 = child3.layout;
                                            yGLayout20.getClass();
                                            float f99 = yGLayout20.measuredDimensions[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()];
                                            if (((Float.isNaN(f99) || f99 < RecyclerView.DECELERATION_RATE) ? 0 : i28) != 0) {
                                                YGLayout layout6 = child3.getLayout();
                                                layout6.getClass();
                                                f97 = YGFloatMax(f97, child3.m1416getMarginForAxisnjjmY0(yGFlexDirection16, f53) + layout6.getMeasuredDimensions()[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()]);
                                            }
                                            if (YGNodeAlignItem(yGNode9, child3) == YGAlign.YGAlignBaseline) {
                                                float YGBaseline = YGBaseline(child3);
                                                YGFlexDirection yGFlexDirection17 = YGFlexDirection.YGFlexDirectionColumn;
                                                float m1413getLeadingMarginnjjmY03 = child3.m1413getLeadingMarginnjjmY0(yGFlexDirection17, f53) + YGBaseline;
                                                YGLayout layout7 = child3.getLayout();
                                                layout7.getClass();
                                                float[] measuredDimensions = layout7.getMeasuredDimensions();
                                                YGDimension yGDimension6 = YGDimension.YGDimensionWidth;
                                                float m1416getMarginForAxisnjjmY02 = (child3.m1416getMarginForAxisnjjmY0(yGFlexDirection17, f53) + measuredDimensions[i28]) - m1413getLeadingMarginnjjmY03;
                                                f96 = YGFloatMax(f96, m1413getLeadingMarginnjjmY03);
                                                float YGFloatMax3 = YGFloatMax(f98, m1416getMarginForAxisnjjmY02);
                                                f97 = YGFloatMax(f97, f96 + YGFloatMax3);
                                                f98 = YGFloatMax3;
                                            }
                                        }
                                    }
                                    i32++;
                                    yGMeasureMode21 = yGMeasureMode4;
                                    i26 = i7;
                                } else {
                                    yGMeasureMode4 = yGMeasureMode21;
                                }
                            }
                            float f100 = f97 + f94;
                            if (z) {
                                int i33 = i31;
                                while (i33 < i32) {
                                    YGNode child4 = yGNode9.getChild(i33);
                                    if (child4.getStyle().display() == YGDisplay.YGDisplayNone) {
                                        i33++;
                                    } else {
                                        if (child4.getStyle().positionType() != YGPositionType.YGPositionTypeAbsolute) {
                                            switch (YGNodeAlignItem(yGNode9, child4).ordinal()) {
                                                case 0:
                                                case 6:
                                                case 7:
                                                    break;
                                                case 1:
                                                    i8 = i33;
                                                    f9 = f91;
                                                    child4.setLayoutPosition(child4.m1413getLeadingMarginnjjmY0(yGFlexDirection16, f53) + f93, ((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal());
                                                    i33 = i8 + 1;
                                                    f91 = f9;
                                                    i28 = 1;
                                                    break;
                                                case 2:
                                                    i8 = i33;
                                                    YGLayout layout8 = child4.getLayout();
                                                    layout8.getClass();
                                                    f9 = f91;
                                                    child4.setLayoutPosition(Recorder$$ExternalSyntheticOutline2.m(f100, layout8.getMeasuredDimensions()[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()], f9, f93), ((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal());
                                                    i33 = i8 + 1;
                                                    f91 = f9;
                                                    i28 = 1;
                                                    break;
                                                case 3:
                                                    i8 = i33;
                                                    float m1417getTrailingMarginnjjmY03 = (f93 + f100) - child4.m1417getTrailingMarginnjjmY0(yGFlexDirection16, f53);
                                                    YGLayout layout9 = child4.getLayout();
                                                    layout9.getClass();
                                                    child4.setLayoutPosition(m1417getTrailingMarginnjjmY03 - layout9.getMeasuredDimensions()[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()], ((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal());
                                                    f9 = f91;
                                                    i33 = i8 + 1;
                                                    f91 = f9;
                                                    i28 = 1;
                                                    break;
                                                case 4:
                                                    child4.setLayoutPosition(child4.m1413getLeadingMarginnjjmY0(yGFlexDirection16, f53) + f93, ((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal());
                                                    if (YGNodeIsStyleDimDefined(child4, yGFlexDirection16, f85)) {
                                                        i8 = i33;
                                                    } else {
                                                        if (YGFlexDirectionIsRow) {
                                                            YGLayout layout10 = child4.getLayout();
                                                            layout10.getClass();
                                                            float[] measuredDimensions2 = layout10.getMeasuredDimensions();
                                                            YGDimension yGDimension7 = YGDimension.YGDimensionWidth;
                                                            c = 0;
                                                            f10 = child4.m1416getMarginForAxisnjjmY0(yGFlexDirection15, f53) + measuredDimensions2[0];
                                                        } else {
                                                            c = 0;
                                                            f10 = f100;
                                                        }
                                                        if (YGFlexDirectionIsRow) {
                                                            f11 = f100;
                                                        } else {
                                                            YGLayout layout11 = child4.getLayout();
                                                            layout11.getClass();
                                                            float[] measuredDimensions3 = layout11.getMeasuredDimensions();
                                                            YGDimension yGDimension8 = YGDimension.YGDimensionWidth;
                                                            f11 = child4.m1416getMarginForAxisnjjmY0(yGFlexDirection16, f53) + measuredDimensions3[1];
                                                        }
                                                        YGLayout layout12 = child4.getLayout();
                                                        layout12.getClass();
                                                        float[] measuredDimensions4 = layout12.getMeasuredDimensions();
                                                        YGDimension yGDimension9 = YGDimension.YGDimensionWidth;
                                                        i8 = i33;
                                                        if (YGFloatsEqual(f10, measuredDimensions4[c])) {
                                                            YGLayout layout13 = child4.getLayout();
                                                            layout13.getClass();
                                                            if (YGFloatsEqual(f11, layout13.getMeasuredDimensions()[1])) {
                                                            }
                                                        }
                                                        YGMeasureMode yGMeasureMode22 = YGMeasureMode.YGMeasureModeExactly;
                                                        float f101 = f5;
                                                        float f102 = f53;
                                                        YGLayoutNodeInternal(f10, f11, f102, f101, i, i2, sniffer, yGConfig, child4, yGDirection5, yGMeasureMode22, yGMeasureMode22, LayoutPassReason.kMultilineStretch, true);
                                                        f53 = f102;
                                                        f5 = f101;
                                                    }
                                                    f9 = f91;
                                                    i33 = i8 + 1;
                                                    f91 = f9;
                                                    i28 = 1;
                                                    break;
                                                case 5:
                                                    float m1415getLeadingPositionnjjmY0 = child4.m1415getLeadingPositionnjjmY0(YGFlexDirection.YGFlexDirectionColumn, f85) + ((f93 + f96) - YGBaseline(child4));
                                                    YGEdge yGEdge3 = YGEdge.YGEdgeLeft;
                                                    child4.setLayoutPosition(m1415getLeadingPositionnjjmY0, i28);
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        i8 = i33;
                                        f9 = f91;
                                        i33 = i8 + 1;
                                        f91 = f9;
                                        i28 = 1;
                                    }
                                }
                            }
                            f93 += f100;
                            i6++;
                            i29 = i32;
                            f91 = f91;
                            i4 = i30;
                            f90 = f95;
                            yGMeasureMode21 = yGMeasureMode4;
                            i26 = i7;
                            i28 = 1;
                            f8 = f94;
                        }
                        break;
                    case 3:
                        i4 = i27;
                        i5 = 1;
                        leadingBorder3 += f92;
                        f8 = RecyclerView.DECELERATION_RATE;
                        int i282 = i5;
                        float f932 = leadingBorder3;
                        i6 = 0;
                        int i292 = 0;
                        while (i6 < i4) {
                        }
                        break;
                    case 4:
                        i4 = i27;
                        i5 = 1;
                        if (f85 > f56) {
                            f12 = i4;
                            f8 = f92 / f12;
                            int i2822 = i5;
                            float f9322 = leadingBorder3;
                            i6 = 0;
                            int i2922 = 0;
                            while (i6 < i4) {
                            }
                            break;
                        }
                        f8 = RecyclerView.DECELERATION_RATE;
                        int i28222 = i5;
                        float f93222 = leadingBorder3;
                        i6 = 0;
                        int i29222 = 0;
                        while (i6 < i4) {
                        }
                    case 6:
                        i4 = i27;
                        i5 = 1;
                        if (f85 > f56 && i4 > 1) {
                            f12 = i4 - 1;
                            f8 = f92 / f12;
                            int i282222 = i5;
                            float f932222 = leadingBorder3;
                            i6 = 0;
                            int i292222 = 0;
                            while (i6 < i4) {
                            }
                            break;
                        }
                        f8 = RecyclerView.DECELERATION_RATE;
                        int i2822222 = i5;
                        float f9322222 = leadingBorder3;
                        i6 = 0;
                        int i2922222 = 0;
                        while (i6 < i4) {
                        }
                    case 7:
                        if (f85 > f56) {
                            float f103 = (f92 / (i27 * 2)) + leadingBorder3;
                            i4 = i27;
                            i5 = 1;
                            if (i4 > 1) {
                                f8 = f92 / i4;
                                leadingBorder3 = f103;
                                int i28222222 = i5;
                                float f93222222 = leadingBorder3;
                                i6 = 0;
                                int i29222222 = 0;
                                while (i6 < i4) {
                                }
                                break;
                            } else {
                                leadingBorder3 = f103;
                            }
                        } else {
                            i4 = i27;
                            i5 = 1;
                            leadingBorder3 = (f92 / 2.0f) + leadingBorder3;
                        }
                        f8 = RecyclerView.DECELERATION_RATE;
                        int i282222222 = i5;
                        float f932222222 = leadingBorder3;
                        i6 = 0;
                        int i292222222 = 0;
                        while (i6 < i4) {
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            i4 = i27;
            i5 = 1;
            f8 = RecyclerView.DECELERATION_RATE;
            int i2822222222 = i5;
            float f9322222222 = leadingBorder3;
            i6 = 0;
            int i2922222222 = 0;
            while (i6 < i4) {
            }
        }
        int i34 = i26;
        float f104 = f90;
        YGMeasureMode yGMeasureMode23 = yGMeasureMode21;
        float YGNodeBoundAxis6 = YGNodeBoundAxis(yGNode9, YGFlexDirection.YGFlexDirectionRow, f86, f3, f3);
        YGDimension yGDimension10 = YGDimension.YGDimensionWidth;
        yGNode9.setLayoutMeasuredDimension(YGNodeBoundAxis6, 0);
        boolean z12 = true;
        yGNode9.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode9, YGFlexDirection.YGFlexDirectionColumn, f84, f4, f3), 1);
        YGMeasureMode yGMeasureMode24 = YGMeasureMode.YGMeasureModeUndefined;
        if (yGMeasureMode23 != yGMeasureMode24) {
            YGOverflow overflow = yGNode9.getStyle().overflow();
            YGOverflow yGOverflow = YGOverflow.YGOverflowScroll;
            if (overflow == yGOverflow || yGMeasureMode23 != YGMeasureMode.YGMeasureModeAtMost) {
                if (yGMeasureMode23 == YGMeasureMode.YGMeasureModeAtMost && yGNode9.getStyle().overflow() == yGOverflow) {
                    yGNode9.setLayoutMeasuredDimension(YGFloatMax(YGFloatMin(f55 + f89, m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(yGNode9, yGFlexDirection15, f104, f87)), f89), ((YGDimension) list.get(yGFlexDirection15.ordinal())).ordinal());
                }
                yGMeasureMode3 = yGMeasureMode20;
                if (yGMeasureMode3 != yGMeasureMode24) {
                    YGOverflow overflow2 = yGNode9.getStyle().overflow();
                    YGOverflow yGOverflow2 = YGOverflow.YGOverflowScroll;
                    if (overflow2 == yGOverflow2 || yGMeasureMode3 != YGMeasureMode.YGMeasureModeAtMost) {
                        if (yGMeasureMode3 == YGMeasureMode.YGMeasureModeAtMost && yGNode9.getStyle().overflow() == yGOverflow2) {
                            yGNode9.setLayoutMeasuredDimension(YGFloatMax(YGFloatMin(f85 + trailingBorder3, m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(yGNode9, yGFlexDirection16, f56 + trailingBorder3, f88)), trailingBorder3), ((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal());
                        }
                        if (z || yGNode9.getStyle().flexWrap() != YGWrap.YGWrapWrapReverse) {
                            i3 = i34;
                        } else {
                            i3 = i34;
                            for (int i35 = 0; i35 < i3; i35++) {
                                YGNode YGNodeGetChild = YGNodeGetChild(yGNode9, i35);
                                YGNodeGetChild.getClass();
                                if (YGNodeGetChild.getStyle().positionType() != YGPositionType.YGPositionTypeAbsolute) {
                                    YGLayout layout14 = yGNode9.getLayout();
                                    layout14.getClass();
                                    float f105 = layout14.getMeasuredDimensions()[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()];
                                    YGLayout layout15 = YGNodeGetChild.getLayout();
                                    layout15.getClass();
                                    float f106 = f105 - layout15.position[((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal()];
                                    YGLayout layout16 = YGNodeGetChild.getLayout();
                                    layout16.getClass();
                                    YGNodeGetChild.setLayoutPosition(f106 - layout16.getMeasuredDimensions()[((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal()], ((YGEdge) list2.get(yGFlexDirection16.ordinal())).ordinal());
                                }
                            }
                        }
                        if (z) {
                            Iterator it2 = yGNode9.children.iterator();
                            while (it2.hasNext()) {
                                YGNode yGNode10 = (YGNode) it2.next();
                                if (yGNode10.getStyle().display() == YGDisplay.YGDisplayNone || yGNode10.getStyle().positionType() != YGPositionType.YGPositionTypeAbsolute) {
                                    i3 = i3;
                                    f53 = f53;
                                    f5 = f5;
                                    yGMeasureMode3 = yGMeasureMode3;
                                    z12 = z12;
                                } else {
                                    YGMeasureMode yGMeasureMode25 = yGMeasureMode3;
                                    if (YGFlexDirectionIsRow) {
                                        yGMeasureMode3 = yGMeasureMode23;
                                    }
                                    float f107 = f53;
                                    float f108 = f5;
                                    YGDirection yGDirection6 = yGDirection5;
                                    YGNodeAbsoluteLayoutChild(yGNode9, yGNode10, f107, yGMeasureMode3, f108, yGDirection6, yGConfig, sniffer, i, i2);
                                    f5 = f108;
                                    yGDirection5 = yGDirection6;
                                    i3 = i3;
                                    yGMeasureMode3 = yGMeasureMode25;
                                    z12 = z12;
                                    f53 = f107;
                                }
                            }
                            int i36 = i3;
                            boolean z13 = z12;
                            YGFlexDirection yGFlexDirection18 = YGFlexDirection.YGFlexDirectionRowReverse;
                            boolean z14 = (yGFlexDirection15 == yGFlexDirection18 || yGFlexDirection15 == YGFlexDirection.YGFlexDirectionColumnReverse) ? z13 : false;
                            if (yGFlexDirection16 != yGFlexDirection18 && yGFlexDirection16 != YGFlexDirection.YGFlexDirectionColumnReverse) {
                                z13 = false;
                            }
                            if (z14 || z13) {
                                for (int i37 = 0; i37 < i36; i37++) {
                                    YGNode child5 = yGNode9.getChild(i37);
                                    if (child5.getStyle().display() != YGDisplay.YGDisplayNone) {
                                        if (z14) {
                                            YGNodeSetChildTrailingPosition(yGNode9, child5, yGFlexDirection15);
                                        }
                                        if (z13) {
                                            YGNodeSetChildTrailingPosition(yGNode9, child5, yGFlexDirection16);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                yGNode9.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode9, yGFlexDirection16, f56 + trailingBorder3, f88, f3), ((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal());
                if (z) {
                }
                i3 = i34;
                if (z) {
                }
            }
        }
        yGNode9.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode9, yGFlexDirection15, f104, f87, f3), ((YGDimension) list.get(yGFlexDirection15.ordinal())).ordinal());
        yGMeasureMode3 = yGMeasureMode20;
        if (yGMeasureMode3 != yGMeasureMode24) {
        }
        yGNode9.setLayoutMeasuredDimension(YGNodeBoundAxis(yGNode9, yGFlexDirection16, f56 + trailingBorder3, f88, f3), ((YGDimension) list.get(yGFlexDirection16.ordinal())).ordinal());
        if (z) {
        }
        i3 = i34;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void YGResolveFlexibleLength(YGNode yGNode, YGCollectFlexItemsRowValues yGCollectFlexItemsRowValues, YGFlexDirection yGFlexDirection, YGFlexDirection yGFlexDirection2, float f, float f2, float f3, float f4, float f5, boolean z, YGMeasureMode yGMeasureMode, boolean z2, YGConfig yGConfig, Sniffer sniffer, int i, int i2) {
        float f6;
        float YGNodeBoundAxis;
        Recorder.AnonymousClass6 anonymousClass6;
        float f7;
        YGMeasureMode yGMeasureMode2;
        YGMeasureMode yGMeasureMode3;
        YGNode yGNode2;
        YGMeasureMode yGMeasureMode4;
        YGFlexDirection yGFlexDirection3;
        Recorder.AnonymousClass6 anonymousClass62;
        YGFlexDirection yGFlexDirection4;
        float f8;
        YGMeasureMode yGMeasureMode5;
        YGMeasureMode yGMeasureMode6;
        boolean z3;
        YGUnit yGUnit;
        YGUnit yGUnit2;
        float f9;
        ArrayList arrayList;
        YGFlexDirection yGFlexDirection5 = yGFlexDirection;
        YGFlexDirection yGFlexDirection6 = yGFlexDirection2;
        float f10 = f2;
        float f11 = f3;
        float f12 = f4;
        YGMeasureMode yGMeasureMode7 = yGMeasureMode;
        yGNode.getClass();
        float f13 = yGCollectFlexItemsRowValues.remainingFreeSpace;
        ArrayList arrayList2 = yGCollectFlexItemsRowValues.relativeChildren;
        Iterator it = arrayList2.iterator();
        it.getClass();
        float f14 = 0.0f;
        while (it.hasNext()) {
            YGNode yGNode3 = (YGNode) it.next();
            YGLayout yGLayout = yGNode3.layout;
            yGLayout.getClass();
            float m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(yGNode3, yGFlexDirection5, yGLayout.computedFlexBasis, f);
            float f15 = yGCollectFlexItemsRowValues.remainingFreeSpace;
            if (f15 < RecyclerView.DECELERATION_RATE) {
                float f16 = (-yGNode3.resolveFlexShrink()) * m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto;
                if (Float.isNaN(f16) || f16 == RecyclerView.DECELERATION_RATE) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    float f17 = ((yGCollectFlexItemsRowValues.remainingFreeSpace / yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors) * f16) + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto;
                    float YGNodeBoundAxis2 = YGNodeBoundAxis(yGNode3, yGFlexDirection5, f17, f10, f12);
                    if (!Float.isNaN(f17) && !Float.isNaN(YGNodeBoundAxis2) && f17 != YGNodeBoundAxis2) {
                        f14 += YGNodeBoundAxis2 - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto;
                        float f18 = yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors;
                        float f19 = -yGNode3.resolveFlexShrink();
                        YGLayout yGLayout2 = yGNode3.layout;
                        yGLayout2.getClass();
                        yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors = f18 - (f19 * yGLayout2.computedFlexBasis);
                    }
                }
            } else {
                arrayList = arrayList2;
                if (!Float.isNaN(f15) && yGCollectFlexItemsRowValues.remainingFreeSpace > RecyclerView.DECELERATION_RATE) {
                    float resolveFlexGrow = yGNode3.resolveFlexGrow();
                    if (!Float.isNaN(resolveFlexGrow) && resolveFlexGrow != RecyclerView.DECELERATION_RATE) {
                        float f20 = ((yGCollectFlexItemsRowValues.remainingFreeSpace / yGCollectFlexItemsRowValues.totalFlexGrowFactors) * resolveFlexGrow) + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto;
                        float YGNodeBoundAxis3 = YGNodeBoundAxis(yGNode3, yGFlexDirection5, f20, f10, f12);
                        if (!Float.isNaN(f20) && !Float.isNaN(YGNodeBoundAxis3) && f20 != YGNodeBoundAxis3) {
                            f14 += YGNodeBoundAxis3 - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto;
                            yGCollectFlexItemsRowValues.totalFlexGrowFactors -= resolveFlexGrow;
                        }
                    }
                }
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        yGCollectFlexItemsRowValues.remainingFreeSpace -= f14;
        boolean YGFlexDirectionIsRow = YGFlexDirectionIsRow(yGFlexDirection5);
        boolean z4 = yGNode.style.flexWrap() != YGWrap.YGWrapNoWrap;
        Iterator it2 = arrayList3.iterator();
        it2.getClass();
        float f21 = 0.0f;
        while (it2.hasNext()) {
            YGNode yGNode4 = (YGNode) it2.next();
            YGLayout yGLayout3 = yGNode4.layout;
            ArrayList arrayList4 = yGNode4.resolvedDimensions;
            yGLayout3.getClass();
            float m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2 = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto(yGNode4, yGFlexDirection5, yGLayout3.computedFlexBasis, f);
            if (Float.isNaN(yGCollectFlexItemsRowValues.remainingFreeSpace) || yGCollectFlexItemsRowValues.remainingFreeSpace >= RecyclerView.DECELERATION_RATE) {
                f6 = f21;
                if (!Float.isNaN(yGCollectFlexItemsRowValues.remainingFreeSpace) && yGCollectFlexItemsRowValues.remainingFreeSpace > RecyclerView.DECELERATION_RATE) {
                    float resolveFlexGrow2 = yGNode4.resolveFlexGrow();
                    if (!Float.isNaN(resolveFlexGrow2) && resolveFlexGrow2 != RecyclerView.DECELERATION_RATE) {
                        YGNodeBoundAxis = YGNodeBoundAxis(yGNode4, yGFlexDirection5, ((yGCollectFlexItemsRowValues.remainingFreeSpace / yGCollectFlexItemsRowValues.totalFlexGrowFactors) * resolveFlexGrow2) + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2, f10, f12);
                        float f22 = (YGNodeBoundAxis - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2) + f6;
                        float m1416getMarginForAxisnjjmY0 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection5, f12);
                        float m1416getMarginForAxisnjjmY02 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection6, f12);
                        int i3 = 29;
                        anonymousClass6 = new Recorder.AnonymousClass6(Float.valueOf(RecyclerView.DECELERATION_RATE), i3);
                        Recorder.AnonymousClass6 anonymousClass63 = new Recorder.AnonymousClass6(Float.valueOf(YGNodeBoundAxis + m1416getMarginForAxisnjjmY0), i3);
                        YGMeasureMode yGMeasureMode8 = YGMeasureMode.YGMeasureModeExactly;
                        f7 = yGNode4.style.aspectRatio;
                        if (Float.isNaN(f7)) {
                            Float f23 = (Float) anonymousClass63.this$0;
                            float floatValue = YGFlexDirectionIsRow ? (f23.floatValue() - m1416getMarginForAxisnjjmY0) / f7 : (f23.floatValue() - m1416getMarginForAxisnjjmY0) * f7;
                            anonymousClass6.this$0 = Float.valueOf(floatValue);
                            anonymousClass6.this$0 = Float.valueOf(floatValue + m1416getMarginForAxisnjjmY02);
                            yGFlexDirection3 = yGFlexDirection;
                        } else {
                            if (!Float.isNaN(f11) && !YGNodeIsStyleDimDefined(yGNode4, yGFlexDirection6, f11) && yGMeasureMode7 == yGMeasureMode8 && ((!z4 || !z) && YGNodeAlignItem(yGNode, yGNode4) == YGAlign.YGAlignStretch)) {
                                YGUnit yGUnit3 = yGNode4.marginLeadingValue(yGFlexDirection6).unit;
                                YGUnit yGUnit4 = YGUnit.YGUnitAuto;
                                if (yGUnit3 != yGUnit4 && yGNode4.marginTrailingValue(yGFlexDirection6).unit != yGUnit4) {
                                    anonymousClass6.this$0 = Float.valueOf(f11);
                                    yGFlexDirection3 = yGFlexDirection;
                                    f10 = f2;
                                }
                            }
                            if (YGNodeIsStyleDimDefined(yGNode4, yGFlexDirection6, f11)) {
                                int ordinal = yGFlexDirection6.ordinal();
                                List list = dim;
                                anonymousClass6.this$0 = Float.valueOf(m1422YGResolveValuenjjmY0((YGValue) arrayList4.get(((YGDimension) list.get(ordinal)).ordinal()), f11) + m1416getMarginForAxisnjjmY02);
                                yGMeasureMode2 = (Float.isNaN(((Float) anonymousClass6.this$0).floatValue()) || (((YGValue) arrayList4.get(((YGDimension) list.get(yGFlexDirection6.ordinal())).ordinal())).unit == YGUnit.YGUnitPercent && yGMeasureMode7 != yGMeasureMode8)) ? YGMeasureMode.YGMeasureModeUndefined : yGMeasureMode8;
                            } else {
                                anonymousClass6.this$0 = Float.valueOf(f11);
                                yGMeasureMode2 = Float.isNaN(f11) ? YGMeasureMode.YGMeasureModeUndefined : YGMeasureMode.YGMeasureModeAtMost;
                            }
                            yGMeasureMode3 = yGMeasureMode8;
                            yGNode2 = yGNode4;
                            f10 = f2;
                            yGMeasureMode4 = yGMeasureMode2;
                            yGFlexDirection3 = yGFlexDirection;
                            YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection3, f10, f12, yGMeasureMode3, anonymousClass63);
                            anonymousClass62 = anonymousClass63;
                            yGFlexDirection4 = yGFlexDirection6;
                            f8 = f11;
                            yGMeasureMode5 = yGMeasureMode3;
                            yGMeasureMode6 = yGMeasureMode4;
                            YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection4, f8, f12, yGMeasureMode6, anonymousClass6);
                            if (!YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f8) && YGNodeAlignItem(yGNode, yGNode2) == YGAlign.YGAlignStretch) {
                                yGUnit = yGNode2.marginLeadingValue(yGFlexDirection4).unit;
                                yGUnit2 = YGUnit.YGUnitAuto;
                                if (yGUnit != yGUnit2 && yGNode2.marginTrailingValue(yGFlexDirection4).unit != yGUnit2) {
                                    z3 = true;
                                    Recorder.AnonymousClass6 anonymousClass64 = YGFlexDirectionIsRow ? anonymousClass62 : anonymousClass6;
                                    if (YGFlexDirectionIsRow) {
                                        anonymousClass62 = anonymousClass6;
                                    }
                                    YGMeasureMode yGMeasureMode9 = YGFlexDirectionIsRow ? yGMeasureMode5 : yGMeasureMode6;
                                    YGMeasureMode yGMeasureMode10 = !YGFlexDirectionIsRow ? yGMeasureMode5 : yGMeasureMode6;
                                    boolean z5 = (z2 || z3) ? false : true;
                                    float floatValue2 = ((Float) anonymousClass64.this$0).floatValue();
                                    float floatValue3 = ((Float) anonymousClass62.this$0).floatValue();
                                    YGLayout yGLayout4 = yGNode.layout;
                                    yGLayout4.getClass();
                                    YGNode yGNode5 = yGNode2;
                                    float f24 = f13;
                                    YGLayoutNodeInternal(floatValue2, floatValue3, f4, f5, i, i2, sniffer, yGConfig, yGNode5, yGLayout4.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                                    YGLayout yGLayout5 = yGNode.layout;
                                    yGLayout5.getClass();
                                    boolean hadOverflow = yGLayout5.hadOverflow();
                                    YGLayout yGLayout6 = yGNode5.layout;
                                    yGLayout6.getClass();
                                    yGNode.setLayoutHadOverflow(hadOverflow | yGLayout6.hadOverflow());
                                    f12 = f4;
                                    yGMeasureMode7 = yGMeasureMode;
                                    f13 = f24;
                                    yGFlexDirection6 = yGFlexDirection4;
                                    f11 = f8;
                                    f21 = f22;
                                    yGFlexDirection5 = yGFlexDirection;
                                    f10 = f2;
                                }
                            }
                            z3 = false;
                            if (YGFlexDirectionIsRow) {
                            }
                            if (YGFlexDirectionIsRow) {
                            }
                            if (YGFlexDirectionIsRow) {
                            }
                            if (!YGFlexDirectionIsRow) {
                            }
                            if (z2) {
                            }
                            float floatValue22 = ((Float) anonymousClass64.this$0).floatValue();
                            float floatValue32 = ((Float) anonymousClass62.this$0).floatValue();
                            YGLayout yGLayout42 = yGNode.layout;
                            yGLayout42.getClass();
                            YGNode yGNode52 = yGNode2;
                            float f242 = f13;
                            YGLayoutNodeInternal(floatValue22, floatValue32, f4, f5, i, i2, sniffer, yGConfig, yGNode52, yGLayout42.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                            YGLayout yGLayout52 = yGNode.layout;
                            yGLayout52.getClass();
                            boolean hadOverflow2 = yGLayout52.hadOverflow();
                            YGLayout yGLayout62 = yGNode52.layout;
                            yGLayout62.getClass();
                            yGNode.setLayoutHadOverflow(hadOverflow2 | yGLayout62.hadOverflow());
                            f12 = f4;
                            yGMeasureMode7 = yGMeasureMode;
                            f13 = f242;
                            yGFlexDirection6 = yGFlexDirection4;
                            f11 = f8;
                            f21 = f22;
                            yGFlexDirection5 = yGFlexDirection;
                            f10 = f2;
                        }
                        yGMeasureMode4 = yGMeasureMode8;
                        yGNode2 = yGNode4;
                        yGMeasureMode3 = yGMeasureMode4;
                        YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection3, f10, f12, yGMeasureMode3, anonymousClass63);
                        anonymousClass62 = anonymousClass63;
                        yGFlexDirection4 = yGFlexDirection6;
                        f8 = f11;
                        yGMeasureMode5 = yGMeasureMode3;
                        yGMeasureMode6 = yGMeasureMode4;
                        YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection4, f8, f12, yGMeasureMode6, anonymousClass6);
                        if (!YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f8)) {
                            yGUnit = yGNode2.marginLeadingValue(yGFlexDirection4).unit;
                            yGUnit2 = YGUnit.YGUnitAuto;
                            if (yGUnit != yGUnit2) {
                                z3 = true;
                                if (YGFlexDirectionIsRow) {
                                }
                                if (YGFlexDirectionIsRow) {
                                }
                                if (YGFlexDirectionIsRow) {
                                }
                                if (!YGFlexDirectionIsRow) {
                                }
                                if (z2) {
                                }
                                float floatValue222 = ((Float) anonymousClass64.this$0).floatValue();
                                float floatValue322 = ((Float) anonymousClass62.this$0).floatValue();
                                YGLayout yGLayout422 = yGNode.layout;
                                yGLayout422.getClass();
                                YGNode yGNode522 = yGNode2;
                                float f2422 = f13;
                                YGLayoutNodeInternal(floatValue222, floatValue322, f4, f5, i, i2, sniffer, yGConfig, yGNode522, yGLayout422.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                                YGLayout yGLayout522 = yGNode.layout;
                                yGLayout522.getClass();
                                boolean hadOverflow22 = yGLayout522.hadOverflow();
                                YGLayout yGLayout622 = yGNode522.layout;
                                yGLayout622.getClass();
                                yGNode.setLayoutHadOverflow(hadOverflow22 | yGLayout622.hadOverflow());
                                f12 = f4;
                                yGMeasureMode7 = yGMeasureMode;
                                f13 = f2422;
                                yGFlexDirection6 = yGFlexDirection4;
                                f11 = f8;
                                f21 = f22;
                                yGFlexDirection5 = yGFlexDirection;
                                f10 = f2;
                            }
                        }
                        z3 = false;
                        if (YGFlexDirectionIsRow) {
                        }
                        if (YGFlexDirectionIsRow) {
                        }
                        if (YGFlexDirectionIsRow) {
                        }
                        if (!YGFlexDirectionIsRow) {
                        }
                        if (z2) {
                        }
                        float floatValue2222 = ((Float) anonymousClass64.this$0).floatValue();
                        float floatValue3222 = ((Float) anonymousClass62.this$0).floatValue();
                        YGLayout yGLayout4222 = yGNode.layout;
                        yGLayout4222.getClass();
                        YGNode yGNode5222 = yGNode2;
                        float f24222 = f13;
                        YGLayoutNodeInternal(floatValue2222, floatValue3222, f4, f5, i, i2, sniffer, yGConfig, yGNode5222, yGLayout4222.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                        YGLayout yGLayout5222 = yGNode.layout;
                        yGLayout5222.getClass();
                        boolean hadOverflow222 = yGLayout5222.hadOverflow();
                        YGLayout yGLayout6222 = yGNode5222.layout;
                        yGLayout6222.getClass();
                        yGNode.setLayoutHadOverflow(hadOverflow222 | yGLayout6222.hadOverflow());
                        f12 = f4;
                        yGMeasureMode7 = yGMeasureMode;
                        f13 = f24222;
                        yGFlexDirection6 = yGFlexDirection4;
                        f11 = f8;
                        f21 = f22;
                        yGFlexDirection5 = yGFlexDirection;
                        f10 = f2;
                    }
                }
                YGNodeBoundAxis = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2;
                float f222 = (YGNodeBoundAxis - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2) + f6;
                float m1416getMarginForAxisnjjmY03 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection5, f12);
                float m1416getMarginForAxisnjjmY022 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection6, f12);
                int i32 = 29;
                anonymousClass6 = new Recorder.AnonymousClass6(Float.valueOf(RecyclerView.DECELERATION_RATE), i32);
                Recorder.AnonymousClass6 anonymousClass632 = new Recorder.AnonymousClass6(Float.valueOf(YGNodeBoundAxis + m1416getMarginForAxisnjjmY03), i32);
                YGMeasureMode yGMeasureMode82 = YGMeasureMode.YGMeasureModeExactly;
                f7 = yGNode4.style.aspectRatio;
                if (Float.isNaN(f7)) {
                }
                yGMeasureMode4 = yGMeasureMode82;
                yGNode2 = yGNode4;
                yGMeasureMode3 = yGMeasureMode4;
                YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection3, f10, f12, yGMeasureMode3, anonymousClass632);
                anonymousClass62 = anonymousClass632;
                yGFlexDirection4 = yGFlexDirection6;
                f8 = f11;
                yGMeasureMode5 = yGMeasureMode3;
                yGMeasureMode6 = yGMeasureMode4;
                YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection4, f8, f12, yGMeasureMode6, anonymousClass6);
                if (!YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f8)) {
                }
                z3 = false;
                if (YGFlexDirectionIsRow) {
                }
                if (YGFlexDirectionIsRow) {
                }
                if (YGFlexDirectionIsRow) {
                }
                if (!YGFlexDirectionIsRow) {
                }
                if (z2) {
                }
                float floatValue22222 = ((Float) anonymousClass64.this$0).floatValue();
                float floatValue32222 = ((Float) anonymousClass62.this$0).floatValue();
                YGLayout yGLayout42222 = yGNode.layout;
                yGLayout42222.getClass();
                YGNode yGNode52222 = yGNode2;
                float f242222 = f13;
                YGLayoutNodeInternal(floatValue22222, floatValue32222, f4, f5, i, i2, sniffer, yGConfig, yGNode52222, yGLayout42222.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                YGLayout yGLayout52222 = yGNode.layout;
                yGLayout52222.getClass();
                boolean hadOverflow2222 = yGLayout52222.hadOverflow();
                YGLayout yGLayout62222 = yGNode52222.layout;
                yGLayout62222.getClass();
                yGNode.setLayoutHadOverflow(hadOverflow2222 | yGLayout62222.hadOverflow());
                f12 = f4;
                yGMeasureMode7 = yGMeasureMode;
                f13 = f242222;
                yGFlexDirection6 = yGFlexDirection4;
                f11 = f8;
                f21 = f222;
                yGFlexDirection5 = yGFlexDirection;
                f10 = f2;
            } else {
                float f25 = (-yGNode4.resolveFlexShrink()) * m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2;
                if (f25 == RecyclerView.DECELERATION_RATE) {
                    f6 = f21;
                    YGNodeBoundAxis = m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2;
                    float f2222 = (YGNodeBoundAxis - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2) + f6;
                    float m1416getMarginForAxisnjjmY032 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection5, f12);
                    float m1416getMarginForAxisnjjmY0222 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection6, f12);
                    int i322 = 29;
                    anonymousClass6 = new Recorder.AnonymousClass6(Float.valueOf(RecyclerView.DECELERATION_RATE), i322);
                    Recorder.AnonymousClass6 anonymousClass6322 = new Recorder.AnonymousClass6(Float.valueOf(YGNodeBoundAxis + m1416getMarginForAxisnjjmY032), i322);
                    YGMeasureMode yGMeasureMode822 = YGMeasureMode.YGMeasureModeExactly;
                    f7 = yGNode4.style.aspectRatio;
                    if (Float.isNaN(f7)) {
                    }
                    yGMeasureMode4 = yGMeasureMode822;
                    yGNode2 = yGNode4;
                    yGMeasureMode3 = yGMeasureMode4;
                    YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection3, f10, f12, yGMeasureMode3, anonymousClass6322);
                    anonymousClass62 = anonymousClass6322;
                    yGFlexDirection4 = yGFlexDirection6;
                    f8 = f11;
                    yGMeasureMode5 = yGMeasureMode3;
                    yGMeasureMode6 = yGMeasureMode4;
                    YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection4, f8, f12, yGMeasureMode6, anonymousClass6);
                    if (!YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f8)) {
                    }
                    z3 = false;
                    if (YGFlexDirectionIsRow) {
                    }
                    if (YGFlexDirectionIsRow) {
                    }
                    if (YGFlexDirectionIsRow) {
                    }
                    if (!YGFlexDirectionIsRow) {
                    }
                    if (z2) {
                    }
                    float floatValue222222 = ((Float) anonymousClass64.this$0).floatValue();
                    float floatValue322222 = ((Float) anonymousClass62.this$0).floatValue();
                    YGLayout yGLayout422222 = yGNode.layout;
                    yGLayout422222.getClass();
                    YGNode yGNode522222 = yGNode2;
                    float f2422222 = f13;
                    YGLayoutNodeInternal(floatValue222222, floatValue322222, f4, f5, i, i2, sniffer, yGConfig, yGNode522222, yGLayout422222.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                    YGLayout yGLayout522222 = yGNode.layout;
                    yGLayout522222.getClass();
                    boolean hadOverflow22222 = yGLayout522222.hadOverflow();
                    YGLayout yGLayout622222 = yGNode522222.layout;
                    yGLayout622222.getClass();
                    yGNode.setLayoutHadOverflow(hadOverflow22222 | yGLayout622222.hadOverflow());
                    f12 = f4;
                    yGMeasureMode7 = yGMeasureMode;
                    f13 = f2422222;
                    yGFlexDirection6 = yGFlexDirection4;
                    f11 = f8;
                    f21 = f2222;
                    yGFlexDirection5 = yGFlexDirection;
                    f10 = f2;
                } else {
                    if (Float.isNaN(yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors) || yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors != RecyclerView.DECELERATION_RATE) {
                        f6 = f21;
                        f9 = ((yGCollectFlexItemsRowValues.remainingFreeSpace / yGCollectFlexItemsRowValues.totalFlexShrinkScaledFactors) * f25) + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2;
                    } else {
                        f9 = f25 + m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2;
                        f6 = f21;
                    }
                    YGNodeBoundAxis = YGNodeBoundAxis(yGNode4, yGFlexDirection5, f9, f10, f12);
                    float f22222 = (YGNodeBoundAxis - m1421YGNodeBoundAxisWithinMinAndMax6Z_1uto2) + f6;
                    float m1416getMarginForAxisnjjmY0322 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection5, f12);
                    float m1416getMarginForAxisnjjmY02222 = yGNode4.m1416getMarginForAxisnjjmY0(yGFlexDirection6, f12);
                    int i3222 = 29;
                    anonymousClass6 = new Recorder.AnonymousClass6(Float.valueOf(RecyclerView.DECELERATION_RATE), i3222);
                    Recorder.AnonymousClass6 anonymousClass63222 = new Recorder.AnonymousClass6(Float.valueOf(YGNodeBoundAxis + m1416getMarginForAxisnjjmY0322), i3222);
                    YGMeasureMode yGMeasureMode8222 = YGMeasureMode.YGMeasureModeExactly;
                    f7 = yGNode4.style.aspectRatio;
                    if (Float.isNaN(f7)) {
                    }
                    yGMeasureMode4 = yGMeasureMode8222;
                    yGNode2 = yGNode4;
                    yGMeasureMode3 = yGMeasureMode4;
                    YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection3, f10, f12, yGMeasureMode3, anonymousClass63222);
                    anonymousClass62 = anonymousClass63222;
                    yGFlexDirection4 = yGFlexDirection6;
                    f8 = f11;
                    yGMeasureMode5 = yGMeasureMode3;
                    yGMeasureMode6 = yGMeasureMode4;
                    YGConstrainMaxSizeForMode(yGNode2, yGFlexDirection4, f8, f12, yGMeasureMode6, anonymousClass6);
                    if (!YGNodeIsStyleDimDefined(yGNode2, yGFlexDirection4, f8)) {
                    }
                    z3 = false;
                    if (YGFlexDirectionIsRow) {
                    }
                    if (YGFlexDirectionIsRow) {
                    }
                    if (YGFlexDirectionIsRow) {
                    }
                    if (!YGFlexDirectionIsRow) {
                    }
                    if (z2) {
                    }
                    float floatValue2222222 = ((Float) anonymousClass64.this$0).floatValue();
                    float floatValue3222222 = ((Float) anonymousClass62.this$0).floatValue();
                    YGLayout yGLayout4222222 = yGNode.layout;
                    yGLayout4222222.getClass();
                    YGNode yGNode5222222 = yGNode2;
                    float f24222222 = f13;
                    YGLayoutNodeInternal(floatValue2222222, floatValue3222222, f4, f5, i, i2, sniffer, yGConfig, yGNode5222222, yGLayout4222222.direction(), yGMeasureMode9, yGMeasureMode10, z5 ? LayoutPassReason.kFlexLayout : LayoutPassReason.kFlexMeasure, z5);
                    YGLayout yGLayout5222222 = yGNode.layout;
                    yGLayout5222222.getClass();
                    boolean hadOverflow222222 = yGLayout5222222.hadOverflow();
                    YGLayout yGLayout6222222 = yGNode5222222.layout;
                    yGLayout6222222.getClass();
                    yGNode.setLayoutHadOverflow(hadOverflow222222 | yGLayout6222222.hadOverflow());
                    f12 = f4;
                    yGMeasureMode7 = yGMeasureMode;
                    f13 = f24222222;
                    yGFlexDirection6 = yGFlexDirection4;
                    f11 = f8;
                    f21 = f22222;
                    yGFlexDirection5 = yGFlexDirection;
                    f10 = f2;
                }
            }
        }
        yGCollectFlexItemsRowValues.remainingFreeSpace = f13 - f21;
    }
}
