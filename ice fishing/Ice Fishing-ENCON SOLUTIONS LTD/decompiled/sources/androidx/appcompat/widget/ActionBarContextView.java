package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.AbstractC0131a;
import com.watchfacestudio.spraktum.R;
import d.AbstractC0142a;
import h.t0;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f2077a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2078b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2079c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2080d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2081e;

    /* renamed from: f, reason: collision with root package name */
    public View f2082f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f2083g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f2084h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f2085i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2086j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2087k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2088l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2621d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0142a.a(context, resourceId);
        Field field = x.f8596a;
        setBackground(drawable);
        this.f2086j = obtainStyledAttributes.getResourceId(5, 0);
        this.f2087k = obtainStyledAttributes.getResourceId(4, 0);
        this.f2077a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f2083g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2083g = linearLayout;
            this.f2084h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2085i = (TextView) this.f2083g.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f2086j;
            if (i2 != 0) {
                this.f2084h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f2087k;
            if (i3 != 0) {
                this.f2085i.setTextAppearance(getContext(), i3);
            }
        }
        this.f2084h.setText(this.f2080d);
        this.f2085i.setText(this.f2081e);
        boolean isEmpty = TextUtils.isEmpty(this.f2080d);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2081e);
        this.f2085i.setVisibility(!isEmpty2 ? 0 : 8);
        this.f2083g.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f2083g.getParent() == null) {
            addView(this.f2083g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2077a;
    }

    public CharSequence getSubtitle() {
        return this.f2081e;
    }

    public CharSequence getTitle() {
        return this.f2080d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0131a.f2618a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2079c = false;
        }
        if (!this.f2079c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2079c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2079c = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f2080d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean a2 = t0.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f2083g;
        if (linearLayout != null && this.f2082f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f2083g, paddingRight, paddingTop, paddingTop2, a2);
        }
        View view = this.f2082f;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f2077a;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f2083g;
        if (linearLayout != null && this.f2082f == null) {
            if (this.f2088l) {
                this.f2083g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2083g.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f2083g.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f2082f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f2082f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f2077a > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2078b = false;
        }
        if (!this.f2078b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2078b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2078b = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f2077a = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2082f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2082f = view;
        if (view != null && (linearLayout = this.f2083g) != null) {
            removeView(linearLayout);
            this.f2083g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2081e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2080d = charSequence;
        a();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f2088l) {
            requestLayout();
        }
        this.f2088l = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
