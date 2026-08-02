package app.cash.redwood.layout.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.mkv.Sniffer;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.yoga.Node;
import app.cash.redwood.yoga.internal.YGLayout;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.YGValue;
import app.cash.redwood.yoga.internal.Yoga;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGDimension;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import app.cash.redwood.yoga.internal.enums.YGMeasureMode;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import app.cash.redwood.yoga.internal.event.EmptyEventData;
import app.cash.redwood.yoga.internal.event.Event;
import app.cash.redwood.yoga.internal.event.LayoutPassReason;
import bo.app.yf$$ExternalSyntheticLambda10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public final class YogaLayout extends ViewGroup {
    public int heightConstraint;
    public final Node rootNode;
    public int widthConstraint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YogaLayout(Context context) {
        super(context);
        context.getClass();
        Node node = new Node();
        node.f60native.context = this;
        this.rootNode = node;
        Constraint.Companion.getClass();
        this.widthConstraint = 0;
        this.heightConstraint = 0;
    }

    public final void applyLayout(Node node, float f, float f2) {
        YGNode yGNode = node.f60native;
        YGNode yGNode2 = node.f60native;
        View view = yGNode.context;
        view.getClass();
        if (view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            Yoga yoga = Yoga.INSTANCE;
            yGNode2.getClass();
            YGLayout yGLayout = yGNode2.layout;
            yGLayout.getClass();
            float[] fArr = yGLayout.position;
            YGEdge yGEdge = YGEdge.YGEdgeLeft;
            int roundToInt = MathKt__MathJVMKt.roundToInt(fArr[0] + f);
            yGNode2.getClass();
            YGLayout yGLayout2 = yGNode2.layout;
            yGLayout2.getClass();
            int roundToInt2 = MathKt__MathJVMKt.roundToInt(yGLayout2.position[1] + f2);
            yGNode2.getClass();
            YGLayout yGLayout3 = yGNode2.layout;
            yGLayout3.getClass();
            float[] fArr2 = yGLayout3.dimensions;
            YGDimension yGDimension = YGDimension.YGDimensionWidth;
            int roundToInt3 = MathKt__MathJVMKt.roundToInt(fArr2[0]) + roundToInt;
            yGNode2.getClass();
            YGLayout yGLayout4 = yGNode2.layout;
            yGLayout4.getClass();
            int roundToInt4 = MathKt__MathJVMKt.roundToInt(yGLayout4.dimensions[1]) + roundToInt2;
            view.measure(View.MeasureSpec.makeMeasureSpec(roundToInt3 - roundToInt, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt4 - roundToInt2, 1073741824));
            view.layout(roundToInt, roundToInt2, roundToInt3, roundToInt4);
        }
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            Yoga yoga2 = Yoga.INSTANCE;
            yGNode2.getClass();
            YGLayout yGLayout5 = yGNode2.layout;
            yGLayout5.getClass();
            float[] fArr3 = yGLayout5.position;
            YGEdge yGEdge2 = YGEdge.YGEdgeLeft;
            float f3 = fArr3[0] + f;
            yGNode2.getClass();
            YGLayout yGLayout6 = yGNode2.layout;
            yGLayout6.getClass();
            applyLayout(node2, f3, yGLayout6.position[1] + f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void calculateLayout(float f, float f2) {
        YGMeasureMode yGMeasureMode;
        float f3;
        YGMeasureMode yGMeasureMode2;
        YGFlexDirection yGFlexDirection;
        YGMeasureMode yGMeasureMode3;
        float f4;
        float m1422YGResolveValuenjjmY0;
        Node node = this.rootNode;
        node.getClass();
        Yoga yoga = Yoga.INSTANCE;
        YGNode yGNode = node.f60native;
        yGNode.getClass();
        YGDimension yGDimension = YGDimension.YGDimensionWidth;
        YGUnit yGUnit = YGUnit.YGUnitUndefined;
        Yoga.updateStyleIndexed(yGNode, yGDimension, f, new Yoga$$ExternalSyntheticLambda0(0));
        yGNode.getClass();
        Yoga.updateStyleIndexed(yGNode, yGDimension, Float.NaN, new Yoga$$ExternalSyntheticLambda0(29));
        yGNode.getClass();
        YGDimension yGDimension2 = YGDimension.YGDimensionHeight;
        Yoga.updateStyleIndexed(yGNode, yGDimension2, f2, new yf$$ExternalSyntheticLambda10(2));
        yGNode.getClass();
        Yoga.updateStyleIndexed(yGNode, yGDimension2, Float.NaN, new yf$$ExternalSyntheticLambda10(5));
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            View view = node2.f60native.context;
            view.getClass();
            if (view.isLayoutRequested()) {
                YGNode yGNode2 = node2.f60native;
                if (!yGNode2.isDirty()) {
                    yGNode2.setDirty(true);
                }
            }
        }
        Yoga yoga2 = Yoga.INSTANCE;
        YGStyle yGStyle = yGNode.style;
        ArrayList arrayList = yGNode.resolvedDimensions;
        YGDirection direction = yGStyle.direction();
        List list = Yoga.dim;
        LinkedHashMap linkedHashMap = Event.listeners;
        Event.publish(new EmptyEventData());
        Sniffer sniffer = new Sniffer(7, false, false);
        AtomicInteger atomicInteger = Yoga.currentGenerationCount;
        atomicInteger.getClass();
        atomicInteger.addAndGet(1);
        yGNode.resolveDimension();
        Values values = yGNode.style.maxDimensions;
        YGFlexDirection yGFlexDirection2 = YGFlexDirection.YGFlexDirectionRow;
        if (Yoga.YGNodeIsStyleDimDefined(yGNode, yGFlexDirection2, Float.NaN)) {
            f3 = yGNode.m1416getMarginForAxisnjjmY0(yGFlexDirection2, Float.NaN) + Yoga.m1422YGResolveValuenjjmY0((YGValue) arrayList.get(((YGDimension) list.get(2)).ordinal()), Float.NaN);
            yGMeasureMode2 = YGMeasureMode.YGMeasureModeExactly;
        } else {
            YGDimension yGDimension3 = YGDimension.YGDimensionWidth;
            if (Float.isNaN(Yoga.m1422YGResolveValuenjjmY0(values.get(0), Float.NaN))) {
                yGMeasureMode = Float.isNaN(Float.NaN) ? YGMeasureMode.YGMeasureModeUndefined : YGMeasureMode.YGMeasureModeExactly;
                f3 = Float.NaN;
                yGFlexDirection = YGFlexDirection.YGFlexDirectionColumn;
                if (Yoga.YGNodeIsStyleDimDefined(yGNode, yGFlexDirection, Float.NaN)) {
                    YGDimension yGDimension4 = YGDimension.YGDimensionWidth;
                    if (Float.isNaN(Yoga.m1422YGResolveValuenjjmY0(values.get(1), Float.NaN))) {
                        yGMeasureMode3 = Float.isNaN(Float.NaN) ? YGMeasureMode.YGMeasureModeUndefined : YGMeasureMode.YGMeasureModeExactly;
                        f4 = Float.NaN;
                        if (yoga2.YGLayoutNodeInternal(f3, f4, Float.NaN, Float.NaN, 0, atomicInteger.get(), sniffer, yGNode.config, yGNode, direction, yGMeasureMode, yGMeasureMode3, LayoutPassReason.kInitial, true)) {
                            YGLayout yGLayout = yGNode.layout;
                            yGLayout.getClass();
                            yGNode.setPosition(yGLayout.direction(), Float.NaN, Float.NaN, Float.NaN);
                            if (yGNode.config != null) {
                                Yoga.YGRoundToPixelGrid(yGNode, 0.0d, 0.0d);
                            }
                        }
                        Event.publish(new EmptyEventData());
                    }
                    m1422YGResolveValuenjjmY0 = Yoga.m1422YGResolveValuenjjmY0(values.get(1), Float.NaN);
                    yGMeasureMode3 = YGMeasureMode.YGMeasureModeAtMost;
                } else {
                    m1422YGResolveValuenjjmY0 = yGNode.m1416getMarginForAxisnjjmY0(yGFlexDirection, Float.NaN) + Yoga.m1422YGResolveValuenjjmY0((YGValue) arrayList.get(((YGDimension) list.get(0)).ordinal()), Float.NaN);
                    yGMeasureMode3 = YGMeasureMode.YGMeasureModeExactly;
                }
                f4 = m1422YGResolveValuenjjmY0;
                if (yoga2.YGLayoutNodeInternal(f3, f4, Float.NaN, Float.NaN, 0, atomicInteger.get(), sniffer, yGNode.config, yGNode, direction, yGMeasureMode, yGMeasureMode3, LayoutPassReason.kInitial, true)) {
                }
                Event.publish(new EmptyEventData());
            }
            f3 = Yoga.m1422YGResolveValuenjjmY0(values.get(0), Float.NaN);
            yGMeasureMode2 = YGMeasureMode.YGMeasureModeAtMost;
        }
        yGMeasureMode = yGMeasureMode2;
        yGFlexDirection = YGFlexDirection.YGFlexDirectionColumn;
        if (Yoga.YGNodeIsStyleDimDefined(yGNode, yGFlexDirection, Float.NaN)) {
        }
        f4 = m1422YGResolveValuenjjmY0;
        if (yoga2.YGLayoutNodeInternal(f3, f4, Float.NaN, Float.NaN, 0, atomicInteger.get(), sniffer, yGNode.config, yGNode, direction, yGMeasureMode, yGMeasureMode3, LayoutPassReason.kInitial, true)) {
        }
        Event.publish(new EmptyEventData());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        calculateLayout(i3 - i, i4 - i2);
        applyLayout(this.rootNode, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r8 == 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r7 == 1) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        float f2 = Float.NaN;
        if (mode != 1073741824) {
            if (mode != 0) {
                int i3 = this.widthConstraint;
                Constraint.Companion.getClass();
            }
            f = Float.NaN;
            if (mode2 != 1073741824) {
                if (mode2 != 0) {
                    int i4 = this.heightConstraint;
                    Constraint.Companion.getClass();
                }
                calculateLayout(f, f2);
                Node node = this.rootNode;
                node.getClass();
                YGNode yGNode = node.f60native;
                Yoga yoga = Yoga.INSTANCE;
                yGNode.getClass();
                YGLayout yGLayout = yGNode.layout;
                yGLayout.getClass();
                float[] fArr = yGLayout.dimensions;
                YGDimension yGDimension = YGDimension.YGDimensionWidth;
                int roundToInt = MathKt__MathJVMKt.roundToInt(fArr[0]);
                yGNode.getClass();
                YGLayout yGLayout2 = yGNode.layout;
                yGLayout2.getClass();
                setMeasuredDimension(roundToInt, MathKt__MathJVMKt.roundToInt(yGLayout2.dimensions[1]));
            }
            f2 = size2;
            calculateLayout(f, f2);
            Node node2 = this.rootNode;
            node2.getClass();
            YGNode yGNode2 = node2.f60native;
            Yoga yoga2 = Yoga.INSTANCE;
            yGNode2.getClass();
            YGLayout yGLayout3 = yGNode2.layout;
            yGLayout3.getClass();
            float[] fArr2 = yGLayout3.dimensions;
            YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
            int roundToInt2 = MathKt__MathJVMKt.roundToInt(fArr2[0]);
            yGNode2.getClass();
            YGLayout yGLayout22 = yGNode2.layout;
            yGLayout22.getClass();
            setMeasuredDimension(roundToInt2, MathKt__MathJVMKt.roundToInt(yGLayout22.dimensions[1]));
        }
        f = size;
        if (mode2 != 1073741824) {
        }
        f2 = size2;
        calculateLayout(f, f2);
        Node node22 = this.rootNode;
        node22.getClass();
        YGNode yGNode22 = node22.f60native;
        Yoga yoga22 = Yoga.INSTANCE;
        yGNode22.getClass();
        YGLayout yGLayout32 = yGNode22.layout;
        yGLayout32.getClass();
        float[] fArr22 = yGLayout32.dimensions;
        YGDimension yGDimension22 = YGDimension.YGDimensionWidth;
        int roundToInt22 = MathKt__MathJVMKt.roundToInt(fArr22[0]);
        yGNode22.getClass();
        YGLayout yGLayout222 = yGNode22.layout;
        yGLayout222.getClass();
        setMeasuredDimension(roundToInt22, MathKt__MathJVMKt.roundToInt(yGLayout222.dimensions[1]));
    }

    /* renamed from: setHeightConstraint-DyLkt4w$redwood_layout_view_release, reason: not valid java name */
    public final void m1363setHeightConstraintDyLkt4w$redwood_layout_view_release(int i) {
        this.heightConstraint = i;
    }

    /* renamed from: setWidthConstraint-DyLkt4w$redwood_layout_view_release, reason: not valid java name */
    public final void m1364setWidthConstraintDyLkt4w$redwood_layout_view_release(int i) {
        this.widthConstraint = i;
    }
}
