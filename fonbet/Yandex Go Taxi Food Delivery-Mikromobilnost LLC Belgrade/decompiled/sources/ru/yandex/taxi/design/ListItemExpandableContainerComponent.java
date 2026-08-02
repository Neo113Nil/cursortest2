package ru.yandex.taxi.design;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import defpackage.c4i0;
import defpackage.dzg0;
import defpackage.ndh0;
import defpackage.rp31;
import defpackage.sph0;
import defpackage.t2b0;
import defpackage.vng;
import defpackage.vpa;
import defpackage.vry;
import defpackage.wry;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yso;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.utils.PersistentPreDrawListener;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u0013J\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b#\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006B"}, d2 = {"Lru/yandex/taxi/design/ListItemExpandableContainerComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "(Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attributes", "applyAttributes", "(Landroid/content/res/TypedArray;)V", "expandAnimated", "()V", "collapseAnimated", "from", "to", "Ljava/lang/Runnable;", "onFinished", "animateHeight", "(IILjava/lang/Runnable;)V", "expandWithoutAnimation", "collapseWithoutAnimation", "addPreDrawRequestLayoutListener", "Landroid/graphics/drawable/Drawable;", "requireArrowDown", "()Landroid/graphics/drawable/Drawable;", "requireArrowUp", "expand", "collapse", "", "animate", "(Z)V", "isExpanded", "()Z", "Landroid/view/View;", "view", "setContent", "(Landroid/view/View;)V", "", "title", "setHeader", "(Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "expanded", "Z", "Lru/yandex/taxi/design/ListItemComponent;", "header", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "arrowDown", "Landroid/graphics/drawable/Drawable;", "arrowUp", "Companion", "wry", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ListItemExpandableContainerComponent extends DividerAwareComponent {
    public static final wry Companion = new wry();
    public static final int STATE_COLLAPSED = 1;
    public static final int STATE_EXPANDED = 0;
    private Drawable arrowDown;
    private Drawable arrowUp;
    private final FrameLayout container;
    private boolean expanded;
    private final ListItemComponent header;

    public ListItemExpandableContainerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, sph0.component_expandable_container_list_item, true);
        int i2 = ndh0.header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.header = (ListItemComponent) ((View) rp31.d(this, i2));
        this.container = (FrameLayout) ((View) rp31.d(this, ndh0.container));
        init(attributeSet, i);
    }

    private final void addPreDrawRequestLayoutListener() {
        t2b0 t2b0Var = PersistentPreDrawListener.Companion;
        View view = this.container;
        ListItemExpandableContainerComponent$addPreDrawRequestLayoutListener$1 listItemExpandableContainerComponent$addPreDrawRequestLayoutListener$1 = new ListItemExpandableContainerComponent$addPreDrawRequestLayoutListener$1(0, this.container, FrameLayout.class, "requestLayout", "requestLayout()V", 0);
        t2b0Var.getClass();
        PersistentPreDrawListener persistentPreDrawListener = new PersistentPreDrawListener(view, listItemExpandableContainerComponent$addPreDrawRequestLayoutListener$1, null);
        view.addOnAttachStateChangeListener(persistentPreDrawListener);
        if (view.isAttachedToWindow()) {
            persistentPreDrawListener.onViewAttachedToWindow(view);
            view.invalidate();
        }
    }

    private final void animateHeight(int from, int to, Runnable onFinished) {
        ValueAnimator ofInt = ValueAnimator.ofInt(from, to);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new yso(8, this));
        ofInt.addListener(new AnimUtils$AnimationEndListener(onFinished));
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHeight$lambda$0(ListItemExpandableContainerComponent listItemExpandableContainerComponent, ValueAnimator valueAnimator) {
        FrameLayout frameLayout = listItemExpandableContainerComponent.container;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(intValue, frameLayout);
        listItemExpandableContainerComponent.requestLayout();
    }

    private final void applyAttributes(TypedArray attributes) {
        setHeader(attributes.getText(c4i0.ListItemExpandableContainerComponent_header));
        if (attributes.getInt(c4i0.ListItemExpandableContainerComponent_state, 1) == 1) {
            collapse(false);
        } else {
            expand(false);
        }
    }

    private final void collapseAnimated() {
        animateHeight(this.container.getMeasuredHeight(), 0, new vry(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseAnimated$lambda$0(ListItemExpandableContainerComponent listItemExpandableContainerComponent) {
        listItemExpandableContainerComponent.container.setVisibility(4);
        listItemExpandableContainerComponent.header.setTrailImage(listItemExpandableContainerComponent.requireArrowDown());
    }

    private final void collapseWithoutAnimation() {
        this.container.setVisibility(4);
        this.header.setTrailImage(requireArrowDown());
        FrameLayout frameLayout = this.container;
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(0, frameLayout);
        addPreDrawRequestLayoutListener();
    }

    private final void expandAnimated() {
        this.container.setVisibility(0);
        this.container.measure(View.MeasureSpec.makeMeasureSpec(this.container.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        animateHeight(0, this.container.getMeasuredHeight(), new vry(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandAnimated$lambda$0(ListItemExpandableContainerComponent listItemExpandableContainerComponent) {
        listItemExpandableContainerComponent.header.setTrailImage(listItemExpandableContainerComponent.requireArrowUp());
    }

    private final void expandWithoutAnimation() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.container.getWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.container.setVisibility(0);
        this.header.setTrailImage(requireArrowUp());
        this.container.measure(makeMeasureSpec, makeMeasureSpec2);
        FrameLayout frameLayout = this.container;
        int measuredHeight = frameLayout.getMeasuredHeight();
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(measuredHeight, frameLayout);
        addPreDrawRequestLayoutListener();
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ListItemExpandableContainerComponent, defStyleAttr, 0);
        try {
            applyAttributes(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final Drawable requireArrowDown() {
        if (this.arrowDown == null) {
            this.arrowDown = vng.t(dzg0.chevron_round_down, getContext());
        }
        return this.arrowDown;
    }

    private final Drawable requireArrowUp() {
        if (this.arrowUp == null) {
            this.arrowUp = vng.t(dzg0.chevron_round_up, getContext());
        }
        return this.arrowUp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContent$lambda$0() {
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.arrowDown = null;
        this.arrowUp = null;
        boolean z = this.expanded;
        ListItemComponent listItemComponent = this.header;
        if (z) {
            listItemComponent.setTrailImage(requireArrowUp());
        } else {
            listItemComponent.setTrailImage(requireArrowDown());
        }
    }

    public final void collapse(boolean animate) {
        this.expanded = false;
        if (animate) {
            collapseAnimated();
        } else {
            collapseWithoutAnimation();
        }
    }

    public final void expand(boolean animate) {
        this.expanded = true;
        if (animate) {
            expandAnimated();
        } else {
            expandWithoutAnimation();
        }
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    public final void setContent(View view) {
        int measuredHeight = this.container.getMeasuredHeight();
        this.container.removeAllViews();
        this.container.addView(view, new FrameLayout.LayoutParams(-1, -2));
        if (this.expanded) {
            this.container.measure(View.MeasureSpec.makeMeasureSpec(this.container.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            animateHeight(measuredHeight, this.container.getMeasuredHeight(), new vpa(13));
        }
    }

    public final void setHeader(CharSequence title) {
        this.header.setTitle(title);
    }

    public final void collapse() {
        collapse(true);
    }

    public final void expand() {
        expand(true);
    }

    public ListItemExpandableContainerComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemExpandableContainerComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemExpandableContainerComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listItemExpandableContainerComponentStyle : i);
    }
}
