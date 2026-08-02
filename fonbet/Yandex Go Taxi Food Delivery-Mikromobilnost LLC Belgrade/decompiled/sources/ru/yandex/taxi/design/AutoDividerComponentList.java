package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.c4i0;
import defpackage.hrl;
import defpackage.jg;
import defpackage.vql;
import defpackage.xby;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b'\u0010(J7\u0010/\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/yandex/taxi/design/AutoDividerComponentList;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attributes", "Lzy11;", "applyAttributes", "(Landroid/content/res/TypedArray;)V", "refreshInnerDividers", "()V", "extractDividers", "Landroid/view/View;", "child", "onViewAdded", "(Landroid/view/View;)V", "onViewRemoved", "Lru/yandex/taxi/design/utils/DividerType;", "topDividerType", "setTopDivider", "(Lru/yandex/taxi/design/utils/DividerType;)V", "middleDividerType", "setMiddleDividers", "bottomDividerType", "setBottomDivider", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lvql;", "topDividerDrawDelegate", "Lvql;", "Lru/yandex/taxi/design/utils/DividerType;", "", "Lru/yandex/taxi/design/DividerAwareComponent;", "currentDividerElements", "Ljava/util/List;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AutoDividerComponentList extends GoLinearLayout {
    private DividerType bottomDividerType;
    private final List<DividerAwareComponent> currentDividerElements;
    private DividerType middleDividerType;
    private final vql topDividerDrawDelegate;

    public AutoDividerComponentList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.topDividerDrawDelegate = new vql(context, null, new jg(26, this));
        DividerType dividerType = DividerType.NONE;
        this.middleDividerType = dividerType;
        this.bottomDividerType = dividerType;
        this.currentDividerElements = new ArrayList();
        setOrientation(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, c4i0.AutoDividerComponentList, 0, 0);
        try {
            applyAttributes(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void applyAttributes(TypedArray attributes) {
        int i = attributes.getInt(c4i0.AutoDividerComponentList_component_top_divider_type, 0);
        DividerType.Companion.getClass();
        setTopDivider(hrl.a(i));
        this.middleDividerType = hrl.a(attributes.getInt(c4i0.AutoDividerComponentList_component_middle_divider_type, 0));
        this.bottomDividerType = hrl.a(attributes.getInt(c4i0.AutoDividerComponentList_component_bottom_divider_type, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void extractDividers() {
        this.currentDividerElements.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof DividerAwareComponent) {
                this.currentDividerElements.add(childAt);
            } else if (!(childAt instanceof ViewStub)) {
                xby.d.x(new IllegalStateException(), String.format("View is not derived from DividerAwareComponent %s", Arrays.copyOf(new Object[]{childAt.getClass().getName()}, 1)));
            }
        }
    }

    private final void refreshInnerDividers() {
        boolean z = true;
        for (int size = this.currentDividerElements.size() - 1; -1 < size; size--) {
            DividerAwareComponent dividerAwareComponent = this.currentDividerElements.get(size);
            if (dividerAwareComponent.getVisibility() == 0) {
                if (z) {
                    dividerAwareComponent.setDividers(DividerPosition.BOTTOM, this.bottomDividerType);
                    z = false;
                } else {
                    dividerAwareComponent.setDividers(DividerPosition.BOTTOM, this.middleDividerType);
                }
            }
        }
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.topDividerDrawDelegate.b(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int size = this.currentDividerElements.size();
        for (int i = 0; i < size; i++) {
            if (this.currentDividerElements.get(i).getVisibility() == 0) {
                canvas.save();
                canvas.translate(0.0f, r2.getTop());
                this.topDividerDrawDelegate.a(canvas);
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        refreshInnerDividers();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.topDividerDrawDelegate.d(w, h);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        extractDividers();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        extractDividers();
    }

    public final void setBottomDivider(DividerType bottomDividerType) {
        if (this.bottomDividerType != bottomDividerType) {
            this.bottomDividerType = bottomDividerType;
            refreshInnerDividers();
        }
    }

    public final void setMiddleDividers(DividerType middleDividerType) {
        if (this.middleDividerType != middleDividerType) {
            this.middleDividerType = middleDividerType;
            refreshInnerDividers();
        }
    }

    public final void setTopDivider(DividerType topDividerType) {
        this.topDividerDrawDelegate.e(DividerPosition.TOP, topDividerType);
    }

    public AutoDividerComponentList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutoDividerComponentList(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AutoDividerComponentList(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
