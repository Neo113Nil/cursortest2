package app.cash.redwood.yoga.internal;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGDimension;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import app.cash.redwood.yoga.internal.enums.YGPositionType;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import com.fillr.n;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class YGNode {
    public CoroutinesRoom.Companion baseline;
    public ArrayList children;
    public YGConfig config;
    public View context;
    public LinkedHashMap flags;
    public YGLayout layout;
    public int lineIndex;
    public n.b measure;
    public YGNode owner;
    public ArrayList resolvedDimensions;
    public YGStyle style;

    public abstract class Companion {
        public static CompactValue computeEdgeValueForColumn(Values values, YGEdge yGEdge, CompactValue compactValue) {
            values.getClass();
            yGEdge.getClass();
            if (!values.getCompactValue(yGEdge.ordinal()).isUndefined()) {
                return values.getCompactValue(yGEdge.ordinal());
            }
            YGEdge yGEdge2 = YGEdge.YGEdgeLeft;
            return !values.getCompactValue(7).isUndefined() ? values.getCompactValue(7) : !values.getCompactValue(8).isUndefined() ? values.getCompactValue(8) : compactValue;
        }

        public static CompactValue computeEdgeValueForRow(Values values, YGEdge yGEdge, YGEdge yGEdge2, CompactValue compactValue) {
            values.getClass();
            yGEdge2.getClass();
            if (!values.getCompactValue(yGEdge.ordinal()).isUndefined()) {
                return values.getCompactValue(yGEdge.ordinal());
            }
            if (!values.getCompactValue(yGEdge2.ordinal()).isUndefined()) {
                return values.getCompactValue(yGEdge2.ordinal());
            }
            YGEdge yGEdge3 = YGEdge.YGEdgeLeft;
            return !values.getCompactValue(6).isUndefined() ? values.getCompactValue(6) : !values.getCompactValue(8).isUndefined() ? values.getCompactValue(8) : compactValue;
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewEarningsActivityForStream.deepLinkSpecs;
        }
    }

    public YGNode(YGNode yGNode) {
        this.measure = new n.b(3);
        this.baseline = new CoroutinesRoom.Companion(16);
        this.style = new YGStyle();
        this.layout = new YGLayout();
        this.children = new ArrayList();
        this.config = new YGConfig();
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(Yoga.YGValueUndefined);
        }
        this.resolvedDimensions = arrayList;
        this.flags = new LinkedHashMap();
        this.context = yGNode.context;
        this.flags = yGNode.flags;
        this.measure = yGNode.measure;
        this.baseline = yGNode.baseline;
        this.style = yGNode.style;
        this.layout = yGNode.layout;
        this.lineIndex = yGNode.lineIndex;
        this.owner = yGNode.owner;
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) yGNode.children);
        this.children = mutableList;
        this.config = yGNode.config;
        this.resolvedDimensions = yGNode.resolvedDimensions;
        Iterator it = mutableList.iterator();
        while (it.hasNext()) {
            ((YGNode) it.next()).owner = this;
        }
    }

    public final YGNode getChild(int i) {
        return (YGNode) this.children.get(i);
    }

    public final YGLayout getLayout() {
        return this.layout;
    }

    public final float getLeadingBorder(YGFlexDirection yGFlexDirection) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Math.max((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.border, YGEdge.YGEdgeStart, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.border, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue().value, RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: getLeadingMargin-njjmY-0, reason: not valid java name */
    public final float m1413getLeadingMarginnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        CompactValue computeEdgeValueForRow = YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.margin, YGEdge.YGEdgeStart, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.margin, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)));
        return ((YGUnit) computeEdgeValueForRow.payload_.fullPath) == YGUnit.YGUnitAuto ? RecyclerView.DECELERATION_RATE : Yoga.m1422YGResolveValuenjjmY0(computeEdgeValueForRow.convertToYgValue(), f);
    }

    /* renamed from: getLeadingPadding-njjmY-0, reason: not valid java name */
    public final float m1414getLeadingPaddingnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Yoga.m1420YGFloatOptionalMax7X9vPvM(Yoga.m1422YGResolveValuenjjmY0((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.padding, YGEdge.YGEdgeStart, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.padding, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue(), f), RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: getLeadingPosition-njjmY-0, reason: not valid java name */
    public final float m1415getLeadingPositionnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Yoga.m1422YGResolveValuenjjmY0((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.position, YGEdge.YGEdgeStart, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.position, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue(), f);
    }

    /* renamed from: getMarginForAxis-njjmY-0, reason: not valid java name */
    public final float m1416getMarginForAxisnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        return m1417getTrailingMarginnjjmY0(yGFlexDirection, f) + m1413getLeadingMarginnjjmY0(yGFlexDirection, f);
    }

    public final YGStyle getStyle() {
        return this.style;
    }

    public final float getTrailingBorder(YGFlexDirection yGFlexDirection) {
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Math.max((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.border, YGEdge.YGEdgeEnd, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.border, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue().value, RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: getTrailingMargin-njjmY-0, reason: not valid java name */
    public final float m1417getTrailingMarginnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        CompactValue computeEdgeValueForRow = YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.margin, YGEdge.YGEdgeEnd, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.margin, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)));
        return ((YGUnit) computeEdgeValueForRow.payload_.fullPath) == YGUnit.YGUnitAuto ? RecyclerView.DECELERATION_RATE : Yoga.m1422YGResolveValuenjjmY0(computeEdgeValueForRow.convertToYgValue(), f);
    }

    /* renamed from: getTrailingPadding-njjmY-0, reason: not valid java name */
    public final float m1418getTrailingPaddingnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Yoga.m1420YGFloatOptionalMax7X9vPvM(Yoga.m1422YGResolveValuenjjmY0((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.padding, YGEdge.YGEdgeEnd, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.padding, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue(), f), RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: getTrailingPosition-njjmY-0, reason: not valid java name */
    public final float m1419getTrailingPositionnjjmY0(YGFlexDirection yGFlexDirection, float f) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return Yoga.m1422YGResolveValuenjjmY0((YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.position, YGEdge.YGEdgeEnd, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint))) : Companion.computeEdgeValueForColumn(yGStyle.position, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, YGUnit.YGUnitPoint)))).convertToYgValue(), f);
    }

    public final boolean isDirty() {
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(2);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final boolean isLeadingPositionDefined(YGFlexDirection yGFlexDirection) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return !(YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.position, YGEdge.YGEdgeStart, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue()) : Companion.computeEdgeValueForColumn(yGStyle.position, (YGEdge) Yoga.leading.get(yGFlexDirection.ordinal()), new CompactValue())).isUndefined();
    }

    public final boolean isNodeFlexible() {
        if (this.style.positionType() != YGPositionType.YGPositionTypeAbsolute) {
            return (resolveFlexGrow() == RecyclerView.DECELERATION_RATE && resolveFlexShrink() == RecyclerView.DECELERATION_RATE) ? false : true;
        }
        return false;
    }

    public final boolean isTrailingPosDefined(YGFlexDirection yGFlexDirection) {
        yGFlexDirection.getClass();
        Yoga yoga = Yoga.INSTANCE;
        boolean YGFlexDirectionIsRow = Yoga.YGFlexDirectionIsRow(yGFlexDirection);
        YGStyle yGStyle = this.style;
        return !(YGFlexDirectionIsRow ? Companion.computeEdgeValueForRow(yGStyle.position, YGEdge.YGEdgeEnd, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue()) : Companion.computeEdgeValueForColumn(yGStyle.position, (YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal()), new CompactValue())).isUndefined();
    }

    public final YGValue marginLeadingValue(YGFlexDirection yGFlexDirection) {
        YGStyle yGStyle = this.style;
        Yoga yoga = Yoga.INSTANCE;
        if (Yoga.YGFlexDirectionIsRow(yGFlexDirection)) {
            Values values = yGStyle.margin;
            YGEdge yGEdge = YGEdge.YGEdgeLeft;
            values.getClass();
            if (!values.getCompactValue(4).isUndefined()) {
                return yGStyle.margin.get(4);
            }
        }
        return yGStyle.margin.get(((YGEdge) Yoga.leading.get(yGFlexDirection.ordinal())).ordinal());
    }

    public final YGValue marginTrailingValue(YGFlexDirection yGFlexDirection) {
        YGStyle yGStyle = this.style;
        Yoga yoga = Yoga.INSTANCE;
        if (Yoga.YGFlexDirectionIsRow(yGFlexDirection)) {
            Values values = yGStyle.margin;
            YGEdge yGEdge = YGEdge.YGEdgeLeft;
            values.getClass();
            if (!values.getCompactValue(5).isUndefined()) {
                return yGStyle.margin.get(5);
            }
        }
        return yGStyle.margin.get(((YGEdge) Yoga.trailing.get(yGFlexDirection.ordinal())).ordinal());
    }

    public final void markDirtyAndPropogate() {
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(2);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        setDirty(true);
        YGLayout yGLayout = this.layout;
        if (yGLayout != null) {
            yGLayout.computedFlexBasis = Float.NaN;
        }
        YGNode yGNode = this.owner;
        if (yGNode != null) {
            yGNode.markDirtyAndPropogate();
        }
    }

    public final void resolveDimension() {
        ArrayList arrayList = this.resolvedDimensions;
        YGStyle yGStyle = this.style;
        YGDimension[] yGDimensionArr = {YGDimension.YGDimensionWidth, YGDimension.YGDimensionHeight};
        for (int i = 0; i < 2; i++) {
            YGDimension yGDimension = yGDimensionArr[i];
            Values values = yGStyle.maxDimensions;
            if (!values.getCompactValue(yGDimension.ordinal()).isUndefined()) {
                Yoga yoga = Yoga.INSTANCE;
                CompactValue compactValue = values.getCompactValue(yGDimension.ordinal());
                CompactValue compactValue2 = yGStyle.minDimensions.getCompactValue(yGDimension.ordinal());
                YGValue convertToYgValue = compactValue.convertToYgValue();
                YGValue convertToYgValue2 = compactValue2.convertToYgValue();
                YGUnit yGUnit = convertToYgValue.unit;
                float f = convertToYgValue.value;
                YGUnit yGUnit2 = convertToYgValue2.unit;
                float f2 = convertToYgValue2.value;
                if (yGUnit == yGUnit2 && (yGUnit == YGUnit.YGUnitUndefined || ((Float.isNaN(f) && Float.isNaN(f2)) || Math.abs(f - f2) < 1.0E-4f))) {
                    arrayList.set(yGDimension.ordinal(), values.get(yGDimension.ordinal()));
                }
            }
            arrayList.set(yGDimension.ordinal(), yGStyle.dimensions.get(yGDimension.ordinal()));
        }
    }

    public final YGDirection resolveDirection(YGDirection yGDirection) {
        YGStyle yGStyle = this.style;
        return yGStyle.direction() == YGDirection.YGDirectionInherit ? yGDirection.ordinal() > 0 ? yGDirection : YGDirection.YGDirectionLTR : yGStyle.direction();
    }

    public final float resolveFlexGrow() {
        YGStyle yGStyle = this.style;
        if (this.owner == null) {
            return RecyclerView.DECELERATION_RATE;
        }
        if (!Float.isNaN(yGStyle.flexGrow)) {
            return yGStyle.flexGrow;
        }
        if (!Float.isNaN(yGStyle.flex)) {
            float f = yGStyle.flex;
            if (f > RecyclerView.DECELERATION_RATE) {
                return f;
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public final float resolveFlexShrink() {
        LinkedHashMap linkedHashMap = this.flags;
        YGStyle yGStyle = this.style;
        if (this.owner != null) {
            float f = yGStyle.flexShrink;
            float f2 = yGStyle.flex;
            if (!Float.isNaN(f)) {
                return yGStyle.flexShrink;
            }
            linkedHashMap.getClass();
            Object obj = linkedHashMap.get(7);
            if (obj == null) {
                obj = Boolean.FALSE;
            }
            if (!((Boolean) obj).booleanValue() && !Float.isNaN(f2) && f2 < RecyclerView.DECELERATION_RATE) {
                return -f2;
            }
            Object obj2 = linkedHashMap.get(7);
            if (obj2 == null) {
                obj2 = Boolean.FALSE;
            }
            if (((Boolean) obj2).booleanValue()) {
                return 1.0f;
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public final void setDirty(boolean z) {
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(2);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (z == ((Boolean) obj).booleanValue()) {
            return;
        }
        linkedHashMap.put(2, Boolean.valueOf(z));
    }

    public final void setLayoutDimension(float f, int i) {
        YGLayout yGLayout = this.layout;
        yGLayout.getClass();
        yGLayout.dimensions[i] = f;
    }

    public final void setLayoutHadOverflow(boolean z) {
        YGLayout yGLayout = this.layout;
        yGLayout.getClass();
        LinkedHashMap linkedHashMap = yGLayout.flags;
        int i = YGLayout.hadOverflowOffset;
        linkedHashMap.getClass();
        linkedHashMap.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void setLayoutMeasuredDimension(float f, int i) {
        YGLayout yGLayout = this.layout;
        yGLayout.getClass();
        yGLayout.measuredDimensions[i] = f;
    }

    public final void setLayoutPosition(float f, int i) {
        YGLayout yGLayout = this.layout;
        yGLayout.getClass();
        yGLayout.position[i] = f;
    }

    public final void setPosition(YGDirection yGDirection, float f, float f2, float f3) {
        float m1419getTrailingPositionnjjmY0;
        float m1419getTrailingPositionnjjmY02;
        if (this.owner == null) {
            yGDirection = YGDirection.YGDirectionLTR;
        }
        Yoga yoga = Yoga.INSTANCE;
        YGFlexDirection YGResolveFlexDirection = Yoga.YGResolveFlexDirection(this.style.flexDirection(), yGDirection);
        YGFlexDirection YGResolveFlexDirection2 = Yoga.YGFlexDirectionIsColumn(YGResolveFlexDirection) ? Yoga.YGResolveFlexDirection(YGFlexDirection.YGFlexDirectionRow, yGDirection) : YGFlexDirection.YGFlexDirectionColumn;
        if (isLeadingPositionDefined(YGResolveFlexDirection)) {
            m1419getTrailingPositionnjjmY0 = m1415getLeadingPositionnjjmY0(YGResolveFlexDirection, f);
        } else {
            m1419getTrailingPositionnjjmY0 = m1419getTrailingPositionnjjmY0(YGResolveFlexDirection, f);
            if (!Float.isNaN(m1419getTrailingPositionnjjmY0)) {
                m1419getTrailingPositionnjjmY0 *= -1.0f;
            }
        }
        if (isLeadingPositionDefined(YGResolveFlexDirection2)) {
            m1419getTrailingPositionnjjmY02 = m1415getLeadingPositionnjjmY0(YGResolveFlexDirection2, f2);
        } else {
            m1419getTrailingPositionnjjmY02 = m1419getTrailingPositionnjjmY0(YGResolveFlexDirection2, f2);
            if (!Float.isNaN(m1419getTrailingPositionnjjmY02)) {
                m1419getTrailingPositionnjjmY02 *= -1.0f;
            }
        }
        float m1413getLeadingMarginnjjmY0 = m1413getLeadingMarginnjjmY0(YGResolveFlexDirection, f3) + m1419getTrailingPositionnjjmY0;
        List list = Yoga.leading;
        setLayoutPosition(m1413getLeadingMarginnjjmY0, ((YGEdge) list.get(YGResolveFlexDirection.ordinal())).ordinal());
        float m1417getTrailingMarginnjjmY0 = m1417getTrailingMarginnjjmY0(YGResolveFlexDirection, f3) + m1419getTrailingPositionnjjmY0;
        List list2 = Yoga.trailing;
        setLayoutPosition(m1417getTrailingMarginnjjmY0, ((YGEdge) list2.get(YGResolveFlexDirection.ordinal())).ordinal());
        setLayoutPosition(m1413getLeadingMarginnjjmY0(YGResolveFlexDirection2, f3) + m1419getTrailingPositionnjjmY02, ((YGEdge) list.get(YGResolveFlexDirection2.ordinal())).ordinal());
        setLayoutPosition(m1417getTrailingMarginnjjmY0(YGResolveFlexDirection2, f3) + m1419getTrailingPositionnjjmY02, ((YGEdge) list2.get(YGResolveFlexDirection2.ordinal())).ordinal());
    }
}
