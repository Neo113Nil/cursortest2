package app.cash.redwood.layout.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.widget.NestedScrollView;
import androidx.transition.Transition;
import app.cash.redwood.Modifier;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.layout.api.MainAxisAlignment;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.ui.Px;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;
import app.cash.redwood.yoga.Node;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.Yoga;
import app.cash.redwood.yoga.internal.Yoga$YGNodeStyleSetDirection$1;
import app.cash.redwood.yoga.internal.Yoga$YGNodeStyleSetFlexDirection$1;
import app.cash.redwood.yoga.internal.Yoga$YGNodeStyleSetJustifyContent$1;
import app.cash.redwood.yoga.internal.detail.StyleEnumFlagsKey;
import app.cash.redwood.yoga.internal.enums.YGAlign;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import app.cash.redwood.yoga.internal.enums.YGJustify;
import app.cash.redwood.yoga.internal.enums.YGNodeType;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.ReversedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ViewFlexContainer implements ChangeListener, Widget {
    public final UnleashContext children;
    public final Context context;
    public final double density;
    public final int direction;
    public final HostView hostView;
    public Modifier modifier;
    public Function1 onScroll;
    public final YogaLayout yogaLayout;

    public final class HostView extends ViewGroup {
        public Object onScrollListener;
        public boolean scrollEnabled;

        public HostView() {
            super(ViewFlexContainer.this.context);
            updateViewHierarchy();
        }

        public final void attachOrDetachScrollListeners() {
            View childAt = getChildAt(0);
            boolean z = childAt instanceof NestedScrollView;
            final ViewFlexContainer viewFlexContainer = ViewFlexContainer.this;
            if (z) {
                NestedScrollView.OnScrollChangeListener onScrollChangeListener = (NestedScrollView.OnScrollChangeListener) this.onScrollListener;
                if (onScrollChangeListener == null) {
                    onScrollChangeListener = new NestedScrollView.OnScrollChangeListener() { // from class: app.cash.redwood.layout.view.ViewFlexContainer$HostView$$ExternalSyntheticLambda0
                        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                        public final void onScrollChange(NestedScrollView nestedScrollView, int i) {
                            Function1 function1 = ViewFlexContainer.this.onScroll;
                            if (function1 != null) {
                                double d = i;
                                Px.m1410constructorimpl(d);
                                function1.invoke(new Px(d));
                            }
                        }
                    };
                    this.onScrollListener = onScrollChangeListener;
                }
                ((NestedScrollView) childAt).setOnScrollChangeListener(onScrollChangeListener);
                return;
            }
            if (childAt instanceof HorizontalScrollView) {
                View.OnScrollChangeListener onScrollChangeListener2 = (View.OnScrollChangeListener) this.onScrollListener;
                if (onScrollChangeListener2 == null) {
                    onScrollChangeListener2 = new View.OnScrollChangeListener() { // from class: app.cash.redwood.layout.view.ViewFlexContainer$HostView$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                            Function1 function1 = ViewFlexContainer.this.onScroll;
                            if (function1 != null) {
                                double d = i;
                                Px.m1410constructorimpl(d);
                                function1.invoke(new Px(d));
                            }
                        }
                    };
                    this.onScrollListener = onScrollChangeListener2;
                }
                ((HorizontalScrollView) childAt).setOnScrollChangeListener(onScrollChangeListener2);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Iterator it = new ViewGroupKt$children$1(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).layout(0, 0, i3 - i, i4 - i2);
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            Iterator it = new ViewGroupKt$children$1(this).iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                View view = (View) it.next();
                view.measure(i, i2);
                i3 = Math.max(i3, view.getMeasuredWidth());
                i4 = Math.max(i4, view.getMeasuredHeight());
            }
            setMeasuredDimension(i3, i4);
        }

        public final void setScrollEnabled(boolean z) {
            boolean z2 = this.scrollEnabled;
            this.scrollEnabled = z;
            if (z2 != z) {
                updateViewHierarchy();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void updateViewHierarchy() {
            HorizontalScrollView horizontalScrollView;
            removeAllViews();
            ViewFlexContainer viewFlexContainer = ViewFlexContainer.this;
            View view = viewFlexContainer.yogaLayout;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            if (!this.scrollEnabled) {
                addView(view);
                return;
            }
            int i = viewFlexContainer.direction;
            if (i == 0 || i == 1) {
                HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(getContext());
                horizontalScrollView2.setFillViewport(true);
                horizontalScrollView = horizontalScrollView2;
            } else {
                NestedScrollView nestedScrollView = new NestedScrollView(getContext());
                nestedScrollView.setFillViewport(true);
                horizontalScrollView = nestedScrollView;
            }
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setVerticalScrollBarEnabled(false);
            horizontalScrollView.addView(view);
            addView(horizontalScrollView);
            attachOrDetachScrollListeners();
        }
    }

    public ViewFlexContainer(Context context, int i) {
        char c;
        YGDirection yGDirection;
        YGFlexDirection yGFlexDirection;
        this.context = context;
        this.direction = i;
        YogaLayout yogaLayout = new YogaLayout(context);
        this.yogaLayout = yogaLayout;
        Resources resources = context.getResources();
        resources.getClass();
        this.density = DensityKt.Density(resources);
        HostView hostView = new HostView();
        this.hostView = hostView;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        this.children = new UnleashContext((ViewGroup) yogaLayout, new Function2(this) { // from class: app.cash.redwood.layout.view.ViewFlexContainer$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewFlexContainer f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i2;
                ViewFlexContainer viewFlexContainer = this.f$0;
                switch (i5) {
                    case 0:
                        YogaLayout yogaLayout2 = viewFlexContainer.yogaLayout;
                        int intValue = ((Integer) obj).intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        View view = (View) widget.getValue();
                        Node node = new Node();
                        Yoga yoga = Yoga.INSTANCE;
                        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
                        YGNode yGNode = node.f60native;
                        yGNode.getClass();
                        LinkedHashMap linkedHashMap = yGNode.flags;
                        linkedHashMap.getClass();
                        linkedHashMap.put(4, Boolean.FALSE);
                        n.b bVar = yGNode.measure;
                        bVar.b = anonymousClass1;
                        Yoga.YGAssertWithNode(yGNode, yGNode.children.size() == 0, "Cannot set measure function: Nodes with measure functions cannot have children.");
                        YGNodeType yGNodeType = YGNodeType.YGNodeTypeText;
                        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGNodeType.class);
                        linkedHashMap.getClass();
                        linkedHashMap.put(new StyleEnumFlagsKey(3, orCreateKotlinClass), yGNodeType);
                        yGNode.measure = bVar;
                        yGNode.context = view;
                        yogaLayout2.rootNode.children.add(intValue, node);
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg(node, widget.getModifier(), viewFlexContainer.density);
                        yogaLayout2.addView(view, intValue);
                        break;
                    case 1:
                        int intValue2 = ((Integer) obj).intValue();
                        int intValue3 = ((Integer) obj2).intValue();
                        YogaLayout yogaLayout3 = viewFlexContainer.yogaLayout;
                        ReversedList reversedList = yogaLayout3.rootNode.children;
                        reversedList.getClass();
                        if (intValue3 == 1) {
                            reversedList.removeAt(intValue2);
                        } else {
                            reversedList.subList(intValue2, intValue2 + intValue3).clear();
                        }
                        yogaLayout3.removeViews(intValue2, intValue3);
                        break;
                    default:
                        int intValue4 = ((Integer) obj).intValue();
                        Widget widget2 = (Widget) obj2;
                        widget2.getClass();
                        YogaLayout yogaLayout4 = viewFlexContainer.yogaLayout;
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg((Node) yogaLayout4.rootNode.children.get(intValue4), widget2.getModifier(), viewFlexContainer.density);
                        yogaLayout4.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2(this) { // from class: app.cash.redwood.layout.view.ViewFlexContainer$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewFlexContainer f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i3;
                ViewFlexContainer viewFlexContainer = this.f$0;
                switch (i5) {
                    case 0:
                        YogaLayout yogaLayout2 = viewFlexContainer.yogaLayout;
                        int intValue = ((Integer) obj).intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        View view = (View) widget.getValue();
                        Node node = new Node();
                        Yoga yoga = Yoga.INSTANCE;
                        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
                        YGNode yGNode = node.f60native;
                        yGNode.getClass();
                        LinkedHashMap linkedHashMap = yGNode.flags;
                        linkedHashMap.getClass();
                        linkedHashMap.put(4, Boolean.FALSE);
                        n.b bVar = yGNode.measure;
                        bVar.b = anonymousClass1;
                        Yoga.YGAssertWithNode(yGNode, yGNode.children.size() == 0, "Cannot set measure function: Nodes with measure functions cannot have children.");
                        YGNodeType yGNodeType = YGNodeType.YGNodeTypeText;
                        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGNodeType.class);
                        linkedHashMap.getClass();
                        linkedHashMap.put(new StyleEnumFlagsKey(3, orCreateKotlinClass), yGNodeType);
                        yGNode.measure = bVar;
                        yGNode.context = view;
                        yogaLayout2.rootNode.children.add(intValue, node);
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg(node, widget.getModifier(), viewFlexContainer.density);
                        yogaLayout2.addView(view, intValue);
                        break;
                    case 1:
                        int intValue2 = ((Integer) obj).intValue();
                        int intValue3 = ((Integer) obj2).intValue();
                        YogaLayout yogaLayout3 = viewFlexContainer.yogaLayout;
                        ReversedList reversedList = yogaLayout3.rootNode.children;
                        reversedList.getClass();
                        if (intValue3 == 1) {
                            reversedList.removeAt(intValue2);
                        } else {
                            reversedList.subList(intValue2, intValue2 + intValue3).clear();
                        }
                        yogaLayout3.removeViews(intValue2, intValue3);
                        break;
                    default:
                        int intValue4 = ((Integer) obj).intValue();
                        Widget widget2 = (Widget) obj2;
                        widget2.getClass();
                        YogaLayout yogaLayout4 = viewFlexContainer.yogaLayout;
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg((Node) yogaLayout4.rootNode.children.get(intValue4), widget2.getModifier(), viewFlexContainer.density);
                        yogaLayout4.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2(this) { // from class: app.cash.redwood.layout.view.ViewFlexContainer$$ExternalSyntheticLambda0
            public final /* synthetic */ ViewFlexContainer f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i4;
                ViewFlexContainer viewFlexContainer = this.f$0;
                switch (i5) {
                    case 0:
                        YogaLayout yogaLayout2 = viewFlexContainer.yogaLayout;
                        int intValue = ((Integer) obj).intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        View view = (View) widget.getValue();
                        Node node = new Node();
                        Yoga yoga = Yoga.INSTANCE;
                        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
                        YGNode yGNode = node.f60native;
                        yGNode.getClass();
                        LinkedHashMap linkedHashMap = yGNode.flags;
                        linkedHashMap.getClass();
                        linkedHashMap.put(4, Boolean.FALSE);
                        n.b bVar = yGNode.measure;
                        bVar.b = anonymousClass1;
                        Yoga.YGAssertWithNode(yGNode, yGNode.children.size() == 0, "Cannot set measure function: Nodes with measure functions cannot have children.");
                        YGNodeType yGNodeType = YGNodeType.YGNodeTypeText;
                        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGNodeType.class);
                        linkedHashMap.getClass();
                        linkedHashMap.put(new StyleEnumFlagsKey(3, orCreateKotlinClass), yGNodeType);
                        yGNode.measure = bVar;
                        yGNode.context = view;
                        yogaLayout2.rootNode.children.add(intValue, node);
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg(node, widget.getModifier(), viewFlexContainer.density);
                        yogaLayout2.addView(view, intValue);
                        break;
                    case 1:
                        int intValue2 = ((Integer) obj).intValue();
                        int intValue3 = ((Integer) obj2).intValue();
                        YogaLayout yogaLayout3 = viewFlexContainer.yogaLayout;
                        ReversedList reversedList = yogaLayout3.rootNode.children;
                        reversedList.getClass();
                        if (intValue3 == 1) {
                            reversedList.removeAt(intValue2);
                        } else {
                            reversedList.subList(intValue2, intValue2 + intValue3).clear();
                        }
                        yogaLayout3.removeViews(intValue2, intValue3);
                        break;
                    default:
                        int intValue4 = ((Integer) obj).intValue();
                        Widget widget2 = (Widget) obj2;
                        widget2.getClass();
                        YogaLayout yogaLayout4 = viewFlexContainer.yogaLayout;
                        FlexboxHelpersKt.m1358applyModifiernB0u8Lg((Node) yogaLayout4.rootNode.children.get(intValue4), widget2.getModifier(), viewFlexContainer.density);
                        yogaLayout4.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.modifier = Modifier.Companion.$$INSTANCE;
        int layoutDirection = hostView.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 0) {
            c = 1;
        } else {
            if (layoutDirection != 1) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                throw null;
            }
            c = 2;
        }
        Node node = yogaLayout.rootNode;
        node.getClass();
        YGNode yGNode = node.f60native;
        Yoga yoga = Yoga.INSTANCE;
        if (c == 1) {
            yGDirection = YGDirection.YGDirectionLTR;
        } else {
            if (c != 2) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                throw null;
            }
            yGDirection = YGDirection.YGDirectionRTL;
        }
        yGNode.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        Yoga.updateStyle(yGNode, reflectionFactory.getOrCreateKotlinClass(YGDirection.class), yGDirection, Yoga$YGNodeStyleSetDirection$1.INSTANCE);
        if (i == 0) {
            yGFlexDirection = YGFlexDirection.YGFlexDirectionRow;
        } else if (i == 1) {
            yGFlexDirection = YGFlexDirection.YGFlexDirectionRowReverse;
        } else if (i == 2) {
            yGFlexDirection = YGFlexDirection.YGFlexDirectionColumn;
        } else {
            if (i != 3) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                throw null;
            }
            yGFlexDirection = YGFlexDirection.YGFlexDirectionColumnReverse;
        }
        Yoga.updateStyle(yGNode, reflectionFactory.getOrCreateKotlinClass(YGFlexDirection.class), yGFlexDirection, Yoga$YGNodeStyleSetFlexDirection$1.INSTANCE);
    }

    /* renamed from: crossAxisAlignment-njEs0f8, reason: not valid java name */
    public final void m1361crossAxisAlignmentnjEs0f8(int i) {
        char c;
        YGAlign yGAlign;
        Node node = this.yogaLayout.rootNode;
        CrossAxisAlignment.Companion.getClass();
        if (i == 0) {
            c = 0;
        } else if (i == 1) {
            c = 2;
        } else if (i == 2) {
            c = 1;
        } else {
            if (i != 3) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
            c = 4;
        }
        node.getClass();
        Yoga yoga = Yoga.INSTANCE;
        YGNode yGNode = node.f60native;
        if (c == 0) {
            yGAlign = YGAlign.YGAlignFlexStart;
        } else if (c == 1) {
            yGAlign = YGAlign.YGAlignFlexEnd;
        } else if (c == 2) {
            yGAlign = YGAlign.YGAlignCenter;
        } else if (c == 3) {
            yGAlign = YGAlign.YGAlignBaseline;
        } else {
            if (c != 4) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
            yGAlign = YGAlign.YGAlignStretch;
        }
        yGNode.getClass();
        Yoga.updateStyle(yGNode, Reflection.factory.getOrCreateKotlinClass(YGAlign.class), yGAlign, new yf$$ExternalSyntheticLambda10(1));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.hostView;
    }

    /* renamed from: mainAxisAlignment-6exqka8, reason: not valid java name */
    public final void m1362mainAxisAlignment6exqka8(int i) {
        char c;
        YGJustify yGJustify;
        Node node = this.yogaLayout.rootNode;
        MainAxisAlignment.Companion.getClass();
        if (i == 0) {
            c = 0;
        } else if (i == 1) {
            c = 2;
        } else if (i == 2) {
            c = 1;
        } else if (i == 3) {
            c = 3;
        } else if (i == 4) {
            c = 4;
        } else {
            if (i != 5) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
            c = 5;
        }
        node.getClass();
        Yoga yoga = Yoga.INSTANCE;
        YGNode yGNode = node.f60native;
        if (c == 0) {
            yGJustify = YGJustify.YGJustifyFlexStart;
        } else if (c == 1) {
            yGJustify = YGJustify.YGJustifyFlexEnd;
        } else if (c == 2) {
            yGJustify = YGJustify.YGJustifyCenter;
        } else if (c == 3) {
            yGJustify = YGJustify.YGJustifySpaceBetween;
        } else if (c == 4) {
            yGJustify = YGJustify.YGJustifySpaceAround;
        } else {
            if (c != 5) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            }
            yGJustify = YGJustify.YGJustifySpaceEvenly;
        }
        yGNode.getClass();
        Yoga.updateStyle(yGNode, Reflection.factory.getOrCreateKotlinClass(YGJustify.class), yGJustify, Yoga$YGNodeStyleSetJustifyContent$1.INSTANCE);
    }

    public final void margin(Margin margin) {
        margin.getClass();
        Node node = this.yogaLayout.rootNode;
        double d = margin.start;
        double d2 = this.density;
        float m1401toPxmnpKzHI = (float) Density.m1401toPxmnpKzHI(d2, d);
        node.getClass();
        node.setMargin(YGEdge.YGEdgeStart, m1401toPxmnpKzHI);
        node.setMargin(YGEdge.YGEdgeEnd, (float) Density.m1401toPxmnpKzHI(d2, margin.end));
        node.setMargin(YGEdge.YGEdgeTop, (float) Density.m1401toPxmnpKzHI(d2, margin.top));
        node.setMargin(YGEdge.YGEdgeBottom, (float) Density.m1401toPxmnpKzHI(d2, margin.bottom));
    }

    @Override // app.cash.redwood.widget.ChangeListener
    public final void onEndChanges() {
        HostView hostView = this.hostView;
        hostView.invalidate();
        hostView.requestLayout();
        YogaLayout yogaLayout = this.yogaLayout;
        yogaLayout.invalidate();
        yogaLayout.requestLayout();
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
