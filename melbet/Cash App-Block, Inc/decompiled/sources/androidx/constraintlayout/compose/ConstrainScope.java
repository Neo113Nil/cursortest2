package androidx.constraintlayout.compose;

import androidx.camera.video.Recorder;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.paging3.OffsetQueryPagingSource;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class ConstrainScope {
    public static final /* synthetic */ KProperty[] $$delegatedProperties;
    public final Recorder.AnonymousClass4 bottom;
    public final CLObject containerObject;
    public final Recorder.AnonymousClass1 end;
    public final Object id;
    public final Recorder.AnonymousClass1 start;
    public final Recorder.AnonymousClass4 top;
    public final ConstrainedLayoutReference parent = new ConstrainedLayoutReference("parent");
    public final DimensionProperty width$delegate = new DimensionProperty(this, new DimensionDescription("wrap"));
    public final DimensionProperty height$delegate = new DimensionProperty(this, new DimensionDescription("wrap"));

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        ReflectionFactory reflectionFactory = Reflection.factory;
        $$delegatedProperties = new KProperty[]{reflectionFactory.mutableProperty1(mutablePropertyReference1Impl), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "scaleX", "getScaleX()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "scaleY", "getScaleY()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "rotationX", "getRotationX()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "rotationY", "getRotationY()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "pivotX", "getPivotX()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "pivotY", "getPivotY()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0, reflectionFactory)};
    }

    public ConstrainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.containerObject = cLObject;
        this.start = new Recorder.AnonymousClass1(-2, cLObject);
        this.top = new Recorder.AnonymousClass4(0, cLObject);
        this.end = new Recorder.AnonymousClass1(-1, cLObject);
        this.bottom = new Recorder.AnonymousClass4(1, cLObject);
    }

    public static void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference) {
        constrainScope.getClass();
        m1077linkTo8ZKsbrE$default(constrainScope, constrainedLayoutReference.start, constrainedLayoutReference.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 60);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static void m1077linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, float f2, int i) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        constrainScope.start.m110linkToVpY3zN4(verticalAnchor, f);
        constrainScope.end.m110linkToVpY3zN4(verticalAnchor2, f2);
        constrainScope.containerObject.put("hRtlBias", new CLNumber(0.5f));
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static void m1078linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2) {
        constrainScope.start.m110linkToVpY3zN4(verticalAnchor, RecyclerView.DECELERATION_RATE);
        constrainScope.end.m110linkToVpY3zN4(verticalAnchor2, RecyclerView.DECELERATION_RATE);
        CLObject cLObject = constrainScope.containerObject;
        cLObject.put("hRtlBias", new CLNumber(0.5f));
        constrainScope.top.m113linkToVpY3zN4(horizontalAnchor, RecyclerView.DECELERATION_RATE);
        constrainScope.bottom.m113linkToVpY3zN4(horizontalAnchor2, RecyclerView.DECELERATION_RATE);
        cLObject.put("vBias", new CLNumber(0.5f));
    }

    public final void centerTo(ConstrainedLayoutReference constrainedLayoutReference) {
        m1078linkToR7zmacU$default(this, constrainedLayoutReference.start, constrainedLayoutReference.top, constrainedLayoutReference.end, constrainedLayoutReference.bottom);
    }

    public final void setHeight(DimensionDescription dimensionDescription) {
        this.height$delegate.setValue(this, $$delegatedProperties[1], dimensionDescription);
    }

    public final void setWidth(DimensionDescription dimensionDescription) {
        this.width$delegate.setValue(this, $$delegatedProperties[0], dimensionDescription);
    }

    public final class DimensionProperty extends ObservableProperty {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DimensionProperty(OffsetQueryPagingSource offsetQueryPagingSource) {
            super(null);
            this.this$0 = offsetQueryPagingSource;
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(Object obj, KProperty kProperty, Object obj2) {
            CLElement cLElement;
            int i = this.$r8$classId;
            Object obj3 = this.this$0;
            switch (i) {
                case 0:
                    DimensionDescription dimensionDescription = (DimensionDescription) obj2;
                    CLObject cLObject = ((ConstrainScope) obj3).containerObject;
                    String name = kProperty.getName();
                    dimensionDescription.getClass();
                    Recorder.AnonymousClass3 anonymousClass3 = dimensionDescription.valueSymbol;
                    Recorder.AnonymousClass3 anonymousClass32 = dimensionDescription.max;
                    Recorder.AnonymousClass3 anonymousClass33 = dimensionDescription.min;
                    if (((Dp) anonymousClass33.val$completer) == null && ((String) anonymousClass33.val$recordingToStart) == null && ((Dp) anonymousClass32.val$completer) == null && ((String) anonymousClass32.val$recordingToStart) == null) {
                        cLElement = anonymousClass3.asCLElement();
                    } else {
                        CLObject cLObject2 = new CLObject(new char[0]);
                        if (((Dp) anonymousClass33.val$completer) != null || ((String) anonymousClass33.val$recordingToStart) != null) {
                            cLObject2.put("min", anonymousClass33.asCLElement());
                        }
                        if (((Dp) anonymousClass32.val$completer) != null || ((String) anonymousClass32.val$recordingToStart) != null) {
                            cLObject2.put("max", anonymousClass32.asCLElement());
                        }
                        cLObject2.put("value", anonymousClass3.asCLElement());
                        cLElement = cLObject2;
                    }
                    cLObject.put(name, cLElement);
                    break;
                case 1:
                    OffsetQueryPagingSource offsetQueryPagingSource = (OffsetQueryPagingSource) obj3;
                    kProperty.getClass();
                    Query query = (Query) obj2;
                    Query query2 = (Query) obj;
                    if (query2 != null) {
                        query2.removeListener(offsetQueryPagingSource);
                    }
                    if (query != null) {
                        query.addListener(offsetQueryPagingSource);
                        break;
                    }
                    break;
                default:
                    kProperty.getClass();
                    ((Function1) obj3).invoke((ProductSearchPresenter.State) obj2);
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DimensionProperty(Function1 function1, Object obj) {
            super(obj);
            this.this$0 = function1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DimensionProperty(ConstrainScope constrainScope, DimensionDescription dimensionDescription) {
            super(dimensionDescription);
            this.this$0 = constrainScope;
        }
    }
}
