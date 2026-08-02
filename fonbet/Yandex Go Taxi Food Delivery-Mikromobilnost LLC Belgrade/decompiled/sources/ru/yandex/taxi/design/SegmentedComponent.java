package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.w0d;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y8q0;
import defpackage.z8q0;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001eJE\u0010&\u001a\u00020\b\"\b\b\u0000\u0010!*\u00020 2\u0006\u0010\"\u001a\u00028\u00002\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0016¢\u0006\u0004\b)\u0010\u001eJ\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\nJ\u001b\u0010,\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0016¢\u0006\u0004\b/\u0010\u001eJ!\u00102\u001a\u00020\b2\b\b\u0001\u00100\u001a\u00020\u00162\b\b\u0001\u00101\u001a\u00020\u0016¢\u0006\u0004\b2\u0010\u001aJ\u0015\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\b4\u0010\u001eR\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R*\u00109\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u001eR\u0014\u0010>\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010:R\u0014\u0010?\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010:R\u0016\u0010@\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/yandex/taxi/design/SegmentedComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "updateBackgroundCorners", "()V", "Landroid/graphics/drawable/ShapeDrawable;", "updateTabIndicatorCorners", "()Landroid/graphics/drawable/ShapeDrawable;", "", BackendConfig.Restrictions.ENABLED, "setSwitchEnabled", "(Z)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "setDefaultBackgroundRectColor", "color", "setBackgroundRectColor", "(I)V", "setSelectedTabIndicatorColor", "Landroid/view/View;", "VIEW", "tabView", "Ljava/util/function/Consumer;", "modifyViewOnSelect", "modifyViewOnUnselect", "addCustomViewTab", "(Landroid/view/View;Ljava/util/function/Consumer;Ljava/util/function/Consumer;)V", "padding", "setTabsPadding", "clearTabs", "onSelectionChanged", "setUserSelectionChangeListener", "(Ljava/util/function/Consumer;)V", "tabIdx", "setSelectedTab", "baseColor", "outlineColor", "setBackgroundWithOutline", "tabMode", "setTabMode", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "value", "backgroundCornerRadiusPx", CA20Status.STATUS_USER_I, "getBackgroundCornerRadiusPx", "()I", "setBackgroundCornerRadiusPx", "altBackgroundCornerRadius", "paddingPx", "tabIndicatorDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Lcom/google/android/material/tabs/d;", "userSelectionChangeListener", "Lcom/google/android/material/tabs/d;", "switchEnabled", "Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SegmentedComponent extends DividerAwareComponent {
    public static final int $stable = 8;
    private final int altBackgroundCornerRadius;
    private int backgroundCornerRadiusPx;
    private final int paddingPx;
    private boolean switchEnabled;
    private ShapeDrawable tabIndicatorDrawable;
    private final TabLayout tabLayout;
    private com.google.android.material.tabs.d userSelectionChangeListener;

    public SegmentedComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        TabLayout tabLayout = new TabLayout(context);
        this.tabLayout = tabLayout;
        this.backgroundCornerRadiusPx = tje.u(14, getContext());
        this.altBackgroundCornerRadius = tje.r(mrg0.go_design_m_space, getContext());
        int u = tje.u(2, getContext());
        this.paddingPx = u;
        updateBackgroundCorners();
        xw31.G(u, this);
        addView(tabLayout);
        tabLayout.setTabMode(1);
        tabLayout.setTabGravity(0);
        tabLayout.setTabRippleColor(null);
        this.tabIndicatorDrawable = updateTabIndicatorCorners();
        setSelectedTabIndicatorColor(qje.t(xng0.bgMain, getContext()));
        this.switchEnabled = true;
    }

    public static /* synthetic */ void addCustomViewTab$default(SegmentedComponent segmentedComponent, View view, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if ((i & 2) != 0) {
            consumer = null;
        }
        if ((i & 4) != 0) {
            consumer2 = null;
        }
        segmentedComponent.addCustomViewTab(view, consumer, consumer2);
    }

    private final void updateBackgroundCorners() {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.backgroundCornerRadiusPx;
        }
        setBackground(new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }

    private final ShapeDrawable updateTabIndicatorCorners() {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.backgroundCornerRadiusPx - this.paddingPx;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setIntrinsicHeight(-1);
        this.tabLayout.setSelectedTabIndicator(shapeDrawable);
        return shapeDrawable;
    }

    public final <VIEW extends View> void addCustomViewTab(VIEW tabView, Consumer<VIEW> modifyViewOnSelect, Consumer<VIEW> modifyViewOnUnselect) {
        TabLayout.a newTab = this.tabLayout.newTab();
        newTab.e = tabView;
        newTab.b();
        this.tabLayout.addTab(newTab);
        if (newTab.a()) {
            if (modifyViewOnSelect != null) {
                modifyViewOnSelect.accept(tabView);
            }
        } else if (modifyViewOnUnselect != null) {
            modifyViewOnUnselect.accept(tabView);
        }
        this.tabLayout.addOnTabSelectedListener((com.google.android.material.tabs.d) new y8q0(newTab, modifyViewOnSelect, tabView, modifyViewOnUnselect));
    }

    public final void clearTabs() {
        this.tabLayout.removeAllTabs();
    }

    public final int getBackgroundCornerRadiusPx() {
        return this.backgroundCornerRadiusPx;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return !this.switchEnabled;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.tabIndicatorDrawable.setIntrinsicHeight(getMeasuredHeight() - (this.paddingPx * 2));
    }

    public final void setBackgroundCornerRadiusPx(int i) {
        if (this.backgroundCornerRadiusPx == i) {
            return;
        }
        this.backgroundCornerRadiusPx = i;
        updateBackgroundCorners();
        this.tabIndicatorDrawable = updateTabIndicatorCorners();
        requestLayout();
    }

    public final void setBackgroundRectColor(int color) {
        setBackgroundTintList(ColorStateList.valueOf(color));
    }

    public final void setBackgroundWithOutline(int baseColor, int outlineColor) {
        w0d w0dVar = new w0d();
        w0dVar.h = this.altBackgroundCornerRadius;
        w0dVar.a = baseColor;
        w0dVar.i = tje.r(mrg0.button_component_default_outline_width, getContext());
        w0dVar.b = outlineColor;
        w0dVar.g = true;
        setBackground(w0dVar.a());
    }

    public final void setDefaultBackgroundRectColor() {
        setBackgroundRectColor(qje.t(xng0.bgMinor, getContext()));
    }

    public final void setSelectedTab(int tabIdx) {
        TabLayout.a tabAt = this.tabLayout.getTabAt(tabIdx);
        if (tabAt == null || tabAt.a()) {
            return;
        }
        com.google.android.material.tabs.d dVar = this.userSelectionChangeListener;
        if (dVar != null) {
            this.tabLayout.removeOnTabSelectedListener(dVar);
        }
        TabLayout tabLayout = tabAt.f;
        if (tabLayout == null) {
            ny61.g("Tab not attached to a TabLayout");
            return;
        }
        tabLayout.selectTab(tabAt);
        com.google.android.material.tabs.d dVar2 = this.userSelectionChangeListener;
        if (dVar2 != null) {
            this.tabLayout.addOnTabSelectedListener(dVar2);
        }
    }

    public final void setSelectedTabIndicatorColor(int color) {
        this.tabLayout.setSelectedTabIndicatorColor(color);
    }

    public final void setSwitchEnabled(boolean enabled) {
        this.switchEnabled = enabled;
    }

    public final void setTabMode(int tabMode) {
        this.tabLayout.setTabMode(tabMode);
    }

    public final void setTabsPadding(int padding) {
        int tabCount = this.tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.a tabAt = this.tabLayout.getTabAt(i);
            if (tabAt != null) {
                tabAt.g.setPaddingRelative(padding, padding, padding, padding);
            }
        }
    }

    public final void setUserSelectionChangeListener(Consumer<Integer> onSelectionChanged) {
        com.google.android.material.tabs.d dVar = this.userSelectionChangeListener;
        if (dVar != null) {
            this.tabLayout.removeOnTabSelectedListener(dVar);
        }
        z8q0 z8q0Var = new z8q0(onSelectionChanged);
        this.userSelectionChangeListener = z8q0Var;
        this.tabLayout.addOnTabSelectedListener((com.google.android.material.tabs.d) z8q0Var);
    }

    public final <VIEW extends View> void addCustomViewTab(VIEW view, Consumer<VIEW> consumer) {
        addCustomViewTab$default(this, view, consumer, null, 4, null);
    }

    public final <VIEW extends View> void addCustomViewTab(VIEW view) {
        addCustomViewTab$default(this, view, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedComponent(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SegmentedComponent(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
